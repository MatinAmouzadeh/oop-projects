package com.matin.paint.backend;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class ToolManager 
{

    private ShapeManager shapeManager;
    private HistoryManager historyManager;
    private String currentColor = "#000000"; // default black (hex)

    public ToolManager() {
        this.historyManager = new HistoryManager();
        this.shapeManager = new ShapeManager(historyManager);
    }

    //********************************************************************\\
    // ابزارهای رسم: Request حاوی color است؛ اگر null بود از currentColor استفاده کن
    private String resolveColor(Request req) {
        if (req == null) return currentColor;
        String c = req.getColor();
        if (c == null || c.isEmpty()) return currentColor;
        return c;
    }

    public void CircleTool(Request req, GraphicsContext gc) {
        ShapeModel shape = new ShapeModel(req);
        shape.setColor(resolveColor(req));
        shapeManager.AddCircle(shape);
        redrawCanvas(gc);
    }

    public void LineTool(Request req, GraphicsContext gc) {
        ShapeModel shape = new ShapeModel(req);
        shape.setColor(resolveColor(req));
        shapeManager.AddLine(shape);
        redrawCanvas(gc);
    }

    public void RectangleTool(Request req, GraphicsContext gc) {
        ShapeModel shape = new ShapeModel(req);
        shape.setColor(resolveColor(req));
        shapeManager.AddRectangle(shape);
        redrawCanvas(gc);
    }

    //********************************************************************\\
    // ابزار رنگ (UI بهتره hex یا css name بفرسته)
    public void setCurrentColor(String color) { this.currentColor = color; }
    public String getCurrentColor() { return currentColor; }

    //********************************************************************\\
    // ابزار Eraser (حذف آبجکت از تاریخچه)
    public void EraserTool(ShapeModel shape, GraphicsContext gc) {
        if (shape == null) return;
        boolean removed = historyManager.removeShape(shape);
        if (removed) {
            redrawCanvas(gc);
        }
    }

    //********************************************************************\\
    // Undo / Redo
    public void UndoTool(GraphicsContext gc) {
        historyManager.undo();
        redrawCanvas(gc);
    }

    public void RedoTool(GraphicsContext gc) {
        historyManager.redo();
        redrawCanvas(gc);
    }

    //********************************************************************\\
    // ابزار Fill
    public void FillTool(ShapeModel shape, GraphicsContext gc) {
        if (shape == null) return;
        // فقط رنگ shape تغییر می‌کند (shape موجود در history است همان شیء)
        shape.setColor(currentColor);
        redrawCanvas(gc);
    }

    //********************************************************************\\
    // Transform (مثلاً تغییر سایز)
    public void TransformTool(ShapeModel shape, double newEndX, double newEndY, GraphicsContext gc) {
        if (shape == null) return;
        shape.setEndX(newEndX);
        shape.setEndY(newEndY);
        redrawCanvas(gc);
    }

    //********************************************************************\\
    // مدیریت فایل (New/Open/Save ساده)
    public void NewTool(GraphicsContext gc) {
        historyManager.clear();
        redrawCanvas(gc);
    }

    public void OpenTool(String filename, GraphicsContext gc) {
        // متد Load از فایل اضافه شود
        redrawCanvas(gc);
    }

    public void SaveTool(String filename) {
        // متد SaveToFile اضافه شود
    }

    //********************************************************************\\
    // رسم همه اشکال موجود در History روی Canvas
    public void redrawCanvas(GraphicsContext gc) {
        gc.clearRect(0, 0, gc.getCanvas().getWidth(), gc.getCanvas().getHeight());

        ShapeModel[] shapes = historyManager.getAllShapes();
        for (ShapeModel shape : shapes) {
            if (shape == null) continue;
            drawShapeOnCanvas(shape, gc);
        }
    }

    private void drawShapeOnCanvas(ShapeModel shape, GraphicsContext gc) {
        // رنگ از shape خوانده می‌شود
        try {
            gc.setStroke(Color.web(shape.getColor()));
        } catch (Exception ex) {
            gc.setStroke(Color.BLACK);
        }
        gc.setLineWidth(2);

        String t = shape.getType();
        if ("CIRCLE".equals(t)) {
            double dx = shape.getEndX() - shape.getStartX();
            double dy = shape.getEndY() - shape.getStartY();
            double radius = Math.hypot(dx, dy);
            gc.strokeOval(shape.getStartX() - radius, shape.getStartY() - radius, radius * 2, radius * 2);
        } else if ("RECTANGLE".equals(t)) {
            double x = Math.min(shape.getStartX(), shape.getEndX());
            double y = Math.min(shape.getStartY(), shape.getEndY());
            double w = Math.abs(shape.getEndX() - shape.getStartX());
            double h = Math.abs(shape.getEndY() - shape.getStartY());
            gc.strokeRect(x, y, w, h);
        } else if ("LINE".equals(t)) {
            gc.strokeLine(shape.getStartX(), shape.getStartY(), shape.getEndX(), shape.getEndY());
        }
        // TODO: SQUARE, TRIANGLE, TEXT ...
    }

    public ShapeModel[] getHistoryShapes() 
    {
        return historyManager.getAllShapes();
    }
}

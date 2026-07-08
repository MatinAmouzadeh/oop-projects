package com.matin.paint.backend;

public class HistoryManager 
{
    private ShapeModel[] undoStack;
    private ShapeModel[] redoStack;
    private int undoTop;
    private int redoTop;

    public HistoryManager() 
    {
        undoStack = new ShapeModel[1000];
        redoStack = new ShapeModel[1000];
        undoTop = -1;
        redoTop = -1;
    }

    // اضافه کردن یک شکل جدید به تاریخچه
    public void addShape(ShapeModel shape)
    {
        if (undoTop < undoStack.length - 1) 
        {
            undoTop++;
            undoStack[undoTop] = shape;
            // وقتی شکل جدید اضافه میشه، redo باید پاک بشه
            redoTop = -1;
        }
    }

    // حذف یک شکل مشخص از تاریخچه (برای Eraser)
    public boolean removeShape(ShapeModel target)
    {
        if (target == null) return false;

        int size = undoTop + 1;
        int idx = -1;
        for (int i = 0; i < size; i++) {
            if (undoStack[i] == target) { idx = i; break; }
        }
        if (idx == -1) return false;

        // shift left
        for (int j = idx; j < undoTop; j++) {
            undoStack[j] = undoStack[j+1];
        }
        undoStack[undoTop] = null;
        undoTop--;

        // پاک کردن redo چون state تغییر کرده
        redoTop = -1;
        return true;
    }

    //***************************************************************************\\
    public void pushUndo(ShapeModel shape) 
    {
        if (undoTop < undoStack.length - 1) 
        {
            undoTop++;
            undoStack[undoTop]=shape;
            redoTop = -1;
        }
    }

    public ShapeModel undo() 
    {
        if (undoTop>=0) 
        {
            ShapeModel last = undoStack[undoTop];
            undoStack[undoTop] = null;
            undoTop--;

            redoPush(last);
            return last;
        }
        return null;
    }

    private void redoPush(ShapeModel shape) 
    {
        if (redoTop < redoStack.length - 1) 
        {
            redoTop++;
            redoStack[redoTop] = shape;
        }
    }

    public ShapeModel redo() 
    {
        if (redoTop >= 0) 
        {
            ShapeModel item = redoStack[redoTop];
            redoStack[redoTop] = null;
            redoTop--;

            pushUndo(item);

            return item;
        }
        return null;
    }

    public void clear() 
    {
        // پاک کردن کامل
        for (int i = 0; i <= undoTop; i++) undoStack[i] = null;
        for (int i = 0; i <= redoTop; i++) redoStack[i] = null;
        undoTop = -1;
        redoTop = -1;
    }

    public ShapeModel[] getAllShapes() 
    {
        int size = undoTop + 1;
        ShapeModel[] result = new ShapeModel[size];

        for (int i = 0; i < size; i++) 
        {
            result[i] = undoStack[i];
        }

        return result;
    }
}

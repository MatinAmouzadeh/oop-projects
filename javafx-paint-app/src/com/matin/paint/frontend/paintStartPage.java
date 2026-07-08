package com.matin.paint.frontend;

import java.net.URL;
import java.util.ResourceBundle;

import com.matin.paint.backend.Request;
import com.matin.paint.backend.ShapeModel;
import com.matin.paint.backend.ToolManager;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

public class paintStartPage implements Initializable{

	@FXML
	private Button btnBlack;

	@FXML
	private Button btnBlue;

	@FXML
	private Button btnCircle;

	@FXML
	private Button btnColorPicker;

	@FXML
	private Button btnDraw;

	@FXML
	private Button btnEraser;

	@FXML
	private Button btnFill;

	@FXML
	private Button btnLine;

	@FXML
	private Button btnNew;

	@FXML
	private Button btnOpen;

	@FXML
	private Button btnRectangle;

	@FXML
	private Button btnRed;

	@FXML
	private Button btnRedo;

	@FXML
	private Button btnSave;

	@FXML
	private Button btnSquare;

	@FXML
	private Button btnText;

	@FXML
	private Button btnTransform;

	@FXML
	private Button btnTriangle;

	@FXML
	private Button btnUndo;

	@FXML
	private Button btnWhite;

	@FXML
	private Button btnYellow;

	@FXML
	private Canvas drawingCanvas;

	@FXML
	private Canvas previewCanvas;

	private GraphicsContext drawingGC;
	private GraphicsContext previewGC;

	private Request UIPOJO;
	private ToolManager toolManager;


	 @Override
	    public void initialize(URL location, ResourceBundle resources) {
	        drawingGC = drawingCanvas.getGraphicsContext2D();
	        previewGC = previewCanvas.getGraphicsContext2D();
	        UIPOJO = new Request();
	        toolManager = new ToolManager();
	    }

	    //********************************************************************\\
	    // ابزارهای انتخاب رنگ
	    @FXML
	    void btnColorBlackPressing(ActionEvent event) 
	    { 
	    	UIPOJO.setColor("Black"); 
	    }
	    @FXML
	    void btnColorBluePressing(ActionEvent event) 
	    { 
	    	UIPOJO.setColor("Blue"); 
	    }
	    @FXML
	    void btnColorRedPressing(ActionEvent event) 
	    {
	    	UIPOJO.setColor("Red"); 
	    }
	    @FXML void btnColorWhitePressing(ActionEvent event) { UIPOJO.setColor("White"); }
	    @FXML void btnColorYellowPressing(ActionEvent event) { UIPOJO.setColor("Yellow"); }
	    @FXML void btnColorPickerPressing(ActionEvent event) { UIPOJO.setColor("Picker"); }

	    //********************************************************************\\
	    // ابزار انتخاب نوع شکل
	    @FXML void btnCirclePressing(ActionEvent event) { UIPOJO.setType("CIRCLE"); }
	    @FXML void btnLinePressing(ActionEvent event) { UIPOJO.setType("LINE"); }
	    @FXML void btnRectanglePressing(ActionEvent event) { UIPOJO.setType("RECTANGLE"); }

	    //********************************************************************\\
	    // Undo / Redo / New
	    @FXML void btnUndoPressing(ActionEvent event) { toolManager.UndoTool(drawingGC); }
	    @FXML void btnRedoPressing(ActionEvent event) { toolManager.RedoTool(drawingGC); }
	    @FXML void btnNewPressing(ActionEvent event) { toolManager.NewTool(drawingGC); }
	    @FXML
	    void btnSavePressing(ActionEvent event) 
	    {

	    }
	    
	    @FXML
	    void btnOpenPressing(ActionEvent event) 
	    {

	    }
	    
	    @FXML
	    void btnSquarePressing(ActionEvent event) 
	    {

	    }
	    
	    @FXML
	    void btnTrianglePressing(ActionEvent event) 
	    {

	    }
	    
	    @FXML
	    void btnTextPressing(ActionEvent event) 
	    {

	    }

	    @FXML
	    void btnTransformPressing(ActionEvent event) 
	    {

	    }
	    //********************************************************************\\
	    // ابزار Eraser و Fill
	    @FXML
	    void btnDrawPressing(ActionEvent event) 
	    {

	    }
	    @FXML void btnEraserPressing(ActionEvent event) { UIPOJO.setTool("ERASER"); }
	    @FXML void btnFillPressing(ActionEvent event) { UIPOJO.setTool("FILL"); }

	    //********************************************************************\\
	    // Mouse Events روی پیش‌نمایش
	    
	    @FXML
	    void onPreviewCanvasMousePressed(MouseEvent event) {
	        UIPOJO.setStartX(event.getX());
	        UIPOJO.setStartY(event.getY());
	    }

	    @FXML
	    void onPreviewCanvasMouseDragged(MouseEvent event) {
	        previewGC.clearRect(0, 0, previewCanvas.getWidth(), previewCanvas.getHeight());
	        UIPOJO.setEndX(event.getX());
	        UIPOJO.setEndY(event.getY());

	        previewGC.setStroke(Color.web(UIPOJO.getColor()));
	        previewGC.setLineWidth(2);

	        switch (UIPOJO.getType()) {
	            case "LINE":
	                previewGC.strokeLine(UIPOJO.getStartX(), UIPOJO.getStartY(), UIPOJO.getEndX(), UIPOJO.getEndY());
	                break;
	            case "RECTANGLE":
	                previewGC.strokeRect(Math.min(UIPOJO.getStartX(), UIPOJO.getEndX()),
	                                     Math.min(UIPOJO.getStartY(), UIPOJO.getEndY()),
	                                     Math.abs(UIPOJO.getEndX() - UIPOJO.getStartX()),
	                                     Math.abs(UIPOJO.getEndY() - UIPOJO.getStartY()));
	                break;
	            case "CIRCLE":
	                double radius = Math.hypot(UIPOJO.getEndX() - UIPOJO.getStartX(), UIPOJO.getEndY() - UIPOJO.getStartY());
	                previewGC.strokeOval(UIPOJO.getStartX() - radius, UIPOJO.getStartY() - radius, radius * 2, radius * 2);
	                break;
	        }
	    }

	    @FXML
	    void onPreviewCanvasMouseReleased(MouseEvent event) {
	        UIPOJO.setEndX(event.getX());
	        UIPOJO.setEndY(event.getY());

	        previewGC.clearRect(0, 0, previewCanvas.getWidth(), previewCanvas.getHeight());

	        if ("ERASER".equals(UIPOJO.getTool())) {
	            // در این حالت باید شکل مورد نظر را پیدا کنیم و حذف کنیم
	            // مثال ساده: حذف آخرین شکل
	            ShapeModel[] shapes = toolManager.getHistoryShapes();
	            if (shapes.length > 0) {
	                ShapeModel last = shapes[shapes.length - 1];
	                toolManager.EraserTool(last, drawingGC);
	            }
	        } else if ("FILL".equals(UIPOJO.getTool())) {
	            ShapeModel[] shapes = toolManager.getHistoryShapes();
	            if (shapes.length > 0) {
	                ShapeModel last = shapes[shapes.length - 1];
	                toolManager.FillTool(last, drawingGC);
	            }
	        } else {
	            // ابزارهای رسم
	            switch (UIPOJO.getType()) {
	                case "LINE": toolManager.LineTool(UIPOJO, drawingGC); break;
	                case "RECTANGLE": toolManager.RectangleTool(UIPOJO, drawingGC); break;
	                case "CIRCLE": toolManager.CircleTool(UIPOJO, drawingGC); break;
	            }
	        }
	    }

	    //********************************************************************\\
	    // متد کمکی برای دسترسی به تمام اشکال از ToolManager
	    public ShapeModel[] getAllShapes() {
	        return toolManager.getHistoryShapes();
	    }
	}
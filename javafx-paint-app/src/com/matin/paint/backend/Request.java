package com.matin.paint.backend;

public class Request {

    private String type;     // LINE, RECTANGLE, CIRCLE
    private String color;    // Black, Red, Blue ...
    private double startX;
    private double startY;
    private double endX;
    private double endY;
    private String tool;     // DRAW, FILL, ERASER, COLOR_PICKER


	public String getType() 
	{
		return type;
	}

	public void setType(String type) 
	{
		this.type = type;
	}

	public String getColor() 
	{
		return color;
	}

	public void setColor(String color) 
	{
		this.color = color;
	}

	public double getStartX() 
	{
		return startX;
	}

	public void setStartX(double startX) 
	{
		this.startX = startX;
	}

	public double getStartY() 
	{
		return startY;
	}

	public void setStartY(double startY) 
	{
		this.startY = startY;
	}

	public double getEndX() 
	{
		return endX;
	}

	public void setEndX(double endX) 
	{
		this.endX = endX;
	}

	public double getEndY() 
	{
		return endY;
	}

	public void setEndY(double endY) 
	{
		this.endY = endY;
	}

	public String getTool() 
	{
		return tool;
	}

	public void setTool(String tool) 
	{
		this.tool = tool;
	}
}

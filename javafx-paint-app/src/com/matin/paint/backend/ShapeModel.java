package com.matin.paint.backend;

public class ShapeModel 
{
    private String type; // LINE, RECTANGLE, CIRCLE, TRIANGLE
    private double startX;
    private double startY;
    private double endX;
    private double endY;
    private String color;

    // سازنده ریکوئست
    public ShapeModel(Request A)
    {
        this.type = A.getType();
        this.startX = A.getStartX();
        this.startY = A.getStartY();
        this.endX = A.getEndX();
        this.endY = A.getEndY();
        this.color = A.getColor();
        normalize();
    }

    // سازنده مستقیم
    public ShapeModel(String Type, double StartX, double StartY, double EndX, double EndY, String Color)
    {
        this.type = Type;
        this.startX = StartX;
        this.startY = StartY;
        this.endX = EndX;
        this.endY = EndY;
        this.color = Color;
        normalize();
    }

    //**************************************************************\\
    // مهم‌ترین بخش: نظم دادن به مختصات برای هندل صحیح شکل‌ها
    private void normalize()
    {
        if (type.equals("RECTANGLE") || type.equals("SQUARE"))
        {
            double x1 = Math.min(startX, endX);
            double y1 = Math.min(startY, endY);
            double x2 = Math.max(startX, endX);
            double y2 = Math.max(startY, endY);

            startX = x1;
            startY = y1;
            endX = x2;
            endY = y2;
        }
    }

    //**************************************************************\\
    // Hit-Test برای پاک‌کن (بسیار مهم)
    public boolean hitTest(double x, double y)
    {
        switch (type)
        {
            case "LINE":
                return hitLine(x, y);

            case "RECTANGLE":
            case "SQUARE":
                return x >= startX && x <= endX && y >= startY && y <= endY;

            case "CIRCLE":
                return hitCircle(x, y);

            case "TRIANGLE":
                return hitTriangle(x, y);

            default:
                return false;
        }
    }

    //**************************************************************\\
    private boolean hitCircle(double x, double y)
    {
        double centerX = (startX + endX) / 2;
        double centerY = (startY + endY) / 2;

        double radius = Math.hypot(endX - startX, endY - startY) / 2;

        double dx = x - centerX;
        double dy = y - centerY;

        return dx * dx + dy * dy <= radius * radius;
    }

    //**************************************************************\\
    private boolean hitLine(double x, double y)
    {
        double distanceToLine =
                Math.abs((endY - startY) * x -
                         (endX - startX) * y +
                         endX * startY -
                         endY * startX) /
                Math.hypot(endY - startY, endX - startX);

        // خط ضخامت ندارد، پس برای تشخیص ۵ پیکسل تلرانس می‌گذاریم
        return distanceToLine <= 5;
    }

    //**************************************************************\\
    private boolean hitTriangle(double x, double y)
    {
        // مثلث تو داری با start/end نمی‌سازی فعلاً
        // پس این تابع فیک است و همیشه false می‌دهد تا بعداً مدل مثلث تعریف کنیم
        return false;
    }
    
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        ShapeModel other = (ShapeModel) obj;

        return this.type.equals(other.type)
                && this.startX == other.startX
                && this.startY == other.startY
                && this.endX == other.endX
                && this.endY == other.endY
                && this.color.equals(other.color);
    }

    @Override
    public int hashCode() {
        int result = type.hashCode();
        long temp;

        temp = Double.doubleToLongBits(startX);
        result = 31 * result + (int)(temp ^ (temp >>> 32));

        temp = Double.doubleToLongBits(startY);
        result = 31 * result + (int)(temp ^ (temp >>> 32));

        temp = Double.doubleToLongBits(endX);
        result = 31 * result + (int)(temp ^ (temp >>> 32));

        temp = Double.doubleToLongBits(endY);
        result = 31 * result + (int)(temp ^ (temp >>> 32));

        result = 31 * result + color.hashCode();

        return result;
    }


    //**************************************************************\\

    public void setType(String Type) { this.type = Type; }
    public void setStartX(double StartX) { this.startX = StartX; }
    public void setStartY(double StartY) { this.startY = StartY; }
    public void setEndX(double EndX) { this.endX = EndX; }
    public void setEndY(double EndY) { this.endY = EndY; }
    public void setColor(String Color) { this.color = Color; }

    public String getType() { return this.type; }
    public double getStartX() { return this.startX; }
    public double getStartY() { return this.startY; }
    public double getEndX() { return this.endX; }
    public double getEndY() { return this.endY; }
    public String getColor() { return this.color; }
}

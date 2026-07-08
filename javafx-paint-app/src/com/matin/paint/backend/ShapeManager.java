package com.matin.paint.backend;

// فقط منطق ساخت ShapeModel و ارسال آن به HistoryManager
public class ShapeManager 
{
    private HistoryManager history;

    public ShapeManager(HistoryManager history)
    {
        this.history = history;
    }

    //********************************************************************//

    public void AddCircle(ShapeModel shape)
    {
        // --- هیچ رسمى اینجا انجام نمی‌شود ---
        // فقط ذخیره shape در History
        history.addShape(shape);
    }

    public void AddLine(ShapeModel shape)
    {
        history.addShape(shape);
    }

    public void AddRectangle(ShapeModel shape)
    {
        history.addShape(shape);
    }

}

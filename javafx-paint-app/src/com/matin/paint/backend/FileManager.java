package com.matin.paint.backend;

import java.io.*;

public class FileManager {

    // ذخیره اشکال در فایل
    public void saveToFile(String path, ShapeModel[] shapes) {
        try {
            FileWriter writer = new FileWriter(path);

            for (int i = 0; i < shapes.length; i++) {
                ShapeModel s = shapes[i];

                String line =
                        s.getType() + "," +
                        s.getStartX() + "," +
                        s.getStartY() + "," +
                        s.getEndX() + "," +
                        s.getEndY() + "," +
                        s.getColor();

                writer.write(line + "\n");
            }

            writer.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    // بارگذاری شکل‌ها از فایل
    public ShapeModel[] loadFromFile(String path) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));

            ShapeModel[] temp = new ShapeModel[1000];
            int count = 0;

            String line;
            while ((line = reader.readLine()) != null) {

                String[] p = split(line, ',');

                ShapeModel shape = new ShapeModel(
                        p[0],                           // type
                        Double.parseDouble(p[1]),       // startX
                        Double.parseDouble(p[2]),       // startY
                        Double.parseDouble(p[3]),       // endX
                        Double.parseDouble(p[4]),       // endY
                        p[5]                            // color
                );

                temp[count] = shape;
                count++;
            }

            reader.close();

            ShapeModel[] result = new ShapeModel[count];
            for (int i = 0; i < count; i++) {
                result[i] = temp[i];
            }

            return result;

        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }


    // Split دستی بدون استفاده از case یا هر چیز اضافی⚡
    private String[] split(String text, char sep) {
        String[] result = new String[10];
        int index = 0;
        String current = "";

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            if (c == sep) {
                result[index] = current;
                index++;
                current = "";
            } else {
                current += c;
            }
        }

        result[index] = current;  // آخرین بخش

        return result;
    }
}

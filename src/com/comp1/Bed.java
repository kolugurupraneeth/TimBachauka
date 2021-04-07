package com.comp1;

public class Bed {

    private String style;
    private int height;
    private int sheets;
    private int quilt;
    private int pillows;

    public Bed(String style, int height, int sheets, int quilt, int pillows) {
        this.style = style;
        this.height = height;
        this.sheets = sheets;
        this.quilt = quilt;
        this.pillows = pillows;
    }
    public void make(){
        System.out.println("Bed  ->  Making |");
    }

    public String getStyle() {
        return style;
    }

    public int getHeight() {
        return height;
    }

    public int getSheets() {
        return sheets;
    }

    public int getQuilt() {
        return quilt;
    }

    public int getPillows() {
        return pillows;
    }
}

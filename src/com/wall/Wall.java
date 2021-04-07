package com.wall;

public class Wall {

    private double width;
    private double height;

//constructor1
    public Wall(){
        this.width=0;
        this.height=0;
    }

    //constructor2
    public Wall(double width, double height) {

        if(width < 0 ){
            width =0;
        }
        this.width = width;
        if(height < 0){
            height = 0;
        }

        this.height = height;

    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width < 0){
            width=0;
        }
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if(height < 0){
            height=0;
        }
        this.height = height;
    }

    public double getArea(){
        return (this.height)*(this.width);


    }
}

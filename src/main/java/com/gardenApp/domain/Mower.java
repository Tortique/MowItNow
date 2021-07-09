package com.gardenApp.domain;


public class Mower {
    private int xPos;
    private int yPos;
    private String orientation;

    public Mower(int xPos, int yPos, String orientation) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.orientation = orientation;
    }

    public int getxPos() {
        return xPos;
    }

    public void setxPos(int xPos) {
        this.xPos = xPos;
    }

    public int getyPos() {
        return yPos;
    }

    public void setyPos(int yPos) {
        this.yPos = yPos;
    }

    public String getOrientation() {
        return orientation;
    }

    public void setOrientation(String orientation) {
        this.orientation = orientation;
    }

    @Override
    public String toString() {
        return "Mower{" +
                "xPos=" + xPos +
                ", yPos=" + yPos +
                ", orientation='" + orientation + '\'' +
                '}';
    }
}

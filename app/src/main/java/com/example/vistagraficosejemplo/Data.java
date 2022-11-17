package com.example.vistagraficosejemplo;

public class Data {
    private String nameStringY;
    private float valueAlturaY;
    private String nameX;

    public Data(String nameStringY, float valueAlturaY, String nameX) {
        this.nameStringY = nameStringY;
        this.valueAlturaY = valueAlturaY;
        this.nameX = nameX;
    }

    public String getNameStringY() {
        return nameStringY;
    }

    public void setNameStringY(String nameStringY) {
        this.nameStringY = nameStringY;
    }

    public float getValueAlturaY() {
        return valueAlturaY;
    }

    public void setValueAlturaY(float valueAlturaY) {
        this.valueAlturaY = valueAlturaY;
    }

    public String getNameX() {
        return nameX;
    }

    public void setNameX(String nameX) {
        this.nameX = nameX;
    }
}
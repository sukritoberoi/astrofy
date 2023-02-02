package com.example.sukoon;

public class modelclass {
    private int temp;
    private String para;

    modelclass(int temp,String para)
    {
        this.temp=temp;
        this.para=para;
    }


    public int getTemp() {
        return temp;
    }

    public String getPara() {
        return para;
    }
}

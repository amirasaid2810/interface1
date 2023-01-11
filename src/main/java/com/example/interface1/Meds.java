package com.example.interface1;


public class Meds {
    private int REF;
    private int DCI;
    private int PRICE;
    private String Name;
    private int QTE;
    private  int Dexpd;
    private int Dperm;

    public Meds(int  ref, int dci, int price, int name, int qte, int dexpd, int dperm) {
        REF = ref;
        DCI = dci;
        PRICE = Integer.parseInt(String.valueOf(price));
        Name = String.valueOf(name);
        QTE = qte;
        Dexpd = dexpd;
        Dperm = dperm;}

    public int getDperm() {
        return Dperm;
    }
    public int getDexpd() {
        return Dexpd;
    }
    public int getQTE() {
        return QTE;
    }
    public String getName() {
        return Name;
    }
    public int getPrice() {return PRICE;}
    public int getDCI() {
        return DCI;
    }
    public int getREF() {
        return REF;
    }
}

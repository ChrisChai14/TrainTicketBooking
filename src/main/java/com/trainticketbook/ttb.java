package com.trainticketbook;

public class ttb {
    int otkn;
    int rtkn;
    public ttb(int otkn, int rtkn) {
        this.otkn = otkn;
        this.rtkn = rtkn;
    }
    public void print() {
        System.out.print("\t單程票張數" + otkn + "\t加購來回票張數" + rtkn +
                "\t 金額總共是：" + Math.round(totalPrice()));
        if (bookNum() < 0) {
            System.out.println("\t資料有誤，來回票不可多於單程票，結果無法參考！");
        }
    }
    public int bookNum() {
        return (otkn - rtkn);
    }
    public double totalPrice() {
        return ((bookNum() * 1000) + (rtkn * (2000 * 0.9)));
    }
}

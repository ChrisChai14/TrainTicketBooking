package com.trainticketbook

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    print("北高火車票價試算系統，目前價格為：單趟1000元，來回票可以享有九折優惠\n")
    print("請輸入訂票張數：\n")
    val otkn = scanner.nextInt()
    print("有幾張是來回票？\n")
    val rtkn = scanner.nextInt()
    val ttbrs = ttbr(otkn, rtkn)
    ttbrs.print()
}

class ttbr (var otkn:Int, var rtkn:Int) {
    fun print() {
        println(
            "\n單程票張數" + otkn + "\n加購來回票張數" + rtkn +
            "\n金額總共是：" + Math.round(totalPrice())
        )
        if (booknum() < 0 ) {
            print ("\t資料有誤，來回票不可多於單程票，結果無法參考！")
        }
    }

    fun booknum() = (otkn - rtkn)
    fun totalPrice() = ((otkn - rtkn) * 1000) + (rtkn * (2000 * 0.9))
}
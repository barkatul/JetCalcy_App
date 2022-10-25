package com.barkatul.jetcalcy.util

fun calculateTotalTip(totalBill: Double, tipPercentage: Int): Double {
    return if(totalBill.toDouble() > 1 &&
        totalBill.toString().isNotEmpty())
    {
        (totalBill.toDouble() * tipPercentage)/100
    }
    else
        0.0
}
fun calculateTotalPerPerson(
    totalBill : Double,
    splitBy : Int,
    tipPercentage: Int): Double{

    var bill = calculateTotalTip(totalBill = totalBill,
    tipPercentage = tipPercentage) + totalBill

    return (bill)/splitBy
}
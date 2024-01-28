package me.dio.credit.application.system.dto

import jdk.jshell.Snippet.Status
import me.dio.credit.application.system.entity.Credit
import java.math.BigDecimal

data class CreditView (
    val creditCode: java.util.UUID,
    val creditValue: BigDecimal,
    val numberOfInstallment: Int,
    val status: me.dio.credit.application.system.enumeration.Status,
    val emailCustomer: String?,
    val incomeCustomer: BigDecimal?
){
    constructor(credit: Credit): this (
        creditCode = credit.creditCode,
        creditValue = credit.creditValue,
        numberOfInstallment = credit.numberOfInstallments,
        status = credit.status,
        emailCustomer = credit.customer?.email,
        incomeCustomer = credit.customer?.income
    )
}

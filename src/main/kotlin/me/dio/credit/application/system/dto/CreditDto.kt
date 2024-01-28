package me.dio.credit.application.system.dto

import jakarta.validation.constraints.Future
import jakarta.validation.constraints.Max
import jakarta.validation.constraints.Min
import jakarta.validation.constraints.NotNull
import me.dio.credit.application.system.entity.Credit
import me.dio.credit.application.system.entity.Customer
import java.math.BigDecimal
import java.time.LocalDate

data class CreditDto (
    @field:NotNull(message = "Ensure this field is not blank.") val creditValue: BigDecimal,
    @field:Future (message = "Error: The First day of the Installments should be a date in the future and within the next 3 months.") val dayFirstOfInstallment: LocalDate,
    @field:Min(value = 1, message = "Minimum of 1 installment.") @field:Max(value = 48, message ="Maximum of 48 installments.") val numberOfInstallment: Int,
    @field:NotNull(message = "Ensure this field is not blank.") val customerId: Long

){
    fun toEntity(): Credit = Credit(
        creditValue = this.creditValue,
        dayFirstInstallment = this.dayFirstOfInstallment,
        numberOfInstallments = this.numberOfInstallment,
        customer = Customer (id = this.customerId)
    )


}

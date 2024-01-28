package me.dio.credit.application.system.dto

import jakarta.validation.constraints.NotEmpty
import jakarta.validation.constraints.NotNull
import me.dio.credit.application.system.entity.Customer
import java.math.BigDecimal

data class CustomerUpdateDto (
    @field:NotEmpty(message = "Ensure the string field is not blank.") val firstName: String,
    @field:NotEmpty(message = "Ensure the string field is not blank.") val lastName: String,
    @field:NotNull(message = "Ensure this field is not blank.") val income: BigDecimal,
    @field:NotEmpty(message = "Ensure the string field is not blank.") val zipCode: String,
    @field:NotEmpty(message = "Ensure the string field is not blank.") val street: String
){
    fun toEntity(customer: Customer): Customer{
        customer.firstName = this.firstName
        customer.lastName = this.lastName
        customer.income = this.income
        customer.address.zipCode = this.zipCode
        customer.address.street = this.street
        return customer

    }
}

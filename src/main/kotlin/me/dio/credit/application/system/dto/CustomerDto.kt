package me.dio.credit.application.system.dto

import jakarta.validation.constraints.Email
import jakarta.validation.constraints.NotEmpty
import jakarta.validation.constraints.NotNull
import me.dio.credit.application.system.entity.Address
import me.dio.credit.application.system.entity.Customer
import org.hibernate.validator.constraints.br.CPF
import java.math.BigDecimal

data class CustomerDto (
    @field:NotEmpty(message = "Ensure the string field is not blank.") val firstName: String,
    @field:NotEmpty(message = "Ensure the string field is not blank.") val lastName: String,
    @field:NotEmpty(message = "Ensure the string field is not blank.")
    @field:CPF(message = "Ensure the CPF is a valid and complete 11-digit number.") val cpf: String,
    @field:NotNull (message = "Ensure this field is not blank.") val income: BigDecimal,
    @field:Email (message = "Please enter a valid email address.")
    @field:NotEmpty(message = "Ensure the string field is not blank.") val email: String,
    @field:NotEmpty(message = "Ensure the string field is not blank.") val password: String,
    @field:NotEmpty(message = "Ensure the string field is not blank.") val zipCode: String,
    @field:NotEmpty(message = "Ensure the string field is not blank.") val street: String,
) {
    fun toEntity(): Customer = Customer(
        firstName = this.firstName,
        lastName = this.lastName,
        cpf = this.cpf,
        income = this.income,
        email = this.email,
        password = this.password,
        address = Address(
            zipCode = this.zipCode,
            street = this.street
            ),
    )
}

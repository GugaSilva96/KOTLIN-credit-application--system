package me.dio.credit.application.system.service

import jakarta.persistence.Id
import me.dio.credit.application.system.entity.Credit
import org.aspectj.apache.bcel.classfile.Code
import org.hibernate.validator.constraints.UUID

interface ICreditService {
    fun save(credit: Credit): Credit
    fun findAllByCustomer(customerId: Long): List<Credit>
    fun findByCreditCode(customerId: Long, creditCode: java.util.UUID): Credit
}

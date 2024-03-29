package me.dio.credit.application.system.service.impl

import me.dio.credit.application.system.entity.Credit
import me.dio.credit.application.system.exception.BusinessException
import me.dio.credit.application.system.repository.CreditRepository
import me.dio.credit.application.system.service.ICreditService
import org.hibernate.validator.constraints.UUID
import org.springframework.context.annotation.Lazy
import org.springframework.stereotype.Service
import kotlin.RuntimeException

@Service
class CreditService(
    private val creditRepository: CreditRepository,
    @Lazy private val customerService: CustomerService
): ICreditService {
    override fun save(credit: Credit): Credit {
        credit.apply {
            customer = customerService.findById(credit.customer?.id!!)
        }
        return this.creditRepository.save(credit)
    }

    override fun findAllByCustomer(customerId: Long): List<Credit> =
        this.creditRepository.findAllByCustomerId(customerId)

    override fun findByCreditCode(customerId: Long, creditCode: java.util.UUID): Credit {
        val credit: Credit = (this.creditRepository.findByCreditCode(creditCode)
            ?: throw BusinessException("Credit code $creditCode not found!"))
        return if(credit.customer?.id == customerId) credit else throw IllegalArgumentException("Contact ADMIN")
    }
}
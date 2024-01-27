package me.dio.credit.application.system.service.impl

import jakarta.persistence.Id
import me.dio.credit.application.system.entity.Credit
import me.dio.credit.application.system.repository.CreditRepository
import me.dio.credit.application.system.service.ICreditService
import org.hibernate.validator.constraints.UUID
import org.springframework.stereotype.Service
import kotlin.RuntimeException

@Service
class CreditService(
    private val creditRepository: CreditRepository,
    private val customerService: CustomerService
): ICreditService {
    override fun save(credit: Credit): Credit {
        credit.apply {
            customer = customerService.findById(credit.customer?.id!!)
        }
        return this.creditRepository.save(credit)
    }

    override fun findAllByCustomer(customerId: Long): List<Credit> {
        TODO("Not yet implemented")
    }

    override fun findByCreditCode(customerId: Long, creditCode: UUID): Credit {
        val credit: Credit = (this.creditRepository.finByCreditCode(creditCode)
            ?: throw RuntimeException("Credit code $creditCode not founded!"))
        return if(credit.customer?.id == customerId) credit else throw RuntimeException("Contact ADMIN")
    }
}
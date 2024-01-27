package me.dio.credit.application.system.repository

import me.dio.credit.application.system.entity.Credit
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.stereotype.Repository
import java.util.UUID

@Repository
interface CreditRepository: JpaRepository<Credit, Long> {
    fun finByCreditCode(creditCode: org.hibernate.validator.constraints.UUID) : Credit?

    @Query(value = "SELECT * CREDIT WHERE CREDIT_ID = ?1", nativeQuery = true)
    fun findAllByCustomerId(customerId: Long): List<Credit>
}

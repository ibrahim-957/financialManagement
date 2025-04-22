package com.ibrahim.financeManagement.DataAccess.Abstracts;

import com.ibrahim.financeManagement.Entities.Concretes.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface ITransactionRepository extends JpaRepository<Transaction, Integer> {
    List<Transaction> findAllByUserId(int userId);
    List<Transaction> findAllByUserIdAndType(
            int userId, Transaction.TransactionType type);
    List<Transaction> findAllByUserIdAndCategoryId(
            int userId, int categoryId);
    List<Transaction> findAllByUserIdAndCreatedAtBetween(
            int userId, LocalDateTime startDate, LocalDateTime endDate);

}

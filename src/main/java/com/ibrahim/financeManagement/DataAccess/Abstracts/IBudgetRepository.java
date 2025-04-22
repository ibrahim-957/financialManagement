package com.ibrahim.financeManagement.DataAccess.Abstracts;

import com.ibrahim.financeManagement.Entities.Concretes.Budget;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface IBudgetRepository extends JpaRepository<Budget, Integer> {
    List<Budget> findAllByUserId(int userId);
    List<Budget> findAllByUserIdAndCategoryId(int userId, int categoryId);
    List<Budget> findAllByUserIdAndEndDateAfter(
            int userId, LocalDateTime endDate);
}

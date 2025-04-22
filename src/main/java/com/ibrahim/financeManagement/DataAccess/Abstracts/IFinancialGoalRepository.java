package com.ibrahim.financeManagement.DataAccess.Abstracts;

import com.ibrahim.financeManagement.Entities.Concretes.FinancialGoal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IFinancialGoalRepository extends JpaRepository<FinancialGoal, Integer> {
}

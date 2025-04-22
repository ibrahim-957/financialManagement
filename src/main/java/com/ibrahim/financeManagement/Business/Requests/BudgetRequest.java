package com.ibrahim.financeManagement.Business.Requests;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BudgetRequest {
    @NotNull
    private String name;
    @NotNull
    @DecimalMin(value = "0.0", message = "Amount must be greater than 0", inclusive = false)
    private BigDecimal amount;
    @NotNull
    private int categoryId;
    @NotNull
    private LocalDateTime startDate;
    @NotNull
    private LocalDateTime endDate;
}

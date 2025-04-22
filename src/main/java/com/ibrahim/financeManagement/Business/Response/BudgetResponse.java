package com.ibrahim.financeManagement.Business.Response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BudgetResponse {
    private int id;
    private String name;
    private BigDecimal amount;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private BigDecimal spentAmount;
    private BigDecimal remainingAmount;
    private int categoryId;
    private String categoryName;
}

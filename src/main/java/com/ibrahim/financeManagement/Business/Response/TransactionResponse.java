package com.ibrahim.financeManagement.Business.Response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.ibrahim.financeManagement.Entities.Concretes.Transaction;
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
public class TransactionResponse {
    private int id;
    private BigDecimal amount;
    private String description;
    private Transaction.TransactionType type;
    private LocalDateTime transactionDate;
    private String categoryName;
    private int categoryId;
    private LocalDateTime createdAt;
}

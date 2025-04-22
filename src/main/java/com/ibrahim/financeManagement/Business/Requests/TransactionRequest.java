package com.ibrahim.financeManagement.Business.Requests;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.ibrahim.financeManagement.Entities.Concretes.Transaction;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TransactionRequest {
    @DecimalMin(value = "0.0", message = "Amount must be greater than 0", inclusive = false)
    private BigDecimal amount;
    @Size(min = 3, max = 255, message = "Description must be between 3 and 255 characters")
    private String description;

    private int categoryId;

    private Transaction.TransactionType type;

    private LocalDateTime transactionDate;
}

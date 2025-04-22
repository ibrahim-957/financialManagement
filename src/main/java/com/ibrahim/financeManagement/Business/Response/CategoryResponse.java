package com.ibrahim.financeManagement.Business.Response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.ibrahim.financeManagement.Entities.Concretes.Category;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CategoryResponse {
    private int id;
    private String name;
    private String description;
    private String color;
    private Category.CategoryType type;
    private Boolean isDefault;
}

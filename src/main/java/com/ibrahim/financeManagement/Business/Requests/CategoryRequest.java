package com.ibrahim.financeManagement.Business.Requests;

import com.ibrahim.financeManagement.Entities.Concretes.Category;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoryRequest {
    @NotNull
    private String name;
    @NotNull
    private String description;
    @NotNull
    @Pattern(regexp = "^#([a-fA-F0-9]{6}|[a-fA-F0-9]{3})$")
    private String color;
    @NotNull
    private Category.CategoryType type;
}

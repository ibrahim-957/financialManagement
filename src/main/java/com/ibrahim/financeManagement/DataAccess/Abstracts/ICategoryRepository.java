package com.ibrahim.financeManagement.DataAccess.Abstracts;

import com.ibrahim.financeManagement.Entities.Concretes.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ICategoryRepository extends JpaRepository<Category, Integer> {
    List<Category> findAllByUserIdOrUserIdIsNull(int userId);
    List<Category> findAllByUserIdAndType(
            int userId, Category.CategoryType type);
    List<Category> findAllByUserIsNullAndType(Category.CategoryType type);
}

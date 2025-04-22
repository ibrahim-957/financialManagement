package com.ibrahim.financeManagement.Entities.Concretes;


import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "categories")
@Data
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name", nullable = false)
    private String name;

    private String description;

    private String color; // for UI display, hex code

    @Column(nullable = false)
    private Boolean isDefault = false; // Whether this is a system default category

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private CategoryType type; // Income or Expense

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user; // null for default categories

    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
    private Set<Transaction> transactions = new HashSet<>();

    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
    private Set<Budget> budgets = new HashSet<>();

    @CreationTimestamp
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private LocalDateTime updatedAt;

    public enum CategoryType{
        INCOME, EXPENSE
    }
}

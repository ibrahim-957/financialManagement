package com.ibrahim.financeManagement.DataAccess.Abstracts;

import com.ibrahim.financeManagement.Entities.Concretes.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRoleRepository extends JpaRepository<Role, Integer> {
    Role findByName(String name);
}

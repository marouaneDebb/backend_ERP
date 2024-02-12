package com.example.school.Repositories;

import com.example.school.Entities.Discount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RemiseRepository extends JpaRepository<Discount,Long> {
}

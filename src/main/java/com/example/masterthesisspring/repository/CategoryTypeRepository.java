package com.example.masterthesisspring.repository;

import com.example.masterthesisspring.model.CategoryType;
import com.example.masterthesisspring.model.enums.CategoryEnum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CategoryTypeRepository extends JpaRepository<CategoryType, Long> {
    Optional<CategoryType> findByName(CategoryEnum name);
}
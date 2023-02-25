package com.example.masterthesisspring.repository;

import com.example.masterthesisspring.model.ConditionType;
import com.example.masterthesisspring.model.enums.ConditionEnum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ConditionTypeRepository extends JpaRepository<ConditionType, Long> {
    Optional<ConditionType> findByName(ConditionEnum name);
}
package com.example.masterthesisspring.repository;

import com.example.masterthesisspring.model.OfferType;
import com.example.masterthesisspring.model.enums.OfferEnum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface OfferTypeRepository extends JpaRepository<OfferType, Long> {
    Optional<OfferType> findByName(OfferEnum name);
}
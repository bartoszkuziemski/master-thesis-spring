package com.example.masterthesisspring.dto;

import com.example.masterthesisspring.model.enums.CategoryEnum;
import com.example.masterthesisspring.model.enums.ConditionEnum;
import com.example.masterthesisspring.model.enums.OfferEnum;

public record ProductAddDto(
        String name,
        Double price,
        String description,
        Double rating,
        Long userId,
        CategoryEnum categoryType,
        ConditionEnum conditionType,
        OfferEnum offerType
) {
}

package com.example.masterthesisspring.dto;

import com.example.masterthesisspring.model.enums.CategoryEnum;
import com.example.masterthesisspring.model.enums.ConditionEnum;
import com.example.masterthesisspring.model.enums.OfferEnum;

public record ProductDto(
        Long id,
        String name,
        Double price,
        String description,
        Double rating,
        UserDto user,
        CategoryEnum categoryType,
        ConditionEnum conditionType,
        OfferEnum offerType
) {
}

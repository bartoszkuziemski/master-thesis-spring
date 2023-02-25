package com.example.masterthesisspring.model.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum OfferEnum {
    BUY_NOW("BUY_NOW"),
    AUCTION("AUCTION");

    private final String name;
}

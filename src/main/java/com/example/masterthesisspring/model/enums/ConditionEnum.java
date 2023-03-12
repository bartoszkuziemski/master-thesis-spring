package com.example.masterthesisspring.model.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ConditionEnum {
    NEW("NEW"),
    USED("USED"),
    NEW_WITHOUT_TAG("NEW_WITHOUT_TAG"),
    NEW_WITH_DEFECT("NEW_WITH_DEFECT");

    private final String name;
}

package com.epam.training.center.hw3;

public enum TestData {

    HOME_PAGE_TITLE("Home Page"),
    TOP_NAV_ELEMENT_AMOUNT(4),
    HOME_TOP_BTN("HOME"),
    CONTACT_TOP_BTN("CONTACT FORM"),
    SERVICE_TOP_BTN("SERVICE"),
    METALS_AND_COLORS_TOP_BTN("METALS & COLORS"),
    BENEFIT_ICON_NUMBER(4),
    BENEFIT_TEXT_NUMBER(4),
    LEFT_NAV_ELEMENTS_AMOUNT(5),
    HOME_LEFT_BTN("Home"),
    CONTACT_LEFT_BTN("Contact form"),
    SERVICE_LEFT_BTN("Service"),
    METALS_AND_COLORS_LEFT_BTN("Metals & Colors"),
    ELEMENTS_PACKS_LEFT_BTN("Elements packs"),
    FRAME_ID("frame"),
    DIFFERENT_ELEMENTS_TITLE("Different Elements"),
    YELLOW("Yellow"),
    LOG_ROWS_NUMBER(4),
    WATER_ROW_TEXT("Water: condition changed to true"),
    WIND_ROW_TEXT("Wind: condition changed to true"),
    SELEN_ROW_TEXT("metal: value changed to  Selen"),
    YELLOW_ROW_TEXT("Colors: value changed to Yellow");

    private String value;
    private int amount;

    TestData(String value) {
        this.value = value;
    }

    TestData(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public String getValue() {
        return value;
    }
}

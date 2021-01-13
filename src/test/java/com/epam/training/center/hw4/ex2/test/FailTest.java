package com.epam.training.center.hw4.ex2.test;

import com.epam.training.center.hw4.BaseTest;
import com.epam.training.center.hw4.TestData;
import org.testng.annotations.Test;

public class FailTest extends BaseTest {

    @Test
    public void searchAndCheckPageElements() {

        actionStep.navigateToPageByDiffElBtn(TestData.DIFFERENT_ELEMENTS_TITLE.getValue());

        assertionStep.waterCheckboxIsSelected();

    }
}

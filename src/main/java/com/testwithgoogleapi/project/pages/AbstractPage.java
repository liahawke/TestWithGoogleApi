package com.testwithgoogleapi.project.pages;

import com.testwithgoogleapi.project.base.BaseTest;
import org.openqa.selenium.support.PageFactory;

public abstract class AbstractPage {

    // Instances of BaseTest
    protected BaseTest testClass;

    /**
     * Constructor
     *
     * @param testClass
     */
    public AbstractPage(BaseTest testClass) {
        this.testClass = testClass;
        PageFactory.initElements(testClass.getDriver(), this);
    }
}

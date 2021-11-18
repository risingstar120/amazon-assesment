package com.assignment.driver.factory;

import com.assignment.config.factory.ConfigFactory;
import com.assignment.driver.enums.DriverType;
import org.openqa.selenium.WebDriver;

public final class DriverFactory {

    private DriverFactory(){}

    public static WebDriver getDriver(){
        WebDriver driver;
        if (ConfigFactory.getConfig().browser() == DriverType.EDGE) {
            driver = LocalDriverFactory.getDriver();
        } else {
            driver = RemoteDriverFactory.getDriver();
        }
        return driver;
    }

}

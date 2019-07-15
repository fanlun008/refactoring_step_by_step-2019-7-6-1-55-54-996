package com.tws.refactoring;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class refactoring {

    @Test
    public void should_return_false_when_driver_under_18(){
        Driver driver = new Driver(12);
        Police police = new Police();
        Assertions.assertFalse(police.checkDriver(driver));
    }
}

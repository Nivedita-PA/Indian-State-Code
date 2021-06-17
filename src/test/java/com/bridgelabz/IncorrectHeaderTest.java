package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class IncorrectHeaderTest {

    private static final String WRONG_HEADER_FILE_PATH_STATE_CODE = "./src/main/resources/Wrong_Header.csv";

    @Test
    public void given_StateCode_WrongHeader_File_Should_Return_Exception(){
        IndianStateCode5 indianStateCode5 = new IndianStateCode5();
        try {
            indianStateCode5.loadIndianStateCode5(WRONG_HEADER_FILE_PATH_STATE_CODE);
        } catch (StateCodeException e) {
            Assert.assertSame(StateCodeException.ExceptionType.INCORRECT_HEADER, e.type);
        }
    }
}

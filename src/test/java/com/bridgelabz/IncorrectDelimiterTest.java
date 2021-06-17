package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class IncorrectDelimiterTest {

    private static final String WRONG_DELIMITER_FILE_PATH_STATE_CODE = "./src/main/resources/Wrong_Delimiter.csv";

    @Test
    public void given_StateCode_WrongDelimiter_File_Should_Return_Exception(){
        IndianStateCode4 indianStateCode4 = new IndianStateCode4();
        try {
            indianStateCode4.loadIndianStateCode4(WRONG_DELIMITER_FILE_PATH_STATE_CODE);
        } catch (StateCodeException e) {
            Assert.assertSame(StateCodeException.ExceptionType.INCORRECT_DELIMITER, e.type);
        }
    }
}

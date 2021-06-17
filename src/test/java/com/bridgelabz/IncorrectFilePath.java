package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class IncorrectFilePath {

    private static final String WRONG_FILE_PATH_STATE_CODE = "./src/main/resources/IndiaStateCode.csv";

    @Test
    public void givenStateCode_CSV_File_Should_Return_Exception(){
        IndianStateCode indianStateCode = new IndianStateCode();
        try {
            indianStateCode.loadIndianStateCode(WRONG_FILE_PATH_STATE_CODE);
        } catch (StateCodeException e) {
            Assert.assertSame(StateCodeException.ExceptionType.FILE_TYPE_NULL, e.type);
        }
    }
}

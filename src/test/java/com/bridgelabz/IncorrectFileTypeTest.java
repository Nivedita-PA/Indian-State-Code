package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class IncorrectFileTypeTest {

    private static final String WRONG_FILE_TYPE_STATE_CODE = "./src/main/resources/Wrong_Type.txt";

    @Test
    public void given_StateCode_Txt_File_Returns_Exception(){
     IndianStateCode3 indianStateCode3 = new IndianStateCode3();

        try {
            indianStateCode3.loadIndianStateCode3(WRONG_FILE_TYPE_STATE_CODE);
        } catch (StateCodeException e) {
            Assert.assertSame(StateCodeException.ExceptionType.FILE_TYPE_PROBLEM, e.type);
        }
    }
}

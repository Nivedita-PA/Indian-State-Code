package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class CorrectFileTest {

    private static final String FILE_PATH_STATE_CODE = "./src/test/resources/IndiaStateCode.csv";

    @Test
    public void givenState_Code_CSV_File_Should_Return_Correct_Recs(){
        IndianStateCode indianStateCode = new IndianStateCode();
        try {
        int numOfRecs = indianStateCode.loadIndianStateCode(FILE_PATH_STATE_CODE);
        Assert.assertSame(37,numOfRecs);
        } catch (StateCodeException e) {
           e.printStackTrace();
        }
    }
}

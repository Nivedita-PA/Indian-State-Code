package com.bridgelabz;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.stream.StreamSupport;

public class IndianStateCode {

    public int loadIndianStateCode(String FILE_PATH) throws StateCodeException {
        try {
            Reader reader = Files.newBufferedReader(Paths.get(FILE_PATH));
            CsvToBean<IndianStateCodeCsv> csvToBean = new CsvToBeanBuilder(reader).withType(IndianStateCode.class)
                    .withIgnoreLeadingWhiteSpace(true).build();
            Iterator<IndianStateCodeCsv> codeCsvIterator = csvToBean.iterator();
            int numOfEntries = 0;
            Iterable<IndianStateCodeCsv> codeCsvIterable = () -> codeCsvIterator;
            numOfEntries = (int) StreamSupport.stream(codeCsvIterable.spliterator(), false).count();
            return numOfEntries;
        } catch (IllegalStateException | IOException ex) {
            throw new StateCodeException(ex.getMessage(), StateCodeException.ExceptionType.FILE_TYPE_NULL);
        }
    }
}

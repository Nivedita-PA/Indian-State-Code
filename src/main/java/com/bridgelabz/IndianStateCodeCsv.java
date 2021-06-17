package com.bridgelabz;

import com.opencsv.bean.CsvBindByName;

public class IndianStateCodeCsv {

  @CsvBindByName(column = "SrNo")
  public String srNo;


  @CsvBindByName(column = "State Name")
  public String stateName;


  @CsvBindByName(column = "TIN")
  public String tIn;


  @CsvBindByName(column = "StateCode")
  public String stateCode;

  @Override
  public String toString() {
    return "IndianStateCodeCsv{" +
            "srNo='" + srNo + '\'' +
            ", stateName='" + stateName + '\'' +
            ", tIn='" + tIn + '\'' +
            ", stateCode='" + stateCode + '\'' +
            '}';
  }

}

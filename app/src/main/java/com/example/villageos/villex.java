package com.example.villageos;

public class villex {

    String NAME,MOBILE,ADHARNO,VILLAGE,TALUKA,DISTRICT;

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public String getMOBILE() {
        return MOBILE;
    }

    public void setMOBILE(String MOBILE) {
        this.MOBILE = MOBILE;
    }

    public String getADHARNO() {
        return ADHARNO;
    }

    public void setADHARNO(String ADHARNO) {
        this.ADHARNO = ADHARNO;
    }

    public String getVILLAGE() {
        return VILLAGE;
    }

    public void setVILLAGE(String VILLAGE) {
        this.VILLAGE = VILLAGE;
    }

    public String getTALUKA() {
        return TALUKA;
    }

    public void setTALUKA(String TALUKA) {
        this.TALUKA = TALUKA;
    }

    public String getDISTRICT() {
        return DISTRICT;
    }

    public void setDISTRICT(String DISTRICT) {
        this.DISTRICT = DISTRICT;
    }

    public villex() {
    }

    public villex(String NAME, String MOBILE, String ADHARNO, String VILLAGE, String TALUKA, String DISTRICT) {
        this.NAME = NAME;
        this.MOBILE = MOBILE;
        this.ADHARNO = ADHARNO;
        this.VILLAGE = VILLAGE;
        this.TALUKA = TALUKA;
        this.DISTRICT = DISTRICT;
    }
}

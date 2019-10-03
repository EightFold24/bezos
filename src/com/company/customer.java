package com.company;

public class customer {
    private int custNo;
    private String fName,lName,addr,pCode,town,telNo,email;

    public customer(int newCustNo){
        setCustNo(newCustNo);
    }
    public customer(int newCustNo, String newFName){
        this(newCustNo);
        setfName(newFName);
    }
    public customer(int newCustNo, String newFName, String newLName){
        this(newCustNo,newFName);
        setlName(newLName);
    }
    public customer(int newCustNo, String newFName, String newLName, String newAddr){
        this(newCustNo,newFName, newLName);
        setAddr(newAddr);
    }

    public customer(int newCustNo, String newFName, String newLName, String newAddr, String newPCode){
        this(newCustNo,newFName, newLName, newAddr);
        setpCode(newPCode);
    }
    public customer(int newCustNo, String newFName, String newLName, String newAddr, String newPCode, String newTown){
        this(newCustNo,newFName, newLName, newAddr, newPCode);
        setTown(newTown);
    }
    public customer(int newCustNo, String newFName, String newLName, String newAddr, String newPCode, String newTown, String newTellNo){
        this(newCustNo,newFName, newLName, newAddr, newPCode, newTown);
        setTelNo(newTellNo);
    }
    public customer(int newCustNo, String newFName, String newLName, String newAddr, String newPCode, String newTown, String newTellNo, String newEmail){
        this(newCustNo,newFName, newLName, newAddr, newPCode, newTown, newTellNo);
        setEmail(newEmail);
    }

    public int getCustNo() {
        return custNo;
    }

    public void setCustNo(int custNo) {
        this.custNo = custNo;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getpCode() {
        return pCode;
    }

    public void setpCode(String pCode) {
        this.pCode = pCode;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getTelNo() {
        return telNo;
    }

    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString()
    {
        return String.format("Customer %d: %s %s. Address: %s, %s, %s. Email : %s. Phone no: %s",
                this.getCustNo(), this.getfName(), this.getlName(), this.getAddr(),this.getTown(),this.getpCode(), this.getEmail(), this.getTelNo());
    }
}

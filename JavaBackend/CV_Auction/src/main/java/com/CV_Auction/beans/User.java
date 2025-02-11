package com.CV_Auction.beans;


import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int uid;
    private String ufirstName;
    private String ulastName;
    private String uname;
    private String role;
    private String upwd;
    private String uemail;
    private String mobNo;
    private String panCard;
    public User() {}
    public User(int uid, String ufirstName, String ulastName, String uname, String role, String upwd, String uemail, String mobNo, String panCard, String address, String bankAccNo, String bankname, String bankBranch, String accountHolderName, String ifscCode, String accessStatus) {
        this.uid = uid;
        this.ufirstName = ufirstName;
        this.ulastName = ulastName;
        this.uname = uname;
        this.role = role;
        this.upwd = upwd;
        this.uemail = uemail;
        this.mobNo = mobNo;
        this.panCard = panCard;
        this.address = address;
        this.bankAccNo = bankAccNo;
        this.bankname = bankname;
        this.bankBranch = bankBranch;
        this.accountHolderName = accountHolderName;
        this.ifscCode = ifscCode;
        this.accessStatus = accessStatus;
    }




    public int getUid() {
        return uid;
    }
    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUfirstName() {
        return ufirstName;
    }

    public void setUfirstName(String ufirstName) {
        this.ufirstName = ufirstName;
    }

    public String getUlastName() {
        return ulastName;
    }

    public void setUlastName(String ulastName) {
        this.ulastName = ulastName;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getUpwd() {
        return upwd;
    }

    public void setUpwd(String upwd) {
        this.upwd = upwd;
    }

    public String getUemail() {
        return uemail;
    }

    public void setUemail(String uemail) {
        this.uemail = uemail;
    }

    public String getMobNo() {
        return mobNo;
    }

    public void setMobNo(String mobNo) {
        this.mobNo = mobNo;
    }

    public String getPanCard() {
        return panCard;
    }

    public void setPanCard(String panCard) {
        this.panCard = panCard;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBankAccNo() {
        return bankAccNo;
    }

    public void setBankAccNo(String bankAccNo) {
        this.bankAccNo = bankAccNo;
    }

    public String getBankname() {
        return bankname;
    }

    public void setBankname(String bankname) {
        this.bankname = bankname;
    }

    public String getBankBranch() {
        return bankBranch;
    }

    public void setBankBranch(String bankBranch) {
        this.bankBranch = bankBranch;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public String getIfscCode() {
        return ifscCode;
    }

    public void setIfscCode(String ifscCode) {
        this.ifscCode = ifscCode;
    }

    public String getAccessStatus() {
        return accessStatus;
    }

    public void setAccessStatus(String accessStatus) {
        this.accessStatus = accessStatus;
    }

    private String address;
    private String bankAccNo;
    private String bankname;
    private String bankBranch;
    private String accountHolderName;
    private String ifscCode;
    private String accessStatus;
}

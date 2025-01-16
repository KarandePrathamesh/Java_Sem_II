/**
 * @author PrathameshKarande
 * this class will holds the details of a bank account of an account holder
 */

public class BankAccount {

    private String accHolderName;
    private String address;
    private String userName;
    private String password;
    private int pinAcc;
    // private float balance = 0.0f;
    private double balance;

    public int getPinAcc(){
        return pinAcc;
    }
    public void setPinAcc(int pinAcc){
        this.pinAcc = pinAcc;
    }


    public double getBalance(){
        return pinAcc;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }



    public String getAccHolderName(){
        return accHolderName;
    }
    public void setAccHolderName(String accHolderName){
        this.accHolderName = accHolderName;
    }


    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }


    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password = password;
    }



    public String getUserName(){
        return userName;
    }
    public void setUserName(String userName){
        this.userName = userName;
    }

}
package bank;
class Account{
    public String name;
    private String password;

    public String getpassword(){
        return this.password;
    }
    public void setpassword(String pass){
        this.password = pass;
        System.out.println(this.password);
    }
}

public class Bank{
    public static void main(String[] args){
        Account a1 = new Account();
        a1.setpassword("abc");
        System.out.println(a1.getpassword());
    }
}
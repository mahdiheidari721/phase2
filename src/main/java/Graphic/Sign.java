package Graphic;

import java.util.ArrayList;

public class Sign {
    String password;
    String account;
    int Level;
    static public ArrayList<String> accounts=new ArrayList<String>();
    static   public ArrayList<String> passwords=new ArrayList<String>();
    static   public ArrayList<String> Levels=new ArrayList<String>();
    static  public ArrayList<Sign> Users=new ArrayList<>();
    public Sign(String password, String account ,int Level) {
        this.password = password;
        this.account = account;
        this.Level=Level;
    }

    static boolean HasAccount(String acount, String pass){
        int r=0;
        for(int i=0;i<accounts.size();i++){
            if(accounts.get(i).equals(acount)&&passwords.get(i).equals(pass)){
                r=1;
                Main.LEVEL=Integer.parseInt(Levels.get(i));
                return true;
            }
        }

        return  false;
    }
    static   public void SignUp(String acount,String pass,String Level){
        accounts.add(acount);
        passwords.add(pass);
        Levels.add(Level);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public int getLevel() {
        return Level;
    }

    public void setLevel(int level) {
        Level = level;
    }
}

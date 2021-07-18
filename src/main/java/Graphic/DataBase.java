package Graphic;

import java.lang.reflect.InvocationTargetException;
import java.sql.*;
import java.util.ArrayList;
import java.util.Properties;

public class DataBase {

 public   static void run() throws Exception {
        //      Connection con=getConnection();
        creatTable();
//        post();
        get();

    }
    public   static void write() throws Exception {
        //      Connection con=getConnection();
        creatTable();
        remove();
        post();


    }
    public static void get() throws Exception{
        try {
            Connection con=getConnection();
            PreparedStatement statement=con.prepareStatement("SELECT * FROM usernameANDpassword");
            ResultSet result=statement.executeQuery();
            ArrayList<String> array=new ArrayList<>();

            while(result.next()){
                System.out.println(result.getString("level"));
                System.out.println(result.getString("username"));
                System.out.println(result.getString("password"));
                Sign.passwords.add(result.getString("password"));
                Sign.accounts.add(result.getString("username"));
                Sign.Levels.add(result.getString("level"));
                System.out.println("have been selected");
            }

        }catch (Exception e){
            System.out.println(e);
        }
    }
    public static void post() throws Exception{
        String var1="mahdi12";
        String var2="heidari12";
        String var3="1";
//        try{
//            Connection con=getConnection();
//        }catch (Exception e){
//            System.out.println(e);
//        }
      if(Sign.accounts.size()>0){
          for(int i=0;i<Sign.accounts.size();i++){
              try{
                  Connection con=getConnection();
                  PreparedStatement posted=con.prepareStatement("INSERT INTO usernameANDpassword (username,password,level) VALUES ('"+Sign.accounts.get(i)+"','"+Sign.passwords.get(i)+"','"+Sign.Levels.get(i)+"')");
                  posted.executeUpdate();
              }
              catch (Exception e){
                  System.out.println(e);
              }
          }
      }

    }
    public static void creatTable() throws Exception{
        try{
            Connection con=getConnection();
            PreparedStatement create= con.prepareStatement("CREATE TABLE IF NOT EXISTS usernameANDpassword(id int NOT NULL AUTO_INCREMENT,username varchar(255),password varchar(255),level varchar(255),PRIMARY KEY(id))");
            create.executeUpdate();

        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("function has been completed");
        }
    }
    public static Connection getConnection()throws  Exception{
        Connection conn = null;
        Properties properties = new Properties(); //I use Properties to make things easer.
        properties.setProperty("user", "Mahdi");
        properties.setProperty("password", "721Mahdi");
        properties.setProperty("useSSL", "false"); //Set useSSL to false to solve the problem.

        try {
            Class.forName("com.mysql.cj.jdbc.Driver").getConstructor().newInstance();
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mh", properties);
            return  conn;
            // Do something with the Connection

        } catch (SQLException ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }










        //        try{
//            String driver="com.mysql.jdbc.Driver";
//            String url="jdbc:mysql://localhost:3306/mh";
//            String username="Mahdi";
//            String password="721Mahdi";
//           Class.forName(driver);
//            Connection conn= DriverManager.getConnection(url,username,password);
//            System.out.println("connected");
//            return conn;
//        }catch (Exception e){
//            System.out.println(e);
//        }
        return null;
    }
    public static void  remove() throws Exception {
        try{
            Connection conn=getConnection();
            Statement statement=conn.createStatement();
            statement.executeUpdate("TRUNCATE usernameANDpassword ");
            statement.executeUpdate("DELETE FROM usernameANDpassword ");
        }
        catch (Exception e){
            System.out.println(e);
        }

    }
}

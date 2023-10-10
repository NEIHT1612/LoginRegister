/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import static java.lang.System.out;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Account;


/**
 *
 * @author PC
 */
public class AccountDAO extends DBContext {

    public List<Account> lAccount() {
        List<Account> lAccount = new ArrayList<>();
        connection = getConnection();
        String sql = "select *\n"
                + "from Account";
        try {
            statement = connection.prepareStatement(sql);
            resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Account account = new Account();
                String userid = resultSet.getString("userid");
                String password = resultSet.getString("password");
                String displayname = resultSet.getString("displayname");
                account.setUserid(userid);
                account.setPassword(password);
                account.setDisplayname(displayname);
                lAccount.add(account);
            }
        } catch (SQLException ex) {
            System.out.println("Error " + ex.getMessage() + "at DBContext: lAccount");
            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lAccount;

    }

    public void register(String username, String password, String displayname) {   //boolean
        //Account account = checkLogin(username, password, "Register failed");
        //if (account != null) {
        //    return false;
        //}        
        connection = getConnection();
        String sql = "INSERT INTO [dbo].[Account]\n"
                + "           ([userid]\n"
                + "           ,[password]\n"
                + "           ,[displayname])\n"
                + "     VALUES\n"
                + "           (?, ?, ?)";
        try {
            statement = connection.prepareStatement(sql);
            statement.setString(1, username);
            statement.setString(2, password);
            statement.setString(3, displayname);
            statement.executeUpdate();
            //return true;
        } catch (SQLException ex) {
            System.out.println("Error " + ex.getMessage() + "at DBContext: lAccount");
            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, ex);
            //return false;
        }        
    }

    public Account checkLogin(String username, String password, String error) {
        connection = getConnection();
        String sql = "select *\n"
                + "from Account\n"
                + "where userid = ? and password = ?";
        try {
            statement = connection.prepareStatement(sql);
            statement.setString(1, username);
            statement.setString(2, password);
            resultSet = statement.executeQuery();
            while(resultSet.next()){
                Account account = new Account(resultSet.getString(1), resultSet.getString(2));
                return account;
            }
        } catch (SQLException ex) {
            System.out.println(error);
            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
        
//    public static void main(String[] args) {
//        AccountDAO adao = new AccountDAO();
//        Account a = adao.checkLogin("abcd", "abc", "blabla");
//        System.out.println(a);
//    }
}

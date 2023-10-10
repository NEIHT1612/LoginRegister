/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Thread;

/**
 *
 * @author PC
 */
public class ThreadDAO extends DBContext {

    public List<Thread> lThread() {
        List<Thread> lThread = new ArrayList<>();
        connection = getConnection();
        String sql = "select *\n"
                + "from Thread";
        try {
            statement = connection.prepareStatement(sql);
            resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Thread thre = new Thread();
                int tid = resultSet.getInt("tid");
                String thread = resultSet.getString("thread");
                thre.setTid(tid);
                thre.setThread(thread);
                lThread.add(thre);
            }
        } catch (SQLException ex) {
            System.out.println("Error " + ex.getMessage() + "at DBContext: lThread");
            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lThread;

    }

    public static void main(String[] args) {
        ThreadDAO tdao = new ThreadDAO();
        for (Thread thread : tdao.lThread()) {
            System.out.println(thread);
        }
    }
}

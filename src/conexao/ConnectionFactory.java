
package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class  ConnectionFactory {
    
    
    private static final String DRIVER = "org.postgresql.Driver";
    private static final String URL    = "jdbc:postgresql://localhost:5432/enterprise";
    private static final String USER   = "postgres";
    private static final String PASS   = "admin";
   
    public static Connection getConnection() {        
        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USER, PASS);
           
        } catch (ClassNotFoundException | SQLException ex) {
           
            throw new RuntimeException("ERRO NA CONEXÃO... "+ ex );
        }
             
    }                 
    
              
    
    public static void closeConnection(Connection con){
        
        if(con != null){
            try {
                con.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao Conectar com o Banco - con " + ex);
            }
        }
    }
    
    public static void closeConnection(Connection con, PreparedStatement stmt){
        
        closeConnection(con);
        
        if(stmt != null){
            try {
                stmt.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao Conectar com o Banco - stmt "+ ex);
            }
        }
        
    }
    
    public static void closeConnection(Connection con, PreparedStatement stmt, ResultSet rs){
        
        closeConnection(con, stmt);
        
        if(rs != null){
            try {
                rs.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao Conectar com o Banco - rs" + ex);
            }
        }
        
    }

}

    


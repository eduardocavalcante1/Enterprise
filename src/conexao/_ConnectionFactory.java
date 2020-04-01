
package conexao;
import java.sql.*;
import javax.swing.JOptionPane;


public class _ConnectionFactory {
    
    
        
    private static final String DRIVER = "org.postgresql.Driver";
    private static final String URL    = "jdbc:postgresql://localhost:5432/enterprise";
    private static final String USER   = "postgres";
    private static final String PASS   = "admin";
   
    public static Connection conexaoDb() { //throws ClassNotFoundException {
        
        try {

            Class.forName(DRIVER);
            Connection con = DriverManager.getConnection(URL, USER, PASS);
           // JOptionPane.showMessageDialog(null, "Conectado com Sucesso..." );
            return con;

        } catch (ClassNotFoundException | SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "ERRO NA CONEXÃO... " );
            //throw new RuntimeException("Erro na Conexão com o Banco", ex);
            System.exit(0); 
            
        }
             
          return null;                  
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
        if(stmt != null){
            try {
                stmt.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao Conectar com o Banco - stmt "+ ex);
            }
        }
        closeConnection(con);
    }
    
    public static void closeConnection(Connection con, PreparedStatement stmt, ResultSet rs){
        if(rs != null){
            try {
                rs.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao Conectar com o Banco - rs" + ex);
            }
        }
        closeConnection(con, stmt);
    }

}

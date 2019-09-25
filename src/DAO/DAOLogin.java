package DAO;

import conexoes.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DAOLogin {
    //Método que valida o login
    public boolean checkLogin(String nome, String senha) {
        //Abre uma conexão com o BD
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        boolean check = false;

        try {
            //Variável que diz quais registros serão verificados
            stmt = con.prepareStatement("SELECT * FROM usuarios WHERE nome = ? and senha = ?");
            //Variáveis que diz quais dados serão verificados
            stmt.setString(1, nome);
            stmt.setString(2, senha);
            //Executa o comando no CMD MySQL
            rs = stmt.executeQuery();
            //Retorna o resultado
            if (rs.next()) {                
                check = true;
            }
        //Fecha conexão
        } catch (SQLException ex) {
            Logger.getLogger(DAOLogin.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return check;

    }

}
package DAO;

import conexoes.ConexaoMySql;
import conexoes.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Paciente;

public class DAOPaciente {
    //Salvar paciente no BD
    public int salvarDAO(Paciente pPaciente) {

        ConexaoMySql conexao = new ConexaoMySql();

        try {
            conexao.conectar();
            //Variável que joga os dados no CMD do MySQL
            String sql
                    = "INSERT INTO pacientes (nome, sus, tipo, endereco, fone, datanasc) VALUES (" 
                    + "'" + pPaciente.getNome() + "', "
                    + "'" + pPaciente.getSus() + "', "
                    + "'" + pPaciente.getTipo() + "', "
                    + "'" + pPaciente.getEndereco() + "', "
                    + "'" + pPaciente.getFone() + "', "
                    + "'" + pPaciente.getDatanasc() + "'"
                    + ");";

            return conexao.insertSQL(sql);
            //Fecha conexão
        } catch (Exception e) {
            return 0;
        } finally {
            conexao.fecharConexao();
        }
    }
    //Método que mpega os dados do paciente pelo numero do Sus
    public Paciente getPacienteDAOSus(int pSusPaciente, String pTipoPaciente) {
        Paciente paciente = new Paciente();
        ConexaoMySql conexao = new ConexaoMySql();

        try {
            conexao.conectar();
            //Variável que joga os dados no CMD do MySQL
            String sql
                    = "SELECT nome, sus, endereco, fone, datanasc "
                    + "FROM pacientes WHERE sus = '" + pSusPaciente + "' AND "
                    + "tipo = '" + pTipoPaciente + "'"
                    + ";";
            
            conexao.executarSQL(sql);
            
            
            while (conexao.getResultSet().next()) {
                paciente.setNome(conexao.getResultSet().getString("nome"));
                paciente.setSus(conexao.getResultSet().getInt("sus"));
                paciente.setEndereco(conexao.getResultSet().getString("endereco"));
                paciente.setFone(conexao.getResultSet().getString("fone"));
                paciente.setDatanasc(conexao.getResultSet().getString("datanasc"));
            }
            //Fecha a conexão com BD
        } catch (SQLException e) {
        } finally {
            conexao.fecharConexao();
        }
        //Retorna o resultado
        return paciente;

    }
    //Método que mpega os dados do paciente pelo numero do Nome
    public Paciente getPacienteDAONome(String pNomePaciente, String pTipo) {
        Paciente paciente = new Paciente();
        ConexaoMySql conexao = new ConexaoMySql();

        try {
            conexao.conectar();
            //Variável que joga os dados no CMD do MySQL
            String sql
                    = "SELECT nome, sus, endereco, fone, datanasc "
                    + "FROM pacientes WHERE nome = '" + pNomePaciente + "' AND "
                    + "tipo = '" + pTipo + "'"
                    + ";";
            
            conexao.executarSQL(sql);

            while (conexao.getResultSet().next()) {
                paciente.setNome(conexao.getResultSet().getString("nome"));
                paciente.setSus(conexao.getResultSet().getInt("sus"));
                paciente.setEndereco(conexao.getResultSet().getString("endereco"));
                paciente.setFone(conexao.getResultSet().getString("fone"));
                paciente.setDatanasc(conexao.getResultSet().getString("datanasc"));
            }
            //Fecha a conexão com BD
        } catch (SQLException e) {
        } finally {
            conexao.fecharConexao();
        }
        //Retorna o resultado
        return paciente;

    }
    //Método que exclui os dados do paciente    
    public boolean excluirDAO(int pSusPaciente, String pTipo){
        
        ConexaoMySql conexao = new ConexaoMySql();
        
        try{
            conexao.conectar();
            //Variável que joga o comando no CMD do MySQL            
            String sql = 
                    "DELETE FROM pacientes WHERE sus = '" + pSusPaciente + "' AND "
                    +"tipo = '"+ pTipo +"';";
            
            conexao.executarUpdateDeleteSQL(sql);
            
            return true;
        //Fecha a conexão como BD             
        }catch(Exception e){
            return false;
        }finally{
            conexao.fecharConexao();
        }
        
    }
    //Método que atualiza os Dados do paciente    
    public boolean updateDAO(Paciente pPaciente){
        ConexaoMySql conexao = new ConexaoMySql();
        
        try{
            conexao.conectar();
            //Variável que o comando no CMD do MySQL            
            String sql = 
                    "UPDATE pacientes SET "
                    + " nome = '" + pPaciente.getNome() + "',"
                    + " endereco = '" + pPaciente.getEndereco() + "',"
                    + " fone = '" + pPaciente.getFone() + "',"
                    + " datanasc = '" + pPaciente.getDatanasc() + "' "
                    + "WHERE sus = '" + pPaciente.getSus() + "' AND "
                    + "tipo = '" + pPaciente.getTipo() + "';";
            
            conexao.executarUpdateDeleteSQL(sql);
            
            return true;
        //Fecha conexão               
        }catch(Exception e){
            return false;
        }finally{
            conexao.fecharConexao();
        }      
    }
    //Método que atualiza as anotações do paciente    
    public boolean updateAnoDAO(Paciente pPaciente){
        ConexaoMySql conexao = new ConexaoMySql();
        
        try{
            conexao.conectar();
            //Variável que joga o comando no CMD do MySQL            
            String sql = 
                    "UPDATE pacientes SET "
                    + " anotacoes = '" + pPaciente.getAnotacoes()+ "' "
                    + "WHERE sus = '"+ pPaciente.getSus() +"' AND "
                    + "tipo = '" + pPaciente.getTipo() + "';";
            
            conexao.executarUpdateDeleteSQL(sql);
            
            return true;
        //Fecha a conexão              
        }catch(Exception e){
            return false;
        }finally{
            conexao.fecharConexao();
        }
        
    }
    //Método que pega as anotações do paciente    
    public Paciente getAnotacoesDAO(int pSusPaciente, String pTipo) {
        Paciente paciente = new Paciente();
        ConexaoMySql conexao = new ConexaoMySql();

        try {
            conexao.conectar();
            //Variável que joga o comando no CMD do MySQL
            String sql
                    = "SELECT anotacoes "
                    + "FROM pacientes WHERE sus = '" + pSusPaciente + "' AND "
                    + "tipo = '" + pTipo + "';";
            
            conexao.executarSQL(sql);

            while (conexao.getResultSet().next()) {
                paciente.setAnotacoes(conexao.getResultSet().getString("anotacoes"));
            }
         //Fecha a conexão
        } catch (SQLException e) {
        } finally {
            conexao.fecharConexao();
        }
        //Retorna o resultado
        return paciente;
}
    //Método que atualiza a situaçao do paciente    
    public boolean updateSitDAO(Paciente pPaciente){
        ConexaoMySql conexao = new ConexaoMySql();
        
        try{
            conexao.conectar();
            //Variável que joga o comando no CMD do MySQL            
            String sql = 
                    "UPDATE pacientes SET "
                    + "situacao = '" + pPaciente.getSituacao()+ "' "
                    + "WHERE sus = '" + pPaciente.getSus()+ "' AND "
                    + "tipo = '" + pPaciente.getTipo() + "';";
            
            conexao.executarUpdateDeleteSQL(sql);
            
            return true;
        //Fecha a conexão              
        }catch(Exception e){
            return false;
        }finally{
            conexao.fecharConexao();
        }
        
    }
    //Método que pega a situaçao do paciente    
    public Paciente getSitDAO(int pSusPaciente, String pTipo) {
        Paciente paciente = new Paciente();
        ConexaoMySql conexao = new ConexaoMySql();

        try {
            conexao.conectar();
            //Variável que joga o comando no CMD do MySQL
            String sql
                    = "SELECT situacao "
                    + "FROM pacientes WHERE sus = '" + pSusPaciente + "' AND "
                    + "tipo = '" + pTipo + "';";
            
            conexao.executarSQL(sql);

            while (conexao.getResultSet().next()) {
                paciente.setSituacao(conexao.getResultSet().getString("situacao"));
            }
         //Fecha a conexão
        } catch (SQLException e) {
        } finally {
            conexao.fecharConexao();
        }
        //Retorna o resultado
        return paciente;      
}
    //Cria uma váriavel vazia para o nome, a ser pesquisar
    String pnome = null;
    String ptipo = null;
    //Getter e Setter
    public String getPnome() {
        return pnome;
    }

    public void setPnome(String pnome) {
        this.pnome = pnome;
    }

    public String getPtipo() {
        return ptipo;
    }

    public void setPtipo(String ptipo) {
        this.ptipo = ptipo;
    }
    //Conexão com BD
    Connection con;
    //Abre a conexão
    public DAOPaciente() {
        con = ConnectionFactory.getConnection();
    }
    //Método que cria uma Lista
    public List<Paciente> read() {
        //Variáveis para o BD     
        PreparedStatement stmt = null;
        ResultSet rs = null;
        //Conexão entre a lista e a classe Paciente
        List<Paciente> pacientes = new ArrayList<>();

        try {
            //Passa o comando para o CMD MySQL
            stmt = con.prepareStatement("SELECT * FROM pacientes WHERE nome like '%" + pnome + "%' "
                    +"AND tipo like '%" + ptipo + "%'");
            rs = stmt.executeQuery();
            //Cria um laço de repetição para adicionar os registros
            while (rs.next()) {
                //Chama um nova Paciente
                Paciente paciente = new Paciente();
                //Modifica os dados
                paciente.setNome(rs.getString("nome"));
                paciente.setSus(rs.getInt("sus"));
                //Adiciona a Lista
                pacientes.add(paciente);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOPaciente.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return pacientes;
    }
}
package controler;

import DAO.DAOPaciente;
import model.Paciente;
//Método ControlerPaciente
public class CtrlPaciente {
    //Salvar Dados
    public int salvarCtrl(Paciente pPaciente){
        return new DAOPaciente().salvarDAO(pPaciente);
    }
    //Mostrar dados usando o SUS
    public Paciente getCtrlSus(int pPsus, String pPtipo){
        return new DAOPaciente().getPacienteDAOSus(pPsus, pPtipo);
    }
    //Mostrar dados usando o NOME
    public Paciente getCtrlNome(String pPnome, String pPtipo){
        return new DAOPaciente().getPacienteDAONome(pPnome, pPtipo);
    }
    //Excluir Dados
    public boolean excluirCtrl(int pSusPaciente, String pTipo){
        return new DAOPaciente().excluirDAO(pSusPaciente, pTipo);
    }
    //atualizar Dados
    public boolean updateCtrl(Paciente pPaciente){
        return new DAOPaciente().updateDAO(pPaciente);
    }
    //Atualizar Anotações
    public boolean updateCtrlAno(Paciente pPaciente){
        return new DAOPaciente().updateAnoDAO(pPaciente);
    }
    //Mostrar Anotações
    public Paciente getCtrlAno(int pPsus, String pPtipo){
        return new DAOPaciente().getAnotacoesDAO(pPsus, pPtipo);
    } 
    //Atualizar Situação
    public boolean updateCtrlSit(Paciente pPaciente){
        return new DAOPaciente().updateSitDAO(pPaciente);
    }
    //Mostrar Situação
    public Paciente getCtrlSit(int pPsus, String pTipo){
        return new DAOPaciente().getSitDAO(pPsus, pTipo);
    } 
}
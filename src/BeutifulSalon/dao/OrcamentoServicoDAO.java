/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BeutifulSalon.dao;

import BeutifulSalon.Ferramentas.ManipulaData;
import BeutifulSalon.model.Orcamento;
import BeutifulSalon.model.OrcamentoServico;
import BeutifulSalon.model.Servico;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Mateus
 */
public class OrcamentoServicoDAO {
     public void cadastrarOrcamentoServico(OrcamentoServico orcamento) {
        
        String sqlScript = "INSERT INTO ORCAMENTOSERVICO (NOMESERV, JANEIRO, FEVEREIRO, MARCO, ABRIL,"+ 
               "MAIO, JUNHO, JULHO, AGOSTO, SETEMBRO, OUTUBRO, NOVEMBRO, DEZEMBRO, PREVISTO, ANO, ID_SERVICO)"+
               "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
               
                    
        PreparedStatement pStatement = null;
        Connection connection = null;
        
        try {
            
            connection = new ConnectionMVC().getConnection();
            
            pStatement = connection.prepareStatement(sqlScript);
            pStatement.setString(1, orcamento.getNome());
            pStatement.setLong(2, orcamento.getJan());
            pStatement.setLong(3, orcamento.getFev());
            pStatement.setLong(4, orcamento.getMar());
            pStatement.setLong(5, orcamento.getAbr());
            pStatement.setLong(6, orcamento.getMai());
            pStatement.setLong(7, orcamento.getJun());
            pStatement.setLong(8, orcamento.getJul());
            pStatement.setLong(9, orcamento.getAgo());
            pStatement.setLong(10, orcamento.getSet());
            pStatement.setLong(11, orcamento.getOut());
            pStatement.setLong(12, orcamento.getNov());
            pStatement.setLong(13, orcamento.getDez());
            pStatement.setBoolean(14, orcamento.isPrevisto());// TRUE quando eh orçamento PREVISTO
            pStatement.setString(15, orcamento.getAno());
            pStatement.setLong(16, orcamento.getId_servico());
            pStatement.execute(); 
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Erro ao cadastrar orçamento no banco" + e);
        }finally{
            
            try {
                if(pStatement != null) pStatement.close();

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null,"Erro ao fechar statement" + e);
            }
            
            try {
                if(connection != null) connection.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null,"Erro ao fechar conexão" + e);
            }
           
        }

    }

    public ArrayList<OrcamentoServico> listarOrcamentoServico() {
        String sql  = "SELECT ID_ORCAMENTO, NOMESERV,JANEIRO,FEVEREIRO,MARCO,ABRIL,MAIO,JUNHO,JULHO,AGOSTO,SETEMBRO,OUTUBRO,"
                + "NOVEMBRO,DEZEMBRO,ID_SERVICO FROM ORCAMENTOSERVICO WHERE ANO = ?";
        
        Connection connection = null;
        PreparedStatement pStatement = null;
        ArrayList<OrcamentoServico> orcamentos =  null;
        
        try{
            connection = new ConnectionMVC().getConnection();
            pStatement = connection.prepareStatement(sql);
            
        
            pStatement.setString(1, String.valueOf(LocalDate.now().getYear()));//RETORNA o ANO atual do SISTEMA
            ResultSet rs = pStatement.executeQuery();
           
            
            if(rs != null){
                orcamentos = new ArrayList<>();
                
                while(rs.next()){
                    OrcamentoServico orcamentoAtual = new OrcamentoServico();
                    orcamentoAtual.setId_orcamento(rs.getInt("ID_ORCAMENTO"));
                    orcamentoAtual.setNome(rs.getString("NOMESERV"));
                    orcamentoAtual.setJan(rs.getLong("JANEIRO"));
                    orcamentoAtual.setFev(rs.getLong("FEVEREIRO"));
                    orcamentoAtual.setMar(rs.getLong("MARCO"));
                    orcamentoAtual.setAbr(rs.getLong("ABRIL"));
                    orcamentoAtual.setMai(rs.getLong("MAIO"));
                    orcamentoAtual.setJun(rs.getLong("JUNHO"));
                    orcamentoAtual.setJul(rs.getLong("JULHO"));
                    orcamentoAtual.setAgo(rs.getLong("AGOSTO"));
                    orcamentoAtual.setSet(rs.getLong("SETEMBRO"));
                    orcamentoAtual.setOut(rs.getLong("OUTUBRO"));
                    orcamentoAtual.setNov(rs.getLong("NOVEMBRO"));
                    orcamentoAtual.setDez(rs.getLong("DEZEMBRO")); 
                    orcamentoAtual.setId_servico(rs.getLong("ID_SERVICO"));
       
                    orcamentos.add(orcamentoAtual);
                }
                
            }
         
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ConnectionMVC: " + e);
        }finally{
            
            try {
                if(pStatement != null) pStatement.close();

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null,"Erro ao fechar statement" + e);
            }
            
            try {
                if(connection != null) connection.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null,"Erro ao fechar conexão" + e);
            }
            
        }
        
        return orcamentos;
    }
    
    public ArrayList<OrcamentoServico> listarOrcamentoServico(String ano) {
        String sql  = "SELECT ID_ORCAMENTO, NOMESERV,JANEIRO,FEVEREIRO,MARCO,ABRIL,MAIO,JUNHO,JULHO,AGOSTO,SETEMBRO,OUTUBRO,"
                + "NOVEMBRO,DEZEMBRO,ID_SERVICO FROM ORCAMENTOSERVICO WHERE ANO = ?";
        
        Connection connection = null;
        PreparedStatement pStatement = null;
        ArrayList<OrcamentoServico> orcamentos =  null;
        
        try{
            connection = new ConnectionMVC().getConnection();
            pStatement = connection.prepareStatement(sql);
            
           
            
            pStatement.setString(1, ano);//RETORNA o ANO atual do SISTEMA
            ResultSet rs = pStatement.executeQuery();
           
            
            if(rs != null){
                orcamentos = new ArrayList<>();
                
                while(rs.next()){
                    OrcamentoServico orcamentoAtual = new OrcamentoServico();
                    orcamentoAtual.setId_orcamento(rs.getInt("ID_ORCAMENTO"));
                    orcamentoAtual.setNome(rs.getString("NOMESERV"));
                    orcamentoAtual.setJan(rs.getLong("JANEIRO"));
                    orcamentoAtual.setFev(rs.getLong("FEVEREIRO"));
                    orcamentoAtual.setMar(rs.getLong("MARCO"));
                    orcamentoAtual.setAbr(rs.getLong("ABRIL"));
                    orcamentoAtual.setMai(rs.getLong("MAIO"));
                    orcamentoAtual.setJun(rs.getLong("JUNHO"));
                    orcamentoAtual.setJul(rs.getLong("JULHO"));
                    orcamentoAtual.setAgo(rs.getLong("AGOSTO"));
                    orcamentoAtual.setSet(rs.getLong("SETEMBRO"));
                    orcamentoAtual.setOut(rs.getLong("OUTUBRO"));
                    orcamentoAtual.setNov(rs.getLong("NOVEMBRO"));
                    orcamentoAtual.setDez(rs.getLong("DEZEMBRO")); 
                    orcamentoAtual.setId_servico(rs.getLong("ID_SERVICO"));
       
                    orcamentos.add(orcamentoAtual);
                }
                
            }
         
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ConnectionMVC: " + e);
        }finally{
            
            try {
                if(pStatement != null) pStatement.close();

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null,"Erro ao fechar statement" + e);
            }
            
            try {
                if(connection != null) connection.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null,"Erro ao fechar conexão" + e);
            }
            
        }
        
        return orcamentos;
    }
    
    public long somaTotalGanhoServicoMensal(long inicio, long fim, long idServico){
        
        String sql = "SELECT SUM(SERVICO.PRECO) AS SOMA FROM ((AGENDAMENTO INNER JOIN AGENDAMENTO_SERVICO ON AGENDAMENTO.ID_AGENDAMENTO = AGENDAMENTO_SERVICO.ID_AGENDAMENTO "
        +" AND AGENDAMENTO_SERVICO.ID_SERVICO = "+ idServico + ")" 
        +" INNER JOIN SERVICO ON SERVICO.ID_SERVICO = "+ idServico +")" 
        +" WHERE AGENDAMENTO.DATA BETWEEN "+ inicio + " AND " + fim;
                
        Connection connection = null;
        PreparedStatement pStatement = null;
       
        try{
            connection = new ConnectionMVC().getConnection();
            pStatement = connection.prepareStatement(sql);
            long soma = 0;
            
            ResultSet rs = pStatement.executeQuery();
                       
            if(rs != null){
                while(rs.next()){               
                   soma += rs.getLong("SOMA");
                   
                }
                
            }
            
            return soma;
         
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ConnectionMVC: " + e);
        }finally{
            
            try {
                if(pStatement != null) pStatement.close();

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null,"Erro ao fechar statement" + e);
            }
            
            try {
                if(connection != null) connection.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null,"Erro ao fechar conexão" + e);
            }
            
        }
        
        return 0;
    }
    
      public Servico listarOrcamentoServicorRealizado(LocalDate ano, Month mes, long idServico) {
       
        String sqlString = "SELECT SERVICO.NOME,SERVICO.ID_SERVICO, COUNT(AGENDAMENTO_SERVICO.ID_SERVICO) AS QUANTIDADE FROM AGENDAMENTO" +
                " INNER JOIN AGENDAMENTO_SERVICO" +
                " ON AGENDAMENTO.ID_AGENDAMENTO = AGENDAMENTO_SERVICO.ID_AGENDAMENTO" +
                " INNER JOIN SERVICO " +
                " ON SERVICO.ID_SERVICO = AGENDAMENTO_SERVICO.ID_SERVICO" +
                " WHERE AGENDAMENTO.DATA BETWEEN ? AND ? AND SERVICO.ID_SERVICO = ?";
              
        Connection connection = null;
        PreparedStatement pStatement = null;
        Servico orcamento = null;
        
        long inicio, fim;
        
        try{
            connection = new ConnectionMVC().getConnection();
            pStatement = connection.prepareStatement(sqlString);
            
            inicio = new ManipulaData().inicioDoMes(ano, mes);
            fim = new ManipulaData().fimDoMes(ano, mes);
            
            pStatement.setLong(1, inicio);// Inicio do mes
            pStatement.setLong(2, fim);
            pStatement.setLong(3, idServico);
            
            ResultSet rs = pStatement.executeQuery();
           
            
            if(rs != null){
                orcamento = new Servico();
                
                while(rs.next()){
                   
                    orcamento.setId(rs.getLong("ID_SERVICO"));
                    orcamento.setNome(rs.getString("NOME"));
                    orcamento.setQuantidadeMensal(rs.getLong("QUANTIDADE"));                 
                }
                
            }
            
            return orcamento;
         
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ConnectionMVC: " + e);
        }finally{
            
            try {
                if(pStatement != null) pStatement.close();

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null,"Erro ao fechar statement" + e);
            }
            
            try {
                if(connection != null) connection.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null,"Erro ao fechar conexão" + e);
            }
            
        }     
        return orcamento;
    }
}

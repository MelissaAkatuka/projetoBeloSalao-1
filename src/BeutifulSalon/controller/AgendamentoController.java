/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BeutifulSalon.controller;

import BeutifulSalon.Ferramentas.ManipulaData;
import BeutifulSalon.Ferramentas.Valida;
import BeutifulSalon.dao.AgendamentoDAO;
import BeutifulSalon.dao.ExceptionDAO;
import BeutifulSalon.model.Agendamento;
import BeutifulSalon.model.Servico;
import BeutifulSalon.view.Edicao.EditarAgendamento;
import java.sql.SQLException;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author mateus
 */
public class AgendamentoController {

    public boolean cadastraAgendamento(String data, String horario, long idCliente, ArrayList<Servico> servicos, long total, long desconto, boolean realizado) throws ExceptionDAO {

        if (Valida.isHora(horario) && !servicos.isEmpty()) {

            //Formatadores
            DateTimeFormatter formatterData = DateTimeFormatter.ofPattern("dd/M/uuuu");
            DateTimeFormatter formatterHora = DateTimeFormatter.ofPattern("HH:mm");
            //Horario
            LocalTime h = null;
            LocalDate dataAgendamento = null;

            try {
                h = LocalTime.parse(horario, formatterHora);
                dataAgendamento = LocalDate.parse(data, formatterData);
            } catch (DateTimeException e) {
                JOptionPane.showMessageDialog(null, "Erro ao convertar datas " + e);
                return false;
            }
                
                LocalTime fimAgendamento = h;
                int horas = 0;
                int minutos = 0;
                
                for (Servico s : servicos) {
                    Servico sAtual = new ServicoController().buscarServico(s.getId());
                    horas += sAtual.getTempoGasto().getHour();
                    minutos += sAtual.getTempoGasto().getMinute();
                }
                fimAgendamento = fimAgendamento.plusHours(horas);
                fimAgendamento = fimAgendamento.plusMinutes(minutos);
             
            
            if(!new ManipulaData().validaHorarioAgendamento(h, fimAgendamento, dataAgendamento)){
                JOptionPane.showMessageDialog(null, "Horário não disponível");
                return false;
            }
            
            //Passando parametros

            Agendamento agendamento = new Agendamento();

            agendamento.setTotal(total);
            agendamento.setDesconto(desconto);
            agendamento.setIdCliente(idCliente);
            agendamento.setData(dataAgendamento);
            agendamento.setHorario(h);
            agendamento.setServicos(servicos);
            agendamento.setRealizado(realizado);

            try {
                agendamento.cadastraAgendamento(agendamento);
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "AgendamentoController" + e);
                return false;
            }

        } else {
            return false;
        }

        return true;
    }

    public boolean atualizarAgendamento(String data, String horario,long idCliente, ArrayList<Servico> servicos, long total, long desconto, boolean realizado, long idAgendamento) throws ExceptionDAO {

        if (Valida.isHora(horario) && !servicos.isEmpty()) {

            //Formatadores
            DateTimeFormatter formatterData = DateTimeFormatter.ofPattern("dd/M/uuuu");
            DateTimeFormatter formatterHora = DateTimeFormatter.ofPattern("HH:mm");
            //Horario
            LocalTime h = null;
            LocalDate dataAgendamento = null;

            try {
                h = LocalTime.parse(horario, formatterHora);
                dataAgendamento = LocalDate.parse(data, formatterData);
            } catch (DateTimeException e) {
                JOptionPane.showMessageDialog(null, "Erro ao convertar datas " + e);
                return false;
            }
            //Passando parametros

            Agendamento agendamento = new Agendamento();
            agendamento.setIdAgendamento(idAgendamento);
            agendamento.setTotal(total);
            agendamento.setDesconto(desconto);
            agendamento.setIdCliente(idCliente);
            agendamento.setData(dataAgendamento);
            agendamento.setHorario(h);
            agendamento.setServicos(servicos);
            agendamento.setRealizado(realizado);

            try {
                agendamento.atualizarAgendamento(agendamento);
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "AgendamentoController" + e);
                return false;
            }

        } else {
            return false;
        }

        return true;
    }

    public boolean editarAgendamento(long idAgendamento) {

        try {

            Agendamento ag = listarAgendamento(idAgendamento);

            if (ag != null) {
                new EditarAgendamento(ag).setVisible(true);
            } else {
                return false;
            }

        } catch (ExceptionDAO e) {
            JOptionPane.showMessageDialog(null, "Erro ao criar objeto agendamento" + e);
        }
        return true;
    }

    public Agendamento listarAgendamento(long idAgendamento) throws ExceptionDAO {
        return new Agendamento().listarAgendamento(idAgendamento);
    }

    public ArrayList<Servico> listarServicosAgendamento(long idAgendamento) {
        try {
             return new Agendamento().listarServicosAgendamento(idAgendamento);
        } catch (ExceptionDAO e) {
            System.out.println("Erro ao listar serviços do agendamento");
        }
       return null;
    }

    public ArrayList<Agendamento> listarAgendamentos() {
        try {
            return new Agendamento().listarAgendamentos();
        } catch (ExceptionDAO e) {
        }
        return null;
    }

    public ArrayList<Agendamento> listarAgendamentos(LocalDate data) throws ExceptionDAO {
        return new Agendamento().listarAgendamentos(data);
    }

    public ArrayList<Agendamento> listarAgendamentosRealizados(LocalDate data) {

        return new AgendamentoDAO().listarAgendamentosRealizados(data);
    }

    public ArrayList<Agendamento> listarAgendamentosHoje() {
        try {
            return new Agendamento().listarAgendamentosHoje();
        } catch (ExceptionDAO e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }

    public ArrayList<Agendamento> listarAgendamentosAmanha() {
        try {
            return new Agendamento().listarAgendamentosAmanha();
        } catch (ExceptionDAO e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }

    public ArrayList<Agendamento> listarAgendamentosSemana() {
        try {
            return new Agendamento().listarAgendamentosSemana();
        } catch (ExceptionDAO e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }

    public ArrayList<Agendamento> listarAgendamentosNome(String nome) {
        try {
            return new Agendamento().listarAgendamentosNome(nome);
        } catch (ExceptionDAO e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }

    public ArrayList<Agendamento> listarAgendamentosNaoRealizados() {
        try {
            return new Agendamento().listarAgendamentosNaoRealizados();
        } catch (ExceptionDAO e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }
    
     public long retornaSomaDeAgendamentosMensal(){
         try {
            return new Agendamento().retornaSomaDeAgendamentosMensal(); 
         } catch (ExceptionDAO e) {
            System.out.println("erro ao retornar soma mensal de agemdamentos");
         }
         return 0L;
     }

}

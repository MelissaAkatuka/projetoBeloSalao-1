/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BeutifulSalon.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import BeutifulSalon.model.Compra;
import BeutifulSalon.model.ItemCompra;

/**
 *
 * @author mateus
 */
public class CompraProdutoDAO {

    public void cadastraCompra(Compra compra) throws SQLException {

        String insertCompra = "INSERT INTO COMPRA (DATA, VALORTOTAL, VALORDESCONTO, CPF_CLIENTE)"
                + "VALUES (?, ?, ? , ?)";

        String insertItemCompra = "INSERT INTO ITEM_COMPRA (PRECOUNITARIO, QUANTIDADE, PRECOTOTAL, ID_PRODUTO, ID_COMPRA)"
                + "VALUES (?,?,?,?,(SELECT ID_COMPRA  FROM COMPRA ORDER BY ID_COMPRA DESC LIMIT 1))";

        Connection connection = null;
        PreparedStatement pStatement = null;

        try {

            connection = new ConnectionMVC().getConnection();
            connection.setAutoCommit(false);

            pStatement = connection.prepareStatement(insertCompra);
            pStatement.setDate(1, new Date(compra.getData().getTime()));
            pStatement.setLong(2, compra.getValorTotal());
            pStatement.setLong(3, compra.getValorDesconto());
            pStatement.setString(4, compra.getCpfCliente());

            int firstInsert = pStatement.executeUpdate();

            if (firstInsert > 0) {
                try {

                    ArrayList<ItemCompra> itens = compra.getItensCompra();

                    for (ItemCompra it : itens) {
                        pStatement = connection.prepareStatement(insertItemCompra);
                        pStatement.setLong(1, it.getPreco());
                        pStatement.setInt(2, it.getQuantidade());
                        pStatement.setLong(3, it.getPrecoTotal());
                        pStatement.setLong(4, it.getId_produto());
                        pStatement.executeUpdate();
                    }

                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "Erro registrar itemCompra" + e);
                    connection.rollback();
                }
            }

            connection.commit();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro DAO" + e);
            connection.rollback();

        } finally {

            try {
                if (pStatement != null) {
                    pStatement.close();
                }

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar statement" + e);
            }

            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar conexão" + e);
            }
        }

    }

}
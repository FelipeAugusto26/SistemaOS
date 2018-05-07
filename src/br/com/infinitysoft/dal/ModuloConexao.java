/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infinitysoft.dal;

import java.sql.*;

/**
 *
 * @author Felipe Augusto
 */
public class ModuloConexao {
    // Método responsável por estabelecer a conexão com o banco

    public static Connection conector() {

        java.sql.Connection conexao = null; // (variavel)atribuido nulo
        // Carregar o Driver - "Chamar" o driver
        String DRIVER = "com.mysql.jdbc.Driver";
        // Armazenando informações referente ao banco
        String URL = "jdbc:mysql://localhost:3306/dbinfox";
        String user = "root";
        String password = "Abc12345";
        // Estabelecendo a conexão com o banco
        try {
            Class.forName(DRIVER);
            conexao = DriverManager.getConnection(URL, user, password);
            return conexao;
        } catch (Exception e) {
            
            return null;
        }
    }

}

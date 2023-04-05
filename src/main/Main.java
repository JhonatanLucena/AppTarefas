	package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
	String dbURL = "jdbc:mysql://localhost:3306/taskdb";
	String user = "root";
	String pass = "";
	Connection conexao = DriverManager.getConnection(dbURL,user,pass);
	if(conexao != null)
		System.out.println("Conectou");
		String tarefa = "Sobreviver a 2023";
		int prioridade = 5;
		/*String sql= "INSERT INTO tarefas(tarefa,prioridade)VALUES(?,?)"; 
		PreparedStatement ps = conexao.prepareStatement(sql);
		ps.setString(1, tarefa);
		ps.setInt(2, prioridade);
		System.out.println("Linhas Afetadas: " + ps.executeUpdate());*/
		
		String sql= "DELETE FROM tarefas where prioridade = ?"; 
		PreparedStatement ps = conexao.prepareStatement(sql);
		ps.setInt(1, prioridade);
		System.out.println("Linhas Afetadas: " + ps.executeUpdate());
	}

}

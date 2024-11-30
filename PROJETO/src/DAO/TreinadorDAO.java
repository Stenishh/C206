package DAO;

import Model.Treinador;

import java.sql.SQLException;
import java.util.ArrayList;

public class TreinadorDAO extends ConnectionDAO{

    //DAO - Data Access Object
    boolean sucesso = false; //Para saber se funcionou

    //INSERT
    public boolean insertUser(Treinador user) {

        connectToDB();

        String sql = "INSERT INTO user (nome,especialidade) values(?,?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, user.getNome());
            pst.setString(2, user.getEspecialidade());
            pst.execute();
            sucesso = true;
        } catch (SQLException exc) {
            System.out.println("Erro: " + exc.getMessage());
            sucesso = false;
        } finally {
            try {
                con.close();
                pst.close();
            } catch (SQLException exc) {
                System.out.println("Erro: " + exc.getMessage());
            }
        }
        return sucesso;
    }

    //UPDATE
    public boolean updateUser(String nome, Treinador user) {
        connectToDB();
        String sql = "UPDATE user SET nome=?, especialidade=? where id=?";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, user.getNome());
            pst.setString(2, user.getEspecialidade());
            pst.execute();
            sucesso = true;
        } catch (SQLException ex) {
            System.out.println("Erro = " + ex.getMessage());
            sucesso = false;
        } finally {
            try {
                con.close();
                pst.close();
            } catch (SQLException exc) {
                System.out.println("Erro: " + exc.getMessage());
            }
        }
        return sucesso;
    }

    //DELETE
    public boolean deleteUser(String nome) {
        connectToDB();
        String sql = "DELETE FROM user where id=?";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, nome);
            pst.execute();
            sucesso = true;
        } catch (SQLException ex) {
            System.out.println("Erro = " + ex.getMessage());
            sucesso = false;
        } finally {
            try {
                con.close();
                pst.close();
            } catch (SQLException exc) {
                System.out.println("Erro: " + exc.getMessage());
            }
        }
        return sucesso;
    }

    //SELECT
    public ArrayList<Treinador> selectUser() {
        ArrayList<Treinador> users = new ArrayList<>();
        connectToDB();
        String sql = "SELECT * FROM Treinador";

        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);

            System.out.println("Lista de users: ");

            while (rs.next()) {

                Treinador userAux = new Treinador(rs.getString("nome"),rs.getString("especialidade"));

                System.out.println("nome = " + userAux.getNome());
                System.out.println("especialidade = " + userAux.getEspecialidade());
                System.out.println("--------------------------------");

                users.add(userAux);
            }
            sucesso = true;
        } catch (SQLException e) {
            System.out.println("Erro: " + e.getMessage());
            sucesso = false;
        } finally {
            try {
                con.close();
                st.close();
            } catch (SQLException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
        return users;
    }
}
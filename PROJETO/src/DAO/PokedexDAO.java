package DAO;

import Model.Pokedex;

import java.sql.SQLException;
import java.util.ArrayList;

public class PokedexDAO extends ConnectionDAO{

    //DAO - Data Access Object
    boolean sucesso = false; //Para saber se funcionou

    //INSERT
    public boolean insertUser(Pokedex user) {

        connectToDB();

        String sql = "INSERT INTO user (nome,tipo,nivel,peso) values(?,?,?,?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, user.getNome());
            pst.setString(2, user.getTipo());
            pst.setInt(3, user.getNivel());
            pst.setFloat(4, user.getPeso());
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
    public boolean updateUser(String nome, Pokedex user) {
        connectToDB();
        String sql = "UPDATE user SET nome=?, tipo=?, nivel=?, peso= ? where id=?";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, user.getNome());
            pst.setString(2, user.getTipo());
            pst.setInt(3, user.getNivel());
            pst.setFloat(4, user.getPeso());
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
    public ArrayList<Pokedex> selectUser() {
        ArrayList<Pokedex> users = new ArrayList<>();
        connectToDB();
        String sql = "SELECT * FROM Pokedex";

        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);

            System.out.println("Lista de users: ");

            while (rs.next()) {

                Pokedex userAux = new Pokedex(rs.getString("nome"),rs.getString("tipo"),rs.getInt("nivel"),rs.getFloat("peso"));

                System.out.println("nome = " + userAux.getNome());
                System.out.println("tipo = " + userAux.getTipo());
                System.out.println("nivel = " + userAux.getNivel());
                System.out.println("peso = " + userAux.getPeso());
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

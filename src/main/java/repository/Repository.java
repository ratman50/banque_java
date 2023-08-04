package repository;

import java.sql.*;
import java.util.HashMap;
import java.util.stream.Collectors;


public class Repository {
    protected Connection connection;
    public  Repository()
    {
        String url="Jdbc:mysql://localhost:3306/BANQUE";
        String userName="root";
        String passWord="Password123#@!";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.connection= DriverManager.getConnection(url, userName, passWord);
            //this.statement= connection.createStatement();

        }catch(Exception e) {
            System.out.print(e);
        }
    }
    public ResultSet executeSelect(String table,String[] columns, HashMap params) throws SQLException {


        String query = "SELECT " + String.join(", ", columns)+" FROM "+table;
        PreparedStatement ps=this.connection.prepareStatement(query);
        if(!params.isEmpty()){
            query+=" where "+params.keySet().stream().collect(Collectors.joining(" = ? AND"))+" = ?";
            ps=this.connection.prepareStatement(query);
            int pos=1;
            for (Object value:params.values()){
                ps.setString(pos++, value.toString());
            }
        }
        return ps.executeQuery();
    }
    //public <U> insert(ArrayList){

    //}
    public  int executeUpdate(String table, HashMap<String, String> columns, HashMap<String, String> conditions) throws Exception {
        if (!columns.isEmpty()  && !conditions.isEmpty()) {
            String query="UPDATE "+table+" SET " +columns.entrySet().stream()
                    .map(e -> e.getKey() + "=" + e.getValue())
                    .collect(Collectors.joining(","))+" WHERE ";
            query+=conditions.entrySet().stream()
                    .map(e -> e.getKey() + "=" + e.getValue())
                    .collect(Collectors.joining(" AND"));
            System.out.println(query);
            return this.connection.prepareStatement(query).executeUpdate();
        }
        throw new Exception("conditions ou columns ne doivent pas etre vide");

    }


}

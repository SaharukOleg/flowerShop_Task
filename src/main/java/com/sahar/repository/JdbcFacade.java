package com.sahar.repository;

import com.sahar.entity.enums.Color;
import com.sahar.entity.enums.TulipType;
import com.sahar.entity.goods.Tulip;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JdbcFacade {
    private volatile Connection connection;

    public JdbcFacade() {
        getJdbcConnection();
    }


    private void getJdbcConnection() {
        try {
            Class.forName(DBConfig.CLASSFORNAME);
            connection = DriverManager.getConnection(DBConfig.getConnectionURL(), DBConfig.USERNAME, DBConfig.PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
            }
            e.printStackTrace();
        }
        System.out.println("JDBC Connection Success");// при вдалому зєднанні JDBC i SQL виведе це повідомлення
    }



    public List<Tulip> getAllTulips() {
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(DBQueries.GET_ALL_TULIPS);

            List<Tulip> tulips = new ArrayList<>();

            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                double price = resultSet.getDouble(2);
                String type = resultSet.getString(3);
                String color = resultSet.getString(4);

                tulips.add(new Tulip(TulipType.getEnum(type), String.valueOf(id), price, Color.getEnum(color)));

                System.out.print(id + "  -  " + price + " - " + type + "  -  " + color);
                System.out.println();
            }
            return tulips;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void countColorsOfTulips(DBConfig connectJDBC) {

        // Statement statement = connection.createStatement();
    }

    @Override
    protected void finalize() throws Throwable { // Він має викликатись коли програму закривають
        super.finalize();
        if (connection != null) {
            connection.close();
        }
    }
}




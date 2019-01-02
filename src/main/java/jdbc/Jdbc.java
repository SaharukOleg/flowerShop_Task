package jdbc;

import com.mysql.fabric.jdbc.FabricMySQLDriver;

import java.sql.*;

public class Jdbc {


    public void driverRegister() {

        try { // реєструю драйвер але ХЗ НАШО тому що і без цього блоку все працює
            Driver driver = new FabricMySQLDriver();
            DriverManager.registerDriver(driver);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        ConnectJDBC connectJDBC = new ConnectJDBC();
        printTulips(connectJDBC);
    }

    public void printTulips(ConnectJDBC connectJDBC) {
        try {
            Class.forName(connectJDBC.getCLASSFORNAME());
            Connection connection = DriverManager.getConnection(connectJDBC.getURL(), connectJDBC.getUSERNAME(), connectJDBC.getPASSWORD());
            System.out.println("Good Connection");// при вдалому зєднанні JDBC i SQL виведе це повідомлення
            System.out.println();

            Statement statement = connection.createStatement();
            String getListOfTulips = "SELECT listOfTulips.id,listOfTulips.price, tulipType.tulipType, color.colorKind " +
                    " FROM listOfTulips LEFT JOIN tulipType ON  listOfTulips.tulipType = tulipType.id " +
                    "LEFT JOIN color ON listOfTulips.tulipColor = color.idColor;";

            ResultSet resultSet = statement.executeQuery(getListOfTulips);

            while (resultSet.next()) {
                int col1 = resultSet.getInt(1);
                double col2 = resultSet.getDouble(2);
                String col3 = resultSet.getString(3);
                String col4 = resultSet.getString(4);
                System.out.print(col1 + "  -  " + col2 + " - " + col3 + "  -  " + col4);
                System.out.println();
            }
            if (!connection.isClosed()) {
                connection.close();  // в кінці програми закриваємо конекшин
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void countColorsOfTulips(ConnectJDBC connectJDBC) {

        // Statement statement = connection.createStatement();
    }
}




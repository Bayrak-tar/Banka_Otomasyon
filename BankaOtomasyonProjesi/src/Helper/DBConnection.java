/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Helper;

import java.sql.*;

public class DBConnection {

    Connection c;
    //Statement s;

    public Connection connDb() {
        try {
            //String hostname="localhost";
            //String sqlInstanceName=""; //DESKTOP-289OM95
            //String sqlDatabase="HastaneOtomasyonu";
            //String sqlUser= "admin";
            //String sqlPassword="bjk-1903";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            c = DriverManager.getConnection("jdbc:sqlserver://localhost\\DESKTOP-289OM95:1433;databaseName=bankayonetimi;encrypt=true;trustServerCertificate=true;", "yonetici", "bjk-1903");
            String sqlquery = "";
            PreparedStatement pst = c.prepareStatement(sqlquery);
            //s = c.createStatement();

            // System.out.println("bağlantı başarılı:)");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return c;
    }
}

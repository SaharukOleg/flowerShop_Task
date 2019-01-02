package jdbc;

public class ConnectJDBC {
    private String URL = "Jdbc:mysql://localhost:3306/warehouseOfFlowers?verifyServerCertificate=false&useSSL=true"; // хз шо це ?verifyServerCertificate=false&useSSL=true
    // зазуглив щоб висвічувалась якесь попередження червоним
    private String USERNAME = "root";
    private String PASSWORD = "oleg1994";
    private String CLASSFORNAME = "com.mysql.jdbc.Driver";

    public String getURL() {
        return this.URL;
    }

    public String getUSERNAME() {
        return this.USERNAME;
    }

    public String getPASSWORD() {
        return this.PASSWORD;
    }

    public String getCLASSFORNAME() {
        return this.CLASSFORNAME;
    }



}

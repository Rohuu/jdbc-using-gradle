import java.sql.Connection;

public class Main {

    public static void main(String[] args) {
	DbFunctions db=new DbFunctions();
    Connection conn=db.connectToDb("db1","postgres","postgres");
//    db.createTable(conn,"employee");
//    db.insertRow(conn,"employee","Shubham Pandey","Bengaluru");
//    db.updateName(conn,"employee","Deepak","Dolly");
//        db.updateAddress(conn,"employee","Bengaluru","RTO");
    db.readData(conn,"employee");
    }
}

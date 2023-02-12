import java.sql.Connection;

public class Main {

    public static void main(String[] args) {
	DbFunctions db=new DbFunctions();
    Connection conn=db.connectToDb("db1","postgres","postgres");
//    db.createTable(conn,"employee");
//    db.insertRow(conn,"employee","Rohit","Bengaluru");
//    db.updateName(conn,"employee","Deepak","Dolly");
//    db.updateAddress(conn,"employee","Bengaluru","RTO");
//    db.searchByName(conn,"employee","Rohit");
//    db.searchById(conn,"employee",4);
//      db.deleteRowByName(conn,"employee","Rohit");
        db.deleteRowById(conn,"employee",1);
      db.readData(conn,"employee");

    }
}

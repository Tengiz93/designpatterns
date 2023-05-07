package singleton;

public class Main {

    public static void main(String[] args) {

        var dbElaqe = singleton.DBElaqe.getDbConnection();
//        dbElaqe.addQuery("1-ci sorgu");
//        dbElaqe.addQuery("2-ci sorgu");
//        dbElaqe.showQueries();
        DbConn.DB_CONN.showQueries();


//        var dbElaqe2=  DBElaqe.getDbConnection();
//        dbElaqe2.addQuery("3-cu sorgu");
//        dbElaqe.showQueries();
//
//        System.out.println(dbElaqe);
//        System.out.println(dbElaqe2);











    }

}

package singleton;

public class DBElaqe {

    private static DBElaqe dbElaqe;
    private static String queryHistory = "Query history:\n";

        public static DBElaqe getDbConnection() {
            if (dbElaqe == null) dbElaqe = new DBElaqe();
            return dbElaqe;
        }

      private DBElaqe() {

        }

        public void addQuery(String query) {
            queryHistory += query + "\n";
        }

        public void showQueries() {
            System.out.println(queryHistory);

        }





}

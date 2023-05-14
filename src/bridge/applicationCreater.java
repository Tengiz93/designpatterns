package bridge;

import java.util.Arrays;

public class applicationCreater {

    public static void main(String[] args) {


        Application [] applications = {
                new BankSystem(new JavaDeveloper()),
                new StockExchange(new KotlinDeveloper()) };

//        for(Application application: applications) {
//            application.developApplication();
//        }

        Arrays.stream(applications).forEach(Application::developApplication);
    }
}

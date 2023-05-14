package proxy;

public class RealProject implements Project{

    private final String url;

    public RealProject(String url) {

        this.url=url;
        load();
    }

    @Override
    public void run() {
        System.out.println("running "+ url+"project");

    }

    public void load() {

        System.out.println("loading " +url+ " project");

    }
}

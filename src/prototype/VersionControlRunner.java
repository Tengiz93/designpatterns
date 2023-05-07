package prototype;

public class VersionControlRunner {

    public static void main(String[] args) {

        Project project=new Project(1,"first","code");
        ProjectFactory projectFactory=new ProjectFactory(project);
        var projectClone = projectFactory.cloneProject();
        System.out.println(projectClone);




    }

}

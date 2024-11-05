public class Student {
    String name;
    String costume;
    int nCandy;

    public void printinfo() {

        System.out.println("What is the students name:" + name);
        System.out.println("What type of costume is the person wearing" + costume);
        System.out.println("How much candy there is" + nCandy);
    }

    public Student (String paramname, String paramcostume,
                    int paramnCandy) {

        name = paramname;
        costume = paramcostume;
        nCandy= paramnCandy;

    }
}


public class Candy {
    boolean isSour;
    String type;
    int calories;


    public void printinfo() {

        System.out.println("Is the candy sour or not:" + isSour);
        System.out.println("What type of candy" + type);
        System.out.println("How many calories the candy has" + calories);
    }
    public Candy(boolean paramisSour, String paramtype, int paramcalories){

      type = paramtype;
      isSour = paramisSour;
      calories = paramcalories;



    }

}

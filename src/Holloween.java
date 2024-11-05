public class Holloween {
}
    public class HolloweenFactory {

        String location;
        int sqft;
        boolean isOpen;

     public static void main(String[] args) {
         HolloweenFactory myStore;  // declare
         myStore = new HolloweenFactory();  // construct
         myStore.location = "Salem";
         myStore.sqft = 20000;
         myStore.isOpen = true;
         System.out.println("My" + myStore.sqft + "sqft store is in" + myStore.location);

        }

        public HolloweenFactory() {
            Candy candy1;
            candy1 = new Candy(true, "thisisacandy", 5);
            candy1.isSour = true;
            candy1.type = "sourpatch kids";
            candy1.calories = 100 - 150;
            candy1.printinfo();

            Student Student1;
            Student1 = new Student();
            Student1.costume = "MIB member";
            Student1.name = "Miles Potter";
            Student1.nCandy = 200;

            Candy candy3;
            candy3 = new Candy(false,"kitkat", 100);

        }
    }
}




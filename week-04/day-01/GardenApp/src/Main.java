public class Main {

        public static void main(String[] args) {
            TheGarden theGarden = new TheGarden();
            theGarden.add(new Flower("yellow"));
            theGarden.add(new Flower("blue"));
            theGarden.add(new Tree("purple"));
            theGarden.add(new Tree("orange"));

            theGarden.watering(40);
            theGarden.watering(70);

        }
    }
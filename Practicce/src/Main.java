public class Main {

    public static void main(String[] args) {
        CandyShop candyShop = new CandyShop(300);
        candyShop.createSweets("candy");
        candyShop.createSweets("candy");
        candyShop.createSweets("lollipop");
        candyShop.createSweets("lollipop");
        System.out.println(candyShop);
        // Should print out:
        // Invetory: 2 candies, 2 lollipops, Income: 0$, Sugar: 270gr
        candyShop.sell("candy", 1);
        System.out.println(candyShop);
        // Should print out:
        // "Invetory: 1 candies, 2 lollipops, Income: 20$, Sugar: 270gr"
        candyShop.raise(5);
        candyShop.sell("lollipop", 1);
        System.out.println(candyShop);
        // Should print out:
        // "Invetory: 1 candies, 1 lollipops, Income: 30.5$, Sugar: 270gr"
        candyShop.buySugar(300);
        System.out.println(candyShop);
        // Should print out:
        // "Invetory: 1 candies, 1 lollipops, Income: 5$, Sugar: 570gr"
    }
}

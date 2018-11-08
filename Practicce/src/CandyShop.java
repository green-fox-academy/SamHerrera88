public class CandyShop {
    // We run a Candy shop where we sell candies and lollipops
    // One lollipop's price is 10$
    // And it made from 5gr of sugar
    // One candie's price is 20$
    // And it made from 10gr of sugar
    // we can raise their prices with a given percentage
    // Create a CandyShop class
    // It can store sugar and money as income. The constructor should take the amount of sugar in gramms.
    // we can create lollipops and candies store them in the CandyShop's storage
    // If we create a candie or lollipop the CandyShop's sugar amount gets reduced by the amount needed to create the sweets
    // We can raise the prices of all candies and lollipops with a given percentage
    // We can sell candie or lollipop with a given number as amount
    // If we sell sweets the income will be increased by the price of the sweets and we delete it from the inventory
    // We can buy sugar with a given number as amount. The price of 1000gr sugar is 100$
    // If we buy sugar we can raise the CandyShop's amount of sugar and reduce the income by the price of it.
    // The CandyShop should be represented as string in this format:
    // "Inventory: 3 candies, 2 lollipops, Income: 100, Sugar: 400gr"

    int sugarInGrams;
    double money;
    int lollipopQuanitiy;
    int candyQuanity;
    double lollipopPrice = 10;
    double candyPrice = 20;


    CandyShop(int sugarInGrams) {
        this.sugarInGrams = sugarInGrams;

    }

    public void createSweets(String sweet) {
        if (sweet.equals("lollipop")) {
            lollipopQuanitiy++;
            sugarInGrams -= 5;
        } else if (sweet.equals("candy")) {
            candyQuanity++;
            sugarInGrams -= 10;
        }
    }

    public void raise(double percentage) {
        lollipopPrice *= 1 + (percentage / 100);
        candyPrice *= 1 + (percentage / 100);
    }

    public void sell(String sweet, int quantity) {
        if (sweet.equals("lollipop")) {
            money += lollipopPrice * quantity;
            lollipopQuanitiy -= quantity;
        } else if (sweet.equals("candy")) {
            money += candyPrice * quantity;
            candyQuanity -= quantity;
        }
    }

    @Override
    public String toString() {
        return "Inventory: " + candyQuanity + " candies, " + lollipopQuanitiy + " Lollipops, " + "Income: $" + money + " Sugar: " + sugarInGrams + "gr";
    }

    public void buySugar(int quanity) {
        sugarInGrams += quanity;
        money -= (quanity / 10);
    }
}


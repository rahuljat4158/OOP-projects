package pizzaBill;

public class Pizza {
    // price is the total price that will be printed
    private int price;
    ////////////////////////////////////////////////
    int basePrice;
    int extraCheesePrice;
    int extraToppingPrice;
    int paperBagPrice;
    ////////////////////////////////////////////////
    private Boolean isVeg;
    private String bill;
    ///////////////////////////////////////////////
    private boolean isCheeseAdded;
    private boolean isToppingAdded;
    private boolean isTakeAwayAdded;
    //////////////////////////////////////////////
    private boolean isBillGenerated;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        this.extraCheesePrice = 80;
        this.paperBagPrice = 20;
        this.isCheeseAdded = false;
        if(isVeg){
            this.basePrice = 300;
            this.extraToppingPrice = 70;
        }
        else{
            this.basePrice = 400;
            this.extraToppingPrice = 120;
        }
        this.price = basePrice;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!isCheeseAdded){
            this.price = this.price + this.extraCheesePrice;
            this.isCheeseAdded = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!isToppingAdded){
            this.price = this.price + this.extraToppingPrice;
            this.isToppingAdded = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!isTakeAwayAdded){
            this.price = this.price + this.paperBagPrice;
            this.isTakeAwayAdded = true;
        }
    }

    public String getBill(){
        // your code goes here
        if(!isBillGenerated){
            this.bill = "Base Price of Pizza: " + this.basePrice + "\n";
            if(isCheeseAdded){
                this.bill = this.bill + "Extra Cheese Price: " + this.extraCheesePrice + "\n";
            }
            if(isToppingAdded){
                this.bill = this.bill + "Extra Toppings Price: " + this.extraToppingPrice + "\n";
            }
            if(isTakeAwayAdded){
                this.bill = this.bill + "TakeAway Price: " + this.paperBagPrice + "\n";
            }
            this.bill = this.bill +"Total Price: " + this.price;
            this.isBillGenerated=true;
        }
        return this.bill;
    }
}

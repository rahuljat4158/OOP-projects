package pizzaBill;

public class Main {
    public static void main(String[] args) {
        System.out.println("Deluxe Pizza Bill: ");
        DeluxePizza dp = new DeluxePizza(false);
        dp.addTakeaway();
        dp.addExtraCheese();
        dp.addTakeaway();
        System.out.println(dp.getBill());

        System.out.println();

        System.out.println("Normal Pizza Bill: ");
        Pizza p = new Pizza(true);
        p.addExtraCheese();
        p.addExtraToppings();
        p.addTakeaway();
        System.out.println(p.getBill());
    }
}

package pizza;
//@author fsancheztemprano
public class Main {
    public static void main(String[] args) {
        Pizza pizzaMargarita = new PizzaBuilder(500f, 350f)
                .setGrQueso(10)
                //.setGrSal(5)
                //.setMlAceite(10)
                .setTipoAceite("Oliva")
                .setTipoQueso("Mozzarella")
                .createPizza();
        
        System.out.println(pizzaMargarita.toString());

    }
}
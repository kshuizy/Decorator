public abstract class Decorator implements Coffee {

    private Coffee coffee;

    public Coffee getCoffee() {
        return coffee;
    }

    public void setCoffee(Coffee coffee) {
        this.coffee = coffee;
    }

    public Decorator(Coffee coffee) {
        this.coffee = coffee;
    }

    public void drink() {

    }
}

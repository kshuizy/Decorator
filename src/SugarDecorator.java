public class SugarDecorator extends Decorator {
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    public void drink() {
        addsugar();
        this.getCoffee().drink();
    }

    public void addsugar(){
        System.out.println("增加糖");
    }

}

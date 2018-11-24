public class MochaDecorator extends Decorator {

    public MochaDecorator(Coffee coffee) {
        super(coffee);
    }

    public void drink() {
        addmocha();
        this.getCoffee().drink(); //如果有装饰层，则调用上层的函数
    }

    public void addmocha(){
        System.out.println("增加抹茶");
    }

}

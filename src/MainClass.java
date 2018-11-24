public class MainClass {

    public static void main(String[] args) {

        Coffee decaf = new Decaf();
        Coffee espresso = new Espresso();

        //每层装饰先调用自身的执行函数，然后通过引用调用上层执行函数，可以无限制加装饰层
        Coffee mochacoffee = new MochaDecorator(decaf);
        Coffee sugarcoffee = new SugarDecorator(mochacoffee);
        Coffee supercoffee = new SugarDecorator(sugarcoffee);
        //mochacoffee.drink();
        supercoffee.drink();

    }

}

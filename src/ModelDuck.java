import behavior.impl.FlyNoWay;
import behavior.impl.Quack;

/**
 * Author: bing
 * Date: 2017-02-26 22:55
 * Email: dhuzbb@163.com
 */
public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I’m a model duck");
    }
}

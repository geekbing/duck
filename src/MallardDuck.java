import behavior.impl.FlyWithWings;
import behavior.impl.Quack;

/**
 * Author: bing
 * Date: 2017-02-26 22:46
 * Email: dhuzbb@163.com
 */
// 鸭子的实现类
public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I’m a real Mallard duck");
    }

}

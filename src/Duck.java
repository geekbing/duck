import behavior.FlyBehavior;
import behavior.QuackBehavior;

/**
 * Author: bing
 * Date: 2017-02-26 22:40
 * Email: dhuzbb@163.com
 */
// 鸭子抽象类
public abstract class Duck {
    // 飞行行为
    FlyBehavior flyBehavior;

    // 叫行为
    QuackBehavior quackBehavior;

    public Duck() {
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    // 抽象方法
    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("All ducks float,even decoys !");
    }
}

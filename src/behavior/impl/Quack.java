package behavior.impl;

import behavior.QuackBehavior;

/**
 * Author: bing
 * Date: 2017-02-26 22:44
 * Email: dhuzbb@163.com
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}

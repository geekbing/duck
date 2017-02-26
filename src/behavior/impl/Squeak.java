package behavior.impl;

import behavior.QuackBehavior;

/**
 * Author: bing
 * Date: 2017-02-26 22:46
 * Email: dhuzbb@163.com
 */
public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}

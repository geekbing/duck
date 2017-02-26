package behavior.impl;

import behavior.FlyBehavior;

/**
 * Author: bing
 * Date: 2017-02-26 22:42
 * Email: dhuzbb@163.com
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I’m flying!!");
    }
}

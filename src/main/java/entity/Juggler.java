package entity;/*
 *  29.08.2019
 *  entity
 *  Spring_Idol
 *  @author L
 */

import service.Performer;

public class Juggler implements Performer {
    private int beanBags = 3;

    public Juggler() {
    }

    public Juggler(int beanBags) {
        this.beanBags = beanBags;
    }

    public void perform() {
        System.out.println("JUGGLING " + beanBags + " beanBags");
    }
}

package com.day05.dome005;

/**
 * @author 冯朋举
 * @date 2018/12/16 18:32
 */
public class Play {
    private String name;
    private int health;

    public Play() {
    }

    public Play(String name, int health) throws HealthPointException {
        if (health < 0) {
            throw new HealthPointException("生命值异常！！！");
        }
        this.name = name;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) throws HealthPointException {
        if (health < 0) {
           throw new HealthPointException("生命值异常！！！");
        } this.health = health;
    }

    @Override
    public String toString() {
        return "Play{" +
                "name='" + name + '\'' +
                ", health='" + health + '\'' +
                '}';
    }
}

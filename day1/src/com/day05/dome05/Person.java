package com.day05.dome05;

/**
 * @author 冯朋举
 * @date 2018/12/16 15:25
 */
public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) throws AgeOutBoundsException {
        if (age > 100 || age <= 0) {
           throw  new AgeOutBoundsException("脑子好使点吧");
        }
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) throws AgeOutBoundsException {
        if (age > 100 || age <= 0) {
            throw new AgeOutBoundsException("脑子好使点吧");
        }
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

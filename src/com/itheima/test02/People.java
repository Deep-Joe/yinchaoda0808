package com.itheima.test02;

public abstract class People {
    /*
    1.创建People（人）的抽象类，包含：

        a）成员属性：姓名（name），String类型。

                国籍（country），String类型。

        b）有参无返回值的抽象方法：void speak(String str)。
     */
    private String name;
    private String country;

    public People() {
    }

    public People(String name, String country) {

        this.name = name;
        this.country = country;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public abstract void speak(String str);
}

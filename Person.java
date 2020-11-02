package cn.itcast.experiment.four;

public class Person {
    String name;
    String sex;
    int age;
    int ID;
    Person(String name,String sex,int age){
        setAge(age);
        setName(name);
        setSex(sex);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}

package org.javaclass.solutions;

//!                             Declare the appropriate accessors, mutators,
//!                             and constructors for this class.
class Person {
    String name;
    double height;
    int age;
    char gender;
    double weight;

    public Person() {
    }

    public Person(String name, double height, int age, char gender, double weight) {
        this.name = name;
        this.height = height;
        this.age = age;
        this.gender = gender;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", age=" + age +
                ", gender=" + gender +
                ", weight=" + weight +
                '}';
    }
}

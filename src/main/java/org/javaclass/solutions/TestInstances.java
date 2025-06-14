package org.javaclass.solutions;

//!                             Create two instances each of the Movie, Person, TV,
//!                             and OrderItem classes.
//!
//!                             Each instance should initialize all attributes with
//!                             a value. Output each instance to console.

public class TestInstances {

    public static void main(String[] args) {
        Movie batman = new Movie("Bat Man",true,'R',1.5,2000000);
        Movie deadpool = new Movie("Dead Pool",false,'R',1.5,4000000);

        Person mike = new Person("Mike",6.0,40,'M',180.0);
        Person sally = new Person("Sally",6.2,43,'F',150.0);

        TV samsung150X = new TV("Samsung",true,10,32,true);
        TV rca450Color = new TV("RCA",true,44,32,true);

        OrderItem socks = new OrderItem("Socks",true,15.0,4,12345);
        OrderItem gymShoes = new OrderItem("Gym Shoes",true,55.0,1,54321);

        System.out.println(batman);
        System.out.println(deadpool);

        System.out.println(mike);
        System.out.println(sally);

        System.out.println(samsung150X);
        System.out.println(rca450Color);

        System.out.println(socks);
        System.out.println(gymShoes);

    }
}

package org.javaclass;

public class _03Constructors {
/*
 -                                          What are constructors?

 `                              Constructors are a special type of method used to create
 `                              and initialize objects using the 'new' keyword.
 `
 `
 -                              Constructors are different from regular methods in that:

 `                                  1. Constructors must have the same name as the class itself.
 `                                  2. Constructors do not have a return type - not even void.
 `                                  3. Constructors are called using the 'new' keyword.
  */
}

//- Constructors can have 0 or many parameters
class Circle{
    double radius;

    //no-arg constructor  (no parameters)
    public Circle() {
    }

    //constructor with parameter
    public Circle(double radius) {
        this.radius = radius;
    }
}

//- A no-arg constructor is automatically generated
//-  in background if no constructor is declared
class Rectangle{

}

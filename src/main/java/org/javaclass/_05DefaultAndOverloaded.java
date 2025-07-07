package org.javaclass;

public class _05DefaultAndOverloaded {
//-                                 Default and Overloaded Constructors


//                                         Default Constructors

//`                         If no constructor is added to a class, a default
//`                         constructor is added and used in background.
//`
//`                         The default constructor is used to initialize
//`                         the basic functionality that all Java objects should have.

//`                         In the classes below both apps have a default constructor
                            class App1 {
                                // default constructor implied in background
                            }

                            class App2{
                                // default explicitly defined
                                App2(){

                                }
                            }

//                                         Overloaded Constructors

//`                         Overloaded constructors are simply constructors that have
//`                         parameters.
//`
//`                         A class can have as many overloaded constructors as needed.
//`
//`                         Overloaded constructors give a class multiple ways to initialize
//`                         an object.

                            static class App3 {
                                int id;
                                String name;
                                String email;

                                //Overloaded constructor that sets id on initialization
                                //then leaves name and email to be set later.
                                App3(int id){
                                    this.id  =id;
                                }

                                //Overloaded constructor that sets name and email on initialization
                                // then leaves id to be set later.
                                App3(String name, String email){
                                    this.name  =name;
                                    this.email = email;
                                }

                                //Overloaded constructor that sets all object attributes on initialization
                                App3(int id, String name, String email){
                                    this.id = id;
                                    this.name  =name;
                                    this.email = email;
                                }

                                public static void main(String[] args) {
                                    App3 obj1 = new App3(1);
                                    App3 obj2 = new App3("Steve", "Rogers");
                                    App3 obj3 = new App3(2,"Tony", "Stark");

                                    System.out.println(obj1);
                                    System.out.println(obj2);
                                    System.out.println(obj3);
                                }

//!                             ***IMPORTANT***

//`                            If an overloaded constructor is added to
//`                            a class, a default constructor WILL NOT be
//`                            auto generated.

//`                            This is important because some Java libraries
//`                            will not function properly without a default
//`                            constructor declared.



                                @Override
                                public String toString() {
                                    return "App3{" +
                                            "id=" + id +
                                            ", name='" + name + '\'' +
                                            ", email='" + email + '\'' +
                                            '}';
                                }
                            }

}

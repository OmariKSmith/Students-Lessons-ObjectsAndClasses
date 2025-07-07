package org.javaclass;

public class _06TheThisKeyword {
//-                                     The this() call


//-                                         this()

//`                         In the context of constructor calls, the 'this'
//`                         keyword is also used in method form: this()
//`
//`                         When in the form 'this()' the keyword is used
//`                         to call other constructors from inside another
//`                         constructor.

//`                         A this() constructor call is often used with
//`                         default constructors as a way to guarantee a
//`                         type of initialization for example:

                            static class App4 {
                                int id;
                                String username;
                                String password;

                                App4(){
                                    this(1,"Peter","badpass1234");
                                }

                                App4(int id, String username, String password){
                                    this.id = id;
                                    this.username = username;
                                    this.password = password;
                                }

                                public static void main(String[] args) {
                                    App4 obj1 = new App4();
                                    System.out.println(obj1);
                                }


                                @Override
                                public String toString() {
                                    return "App4{" +
                                            "id=" + id +
                                            ", username='" + username + '\'' +
                                            ", password='" + password + '\'' +
                                            '}';
                                }
                            }


}

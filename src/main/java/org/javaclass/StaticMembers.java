package org.javaclass;

public class StaticMembers {
//-                                             Static Members
//-
//`                         'static' is Java's keyword for setting a member global.

//`                         A global or static member belongs to the entire program. Therefore,
//`                         changes to a static variable are reflected across ALL classes
//`                         in the program regardless of which class the variable is changed from.

//`                         Static members do not need an object instance to be used.
//`
//`                         To use a static member, the name of the declaring class is all that
//`                         is needed to reference it. For example:

//`                         App.getMethod() would be a proper call to a static
//`                         method in a class named App with a static method named getMethod().
//`
//`                         In the example below, a Ranking class declares a static highScore
//`                         variable and static get/set methods to keep track of the top score
//`                         for players in the Gaming class.

//`                         Notice how members in the Ranking class can be called in both
// `                        the Player and Gaming classes without declaring a Ranking object.
//`
//`
}
                                class Ranking{
                                    static int highScore = 0;

                                    public static int getHighScore() {
                                        return highScore;
                                    }

                                    public static void setHighScore(int highScore) {
                                        Ranking.highScore = highScore;
                                    }
                                }


                                class Player{
                                    int score;

                                    public Player(int score) {
                                        this.score = score;
                                    }

                                    public int getScore() {
                                        return score;
                                    }
                                    public boolean isTopPlayer(){
                                        return getScore() >= Ranking.getHighScore();
                                    }
                                }

                                class Game{
                                    public static void main(String[] args) {
                                        Player player1 = new Player(62);
                                        Player player2 = new Player(52);

                                        if(player1.getScore() >= Ranking.getHighScore()){
                                            Ranking.setHighScore(player1.getScore());
                                        }
                                        if(player2.getScore() >= Ranking.getHighScore()) {
                                            Ranking.setHighScore(player2.getScore());
                                        }

                                        System.out.println("High score " + Ranking.getHighScore());
                                        System.out.println("Player1 is the best = " + player1.isTopPlayer());
                                        System.out.println("Player2 is the best = " + player2.isTopPlayer());

                                    }
                                }

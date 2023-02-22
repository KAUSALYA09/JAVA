/*Create n Hero Characters and n Villain Characters and store them in 2 Set Objects. One for Heroes and One for Villains.
        Create a Map that will use the Type enum as a key and the value will be the number of battles won for the Heroes and the Villains.
        Randomly select one Hero and one Villain.
        The Villain attacks first -- reduce the Heroes health by the Villain attack. Note the attacks should be a method call in this class.
        The Hero attacks second --- same as above.
        Print the toString method for the Villain then for the Hero
        If the Hero's or Villain's health is 0 or below remove them from their respective Set.
        Repeat until one of the sets is empty. Note one battle occurs each time thru the loop.
        Print out which group won and the number of battles won for each group.*/

import java.util.*;
class Character{
    String name;
    int health;

    public void attack(int target){
    }
}
class Hero extends Character{
    public Hero(String name,int health){
        this.name=name;
        this.health=health;
    }
    public String toString(){
        return "Hero"+" "+this.name + this.health;
    }
}
class Villain extends Character{
    public Villain(String name,int health){
        this.name=name;
        this.health=health;
    }
    public String toString(){
        return "Villain"+" "+this.name + this.health;
    }
}
public class Task3 {
    enum type{HERO,VILLAIN};
    public static void main(String args[]){
        int n=3;
        Set<Hero>heroes=new HashSet<>();
        Set<Villain>villains=new HashSet<>();

        Map<type,Integer>battelswon=new HashMap<>();


    }

}

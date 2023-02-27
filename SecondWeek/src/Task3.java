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
    int score;

    public void attack(Character points){
        points.health=points.health-this.score;
    }
}
class Hero extends Character{
    public Hero(String name, int health,int score){
        this.name=name;
        this.health=health;
        this.score=score;
    }
    public String toString(){
        return "Hero"+" "+this.name +" health is "+ this.health +" and got scored "+this.score;
    }
}
class Villain extends Character{
    public Villain(String name,int health,int score){
        this.name=name;
        this.health=health;
        this.score=score;
    }
    public String toString(){

        return "Villain"+" "+this.name +" health is "+ this.health +" and got scored "+this.score;
    }
}
public class Task3 {
    enum type{HERO,VILLAIN};
    public static void main(String args[]){
        Set<Hero>heroes=new HashSet<>();
        Set<Villain>villains=new HashSet<>();

        Hero person1 = new Hero("Ram",100,50);
        Hero person2 = new Hero("Vijay",100,50);
        Hero person3 = new Hero("Surya",100,50);
        heroes.add(person1);
        heroes.add(person2);
        heroes.add(person3);
        Villain person4 = new Villain("Ravi",100,50);
        Villain person5 = new Villain("Vinay",100,50);
        Villain person6 = new Villain("Rahul",100,50);
        villains.add(person4);
        villains.add(person5);
        villains.add(person6);

        Map<type,Integer>battlesWon=new HashMap<>();
        battlesWon.put(type.HERO, 0);
        battlesWon.put(type.VILLAIN, 0);

        Random random = new Random();

        while (!heroes.isEmpty() && !villains.isEmpty()) {
            Hero hero = heroes.toArray(new Hero[heroes.size()])[random.nextInt(heroes.size())];
            Villain villain = villains.toArray(new Villain[villains.size()])[random.nextInt(villains.size())];

            villain.attack(hero);
            System.out.println(villain.toString());

            if (hero.health <= 0) {
                heroes.remove(hero);
                battlesWon.put(type.VILLAIN, battlesWon.get(type.VILLAIN) + 1);
            }
            if(hero.health > 0 ) {
                hero.attack(villain);
                System.out.println(hero.toString());
            }

            if (villain.health <= 0) {
                villains.remove(villain);
                battlesWon.put(type.HERO, battlesWon.get(type.HERO) + 1);
            }
        }

        if (heroes.isEmpty()) {
            System.out.println("Villains won after " + (battlesWon.get(type.HERO) + battlesWon.get(type.VILLAIN)) + " battles");
        } else {
            System.out.println("Heroes won after " + (battlesWon.get(type.HERO) + battlesWon.get(type.VILLAIN)) + " battles");
        }
        System.out.println("Heroes won " + battlesWon.get(type.HERO) + " battles");
        System.out.println("Villains won " + battlesWon.get(type.VILLAIN) + " battles");
    }
}






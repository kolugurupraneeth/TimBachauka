package Inheritance;

public class Main {
  
    public static void main(String[] args) {

        House bluehouse =new House("blue");
        House anotherhouse = bluehouse;

        System.out.println(bluehouse.getColor());//blue
        System.out.println(anotherhouse.getColor());//another blue

        bluehouse.setColor("green");
        System.out.println(bluehouse.getColor());
        System.out.println(anotherhouse.getColor());

        anotherhouse.setColor("pink");
        System.out.println(anotherhouse.getColor());
    }
}

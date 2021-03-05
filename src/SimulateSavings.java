//Author: Halena Wetton
//Date: March 4 2021
//File: SimulateSavings.java

//Simulate savings class
public class SimulateSavings {
    //main method
    public static void main(String[] args) {
        //person 1 objects
        //Person1 set name and salary
        Person person1 = new Person("Jessie Allen", 80000);
        //person1 set saving percent
        person1.setSavingPercent(10);
        //person1 set market return percent
        person1.setMarketReturnPercent(7);
        //person1 set coffee price
        person1.setDailyCoffeePrice(2.0);

        //person 2 objects
        //Person2 set name and salary
        Person person2 = new Person("Kendall Hoffman", 50000);
        //person2 set saving percent
        person2.setSavingPercent(20);
        //person2 set market return percent
        person2.setMarketReturnPercent(10);
        //person2 set coffee price
        person2.setDailyCoffeePrice(0.5);

        //for loop
        for (int i = 1; i <= 10; i++) {
            person1.calculateAnotherYear(i);
            person2.calculateAnotherYear(i);
        }
        System.out.printf(person1.getName(), person1.getTotalSavings());
        System.out.printf(person2.getName(), person2.getTotalSavings());


    }
}

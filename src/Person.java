//Author: Halena Wetton
//Date: March 4 2021
//File: Person.java

//Person class
public class Person {
    //Name field private
    private String name;
    //startSalary field private
    private double startSalary;
    //annualSalary field private
    private double annualSalary;
    //savingPercent field private
    private double savingPercent;
    //coffeePrice field private
    private double coffeePrice;
    //totalSpentOnCoffee field private
    private double totalSpentOnCoffee;
    //totalSavings field private
    private double totalSavings;
    //marketReturnPercent field private
    private double marketReturnPercent;

    //setSavingPercent method void
    public void setSavingPercent(double percent) {
        this.savingPercent = percent / 100;
    }

    //setDailyCoffeePrice method void
    public void setDailyCoffeePrice(double price) {
        this.coffeePrice = price;
    }

    //setMarketReturnPercent method void
    public void setMarketReturnPercent(double percent) {
        this.marketReturnPercent = percent / 100;
    }

    //getName method String
    public String getName() {
        return name;
    }

    //getTotalSpentOnCoffee method double
    public double getTotalSpentOnCoffee() {
        return totalSpentOnCoffee;
    }

    //getTotalSavings method double
    public double getTotalSavings() {
        return totalSavings;
    }

    //calculateAnnualCoffeeSpendings method void
    private void calculateAnnualCoffeeSpendings() {
        double yearlyCoffeeSpendings = coffeePrice * 365;
        this.totalSpentOnCoffee += yearlyCoffeeSpendings;
    }

    //calculateSavingsAndInvestmentReturned method void
    private void calculateSavingsAndInvestmentReturned() {
        double savingsThisYear = this.annualSalary * this.savingPercent;
        double returnEarned = this.getTotalSavings() * this.marketReturnPercent;
        this.totalSavings += (savingsThisYear + returnEarned);
    }

    //calculateAnotherYear method void
    public void calculateAnotherYear(int yearNum) {
        if (yearNum != 1) {
            if ((this.startSalary * 3) > this.annualSalary) {
                this.annualSalary = this.annualSalary * 1.04;
            }
            if (this.coffeePrice < 10.0) {
                this.coffeePrice = this.coffeePrice * 1.08;
            }
        }
        this.calculateAnnualCoffeeSpendings();
        this.calculateSavingsAndInvestmentReturned();
        this.printSummary(yearNum);
    }

    //printSummary method year
    public void printSummary(int year) {
        //print statments
        System.out.printf("Summary for %s after year %d %n", this.getName(),year);
        System.out.printf("Salary : $%,.2f %n", this.annualSalary);
        System.out.printf("Daily price of coffee: $%, .2f %n", this.coffeePrice);
        System.out.printf("Total amount in savings: $%, .2f %n", this.getTotalSavings());
        System.out.printf("Total amount spent on coffee: $%, .2f %n", this.getTotalSpentOnCoffee());
        System.out.println("**************************");
    }

    //person method name and salary
    public Person(String nameOfPerson, double salary) {
        this.name = nameOfPerson;
        this.startSalary = salary;
        this.annualSalary = salary;
    }

    //closing bracket
}


package academy.devdojo.maratonajava.introduction;

public class EstruturasCondicionais {
    public static void main(String[] args) {

        // IF and ELSE
        int age = 12;
        boolean isAuthorizedBuyBeverages = age >= 18;

        if(isAuthorizedBuyBeverages) {
            System.out.println("Authorized to buy alcoholic beverages!");
        } else {
            System.out.println("Not authorized to buy alcoholic beverages!");
        }

        if(!isAuthorizedBuyBeverages) {
            System.out.println("Not authorized to buy alcoholic beverages!");
        }

        String category;

        if (age < 15) {
            category = "Children's Category";
        } else if (age > 15 && age < 18) {
            category = "Youth Category";
        } else {
            category = "Adult Category";
        }

        System.out.println(category);

        // Ternary Operator
        double salary = 6000;
        String donateMessage = "I will donate 500 to DevDojo";
        String noDonateMessage = "I still don't have enough money";
        String finalMessage = salary > 5000 ? donateMessage : noDonateMessage;

        System.out.println(finalMessage);

        // Exercise
        double annualSalary = 70000;
        double firstTax = 9.70 / 100;
        double secondTax = 37.35 / 100;
        double thirdTax = 49.50 / 100;
        double taxValue;

        if (annualSalary <= 34712) {
            taxValue = annualSalary * firstTax;
        } else if (annualSalary >= 34713 && annualSalary <= 68507) {
            taxValue= annualSalary * secondTax;
        } else {
            taxValue = annualSalary *  thirdTax;
        }

        System.out.println(taxValue);

        // Switch Case
        byte day = 5;

        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid option!");
                break;
        }

        char gender = 'M';

        switch (gender) {
            case 'M':
                System.out.println("Man");
                break;
            case 'F':
                System.out.println("Woman");
                break;
            default:
                System.out.println("Invalid");
                break;
        }
    }
}

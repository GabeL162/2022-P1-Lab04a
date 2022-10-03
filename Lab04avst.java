// Lab04avst.java
// The Mortgage Payment Program
// This the student, starting version of the Lab04a assignment.


public class Lab04avst
{
    public static void main(String[] args)
    {
        System.out.println("Lab04a, Student Version\n");

        double principal  = 250000;
        double annualRate = 4.85;
        double monthlyRate = (annualRate / 100) / 12;
        double numYears   = 30;
        double numMonths = numYears * 12;
        double numerator = monthlyRate * Math.pow(1 + monthlyRate, numMonths);
        double denominator = Math.pow((1 + monthlyRate),numMonths) - 1;
        double fin = (numerator/denominator);
        double monthlyPay = fin * principal;
        double totalPay = monthlyPay * numMonths;
        double totalInterest = totalPay - principal;
        monthlyPay = (int) (monthlyPay*100);
        monthlyPay /= 100;
        totalPay = (int) (totalPay*100);
        totalPay /= 100;
        totalInterest = (int) (totalInterest*100);
        totalInterest /= 100;





        System.out.println("Principal:  $" + principal);
        System.out.println("Annual Rate:  " + annualRate + "%");
        System.out.println("Number of Years:  " + numYears);
        System.out.println("Monthly Pay:  $" + monthlyPay);
        System.out.println("Total Pay:  $" + totalPay);
        System.out.println("Total Interest:  $" + totalInterest);
    }
}


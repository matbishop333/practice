package Practice;
/*Combining a few concepts I've learned so far:
conditionals, Boolean expressions, and arithmetic expressions.
I am writing a program to calculate the monthly car payment a user should
expect to make after taking out a car loan.
 */
public class CarLoan {
    public static void main(String[] args){
// here I am generating basic integer data for loan, loan length, interest rate and down payment.
    int carLoan = 10000;
    int loanLength = 3;
    int interestRate = 5;
    int downPayment = 2000;
    // this if and else if statement is built to check requirements that would prevent buyer from taking out invalid loan
    if (loanLength <= 0 || interestRate <= 0) {
        System.out.println("Error! You must take out a valid car loan");
    } else if (downPayment >= carLoan) {
        System.out.println("The car can be paid in full.");
    } else {
        int remainingBalance = carLoan - downPayment;
        int months = loanLength * 12;
        int monthlyBalance = remainingBalance / months;
        int interest = (monthlyBalance * interestRate) / 100;
        int monthlyPayment = monthlyBalance + interest;
        System.out.println(monthlyPayment);
    }

    }
}

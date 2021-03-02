public class PayStubExercise {
    public static void main(String[] args) {
        System.out.println();

        String name = "Your Name";

        int hoursWorked = 120;
        double payRate = 7.25;
        float deductiblePercent = 0.21F;
        double totalPay = hoursWorked * payRate;

        double deductible = totalPay * deductiblePercent;
        double grossPay = totalPay - deductible;

        System.out.println("-----------------------------------------------------------");
        System.out.println("Employe:\t\t" + name);
        System.out.println("Hours Worked:\t\t" + hoursWorked);
        System.out.println("Pay Rate per Hour:\t$" + payRate);
        System.out.println();
        
        System.out.println("Total Pay:\t\t$" + totalPay);
        System.out.println("Taxes and Benefits:\t-$" + deductible);
        System.out.println("Gross Pay:\t\t$" + grossPay);
        System.out.println("-----------------------------------------------------------");

        

        System.out.println();
    }
}

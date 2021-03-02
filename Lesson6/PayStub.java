public class PayStub {
    public static void main(String[] args) {
        // Top padding for program output
        System.out.println();   

        String employeeName = "Yetunde Oketona";
        String employeeAddress = "123 Main St.";
        String employeeCity = "Philadelphia";
        String employeeState = "PA";
        String employeeZipCode = "19142";

        double regularPay = 4_583.34;
        double commisionRateInPercent = 3; // The employee makes 3% of their regular pay in commision

        /* 
            Taxes
            These amounts are deducted from the employee's pay for taxes.
            The federal and state governments expect each employee to pay certain
            amount from their earnings every pay period, for taxes.
        */
        double federalIncomeTax = 623.91;
        double socialSecurityTax = 263.14;
        double medicareTax = 61.53;
        double paStateIncomeTax = 130.29;
        double philadelphiaIncomeTax =  158.04; // If you work in center city Philadelphia, you pay extra tax
        double paSuiSdiTax = 2.75;

        // Add all of the taxes together
        double totalTaxDeductions = federalIncomeTax +
                                    socialSecurityTax +
                                    medicareTax +
                                    paStateIncomeTax +
                                    philadelphiaIncomeTax +
                                    paSuiSdiTax;
        
        /*
            Benefit Elections
            These amounts are deducted from the employee's pay based on her elections.
            The employee's employer may deduct some amounts from the employee's
            regular pay to support employee benefits like medical, dental and 401K
        */
        double roth = 229.17;
        double dental = 14.40;
        double hsa = 200;
        double meecmp = 123.64;
        double vision = 1.24;
        double fourOhOneK = 458.33; // Note I did not write it as 401K

        // Add all benefit elections together
        double totalBenefitElections = roth + dental + hsa + meecmp + vision + fourOhOneK;

        // The employee's gross pay is her regular pay plus 3% commision
        double commision = commisionRateInPercent * regularPay / 100;
        double grossPay = regularPay + commision;

        // The employee's net pay is her gross pay minus taxes and benefits
        double netPay = grossPay - totalTaxDeductions - totalBenefitElections;

        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("Earning Statement");

        System.out.println();

        System.out.println("Period Beginning:\t01/16/2020");
        System.out.println("Period Ending:\t\t01/31/2020");
        System.out.println("Payment Date:\t\t01/31/2020");

        System.out.println();

        System.out.println(employeeName);
        System.out.println(employeeAddress);
        System.out.print(employeeCity + ", ");
        System.out.print(employeeState + " ");
        System.out.println(employeeZipCode);

        System.out.println();

        System.out.println("Deposited to the account of\taccount number\t\tamount");
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println(employeeName + "\t\t\txxxxxxxx682\t\t$" + netPay);
        // Bottom padding for program output
        System.out.println(55 + 32);   
    }
}


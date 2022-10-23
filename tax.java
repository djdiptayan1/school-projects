import java.util.*;

class tax {
    int age, sal, hra, lta, allo, other, ppf, funds, health, interest, gross = 0;
    int deduction, commi, lot, profit, agri, annuity, mf, tuition, medi, dona = 0;
    double tax, netincome, sur, cess = 0.0;
    String rent, gender, year, payer, dd80 = "";
    Scanner sc = new Scanner(System.in);
    public void input() {
        
        System.out.println("\t\t WELCOME TO INCOME TAX RETURN FILE");
        System.out.println("\t\t*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        System.out.println("Enter the following details to proceed---+");
        System.out.println(".\n.\n.");
        System.out.print("ENTER ASSESMENT YEAR\t:");
        year = sc.next();
        System.out.print("ENTER TAX PAYER(individual/company)\t:");
        payer = sc.next();
        switch (payer) {
            case ("individual"):

                System.out.print("ENTER GENDER\t:");
                gender = sc.next();
                System.out.print("ENTER YOUR AGE\t:");
                age = sc.nextInt();
                if (age < 18) {
                    System.out.println("YOU ARE NOT TAXED");
                    System.exit(0);
                }
                System.out.print("ENTER INCOME FROM SALARY\t:");
                sal = sc.nextInt();
                System.out.print("DO YOU LIVE IN A RENTED HOUSE?\t:");
                rent = sc.next();
                System.out.print("ENTER HRA\t:");
                hra = sc.nextInt();
                System.out.print("ENTER LTA\t:");
                lta = sc.nextInt();
                System.out.print("ENTER OTHER ALLOWANCE\t:");
                allo = sc.nextInt();
                System.out.print("ENTER INCOME FROM OTHER SOURCES\t:");
                other = sc.nextInt();
                System.out.println(".");
                System.out.println("************* DEDUCTIONS *************");
                System.out.println(".");
                System.out.print("INVESTMENTS IN PPF\t:");
                ppf = sc.nextInt();
                System.out.print("INVESTMENTS IN MUTUAL FUNDS\t:");
                funds = sc.nextInt();
                System.out.print("INVESTMENTS IN HEALTH INSURANCE\t:");
                health = sc.nextInt();
                System.out.print(" INTEREST IN BANK\t:");
                interest = sc.nextInt();

                break;
            case ("company"):

                System.out.println("ENTER INCOME FROM INTEREST");
                interest = sc.nextInt();
                System.out.println("ENTER INCOME FROM COMMISSION");
                commi = sc.nextInt();
                System.out.println("ENTER INCOME FROM LOTTERY");
                lot = sc.nextInt();
                System.out.println("ENTER PROFITS");
                profit = sc.nextInt();
                System.out.println("ENTER AGRICULTURAL INCOME");
                agri = sc.nextInt();
                System.out.println(".");
                System.out.println("*************** DEDUCTIONS **************");
                System.out.println(".");
                System.out.println("ENTER LIFE INSURANCE PAID");
                health = sc.nextInt();
                System.out.println("ENTER PAYMENT FOR ANNUITY PLAN");
                annuity = sc.nextInt();
                System.out.println("ENTER CONTRIBUTION TOWARDS PPF");
                ppf = sc.nextInt();
                System.out.println("ENTER CONTRIBUTION TOWARDS MF/UTI");
                mf = sc.nextInt();
                System.out.println("ENTER TUITION FEES PAID FOR CHILDREN");
                tuition = sc.nextInt();
                System.out.println("ENTER MEDI-CLAIM PREMIUM");
                medi = sc.nextInt();
                System.out.println("ENTER DONATIONS");
                dona = sc.nextInt();
                System.out.println("IS 80DD CLAIMED");
                dd80 = sc.next();
                break;
            default:
                System.out.println("invalid input");
        }
    }

    public void display() {
        switch (payer) {
            case ("individual"):
                System.out.println(
                        "*********************************************************************************************");
                System.out.println("\t\tExisting Rates of Resident aged below 60 years....");
                System.out.println(
                        "---------------------------------------------------------------------------------------------");
                System.out.println("\t| INCOME SLAB\t\t\t \tINCOME RATE |");
                System.out.println(
                        "\t| --------------------------------------------------------------------------------------");
                System.out.println("\t|Upto ₹ 2,50,000\t\t\t\t NIL \t\t\t\t\t\t|");
                System.out.println("\t|Above ₹ 2,50,000 to  ₹ 5,00,000\t\t 5% of (net-2,50,000)\t\t\t\t|");
                System.out.println("\t|Above ₹ 5,00,000 to  ₹ 10,00,000\t ₹ 37,500 + 10% of (net-2,50,000)\t\t|");
                System.out.println("\t|Above ₹ 10,00,000   \t\t\t ₹ 75,500 + 30% of (taxable income - 10,00,000).|");
                System.out.println(
                        "\t|---------------------------------------------------------------------------------------");
                System.out.println();
                System.out.println(
                        "*********************************************************************************************");
                System.out.println("\t\tExisting Rates of Resident aged above 60 years but less than 80....");
                System.out.println(
                        "---------------------------------------------------------------------------------------------");
                System.out.println("\t| INCOME SLAB\t\t\t \tINCOME RATE |");
                System.out.println(
                        "\t| ------------------------------------------------------------------------------------------");
                System.out.println("\tUpto ₹ 3,00,000\t\t\t\t NIL\t\t\t\t\t\t    |");
                System.out.println("\tAbove ₹ 3,00,000 to  ₹ 5,00,000\t\t 5% of (taxable income - 3,00,000)\t\t    |");
                System.out.println(
                        "\tAbove ₹ 5,00,000 to  ₹ 10,00,000\t\t ₹ 10,000 + 20% of (taxable income - 5,00,000)\t    |");
                System.out.println("\tAbove ₹ 10,00,000   \t\t\t ₹ 1,10,000/- + 30% of (taxable income - 10,00,000).|");
                System.out.println(
                        "\t|-------------------------------------------------------------------------------------------");
                break;
            case ("company"):
                System.out.println(
                        "*********************************************************************************************");
                System.out.println("\t\tExisting Rates of DOMESTIC COMPANY....TURNOVER LESS THAN 200 CRORE...");
                System.out
                        .println("----------------------------------------------------------------------------------");
                System.out.println("\t|Income Tax\t\t    22% of taxable income\t\t\t|");
                System.out.println("\t|Surcharge\t\t    (<1 <10 crore)7.5% of income tax||(>10)10%  |");
                System.out.println("\t|Health & Education Cess    4% of (Income Tax + Surcharge)\t\t|");
                System.out
                        .println("----------------------------------------------------------------------------------");
                break;
        }
    }

    public void calculation() {
        switch (payer) {
            case ("individual"):

                gross = sal + hra + lta + allo + other;

                if (rent.equalsIgnoreCase("yes")) 
                    deduction = ppf + funds + health + interest + lta + hra + 50000;
                if (rent.equalsIgnoreCase("no")) 
                    deduction = ppf + funds + health + interest + lta + 50000;

                netincome = gross - deduction;
                System.out.println("NET INCOME WHICH WILL BE TAXED\t=" + netincome);
                System.out.println("*******************************************************");
                System.out.println("*******************************************************");
                System.out.println("*******************************************************");
                // age below 60
                if (age < 60) {
                    if (netincome <= 250000) {
                        tax = 0;
                    } else if (netincome >= 250000 && netincome <= 500000) {
                        tax = 0.05 * (netincome - 250000);
                    } else if (netincome > 1000000) {
                        tax = 112500 + 0.3 * (netincome - 1000000);
                    } else if (netincome > 5000000) {
                        tax = 112500 + 0.3 * (netincome - 1000000);
                        sur = 0.15 * tax;
                    }
                }
                // age between 60 and 80
                if (age >= 60 && age <= 80) {
                    if (netincome <= 300000) {
                        tax = 0;
                    } else if (netincome >= 300000 && netincome <= 500000) {
                        tax = 0.05 * (netincome - 300000);
                    } else if (netincome > 500000 && netincome <= 1000000) {
                        tax = 10000 + 0.2 * (netincome - 500000);
                    } else if (netincome > 1000000) {
                        tax = 110000 + 0.3 * (netincome - 1000000);
                    } else if (netincome > 5000000) {
                        tax = 112500 + 0.3 * (netincome - 1000000);
                        sur = 0.1 * tax;
                    }
                }
                // age above 80
                if (age > 80) {
                    if (netincome <= 500000) {
                        tax = 0;
                    } else if (netincome > 500000 && netincome <= 1000000) {
                        tax = 0.2 * (netincome - 500000);
                    } else if (netincome > 1000000) {
                        tax = 100000 + 0.3 * (netincome - 1000000);
                    } else if (netincome > 5000000) {
                        tax = 112500 + 0.3 * (netincome - 1000000);
                        sur = 0.1 * tax;
                    }
                }
                cess = 0.04 * (tax + sur);
                break;

            case ("company"):
                gross = interest + commi + lot + profit + agri;
                if (dd80.equalsIgnoreCase("yes")) {
                    deduction = health + annuity + ppf + mf + tuition + medi + dona + 75000;
                }
                if (dd80.equalsIgnoreCase("no")) {
                    deduction = health + annuity + ppf + mf + tuition + medi + dona;
                }
                netincome = gross - deduction;

                tax = 0.22 * netincome;
                if (netincome < 10000000)// surcharge
                    sur = 0;
                else if (netincome >= 10000000 && netincome < 100000000)
                    sur = 0.075 * tax;
                else
                    sur = 0.12 * tax;
                cess = 0.04 * (tax + sur);
                break;
        }
    }

    public void bill() {
        switch (payer) {
            case ("individual"):
                System.out.println("Therefore gross income\t=" + gross);
                System.out.println("-------------------------------------------------------");
                System.out.println("-------------------------------------------------------");
                System.out.println("Therefore total deduction\t=" + deduction);
                System.out.println("-------------------------------------------------------");
                System.out.println("-------------------------------------------------------");
                System.out.println("Therefore total TAXABLE INCOME\t=" + netincome);
                System.out.println("-------------------------------------------------------");
                System.out.println("-------------------------------------------------------");
                System.out.println("Therefore total TAX TO BE PAID\t=" + (tax + sur + cess));
                System.out.println("-------------------------------------------------------");
                System.out.println("-------------------------------------------------------");
                break;
            case ("company"):
                System.out.println("THEREFORE TOTAL INCOME\t=" + gross);
                System.out.println("-------------------------------------------------------");
                System.out.println("-------------------------------------------------------");
                System.out.println("THEREFORE TOTAL DEDUCTIONS\t=" + deduction);
                System.out.println("-------------------------------------------------------");
                System.out.println("-------------------------------------------------------");
                System.out.println("THEREFORE TOTAL TAXABLE INCOME\t=" + netincome);
                System.out.println("-------------------------------------------------------");
                System.out.println("-------------------------------------------------------");
                System.out.println("THEREFORE TOTAL TAX TO BE PAID\t=" + (tax + cess + sur));
                System.out.println("-------------------------------------------------------");
                System.out.println("-------------------------------------------------------");
                break;
        }
    }

    public static void main(String args[]) {
        tax ob = new tax();
        ob.input();
        ob.display();
        ob.calculation();
        ob.bill();
    }
}
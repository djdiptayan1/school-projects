
// FEES PAYMENT SYSTEM
import java.util.*;

class fees_payment// class start
{
    String name = "", Class = "", month = "", extracuri = "", advance = "", trans = "", april = "", stream = "",
            com = "";
    int roll = 0, bus = 0, busf = 0, optional = 0, registration = 0;
    char section = ' ';
    int af = 0, tf = 0, cf = 0, labf = 0, la = 0, total = 0, day = 0, date = 0, n = 1;
    int mf = 0;
    Scanner in = new Scanner(System.in); // scanner
    Calendar c = Calendar.getInstance();

    public void input() {

        System.out.println("                                               *::ST.PAUL'S ACADEMY::*");
        System.out.println("                                            WELCOME TO FEES PAYMENT SYSTEM\n");
        System.out.println("                                     Please Enter The Following Details To Proceed");
        System.out.println("                                     ---------------------------------------------\n\n\n");

        System.out.print("NAME OF THE STUDENT                             : ");
        name = in.nextLine();
        System.out.print("ENTER THE REGISTRATION NUMBER                   : ");
        registration = in.nextInt();
        System.out.print("CLASS                                           : ");
        Class = in.next();
        if (Class.equalsIgnoreCase("11") || Class.equalsIgnoreCase("12")) {
            System.out.print("ENTER THE STREAM                                : ");
            stream = in.next();
            System.out.print("2ND LANGUAGE OR COMPUTER                        : ");
            com = in.next();
        } else {
            System.out.print("SECTION                                         : ");
            section = in.next().charAt(0);
        }
        System.out.print("ROLL NUMBER                                     : ");
        roll = in.nextInt();
        System.out.print("DO YOU WANT TO PAY FEES IN ADVANCE?(YES/NO)     : ");
        advance = in.next();
        if (advance.equalsIgnoreCase("yes")) {
            System.out.print("FOR HOW MANY MONTHS                             : ");
            n = in.nextInt();
            if (n != 12) {
                System.out.print("INCLUDING THE MONTH OF APRIL?(YES/NO)           : ");
                april = in.next();
            }
        }
        System.out.print("FEES FOR THE MONTH(s)                           : ");
        month = in.next();
        System.out.print("EXTRACURRICULAR ACTIVITIES(Karate/Swimming/Both): ");
        extracuri = in.next();
        if (extracuri.equalsIgnoreCase("swimming") || extracuri.equalsIgnoreCase("both")) {
            System.out.print("NUMBER OF DAYS FOR SWIMMING                     : ");
            day = in.nextInt();
        }
    }

    // fees structure display
    public void fee_display() {
        System.out.println("                         |--------------------------------------------------------------|");
        System.out.println("                         |                        ----------------------                |");
        System.out.println("                         |------------------------|                     |---------------|");
        System.out.println("                         | Annual fees(to be paid along with fees of April): rs 2000/-  |");
        System.out.println("                         | Tuition fees(NR - X)                            : rs 1350/-  |");
        System.out.println("                         |                       ::SCHOOL FEES STRUCTURE::              |");
        System.out.println("                         | Maintenance fees                                : rs 200/-   |");
        System.out.println("                         | Tuition fees(XI - XII)                          : rs 1600/-  |");
        System.out.println("                         | Computer fees(XI - XII)                         : rs 200/-   |");
        System.out.println("                         | Laboratory fees(IX & X only)                    : rs 100/-   |");
        System.out.println("                         | Laboratory fees(XI & XII only)                  : rs 200/-   |");
        System.out.println("                         | Computer fees(I - X)                            : rs 100/-   |");
        System.out.println("                         |                                                              |");
        System.out.println("                         |    TRANSPORT FEES                                            |");
        System.out
                .println("                         |    --------------                                            |\n");
        System.out.println(
                "                         | (bus 1-4)Ulhas/Joteram/Gangpur                                       : rs 500/- |");
        System.out.println(
                "                         | (bus 5-8)Burdwan Town/DM Bungalow/Kalna Gate/Saktigarh/Barshul       : rs 600/- |");
        System.out.println(
                "                         |                                                              |------------------|");
        System.out.println(
                "                         | (bus 9-12)Rasulpur/Agricultural farm/Raipur                          : rs 700/- |");
        System.out.println(
                "                         | (bus 13-16)Kalanabagram/Bishupur                                     : rs 750/- |");
        System.out.println(
                "                         | (bus 17-20)Memari/Palla Road/Atagarh/Kashira Polempur to Sehera bazar: rs 800/- |");
        System.out.println(
                "                         | (bus 21-24)Magalmari More/Palsit/Putunda/Renaissance                 : rs 1000/-|");
        System.out.println(
                "                         | (bus 25-28)Boinchee                                                  : rs 1200/-|");
        System.out.println(
                "                         |                                                              |------------------|");
        System.out.println("                         |    OPTIONAL                                                  |");
        System.out.println("                         |    --------                                                  |");
        System.out.println("                         |                                                              |");
        System.out.println("                         | Karate                                          :rs 300/-P/M |");
        System.out.println("                         | Swimming                                        :rs 50 /-    |");
        System.out.println("                         |--------------------------------------------------------------|");
        System.out.println("                                 PLEASE NOTE");
        System.out.println("                                 -----------\n");
        System.out.println("           (i)The last date for payment of monthly fees is 20th of every month.");
        System.out.println("           (ii)A late fine of rs 30/-will be charged from 21st onward cumulatively.\n");
    }

    public void calculation() {
        System.out.print("TRANSPORT(YES/NO)                    :");
        trans = in.next();
        if (trans.equalsIgnoreCase("Yes")) {
            System.out.print("BUS NUMBER                           :");
            bus = in.nextInt();
        }
        System.out.println();
        System.out.println();
        // calculation
        if (Class.equals("11") || Class.equals("12"))// tuition fees
        {
            tf = 1600 * n; // tuition fees
        } else {
            tf = 1350 * n;
        }

        if ((Class.equals("11") || Class.equals("12")) && com.equalsIgnoreCase("computer"))// computer fees
        {
            cf = 200 * n;
        } else if (Class.equals("1") || Class.equals("2") || Class.equals("3") || Class.equals("4") || Class.equals("5")
                || Class.equals("6") || Class.equals("7") || Class.equals("8") || Class.equals("9")
                || Class.equals("10")) {
            cf = 100 * n;
        }

        if (Class.equals("9") || Class.equals("10")) // laboratory fees
        {
            labf = 100 * n;
        } else if ((Class.equals("11") || Class.equals("12")) || stream.equalsIgnoreCase("science")) {
            labf = 200 * n;
        }

        if (advance.equalsIgnoreCase("yes"))// annual fees
        {
            if (c.get(Calendar.MONTH) + 1 == 4)// checking whether the system month is APRIL or not.
            {
                af = 2000;
            }
        }
        if (month.equalsIgnoreCase("april")) {
            af = 2000;
        }
        if (april.equalsIgnoreCase("yes")) {
            af = 2000;
        }
        if (n == 12) {
            af = 2000;
        }

        mf = 200 * n;

        date = c.get(Calendar.DATE);
        if (date > 20)// checking whether the system date is >20th or not
        {
            la = 30;
        }

        if (bus >= 1 && bus <= 4)// bus fees
        {
            busf = 500 * n;
        } else if (bus >= 5 && bus <= 8) {
            busf = 600 * n;
        } else if (bus >= 9 && bus <= 12) {
            busf = 700 * n;
        } else if (bus >= 13 && bus <= 16) {
            busf = 750 * n;
        } else if (bus >= 17 && bus <= 20) {
            busf = 800 * n;
        } else if (bus >= 21 && bus <= 24) {
            busf = 1000 * n;
        } else if (bus >= 25 && bus <= 28) {
            busf = 1200 * n;
        }

        if (extracuri.equalsIgnoreCase("karate"))// extracurricular activity fees
        {
            optional = 300 * n;
        } else if (extracuri.equalsIgnoreCase("swimming")) {
            optional = (50 * day) * n;
        } else if (extracuri.equalsIgnoreCase("both")) {
            optional = (300 + (50 * day)) * n;
        }

        total = af + tf + mf + cf + labf + busf + la + optional;// calculating total fees
    }

    public void bill() {
        System.out.println("                                              ::FEES PAYMENT SUMMARY::");
        System.out.println("                                                --------------------  ");
        System.out.println();
        System.out.println("                      NAME        :-  " + name);
        System.out.println("                      REGISTRATION NUMBER  :-  " + registration);
        System.out.print("                      CLASS       :-  " + Class);
        System.out.print("           SECTION     :-  " + section);
        System.out.println("           ROLL NO.    :-  " + roll);
        if (Class.equals("11") || Class.equals("12")) {
            System.out.println("                      STREAM : ");
        }
        System.out.println("                      FEES FOR THE MONTH(s):-" + month);
        System.out.println("                   |------------------------------------------|");
        System.out.println("                   | TUITION FEE                   :" + tf);
        System.out.println("                   | MAINTENANCE FEE               :" + mf);
        if (busf >= 500) {
            System.out.println("                   | TRANSPORT FEE                 :" + busf);
        } else {
            System.out.println("                   | TRANSPORT FEE                 :without transport");
        }
        System.out.println("                   | COMPUTER FEE                  :" + cf);
        System.out.println("                   | LABORATORY FEE                :" + labf);
        System.out.println("                   | YEARLY FEE                    :" + af);
        System.out.println("                   | LATE FEE                      :" + la);
        System.out.println("                   | EXTRACURRICULAR ACTIVITY FEE  :" + optional);
        System.out.println("                   |------------------------------------------|");
        System.out.println("                                              TOTAL:  " + total);
    }

    public static void main(String args[]) {
        fees_payment ob = new fees_payment();
        ob.input();
        ob.fee_display();
        ob.calculation();
        ob.bill();
    }
}// class end
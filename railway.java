//topic:RAILWAY RESERVATION SYSTEM.

import java.io.*;
import java.util.*;

class railway// class start
{
    Calendar c = Calendar.getInstance();
    String departure = "", clas = "", arrival = "", jdate = "", qt = "", name[], gender[],
            th[] = { "st", "nd", "rd", "th", "th", "th" }, coach;
    int pnr = (int) ((Math.random() * (1987654329 - 1234567891)) + 1234567891);
    int tno = (int) ((Math.random() * (99999 - 10000)) + 10000);
    int extra, fare, p, ad, total, diff, ch = 0, age[];
    long mobo = 0;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public void intro() {
        System.out.println("\t\t\t\t\t\t* WELCOME TO RAILWAY TICKITING SYSTEM  *");
        System.out.println("\t\t\t\t\t\t- ------------------------------------ -");
        System.out.println("**NOTE**:");
        System.out.println("1.You can book only for six person at a time.");
        System.out.println("2.Ticket must be booked within 40 days of journey.NOT BEFORE 40 DAYS.");
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("\t\t\t\t\t\t*PLEASE ENTER THE FOLLOWING DETAILS TO PROCEED*");
        System.out.println("\t\t\t\t\t\t-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
    }

    public void input() throws IOException {
        System.out.print("ENTER THE DATE OF JOURNEY(dd/mm/yyyy)\t\t\t\t:");
        jdate = br.readLine();
        System.out.print("ENTER THE DIFFERENCE BETWEEN THE JOURNEY AND BOOKING DATE\t:");
        diff = Integer.parseInt(br.readLine());
        if (diff > 40) {
            System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
            System.out.println("\tSORRY!! YOU CAN NOT BOOK TICKET BEFORE 40 DAYS OF JOURNEY");
            System.exit(0);
        }
        System.out.print("ENTER THE NUMBER OF PASSENGERS(MAX 6)\t\t\t\t:");
        p = Integer.parseInt(br.readLine());
        if (p > 6) {
            System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
            System.out.println("\tSORRY!! YOU CAN BOOK MAXIMUM FOR SIX PERSON IN ONE FORM");
            System.exit(0);
        }
        name = new String[p];
        gender = new String[p];
        age = new int[p];
        System.out.println("ENTER departure STATION NAME(Delhi,Mumbai,Chennai,Kolkata");
        System.out.print("\t\t\t    Burdwan,Asansol,Vizag,Hydrabad)     :");
        departure = br.readLine();
        System.out.println("ENTER ARRIVAL STATION NAME(Delhi,Mumbai,Chennai,Kolkata");
        System.out.print("\t\t\t    Burdwan,Asansol,Vizag,Hydrabad)     :");
        arrival = br.readLine();
        System.out.print("ENTER THE CLASS OF TRAVEL(First AC,Second AC,Third AC,Sleeper)  :");
        clas = br.readLine();
        for (int i = 0; i < p; i++) {
            System.out.print("ENTER THE NAME OF " + (i + 1) + th[i] + " PASSENGER\t\t\t\t\t:");
            name[i] = br.readLine();
            System.out.print("ENTER THE AGE OF PASSENGER\t\t\t\t\t:");
            age[i] = Integer.parseInt(br.readLine());
            if (age[i] > 6)
                ad++;
            else
                ch++;
            System.out.print("ENTER THE GENDER OF PASSENGER\t\t\t\t\t:");
            gender[i] = br.readLine();
            System.out.println("**-**-**-**-**-**-**-**-**-**-");
        }
        System.out.print("ENTER THE MOBILE NUMBER OF PASSENGER\t\t\t\t:");
        mobo = Long.parseLong(br.readLine());
    }

    public void calculate() throws IOException {
        if (clas.equalsIgnoreCase("first ac")) {
            extra = 300;
            coach = "A1";
        } else if (clas.equalsIgnoreCase("second ac")) {
            extra = 200;
            coach = "B1";
        } else if (clas.equalsIgnoreCase("third ac")) {
            extra = 100;
            coach = "C1";
        } else if (clas.equalsIgnoreCase("sleeper")) {
            extra = 0;
            coach = "S1";
        }
        if (diff == 1) {
            qt = "TATKAL";
        } else {
            qt = "GENERAL";
        }
        if ((departure.equalsIgnoreCase("delhi") && arrival.equalsIgnoreCase("mumbai"))
                || (departure.equalsIgnoreCase("mumbai") && arrival.equalsIgnoreCase("delhi")))
            fare = 1570;
        else if ((departure.equalsIgnoreCase("delhi") && arrival.equalsIgnoreCase("chennai"))
                || (departure.equalsIgnoreCase("chennai") && arrival.equalsIgnoreCase("delhi")))
            fare = 1950;
        else if ((departure.equalsIgnoreCase("delhi") && arrival.equalsIgnoreCase("kolkata"))
                || (departure.equalsIgnoreCase("kolkata") && arrival.equalsIgnoreCase("delhi")))
            fare = 1505;
        else if ((departure.equalsIgnoreCase("delhi") && arrival.equalsIgnoreCase("burdwan"))
                || (departure.equalsIgnoreCase("burdwan") && arrival.equalsIgnoreCase("delhi")))
            fare = 1455;
        else if ((departure.equalsIgnoreCase("delhi") && arrival.equalsIgnoreCase("asalsol"))
                || (departure.equalsIgnoreCase("asansol") && arrival.equalsIgnoreCase("delhi")))
            fare = 1370;
        else if ((departure.equalsIgnoreCase("delhi") && arrival.equalsIgnoreCase("vizag"))
                || (departure.equalsIgnoreCase("vizag") && arrival.equalsIgnoreCase("delhi")))
            fare = 1916;
        else if ((departure.equalsIgnoreCase("delhi") && arrival.equalsIgnoreCase("hydrabad"))
                || (departure.equalsIgnoreCase("hydrabad") && arrival.equalsIgnoreCase("delhi")))
            fare = 1655;
        else if ((departure.equalsIgnoreCase("mumbai") && arrival.equalsIgnoreCase("chennai"))
                || (departure.equalsIgnoreCase("chennai") && arrival.equalsIgnoreCase("mumbai")))
            fare = 1340;
        else if ((departure.equalsIgnoreCase("mumbai") && arrival.equalsIgnoreCase("kolkata"))
                || (departure.equalsIgnoreCase("kolkata") && arrival.equalsIgnoreCase("mumbai")))
            fare = 1855;
        else if ((departure.equalsIgnoreCase("mumbai") && arrival.equalsIgnoreCase("burdwan"))
                || (departure.equalsIgnoreCase("burdwan") && arrival.equalsIgnoreCase("mumbai")))
            fare = 1900;
        else if ((departure.equalsIgnoreCase("mumbai") && arrival.equalsIgnoreCase("asalsol"))
                || (departure.equalsIgnoreCase("asansol") && arrival.equalsIgnoreCase("mumbai")))
            fare = 1855;
        else if ((departure.equalsIgnoreCase("mumbai") && arrival.equalsIgnoreCase("vizag"))
                || (departure.equalsIgnoreCase("vizag") && arrival.equalsIgnoreCase("mumbai")))
            fare = 1655;
        else if ((departure.equalsIgnoreCase("mumbai") && arrival.equalsIgnoreCase("hydrabad"))
                || (departure.equalsIgnoreCase("hydrabad") && arrival.equalsIgnoreCase("mumbai")))
            fare = 975;
        else if ((departure.equalsIgnoreCase("chennai") && arrival.equalsIgnoreCase("kolkata"))
                || (departure.equalsIgnoreCase("kolkata") && arrival.equalsIgnoreCase("chennai")))
            fare = 1900;
        else if ((departure.equalsIgnoreCase("chennai") && arrival.equalsIgnoreCase("burdwan"))
                || (departure.equalsIgnoreCase("burdwan") && arrival.equalsIgnoreCase("chennai")))
            fare = 1855;
        else if ((departure.equalsIgnoreCase("chennai") && arrival.equalsIgnoreCase("asansol"))
                || (departure.equalsIgnoreCase("asansol") && arrival.equalsIgnoreCase("chennai")))
            fare = 1655;
        else if ((departure.equalsIgnoreCase("chennai") && arrival.equalsIgnoreCase("vizag"))
                || (departure.equalsIgnoreCase("vizag") && arrival.equalsIgnoreCase("chennai")))
            fare = 975;
        else if ((departure.equalsIgnoreCase("chennai") && arrival.equalsIgnoreCase("hydrabad"))
                || (departure.equalsIgnoreCase("hydrabad") && arrival.equalsIgnoreCase("chennai")))
            fare = 975;
        else if ((departure.equalsIgnoreCase("kolkata") && arrival.equalsIgnoreCase("burdwan"))
                || (departure.equalsIgnoreCase("burdwan") && arrival.equalsIgnoreCase("kolkata")))
            fare = 250;
        else if ((departure.equalsIgnoreCase("kolkata") && arrival.equalsIgnoreCase("asalsol"))
                || (departure.equalsIgnoreCase("asansol") && arrival.equalsIgnoreCase("kolkata")))
            fare = 300;
        else if ((departure.equalsIgnoreCase("kolkata") && arrival.equalsIgnoreCase("vizag"))
                || (departure.equalsIgnoreCase("vizag") && arrival.equalsIgnoreCase("kolkata")))
            fare = 1450;
        else if ((departure.equalsIgnoreCase("kolkata") && arrival.equalsIgnoreCase("hydrabad"))
                || (departure.equalsIgnoreCase("hydrabad") && arrival.equalsIgnoreCase("kolkata")))
            fare = 1700;
        else if ((departure.equalsIgnoreCase("burdwan") && arrival.equalsIgnoreCase("asalsol"))
                || (departure.equalsIgnoreCase("asansol") && arrival.equalsIgnoreCase("burdwan")))
            fare = 60;
        else if ((departure.equalsIgnoreCase("burdwan") && arrival.equalsIgnoreCase("vizag"))
                || (departure.equalsIgnoreCase("vizag") && arrival.equalsIgnoreCase("burdwan")))
            fare = 1400;
        else if ((departure.equalsIgnoreCase("burdwan") && arrival.equalsIgnoreCase("hydrabad"))
                || (departure.equalsIgnoreCase("hydrabad") && arrival.equalsIgnoreCase("burdwan")))
            fare = 1500;
        else if ((departure.equalsIgnoreCase("asansol") && arrival.equalsIgnoreCase("vizag"))
                || (departure.equalsIgnoreCase("vizag") && arrival.equalsIgnoreCase("asansol")))
            fare = 1650;
        else if ((departure.equalsIgnoreCase("asansol") && arrival.equalsIgnoreCase("hydrabad"))
                || (departure.equalsIgnoreCase("hydrabad") && arrival.equalsIgnoreCase("asansol")))
            fare = 1500;
        else if ((departure.equalsIgnoreCase("vizag") && arrival.equalsIgnoreCase("hydrabad"))
                || (departure.equalsIgnoreCase("hydrabad") && arrival.equalsIgnoreCase("vizag")))
            fare = 999;
        total = fare + extra;
    }

    public void ticketdisp() throws IOException {
        System.out.println("\t\t\t\t\tYOUR TICKET IS SUCCESSFULLY BOOKED");
        System.out.println("\t\t\t\t\t*-*-*-*-*-*-*-*-*-*-*-*-*--*-*-*");
        System.out.println("\t\t\t\t\t*-*-*-*-*-*-*-*-*-*-*-*-*--*-*-*");
        System.out.println("\t\t\t\t\tINDIAN RAILWAY TICKETING SERVICE");
        System.out.println("\t\t\t\t\t--------------------------------");
        System.out.println("\t\t\t\t\t\tYOUR TICKET");
        System.out.println("\t\t\t\t\t\t*+*+*+*+*+*");
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("PNR NUMBER :" + pnr + "|\t\t|" + "TRAIN NO.& NAME: " + tno + "|\t\t|" + "QUOTA: " + qt);
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("DATE:" + (c.get(Calendar.DATE)) + "/" + (c.get(Calendar.MONTH) + 1) + "/"
                + (c.get(Calendar.YEAR)) + "|\t\t\t|" + "CLASS:" + clas);
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("FROM:" + departure + "|\t\t|" + "DATE OF JOURNEY:" + jdate + "|\t\t\t|" + "TO:" + arrival);
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("PASSENGER MOBILE NO.:" + mobo + "\t\t\t\t" + "Adult:" + ad + " Child:" + ch);
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println();
        System.out.println("FARE DETAILS");
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("Class Charge\t\t\tRS " + (extra * p));
        System.out.println("Ticket Fare**\t\t\tRS " + (fare * p));
        System.out.println("Total Fare**\t\t\tRS " + (total * p));
        System.out.println();
        System.out.println("PASENGERS DETAILS : ");
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("SNo. |\t\t Name \t\t|   Age \t\t|   Gender");
        System.out.println("---- |\t\t ---- \t\t|   --- \t\t|   ------");
        for (int i = 0; i < p; i++) {
            System.out.println((i + 1) + "\t\t" + name[i] + "\t\t " + age[i] + "\t\t " + gender[i]);
        }
    }

    public static void main(String args[]) throws IOException {
        railway ob = new railway();
        ob.intro();
        ob.input();
        ob.calculate();
        ob.ticketdisp();
    }
}
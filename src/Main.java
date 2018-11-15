import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    //rode text bij een foutmelding
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_RESET = "\u001B[0m";
    //alle aangemaakte arratlists
    private static ArrayList<String> ProdID =new ArrayList<String>();
    private static ArrayList<String> ProdDrinken =new ArrayList<String>();
    private static ArrayList<String> Bestelling =new ArrayList<String>();
    private Scanner sc = new Scanner(System.in);
    //de kosten van de producten
    private double[] cost = {2.50, 1.25, 1.00, 1.30, 0.90, 2.00, 1.75, 2.25, 1.50};
    public int id;
    private String answer;
    //het begin budet
    private double budget = 15;

    public static void main(String[] args) {

        Main main = new Main();
        main.start();
    }

    private void start() {
        //add producten aan de arraylist
        ProdID.add("Roze Koek €" + cost[0] );
        ProdID.add("Chocolade €" + cost[1] );
        ProdID.add("Snoep €" + cost[2] );
        ProdDrinken.add("Fanta €" + cost[3] );
        ProdDrinken.add("Spa €" + cost[4] );
        ProdDrinken.add("Pepsi €" + cost[5]);
        ProdDrinken.add("Sprite €" + cost[6]);
        ProdID.add("Wafel €" + cost[7]);
        ProdID.add("Chips €" + cost[8]);

        do {
            //print de eerste zinnetjes
            System.out.println("Goedendag\n");
            System.out.println("Wilt u wat eten of drinken?");
            System.out.println("1.Eten  2.Drinken");

            Scanner scan = new Scanner(System.in);
            int EtenDrinken = scan.nextInt();
            //1 = Eten  2 = Drinken
            System.out.println("Voer het nummer in van het product.\n");
            System.out.println("Dit zijn onze artikelen: ");

            //print de arraylist eten
            if (EtenDrinken == 1) {
                for (int i = 0; i < ProdID.size(); i++) {
                    System.out.println(i + 1 + ". " + ProdID.get(i));
                }
            }
            //print de arraylist drinken
            if (EtenDrinken == 2) {
                for (int i = 0; i < ProdDrinken.size(); i++) {
                    System.out.println(i + 6 + ". " + ProdDrinken.get(i));
                }
            }

            //geeft aan wat je budget is
            System.out.println("Wat wilt u bestellen? uw budget is €" + budget);

            int choice = sc.nextInt();
            switch (choice) {

                case 1:
                    //haalt de kosten van het product van het budget af
                    budget -= cost[0];
                    System.out.println("Uw nieuwe budget is " + "€" + budget);
                    //print de totale kosten die berekend zijn
                    System.out.printf("Totale kosten : €%.2f\n", cost[0]);
                    System.out.print("Werp het geld nu in.\n");

                    //voegt je keuze toe aan een array
                    Bestelling.add("{====================}");
                    Bestelling.add("(------Rozekoek------)");
                    Bestelling.add("{====================}\n");
                    break;

                case 2:
                    //haalt de kosten van het product van het budget af
                    budget -= cost[1];
                    System.out.println("Uw nieuwe budget is " + "€" + budget);
                    //print de totale kosten die berekend zijn
                    System.out.printf("Totale kosten : €%.2f\n", cost[1]);
                    System.out.print("Werp het geld nu in.\n");

                    //voeg keuze toe aan een array
                    Bestelling.add("[=============]");
                    Bestelling.add("[--Chocolade--]");
                    Bestelling.add("[=============]\n");

                    break;

                case 3:
                    //haalt de kosten van het product van het budget af
                    budget -= cost[2];
                    System.out.println("Uw nieuwe budget is " + "€" + budget);
                    //print de totale kosten die berekend zijn
                    System.out.printf("Totale kosten : €%.2f\n", cost[2]);
                    System.out.print("Werp het geld nu in.\n");

                    //voeg keuze toe aan een array
                    Bestelling.add("[=============]");
                    Bestelling.add("[----Snoep----]");
                    Bestelling.add("[=============]\n");

                    break;

                case 6:
                    //haalt de kosten van het product van het budget af
                    budget -= cost[3];
                    System.out.println("Uw nieuwe budget is " + "€" + budget);
                    //print de totale kosten die berekend zijn
                    System.out.printf("Totale kosten : €%.2f\n", cost[3]);
                    System.out.print("Werp het geld nu in.\n");
                    //voeg keuze toe aan een array
                    Bestelling.add("[===========]");
                    Bestelling.add("[-----------]");
                    Bestelling.add("[---Fanta---]");
                    Bestelling.add("[-----------]");
                    Bestelling.add("[===========]\n");

                    break;

                case 7:
                    //haalt de kosten van het product van het budget af
                    budget -= cost[4];
                    System.out.println("Uw nieuwe budget is " + "€" + budget);
                    //print de totale kosten die berekend zijn
                    System.out.printf("Totale kosten : €%.2f\n", cost[4]);
                    System.out.print("Werp het geld nu in.\n");

                    //voeg keuze toe aan een array
                    Bestelling.add("[=========]");
                    Bestelling.add("[---------]");
                    Bestelling.add("[---SPA---]");
                    Bestelling.add("[---------]");
                    Bestelling.add("[=========]\n");

                    break;
                case 8:
                    //haalt de kosten van het product van het budget af
                    budget -= cost[5];
                    System.out.println("Uw nieuwe budget is " + "€" + budget);
                    //print de totale kosten die berekend zijn
                    System.out.printf("Totale kosten : €%.2f\n", cost[5]);
                    System.out.print("Werp het geld nu in.\n");

                    //voeg keuze toe aan een array
                    Bestelling.add("[===========]");
                    Bestelling.add("[-----------]");
                    Bestelling.add("[---Pepsi---]");
                    Bestelling.add("[-----------]");
                    Bestelling.add("[===========]\n");
                    break;
                case 9:
                    //haalt de kosten van het product van het budget af
                    budget -= cost[6];
                    System.out.println("Uw nieuwe budget is " + "€" + budget);
                    //print de totale kosten die berekend zijn
                    System.out.printf("Totale kosten : €%.2f\n", cost[6]);
                    System.out.print("Werp het geld nu in.\n");

                    //voegt je keuze toe aan een array
                    Bestelling.add("[============]");
                    Bestelling.add("[------------]");
                    Bestelling.add("[---Sprite---]");
                    Bestelling.add("[------------]");
                    Bestelling.add("[============]\n");
                    break;
                case 4:
                    //haalt de kosten van het product van het budget af
                    budget -= cost[7];
                    System.out.println("Uw nieuwe budget is " + "€" + budget);
                    //print de totale kosten die berekend zijn
                    System.out.printf("Totale kosten : €%.2f\n", cost[7]);
                    System.out.print("Werp het geld nu in.\n");

                    //voeg keuze toe aan een array
                    Bestelling.add("[===========]");
                    Bestelling.add("[-----------]");
                    Bestelling.add("[---Wafels--]");
                    Bestelling.add("[-----------]");
                    Bestelling.add("[===========]\n");
                    break;
                case 5:
                    //haalt de kosten van het product van het budget af
                    budget -= cost[8];
                    System.out.println("Uw nieuwe budget is " + "€" + budget);
                    //print de totale kosten die berekend zijn
                    System.out.printf("Totale kosten : €%.2f\n", cost[8]);
                    System.out.print("Werp het geld nu in.\n");

                    //voeg keuze toe aan een array
                    Bestelling.add("[===========]");
                    Bestelling.add("[-----------]");
                    Bestelling.add("[---Chips---]");
                    Bestelling.add("[-----------]");
                    Bestelling.add("[===========]\n");
                    break;
            }
            if (budget < 0) {
                //stopt met executen als het budget onder 0 euro is
                System.out.println(ANSI_RED + "U Heeft Te Weinig Geld!");
                System.out.println("Neem Uw Geld Terug." + ANSI_RESET);
                System.exit(1);

            }

            System.out.println("wilt u nog iet kopen? Ja of Nee");
            answer = sc.next();
        }
        //zorgt ervoor dat als je Ja invoerd dat de do opnieuw start
        while (answer.equalsIgnoreCase("ja")) ;
        if (answer.equalsIgnoreCase("nee")) {

            //print je bestelling in ascii art en daarna sluit hij af
            Bestelling.forEach(System.out::println);
            System.out.println("Bedankt voor uw aankoop!");
            System.out.println("Fijne dag verder!");
            //Geeft aan hoeveel euro je overhebt
            System.out.println("Uw heeft € " + budget + " over");
            System.exit(1);
        }

    }

}
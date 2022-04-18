import java.util.Scanner;

public class Main{


    public static void main(String[] args) {
        

        System.out.println("Velkommen til Nop Napper / Flip Flapper");
        System.out.println("Du kender spillet, vælg en af valgmulighederne og se hvilken besked du ender med");
        System.out.println("God fornøjelse");;
        Scanner s = new Scanner(System.in);

        System.out.println("Vælg en af følgende farver: Blå, Rød, Grøn eller Gul");
        String første = s.nextLine().toLowerCase();
        for (int i = 0; i < 1; i++) {
            if(første.equals("blå")){
                System.out.println("Du kan vælge mellem følgende tal: 7, 2, 4 eller 3");
            }
            else if(første.equals("grøn")){
                System.out.println("Du kan vælge mellem følgende tal: 7, 2, 4 eller 3");
            }
            else if(første.equals("rød")){
                System.out.println("Du kan vælge mellem følgende tal: 1, 6, 5 eller 8");
            }
            else if(første.equals("gul")){
                System.out.println("Du kan vælge mellem følgende tal: 1, 6, 5 eller 8");
            }
        }

        int andet = s.nextInt();
        for (int t = 0; t < 1; t++) {
            if(andet == 7){
                System.out.println("Du kan vælge mellem følgende tal: 1, 6, 5 eller 8");
            }
            else if(andet == 3){
                System.out.println("Du kan vælge mellem følgende tal: 1, 6, 5 eller 8");
            }
            else if(andet == 2){
                System.out.println("Du kan vælge mellem følgende tal: 7, 2, 4 eller 3");
            }
            else if(andet == 4){
                System.out.println("Du kan vælge mellem følgende tal: 7, 2, 4 eller 3");
            }
            else if(andet == 1){
                System.out.println("Du kan vælge mellem følgende tal: 7, 2, 4 eller 3");
            }
            else if(andet == 5){
                System.out.println("Du kan vælge mellem følgende tal: 7, 2, 4 eller 3");
            }
            else if(andet == 6){
                System.out.println("Du kan vælge mellem følgende tal: 1, 6, 5 eller 8");
            }
            else if(andet == 8){
                System.out.println("Du kan vælge mellem følgende tal: 1, 6, 5 eller 8");
            }
        }

        s.nextLine();
        int tredje = s.nextInt();
        if(tredje == 7){
            System.out.println("Du kan vælge mellem følgende farver: Gul og rød");
        }
        else if(tredje == 3){
            System.out.println("Du kan vælge mellem følgende farver: Gul og rød");
        }
        else if(tredje == 2){
            System.out.println("Du kan vælge mellem følgende farver: Blå eller grøn");
        }
        else if(tredje == 4){
            System.out.println("Du kan vælge mellem følgende farver: Blå eller grøn");
        }
        else if(tredje == 1){
            System.out.println("Du kan vælge mellem følgende farver: Gul og rød");
        }
        else if(tredje == 5){
            System.out.println("Du kan vælge mellem følgende farver: Gul og rød");
        }
        else if(tredje == 6){
            System.out.println("Du kan vælge mellem følgende farver: Blå eller grøn");
        }
        else if(tredje == 8){
            System.out.println("Du kan vælge mellem følgende farver: Blå eller grøn");
        }
        s.nextLine();
        String fjere = s.nextLine().toLowerCase();
        if(fjere.equals("blå")){
            System.out.println("Hvilken farve er din ynligsfarve");
        }
        else if(fjere.equals("grøn")){
            System.out.println("Kender du sangenden om aglet (plastik dupper)");
        }
        else if(fjere.equals("rød")){
            System.out.println("kan du godt li farven rød?");
        }
        else if(fjere.equals("gul")){
            System.out.println("Hvad er din livret");
        }


    }
}
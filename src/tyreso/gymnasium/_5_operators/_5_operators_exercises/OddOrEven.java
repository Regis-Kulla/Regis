package tyreso.gymnasium._5_operators._5_operators_exercises;

/**
 * Programming riddle, use the operators to figure some things out.
 */
public class OddOrEven {

    public static void main(String[] args) {
        long a = 912642198;
        long b = 1985612321;
        long c = 73;

        /**
         * 1. Kontrollera vilken av variablerna a, b och c är jämn och vilka som är udda med hjälp av en av operatörerna
         * 2. Skriv ut ditt resultat på ett användarvänligt(läsbart) sätt till konsolen
         * HINT: Lösningen bör ge svaret 0 för jämna nummer och svaret 1 för ojämna
         *
         * 3. Kontrollera att resten av 9 / 5 är större än eller lika med fyra
         * 3.1 Skriv ut resultatet på ett tydligt sätt
         *
         * 4.1 Börja med siffran 3 i en variabel
         * 4.2 Öka med ett
         * 4.3 Dra ifrån ett, två gånger på raken
         * 4.4 Ta svaret gånger 3
         * 4.5 Kontrollera om svaret är lika med 6 eller 8 i två separata anrop och skriv ut om din kontroll returnerar
         *      sant eller falskt(boolean)
         */

        //TODO YOUR CODE HERE!!!   YOUR CODE HERE!!!   YOUR CODE HERE!!!   YOUR CODE HERE!!!   YOUR CODE HERE!!!

        long resultata = a % 2;
        long resultatb = b % 2;
        long resultatc = c % 2;

        System.out.println("Uträkningen visar om talen 912642198, 1985612321 eller 73 är jämna eller udda tal.");
        System.out.println("Om resultatet blir 0 så är talet jämnt och om resultatet är 1 så är talet ojämnt.");
        System.out.println("");
        System.out.println("Talet " + a + " visar: " + resultata + " (0=jämnt, 1=ojämnt)");
        System.out.println("");
        System.out.println("Talet " + b + " visar: " + resultatb + " (0=jämnt, 1=ojämnt)");
        System.out.println("");
        System.out.println("Talet " + c + " visar: " + resultatc + " (0=jämnt, 1=ojämnt)");

        int resultat = 9 % 5;
        boolean skrivUtMig = (resultat >= 4);
        System.out.println("Uträkningen visar att resultatet är större än eller lika med fyra, detta är: " + skrivUtMig);

        int minSiffra = 3;
        System.out.println(minSiffra);
        minSiffra++;
        System.out.println(minSiffra);
        minSiffra--;
        System.out.println(minSiffra);
        minSiffra *= 3;
        System.out.println(minSiffra);




        //TODO BONUS CHALLENGE BELOW!!!  BONUS CHALLENGE BELOW!!!  BONUS CHALLENGE BELOW!!!  BONUS CHALLENGE BELOW!!!
        /**
         * Använd operatörerna tillsammans med if-satser (Lektion 7) för att skriva ut olika strängar beroende på om
         * vissa siffror är större/mindre/lika med andra siffror eller om vissa uttryck är sanna eller falska rent
         * generellt. Ju fler operatörer du använder desto bättre. Testa att kombinera olika operatörer.
         *
         * Exempel nedan.
         */
        int numOne = 3;
        if (((numOne == 3) && (numOne > 0)) || (5 > 5)) {
            System.out.println("Well that's weird");
        }
    }
}

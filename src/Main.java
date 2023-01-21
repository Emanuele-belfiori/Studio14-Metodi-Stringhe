import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        System.out.println("Metodi Stringhe");
        System.out.println();

        /*
        * Metodi Stringhe:
        *
        * - equals, equalsIgnoreCase, length, charAt
        *
        * - indexOf, isEmpty, toUpperCase, toLowerCase
        *
        * - trim, replace
        *
        * - ANCHE PER LE STRINGHE SI PARTE A CONTARE DA 0 COME NEGLI ARRAY
         */
/*-------------------------------------------------------------------------------------------------*/

        // METODO EQUALS:

        // ci darà un risultato di tipo boolean

        String stabile = "Ristorante"; // Creo una stringa

        boolean locazione = stabile.equals("Ristorante"); /* Quello che troviamo scritto in
        .equals "....." dovrà coincidere perfettamente con quello scritto nella stringa stabile anche
        le lettere maiuscole o minuscole ci darebbero errore in stampa. */
        System.out.println(locazione);

/*----------------------------------------------------------------------------------------------*/

        // METODO equals.IgnoreCase:

        // Ignora maiuscole o minuscole

        // String stabile = "Colosseo";

        boolean locazione1 = stabile.equalsIgnoreCase("ristorante");/* --> Per ovviare a
        questo problema, basterà aggiungere equals.IgnoreCase("ignora maiuscolo o minuscolo") e mandare a
        stampa*/
        System.out.println(locazione);

/*---------------------------------------------------------------------------------------------*/

        // METODO length:

        // Ci dirà la lunghezza della stringa= quindi useremo una variabile int perché numero intero

        // String stabile = "Ristorante";

        int locazione2 = stabile.length(); /* Mandando a stampa riporterà sotto forma di numero intero
                                              la lunghezza dell'arry */
        System.out.println(locazione2);

/*------------------------------------------------------------------------------------------------*/

        // METODO charAt:

        /* Ci comunica in quale posizione si trova un determinato carattere= variabile char perché
        definisce un solo carattere */

        // String stabile = "Ristorante";

        char locazione3 = stabile.charAt(7); /* Dando il comando con il numero della posizione che vogliamo
                                                sapere a stampa ci apparirà la lettera corrispondente*/
        System.out.println(locazione3);

/*------------------------------------------------------------------------------------------------------*/

        // METODO indexOf:

        // Ci restituirà l'indice useremo la variabile int perché numero intero

        // String stabile = "Ristorante";

        int locazione4 = stabile.indexOf('t'); /* Dando il comando con la lettera apparirà con la successiva
                                                  stampa la posizione corrispondente*/
        System.out.println(locazione4);

/*----------------------------------------------------------------------------------------------------*/

        // METODO isEmpty:

        // Ci riporterà se la stringa è vuota useremo variabile booleana perché può solo essere vero o falso

        // String stabile = "Ristorante";

        boolean locazione5 = stabile.isEmpty(); /* Ci riporterà false naturalmente nella successiva stampa
                                                   perché il case della stringa non è vuota ma contiene
                                                   "Ristorante" se fosse vuota ci riporterebbe true*/
        System.out.println(locazione5);

/*---------------------------------------------------------------------------------------------------*/

        // METODO toUpperCase - toLowerCase:

        /*Ci restituirà quello che c'è nel case della stringa= toUpperCase (maiuscolo) -
          toLowerCase (minuscolo), utilizzeremo variabile stringa perché composto da una stringa "testo" */

        // String stabile = "Ristorante";

        String locazione6 = stabile.toUpperCase(); // Ritornerà maiuscolo
        // String locazione6 = stabile.toUpperCase(); // Ritornerà minuscolo

        System.out.println(locazione6);

/*---------------------------------------------------------------------------------------------------*/

        // METODO trim:

        // questo metodo ci permette di rimuovere gli spazi davanti e dopo una stringa

        String casa = "      Casa Mia      "; // creazione nuova stringa per prova trim

        String locazione7= casa.trim(); // andrà a rimuovere gli spazi vedremo nella stampa successiva

        System.out.println(locazione7);

/*----------------------------------------------------------------------------------------------------*/

        // METODO replace:

        // Sostituzione dei caratteri all'interno della stringa

        // String stabile = "Ristorante";

        String locazione8 = stabile.replace('t', 'w'); // Ritornerà maiuscolo
        // String locazione6 = stabile.toUpperCase(); // Ritornerà minuscolo

        System.out.println(locazione8);
    }
}
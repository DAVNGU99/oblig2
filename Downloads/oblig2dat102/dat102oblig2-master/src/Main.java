import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int n = 32_000;
        int k = 64_000;
        int j = 128_000;
        int m = 256_000;
        
        Integer[] tab = tilfeldigTab(n);
        Integer [] tab1 = tilfeldigTab(k);
        Integer [] tab2 = tilfeldigTab(j);
      
        
        Integer[] tabell = new Integer[32000];
        
        for (int x = 0; x < tabell.length; x++) {
			tabell[x]= 5;
		}
        
        Integer[] tabell1 = new Integer[64000];
        
        for (int x = 0; x < tabell1.length; x++) {
			tabell1[x]= 5;
		}
        
        Integer[] tabell2 = new Integer[128000];
        
        for (int x = 0; x < tabell2.length; x++) {
			tabell2[x]= 5;
		}
        
        
        

   
 
        // Timing for sorterVedInnsetting1
        long startTid1 = System.nanoTime();
        Oppgave1.kvikksorter(tabell);
        long sluttTid1 = System.nanoTime();
        long tid1 = (sluttTid1 - startTid1) / 1_000_000; 
        System.out.println("Tid det tar med n = 32 000: " + tid1 + " ms");

        // Timing for sorterVedInnsetting2
        long startTid2 = System.nanoTime();
        Oppgave1.kvikksorter(tabell1);
        long sluttTid2 = System.nanoTime();
        long tid2 = (sluttTid2 - startTid2) / 1_000_000; 
        System.out.println("Tid det tar med n = 64 000: " + tid2 + " ms");
        
        // Timing for sorterVedInnsetting2
        long startTid3 = System.nanoTime();
        Oppgave1.kvikksorter(tabell2);
        long sluttTid3 = System.nanoTime();
        long tid3 = (sluttTid3 - startTid3)/1_000_000; 
        System.out.println("Tid det tar med n = 128 000: " + tid3 + " ms");
        
//        // Timing for sorterVedInnsetting4
//        long startTid4 = System.nanoTime();
//        Oppgave1.sorterVedInnsettingForToSisteGang(tab4);
//        long sluttTid4 = System.nanoTime()/1_000_000;
//        long tid4 = (sluttTid3 - startTid3); 
//        System.out.println("Tid det tar med siste metode " + tid4 + " ms");
//    
        
    }

    public static Integer[] tilfeldigTab(int n) {
        Random tilfeldig = new Random();
        Integer[] tab = new Integer[n];
        for (int i = 0; i < n; i++) {
            tab[i] = tilfeldig.nextInt(n * 10);
        }
        return tab;
    }
}

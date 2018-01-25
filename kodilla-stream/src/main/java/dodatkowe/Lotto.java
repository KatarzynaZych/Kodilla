package dodatkowe;

import java.util.*;

public class Lotto {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Set<Integer> lottoLiczbyWysoluj = new HashSet<>();
        Set<Integer> lottoLiczbyPodanaj = new HashSet<>();

        Random random = new Random();
        int teSameLiczby = 0;

        while(lottoLiczbyPodanaj.size() < 6){
            System.out.println("Podaj liczbe : ");
            int liczbaPodana = scanner.nextInt();
            if(liczbaPodana > 0 && liczbaPodana < 50) {
                lottoLiczbyPodanaj.add(liczbaPodana);
            }
        }
        System.out.println(lottoLiczbyPodanaj);

        while (lottoLiczbyWysoluj.size()<6){
            lottoLiczbyWysoluj.add(random.nextInt(49)+1);
        }
        System.out.println("Liczby wylosowane " + lottoLiczbyWysoluj);

        for(Integer liczbaPodana : lottoLiczbyPodanaj){
            if( lottoLiczbyWysoluj.contains(liczbaPodana)) {
            teSameLiczby++;
            }
        }
        System.out.println("Zgadłeś " + teSameLiczby + " liczb");
    }
}

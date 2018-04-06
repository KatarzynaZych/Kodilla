package dodatkowe;

public class LiczbyPierwsze {

//    Napisz metodę, która sprawdzi czy podana liczba w argumencie jest liczbą pierwszą.
//    Liczba pierwsza to liczba całkowita, dodatnia, większa od 1, posiada dwa dzielniki: jeden i samą siebie:
//    Przykłady liczb pierwszych:
//            2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, itd



    public static boolean isPrime(int number){
        for(int i=2; i<number; i++ ){

            int rest = number%i;

            if(rest == 0 ){
                return false;
            }
        } return true;
    }


    public static void main(String[] args) {

        boolean result = isPrime(37);
        System.out.println(result);

    }
}


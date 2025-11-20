public class Primes {
    public static void main(String[] args) {
        int stopNumber = Integer.parseInt(args[0]);
        boolean [] primeNumbers = new boolean[stopNumber + 1];
        for(int i = 2; i < stopNumber + 1; i++){
            primeNumbers[i] = true;
        }
        int j = 2;
        double sqrtStopNumber = Math.sqrt(stopNumber);
        while (j <= sqrtStopNumber) {
            if (primeNumbers[j] == true) {
                int i = j * j;
                while (i < stopNumber + 1) {
                        primeNumbers[i] = false;
                    i += j;
                }
            }
            j++;
        }
        System.out.println("Prime numbers up to " + stopNumber + ":");
        int countPrimes = 0;
        for(int i = 2; i < stopNumber + 1; i++){
            if (primeNumbers[i] == true) {
                countPrimes++;
                System.out.println(i);
            }
        }
        System.out.println("There are " + countPrimes + " primes between 2 and " + stopNumber + " (" 
        + (int)(((double)countPrimes/stopNumber) * 100) + "% are primes)");
    }
}
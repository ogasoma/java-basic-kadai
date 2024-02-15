  public static void main(String[] args) {
    int max = 100;
    boolean[] primeNum = new boolean[max + 1];

    for (int i = 2; i <= max; i++) {
        primeNum[i] = true;
    }

    for (int i = 2; i * i <= max; i++) {
        if (primeNum[i]) {
            for (int j = i * i; j <= max; j += i) {
                primeNum[j] = false; 
            }
        }
    }

    for (int i = 2; i <= max; i++) {
        if (primeNum[i]) {
            System.out.println(i);
        }
    }
  }  


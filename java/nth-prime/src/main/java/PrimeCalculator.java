class PrimeCalculator {

    boolean isPrime(int n){
        for(int i=2;i*i<=n;++i){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    int nth(int nth) {
        if(nth<=0){
            throw new IllegalArgumentException();
        }
        int currentPrime=-1;
        int postionOfPrime=0;
        int i=2;
        while(true){
            if(isPrime(i)){
                currentPrime=i;
                postionOfPrime++;
            }
            if(postionOfPrime==nth)
                break;
            i++;        }
        return currentPrime;
    }

}

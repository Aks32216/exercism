class Leap {

    boolean isDivisibleByGivenNumber(int year,int num){
        return year % num == 0;
    }

    boolean isLeapYear(int year) {
        if(isDivisibleByGivenNumber(year,4)){
            if(isDivisibleByGivenNumber(year,100)){
                if(isDivisibleByGivenNumber(year,400)){
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

}

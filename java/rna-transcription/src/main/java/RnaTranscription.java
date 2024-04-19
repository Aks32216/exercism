class RnaTranscription {

    char getRnaStrandFromDnaStrand(char curDnaStrand){
        switch (curDnaStrand){
            case 'G' : return 'C';
            case 'C' : return 'G';
            case 'T' : return 'A';
            case 'A' : return 'U';
        }
        return 'A';
    }

    String transcribe(String dnaStrand) {
        if(dnaStrand.equals(""))
            return "";
        StringBuilder rnaStrand=new StringBuilder();
        for(int i=0;i<dnaStrand.length();++i){
            char curDnaStrand=dnaStrand.charAt(i);
            char equivalentRnaStrand=getRnaStrandFromDnaStrand(curDnaStrand);
            rnaStrand.append(equivalentRnaStrand);
        }
        return rnaStrand.toString();
    }

}

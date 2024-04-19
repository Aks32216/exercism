import java.util.HashMap;
import java.util.Map;

class ResistorColor {

    private Map<String, Integer> hm;

    public ResistorColor(){
        hm = new HashMap<String,Integer>();
        hm.put("black", 0);
        hm.put("brown",1);
        hm.put("red",2);
        hm.put("orange",3);
        hm.put("yellow",4);
        hm.put("green",5);
        hm.put("blue",6);
        hm.put("violet",7);
        hm.put("grey",8);
        hm.put("white",9);
    }

    int colorCode(String color) {

        return hm.get(color);
    }

    String[] colors() {
        String[] bandColors=new String[10];
        int i=0;
        for(Map.Entry<String,Integer> e: hm.entrySet()){
            bandColors[i]=e.getKey();
            i++;
        }
        return bandColors;
    }
}

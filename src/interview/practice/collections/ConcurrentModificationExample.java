package interview.practice.collections;

import java.util.ArrayList;
import java.util.List;

public class ConcurrentModificationExample {
    
    public static void main(String args[]){
    List<String> arrayList = new ArrayList<String>();
    arrayList.add("AA");
    arrayList.add("BB");
    arrayList.add("XX");
    arrayList.add("YY");
    
    for(String item : arrayList)
    {
        System.out.println(item);
        arrayList.remove(0);
    }
    }

}

package stuff;

import java.util.HashSet;
import java.util.Set;

public class AbhiHashMap<k,v> {

    Set<keyValuePair<k,v>> keyValuePairs= new HashSet<>();

    public v put(k key, v value){
        keyValuePair<k,v> keyValuePair = new keyValuePair(key, value);
        if(keyValuePairs.contains(keyValuePair)){
             keyValuePairs.add(keyValuePair);
            return keyValuePair.getValue();
        } else {
            keyValuePairs.add(keyValuePair);
            return null;
        }

    }



}

class keyValuePair<k,v>{
    k key;
    v value;
    public keyValuePair(k key, v value){
        this.key=key;
        this.value=value;
    }

    public k getKey() {
        return key;
    }

    public v getValue() {
        return value;
    }
}

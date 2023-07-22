import java.util.*;

public class PhoneBook {
    private Map<String,String> map = new HashMap<>();



    void add(String phoneNum, String name){
        map.put(phoneNum,name);
    }



    String getByPhoneNum (String phoneNum) {
        return map.get(phoneNum) + ":" + phoneNum;
    }

    String getByName (String name) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry entry :
                map.entrySet()) {
            if (entry.getValue().equals(name)) {
                stringBuilder.append(entry.getValue());
                stringBuilder.append(":");
                stringBuilder.append(entry.getKey());
                stringBuilder.append("\n");
            }
        }
        return stringBuilder.toString();
    }

    String getAllSort(){
        StringBuilder stringBuilder = new StringBuilder();
        Map<String, Integer> sortName = new HashMap<>();
        for (Map.Entry entry:
                map.entrySet()) {
            if (sortName.containsKey(entry.getValue()))
                sortName.put((String) entry.getValue(), sortName.get(entry.getValue()) + 1);
            else {
                sortName.putIfAbsent((String) entry.getValue(), 1);
            }
        }
        int max = 1;
        for (Map.Entry entry: sortName.entrySet()){
            if ((int) entry.getValue() >= max){
                max = (int) entry.getValue();
            }
        }
        while (max !=0 ){
            for (Map.Entry entry: sortName.entrySet()){
                if ((int) entry.getValue() == max){
                    for (Map.Entry entry1: map.entrySet()){
                        if (entry.getKey().equals(entry1.getValue())){
                            stringBuilder.append(entry1.getValue());
                            stringBuilder.append(" : ");
                            stringBuilder.append(entry1.getKey());
                            stringBuilder.append("\n");
                        }
                    }
                }
            }
            max = max - 1;
        }
        return stringBuilder.toString();
    }

    String getAll (){

        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry entry :
                map.entrySet()) {
            if (entry.getKey().equals(map.keySet())){

            }
                stringBuilder.append(entry.getValue());
                stringBuilder.append(":");
                stringBuilder.append(entry.getKey());
                stringBuilder.append("\n");
            }
        System.out.println(map.values());
        return stringBuilder.toString();
    }
}

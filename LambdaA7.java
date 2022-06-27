


import java.util.HashMap;

public class Assignment7 {
    public static void main(String[] args) {
        StringBuilder mix=new StringBuilder();
        HashMap<Integer,String> hashMap=new HashMap<>();
        hashMap.put(1,"Grand");
        hashMap.put(2,"I10");
        hashMap.put(3,"Nios");
        hashMap.put(4,"Car");

        hashMap.entrySet().forEach(t-> mix.append(t));
        System.out.println(mix);
    }
}



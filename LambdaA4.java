


import java.util.ArrayList;

public class Assignment4 {
    public static void main(String[] args) {

        ArrayList<String> list=new ArrayList<String>();
        list.add("Rushikesh");
        list.add("Akash");
        list.add("Sudeep");
        list.add("Pritam");
        list.add("Navnath");
        list.add("Anand");


        System.out.println(list);
        System.out.println("For even values length");
        list.removeIf(x->(((String) x).length()%2)!=0);
        System.out.println(list);
    }
}



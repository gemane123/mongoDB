


import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class Assignment6 {

    public static void main(String[] args) {
        List<String> join = new ArrayList<>();
        join.add("Rushikesh");
        join.add("Sudeep");
        join.add("Akash");
        join.add("Navnath");

        join.replaceAll(new Change());
        join.stream().collect(Collectors.toList()).forEach(System.out::println);

    }
}
class Change implements UnaryOperator<String> {
    @Override
    public String apply(String s) {
        return s.toUpperCase();
    }
}



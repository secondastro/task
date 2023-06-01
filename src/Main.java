import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Alex");
        names.add("Vika");
        names.add("Vanya");

        for(String name : names) {
            StringBuilder sb = new StringBuilder(name);
            sb.deleteCharAt(0);
            names.set(names.indexOf(name), sb.toString());
        }

        names = names.stream().sorted().toList();
        System.out.println(names);
    }
}


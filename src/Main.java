import java.util.*;

public class Main {

    private static final Random RANDOM = new Random();


    public static void main(String[] args) {
        fourthTask();

    }

    private static List<Integer> generateList(int a) {
        List<Integer> list = new ArrayList<>(a);
        for (int i = 0; i < a; i++) {
            list.add(RANDOM.nextInt(100));
        }
        return list;
    }

    public static void firstTask() {
        List<Integer> numbers = generateList(20);
        for (Integer i : numbers) {
            if (Objects.nonNull(i) && i % 2 == 1) {
                System.out.println(i);
            }
        }
    }

    public static void secondTask() {
        List<Integer> numbers = generateList(20);
        Set<Integer> set = new TreeSet<>();
        for (Integer i : numbers) {
            if (Objects.nonNull(i) && i % 2 == 0) {
                set.add(i);
            }
        }
        for (Integer i : set) {
            System.out.println(i);
        }
    }

    public static void thirdTask() {
        List<String> strings = List.of("hello", "hi", "goodbye", "hello", "hello", "hi");
        System.out.println(new HashSet<>(strings));

    }

    public static void fourthTask() {
        List<String> strings = List.of("hello", "hi", "goodbye", "hello", "hello", "hi", "bye-bye", "Hi", "Hi");
        Map<String, Integer> total = new HashMap<>();
        for (String s : strings) {
            if (total.containsKey(s)) {
                total.put(s, total.get(s) + 1);
            } else {
                total.put(s, 1);
            }
        }
        for (Map.Entry<String, Integer> entry : total.entrySet())
        {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }
}
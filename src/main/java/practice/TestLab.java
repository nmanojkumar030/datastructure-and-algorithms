package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestLab {
    static void main() {

        List<String> cityList = List.of("Manoj", "Tharush", "Manoj", "Poojashri");
        List<Person> personList = List.of(new Person("Manoj", "MYS", 39), new Person("Tharush", "BLR", 6));

        Map<String, Long> cityCountMap = cityList.stream().collect(Collectors.groupingBy(city -> city, Collectors.counting()));
        for (Map.Entry<String, Long> entry : cityCountMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        Map<String, List<Person>> cityPersonMap = personList.stream().collect(Collectors.groupingBy(Person::city));
        for (Map.Entry<String, List<Person>> entry : cityPersonMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        Map<String, Long> cityPersonCountMap = personList.stream().collect(Collectors.groupingBy(Person::city, Collectors.counting()));
        for (Map.Entry<String, Long> entry : cityPersonCountMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        Map<String, Integer> cityPersonAgeMap = personList.stream().collect(Collectors.groupingBy(Person::city, Collectors.summingInt(Person::age)));
        for (Map.Entry<String, Integer> entry : cityPersonAgeMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        List<String> stringList = personList.stream().map(Person::name).toList();
        for (String string : stringList){
            System.out.println(string);
        }

        List<String> stringList2 = personList.stream().map(Person::name).collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
        for (String string : stringList2){
            System.out.println(string);
        }
    }

    private record Person(String name, String city, Integer age) {

    }
}

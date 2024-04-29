package task3;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.Objects.isNull;
import static java.util.stream.Collectors.groupingBy;

public class Interview {

    public long countWordsStartsWithA(String sentence) {
        return Arrays.stream(sentence.split(" ")).filter(s->s.startsWith("A")).count();
    }

    public String getFullName(Person person) throws IllegalArgumentException {
        if(isNull(person)) {
            throw new IllegalArgumentException("P can not be null");
        }
        return person.getFirstName() + " " + person.getSecondName();
    }

    public Person getOldestPerson(List<Person> people) throws IllegalArgumentException {
        if (people == null || people.isEmpty()) {
            throw new IllegalArgumentException("People list cannot be null or empty");
        }

        return people.stream().max(Comparator.comparing(Person::getAge)).orElse(null);
    }

    public Set<String> getKidNames(List<Person> people) {
        return people.stream().filter(p -> p.getAge() < 18).map(Person::getFirstName).collect(Collectors.toSet());
    }

    public Map<String, List<Person>> separateBySecondName(List<Person> people) {
        return people.stream().collect(Collectors.groupingBy(Person::getSecondName));
    }
}

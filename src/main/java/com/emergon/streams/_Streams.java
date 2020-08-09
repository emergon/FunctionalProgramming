package com.emergon.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

/**@author emergon */
public class _Streams {

    public static void main(String[] args) {
    List<Person> people = new ArrayList();
        
        people.add(new Person("Jack", Gender.MALE));
        people.add(new Person("John", Gender.MALE));
        people.add(new Person("Peter", Gender.MALE));
        people.add(new Person("Mary", Gender.FEMALE));
        people.add(new Person("Kathrine", Gender.FEMALE));
        Function<Person, String> personToNameFunction = person -> person.name;//takes Person, returns String
        ToIntFunction<String> nameToLengthFunction = name -> name.length();//Takes String, returns int
        IntConsumer printLengthConsumer = System.out::println;//Consumes int (void)
        
        people.stream()
                .map(personToNameFunction)//map does a transformation to the list.
                .mapToInt(nameToLengthFunction)
                .forEach(printLengthConsumer);
        
        boolean areAllFemales = people.stream().allMatch(person -> person.gender.equals(Gender.FEMALE));
        System.out.println("areAllFemales="+areAllFemales);
    }

    static class Person{
        private final String name;
        private final Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" + "name=" + name + ", gender=" + gender + '}';
        }
        
    }
    
    enum Gender{
        MALE, FEMALE
    }
}

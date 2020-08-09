package com.emergon;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**@author emergon */
public class MainClass {

    //https://www.youtube.com/watch?v=VRpHdSFWGPs
    
    public static void main(String[] args) {
    
        List<Person> people = new ArrayList();
        
        people.add(new Person("Jack", Gender.MALE));
        people.add(new Person("John", Gender.MALE));
        people.add(new Person("Peter", Gender.MALE));
        people.add(new Person("Mary", Gender.FEMALE));
        people.add(new Person("Kathrine", Gender.FEMALE));
        
        //Imperative approach
        List<Person> females = new ArrayList();
        for(Person p: people){
            if(p.gender.equals(Gender.FEMALE)){
                females.add(p);
            }
        }
        
        for(Person female: females){
            System.out.println(female);
        }
        
        //declarative approach
        System.out.println("------Declarative Approach-----");
        people.stream()
                .filter(person -> person.gender.equals(Gender.FEMALE))
                .forEach(System.out::println);;
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

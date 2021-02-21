package com.lierlin.DesignPatterns;

import lombok.Data;

public class JianZhaoZheDesign {
    @Data
  static   class Person {
        private String name;
        private int age;
        private String sex;
        private String location;
        private GrilFriend grilFriend;

        private Person() {
        }

        public static class PersomBuild {
            Person person = new Person();

            public PersomBuild bascInfo(String name, int age, String sex) {
                person.name = name;
                person.age = age;
                person.sex = sex;
                return this;
            }

            public PersomBuild location(String location) {
                person.location = location;
                return this;
            }

            public PersomBuild GrilFriend(String name, int age) {
               person.grilFriend = new GrilFriend(name,age);
                return this;
            }

            public Person build() {
                return person;
            }
        }
    }

   static class GrilFriend {
        private String name;
        private int age;

       @Override
       public String toString() {
           return "GrilFriend{" +
                   "name='" + name + '\'' +
                   ", age=" + age +
                   '}';
       }

       public GrilFriend(String name, int age) {
            this.name = name;
            this.age = age;

        }
    }

    public static void main(String[] args) {
    Person person = new Person.PersomBuild().bascInfo("lierlin",25,"name")
            .GrilFriend("∫´√Œ”Í",24)
            .build();
        System.out.println(person.toString());
    }

}

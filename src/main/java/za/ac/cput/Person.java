package za.ac.cput;

import java.util.Objects;

public class Person {
    private int id;
    private String firstName;
    private String lastName;
    private int age;

    private Person(){
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }

    public Person(Builder builder){
        this.id = builder.id;
        this.firstName = builder.firstName;
        this .lastName = builder.lastName;
        this.age = builder.age;
    }

    public static class Builder{
        private int id;
        private String firstName;
        private String lastName;
        private int age;

        public Builder id(int value){
            this.id = value;
            return this;
        }

        public Builder firstName(String value){
            this.firstName = value;
            return this;
        }

        public Builder lastName(String value){
            this.lastName = value;
            return this;
        }

        public Builder age(int value){
            this.age = value;
            return this;
        }

        public Person build(){
            return new Person(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

package lesson19;

public class Person {
    private String name;
    private int age;


    public void setAge (int age) throws UncurrentAgeExceprion {
        if(age < 0 || age > 150){
            throw new UncurrentAgeExceprion("возраст не может быть отрицательным или больше 150");

        }
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }



}

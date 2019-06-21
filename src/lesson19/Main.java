package lesson19;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
       try {
           person.setAge(1200);
           System.out.println("!!!!!!!!!!");

       }catch (UncurrentAgeExceprion e){
           System.out.println(e.getMessage());
           System.out.println("??");
       }


        System.out.println(person);
    }
}

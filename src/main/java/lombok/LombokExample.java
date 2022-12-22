package lombok;

public class LombokExample {
    public static void main(String[] args) {
        Person person = new Person("Anna", "Sim", 18);
        person.setAge(18);
        System.out.println(person.getAge());
    }


}

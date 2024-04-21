public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Dima", 18);
        Person person2 = new Person("Dima", 18);
        Person person3 = new Person("Lena", 21);
        Person person4 = new Person("Lena", 31);

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person1.equals(person2));
        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());

        System.out.println();

        System.out.println(person3);
        System.out.println(person4);
        System.out.println(person3.equals(person4));
        System.out.println(person3.hashCode());
        System.out.println(person4.hashCode());
    }
}
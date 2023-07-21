package Lection_1.Task_1;

public class OwnerAndCats {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.setName("Тефтелька");
        cat1.setAge(5);
        cat1.setOwnerName("Валера");
        System.out.println(cat1.greetings());
    }

}

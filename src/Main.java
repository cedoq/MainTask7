/*Создать класс Person с полем name и класс Account - это внутренний класс класса Person и у него есть поле password, конструктор с параметром password и метод displayAccount,
 который выводит имя его владельца (Person name)*/

class Person{
    public static String name = "Jhon";
    static class Account{
        String password;

        public Account(String password) {
            this.password = password;
        }

        public void DisplayAccount(){
            System.out.println(Person.name);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Person.Account p1 = new Person.Account("123321");
        p1.DisplayAccount();

    }
}
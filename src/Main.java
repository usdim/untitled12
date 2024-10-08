import javax.swing.text.html.CSS;
import java.awt.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void Reading(Readeble a, Sleelaple b) {
        a.read();
        b.sleep();
    }

    public static void Slp(Student student) {
        System.out.println();
        student.read();


    }

    ;


    public static void main(String[] args) {


        Book book1 = new Book();
        System.out.println(book1.TEXTCOLOR); // выводим константу на печать
        book1.print();
        Journal journal1 = new Journal();
        journal1.print();

        Prinatable book2 = new Book(); // здесь создали интерфейс
        book2.print();

        Student student1 = new Student("вася", 10, "хим");
        System.out.println(student1.SPEEDREADING);
        Student student2 = new Student("Петя", 12, "физ");
        System.out.println(student2.TMIESLEEP);
        student1.read();
        student2.sleep();
        student1.prn();

        Sleelaple student3 = new Student("Петя", 12, "физ"); // студент типа интерфейса Sleepable
        Readeble student4 = new Student("Петя", 12, "физ");

        student3.sleep();
        student4.read();
        Slp(student1);

        Gitar gitar1 = new Gitar();
        gitar1.play();

        Piano piano1 = new Piano();
        piano1.play();

        ClassicGitar classicGitar1 = new ClassicGitar("коричневый цвет", "Количество струн 7 ");
        classicGitar1.play1();

        classicGitar1.setCs("Струн 7");
        classicGitar1.getCs();

        System.out.println( classicGitar1.getCs());
        classicGitar1.setColor("Цвет коричневый");
        classicGitar1.getColor();
        System.out.println(classicGitar1.getColor());

    }
}


interface Prinatable {

    String TEXTCOLOR = "Black";// Константа пишется ЗАГЛАВНЫМИ БУКВАМИ. Конст присва обязательно

    // значение.
    void print();

}

class Book implements Prinatable {

    @Override
    public void print() {
        System.out.println("идет принт бук ");
    }
}

class Journal implements Prinatable {

    @Override
    public void print() {
        System.out.println("идет принт журнал");
    }
}


class Student implements Readeble, Sleelaple {

    String name;
    int age;
    String faculty;

    public Student(String name, int age, String faculty) {
        this.name = name;
        this.age = age;
        this.faculty = faculty;

    }

    @Override
    public void read() {
        System.out.println("Стундент 1 читает про джаву " + name + age + faculty);
    }

    @Override
    public void sleep() {
        System.out.println("Студенет 2 спит за партой ");
    }

    public static void prn() {
        System.out.println("Стундент 1 читает про джаву ");
        System.out.println(SPEEDREADING);
    }

}

interface Readeble {
    void read();

    String SPEEDREADING = " 100 з/ мин";

}

interface Sleelaple {
    void sleep();

    String TMIESLEEP = " 1 час  ";

}

interface Playable {
    void play();
}


class Gitar implements Playable { // как имлементированть  надо к Gitar надо написать Implement и затем написать название интерфейса Plaable

    @Override
    public void play() {
        System.out.println("инструмент Гитара играет");
    }
}

class Piano implements Playable {

    @Override
    public void play() {
        System.out.println("инструкмент Пианино играет");
    }
}

class ClassicGitar extends Gitar {


    String color;

    // цвет гитары
    private String Cs; // количество струн текстом

    public ClassicGitar(String color, String Cs) {
        this.color = color;
        this.Cs = Cs;

    }

    public void setColor(String color) { // устанавливаем значение приватной перменной колор
        this.color = color;
    }

    public void setCs(String Cs) {
        this.Cs = Cs;
    }


    public String getCs() {
        return Cs;
    }

    public String getColor (){
        return color;
    }

    public void play1() {
        System.out.println("Гитара играет" + Cs);


    }


}
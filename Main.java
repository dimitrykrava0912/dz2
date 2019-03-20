package com.company;
//1. Создайте абстрактный класс Shape, в котором есть два
//абстрактных метода double getPerimetr() и double getArea().
//2. Создайте класс Point, в котором есть два свойства double x
//double y.
//3. Создайте классы, которые описывают, как минимум, три
//геометрические фигуры (они должны быть подклассами
//Shape). При этом они в качестве свойств должны содержать
//классы Point.
//4. Создайте класс доска. Доска поделена на 4 части в каждую
//часть доски можно положить одну из фигур. У доски должны
//быть методы которые помещают и удаляют фигуру с доски.
//Также должен быть метод который выводит информацию о
//всех фигурах лежащих на доске и их суммарную площадь.
//5. * Нарисуйте UML диаграмму проекта
public class Main {

    public static void main(String[] args) {

        Point a=new Point(1,2);
        Point b=new Point(5,7);
        Point c=new Point(2,9);

        Triangle first=new Triangle(a,b,c);

        System.out.println(first);
        System.out.println("perim is -> "+first.getPerimetr());
        System.out.println("area is -> "+first.getArea());
        System.out.println("----------------------------------------------------------------------------------");
        Circle second=new Circle(a,b);
        System.out.println(second);
        System.out.println("lenth is -> "+second.getPerimetr());
        System.out.println("area is -> "+second.getArea());
        System.out.println("----------------------------------------------------------------------------------");
        Shape one=first;
        Shape two=second;

        Blackboard deck=new Blackboard();
        deck.addShape(one,1);
        deck.addShape(two,2);
        System.out.println(deck);
        System.out.println("----------------------------------------------------------------------------------");
        deck.delShape(2);
        System.out.println(deck);

    }
}

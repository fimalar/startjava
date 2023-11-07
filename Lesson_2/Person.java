public class Person {
    String sex = "мужской";
    String name = "Иван";
    int height = 180;
    int weight = 78;
    int age = 32;

    public void go() {
        System.out.println(name + " идет");
    }

    public void sit() {
        System.out.println(name + " сидит");
    }

    public void run(){
        System.out.println(name + " бежит");
    }

    public void speak() {
        System.out.println(name + " говорит");
    }

    public void learnJava() {
        System.out.println(name + " учит Java");
    }

}
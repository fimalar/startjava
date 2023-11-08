public class Wolf {
    String gender;
    String nickname;
    int weight;
    int age;
    String color;

    void go() {
        System.out.println(nickname + " идет");
    }

    void sit() {
        System.out.println(nickname + " сидит");
    }

    void run() {
        System.out.println(nickname + " бежит");
    }

    void howl() {
        System.out.println(nickname + " воет");
    }

    void hunt() {
        System.out.println(nickname + " охотится");
    }
}
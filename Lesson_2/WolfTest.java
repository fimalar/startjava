public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.nickname = "Белый Клык";
        wolf.gender = "самец";
        wolf.weight = 80;
        wolf.age = 8;
        wolf.color = "серый";

        System.out.println("\nВолк по кличке " + wolf.nickname + ": " + wolf.gender 
                + "\n- возраст " + wolf.age + " лет "
                + "\n- вес " + wolf.weight + " кг" 
                + "\n- окрас " + wolf.color);
        wolf.go();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}
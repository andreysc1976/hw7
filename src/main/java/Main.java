import java.util.Random;

public class Main {
    private static final int TEST_COUNT=15;

    public static void main(String[] args) {
        HordeOfCats hordeOfCats = new HordeOfCats();
        Random random = new Random();
        Plate plate = new Plate(20+random.nextInt(40)); //тарелка от 20 до 59
        plate.addEat(plate.getPlateSize()/2 + random.nextInt(plate.getPlateSize())/2);
        for (int i = 0; i < TEST_COUNT; i++) {
            Cat cat = new Cat("Кот №-"+i,5+random.nextInt(5));//создадим кота с размером желудка от 15 до 19
            hordeOfCats.addCat(cat);
        }

        for (int i = 0; i < TEST_COUNT ; i++) {
            hordeOfCats.getCatByIndex(i).eat(plate);
            System.out.println(hordeOfCats.getCatByIndex(i));
            System.out.println(plate.getEatCount());
        }


    }
}

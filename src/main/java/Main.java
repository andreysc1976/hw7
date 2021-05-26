import java.util.Random;

public class Main {
    private static final int TEST_COUNT=15;

    public static void main(String[] args) {
        HordeOfCats hordeOfCats = new HordeOfCats();
        Random random = new Random();
        Plate plate = new Plate(150+random.nextInt(50)); //тарелка от 20 до 59
        plate.addEat(Math.round((float) plate.getPlateSize()*2/3) + random.nextInt(plate.getPlateSize()/3));
        for (int i = 0; i < TEST_COUNT; i++) {
            Cat cat = new Cat("Кот №-"+i,5+random.nextInt(10));//создадим кота с размером желудка от 15 до 19
            hordeOfCats.addCat(cat);
        }

        for (int i = 0; i < TEST_COUNT ; i++) {
            System.out.printf("В тарелке %d еды\n", plate.getEatCount());
            Cat cat =hordeOfCats.getCatByIndex(i);
            if (cat.eat(plate)) {
                System.out.print(cat);
                System.out.printf(", он съел %d килограмм еды\n",hordeOfCats.getCatByIndex(i).getSizeStomach());
            } else {
                System.out.print(cat);
                System.out.println(", мало еды в тарелке");
            }
        }


    }
}

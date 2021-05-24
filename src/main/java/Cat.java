public class Cat extends Animal{
    private boolean satiety = false;
    private String name;
    private int sizeStomach;

    public Cat(String name,int sizeStomach) {
        super(name);
        this.sizeStomach = sizeStomach;
    }

    public int getSizeStomach() {
        return sizeStomach;
    }

    public boolean eat(Plate plate){
        if (sizeStomach>plate.getEatCount()){
            return false;
        } else {
            satiety=true;
            plate.getEat(sizeStomach);
            return true;
        }
    }

    @Override
    public String toString() {
        String sufSatiety;
        if (satiety){
            sufSatiety="сытый";
        } else {sufSatiety="голодный";}
        return String.format("Это %s и он %s",super.getName(),sufSatiety);
    }

    @Override
    public void run(int lehgth) {

    }

    @Override
    public void swimming(int length) {

    }

    @Override
    public void jump(float heigth) {

    }
}

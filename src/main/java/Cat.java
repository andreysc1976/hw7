public class Cat {
    private boolean satiety = false;
    private String name;
    private int sizeStomach;

    public Cat(String name,int sizeStomach) {
        this.name = name;
        this.sizeStomach = sizeStomach;
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
        return String.format("%s и он %s",name,sufSatiety);
    }
}

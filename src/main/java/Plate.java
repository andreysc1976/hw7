public class Plate {
    private int eatCount=0;
    private int plateSize;

    public void addEat(int eat){
        if (eatCount+eat>plateSize){
            throw new StackOverflowError("Тарелка переполнена");
        }
        eatCount+=eat;
    }

    public Plate(int plateSize) {
        this.plateSize = plateSize;
    }

    public int getEatCount() {
        return eatCount;
    }

    public int getPlateSize() {
        return plateSize;
    }

    public boolean getEat(int size){
        if (eatCount<size){
            return false;
        } else {
            eatCount = eatCount - size;
            return true;
        }
    }
}

public class HordeOfCats {
    private Cat[] cats=new Cat[0];

    public void addCat(Cat cat){
        Cat[] extCats = new Cat[cats.length+1];
        for (int i = 0; i < cats.length ; i++) {
            extCats[i]=cats[i];
        }
        extCats[extCats.length-1]=cat;
        cats = extCats;
    }

    public int getCpunt(){
        return cats.length;
    }

    public Cat getCatByIndex(int index){
        return cats[index];
    }
}

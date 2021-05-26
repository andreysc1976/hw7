public abstract class Animal {
        private static int countAnimal=0;
        private String name;

        public Animal(String name) {
            this.name = name;
            countAnimal++;
        }

        public String getName() {
            return name;
        }

        public abstract void run(int lehgth);
        public abstract void swimming(int length);
        public abstract void jump(float heigth);

        public static int getAnimalCount(){
            return countAnimal;
        }

}



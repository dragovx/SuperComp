public class les2 {
    public static void main(String[] args) {
        Veterinar vet = new Veterinar();
        Animal[] animals = new Animal[3];
        animals[0] = new dog("собака","корм","вольер");
        animals[1] = new cat("кошка","висказ","дом");
        animals[2] = new horse("лошадь", "сено", "стойло");

        for (Animal animal : animals){
            vet.treatAnimal(animal);
        }

    }

    public static class Animal{
        String food;
        String location;
        String name;

        Animal(String name, String food, String location){
            this.food = food;
            this.location = location;
            this.name = name;
        }

        public void makeNoise(){
            System.out.println(this.name + " спит");
        }
        public void eat(){
            System.out.println(this.name + " ест " + this.food);
 
        }
        public void sleep(){
            System.out.println(this.name + " хочет спать");
        }
    }

    static class dog extends Animal {

        dog(String name, String food, String location) {
            super(name, food, location);
        }

        @Override
        public void makeNoise(){
            System.out.println(this.name + " гавкает");
        }

        @Override
        public void eat(){
            System.out.println(this.name + " хочет съесть " + this.food);
        }

    }

    static class cat extends Animal {

        cat(String name, String food, String location) {
            super(name, food, location);
        }

        @Override
        public void makeNoise(){
            System.out.println(this.name + " мяукает");
        }

        @Override
        public void eat(){
            System.out.println(this.name + " поедает " + this.food);
        }

    }

    static class horse extends Animal {

        horse(String name, String food, String location) {
            super(name, food, location);
        }

        @Override
        public void makeNoise(){
            System.out.println(this.name + " крехтит");
        }

        @Override
        public void eat(){
            System.out.println(this.name + " смачно жрёт " + this.food);
        }

    }

    public static class Veterinar{
        public void treatAnimal(Animal animal){
            animal.makeNoise();
            animal.eat();
        }
    }
}
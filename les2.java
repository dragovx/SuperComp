public class les2 {
    public static void main(String[] args) {
        dog Dog = new dog("1","2","3");
    }

    class Animal{
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

    class dog extends Animal {

        dog(String name, String food, String location) {
            super(name, food, location);
        }

        @Override
        public void makeNoise(){
            System.out.println(this.name + " крепко спит");
        }

        @Override
        public void eat(){
            System.out.println(this.name + " хочет съесть " + this.food);
        }

    }

    class cat extends Animal {

        cat(String name, String food, String location) {
            super(name, food, location);
        }

        @Override
        public void makeNoise(){
            System.out.println(this.name + " дремлет");
        }

        @Override
        public void eat(){
            System.out.println(this.name + " поедает " + this.food);
        }

    }

    class horse extends Animal {

        horse(String name, String food, String location) {
            super(name, food, location);
        }

        @Override
        public void makeNoise(){
            System.out.println(this.name + " сладко спит");
        }

        @Override
        public void eat(){
            System.out.println(this.name + " смачно жрёт " + this.food);
        }

    }

    class Veterinar{
        public void treatAnimal(Animal animal){
            animal.makeNoise();
            animal.eat();
        }
    }
}
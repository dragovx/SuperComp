package Lesson3;

class task1{
    public static void main(String[] args){
        Flower blue_rose = new Rose("Blue", 80);
        Flower red_rose = new Rose("Red", 67);
        Flower white_rose = new Rose("White", 90);
        Flower tulip = new Tulip("blue", 50);
        Flower gladiolus = new Gladiolus("white", 35);
        Flower carnation = new Carnation("green", 45);
        Flower[] bouquet1 = {blue_rose, tulip, carnation};
        Flower[] bouquet2 = {red_rose, red_rose, gladiolus};
        Flower[] bouquet3 ={blue_rose, blue_rose, blue_rose};
        System.out.println(bouquet1.length+bouquet2.length+bouquet3.length);
    }

    public static class Flower {

        String color;
        int cost;

        Flower(String color, int cost){
            this.color = color;
            this.cost = cost;
        }

        public void setCost(int cost) {
        }
        
        public int getCost(){
            return 1;
        }

    }
    public static class Rose extends Flower{

        Rose(String color, int cost){
            super(color, cost);
        }

        @Override
        public int getCost(){
            return cost;
        }
    }

    public static class Tulip extends Flower{

        Tulip(String color, int cost){
            super(color, cost);
        }
        
        @Override
        public int getCost(){
            return cost;
        }
    }

    public static class Gladiolus extends Flower{

        Gladiolus(String color, int cost){
            super(color, cost);
        }
        
        @Override
        public int getCost(){
            return cost;
        }
    }

    public static class Carnation extends Flower{

        Carnation(String color, int cost){
            super(color, cost);
        }
        
        @Override
        public int getCost(){
            return cost;
        }
    }
}
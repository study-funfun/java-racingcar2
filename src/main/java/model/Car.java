package model;

import java.util.Objects;

public class Car {
    public int position=1;
    public String name;
   // public RandomGenerator randomGenerator;
    public Car(String name){
        this.name = name;
        //this.randomGenerator = randomGenerator;
    }

//    public void moveAction(){
//        int randomNumber = randomGenerator.nextInt(Constants.RANDOM_BOUND);
//        if(randomNumber>Constants.FORWARD_LIMIT) {
//            position++;
//        }
//        //ResultView.foward(name,position);
//    }
    public void moveAction(boolean shouldMove) {
        if(shouldMove){
            this.position += 1;
        }
    }

    public int getPosition() {
        return position;
    }
    public String getName(){
        return name;
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return this.position == car.position && Objects.equals(this.name,car.name);
    }
}

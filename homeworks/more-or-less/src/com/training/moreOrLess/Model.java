package com.training.moreOrLess;

public class Model {
    private int randomNumber = -1;
    private int numberOfIteration = 0;
    private int minRange;
    private int maxRange;

    public Model(){
        setRange(Range.PRIMARY_MIN_BARRIER, Range.PRIMARY_MAX_BARRIER);
    }

    public double generateNumber (){
        minRange = Range.PRIMARY_MIN_BARRIER;
        maxRange = Range.PRIMARY_MAX_BARRIER;

        double result;
        result = (int) (Math.random()*100);
        if (result == minRange) {return generateNumber();}
        randomNumber = (int) result;
        return result;
    }

    public double generateNumber (int min, int max){
        minRange = min;
        maxRange = max;

        double result;
        result = (int)(Math.random()*(max - min) + min);
        if (result == minRange) {return generateNumber(minRange, maxRange);}
        randomNumber = (int) result;
        return result;
    }

    public int compareValue (double value){
        numberOfIteration++;

        if (randomNumber ==  value) {
            numberOfIteration = 0;
            return 0;
        } else
        if (randomNumber > value) {
            return 1;
        }
        else return -1;
    }

    public boolean checkRange (int number){
        if (number > minRange && number < maxRange){
            return true;
        } else { return false; }
    }

    public int getRandomNumber() {
        return randomNumber;
    }

    public int getNumberOfIteration() {
        return numberOfIteration;
    }

    public int getMinRange() {
        return minRange;
    }

    public int getMaxRange() {
        return maxRange;
    }

    public void setRange(int minRange, int maxRange) {
        this.minRange = minRange;
        this.maxRange = maxRange;
    }
}

package com.lab2;

public class Treadmill implements IObstacle{
    private int distanceLength;

    public Treadmill(DistanceLengthEnum d){
        this.distanceLength = d.getDistance();
    }

    public boolean OvercomeAnObstacle(IParticipant com){
        boolean k = true;
        if(com.getRun()>= distanceLength){
            com.Run(distanceLength);
        }
        else {
            com.NoRun(distanceLength);
            k=false;
        }
        return k;
    }
}

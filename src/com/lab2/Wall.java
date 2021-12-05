package com.lab2;

public class Wall implements IObstacle{
    private final int height;

    public Wall(int height){
        this.height = height;
    }

    public boolean OvercomeAnObstacle(IParticipant com){
        boolean k = true;
        if(com.getJump()>= height){
            com.Jump(height);
        }
        else{
            com.NoJump(height);
            k = false;
        }
        return k;
    }
}

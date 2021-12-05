package com.lab2;

public interface IParticipant {
    void Jump(int height);
    void Run(int length);
    void NoJump(int height);
    void NoRun(int length);

    int getRun();
    int getJump();
    String getName();
}

package com.boksil2.command;

public class Game {

    private boolean isStart;

    public void start() {
        System.out.println("게임을 시작합니다.");
        this.isStart = true;
    }

    public void end() {
        System.out.println("게임을 종료합니다.");
        this.isStart = false;
    }


    public boolean isStart() {
        return this.isStart;
    }
}

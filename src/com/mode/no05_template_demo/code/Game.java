package com.mode.no05_template_demo.code;

public abstract class Game {
    abstract void initialize();

    abstract void startPlay();

    abstract void endPlay();

    public final void play()
    {
        //初始化游戏
        initialize();
        //开始游戏
        startPlay();

        endPlay();
    }
}

package com.example.kaisen_spring.model;

import java.util.Random;

public class GameService {
    private Field myField;
    private Field enemyField;

    private Random random=new Random();


    public void settingGame(int x,int y){

        myField=new Field();
        enemyField=new Field();
        myField.setShip(x,y);
        enemyField.setShip(random.nextInt(5),random.nextInt(5));

    }

    public void update(int x,int y){
        atack(x,y,enemyField);
        atack(random.nextInt(5),random.nextInt(5),myField);
    }


    void atack(int x, int y, Field field){
        if (hitJudge(x,y,field)){
            field.setInfo(x,y,EFieldInfo.breaked);
        }
        else field.setInfo(x,y,EFieldInfo.attacked);
    }

    boolean hitJudge(int x,int y,Field field){

        return field.getInfo(x,y)==EFieldInfo.ship;
    }

    public Field getMyField() {
        return myField;
    }

    public Field getEnemyField() {
        return enemyField;
    }
}

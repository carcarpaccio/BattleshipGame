package com.example.kaisen_spring.model;

public class Field {
    public EFieldInfo[][] info;

    public Field(){
        info=new EFieldInfo[5][5];
        /*for(int j=0;j<4;j++){
            for(int i=0;i<4;i++) {
                this.info[i][j]=EFieldInfo.empty;
            }
        }*/
        for(EFieldInfo tmp[]:info){
            for (EFieldInfo val: tmp){
                val=EFieldInfo.empty;
            }
        }
    }
    public void setShip(int x, int y) {
        this.info[x][y] = EFieldInfo.ship;
    }
    public void setInfo(int x,int y,EFieldInfo fieldInfo){
        this.info[x][y]=fieldInfo;
    }
    public EFieldInfo getInfo(int x,int y){
        return this.info[x][y];
    }

    public EFieldInfo[][] getField() {
        return info;
    }
}

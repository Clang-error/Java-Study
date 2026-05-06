package mtest;

import java.util.Random;

class Mind {
    int r;
    int c;
    int[][] mind;
    int RATE=15;
    Mind(int r,int c) {
        Random rnd=new Random();
        this.r=r;
        this.c=c;
        mind=new int[r][c];
        for (int i = 0; i<r;i++) {
            for (int j=0;j<c;j++) {
                mind[i][j]=(rnd.nextInt(100)<RATE)?-1:0;
            }
        }
        countMind();
    }
    void countMind() {
        for (int i = 0; i<r;i++) {
            for (int j=0; j<c;j++) {
                if(mind[i][j]>=0) {
                    if(i>0 && j>0 && mind[i-1][j-1]<0)
                        mind[i][j]++;
                    if(i>0 && mind[i-1][j]<0)
                        mind[i][j]++;
                    if(i>0 && j<c-1 && mind[i-1][j+1]<0)
                        mind[i][j]++;
                    if(j>0 && mind[i][j-1]<0)
                        mind[i][j]++;
                    if(j<c-1 && mind[i][j+1]<0)
                        mind[i][j]++;
                    if(j>0 && i<r-1 && mind[i+1][j-1]<0)
                        mind[i][j]++;
                    if(i<r-1 && mind[i+1][j]<0)
                        mind[i][j]++;
                    if(i<r-1 && j<c-1 && mind[i+1][j+1]<0)
                        mind[i][j]++;

                }
            }
        }
    }
    public String toString() {
        String str="";
        for (int i = 0; i<r;i++) {
            for (int j=0;j<c;j++) {
                str += (mind[i][j]<0)?"* " : mind[i][j]+" ";
            }
            str+="\n";
        }
        return str;
    }
}

public class MindSweeper {
    Mind mind=new Mind(10,20);
    public MindSweeper() {
        System.out.println(mind);
    }
    public static void main(String[] args) {
        new MindSweeper();
    }
}

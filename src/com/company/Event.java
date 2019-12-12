package com.company;

import java.util.Scanner;

class Event extends Game{

    private String text;
    private int scr1;
    int scr2;
    int hlh1, atc1, hlh2, atc2;

    public Event(String tx, int sc1, int sc2, int hl1, int hl2, int attack1, int attack2){
        this.text = tx;
        this.scr1 = sc1;
        this.scr2 = sc2;
        this.hlh1 = hl1;
        this.hlh2 = hl2;
        this.atc1 = attack1;
        this.atc2 = attack2;
    }


    public void question() {
        int ch;
        System.out.println(text);
        Scanner sc = new Scanner(System.in);
        ch = sc.nextInt();
        switch (ch) {
            case (1):
                score1 += scr1;
                break;
            case (2):
                score2 += scr2;
                break;
        }
    }

    public void event(){
            int ch;
            System.out.println(text);
            Scanner sc = new Scanner(System.in);
            ch = sc.nextInt();
            switch (ch) {
                case (1):
                    health += hlh1;
                    attack += atc1;
                    break;
                case (2):
                    health += hlh2;
                    attack += atc2;
                    break;
        }

    }

}

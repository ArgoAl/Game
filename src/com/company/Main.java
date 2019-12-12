package com.company;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    static Event start = new Event("Я думал ты уже не проснешься, дружок пирожок. Кто ты? \n 1 - маг (Атака = 10, Здоровье = 20) \n 2 - мечник (Атака = 3, Здоровье = 40) ", 0,0, 20, 40, 10, 3 );
    static Event troll = new Event("Тролль: ")

    public static void main(String[] args) {
        start.event();
        System.out.println(Game.attack + " " + Game.health);
    }
}

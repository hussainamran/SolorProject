package com.company;

import sun.security.provider.Sun;

public class Main {

    public static void main(String[] args) {
        SolarSystem milkway = new SolarSystem();
        milkway.sun = 1;
        milkway.moon = 2;
        milkway.planets = 3;


        milkway.sun = 2;
        milkway.moon = 24;
        milkway.planets = 31;


    }
}
package com.upol;

import java.util.HashSet;
import java.util.Set;

public class Main {

    private static Set<String> stakeHolders = new HashSet<>(4);

    public static void main(String[] args) {

/*
        stakeHolders.add("Upol");
        stakeHolders.add("Upol");
        stakeHolders.add("Tania");
        stakeHolders.add("Upol");

        System.out.println(String.join(", ", stakeHolders));
*/

        //Get all enums

/*        for(Environment env : Environment.values())
        {
            System.out.println(env.name() + " :: "+ env.getUrl());
        }*/

String stakeHoldersStr ="Muhammad Hasan (Development Manager), Bogdan Bobin (Performance Advocate), ";

        int stakeHoldersStrIndexLength = stakeHoldersStr.length() - 2 ;

        if ( stakeHoldersStr.lastIndexOf(",") == stakeHoldersStrIndexLength )
            stakeHoldersStr = stakeHoldersStr.substring(0, stakeHoldersStrIndexLength );

        System.out.println(stakeHoldersStr);

    }
}

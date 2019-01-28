package com.senith.hackerrank.oop.ch05;

class Soccer extends Sports{
    @Override
    String getName(){
        return "Soccer Class";
    }

    @Override
    void getNumberOfTeamMembers() {
        System.out.println( String.format("Each team has %d players in ", 11) + getName() );
    }
}
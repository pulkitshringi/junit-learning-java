package com.pulkit.courses;

public class Python implements Courses {
    @Override
    public boolean purchase(){
        System.out.println("python course purchased.");
        return true;
    }
}

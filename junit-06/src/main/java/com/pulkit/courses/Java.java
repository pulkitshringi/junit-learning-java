package com.pulkit.courses;

public class Java implements Courses{
    @Override
    public boolean purchase(){
        System.out.println("Java course purchased :)");
        return true;
    }
}

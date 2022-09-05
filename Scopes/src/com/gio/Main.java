package com.gio;

public class Main {
    public static void main(String[] args) {
        String varFour = "This is private to main";
        ScopeCheck scopeCheck = new ScopeCheck();
        scopeCheck.userInner();
        ScopeCheck.InnerClass innerClass = scopeCheck.new InnerClass();
//        System.out.println("varThree is not accessible hre " + innerClass.varThree);


//        System.out.println("scopeCheck private varOne is " + scopeCheck.getVarOne());
//        System.out.println(varFour);
//
//        scopeCheck.timesTwo();
//
//        System.out.println("------");
//        ScopeCheck.InnerClass innerClass = scopeCheck.new InnerClass();
//        innerClass.timesTwo();
    }
}

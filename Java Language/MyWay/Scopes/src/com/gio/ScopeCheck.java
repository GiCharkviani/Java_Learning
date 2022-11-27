package com.gio;

public class ScopeCheck {
    public int publicVar = 0;
    private int varOne = 1;

    public ScopeCheck() {
        System.out.println("ScopeCheck created, publicVar = " + varOne + ": varOne = " + varOne);
    }

    public int getVarOne() {
        return varOne;
    }

    public void timesTwo() {
        int varTwo = 2;
        for(int i = 0; i < 10; i++)
            System.out.println(i + " times two is " + i*varTwo);
    }

    public void userInner() {
        InnerClass innerClass = new InnerClass();
        System.out.println("varThree from outer class: " + innerClass.varThree);
        // despite of private access
        // modifier, field is still
        // accessible in outer class like its fields for inner class
    }

    public class InnerClass {
        private int varThree = 3;

        public InnerClass() {
            System.out.println("InnerClass created, varOne is " + varOne + " and varThree is " + varThree);
        }

        public void timesTwo() {
            System.out.println("varOne is still available here " + varOne);
            ScopeCheck.this.timesTwo(); // to specifically call parent method
            for(int i = 0; i < 10; i++)
                System.out.println(i + " times two is " + i* ScopeCheck.this.varOne); // to get access on parent class var
        }
    }
}

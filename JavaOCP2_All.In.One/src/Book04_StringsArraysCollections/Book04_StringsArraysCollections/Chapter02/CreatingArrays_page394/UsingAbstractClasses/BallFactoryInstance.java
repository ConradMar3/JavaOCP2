package Book04_StringsArraysCollections.Book04_StringsArraysCollections.Chapter02.CreatingArrays_page394.UsingAbstractClasses;

import Book03_ObjectOrientatedProgramming.Chapter01.WorkingWithRelatedClasses.WorkingWithRelatedClasses.Inheritance.SoftBall;

abstract class BallFactoryInstance extends Ball {
    public static SoftBall getBall(String s) {
        if (s.equalsIgnoreCase("SoftBall"))
            return new SoftBall();
        return null;
    }
}

package Book04_StringsArraysCollections.Book04_StringsArraysCollections.Chapter02.CreatingArrays_page394.UsingAbstractClasses;

import Book03_ObjectOrientatedProgramming.Chapter01.WorkingWithRelatedClasses.WorkingWithRelatedClasses.Inheritance.SoftBall;

public abstract class Ball {
    public abstract int hit(int batSpeed);

    //Ball b = new Ball(); // error: Ball is abstract

    private String userChoice;
    SoftBall b = BallFactoryInstance.getBall(userChoice);

}

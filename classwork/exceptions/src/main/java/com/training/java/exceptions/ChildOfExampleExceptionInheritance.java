package com.training.java.exceptions;

import java.io.FileNotFoundException;

class ChildOfExampleExceptionInheritance extends ExampleExceptionInheritance {
    @Override
    public void f() throws FileNotFoundException {}
}

package model;

import jdk.jshell.spi.ExecutionControl;

public abstract class FigureBase {
    public abstract double getPerimeter();
    protected String name;
    public abstract String getInfo();
    public abstract double getSquare() throws ExecutionControl;
}

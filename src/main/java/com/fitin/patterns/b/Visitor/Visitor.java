package com.fitin.patterns.b.Visitor;

public interface Visitor {
    String export(Shape... args);

    String visitDot(Dot dot);

    String visitCircle(Circle circle);

    String visitRectangle(Rectangle rectangle);

    String visitCompoundGraphic(CompoundShape cg);
}

package com.fitin.patterns.b.Visitor;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VisitorTest {
    @Test
    void test() throws IOException {
        var dot = new Dot(1, 10, 55);
        var circle = new Circle(2, 23, 15, 10);
        var rectangle = new Rectangle(3, 10, 17, 20, 30);

        CompoundShape compoundShape = new CompoundShape(4);
        compoundShape.add(dot);
        compoundShape.add(circle);
        compoundShape.add(rectangle);

        var c = new CompoundShape(5);
        c.add(dot);
        compoundShape.add(c);

        var exportVisitor = new XMLExportVisitor();
        var xml = exportVisitor.export(compoundShape);

        Path filePath = Path.of("src/test/java/com/fitin/patterns/b/Visitor/xml");
        String expected = Files.readString(filePath);

        assertEquals(expected, xml);
    }
}

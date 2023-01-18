package com.fitin.patterns.s.Decorator.v2;

import org.junit.jupiter.api.Test;

public class DecoratorTest {
    @Test
    void test() {
        var salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";
        var source = "src/test/java/com/fitin/patterns/s/Decorator/v2/SOURCE.txt";

        var encoded = new CompressionDecorator(
                new EncryptionDecorator(
                        new FileDataSource(source)
                )
        );
        encoded.writeData(salaryRecords);
        var plain = new FileDataSource(source);

        System.out.println("- Input ----------------");
        System.out.println(salaryRecords);
        System.out.println("- Encoded --------------");
        System.out.println(plain.readData());
        System.out.println("- Decoded --------------");
        System.out.println(encoded.readData());
    }
}

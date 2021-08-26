package pl.sda.inner;

public class OuterClass {

    String outerName;

    class InnerClass {
        String innerName;

        String getName() {
            return outerName + innerName;
        }
    }

    static class StaticNested {
        String name;

        String getName() {
            // Nie moge uzyc zewnetrznych pol :(
            return name;
        }
    }
}

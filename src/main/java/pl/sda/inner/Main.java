package pl.sda.inner;

public class Main {

    public static void main(String... args) {
        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        OuterClass.StaticNested nested = new OuterClass.StaticNested();
    }
}

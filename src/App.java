public class App {
    public static void main(String[] args) throws Exception {
        //тест
        var car = new Car("Toyota", 123);
        System.out.println("Hello, World!" + car.name);

        //Builder
        Builder builder = new Builder.InnerBuilder(1)
        .unnecessaryField(2).superUnnecessaryField(3).build();
        System.out.println(builder.toString());
    }
}



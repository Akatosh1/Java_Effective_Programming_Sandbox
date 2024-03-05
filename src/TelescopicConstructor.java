public class TelescopicConstructor {
    @SuppressWarnings("unused")
    private final int necessaryField;
    @SuppressWarnings("unused")
    private final int unnecessaryField;
    @SuppressWarnings("unused")
    private final int superUnnecessaryFiled;

    public TelescopicConstructor(int necessaryField){
        this(necessaryField, 0);
    }

    public TelescopicConstructor(int necessaryField, int unnecessaryField){
        this(necessaryField, unnecessaryField, 0);
    }

    public TelescopicConstructor(int necessaryField, int unnecessaryField, int superUnnecessaryFiled){
        this.necessaryField = necessaryField;
        this.unnecessaryField = unnecessaryField;
        this.superUnnecessaryFiled = superUnnecessaryFiled;
    }
}



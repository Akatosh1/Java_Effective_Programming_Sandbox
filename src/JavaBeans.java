public class JavaBeans {
    @SuppressWarnings("unused")
    private int necessaryField = -1;
    @SuppressWarnings("unused")
    private int unnecessaryField = 0;
    @SuppressWarnings("unused")
    private int superUnnecessaryField = 0;

    public JavaBeans(){}
    
    public void setUnnecessaryParams(int unnecessaryField){
        this.unnecessaryField = unnecessaryField;
    }

    public void setSuperUnnecessaryParams(int superUnecessaryField){
        this.superUnnecessaryField = superUnecessaryField;
    }
}

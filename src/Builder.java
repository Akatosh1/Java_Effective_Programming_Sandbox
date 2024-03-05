public class Builder {

    @SuppressWarnings("unused")
    private final int necessaryField;
    @SuppressWarnings("unused")
    private final int unnecessaryField;
    @SuppressWarnings("unused")
    private final int superUnnecessaryFiled;
    
    public static class InnerBuilder {
    
        private int necessaryField = -1;
        private int unnecessaryField = 0;
        private int superUnnecessaryField = 0;

        public InnerBuilder(int necessaryField){
            this.necessaryField = necessaryField;
        }
        
        public InnerBuilder unnecessaryField(int val){
            unnecessaryField = val;
            return this;
        }

        public InnerBuilder superUnnecessaryField(int val){
            superUnnecessaryField = val;
            return this;
        }

        public Builder build(){
            return new Builder(this);
        }
    }

    private Builder(InnerBuilder builder){
        necessaryField = builder.necessaryField;
        unnecessaryField = builder.unnecessaryField;
        superUnnecessaryFiled = builder.superUnnecessaryField;
    }

    @Override
    public String toString(){
        return Integer.toString(this.necessaryField) + Integer.toString(unnecessaryField) +
        Integer.toString(superUnnecessaryFiled);
    }
}

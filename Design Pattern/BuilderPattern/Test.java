public class Test {
    private int testEl1;
    private int testEl2;
    private int testEl3;
    private int testEl4;
    private int testEl5;

    public static class Builder {
        private final int testEl1;
        private final int testEl2;
        private int testEl3 = 0;
        private int testEl4 = 0;
        private int testEl5 = 0;

        public Builder(int testEl1, int testEl2){
            this.testEl1 = testEl1;
            this.testEl2 = testEl2;
        }

        public Builder testEl3(int testEl3){
            this.testEl3 = testEl3;
            return this;
        }

        public Builder testEl4(int testEl4){
            this.testEl4 = testEl4;
            return this;
        }

        public Builder testEl5(int testEl5){
            this.testEl5 = testEl5;
            return this;
        }

        public Test build() {
            return new Test(this);
        }
    }
    private Test(Builder builder){
        testEl1 = builder.testEl1;
        testEl2 = builder.testEl2;
        testEl3 = builder.testEl3;
        testEl4 = builder.testEl4;
        testEl5 = builder.testEl5;
    }

    public static void main(String[] args){
        Test test = new Builder(1,0).testEl3(5).testEl5(10).build();
    }
}
package Lab7;

public class Airplane {

    public static class Wing {
        private int weight;

        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        public Wing() {
            this.weight = 10;
        }
    }

    Wing w = new Wing();
}

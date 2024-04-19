import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

class PythagoreanTriplet {

    private final int a;
    private final int b;
    private final int c;
    PythagoreanTriplet(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    static TripletListBuilder makeTripletsList() {
        return new TripletListBuilder();
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PythagoreanTriplet that = (PythagoreanTriplet) o;
        if (a != that.a) return false;
        if (b != that.b) return false;
        return c == that.c;
    }
    @Override
    public int hashCode() {
        int result = a;
        result = 31 * result + b;
        result = 31 * result + c;
        return result;
    }
    static class TripletListBuilder {
        private int n;
        private int maxFactor = 0;
        TripletListBuilder thatSumTo(int sum) {
            this.n = sum;
            return this;
        }
        TripletListBuilder withFactorsLessThanOrEqualTo(int maxFactor) {
            if (maxFactor > 0) this.maxFactor = maxFactor;
            return this;
        }
        List<PythagoreanTriplet> build() {
            List<PythagoreanTriplet> triplets = new ArrayList<>();
            int N = this.n;
            if (this.maxFactor > 0) {
                N = this.maxFactor;
            }
            IntStream.range(1, this.n).forEachOrdered(a -> {
                IntStream.range(a, this.n - a).forEachOrdered(b -> {
                    int c = this.n - a - b;
                    if (a*a + b*b == c*c) {
                        if (maxFactor > 0 && c <= this.maxFactor) {
                            triplets.add(new PythagoreanTriplet(a,b,c));
                        } else if (maxFactor <= 0) {
                            triplets.add(new PythagoreanTriplet(a,b,c));
                        }
                    }
                });
            });
            return triplets;
        }
    }

}
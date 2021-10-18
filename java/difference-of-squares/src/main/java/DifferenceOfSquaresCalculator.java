import java.util.stream.IntStream;

class DifferenceOfSquaresCalculator {

    int computeSquareOfSumTo(int input) {
        IntStream numbersUpToInput = IntStream.range(0, input + 1);
        return (int) Math.pow(numbersUpToInput.sum(), 2);
    }

    int computeSumOfSquaresTo(int input) {
        IntStream numbersUpToInput = IntStream.range(0, input + 1).map((i) -> (int) Math.pow(i, 2));
        return (int) numbersUpToInput.sum();
    }

    int computeDifferenceOfSquares(int input) {
        return this.computeSquareOfSumTo(input) - this.computeSumOfSquaresTo(input);
    }

}

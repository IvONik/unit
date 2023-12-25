package les4.Task4;

class Calculator {
    private MathOperations mathOperations;

    public Calculator(MathOperations mathOperations) {
        this.mathOperations = mathOperations;
    }

    public int add(int a, int b) {
        return mathOperations.add(a, b);
    }
}
interface MathOperations {
    int add(int a, int b);
}
class DummyMathOperations implements MathOperations {
    @Override
    public int add(int a, int b) {
// В данном случае, фиктивный объект не выполняет никаких операций и всегда возвращает 0.
        return 0;
    }
}
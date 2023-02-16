package Practices.doitjava;

public class GenericOutput<T> {
    private T result;


    public GenericOutput() {
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }
}

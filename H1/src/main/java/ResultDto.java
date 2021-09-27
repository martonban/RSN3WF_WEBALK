import java.util.List;

public class ResultDto {
    private String a;
    private String b;
    private String operator;
    private List<String> errorlist;
    private boolean error;

    public Double getResult() {
        return result;
    }

    public void setResult(Double result) {
        this.result = result;
    }

    private Double result;


    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public List<String> getErrorlist() {
        return errorlist;
    }

    public void setErrorlist(List<String> errorlist) {
        this.errorlist = errorlist;
    }

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }
}

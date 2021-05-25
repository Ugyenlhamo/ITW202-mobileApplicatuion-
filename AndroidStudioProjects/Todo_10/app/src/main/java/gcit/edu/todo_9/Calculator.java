package gcit.edu.todo_9;

public class Calculator {
    public enum operator{ADD,SUB,MUL,DIV};
    public double add(double operand1,double operand2){
        return operand1+operand2;
    }
    public double sub(double operand1,double operand2){
        return operand1-operand2;
    }
    public double mul(double operand1,double operand2){
        return operand1*operand2;
    }
    public double div(double operand1,double operand2){
        return operand1/operand2;
    }
}

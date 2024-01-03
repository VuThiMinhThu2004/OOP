package composite;

public abstract class LogicalUnit {
    LogicalUnit operand1;
    LogicalUnit operand2;

    public LogicalUnit(LogicalUnit op1, LogicalUnit op2) {
        operand1 = op1;
        operand2 = op2;
    }


    public abstract LogicalUnit();
}

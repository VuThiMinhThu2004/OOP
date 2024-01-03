package composite;

public class LogicalCreate {
    public LogicalUnit setLogical(int type) {
        if (type == Operator.AND) {
            return new AndUnit(null, null);
        }
    }
}

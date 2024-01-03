import java.util.List;

public class ShapeUtil {
    /**
     * Javadoc.
     */
    public String printInfo(List<GeometricObject> g) {
        String info = "";
        String if1 = "";
        String if2 = "";

        for (int i = 0; i < g.size(); i++) {
            if (g.get(i) instanceof Circle) {
                if1 += g.get(i).getInfo() + "\n";
            } else {
                if2 += g.get(i).getInfo() + "\n";
            }
        }

        if (!if1.isEmpty()) {
            info = "Circle:\n" + if1;
        }
        if (!if2.isEmpty()) {
            info += "Triangle:\n" + if2;
        }

        return info;
    }
}

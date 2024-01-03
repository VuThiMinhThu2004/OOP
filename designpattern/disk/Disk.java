import java.util.List;

public class Disk implements BaseComponent {
    public String capacity;
    List<BaseComponent> child;

    @Override
    public int getSize() {
        return 1;
    }
}

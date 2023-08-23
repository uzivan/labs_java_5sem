package Lab16;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Collection;
public class Converting<T> {
    public static <T> Collection<T> remove_repetitions(Collection<T> ls1) {
        Collection<T> ls2 = new LinkedHashSet<T>(ls1);
        return ls2;
    }
}

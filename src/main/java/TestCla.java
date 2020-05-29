import org.hibernate.StaleObjectStateException;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TestCla {
    public static void main(String[] args) {
        final var testList = getRandomNullList();
    }

    public static List<Object> getRandomNullList() {
        final List<Object> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            final var value = random.nextInt(1235253) % 2 == 0 ? null : new Object();
            list.add(value);
        }
        return list;
    }

    public static Object throwIllegalStateException(final Object value) {
        if (value == null) {
            throw new IllegalStateException();
        }else {
            return value;
        }
    }
}

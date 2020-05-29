package test.second;

import test.Girl;
import test.Sex;

import java.util.List;

public class Man implements Sex {
    final Girl girl;

    public Man(Girl girl) {
        this.girl = girl;
    }

    public static List<String> getList() {
        return List.of();
    }

    @Override
    public void fuck() {
        girl.fuck();
    }
}

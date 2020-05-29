package test;

import test.second.Man;

import java.util.List;

public class Girl implements Sex {

    public List<String> test(){
        return Man.getList();
    }

    @Override
    public void fuck() {
        System.out.println("I have a children");
    }
}

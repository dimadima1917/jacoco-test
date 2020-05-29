package patterns.observer;

import io.reactivex.Observable;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Observable<String> observable = Observable.fromIterable(Arrays.asList("one", "twt", "three"));
        observable.subscribe((action)-> System.out.println(String.format("Executed action %s", action)));
    }
}

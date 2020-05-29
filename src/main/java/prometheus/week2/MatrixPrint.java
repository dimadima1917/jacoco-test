package prometheus.week2;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.IntStream;

import static java.lang.String.format;

public class MatrixPrint {
    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        String json = "{ \"color\":\"null\", \"type\" : \"BMW\" }";
        Car car = mapper.readValue(json, Car.class);

        var car1 = Optional.ofNullable(car)
                .map(Car::getColor);
        System.out.println(car1.isPresent());
        /*List<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i + "_row");
        }
        System.out.println(new Random().nextInt(1));
        System.out.println(list);
        //System.out.println(list.subList(0, 1));
        //range 2 c 3ro
        final var range = 2;
        final var fromRowIndex = 0;
        //System.out.println(list.get(fromRowIndex));
        List<String> empty = new ArrayList<>();
        IntStream.range(Math.max((fromRowIndex + 1) - range, 0),
                        Math.min((fromRowIndex + range), list.size())).forEach((action) -> {
            empty.add(list.get(action));
        });

        System.out.println(empty);*/
        //System.out.println(list.size() / 2);
        /*System.out.println(0/2);
        list.forEach(System.out::println);*/
        //getTestMatrices().forEach(MatrixPrint::printSortedMatrix);
    }

    private static List<Integer[][]> getTestMatrices() {
        final Integer[][] matrix1x1 = {{1}};
        final Integer[][] matrix2x2 = {{1, 2},
                                       {3, 4}};
        final Integer[][] matrix3x3 = {{1, 2, 3},
                                       {4, 5, 6},
                                       {7, 8, 9}};

        return List.of(matrix1x1,
                       matrix2x2,
                       matrix3x3);
    }

    private static void printSortedMatrix(final Integer[][] matrix) {
        final String lineSeparator = "##################################################-%s";
        System.out.println(format(lineSeparator, "start"));
        for (int matrixRow = 0; matrixRow < matrix.length; matrixRow++) {
            System.out.println("");
            for (int matrixColumn = 0; matrixColumn < matrix[matrixRow].length; matrixColumn++) {
                System.out.print(matrix[matrixRow][matrixColumn]);
            }
        }
        System.out.println("");
        System.out.println(format(lineSeparator, "finish"));
    }
}

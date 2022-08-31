package by.academy.homework7;

import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task1 {
	
	public static void main(String[] args) {
		List<Integer> list = generateIntList(100, 100);
		
		List<Double> newList = list
				.stream()
				.map(value -> value * Math.PI - 20)
				.filter(value -> value < 100)
				.sorted()
				.skip(3)
				.collect(Collectors.toList());
		
		
		Map<Double, String> mapList = newList
				.stream()
				.collect(Collectors.toMap(k -> k, v -> ("Number: " + v), (v1,v2) -> v1));
		
			mapList.forEach((k,v)->System.out.println(k + " " + v));
	}

	private static List<Integer> generateIntList(Integer seed, Integer size) {
		Supplier<Integer> s = () -> new Random().nextInt(seed);
		return Stream.generate(s).limit(size).collect(Collectors.toList());
	}
}

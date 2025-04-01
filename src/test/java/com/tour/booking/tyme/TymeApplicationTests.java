package com.tour.booking.tyme;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TymeApplicationTests {

	@Test
	void contextLoads() {
        List<Integer> pageNumbers = IntStream.rangeClosed(1, 10).map(i -> i*2).boxed().peek(System.out::println).limit(3).collect(Collectors.toList());
	}
	

}

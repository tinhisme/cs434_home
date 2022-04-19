import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collections;

import org.junit.jupiter.api.Test;

class ArrayOfNumberTest {

	@Test
	void testGetMinValue1() {
		ArrayOfNumber a = new ArrayOfNumber();
		int[] arr = {5,2,1,4,6};
		a.setArr(arr);
		// thư viện để tìm min trong 1 mảng
		int min = Arrays.stream(arr).min().getAsInt();
		assertEquals(a.getMinimumValue(arr), min);
	}
	
	@Test
	void testGetMinValue2() {
		ArrayOfNumber a = new ArrayOfNumber();
		int[] arr = {1,1,1,1,1};
		a.setArr(arr);
		int min = Arrays.stream(arr).min().getAsInt();
		assertEquals(a.getMinimumValue(arr), min);
	}
	
	@Test
	void testGetMinValue3() {
		ArrayOfNumber a = new ArrayOfNumber();
		int[] arr = {1,1,1,1,0};
		a.setArr(arr);
		int min = Arrays.stream(arr).min().getAsInt();
		assertEquals(a.getMinimumValue(arr), min);
	}
	
	@Test
	void testSortDesc1() {
		ArrayOfNumber a = new ArrayOfNumber();
		int[] arr = {5,2,1,4,6};
		a.setArr(arr);
		a.descSort(arr);
		int arrTest[] =  {6,5,4,2,1};
		assertArrayEquals(arr, arrTest);
	}
	
	@Test
	void testSortDesc2() {
		ArrayOfNumber a = new ArrayOfNumber();
		int[] arr = {1,1,2,1,6};
		a.setArr(arr);
		a.descSort(arr);
		int arrTest[] =  {6,2,1,1,1};
		assertArrayEquals(arr, arrTest);
	}
	
	@Test
	void testSortDesc3() {
		ArrayOfNumber a = new ArrayOfNumber();
		int[] arr = {1,1,1,1,6};
		a.setArr(arr);
		a.descSort(arr);
		int arrTest[] =  {6,1,1,1,1};
		assertArrayEquals(arr, arrTest);
	}

}

package TDD.tdd;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
public class Tdd 
{
	Project p;
	@BeforeEach
	void setup()
	{
		p=new Project();
	}
	@Test
	void test() {
		assertEquals("BCD",p.input("ABCD"));
	}
	@Test
	void test1() {
		assertEquals("CD",p.input("AACD"));
	}
	@Test
	void test2() {
		assertEquals("BCD",p.input("BACD"));
	}
	@Test
	void test3() {
		assertEquals("BBAA",p.input("BBAA"));
	}
	@Test
	void test4() {
		assertEquals("BAA",p.input("AABAA"));
	}
}

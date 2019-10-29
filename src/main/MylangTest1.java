package main;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class MylangTest1 {
	private Mylang ml;
	@BeforeEach
	void setUp() throws Exception {
		ml=new Mylang();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testJudge() {
		String buff="abcd";
		assertEquals(false, ml.Judge(buff));
	}
	
	@Test
	void testConnect() {
		String []str=new String[6];
		int n=5;
		str[0]="";
		for(int i=1;i<=n;i++)
		{
			str[i]="ab";
		}
		//System.out.println(ml.Connect(str,n));
		assertEquals("AbABABABABABABABAB", ml.Connect(str,n));
	}

}

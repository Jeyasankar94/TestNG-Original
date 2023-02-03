package com.hyr.dataProvider;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PassingStringData {

	@Test(dataProvider = "lt6")
	public void TestLogin(Object[] s) {
		System.out.println(s[0] +">>>"+s[1]);
		//System.out.println(s);
		//System.out.println(username +" >>>"+password);
		/*for(int i=0;i<s.length;i++) {
			System.out.println(s[i]);
		}
		System.out.println(">>>>");*/
	}

	@DataProvider
	public String[] loginData1() {
		String[] data = new String[] {
				"abcd",
				"efgh",
				"ijkl",
		};
		return data;
	}
	@DataProvider(name="lt2")
	public Integer[] loginData2() {
		Integer[] data = new Integer[] {
				123,
				456,
				789,
		};
		return data;
	}
	@DataProvider(name="lt3")
	public String[][] loginData3() {
		String[][] data = new String[][] {
			{"abcd","123","pqrs","12iyut"},
			{"efgh","9876"},
			{"ijkl","nopo","5610"}
		};
		return data;
	}
	@DataProvider(name="lt4")
	public Iterator<String> loginData4() {
		List<String> data = new ArrayList<String>();
		data.add("jeya");
		data.add("sankar");
		return data.iterator();
	}
	@DataProvider(name="lt5")
	public Iterator<String> loginData5() {
		Set<String> data = new HashSet<String>();
		data.add("jeya");
		data.add("sankar");
		return data.iterator();
	}
	@DataProvider(name="lt6")
	public Iterator<Object> loginData6() {
		Set<Object> data = new LinkedHashSet<Object>();
		data.add(new Object[] {"Kavi",6547});
		data.add(new Object[] {"Sakthi",6767});

		return data.iterator();
	}
}


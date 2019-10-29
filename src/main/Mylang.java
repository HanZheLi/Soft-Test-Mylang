package main;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.text.WordUtils;
public class Mylang {
	public boolean Judge(String buff) {		
		return StringUtils.isBlank(buff);
	}
	public void solution(String buff) {
		if(StringUtils.isBlank(buff)!=true)
		{
			
		}
		StringUtils.indexOf(buff,"a");
	
	}
	
	public String Connect(String[] str,int n) {
		
		for(int i=1;i<=n;i++)
		{
			if(StringUtils.isBlank(str[i]))
				return null;
		}
		String temp;
		for(int i=1;i<=n;i++)
		{
			str[i]=StringUtils.capitalize(str[i]);
			//System.out.println(str[i]);
		}

		temp=StringUtils.getCommonPrefix(str[1],str[2],str[3]);
		//System.out.println(temp);
		if(temp=="")
		{
			System.out.println("The Prefix is NULL");
		}
		else if(temp.length()>3)//长度大于3
		{
			for(int i=1;i<=n-1;i++)
			{
				temp+=StringUtils.join(str[i],str[1+i]);
			}
		}
		else//长度大于等于0，小于等于3
		{
			for(int i=1;i<=n;i++)
			{
				str[i]=StringUtils.upperCase(str[i]);
			}
			for(int i=1;i<=n-1;i++)
			{
				temp+=StringUtils.join(str[i],str[1+i]);
			}
		}
		return temp;
	}
	
	public String[] Create(int n) {
		String []str=new String [n+1];
		String chars="aaaaaab";
		str[0]="";
		for(int i=1;i<=n;i++)
		{
			str[i]=RandomStringUtils.random(n,chars);
			System.out.println(str[i]);
		}
		return str;
	}
	public static void main(String args[]) {
		int n=5;
		Mylang ml=new Mylang();
		String []str=ml.Create(5);		
		System.out.println(ml.Connect(str,n));
	}
}

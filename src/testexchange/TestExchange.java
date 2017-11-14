package testexchange ;
/**
*@author LM
*@file:TestExchange.java
*@package: testexchange
*@project: testexchange
*@date time:2017年11月14日下午10:27:36
*@location: https://github.com/ThegreatMZ/16-10-.git
 */
import java.util.Scanner;

import testexchange.Exchange.MyException;
 class Exchange{
String s;
private int y;
Exchange(){}
Exchange(String s){this.s=s;}
int getY(){return y;}
void setY(int y){this.y=y;}
void Change16To10()
{
int y=0;
int i,k;
for( i=0; i<s.length() ;i++)
{
k=Change(s.charAt(i));
y+=k*Math.pow(16,s.length()-(i+1));
}
System.out.println(y); 
System.out.println(" 成功转换");
}
int Change(char h){
int x;
switch(h)
{
case'0': x=0;break;
case'1': x=1;break;
case'2': x=2;break;
case'3': x=3;break;
case'4': x=4;break;
case'5': x=5;break;
case'6': x=6;break;
case'7': x=7;break;
case'8': x=8;break;
case'9': x=9;break;
case'a': x=10;break;
case'b': x=11;break;
case'c': x=12;break;
case'd': x=13;break;
case'e': x=14;break;
case'f': x=15;break;
default:
	throw new MyException();
}
return x;
}
class MyException extends RuntimeException
{
public MyException(){}
public MyException(String msg){super(msg);
}
public void printcount()
{
System.out.println("16 进制数输入 不 正确!");
}
}
 }
public class TestExchange{
public static void main(String args[])
{
System.out.println("请输入一个16进制数:");
Scanner S=new Scanner(System.in);
String s=S.next(); Exchange E=new Exchange(s);
try
{
	E.Change16To10();
}
catch(MyException e)
{
	e.printcount();
    }
  }
}



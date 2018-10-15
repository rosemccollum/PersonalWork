package objectprogramming;

public class Cat {
private int age;
private int sleep;
public Cat()
{
	age = 5;
	sleep = 15;
}
public int sleepMore()
{
	return sleep+1;
}
public int sleepLess()
{
	return sleep-1;
}
public int catBirthday()
{
	return age+1;
}

}

2. Write a Java Program to find area of Square, Rectangle and Circle using Method Overloading.

class Main
{
    void area(float x)
    {
        System.out.println("the area of the square is "+Math.pow(x, 2)+" sq units");
    }
    void area(float x, float y)
    {
        System.out.println("the area of the rectangle is "+x*y+" sq units");
    }
    void area(double z)
    {
        double a = 3.14 * z * z;
        System.out.println("the area of the circle is "+z+" sq units");
    }

     public static void main(String args[]) 
	{
	   Main ob = new Main();
	   ob.area(4);
	   ob.area(11,13);
	   ob.area(3.5);
        }
}

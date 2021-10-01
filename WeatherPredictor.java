class WeatherPredictor
{
public static void main(String[] crazy)
{
	float temp=30.09f;
	float humid=20.09f;
Weather obj=new Weather(temp,humid);
System.out.println(obj.seasons[2]);
System.out.println(obj.temperature);
System.out.println(obj.rainy);
System.out.println(obj.humidity);
System.out.println(obj.seasonalflower="Jasmine");
float temp1=30.09f;
	float humidi=20.09f;
Weather obj1=new Weather(temp1,humidi);
System.out.println(obj1.seasons[2]);
System.out.println(obj1.temperature);
System.out.println(obj1.rainy);
System.out.println(obj1.humidity);
System.out.println(obj1.seasonalflower="Jasmine");
float temper=30.09f;
	float humidity=20.09f;
Weather obj2=new Weather(temper,humidity);
System.out.println(obj.seasons[2]);
System.out.println(obj.temperature);
System.out.println(obj.rainy);
System.out.println(obj.humidity);
System.out.println(obj.seasonalflower="Jasmine");
System.out.println("no of instances are:" + Weather.count);


}
}
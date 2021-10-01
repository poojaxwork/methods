class Weather
{

String[] seasons={"summer","winter","Spring"};
float temperature;
boolean rainy;
float humidity;
String seasonalflower;
static int count=0;


Weather(float temperature,float humidity)
{
	count++;
	this.temperature=temperature;
	this.humidity=humidity;
	
}
static int count(){

	return count;
	
	
}





}
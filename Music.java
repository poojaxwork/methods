class Music
{
String type="Melody";
String[] instruments;
int noofsingers;
String playbacksinger;
String notes;
static int count;
Music(String[] instruments,int noofsingers)
{
	 
	count++;
	this.instruments=instruments;
	this.noofsingers=noofsingers;
	
	
	
}
static int count()
{
	
	return count;
}



}
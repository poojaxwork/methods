class MusicCreater
{
public static void main(String[] rhythms)
{
	
	int no=10;
	String[] pp={"Violin","guitar","piano"};
	
Music ref=new Music(pp,no);
System.out.println(ref.type);
System.out.println(ref.instruments[0]);
System.out.println(ref.noofsingers);
System.out.println(ref.playbacksinger="Arjith singh");
System.out.println(ref.notes="minimum");


int number=8;
	String[] instru={"Violin","guitar","piano"};
	
Music ref1=new Music(instru,number);
System.out.println(ref1.type);
System.out.println(ref1.instruments[1]);
System.out.println(ref1.noofsingers);
System.out.println(ref1.playbacksinger="Jubin nutiyal");
System.out.println(ref1.notes="minimum");


int num=4;
	String[] pq={"Violin","guitar","piano"};
	
Music ref2=new Music(pq,num);
System.out.println(ref2.type);
System.out.println(ref2.instruments[1]);
System.out.println(ref2.noofsingers);
System.out.println(ref2.playbacksinger="Sonu Nigam");
System.out.println(ref2.notes="minimum");
System.out.println("total no of instances are:" + Music.count());

}
}
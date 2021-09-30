class IpodRunner
{
	public static void main(String[] args)
	{
		Ipod ref=new Ipod();
		ref.seriesv=12.3f;
		ref.price=78.99f;
		ref.storage=256;
		ref.pixel="566*122 pixel";
		ref.update=true;
		ref.communicating();
		Ipod ref1=new Ipod();
		ref1.seriesv=12.3f;
		ref1.price=68.99f;
		ref1.storage=127;
		ref1.pixel="566*122 pixel";
		ref1.update=false;
		ref1.resolution();
		Ipod ref2=new Ipod();
		ref2.seriesv=11.7f;
		ref2.price=78.99f;
		ref2.storage=256;
		ref2.pixel="566*122 pixel";
		ref2.update=true;
		ref2.resolution();
		
	}
	
}
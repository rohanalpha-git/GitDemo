package iterator;

	public class Laptop {
		int ram;
		int screenSize;
		String processorName;
		public Laptop(int ram, int screenSize, String processorName )
		{
			this.processorName=processorName;
			this.ram=ram;
			this.screenSize=screenSize;
			
		}
		@Override
		public String toString()
		{
			return "Laptop [Ram = "+ram+" Screen Size = "+screenSize+" Processor name = "+processorName+ "]";
		}
	

}

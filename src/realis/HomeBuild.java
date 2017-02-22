package realis;

import interf.HomeHeight;
import interf.HomeLength;
import interf.HomeWidth;

public class HomeBuild {

	HomeHeight height;
	HomeWidth width;
	HomeLength length;
	
	public HomeBuild (HomeHeight height, HomeWidth width, HomeLength length){
		this.height=height;
		this.width=width;
		this.length=length;
	}
	
	public void action(){
		height.printHeight();
		width.printWidht();
		length.printLenght();
	}
}

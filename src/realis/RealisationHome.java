package realis;

import homeImpl.HomeOneImplHeight;
import homeImpl.HomeOneImplLenght;
import homeImpl.HomeOneImplWidth;

public class RealisationHome {

	public static void main(String[] args) {
		
		HomeOneImplHeight homeOneImplHeight = new HomeOneImplHeight();
		HomeOneImplWidth homeOneImlWidth = new HomeOneImplWidth();
		HomeOneImplLenght homeOneImplLenght = new HomeOneImplLenght();
		
		HomeBuild home =  new HomeBuild(homeOneImplHeight, homeOneImlWidth, homeOneImplLenght);
		home.action();

	}

}

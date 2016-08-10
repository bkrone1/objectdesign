
public class Sundae {
	
	int scoops = 0;
	String iceCream = null;
	String cone = null;
	boolean nuts = false;
	boolean banana = false;
	boolean cherry = false;
	boolean hotfudge = false;
	boolean caramel = false;
	boolean candy = false;
	boolean cookie = false;
	
	
	public Sundae(int scoops, String iceCream, String cone, boolean nuts, boolean banana, boolean cherry,
			boolean hotfudge, boolean caramel, boolean candy, boolean cookie) {
		super();
		this.scoops = scoops;
		this.iceCream = iceCream;
		this.cone = cone;
		this.nuts = nuts;
		this.banana = banana;
		this.cherry = cherry;
		this.hotfudge = hotfudge;
		this.caramel = caramel;
		this.candy = candy;
		this.cookie = cookie;
	}
	
	public Sundae() {
	}


	public int getScoops() {
		return scoops;
	}


	public void setScoops(int scoops) {
		this.scoops = scoops;
	}


	public String getIceCream() {
		return iceCream;
	}


	public void setIceCream(String iceCream) {
		this.iceCream = iceCream;
	}


	public String getCone() {
		return cone;
	}


	public void setCone(String cone) {
		this.cone = cone;
	}


	public boolean isNuts() {
		return nuts;
	}


	public void setNuts(boolean nuts) {
		this.nuts = nuts;
	}


	public boolean isBanana() {
		return banana;
	}


	public void setBanana(boolean banana) {
		this.banana = banana;
	}


	public boolean isCherry() {
		return cherry;
	}


	public void setCherry(boolean cherry) {
		this.cherry = cherry;
	}


	public boolean isHotfudge() {
		return hotfudge;
	}


	public void setHotfudge(boolean hotfudge) {
		this.hotfudge = hotfudge;
	}


	public boolean isCaramel() {
		return caramel;
	}


	public void setCaramel(boolean caramel) {
		this.caramel = caramel;
	}


	public boolean isCandy() {
		return candy;
	}


	public void setCandy(boolean candy) {
		this.candy = candy;
	}


	public boolean isCookie() {
		return cookie;
	}


	public void setCookie(boolean cookie) {
		this.cookie = cookie;
	}

	@Override
	public String toString() {
		return "So just to recap, you would like " + scoops + " scoops of " + iceCream + " on a " + cone + " cone, and it is " + nuts + " that you want nuts and also " + banana + " \nthat you would like a banana. You also said " + cherry + " to wanting a cherry on top and it's also " + hotfudge + " you want your sundae covered in hot fudge. \nWhile it is also " + caramel + 
			" that you want caramel topping to go long with it. And you said " + candy + " and " + cookie + " in regards to our famous 'Candy Medoly' \nand crushed Oreos.";
	}
	
	
	
	
	

}

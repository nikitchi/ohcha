package ca.ubc.cpsc310.gitlab.client.user;

import java.util.ArrayList;

import java.util.List;

import ca.ubc.cpsc310.gitlab.client.products.ProductItem;

public class User implements IUser {

	
	private static final long serialVersionUID = -4678920906536621479L;
	
	private List<ProductItem> shoppingCart = new ArrayList<ProductItem>();
	private List<ProductItem> wishList = new ArrayList<ProductItem>();
	
	private String name;
	private String language;
	private int lastUpdated;

	
	public User()
	{
		
<<<<<<< HEAD
=======

>>>>>>> 8488bc9a8a1b5862ba91374a92017d352ba9fdd0
	}
	
	@Override
	public String getLanguage() {
		return language;
	}

	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public int getLastUpdated() {
		return lastUpdated;
	}

	@Override
	public List<ProductItem> getWishList() {
		return wishList;
	}

	@Override
	public List<ProductItem> getShoppingCart() {
		return shoppingCart;
	}

	@Override
	public void setLanguage(String language) {
		this.language = language;
		
	}

	@Override
	public void setName(String name) {
		this.name = name;
		
	}

	@Override
	public void addItemToWishList(ProductItem o) {
		this.wishList.add(o);
		
	}
	@Override
	
	public void removeItemFromWishList(ProductItem o) {
		this.wishList.remove(o);
	}
	
	@Override
	public void addItemToShoppingCart(ProductItem o) {
		this.shoppingCart.add(o);
<<<<<<< HEAD
		
=======
>>>>>>> 8488bc9a8a1b5862ba91374a92017d352ba9fdd0
	}

	@Override
	public void removeItemFromShoppingCart(ProductItem o) {
		this.shoppingCart.remove(o);
	}

<<<<<<< HEAD

=======
>>>>>>> 8488bc9a8a1b5862ba91374a92017d352ba9fdd0
}

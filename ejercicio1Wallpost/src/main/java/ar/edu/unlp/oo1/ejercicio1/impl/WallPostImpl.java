package ar.edu.unlp.oo1.ejercicio1.impl;

import ar.edu.unlp.oo1.ejercicio1.WallPost;

/**
 * Completar esta clase de acuerdo a lo especificado en el cuadernillo
 *
 */
public class WallPostImpl implements WallPost {
	private String text;
	private int cant_likes;
	private boolean destacado;
	
	/**
	 * Complete con su implementación
	 */
	//constructor
	public WallPostImpl() {
		this.text = "Undefined post";
		this.cant_likes = 0;
		this.destacado = false;
	}
	
	/*
	 * Este mensaje se utiliza para que una instancia de Wallpost se muestre de forma adecuada
	 */
    @Override
    public String toString() {
        return "WallPost {" +
            "text: " + getText() +
            ", likes: '" + getLikes() + "'" +
            ", featured: '" + isFeatured() + "'" +
            "}";
    }
    
    //metodos
    
    public String getText() {
    	return this.text;
    }
    
    public void setText(String text) {
    	this.text = text;
    }
    
    public WallPost text (String text) {
    	this.setText(text);
    	return this;
    }

    public int getLikes() {
    	return this.cant_likes;
    }
    
    public WallPost like() {
    	this.cant_likes++;
    	return this;
    }
    
    public WallPost dislike() {
    	if (this.cant_likes > 0)
    		this.cant_likes--;
    	return this;
    }
    
    public boolean isFeatured() {
    	return this.destacado;
    }
    
    public WallPost toggleFeatured() {
    	if (this.destacado)
    		this.destacado = false;
    	else
    		this.destacado = true;
    	return this;
    }
}

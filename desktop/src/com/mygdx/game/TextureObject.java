package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class TextureObject extends Entity {
	
	private Texture tex;
	public Boolean isAIControlled = true;
	
	public TextureObject() {
		
	}
	
	public TextureObject(String t, float x, float y, float speed, Boolean isAIControlled) {
		super(x,y, Color.RED, speed);
		this.isAIControlled = isAIControlled;
		tex = new Texture(Gdx.files.internal(t));
	}
	
	public Texture getTexture() {
		return tex;
	}

	public void setTexture(Texture t) {
		tex = t;
	}
	
	public void draw(SpriteBatch batch) {
		batch.draw(getTexture(), getX(), getY(), getTexture().getWidth(), getTexture().getHeight());
	}

	public void update() {
		System.out.println("This texture object has a width of " + getTexture().getWidth() + " and a height of " + getTexture().getHeight());
		
	}
	
	public void movement() {
		if (isAIControlled) {
			AIMovement();
		} else {
			userMovement();
		}
	}
	
	public void userMovement() {
		if (Gdx.input.isKeyPressed(Keys.LEFT)) {
			float x = getX() - getSpeed() * Gdx.graphics.getDeltaTime();
			setX(x);
		} if (Gdx.input.isKeyPressed(Keys.RIGHT)) {
			float x = getX() + getSpeed() * Gdx.graphics.getDeltaTime();
			setX(x);
		}
	}
	
	public void AIMovement() {
		setY(getY() - getSpeed());
		
		if (getY() <= 0) {
			setY(400);
		}
	}
	
}
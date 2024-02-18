package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public class Circle extends Entity {
	
	private float radius;
	
	public Circle() {
		
	}
	
    //parameterized constructor
    public Circle(float x, float y, Color color, float speed) {
        //attributes set based on parameters
        super(x,y,color,speed);
        radius = 25;
    }
    
    public void setRadius(float radius) {
    	this.radius = radius;
    }
	
    public float getRadius() {
    	return radius;
    }
    
    public void draw(ShapeRenderer shape) {
    	shape.setColor(getColor());
    	shape.circle(getX(),getY(),getRadius());
    }
    
    public void movement() {
    	if (Gdx.input.isKeyPressed(Keys.UP)) {
    		float y = getY() + getSpeed() * Gdx.graphics.getDeltaTime();
    		setY(y);
    	} if (Gdx.input.isKeyPressed(Keys.DOWN)) {
    		float y = getY() - getSpeed() * Gdx.graphics.getDeltaTime();
    		setY(y);
    	}
    }

	public void update() {
		System.out.println("This circle has a position of " + getX() + "," + getY() + ". It has a radius of: " + getRadius());		
	}
}
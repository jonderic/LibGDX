package com.mygdx.game;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;


public abstract class Entity implements iMoveable {
    private Color color;
    private float x, y;
    private float speed;
    
    //default constructor
    public Entity() {
    	
    }
    
    //constructor with parameters
    public Entity(float x, float y, Color color, float speed) {
    	this.x = x;
    	this.y = y;
    	this.color = color;
    	this.speed = speed;
    }
    
    //getter and setter methods
    public Color getColor() {
        return color;
    }
    public void setColor(Color color) {
        this.color = color;
    }
    public float getX() {
        return x;
    }
    public void setX(float x) {
        this.x = x;
    }
    public float getY() {
        return y;
    }
    public void setY(float y) {
        this.y = y;
    }
    public float getSpeed() {
        return speed;
    }
    public void setSpeed(float speed) {
        this.speed = speed;
    }
    
    public void draw(ShapeRenderer shape) {
    	
    }
    
    public void draw(SpriteBatch batch) {
    	
    }
    
    public abstract void update();
    
    public void movement() {
    	
    }
    
}

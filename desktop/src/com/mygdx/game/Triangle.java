package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Vector2;

public class Triangle extends Entity {
	
	Vector2 point1 = new Vector2();
	Vector2 point2 = new Vector2();
	Vector2 point3 = new Vector2();
	
	public Triangle() {
		
	}
	
	public Triangle(float x, float y, Color color, float speed) {
		super(x,y,color,speed);
	}
	
	@Override
	public void draw(ShapeRenderer shape) {
		point1 = new Vector2(-25+getX(),-25+getY());
		point2 = new Vector2(25+getX(),-25+getY());
		point3 = new Vector2(0+getX(),25+getY());
		shape.setColor(getColor());
		shape.triangle(point1.x,point1.y,point2.x,point2.y,point3.x,point3.y);
		
	}
	
	public void movement() {
		if (Gdx.input.isKeyPressed(Keys.A)) {
			float x = getX() - getSpeed() * Gdx.graphics.getDeltaTime();
			setX(x);
		} if (Gdx.input.isKeyPressed(Keys.D)) {
			float x = getX() + getSpeed() * Gdx.graphics.getDeltaTime();
			setX(x);
		}
	}

	@Override
	public void update() {
		System.out.println("Triangle point1: " + point1);
		System.out.println("Triangle point2: " + point2);
		System.out.println("Triangle point3: " + point3);
	}

}

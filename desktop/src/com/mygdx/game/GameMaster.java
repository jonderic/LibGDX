package com.mygdx.game;

import java.util.Random;
import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public class GameMaster extends ApplicationAdapter {
	
	private SpriteBatch batch;
	private Entity bucket;
	private final int NUM_DROPS = 10;
	private Entity[] drops = new Entity[NUM_DROPS];
    private ShapeRenderer shape = null;
    Entity triangle;
    Entity circle;
    EntityManager em;


	@Override
	public void create()
	{
		batch = new SpriteBatch();
		shape = new ShapeRenderer();
		em = new EntityManager();
		
		Random random = new Random();
		
		for (int i = 0; i < NUM_DROPS; i++) {
			int xPos = random.nextInt(600);
			int speed = random.nextInt(9) + 2;
			drops[i] = new TextureObject("droplet.png", xPos, 0, speed, true);
			em.addEntity(drops[i]);
		}
		
		bucket = new TextureObject("bucket.png", 0,0,200, false);
		
		triangle = new Triangle(100,100, Color.RED, 200);
		circle = new Circle(200,200, Color.GREEN, 200);
		
		em.addEntity(bucket);
		em.addEntity(triangle);
		em.addEntity(circle);
		
	}

	@Override
	public void render()
	{
		ScreenUtils.clear(0, 0, 0.2f, 1);
		
		em.movement();
		em.draw(batch, shape);
		em.update();
		
	}
	
	@Override
	public void dispose()
	{
		batch.dispose();
	}
}
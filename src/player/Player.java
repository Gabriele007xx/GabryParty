package player;

import org.jsfml.graphics.RenderTarget;
import org.jsfml.graphics.Sprite;
import org.jsfml.graphics.Texture;
import org.jsfml.system.Vector2f;

public abstract class Player {
    protected Sprite sprite = new Sprite();
    protected int coins;
    protected int position=-1;
    public Player(Texture texture,int x,int y)
    {
        sprite.setOrigin(new Vector2f(sprite.getTexture().getSize().x / 2.0f, sprite.getTexture().getSize().y / 2.0f));
        sprite.setPosition(new Vector2f(x,y));
    }
    public void render(RenderTarget target)
    {
        target.draw(sprite);
    }
    public Sprite getSprite() {
        return sprite;
    }

    public int getCoins() {
        return coins;
    }

    public int getPosition() {
        return position;
    }

    public void growCoins(int amount)
    {
        coins += amount;
    }
    public void shrinkCoins(int amount)
    {
        growCoins(-amount);
    }
}

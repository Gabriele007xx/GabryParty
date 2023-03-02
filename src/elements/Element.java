package elements;

import org.jsfml.graphics.RenderTarget;
import org.jsfml.graphics.Sprite;
import org.jsfml.graphics.Texture;
import org.jsfml.system.Vector2f;
import player.Player;

public abstract class Element {
    protected Sprite sprite = new Sprite();
    protected boolean DoesCount;
    public Element(Texture texture,int x,int y)
    {
        sprite.setTexture(texture);
        sprite.setOrigin(new Vector2f(sprite.getTexture().getSize().x / 2f, sprite.getTexture().getSize().y / 2f));
        sprite.setPosition(x,y);
    }
    public void onLand(Player player)
    {

    }

    public boolean isDoesCount() {
        return DoesCount;
    }

    public void render(RenderTarget target)
    {
        target.draw(sprite);
    }
}

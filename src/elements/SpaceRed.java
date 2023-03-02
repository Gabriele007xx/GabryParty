package elements;

import org.jsfml.graphics.Texture;
import player.Player;

public class SpaceRed extends Count{
    public SpaceRed(Texture texture, int x, int y) {
        super(texture, x, y);
    }

    @Override
    public void onLand(Player a) {

    }
}

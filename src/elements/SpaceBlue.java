package elements;

import org.jsfml.graphics.Texture;
import player.Player;

public class SpaceBlue extends Count{
    public SpaceBlue(Texture texture, int x, int y) {
        super(texture, x, y);
    }

    @Override
    public void onLand(Player p) {

    }
}

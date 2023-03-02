package core;

import animatedsprite.AnimationSheet;
import map.GenericBoard;
import map.TestMap;
import player.Human;
import player.Player;
import org.jsfml.audio.Sound;
import org.jsfml.audio.SoundBuffer;
import org.jsfml.graphics.*;
import org.jsfml.system.Clock;
import org.jsfml.system.Vector2f;
import org.jsfml.window.Mouse;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Random;

public class Board extends State{
    private GenericBoard board = new TestMap();
    private Texture gui = new Texture();
    private Sprite gui_sprite = new Sprite();
    private ArrayList<Player> personaggi = new ArrayList<>();
    private Random random = new Random();
    private Font font = new Font();
    private View camera=new View(new Vector2f(478,320), new Vector2f(800,600));
    private Util util = new Util();
    private AnimationSheet object = new AnimationSheet(64,10,Util.objects.get("dice"));
    private boolean isDi = false;
    private Clock cpu = new Clock();
    public Board()
    {

        try {
            gui.loadFromFile(Paths.get("assets/bar.png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        gui_sprite.setTexture(gui);
        gui_sprite.setPosition(new Vector2f(0,489));
        try {
            font.loadFromFile(Paths.get("assets/s.ttf"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        

    }

    @Override
    public void update() {

    }

    @Override
    public void render(RenderTarget target) {
        target.setView(camera);
        board.render(target);
        for(Player e : personaggi)
        {
            e.render(target);
        }
        target.draw(gui_sprite);
    }
}

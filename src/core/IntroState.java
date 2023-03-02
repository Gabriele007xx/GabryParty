package core;

import org.jsfml.graphics.RenderTarget;
import org.jsfml.graphics.Sprite;
import org.jsfml.graphics.Texture;
import org.jsfml.system.Vector2f;
import org.jsfml.window.Mouse;

import java.io.IOException;
import java.nio.file.Paths;

public class IntroState extends State{
    private Texture title=new Texture();
    private Sprite title_sprite = new Sprite();
    public IntroState()
    {
        try {
            title.loadFromFile(Paths.get("assets/title.png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        title_sprite.setTexture(title);
        title_sprite.setPosition(new Vector2f(0,0));
    }
    @Override
    public void render(RenderTarget target) {
        target.draw(title_sprite);
    }

    @Override
    public void update() {
        if(Mouse.isButtonPressed(Mouse.Button.LEFT))
        {
            GabryParty.states.push(new Board());
        }
    }
}

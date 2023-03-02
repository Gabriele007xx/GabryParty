package animatedsprite;

import org.jsfml.graphics.*;
import org.jsfml.system.Clock;

public class AnimationSheet {
    private int size;
    private int frames;
    private Clock clock = new Clock();
    private int index;
    private Image texture;
    private Texture frame;
    private Sprite sprite;
    public AnimationSheet(int t, int f, Texture image)
    {
        size = t;
        frames = f;
        texture = image.copyToImage();
        clock.restart();
    }
    public void play()
    {
        try {
            frame.loadFromImage(texture, new IntRect(index*size,0,size,size));
        } catch (TextureCreationException e) {
            throw new RuntimeException(e);
        }
        sprite.setTexture(frame);
        if(clock.getElapsedTime().asSeconds() >= 0.2f)
        {
            index++;
            if(index>frames-1)
            {
                index=0;
            }
        }
    }
    public void set(int index)
    {
        try {
            frame.loadFromImage(texture, new IntRect(index*size,0,size,size));
        } catch (TextureCreationException e) {
            throw new RuntimeException(e);
        }
        sprite.setTexture(frame);
    }
}

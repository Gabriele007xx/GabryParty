package map;

import elements.Element;
import org.jsfml.graphics.RenderTarget;
import org.jsfml.graphics.Sprite;
import org.jsfml.graphics.Texture;

import java.util.ArrayList;

public abstract class GenericBoard {
    protected Sprite background = new Sprite();
    protected Texture backg = new Texture();
    protected ArrayList<Element> elements = new ArrayList<>();
    public void render(RenderTarget target)
    {
        target.draw(background);
        for(Element e : elements)
        {
            e.render(target);
        }
    }

    public ArrayList<Element> getElements() {
        return elements;
    }
}

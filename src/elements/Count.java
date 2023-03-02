package elements;

import org.jsfml.graphics.Texture;

public abstract class Count extends Element{

    public Count(Texture texture,int x,int y) {
        super(texture,x,y);
        DoesCount = true;
    }
}

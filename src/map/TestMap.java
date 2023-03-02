package map;

import core.Util;
import elements.SpaceBlue;
import elements.SpaceRed;

import java.io.IOException;
import java.nio.file.Paths;

public class TestMap extends GenericBoard{
    public TestMap()
    {
        try {
            backg.loadFromFile(Paths.get("assets/board.png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        background.setTexture(backg);
        placeElements();
    }
    private void placeElements()
    {
        elements.add(new SpaceBlue(Util.element_textures.get("blue"), 134,472));
        elements.add(new SpaceBlue(Util.element_textures.get("blue"), 198,472));
        elements.add(new SpaceRed(Util.element_textures.get("red"), 262, 472));
        elements.add(new SpaceBlue(Util.element_textures.get("blue"), 326,472));
        elements.add(new SpaceBlue(Util.element_textures.get("blue"), 390,472));
        elements.add(new SpaceBlue(Util.element_textures.get("blue"), 390,600));
        elements.add(new SpaceRed(Util.element_textures.get("red"), 326, 600));
        elements.add(new SpaceRed(Util.element_textures.get("red"), 262,600));
        elements.add(new SpaceBlue(Util.element_textures.get("blue"), 198,600));
        elements.add(new SpaceBlue(Util.element_textures.get("blue"), 134,600));


    }
}

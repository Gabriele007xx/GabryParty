package core;

import org.jsfml.graphics.IntRect;
import org.jsfml.graphics.Texture;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.HashMap;

public class Util {
    public static HashMap<String, Texture> element_textures = new HashMap<>();
    public static HashMap<String, Texture> objects = new HashMap<>();
    public Util()
    {
        Texture blueS = new Texture();
        try {
            blueS.loadFromFile(Paths.get("assets/element.png"),new IntRect(0,0,64,64));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        element_textures.put("blue", blueS);
        Texture redS = new Texture();
        try {
            redS.loadFromFile(Paths.get("assets/element.png"), new IntRect(64,0,64,64));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Texture s = new Texture();
        element_textures.put("red", redS);
        try {
            s.loadFromFile(Paths.get("assets/element.png"), new IntRect(128,0,64,64));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        element_textures.put("s", s);
        Texture dice = new Texture();
        try {
            dice.loadFromFile(Paths.get("assets/dice.png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        objects.put("dice", dice);
    }
}

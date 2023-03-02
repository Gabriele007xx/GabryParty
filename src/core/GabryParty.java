package core;

import org.jsfml.graphics.RenderWindow;
import org.jsfml.system.Vector2i;
import org.jsfml.window.Mouse;
import org.jsfml.window.VideoMode;
import org.jsfml.window.event.Event;

import java.util.Stack;

public class GabryParty {
    public static Stack<State> states = new Stack<>();
    private RenderWindow window;
    private int window_height = 600;
    private int window_width=800;
    private String title = "GabryParty";
    public static Vector2i mouse;
    public GabryParty()
    {
        window = new RenderWindow(new VideoMode(window_width,window_height), title);
        states.push(new IntroState());
    }
    public void run()
    {
        while(window.isOpen())
        {
            update();
            render();
        }
    }
    private void update()
    {
        mouse = Mouse.getPosition(window);
        for(Event event : window.pollEvents())
        {
            switch(event.type)
            {
                case CLOSED:
                    window.close();
                    break;
            }
        }
        if(!states.empty())
        {
            states.lastElement().update();
        }

    }
    private void render()
    {
        window.clear();
        if(!states.empty())
        {
            states.lastElement().render(window);
        }
        window.display();
    }
}

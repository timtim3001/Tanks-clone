package tk.timtim3001.tanksclone;

import tk.timtim3001.engine.components.Component;
import tk.timtim3001.engine.core.Engine;
import tk.timtim3001.engine.core.Time;
import tk.timtim3001.engine.input.Input;

public class DebugComponent extends Component {

    private Engine engine;
    private Input input;
    private double totalFps = 0;
    private int counter = 1;

    @Override
    public void start() {
        engine =  Engine.getInstance();
        input = Input.getInstance();
    }

    @Override
    public void update() {
//        totalFps += engine.getFps();
//        counter++;
//        System.out.println("Average fps: " + totalFps / counter);
//        parent.rotate(Math.PI * Time.deltaTime);
    }
}

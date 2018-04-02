package tk.timtim3001.tanksclone;

import tk.timtim3001.engine.core.Engine;
import tk.timtim3001.engine.window.Window;
import tk.timtim3001.engine.window.WindowManager;
import tk.timtim3001.tanksclone.entities.Player;
import tk.timtim3001.tanksclone.entities.Terrain;

public class BattleWorld {

    public BattleWorld() {
        Engine engine = Engine.getInstance();
        engine.setGameWorld("BattleWorld");

        Window window = WindowManager.getInstance().getWindow();
        int width = window.getWidth();
        int height = window.getHeight();

        engine.addGameObject(new Terrain(width, height));
        engine.addGameObject(new Player(width / 5 * 4, 100, 32, 16));
    }

}

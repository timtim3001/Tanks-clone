package tk.timtim3001.tanksclone.entities;

import tk.timtim3001.engine.components.BodyComponent;
import tk.timtim3001.engine.components.ColliderComponent;
import tk.timtim3001.engine.components.TerrainComponent;
import tk.timtim3001.engine.core.GameObject;

import static tk.timtim3001.engine.components.BodyComponent.PhysicsMassType.MASS_TYPE_INFINITE;

public class Terrain extends GameObject {

    public Terrain(int width, int height) {
        super(width / 2, height - 50, width, 100, 0);

        addComponent( new TerrainComponent(TerrainComponent.TerrainType.DESTRUCTABLE));
        addComponent(new ColliderComponent(ColliderComponent.ColliderType.TERRAIN));
        addComponent(new BodyComponent(MASS_TYPE_INFINITE));

        setTag("Terrain");
    }
}

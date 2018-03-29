package tk.timtim3001.engine.components;

import tk.timtim3001.engine.core.GameObject;
import tk.timtim3001.engine.renderer.SpriteRenderer;

import java.awt.image.BufferedImage;

public class Sprite extends Component {

    private int layer;
    private BufferedImage image;

    public Sprite(int layer, BufferedImage image) {
        this.layer = layer;
        this.image = image;
    }

    protected Sprite(int layer){
        this.layer = layer;
    }

    @Override
    public void resume() {
        SpriteRenderer.getInstance().addSpriteToRenderer(this);
    }

    @Override
    public void pause() {
        SpriteRenderer.getInstance().removeSpriteFromRenderer(this);
    }

    public int getLayer() {
        return layer;
    }

    public BufferedImage getImage() {
        return image;
    }
}

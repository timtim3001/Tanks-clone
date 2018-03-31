package tk.timtim3001.engine.core;

import tk.timtim3001.engine.components.Component;

import java.awt.geom.AffineTransform;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.List;

public class GameObject {

    private Point2D position;
    private double scaleX;
    private double scaleY;
    private double rotation;

    private List<Component> components;

    public GameObject(){
        position = new Point2D.Double(0,0);
        scaleX = 1;
        scaleY = 1;
        rotation = 0;

        components = new ArrayList<>();
    }

    public void addComponent(Component component){
        components.add(component);
        component.setParent(this);
        component.start();
    }

    public void translate(int dx, int dy){
        position.setLocation(position.getX() + dx, position.getY() + dy);
    }

    public void setPosition(int x, int y){
        setPosition(new Point2D.Double(x, y));
    }

    public void setRotation(double rotation) {
        this.rotation = rotation;
    }

    public void setPosition(Point2D position){
        this.position = position;
    }

    public AffineTransform getTransform(){
        AffineTransform transform = new AffineTransform();
        transform.translate(position.getX(), position.getY());
        transform.scale(scaleX, scaleY);
        transform.rotate(rotation);
        return transform;
    }

    @SuppressWarnings("unchecked")
    public <T> T getComponent(Class<T> component){
        for(Component c : components){
            if(component.isInstance(c))
                return (T) c;
        }
        return null;
    }

    protected void start(){
        for(Component component : components){
            component.start();
        }
    }

    protected void resume(){
        for(Component component : components)
            component.resume();
    }

    protected void update(){
        for(Component component : components){
            component.update();
        }
    }

    protected void fixedUpdate(){
        for(Component component : components){
            component.fixedUpdate();
        }
    }

    protected void pause(){
        for(Component component : components)
            component.pause();
    }

    protected void destroy(){

    }

    public double getRotation() {
        return rotation;
    }
}

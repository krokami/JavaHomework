import java.sql.Time;
import java.util.Timer;
import java.util.TimerTask;

public class Picture {
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;

    public Picture() {}

    public void draw() throws InterruptedException {
        wall = new Square();
        wall.moveVertical(80);
        wall.changeSize(100);
        wall.makeVisible();

        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(20);
        window.moveVertical(100);
        window.makeVisible();

        roof = new Triangle();
        roof.changeSize(50, 140);
        roof.moveHorizontal(60);
        roof.moveVertical(70);
        roof.makeVisible();

        /*sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(180);
        sun.moveVertical(-10);
        sun.changeSize(60);
        sun.makeVisible();*/

        sun = new Circle();
        sun.changeSize(60);
        sun.changeColor("yellow");
        sun.makeVisible();
        for(int x = 20; x <= 200; x++){
            int y = x / 50;
            sun.moveHorizontal(1);
            sun.moveVertical(-y);
            Thread.currentThread().sleep(500);
        }
    }

    public void setBlackAndWhite() {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    public void setColor() {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }



    public static void main(String[] args) throws InterruptedException {
        Picture picture = new Picture();
        picture.setBlackAndWhite();
        picture.draw();
    }
}

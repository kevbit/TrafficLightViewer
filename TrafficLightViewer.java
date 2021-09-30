
/**
 * Draw a basic Traffic Light
 *
 * @author Kevin Lo
 * @version 2020-08-31
 */
public class TrafficLightViewer
{
    public static void main(String[] args) {
        Rectangle trafficLight = new Rectangle(50.0, 20.0, 20.0, 60.0);
        trafficLight.draw();
        //Creating Red Light
        Ellipse redLight = new Ellipse(50.0, 20.0, 20.0, 20.0);
        redLight.setColor(Color.RED);
        redLight.fill();
        //Creating Yellow Light
        Ellipse yellowLight = new Ellipse(50.0, 40.0, 20.0, 20.0);
        yellowLight.setColor(Color.YELLOW);
        yellowLight.fill();
        //Creating Green Light
        Ellipse greenLight = new Ellipse(50.0, 60.0, 20.0, 20.0);
        greenLight.setColor(Color.GREEN);
        greenLight.fill();
   
        
        
    }
}

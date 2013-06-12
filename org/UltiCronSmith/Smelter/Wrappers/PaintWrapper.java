package org.UltiCronSmith.Smelter.Wrappers;

import org.UltiCronSmith.Smelter.Data.Ore;
import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;
import java.net.URL;

/**
 * @author arno
 * @date 11-6-13
 * @time 20:03
 */
public class PaintWrapper {


    static Color upperBarColor = new Color(77,77,77,140);
    static Font font1 = new Font("Arial",0,10);
    private static final Image icon = getImage(Ore.getIcon());


    public static void handlePaint(Graphics g) {
        g.setFont(font1);
        g.setColor(upperBarColor);
        g.fillRect(0, 0, 517, 33);
        g.fillRect(549,229,735-549,464-229);
        g.setColor(Color.WHITE);
        g.drawRect(0, 0, 517, 33);
        g.drawRect(549,229,735-549,464-229);
        g.drawString("Ultimate CronSmith - CronSmelter",6,16);
        g.drawString("Runtime",6,26);
        g.drawString("Status:",200,16);
        g.setColor(Color.RED);
        g.fillRect(580, 414+6, 150, 18);
        g.setColor(Color.BLACK);
        g.drawRect(580,414+6,730-580,18);
        g.drawImage(icon,552,417+6, null);
    }

    public  static Image getImage(String url) {
        try {
            return ImageIO.read(new URL(url));
        } catch (IOException e) {
            return null;
        }
    }

}

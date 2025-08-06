// Black & White Conversion

package org.example.Assignment;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

public class Assignment5 {
    public static void main(String[] args) {
        try{
            File input = new File("C:\\Users\\Administrator\\IdeaProjects\\corejavamaven\\src\\main\\java\\org\\example\\Assignment\\Akio Morita San.jpg");
            BufferedImage bfimg = ImageIO.read(input);

            for (int y=0; y < bfimg.getHeight(); y++){
                for (int x=0; x < bfimg.getWidth(); x++){
                    Color c = new Color(bfimg.getRGB(x,y));
                    int grey = (c.getRed()+c.getGreen()+c.getBlue())/3;
                    Color gc = new Color(grey,grey,grey);
                    bfimg.setRGB(x,y,gc.getRGB());
                }
            }

            File output = new File("C:\\Users\\Administrator\\IdeaProjects\\corejavamaven\\src\\main\\java\\org\\example\\Assignment\\Akio Morita San in B&W.jpg");
            ImageIO.write(bfimg, "jpg", output);
            System.out.println("Done");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}

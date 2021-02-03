import java.io.*;
import java.net.URL;
import java.util.*;
public class Main {

    public static void main(String[] args) throws IOException {
        
        int length = 0;
        String title = "";
        File myFile = new File ("Genome.txt");
        
        if (!myFile.canRead())
        {
            System.out.println("ERROR: File not found");
            System.exit(0);
        }
    
    URL url = null;
    url = myFile.toURL();    
        
    InputStream in;
    BufferedReader buf;
    int lineCount = 0;
    String line;
    String lineItems[];

    int columnNumber = 0;

    String strand;
    int slot = 0;
    int start = 0;
    int stop = 0;
    float opacity = 1.0f;
    float thickness = 1.0f;
    float radius = 0.0f;
    String type = "";
    String label = "";
    String mouseover = "";
    String hyperlink = "";

    boolean hasStrandColumn = false;
    boolean hasSlotColumn = false;
    boolean hasStartColumn = false;
    boolean hasStopColumn = false;
    boolean hasOpacityColumn = false;
    boolean hasThicknessColumn = false;
    boolean hasRadiusColumn = false;
    boolean hasTypeColumn = false;
    boolean hasLabelColumn = false;
    boolean hasMouseoverColumn = false;
    boolean hasHyperlinkColumn = false;

    int strandColumnIndex = -1;
    int slotColumnIndex = -1;
    int startColumnIndex = -1;
    int stopColumnIndex = -1;
    int opacityColumnIndex = -1;
    int thicknessColumnIndex = -1;
    int radiusColumnIndex = -1;
    int typeColumnIndex = -1;
    int labelColumnIndex = -1;
    int mouseoverColumnIndex = -1;
    int hyperlinkColumnIndex = -1;

    in = url.openStream();

    System.out.println("Reading GenBank file...");

    buf = new BufferedReader(new InputStreamReader(in));
    while ((line = buf.readLine()) != null) {
      lineCount++;
      if (line.startsWith("#")) {
        title = line.substring(1);
      } else if (line.startsWith("%")) {
        try {
          length = Integer.parseInt(line.substring(1));
        } catch (Exception e) {
          
        }
      } else if (line.startsWith("!")) {
        line = line.substring(1);
        lineItems = line.split("(?:\\s*\\t+\\s*)|(?:\\s{2,})");
        // lineItems = line.split("\\s*\\t+\\s*");
        columnNumber = lineItems.length;
        for (int i = 0; i < lineItems.length; i = i + 1) {
          String lineItem = lineItems[i].trim();
          if (lineItem.equalsIgnoreCase("strand")) {
            hasStrandColumn = true;
            strandColumnIndex = i;
          } else if (lineItem.equalsIgnoreCase("slot")) {
            hasSlotColumn = true;
            slotColumnIndex = i;
          } else if (lineItem.equalsIgnoreCase("start")) {
            hasStartColumn = true;
            startColumnIndex = i;
          } else if (lineItem.equalsIgnoreCase("stop")) {
            hasStopColumn = true;
            stopColumnIndex = i;
          } else if (lineItem.equalsIgnoreCase("type")) {
            hasTypeColumn = true;
            typeColumnIndex = i;
          } else if (lineItem.equalsIgnoreCase("opacity")) {
            hasOpacityColumn = true;
            opacityColumnIndex = i;
          } else if (lineItem.equalsIgnoreCase("thickness")) {
            hasThicknessColumn = true;
            thicknessColumnIndex = i;
          } else if (lineItem.equalsIgnoreCase("radius")) {
            hasRadiusColumn = true;
            radiusColumnIndex = i;
          } else if (lineItem.equalsIgnoreCase("label")) {
            hasLabelColumn = true;
            labelColumnIndex = i;
          } else if (lineItem.equalsIgnoreCase("mouseover")) {
            hasMouseoverColumn = true;
            mouseoverColumnIndex = i;
          } else if (lineItem.equalsIgnoreCase("hyperlink")) {
            hasHyperlinkColumn = true;
            hyperlinkColumnIndex = i;
          }
        }
      } else {
        lineItems = line.split("\\s*\\t+\\s*");
        if (lineItems.length != columnNumber) {
          lineItems = line.split("(?:\\s*\\t+\\s*)|(?:\\s{2,})");
        }

        if (lineItems.length >= 5) {
          if (hasStrandColumn == false) {
            
          }
          if (hasSlotColumn == false) {
            
          }
          if (hasStartColumn == false) {
            
          }
          if (hasStopColumn == false) {
            
          }
          if (hasTypeColumn == false) {
            
          } 
    } 
}
    }
    
    }
}

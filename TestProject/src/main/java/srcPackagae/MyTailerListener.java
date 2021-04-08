package srcPackage;

import org.apache.commons.io.input.Tailer;
import org.apache.commons.io.input.TailerListenerAdapter;

public class MyTailerListener extends TailerListenerAdapter {
    public void handle(String line) {
        System.out.println(line);
    }
}
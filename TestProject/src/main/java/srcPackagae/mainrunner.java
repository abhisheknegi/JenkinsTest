package srcPackage;

import org.apache.commons.io.input.Tailer;
import org.apache.commons.io.input.TailerListener;
import java.io.File;

public class mainrunner{

    public static void main(String[] args){

        System.out.println(" -- Trailer Test Run --");

        String filename = "/home/anegi/testfile";
        File file = new File(filename);

        TailerListener listener = new MyTailerListener();
        Tailer tailer = Tailer.create(file, listener);

    }

}
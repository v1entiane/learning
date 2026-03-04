package org.example.exec;

public class TouchFile {
    static {
        try {
            Runtime rt = Runtime.getRuntime();
            String[] commends = {"touch","/tmp/success"};
            Process pc = rt.exec(commends);
            pc.waitFor();
        }catch (Exception e){
            //
        }
    }
}

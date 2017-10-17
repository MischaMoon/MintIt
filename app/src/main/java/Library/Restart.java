package Library;

import android.content.Context;
import android.os.PowerManager;

public class Restart {
    public void softReset (Context c){
        PowerManager pm = (PowerManager) c.getSystemService(Context.POWER_SERVICE);
        pm.reboot(null);
    }
}

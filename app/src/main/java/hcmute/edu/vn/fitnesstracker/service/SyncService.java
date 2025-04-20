package hcmute.edu.vn.fitnesstracker.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class SyncService extends Service {
    // Service implementation will go here
    
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
} 
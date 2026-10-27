package com.google.mlkit.acceleration.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class MlKitRemoteWorkerService extends androidx.work.multiprocess.RemoteWorkerService {
    public MlKitRemoteWorkerService() {
            r0 = this;
            r0.<init>()
            return
    }

    public final void onCreate() {
            r3 = this;
            android.content.Context r0 = r3.getApplicationContext()     // Catch: java.lang.IllegalStateException -> Lc
            android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)     // Catch: java.lang.IllegalStateException -> Lc
            androidx.work.WorkManager.getInstance(r0)     // Catch: java.lang.IllegalStateException -> Lc
            goto L2e
        Lc:
            java.lang.String r0 = "MlKitRWService"
            r1 = 3
            android.util.Log.isLoggable(r0, r1)
            android.content.Context r0 = r3.getApplicationContext()
            android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)
            androidx.work.Configuration$Builder r1 = new androidx.work.Configuration$Builder
            r1.<init>()
            java.lang.String r2 = r0.getPackageName()
            androidx.work.Configuration$Builder r1 = r1.setDefaultProcessName(r2)
            androidx.work.Configuration r1 = r1.build()
            androidx.work.WorkManager.initialize(r0, r1)
        L2e:
            super.onCreate()
            return
    }
}

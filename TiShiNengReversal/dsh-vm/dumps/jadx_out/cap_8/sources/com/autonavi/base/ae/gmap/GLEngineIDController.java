package com.autonavi.base.ae.gmap;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class GLEngineIDController {
    private static final java.lang.String TAG = "GLEngineIDController";
    private static com.autonavi.base.ae.gmap.GLEngineIDController sController;
    private int engineIDIndex;

    static {
            com.autonavi.base.ae.gmap.GLEngineIDController r0 = new com.autonavi.base.ae.gmap.GLEngineIDController
            r0.<init>()
            com.autonavi.base.ae.gmap.GLEngineIDController.sController = r0
            return
    }

    private GLEngineIDController() {
            r1 = this;
            r1.<init>()
            r0 = 10000(0x2710, float:1.4013E-41)
            r1.engineIDIndex = r0
            return
    }

    public static com.autonavi.base.ae.gmap.GLEngineIDController getController() {
            com.autonavi.base.ae.gmap.GLEngineIDController r0 = com.autonavi.base.ae.gmap.GLEngineIDController.sController
            return r0
    }

    public synchronized int generate() {
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.engineIDIndex     // Catch: java.lang.Throwable -> L9
            int r0 = r0 + 1
            r1.engineIDIndex = r0     // Catch: java.lang.Throwable -> L9
            monitor-exit(r1)
            return r0
        L9:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9
            throw r0
    }
}

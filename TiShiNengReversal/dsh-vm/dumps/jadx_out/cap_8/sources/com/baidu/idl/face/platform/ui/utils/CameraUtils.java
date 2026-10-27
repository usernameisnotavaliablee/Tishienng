package com.baidu.idl.face.platform.ui.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class CameraUtils {
    public static final java.lang.String TAG = "CameraUtils";

    static {
            return
    }

    public CameraUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void releaseCamera(android.hardware.Camera r0) {
            r0.release()     // Catch: java.lang.Throwable -> L4 java.lang.Throwable -> L6
            return
        L4:
            r0 = move-exception
            throw r0
        L6:
            return
    }
}

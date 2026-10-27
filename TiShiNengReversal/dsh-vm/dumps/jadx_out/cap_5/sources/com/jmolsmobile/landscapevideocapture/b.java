package com.jmolsmobile.landscapevideocapture;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class b {
    public static final java.lang.String a = "VideoCapture_Exception";
    public static final java.lang.String b = "VideoCapture_Activity";
    public static final java.lang.String c = "VideoCapture_Preview";
    public static final java.lang.String d = "VideoCapture_CaptureHelper";
    public static final java.lang.String e = "VideoCapture_VideoRecorder";
    public static final java.lang.String f = "VideoCapture_CameraWrapper";
    private static boolean g = true;

    static {
            return
    }

    public b() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void a(java.lang.String r0, java.lang.String r1) {
            return
    }

    public static void b(java.lang.String r0, java.lang.String r1) {
            return
    }

    public static void c(android.content.Context r0) {
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo()
            int r0 = r0.flags
            r0 = r0 & 2
            if (r0 == 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            com.jmolsmobile.landscapevideocapture.b.g = r0
            return
    }
}

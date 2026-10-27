package com.huawei.hms.scankit.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class OpencvJNI {
    public OpencvJNI() {
            r0 = this;
            r0.<init>()
            return
    }

    public static native byte[] QRCornerDetect(byte[] r0, int r1, int r2, float[] r3);

    public static native float[] QuadFitting(float[] r0, int r1, float[] r2);

    public static native byte[] adaptiveBinary(byte[] r0, int r1, int r2, int r3, boolean r4);

    public static native byte[] imageResize(byte[] r0, int r1, int r2, int r3, int r4);

    public static native byte[] imageRotate(byte[] r0, int r1, int r2, int r3, int r4, float r5, double r6);

    public static void init() {
            java.lang.String r0 = "init()"
            java.lang.String r1 = "OpencvJNI"
            com.huawei.hms.scankit.p.o4.d(r1, r0)
            java.lang.String r0 = "start load method"
            com.huawei.hms.scankit.p.o4.d(r1, r0)
            java.lang.String r0 = "scannative"
            java.lang.System.loadLibrary(r0)     // Catch: java.lang.UnsatisfiedLinkError -> L15
            r0 = 1
            com.huawei.hms.scankit.p.r3.A = r0     // Catch: java.lang.UnsatisfiedLinkError -> L15
            return
        L15:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            com.huawei.hms.scankit.p.o4.b(r1, r0)
            r0 = 0
            com.huawei.hms.scankit.p.m1.a(r0)
            return
    }

    public static native float[] multiBarcodeDetect(byte[] r0, int r1, int r2, int r3, boolean r4);

    public static native byte[] removeMoirePattern(byte[] r0, int r1, int r2);

    public static native void setModel(byte[] r0, int r1, byte[] r2, int r3, byte[] r4, int r5);

    public static native byte[] sharpen(byte[] r0, int r1, int r2);
}

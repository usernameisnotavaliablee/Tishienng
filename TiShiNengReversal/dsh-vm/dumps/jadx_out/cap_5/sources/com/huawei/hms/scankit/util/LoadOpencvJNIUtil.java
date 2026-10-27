package com.huawei.hms.scankit.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class LoadOpencvJNIUtil {
    private static final java.lang.String TAG = "LoadOpencvJNIUtil";

    static {
            return
    }

    public LoadOpencvJNIUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    public static byte[] QRCornerDetect(byte[] r0, int r1, int r2, float[] r3) {
            if (r0 == 0) goto L7
            byte[] r0 = com.huawei.hms.scankit.util.OpencvJNI.QRCornerDetect(r0, r1, r2, r3)
            return r0
        L7:
            r0 = 0
            return r0
    }

    public static float[] QuadFitting(float[] r0, int r1, float[] r2) {
            if (r2 == 0) goto L7
            float[] r0 = com.huawei.hms.scankit.util.OpencvJNI.QuadFitting(r0, r1, r2)
            return r0
        L7:
            r0 = 0
            return r0
    }

    public static byte[] adaptivebinary(byte[] r0, int r1, int r2, int r3, boolean r4) {
            if (r0 == 0) goto Lb
            if (r1 < r3) goto Lb
            if (r2 < r3) goto Lb
            byte[] r0 = com.huawei.hms.scankit.util.OpencvJNI.adaptiveBinary(r0, r1, r2, r3, r4)
            return r0
        Lb:
            r0 = 0
            return r0
    }

    public static byte[] imageResize(byte[] r0, int r1, int r2, int r3, int r4) {
            if (r0 == 0) goto L7
            byte[] r0 = com.huawei.hms.scankit.util.OpencvJNI.imageResize(r0, r1, r2, r3, r4)
            return r0
        L7:
            r0 = 0
            return r0
    }

    public static byte[] imageRotate(byte[] r0, int r1, int r2, int r3, int r4, float r5, double r6) {
            if (r0 == 0) goto L7
            byte[] r0 = com.huawei.hms.scankit.util.OpencvJNI.imageRotate(r0, r1, r2, r3, r4, r5, r6)
            return r0
        L7:
            r0 = 0
            return r0
    }

    public static float[] multiBarcodeDetect(byte[] r0, int r1, int r2, int r3, boolean r4) {
            if (r0 == 0) goto L7
            float[] r0 = com.huawei.hms.scankit.util.OpencvJNI.multiBarcodeDetect(r0, r1, r2, r3, r4)
            return r0
        L7:
            r0 = 0
            return r0
    }

    public static byte[] removeMoirePattern(byte[] r0, int r1, int r2) {
            if (r0 == 0) goto L7
            byte[] r0 = com.huawei.hms.scankit.util.OpencvJNI.removeMoirePattern(r0, r1, r2)
            return r0
        L7:
            r0 = 0
            return r0
    }

    public static void setModel(byte[] r0, int r1, byte[] r2, int r3, byte[] r4, int r5) {
            if (r0 == 0) goto L5
            com.huawei.hms.scankit.util.OpencvJNI.setModel(r0, r1, r2, r3, r4, r5)
        L5:
            return
    }

    public static byte[] sharpen(byte[] r0, int r1, int r2) {
            if (r0 == 0) goto L7
            byte[] r0 = com.huawei.hms.scankit.util.OpencvJNI.sharpen(r0, r1, r2)
            return r0
        L7:
            r0 = 0
            return r0
    }
}

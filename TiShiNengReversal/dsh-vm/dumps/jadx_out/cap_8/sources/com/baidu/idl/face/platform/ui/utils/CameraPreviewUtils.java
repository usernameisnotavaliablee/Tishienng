package com.baidu.idl.face.platform.ui.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class CameraPreviewUtils {
    private static final int MAX_PREVIEW_PIXELS = 2073600;
    private static final int MIN_PREVIEW_PIXELS = 307200;
    private static final java.lang.String TAG = "CameraPreviewUtils";


    static {
            return
    }

    public CameraPreviewUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static android.graphics.Point getBestPreview(android.hardware.Camera.Parameters r16, android.graphics.Point r17) {
            r0 = r17
            java.util.List r1 = r16.getSupportedPreviewSizes()
            r2 = 480(0x1e0, float:6.73E-43)
            r3 = 640(0x280, float:8.97E-43)
            if (r1 != 0) goto L15
            r16.getPreviewSize()
            android.graphics.Point r0 = new android.graphics.Point
            r0.<init>(r3, r2)
            return r0
        L15:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r1)
            com.baidu.idl.face.platform.ui.utils.CameraPreviewUtils$1 r1 = new com.baidu.idl.face.platform.ui.utils.CameraPreviewUtils$1
            r1.<init>()
            java.util.Collections.sort(r4, r1)
            int r1 = r0.x
            int r0 = r0.y
            if (r1 <= r0) goto L2c
            double r5 = (double) r1
            double r0 = (double) r0
        L2a:
            double r5 = r5 / r0
            goto L2f
        L2c:
            double r5 = (double) r0
            double r0 = (double) r1
            goto L2a
        L2f:
            java.util.Iterator r0 = r4.iterator()
            r7 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            r1 = 0
            r9 = r7
        L37:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L92
            java.lang.Object r4 = r0.next()
            android.hardware.Camera$Size r4 = (android.hardware.Camera.Size) r4
            int r11 = r4.width
            int r12 = r4.height
            int r13 = r11 * r12
            r14 = 307200(0x4b000, float:4.30479E-40)
            if (r13 >= r14) goto L52
            r0.remove()
            goto L37
        L52:
            r14 = 2073600(0x1fa400, float:2.905732E-39)
            if (r13 <= r14) goto L5b
            r0.remove()
            goto L37
        L5b:
            if (r12 <= r11) goto L61
            r0.remove()
            goto L37
        L61:
            int r13 = r12 % 2
            if (r13 != 0) goto L8e
            int r13 = r11 % 2
            if (r13 == 0) goto L6a
            goto L8e
        L6a:
            if (r11 <= r12) goto L70
            double r13 = (double) r11
            double r11 = (double) r12
            double r13 = r13 / r11
            goto L74
        L70:
            double r12 = (double) r12
            double r14 = (double) r11
            double r13 = r12 / r14
        L74:
            double r13 = r13 - r5
            double r11 = java.lang.Math.abs(r13)
            r13 = 4598175219545276416(0x3fd0000000000000, double:0.25)
            int r15 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r15 != 0) goto L83
            int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r15 <= 0) goto L8b
        L83:
            int r15 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r15 < 0) goto L37
            int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r15 > 0) goto L37
        L8b:
            r1 = r4
            r9 = r11
            goto L37
        L8e:
            r0.remove()
            goto L37
        L92:
            if (r1 == 0) goto L9e
            android.graphics.Point r0 = new android.graphics.Point
            int r2 = r1.width
            int r1 = r1.height
            r0.<init>(r2, r1)
            return r0
        L9e:
            r16.getPreviewSize()
            android.graphics.Point r0 = new android.graphics.Point
            r0.<init>(r3, r2)
            return r0
    }
}

package com.github.barteksc.pdfviewer.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class Util {
    private static final int DEFAULT_BUFFER_SIZE = 4096;

    public Util() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int getDP(android.content.Context r1, int r2) {
            float r2 = (float) r2
            android.content.res.Resources r1 = r1.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            r0 = 1
            float r1 = android.util.TypedValue.applyDimension(r0, r2, r1)
            int r1 = (int) r1
            return r1
    }

    public static byte[] toByteArray(java.io.InputStream r4) throws java.io.IOException {
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            r1 = 4096(0x1000, float:5.74E-42)
            byte[] r1 = new byte[r1]
        L9:
            int r2 = r4.read(r1)
            r3 = -1
            if (r3 == r2) goto L15
            r3 = 0
            r0.write(r1, r3, r2)
            goto L9
        L15:
            byte[] r4 = r0.toByteArray()
            return r4
    }
}

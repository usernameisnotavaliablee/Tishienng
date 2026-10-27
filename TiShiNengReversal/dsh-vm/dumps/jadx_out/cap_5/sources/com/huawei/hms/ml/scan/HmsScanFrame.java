package com.huawei.hms.ml.scan;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class HmsScanFrame {
    private android.graphics.Bitmap bitmap;
    private int height;
    private int width;
    private android.graphics.YuvImage yuvImage;

    public HmsScanFrame(android.graphics.Bitmap r2) {
            r1 = this;
            r1.<init>()
            r1.bitmap = r2
            if (r2 != 0) goto L8
            return
        L8:
            int r0 = r2.getWidth()
            r1.width = r0
            int r2 = r2.getHeight()
            r1.height = r2
            return
    }

    public HmsScanFrame(android.graphics.YuvImage r3) {
            r2 = this;
            r2.<init>()
            byte[] r0 = r3.getYuvData()
            if (r0 == 0) goto L20
            int r0 = r3.getYuvFormat()
            r1 = 17
            if (r0 == r1) goto L12
            goto L20
        L12:
            r2.yuvImage = r3
            int r0 = r3.getWidth()
            r2.width = r0
            int r3 = r3.getHeight()
            r2.height = r3
        L20:
            return
    }

    public android.graphics.Bitmap getBitmap() {
            r1 = this;
            android.graphics.Bitmap r0 = r1.bitmap
            return r0
    }

    public int getHeight() {
            r1 = this;
            int r0 = r1.height
            return r0
    }

    public int getWidth() {
            r1 = this;
            int r0 = r1.width
            return r0
    }

    public android.graphics.YuvImage getYuvImage() {
            r1 = this;
            android.graphics.YuvImage r0 = r1.yuvImage
            return r0
    }
}

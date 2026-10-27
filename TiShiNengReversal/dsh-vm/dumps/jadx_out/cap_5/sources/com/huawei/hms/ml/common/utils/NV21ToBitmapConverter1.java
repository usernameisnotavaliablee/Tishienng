package com.huawei.hms.ml.common.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class NV21ToBitmapConverter1 {
    private android.content.Context applicationContext;
    private int height;
    private android.renderscript.Allocation in;
    private int length;
    private android.renderscript.Allocation out;
    private android.renderscript.RenderScript renderScript;
    private android.renderscript.Type.Builder rgbaType;
    private int width;
    private android.renderscript.ScriptIntrinsicYuvToRGB yuvToRgbIntrinsic;
    private android.renderscript.Type.Builder yuvType;

    public NV21ToBitmapConverter1(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.width = r0
            r1.height = r0
            r1.length = r0
            if (r2 == 0) goto L30
            android.content.Context r0 = r2.getApplicationContext()
            android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)
            if (r0 != 0) goto L19
            r1.applicationContext = r2
            goto L1b
        L19:
            r1.applicationContext = r0
        L1b:
            android.content.Context r2 = r1.applicationContext
            android.renderscript.RenderScript r2 = android.renderscript.RenderScript.create(r2)
            r1.renderScript = r2
            if (r2 == 0) goto L2f
            android.renderscript.Element r0 = android.renderscript.Element.U8_4(r2)
            android.renderscript.ScriptIntrinsicYuvToRGB r2 = android.renderscript.ScriptIntrinsicYuvToRGB.create(r2, r0)
            r1.yuvToRgbIntrinsic = r2
        L2f:
            return
        L30:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "context can't be null"
            r2.<init>(r0)
            throw r2
    }

    private void recreateIfNeed(byte[] r2, int r3, int r4, int r5) {
            r1 = this;
            int r5 = r1.width
            if (r5 != r3) goto Le
            int r5 = r1.height
            if (r5 != r4) goto Le
            int r5 = r1.length
            int r0 = r2.length
            if (r5 != r0) goto Le
            return
        Le:
            r1.width = r3
            r1.height = r4
            int r2 = r2.length
            r1.length = r2
            r2 = 0
            r1.yuvType = r2
            r1.rgbaType = r2
            return
    }

    public android.graphics.Bitmap convert(byte[] r11, int r12, int r13, int r14, int r15, int r16) {
            r10 = this;
            r8 = 0
            r9 = 0
            r7 = 0
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            android.graphics.Bitmap r11 = r0.convert(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return r11
    }

    public android.graphics.Bitmap convert(byte[] r12, int r13, int r14, int r15, int r16, int r17, boolean r18, boolean r19, boolean r20) {
            r11 = this;
            r5 = r17
            r11.recreateIfNeed(r12, r13, r14, r5)
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            r4 = r16
            android.graphics.Bitmap r9 = android.graphics.Bitmap.createBitmap(r15, r4, r0)
            android.graphics.Canvas r10 = new android.graphics.Canvas
            r10.<init>(r9)
            android.graphics.Bitmap r12 = r11.convertYUVtoRGB(r12, r13, r14)
            r0 = r11
            r1 = r13
            r2 = r14
            r3 = r15
            r6 = r18
            r7 = r19
            r8 = r20
            android.graphics.Matrix r13 = r0.getTransformationMatrix(r1, r2, r3, r4, r5, r6, r7, r8)
            r14 = 0
            r10.drawBitmap(r12, r13, r14)
            return r9
    }

    public android.graphics.Bitmap convertYUVtoRGB(byte[] r5, int r6, int r7) {
            r4 = this;
            android.renderscript.Type$Builder r0 = r4.yuvType
            if (r0 != 0) goto L44
            android.renderscript.Type$Builder r0 = new android.renderscript.Type$Builder
            android.renderscript.RenderScript r1 = r4.renderScript
            android.renderscript.Element r2 = android.renderscript.Element.U8(r1)
            r0.<init>(r1, r2)
            int r1 = r5.length
            android.renderscript.Type$Builder r0 = r0.setX(r1)
            r4.yuvType = r0
            android.renderscript.RenderScript r1 = r4.renderScript
            android.renderscript.Type r0 = r0.create()
            r2 = 1
            android.renderscript.Allocation r0 = android.renderscript.Allocation.createTyped(r1, r0, r2)
            r4.in = r0
            android.renderscript.Type$Builder r0 = new android.renderscript.Type$Builder
            android.renderscript.RenderScript r1 = r4.renderScript
            android.renderscript.Element r3 = android.renderscript.Element.RGBA_8888(r1)
            r0.<init>(r1, r3)
            android.renderscript.Type$Builder r0 = r0.setX(r6)
            android.renderscript.Type$Builder r0 = r0.setY(r7)
            r4.rgbaType = r0
            android.renderscript.RenderScript r1 = r4.renderScript
            android.renderscript.Type r0 = r0.create()
            android.renderscript.Allocation r0 = android.renderscript.Allocation.createTyped(r1, r0, r2)
            r4.out = r0
        L44:
            android.renderscript.Allocation r0 = r4.in
            r0.copyFrom(r5)
            android.renderscript.ScriptIntrinsicYuvToRGB r5 = r4.yuvToRgbIntrinsic
            if (r5 == 0) goto L59
            android.renderscript.Allocation r0 = r4.in
            r5.setInput(r0)
            android.renderscript.ScriptIntrinsicYuvToRGB r5 = r4.yuvToRgbIntrinsic
            android.renderscript.Allocation r0 = r4.out
            r5.forEach(r0)
        L59:
            android.graphics.Bitmap$Config r5 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r5 = android.graphics.Bitmap.createBitmap(r6, r7, r5)
            android.renderscript.Allocation r6 = r4.out
            r6.copyTo(r5)
            return r5
    }

    public android.content.Context getApplicationContext() {
            r2 = this;
            android.content.Context r0 = r2.applicationContext
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "initial must be called first"
            r0.<init>(r1)
            throw r0
    }

    public android.graphics.Matrix getTransformationMatrix(int r7, int r8, int r9, int r10, int r11, boolean r12, boolean r13, boolean r14) {
            r6 = this;
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r1 = 0
            r2 = 1
            r3 = 1073741824(0x40000000, float:2.0)
            if (r11 == 0) goto L33
            int r4 = r11 % 90
            if (r4 != 0) goto L1d
            int r4 = -r7
            float r4 = (float) r4
            float r4 = r4 / r3
            int r5 = -r8
            float r5 = (float) r5
            float r5 = r5 / r3
            r0.postTranslate(r4, r5)
            float r4 = (float) r11
            r0.postRotate(r4)
            goto L33
        L1d:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.util.Locale r8 = java.util.Locale.ENGLISH
            java.lang.Integer r9 = java.lang.Integer.valueOf(r11)
            java.lang.Object[] r10 = new java.lang.Object[r2]
            r10[r1] = r9
            java.lang.String r9 = "Rotation of %d"
            java.lang.String r8 = java.lang.String.format(r8, r9, r10)
            r7.<init>(r8)
            throw r7
        L33:
            int r4 = java.lang.Math.abs(r11)
            int r4 = r4 + 90
            int r4 = r4 % 180
            if (r4 != 0) goto L3e
            r1 = 1
        L3e:
            if (r1 == 0) goto L42
            r4 = r8
            goto L43
        L42:
            r4 = r7
        L43:
            if (r1 == 0) goto L46
            goto L47
        L46:
            r7 = r8
        L47:
            r8 = -1
            if (r12 == 0) goto L4c
            r12 = -1
            goto L4d
        L4c:
            r12 = 1
        L4d:
            if (r13 == 0) goto L50
            r2 = -1
        L50:
            if (r4 != r9) goto L54
            if (r7 == r10) goto L73
        L54:
            int r8 = r12 * r9
            float r8 = (float) r8
            float r13 = (float) r4
            float r8 = r8 / r13
            int r13 = r2 * r10
            float r13 = (float) r13
            float r7 = (float) r7
            float r13 = r13 / r7
            if (r14 == 0) goto L70
            float r7 = java.lang.Math.abs(r8)
            float r8 = java.lang.Math.abs(r13)
            float r7 = java.lang.Math.max(r7, r8)
            r0.postScale(r7, r7)
            goto L73
        L70:
            r0.postScale(r8, r13)
        L73:
            if (r11 == 0) goto L81
            float r7 = (float) r9
            float r7 = r7 / r3
            float r8 = (float) r10
            float r8 = r8 / r3
            r0.postTranslate(r7, r8)
            float r9 = (float) r12
            float r10 = (float) r2
            r0.postScale(r9, r10, r7, r8)
        L81:
            return r0
    }
}

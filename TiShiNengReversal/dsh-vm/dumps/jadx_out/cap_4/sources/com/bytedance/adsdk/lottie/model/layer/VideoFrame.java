package com.bytedance.adsdk.lottie.model.layer;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class VideoFrame extends android.view.View {
    private android.graphics.Bitmap ae;
    private final com.bytedance.adsdk.lottie.g.j.C0182j cw;
    private final android.view.TextureView j;

    /* renamed from: m, reason: collision with root package name */
    private long f1833m;

    /* renamed from: r, reason: collision with root package name */
    private android.renderscript.RenderScript f1834r;
    private int tl;
    private android.renderscript.ScriptIntrinsicBlur up;
    private final android.graphics.Matrix xt;

    public VideoFrame(android.content.Context r3, android.view.TextureView r4, com.bytedance.adsdk.lottie.g.j.C0182j r5) {
            r2 = this;
            r2.<init>(r3)
            r0 = -1
            r2.f1833m = r0
            r3 = 0
            r2.ae = r3
            r3 = 0
            r2.tl = r3
            r2.j = r4
            android.graphics.Matrix r3 = new android.graphics.Matrix
            r3.<init>()
            r2.xt = r3
            r2.cw = r5
            return
    }

    public android.graphics.Bitmap j(android.graphics.Bitmap r5, float r6) {
            r4 = this;
            r0 = 0
            android.renderscript.RenderScript r1 = r4.f1834r     // Catch: java.lang.Throwable -> L3a
            if (r1 == 0) goto L3d
            android.renderscript.ScriptIntrinsicBlur r2 = r4.up     // Catch: java.lang.Throwable -> L3a
            if (r2 != 0) goto La
            goto L3d
        La:
            android.renderscript.Allocation$MipmapControl r2 = android.renderscript.Allocation.MipmapControl.MIPMAP_NONE     // Catch: java.lang.Throwable -> L3a
            r3 = 1
            android.renderscript.Allocation r1 = android.renderscript.Allocation.createFromBitmap(r1, r5, r2, r3)     // Catch: java.lang.Throwable -> L3a
            android.renderscript.RenderScript r2 = r4.f1834r     // Catch: java.lang.Throwable -> L3a
            android.renderscript.Type r3 = r1.getType()     // Catch: java.lang.Throwable -> L3a
            android.renderscript.Allocation r2 = android.renderscript.Allocation.createTyped(r2, r3)     // Catch: java.lang.Throwable -> L3a
            android.renderscript.ScriptIntrinsicBlur r3 = r4.up     // Catch: java.lang.Throwable -> L3a
            r3.setRadius(r6)     // Catch: java.lang.Throwable -> L3a
            android.renderscript.ScriptIntrinsicBlur r6 = r4.up     // Catch: java.lang.Throwable -> L3a
            r6.setInput(r1)     // Catch: java.lang.Throwable -> L3a
            android.renderscript.ScriptIntrinsicBlur r6 = r4.up     // Catch: java.lang.Throwable -> L3a
            r6.forEach(r2)     // Catch: java.lang.Throwable -> L3a
            android.graphics.Bitmap r5 = android.graphics.Bitmap.createBitmap(r5)     // Catch: java.lang.Throwable -> L3a
            r2.copyTo(r5)     // Catch: java.lang.Throwable -> L38
            r2.destroy()     // Catch: java.lang.Throwable -> L38
            r1.destroy()     // Catch: java.lang.Throwable -> L38
            return r5
        L38:
            r6 = move-exception
            goto L3e
        L3a:
            r6 = move-exception
            r5 = r0
            goto L3e
        L3d:
            return r0
        L3e:
            com.bytedance.sdk.component.utils.vl.j(r6)
            if (r5 == 0) goto L46
            r5.recycle()
        L46:
            return r0
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
            r2 = this;
            super.onAttachedToWindow()
            android.renderscript.RenderScript r0 = r2.f1834r
            if (r0 == 0) goto La
            r0.destroy()
        La:
            android.renderscript.ScriptIntrinsicBlur r0 = r2.up
            if (r0 == 0) goto L11
            r0.destroy()
        L11:
            android.content.Context r0 = r2.getContext()
            android.renderscript.RenderScript r0 = android.renderscript.RenderScript.create(r0)
            r2.f1834r = r0
            android.renderscript.Element r1 = android.renderscript.Element.U8_4(r0)
            android.renderscript.ScriptIntrinsicBlur r0 = android.renderscript.ScriptIntrinsicBlur.create(r0, r1)
            r2.up = r0
            return
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
            r2 = this;
            super.onDetachedFromWindow()
            android.graphics.Bitmap r0 = r2.ae
            if (r0 == 0) goto L12
            boolean r0 = r0.isRecycled()
            if (r0 != 0) goto L12
            android.graphics.Bitmap r0 = r2.ae
            r0.recycle()
        L12:
            android.renderscript.ScriptIntrinsicBlur r0 = r2.up
            r1 = 0
            if (r0 == 0) goto L1c
            r0.destroy()
            r2.up = r1
        L1c:
            android.renderscript.RenderScript r0 = r2.f1834r
            if (r0 == 0) goto L25
            r0.destroy()
            r2.f1834r = r1
        L25:
            return
    }

    @Override // android.view.View
    protected void onDraw(android.graphics.Canvas r10) {
            r9 = this;
            super.onDraw(r10)
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r2 = r9.f1833m
            long r2 = r0 - r2
            r4 = 40
            r6 = 1126170624(0x43200000, float:160.0)
            r7 = 0
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 < 0) goto L61
            r9.f1833m = r0
            android.view.TextureView r0 = r9.j
            if (r0 == 0) goto L61
            boolean r0 = r0.isAvailable()
            if (r0 == 0) goto L61
            android.view.TextureView r0 = r9.j
            int r0 = r0.getWidth()
            float r0 = (float) r0
            float r0 = r0 / r6
            int r1 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r1 <= 0) goto L37
            android.view.TextureView r1 = r9.j
            int r1 = r1.getHeight()
            float r1 = (float) r1
            float r1 = r1 / r0
            int r0 = (int) r1
            r9.tl = r0
        L37:
            int r0 = r9.tl
            if (r0 <= 0) goto L61
            android.view.TextureView r1 = r9.j
            r2 = 160(0xa0, float:2.24E-43)
            android.graphics.Bitmap r0 = r1.getBitmap(r2, r0)
            if (r0 == 0) goto L61
            android.graphics.Bitmap r1 = r9.ae
            if (r1 == 0) goto L54
            boolean r1 = r1.isRecycled()
            if (r1 != 0) goto L54
            android.graphics.Bitmap r1 = r9.ae
            r1.recycle()
        L54:
            com.bytedance.adsdk.lottie.g$j$j r1 = r9.cw
            float r1 = r1.j
            android.graphics.Bitmap r1 = r9.j(r0, r1)
            r9.ae = r1
            r0.recycle()
        L61:
            int r0 = r9.tl
            if (r0 <= 0) goto L99
            android.graphics.Bitmap r0 = r9.ae
            if (r0 == 0) goto L99
            boolean r0 = r0.isRecycled()
            if (r0 != 0) goto L99
            r10.save()
            android.graphics.Matrix r0 = r9.xt
            r0.reset()
            android.graphics.Matrix r0 = r9.xt
            int r1 = r9.getWidth()
            float r1 = (float) r1
            float r1 = r1 / r6
            int r2 = r9.getHeight()
            float r2 = (float) r2
            int r3 = r9.tl
            float r3 = (float) r3
            float r2 = r2 / r3
            r0.setScale(r1, r2)
            android.graphics.Matrix r0 = r9.xt
            r10.concat(r0)
            android.graphics.Bitmap r0 = r9.ae
            r1 = 0
            r10.drawBitmap(r0, r7, r7, r1)
            r10.restore()
        L99:
            return
    }
}

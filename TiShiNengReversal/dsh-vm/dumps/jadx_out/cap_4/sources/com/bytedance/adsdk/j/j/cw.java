package com.bytedance.adsdk.j.j;

import com.bytedance.adsdk.j.j.j.g;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public abstract class cw<Decoder extends com.bytedance.adsdk.j.j.j.g<?, ?>> extends android.graphics.drawable.Drawable implements com.bytedance.adsdk.j.j.j.g.j, com.bytedance.adsdk.j.j.xt {
    private static final java.lang.String j = "cw";
    private android.graphics.Bitmap ae;
    private final Decoder cw;
    private final java.lang.Runnable g;

    /* renamed from: m, reason: collision with root package name */
    private final java.util.Set<java.lang.Object> f1736m;
    private boolean oq;
    private final java.util.Set<java.lang.ref.WeakReference<android.graphics.drawable.Drawable.Callback>> qv;

    /* renamed from: r, reason: collision with root package name */
    private final android.graphics.DrawFilter f1737r;
    private final android.os.Handler tl;
    private final android.graphics.Matrix up;
    private boolean vl;
    private final android.graphics.Paint xt;



    static {
            return
    }

    public cw(com.bytedance.adsdk.j.j.cw.xt r5) {
            r4 = this;
            r4.<init>()
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r4.xt = r0
            android.graphics.PaintFlagsDrawFilter r1 = new android.graphics.PaintFlagsDrawFilter
            r2 = 3
            r3 = 0
            r1.<init>(r3, r2)
            r4.f1737r = r1
            android.graphics.Matrix r1 = new android.graphics.Matrix
            r1.<init>()
            r4.up = r1
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            r4.f1736m = r1
            com.bytedance.adsdk.j.j.cw$1 r1 = new com.bytedance.adsdk.j.j.cw$1
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r1.<init>(r4, r2)
            r4.tl = r1
            com.bytedance.adsdk.j.j.cw$2 r1 = new com.bytedance.adsdk.j.j.cw$2
            r1.<init>(r4)
            r4.g = r1
            r1 = 1
            r4.oq = r1
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            r4.qv = r2
            r4.vl = r3
            r0.setAntiAlias(r1)
            com.bytedance.adsdk.j.j.j.g r5 = r4.xt(r5, r4)
            r4.cw = r5
            return
    }

    private void cw() {
            r1 = this;
            Decoder extends com.bytedance.adsdk.j.j.j.g<?, ?> r0 = r1.cw
            r0.j(r1)
            boolean r0 = r1.oq
            if (r0 == 0) goto Lf
            Decoder extends com.bytedance.adsdk.j.j.j.g<?, ?> r0 = r1.cw
            r0.tl()
            return
        Lf:
            Decoder extends com.bytedance.adsdk.j.j.j.g<?, ?> r0 = r1.cw
            boolean r0 = r0.oq()
            if (r0 != 0) goto L1c
            Decoder extends com.bytedance.adsdk.j.j.j.g<?, ?> r0 = r1.cw
            r0.tl()
        L1c:
            return
    }

    static /* synthetic */ java.util.Set j(com.bytedance.adsdk.j.j.cw r0) {
            java.util.Set<java.lang.Object> r0 = r0.f1736m
            return r0
    }

    private void r() {
            r1 = this;
            Decoder extends com.bytedance.adsdk.j.j.j.g<?, ?> r0 = r1.cw
            r0.xt(r1)
            boolean r0 = r1.oq
            if (r0 == 0) goto Lf
            Decoder extends com.bytedance.adsdk.j.j.j.g<?, ?> r0 = r1.cw
            r0.g()
            return
        Lf:
            Decoder extends com.bytedance.adsdk.j.j.j.g<?, ?> r0 = r1.cw
            r0.up()
            return
    }

    private void up() {
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.graphics.drawable.Drawable$Callback r1 = r6.getCallback()
            java.util.HashSet r2 = new java.util.HashSet
            java.util.Set<java.lang.ref.WeakReference<android.graphics.drawable.Drawable$Callback>> r3 = r6.qv
            r2.<init>(r3)
            java.util.Iterator r2 = r2.iterator()
            r3 = 0
        L15:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L35
            java.lang.Object r4 = r2.next()
            java.lang.ref.WeakReference r4 = (java.lang.ref.WeakReference) r4
            java.lang.Object r5 = r4.get()
            android.graphics.drawable.Drawable$Callback r5 = (android.graphics.drawable.Drawable.Callback) r5
            if (r5 != 0) goto L2d
            r0.add(r4)
            goto L15
        L2d:
            if (r5 != r1) goto L31
            r3 = 1
            goto L15
        L31:
            r5.invalidateDrawable(r6)
            goto L15
        L35:
            java.util.Iterator r0 = r0.iterator()
        L39:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L4b
            java.lang.Object r2 = r0.next()
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2
            java.util.Set<java.lang.ref.WeakReference<android.graphics.drawable.Drawable$Callback>> r4 = r6.qv
            r4.remove(r2)
            goto L39
        L4b:
            if (r3 != 0) goto L57
            java.util.Set<java.lang.ref.WeakReference<android.graphics.drawable.Drawable$Callback>> r0 = r6.qv
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
            r2.<init>(r1)
            r0.add(r2)
        L57:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas r4) {
            r3 = this;
            android.graphics.Bitmap r0 = r3.ae
            if (r0 == 0) goto L19
            boolean r0 = r0.isRecycled()
            if (r0 == 0) goto Lb
            goto L19
        Lb:
            android.graphics.DrawFilter r0 = r3.f1737r
            r4.setDrawFilter(r0)
            android.graphics.Bitmap r0 = r3.ae
            android.graphics.Matrix r1 = r3.up
            android.graphics.Paint r2 = r3.xt
            r4.drawBitmap(r0, r1, r2)
        L19:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.drawable.Drawable.Callback getCallback() {
            r1 = this;
            android.graphics.drawable.Drawable$Callback r0 = super.getCallback()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
            r1 = this;
            boolean r0 = r1.vl
            if (r0 == 0) goto L6
            r0 = -1
            return r0
        L6:
            Decoder extends com.bytedance.adsdk.j.j.j.g<?, ?> r0 = r1.cw     // Catch: java.lang.Exception -> L11
            android.graphics.Rect r0 = r0.m()     // Catch: java.lang.Exception -> L11
            int r0 = r0.height()     // Catch: java.lang.Exception -> L11
            return r0
        L11:
            r0 = 0
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
            r1 = this;
            boolean r0 = r1.vl
            if (r0 == 0) goto L6
            r0 = -1
            return r0
        L6:
            Decoder extends com.bytedance.adsdk.j.j.j.g<?, ?> r0 = r1.cw     // Catch: java.lang.Exception -> L11
            android.graphics.Rect r0 = r0.m()     // Catch: java.lang.Exception -> L11
            int r0 = r0.width()     // Catch: java.lang.Exception -> L11
            return r0
        L11:
            r0 = 0
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
            r1 = this;
            r0 = -3
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
            r3 = this;
            super.invalidateSelf()
            java.util.HashSet r0 = new java.util.HashSet
            java.util.Set<java.lang.ref.WeakReference<android.graphics.drawable.Drawable$Callback>> r1 = r3.qv
            r0.<init>(r1)
            java.util.Iterator r0 = r0.iterator()
        Le:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2c
            java.lang.Object r1 = r0.next()
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
            java.lang.Object r1 = r1.get()
            android.graphics.drawable.Drawable$Callback r1 = (android.graphics.drawable.Drawable.Callback) r1
            if (r1 == 0) goto Le
            android.graphics.drawable.Drawable$Callback r2 = r3.getCallback()
            if (r1 == r2) goto Le
            r1.invalidateDrawable(r3)
            goto Le
        L2c:
            return
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
            r1 = this;
            Decoder extends com.bytedance.adsdk.j.j.j.g<?, ?> r0 = r1.cw
            boolean r0 = r0.oq()
            return r0
    }

    @Override // com.bytedance.adsdk.j.j.j.g.j
    public void j() {
            r2 = this;
            android.os.Handler r0 = r2.tl
            r1 = 1
            android.os.Message r0 = android.os.Message.obtain(r0, r1)
            r0.sendToTarget()
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int r2) {
            r1 = this;
            android.graphics.Paint r0 = r1.xt
            r0.setAlpha(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int r2, int r3, int r4, int r5) {
            r1 = this;
            super.setBounds(r2, r3, r4, r5)
            Decoder extends com.bytedance.adsdk.j.j.j.g<?, ?> r2 = r1.cw
            android.graphics.Rect r3 = r1.getBounds()
            int r3 = r3.width()
            android.graphics.Rect r4 = r1.getBounds()
            int r4 = r4.height()
            boolean r2 = r2.xt(r3, r4)
            android.graphics.Matrix r3 = r1.up
            android.graphics.Rect r4 = r1.getBounds()
            int r4 = r4.width()
            float r4 = (float) r4
            r5 = 1065353216(0x3f800000, float:1.0)
            float r4 = r4 * r5
            Decoder extends com.bytedance.adsdk.j.j.j.g<?, ?> r0 = r1.cw
            int r0 = r0.vl()
            float r0 = (float) r0
            float r4 = r4 * r0
            Decoder extends com.bytedance.adsdk.j.j.j.g<?, ?> r0 = r1.cw
            android.graphics.Rect r0 = r0.m()
            int r0 = r0.width()
            float r0 = (float) r0
            float r4 = r4 / r0
            android.graphics.Rect r0 = r1.getBounds()
            int r0 = r0.height()
            float r0 = (float) r0
            float r0 = r0 * r5
            Decoder extends com.bytedance.adsdk.j.j.j.g<?, ?> r5 = r1.cw
            int r5 = r5.vl()
            float r5 = (float) r5
            float r0 = r0 * r5
            Decoder extends com.bytedance.adsdk.j.j.j.g<?, ?> r5 = r1.cw
            android.graphics.Rect r5 = r5.m()
            int r5 = r5.height()
            float r5 = (float) r5
            float r0 = r0 / r5
            r3.setScale(r4, r0)
            if (r2 == 0) goto L8c
            Decoder extends com.bytedance.adsdk.j.j.j.g<?, ?> r2 = r1.cw
            android.graphics.Rect r2 = r2.m()
            int r2 = r2.width()
            Decoder extends com.bytedance.adsdk.j.j.j.g<?, ?> r3 = r1.cw
            int r3 = r3.vl()
            int r2 = r2 / r3
            Decoder extends com.bytedance.adsdk.j.j.j.g<?, ?> r3 = r1.cw
            android.graphics.Rect r3 = r3.m()
            int r3 = r3.height()
            Decoder extends com.bytedance.adsdk.j.j.j.g<?, ?> r4 = r1.cw
            int r4 = r4.vl()
            int r3 = r3 / r4
            android.graphics.Bitmap$Config r4 = android.graphics.Bitmap.Config.ARGB_4444
            android.graphics.Bitmap r2 = android.graphics.Bitmap.createBitmap(r2, r3, r4)
            r1.ae = r2
        L8c:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter r2) {
            r1 = this;
            android.graphics.Paint r0 = r1.xt
            r0.setColorFilter(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean r2, boolean r3) {
            r1 = this;
            r1.up()
            boolean r0 = r1.oq
            if (r0 == 0) goto L1c
            if (r2 == 0) goto L13
            boolean r0 = r1.isRunning()
            if (r0 != 0) goto L1c
            r1.cw()
            goto L1c
        L13:
            boolean r0 = r1.isRunning()
            if (r0 == 0) goto L1c
            r1.r()
        L1c:
            boolean r2 = super.setVisible(r2, r3)
            return r2
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
            r1 = this;
            Decoder extends com.bytedance.adsdk.j.j.j.g<?, ?> r0 = r1.cw
            boolean r0 = r0.oq()
            if (r0 == 0) goto Ld
            Decoder extends com.bytedance.adsdk.j.j.j.g<?, ?> r0 = r1.cw
            r0.g()
        Ld:
            Decoder extends com.bytedance.adsdk.j.j.j.g<?, ?> r0 = r1.cw
            r0.qv()
            r1.cw()
            return
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
            r0 = this;
            r0.r()
            return
    }

    protected abstract Decoder xt(com.bytedance.adsdk.j.j.cw.xt r1, com.bytedance.adsdk.j.j.j.g.j r2);

    @Override // com.bytedance.adsdk.j.j.j.g.j
    public void xt() {
            r2 = this;
            android.os.Handler r0 = r2.tl
            r1 = 2
            android.os.Message r0 = android.os.Message.obtain(r0, r1)
            r0.sendToTarget()
            return
    }

    @Override // com.bytedance.adsdk.j.j.j.g.j
    public void xt(java.nio.ByteBuffer r4) {
            r3 = this;
            boolean r0 = r3.isRunning()
            if (r0 != 0) goto L7
            return
        L7:
            android.graphics.Bitmap r0 = r3.ae
            if (r0 == 0) goto L11
            boolean r0 = r0.isRecycled()
            if (r0 == 0) goto L3b
        L11:
            Decoder extends com.bytedance.adsdk.j.j.j.g<?, ?> r0 = r3.cw
            android.graphics.Rect r0 = r0.m()
            int r0 = r0.width()
            Decoder extends com.bytedance.adsdk.j.j.j.g<?, ?> r1 = r3.cw
            int r1 = r1.vl()
            int r0 = r0 / r1
            Decoder extends com.bytedance.adsdk.j.j.j.g<?, ?> r1 = r3.cw
            android.graphics.Rect r1 = r1.m()
            int r1 = r1.height()
            Decoder extends com.bytedance.adsdk.j.j.j.g<?, ?> r2 = r3.cw
            int r2 = r2.vl()
            int r1 = r1 / r2
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_4444
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r0, r1, r2)
            r3.ae = r0
        L3b:
            r4.rewind()
            int r0 = r4.remaining()
            android.graphics.Bitmap r1 = r3.ae
            int r1 = r1.getByteCount()
            if (r0 >= r1) goto L52
            java.lang.String r4 = com.bytedance.adsdk.j.j.cw.j
            java.lang.String r0 = "onRender:Buffer not large enough for pixels"
            com.bytedance.sdk.component.utils.vl.r(r4, r0)
            return
        L52:
            android.graphics.Bitmap r0 = r3.ae
            r0.copyPixelsFromBuffer(r4)
            android.os.Handler r4 = r3.tl
            java.lang.Runnable r0 = r3.g
            r4.post(r0)
            return
    }
}

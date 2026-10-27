package com.bumptech.glide.load.resource.gif;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class GifDrawable extends android.graphics.drawable.Drawable implements com.bumptech.glide.load.resource.gif.f.b, android.graphics.drawable.Animatable, androidx.vectordrawable.graphics.drawable.Animatable2Compat {

    /* renamed from: l, reason: collision with root package name */
    public static final int f462l = -1;

    /* renamed from: m, reason: collision with root package name */
    public static final int f463m = 0;

    /* renamed from: n, reason: collision with root package name */
    private static final int f464n = 119;
    private final com.bumptech.glide.load.resource.gif.GifDrawable.a a;
    private boolean b;
    private boolean c;
    private boolean d;
    private boolean e;
    private int f;
    private int g;
    private boolean h;
    private android.graphics.Paint i;
    private android.graphics.Rect j;
    private java.util.List<androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback> k;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class a extends android.graphics.drawable.Drawable.ConstantState {

        @androidx.annotation.VisibleForTesting
        final com.bumptech.glide.load.resource.gif.f a;

        a(com.bumptech.glide.load.resource.gif.f r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                return
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @androidx.annotation.NonNull
        public android.graphics.drawable.Drawable newDrawable() {
                r1 = this;
                com.bumptech.glide.load.resource.gif.GifDrawable r0 = new com.bumptech.glide.load.resource.gif.GifDrawable
                r0.<init>(r1)
                return r0
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @androidx.annotation.NonNull
        public android.graphics.drawable.Drawable newDrawable(android.content.res.Resources r1) {
                r0 = this;
                android.graphics.drawable.Drawable r1 = r0.newDrawable()
                return r1
        }
    }

    @java.lang.Deprecated
    public GifDrawable(android.content.Context r1, com.bumptech.glide.gifdecoder.GifDecoder r2, com.bumptech.glide.load.engine.bitmap_recycle.e r3, com.bumptech.glide.load.i<android.graphics.Bitmap> r4, int r5, int r6, android.graphics.Bitmap r7) {
            r0 = this;
            r3 = r2
            r2 = r1
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return
    }

    public GifDrawable(android.content.Context r9, com.bumptech.glide.gifdecoder.GifDecoder r10, com.bumptech.glide.load.i<android.graphics.Bitmap> r11, int r12, int r13, android.graphics.Bitmap r14) {
            r8 = this;
            com.bumptech.glide.load.resource.gif.GifDrawable$a r0 = new com.bumptech.glide.load.resource.gif.GifDrawable$a
            com.bumptech.glide.load.resource.gif.f r1 = new com.bumptech.glide.load.resource.gif.f
            com.bumptech.glide.b r2 = com.bumptech.glide.b.e(r9)
            r3 = r10
            r6 = r11
            r4 = r12
            r5 = r13
            r7 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r0.<init>(r1)
            r8.<init>(r0)
            return
    }

    GifDrawable(com.bumptech.glide.load.resource.gif.GifDrawable.a r2) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.e = r0
            r0 = -1
            r1.g = r0
            java.lang.Object r2 = com.bumptech.glide.util.k.d(r2)
            com.bumptech.glide.load.resource.gif.GifDrawable$a r2 = (com.bumptech.glide.load.resource.gif.GifDrawable.a) r2
            r1.a = r2
            return
    }

    @androidx.annotation.VisibleForTesting
    GifDrawable(com.bumptech.glide.load.resource.gif.f r2, android.graphics.Paint r3) {
            r1 = this;
            com.bumptech.glide.load.resource.gif.GifDrawable$a r0 = new com.bumptech.glide.load.resource.gif.GifDrawable$a
            r0.<init>(r2)
            r1.<init>(r0)
            r1.i = r3
            return
    }

    private android.graphics.drawable.Drawable.Callback b() {
            r2 = this;
            android.graphics.drawable.Drawable$Callback r0 = r2.getCallback()
        L4:
            boolean r1 = r0 instanceof android.graphics.drawable.Drawable
            if (r1 == 0) goto Lf
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            android.graphics.drawable.Drawable$Callback r0 = r0.getCallback()
            goto L4
        Lf:
            return r0
    }

    private android.graphics.Rect d() {
            r1 = this;
            android.graphics.Rect r0 = r1.j
            if (r0 != 0) goto Lb
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r1.j = r0
        Lb:
            android.graphics.Rect r0 = r1.j
            return r0
    }

    private android.graphics.Paint i() {
            r2 = this;
            android.graphics.Paint r0 = r2.i
            if (r0 != 0) goto Lc
            android.graphics.Paint r0 = new android.graphics.Paint
            r1 = 2
            r0.<init>(r1)
            r2.i = r0
        Lc:
            android.graphics.Paint r0 = r2.i
            return r0
    }

    private void l() {
            r3 = this;
            java.util.List<androidx.vectordrawable.graphics.drawable.Animatable2Compat$AnimationCallback> r0 = r3.k
            if (r0 == 0) goto L19
            int r0 = r0.size()
            r1 = 0
        L9:
            if (r1 >= r0) goto L19
            java.util.List<androidx.vectordrawable.graphics.drawable.Animatable2Compat$AnimationCallback> r2 = r3.k
            java.lang.Object r2 = r2.get(r1)
            androidx.vectordrawable.graphics.drawable.Animatable2Compat$AnimationCallback r2 = (androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback) r2
            r2.onAnimationEnd(r3)
            int r1 = r1 + 1
            goto L9
        L19:
            return
    }

    private void n() {
            r1 = this;
            r0 = 0
            r1.f = r0
            return
    }

    private void s() {
            r3 = this;
            boolean r0 = r3.d
            r1 = 1
            r0 = r0 ^ r1
            java.lang.String r2 = "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request."
            com.bumptech.glide.util.k.a(r0, r2)
            com.bumptech.glide.load.resource.gif.GifDrawable$a r0 = r3.a
            com.bumptech.glide.load.resource.gif.f r0 = r0.a
            int r0 = r0.f()
            if (r0 != r1) goto L17
            r3.invalidateSelf()
            return
        L17:
            boolean r0 = r3.b
            if (r0 != 0) goto L27
            r3.b = r1
            com.bumptech.glide.load.resource.gif.GifDrawable$a r0 = r3.a
            com.bumptech.glide.load.resource.gif.f r0 = r0.a
            r0.v(r3)
            r3.invalidateSelf()
        L27:
            return
    }

    private void t() {
            r1 = this;
            r0 = 0
            r1.b = r0
            com.bumptech.glide.load.resource.gif.GifDrawable$a r0 = r1.a
            com.bumptech.glide.load.resource.gif.f r0 = r0.a
            r0.w(r1)
            return
    }

    @Override // com.bumptech.glide.load.resource.gif.f.b
    public void a() {
            r2 = this;
            android.graphics.drawable.Drawable$Callback r0 = r2.b()
            if (r0 != 0) goto Ld
            r2.stop()
            r2.invalidateSelf()
            return
        Ld:
            r2.invalidateSelf()
            int r0 = r2.g()
            int r1 = r2.f()
            int r1 = r1 + (-1)
            if (r0 != r1) goto L22
            int r0 = r2.f
            int r0 = r0 + 1
            r2.f = r0
        L22:
            int r0 = r2.g
            r1 = -1
            if (r0 == r1) goto L31
            int r1 = r2.f
            if (r1 < r0) goto L31
            r2.l()
            r2.stop()
        L31:
            return
    }

    public java.nio.ByteBuffer c() {
            r1 = this;
            com.bumptech.glide.load.resource.gif.GifDrawable$a r0 = r1.a
            com.bumptech.glide.load.resource.gif.f r0 = r0.a
            java.nio.ByteBuffer r0 = r0.b()
            return r0
    }

    public void clearAnimationCallbacks() {
            r1 = this;
            java.util.List<androidx.vectordrawable.graphics.drawable.Animatable2Compat$AnimationCallback> r0 = r1.k
            if (r0 == 0) goto L7
            r0.clear()
        L7:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@androidx.annotation.NonNull android.graphics.Canvas r6) {
            r5 = this;
            boolean r0 = r5.d
            if (r0 == 0) goto L5
            return
        L5:
            boolean r0 = r5.h
            if (r0 == 0) goto L21
            int r0 = r5.getIntrinsicWidth()
            int r1 = r5.getIntrinsicHeight()
            android.graphics.Rect r2 = r5.getBounds()
            android.graphics.Rect r3 = r5.d()
            r4 = 119(0x77, float:1.67E-43)
            android.view.Gravity.apply(r4, r0, r1, r2, r3)
            r0 = 0
            r5.h = r0
        L21:
            com.bumptech.glide.load.resource.gif.GifDrawable$a r0 = r5.a
            com.bumptech.glide.load.resource.gif.f r0 = r0.a
            android.graphics.Bitmap r0 = r0.c()
            android.graphics.Rect r1 = r5.d()
            android.graphics.Paint r2 = r5.i()
            r3 = 0
            r6.drawBitmap(r0, r3, r1, r2)
            return
    }

    public android.graphics.Bitmap e() {
            r1 = this;
            com.bumptech.glide.load.resource.gif.GifDrawable$a r0 = r1.a
            com.bumptech.glide.load.resource.gif.f r0 = r0.a
            android.graphics.Bitmap r0 = r0.e()
            return r0
    }

    public int f() {
            r1 = this;
            com.bumptech.glide.load.resource.gif.GifDrawable$a r0 = r1.a
            com.bumptech.glide.load.resource.gif.f r0 = r0.a
            int r0 = r0.f()
            return r0
    }

    public int g() {
            r1 = this;
            com.bumptech.glide.load.resource.gif.GifDrawable$a r0 = r1.a
            com.bumptech.glide.load.resource.gif.f r0 = r0.a
            int r0 = r0.d()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.drawable.Drawable.ConstantState getConstantState() {
            r1 = this;
            com.bumptech.glide.load.resource.gif.GifDrawable$a r0 = r1.a
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
            r1 = this;
            com.bumptech.glide.load.resource.gif.GifDrawable$a r0 = r1.a
            com.bumptech.glide.load.resource.gif.f r0 = r0.a
            int r0 = r0.i()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
            r1 = this;
            com.bumptech.glide.load.resource.gif.GifDrawable$a r0 = r1.a
            com.bumptech.glide.load.resource.gif.f r0 = r0.a
            int r0 = r0.m()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
            r1 = this;
            r0 = -2
            return r0
    }

    public com.bumptech.glide.load.i<android.graphics.Bitmap> h() {
            r1 = this;
            com.bumptech.glide.load.resource.gif.GifDrawable$a r0 = r1.a
            com.bumptech.glide.load.resource.gif.f r0 = r0.a
            com.bumptech.glide.load.i r0 = r0.h()
            return r0
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
            r1 = this;
            boolean r0 = r1.b
            return r0
    }

    public int j() {
            r1 = this;
            com.bumptech.glide.load.resource.gif.GifDrawable$a r0 = r1.a
            com.bumptech.glide.load.resource.gif.f r0 = r0.a
            int r0 = r0.l()
            return r0
    }

    boolean k() {
            r1 = this;
            boolean r0 = r1.d
            return r0
    }

    public void m() {
            r1 = this;
            r0 = 1
            r1.d = r0
            com.bumptech.glide.load.resource.gif.GifDrawable$a r0 = r1.a
            com.bumptech.glide.load.resource.gif.f r0 = r0.a
            r0.a()
            return
    }

    public void o(com.bumptech.glide.load.i<android.graphics.Bitmap> r2, android.graphics.Bitmap r3) {
            r1 = this;
            com.bumptech.glide.load.resource.gif.GifDrawable$a r0 = r1.a
            com.bumptech.glide.load.resource.gif.f r0 = r0.a
            r0.q(r2, r3)
            return
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(android.graphics.Rect r1) {
            r0 = this;
            super.onBoundsChange(r1)
            r1 = 1
            r0.h = r1
            return
    }

    void p(boolean r1) {
            r0 = this;
            r0.b = r1
            return
    }

    public void q(int r2) {
            r1 = this;
            r0 = -1
            if (r2 > 0) goto L10
            if (r2 == r0) goto L10
            if (r2 != 0) goto L8
            goto L10
        L8:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Loop count must be greater than 0, or equal to GlideDrawable.LOOP_FOREVER, or equal to GlideDrawable.LOOP_INTRINSIC"
            r2.<init>(r0)
            throw r2
        L10:
            if (r2 != 0) goto L21
            com.bumptech.glide.load.resource.gif.GifDrawable$a r2 = r1.a
            com.bumptech.glide.load.resource.gif.f r2 = r2.a
            int r2 = r2.j()
            if (r2 != 0) goto L1d
            goto L1e
        L1d:
            r0 = r2
        L1e:
            r1.g = r0
            return
        L21:
            r1.g = r2
            return
    }

    public void r() {
            r2 = this;
            boolean r0 = r2.b
            r0 = r0 ^ 1
            java.lang.String r1 = "You cannot restart a currently running animation."
            com.bumptech.glide.util.k.a(r0, r1)
            com.bumptech.glide.load.resource.gif.GifDrawable$a r0 = r2.a
            com.bumptech.glide.load.resource.gif.f r0 = r0.a
            r0.r()
            r2.start()
            return
    }

    public void registerAnimationCallback(@androidx.annotation.NonNull androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback r2) {
            r1 = this;
            if (r2 != 0) goto L3
            return
        L3:
            java.util.List<androidx.vectordrawable.graphics.drawable.Animatable2Compat$AnimationCallback> r0 = r1.k
            if (r0 != 0) goto Le
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.k = r0
        Le:
            java.util.List<androidx.vectordrawable.graphics.drawable.Animatable2Compat$AnimationCallback> r0 = r1.k
            r0.add(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int r2) {
            r1 = this;
            android.graphics.Paint r0 = r1.i()
            r0.setAlpha(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter r2) {
            r1 = this;
            android.graphics.Paint r0 = r1.i()
            r0.setColorFilter(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean r3, boolean r4) {
            r2 = this;
            boolean r0 = r2.d
            r0 = r0 ^ 1
            java.lang.String r1 = "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility."
            com.bumptech.glide.util.k.a(r0, r1)
            r2.e = r3
            if (r3 != 0) goto L11
            r2.t()
            goto L18
        L11:
            boolean r0 = r2.c
            if (r0 == 0) goto L18
            r2.s()
        L18:
            boolean r3 = super.setVisible(r3, r4)
            return r3
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
            r1 = this;
            r0 = 1
            r1.c = r0
            r1.n()
            boolean r0 = r1.e
            if (r0 == 0) goto Ld
            r1.s()
        Ld:
            return
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
            r1 = this;
            r0 = 0
            r1.c = r0
            r1.t()
            return
    }

    public boolean unregisterAnimationCallback(@androidx.annotation.NonNull androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback r2) {
            r1 = this;
            java.util.List<androidx.vectordrawable.graphics.drawable.Animatable2Compat$AnimationCallback> r0 = r1.k
            if (r0 == 0) goto Lc
            if (r2 != 0) goto L7
            goto Lc
        L7:
            boolean r2 = r0.remove(r2)
            return r2
        Lc:
            r2 = 0
            return r2
    }
}

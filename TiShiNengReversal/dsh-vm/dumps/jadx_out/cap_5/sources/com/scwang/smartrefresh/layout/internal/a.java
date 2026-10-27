package com.scwang.smartrefresh.layout.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class a extends android.graphics.drawable.Drawable implements android.graphics.drawable.Animatable {
    private int a;
    private android.animation.ValueAnimator b;
    private android.graphics.Path c;
    private android.graphics.Paint d;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.scwang.smartrefresh.layout.internal.a$a, reason: collision with other inner class name */
    class C0184a implements android.animation.ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ com.scwang.smartrefresh.layout.internal.a a;

        C0184a(com.scwang.smartrefresh.layout.internal.a r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(android.animation.ValueAnimator r2) {
                r1 = this;
                java.lang.Object r2 = r2.getAnimatedValue()
                java.lang.Integer r2 = (java.lang.Integer) r2
                int r2 = r2.intValue()
                com.scwang.smartrefresh.layout.internal.a r0 = r1.a
                int r2 = r2 / 30
                int r2 = r2 * 30
                com.scwang.smartrefresh.layout.internal.a.a(r0, r2)
                com.scwang.smartrefresh.layout.internal.a r2 = r1.a
                r2.invalidateSelf()
                return
        }
    }

    public a() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.a = r0
            android.graphics.Path r0 = new android.graphics.Path
            r0.<init>()
            r2.c = r0
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r2.d = r0
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.FILL
            r0.setStyle(r1)
            android.graphics.Paint r0 = r2.d
            r1 = 1
            r0.setAntiAlias(r1)
            android.graphics.Paint r0 = r2.d
            r1 = -5592406(0xffffffffffaaaaaa, float:NaN)
            r0.setColor(r1)
            r2.d()
            return
    }

    static /* synthetic */ int a(com.scwang.smartrefresh.layout.internal.a r0, int r1) {
            r0.a = r1
            return r1
    }

    private void d() {
            r3 = this;
            r0 = 30
            r1 = 3600(0xe10, float:5.045E-42)
            int[] r0 = new int[]{r0, r1}
            android.animation.ValueAnimator r0 = android.animation.ValueAnimator.ofInt(r0)
            r3.b = r0
            com.scwang.smartrefresh.layout.internal.a$a r1 = new com.scwang.smartrefresh.layout.internal.a$a
            r1.<init>(r3)
            r0.addUpdateListener(r1)
            android.animation.ValueAnimator r0 = r3.b
            r1 = 10000(0x2710, double:4.9407E-320)
            r0.setDuration(r1)
            android.animation.ValueAnimator r0 = r3.b
            android.view.animation.LinearInterpolator r1 = new android.view.animation.LinearInterpolator
            r1.<init>()
            r0.setInterpolator(r1)
            android.animation.ValueAnimator r0 = r3.b
            r1 = -1
            r0.setRepeatCount(r1)
            android.animation.ValueAnimator r0 = r3.b
            r1 = 1
            r0.setRepeatMode(r1)
            return
    }

    public int b() {
            r1 = this;
            android.graphics.Rect r0 = r1.getBounds()
            int r0 = r0.height()
            return r0
    }

    public void c(int r2) {
            r1 = this;
            android.graphics.Paint r0 = r1.d
            r0.setColor(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@androidx.annotation.NonNull android.graphics.Canvas r15) {
            r14 = this;
            android.graphics.Rect r0 = r14.getBounds()
            int r1 = r0.width()
            int r0 = r0.height()
            r15.save()
            int r2 = r14.a
            float r2 = (float) r2
            int r3 = r1 / 2
            float r3 = (float) r3
            int r0 = r0 / 2
            float r4 = (float) r0
            r15.rotate(r2, r3, r4)
            int r2 = r1 / 20
            r5 = 1
            int r2 = java.lang.Math.max(r5, r2)
            r5 = 0
        L23:
            r6 = 12
            if (r5 >= r6) goto L64
            android.graphics.Path r6 = r14.c
            r6.reset()
            android.graphics.Path r6 = r14.c
            int r7 = r1 - r2
            float r11 = (float) r7
            float r7 = (float) r2
            android.graphics.Path$Direction r13 = android.graphics.Path.Direction.CW
            r6.addCircle(r11, r4, r7, r13)
            android.graphics.Path r8 = r14.c
            int r6 = r2 * 5
            int r6 = r1 - r6
            float r9 = (float) r6
            int r6 = r0 - r2
            float r10 = (float) r6
            int r6 = r0 + r2
            float r12 = (float) r6
            r8.addRect(r9, r10, r11, r12, r13)
            android.graphics.Path r6 = r14.c
            r6.addCircle(r9, r4, r7, r13)
            android.graphics.Paint r6 = r14.d
            int r7 = r5 + 5
            int r7 = r7 * 17
            r6.setAlpha(r7)
            r6 = 1106247680(0x41f00000, float:30.0)
            r15.rotate(r6, r3, r4)
            android.graphics.Path r6 = r14.c
            android.graphics.Paint r7 = r14.d
            r15.drawPath(r6, r7)
            int r5 = r5 + 1
            goto L23
        L64:
            r15.restore()
            return
    }

    public int e() {
            r1 = this;
            android.graphics.Rect r0 = r1.getBounds()
            int r0 = r0.width()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
            r1 = this;
            r0 = -3
            return r0
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
            r1 = this;
            android.animation.ValueAnimator r0 = r1.b
            boolean r0 = r0.isRunning()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int r2) {
            r1 = this;
            android.graphics.Paint r0 = r1.d
            r0.setAlpha(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter r2) {
            r1 = this;
            android.graphics.Paint r0 = r1.d
            r0.setColorFilter(r2)
            return
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
            r1 = this;
            android.animation.ValueAnimator r0 = r1.b
            boolean r0 = r0.isRunning()
            if (r0 != 0) goto Ld
            android.animation.ValueAnimator r0 = r1.b
            r0.start()
        Ld:
            return
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
            r1 = this;
            android.animation.ValueAnimator r0 = r1.b
            boolean r0 = r0.isRunning()
            if (r0 == 0) goto Ld
            android.animation.ValueAnimator r0 = r1.b
            r0.cancel()
        Ld:
            return
    }
}

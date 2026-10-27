package com.bxkj.base.view;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class WaveView extends android.view.View {
    private float a;
    private float b;
    private float c;
    private long d;
    private int e;
    private android.view.animation.Interpolator f;
    private java.util.List g;
    private boolean h;
    private boolean i;
    private android.graphics.Paint j;
    private long k;

    /* renamed from: l, reason: collision with root package name */
    private java.lang.Runnable f637l;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements java.lang.Runnable {
        final /* synthetic */ com.bxkj.base.view.WaveView a;

        a(com.bxkj.base.view.WaveView r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r4 = this;
                com.bxkj.base.view.WaveView r0 = r4.a
                boolean r0 = com.bxkj.base.view.WaveView.e(r0)
                if (r0 == 0) goto L1d
                com.bxkj.base.view.WaveView r0 = r4.a
                com.bxkj.base.view.WaveView.h(r0)
                com.bxkj.base.view.WaveView r0 = r4.a
                java.lang.Runnable r1 = com.bxkj.base.view.WaveView.a(r0)
                com.bxkj.base.view.WaveView r2 = r4.a
                int r2 = com.bxkj.base.view.WaveView.g(r2)
                long r2 = (long) r2
                r0.postDelayed(r1, r2)
            L1d:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class b {
        private long a;
        final /* synthetic */ com.bxkj.base.view.WaveView b;

        public b(com.bxkj.base.view.WaveView r3) {
                r2 = this;
                r2.b = r3
                r2.<init>()
                long r0 = java.lang.System.currentTimeMillis()
                r2.a = r0
                return
        }

        static /* bridge */ /* synthetic */ long a(com.bxkj.base.view.WaveView.b r2) {
                long r0 = r2.a
                return r0
        }

        public int b() {
                r4 = this;
                long r0 = java.lang.System.currentTimeMillis()
                long r2 = r4.a
                long r0 = r0 - r2
                float r0 = (float) r0
                r1 = 1065353216(0x3f800000, float:1.0)
                float r0 = r0 * r1
                com.bxkj.base.view.WaveView r2 = r4.b
                long r2 = com.bxkj.base.view.WaveView.b(r2)
                float r2 = (float) r2
                float r0 = r0 / r2
                com.bxkj.base.view.WaveView r2 = r4.b
                android.view.animation.Interpolator r2 = com.bxkj.base.view.WaveView.d(r2)
                float r0 = r2.getInterpolation(r0)
                float r1 = r1 - r0
                r0 = 1132396544(0x437f0000, float:255.0)
                float r1 = r1 * r0
                int r0 = (int) r1
                return r0
        }

        public float c() {
                r4 = this;
                long r0 = java.lang.System.currentTimeMillis()
                long r2 = r4.a
                long r0 = r0 - r2
                float r0 = (float) r0
                r1 = 1065353216(0x3f800000, float:1.0)
                float r0 = r0 * r1
                com.bxkj.base.view.WaveView r1 = r4.b
                long r1 = com.bxkj.base.view.WaveView.b(r1)
                float r1 = (float) r1
                float r0 = r0 / r1
                com.bxkj.base.view.WaveView r1 = r4.b
                float r1 = com.bxkj.base.view.WaveView.c(r1)
                com.bxkj.base.view.WaveView r2 = r4.b
                android.view.animation.Interpolator r2 = com.bxkj.base.view.WaveView.d(r2)
                float r0 = r2.getInterpolation(r0)
                com.bxkj.base.view.WaveView r2 = r4.b
                float r2 = com.bxkj.base.view.WaveView.f(r2)
                com.bxkj.base.view.WaveView r3 = r4.b
                float r3 = com.bxkj.base.view.WaveView.c(r3)
                float r2 = r2 - r3
                float r0 = r0 * r2
                float r1 = r1 + r0
                return r1
        }
    }

    public WaveView(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public WaveView(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = 1062836634(0x3f59999a, float:0.85)
            r0.b = r1
            r1 = 2000(0x7d0, double:9.88E-321)
            r0.d = r1
            r1 = 500(0x1f4, float:7.0E-43)
            r0.e = r1
            android.view.animation.LinearInterpolator r1 = new android.view.animation.LinearInterpolator
            r1.<init>()
            r0.f = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.g = r1
            com.bxkj.base.view.WaveView$a r1 = new com.bxkj.base.view.WaveView$a
            r1.<init>(r0)
            r0.f637l = r1
            android.graphics.Paint r1 = new android.graphics.Paint
            r2 = 1
            r1.<init>(r2)
            r0.j = r1
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.FILL
            r0.setStyle(r1)
            return
    }

    static /* bridge */ /* synthetic */ java.lang.Runnable a(com.bxkj.base.view.WaveView r0) {
            java.lang.Runnable r0 = r0.f637l
            return r0
    }

    static /* bridge */ /* synthetic */ long b(com.bxkj.base.view.WaveView r2) {
            long r0 = r2.d
            return r0
    }

    static /* bridge */ /* synthetic */ float c(com.bxkj.base.view.WaveView r0) {
            float r0 = r0.a
            return r0
    }

    static /* bridge */ /* synthetic */ android.view.animation.Interpolator d(com.bxkj.base.view.WaveView r0) {
            android.view.animation.Interpolator r0 = r0.f
            return r0
    }

    static /* bridge */ /* synthetic */ boolean e(com.bxkj.base.view.WaveView r0) {
            boolean r0 = r0.h
            return r0
    }

    static /* bridge */ /* synthetic */ float f(com.bxkj.base.view.WaveView r0) {
            float r0 = r0.c
            return r0
    }

    static /* bridge */ /* synthetic */ int g(com.bxkj.base.view.WaveView r0) {
            int r0 = r0.e
            return r0
    }

    static /* bridge */ /* synthetic */ void h(com.bxkj.base.view.WaveView r0) {
            r0.j()
            return
    }

    private void j() {
            r7 = this;
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r7.k
            long r2 = r0 - r2
            int r4 = r7.e
            long r4 = (long) r4
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 >= 0) goto L10
            return
        L10:
            com.bxkj.base.view.WaveView$b r2 = new com.bxkj.base.view.WaveView$b
            r2.<init>(r7)
            java.util.List r3 = r7.g
            r3.add(r2)
            r7.invalidate()
            r7.k = r0
            return
    }

    public boolean i() {
            r1 = this;
            boolean r0 = r1.h
            return r0
    }

    public void k() {
            r1 = this;
            boolean r0 = r1.h
            if (r0 != 0) goto Lc
            r0 = 1
            r1.h = r0
            java.lang.Runnable r0 = r1.f637l
            r0.run()
        Lc:
            return
    }

    public void l() {
            r1 = this;
            r0 = 0
            r1.h = r0
            return
    }

    @Override // android.view.View
    protected void onDraw(android.graphics.Canvas r8) {
            r7 = this;
            java.util.List r0 = r7.g
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L46
            java.lang.Object r1 = r0.next()
            com.bxkj.base.view.WaveView$b r1 = (com.bxkj.base.view.WaveView.b) r1
            long r2 = java.lang.System.currentTimeMillis()
            long r4 = com.bxkj.base.view.WaveView.b.a(r1)
            long r2 = r2 - r4
            long r4 = r7.d
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 >= 0) goto L42
            android.graphics.Paint r2 = r7.j
            int r3 = r1.b()
            r2.setAlpha(r3)
            int r2 = r7.getWidth()
            int r2 = r2 / 2
            float r2 = (float) r2
            int r3 = r7.getHeight()
            int r3 = r3 / 2
            float r3 = (float) r3
            float r1 = r1.c()
            android.graphics.Paint r4 = r7.j
            r8.drawCircle(r2, r3, r1, r4)
            goto L6
        L42:
            r0.remove()
            goto L6
        L46:
            java.util.List r8 = r7.g
            int r8 = r8.size()
            if (r8 <= 0) goto L53
            r0 = 10
            r7.postInvalidateDelayed(r0)
        L53:
            return
    }

    @Override // android.view.View
    protected void onSizeChanged(int r1, int r2, int r3, int r4) {
            r0 = this;
            boolean r3 = r0.i
            if (r3 != 0) goto L12
            int r1 = java.lang.Math.min(r1, r2)
            float r1 = (float) r1
            float r2 = r0.b
            float r1 = r1 * r2
            r2 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r2
            r0.c = r1
        L12:
            return
    }

    public void setColor(int r2) {
            r1 = this;
            android.graphics.Paint r0 = r1.j
            r0.setColor(r2)
            return
    }

    public void setDuration(long r1) {
            r0 = this;
            r0.d = r1
            return
    }

    public void setInitialRadius(float r1) {
            r0 = this;
            r0.a = r1
            return
    }

    public void setInterpolator(android.view.animation.Interpolator r1) {
            r0 = this;
            r0.f = r1
            if (r1 != 0) goto Lb
            android.view.animation.LinearInterpolator r1 = new android.view.animation.LinearInterpolator
            r1.<init>()
            r0.f = r1
        Lb:
            return
    }

    public void setMaxRadius(float r1) {
            r0 = this;
            r0.c = r1
            r1 = 1
            r0.i = r1
            return
    }

    public void setMaxRadiusRate(float r1) {
            r0 = this;
            r0.b = r1
            return
    }

    public void setSpeed(int r1) {
            r0 = this;
            r0.e = r1
            return
    }

    public void setStyle(android.graphics.Paint.Style r2) {
            r1 = this;
            android.graphics.Paint r0 = r1.j
            r0.setStyle(r2)
            return
    }
}

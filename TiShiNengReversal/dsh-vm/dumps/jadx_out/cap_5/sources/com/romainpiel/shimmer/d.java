package com.romainpiel.shimmer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class d {
    private static final int k = -1;
    private android.view.View a;
    private android.graphics.Paint b;
    private float c;
    private android.graphics.LinearGradient d;
    private android.graphics.Matrix e;
    private int f;
    private int g;
    private boolean h;
    private boolean i;
    private com.romainpiel.shimmer.d.a j;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface a {
        void a(android.view.View r1);
    }

    public d(android.view.View r1, android.graphics.Paint r2, android.util.AttributeSet r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.d(r3)
            return
    }

    private void d(android.util.AttributeSet r5) {
            r4 = this;
            r0 = -1
            r4.g = r0
            if (r5 == 0) goto L25
            android.view.View r1 = r4.a
            android.content.Context r1 = r1.getContext()
            int[] r2 = com.romainpiel.shimmer.R.styleable.ShimmerView
            r3 = 0
            android.content.res.TypedArray r5 = r1.obtainStyledAttributes(r5, r2, r3, r3)
            if (r5 == 0) goto L25
            int r1 = com.romainpiel.shimmer.R.styleable.ShimmerView_reflectionColor     // Catch: java.lang.Exception -> L1c java.lang.Throwable -> L20
            int r0 = r5.getColor(r1, r0)     // Catch: java.lang.Exception -> L1c java.lang.Throwable -> L20
            r4.g = r0     // Catch: java.lang.Exception -> L1c java.lang.Throwable -> L20
        L1c:
            r5.recycle()
            goto L25
        L20:
            r0 = move-exception
            r5.recycle()
            throw r0
        L25:
            android.graphics.Matrix r5 = new android.graphics.Matrix
            r5.<init>()
            r4.e = r5
            return
    }

    private void i() {
            r8 = this;
            android.graphics.LinearGradient r0 = new android.graphics.LinearGradient
            android.view.View r1 = r8.a
            int r1 = r1.getWidth()
            int r1 = -r1
            float r1 = (float) r1
            int r2 = r8.f
            int r3 = r8.g
            int[] r5 = new int[]{r2, r3, r2}
            r2 = 3
            float[] r6 = new float[r2]
            r6 = {x0028: FILL_ARRAY_DATA , data: [0, 1056964608, 1065353216} // fill-array
            android.graphics.Shader$TileMode r7 = android.graphics.Shader.TileMode.CLAMP
            r2 = 0
            r3 = 0
            r4 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.d = r0
            android.graphics.Paint r1 = r8.b
            r1.setShader(r0)
            return
    }

    public float a() {
            r1 = this;
            float r0 = r1.c
            return r0
    }

    public int b() {
            r1 = this;
            int r0 = r1.f
            return r0
    }

    public int c() {
            r1 = this;
            int r0 = r1.g
            return r0
    }

    public boolean e() {
            r1 = this;
            boolean r0 = r1.i
            return r0
    }

    public boolean f() {
            r1 = this;
            boolean r0 = r1.h
            return r0
    }

    public void g() {
            r3 = this;
            boolean r0 = r3.h
            if (r0 == 0) goto L27
            android.graphics.Paint r0 = r3.b
            android.graphics.Shader r0 = r0.getShader()
            if (r0 != 0) goto L13
            android.graphics.Paint r0 = r3.b
            android.graphics.LinearGradient r1 = r3.d
            r0.setShader(r1)
        L13:
            android.graphics.Matrix r0 = r3.e
            r1 = 1073741824(0x40000000, float:2.0)
            float r2 = r3.c
            float r2 = r2 * r1
            r1 = 0
            r0.setTranslate(r2, r1)
            android.graphics.LinearGradient r0 = r3.d
            android.graphics.Matrix r1 = r3.e
            r0.setLocalMatrix(r1)
            return
        L27:
            android.graphics.Paint r0 = r3.b
            r1 = 0
            r0.setShader(r1)
            return
    }

    protected void h() {
            r2 = this;
            r2.i()
            boolean r0 = r2.i
            if (r0 != 0) goto L13
            r0 = 1
            r2.i = r0
            com.romainpiel.shimmer.d$a r0 = r2.j
            if (r0 == 0) goto L13
            android.view.View r1 = r2.a
            r0.a(r1)
        L13:
            return
    }

    public void j(com.romainpiel.shimmer.d.a r1) {
            r0 = this;
            r0.j = r1
            return
    }

    public void k(float r1) {
            r0 = this;
            r0.c = r1
            android.view.View r1 = r0.a
            r1.invalidate()
            return
    }

    public void l(int r1) {
            r0 = this;
            r0.f = r1
            boolean r1 = r0.i
            if (r1 == 0) goto L9
            r0.i()
        L9:
            return
    }

    public void m(int r1) {
            r0 = this;
            r0.g = r1
            boolean r1 = r0.i
            if (r1 == 0) goto L9
            r0.i()
        L9:
            return
    }

    public void n(boolean r1) {
            r0 = this;
            r0.h = r1
            return
    }
}

package com.acse.ottn;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class u4 {
    public static final java.util.WeakHashMap<android.view.View, com.acse.ottn.u4> a = null;

    static {
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r1 = 0
            r0.<init>(r1)
            com.acse.ottn.u4.a = r0
            return
    }

    public u4() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.acse.ottn.u4 a(android.view.View r3) {
            java.util.WeakHashMap<android.view.View, com.acse.ottn.u4> r0 = com.acse.ottn.u4.a
            java.lang.Object r1 = r0.get(r3)
            com.acse.ottn.u4 r1 = (com.acse.ottn.u4) r1
            if (r1 != 0) goto L30
            java.lang.String r1 = android.os.Build.VERSION.SDK
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int r1 = r1.intValue()
            r2 = 14
            if (r1 < r2) goto L1e
            com.acse.ottn.w4 r1 = new com.acse.ottn.w4
            r1.<init>(r3)
            goto L2d
        L1e:
            r2 = 11
            if (r1 < r2) goto L28
            com.acse.ottn.v4 r1 = new com.acse.ottn.v4
            r1.<init>(r3)
            goto L2d
        L28:
            com.acse.ottn.x4 r1 = new com.acse.ottn.x4
            r1.<init>(r3)
        L2d:
            r0.put(r3, r1)
        L30:
            return r1
    }

    public abstract com.acse.ottn.u4 a(float r1);

    public abstract com.acse.ottn.u4 a(long r1);

    public abstract com.acse.ottn.u4 a(android.view.animation.Interpolator r1);

    public abstract com.acse.ottn.u4 a(com.acse.ottn.j.a r1);

    public abstract void a();

    public abstract long b();

    public abstract com.acse.ottn.u4 b(float r1);

    public abstract com.acse.ottn.u4 b(long r1);

    public abstract long c();

    public abstract com.acse.ottn.u4 c(float r1);

    public abstract com.acse.ottn.u4 d(float r1);

    public abstract void d();

    public abstract com.acse.ottn.u4 e(float r1);

    public abstract com.acse.ottn.u4 f(float r1);

    public abstract com.acse.ottn.u4 g(float r1);

    public abstract com.acse.ottn.u4 h(float r1);

    public abstract com.acse.ottn.u4 i(float r1);

    public abstract com.acse.ottn.u4 j(float r1);

    public abstract com.acse.ottn.u4 k(float r1);

    public abstract com.acse.ottn.u4 l(float r1);

    public abstract com.acse.ottn.u4 m(float r1);

    public abstract com.acse.ottn.u4 n(float r1);

    public abstract com.acse.ottn.u4 o(float r1);

    public abstract com.acse.ottn.u4 p(float r1);

    public abstract com.acse.ottn.u4 q(float r1);

    public abstract com.acse.ottn.u4 r(float r1);

    public abstract com.acse.ottn.u4 s(float r1);

    public abstract com.acse.ottn.u4 t(float r1);
}

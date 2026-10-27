package retrofit2.adapter.rxjava;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
final class g<R> implements retrofit2.c<R, java.lang.Object> {
    private final java.lang.reflect.Type a;

    @javax.annotation.Nullable
    private final rx.h b;
    private final boolean c;
    private final boolean d;
    private final boolean e;
    private final boolean f;
    private final boolean g;

    g(java.lang.reflect.Type r1, @javax.annotation.Nullable rx.h r2, boolean r3, boolean r4, boolean r5, boolean r6, boolean r7) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            r0.f = r6
            r0.g = r7
            return
    }

    @Override // retrofit2.c
    public java.lang.reflect.Type a() {
            r1 = this;
            java.lang.reflect.Type r0 = r1.a
            return r0
    }

    @Override // retrofit2.c
    public java.lang.Object b(retrofit2.b<R> r2) {
            r1 = this;
            boolean r0 = r1.c
            if (r0 == 0) goto La
            retrofit2.adapter.rxjava.c r0 = new retrofit2.adapter.rxjava.c
            r0.<init>(r2)
            goto Lf
        La:
            retrofit2.adapter.rxjava.d r0 = new retrofit2.adapter.rxjava.d
            r0.<init>(r2)
        Lf:
            boolean r2 = r1.d
            if (r2 == 0) goto L1a
            retrofit2.adapter.rxjava.f r2 = new retrofit2.adapter.rxjava.f
            r2.<init>(r0)
        L18:
            r0 = r2
            goto L24
        L1a:
            boolean r2 = r1.e
            if (r2 == 0) goto L24
            retrofit2.adapter.rxjava.a r2 = new retrofit2.adapter.rxjava.a
            r2.<init>(r0)
            goto L18
        L24:
            rx.e r2 = rx.e.j1(r0)
            rx.h r0 = r1.b
            if (r0 == 0) goto L30
            rx.e r2 = r2.w5(r0)
        L30:
            boolean r0 = r1.f
            if (r0 == 0) goto L39
            rx.i r2 = r2.D6()
            return r2
        L39:
            boolean r0 = r1.g
            if (r0 == 0) goto L41
            rx.b r2 = r2.u6()
        L41:
            return r2
    }
}

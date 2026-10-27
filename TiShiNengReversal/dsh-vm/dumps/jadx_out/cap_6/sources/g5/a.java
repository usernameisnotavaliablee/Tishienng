package g5;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class a extends org.junit.runner.f {
    private final java.lang.Object a;
    private final java.lang.Class<?> b;
    private final boolean c;
    private volatile org.junit.runner.g d;

    public a(java.lang.Class<?> r2) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r0)
            return
    }

    public a(java.lang.Class<?> r2, boolean r3) {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.a = r0
            r1.b = r2
            r1.c = r3
            return
    }

    @Override // org.junit.runner.f
    public org.junit.runner.g h() {
            r3 = this;
            org.junit.runner.g r0 = r3.d
            if (r0 != 0) goto L21
            java.lang.Object r0 = r3.a
            monitor-enter(r0)
            org.junit.runner.g r1 = r3.d     // Catch: java.lang.Throwable -> L1b
            if (r1 != 0) goto L1d
            org.junit.internal.builders.a r1 = new org.junit.internal.builders.a     // Catch: java.lang.Throwable -> L1b
            boolean r2 = r3.c     // Catch: java.lang.Throwable -> L1b
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L1b
            java.lang.Class<?> r2 = r3.b     // Catch: java.lang.Throwable -> L1b
            org.junit.runner.g r1 = r1.g(r2)     // Catch: java.lang.Throwable -> L1b
            r3.d = r1     // Catch: java.lang.Throwable -> L1b
            goto L1d
        L1b:
            r1 = move-exception
            goto L1f
        L1d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            goto L21
        L1f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            throw r1
        L21:
            org.junit.runner.g r0 = r3.d
            return r0
    }
}

package com.tencent.open.log;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class Tracer {
    private volatile int a;
    private volatile boolean b;
    private com.tencent.open.log.g c;

    public Tracer() {
            r3 = this;
            int r0 = com.tencent.open.log.c.a
            r1 = 1
            com.tencent.open.log.g r2 = com.tencent.open.log.g.a
            r3.<init>(r0, r1, r2)
            return
    }

    public Tracer(int r2, boolean r3, com.tencent.open.log.g r4) {
            r1 = this;
            r1.<init>()
            int r0 = com.tencent.open.log.c.a
            r1.a = r0
            r0 = 1
            r1.b = r0
            com.tencent.open.log.g r0 = com.tencent.open.log.g.a
            r1.c = r0
            r1.a(r2)
            r1.a(r3)
            r1.a(r4)
            return
    }

    public void a(int r1) {
            r0 = this;
            r0.a = r1
            return
    }

    public void a(int r2, java.lang.Thread r3, long r4, java.lang.String r6, java.lang.String r7, java.lang.Throwable r8) {
            r1 = this;
            boolean r0 = r1.d()
            if (r0 == 0) goto L11
            int r0 = r1.a
            boolean r0 = com.tencent.open.log.d.a.a(r0, r2)
            if (r0 == 0) goto L11
            r1.doTrace(r2, r3, r4, r6, r7, r8)
        L11:
            return
    }

    public void a(com.tencent.open.log.g r1) {
            r0 = this;
            r0.c = r1
            return
    }

    public void a(boolean r1) {
            r0 = this;
            r0.b = r1
            return
    }

    public boolean d() {
            r1 = this;
            boolean r0 = r1.b
            return r0
    }

    protected abstract void doTrace(int r1, java.lang.Thread r2, long r3, java.lang.String r5, java.lang.String r6, java.lang.Throwable r7);

    public com.tencent.open.log.g e() {
            r1 = this;
            com.tencent.open.log.g r0 = r1.c
            return r0
    }
}

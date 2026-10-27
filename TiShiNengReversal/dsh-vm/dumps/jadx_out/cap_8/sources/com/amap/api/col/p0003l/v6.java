package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class v6 {
    private com.amap.api.col.p0003l.x6 a;

    /* renamed from: b, reason: collision with root package name */
    private com.amap.api.col.p0003l.Cif f4061b;

    /* renamed from: c, reason: collision with root package name */
    private long f4062c;

    /* renamed from: d, reason: collision with root package name */
    private long f4063d;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface a {
        void onDownload(byte[] r1, long r2);

        void onException(java.lang.Throwable r1);

        void onFinish();

        void onStop();
    }

    public v6(com.amap.api.col.p0003l.Cif r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    private v6(com.amap.api.col.p0003l.Cif r8, byte r9) {
            r7 = this;
            r4 = -1
            r6 = 0
            r2 = 0
            r0 = r7
            r1 = r8
            r0.<init>(r1, r2, r4, r6)
            return
    }

    public v6(com.amap.api.col.p0003l.Cif r1, long r2, long r4, boolean r6) {
            r0 = this;
            r0.<init>()
            r0.f4061b = r1
            r0.f4062c = r2
            r0.f4063d = r4
            if (r6 == 0) goto Le
            com.amap.api.col.3l.if$c r2 = com.amap.api.col.p0003l.Cif.c.f3539b
            goto L10
        Le:
            com.amap.api.col.3l.if$c r2 = com.amap.api.col.p0003l.Cif.c.a
        L10:
            r1.setHttpProtocol(r2)
            com.amap.api.col.3l.if r1 = r0.f4061b
            com.amap.api.col.3l.if$a r2 = com.amap.api.col.p0003l.Cif.a.f3528e
            r1.setDegradeAbility(r2)
            return
    }

    public final void a() {
            r1 = this;
            com.amap.api.col.3l.x6 r0 = r1.a
            if (r0 == 0) goto L7
            r0.k()
        L7:
            return
    }

    public final void b(com.amap.api.col.3l.v6.a r4) {
            r3 = this;
            com.amap.api.col.3l.x6 r0 = new com.amap.api.col.3l.x6     // Catch: java.lang.Exception -> L3b
            r0.<init>()     // Catch: java.lang.Exception -> L3b
            r3.a = r0     // Catch: java.lang.Exception -> L3b
            long r1 = r3.f4063d     // Catch: java.lang.Exception -> L3b
            r0.t(r1)     // Catch: java.lang.Exception -> L3b
            com.amap.api.col.3l.x6 r0 = r3.a     // Catch: java.lang.Exception -> L3b
            long r1 = r3.f4062c     // Catch: java.lang.Exception -> L3b
            r0.l(r1)     // Catch: java.lang.Exception -> L3b
            com.amap.api.col.p0003l.s6.b()     // Catch: java.lang.Exception -> L3b
            com.amap.api.col.3l.if r0 = r3.f4061b     // Catch: java.lang.Exception -> L3b
            boolean r0 = com.amap.api.col.p0003l.s6.g(r0)     // Catch: java.lang.Exception -> L3b
            if (r0 == 0) goto L2d
            com.amap.api.col.3l.if r0 = r3.f4061b     // Catch: java.lang.Exception -> L3b
            com.amap.api.col.3l.if$b r1 = com.amap.api.col.p0003l.Cif.b.f3531b     // Catch: java.lang.Exception -> L3b
            r0.setDegradeType(r1)     // Catch: java.lang.Exception -> L3b
            com.amap.api.col.3l.x6 r0 = r3.a     // Catch: java.lang.Exception -> L3b
            com.amap.api.col.3l.if r1 = r3.f4061b     // Catch: java.lang.Exception -> L3b
            r0.m(r1, r4)     // Catch: java.lang.Exception -> L3b
            return
        L2d:
            com.amap.api.col.3l.if r0 = r3.f4061b     // Catch: java.lang.Exception -> L3b
            com.amap.api.col.3l.if$b r1 = com.amap.api.col.p0003l.Cif.b.f3533d     // Catch: java.lang.Exception -> L3b
            r0.setDegradeType(r1)     // Catch: java.lang.Exception -> L3b
            com.amap.api.col.3l.x6 r0 = r3.a     // Catch: java.lang.Exception -> L3b
            com.amap.api.col.3l.if r1 = r3.f4061b     // Catch: java.lang.Exception -> L3b
            r0.m(r1, r4)     // Catch: java.lang.Exception -> L3b
        L3b:
            return
    }
}

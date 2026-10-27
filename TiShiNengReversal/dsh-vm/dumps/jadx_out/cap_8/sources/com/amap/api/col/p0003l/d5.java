package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class d5 {

    /* renamed from: d, reason: collision with root package name */
    private static int f3143d = 100;

    /* renamed from: e, reason: collision with root package name */
    private static int f3144e = 10000;
    private java.util.Vector<com.amap.api.col.p0003l.a5> a;

    /* renamed from: b, reason: collision with root package name */
    private int f3145b;

    /* renamed from: c, reason: collision with root package name */
    private int f3146c;

    static {
            return
    }

    public d5() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f3146c = r0
            r0 = 10
            r1.f3145b = r0
            java.util.Vector r0 = new java.util.Vector
            r0.<init>()
            r1.a = r0
            return
    }

    public d5(byte r1) {
            r0 = this;
            r0.<init>()
            int r1 = com.amap.api.col.p0003l.d5.f3143d
            r0.f3145b = r1
            r1 = 0
            r0.f3146c = r1
            java.util.Vector r1 = new java.util.Vector
            r1.<init>()
            r0.a = r1
            return
    }

    public final java.util.Vector<com.amap.api.col.p0003l.a5> a() {
            r1 = this;
            java.util.Vector<com.amap.api.col.3l.a5> r0 = r1.a
            return r0
    }

    public final synchronized void b(com.amap.api.col.p0003l.a5 r2) {
            r1 = this;
            monitor-enter(r1)
            if (r2 == 0) goto L26
            java.lang.String r0 = r2.g()     // Catch: java.lang.Throwable -> L23
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L23
            if (r0 == 0) goto Le
            goto L26
        Le:
            java.util.Vector<com.amap.api.col.3l.a5> r0 = r1.a     // Catch: java.lang.Throwable -> L23
            r0.add(r2)     // Catch: java.lang.Throwable -> L23
            int r0 = r1.f3146c     // Catch: java.lang.Throwable -> L23
            java.lang.String r2 = r2.g()     // Catch: java.lang.Throwable -> L23
            byte[] r2 = r2.getBytes()     // Catch: java.lang.Throwable -> L23
            int r2 = r2.length     // Catch: java.lang.Throwable -> L23
            int r0 = r0 + r2
            r1.f3146c = r0     // Catch: java.lang.Throwable -> L23
            monitor-exit(r1)
            return
        L23:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L23
            throw r2
        L26:
            monitor-exit(r1)
            return
    }

    public final synchronized boolean c(java.lang.String r5) {
            r4 = this;
            monitor-enter(r4)
            r0 = 0
            if (r5 != 0) goto L6
            monitor-exit(r4)
            return r0
        L6:
            java.util.Vector<com.amap.api.col.3l.a5> r1 = r4.a     // Catch: java.lang.Throwable -> L22
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L22
            int r2 = r4.f3145b     // Catch: java.lang.Throwable -> L22
            r3 = 1
            if (r1 < r2) goto L13
            monitor-exit(r4)
            return r3
        L13:
            int r1 = r4.f3146c     // Catch: java.lang.Throwable -> L22
            byte[] r5 = r5.getBytes()     // Catch: java.lang.Throwable -> L22
            int r5 = r5.length     // Catch: java.lang.Throwable -> L22
            int r1 = r1 + r5
            int r5 = com.amap.api.col.p0003l.d5.f3144e     // Catch: java.lang.Throwable -> L22
            monitor-exit(r4)
            if (r1 <= r5) goto L21
            return r3
        L21:
            return r0
        L22:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L22
            throw r5
    }

    public final synchronized void d() {
            r1 = this;
            monitor-enter(r1)
            java.util.Vector<com.amap.api.col.3l.a5> r0 = r1.a     // Catch: java.lang.Throwable -> Lb
            r0.clear()     // Catch: java.lang.Throwable -> Lb
            r0 = 0
            r1.f3146c = r0     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r1)
            return
        Lb:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb
            throw r0
    }
}

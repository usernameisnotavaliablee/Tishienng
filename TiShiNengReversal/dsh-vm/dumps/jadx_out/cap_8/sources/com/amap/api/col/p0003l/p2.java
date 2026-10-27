package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class p2 {

    /* renamed from: c, reason: collision with root package name */
    private static boolean f3739c;

    /* renamed from: d, reason: collision with root package name */
    private static volatile com.amap.api.col.p0003l.p2 f3740d;
    private java.util.Hashtable<java.lang.String, java.lang.String> a;

    /* renamed from: b, reason: collision with root package name */
    private java.lang.ref.WeakReference<android.content.Context> f3741b;

    static {
            return
    }

    private p2() {
            r1 = this;
            r1.<init>()
            java.util.Hashtable r0 = new java.util.Hashtable
            r0.<init>()
            r1.a = r0
            r0 = 0
            r1.f3741b = r0
            return
    }

    public static com.amap.api.col.p0003l.p2 a() {
            com.amap.api.col.3l.p2 r0 = com.amap.api.col.p0003l.p2.f3740d
            if (r0 != 0) goto L19
            java.lang.Class<com.amap.api.col.3l.p2> r0 = com.amap.api.col.p0003l.p2.class
            monitor-enter(r0)
            com.amap.api.col.3l.p2 r1 = com.amap.api.col.p0003l.p2.f3740d     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.amap.api.col.3l.p2 r1 = new com.amap.api.col.3l.p2     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.amap.api.col.p0003l.p2.f3740d = r1     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r1 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            goto L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r1
        L19:
            com.amap.api.col.3l.p2 r0 = com.amap.api.col.p0003l.p2.f3740d
            return r0
    }

    private void d(java.lang.String r4) {
            r3 = this;
            if (r4 == 0) goto L2a
            java.util.Hashtable<java.lang.String, java.lang.String> r0 = r3.a
            if (r0 == 0) goto L2a
            monitor-enter(r0)
            java.lang.String r1 = com.amap.api.col.p0003l.m4.d(r4)     // Catch: java.lang.Throwable -> L1b
            java.util.Hashtable<java.lang.String, java.lang.String> r2 = r3.a     // Catch: java.lang.Throwable -> L1b
            if (r2 == 0) goto L1d
            boolean r2 = r2.contains(r1)     // Catch: java.lang.Throwable -> L1b
            if (r2 != 0) goto L1d
            java.util.Hashtable<java.lang.String, java.lang.String> r2 = r3.a     // Catch: java.lang.Throwable -> L1b
            r2.put(r1, r4)     // Catch: java.lang.Throwable -> L1b
            goto L1d
        L1b:
            r4 = move-exception
            goto L28
        L1d:
            boolean r4 = r3.i()     // Catch: java.lang.Throwable -> L1b
            if (r4 == 0) goto L26
            r3.h()     // Catch: java.lang.Throwable -> L1b
        L26:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            return
        L28:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            throw r4
        L2a:
            return
    }

    public static void e(boolean r0) {
            com.amap.api.col.p0003l.p2.f3739c = r0
            return
    }

    public static void f() {
            com.amap.api.col.3l.p2 r0 = com.amap.api.col.p0003l.p2.f3740d
            if (r0 == 0) goto L35
            com.amap.api.col.3l.p2 r0 = com.amap.api.col.p0003l.p2.f3740d
            java.util.Hashtable<java.lang.String, java.lang.String> r0 = r0.a
            if (r0 == 0) goto L32
            com.amap.api.col.3l.p2 r0 = com.amap.api.col.p0003l.p2.f3740d
            java.util.Hashtable<java.lang.String, java.lang.String> r0 = r0.a
            int r0 = r0.size()
            if (r0 <= 0) goto L32
            com.amap.api.col.3l.p2 r0 = com.amap.api.col.p0003l.p2.f3740d
            java.util.Hashtable<java.lang.String, java.lang.String> r0 = r0.a
            monitor-enter(r0)
            com.amap.api.col.3l.p2 r1 = com.amap.api.col.p0003l.p2.f3740d     // Catch: java.lang.Throwable -> L2c
            r1.h()     // Catch: java.lang.Throwable -> L2c
            com.amap.api.col.3l.p2 r1 = com.amap.api.col.p0003l.p2.f3740d     // Catch: java.lang.Throwable -> L2c
            java.lang.ref.WeakReference<android.content.Context> r1 = r1.f3741b     // Catch: java.lang.Throwable -> L2c
            if (r1 == 0) goto L2e
            com.amap.api.col.3l.p2 r1 = com.amap.api.col.p0003l.p2.f3740d     // Catch: java.lang.Throwable -> L2c
            java.lang.ref.WeakReference<android.content.Context> r1 = r1.f3741b     // Catch: java.lang.Throwable -> L2c
            r1.clear()     // Catch: java.lang.Throwable -> L2c
            goto L2e
        L2c:
            r1 = move-exception
            goto L30
        L2e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2c
            goto L32
        L30:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2c
            throw r1
        L32:
            r0 = 0
            com.amap.api.col.p0003l.p2.f3740d = r0
        L35:
            r0 = 0
            e(r0)
            return
    }

    public static boolean g() {
            boolean r0 = com.amap.api.col.p0003l.p2.f3739c
            return r0
    }

    private void h() {
            r5 = this;
            boolean r0 = com.amap.api.col.p0003l.p2.f3739c
            if (r0 != 0) goto La
            java.util.Hashtable<java.lang.String, java.lang.String> r0 = r5.a
            r0.clear()
            return
        La:
            java.util.Hashtable<java.lang.String, java.lang.String> r0 = r5.a
            if (r0 == 0) goto L6d
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            java.util.Hashtable<java.lang.String, java.lang.String> r1 = r5.a
            int r1 = r1.size()
            if (r1 <= 0) goto L68
            java.lang.String r2 = "["
            r0.append(r2)
            java.util.Hashtable<java.lang.String, java.lang.String> r2 = r5.a
            java.util.Collection r2 = r2.values()
            java.util.Iterator r2 = r2.iterator()
            r3 = 0
        L2b:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L44
            java.lang.Object r4 = r2.next()
            java.lang.String r4 = (java.lang.String) r4
            int r3 = r3 + 1
            r0.append(r4)
            if (r3 >= r1) goto L2b
            java.lang.String r4 = ","
            r0.append(r4)
            goto L2b
        L44:
            java.lang.String r1 = "]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L68
            java.lang.ref.WeakReference<android.content.Context> r1 = r5.f3741b
            if (r1 == 0) goto L68
            java.lang.Object r1 = r1.get()
            if (r1 == 0) goto L68
            java.lang.ref.WeakReference<android.content.Context> r1 = r5.f3741b
            java.lang.Object r1 = r1.get()
            android.content.Context r1 = (android.content.Context) r1
            com.amap.api.col.p0003l.f7.a(r0, r1)
        L68:
            java.util.Hashtable<java.lang.String, java.lang.String> r0 = r5.a
            r0.clear()
        L6d:
            return
    }

    private boolean i() {
            r3 = this;
            java.util.Hashtable<java.lang.String, java.lang.String> r0 = r3.a
            r1 = 0
            if (r0 == 0) goto Lf
            int r0 = r0.size()
            r2 = 20
            if (r0 <= r2) goto Lf
            r0 = 1
            return r0
        Lf:
            return r1
    }

    public final void b(android.content.Context r2) {
            r1 = this;
            if (r2 == 0) goto L9
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            r1.f3741b = r0
        L9:
            return
    }

    public final void c(com.amap.api.maps.model.LatLng r5, java.lang.String r6, java.lang.String r7) {
            r4 = this;
            boolean r0 = com.amap.api.col.p0003l.p2.f3739c
            if (r0 != 0) goto La
            java.util.Hashtable<java.lang.String, java.lang.String> r5 = r4.a
            r5.clear()
            return
        La:
            if (r5 == 0) goto L66
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L66
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            java.lang.String r1 = "{"
            r0.append(r1)
            java.lang.String r1 = "\"lon\":"
            r0.append(r1)
            double r1 = r5.longitude
            r0.append(r1)
            java.lang.String r1 = ","
            r0.append(r1)
            java.lang.String r2 = "\"lat\":"
            r0.append(r2)
            double r2 = r5.latitude
            r0.append(r2)
            r0.append(r1)
            java.lang.String r5 = "\"title\":\""
            r0.append(r5)
            r0.append(r6)
            java.lang.String r5 = "\","
            r0.append(r5)
            boolean r5 = android.text.TextUtils.isEmpty(r7)
            if (r5 == 0) goto L4d
            java.lang.String r7 = ""
        L4d:
            java.lang.String r5 = "\"snippet\":\""
            r0.append(r5)
            r0.append(r7)
            java.lang.String r5 = "\""
            r0.append(r5)
            java.lang.String r5 = "}"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r4.d(r5)
        L66:
            return
    }
}

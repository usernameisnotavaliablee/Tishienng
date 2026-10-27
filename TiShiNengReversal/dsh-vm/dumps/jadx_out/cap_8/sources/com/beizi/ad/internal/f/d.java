package com.beizi.ad.internal.f;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class d {
    private static com.beizi.ad.internal.f.d a;

    /* renamed from: b, reason: collision with root package name */
    private java.util.ArrayList<com.beizi.ad.internal.f.d.a> f6805b;

    /* renamed from: c, reason: collision with root package name */
    private java.util.Timer f6806c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f6807d;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a {
        java.lang.String a;

        /* renamed from: b, reason: collision with root package name */
        int f6810b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.beizi.ad.internal.f.d f6811c;

        a(com.beizi.ad.internal.f.d r1, java.lang.String r2) {
                r0 = this;
                r0.f6811c = r1
                r0.<init>()
                r0.a = r2
                r1 = 0
                r0.f6810b = r1
                return
        }
    }

    private d(android.content.Context r3) {
            r2 = this;
            r2.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.f6805b = r0
            if (r3 == 0) goto L21
            android.content.pm.PackageManager r0 = r3.getPackageManager()
            java.lang.String r1 = "android.permission.ACCESS_NETWORK_STATE"
            java.lang.String r3 = r3.getPackageName()
            int r3 = r0.checkPermission(r1, r3)
            if (r3 != 0) goto L1e
            r3 = 1
            goto L1f
        L1e:
            r3 = 0
        L1f:
            r2.f6807d = r3
        L21:
            return
    }

    public static com.beizi.ad.internal.f.d a(android.content.Context r1) {
            com.beizi.ad.internal.f.d r0 = com.beizi.ad.internal.f.d.a
            if (r0 != 0) goto Lb
            com.beizi.ad.internal.f.d r0 = new com.beizi.ad.internal.f.d
            r0.<init>(r1)
            com.beizi.ad.internal.f.d.a = r0
        Lb:
            com.beizi.ad.internal.f.d r1 = com.beizi.ad.internal.f.d.a
            return r1
    }

    static /* synthetic */ java.util.ArrayList a(com.beizi.ad.internal.f.d r0) {
            java.util.ArrayList<com.beizi.ad.internal.f.d$a> r0 = r0.f6805b
            return r0
    }

    private void a() {
            r1 = this;
            java.util.Timer r0 = r1.f6806c
            if (r0 == 0) goto La
            r0.cancel()
            r0 = 0
            r1.f6806c = r0
        La:
            return
    }

    static /* synthetic */ void b(com.beizi.ad.internal.f.d r0) {
            r0.a()
            return
    }

    private void c(android.content.Context r8) {
            r7 = this;
            java.util.Timer r0 = r7.f6806c
            if (r0 != 0) goto L1c
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r8)
            java.util.Timer r1 = new java.util.Timer
            r1.<init>()
            r7.f6806c = r1
            com.beizi.ad.internal.f.d$1 r2 = new com.beizi.ad.internal.f.d$1
            r2.<init>(r7, r0)
            r3 = 10000(0x2710, double:4.9407E-320)
            r5 = 10000(0x2710, double:4.9407E-320)
            r1.scheduleAtFixedRate(r2, r3, r5)
        L1c:
            return
    }

    public synchronized void a(java.lang.String r3, android.content.Context r4) {
            r2 = this;
            monitor-enter(r2)
            java.util.ArrayList<com.beizi.ad.internal.f.d$a> r0 = r2.f6805b     // Catch: java.lang.Throwable -> L10
            com.beizi.ad.internal.f.d$a r1 = new com.beizi.ad.internal.f.d$a     // Catch: java.lang.Throwable -> L10
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L10
            r0.add(r1)     // Catch: java.lang.Throwable -> L10
            r2.c(r4)     // Catch: java.lang.Throwable -> L10
            monitor-exit(r2)
            return
        L10:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L10
            throw r3
    }

    public boolean b(android.content.Context r4) {
            r3 = this;
            r0 = 1
            boolean r1 = r3.f6807d     // Catch: java.lang.Throwable -> L2a
            if (r1 == 0) goto L2a
            r1 = 0
            if (r4 == 0) goto L29
            android.content.Context r4 = r4.getApplicationContext()     // Catch: java.lang.Throwable -> L2a
            android.content.Context r4 = com.stub.StubApp.getOrigApplicationContext(r4)     // Catch: java.lang.Throwable -> L2a
            java.lang.String r2 = "connectivity"
            java.lang.Object r4 = r4.getSystemService(r2)     // Catch: java.lang.Throwable -> L2a
            android.net.ConnectivityManager r4 = (android.net.ConnectivityManager) r4     // Catch: java.lang.Throwable -> L2a
            if (r4 == 0) goto L1f
            android.net.NetworkInfo r4 = r4.getActiveNetworkInfo()     // Catch: java.lang.Throwable -> L2a
            goto L20
        L1f:
            r4 = 0
        L20:
            if (r4 == 0) goto L29
            boolean r4 = r4.isConnected()     // Catch: java.lang.Throwable -> L2a
            if (r4 == 0) goto L29
            return r0
        L29:
            return r1
        L2a:
            return r0
    }
}

package com.ss.android.downloadlib.j.j;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class a {
    private static java.lang.String k = "";
    private static java.lang.String l = "";
    private static java.lang.String m = "";
    private static volatile com.ss.android.downloadlib.j.j.a n;
    private boolean a;
    private boolean b;
    private volatile boolean c;
    private android.content.Context d;
    private final java.util.List<android.util.Pair<com.ss.android.downloadlib.j.j.xt, com.ss.android.downloadlib.j.j.r>> e;
    public com.ss.android.downloadlib.j.j.cw f;
    public final java.util.List<java.lang.Object> g;
    private final android.content.ServiceConnection h;
    private java.lang.String i;
    public final java.lang.Object j;

    /* renamed from: com.ss.android.downloadlib.j.j.a$a, reason: collision with other inner class name */
    class ServiceConnectionC0217a implements android.content.ServiceConnection {
        final /* synthetic */ com.ss.android.downloadlib.j.j.a a;

        ServiceConnectionC0217a(com.ss.android.downloadlib.j.j.a r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(android.content.ComponentName r3, android.os.IBinder r4) {
                r2 = this;
                com.ss.android.downloadlib.j.j.a r3 = r2.a
                java.lang.Object r3 = r3.j
                monitor-enter(r3)
                com.ss.android.downloadlib.j.j.a r0 = r2.a     // Catch: java.lang.Throwable -> L2a
                r1 = 0
                r0.e(r1)     // Catch: java.lang.Throwable -> L2a
                com.ss.android.downloadlib.j.j.a r0 = r2.a     // Catch: java.lang.Throwable -> L2a
                com.ss.android.downloadlib.j.j.cw r4 = com.ss.android.downloadlib.j.j.cw.j.e(r4)     // Catch: java.lang.Throwable -> L2a
                r0.f = r4     // Catch: java.lang.Throwable -> L2a
                com.ss.android.downloadlib.j.j.a r4 = r2.a     // Catch: java.lang.Throwable -> L2a
                r4.a()     // Catch: java.lang.Throwable -> L2a
                com.ss.android.downloadlib.j.j.a r4 = r2.a     // Catch: java.lang.Throwable -> L2a
                java.util.List<java.lang.Object> r4 = r4.g     // Catch: java.lang.Throwable -> L2a
                java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L2a
            L20:
                boolean r0 = r4.hasNext()     // Catch: java.lang.Throwable -> L2a
                if (r0 == 0) goto L2c
                r4.next()     // Catch: java.lang.Throwable -> L2a
                goto L20
            L2a:
                r4 = move-exception
                goto L2e
            L2c:
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L2a
                return
            L2e:
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L2a
                throw r4
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(android.content.ComponentName r3) {
                r2 = this;
                com.ss.android.downloadlib.j.j.a r3 = r2.a
                java.lang.Object r3 = r3.j
                monitor-enter(r3)
                com.ss.android.downloadlib.j.j.a r0 = r2.a     // Catch: java.lang.Throwable -> L20
                r1 = 0
                r0.e(r1)     // Catch: java.lang.Throwable -> L20
                com.ss.android.downloadlib.j.j.a r0 = r2.a     // Catch: java.lang.Throwable -> L20
                r1 = 0
                r0.f = r1     // Catch: java.lang.Throwable -> L20
                java.util.List<java.lang.Object> r0 = r0.g     // Catch: java.lang.Throwable -> L20
                java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L20
            L16:
                boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L20
                if (r1 == 0) goto L22
                r0.next()     // Catch: java.lang.Throwable -> L20
                goto L16
            L20:
                r0 = move-exception
                goto L24
            L22:
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L20
                return
            L24:
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L20
                throw r0
        }
    }

    static {
            return
    }

    private a() {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.a = r0
            r0 = 0
            r1.b = r0
            r1.c = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.e = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.g = r0
            com.ss.android.downloadlib.j.j.a$a r0 = new com.ss.android.downloadlib.j.j.a$a
            r0.<init>(r1)
            r1.h = r0
            java.lang.String r0 = ""
            r1.i = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.j = r0
            return
    }

    public static com.ss.android.downloadlib.j.j.a c() {
            com.ss.android.downloadlib.j.j.a r0 = com.ss.android.downloadlib.j.j.a.n
            if (r0 != 0) goto L19
            java.lang.Class<com.ss.android.downloadlib.j.j.a> r0 = com.ss.android.downloadlib.j.j.a.class
            monitor-enter(r0)
            com.ss.android.downloadlib.j.j.a r1 = com.ss.android.downloadlib.j.j.a.n     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.ss.android.downloadlib.j.j.a r1 = new com.ss.android.downloadlib.j.j.a     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.ss.android.downloadlib.j.j.a.n = r1     // Catch: java.lang.Throwable -> L13
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
            com.ss.android.downloadlib.j.j.a r0 = com.ss.android.downloadlib.j.j.a.n
            return r0
    }

    public void a() {
            r4 = this;
            java.util.List<android.util.Pair<com.ss.android.downloadlib.j.j.xt, com.ss.android.downloadlib.j.j.r>> r0 = r4.e
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L25
            java.lang.Object r1 = r0.next()
            android.util.Pair r1 = (android.util.Pair) r1
            com.ss.android.downloadlib.j.j.cw r2 = r4.f     // Catch: android.os.RemoteException -> L20
            java.lang.Object r3 = r1.first     // Catch: android.os.RemoteException -> L20
            com.ss.android.downloadlib.j.j.xt r3 = (com.ss.android.downloadlib.j.j.xt) r3     // Catch: android.os.RemoteException -> L20
            java.lang.Object r1 = r1.second     // Catch: android.os.RemoteException -> L20
            com.ss.android.downloadlib.j.j.r r1 = (com.ss.android.downloadlib.j.j.r) r1     // Catch: android.os.RemoteException -> L20
            r2.b(r3, r1)     // Catch: android.os.RemoteException -> L20
            goto L6
        L20:
            r1 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r1)
            goto L6
        L25:
            java.util.List<android.util.Pair<com.ss.android.downloadlib.j.j.xt, com.ss.android.downloadlib.j.j.r>> r0 = r4.e
            r0.clear()
            return
    }

    public android.content.Intent b(android.content.Context r6) {
            r5 = this;
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = com.ss.android.downloadlib.j.j.a.k
            r0.setAction(r1)
            android.content.pm.PackageManager r6 = r6.getPackageManager()
            r1 = 0
            java.util.List r6 = r6.queryIntentServices(r0, r1)
            r1 = 0
            if (r6 == 0) goto L49
            int r2 = r6.size()
            r3 = 1
            if (r2 == r3) goto L1e
            goto L49
        L1e:
            java.util.Iterator r6 = r6.iterator()
        L22:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L49
            java.lang.Object r2 = r6.next()
            android.content.pm.ResolveInfo r2 = (android.content.pm.ResolveInfo) r2
            android.content.pm.ServiceInfo r2 = r2.serviceInfo
            java.lang.String r3 = r2.packageName
            java.lang.String r2 = r2.name
            java.lang.String r4 = com.ss.android.downloadlib.j.j.a.l
            boolean r4 = r4.equals(r3)
            if (r4 == 0) goto L22
            android.content.ComponentName r6 = new android.content.ComponentName
            r6.<init>(r3, r2)
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r0)
            r1.setComponent(r6)
        L49:
            return r1
    }

    public void d(com.ss.android.downloadlib.j.j.xt r4, com.ss.android.downloadlib.j.j.r r5) {
            r3 = this;
            java.lang.Object r0 = r3.j
            monitor-enter(r0)
            java.lang.String r1 = com.ss.android.downloadlib.j.j.a.m     // Catch: java.lang.Throwable -> L14
            r4.e = r1     // Catch: java.lang.Throwable -> L14
            java.lang.String r1 = r4.f     // Catch: java.lang.Throwable -> L14
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L14
            if (r1 == 0) goto L16
            java.lang.String r1 = r3.i     // Catch: java.lang.Throwable -> L14
            r4.f = r1     // Catch: java.lang.Throwable -> L14
            goto L16
        L14:
            r4 = move-exception
            goto L3e
        L16:
            com.ss.android.downloadlib.j.j.cw r1 = r3.f     // Catch: java.lang.Throwable -> L14
            if (r1 == 0) goto L23
            r1.b(r4, r5)     // Catch: java.lang.Throwable -> L14 android.os.RemoteException -> L1e
            goto L3c
        L1e:
            r4 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r4)     // Catch: java.lang.Throwable -> L14
            goto L3c
        L23:
            boolean r1 = r3.g()     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L33
            android.content.Context r1 = r3.d     // Catch: java.lang.Throwable -> L14
            boolean r2 = r3.b     // Catch: java.lang.Throwable -> L14
            boolean r1 = r3.f(r1, r2)     // Catch: java.lang.Throwable -> L14
            if (r1 == 0) goto L3c
        L33:
            java.util.List<android.util.Pair<com.ss.android.downloadlib.j.j.xt, com.ss.android.downloadlib.j.j.r>> r1 = r3.e     // Catch: java.lang.Throwable -> L14
            android.util.Pair r4 = android.util.Pair.create(r4, r5)     // Catch: java.lang.Throwable -> L14
            r1.add(r4)     // Catch: java.lang.Throwable -> L14
        L3c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            return
        L3e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r4
    }

    public void e(boolean r1) {
            r0 = this;
            r0.c = r1
            return
    }

    public boolean f(android.content.Context r4, boolean r5) {
            r3 = this;
            java.lang.String r0 = com.ss.android.downloadlib.j.j.a.k
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L36
            org.json.JSONObject r0 = com.ss.android.downloadlib.addownload.m.f()
            java.lang.String r1 = "s"
            java.lang.String r1 = r0.optString(r1)
            java.lang.String r2 = "q"
            java.lang.String r2 = r0.optString(r2)
            java.lang.String r2 = com.ss.android.socialbase.appdownloader.m.a.b(r2, r1)
            com.ss.android.downloadlib.j.j.a.k = r2
            java.lang.String r2 = "u"
            java.lang.String r2 = r0.optString(r2)
            java.lang.String r2 = com.ss.android.socialbase.appdownloader.m.a.b(r2, r1)
            com.ss.android.downloadlib.j.j.a.l = r2
            java.lang.String r2 = "w"
            java.lang.String r0 = r0.optString(r2)
            java.lang.String r0 = com.ss.android.socialbase.appdownloader.m.a.b(r0, r1)
            com.ss.android.downloadlib.j.j.a.m = r0
        L36:
            r3.b = r5
            if (r4 == 0) goto L6d
            android.content.Context r5 = r4.getApplicationContext()
            android.content.Context r5 = com.stub.StubApp.getOrigApplicationContext(r5)
            r3.d = r5
            java.lang.String r5 = com.ss.android.downloadlib.j.j.a.m
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 == 0) goto L54
            android.content.Context r5 = r3.d
            java.lang.String r5 = r5.getPackageName()
            com.ss.android.downloadlib.j.j.a.m = r5
        L54:
            com.ss.android.downloadlib.j.j.cw r5 = r3.f
            if (r5 != 0) goto L6d
            boolean r5 = r3.g()
            if (r5 != 0) goto L6d
            android.content.Intent r4 = r3.b(r4)
            android.content.Context r5 = r3.d
            android.content.ServiceConnection r0 = r3.h
            r1 = 33
            boolean r4 = r5.bindService(r4, r0, r1)
            return r4
        L6d:
            r4 = 1
            return r4
    }

    public boolean g() {
            r1 = this;
            boolean r0 = r1.c
            return r0
    }

    public void h() {
            r2 = this;
            com.ss.android.downloadlib.j.j.cw r0 = r2.f
            if (r0 == 0) goto Le
            android.content.Context r0 = r2.d
            android.content.ServiceConnection r1 = r2.h
            r0.unbindService(r1)
            r0 = 0
            r2.f = r0
        Le:
            java.util.List<java.lang.Object> r0 = r2.g
            r0.clear()
            java.util.List<android.util.Pair<com.ss.android.downloadlib.j.j.xt, com.ss.android.downloadlib.j.j.r>> r0 = r2.e
            r0.clear()
            return
    }
}

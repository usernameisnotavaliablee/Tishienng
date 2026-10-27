package cn.jiguang.ae;

@android.annotation.TargetApi(21)
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class a extends android.net.ConnectivityManager.NetworkCallback {
    private android.net.NetworkRequest a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f421b;

    /* renamed from: cn.jiguang.ae.a$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* renamed from: cn.jiguang.ae.a$a, reason: collision with other inner class name */
    private static final class C0010a {
        private static final cn.jiguang.ae.a a = null;

        static {
                cn.jiguang.ae.a r0 = new cn.jiguang.ae.a
                r1 = 0
                r0.<init>(r1)
                cn.jiguang.ae.a.C0010a.a = r0
                return
        }

        public C0010a() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ cn.jiguang.ae.a a() {
                cn.jiguang.ae.a r0 = cn.jiguang.ae.a.C0010a.a
                return r0
        }
    }

    private a() {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.f421b = r0
            android.net.NetworkRequest$Builder r0 = new android.net.NetworkRequest$Builder     // Catch: java.lang.Throwable -> L12
            r0.<init>()     // Catch: java.lang.Throwable -> L12
            android.net.NetworkRequest r0 = r0.build()     // Catch: java.lang.Throwable -> L12
            r3.a = r0     // Catch: java.lang.Throwable -> L12
            return
        L12:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "init network request error, "
            r1.append(r2)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "ConnectionStateMonitor"
            cn.jiguang.w.f.i(r1, r0)
            return
    }

    /* synthetic */ a(cn.jiguang.ae.a.AnonymousClass1 r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public static cn.jiguang.ae.a a() {
            cn.jiguang.ae.a r0 = cn.jiguang.ae.a.C0010a.a()
            return r0
    }

    public void a(android.content.Context r4) {
            r3 = this;
            java.lang.String r0 = "ConnectionStateMonitor"
            if (r4 == 0) goto L3d
            android.net.NetworkRequest r1 = r3.a
            if (r1 == 0) goto L3d
            boolean r1 = r3.f421b
            if (r1 != 0) goto L3d
            java.lang.String r1 = "connectivity"
            java.lang.Object r4 = r4.getSystemService(r1)     // Catch: java.lang.Throwable -> L24
            android.net.ConnectivityManager r4 = (android.net.ConnectivityManager) r4     // Catch: java.lang.Throwable -> L24
            if (r4 == 0) goto L3d
            android.net.NetworkRequest r1 = r3.a     // Catch: java.lang.Throwable -> L24
            r4.registerNetworkCallback(r1, r3)     // Catch: java.lang.Throwable -> L24
            r4 = 1
            r3.f421b = r4     // Catch: java.lang.Throwable -> L24
            java.lang.String r4 = "start network listen..."
            cn.jiguang.w.f.c(r0, r4)     // Catch: java.lang.Throwable -> L24
            return
        L24:
            r4 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "enable connectivity error, "
            r1.append(r2)
            java.lang.String r4 = r4.getMessage()
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            cn.jiguang.w.f.i(r0, r4)
        L3d:
            return
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(android.net.Network r9) {
            r8 = this;
            java.lang.String r1 = "ConnectionStateMonitor"
            java.lang.String r0 = ""
            if (r9 == 0) goto Le
            java.lang.String r0 = r9.toString()     // Catch: java.lang.Throwable -> Lb
            goto Le
        Lb:
            r0 = move-exception
            r9 = r0
            goto L7a
        Le:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb
            r2.<init>()     // Catch: java.lang.Throwable -> Lb
            java.lang.String r3 = "[onAvailable] network is connected, netId: "
            r2.append(r3)     // Catch: java.lang.Throwable -> Lb
            r2.append(r0)     // Catch: java.lang.Throwable -> Lb
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> Lb
            cn.jiguang.w.f.c(r1, r0)     // Catch: java.lang.Throwable -> Lb
            r0 = 0
            android.content.Context r2 = cn.jiguang.av.c.a(r0)     // Catch: java.lang.Throwable -> Lb
            if (r2 != 0) goto L2f
            java.lang.String r9 = "[onAvailable] context is null, can not handle network change event"
            cn.jiguang.w.f.c(r1, r9)     // Catch: java.lang.Throwable -> Lb
            return
        L2f:
            java.lang.String r0 = "connectivity"
            java.lang.Object r0 = r2.getSystemService(r0)     // Catch: java.lang.Throwable -> Lb
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0     // Catch: java.lang.Throwable -> Lb
            if (r0 == 0) goto L77
            android.net.NetworkCapabilities r9 = r0.getNetworkCapabilities(r9)     // Catch: java.lang.Throwable -> Lb
            if (r9 == 0) goto L62
            r0 = 1
            boolean r3 = r9.hasTransport(r0)     // Catch: java.lang.Throwable -> Lb
            r4 = 0
            if (r3 != 0) goto L4d
            boolean r3 = r9.hasTransport(r4)     // Catch: java.lang.Throwable -> Lb
            if (r3 == 0) goto L62
        L4d:
            android.os.Bundle r6 = new android.os.Bundle     // Catch: java.lang.Throwable -> Lb
            r6.<init>()     // Catch: java.lang.Throwable -> Lb
            java.lang.String r9 = "connected"
            r6.putBoolean(r9, r0)     // Catch: java.lang.Throwable -> Lb
            java.lang.String r3 = ""
            java.lang.Object[] r7 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> Lb
            r4 = 80
            r5 = 0
            cn.jiguang.api.JCoreManager.onEvent(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> Lb
            return
        L62:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb
            r0.<init>()     // Catch: java.lang.Throwable -> Lb
            java.lang.String r2 = "[onAvailable] capabilities:"
            r0.append(r2)     // Catch: java.lang.Throwable -> Lb
            r0.append(r9)     // Catch: java.lang.Throwable -> Lb
            java.lang.String r9 = r0.toString()     // Catch: java.lang.Throwable -> Lb
        L73:
            cn.jiguang.w.f.i(r1, r9)     // Catch: java.lang.Throwable -> Lb
            return
        L77:
            java.lang.String r9 = "[onAvailable] connectivityManager null"
            goto L73
        L7a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "[onAvailable] error, "
            r0.append(r2)
            java.lang.String r9 = r9.getMessage()
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            cn.jiguang.w.f.i(r1, r9)
            return
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLost(android.net.Network r9) {
            r8 = this;
            java.lang.String r1 = "ConnectionStateMonitor"
            java.lang.String r0 = ""
            if (r9 == 0) goto Le
            java.lang.String r0 = r9.toString()     // Catch: java.lang.Throwable -> Lb
            goto Le
        Lb:
            r0 = move-exception
            r9 = r0
            goto L45
        Le:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb
            r9.<init>()     // Catch: java.lang.Throwable -> Lb
            java.lang.String r2 = "[onLost] network is disconnected, netId: "
            r9.append(r2)     // Catch: java.lang.Throwable -> Lb
            r9.append(r0)     // Catch: java.lang.Throwable -> Lb
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> Lb
            cn.jiguang.w.f.j(r1, r9)     // Catch: java.lang.Throwable -> Lb
            r9 = 0
            android.content.Context r2 = cn.jiguang.av.c.a(r9)     // Catch: java.lang.Throwable -> Lb
            if (r2 != 0) goto L2f
            java.lang.String r9 = "[onLost] context is null, can not handle network change event"
            cn.jiguang.w.f.c(r1, r9)     // Catch: java.lang.Throwable -> Lb
            return
        L2f:
            android.os.Bundle r6 = new android.os.Bundle     // Catch: java.lang.Throwable -> Lb
            r6.<init>()     // Catch: java.lang.Throwable -> Lb
            java.lang.String r9 = "connected"
            r0 = 0
            r6.putBoolean(r9, r0)     // Catch: java.lang.Throwable -> Lb
            java.lang.String r3 = ""
            java.lang.Object[] r7 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> Lb
            r4 = 80
            r5 = 0
            cn.jiguang.api.JCoreManager.onEvent(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> Lb
            return
        L45:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "[onLost] error, "
            r0.append(r2)
            java.lang.String r9 = r9.getMessage()
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            cn.jiguang.w.f.i(r1, r9)
            return
    }
}

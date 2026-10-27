package org.repackage.com.vivo.identifier;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class IdentifierIdClient {
    private static int A = 13;
    private static org.repackage.com.vivo.identifier.IdentifierIdObserver B = null;
    private static org.repackage.com.vivo.identifier.IdentifierIdObserver C = null;
    private static org.repackage.com.vivo.identifier.IdentifierIdObserver D = null;
    private static org.repackage.com.vivo.identifier.IdentifierIdObserver E = null;
    private static android.os.HandlerThread F = null;
    private static android.os.Handler G = null;
    private static java.lang.String H = null;
    private static java.lang.String I = null;
    private static java.lang.String J = null;
    private static java.lang.String K = null;
    private static java.lang.String L = null;
    private static java.lang.String M = null;
    private static java.lang.String N = null;
    private static volatile org.repackage.com.vivo.identifier.IdentifierIdClient O = null;
    private static volatile org.repackage.com.vivo.identifier.DataBaseOperation P = null;
    private static int R = 0;
    private static int S = 0;
    private static int T = 0;
    private static int U = 0;
    private static int V = 0;
    private static int W = 0;
    private static int X = 0;
    private static int Y = 0;
    private static int Z = 0;
    public static final java.lang.String a = "persist.sys.identifierid";
    private static int aa = 0;
    private static int ab = 0;
    private static int ac = 0;
    private static final java.lang.String b = "VMS_SDK_Client";
    private static final java.lang.String c = "content://com.vivo.vms.IdProvider/IdentifierId";
    private static final java.lang.String d = "persist.sys.identifierid.supported";
    private static final java.lang.String e = "com.vivo.vms";
    private static final java.lang.String f = "appid";
    private static final java.lang.String g = "type";
    private static final java.lang.String h = "OAID";
    private static final java.lang.String i = "VAID";
    private static final java.lang.String j = "OAIDSTATUS";
    private static java.lang.Object k = null;
    private static final int l = 0;
    private static final int m = 1;
    private static final int n = 2;
    private static final int o = 3;
    private static final int p = 4;

    /* renamed from: q, reason: collision with root package name */
    private static final int f68q = 5;
    private static final int r = 6;
    private static final int s = 7;
    private static final int t = 8;
    private static final int u = 9;
    private static final int v = 10;
    private static final int w = 11;
    private static final int x = 2000;
    private static android.content.Context y;
    private static boolean z;
    private final int Q;



    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            org.repackage.com.vivo.identifier.IdentifierIdClient.k = r0
            return
    }

    private IdentifierIdClient() {
            r2 = this;
            r2.<init>()
            D()
            org.repackage.com.vivo.identifier.DataBaseOperation r0 = new org.repackage.com.vivo.identifier.DataBaseOperation
            android.content.Context r1 = org.repackage.com.vivo.identifier.IdentifierIdClient.y
            r0.<init>(r1)
            org.repackage.com.vivo.identifier.IdentifierIdClient.P = r0
            android.content.Context r0 = org.repackage.com.vivo.identifier.IdentifierIdClient.y
            int r0 = c(r0)
            r2.Q = r0
            return
    }

    static /* synthetic */ java.lang.String A() {
            java.lang.String r0 = org.repackage.com.vivo.identifier.IdentifierIdClient.J
            return r0
    }

    static /* synthetic */ java.lang.Object B() {
            java.lang.Object r0 = org.repackage.com.vivo.identifier.IdentifierIdClient.k
            return r0
    }

    private void C() {
            r8 = this;
            r0 = 1
            java.util.concurrent.ScheduledExecutorService r1 = java.util.concurrent.Executors.newScheduledThreadPool(r0)
            org.repackage.com.vivo.identifier.IdentifierIdClient$1 r2 = new org.repackage.com.vivo.identifier.IdentifierIdClient$1
            r2.<init>(r8)
            r5 = 600(0x258, double:2.964E-321)
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS
            r3 = 600(0x258, double:2.964E-321)
            r1.scheduleWithFixedDelay(r2, r3, r5, r7)
            return
    }

    private static void D() {
            android.os.HandlerThread r0 = new android.os.HandlerThread
            java.lang.String r1 = "SqlWorkThread"
            r0.<init>(r1)
            org.repackage.com.vivo.identifier.IdentifierIdClient.F = r0
            r0.start()
            org.repackage.com.vivo.identifier.IdentifierIdClient$2 r0 = new org.repackage.com.vivo.identifier.IdentifierIdClient$2
            android.os.HandlerThread r1 = org.repackage.com.vivo.identifier.IdentifierIdClient.F
            android.os.Looper r1 = r1.getLooper()
            r0.<init>(r1)
            org.repackage.com.vivo.identifier.IdentifierIdClient.G = r0
            return
    }

    private static void E() {
            java.lang.String r0 = "persist.sys.identifierid.supported"
            java.lang.String r1 = "0"
            java.lang.String r0 = a(r0, r1)
            java.lang.String r2 = "1"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L1f
            java.lang.String r0 = "persist.sys.identifierid"
            java.lang.String r0 = a(r0, r1)
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L1d
            goto L1f
        L1d:
            r0 = 0
            goto L20
        L1f:
            r0 = 1
        L20:
            org.repackage.com.vivo.identifier.IdentifierIdClient.z = r0
            return
    }

    static /* synthetic */ int a(int r0) {
            org.repackage.com.vivo.identifier.IdentifierIdClient.R = r0
            return r0
    }

    private java.lang.String a(int r2, int r3, int r4, int r5) {
            r1 = this;
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            r0.append(r2)
            java.lang.String r2 = ","
            r0.append(r2)
            r0.append(r3)
            java.lang.String r3 = ";"
            r0.append(r3)
            r0.append(r4)
            r0.append(r2)
            r0.append(r5)
            java.lang.String r2 = r0.toString()
            return r2
    }

    static /* synthetic */ java.lang.String a(java.lang.String r0) {
            org.repackage.com.vivo.identifier.IdentifierIdClient.H = r0
            return r0
    }

    private static java.lang.String a(java.lang.String r7, java.lang.String r8) {
            java.lang.String r0 = "android.os.SystemProperties"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L26 java.lang.Throwable -> L2a
            java.lang.String r1 = "get"
            r2 = 2
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L26 java.lang.Throwable -> L2a
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r5 = 0
            r3[r5] = r4     // Catch: java.lang.Exception -> L26 java.lang.Throwable -> L2a
            r6 = 1
            r3[r6] = r4     // Catch: java.lang.Exception -> L26 java.lang.Throwable -> L2a
            java.lang.reflect.Method r1 = r0.getMethod(r1, r3)     // Catch: java.lang.Exception -> L26 java.lang.Throwable -> L2a
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L26 java.lang.Throwable -> L2a
            r2[r5] = r7     // Catch: java.lang.Exception -> L26 java.lang.Throwable -> L2a
            java.lang.String r7 = "0"
            r2[r6] = r7     // Catch: java.lang.Exception -> L26 java.lang.Throwable -> L2a
            java.lang.Object r7 = r1.invoke(r0, r2)     // Catch: java.lang.Exception -> L26 java.lang.Throwable -> L2a
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Exception -> L26 java.lang.Throwable -> L2a
            return r7
        L26:
            r7 = move-exception
            r7.getMessage()     // Catch: java.lang.Throwable -> L2a
        L2a:
            return r8
    }

    static /* synthetic */ java.lang.String a(org.repackage.com.vivo.identifier.IdentifierIdClient r0, int r1, int r2, int r3, int r4) {
            java.lang.String r0 = r0.a(r1, r2, r3, r4)
            return r0
    }

    static org.repackage.com.vivo.identifier.IdentifierIdClient a(android.content.Context r1) {
            android.content.Context r0 = org.repackage.com.vivo.identifier.IdentifierIdClient.y
            if (r0 != 0) goto L16
            if (r1 != 0) goto L8
            r1 = 0
            return r1
        L8:
            android.content.Context r0 = r1.getApplicationContext()
            android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)
            if (r0 != 0) goto L13
            goto L14
        L13:
            r1 = r0
        L14:
            org.repackage.com.vivo.identifier.IdentifierIdClient.y = r1
        L16:
            org.repackage.com.vivo.identifier.IdentifierIdClient r1 = org.repackage.com.vivo.identifier.IdentifierIdClient.O
            if (r1 != 0) goto L34
            java.lang.Class<org.repackage.com.vivo.identifier.IdentifierIdClient> r1 = org.repackage.com.vivo.identifier.IdentifierIdClient.class
            monitor-enter(r1)
            org.repackage.com.vivo.identifier.IdentifierIdClient r0 = org.repackage.com.vivo.identifier.IdentifierIdClient.O     // Catch: java.lang.Throwable -> L2e
            if (r0 != 0) goto L30
            org.repackage.com.vivo.identifier.IdentifierIdClient r0 = new org.repackage.com.vivo.identifier.IdentifierIdClient     // Catch: java.lang.Throwable -> L2e
            r0.<init>()     // Catch: java.lang.Throwable -> L2e
            org.repackage.com.vivo.identifier.IdentifierIdClient.O = r0     // Catch: java.lang.Throwable -> L2e
            org.repackage.com.vivo.identifier.IdentifierIdClient r0 = org.repackage.com.vivo.identifier.IdentifierIdClient.O     // Catch: java.lang.Throwable -> L2e
            r0.C()     // Catch: java.lang.Throwable -> L2e
            goto L30
        L2e:
            r0 = move-exception
            goto L32
        L30:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2e
            goto L34
        L32:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2e
            throw r0
        L34:
            org.repackage.com.vivo.identifier.IdentifierIdClient r1 = org.repackage.com.vivo.identifier.IdentifierIdClient.O
            return r1
    }

    private static synchronized void a(android.content.Context r4, int r5, java.lang.String r6) {
            java.lang.Class<org.repackage.com.vivo.identifier.IdentifierIdClient> r0 = org.repackage.com.vivo.identifier.IdentifierIdClient.class
            monitor-enter(r0)
            r1 = 0
            r2 = 1
            if (r5 == 0) goto L6c
            if (r5 == r2) goto L40
            r2 = 2
            if (r5 == r2) goto Le
            goto L89
        Le:
            org.repackage.com.vivo.identifier.IdentifierIdObserver r5 = org.repackage.com.vivo.identifier.IdentifierIdClient.D     // Catch: java.lang.Throwable -> L3e
            if (r5 != 0) goto L89
            org.repackage.com.vivo.identifier.IdentifierIdObserver r5 = new org.repackage.com.vivo.identifier.IdentifierIdObserver     // Catch: java.lang.Throwable -> L3e
            org.repackage.com.vivo.identifier.IdentifierIdClient r3 = org.repackage.com.vivo.identifier.IdentifierIdClient.O     // Catch: java.lang.Throwable -> L3e
            r5.<init>(r3, r2, r6)     // Catch: java.lang.Throwable -> L3e
            org.repackage.com.vivo.identifier.IdentifierIdClient.D = r5     // Catch: java.lang.Throwable -> L3e
            android.content.ContentResolver r5 = r4.getContentResolver()     // Catch: java.lang.Throwable -> L3e
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3e
            r6.<init>()     // Catch: java.lang.Throwable -> L3e
            java.lang.String r2 = "content://com.vivo.vms.IdProvider/IdentifierId/"
            r6.append(r2)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r4 = r4.getPackageName()     // Catch: java.lang.Throwable -> L3e
            r6.append(r4)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r4 = r6.toString()     // Catch: java.lang.Throwable -> L3e
            android.net.Uri r4 = android.net.Uri.parse(r4)     // Catch: java.lang.Throwable -> L3e
            org.repackage.com.vivo.identifier.IdentifierIdObserver r6 = org.repackage.com.vivo.identifier.IdentifierIdClient.D     // Catch: java.lang.Throwable -> L3e
            r5.registerContentObserver(r4, r1, r6)     // Catch: java.lang.Throwable -> L3e
            goto L89
        L3e:
            r4 = move-exception
            goto L8b
        L40:
            org.repackage.com.vivo.identifier.IdentifierIdObserver r5 = org.repackage.com.vivo.identifier.IdentifierIdClient.C     // Catch: java.lang.Throwable -> L3e
            if (r5 != 0) goto L89
            org.repackage.com.vivo.identifier.IdentifierIdObserver r5 = new org.repackage.com.vivo.identifier.IdentifierIdObserver     // Catch: java.lang.Throwable -> L3e
            org.repackage.com.vivo.identifier.IdentifierIdClient r3 = org.repackage.com.vivo.identifier.IdentifierIdClient.O     // Catch: java.lang.Throwable -> L3e
            r5.<init>(r3, r2, r6)     // Catch: java.lang.Throwable -> L3e
            org.repackage.com.vivo.identifier.IdentifierIdClient.C = r5     // Catch: java.lang.Throwable -> L3e
            android.content.ContentResolver r4 = r4.getContentResolver()     // Catch: java.lang.Throwable -> L3e
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3e
            r5.<init>()     // Catch: java.lang.Throwable -> L3e
            java.lang.String r2 = "content://com.vivo.vms.IdProvider/IdentifierId/VAID_"
            r5.append(r2)     // Catch: java.lang.Throwable -> L3e
            r5.append(r6)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L3e
            android.net.Uri r5 = android.net.Uri.parse(r5)     // Catch: java.lang.Throwable -> L3e
            org.repackage.com.vivo.identifier.IdentifierIdObserver r6 = org.repackage.com.vivo.identifier.IdentifierIdClient.C     // Catch: java.lang.Throwable -> L3e
            r4.registerContentObserver(r5, r1, r6)     // Catch: java.lang.Throwable -> L3e
            goto L89
        L6c:
            org.repackage.com.vivo.identifier.IdentifierIdObserver r5 = org.repackage.com.vivo.identifier.IdentifierIdClient.B     // Catch: java.lang.Throwable -> L3e
            if (r5 != 0) goto L89
            org.repackage.com.vivo.identifier.IdentifierIdObserver r5 = new org.repackage.com.vivo.identifier.IdentifierIdObserver     // Catch: java.lang.Throwable -> L3e
            org.repackage.com.vivo.identifier.IdentifierIdClient r6 = org.repackage.com.vivo.identifier.IdentifierIdClient.O     // Catch: java.lang.Throwable -> L3e
            r3 = 0
            r5.<init>(r6, r1, r3)     // Catch: java.lang.Throwable -> L3e
            org.repackage.com.vivo.identifier.IdentifierIdClient.B = r5     // Catch: java.lang.Throwable -> L3e
            android.content.ContentResolver r4 = r4.getContentResolver()     // Catch: java.lang.Throwable -> L3e
            java.lang.String r5 = "content://com.vivo.vms.IdProvider/IdentifierId/OAID"
            android.net.Uri r5 = android.net.Uri.parse(r5)     // Catch: java.lang.Throwable -> L3e
            org.repackage.com.vivo.identifier.IdentifierIdObserver r6 = org.repackage.com.vivo.identifier.IdentifierIdClient.B     // Catch: java.lang.Throwable -> L3e
            r4.registerContentObserver(r5, r2, r6)     // Catch: java.lang.Throwable -> L3e
        L89:
            monitor-exit(r0)
            return
        L8b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3e
            throw r4
    }

    static boolean a() {
            boolean r0 = org.repackage.com.vivo.identifier.IdentifierIdClient.z
            if (r0 != 0) goto L7
            E()
        L7:
            boolean r0 = org.repackage.com.vivo.identifier.IdentifierIdClient.z
            return r0
    }

    static /* synthetic */ int b(int r0) {
            org.repackage.com.vivo.identifier.IdentifierIdClient.S = r0
            return r0
    }

    static /* synthetic */ java.lang.String b(java.lang.String r0) {
            org.repackage.com.vivo.identifier.IdentifierIdClient.I = r0
            return r0
    }

    static org.repackage.com.vivo.identifier.IdentifierIdClient b(android.content.Context r1) {
            boolean r0 = a()
            if (r0 != 0) goto L8
            r1 = 0
            return r1
        L8:
            org.repackage.com.vivo.identifier.IdentifierIdClient r1 = a(r1)
            return r1
    }

    static /* synthetic */ void b(int r0, java.lang.String r1) {
            c(r0, r1)
            return
    }

    static /* synthetic */ int c(int r0) {
            org.repackage.com.vivo.identifier.IdentifierIdClient.T = r0
            return r0
    }

    private static int c(android.content.Context r2) {
            android.content.pm.PackageManager r2 = r2.getPackageManager()
            r0 = 0
            java.lang.String r1 = "com.vivo.vms"
            android.content.pm.PackageInfo r2 = r2.getPackageInfo(r1, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Le
            int r2 = r2.versionCode     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Le
            return r2
        Le:
            return r0
    }

    static /* synthetic */ java.lang.String c(java.lang.String r0) {
            org.repackage.com.vivo.identifier.IdentifierIdClient.J = r0
            return r0
    }

    private static void c(int r2, java.lang.String r3) {
            r0 = 1
            if (r2 == 0) goto L52
            if (r2 == r0) goto L44
            r1 = 2
            if (r2 == r1) goto L36
            switch(r2) {
                case 8: goto L28;
                case 9: goto L1a;
                case 10: goto Lc;
                default: goto Lb;
            }
        Lb:
            return
        Lc:
            if (r3 != 0) goto L14
            int r2 = org.repackage.com.vivo.identifier.IdentifierIdClient.ac
            int r2 = r2 + r0
            org.repackage.com.vivo.identifier.IdentifierIdClient.ac = r2
            return
        L14:
            int r2 = org.repackage.com.vivo.identifier.IdentifierIdClient.ab
            int r2 = r2 + r0
            org.repackage.com.vivo.identifier.IdentifierIdClient.ab = r2
            return
        L1a:
            if (r3 != 0) goto L22
            int r2 = org.repackage.com.vivo.identifier.IdentifierIdClient.aa
            int r2 = r2 + r0
            org.repackage.com.vivo.identifier.IdentifierIdClient.aa = r2
            return
        L22:
            int r2 = org.repackage.com.vivo.identifier.IdentifierIdClient.Z
            int r2 = r2 + r0
            org.repackage.com.vivo.identifier.IdentifierIdClient.Z = r2
            return
        L28:
            if (r3 != 0) goto L30
            int r2 = org.repackage.com.vivo.identifier.IdentifierIdClient.Y
            int r2 = r2 + r0
            org.repackage.com.vivo.identifier.IdentifierIdClient.Y = r2
            return
        L30:
            int r2 = org.repackage.com.vivo.identifier.IdentifierIdClient.X
            int r2 = r2 + r0
            org.repackage.com.vivo.identifier.IdentifierIdClient.X = r2
            return
        L36:
            if (r3 != 0) goto L3e
            int r2 = org.repackage.com.vivo.identifier.IdentifierIdClient.W
            int r2 = r2 + r0
            org.repackage.com.vivo.identifier.IdentifierIdClient.W = r2
            return
        L3e:
            int r2 = org.repackage.com.vivo.identifier.IdentifierIdClient.V
            int r2 = r2 + r0
            org.repackage.com.vivo.identifier.IdentifierIdClient.V = r2
            return
        L44:
            if (r3 != 0) goto L4c
            int r2 = org.repackage.com.vivo.identifier.IdentifierIdClient.U
            int r2 = r2 + r0
            org.repackage.com.vivo.identifier.IdentifierIdClient.U = r2
            return
        L4c:
            int r2 = org.repackage.com.vivo.identifier.IdentifierIdClient.T
            int r2 = r2 + r0
            org.repackage.com.vivo.identifier.IdentifierIdClient.T = r2
            return
        L52:
            if (r3 != 0) goto L5a
            int r2 = org.repackage.com.vivo.identifier.IdentifierIdClient.S
            int r2 = r2 + r0
            org.repackage.com.vivo.identifier.IdentifierIdClient.S = r2
            return
        L5a:
            int r2 = org.repackage.com.vivo.identifier.IdentifierIdClient.R
            int r2 = r2 + r0
            org.repackage.com.vivo.identifier.IdentifierIdClient.R = r2
            return
    }

    static /* synthetic */ int d(int r0) {
            org.repackage.com.vivo.identifier.IdentifierIdClient.U = r0
            return r0
    }

    static /* synthetic */ java.lang.String d(java.lang.String r0) {
            org.repackage.com.vivo.identifier.IdentifierIdClient.K = r0
            return r0
    }

    private void d(int r1, java.lang.String r2) {
            r0 = this;
            r0.a(r1, r2)
            return
    }

    static /* synthetic */ int e(int r0) {
            org.repackage.com.vivo.identifier.IdentifierIdClient.V = r0
            return r0
    }

    static /* synthetic */ java.lang.String e(java.lang.String r0) {
            org.repackage.com.vivo.identifier.IdentifierIdClient.L = r0
            return r0
    }

    private void e(int r4, java.lang.String r5) {
            r3 = this;
            java.lang.Object r0 = org.repackage.com.vivo.identifier.IdentifierIdClient.k
            monitor-enter(r0)
            r3.a(r4, r5)     // Catch: java.lang.Throwable -> L11
            android.os.SystemClock.uptimeMillis()     // Catch: java.lang.Throwable -> L11
            java.lang.Object r4 = org.repackage.com.vivo.identifier.IdentifierIdClient.k     // Catch: java.lang.Throwable -> L11 java.lang.InterruptedException -> L13
            r1 = 2000(0x7d0, double:9.88E-321)
            r4.wait(r1)     // Catch: java.lang.Throwable -> L11 java.lang.InterruptedException -> L13
            goto L13
        L11:
            r4 = move-exception
            goto L18
        L13:
            android.os.SystemClock.uptimeMillis()     // Catch: java.lang.Throwable -> L11
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            return
        L18:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            throw r4
    }

    static /* synthetic */ int f(int r0) {
            org.repackage.com.vivo.identifier.IdentifierIdClient.W = r0
            return r0
    }

    static /* synthetic */ java.lang.String f(java.lang.String r0) {
            org.repackage.com.vivo.identifier.IdentifierIdClient.M = r0
            return r0
    }

    static /* synthetic */ int g(int r0) {
            org.repackage.com.vivo.identifier.IdentifierIdClient.X = r0
            return r0
    }

    static /* synthetic */ int h(int r0) {
            org.repackage.com.vivo.identifier.IdentifierIdClient.Y = r0
            return r0
    }

    static /* synthetic */ int i(int r0) {
            org.repackage.com.vivo.identifier.IdentifierIdClient.Z = r0
            return r0
    }

    static /* synthetic */ int j(int r0) {
            org.repackage.com.vivo.identifier.IdentifierIdClient.aa = r0
            return r0
    }

    static /* synthetic */ int k(int r0) {
            org.repackage.com.vivo.identifier.IdentifierIdClient.ab = r0
            return r0
    }

    static /* synthetic */ int l() {
            int r0 = org.repackage.com.vivo.identifier.IdentifierIdClient.R
            return r0
    }

    static /* synthetic */ int l(int r0) {
            org.repackage.com.vivo.identifier.IdentifierIdClient.ac = r0
            return r0
    }

    static /* synthetic */ int m() {
            int r0 = org.repackage.com.vivo.identifier.IdentifierIdClient.S
            return r0
    }

    static /* synthetic */ int n() {
            int r0 = org.repackage.com.vivo.identifier.IdentifierIdClient.X
            return r0
    }

    static /* synthetic */ int o() {
            int r0 = org.repackage.com.vivo.identifier.IdentifierIdClient.aa
            return r0
    }

    static /* synthetic */ int p() {
            int r0 = org.repackage.com.vivo.identifier.IdentifierIdClient.T
            return r0
    }

    static /* synthetic */ int q() {
            int r0 = org.repackage.com.vivo.identifier.IdentifierIdClient.U
            return r0
    }

    static /* synthetic */ int r() {
            int r0 = org.repackage.com.vivo.identifier.IdentifierIdClient.Z
            return r0
    }

    static /* synthetic */ int s() {
            int r0 = org.repackage.com.vivo.identifier.IdentifierIdClient.V
            return r0
    }

    static /* synthetic */ int t() {
            int r0 = org.repackage.com.vivo.identifier.IdentifierIdClient.W
            return r0
    }

    static /* synthetic */ int u() {
            int r0 = org.repackage.com.vivo.identifier.IdentifierIdClient.ab
            return r0
    }

    static /* synthetic */ int v() {
            int r0 = org.repackage.com.vivo.identifier.IdentifierIdClient.ac
            return r0
    }

    static /* synthetic */ int w() {
            int r0 = org.repackage.com.vivo.identifier.IdentifierIdClient.Y
            return r0
    }

    static /* synthetic */ org.repackage.com.vivo.identifier.DataBaseOperation x() {
            org.repackage.com.vivo.identifier.DataBaseOperation r0 = org.repackage.com.vivo.identifier.IdentifierIdClient.P
            return r0
    }

    static /* synthetic */ java.lang.String y() {
            java.lang.String r0 = org.repackage.com.vivo.identifier.IdentifierIdClient.H
            return r0
    }

    static /* synthetic */ java.lang.String z() {
            java.lang.String r0 = org.repackage.com.vivo.identifier.IdentifierIdClient.I
            return r0
    }

    void a(int r4, java.lang.String r5) {
            r3 = this;
            android.os.Handler r0 = org.repackage.com.vivo.identifier.IdentifierIdClient.G
            android.os.Message r0 = r0.obtainMessage()
            r1 = 11
            r0.what = r1
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r2 = "type"
            r1.putInt(r2, r4)
            r2 = 1
            if (r4 == r2) goto L1d
            r2 = 2
            if (r4 == r2) goto L1d
            r2 = 6
            if (r4 != r2) goto L22
        L1d:
            java.lang.String r4 = "appid"
            r1.putString(r4, r5)
        L22:
            r0.setData(r1)
            android.os.Handler r4 = org.repackage.com.vivo.identifier.IdentifierIdClient.G
            r4.sendMessage(r0)
            return
    }

    boolean a(java.util.List<java.lang.String> r9) {
            r8 = this;
            int r0 = r8.Q
            int r1 = org.repackage.com.vivo.identifier.IdentifierIdClient.A
            r2 = 0
            if (r0 >= r1) goto L8
            return r2
        L8:
            if (r9 == 0) goto L6b
            int r0 = r9.size()
            if (r0 != 0) goto L11
            goto L6b
        L11:
            int r0 = r9.size()     // Catch: java.lang.Exception -> L6b
            android.content.ContentValues[] r0 = new android.content.ContentValues[r0]     // Catch: java.lang.Exception -> L6b
            java.util.Date r1 = new java.util.Date     // Catch: java.lang.Exception -> L6b
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L6b
            r1.<init>(r3)     // Catch: java.lang.Exception -> L6b
            java.text.SimpleDateFormat r3 = new java.text.SimpleDateFormat     // Catch: java.lang.Exception -> L6b
            java.lang.String r4 = "yyyy-MM-dd HH:mm:ss"
            r3.<init>(r4)     // Catch: java.lang.Exception -> L6b
            java.lang.String r1 = r3.format(r1)     // Catch: java.lang.Exception -> L6b
            r3 = 0
        L2c:
            int r4 = r9.size()     // Catch: java.lang.Exception -> L6b
            if (r3 >= r4) goto L61
            android.content.ContentValues r4 = new android.content.ContentValues     // Catch: java.lang.Exception -> L6b
            r4.<init>()     // Catch: java.lang.Exception -> L6b
            java.lang.Object r5 = r9.get(r3)     // Catch: java.lang.Exception -> L6b
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Exception -> L6b
            java.lang.String r6 = ":"
            java.lang.String[] r5 = r5.split(r6)     // Catch: java.lang.Exception -> L6b
            int r6 = r5.length     // Catch: java.lang.Exception -> L6b
            r7 = 2
            if (r6 != r7) goto L60
            r6 = r5[r2]     // Catch: java.lang.Exception -> L6b
            r7 = 1
            r5 = r5[r7]     // Catch: java.lang.Exception -> L6b
            java.lang.String r7 = "packageName"
            r4.put(r7, r6)     // Catch: java.lang.Exception -> L6b
            java.lang.String r6 = "uid"
            r4.put(r6, r5)     // Catch: java.lang.Exception -> L6b
            java.lang.String r5 = "value"
            r4.put(r5, r1)     // Catch: java.lang.Exception -> L6b
            r0[r3] = r4     // Catch: java.lang.Exception -> L6b
            int r3 = r3 + 1
            goto L2c
        L60:
            return r2
        L61:
            org.repackage.com.vivo.identifier.DataBaseOperation r9 = org.repackage.com.vivo.identifier.IdentifierIdClient.P     // Catch: java.lang.Exception -> L6b
            java.lang.String r1 = "vivo"
            r3 = 6
            boolean r9 = r9.a(r3, r1, r0)     // Catch: java.lang.Exception -> L6b
            return r9
        L6b:
            return r2
    }

    java.lang.String b() {
            r2 = this;
            java.lang.String r0 = org.repackage.com.vivo.identifier.IdentifierIdClient.K
            if (r0 == 0) goto L5
            return r0
        L5:
            r0 = 3
            r1 = 0
            r2.e(r0, r1)
            java.lang.String r0 = org.repackage.com.vivo.identifier.IdentifierIdClient.K
            return r0
    }

    java.util.List b(java.util.List<java.lang.String> r10) {
            r9 = this;
            int r0 = r9.Q
            int r1 = org.repackage.com.vivo.identifier.IdentifierIdClient.A
            r2 = 0
            if (r0 >= r1) goto L8
            return r2
        L8:
            if (r10 == 0) goto L47
            int r0 = r10.size()
            if (r0 != 0) goto L11
            goto L47
        L11:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Exception -> L47
            r0.<init>()     // Catch: java.lang.Exception -> L47
            r1 = 0
            r3 = 0
        L18:
            int r4 = r10.size()     // Catch: java.lang.Exception -> L47
            if (r3 >= r4) goto L46
            java.lang.Object r4 = r10.get(r3)     // Catch: java.lang.Exception -> L47
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Exception -> L47
            java.lang.String r5 = ":"
            java.lang.String[] r4 = r4.split(r5)     // Catch: java.lang.Exception -> L47
            int r5 = r4.length     // Catch: java.lang.Exception -> L47
            r6 = 2
            if (r5 != r6) goto L43
            r5 = r4[r1]     // Catch: java.lang.Exception -> L47
            r6 = 1
            r4 = r4[r6]     // Catch: java.lang.Exception -> L47
            org.repackage.com.vivo.identifier.DataBaseOperation r6 = org.repackage.com.vivo.identifier.IdentifierIdClient.P     // Catch: java.lang.Exception -> L47
            java.lang.String r7 = "vivo"
            r8 = 6
            boolean r4 = r6.a(r8, r7, r5, r4)     // Catch: java.lang.Exception -> L47
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch: java.lang.Exception -> L47
            r0.add(r4)     // Catch: java.lang.Exception -> L47
        L43:
            int r3 = r3 + 1
            goto L18
        L46:
            return r0
        L47:
            return r2
    }

    java.lang.String c() {
            r3 = this;
            java.lang.String r0 = org.repackage.com.vivo.identifier.IdentifierIdClient.H
            r1 = 0
            if (r0 == 0) goto Lb
            c(r1, r0)
            java.lang.String r0 = org.repackage.com.vivo.identifier.IdentifierIdClient.H
            return r0
        Lb:
            r0 = 0
            r3.e(r1, r0)
            org.repackage.com.vivo.identifier.IdentifierIdObserver r2 = org.repackage.com.vivo.identifier.IdentifierIdClient.B
            if (r2 != 0) goto L18
            android.content.Context r2 = org.repackage.com.vivo.identifier.IdentifierIdClient.y
            a(r2, r1, r0)
        L18:
            java.lang.String r0 = org.repackage.com.vivo.identifier.IdentifierIdClient.H
            c(r1, r0)
            java.lang.String r0 = org.repackage.com.vivo.identifier.IdentifierIdClient.H
            return r0
    }

    java.lang.String d() {
            r3 = this;
            java.lang.String r0 = org.repackage.com.vivo.identifier.IdentifierIdClient.H
            r1 = 0
            if (r0 == 0) goto Lb
            c(r1, r0)
            java.lang.String r0 = org.repackage.com.vivo.identifier.IdentifierIdClient.H
            return r0
        Lb:
            r0 = 0
            r3.d(r1, r0)
            org.repackage.com.vivo.identifier.IdentifierIdObserver r2 = org.repackage.com.vivo.identifier.IdentifierIdClient.B
            if (r2 != 0) goto L18
            android.content.Context r2 = org.repackage.com.vivo.identifier.IdentifierIdClient.y
            a(r2, r1, r0)
        L18:
            java.lang.String r0 = org.repackage.com.vivo.identifier.IdentifierIdClient.H
            c(r1, r0)
            java.lang.String r0 = org.repackage.com.vivo.identifier.IdentifierIdClient.H
            return r0
    }

    java.lang.String e() {
            r3 = this;
            java.lang.String r0 = org.repackage.com.vivo.identifier.IdentifierIdClient.I
            r1 = 1
            if (r0 == 0) goto Lb
            c(r1, r0)
            java.lang.String r0 = org.repackage.com.vivo.identifier.IdentifierIdClient.I
            return r0
        Lb:
            java.lang.String r0 = "vivo"
            r3.e(r1, r0)
            org.repackage.com.vivo.identifier.IdentifierIdObserver r2 = org.repackage.com.vivo.identifier.IdentifierIdClient.C
            if (r2 != 0) goto L19
            android.content.Context r2 = org.repackage.com.vivo.identifier.IdentifierIdClient.y
            a(r2, r1, r0)
        L19:
            java.lang.String r0 = org.repackage.com.vivo.identifier.IdentifierIdClient.I
            c(r1, r0)
            java.lang.String r0 = org.repackage.com.vivo.identifier.IdentifierIdClient.I
            return r0
    }

    java.lang.String f() {
            r3 = this;
            java.lang.String r0 = org.repackage.com.vivo.identifier.IdentifierIdClient.I
            r1 = 1
            if (r0 == 0) goto Lb
            c(r1, r0)
            java.lang.String r0 = org.repackage.com.vivo.identifier.IdentifierIdClient.I
            return r0
        Lb:
            java.lang.String r0 = "vivo"
            r3.d(r1, r0)
            org.repackage.com.vivo.identifier.IdentifierIdObserver r2 = org.repackage.com.vivo.identifier.IdentifierIdClient.C
            if (r2 != 0) goto L19
            android.content.Context r2 = org.repackage.com.vivo.identifier.IdentifierIdClient.y
            a(r2, r1, r0)
        L19:
            java.lang.String r0 = org.repackage.com.vivo.identifier.IdentifierIdClient.I
            c(r1, r0)
            java.lang.String r0 = org.repackage.com.vivo.identifier.IdentifierIdClient.I
            return r0
    }

    java.lang.String g() {
            r3 = this;
            java.lang.String r0 = org.repackage.com.vivo.identifier.IdentifierIdClient.J
            r1 = 2
            if (r0 == 0) goto Lb
            c(r1, r0)
            java.lang.String r0 = org.repackage.com.vivo.identifier.IdentifierIdClient.J
            return r0
        Lb:
            java.lang.String r0 = "vivo"
            r3.e(r1, r0)
            org.repackage.com.vivo.identifier.IdentifierIdObserver r2 = org.repackage.com.vivo.identifier.IdentifierIdClient.D
            if (r2 != 0) goto L19
            android.content.Context r2 = org.repackage.com.vivo.identifier.IdentifierIdClient.y
            a(r2, r1, r0)
        L19:
            java.lang.String r0 = org.repackage.com.vivo.identifier.IdentifierIdClient.J
            c(r1, r0)
            java.lang.String r0 = org.repackage.com.vivo.identifier.IdentifierIdClient.J
            return r0
    }

    java.lang.String h() {
            r3 = this;
            java.lang.String r0 = org.repackage.com.vivo.identifier.IdentifierIdClient.J
            r1 = 2
            if (r0 == 0) goto Lb
            c(r1, r0)
            java.lang.String r0 = org.repackage.com.vivo.identifier.IdentifierIdClient.J
            return r0
        Lb:
            java.lang.String r0 = "vivo"
            r3.d(r1, r0)
            org.repackage.com.vivo.identifier.IdentifierIdObserver r2 = org.repackage.com.vivo.identifier.IdentifierIdClient.D
            if (r2 != 0) goto L19
            android.content.Context r2 = org.repackage.com.vivo.identifier.IdentifierIdClient.y
            a(r2, r1, r0)
        L19:
            java.lang.String r0 = org.repackage.com.vivo.identifier.IdentifierIdClient.J
            c(r1, r0)
            java.lang.String r0 = org.repackage.com.vivo.identifier.IdentifierIdClient.J
            return r0
    }

    java.lang.String i() {
            r2 = this;
            r0 = 4
            r1 = 0
            r2.e(r0, r1)
            java.lang.String r0 = org.repackage.com.vivo.identifier.IdentifierIdClient.L
            return r0
    }

    java.lang.String j() {
            r2 = this;
            java.lang.String r0 = org.repackage.com.vivo.identifier.IdentifierIdClient.M
            if (r0 == 0) goto L5
            return r0
        L5:
            r0 = 5
            java.lang.String r1 = "vivo"
            r2.e(r0, r1)
            java.lang.String r0 = org.repackage.com.vivo.identifier.IdentifierIdClient.M
            return r0
    }

    java.lang.String k() {
            r2 = this;
            java.lang.String r0 = org.repackage.com.vivo.identifier.IdentifierIdClient.M
            if (r0 == 0) goto L5
            return r0
        L5:
            r0 = 5
            java.lang.String r1 = "vivo"
            r2.d(r0, r1)
            java.lang.String r0 = org.repackage.com.vivo.identifier.IdentifierIdClient.M
            return r0
    }
}

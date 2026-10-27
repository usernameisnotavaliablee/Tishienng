package com.umeng.ccg;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class c {
    public static final int a = 101;
    public static final int b = 102;
    public static final int c = 103;
    public static final int d = 104;
    public static final int e = 105;
    public static final int f = 106;
    public static final int g = 107;
    public static final int h = 0;
    public static final int i = 1;
    public static final int j = 2;
    public static final int k = 201;
    public static final int l = 202;
    public static final int m = 203;
    public static final int n = 301;
    public static final int o = 302;
    public static final int p = 303;

    /* renamed from: q, reason: collision with root package name */
    private static android.os.HandlerThread f32q = null;
    private static android.os.Handler r = null;
    private static java.util.HashMap<java.lang.Integer, com.umeng.ccg.c.a> s = null;
    private static final int t = 256;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface a {
        void a(java.lang.Object r1, int r2);
    }

    static {
            return
    }

    private c() {
            r0 = this;
            r0.<init>()
            return
    }

    private static synchronized void a() {
            java.lang.Class<com.umeng.ccg.c> r0 = com.umeng.ccg.c.class
            monitor-enter(r0)
            android.os.HandlerThread r1 = com.umeng.ccg.c.f32q     // Catch: java.lang.Throwable -> L24
            if (r1 != 0) goto L24
            android.os.HandlerThread r1 = new android.os.HandlerThread     // Catch: java.lang.Throwable -> L24
            java.lang.String r2 = "ccg_dispatch"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L24
            com.umeng.ccg.c.f32q = r1     // Catch: java.lang.Throwable -> L24
            r1.start()     // Catch: java.lang.Throwable -> L24
            android.os.Handler r1 = com.umeng.ccg.c.r     // Catch: java.lang.Throwable -> L24
            if (r1 != 0) goto L24
            com.umeng.ccg.c$1 r1 = new com.umeng.ccg.c$1     // Catch: java.lang.Throwable -> L24
            android.os.HandlerThread r2 = com.umeng.ccg.c.f32q     // Catch: java.lang.Throwable -> L24
            android.os.Looper r2 = r2.getLooper()     // Catch: java.lang.Throwable -> L24
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L24
            com.umeng.ccg.c.r = r1     // Catch: java.lang.Throwable -> L24
        L24:
            monitor-exit(r0)
            return
    }

    public static void a(android.content.Context r1, int r2, int r3, com.umeng.ccg.c.a r4, java.lang.Object r5, long r6) {
            if (r1 == 0) goto L41
            if (r4 != 0) goto L5
            goto L41
        L5:
            java.util.HashMap<java.lang.Integer, com.umeng.ccg.c$a> r1 = com.umeng.ccg.c.s
            if (r1 != 0) goto L10
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            com.umeng.ccg.c.s = r1
        L10:
            int r1 = r3 / 100
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.util.HashMap<java.lang.Integer, com.umeng.ccg.c$a> r0 = com.umeng.ccg.c.s
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto L23
            java.util.HashMap<java.lang.Integer, com.umeng.ccg.c$a> r0 = com.umeng.ccg.c.s
            r0.put(r1, r4)
        L23:
            android.os.HandlerThread r1 = com.umeng.ccg.c.f32q
            if (r1 == 0) goto L2b
            android.os.Handler r1 = com.umeng.ccg.c.r
            if (r1 != 0) goto L2e
        L2b:
            a()
        L2e:
            android.os.Handler r1 = com.umeng.ccg.c.r     // Catch: java.lang.Throwable -> L41
            if (r1 == 0) goto L41
            android.os.Message r1 = r1.obtainMessage()     // Catch: java.lang.Throwable -> L41
            r1.what = r2     // Catch: java.lang.Throwable -> L41
            r1.arg1 = r3     // Catch: java.lang.Throwable -> L41
            r1.obj = r5     // Catch: java.lang.Throwable -> L41
            android.os.Handler r2 = com.umeng.ccg.c.r     // Catch: java.lang.Throwable -> L41
            r2.sendMessageDelayed(r1, r6)     // Catch: java.lang.Throwable -> L41
        L41:
            return
    }

    public static void a(android.content.Context r7, int r8, com.umeng.ccg.c.a r9, java.lang.Object r10) {
            r1 = 256(0x100, float:3.59E-43)
            r5 = 0
            r0 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            a(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void a(android.content.Context r7, int r8, com.umeng.ccg.c.a r9, java.lang.Object r10, long r11) {
            r1 = 256(0x100, float:3.59E-43)
            r0 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            a(r0, r1, r2, r3, r4, r5)
            return
    }

    static /* synthetic */ void a(android.os.Message r0) {
            b(r0)
            return
    }

    private static void b(android.os.Message r3) {
            int r0 = r3.arg1
            java.lang.Object r3 = r3.obj
            int r1 = r0 / 100
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.util.HashMap<java.lang.Integer, com.umeng.ccg.c$a> r2 = com.umeng.ccg.c.s
            if (r2 != 0) goto Lf
            goto L24
        Lf:
            boolean r2 = r2.containsKey(r1)
            if (r2 == 0) goto L1e
            java.util.HashMap<java.lang.Integer, com.umeng.ccg.c$a> r2 = com.umeng.ccg.c.s
            java.lang.Object r1 = r2.get(r1)
            com.umeng.ccg.c$a r1 = (com.umeng.ccg.c.a) r1
            goto L1f
        L1e:
            r1 = 0
        L1f:
            if (r1 == 0) goto L24
            r1.a(r3, r0)
        L24:
            return
    }
}

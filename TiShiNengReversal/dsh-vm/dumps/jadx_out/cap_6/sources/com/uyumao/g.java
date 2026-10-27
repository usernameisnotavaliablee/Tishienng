package com.uyumao;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class g {
    public static android.os.HandlerThread a;
    public static android.os.Handler b;
    public static java.util.HashMap<java.lang.Integer, com.uyumao.g.a> c;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface a {
        void a(java.lang.Object r1, int r2);
    }

    public g() {
            r1 = this;
            r1.<init>()
            return
    }

    public static void a(android.content.Context r1, int r2, int r3, com.uyumao.g.a r4, java.lang.Object r5, long r6) {
            if (r1 == 0) goto L63
            if (r4 != 0) goto L5
            goto L63
        L5:
            java.util.HashMap<java.lang.Integer, com.uyumao.g$a> r1 = com.uyumao.g.c
            if (r1 != 0) goto L10
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            com.uyumao.g.c = r1
        L10:
            int r1 = r3 / 100
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.util.HashMap<java.lang.Integer, com.uyumao.g$a> r0 = com.uyumao.g.c
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto L23
            java.util.HashMap<java.lang.Integer, com.uyumao.g$a> r0 = com.uyumao.g.c
            r0.put(r1, r4)
        L23:
            android.os.HandlerThread r1 = com.uyumao.g.a
            if (r1 == 0) goto L2b
            android.os.Handler r1 = com.uyumao.g.b
            if (r1 != 0) goto L50
        L2b:
            java.lang.Class<com.uyumao.g> r1 = com.uyumao.g.class
            monitor-enter(r1)
            android.os.HandlerThread r4 = com.uyumao.g.a     // Catch: java.lang.Throwable -> L4f
            if (r4 != 0) goto L4f
            android.os.HandlerThread r4 = new android.os.HandlerThread     // Catch: java.lang.Throwable -> L4f
            java.lang.String r0 = "yumao_ccg"
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L4f
            com.uyumao.g.a = r4     // Catch: java.lang.Throwable -> L4f
            r4.start()     // Catch: java.lang.Throwable -> L4f
            android.os.Handler r4 = com.uyumao.g.b     // Catch: java.lang.Throwable -> L4f
            if (r4 != 0) goto L4f
            com.uyumao.f r4 = new com.uyumao.f     // Catch: java.lang.Throwable -> L4f
            android.os.HandlerThread r0 = com.uyumao.g.a     // Catch: java.lang.Throwable -> L4f
            android.os.Looper r0 = r0.getLooper()     // Catch: java.lang.Throwable -> L4f
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L4f
            com.uyumao.g.b = r4     // Catch: java.lang.Throwable -> L4f
        L4f:
            monitor-exit(r1)
        L50:
            android.os.Handler r1 = com.uyumao.g.b     // Catch: java.lang.Throwable -> L63
            if (r1 == 0) goto L63
            android.os.Message r1 = r1.obtainMessage()     // Catch: java.lang.Throwable -> L63
            r1.what = r2     // Catch: java.lang.Throwable -> L63
            r1.arg1 = r3     // Catch: java.lang.Throwable -> L63
            r1.obj = r5     // Catch: java.lang.Throwable -> L63
            android.os.Handler r2 = com.uyumao.g.b     // Catch: java.lang.Throwable -> L63
            r2.sendMessageDelayed(r1, r6)     // Catch: java.lang.Throwable -> L63
        L63:
            return
    }

    public static void a(android.content.Context r7, int r8, com.uyumao.g.a r9, java.lang.Object r10) {
            r1 = 256(0x100, float:3.59E-43)
            r5 = 0
            r0 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            a(r0, r1, r2, r3, r4, r5)
            return
    }
}

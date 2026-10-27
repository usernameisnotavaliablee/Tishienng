package com.bytedance.adsdk.lottie;

@com.bytedance.component.sdk.annotation.RestrictTo({com.bytedance.component.sdk.annotation.RestrictTo.Scope.LIBRARY})
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class up {
    private static int ae = 0;
    private static boolean cw = true;
    private static com.bytedance.adsdk.lottie.cw.m g = null;
    public static boolean j = false;

    /* renamed from: m, reason: collision with root package name */
    private static long[] f1897m = null;
    private static com.bytedance.adsdk.lottie.cw.up oq = null;
    private static volatile com.bytedance.adsdk.lottie.cw.tl qv = null;

    /* renamed from: r, reason: collision with root package name */
    private static boolean f1898r = true;
    private static int tl;
    private static java.lang.String[] up;
    private static volatile com.bytedance.adsdk.lottie.cw.ae vl;
    private static boolean xt;


    static {
            return
    }

    public up() {
            r1 = this;
            r1.<init>()
            return
    }

    public static com.bytedance.adsdk.lottie.cw.tl j(android.content.Context r3) {
            com.bytedance.adsdk.lottie.cw.tl r0 = com.bytedance.adsdk.lottie.up.qv
            if (r0 != 0) goto L27
            java.lang.Class<com.bytedance.adsdk.lottie.cw.tl> r1 = com.bytedance.adsdk.lottie.cw.tl.class
            monitor-enter(r1)
            com.bytedance.adsdk.lottie.cw.tl r0 = com.bytedance.adsdk.lottie.up.qv     // Catch: java.lang.Throwable -> L21
            if (r0 != 0) goto L23
            com.bytedance.adsdk.lottie.cw.tl r0 = new com.bytedance.adsdk.lottie.cw.tl     // Catch: java.lang.Throwable -> L21
            com.bytedance.adsdk.lottie.cw.ae r3 = xt(r3)     // Catch: java.lang.Throwable -> L21
            com.bytedance.adsdk.lottie.cw.m r2 = com.bytedance.adsdk.lottie.up.g     // Catch: java.lang.Throwable -> L21
            if (r2 == 0) goto L16
            goto L1b
        L16:
            com.bytedance.adsdk.lottie.cw.xt r2 = new com.bytedance.adsdk.lottie.cw.xt     // Catch: java.lang.Throwable -> L21
            r2.<init>()     // Catch: java.lang.Throwable -> L21
        L1b:
            r0.<init>(r3, r2)     // Catch: java.lang.Throwable -> L21
            com.bytedance.adsdk.lottie.up.qv = r0     // Catch: java.lang.Throwable -> L21
            goto L23
        L21:
            r3 = move-exception
            goto L25
        L23:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L21
            return r0
        L25:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L21
            throw r3
        L27:
            return r0
    }

    public static void j(java.lang.String r4) {
            boolean r0 = com.bytedance.adsdk.lottie.up.xt
            if (r0 != 0) goto L5
            return
        L5:
            int r0 = com.bytedance.adsdk.lottie.up.ae
            r1 = 20
            if (r0 != r1) goto L12
            int r4 = com.bytedance.adsdk.lottie.up.tl
            int r4 = r4 + 1
            com.bytedance.adsdk.lottie.up.tl = r4
            return
        L12:
            java.lang.String[] r1 = com.bytedance.adsdk.lottie.up.up
            r1[r0] = r4
            long[] r1 = com.bytedance.adsdk.lottie.up.f1897m
            long r2 = java.lang.System.nanoTime()
            r1[r0] = r2
            android.os.Trace.beginSection(r4)
            int r4 = com.bytedance.adsdk.lottie.up.ae
            int r4 = r4 + 1
            com.bytedance.adsdk.lottie.up.ae = r4
            return
    }

    public static boolean j() {
            boolean r0 = com.bytedance.adsdk.lottie.up.f1898r
            return r0
    }

    public static float xt(java.lang.String r4) {
            int r0 = com.bytedance.adsdk.lottie.up.tl
            r1 = 0
            if (r0 <= 0) goto La
            int r0 = r0 + (-1)
            com.bytedance.adsdk.lottie.up.tl = r0
            return r1
        La:
            boolean r0 = com.bytedance.adsdk.lottie.up.xt
            if (r0 != 0) goto Lf
            return r1
        Lf:
            int r0 = com.bytedance.adsdk.lottie.up.ae
            int r0 = r0 + (-1)
            com.bytedance.adsdk.lottie.up.ae = r0
            r1 = -1
            if (r0 == r1) goto L5d
            java.lang.String[] r1 = com.bytedance.adsdk.lottie.up.up
            r0 = r1[r0]
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L36
            android.os.Trace.endSection()
            long r0 = java.lang.System.nanoTime()
            long[] r4 = com.bytedance.adsdk.lottie.up.f1897m
            int r2 = com.bytedance.adsdk.lottie.up.ae
            r2 = r4[r2]
            long r0 = r0 - r2
            float r4 = (float) r0
            r0 = 1232348160(0x49742400, float:1000000.0)
            float r4 = r4 / r0
            return r4
        L36:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unbalanced trace call "
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r4 = ". Expected "
            r1.append(r4)
            java.lang.String[] r4 = com.bytedance.adsdk.lottie.up.up
            int r2 = com.bytedance.adsdk.lottie.up.ae
            r4 = r4[r2]
            r1.append(r4)
            java.lang.String r4 = "."
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L5d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "Can't end trace section. There are none."
            r4.<init>(r0)
            throw r4
    }

    public static com.bytedance.adsdk.lottie.cw.ae xt(android.content.Context r3) {
            boolean r0 = com.bytedance.adsdk.lottie.up.cw
            if (r0 != 0) goto L6
            r3 = 0
            return r3
        L6:
            android.content.Context r3 = r3.getApplicationContext()
            android.content.Context r3 = com.stub.StubApp.getOrigApplicationContext(r3)
            com.bytedance.adsdk.lottie.cw.ae r0 = com.bytedance.adsdk.lottie.up.vl
            if (r0 != 0) goto L31
            java.lang.Class<com.bytedance.adsdk.lottie.cw.ae> r1 = com.bytedance.adsdk.lottie.cw.ae.class
            monitor-enter(r1)
            com.bytedance.adsdk.lottie.cw.ae r0 = com.bytedance.adsdk.lottie.up.vl     // Catch: java.lang.Throwable -> L2b
            if (r0 != 0) goto L2d
            com.bytedance.adsdk.lottie.cw.ae r0 = new com.bytedance.adsdk.lottie.cw.ae     // Catch: java.lang.Throwable -> L2b
            com.bytedance.adsdk.lottie.cw.up r2 = com.bytedance.adsdk.lottie.up.oq     // Catch: java.lang.Throwable -> L2b
            if (r2 == 0) goto L20
            goto L25
        L20:
            com.bytedance.adsdk.lottie.up$1 r2 = new com.bytedance.adsdk.lottie.up$1     // Catch: java.lang.Throwable -> L2b
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L2b
        L25:
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L2b
            com.bytedance.adsdk.lottie.up.vl = r0     // Catch: java.lang.Throwable -> L2b
            goto L2d
        L2b:
            r3 = move-exception
            goto L2f
        L2d:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2b
            return r0
        L2f:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2b
            throw r3
        L31:
            return r0
    }
}

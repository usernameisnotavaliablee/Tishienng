package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class s2 {

    /* renamed from: d, reason: collision with root package name */
    private static boolean f3944d;

    /* renamed from: e, reason: collision with root package name */
    private static boolean f3945e;

    /* renamed from: f, reason: collision with root package name */
    private static boolean f3946f;
    private boolean a;

    /* renamed from: b, reason: collision with root package name */
    private int f3947b;

    /* renamed from: c, reason: collision with root package name */
    private int f3948c;

    static {
            return
    }

    public s2() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.a = r0
            r1.f3947b = r0
            r0 = 20
            r1.f3948c = r0
            return
    }

    public static void a(boolean r0) {
            com.amap.api.col.p0003l.s2.f3944d = r0
            return
    }

    public static boolean b() {
            boolean r0 = com.amap.api.col.p0003l.s2.f3944d
            return r0
    }

    public static void d(boolean r0) {
            com.amap.api.col.p0003l.s2.f3945e = r0
            return
    }

    public static boolean e() {
            boolean r0 = com.amap.api.col.p0003l.s2.f3945e
            return r0
    }

    public static void f(boolean r0) {
            com.amap.api.col.p0003l.s2.f3946f = r0
            return
    }

    public static boolean g() {
            boolean r0 = com.amap.api.col.p0003l.s2.f3946f
            return r0
    }

    public static void k() {
            java.lang.Exception r0 = new java.lang.Exception
            java.lang.String r1 = "BlackScreen"
            r0.<init>(r1)
            java.lang.String r1 = "PureScreenCheckTool"
            java.lang.String r2 = "uploadInfo"
            com.amap.api.col.p0003l.w5.p(r0, r1, r2)
            return
    }

    public final boolean c(android.graphics.Bitmap r12) {
            r11 = this;
            r0 = 1
            if (r12 == 0) goto L4a
            int r1 = r12.getWidth()     // Catch: java.lang.Throwable -> L3e
            int r2 = r12.getHeight()     // Catch: java.lang.Throwable -> L3e
            float r3 = (float) r1     // Catch: java.lang.Throwable -> L3e
            r4 = 1082130432(0x40800000, float:4.0)
            float r3 = r3 / r4
            int r3 = (int) r3     // Catch: java.lang.Throwable -> L3e
            r5 = -1
            r6 = -1
        L12:
            float r7 = (float) r3     // Catch: java.lang.Throwable -> L3e
            int r8 = r1 * 3
            float r8 = (float) r8     // Catch: java.lang.Throwable -> L3e
            float r8 = r8 / r4
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 >= 0) goto L4a
            float r7 = (float) r2     // Catch: java.lang.Throwable -> L3e
            float r7 = r7 / r4
            int r7 = (int) r7     // Catch: java.lang.Throwable -> L3e
        L1e:
            float r8 = (float) r7     // Catch: java.lang.Throwable -> L3e
            int r9 = r2 * 3
            float r9 = (float) r9     // Catch: java.lang.Throwable -> L3e
            float r9 = r9 / r4
            int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r8 >= 0) goto L40
            int r8 = r12.getPixel(r3, r7)     // Catch: java.lang.Throwable -> L3e
            if (r6 != r5) goto L2e
            r6 = r8
        L2e:
            r9 = 0
            if (r8 == r6) goto L34
            r11.a = r0
            return r9
        L34:
            r10 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            if (r8 == r10) goto L3b
            r11.a = r0
            return r9
        L3b:
            int r7 = r7 + 1
            goto L1e
        L3e:
            r12 = move-exception
            goto L43
        L40:
            int r3 = r3 + 1
            goto L12
        L43:
            java.lang.String r1 = "AMapdelegate"
            java.lang.String r2 = "checkBlackScreen"
            com.amap.api.col.p0003l.w5.p(r12, r1, r2)     // Catch: java.lang.Throwable -> L4d
        L4a:
            r11.a = r0
            goto L51
        L4d:
            r12 = move-exception
            r11.a = r0
            throw r12
        L51:
            return r0
    }

    public final boolean h() {
            r1 = this;
            boolean r0 = r1.a
            return r0
    }

    public final void i() {
            r1 = this;
            int r0 = r1.f3947b
            int r0 = r0 + 1
            r1.f3947b = r0
            return
    }

    public final boolean j() {
            r2 = this;
            int r0 = r2.f3947b
            int r1 = r2.f3948c
            if (r0 < r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }
}

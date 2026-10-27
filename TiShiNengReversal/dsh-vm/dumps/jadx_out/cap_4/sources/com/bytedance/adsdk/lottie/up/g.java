package com.bytedance.adsdk.lottie.up;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class g {
    private static final java.lang.ThreadLocal<android.graphics.Path> cw = null;
    private static final java.lang.ThreadLocal<android.graphics.PathMeasure> j = null;

    /* renamed from: r, reason: collision with root package name */
    private static final java.lang.ThreadLocal<float[]> f1899r = null;
    private static final float up = 0.0f;
    private static final java.lang.ThreadLocal<android.graphics.Path> xt = null;





    static {
            com.bytedance.adsdk.lottie.up.g$1 r0 = new com.bytedance.adsdk.lottie.up.g$1
            r0.<init>()
            com.bytedance.adsdk.lottie.up.g.j = r0
            com.bytedance.adsdk.lottie.up.g$2 r0 = new com.bytedance.adsdk.lottie.up.g$2
            r0.<init>()
            com.bytedance.adsdk.lottie.up.g.xt = r0
            com.bytedance.adsdk.lottie.up.g$3 r0 = new com.bytedance.adsdk.lottie.up.g$3
            r0.<init>()
            com.bytedance.adsdk.lottie.up.g.cw = r0
            com.bytedance.adsdk.lottie.up.g$4 r0 = new com.bytedance.adsdk.lottie.up.g$4
            r0.<init>()
            com.bytedance.adsdk.lottie.up.g.f1899r = r0
            r0 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r2 = java.lang.Math.sqrt(r0)
            double r2 = r2 / r0
            float r0 = (float) r2
            com.bytedance.adsdk.lottie.up.g.up = r0
            return
    }

    public g() {
            r1 = this;
            r1.<init>()
            return
    }

    public static float j() {
            android.content.res.Resources r0 = android.content.res.Resources.getSystem()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            return r0
    }

    public static float j(android.content.Context r2) {
            android.content.ContentResolver r2 = r2.getContentResolver()
            java.lang.String r0 = "animator_duration_scale"
            r1 = 1065353216(0x3f800000, float:1.0)
            float r2 = android.provider.Settings.Global.getFloat(r2, r0, r1)
            return r2
    }

    public static float j(android.graphics.Matrix r6) {
            java.lang.ThreadLocal<float[]> r0 = com.bytedance.adsdk.lottie.up.g.f1899r
            java.lang.Object r0 = r0.get()
            float[] r0 = (float[]) r0
            r1 = 0
            r2 = 0
            r0[r1] = r2
            r3 = 1
            r0[r3] = r2
            float r2 = com.bytedance.adsdk.lottie.up.g.up
            r4 = 2
            r0[r4] = r2
            r5 = 3
            r0[r5] = r2
            r6.mapPoints(r0)
            r6 = r0[r4]
            r1 = r0[r1]
            float r6 = r6 - r1
            r1 = r0[r5]
            r0 = r0[r3]
            float r1 = r1 - r0
            double r2 = (double) r6
            double r0 = (double) r1
            double r0 = java.lang.Math.hypot(r2, r0)
            float r6 = (float) r0
            return r6
    }

    public static float j(java.lang.String r2, java.lang.String r3, int r4) {
            if (r3 == 0) goto L32
            java.lang.String r0 = "%"
            boolean r0 = r3.contains(r0)     // Catch: java.lang.Throwable -> L21
            if (r0 == 0) goto L23
            int r0 = r3.length()     // Catch: java.lang.Throwable -> L21
            int r0 = r0 + (-1)
            r1 = 0
            java.lang.String r3 = r3.substring(r1, r0)     // Catch: java.lang.Throwable -> L21
            int r2 = java.lang.Integer.parseInt(r3)     // Catch: java.lang.Throwable -> L21
            float r2 = (float) r2     // Catch: java.lang.Throwable -> L21
            r3 = 1120403456(0x42c80000, float:100.0)
            float r2 = r2 / r3
            float r3 = (float) r4     // Catch: java.lang.Throwable -> L21
            float r2 = r2 * r3
            return r2
        L21:
            r3 = move-exception
            goto L2f
        L23:
            int r3 = java.lang.Integer.parseInt(r3)     // Catch: java.lang.Throwable -> L21
            float r3 = (float) r3     // Catch: java.lang.Throwable -> L21
            float r2 = j()     // Catch: java.lang.Throwable -> L21
            float r3 = r3 * r2
            return r3
        L2f:
            com.bytedance.sdk.component.utils.vl.j(r3)
        L32:
            java.lang.String r3 = "x"
            boolean r3 = android.text.TextUtils.equals(r3, r2)
            if (r3 != 0) goto L45
            java.lang.String r3 = "y"
            boolean r2 = android.text.TextUtils.equals(r3, r2)
            if (r2 == 0) goto L43
            goto L45
        L43:
            float r2 = (float) r4
            return r2
        L45:
            r2 = 0
            return r2
    }

    public static int j(float r2, float r3, float r4, float r5) {
            r0 = 0
            int r1 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r1 == 0) goto Lc
            r1 = 1141096448(0x4403c000, float:527.0)
            float r2 = r2 * r1
            int r2 = (int) r2
            goto Le
        Lc:
            r2 = 17
        Le:
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 == 0) goto L18
            int r2 = r2 * 31
            float r2 = (float) r2
            float r2 = r2 * r3
            int r2 = (int) r2
        L18:
            int r3 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r3 == 0) goto L22
            int r2 = r2 * 31
            float r2 = (float) r2
            float r2 = r2 * r4
            int r2 = (int) r2
        L22:
            int r3 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r3 == 0) goto L2c
            int r2 = r2 * 31
            float r2 = (float) r2
            float r2 = r2 * r5
            int r2 = (int) r2
        L2c:
            return r2
    }

    public static android.graphics.Bitmap j(android.graphics.Bitmap r1, int r2, int r3) {
            int r0 = r1.getWidth()
            if (r0 != r2) goto Ld
            int r0 = r1.getHeight()
            if (r0 != r3) goto Ld
            return r1
        Ld:
            r0 = 1
            android.graphics.Bitmap r2 = android.graphics.Bitmap.createScaledBitmap(r1, r2, r3, r0)
            r1.recycle()
            return r2
    }

    public static android.graphics.Path j(android.graphics.PointF r7, android.graphics.PointF r8, android.graphics.PointF r9, android.graphics.PointF r10) {
            android.graphics.Path r0 = new android.graphics.Path
            r0.<init>()
            float r1 = r7.x
            float r2 = r7.y
            r0.moveTo(r1, r2)
            if (r9 == 0) goto L3c
            if (r10 == 0) goto L3c
            float r1 = r9.length()
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 != 0) goto L21
            float r1 = r10.length()
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 == 0) goto L3c
        L21:
            float r1 = r7.x
            float r2 = r9.x
            float r1 = r1 + r2
            float r7 = r7.y
            float r9 = r9.y
            float r2 = r7 + r9
            float r5 = r8.x
            float r7 = r10.x
            float r3 = r5 + r7
            float r6 = r8.y
            float r7 = r10.y
            float r4 = r6 + r7
            r0.cubicTo(r1, r2, r3, r4, r5, r6)
            return r0
        L3c:
            float r7 = r8.x
            float r8 = r8.y
            r0.lineTo(r7, r8)
            return r0
    }

    public static void j(android.graphics.Canvas r1, android.graphics.RectF r2, android.graphics.Paint r3) {
            r0 = 31
            j(r1, r2, r3, r0)
            return
    }

    public static void j(android.graphics.Canvas r3, android.graphics.RectF r4, android.graphics.Paint r5, int r6) {
            java.lang.String r0 = "Utils#saveLayer"
            com.bytedance.adsdk.lottie.up.j(r0)
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 23
            if (r1 >= r2) goto Lf
            r3.saveLayer(r4, r5, r6)
            goto L12
        Lf:
            r3.saveLayer(r4, r5)
        L12:
            com.bytedance.adsdk.lottie.up.xt(r0)
            return
    }

    public static void j(android.graphics.Path r11, float r12, float r13, float r14) {
            java.lang.String r0 = "applyTrimPathIfNeeded"
            com.bytedance.adsdk.lottie.up.j(r0)
            java.lang.ThreadLocal<android.graphics.PathMeasure> r1 = com.bytedance.adsdk.lottie.up.g.j
            java.lang.Object r1 = r1.get()
            android.graphics.PathMeasure r1 = (android.graphics.PathMeasure) r1
            java.lang.ThreadLocal<android.graphics.Path> r2 = com.bytedance.adsdk.lottie.up.g.xt
            java.lang.Object r2 = r2.get()
            android.graphics.Path r2 = (android.graphics.Path) r2
            java.lang.ThreadLocal<android.graphics.Path> r3 = com.bytedance.adsdk.lottie.up.g.cw
            java.lang.Object r3 = r3.get()
            android.graphics.Path r3 = (android.graphics.Path) r3
            r4 = 0
            r1.setPath(r11, r4)
            float r4 = r1.getLength()
            r5 = 0
            r6 = 1065353216(0x3f800000, float:1.0)
            int r7 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r7 != 0) goto L34
            int r7 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r7 != 0) goto L34
            com.bytedance.adsdk.lottie.up.xt(r0)
            return
        L34:
            int r7 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r7 < 0) goto Lb7
            float r7 = r13 - r12
            float r7 = r7 - r6
            float r6 = java.lang.Math.abs(r7)
            double r6 = (double) r6
            r8 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 >= 0) goto L4a
            goto Lb7
        L4a:
            float r12 = r12 * r4
            float r13 = r13 * r4
            float r6 = java.lang.Math.min(r12, r13)
            float r12 = java.lang.Math.max(r12, r13)
            float r14 = r14 * r4
            float r6 = r6 + r14
            float r12 = r12 + r14
            int r13 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r13 < 0) goto L6c
            int r13 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r13 < 0) goto L6c
            int r13 = com.bytedance.adsdk.lottie.up.tl.j(r6, r4)
            float r6 = (float) r13
            int r12 = com.bytedance.adsdk.lottie.up.tl.j(r12, r4)
            float r12 = (float) r12
        L6c:
            int r13 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r13 >= 0) goto L75
            int r13 = com.bytedance.adsdk.lottie.up.tl.j(r6, r4)
            float r6 = (float) r13
        L75:
            int r13 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r13 >= 0) goto L7e
            int r12 = com.bytedance.adsdk.lottie.up.tl.j(r12, r4)
            float r12 = (float) r12
        L7e:
            int r13 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r13 != 0) goto L89
            r11.reset()
            com.bytedance.adsdk.lottie.up.xt(r0)
            return
        L89:
            if (r13 < 0) goto L8c
            float r6 = r6 - r4
        L8c:
            r2.reset()
            r13 = 1
            r1.getSegment(r6, r12, r2, r13)
            int r14 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r14 <= 0) goto La2
            r3.reset()
            float r12 = r12 % r4
            r1.getSegment(r5, r12, r3, r13)
            r2.addPath(r3)
            goto Lb0
        La2:
            int r12 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r12 >= 0) goto Lb0
            r3.reset()
            float r6 = r6 + r4
            r1.getSegment(r6, r4, r3, r13)
            r2.addPath(r3)
        Lb0:
            r11.set(r2)
            com.bytedance.adsdk.lottie.up.xt(r0)
            return
        Lb7:
            com.bytedance.adsdk.lottie.up.xt(r0)
            return
    }

    public static void j(android.graphics.Path r3, com.bytedance.adsdk.lottie.j.j.tj r4) {
            if (r4 == 0) goto L31
            boolean r0 = r4.up()
            if (r0 == 0) goto L9
            goto L31
        L9:
            com.bytedance.adsdk.lottie.j.xt.j r0 = r4.xt()
            com.bytedance.adsdk.lottie.j.xt.r r0 = (com.bytedance.adsdk.lottie.j.xt.r) r0
            float r0 = r0.g()
            com.bytedance.adsdk.lottie.j.xt.j r1 = r4.cw()
            com.bytedance.adsdk.lottie.j.xt.r r1 = (com.bytedance.adsdk.lottie.j.xt.r) r1
            float r1 = r1.g()
            com.bytedance.adsdk.lottie.j.xt.j r4 = r4.r()
            com.bytedance.adsdk.lottie.j.xt.r r4 = (com.bytedance.adsdk.lottie.j.xt.r) r4
            float r4 = r4.g()
            r2 = 1120403456(0x42c80000, float:100.0)
            float r0 = r0 / r2
            float r1 = r1 / r2
            r2 = 1135869952(0x43b40000, float:360.0)
            float r4 = r4 / r2
            j(r3, r0, r1, r4)
        L31:
            return
    }

    public static void j(java.io.Closeable r0) {
            if (r0 == 0) goto L8
            r0.close()     // Catch: java.lang.Exception -> L5 java.lang.RuntimeException -> L6
        L5:
            return
        L6:
            r0 = move-exception
            throw r0
        L8:
            return
    }

    public static boolean j(int r2, int r3, int r4, int r5, int r6, int r7) {
            r0 = 0
            if (r2 >= r5) goto L4
            return r0
        L4:
            r1 = 1
            if (r2 <= r5) goto L8
            return r1
        L8:
            if (r3 >= r6) goto Lb
            return r0
        Lb:
            if (r3 <= r6) goto Le
            return r1
        Le:
            if (r4 < r7) goto L11
            return r1
        L11:
            return r0
    }

    public static boolean j(java.lang.Throwable r1) {
            boolean r0 = r1 instanceof java.net.SocketException
            if (r0 != 0) goto L1f
            boolean r0 = r1 instanceof java.nio.channels.ClosedChannelException
            if (r0 != 0) goto L1f
            boolean r0 = r1 instanceof java.io.InterruptedIOException
            if (r0 != 0) goto L1f
            boolean r0 = r1 instanceof java.net.ProtocolException
            if (r0 != 0) goto L1f
            boolean r0 = r1 instanceof javax.net.ssl.SSLException
            if (r0 != 0) goto L1f
            boolean r0 = r1 instanceof java.net.UnknownHostException
            if (r0 != 0) goto L1f
            boolean r1 = r1 instanceof java.net.UnknownServiceException
            if (r1 == 0) goto L1d
            goto L1f
        L1d:
            r1 = 0
            return r1
        L1f:
            r1 = 1
            return r1
    }

    public static boolean xt(android.graphics.Matrix r6) {
            java.lang.ThreadLocal<float[]> r0 = com.bytedance.adsdk.lottie.up.g.f1899r
            java.lang.Object r0 = r0.get()
            float[] r0 = (float[]) r0
            r1 = 0
            r2 = 0
            r0[r1] = r2
            r3 = 1
            r0[r3] = r2
            r2 = 1192366779(0x471212bb, float:37394.73)
            r4 = 2
            r0[r4] = r2
            r2 = 1192924988(0x471a973c, float:39575.234)
            r5 = 3
            r0[r5] = r2
            r6.mapPoints(r0)
            r6 = r0[r1]
            r2 = r0[r4]
            int r6 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r6 == 0) goto L30
            r6 = r0[r3]
            r0 = r0[r5]
            int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r6 != 0) goto L2f
            goto L30
        L2f:
            return r1
        L30:
            return r3
    }
}

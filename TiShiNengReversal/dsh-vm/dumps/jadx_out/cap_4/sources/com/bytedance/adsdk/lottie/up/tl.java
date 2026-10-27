package com.bytedance.adsdk.lottie.up;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class tl {
    private static final android.graphics.PointF j = null;

    static {
            android.graphics.PointF r0 = new android.graphics.PointF
            r0.<init>()
            com.bytedance.adsdk.lottie.up.tl.j = r0
            return
    }

    public tl() {
            r1 = this;
            r1.<init>()
            return
    }

    public static boolean cw(float r0, float r1, float r2) {
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 < 0) goto La
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 > 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    public static float j(float r0, float r1, @com.bytedance.component.sdk.annotation.FloatRange(from = 0.0d, to = 1.0d) float r2) {
            float r1 = r1 - r0
            float r2 = r2 * r1
            float r0 = r0 + r2
            return r0
    }

    static int j(float r0, float r1) {
            int r0 = (int) r0
            int r1 = (int) r1
            int r0 = j(r0, r1)
            return r0
    }

    private static int j(int r1, int r2) {
            int r0 = xt(r1, r2)
            int r2 = r2 * r0
            int r1 = r1 - r2
            return r1
    }

    public static int j(int r1, int r2, @com.bytedance.component.sdk.annotation.FloatRange(from = 0.0d, to = 1.0d) float r3) {
            float r0 = (float) r1
            int r2 = r2 - r1
            float r1 = (float) r2
            float r3 = r3 * r1
            float r0 = r0 + r3
            int r1 = (int) r0
            return r1
    }

    public static int j(int r0, int r1, int r2) {
            int r0 = java.lang.Math.min(r2, r0)
            int r0 = java.lang.Math.max(r1, r0)
            return r0
    }

    public static android.graphics.PointF j(android.graphics.PointF r3, android.graphics.PointF r4) {
            android.graphics.PointF r0 = new android.graphics.PointF
            float r1 = r3.x
            float r2 = r4.x
            float r1 = r1 + r2
            float r3 = r3.y
            float r4 = r4.y
            float r3 = r3 + r4
            r0.<init>(r1, r3)
            return r0
    }

    public static void j(com.bytedance.adsdk.lottie.model.xt.ws r12, android.graphics.Path r13) {
            r13.reset()
            android.graphics.PointF r0 = r12.j()
            float r1 = r0.x
            float r2 = r0.y
            r13.moveTo(r1, r2)
            android.graphics.PointF r1 = com.bytedance.adsdk.lottie.up.tl.j
            float r2 = r0.x
            float r0 = r0.y
            r1.set(r2, r0)
            r0 = 0
        L18:
            java.util.List r1 = r12.cw()
            int r1 = r1.size()
            if (r0 >= r1) goto L6a
            java.util.List r1 = r12.cw()
            java.lang.Object r1 = r1.get(r0)
            com.bytedance.adsdk.lottie.model.j r1 = (com.bytedance.adsdk.lottie.model.j) r1
            android.graphics.PointF r2 = r1.j()
            android.graphics.PointF r3 = r1.xt()
            android.graphics.PointF r1 = r1.cw()
            android.graphics.PointF r4 = com.bytedance.adsdk.lottie.up.tl.j
            boolean r5 = r2.equals(r4)
            if (r5 == 0) goto L4f
            boolean r5 = r3.equals(r1)
            if (r5 == 0) goto L4f
            float r2 = r1.x
            float r3 = r1.y
            r13.lineTo(r2, r3)
            r5 = r13
            goto L5f
        L4f:
            float r6 = r2.x
            float r7 = r2.y
            float r8 = r3.x
            float r9 = r3.y
            float r10 = r1.x
            float r11 = r1.y
            r5 = r13
            r5.cubicTo(r6, r7, r8, r9, r10, r11)
        L5f:
            float r13 = r1.x
            float r1 = r1.y
            r4.set(r13, r1)
            int r0 = r0 + 1
            r13 = r5
            goto L18
        L6a:
            r5 = r13
            boolean r12 = r12.xt()
            if (r12 == 0) goto L74
            r5.close()
        L74:
            return
    }

    public static float xt(float r0, float r1, float r2) {
            float r0 = java.lang.Math.min(r2, r0)
            float r0 = java.lang.Math.max(r1, r0)
            return r0
    }

    private static int xt(int r2, int r3) {
            int r0 = r2 / r3
            r1 = r2 ^ r3
            if (r1 < 0) goto L8
            r1 = 1
            goto L9
        L8:
            r1 = 0
        L9:
            int r2 = r2 % r3
            if (r1 != 0) goto L10
            if (r2 == 0) goto L10
            int r0 = r0 + (-1)
        L10:
            return r0
    }
}

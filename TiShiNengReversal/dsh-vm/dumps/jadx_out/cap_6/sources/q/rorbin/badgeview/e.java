package q.rorbin.badgeview;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class e {
    public static final double a = 6.283185307179586d;

    public e() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void a(android.graphics.PointF r4, float r5, java.lang.Double r6, java.util.List<android.graphics.PointF> r7) {
            if (r6 == 0) goto L1e
            double r0 = r6.doubleValue()
            double r0 = java.lang.Math.atan(r0)
            float r6 = (float) r0
            double r0 = (double) r6
            double r2 = java.lang.Math.cos(r0)
            double r5 = (double) r5
            double r2 = r2 * r5
            float r2 = (float) r2
            double r0 = java.lang.Math.sin(r0)
            double r0 = r0 * r5
            float r5 = (float) r0
            r6 = r5
            r5 = r2
            goto L1f
        L1e:
            r6 = 0
        L1f:
            android.graphics.PointF r0 = new android.graphics.PointF
            float r1 = r4.x
            float r1 = r1 + r5
            float r2 = r4.y
            float r2 = r2 + r6
            r0.<init>(r1, r2)
            r7.add(r0)
            android.graphics.PointF r0 = new android.graphics.PointF
            float r1 = r4.x
            float r1 = r1 - r5
            float r4 = r4.y
            float r4 = r4 - r6
            r0.<init>(r1, r4)
            r7.add(r0)
            return
    }

    public static float b(android.graphics.PointF r4, android.graphics.PointF r5) {
            float r0 = r4.x
            float r1 = r5.x
            float r0 = r0 - r1
            double r0 = (double) r0
            r2 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r0 = java.lang.Math.pow(r0, r2)
            float r4 = r4.y
            float r5 = r5.y
            float r4 = r4 - r5
            double r4 = (double) r4
            double r4 = java.lang.Math.pow(r4, r2)
            double r0 = r0 + r4
            double r4 = java.lang.Math.sqrt(r0)
            float r4 = (float) r4
            return r4
    }

    public static int c(android.graphics.PointF r3, android.graphics.PointF r4) {
            float r0 = r3.x
            float r1 = r4.x
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 <= 0) goto L18
            float r3 = r3.y
            float r4 = r4.y
            int r0 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r0 <= 0) goto L12
            r3 = 4
            return r3
        L12:
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 >= 0) goto L2c
            r3 = 1
            return r3
        L18:
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L2c
            float r3 = r3.y
            float r4 = r4.y
            int r0 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r0 <= 0) goto L26
            r3 = 3
            return r3
        L26:
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 >= 0) goto L2c
            r3 = 2
            return r3
        L2c:
            r3 = -1
            return r3
    }

    public static double d(double r5, int r7) {
            r0 = 0
            r2 = 4609753056924675352(0x3ff921fb54442d18, double:1.5707963267948966)
            int r4 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r4 >= 0) goto Lc
            double r5 = r5 + r2
        Lc:
            int r7 = r7 + (-1)
            double r0 = (double) r7
            double r0 = r0 * r2
            double r5 = r5 + r0
            return r5
    }

    public static double e(double r2) {
            r0 = 4618760256179416344(0x401921fb54442d18, double:6.283185307179586)
            double r2 = r2 / r0
            r0 = 4645040803167600640(0x4076800000000000, double:360.0)
            double r2 = r2 * r0
            return r2
    }
}

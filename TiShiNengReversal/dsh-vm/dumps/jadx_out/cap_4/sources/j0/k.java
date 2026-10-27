package j0;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class k {
    private k() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.mlkit.vision.common.PointF3D a(com.google.mlkit.vision.common.PointF3D r3, com.google.mlkit.vision.common.PointF3D r4) {
            float r0 = r3.getX()
            float r1 = r4.getX()
            float r0 = r0 + r1
            float r1 = r3.getY()
            float r2 = r4.getY()
            float r1 = r1 + r2
            float r3 = r3.getZ()
            float r4 = r4.getZ()
            float r3 = r3 + r4
            com.google.mlkit.vision.common.PointF3D r3 = com.google.mlkit.vision.common.PointF3D.from(r0, r1, r3)
            return r3
    }

    public static void b(java.util.List<com.google.mlkit.vision.common.PointF3D> r1, com.google.mlkit.vision.common.PointF3D r2) {
            java.util.ListIterator r1 = r1.listIterator()
        L4:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L18
            java.lang.Object r0 = r1.next()
            com.google.mlkit.vision.common.PointF3D r0 = (com.google.mlkit.vision.common.PointF3D) r0
            com.google.mlkit.vision.common.PointF3D r0 = a(r0, r2)
            r1.set(r0)
            goto L4
        L18:
            return
    }

    public static com.google.mlkit.vision.common.PointF3D c(com.google.mlkit.vision.common.PointF3D r4, com.google.mlkit.vision.common.PointF3D r5) {
            float r0 = r4.getX()
            float r1 = r5.getX()
            float r0 = r0 + r1
            r1 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 * r1
            float r2 = r4.getY()
            float r3 = r5.getY()
            float r2 = r2 + r3
            float r2 = r2 * r1
            float r4 = r4.getZ()
            float r5 = r5.getZ()
            float r4 = r4 + r5
            float r4 = r4 * r1
            com.google.mlkit.vision.common.PointF3D r4 = com.google.mlkit.vision.common.PointF3D.from(r0, r2, r4)
            return r4
    }

    public static float d(com.google.mlkit.vision.common.PointF3D r4) {
            float r0 = r4.getX()
            double r0 = (double) r0
            float r4 = r4.getY()
            double r2 = (double) r4
            double r0 = java.lang.Math.hypot(r0, r2)
            float r4 = (float) r0
            return r4
    }

    public static float e(com.google.mlkit.vision.common.PointF3D r2) {
            float r0 = r2.getX()
            float r0 = java.lang.Math.abs(r0)
            float r1 = r2.getY()
            float r1 = java.lang.Math.abs(r1)
            float r2 = r2.getZ()
            float r2 = java.lang.Math.abs(r2)
            float r2 = java.lang.Math.max(r1, r2)
            float r2 = java.lang.Math.max(r0, r2)
            return r2
    }

    public static com.google.mlkit.vision.common.PointF3D f(com.google.mlkit.vision.common.PointF3D r2, float r3) {
            float r0 = r2.getX()
            float r0 = r0 * r3
            float r1 = r2.getY()
            float r1 = r1 * r3
            float r2 = r2.getZ()
            float r2 = r2 * r3
            com.google.mlkit.vision.common.PointF3D r2 = com.google.mlkit.vision.common.PointF3D.from(r0, r1, r2)
            return r2
    }

    public static com.google.mlkit.vision.common.PointF3D g(com.google.mlkit.vision.common.PointF3D r3, com.google.mlkit.vision.common.PointF3D r4) {
            float r0 = r3.getX()
            float r1 = r4.getX()
            float r0 = r0 * r1
            float r1 = r3.getY()
            float r2 = r4.getY()
            float r1 = r1 * r2
            float r3 = r3.getZ()
            float r4 = r4.getZ()
            float r3 = r3 * r4
            com.google.mlkit.vision.common.PointF3D r3 = com.google.mlkit.vision.common.PointF3D.from(r0, r1, r3)
            return r3
    }

    public static void h(java.util.List<com.google.mlkit.vision.common.PointF3D> r1, float r2) {
            java.util.ListIterator r1 = r1.listIterator()
        L4:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L18
            java.lang.Object r0 = r1.next()
            com.google.mlkit.vision.common.PointF3D r0 = (com.google.mlkit.vision.common.PointF3D) r0
            com.google.mlkit.vision.common.PointF3D r0 = f(r0, r2)
            r1.set(r0)
            goto L4
        L18:
            return
    }

    public static void i(java.util.List<com.google.mlkit.vision.common.PointF3D> r1, com.google.mlkit.vision.common.PointF3D r2) {
            java.util.ListIterator r1 = r1.listIterator()
        L4:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L18
            java.lang.Object r0 = r1.next()
            com.google.mlkit.vision.common.PointF3D r0 = (com.google.mlkit.vision.common.PointF3D) r0
            com.google.mlkit.vision.common.PointF3D r0 = g(r0, r2)
            r1.set(r0)
            goto L4
        L18:
            return
    }

    public static com.google.mlkit.vision.common.PointF3D j(com.google.mlkit.vision.common.PointF3D r3, com.google.mlkit.vision.common.PointF3D r4) {
            float r0 = r4.getX()
            float r1 = r3.getX()
            float r0 = r0 - r1
            float r1 = r4.getY()
            float r2 = r3.getY()
            float r1 = r1 - r2
            float r4 = r4.getZ()
            float r3 = r3.getZ()
            float r4 = r4 - r3
            com.google.mlkit.vision.common.PointF3D r3 = com.google.mlkit.vision.common.PointF3D.from(r0, r1, r4)
            return r3
    }

    public static void k(com.google.mlkit.vision.common.PointF3D r1, java.util.List<com.google.mlkit.vision.common.PointF3D> r2) {
            java.util.ListIterator r2 = r2.listIterator()
        L4:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L18
            java.lang.Object r0 = r2.next()
            com.google.mlkit.vision.common.PointF3D r0 = (com.google.mlkit.vision.common.PointF3D) r0
            com.google.mlkit.vision.common.PointF3D r0 = j(r1, r0)
            r2.set(r0)
            goto L4
        L18:
            return
    }

    public static float l(com.google.mlkit.vision.common.PointF3D r2) {
            float r0 = r2.getX()
            float r0 = java.lang.Math.abs(r0)
            float r1 = r2.getY()
            float r1 = java.lang.Math.abs(r1)
            float r0 = r0 + r1
            float r2 = r2.getZ()
            float r2 = java.lang.Math.abs(r2)
            float r0 = r0 + r2
            return r0
    }
}

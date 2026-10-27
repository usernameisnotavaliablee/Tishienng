package com.github.mikephil.charting.matrix;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class Vector3 {
    public static final com.github.mikephil.charting.matrix.Vector3 UNIT_X = null;
    public static final com.github.mikephil.charting.matrix.Vector3 UNIT_Y = null;
    public static final com.github.mikephil.charting.matrix.Vector3 UNIT_Z = null;
    public static final com.github.mikephil.charting.matrix.Vector3 ZERO = null;
    public float x;
    public float y;
    public float z;

    static {
            com.github.mikephil.charting.matrix.Vector3 r0 = new com.github.mikephil.charting.matrix.Vector3
            r1 = 0
            r0.<init>(r1, r1, r1)
            com.github.mikephil.charting.matrix.Vector3.ZERO = r0
            com.github.mikephil.charting.matrix.Vector3 r0 = new com.github.mikephil.charting.matrix.Vector3
            r2 = 1065353216(0x3f800000, float:1.0)
            r0.<init>(r2, r1, r1)
            com.github.mikephil.charting.matrix.Vector3.UNIT_X = r0
            com.github.mikephil.charting.matrix.Vector3 r0 = new com.github.mikephil.charting.matrix.Vector3
            r0.<init>(r1, r2, r1)
            com.github.mikephil.charting.matrix.Vector3.UNIT_Y = r0
            com.github.mikephil.charting.matrix.Vector3 r0 = new com.github.mikephil.charting.matrix.Vector3
            r0.<init>(r1, r1, r2)
            com.github.mikephil.charting.matrix.Vector3.UNIT_Z = r0
            return
    }

    public Vector3() {
            r0 = this;
            r0.<init>()
            return
    }

    public Vector3(float r1, float r2, float r3) {
            r0 = this;
            r0.<init>()
            r0.set(r1, r2, r3)
            return
    }

    public Vector3(com.github.mikephil.charting.matrix.Vector3 r1) {
            r0 = this;
            r0.<init>()
            r0.set(r1)
            return
    }

    public Vector3(float[] r4) {
            r3 = this;
            r3.<init>()
            r0 = 0
            r0 = r4[r0]
            r1 = 1
            r1 = r4[r1]
            r2 = 2
            r4 = r4[r2]
            r3.set(r0, r1, r4)
            return
    }

    public final void add(float r2, float r3, float r4) {
            r1 = this;
            float r0 = r1.x
            float r0 = r0 + r2
            r1.x = r0
            float r2 = r1.y
            float r2 = r2 + r3
            r1.y = r2
            float r2 = r1.z
            float r2 = r2 + r4
            r1.z = r2
            return
    }

    public final void add(com.github.mikephil.charting.matrix.Vector3 r3) {
            r2 = this;
            float r0 = r2.x
            float r1 = r3.x
            float r0 = r0 + r1
            r2.x = r0
            float r0 = r2.y
            float r1 = r3.y
            float r0 = r0 + r1
            r2.y = r0
            float r0 = r2.z
            float r3 = r3.z
            float r0 = r0 + r3
            r2.z = r0
            return
    }

    public final com.github.mikephil.charting.matrix.Vector3 cross(com.github.mikephil.charting.matrix.Vector3 r8) {
            r7 = this;
            com.github.mikephil.charting.matrix.Vector3 r0 = new com.github.mikephil.charting.matrix.Vector3
            float r1 = r7.y
            float r2 = r8.z
            float r3 = r1 * r2
            float r4 = r7.z
            float r5 = r8.y
            float r6 = r4 * r5
            float r3 = r3 - r6
            float r8 = r8.x
            float r4 = r4 * r8
            float r6 = r7.x
            float r2 = r2 * r6
            float r4 = r4 - r2
            float r6 = r6 * r5
            float r1 = r1 * r8
            float r6 = r6 - r1
            r0.<init>(r3, r4, r6)
            return r0
    }

    public final float distance2(com.github.mikephil.charting.matrix.Vector3 r4) {
            r3 = this;
            float r0 = r3.x
            float r1 = r4.x
            float r0 = r0 - r1
            float r1 = r3.y
            float r2 = r4.y
            float r1 = r1 - r2
            float r2 = r3.z
            float r4 = r4.z
            float r2 = r2 - r4
            float r0 = r0 * r0
            float r1 = r1 * r1
            float r0 = r0 + r1
            float r2 = r2 * r2
            float r0 = r0 + r2
            return r0
    }

    public final void divide(float r2) {
            r1 = this;
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto L14
            float r0 = r1.x
            float r0 = r0 / r2
            r1.x = r0
            float r0 = r1.y
            float r0 = r0 / r2
            r1.y = r0
            float r0 = r1.z
            float r0 = r0 / r2
            r1.z = r0
        L14:
            return
    }

    public final float dot(com.github.mikephil.charting.matrix.Vector3 r4) {
            r3 = this;
            float r0 = r3.x
            float r1 = r4.x
            float r0 = r0 * r1
            float r1 = r3.y
            float r2 = r4.y
            float r1 = r1 * r2
            float r0 = r0 + r1
            float r1 = r3.z
            float r4 = r4.z
            float r1 = r1 * r4
            float r0 = r0 + r1
            return r0
    }

    public final float length() {
            r2 = this;
            float r0 = r2.length2()
            double r0 = (double) r0
            double r0 = java.lang.Math.sqrt(r0)
            float r0 = (float) r0
            return r0
    }

    public final float length2() {
            r2 = this;
            float r0 = r2.x
            float r0 = r0 * r0
            float r1 = r2.y
            float r1 = r1 * r1
            float r0 = r0 + r1
            float r1 = r2.z
            float r1 = r1 * r1
            float r0 = r0 + r1
            return r0
    }

    public final void multiply(float r2) {
            r1 = this;
            float r0 = r1.x
            float r0 = r0 * r2
            r1.x = r0
            float r0 = r1.y
            float r0 = r0 * r2
            r1.y = r0
            float r0 = r1.z
            float r0 = r0 * r2
            r1.z = r0
            return
    }

    public final void multiply(com.github.mikephil.charting.matrix.Vector3 r3) {
            r2 = this;
            float r0 = r2.x
            float r1 = r3.x
            float r0 = r0 * r1
            r2.x = r0
            float r0 = r2.y
            float r1 = r3.y
            float r0 = r0 * r1
            r2.y = r0
            float r0 = r2.z
            float r3 = r3.z
            float r0 = r0 * r3
            r2.z = r0
            return
    }

    public final float normalize() {
            r2 = this;
            float r0 = r2.length()
            r1 = 0
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 == 0) goto L18
            float r1 = r2.x
            float r1 = r1 / r0
            r2.x = r1
            float r1 = r2.y
            float r1 = r1 / r0
            r2.y = r1
            float r1 = r2.z
            float r1 = r1 / r0
            r2.z = r1
        L18:
            return r0
    }

    public final boolean pointsInSameDirection(com.github.mikephil.charting.matrix.Vector3 r2) {
            r1 = this;
            float r2 = r1.dot(r2)
            r0 = 0
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 <= 0) goto Lb
            r2 = 1
            return r2
        Lb:
            r2 = 0
            return r2
    }

    public final void set(float r1, float r2, float r3) {
            r0 = this;
            r0.x = r1
            r0.y = r2
            r0.z = r3
            return
    }

    public final void set(com.github.mikephil.charting.matrix.Vector3 r2) {
            r1 = this;
            float r0 = r2.x
            r1.x = r0
            float r0 = r2.y
            r1.y = r0
            float r2 = r2.z
            r1.z = r2
            return
    }

    public final void subtract(com.github.mikephil.charting.matrix.Vector3 r3) {
            r2 = this;
            float r0 = r2.x
            float r1 = r3.x
            float r0 = r0 - r1
            r2.x = r0
            float r0 = r2.y
            float r1 = r3.y
            float r0 = r0 - r1
            r2.y = r0
            float r0 = r2.z
            float r3 = r3.z
            float r0 = r0 - r3
            r2.z = r0
            return
    }

    public final void subtractMultiple(com.github.mikephil.charting.matrix.Vector3 r3, float r4) {
            r2 = this;
            float r0 = r2.x
            float r1 = r3.x
            float r1 = r1 * r4
            float r0 = r0 - r1
            r2.x = r0
            float r0 = r2.y
            float r1 = r3.y
            float r1 = r1 * r4
            float r0 = r0 - r1
            r2.y = r0
            float r0 = r2.z
            float r3 = r3.z
            float r3 = r3 * r4
            float r0 = r0 - r3
            r2.z = r0
            return
    }

    public final void zero() {
            r1 = this;
            r0 = 0
            r1.set(r0, r0, r0)
            return
    }
}

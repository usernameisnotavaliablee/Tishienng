package androidx.camera.core.impl.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class MatrixExt {
    private static final float[] sTemp = null;

    static {
            r0 = 16
            float[] r0 = new float[r0]
            androidx.camera.core.impl.utils.MatrixExt.sTemp = r0
            return
    }

    private MatrixExt() {
            r0 = this;
            r0.<init>()
            return
    }

    private static void denormalize(float[] r2, float r3, float r4) {
            float r3 = -r3
            float r4 = -r4
            r0 = 0
            r1 = 0
            android.opengl.Matrix.translateM(r2, r1, r3, r4, r0)
            return
    }

    private static void normalize(float[] r2, float r3, float r4) {
            r0 = 0
            r1 = 0
            android.opengl.Matrix.translateM(r2, r0, r3, r4, r1)
            return
    }

    public static void postRotate(@androidx.annotation.NonNull float[] r7, float r8, float r9, float r10) {
            float[] r1 = androidx.camera.core.impl.utils.MatrixExt.sTemp
            monitor-enter(r1)
            r0 = 0
            android.opengl.Matrix.setIdentityM(r1, r0)     // Catch: java.lang.Throwable -> L22
            normalize(r1, r9, r10)     // Catch: java.lang.Throwable -> L22
            r5 = 0
            r6 = 1065353216(0x3f800000, float:1.0)
            r2 = 0
            r4 = 0
            r3 = r8
            android.opengl.Matrix.rotateM(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L22
            denormalize(r1, r9, r10)     // Catch: java.lang.Throwable -> L22
            r3 = 0
            r5 = 0
            r2 = r1
            r1 = 0
            r4 = r7
            r0 = r7
            android.opengl.Matrix.multiplyMM(r0, r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L25
            r1 = r2
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L22
            return
        L22:
            r0 = move-exception
        L23:
            r7 = r0
            goto L28
        L25:
            r0 = move-exception
            r1 = r2
            goto L23
        L28:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L22
            throw r7
    }

    public static void preRotate(@androidx.annotation.NonNull float[] r6, float r7, float r8, float r9) {
            normalize(r6, r8, r9)
            r4 = 0
            r5 = 1065353216(0x3f800000, float:1.0)
            r1 = 0
            r3 = 0
            r0 = r6
            r2 = r7
            android.opengl.Matrix.rotateM(r0, r1, r2, r3, r4, r5)
            denormalize(r0, r8, r9)
            return
    }

    public static void preVerticalFlip(@androidx.annotation.NonNull float[] r4, float r5) {
            r0 = 0
            normalize(r4, r0, r5)
            r1 = 1065353216(0x3f800000, float:1.0)
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            r3 = 0
            android.opengl.Matrix.scaleM(r4, r3, r1, r2, r1)
            denormalize(r4, r0, r5)
            return
    }

    public static void setRotate(@androidx.annotation.NonNull float[] r1, float r2, float r3, float r4) {
            r0 = 0
            android.opengl.Matrix.setIdentityM(r1, r0)
            preRotate(r1, r2, r3, r4)
            return
    }

    @androidx.annotation.NonNull
    public static java.lang.String toString(@androidx.annotation.NonNull float[] r20, int r21) {
            java.util.Locale r0 = java.util.Locale.US
            r1 = r20[r21]
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            int r2 = r21 + 4
            r2 = r20[r2]
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            int r3 = r21 + 8
            r3 = r20[r3]
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            int r4 = r21 + 12
            r4 = r20[r4]
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            int r5 = r21 + 1
            r5 = r20[r5]
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            int r6 = r21 + 5
            r6 = r20[r6]
            java.lang.Float r6 = java.lang.Float.valueOf(r6)
            int r7 = r21 + 9
            r7 = r20[r7]
            java.lang.Float r7 = java.lang.Float.valueOf(r7)
            int r8 = r21 + 13
            r8 = r20[r8]
            java.lang.Float r8 = java.lang.Float.valueOf(r8)
            int r9 = r21 + 2
            r9 = r20[r9]
            java.lang.Float r9 = java.lang.Float.valueOf(r9)
            int r10 = r21 + 6
            r10 = r20[r10]
            java.lang.Float r10 = java.lang.Float.valueOf(r10)
            int r11 = r21 + 10
            r11 = r20[r11]
            java.lang.Float r11 = java.lang.Float.valueOf(r11)
            int r12 = r21 + 14
            r12 = r20[r12]
            java.lang.Float r12 = java.lang.Float.valueOf(r12)
            int r13 = r21 + 3
            r13 = r20[r13]
            java.lang.Float r13 = java.lang.Float.valueOf(r13)
            int r14 = r21 + 7
            r14 = r20[r14]
            java.lang.Float r14 = java.lang.Float.valueOf(r14)
            int r15 = r21 + 11
            r15 = r20[r15]
            java.lang.Float r15 = java.lang.Float.valueOf(r15)
            r16 = 15
            int r17 = r21 + 15
            r17 = r20[r17]
            java.lang.Float r17 = java.lang.Float.valueOf(r17)
            r18 = r1
            r1 = 16
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r19 = 0
            r1[r19] = r18
            r18 = 1
            r1[r18] = r2
            r2 = 2
            r1[r2] = r3
            r2 = 3
            r1[r2] = r4
            r2 = 4
            r1[r2] = r5
            r2 = 5
            r1[r2] = r6
            r2 = 6
            r1[r2] = r7
            r2 = 7
            r1[r2] = r8
            r2 = 8
            r1[r2] = r9
            r2 = 9
            r1[r2] = r10
            r2 = 10
            r1[r2] = r11
            r2 = 11
            r1[r2] = r12
            r2 = 12
            r1[r2] = r13
            r2 = 13
            r1[r2] = r14
            r2 = 14
            r1[r2] = r15
            r1[r16] = r17
            java.lang.String r2 = "Matrix:\n%2.1f %2.1f %2.1f %2.1f\n%2.1f %2.1f %2.1f %2.1f\n%2.1f %2.1f %2.1f %2.1f\n%2.1f %2.1f %2.1f %2.1f"
            java.lang.String r0 = java.lang.String.format(r0, r2, r1)
            return r0
    }
}

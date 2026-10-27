package androidx.camera.core.impl.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class CameraOrientationUtil {
    private static final java.lang.String TAG = "CameraOrientationUtil";

    private CameraOrientationUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int degreesToSurfaceRotation(int r3) {
            if (r3 == 0) goto L2b
            r0 = 90
            if (r3 == r0) goto L29
            r0 = 180(0xb4, float:2.52E-43)
            if (r3 == r0) goto L27
            r0 = 270(0x10e, float:3.78E-43)
            if (r3 != r0) goto L10
            r3 = 3
            return r3
        L10:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid sensor rotation: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L27:
            r3 = 2
            return r3
        L29:
            r3 = 1
            return r3
        L2b:
            r3 = 0
            return r3
    }

    public static int getRelativeImageRotation(int r5, int r6, boolean r7) {
            if (r7 == 0) goto L9
            int r0 = r6 - r5
            int r0 = r0 + 360
            int r0 = r0 % 360
            goto Ld
        L9:
            int r0 = r6 + r5
            int r0 = r0 % 360
        Ld:
            java.lang.String r1 = "CameraOrientationUtil"
            boolean r2 = androidx.camera.core.Logger.isDebugEnabled(r1)
            if (r2 == 0) goto L3d
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r3 = 4
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r5
            r5 = 1
            r3[r5] = r6
            r5 = 2
            r3[r5] = r7
            r5 = 3
            r3[r5] = r2
            java.lang.String r5 = "getRelativeImageRotation: destRotationDegrees=%s, sourceRotationDegrees=%s, isOppositeFacing=%s, result=%s"
            java.lang.String r5 = java.lang.String.format(r5, r3)
            androidx.camera.core.Logger.d(r1, r5)
        L3d:
            return r0
    }

    public static int surfaceRotationToDegrees(int r3) {
            if (r3 == 0) goto L2b
            r0 = 1
            if (r3 == r0) goto L28
            r0 = 2
            if (r3 == r0) goto L25
            r0 = 3
            if (r3 != r0) goto Le
            r3 = 270(0x10e, float:3.78E-43)
            return r3
        Le:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unsupported surface rotation: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L25:
            r3 = 180(0xb4, float:2.52E-43)
            return r3
        L28:
            r3 = 90
            return r3
        L2b:
            r3 = 0
            return r3
    }
}

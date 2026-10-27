package androidx.camera.camera2.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class FovUtil {
    private static final java.lang.String TAG = "FovUtil";

    private FovUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.IntRange(from = 0, to = 360)
    public static int focalLengthToViewAngleDegrees(float r5, float r6) {
            r0 = 1
            r1 = 0
            r2 = 0
            int r3 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r3 <= 0) goto L9
            r3 = 1
            goto La
        L9:
            r3 = 0
        La:
            java.lang.String r4 = "Focal length should be positive."
            androidx.core.util.Preconditions.checkArgument(r3, r4)
            int r2 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r2 <= 0) goto L14
            goto L15
        L14:
            r0 = 0
        L15:
            java.lang.String r2 = "Sensor length should be positive."
            androidx.core.util.Preconditions.checkArgument(r0, r2)
            r0 = 1073741824(0x40000000, float:2.0)
            float r5 = r5 * r0
            float r6 = r6 / r5
            double r5 = (double) r6
            double r5 = java.lang.Math.atan(r5)
            r2 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r5 = r5 * r2
            double r5 = java.lang.Math.toDegrees(r5)
            int r5 = (int) r5
            r6 = 360(0x168, float:5.04E-43)
            java.lang.String r0 = "The provided focal length and sensor length result in an invalid view angle degrees."
            androidx.core.util.Preconditions.checkArgumentInRange(r5, r1, r6, r0)
            return r5
    }

    public static float getDefaultFocalLength(@androidx.annotation.NonNull androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat r1) {
            android.hardware.camera2.CameraCharacteristics$Key r0 = android.hardware.camera2.CameraCharacteristics.LENS_INFO_AVAILABLE_FOCAL_LENGTHS
            java.lang.Object r1 = r1.get(r0)
            float[] r1 = (float[]) r1
            java.lang.String r0 = "The focal lengths can not be empty."
            androidx.core.util.Preconditions.checkNotNull(r1, r0)
            r0 = 0
            r1 = r1[r0]
            return r1
    }

    public static int getDeviceDefaultViewAngleDegrees(@androidx.annotation.NonNull androidx.camera.camera2.internal.compat.CameraManagerCompat r6, int r7) {
            java.lang.String[] r0 = r6.getCameraIdList()     // Catch: androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat -> L3d
            int r1 = r0.length     // Catch: androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat -> L3d
            r2 = 0
        L6:
            if (r2 >= r1) goto L35
            r3 = r0[r2]     // Catch: androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat -> L3d
            androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat r3 = r6.getCameraCharacteristicsCompat(r3)     // Catch: androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat -> L3d
            android.hardware.camera2.CameraCharacteristics$Key r4 = android.hardware.camera2.CameraCharacteristics.LENS_FACING     // Catch: androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat -> L3d
            java.lang.Object r4 = r3.get(r4)     // Catch: androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat -> L3d
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch: androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat -> L3d
            java.lang.String r5 = "Lens facing can not be null"
            androidx.core.util.Preconditions.checkNotNull(r4, r5)     // Catch: androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat -> L3d
            int r4 = r4.intValue()     // Catch: androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat -> L3d
            int r5 = androidx.camera.camera2.internal.LensFacingUtil.getLensFacingInt(r7)     // Catch: androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat -> L3d
            if (r4 != r5) goto L32
            float r6 = getDefaultFocalLength(r3)     // Catch: androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat -> L3d
            float r7 = getSensorHorizontalLength(r3)     // Catch: androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat -> L3d
            int r6 = focalLengthToViewAngleDegrees(r6, r7)     // Catch: androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat -> L3d
            return r6
        L32:
            int r2 = r2 + 1
            goto L6
        L35:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "Unable to get the default focal length with the specified lens facing."
            r6.<init>(r7)
            throw r6
        L3d:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "Unable to get the default focal length."
            r6.<init>(r7)
            throw r6
    }

    public static float getSensorHorizontalLength(@androidx.annotation.NonNull androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat r4) {
            android.hardware.camera2.CameraCharacteristics$Key r0 = android.hardware.camera2.CameraCharacteristics.SENSOR_INFO_PHYSICAL_SIZE
            java.lang.Object r0 = r4.get(r0)
            android.util.SizeF r0 = (android.util.SizeF) r0
            android.hardware.camera2.CameraCharacteristics$Key r1 = android.hardware.camera2.CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE
            java.lang.Object r1 = r4.get(r1)
            android.graphics.Rect r1 = (android.graphics.Rect) r1
            android.hardware.camera2.CameraCharacteristics$Key r2 = android.hardware.camera2.CameraCharacteristics.SENSOR_INFO_PIXEL_ARRAY_SIZE
            java.lang.Object r2 = r4.get(r2)
            android.util.Size r2 = (android.util.Size) r2
            android.hardware.camera2.CameraCharacteristics$Key r3 = android.hardware.camera2.CameraCharacteristics.SENSOR_ORIENTATION
            java.lang.Object r4 = r4.get(r3)
            java.lang.Integer r4 = (java.lang.Integer) r4
            java.lang.String r3 = "The sensor size can't be null."
            androidx.core.util.Preconditions.checkNotNull(r0, r3)
            java.lang.String r3 = "The sensor orientation can't be null."
            androidx.core.util.Preconditions.checkNotNull(r4, r3)
            java.lang.String r3 = "The active array size can't be null."
            androidx.core.util.Preconditions.checkNotNull(r1, r3)
            java.lang.String r3 = "The pixel array size can't be null."
            androidx.core.util.Preconditions.checkNotNull(r2, r3)
            android.util.Size r1 = androidx.camera.core.impl.utils.TransformUtils.rectToSize(r1)
            int r4 = r4.intValue()
            boolean r4 = androidx.camera.core.impl.utils.TransformUtils.is90or270(r4)
            if (r4 == 0) goto L4e
            android.util.SizeF r0 = androidx.camera.core.impl.utils.TransformUtils.reverseSizeF(r0)
            android.util.Size r1 = androidx.camera.core.impl.utils.TransformUtils.reverseSize(r1)
            android.util.Size r2 = androidx.camera.core.impl.utils.TransformUtils.reverseSize(r2)
        L4e:
            float r4 = r0.getWidth()
            int r0 = r1.getWidth()
            float r0 = (float) r0
            float r4 = r4 * r0
            int r0 = r2.getWidth()
            float r0 = (float) r0
            float r4 = r4 / r0
            return r4
    }
}

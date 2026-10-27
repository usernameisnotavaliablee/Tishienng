package androidx.camera.camera2.internal.compat;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class CameraAccessExceptionCompat extends java.lang.Exception {
    public static final int CAMERA_CHARACTERISTICS_CREATION_ERROR = 10002;

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public static final int CAMERA_DEPRECATED_HAL = 1000;
    public static final int CAMERA_DISABLED = 1;
    public static final int CAMERA_DISCONNECTED = 2;
    public static final int CAMERA_ERROR = 3;
    public static final int CAMERA_IN_USE = 4;
    public static final int CAMERA_UNAVAILABLE_DO_NOT_DISTURB = 10001;

    @androidx.annotation.VisibleForTesting
    static final java.util.Set<java.lang.Integer> COMPAT_ERRORS = null;
    public static final int MAX_CAMERAS_IN_USE = 5;

    @androidx.annotation.VisibleForTesting
    static final java.util.Set<java.lang.Integer> PLATFORM_ERRORS = null;
    private final android.hardware.camera2.CameraAccessException mCameraAccessException;
    private final int mReason;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public @interface AccessError {
    }

    static {
            java.util.HashSet r0 = new java.util.HashSet
            r1 = 4
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r3 = 5
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r5 = 1
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r7 = 2
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            r9 = 3
            java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
            java.lang.Integer[] r3 = new java.lang.Integer[r3]
            r11 = 0
            r3[r11] = r2
            r3[r5] = r4
            r3[r7] = r6
            r3[r9] = r8
            r3[r1] = r10
            java.util.List r1 = java.util.Arrays.asList(r3)
            r0.<init>(r1)
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r0)
            androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat.PLATFORM_ERRORS = r0
            java.util.HashSet r0 = new java.util.HashSet
            r1 = 10001(0x2711, float:1.4014E-41)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 10002(0x2712, float:1.4016E-41)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Integer[] r3 = new java.lang.Integer[r7]
            r3[r11] = r1
            r3[r5] = r2
            java.util.List r1 = java.util.Arrays.asList(r3)
            r0.<init>(r1)
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r0)
            androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat.COMPAT_ERRORS = r0
            return
    }

    public CameraAccessExceptionCompat(int r3) {
            r2 = this;
            java.lang.String r0 = getDefaultMessage(r3)
            r2.<init>(r0)
            r2.mReason = r3
            java.util.Set<java.lang.Integer> r0 = androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat.PLATFORM_ERRORS
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L1b
            android.hardware.camera2.CameraAccessException r0 = new android.hardware.camera2.CameraAccessException
            r0.<init>(r3)
            goto L1c
        L1b:
            r0 = 0
        L1c:
            r2.mCameraAccessException = r0
            return
    }

    public CameraAccessExceptionCompat(int r3, @androidx.annotation.Nullable java.lang.String r4) {
            r2 = this;
            java.lang.String r0 = getCombinedMessage(r3, r4)
            r2.<init>(r0)
            r2.mReason = r3
            java.util.Set<java.lang.Integer> r0 = androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat.PLATFORM_ERRORS
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L1b
            android.hardware.camera2.CameraAccessException r0 = new android.hardware.camera2.CameraAccessException
            r0.<init>(r3, r4)
            goto L1c
        L1b:
            r0 = 0
        L1c:
            r2.mCameraAccessException = r0
            return
    }

    public CameraAccessExceptionCompat(int r3, @androidx.annotation.Nullable java.lang.String r4, @androidx.annotation.Nullable java.lang.Throwable r5) {
            r2 = this;
            java.lang.String r0 = getCombinedMessage(r3, r4)
            r2.<init>(r0, r5)
            r2.mReason = r3
            java.util.Set<java.lang.Integer> r0 = androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat.PLATFORM_ERRORS
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L1b
            android.hardware.camera2.CameraAccessException r0 = new android.hardware.camera2.CameraAccessException
            r0.<init>(r3, r4, r5)
            goto L1c
        L1b:
            r0 = 0
        L1c:
            r2.mCameraAccessException = r0
            return
    }

    public CameraAccessExceptionCompat(int r3, @androidx.annotation.Nullable java.lang.Throwable r4) {
            r2 = this;
            java.lang.String r0 = getDefaultMessage(r3)
            r2.<init>(r0, r4)
            r2.mReason = r3
            java.util.Set<java.lang.Integer> r0 = androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat.PLATFORM_ERRORS
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            boolean r0 = r0.contains(r1)
            r1 = 0
            if (r0 == 0) goto L1c
            android.hardware.camera2.CameraAccessException r0 = new android.hardware.camera2.CameraAccessException
            r0.<init>(r3, r1, r4)
            r1 = r0
        L1c:
            r2.mCameraAccessException = r1
            return
    }

    private CameraAccessExceptionCompat(@androidx.annotation.NonNull android.hardware.camera2.CameraAccessException r3) {
            r2 = this;
            java.lang.String r0 = r3.getMessage()
            java.lang.Throwable r1 = r3.getCause()
            r2.<init>(r0, r1)
            int r0 = r3.getReason()
            r2.mReason = r0
            r2.mCameraAccessException = r3
            return
    }

    private static java.lang.String getCombinedMessage(int r3, java.lang.String r4) {
            java.lang.String r0 = getProblemString(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r0
            r0 = 1
            r1[r0] = r3
            r3 = 2
            r1[r3] = r4
            java.lang.String r3 = "%s (%d): %s"
            java.lang.String r3 = java.lang.String.format(r3, r1)
            return r3
    }

    @androidx.annotation.Nullable
    private static java.lang.String getDefaultMessage(int r1) {
            r0 = 1
            if (r1 == r0) goto L2b
            r0 = 2
            if (r1 == r0) goto L28
            r0 = 3
            if (r1 == r0) goto L25
            r0 = 4
            if (r1 == r0) goto L22
            r0 = 5
            if (r1 == r0) goto L1f
            r0 = 10001(0x2711, float:1.4014E-41)
            if (r1 == r0) goto L1c
            r0 = 10002(0x2712, float:1.4016E-41)
            if (r1 == r0) goto L19
            r1 = 0
            return r1
        L19:
            java.lang.String r1 = "Failed to create CameraCharacteristics."
            return r1
        L1c:
            java.lang.String r1 = "Some API 28 devices cannot access the camera when the device is in \"Do Not Disturb\" mode. The camera will not be accessible until \"Do Not Disturb\" mode is disabled."
            return r1
        L1f:
            java.lang.String r1 = "The system-wide limit for number of open cameras has been reached, and more camera devices cannot be opened until previous instances are closed."
            return r1
        L22:
            java.lang.String r1 = "The camera device is in use already"
            return r1
        L25:
            java.lang.String r1 = "The camera device is currently in the error state; no further calls to it will succeed."
            return r1
        L28:
            java.lang.String r1 = "The camera device is removable and has been disconnected from the Android device, or the camera service has shut down the connection due to a higher-priority access request for the camera device."
            return r1
        L2b:
            java.lang.String r1 = "The camera is disabled due to a device policy, and cannot be opened."
            return r1
    }

    @androidx.annotation.NonNull
    private static java.lang.String getProblemString(int r1) {
            r0 = 1
            if (r1 == r0) goto L33
            r0 = 2
            if (r1 == r0) goto L30
            r0 = 3
            if (r1 == r0) goto L2d
            r0 = 4
            if (r1 == r0) goto L2a
            r0 = 5
            if (r1 == r0) goto L27
            r0 = 1000(0x3e8, float:1.401E-42)
            if (r1 == r0) goto L24
            r0 = 10001(0x2711, float:1.4014E-41)
            if (r1 == r0) goto L21
            r0 = 10002(0x2712, float:1.4016E-41)
            if (r1 == r0) goto L1e
            java.lang.String r1 = "<UNKNOWN ERROR>"
            return r1
        L1e:
            java.lang.String r1 = "CAMERA_CHARACTERISTICS_CREATION_ERROR"
            return r1
        L21:
            java.lang.String r1 = "CAMERA_UNAVAILABLE_DO_NOT_DISTURB"
            return r1
        L24:
            java.lang.String r1 = "CAMERA_DEPRECATED_HAL"
            return r1
        L27:
            java.lang.String r1 = "MAX_CAMERAS_IN_USE"
            return r1
        L2a:
            java.lang.String r1 = "CAMERA_IN_USE"
            return r1
        L2d:
            java.lang.String r1 = "CAMERA_ERROR"
            return r1
        L30:
            java.lang.String r1 = "CAMERA_DISCONNECTED"
            return r1
        L33:
            java.lang.String r1 = "CAMERA_DISABLED"
            return r1
    }

    @androidx.annotation.NonNull
    public static androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat toCameraAccessExceptionCompat(@androidx.annotation.NonNull android.hardware.camera2.CameraAccessException r1) {
            if (r1 == 0) goto L8
            androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat r0 = new androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat
            r0.<init>(r1)
            return r0
        L8:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r0 = "cameraAccessException should not be null"
            r1.<init>(r0)
            throw r1
    }

    public final int getReason() {
            r1 = this;
            int r0 = r1.mReason
            return r0
    }

    @androidx.annotation.Nullable
    public android.hardware.camera2.CameraAccessException toCameraAccessException() {
            r1 = this;
            android.hardware.camera2.CameraAccessException r0 = r1.mCameraAccessException
            return r0
    }
}

package androidx.camera.core.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class CameraValidator {
    private static final java.lang.String TAG = "CameraValidator";

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class CameraIdListIncorrectException extends java.lang.Exception {
        public CameraIdListIncorrectException(@androidx.annotation.Nullable java.lang.String r1, @androidx.annotation.Nullable java.lang.Throwable r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }
    }

    private CameraValidator() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void validateCameras(@androidx.annotation.NonNull android.content.Context r4, @androidx.annotation.NonNull androidx.camera.core.impl.CameraRepository r5, @androidx.annotation.Nullable androidx.camera.core.CameraSelector r6) throws androidx.camera.core.impl.CameraValidator.CameraIdListIncorrectException {
            java.lang.String r0 = "CameraValidator"
            if (r6 == 0) goto L17
            java.lang.Integer r1 = r6.getLensFacing()     // Catch: java.lang.IllegalStateException -> L10
            if (r1 != 0) goto L18
            java.lang.String r4 = "No lens facing info in the availableCamerasSelector, don't verify the camera lens facing."
            androidx.camera.core.Logger.w(r0, r4)     // Catch: java.lang.IllegalStateException -> L10
            return
        L10:
            r4 = move-exception
            java.lang.String r5 = "Cannot get lens facing from the availableCamerasSelector don't verify the camera lens facing."
            androidx.camera.core.Logger.e(r0, r5, r4)
            return
        L17:
            r1 = 0
        L18:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Verifying camera lens facing on "
            r2.append(r3)
            java.lang.String r3 = android.os.Build.DEVICE
            r2.append(r3)
            java.lang.String r3 = ", lensFacingInteger: "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            androidx.camera.core.Logger.d(r0, r2)
            android.content.pm.PackageManager r4 = r4.getPackageManager()
            java.lang.String r2 = "android.hardware.camera"
            boolean r2 = r4.hasSystemFeature(r2)     // Catch: java.lang.IllegalArgumentException -> L4c
            if (r2 == 0) goto L57
            if (r6 == 0) goto L4e
            int r2 = r1.intValue()     // Catch: java.lang.IllegalArgumentException -> L4c
            r3 = 1
            if (r2 != r3) goto L57
            goto L4e
        L4c:
            r4 = move-exception
            goto L71
        L4e:
            androidx.camera.core.CameraSelector r2 = androidx.camera.core.CameraSelector.DEFAULT_BACK_CAMERA     // Catch: java.lang.IllegalArgumentException -> L4c
            java.util.LinkedHashSet r3 = r5.getCameras()     // Catch: java.lang.IllegalArgumentException -> L4c
            r2.select(r3)     // Catch: java.lang.IllegalArgumentException -> L4c
        L57:
            java.lang.String r2 = "android.hardware.camera.front"
            boolean r4 = r4.hasSystemFeature(r2)     // Catch: java.lang.IllegalArgumentException -> L4c
            if (r4 == 0) goto L70
            if (r6 == 0) goto L67
            int r4 = r1.intValue()     // Catch: java.lang.IllegalArgumentException -> L4c
            if (r4 != 0) goto L70
        L67:
            androidx.camera.core.CameraSelector r4 = androidx.camera.core.CameraSelector.DEFAULT_FRONT_CAMERA     // Catch: java.lang.IllegalArgumentException -> L4c
            java.util.LinkedHashSet r6 = r5.getCameras()     // Catch: java.lang.IllegalArgumentException -> L4c
            r4.select(r6)     // Catch: java.lang.IllegalArgumentException -> L4c
        L70:
            return
        L71:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r1 = "Camera LensFacing verification failed, existing cameras: "
            r6.append(r1)
            java.util.LinkedHashSet r5 = r5.getCameras()
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            androidx.camera.core.Logger.e(r0, r5)
            androidx.camera.core.impl.CameraValidator$CameraIdListIncorrectException r5 = new androidx.camera.core.impl.CameraValidator$CameraIdListIncorrectException
            java.lang.String r6 = "Expected camera missing from device."
            r5.<init>(r6, r4)
            throw r5
    }
}

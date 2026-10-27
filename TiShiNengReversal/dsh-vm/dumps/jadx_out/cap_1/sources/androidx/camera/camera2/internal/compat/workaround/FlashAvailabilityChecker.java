package androidx.camera.camera2.internal.compat.workaround;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class FlashAvailabilityChecker {
    private static final java.lang.String TAG = "FlashAvailability";

    private FlashAvailabilityChecker() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean isFlashAvailable(@androidx.annotation.NonNull androidx.camera.camera2.internal.compat.workaround.CameraCharacteristicsProvider r1) {
            r0 = 0
            boolean r1 = isFlashAvailable(r0, r1)
            return r1
    }

    public static boolean isFlashAvailable(boolean r7, @androidx.annotation.NonNull androidx.camera.camera2.internal.compat.workaround.CameraCharacteristicsProvider r8) {
            java.lang.String r0 = "FlashAvailability"
            r1 = 0
            android.hardware.camera2.CameraCharacteristics$Key r2 = android.hardware.camera2.CameraCharacteristics.FLASH_INFO_AVAILABLE     // Catch: java.nio.BufferUnderflowException -> Lc
            java.lang.Object r8 = r8.get(r2)     // Catch: java.nio.BufferUnderflowException -> Lc
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.nio.BufferUnderflowException -> Lc
            goto L53
        Lc:
            r8 = move-exception
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.FlashAvailabilityBufferUnderflowQuirk> r2 = androidx.camera.camera2.internal.compat.quirk.FlashAvailabilityBufferUnderflowQuirk.class
            androidx.camera.core.impl.Quirk r2 = androidx.camera.camera2.internal.compat.quirk.DeviceQuirks.get(r2)
            r3 = 2
            r4 = 1
            r5 = 3
            if (r2 == 0) goto L34
            int r2 = android.os.Build.VERSION.SDK_INT
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r6 = android.os.Build.MANUFACTURER
            r5[r1] = r6
            java.lang.String r6 = android.os.Build.MODEL
            r5[r4] = r6
            r5[r3] = r2
            java.lang.String r2 = "Device is known to throw an exception while checking flash availability. Flash is not available. [Manufacturer: %s, Model: %s, API Level: %d]."
            java.lang.String r2 = java.lang.String.format(r2, r5)
            androidx.camera.core.Logger.d(r0, r2)
            goto L4f
        L34:
            int r2 = android.os.Build.VERSION.SDK_INT
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r6 = android.os.Build.MANUFACTURER
            r5[r1] = r6
            java.lang.String r6 = android.os.Build.MODEL
            r5[r4] = r6
            r5[r3] = r2
            java.lang.String r2 = "Exception thrown while checking for flash availability on device not known to throw exceptions during this check. Please file an issue at https://issuetracker.google.com/issues/new?component=618491&template=1257717 with this error message [Manufacturer: %s, Model: %s, API Level: %d].\nFlash is not available."
            java.lang.String r2 = java.lang.String.format(r2, r5)
            androidx.camera.core.Logger.e(r0, r2, r8)
        L4f:
            if (r7 != 0) goto L61
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
        L53:
            if (r8 != 0) goto L5a
            java.lang.String r7 = "Characteristics did not contain key FLASH_INFO_AVAILABLE. Flash is not available."
            androidx.camera.core.Logger.w(r0, r7)
        L5a:
            if (r8 == 0) goto L60
            boolean r1 = r8.booleanValue()
        L60:
            return r1
        L61:
            throw r8
    }
}

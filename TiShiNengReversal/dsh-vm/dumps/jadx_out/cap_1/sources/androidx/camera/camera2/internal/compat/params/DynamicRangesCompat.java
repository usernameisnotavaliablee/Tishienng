package androidx.camera.camera2.internal.compat.params;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class DynamicRangesCompat {
    private final androidx.camera.camera2.internal.compat.params.DynamicRangesCompat.DynamicRangeProfilesCompatImpl mImpl;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    interface DynamicRangeProfilesCompatImpl {
        @androidx.annotation.NonNull
        java.util.Set<androidx.camera.core.DynamicRange> getDynamicRangeCaptureRequestConstraints(@androidx.annotation.NonNull androidx.camera.core.DynamicRange r1);

        @androidx.annotation.NonNull
        java.util.Set<androidx.camera.core.DynamicRange> getSupportedDynamicRanges();

        boolean isExtraLatencyPresent(@androidx.annotation.NonNull androidx.camera.core.DynamicRange r1);

        @androidx.annotation.Nullable
        android.hardware.camera2.params.DynamicRangeProfiles unwrap();
    }

    DynamicRangesCompat(@androidx.annotation.NonNull androidx.camera.camera2.internal.compat.params.DynamicRangesCompat.DynamicRangeProfilesCompatImpl r1) {
            r0 = this;
            r0.<init>()
            r0.mImpl = r1
            return
    }

    @androidx.annotation.NonNull
    public static androidx.camera.camera2.internal.compat.params.DynamicRangesCompat fromCameraCharacteristics(@androidx.annotation.NonNull androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto L17
            android.hardware.camera2.CameraCharacteristics$Key r0 = androidx.camera.camera2.internal.compat.params.b.a()
            java.lang.Object r2 = r2.get(r0)
            android.hardware.camera2.params.DynamicRangeProfiles r2 = androidx.camera.camera2.internal.compat.params.c.a(r2)
            androidx.camera.camera2.internal.compat.params.DynamicRangesCompat r2 = toDynamicRangesCompat(r2)
            goto L18
        L17:
            r2 = 0
        L18:
            if (r2 != 0) goto L1c
            androidx.camera.camera2.internal.compat.params.DynamicRangesCompat r2 = androidx.camera.camera2.internal.compat.params.DynamicRangesCompatBaseImpl.COMPAT_INSTANCE
        L1c:
            return r2
    }

    @androidx.annotation.Nullable
    @androidx.annotation.RequiresApi(33)
    public static androidx.camera.camera2.internal.compat.params.DynamicRangesCompat toDynamicRangesCompat(@androidx.annotation.Nullable android.hardware.camera2.params.DynamicRangeProfiles r2) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            java.lang.String r1 = "DynamicRangeProfiles can only be converted to DynamicRangesCompat on API 33 or higher."
            androidx.core.util.Preconditions.checkState(r0, r1)
            androidx.camera.camera2.internal.compat.params.DynamicRangesCompat r0 = new androidx.camera.camera2.internal.compat.params.DynamicRangesCompat
            androidx.camera.camera2.internal.compat.params.DynamicRangesCompatApi33Impl r1 = new androidx.camera.camera2.internal.compat.params.DynamicRangesCompatApi33Impl
            r1.<init>(r2)
            r0.<init>(r1)
            return r0
    }

    @androidx.annotation.NonNull
    public java.util.Set<androidx.camera.core.DynamicRange> getDynamicRangeCaptureRequestConstraints(@androidx.annotation.NonNull androidx.camera.core.DynamicRange r2) {
            r1 = this;
            androidx.camera.camera2.internal.compat.params.DynamicRangesCompat$DynamicRangeProfilesCompatImpl r0 = r1.mImpl
            java.util.Set r2 = r0.getDynamicRangeCaptureRequestConstraints(r2)
            return r2
    }

    @androidx.annotation.NonNull
    public java.util.Set<androidx.camera.core.DynamicRange> getSupportedDynamicRanges() {
            r1 = this;
            androidx.camera.camera2.internal.compat.params.DynamicRangesCompat$DynamicRangeProfilesCompatImpl r0 = r1.mImpl
            java.util.Set r0 = r0.getSupportedDynamicRanges()
            return r0
    }

    public boolean isExtraLatencyPresent(@androidx.annotation.NonNull androidx.camera.core.DynamicRange r2) {
            r1 = this;
            androidx.camera.camera2.internal.compat.params.DynamicRangesCompat$DynamicRangeProfilesCompatImpl r0 = r1.mImpl
            boolean r2 = r0.isExtraLatencyPresent(r2)
            return r2
    }

    @androidx.annotation.Nullable
    @androidx.annotation.RequiresApi(33)
    public android.hardware.camera2.params.DynamicRangeProfiles toDynamicRangeProfiles() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            java.lang.String r1 = "DynamicRangesCompat can only be converted to DynamicRangeProfiles on API 33 or higher."
            androidx.core.util.Preconditions.checkState(r0, r1)
            androidx.camera.camera2.internal.compat.params.DynamicRangesCompat$DynamicRangeProfilesCompatImpl r0 = r2.mImpl
            android.hardware.camera2.params.DynamicRangeProfiles r0 = r0.unwrap()
            return r0
    }
}

package androidx.camera.camera2.internal.compat.params;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class DynamicRangesCompatBaseImpl implements androidx.camera.camera2.internal.compat.params.DynamicRangesCompat.DynamicRangeProfilesCompatImpl {
    static final androidx.camera.camera2.internal.compat.params.DynamicRangesCompat COMPAT_INSTANCE = null;
    private static final java.util.Set<androidx.camera.core.DynamicRange> SDR_ONLY = null;

    static {
            androidx.camera.camera2.internal.compat.params.DynamicRangesCompat r0 = new androidx.camera.camera2.internal.compat.params.DynamicRangesCompat
            androidx.camera.camera2.internal.compat.params.DynamicRangesCompatBaseImpl r1 = new androidx.camera.camera2.internal.compat.params.DynamicRangesCompatBaseImpl
            r1.<init>()
            r0.<init>(r1)
            androidx.camera.camera2.internal.compat.params.DynamicRangesCompatBaseImpl.COMPAT_INSTANCE = r0
            androidx.camera.core.DynamicRange r0 = androidx.camera.core.DynamicRange.SDR
            java.util.Set r0 = java.util.Collections.singleton(r0)
            androidx.camera.camera2.internal.compat.params.DynamicRangesCompatBaseImpl.SDR_ONLY = r0
            return
    }

    DynamicRangesCompatBaseImpl() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // androidx.camera.camera2.internal.compat.params.DynamicRangesCompat.DynamicRangeProfilesCompatImpl
    @androidx.annotation.NonNull
    public java.util.Set<androidx.camera.core.DynamicRange> getDynamicRangeCaptureRequestConstraints(@androidx.annotation.NonNull androidx.camera.core.DynamicRange r4) {
            r3 = this;
            androidx.camera.core.DynamicRange r0 = androidx.camera.core.DynamicRange.SDR
            boolean r0 = r0.equals(r4)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "DynamicRange is not supported: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            androidx.core.util.Preconditions.checkArgument(r0, r4)
            java.util.Set<androidx.camera.core.DynamicRange> r4 = androidx.camera.camera2.internal.compat.params.DynamicRangesCompatBaseImpl.SDR_ONLY
            return r4
    }

    @Override // androidx.camera.camera2.internal.compat.params.DynamicRangesCompat.DynamicRangeProfilesCompatImpl
    @androidx.annotation.NonNull
    public java.util.Set<androidx.camera.core.DynamicRange> getSupportedDynamicRanges() {
            r1 = this;
            java.util.Set<androidx.camera.core.DynamicRange> r0 = androidx.camera.camera2.internal.compat.params.DynamicRangesCompatBaseImpl.SDR_ONLY
            return r0
    }

    @Override // androidx.camera.camera2.internal.compat.params.DynamicRangesCompat.DynamicRangeProfilesCompatImpl
    public boolean isExtraLatencyPresent(@androidx.annotation.NonNull androidx.camera.core.DynamicRange r4) {
            r3 = this;
            androidx.camera.core.DynamicRange r0 = androidx.camera.core.DynamicRange.SDR
            boolean r0 = r0.equals(r4)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "DynamicRange is not supported: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            androidx.core.util.Preconditions.checkArgument(r0, r4)
            r4 = 0
            return r4
    }

    @Override // androidx.camera.camera2.internal.compat.params.DynamicRangesCompat.DynamicRangeProfilesCompatImpl
    @androidx.annotation.Nullable
    public android.hardware.camera2.params.DynamicRangeProfiles unwrap() {
            r1 = this;
            r0 = 0
            return r0
    }
}

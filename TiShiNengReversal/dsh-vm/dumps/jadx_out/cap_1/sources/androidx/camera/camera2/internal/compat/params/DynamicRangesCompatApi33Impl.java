package androidx.camera.camera2.internal.compat.params;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(33)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class DynamicRangesCompatApi33Impl implements androidx.camera.camera2.internal.compat.params.DynamicRangesCompat.DynamicRangeProfilesCompatImpl {
    private final android.hardware.camera2.params.DynamicRangeProfiles mDynamicRangeProfiles;

    DynamicRangesCompatApi33Impl(@androidx.annotation.NonNull java.lang.Object r1) {
            r0 = this;
            r0.<init>()
            android.hardware.camera2.params.DynamicRangeProfiles r1 = (android.hardware.camera2.params.DynamicRangeProfiles) r1
            r0.mDynamicRangeProfiles = r1
            return
    }

    @androidx.annotation.Nullable
    private java.lang.Long dynamicRangeToFirstSupportedProfile(@androidx.annotation.NonNull androidx.camera.core.DynamicRange r2) {
            r1 = this;
            android.hardware.camera2.params.DynamicRangeProfiles r0 = r1.mDynamicRangeProfiles
            java.lang.Long r2 = androidx.camera.camera2.internal.compat.params.DynamicRangeConversions.dynamicRangeToFirstSupportedProfile(r2, r0)
            return r2
    }

    @androidx.annotation.NonNull
    private static java.util.Set<androidx.camera.core.DynamicRange> profileSetToDynamicRangeSet(@androidx.annotation.NonNull java.util.Set<java.lang.Long> r3) {
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L9
            java.util.Set r3 = java.util.Collections.EMPTY_SET
            return r3
        L9:
            java.util.HashSet r0 = new java.util.HashSet
            int r1 = r3.size()
            r0.<init>(r1)
            java.util.Iterator r3 = r3.iterator()
        L16:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L2e
            java.lang.Object r1 = r3.next()
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            androidx.camera.core.DynamicRange r1 = profileToDynamicRange(r1)
            r0.add(r1)
            goto L16
        L2e:
            java.util.Set r3 = java.util.Collections.unmodifiableSet(r0)
            return r3
    }

    @androidx.annotation.NonNull
    private static androidx.camera.core.DynamicRange profileToDynamicRange(long r3) {
            androidx.camera.core.DynamicRange r0 = androidx.camera.camera2.internal.compat.params.DynamicRangeConversions.profileToDynamicRange(r3)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Dynamic range profile cannot be converted to a DynamicRange object: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            java.lang.Object r3 = androidx.core.util.Preconditions.checkNotNull(r0, r3)
            androidx.camera.core.DynamicRange r3 = (androidx.camera.core.DynamicRange) r3
            return r3
    }

    @Override // androidx.camera.camera2.internal.compat.params.DynamicRangesCompat.DynamicRangeProfilesCompatImpl
    @androidx.annotation.NonNull
    public java.util.Set<androidx.camera.core.DynamicRange> getDynamicRangeCaptureRequestConstraints(@androidx.annotation.NonNull androidx.camera.core.DynamicRange r5) {
            r4 = this;
            java.lang.Long r0 = r4.dynamicRangeToFirstSupportedProfile(r5)
            if (r0 == 0) goto L8
            r1 = 1
            goto L9
        L8:
            r1 = 0
        L9:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "DynamicRange is not supported: "
            r2.append(r3)
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            androidx.core.util.Preconditions.checkArgument(r1, r5)
            android.hardware.camera2.params.DynamicRangeProfiles r5 = r4.mDynamicRangeProfiles
            long r0 = r0.longValue()
            java.util.Set r5 = r5.getProfileCaptureRequestConstraints(r0)
            java.util.Set r5 = profileSetToDynamicRangeSet(r5)
            return r5
    }

    @Override // androidx.camera.camera2.internal.compat.params.DynamicRangesCompat.DynamicRangeProfilesCompatImpl
    @androidx.annotation.NonNull
    public java.util.Set<androidx.camera.core.DynamicRange> getSupportedDynamicRanges() {
            r1 = this;
            android.hardware.camera2.params.DynamicRangeProfiles r0 = r1.mDynamicRangeProfiles
            java.util.Set r0 = r0.getSupportedProfiles()
            java.util.Set r0 = profileSetToDynamicRangeSet(r0)
            return r0
    }

    @Override // androidx.camera.camera2.internal.compat.params.DynamicRangesCompat.DynamicRangeProfilesCompatImpl
    public boolean isExtraLatencyPresent(@androidx.annotation.NonNull androidx.camera.core.DynamicRange r5) {
            r4 = this;
            java.lang.Long r0 = r4.dynamicRangeToFirstSupportedProfile(r5)
            if (r0 == 0) goto L8
            r1 = 1
            goto L9
        L8:
            r1 = 0
        L9:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "DynamicRange is not supported: "
            r2.append(r3)
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            androidx.core.util.Preconditions.checkArgument(r1, r5)
            android.hardware.camera2.params.DynamicRangeProfiles r5 = r4.mDynamicRangeProfiles
            long r0 = r0.longValue()
            boolean r5 = r5.isExtraLatencyPresent(r0)
            return r5
    }

    @Override // androidx.camera.camera2.internal.compat.params.DynamicRangesCompat.DynamicRangeProfilesCompatImpl
    @androidx.annotation.Nullable
    public android.hardware.camera2.params.DynamicRangeProfiles unwrap() {
            r1 = this;
            android.hardware.camera2.params.DynamicRangeProfiles r0 = r1.mDynamicRangeProfiles
            return r0
    }
}

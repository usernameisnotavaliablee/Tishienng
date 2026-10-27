package androidx.camera.camera2.internal.compat.workaround;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class OutputSizesCorrector {
    private static final java.lang.String TAG = "OutputSizesCorrector";
    private final java.lang.String mCameraId;
    private final androidx.camera.camera2.internal.compat.workaround.ExcludedSupportedSizesContainer mExcludedSupportedSizesContainer;
    private final androidx.camera.camera2.internal.compat.quirk.ExtraSupportedOutputSizeQuirk mExtraSupportedOutputSizeQuirk;

    public OutputSizesCorrector(@androidx.annotation.NonNull java.lang.String r2) {
            r1 = this;
            r1.<init>()
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.ExtraSupportedOutputSizeQuirk> r0 = androidx.camera.camera2.internal.compat.quirk.ExtraSupportedOutputSizeQuirk.class
            androidx.camera.core.impl.Quirk r0 = androidx.camera.camera2.internal.compat.quirk.DeviceQuirks.get(r0)
            androidx.camera.camera2.internal.compat.quirk.ExtraSupportedOutputSizeQuirk r0 = (androidx.camera.camera2.internal.compat.quirk.ExtraSupportedOutputSizeQuirk) r0
            r1.mExtraSupportedOutputSizeQuirk = r0
            r1.mCameraId = r2
            androidx.camera.camera2.internal.compat.workaround.ExcludedSupportedSizesContainer r0 = new androidx.camera.camera2.internal.compat.workaround.ExcludedSupportedSizesContainer
            r0.<init>(r2)
            r1.mExcludedSupportedSizesContainer = r0
            return
    }

    private void addExtraSupportedOutputSizesByClass(@androidx.annotation.NonNull java.util.List<android.util.Size> r2, @androidx.annotation.NonNull java.lang.Class<?> r3) {
            r1 = this;
            androidx.camera.camera2.internal.compat.quirk.ExtraSupportedOutputSizeQuirk r0 = r1.mExtraSupportedOutputSizeQuirk
            if (r0 != 0) goto L5
            goto L13
        L5:
            android.util.Size[] r3 = r0.getExtraSupportedResolutions(r3)
            int r0 = r3.length
            if (r0 <= 0) goto L13
            java.util.List r3 = java.util.Arrays.asList(r3)
            r2.addAll(r3)
        L13:
            return
    }

    private void addExtraSupportedOutputSizesByFormat(@androidx.annotation.NonNull java.util.List<android.util.Size> r2, int r3) {
            r1 = this;
            androidx.camera.camera2.internal.compat.quirk.ExtraSupportedOutputSizeQuirk r0 = r1.mExtraSupportedOutputSizeQuirk
            if (r0 != 0) goto L5
            goto L13
        L5:
            android.util.Size[] r3 = r0.getExtraSupportedResolutions(r3)
            int r0 = r3.length
            if (r0 <= 0) goto L13
            java.util.List r3 = java.util.Arrays.asList(r3)
            r2.addAll(r3)
        L13:
            return
    }

    private void excludeProblematicOutputSizesByClass(@androidx.annotation.NonNull java.util.List<android.util.Size> r2, @androidx.annotation.NonNull java.lang.Class<?> r3) {
            r1 = this;
            androidx.camera.camera2.internal.compat.workaround.ExcludedSupportedSizesContainer r0 = r1.mExcludedSupportedSizesContainer
            java.util.List r3 = r0.get(r3)
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto Ld
            return
        Ld:
            r2.removeAll(r3)
            return
    }

    private void excludeProblematicOutputSizesByFormat(@androidx.annotation.NonNull java.util.List<android.util.Size> r2, int r3) {
            r1 = this;
            androidx.camera.camera2.internal.compat.workaround.ExcludedSupportedSizesContainer r0 = r1.mExcludedSupportedSizesContainer
            java.util.List r3 = r0.get(r3)
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto Ld
            return
        Ld:
            r2.removeAll(r3)
            return
    }

    @androidx.annotation.NonNull
    public android.util.Size[] applyQuirks(@androidx.annotation.NonNull android.util.Size[] r2, int r3) {
            r1 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List r2 = java.util.Arrays.asList(r2)
            r0.<init>(r2)
            r1.addExtraSupportedOutputSizesByFormat(r0, r3)
            r1.excludeProblematicOutputSizesByFormat(r0, r3)
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L1c
            java.lang.String r2 = "OutputSizesCorrector"
            java.lang.String r3 = "Sizes array becomes empty after excluding problematic output sizes."
            androidx.camera.core.Logger.w(r2, r3)
        L1c:
            r2 = 0
            android.util.Size[] r2 = new android.util.Size[r2]
            java.lang.Object[] r2 = r0.toArray(r2)
            android.util.Size[] r2 = (android.util.Size[]) r2
            return r2
    }

    @androidx.annotation.NonNull
    public <T> android.util.Size[] applyQuirks(@androidx.annotation.NonNull android.util.Size[] r2, @androidx.annotation.NonNull java.lang.Class<T> r3) {
            r1 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List r2 = java.util.Arrays.asList(r2)
            r0.<init>(r2)
            r1.addExtraSupportedOutputSizesByClass(r0, r3)
            r1.excludeProblematicOutputSizesByClass(r0, r3)
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L1c
            java.lang.String r2 = "OutputSizesCorrector"
            java.lang.String r3 = "Sizes array becomes empty after excluding problematic output sizes."
            androidx.camera.core.Logger.w(r2, r3)
        L1c:
            r2 = 0
            android.util.Size[] r2 = new android.util.Size[r2]
            java.lang.Object[] r2 = r0.toArray(r2)
            android.util.Size[] r2 = (android.util.Size[]) r2
            return r2
    }
}

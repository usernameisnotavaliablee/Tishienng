package androidx.camera.camera2.internal.compat.workaround;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class ExtraSupportedSurfaceCombinationsContainer {
    private final androidx.camera.camera2.internal.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk mQuirk;

    public ExtraSupportedSurfaceCombinationsContainer() {
            r1 = this;
            r1.<init>()
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk> r0 = androidx.camera.camera2.internal.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk.class
            androidx.camera.core.impl.Quirk r0 = androidx.camera.camera2.internal.compat.quirk.DeviceQuirks.get(r0)
            androidx.camera.camera2.internal.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk r0 = (androidx.camera.camera2.internal.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk) r0
            r1.mQuirk = r0
            return
    }

    @androidx.annotation.NonNull
    public java.util.List<androidx.camera.core.impl.SurfaceCombination> get(@androidx.annotation.NonNull java.lang.String r2, int r3) {
            r1 = this;
            androidx.camera.camera2.internal.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk r0 = r1.mQuirk
            if (r0 != 0) goto La
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            return r2
        La:
            java.util.List r2 = r0.getExtraSupportedSurfaceCombinations(r2, r3)
            return r2
    }
}

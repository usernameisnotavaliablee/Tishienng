package androidx.camera.camera2.internal.compat.workaround;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class ResolutionCorrector {

    @androidx.annotation.Nullable
    private final androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk mExtraCroppingQuirk;

    public ResolutionCorrector() {
            r1 = this;
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk> r0 = androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk.class
            androidx.camera.core.impl.Quirk r0 = androidx.camera.camera2.internal.compat.quirk.DeviceQuirks.get(r0)
            androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk r0 = (androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk) r0
            r1.<init>(r0)
            return
    }

    @androidx.annotation.VisibleForTesting
    ResolutionCorrector(@androidx.annotation.Nullable androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk r1) {
            r0 = this;
            r0.<init>()
            r0.mExtraCroppingQuirk = r1
            return
    }

    @androidx.annotation.NonNull
    public java.util.List<android.util.Size> insertOrPrioritize(@androidx.annotation.NonNull androidx.camera.core.impl.SurfaceConfig.ConfigType r4, @androidx.annotation.NonNull java.util.List<android.util.Size> r5) {
            r3 = this;
            androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk r0 = r3.mExtraCroppingQuirk
            if (r0 != 0) goto L5
            goto Lb
        L5:
            android.util.Size r4 = r0.getVerifiedResolution(r4)
            if (r4 != 0) goto Lc
        Lb:
            return r5
        Lc:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.add(r4)
            java.util.Iterator r5 = r5.iterator()
        L18:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L2e
            java.lang.Object r1 = r5.next()
            android.util.Size r1 = (android.util.Size) r1
            boolean r2 = r1.equals(r4)
            if (r2 != 0) goto L18
            r0.add(r1)
            goto L18
        L2e:
            return r0
    }
}

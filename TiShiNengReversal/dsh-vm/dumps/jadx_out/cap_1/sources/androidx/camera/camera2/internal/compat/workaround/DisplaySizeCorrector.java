package androidx.camera.camera2.internal.compat.workaround;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class DisplaySizeCorrector {

    @androidx.annotation.Nullable
    private final androidx.camera.camera2.internal.compat.quirk.SmallDisplaySizeQuirk mSmallDisplaySizeQuirk;

    public DisplaySizeCorrector() {
            r1 = this;
            r1.<init>()
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.SmallDisplaySizeQuirk> r0 = androidx.camera.camera2.internal.compat.quirk.SmallDisplaySizeQuirk.class
            androidx.camera.core.impl.Quirk r0 = androidx.camera.camera2.internal.compat.quirk.DeviceQuirks.get(r0)
            androidx.camera.camera2.internal.compat.quirk.SmallDisplaySizeQuirk r0 = (androidx.camera.camera2.internal.compat.quirk.SmallDisplaySizeQuirk) r0
            r1.mSmallDisplaySizeQuirk = r0
            return
    }

    @androidx.annotation.Nullable
    public android.util.Size getDisplaySize() {
            r1 = this;
            androidx.camera.camera2.internal.compat.quirk.SmallDisplaySizeQuirk r0 = r1.mSmallDisplaySizeQuirk
            if (r0 == 0) goto L9
            android.util.Size r0 = r0.getDisplaySize()
            return r0
        L9:
            r0 = 0
            return r0
    }
}

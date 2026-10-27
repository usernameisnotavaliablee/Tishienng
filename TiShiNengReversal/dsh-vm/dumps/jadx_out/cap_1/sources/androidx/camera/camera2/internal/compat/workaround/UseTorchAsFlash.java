package androidx.camera.camera2.internal.compat.workaround;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class UseTorchAsFlash {
    private final boolean mHasUseTorchAsFlashQuirk;

    public UseTorchAsFlash(@androidx.annotation.NonNull androidx.camera.core.impl.Quirks r2) {
            r1 = this;
            r1.<init>()
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.UseTorchAsFlashQuirk> r0 = androidx.camera.camera2.internal.compat.quirk.UseTorchAsFlashQuirk.class
            boolean r2 = r2.contains(r0)
            r1.mHasUseTorchAsFlashQuirk = r2
            return
    }

    public boolean shouldUseTorchAsFlash() {
            r1 = this;
            boolean r0 = r1.mHasUseTorchAsFlashQuirk
            return r0
    }
}

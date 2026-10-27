package androidx.camera.core.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public interface EncoderProfilesProvider {
    public static final androidx.camera.core.impl.EncoderProfilesProvider EMPTY = null;


    static {
            androidx.camera.core.impl.EncoderProfilesProvider$1 r0 = new androidx.camera.core.impl.EncoderProfilesProvider$1
            r0.<init>()
            androidx.camera.core.impl.EncoderProfilesProvider.EMPTY = r0
            return
    }

    @androidx.annotation.Nullable
    androidx.camera.core.impl.EncoderProfilesProxy getAll(int r1);

    boolean hasProfile(int r1);
}

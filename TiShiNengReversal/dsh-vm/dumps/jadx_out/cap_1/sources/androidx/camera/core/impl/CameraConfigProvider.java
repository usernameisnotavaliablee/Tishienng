package androidx.camera.core.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public interface CameraConfigProvider {
    public static final androidx.camera.core.impl.CameraConfigProvider EMPTY = null;

    static {
            androidx.camera.core.impl.c r0 = new androidx.camera.core.impl.c
            r0.<init>()
            androidx.camera.core.impl.CameraConfigProvider.EMPTY = r0
            return
    }

    @androidx.annotation.Nullable
    androidx.camera.core.impl.CameraConfig getConfig(@androidx.annotation.NonNull androidx.camera.core.CameraInfo r1, @androidx.annotation.NonNull android.content.Context r2);
}

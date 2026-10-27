package androidx.camera.video.internal.compat;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(26)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class Api26Impl {
    private Api26Impl() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    @androidx.annotation.DoNotInline
    public static android.media.MediaMuxer createMediaMuxer(@androidx.annotation.NonNull java.io.FileDescriptor r1, int r2) throws java.io.IOException {
            android.media.MediaMuxer r0 = new android.media.MediaMuxer
            r0.<init>(r1, r2)
            return r0
    }
}

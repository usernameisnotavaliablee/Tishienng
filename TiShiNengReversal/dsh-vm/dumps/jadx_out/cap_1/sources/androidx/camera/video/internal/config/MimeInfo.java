package androidx.camera.video.internal.config;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public abstract class MimeInfo {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static abstract class Builder<B> {
        public Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.NonNull
        public abstract androidx.camera.video.internal.config.MimeInfo build();

        @androidx.annotation.NonNull
        protected abstract B setMimeType(@androidx.annotation.NonNull java.lang.String r1);

        @androidx.annotation.NonNull
        public abstract B setProfile(int r1);
    }

    public MimeInfo() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    public abstract java.lang.String getMimeType();

    public abstract int getProfile();
}

package android.support.v4.media;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(23)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class MediaDescriptionCompatApi23 {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class Builder {
        private Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        public static void setMediaUri(java.lang.Object r0, android.net.Uri r1) {
                android.media.MediaDescription$Builder r0 = (android.media.MediaDescription.Builder) r0
                android.support.v4.media.f.a(r0, r1)
                return
        }
    }

    private MediaDescriptionCompatApi23() {
            r0 = this;
            r0.<init>()
            return
    }

    public static android.net.Uri getMediaUri(java.lang.Object r0) {
            android.media.MediaDescription r0 = (android.media.MediaDescription) r0
            android.net.Uri r0 = android.support.v4.media.e.a(r0)
            return r0
    }
}

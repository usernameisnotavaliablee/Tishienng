package android.support.v4.media.session;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(23)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class MediaSessionCompatApi23 {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface Callback extends android.support.v4.media.session.MediaSessionCompatApi21.Callback {
        void onPlayFromUri(android.net.Uri r1, android.os.Bundle r2);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class CallbackProxy<T extends android.support.v4.media.session.MediaSessionCompatApi23.Callback> extends android.support.v4.media.session.MediaSessionCompatApi21.CallbackProxy<T> {
        public CallbackProxy(T r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // android.media.session.MediaSession.Callback
        public void onPlayFromUri(android.net.Uri r2, android.os.Bundle r3) {
                r1 = this;
                android.support.v4.media.session.MediaSessionCompat.ensureClassLoader(r3)
                T extends android.support.v4.media.session.MediaSessionCompatApi21$Callback r0 = r1.mCallback
                android.support.v4.media.session.MediaSessionCompatApi23$Callback r0 = (android.support.v4.media.session.MediaSessionCompatApi23.Callback) r0
                r0.onPlayFromUri(r2, r3)
                return
        }
    }

    private MediaSessionCompatApi23() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.Object createCallback(android.support.v4.media.session.MediaSessionCompatApi23.Callback r1) {
            android.support.v4.media.session.MediaSessionCompatApi23$CallbackProxy r0 = new android.support.v4.media.session.MediaSessionCompatApi23$CallbackProxy
            r0.<init>(r1)
            return r0
    }
}

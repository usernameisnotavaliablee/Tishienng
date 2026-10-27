package android.support.v4.media.session;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(24)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class MediaSessionCompatApi24 {
    private static final java.lang.String TAG = "MediaSessionCompatApi24";

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface Callback extends android.support.v4.media.session.MediaSessionCompatApi23.Callback {
        void onPrepare();

        void onPrepareFromMediaId(java.lang.String r1, android.os.Bundle r2);

        void onPrepareFromSearch(java.lang.String r1, android.os.Bundle r2);

        void onPrepareFromUri(android.net.Uri r1, android.os.Bundle r2);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class CallbackProxy<T extends android.support.v4.media.session.MediaSessionCompatApi24.Callback> extends android.support.v4.media.session.MediaSessionCompatApi23.CallbackProxy<T> {
        public CallbackProxy(T r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // android.media.session.MediaSession.Callback
        public void onPrepare() {
                r1 = this;
                T extends android.support.v4.media.session.MediaSessionCompatApi21$Callback r0 = r1.mCallback
                android.support.v4.media.session.MediaSessionCompatApi24$Callback r0 = (android.support.v4.media.session.MediaSessionCompatApi24.Callback) r0
                r0.onPrepare()
                return
        }

        @Override // android.media.session.MediaSession.Callback
        public void onPrepareFromMediaId(java.lang.String r2, android.os.Bundle r3) {
                r1 = this;
                android.support.v4.media.session.MediaSessionCompat.ensureClassLoader(r3)
                T extends android.support.v4.media.session.MediaSessionCompatApi21$Callback r0 = r1.mCallback
                android.support.v4.media.session.MediaSessionCompatApi24$Callback r0 = (android.support.v4.media.session.MediaSessionCompatApi24.Callback) r0
                r0.onPrepareFromMediaId(r2, r3)
                return
        }

        @Override // android.media.session.MediaSession.Callback
        public void onPrepareFromSearch(java.lang.String r2, android.os.Bundle r3) {
                r1 = this;
                android.support.v4.media.session.MediaSessionCompat.ensureClassLoader(r3)
                T extends android.support.v4.media.session.MediaSessionCompatApi21$Callback r0 = r1.mCallback
                android.support.v4.media.session.MediaSessionCompatApi24$Callback r0 = (android.support.v4.media.session.MediaSessionCompatApi24.Callback) r0
                r0.onPrepareFromSearch(r2, r3)
                return
        }

        @Override // android.media.session.MediaSession.Callback
        public void onPrepareFromUri(android.net.Uri r2, android.os.Bundle r3) {
                r1 = this;
                android.support.v4.media.session.MediaSessionCompat.ensureClassLoader(r3)
                T extends android.support.v4.media.session.MediaSessionCompatApi21$Callback r0 = r1.mCallback
                android.support.v4.media.session.MediaSessionCompatApi24$Callback r0 = (android.support.v4.media.session.MediaSessionCompatApi24.Callback) r0
                r0.onPrepareFromUri(r2, r3)
                return
        }
    }

    private MediaSessionCompatApi24() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.Object createCallback(android.support.v4.media.session.MediaSessionCompatApi24.Callback r1) {
            android.support.v4.media.session.MediaSessionCompatApi24$CallbackProxy r0 = new android.support.v4.media.session.MediaSessionCompatApi24$CallbackProxy
            r0.<init>(r1)
            return r0
    }

    public static java.lang.String getCallingPackage(java.lang.Object r3) {
            android.media.session.MediaSession r3 = (android.media.session.MediaSession) r3
            r0 = 0
            java.lang.Class r1 = r3.getClass()     // Catch: java.lang.Throwable -> L14
            java.lang.String r2 = "getCallingPackage"
            java.lang.reflect.Method r1 = r1.getMethod(r2, r0)     // Catch: java.lang.Throwable -> L14
            java.lang.Object r3 = r1.invoke(r3, r0)     // Catch: java.lang.Throwable -> L14
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L14
            return r3
        L14:
            return r0
    }
}

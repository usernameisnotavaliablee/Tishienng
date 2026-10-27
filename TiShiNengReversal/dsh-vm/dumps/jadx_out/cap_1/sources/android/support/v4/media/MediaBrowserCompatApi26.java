package android.support.v4.media;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(26)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class MediaBrowserCompatApi26 {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    interface SubscriptionCallback extends android.support.v4.media.MediaBrowserCompatApi21.SubscriptionCallback {
        void onChildrenLoaded(@androidx.annotation.NonNull java.lang.String r1, java.util.List<?> r2, @androidx.annotation.NonNull android.os.Bundle r3);

        void onError(@androidx.annotation.NonNull java.lang.String r1, @androidx.annotation.NonNull android.os.Bundle r2);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class SubscriptionCallbackProxy<T extends android.support.v4.media.MediaBrowserCompatApi26.SubscriptionCallback> extends android.support.v4.media.MediaBrowserCompatApi21.SubscriptionCallbackProxy<T> {
        SubscriptionCallbackProxy(T r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // android.media.browse.MediaBrowser.SubscriptionCallback
        public void onChildrenLoaded(@androidx.annotation.NonNull java.lang.String r2, java.util.List<android.media.browse.MediaBrowser.MediaItem> r3, @androidx.annotation.NonNull android.os.Bundle r4) {
                r1 = this;
                android.support.v4.media.session.MediaSessionCompat.ensureClassLoader(r4)
                T extends android.support.v4.media.MediaBrowserCompatApi21$SubscriptionCallback r0 = r1.mSubscriptionCallback
                android.support.v4.media.MediaBrowserCompatApi26$SubscriptionCallback r0 = (android.support.v4.media.MediaBrowserCompatApi26.SubscriptionCallback) r0
                r0.onChildrenLoaded(r2, r3, r4)
                return
        }

        @Override // android.media.browse.MediaBrowser.SubscriptionCallback
        public void onError(@androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.NonNull android.os.Bundle r3) {
                r1 = this;
                android.support.v4.media.session.MediaSessionCompat.ensureClassLoader(r3)
                T extends android.support.v4.media.MediaBrowserCompatApi21$SubscriptionCallback r0 = r1.mSubscriptionCallback
                android.support.v4.media.MediaBrowserCompatApi26$SubscriptionCallback r0 = (android.support.v4.media.MediaBrowserCompatApi26.SubscriptionCallback) r0
                r0.onError(r2, r3)
                return
        }
    }

    private MediaBrowserCompatApi26() {
            r0 = this;
            r0.<init>()
            return
    }

    static java.lang.Object createSubscriptionCallback(android.support.v4.media.MediaBrowserCompatApi26.SubscriptionCallback r1) {
            android.support.v4.media.MediaBrowserCompatApi26$SubscriptionCallbackProxy r0 = new android.support.v4.media.MediaBrowserCompatApi26$SubscriptionCallbackProxy
            r0.<init>(r1)
            return r0
    }

    public static void subscribe(java.lang.Object r0, java.lang.String r1, android.os.Bundle r2, java.lang.Object r3) {
            android.media.browse.MediaBrowser r0 = (android.media.browse.MediaBrowser) r0
            android.media.browse.MediaBrowser$SubscriptionCallback r3 = (android.media.browse.MediaBrowser.SubscriptionCallback) r3
            android.support.v4.media.d.a(r0, r1, r2, r3)
            return
    }

    public static void unsubscribe(java.lang.Object r0, java.lang.String r1, java.lang.Object r2) {
            android.media.browse.MediaBrowser r0 = (android.media.browse.MediaBrowser) r0
            android.media.browse.MediaBrowser$SubscriptionCallback r2 = (android.media.browse.MediaBrowser.SubscriptionCallback) r2
            android.support.v4.media.c.a(r0, r1, r2)
            return
    }
}

package android.support.v4.media;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class MediaBrowserCompatApi21 {
    static final java.lang.String NULL_MEDIA_ITEM_ID = "android.support.v4.media.MediaBrowserCompat.NULL_MEDIA_ITEM";

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    interface ConnectionCallback {
        void onConnected();

        void onConnectionFailed();

        void onConnectionSuspended();
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class ConnectionCallbackProxy<T extends android.support.v4.media.MediaBrowserCompatApi21.ConnectionCallback> extends android.media.browse.MediaBrowser.ConnectionCallback {
        protected final T mConnectionCallback;

        public ConnectionCallbackProxy(T r1) {
                r0 = this;
                r0.<init>()
                r0.mConnectionCallback = r1
                return
        }

        @Override // android.media.browse.MediaBrowser.ConnectionCallback
        public void onConnected() {
                r1 = this;
                T extends android.support.v4.media.MediaBrowserCompatApi21$ConnectionCallback r0 = r1.mConnectionCallback
                r0.onConnected()
                return
        }

        @Override // android.media.browse.MediaBrowser.ConnectionCallback
        public void onConnectionFailed() {
                r1 = this;
                T extends android.support.v4.media.MediaBrowserCompatApi21$ConnectionCallback r0 = r1.mConnectionCallback
                r0.onConnectionFailed()
                return
        }

        @Override // android.media.browse.MediaBrowser.ConnectionCallback
        public void onConnectionSuspended() {
                r1 = this;
                T extends android.support.v4.media.MediaBrowserCompatApi21$ConnectionCallback r0 = r1.mConnectionCallback
                r0.onConnectionSuspended()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class MediaItem {
        private MediaItem() {
                r0 = this;
                r0.<init>()
                return
        }

        public static java.lang.Object getDescription(java.lang.Object r0) {
                android.media.browse.MediaBrowser$MediaItem r0 = (android.media.browse.MediaBrowser.MediaItem) r0
                android.media.MediaDescription r0 = r0.getDescription()
                return r0
        }

        public static int getFlags(java.lang.Object r0) {
                android.media.browse.MediaBrowser$MediaItem r0 = (android.media.browse.MediaBrowser.MediaItem) r0
                int r0 = r0.getFlags()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    interface SubscriptionCallback {
        void onChildrenLoaded(@androidx.annotation.NonNull java.lang.String r1, java.util.List<?> r2);

        void onError(@androidx.annotation.NonNull java.lang.String r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class SubscriptionCallbackProxy<T extends android.support.v4.media.MediaBrowserCompatApi21.SubscriptionCallback> extends android.media.browse.MediaBrowser.SubscriptionCallback {
        protected final T mSubscriptionCallback;

        public SubscriptionCallbackProxy(T r1) {
                r0 = this;
                r0.<init>()
                r0.mSubscriptionCallback = r1
                return
        }

        @Override // android.media.browse.MediaBrowser.SubscriptionCallback
        public void onChildrenLoaded(@androidx.annotation.NonNull java.lang.String r2, java.util.List<android.media.browse.MediaBrowser.MediaItem> r3) {
                r1 = this;
                T extends android.support.v4.media.MediaBrowserCompatApi21$SubscriptionCallback r0 = r1.mSubscriptionCallback
                r0.onChildrenLoaded(r2, r3)
                return
        }

        @Override // android.media.browse.MediaBrowser.SubscriptionCallback
        public void onError(@androidx.annotation.NonNull java.lang.String r2) {
                r1 = this;
                T extends android.support.v4.media.MediaBrowserCompatApi21$SubscriptionCallback r0 = r1.mSubscriptionCallback
                r0.onError(r2)
                return
        }
    }

    private MediaBrowserCompatApi21() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void connect(java.lang.Object r0) {
            android.media.browse.MediaBrowser r0 = (android.media.browse.MediaBrowser) r0
            r0.connect()
            return
    }

    public static java.lang.Object createBrowser(android.content.Context r1, android.content.ComponentName r2, java.lang.Object r3, android.os.Bundle r4) {
            android.media.browse.MediaBrowser r0 = new android.media.browse.MediaBrowser
            android.media.browse.MediaBrowser$ConnectionCallback r3 = (android.media.browse.MediaBrowser.ConnectionCallback) r3
            r0.<init>(r1, r2, r3, r4)
            return r0
    }

    public static java.lang.Object createConnectionCallback(android.support.v4.media.MediaBrowserCompatApi21.ConnectionCallback r1) {
            android.support.v4.media.MediaBrowserCompatApi21$ConnectionCallbackProxy r0 = new android.support.v4.media.MediaBrowserCompatApi21$ConnectionCallbackProxy
            r0.<init>(r1)
            return r0
    }

    public static java.lang.Object createSubscriptionCallback(android.support.v4.media.MediaBrowserCompatApi21.SubscriptionCallback r1) {
            android.support.v4.media.MediaBrowserCompatApi21$SubscriptionCallbackProxy r0 = new android.support.v4.media.MediaBrowserCompatApi21$SubscriptionCallbackProxy
            r0.<init>(r1)
            return r0
    }

    public static void disconnect(java.lang.Object r0) {
            android.media.browse.MediaBrowser r0 = (android.media.browse.MediaBrowser) r0
            r0.disconnect()
            return
    }

    public static android.os.Bundle getExtras(java.lang.Object r0) {
            android.media.browse.MediaBrowser r0 = (android.media.browse.MediaBrowser) r0
            android.os.Bundle r0 = r0.getExtras()
            return r0
    }

    public static java.lang.String getRoot(java.lang.Object r0) {
            android.media.browse.MediaBrowser r0 = (android.media.browse.MediaBrowser) r0
            java.lang.String r0 = r0.getRoot()
            return r0
    }

    public static android.content.ComponentName getServiceComponent(java.lang.Object r0) {
            android.media.browse.MediaBrowser r0 = (android.media.browse.MediaBrowser) r0
            android.content.ComponentName r0 = r0.getServiceComponent()
            return r0
    }

    public static java.lang.Object getSessionToken(java.lang.Object r0) {
            android.media.browse.MediaBrowser r0 = (android.media.browse.MediaBrowser) r0
            android.media.session.MediaSession$Token r0 = r0.getSessionToken()
            return r0
    }

    public static boolean isConnected(java.lang.Object r0) {
            android.media.browse.MediaBrowser r0 = (android.media.browse.MediaBrowser) r0
            boolean r0 = r0.isConnected()
            return r0
    }

    public static void subscribe(java.lang.Object r0, java.lang.String r1, java.lang.Object r2) {
            android.media.browse.MediaBrowser r0 = (android.media.browse.MediaBrowser) r0
            android.media.browse.MediaBrowser$SubscriptionCallback r2 = (android.media.browse.MediaBrowser.SubscriptionCallback) r2
            r0.subscribe(r1, r2)
            return
    }

    public static void unsubscribe(java.lang.Object r0, java.lang.String r1) {
            android.media.browse.MediaBrowser r0 = (android.media.browse.MediaBrowser) r0
            r0.unsubscribe(r1)
            return
    }
}

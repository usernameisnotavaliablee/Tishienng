package android.support.v4.media;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class MediaBrowserCompat {
    public static final java.lang.String CUSTOM_ACTION_DOWNLOAD = "android.support.v4.media.action.DOWNLOAD";
    public static final java.lang.String CUSTOM_ACTION_REMOVE_DOWNLOADED_FILE = "android.support.v4.media.action.REMOVE_DOWNLOADED_FILE";
    static final boolean DEBUG = false;
    public static final java.lang.String EXTRA_DOWNLOAD_PROGRESS = "android.media.browse.extra.DOWNLOAD_PROGRESS";
    public static final java.lang.String EXTRA_MEDIA_ID = "android.media.browse.extra.MEDIA_ID";
    public static final java.lang.String EXTRA_PAGE = "android.media.browse.extra.PAGE";
    public static final java.lang.String EXTRA_PAGE_SIZE = "android.media.browse.extra.PAGE_SIZE";
    static final java.lang.String TAG = "MediaBrowserCompat";
    private final android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl mImpl;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class CallbackHandler extends android.os.Handler {
        private final java.lang.ref.WeakReference<android.support.v4.media.MediaBrowserCompat.MediaBrowserServiceCallbackImpl> mCallbackImplRef;
        private java.lang.ref.WeakReference<android.os.Messenger> mCallbacksMessengerRef;

        CallbackHandler(android.support.v4.media.MediaBrowserCompat.MediaBrowserServiceCallbackImpl r2) {
                r1 = this;
                r1.<init>()
                java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                r0.<init>(r2)
                r1.mCallbackImplRef = r0
                return
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message r9) {
                r8 = this;
                java.lang.ref.WeakReference<android.os.Messenger> r0 = r8.mCallbacksMessengerRef
                if (r0 == 0) goto L83
                java.lang.Object r0 = r0.get()
                if (r0 == 0) goto L83
                java.lang.ref.WeakReference<android.support.v4.media.MediaBrowserCompat$MediaBrowserServiceCallbackImpl> r0 = r8.mCallbackImplRef
                java.lang.Object r0 = r0.get()
                if (r0 != 0) goto L13
                goto L83
            L13:
                android.os.Bundle r0 = r9.getData()
                android.support.v4.media.session.MediaSessionCompat.ensureClassLoader(r0)
                java.lang.ref.WeakReference<android.support.v4.media.MediaBrowserCompat$MediaBrowserServiceCallbackImpl> r1 = r8.mCallbackImplRef
                java.lang.Object r1 = r1.get()
                r2 = r1
                android.support.v4.media.MediaBrowserCompat$MediaBrowserServiceCallbackImpl r2 = (android.support.v4.media.MediaBrowserCompat.MediaBrowserServiceCallbackImpl) r2
                java.lang.ref.WeakReference<android.os.Messenger> r1 = r8.mCallbacksMessengerRef
                java.lang.Object r1 = r1.get()
                r3 = r1
                android.os.Messenger r3 = (android.os.Messenger) r3
                r1 = 1
                int r4 = r9.what     // Catch: android.os.BadParcelableException -> L3d
                java.lang.String r5 = "data_media_item_id"
                if (r4 == r1) goto L63
                r6 = 2
                if (r4 == r6) goto L5f
                r6 = 3
                if (r4 == r6) goto L3f
                r9.toString()     // Catch: android.os.BadParcelableException -> L3d
                return
            L3d:
                goto L7c
            L3f:
                java.lang.String r4 = "data_options"
                android.os.Bundle r6 = r0.getBundle(r4)     // Catch: android.os.BadParcelableException -> L3d
                android.support.v4.media.session.MediaSessionCompat.ensureClassLoader(r6)     // Catch: android.os.BadParcelableException -> L3d
                java.lang.String r4 = "data_notify_children_changed_options"
                android.os.Bundle r7 = r0.getBundle(r4)     // Catch: android.os.BadParcelableException -> L3d
                android.support.v4.media.session.MediaSessionCompat.ensureClassLoader(r7)     // Catch: android.os.BadParcelableException -> L3d
                java.lang.String r4 = r0.getString(r5)     // Catch: android.os.BadParcelableException -> L3d
                java.lang.String r5 = "data_media_item_list"
                java.util.ArrayList r5 = r0.getParcelableArrayList(r5)     // Catch: android.os.BadParcelableException -> L3d
                r2.onLoadChildren(r3, r4, r5, r6, r7)     // Catch: android.os.BadParcelableException -> L3d
                return
            L5f:
                r2.onConnectionFailed(r3)     // Catch: android.os.BadParcelableException -> L3d
                return
            L63:
                java.lang.String r4 = "data_root_hints"
                android.os.Bundle r4 = r0.getBundle(r4)     // Catch: android.os.BadParcelableException -> L3d
                android.support.v4.media.session.MediaSessionCompat.ensureClassLoader(r4)     // Catch: android.os.BadParcelableException -> L3d
                java.lang.String r5 = r0.getString(r5)     // Catch: android.os.BadParcelableException -> L3d
                java.lang.String r6 = "data_media_session_token"
                android.os.Parcelable r0 = r0.getParcelable(r6)     // Catch: android.os.BadParcelableException -> L3d
                android.support.v4.media.session.MediaSessionCompat$Token r0 = (android.support.v4.media.session.MediaSessionCompat.Token) r0     // Catch: android.os.BadParcelableException -> L3d
                r2.onServiceConnected(r3, r5, r0, r4)     // Catch: android.os.BadParcelableException -> L3d
                return
            L7c:
                int r9 = r9.what
                if (r9 != r1) goto L83
                r2.onConnectionFailed(r3)
            L83:
                return
        }

        void setCallbacksMessenger(android.os.Messenger r2) {
                r1 = this;
                java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                r0.<init>(r2)
                r1.mCallbacksMessengerRef = r0
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class ConnectionCallback {
        android.support.v4.media.MediaBrowserCompat.ConnectionCallback.ConnectionCallbackInternal mConnectionCallbackInternal;
        final java.lang.Object mConnectionCallbackObj;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        interface ConnectionCallbackInternal {
            void onConnected();

            void onConnectionFailed();

            void onConnectionSuspended();
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        private class StubApi21 implements android.support.v4.media.MediaBrowserCompatApi21.ConnectionCallback {
            final /* synthetic */ android.support.v4.media.MediaBrowserCompat.ConnectionCallback this$0;

            StubApi21(android.support.v4.media.MediaBrowserCompat.ConnectionCallback r1) {
                    r0 = this;
                    r0.this$0 = r1
                    r0.<init>()
                    return
            }

            @Override // android.support.v4.media.MediaBrowserCompatApi21.ConnectionCallback
            public void onConnected() {
                    r1 = this;
                    android.support.v4.media.MediaBrowserCompat$ConnectionCallback r0 = r1.this$0
                    android.support.v4.media.MediaBrowserCompat$ConnectionCallback$ConnectionCallbackInternal r0 = r0.mConnectionCallbackInternal
                    if (r0 == 0) goto L9
                    r0.onConnected()
                L9:
                    android.support.v4.media.MediaBrowserCompat$ConnectionCallback r0 = r1.this$0
                    r0.onConnected()
                    return
            }

            @Override // android.support.v4.media.MediaBrowserCompatApi21.ConnectionCallback
            public void onConnectionFailed() {
                    r1 = this;
                    android.support.v4.media.MediaBrowserCompat$ConnectionCallback r0 = r1.this$0
                    android.support.v4.media.MediaBrowserCompat$ConnectionCallback$ConnectionCallbackInternal r0 = r0.mConnectionCallbackInternal
                    if (r0 == 0) goto L9
                    r0.onConnectionFailed()
                L9:
                    android.support.v4.media.MediaBrowserCompat$ConnectionCallback r0 = r1.this$0
                    r0.onConnectionFailed()
                    return
            }

            @Override // android.support.v4.media.MediaBrowserCompatApi21.ConnectionCallback
            public void onConnectionSuspended() {
                    r1 = this;
                    android.support.v4.media.MediaBrowserCompat$ConnectionCallback r0 = r1.this$0
                    android.support.v4.media.MediaBrowserCompat$ConnectionCallback$ConnectionCallbackInternal r0 = r0.mConnectionCallbackInternal
                    if (r0 == 0) goto L9
                    r0.onConnectionSuspended()
                L9:
                    android.support.v4.media.MediaBrowserCompat$ConnectionCallback r0 = r1.this$0
                    r0.onConnectionSuspended()
                    return
            }
        }

        public ConnectionCallback() {
                r1 = this;
                r1.<init>()
                android.support.v4.media.MediaBrowserCompat$ConnectionCallback$StubApi21 r0 = new android.support.v4.media.MediaBrowserCompat$ConnectionCallback$StubApi21
                r0.<init>(r1)
                java.lang.Object r0 = android.support.v4.media.MediaBrowserCompatApi21.createConnectionCallback(r0)
                r1.mConnectionCallbackObj = r0
                return
        }

        public void onConnected() {
                r0 = this;
                return
        }

        public void onConnectionFailed() {
                r0 = this;
                return
        }

        public void onConnectionSuspended() {
                r0 = this;
                return
        }

        void setInternalConnectionCallback(android.support.v4.media.MediaBrowserCompat.ConnectionCallback.ConnectionCallbackInternal r1) {
                r0 = this;
                r0.mConnectionCallbackInternal = r1
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static abstract class CustomActionCallback {
        public CustomActionCallback() {
                r0 = this;
                r0.<init>()
                return
        }

        public void onError(java.lang.String r1, android.os.Bundle r2, android.os.Bundle r3) {
                r0 = this;
                return
        }

        public void onProgressUpdate(java.lang.String r1, android.os.Bundle r2, android.os.Bundle r3) {
                r0 = this;
                return
        }

        public void onResult(java.lang.String r1, android.os.Bundle r2, android.os.Bundle r3) {
                r0 = this;
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class CustomActionResultReceiver extends android.support.v4.os.ResultReceiver {
        private final java.lang.String mAction;
        private final android.support.v4.media.MediaBrowserCompat.CustomActionCallback mCallback;
        private final android.os.Bundle mExtras;

        CustomActionResultReceiver(java.lang.String r1, android.os.Bundle r2, android.support.v4.media.MediaBrowserCompat.CustomActionCallback r3, android.os.Handler r4) {
                r0 = this;
                r0.<init>(r4)
                r0.mAction = r1
                r0.mExtras = r2
                r0.mCallback = r3
                return
        }

        @Override // android.support.v4.os.ResultReceiver
        protected void onReceiveResult(int r3, android.os.Bundle r4) {
                r2 = this;
                android.support.v4.media.MediaBrowserCompat$CustomActionCallback r0 = r2.mCallback
                if (r0 != 0) goto L5
                return
            L5:
                android.support.v4.media.session.MediaSessionCompat.ensureClassLoader(r4)
                r0 = -1
                if (r3 == r0) goto L2d
                if (r3 == 0) goto L23
                r0 = 1
                if (r3 == r0) goto L19
                android.os.Bundle r3 = r2.mExtras
                java.util.Objects.toString(r3)
                java.util.Objects.toString(r4)
                return
            L19:
                android.support.v4.media.MediaBrowserCompat$CustomActionCallback r3 = r2.mCallback
                java.lang.String r0 = r2.mAction
                android.os.Bundle r1 = r2.mExtras
                r3.onProgressUpdate(r0, r1, r4)
                return
            L23:
                android.support.v4.media.MediaBrowserCompat$CustomActionCallback r3 = r2.mCallback
                java.lang.String r0 = r2.mAction
                android.os.Bundle r1 = r2.mExtras
                r3.onResult(r0, r1, r4)
                return
            L2d:
                android.support.v4.media.MediaBrowserCompat$CustomActionCallback r3 = r2.mCallback
                java.lang.String r0 = r2.mAction
                android.os.Bundle r1 = r2.mExtras
                r3.onError(r0, r1, r4)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static abstract class ItemCallback {
        final java.lang.Object mItemCallbackObj;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        private class StubApi23 implements android.support.v4.media.MediaBrowserCompatApi23.ItemCallback {
            final /* synthetic */ android.support.v4.media.MediaBrowserCompat.ItemCallback this$0;

            StubApi23(android.support.v4.media.MediaBrowserCompat.ItemCallback r1) {
                    r0 = this;
                    r0.this$0 = r1
                    r0.<init>()
                    return
            }

            @Override // android.support.v4.media.MediaBrowserCompatApi23.ItemCallback
            public void onError(@androidx.annotation.NonNull java.lang.String r2) {
                    r1 = this;
                    android.support.v4.media.MediaBrowserCompat$ItemCallback r0 = r1.this$0
                    r0.onError(r2)
                    return
            }

            @Override // android.support.v4.media.MediaBrowserCompatApi23.ItemCallback
            public void onItemLoaded(android.os.Parcel r2) {
                    r1 = this;
                    if (r2 != 0) goto L9
                    android.support.v4.media.MediaBrowserCompat$ItemCallback r2 = r1.this$0
                    r0 = 0
                    r2.onItemLoaded(r0)
                    return
                L9:
                    r0 = 0
                    r2.setDataPosition(r0)
                    android.os.Parcelable$Creator<android.support.v4.media.MediaBrowserCompat$MediaItem> r0 = android.support.v4.media.MediaBrowserCompat.MediaItem.CREATOR
                    java.lang.Object r0 = r0.createFromParcel(r2)
                    android.support.v4.media.MediaBrowserCompat$MediaItem r0 = (android.support.v4.media.MediaBrowserCompat.MediaItem) r0
                    r2.recycle()
                    android.support.v4.media.MediaBrowserCompat$ItemCallback r2 = r1.this$0
                    r2.onItemLoaded(r0)
                    return
            }
        }

        public ItemCallback() {
                r2 = this;
                r2.<init>()
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 23
                if (r0 < r1) goto L15
                android.support.v4.media.MediaBrowserCompat$ItemCallback$StubApi23 r0 = new android.support.v4.media.MediaBrowserCompat$ItemCallback$StubApi23
                r0.<init>(r2)
                java.lang.Object r0 = android.support.v4.media.MediaBrowserCompatApi23.createItemCallback(r0)
                r2.mItemCallbackObj = r0
                return
            L15:
                r0 = 0
                r2.mItemCallbackObj = r0
                return
        }

        public void onError(@androidx.annotation.NonNull java.lang.String r1) {
                r0 = this;
                return
        }

        public void onItemLoaded(android.support.v4.media.MediaBrowserCompat.MediaItem r1) {
                r0 = this;
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class ItemReceiver extends android.support.v4.os.ResultReceiver {
        private final android.support.v4.media.MediaBrowserCompat.ItemCallback mCallback;
        private final java.lang.String mMediaId;

        ItemReceiver(java.lang.String r1, android.support.v4.media.MediaBrowserCompat.ItemCallback r2, android.os.Handler r3) {
                r0 = this;
                r0.<init>(r3)
                r0.mMediaId = r1
                r0.mCallback = r2
                return
        }

        @Override // android.support.v4.os.ResultReceiver
        protected void onReceiveResult(int r2, android.os.Bundle r3) {
                r1 = this;
                android.support.v4.media.session.MediaSessionCompat.ensureClassLoader(r3)
                if (r2 != 0) goto L2b
                if (r3 == 0) goto L2b
                java.lang.String r2 = "media_item"
                boolean r0 = r3.containsKey(r2)
                if (r0 != 0) goto L10
                goto L2b
            L10:
                android.os.Parcelable r2 = r3.getParcelable(r2)
                if (r2 == 0) goto L23
                boolean r3 = r2 instanceof android.support.v4.media.MediaBrowserCompat.MediaItem
                if (r3 == 0) goto L1b
                goto L23
            L1b:
                android.support.v4.media.MediaBrowserCompat$ItemCallback r2 = r1.mCallback
                java.lang.String r3 = r1.mMediaId
                r2.onError(r3)
                return
            L23:
                android.support.v4.media.MediaBrowserCompat$ItemCallback r3 = r1.mCallback
                android.support.v4.media.MediaBrowserCompat$MediaItem r2 = (android.support.v4.media.MediaBrowserCompat.MediaItem) r2
                r3.onItemLoaded(r2)
                return
            L2b:
                android.support.v4.media.MediaBrowserCompat$ItemCallback r2 = r1.mCallback
                java.lang.String r3 = r1.mMediaId
                r2.onError(r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    interface MediaBrowserImpl {
        void connect();

        void disconnect();

        @androidx.annotation.Nullable
        android.os.Bundle getExtras();

        void getItem(@androidx.annotation.NonNull java.lang.String r1, @androidx.annotation.NonNull android.support.v4.media.MediaBrowserCompat.ItemCallback r2);

        @androidx.annotation.Nullable
        android.os.Bundle getNotifyChildrenChangedOptions();

        @androidx.annotation.NonNull
        java.lang.String getRoot();

        android.content.ComponentName getServiceComponent();

        @androidx.annotation.NonNull
        android.support.v4.media.session.MediaSessionCompat.Token getSessionToken();

        boolean isConnected();

        void search(@androidx.annotation.NonNull java.lang.String r1, android.os.Bundle r2, @androidx.annotation.NonNull android.support.v4.media.MediaBrowserCompat.SearchCallback r3);

        void sendCustomAction(@androidx.annotation.NonNull java.lang.String r1, android.os.Bundle r2, @androidx.annotation.Nullable android.support.v4.media.MediaBrowserCompat.CustomActionCallback r3);

        void subscribe(@androidx.annotation.NonNull java.lang.String r1, @androidx.annotation.Nullable android.os.Bundle r2, @androidx.annotation.NonNull android.support.v4.media.MediaBrowserCompat.SubscriptionCallback r3);

        void unsubscribe(@androidx.annotation.NonNull java.lang.String r1, android.support.v4.media.MediaBrowserCompat.SubscriptionCallback r2);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(21)
    static class MediaBrowserImplApi21 implements android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl, android.support.v4.media.MediaBrowserCompat.MediaBrowserServiceCallbackImpl, android.support.v4.media.MediaBrowserCompat.ConnectionCallback.ConnectionCallbackInternal {
        protected final java.lang.Object mBrowserObj;
        protected android.os.Messenger mCallbacksMessenger;
        final android.content.Context mContext;
        protected final android.support.v4.media.MediaBrowserCompat.CallbackHandler mHandler;
        private android.support.v4.media.session.MediaSessionCompat.Token mMediaSessionToken;
        private android.os.Bundle mNotifyChildrenChangedOptions;
        protected final android.os.Bundle mRootHints;
        protected android.support.v4.media.MediaBrowserCompat.ServiceBinderWrapper mServiceBinderWrapper;
        protected int mServiceVersion;
        private final androidx.collection.ArrayMap<java.lang.String, android.support.v4.media.MediaBrowserCompat.Subscription> mSubscriptions;








        MediaBrowserImplApi21(android.content.Context r3, android.content.ComponentName r4, android.support.v4.media.MediaBrowserCompat.ConnectionCallback r5, android.os.Bundle r6) {
                r2 = this;
                r2.<init>()
                android.support.v4.media.MediaBrowserCompat$CallbackHandler r0 = new android.support.v4.media.MediaBrowserCompat$CallbackHandler
                r0.<init>(r2)
                r2.mHandler = r0
                androidx.collection.ArrayMap r0 = new androidx.collection.ArrayMap
                r0.<init>()
                r2.mSubscriptions = r0
                r2.mContext = r3
                android.os.Bundle r0 = new android.os.Bundle
                if (r6 == 0) goto L1b
                r0.<init>(r6)
                goto L1e
            L1b:
                r0.<init>()
            L1e:
                r2.mRootHints = r0
                java.lang.String r6 = "extra_client_version"
                r1 = 1
                r0.putInt(r6, r1)
                r5.setInternalConnectionCallback(r2)
                java.lang.Object r5 = r5.mConnectionCallbackObj
                java.lang.Object r3 = android.support.v4.media.MediaBrowserCompatApi21.createBrowser(r3, r4, r5, r0)
                r2.mBrowserObj = r3
                return
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void connect() {
                r1 = this;
                java.lang.Object r0 = r1.mBrowserObj
                android.support.v4.media.MediaBrowserCompatApi21.connect(r0)
                return
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void disconnect() {
                r2 = this;
                android.support.v4.media.MediaBrowserCompat$ServiceBinderWrapper r0 = r2.mServiceBinderWrapper
                if (r0 == 0) goto Lb
                android.os.Messenger r1 = r2.mCallbacksMessenger
                if (r1 == 0) goto Lb
                r0.unregisterCallbackMessenger(r1)     // Catch: android.os.RemoteException -> Lb
            Lb:
                java.lang.Object r0 = r2.mBrowserObj
                android.support.v4.media.MediaBrowserCompatApi21.disconnect(r0)
                return
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        @androidx.annotation.Nullable
        public android.os.Bundle getExtras() {
                r1 = this;
                java.lang.Object r0 = r1.mBrowserObj
                android.os.Bundle r0 = android.support.v4.media.MediaBrowserCompatApi21.getExtras(r0)
                return r0
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void getItem(@androidx.annotation.NonNull java.lang.String r4, @androidx.annotation.NonNull android.support.v4.media.MediaBrowserCompat.ItemCallback r5) {
                r3 = this;
                boolean r0 = android.text.TextUtils.isEmpty(r4)
                if (r0 != 0) goto L4c
                if (r5 == 0) goto L44
                java.lang.Object r0 = r3.mBrowserObj
                boolean r0 = android.support.v4.media.MediaBrowserCompatApi21.isConnected(r0)
                if (r0 != 0) goto L1b
                android.support.v4.media.MediaBrowserCompat$CallbackHandler r0 = r3.mHandler
                android.support.v4.media.MediaBrowserCompat$MediaBrowserImplApi21$1 r1 = new android.support.v4.media.MediaBrowserCompat$MediaBrowserImplApi21$1
                r1.<init>(r3, r5, r4)
                r0.post(r1)
                return
            L1b:
                android.support.v4.media.MediaBrowserCompat$ServiceBinderWrapper r0 = r3.mServiceBinderWrapper
                if (r0 != 0) goto L2a
                android.support.v4.media.MediaBrowserCompat$CallbackHandler r0 = r3.mHandler
                android.support.v4.media.MediaBrowserCompat$MediaBrowserImplApi21$2 r1 = new android.support.v4.media.MediaBrowserCompat$MediaBrowserImplApi21$2
                r1.<init>(r3, r5, r4)
                r0.post(r1)
                return
            L2a:
                android.support.v4.media.MediaBrowserCompat$ItemReceiver r0 = new android.support.v4.media.MediaBrowserCompat$ItemReceiver
                android.support.v4.media.MediaBrowserCompat$CallbackHandler r1 = r3.mHandler
                r0.<init>(r4, r5, r1)
                android.support.v4.media.MediaBrowserCompat$ServiceBinderWrapper r1 = r3.mServiceBinderWrapper     // Catch: android.os.RemoteException -> L39
                android.os.Messenger r2 = r3.mCallbacksMessenger     // Catch: android.os.RemoteException -> L39
                r1.getMediaItem(r4, r0, r2)     // Catch: android.os.RemoteException -> L39
                return
            L39:
                android.support.v4.media.MediaBrowserCompat$CallbackHandler r0 = r3.mHandler
                android.support.v4.media.MediaBrowserCompat$MediaBrowserImplApi21$3 r1 = new android.support.v4.media.MediaBrowserCompat$MediaBrowserImplApi21$3
                r1.<init>(r3, r5, r4)
                r0.post(r1)
                return
            L44:
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.String r5 = "cb is null"
                r4.<init>(r5)
                throw r4
            L4c:
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.String r5 = "mediaId is empty"
                r4.<init>(r5)
                throw r4
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public android.os.Bundle getNotifyChildrenChangedOptions() {
                r1 = this;
                android.os.Bundle r0 = r1.mNotifyChildrenChangedOptions
                return r0
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        @androidx.annotation.NonNull
        public java.lang.String getRoot() {
                r1 = this;
                java.lang.Object r0 = r1.mBrowserObj
                java.lang.String r0 = android.support.v4.media.MediaBrowserCompatApi21.getRoot(r0)
                return r0
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public android.content.ComponentName getServiceComponent() {
                r1 = this;
                java.lang.Object r0 = r1.mBrowserObj
                android.content.ComponentName r0 = android.support.v4.media.MediaBrowserCompatApi21.getServiceComponent(r0)
                return r0
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        @androidx.annotation.NonNull
        public android.support.v4.media.session.MediaSessionCompat.Token getSessionToken() {
                r1 = this;
                android.support.v4.media.session.MediaSessionCompat$Token r0 = r1.mMediaSessionToken
                if (r0 != 0) goto L10
                java.lang.Object r0 = r1.mBrowserObj
                java.lang.Object r0 = android.support.v4.media.MediaBrowserCompatApi21.getSessionToken(r0)
                android.support.v4.media.session.MediaSessionCompat$Token r0 = android.support.v4.media.session.MediaSessionCompat.Token.fromToken(r0)
                r1.mMediaSessionToken = r0
            L10:
                android.support.v4.media.session.MediaSessionCompat$Token r0 = r1.mMediaSessionToken
                return r0
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public boolean isConnected() {
                r1 = this;
                java.lang.Object r0 = r1.mBrowserObj
                boolean r0 = android.support.v4.media.MediaBrowserCompatApi21.isConnected(r0)
                return r0
        }

        @Override // android.support.v4.media.MediaBrowserCompat.ConnectionCallback.ConnectionCallbackInternal
        public void onConnected() {
                r4 = this;
                java.lang.Object r0 = r4.mBrowserObj
                android.os.Bundle r0 = android.support.v4.media.MediaBrowserCompatApi21.getExtras(r0)
                if (r0 != 0) goto L9
                goto L54
            L9:
                java.lang.String r1 = "extra_service_version"
                r2 = 0
                int r1 = r0.getInt(r1, r2)
                r4.mServiceVersion = r1
                java.lang.String r1 = "extra_messenger"
                android.os.IBinder r1 = androidx.core.app.BundleCompat.getBinder(r0, r1)
                if (r1 == 0) goto L3c
                android.support.v4.media.MediaBrowserCompat$ServiceBinderWrapper r2 = new android.support.v4.media.MediaBrowserCompat$ServiceBinderWrapper
                android.os.Bundle r3 = r4.mRootHints
                r2.<init>(r1, r3)
                r4.mServiceBinderWrapper = r2
                android.os.Messenger r1 = new android.os.Messenger
                android.support.v4.media.MediaBrowserCompat$CallbackHandler r2 = r4.mHandler
                r1.<init>(r2)
                r4.mCallbacksMessenger = r1
                android.support.v4.media.MediaBrowserCompat$CallbackHandler r2 = r4.mHandler
                r2.setCallbacksMessenger(r1)
                android.support.v4.media.MediaBrowserCompat$ServiceBinderWrapper r1 = r4.mServiceBinderWrapper     // Catch: android.os.RemoteException -> L3b
                android.content.Context r2 = r4.mContext     // Catch: android.os.RemoteException -> L3b
                android.os.Messenger r3 = r4.mCallbacksMessenger     // Catch: android.os.RemoteException -> L3b
                r1.registerCallbackMessenger(r2, r3)     // Catch: android.os.RemoteException -> L3b
                goto L3c
            L3b:
            L3c:
                java.lang.String r1 = "extra_session_binder"
                android.os.IBinder r0 = androidx.core.app.BundleCompat.getBinder(r0, r1)
                android.support.v4.media.session.IMediaSession r0 = android.support.v4.media.session.IMediaSession.Stub.asInterface(r0)
                if (r0 == 0) goto L54
                java.lang.Object r1 = r4.mBrowserObj
                java.lang.Object r1 = android.support.v4.media.MediaBrowserCompatApi21.getSessionToken(r1)
                android.support.v4.media.session.MediaSessionCompat$Token r0 = android.support.v4.media.session.MediaSessionCompat.Token.fromToken(r1, r0)
                r4.mMediaSessionToken = r0
            L54:
                return
        }

        @Override // android.support.v4.media.MediaBrowserCompat.ConnectionCallback.ConnectionCallbackInternal
        public void onConnectionFailed() {
                r0 = this;
                return
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserServiceCallbackImpl
        public void onConnectionFailed(android.os.Messenger r1) {
                r0 = this;
                return
        }

        @Override // android.support.v4.media.MediaBrowserCompat.ConnectionCallback.ConnectionCallbackInternal
        public void onConnectionSuspended() {
                r2 = this;
                r0 = 0
                r2.mServiceBinderWrapper = r0
                r2.mCallbacksMessenger = r0
                r2.mMediaSessionToken = r0
                android.support.v4.media.MediaBrowserCompat$CallbackHandler r1 = r2.mHandler
                r1.setCallbacksMessenger(r0)
                return
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserServiceCallbackImpl
        public void onLoadChildren(android.os.Messenger r2, java.lang.String r3, java.util.List r4, android.os.Bundle r5, android.os.Bundle r6) {
                r1 = this;
                android.os.Messenger r0 = r1.mCallbacksMessenger
                if (r0 == r2) goto L5
                goto L36
            L5:
                androidx.collection.ArrayMap<java.lang.String, android.support.v4.media.MediaBrowserCompat$Subscription> r2 = r1.mSubscriptions
                java.lang.Object r2 = r2.get(r3)
                android.support.v4.media.MediaBrowserCompat$Subscription r2 = (android.support.v4.media.MediaBrowserCompat.Subscription) r2
                if (r2 != 0) goto L12
                boolean r2 = android.support.v4.media.MediaBrowserCompat.DEBUG
                return
            L12:
                android.support.v4.media.MediaBrowserCompat$SubscriptionCallback r2 = r2.getCallback(r5)
                if (r2 == 0) goto L36
                r0 = 0
                if (r5 != 0) goto L29
                if (r4 != 0) goto L21
                r2.onError(r3)
                return
            L21:
                r1.mNotifyChildrenChangedOptions = r6
                r2.onChildrenLoaded(r3, r4)
                r1.mNotifyChildrenChangedOptions = r0
                return
            L29:
                if (r4 != 0) goto L2f
                r2.onError(r3, r5)
                return
            L2f:
                r1.mNotifyChildrenChangedOptions = r6
                r2.onChildrenLoaded(r3, r4, r5)
                r1.mNotifyChildrenChangedOptions = r0
            L36:
                return
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserServiceCallbackImpl
        public void onServiceConnected(android.os.Messenger r1, java.lang.String r2, android.support.v4.media.session.MediaSessionCompat.Token r3, android.os.Bundle r4) {
                r0 = this;
                return
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void search(@androidx.annotation.NonNull java.lang.String r4, android.os.Bundle r5, @androidx.annotation.NonNull android.support.v4.media.MediaBrowserCompat.SearchCallback r6) {
                r3 = this;
                boolean r0 = r3.isConnected()
                if (r0 == 0) goto L2f
                android.support.v4.media.MediaBrowserCompat$ServiceBinderWrapper r0 = r3.mServiceBinderWrapper
                if (r0 != 0) goto L15
                android.support.v4.media.MediaBrowserCompat$CallbackHandler r0 = r3.mHandler
                android.support.v4.media.MediaBrowserCompat$MediaBrowserImplApi21$4 r1 = new android.support.v4.media.MediaBrowserCompat$MediaBrowserImplApi21$4
                r1.<init>(r3, r6, r4, r5)
                r0.post(r1)
                return
            L15:
                android.support.v4.media.MediaBrowserCompat$SearchResultReceiver r0 = new android.support.v4.media.MediaBrowserCompat$SearchResultReceiver
                android.support.v4.media.MediaBrowserCompat$CallbackHandler r1 = r3.mHandler
                r0.<init>(r4, r5, r6, r1)
                android.support.v4.media.MediaBrowserCompat$ServiceBinderWrapper r1 = r3.mServiceBinderWrapper     // Catch: android.os.RemoteException -> L24
                android.os.Messenger r2 = r3.mCallbacksMessenger     // Catch: android.os.RemoteException -> L24
                r1.search(r4, r5, r0, r2)     // Catch: android.os.RemoteException -> L24
                return
            L24:
                android.support.v4.media.MediaBrowserCompat$CallbackHandler r0 = r3.mHandler
                android.support.v4.media.MediaBrowserCompat$MediaBrowserImplApi21$5 r1 = new android.support.v4.media.MediaBrowserCompat$MediaBrowserImplApi21$5
                r1.<init>(r3, r6, r4, r5)
                r0.post(r1)
                return
            L2f:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "search() called while not connected"
                r4.<init>(r5)
                throw r4
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void sendCustomAction(@androidx.annotation.NonNull java.lang.String r4, android.os.Bundle r5, @androidx.annotation.Nullable android.support.v4.media.MediaBrowserCompat.CustomActionCallback r6) {
                r3 = this;
                boolean r0 = r3.isConnected()
                if (r0 == 0) goto L36
                android.support.v4.media.MediaBrowserCompat$ServiceBinderWrapper r0 = r3.mServiceBinderWrapper
                if (r0 != 0) goto L16
                if (r6 == 0) goto L16
                android.support.v4.media.MediaBrowserCompat$CallbackHandler r0 = r3.mHandler
                android.support.v4.media.MediaBrowserCompat$MediaBrowserImplApi21$6 r1 = new android.support.v4.media.MediaBrowserCompat$MediaBrowserImplApi21$6
                r1.<init>(r3, r6, r4, r5)
                r0.post(r1)
            L16:
                android.support.v4.media.MediaBrowserCompat$CustomActionResultReceiver r0 = new android.support.v4.media.MediaBrowserCompat$CustomActionResultReceiver
                android.support.v4.media.MediaBrowserCompat$CallbackHandler r1 = r3.mHandler
                r0.<init>(r4, r5, r6, r1)
                android.support.v4.media.MediaBrowserCompat$ServiceBinderWrapper r1 = r3.mServiceBinderWrapper     // Catch: android.os.RemoteException -> L25
                android.os.Messenger r2 = r3.mCallbacksMessenger     // Catch: android.os.RemoteException -> L25
                r1.sendCustomAction(r4, r5, r0, r2)     // Catch: android.os.RemoteException -> L25
                return
            L25:
                java.util.Objects.toString(r5)
                if (r6 == 0) goto L35
                android.support.v4.media.MediaBrowserCompat$CallbackHandler r0 = r3.mHandler
                android.support.v4.media.MediaBrowserCompat$MediaBrowserImplApi21$7 r1 = new android.support.v4.media.MediaBrowserCompat$MediaBrowserImplApi21$7
                r1.<init>(r3, r6, r4, r5)
                r0.post(r1)
            L35:
                return
            L36:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Cannot send a custom action ("
                r0.append(r1)
                r0.append(r4)
                java.lang.String r4 = ") with "
                r0.append(r4)
                java.lang.String r4 = "extras "
                r0.append(r4)
                r0.append(r5)
                java.lang.String r4 = " because the browser is not connected to the "
                r0.append(r4)
                java.lang.String r4 = "service."
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                r6.<init>(r4)
                throw r6
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void subscribe(@androidx.annotation.NonNull java.lang.String r3, android.os.Bundle r4, @androidx.annotation.NonNull android.support.v4.media.MediaBrowserCompat.SubscriptionCallback r5) {
                r2 = this;
                androidx.collection.ArrayMap<java.lang.String, android.support.v4.media.MediaBrowserCompat$Subscription> r0 = r2.mSubscriptions
                java.lang.Object r0 = r0.get(r3)
                android.support.v4.media.MediaBrowserCompat$Subscription r0 = (android.support.v4.media.MediaBrowserCompat.Subscription) r0
                if (r0 != 0) goto L14
                android.support.v4.media.MediaBrowserCompat$Subscription r0 = new android.support.v4.media.MediaBrowserCompat$Subscription
                r0.<init>()
                androidx.collection.ArrayMap<java.lang.String, android.support.v4.media.MediaBrowserCompat$Subscription> r1 = r2.mSubscriptions
                r1.put(r3, r0)
            L14:
                r5.setSubscription(r0)
                if (r4 != 0) goto L1b
                r4 = 0
                goto L21
            L1b:
                android.os.Bundle r1 = new android.os.Bundle
                r1.<init>(r4)
                r4 = r1
            L21:
                r0.putCallback(r4, r5)
                android.support.v4.media.MediaBrowserCompat$ServiceBinderWrapper r0 = r2.mServiceBinderWrapper
                if (r0 != 0) goto L30
                java.lang.Object r4 = r2.mBrowserObj
                java.lang.Object r5 = r5.mSubscriptionCallbackObj
                android.support.v4.media.MediaBrowserCompatApi21.subscribe(r4, r3, r5)
                return
            L30:
                android.os.IBinder r5 = r5.mToken     // Catch: android.os.RemoteException -> L37
                android.os.Messenger r1 = r2.mCallbacksMessenger     // Catch: android.os.RemoteException -> L37
                r0.addSubscription(r3, r5, r4, r1)     // Catch: android.os.RemoteException -> L37
            L37:
                return
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void unsubscribe(@androidx.annotation.NonNull java.lang.String r8, android.support.v4.media.MediaBrowserCompat.SubscriptionCallback r9) {
                r7 = this;
                androidx.collection.ArrayMap<java.lang.String, android.support.v4.media.MediaBrowserCompat$Subscription> r0 = r7.mSubscriptions
                java.lang.Object r0 = r0.get(r8)
                android.support.v4.media.MediaBrowserCompat$Subscription r0 = (android.support.v4.media.MediaBrowserCompat.Subscription) r0
                if (r0 != 0) goto Lc
                goto L83
            Lc:
                android.support.v4.media.MediaBrowserCompat$ServiceBinderWrapper r1 = r7.mServiceBinderWrapper
                if (r1 != 0) goto L43
                if (r9 != 0) goto L18
                java.lang.Object r1 = r7.mBrowserObj
                android.support.v4.media.MediaBrowserCompatApi21.unsubscribe(r1, r8)
                goto L76
            L18:
                java.util.List r1 = r0.getCallbacks()
                java.util.List r2 = r0.getOptionsList()
                int r3 = r1.size()
                int r3 = r3 + (-1)
            L26:
                if (r3 < 0) goto L37
                java.lang.Object r4 = r1.get(r3)
                if (r4 != r9) goto L34
                r1.remove(r3)
                r2.remove(r3)
            L34:
                int r3 = r3 + (-1)
                goto L26
            L37:
                int r1 = r1.size()
                if (r1 != 0) goto L76
                java.lang.Object r1 = r7.mBrowserObj
                android.support.v4.media.MediaBrowserCompatApi21.unsubscribe(r1, r8)
                goto L76
            L43:
                if (r9 != 0) goto L4e
                android.os.Messenger r2 = r7.mCallbacksMessenger     // Catch: android.os.RemoteException -> L4c
                r3 = 0
                r1.removeSubscription(r8, r3, r2)     // Catch: android.os.RemoteException -> L4c
                goto L76
            L4c:
                goto L76
            L4e:
                java.util.List r1 = r0.getCallbacks()     // Catch: android.os.RemoteException -> L4c
                java.util.List r2 = r0.getOptionsList()     // Catch: android.os.RemoteException -> L4c
                int r3 = r1.size()     // Catch: android.os.RemoteException -> L4c
                int r3 = r3 + (-1)
            L5c:
                if (r3 < 0) goto L76
                java.lang.Object r4 = r1.get(r3)     // Catch: android.os.RemoteException -> L4c
                if (r4 != r9) goto L73
                android.support.v4.media.MediaBrowserCompat$ServiceBinderWrapper r4 = r7.mServiceBinderWrapper     // Catch: android.os.RemoteException -> L4c
                android.os.IBinder r5 = r9.mToken     // Catch: android.os.RemoteException -> L4c
                android.os.Messenger r6 = r7.mCallbacksMessenger     // Catch: android.os.RemoteException -> L4c
                r4.removeSubscription(r8, r5, r6)     // Catch: android.os.RemoteException -> L4c
                r1.remove(r3)     // Catch: android.os.RemoteException -> L4c
                r2.remove(r3)     // Catch: android.os.RemoteException -> L4c
            L73:
                int r3 = r3 + (-1)
                goto L5c
            L76:
                boolean r0 = r0.isEmpty()
                if (r0 != 0) goto L7e
                if (r9 != 0) goto L83
            L7e:
                androidx.collection.ArrayMap<java.lang.String, android.support.v4.media.MediaBrowserCompat$Subscription> r9 = r7.mSubscriptions
                r9.remove(r8)
            L83:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(23)
    static class MediaBrowserImplApi23 extends android.support.v4.media.MediaBrowserCompat.MediaBrowserImplApi21 {
        MediaBrowserImplApi23(android.content.Context r1, android.content.ComponentName r2, android.support.v4.media.MediaBrowserCompat.ConnectionCallback r3, android.os.Bundle r4) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4)
                return
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImplApi21, android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void getItem(@androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.NonNull android.support.v4.media.MediaBrowserCompat.ItemCallback r3) {
                r1 = this;
                android.support.v4.media.MediaBrowserCompat$ServiceBinderWrapper r0 = r1.mServiceBinderWrapper
                if (r0 != 0) goto Lc
                java.lang.Object r0 = r1.mBrowserObj
                java.lang.Object r3 = r3.mItemCallbackObj
                android.support.v4.media.MediaBrowserCompatApi23.getItem(r0, r2, r3)
                return
            Lc:
                super.getItem(r2, r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(26)
    static class MediaBrowserImplApi26 extends android.support.v4.media.MediaBrowserCompat.MediaBrowserImplApi23 {
        MediaBrowserImplApi26(android.content.Context r1, android.content.ComponentName r2, android.support.v4.media.MediaBrowserCompat.ConnectionCallback r3, android.os.Bundle r4) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4)
                return
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImplApi21, android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void subscribe(@androidx.annotation.NonNull java.lang.String r3, @androidx.annotation.Nullable android.os.Bundle r4, @androidx.annotation.NonNull android.support.v4.media.MediaBrowserCompat.SubscriptionCallback r5) {
                r2 = this;
                android.support.v4.media.MediaBrowserCompat$ServiceBinderWrapper r0 = r2.mServiceBinderWrapper
                if (r0 == 0) goto Le
                int r0 = r2.mServiceVersion
                r1 = 2
                if (r0 >= r1) goto La
                goto Le
            La:
                super.subscribe(r3, r4, r5)
                return
            Le:
                if (r4 != 0) goto L18
                java.lang.Object r4 = r2.mBrowserObj
                java.lang.Object r5 = r5.mSubscriptionCallbackObj
                android.support.v4.media.MediaBrowserCompatApi21.subscribe(r4, r3, r5)
                return
            L18:
                java.lang.Object r0 = r2.mBrowserObj
                java.lang.Object r5 = r5.mSubscriptionCallbackObj
                android.support.v4.media.MediaBrowserCompatApi26.subscribe(r0, r3, r4, r5)
                return
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImplApi21, android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void unsubscribe(@androidx.annotation.NonNull java.lang.String r3, android.support.v4.media.MediaBrowserCompat.SubscriptionCallback r4) {
                r2 = this;
                android.support.v4.media.MediaBrowserCompat$ServiceBinderWrapper r0 = r2.mServiceBinderWrapper
                if (r0 == 0) goto Le
                int r0 = r2.mServiceVersion
                r1 = 2
                if (r0 >= r1) goto La
                goto Le
            La:
                super.unsubscribe(r3, r4)
                return
            Le:
                if (r4 != 0) goto L16
                java.lang.Object r4 = r2.mBrowserObj
                android.support.v4.media.MediaBrowserCompatApi21.unsubscribe(r4, r3)
                return
            L16:
                java.lang.Object r0 = r2.mBrowserObj
                java.lang.Object r4 = r4.mSubscriptionCallbackObj
                android.support.v4.media.MediaBrowserCompatApi26.unsubscribe(r0, r3, r4)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class MediaBrowserImplBase implements android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl, android.support.v4.media.MediaBrowserCompat.MediaBrowserServiceCallbackImpl {
        static final int CONNECT_STATE_CONNECTED = 3;
        static final int CONNECT_STATE_CONNECTING = 2;
        static final int CONNECT_STATE_DISCONNECTED = 1;
        static final int CONNECT_STATE_DISCONNECTING = 0;
        static final int CONNECT_STATE_SUSPENDED = 4;
        final android.support.v4.media.MediaBrowserCompat.ConnectionCallback mCallback;
        android.os.Messenger mCallbacksMessenger;
        final android.content.Context mContext;
        private android.os.Bundle mExtras;
        final android.support.v4.media.MediaBrowserCompat.CallbackHandler mHandler;
        private android.support.v4.media.session.MediaSessionCompat.Token mMediaSessionToken;
        private android.os.Bundle mNotifyChildrenChangedOptions;
        final android.os.Bundle mRootHints;
        private java.lang.String mRootId;
        android.support.v4.media.MediaBrowserCompat.ServiceBinderWrapper mServiceBinderWrapper;
        final android.content.ComponentName mServiceComponent;
        android.support.v4.media.MediaBrowserCompat.MediaBrowserImplBase.MediaServiceConnection mServiceConnection;
        int mState;
        private final androidx.collection.ArrayMap<java.lang.String, android.support.v4.media.MediaBrowserCompat.Subscription> mSubscriptions;







        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        private class MediaServiceConnection implements android.content.ServiceConnection {
            final /* synthetic */ android.support.v4.media.MediaBrowserCompat.MediaBrowserImplBase this$0;



            MediaServiceConnection(android.support.v4.media.MediaBrowserCompat.MediaBrowserImplBase r1) {
                    r0 = this;
                    r0.this$0 = r1
                    r0.<init>()
                    return
            }

            private void postOrRun(java.lang.Runnable r3) {
                    r2 = this;
                    java.lang.Thread r0 = java.lang.Thread.currentThread()
                    android.support.v4.media.MediaBrowserCompat$MediaBrowserImplBase r1 = r2.this$0
                    android.support.v4.media.MediaBrowserCompat$CallbackHandler r1 = r1.mHandler
                    android.os.Looper r1 = r1.getLooper()
                    java.lang.Thread r1 = r1.getThread()
                    if (r0 != r1) goto L16
                    r3.run()
                    return
                L16:
                    android.support.v4.media.MediaBrowserCompat$MediaBrowserImplBase r0 = r2.this$0
                    android.support.v4.media.MediaBrowserCompat$CallbackHandler r0 = r0.mHandler
                    r0.post(r3)
                    return
            }

            boolean isCurrent(java.lang.String r3) {
                    r2 = this;
                    android.support.v4.media.MediaBrowserCompat$MediaBrowserImplBase r3 = r2.this$0
                    android.support.v4.media.MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection r0 = r3.mServiceConnection
                    r1 = 1
                    if (r0 != r2) goto Lf
                    int r0 = r3.mState
                    if (r0 == 0) goto Lf
                    if (r0 != r1) goto Le
                    goto Lf
                Le:
                    return r1
                Lf:
                    int r3 = r3.mState
                    if (r3 == 0) goto L26
                    if (r3 == r1) goto L26
                    android.support.v4.media.MediaBrowserCompat$MediaBrowserImplBase r3 = r2.this$0
                    android.content.ComponentName r3 = r3.mServiceComponent
                    java.util.Objects.toString(r3)
                    android.support.v4.media.MediaBrowserCompat$MediaBrowserImplBase r3 = r2.this$0
                    android.support.v4.media.MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection r3 = r3.mServiceConnection
                    java.util.Objects.toString(r3)
                    r2.toString()
                L26:
                    r3 = 0
                    return r3
            }

            @Override // android.content.ServiceConnection
            public void onServiceConnected(android.content.ComponentName r2, android.os.IBinder r3) {
                    r1 = this;
                    android.support.v4.media.MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection$1 r0 = new android.support.v4.media.MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection$1
                    r0.<init>(r1, r2, r3)
                    r1.postOrRun(r0)
                    return
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(android.content.ComponentName r2) {
                    r1 = this;
                    android.support.v4.media.MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection$2 r0 = new android.support.v4.media.MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection$2
                    r0.<init>(r1, r2)
                    r1.postOrRun(r0)
                    return
            }
        }

        public MediaBrowserImplBase(android.content.Context r2, android.content.ComponentName r3, android.support.v4.media.MediaBrowserCompat.ConnectionCallback r4, android.os.Bundle r5) {
                r1 = this;
                r1.<init>()
                android.support.v4.media.MediaBrowserCompat$CallbackHandler r0 = new android.support.v4.media.MediaBrowserCompat$CallbackHandler
                r0.<init>(r1)
                r1.mHandler = r0
                androidx.collection.ArrayMap r0 = new androidx.collection.ArrayMap
                r0.<init>()
                r1.mSubscriptions = r0
                r0 = 1
                r1.mState = r0
                if (r2 == 0) goto L3c
                if (r3 == 0) goto L34
                if (r4 == 0) goto L2c
                r1.mContext = r2
                r1.mServiceComponent = r3
                r1.mCallback = r4
                if (r5 != 0) goto L24
                r2 = 0
                goto L29
            L24:
                android.os.Bundle r2 = new android.os.Bundle
                r2.<init>(r5)
            L29:
                r1.mRootHints = r2
                return
            L2c:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r3 = "connection callback must not be null"
                r2.<init>(r3)
                throw r2
            L34:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r3 = "service component must not be null"
                r2.<init>(r3)
                throw r2
            L3c:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r3 = "context must not be null"
                r2.<init>(r3)
                throw r2
        }

        private static java.lang.String getStateLabel(int r2) {
                if (r2 == 0) goto L2c
                r0 = 1
                if (r2 == r0) goto L29
                r0 = 2
                if (r2 == r0) goto L26
                r0 = 3
                if (r2 == r0) goto L23
                r0 = 4
                if (r2 == r0) goto L20
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "UNKNOWN/"
                r0.append(r1)
                r0.append(r2)
                java.lang.String r2 = r0.toString()
                return r2
            L20:
                java.lang.String r2 = "CONNECT_STATE_SUSPENDED"
                return r2
            L23:
                java.lang.String r2 = "CONNECT_STATE_CONNECTED"
                return r2
            L26:
                java.lang.String r2 = "CONNECT_STATE_CONNECTING"
                return r2
            L29:
                java.lang.String r2 = "CONNECT_STATE_DISCONNECTED"
                return r2
            L2c:
                java.lang.String r2 = "CONNECT_STATE_DISCONNECTING"
                return r2
        }

        private boolean isCurrent(android.os.Messenger r2, java.lang.String r3) {
                r1 = this;
                android.os.Messenger r3 = r1.mCallbacksMessenger
                r0 = 1
                if (r3 != r2) goto Ld
                int r2 = r1.mState
                if (r2 == 0) goto Ld
                if (r2 != r0) goto Lc
                goto Ld
            Lc:
                return r0
            Ld:
                int r2 = r1.mState
                if (r2 == 0) goto L20
                if (r2 == r0) goto L20
                android.content.ComponentName r2 = r1.mServiceComponent
                java.util.Objects.toString(r2)
                android.os.Messenger r2 = r1.mCallbacksMessenger
                java.util.Objects.toString(r2)
                r1.toString()
            L20:
                r2 = 0
                return r2
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void connect() {
                r3 = this;
                int r0 = r3.mState
                if (r0 == 0) goto L2a
                r1 = 1
                if (r0 != r1) goto L8
                goto L2a
            L8:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "connect() called while neigther disconnecting nor disconnected (state="
                r1.append(r2)
                int r2 = r3.mState
                java.lang.String r2 = getStateLabel(r2)
                r1.append(r2)
                java.lang.String r2 = ")"
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L2a:
                r0 = 2
                r3.mState = r0
                android.support.v4.media.MediaBrowserCompat$CallbackHandler r0 = r3.mHandler
                android.support.v4.media.MediaBrowserCompat$MediaBrowserImplBase$1 r1 = new android.support.v4.media.MediaBrowserCompat$MediaBrowserImplBase$1
                r1.<init>(r3)
                r0.post(r1)
                return
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void disconnect() {
                r2 = this;
                r0 = 0
                r2.mState = r0
                android.support.v4.media.MediaBrowserCompat$CallbackHandler r0 = r2.mHandler
                android.support.v4.media.MediaBrowserCompat$MediaBrowserImplBase$2 r1 = new android.support.v4.media.MediaBrowserCompat$MediaBrowserImplBase$2
                r1.<init>(r2)
                r0.post(r1)
                return
        }

        void dump() {
                r1 = this;
                android.content.ComponentName r0 = r1.mServiceComponent
                java.util.Objects.toString(r0)
                android.support.v4.media.MediaBrowserCompat$ConnectionCallback r0 = r1.mCallback
                java.util.Objects.toString(r0)
                android.os.Bundle r0 = r1.mRootHints
                java.util.Objects.toString(r0)
                int r0 = r1.mState
                getStateLabel(r0)
                android.support.v4.media.MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection r0 = r1.mServiceConnection
                java.util.Objects.toString(r0)
                android.support.v4.media.MediaBrowserCompat$ServiceBinderWrapper r0 = r1.mServiceBinderWrapper
                java.util.Objects.toString(r0)
                android.os.Messenger r0 = r1.mCallbacksMessenger
                java.util.Objects.toString(r0)
                android.support.v4.media.session.MediaSessionCompat$Token r0 = r1.mMediaSessionToken
                java.util.Objects.toString(r0)
                return
        }

        void forceCloseConnection() {
                r2 = this;
                android.support.v4.media.MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection r0 = r2.mServiceConnection
                if (r0 == 0) goto L9
                android.content.Context r1 = r2.mContext
                r1.unbindService(r0)
            L9:
                r0 = 1
                r2.mState = r0
                r0 = 0
                r2.mServiceConnection = r0
                r2.mServiceBinderWrapper = r0
                r2.mCallbacksMessenger = r0
                android.support.v4.media.MediaBrowserCompat$CallbackHandler r1 = r2.mHandler
                r1.setCallbacksMessenger(r0)
                r2.mRootId = r0
                r2.mMediaSessionToken = r0
                return
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        @androidx.annotation.Nullable
        public android.os.Bundle getExtras() {
                r3 = this;
                boolean r0 = r3.isConnected()
                if (r0 == 0) goto L9
                android.os.Bundle r0 = r3.mExtras
                return r0
            L9:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "getExtras() called while not connected (state="
                r1.append(r2)
                int r2 = r3.mState
                java.lang.String r2 = getStateLabel(r2)
                r1.append(r2)
                java.lang.String r2 = ")"
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void getItem(@androidx.annotation.NonNull java.lang.String r4, @androidx.annotation.NonNull android.support.v4.media.MediaBrowserCompat.ItemCallback r5) {
                r3 = this;
                boolean r0 = android.text.TextUtils.isEmpty(r4)
                if (r0 != 0) goto L3b
                if (r5 == 0) goto L33
                boolean r0 = r3.isConnected()
                if (r0 != 0) goto L19
                android.support.v4.media.MediaBrowserCompat$CallbackHandler r0 = r3.mHandler
                android.support.v4.media.MediaBrowserCompat$MediaBrowserImplBase$3 r1 = new android.support.v4.media.MediaBrowserCompat$MediaBrowserImplBase$3
                r1.<init>(r3, r5, r4)
                r0.post(r1)
                return
            L19:
                android.support.v4.media.MediaBrowserCompat$ItemReceiver r0 = new android.support.v4.media.MediaBrowserCompat$ItemReceiver
                android.support.v4.media.MediaBrowserCompat$CallbackHandler r1 = r3.mHandler
                r0.<init>(r4, r5, r1)
                android.support.v4.media.MediaBrowserCompat$ServiceBinderWrapper r1 = r3.mServiceBinderWrapper     // Catch: android.os.RemoteException -> L28
                android.os.Messenger r2 = r3.mCallbacksMessenger     // Catch: android.os.RemoteException -> L28
                r1.getMediaItem(r4, r0, r2)     // Catch: android.os.RemoteException -> L28
                return
            L28:
                android.support.v4.media.MediaBrowserCompat$CallbackHandler r0 = r3.mHandler
                android.support.v4.media.MediaBrowserCompat$MediaBrowserImplBase$4 r1 = new android.support.v4.media.MediaBrowserCompat$MediaBrowserImplBase$4
                r1.<init>(r3, r5, r4)
                r0.post(r1)
                return
            L33:
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.String r5 = "cb is null"
                r4.<init>(r5)
                throw r4
            L3b:
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.String r5 = "mediaId is empty"
                r4.<init>(r5)
                throw r4
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public android.os.Bundle getNotifyChildrenChangedOptions() {
                r1 = this;
                android.os.Bundle r0 = r1.mNotifyChildrenChangedOptions
                return r0
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        @androidx.annotation.NonNull
        public java.lang.String getRoot() {
                r3 = this;
                boolean r0 = r3.isConnected()
                if (r0 == 0) goto L9
                java.lang.String r0 = r3.mRootId
                return r0
            L9:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "getRoot() called while not connected(state="
                r1.append(r2)
                int r2 = r3.mState
                java.lang.String r2 = getStateLabel(r2)
                r1.append(r2)
                java.lang.String r2 = ")"
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        @androidx.annotation.NonNull
        public android.content.ComponentName getServiceComponent() {
                r3 = this;
                boolean r0 = r3.isConnected()
                if (r0 == 0) goto L9
                android.content.ComponentName r0 = r3.mServiceComponent
                return r0
            L9:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "getServiceComponent() called while not connected (state="
                r1.append(r2)
                int r2 = r3.mState
                r1.append(r2)
                java.lang.String r2 = ")"
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        @androidx.annotation.NonNull
        public android.support.v4.media.session.MediaSessionCompat.Token getSessionToken() {
                r3 = this;
                boolean r0 = r3.isConnected()
                if (r0 == 0) goto L9
                android.support.v4.media.session.MediaSessionCompat$Token r0 = r3.mMediaSessionToken
                return r0
            L9:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "getSessionToken() called while not connected(state="
                r1.append(r2)
                int r2 = r3.mState
                r1.append(r2)
                java.lang.String r2 = ")"
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public boolean isConnected() {
                r2 = this;
                int r0 = r2.mState
                r1 = 3
                if (r0 != r1) goto L7
                r0 = 1
                return r0
            L7:
                r0 = 0
                return r0
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserServiceCallbackImpl
        public void onConnectionFailed(android.os.Messenger r2) {
                r1 = this;
                android.content.ComponentName r0 = r1.mServiceComponent
                java.util.Objects.toString(r0)
                java.lang.String r0 = "onConnectFailed"
                boolean r2 = r1.isCurrent(r2, r0)
                if (r2 != 0) goto Le
                return
            Le:
                int r2 = r1.mState
                r0 = 2
                if (r2 == r0) goto L19
                int r2 = r1.mState
                getStateLabel(r2)
                return
            L19:
                r1.forceCloseConnection()
                android.support.v4.media.MediaBrowserCompat$ConnectionCallback r2 = r1.mCallback
                r2.onConnectionFailed()
                return
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserServiceCallbackImpl
        public void onLoadChildren(android.os.Messenger r2, java.lang.String r3, java.util.List r4, android.os.Bundle r5, android.os.Bundle r6) {
                r1 = this;
                java.lang.String r0 = "onLoadChildren"
                boolean r2 = r1.isCurrent(r2, r0)
                if (r2 != 0) goto L9
                goto L41
            L9:
                boolean r2 = android.support.v4.media.MediaBrowserCompat.DEBUG
                if (r2 == 0) goto L12
                android.content.ComponentName r2 = r1.mServiceComponent
                java.util.Objects.toString(r2)
            L12:
                androidx.collection.ArrayMap<java.lang.String, android.support.v4.media.MediaBrowserCompat$Subscription> r2 = r1.mSubscriptions
                java.lang.Object r2 = r2.get(r3)
                android.support.v4.media.MediaBrowserCompat$Subscription r2 = (android.support.v4.media.MediaBrowserCompat.Subscription) r2
                if (r2 != 0) goto L1d
                return
            L1d:
                android.support.v4.media.MediaBrowserCompat$SubscriptionCallback r2 = r2.getCallback(r5)
                if (r2 == 0) goto L41
                r0 = 0
                if (r5 != 0) goto L34
                if (r4 != 0) goto L2c
                r2.onError(r3)
                return
            L2c:
                r1.mNotifyChildrenChangedOptions = r6
                r2.onChildrenLoaded(r3, r4)
                r1.mNotifyChildrenChangedOptions = r0
                return
            L34:
                if (r4 != 0) goto L3a
                r2.onError(r3, r5)
                return
            L3a:
                r1.mNotifyChildrenChangedOptions = r6
                r2.onChildrenLoaded(r3, r4, r5)
                r1.mNotifyChildrenChangedOptions = r0
            L41:
                return
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserServiceCallbackImpl
        public void onServiceConnected(android.os.Messenger r6, java.lang.String r7, android.support.v4.media.session.MediaSessionCompat.Token r8, android.os.Bundle r9) {
                r5 = this;
                java.lang.String r0 = "onConnect"
                boolean r6 = r5.isCurrent(r6, r0)
                if (r6 != 0) goto L9
                goto L72
            L9:
                int r6 = r5.mState
                r0 = 2
                if (r6 == r0) goto L14
                int r6 = r5.mState
                getStateLabel(r6)
                return
            L14:
                r5.mRootId = r7
                r5.mMediaSessionToken = r8
                r5.mExtras = r9
                r6 = 3
                r5.mState = r6
                boolean r6 = android.support.v4.media.MediaBrowserCompat.DEBUG
                if (r6 == 0) goto L24
                r5.dump()
            L24:
                android.support.v4.media.MediaBrowserCompat$ConnectionCallback r6 = r5.mCallback
                r6.onConnected()
                androidx.collection.ArrayMap<java.lang.String, android.support.v4.media.MediaBrowserCompat$Subscription> r6 = r5.mSubscriptions     // Catch: android.os.RemoteException -> L72
                java.util.Set r6 = r6.entrySet()     // Catch: android.os.RemoteException -> L72
                java.util.Iterator r6 = r6.iterator()     // Catch: android.os.RemoteException -> L72
            L33:
                boolean r7 = r6.hasNext()     // Catch: android.os.RemoteException -> L72
                if (r7 == 0) goto L72
                java.lang.Object r7 = r6.next()     // Catch: android.os.RemoteException -> L72
                java.util.Map$Entry r7 = (java.util.Map.Entry) r7     // Catch: android.os.RemoteException -> L72
                java.lang.Object r8 = r7.getKey()     // Catch: android.os.RemoteException -> L72
                java.lang.String r8 = (java.lang.String) r8     // Catch: android.os.RemoteException -> L72
                java.lang.Object r7 = r7.getValue()     // Catch: android.os.RemoteException -> L72
                android.support.v4.media.MediaBrowserCompat$Subscription r7 = (android.support.v4.media.MediaBrowserCompat.Subscription) r7     // Catch: android.os.RemoteException -> L72
                java.util.List r9 = r7.getCallbacks()     // Catch: android.os.RemoteException -> L72
                java.util.List r7 = r7.getOptionsList()     // Catch: android.os.RemoteException -> L72
                r0 = 0
            L54:
                int r1 = r9.size()     // Catch: android.os.RemoteException -> L72
                if (r0 >= r1) goto L33
                android.support.v4.media.MediaBrowserCompat$ServiceBinderWrapper r1 = r5.mServiceBinderWrapper     // Catch: android.os.RemoteException -> L72
                java.lang.Object r2 = r9.get(r0)     // Catch: android.os.RemoteException -> L72
                android.support.v4.media.MediaBrowserCompat$SubscriptionCallback r2 = (android.support.v4.media.MediaBrowserCompat.SubscriptionCallback) r2     // Catch: android.os.RemoteException -> L72
                android.os.IBinder r2 = r2.mToken     // Catch: android.os.RemoteException -> L72
                java.lang.Object r3 = r7.get(r0)     // Catch: android.os.RemoteException -> L72
                android.os.Bundle r3 = (android.os.Bundle) r3     // Catch: android.os.RemoteException -> L72
                android.os.Messenger r4 = r5.mCallbacksMessenger     // Catch: android.os.RemoteException -> L72
                r1.addSubscription(r8, r2, r3, r4)     // Catch: android.os.RemoteException -> L72
                int r0 = r0 + 1
                goto L54
            L72:
                return
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void search(@androidx.annotation.NonNull java.lang.String r4, android.os.Bundle r5, @androidx.annotation.NonNull android.support.v4.media.MediaBrowserCompat.SearchCallback r6) {
                r3 = this;
                boolean r0 = r3.isConnected()
                if (r0 == 0) goto L20
                android.support.v4.media.MediaBrowserCompat$SearchResultReceiver r0 = new android.support.v4.media.MediaBrowserCompat$SearchResultReceiver
                android.support.v4.media.MediaBrowserCompat$CallbackHandler r1 = r3.mHandler
                r0.<init>(r4, r5, r6, r1)
                android.support.v4.media.MediaBrowserCompat$ServiceBinderWrapper r1 = r3.mServiceBinderWrapper     // Catch: android.os.RemoteException -> L15
                android.os.Messenger r2 = r3.mCallbacksMessenger     // Catch: android.os.RemoteException -> L15
                r1.search(r4, r5, r0, r2)     // Catch: android.os.RemoteException -> L15
                return
            L15:
                android.support.v4.media.MediaBrowserCompat$CallbackHandler r0 = r3.mHandler
                android.support.v4.media.MediaBrowserCompat$MediaBrowserImplBase$5 r1 = new android.support.v4.media.MediaBrowserCompat$MediaBrowserImplBase$5
                r1.<init>(r3, r6, r4, r5)
                r0.post(r1)
                return
            L20:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "search() called while not connected (state="
                r5.append(r6)
                int r6 = r3.mState
                java.lang.String r6 = getStateLabel(r6)
                r5.append(r6)
                java.lang.String r6 = ")"
                r5.append(r6)
                java.lang.String r5 = r5.toString()
                r4.<init>(r5)
                throw r4
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void sendCustomAction(@androidx.annotation.NonNull java.lang.String r4, android.os.Bundle r5, @androidx.annotation.Nullable android.support.v4.media.MediaBrowserCompat.CustomActionCallback r6) {
                r3 = this;
                boolean r0 = r3.isConnected()
                if (r0 == 0) goto L26
                android.support.v4.media.MediaBrowserCompat$CustomActionResultReceiver r0 = new android.support.v4.media.MediaBrowserCompat$CustomActionResultReceiver
                android.support.v4.media.MediaBrowserCompat$CallbackHandler r1 = r3.mHandler
                r0.<init>(r4, r5, r6, r1)
                android.support.v4.media.MediaBrowserCompat$ServiceBinderWrapper r1 = r3.mServiceBinderWrapper     // Catch: android.os.RemoteException -> L15
                android.os.Messenger r2 = r3.mCallbacksMessenger     // Catch: android.os.RemoteException -> L15
                r1.sendCustomAction(r4, r5, r0, r2)     // Catch: android.os.RemoteException -> L15
                return
            L15:
                java.util.Objects.toString(r5)
                if (r6 == 0) goto L25
                android.support.v4.media.MediaBrowserCompat$CallbackHandler r0 = r3.mHandler
                android.support.v4.media.MediaBrowserCompat$MediaBrowserImplBase$6 r1 = new android.support.v4.media.MediaBrowserCompat$MediaBrowserImplBase$6
                r1.<init>(r3, r6, r4, r5)
                r0.post(r1)
            L25:
                return
            L26:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Cannot send a custom action ("
                r0.append(r1)
                r0.append(r4)
                java.lang.String r4 = ") with "
                r0.append(r4)
                java.lang.String r4 = "extras "
                r0.append(r4)
                r0.append(r5)
                java.lang.String r4 = " because the browser is not connected to the "
                r0.append(r4)
                java.lang.String r4 = "service."
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                r6.<init>(r4)
                throw r6
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void subscribe(@androidx.annotation.NonNull java.lang.String r3, android.os.Bundle r4, @androidx.annotation.NonNull android.support.v4.media.MediaBrowserCompat.SubscriptionCallback r5) {
                r2 = this;
                androidx.collection.ArrayMap<java.lang.String, android.support.v4.media.MediaBrowserCompat$Subscription> r0 = r2.mSubscriptions
                java.lang.Object r0 = r0.get(r3)
                android.support.v4.media.MediaBrowserCompat$Subscription r0 = (android.support.v4.media.MediaBrowserCompat.Subscription) r0
                if (r0 != 0) goto L14
                android.support.v4.media.MediaBrowserCompat$Subscription r0 = new android.support.v4.media.MediaBrowserCompat$Subscription
                r0.<init>()
                androidx.collection.ArrayMap<java.lang.String, android.support.v4.media.MediaBrowserCompat$Subscription> r1 = r2.mSubscriptions
                r1.put(r3, r0)
            L14:
                if (r4 != 0) goto L18
                r4 = 0
                goto L1e
            L18:
                android.os.Bundle r1 = new android.os.Bundle
                r1.<init>(r4)
                r4 = r1
            L1e:
                r0.putCallback(r4, r5)
                boolean r0 = r2.isConnected()
                if (r0 == 0) goto L30
                android.support.v4.media.MediaBrowserCompat$ServiceBinderWrapper r0 = r2.mServiceBinderWrapper     // Catch: android.os.RemoteException -> L30
                android.os.IBinder r5 = r5.mToken     // Catch: android.os.RemoteException -> L30
                android.os.Messenger r1 = r2.mCallbacksMessenger     // Catch: android.os.RemoteException -> L30
                r0.addSubscription(r3, r5, r4, r1)     // Catch: android.os.RemoteException -> L30
            L30:
                return
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void unsubscribe(@androidx.annotation.NonNull java.lang.String r8, android.support.v4.media.MediaBrowserCompat.SubscriptionCallback r9) {
                r7 = this;
                androidx.collection.ArrayMap<java.lang.String, android.support.v4.media.MediaBrowserCompat$Subscription> r0 = r7.mSubscriptions
                java.lang.Object r0 = r0.get(r8)
                android.support.v4.media.MediaBrowserCompat$Subscription r0 = (android.support.v4.media.MediaBrowserCompat.Subscription) r0
                if (r0 != 0) goto Lb
                goto L59
            Lb:
                if (r9 != 0) goto L1e
                boolean r1 = r7.isConnected()     // Catch: android.os.RemoteException -> L1c
                if (r1 == 0) goto L4c
                android.support.v4.media.MediaBrowserCompat$ServiceBinderWrapper r1 = r7.mServiceBinderWrapper     // Catch: android.os.RemoteException -> L1c
                android.os.Messenger r2 = r7.mCallbacksMessenger     // Catch: android.os.RemoteException -> L1c
                r3 = 0
                r1.removeSubscription(r8, r3, r2)     // Catch: android.os.RemoteException -> L1c
                goto L4c
            L1c:
                goto L4c
            L1e:
                java.util.List r1 = r0.getCallbacks()     // Catch: android.os.RemoteException -> L1c
                java.util.List r2 = r0.getOptionsList()     // Catch: android.os.RemoteException -> L1c
                int r3 = r1.size()     // Catch: android.os.RemoteException -> L1c
                int r3 = r3 + (-1)
            L2c:
                if (r3 < 0) goto L4c
                java.lang.Object r4 = r1.get(r3)     // Catch: android.os.RemoteException -> L1c
                if (r4 != r9) goto L49
                boolean r4 = r7.isConnected()     // Catch: android.os.RemoteException -> L1c
                if (r4 == 0) goto L43
                android.support.v4.media.MediaBrowserCompat$ServiceBinderWrapper r4 = r7.mServiceBinderWrapper     // Catch: android.os.RemoteException -> L1c
                android.os.IBinder r5 = r9.mToken     // Catch: android.os.RemoteException -> L1c
                android.os.Messenger r6 = r7.mCallbacksMessenger     // Catch: android.os.RemoteException -> L1c
                r4.removeSubscription(r8, r5, r6)     // Catch: android.os.RemoteException -> L1c
            L43:
                r1.remove(r3)     // Catch: android.os.RemoteException -> L1c
                r2.remove(r3)     // Catch: android.os.RemoteException -> L1c
            L49:
                int r3 = r3 + (-1)
                goto L2c
            L4c:
                boolean r0 = r0.isEmpty()
                if (r0 != 0) goto L54
                if (r9 != 0) goto L59
            L54:
                androidx.collection.ArrayMap<java.lang.String, android.support.v4.media.MediaBrowserCompat$Subscription> r9 = r7.mSubscriptions
                r9.remove(r8)
            L59:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    interface MediaBrowserServiceCallbackImpl {
        void onConnectionFailed(android.os.Messenger r1);

        void onLoadChildren(android.os.Messenger r1, java.lang.String r2, java.util.List r3, android.os.Bundle r4, android.os.Bundle r5);

        void onServiceConnected(android.os.Messenger r1, java.lang.String r2, android.support.v4.media.session.MediaSessionCompat.Token r3, android.os.Bundle r4);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class MediaItem implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.support.v4.media.MediaBrowserCompat.MediaItem> CREATOR = null;
        public static final int FLAG_BROWSABLE = 1;
        public static final int FLAG_PLAYABLE = 2;
        private final android.support.v4.media.MediaDescriptionCompat mDescription;
        private final int mFlags;


        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public @interface Flags {
        }

        static {
                android.support.v4.media.MediaBrowserCompat$MediaItem$1 r0 = new android.support.v4.media.MediaBrowserCompat$MediaItem$1
                r0.<init>()
                android.support.v4.media.MediaBrowserCompat.MediaItem.CREATOR = r0
                return
        }

        MediaItem(android.os.Parcel r2) {
                r1 = this;
                r1.<init>()
                int r0 = r2.readInt()
                r1.mFlags = r0
                android.os.Parcelable$Creator<android.support.v4.media.MediaDescriptionCompat> r0 = android.support.v4.media.MediaDescriptionCompat.CREATOR
                java.lang.Object r2 = r0.createFromParcel(r2)
                android.support.v4.media.MediaDescriptionCompat r2 = (android.support.v4.media.MediaDescriptionCompat) r2
                r1.mDescription = r2
                return
        }

        public MediaItem(@androidx.annotation.NonNull android.support.v4.media.MediaDescriptionCompat r2, int r3) {
                r1 = this;
                r1.<init>()
                if (r2 == 0) goto L1c
                java.lang.String r0 = r2.getMediaId()
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 != 0) goto L14
                r1.mFlags = r3
                r1.mDescription = r2
                return
            L14:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r3 = "description must have a non-empty media id"
                r2.<init>(r3)
                throw r2
            L1c:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r3 = "description cannot be null"
                r2.<init>(r3)
                throw r2
        }

        public static android.support.v4.media.MediaBrowserCompat.MediaItem fromMediaItem(java.lang.Object r2) {
                if (r2 == 0) goto L14
                int r0 = android.support.v4.media.MediaBrowserCompatApi21.MediaItem.getFlags(r2)
                java.lang.Object r2 = android.support.v4.media.MediaBrowserCompatApi21.MediaItem.getDescription(r2)
                android.support.v4.media.MediaDescriptionCompat r2 = android.support.v4.media.MediaDescriptionCompat.fromMediaDescription(r2)
                android.support.v4.media.MediaBrowserCompat$MediaItem r1 = new android.support.v4.media.MediaBrowserCompat$MediaItem
                r1.<init>(r2, r0)
                return r1
            L14:
                r2 = 0
                return r2
        }

        public static java.util.List<android.support.v4.media.MediaBrowserCompat.MediaItem> fromMediaItemList(java.util.List<?> r2) {
                if (r2 == 0) goto L22
                java.util.ArrayList r0 = new java.util.ArrayList
                int r1 = r2.size()
                r0.<init>(r1)
                java.util.Iterator r2 = r2.iterator()
            Lf:
                boolean r1 = r2.hasNext()
                if (r1 == 0) goto L21
                java.lang.Object r1 = r2.next()
                android.support.v4.media.MediaBrowserCompat$MediaItem r1 = fromMediaItem(r1)
                r0.add(r1)
                goto Lf
            L21:
                return r0
            L22:
                r2 = 0
                return r2
        }

        @Override // android.os.Parcelable
        public int describeContents() {
                r1 = this;
                r0 = 0
                return r0
        }

        @androidx.annotation.NonNull
        public android.support.v4.media.MediaDescriptionCompat getDescription() {
                r1 = this;
                android.support.v4.media.MediaDescriptionCompat r0 = r1.mDescription
                return r0
        }

        public int getFlags() {
                r1 = this;
                int r0 = r1.mFlags
                return r0
        }

        @androidx.annotation.Nullable
        public java.lang.String getMediaId() {
                r1 = this;
                android.support.v4.media.MediaDescriptionCompat r0 = r1.mDescription
                java.lang.String r0 = r0.getMediaId()
                return r0
        }

        public boolean isBrowsable() {
                r2 = this;
                int r0 = r2.mFlags
                r1 = 1
                r0 = r0 & r1
                if (r0 == 0) goto L7
                return r1
            L7:
                r0 = 0
                return r0
        }

        public boolean isPlayable() {
                r1 = this;
                int r0 = r1.mFlags
                r0 = r0 & 2
                if (r0 == 0) goto L8
                r0 = 1
                return r0
            L8:
                r0 = 0
                return r0
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "MediaItem{"
                r0.<init>(r1)
                java.lang.String r1 = "mFlags="
                r0.append(r1)
                int r1 = r2.mFlags
                r0.append(r1)
                java.lang.String r1 = ", mDescription="
                r0.append(r1)
                android.support.v4.media.MediaDescriptionCompat r1 = r2.mDescription
                r0.append(r1)
                r1 = 125(0x7d, float:1.75E-43)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel r2, int r3) {
                r1 = this;
                int r0 = r1.mFlags
                r2.writeInt(r0)
                android.support.v4.media.MediaDescriptionCompat r0 = r1.mDescription
                r0.writeToParcel(r2, r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static abstract class SearchCallback {
        public SearchCallback() {
                r0 = this;
                r0.<init>()
                return
        }

        public void onError(@androidx.annotation.NonNull java.lang.String r1, android.os.Bundle r2) {
                r0 = this;
                return
        }

        public void onSearchResult(@androidx.annotation.NonNull java.lang.String r1, android.os.Bundle r2, @androidx.annotation.NonNull java.util.List<android.support.v4.media.MediaBrowserCompat.MediaItem> r3) {
                r0 = this;
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class SearchResultReceiver extends android.support.v4.os.ResultReceiver {
        private final android.support.v4.media.MediaBrowserCompat.SearchCallback mCallback;
        private final android.os.Bundle mExtras;
        private final java.lang.String mQuery;

        SearchResultReceiver(java.lang.String r1, android.os.Bundle r2, android.support.v4.media.MediaBrowserCompat.SearchCallback r3, android.os.Handler r4) {
                r0 = this;
                r0.<init>(r4)
                r0.mQuery = r1
                r0.mExtras = r2
                r0.mCallback = r3
                return
        }

        @Override // android.support.v4.os.ResultReceiver
        protected void onReceiveResult(int r4, android.os.Bundle r5) {
                r3 = this;
                android.support.v4.media.session.MediaSessionCompat.ensureClassLoader(r5)
                if (r4 != 0) goto L34
                if (r5 == 0) goto L34
                java.lang.String r4 = "search_results"
                boolean r0 = r5.containsKey(r4)
                if (r0 != 0) goto L10
                goto L34
            L10:
                android.os.Parcelable[] r4 = r5.getParcelableArray(r4)
                if (r4 == 0) goto L29
                java.util.ArrayList r5 = new java.util.ArrayList
                r5.<init>()
                int r0 = r4.length
                r1 = 0
            L1d:
                if (r1 >= r0) goto L2a
                r2 = r4[r1]
                android.support.v4.media.MediaBrowserCompat$MediaItem r2 = (android.support.v4.media.MediaBrowserCompat.MediaItem) r2
                r5.add(r2)
                int r1 = r1 + 1
                goto L1d
            L29:
                r5 = 0
            L2a:
                android.support.v4.media.MediaBrowserCompat$SearchCallback r4 = r3.mCallback
                java.lang.String r0 = r3.mQuery
                android.os.Bundle r1 = r3.mExtras
                r4.onSearchResult(r0, r1, r5)
                return
            L34:
                android.support.v4.media.MediaBrowserCompat$SearchCallback r4 = r3.mCallback
                java.lang.String r5 = r3.mQuery
                android.os.Bundle r0 = r3.mExtras
                r4.onError(r5, r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class ServiceBinderWrapper {
        private android.os.Messenger mMessenger;
        private android.os.Bundle mRootHints;

        public ServiceBinderWrapper(android.os.IBinder r2, android.os.Bundle r3) {
                r1 = this;
                r1.<init>()
                android.os.Messenger r0 = new android.os.Messenger
                r0.<init>(r2)
                r1.mMessenger = r0
                r1.mRootHints = r3
                return
        }

        private void sendRequest(int r2, android.os.Bundle r3, android.os.Messenger r4) throws android.os.RemoteException {
                r1 = this;
                android.os.Message r0 = android.os.Message.obtain()
                r0.what = r2
                r2 = 1
                r0.arg1 = r2
                r0.setData(r3)
                r0.replyTo = r4
                android.os.Messenger r2 = r1.mMessenger
                r2.send(r0)
                return
        }

        void addSubscription(java.lang.String r3, android.os.IBinder r4, android.os.Bundle r5, android.os.Messenger r6) throws android.os.RemoteException {
                r2 = this;
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                java.lang.String r1 = "data_media_item_id"
                r0.putString(r1, r3)
                java.lang.String r3 = "data_callback_token"
                androidx.core.app.BundleCompat.putBinder(r0, r3, r4)
                java.lang.String r3 = "data_options"
                r0.putBundle(r3, r5)
                r3 = 3
                r2.sendRequest(r3, r0, r6)
                return
        }

        void connect(android.content.Context r3, android.os.Messenger r4) throws android.os.RemoteException {
                r2 = this;
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                java.lang.String r1 = "data_package_name"
                java.lang.String r3 = r3.getPackageName()
                r0.putString(r1, r3)
                java.lang.String r3 = "data_root_hints"
                android.os.Bundle r1 = r2.mRootHints
                r0.putBundle(r3, r1)
                r3 = 1
                r2.sendRequest(r3, r0, r4)
                return
        }

        void disconnect(android.os.Messenger r3) throws android.os.RemoteException {
                r2 = this;
                r0 = 2
                r1 = 0
                r2.sendRequest(r0, r1, r3)
                return
        }

        void getMediaItem(java.lang.String r3, android.support.v4.os.ResultReceiver r4, android.os.Messenger r5) throws android.os.RemoteException {
                r2 = this;
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                java.lang.String r1 = "data_media_item_id"
                r0.putString(r1, r3)
                java.lang.String r3 = "data_result_receiver"
                r0.putParcelable(r3, r4)
                r3 = 5
                r2.sendRequest(r3, r0, r5)
                return
        }

        void registerCallbackMessenger(android.content.Context r3, android.os.Messenger r4) throws android.os.RemoteException {
                r2 = this;
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                java.lang.String r1 = "data_package_name"
                java.lang.String r3 = r3.getPackageName()
                r0.putString(r1, r3)
                java.lang.String r3 = "data_root_hints"
                android.os.Bundle r1 = r2.mRootHints
                r0.putBundle(r3, r1)
                r3 = 6
                r2.sendRequest(r3, r0, r4)
                return
        }

        void removeSubscription(java.lang.String r3, android.os.IBinder r4, android.os.Messenger r5) throws android.os.RemoteException {
                r2 = this;
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                java.lang.String r1 = "data_media_item_id"
                r0.putString(r1, r3)
                java.lang.String r3 = "data_callback_token"
                androidx.core.app.BundleCompat.putBinder(r0, r3, r4)
                r3 = 4
                r2.sendRequest(r3, r0, r5)
                return
        }

        void search(java.lang.String r3, android.os.Bundle r4, android.support.v4.os.ResultReceiver r5, android.os.Messenger r6) throws android.os.RemoteException {
                r2 = this;
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                java.lang.String r1 = "data_search_query"
                r0.putString(r1, r3)
                java.lang.String r3 = "data_search_extras"
                r0.putBundle(r3, r4)
                java.lang.String r3 = "data_result_receiver"
                r0.putParcelable(r3, r5)
                r3 = 8
                r2.sendRequest(r3, r0, r6)
                return
        }

        void sendCustomAction(java.lang.String r3, android.os.Bundle r4, android.support.v4.os.ResultReceiver r5, android.os.Messenger r6) throws android.os.RemoteException {
                r2 = this;
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                java.lang.String r1 = "data_custom_action"
                r0.putString(r1, r3)
                java.lang.String r3 = "data_custom_action_extras"
                r0.putBundle(r3, r4)
                java.lang.String r3 = "data_result_receiver"
                r0.putParcelable(r3, r5)
                r3 = 9
                r2.sendRequest(r3, r0, r6)
                return
        }

        void unregisterCallbackMessenger(android.os.Messenger r3) throws android.os.RemoteException {
                r2 = this;
                r0 = 7
                r1 = 0
                r2.sendRequest(r0, r1, r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class Subscription {
        private final java.util.List<android.support.v4.media.MediaBrowserCompat.SubscriptionCallback> mCallbacks;
        private final java.util.List<android.os.Bundle> mOptionsList;

        public Subscription() {
                r1 = this;
                r1.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.mCallbacks = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.mOptionsList = r0
                return
        }

        public android.support.v4.media.MediaBrowserCompat.SubscriptionCallback getCallback(android.os.Bundle r3) {
                r2 = this;
                r0 = 0
            L1:
                java.util.List<android.os.Bundle> r1 = r2.mOptionsList
                int r1 = r1.size()
                if (r0 >= r1) goto L23
                java.util.List<android.os.Bundle> r1 = r2.mOptionsList
                java.lang.Object r1 = r1.get(r0)
                android.os.Bundle r1 = (android.os.Bundle) r1
                boolean r1 = androidx.media.MediaBrowserCompatUtils.areSameOptions(r1, r3)
                if (r1 == 0) goto L20
                java.util.List<android.support.v4.media.MediaBrowserCompat$SubscriptionCallback> r3 = r2.mCallbacks
                java.lang.Object r3 = r3.get(r0)
                android.support.v4.media.MediaBrowserCompat$SubscriptionCallback r3 = (android.support.v4.media.MediaBrowserCompat.SubscriptionCallback) r3
                return r3
            L20:
                int r0 = r0 + 1
                goto L1
            L23:
                r3 = 0
                return r3
        }

        public java.util.List<android.support.v4.media.MediaBrowserCompat.SubscriptionCallback> getCallbacks() {
                r1 = this;
                java.util.List<android.support.v4.media.MediaBrowserCompat$SubscriptionCallback> r0 = r1.mCallbacks
                return r0
        }

        public java.util.List<android.os.Bundle> getOptionsList() {
                r1 = this;
                java.util.List<android.os.Bundle> r0 = r1.mOptionsList
                return r0
        }

        public boolean isEmpty() {
                r1 = this;
                java.util.List<android.support.v4.media.MediaBrowserCompat$SubscriptionCallback> r0 = r1.mCallbacks
                boolean r0 = r0.isEmpty()
                return r0
        }

        public void putCallback(android.os.Bundle r3, android.support.v4.media.MediaBrowserCompat.SubscriptionCallback r4) {
                r2 = this;
                r0 = 0
            L1:
                java.util.List<android.os.Bundle> r1 = r2.mOptionsList
                int r1 = r1.size()
                if (r0 >= r1) goto L20
                java.util.List<android.os.Bundle> r1 = r2.mOptionsList
                java.lang.Object r1 = r1.get(r0)
                android.os.Bundle r1 = (android.os.Bundle) r1
                boolean r1 = androidx.media.MediaBrowserCompatUtils.areSameOptions(r1, r3)
                if (r1 == 0) goto L1d
                java.util.List<android.support.v4.media.MediaBrowserCompat$SubscriptionCallback> r3 = r2.mCallbacks
                r3.set(r0, r4)
                return
            L1d:
                int r0 = r0 + 1
                goto L1
            L20:
                java.util.List<android.support.v4.media.MediaBrowserCompat$SubscriptionCallback> r0 = r2.mCallbacks
                r0.add(r4)
                java.util.List<android.os.Bundle> r4 = r2.mOptionsList
                r4.add(r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static abstract class SubscriptionCallback {
        final java.lang.Object mSubscriptionCallbackObj;
        java.lang.ref.WeakReference<android.support.v4.media.MediaBrowserCompat.Subscription> mSubscriptionRef;
        final android.os.IBinder mToken;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        private class StubApi21 implements android.support.v4.media.MediaBrowserCompatApi21.SubscriptionCallback {
            final /* synthetic */ android.support.v4.media.MediaBrowserCompat.SubscriptionCallback this$0;

            StubApi21(android.support.v4.media.MediaBrowserCompat.SubscriptionCallback r1) {
                    r0 = this;
                    r0.this$0 = r1
                    r0.<init>()
                    return
            }

            java.util.List<android.support.v4.media.MediaBrowserCompat.MediaItem> applyOptions(java.util.List<android.support.v4.media.MediaBrowserCompat.MediaItem> r4, android.os.Bundle r5) {
                    r3 = this;
                    if (r4 != 0) goto L4
                    r4 = 0
                    return r4
                L4:
                    java.lang.String r0 = "android.media.browse.extra.PAGE"
                    r1 = -1
                    int r0 = r5.getInt(r0, r1)
                    java.lang.String r2 = "android.media.browse.extra.PAGE_SIZE"
                    int r5 = r5.getInt(r2, r1)
                    if (r0 != r1) goto L16
                    if (r5 != r1) goto L16
                    return r4
                L16:
                    int r1 = r5 * r0
                    int r2 = r1 + r5
                    if (r0 < 0) goto L35
                    r0 = 1
                    if (r5 < r0) goto L35
                    int r5 = r4.size()
                    if (r1 < r5) goto L26
                    goto L35
                L26:
                    int r5 = r4.size()
                    if (r2 <= r5) goto L30
                    int r2 = r4.size()
                L30:
                    java.util.List r4 = r4.subList(r1, r2)
                    return r4
                L35:
                    java.util.List r4 = java.util.Collections.EMPTY_LIST
                    return r4
            }

            @Override // android.support.v4.media.MediaBrowserCompatApi21.SubscriptionCallback
            public void onChildrenLoaded(@androidx.annotation.NonNull java.lang.String r7, java.util.List<?> r8) {
                    r6 = this;
                    android.support.v4.media.MediaBrowserCompat$SubscriptionCallback r0 = r6.this$0
                    java.lang.ref.WeakReference<android.support.v4.media.MediaBrowserCompat$Subscription> r0 = r0.mSubscriptionRef
                    if (r0 != 0) goto L8
                    r0 = 0
                    goto Le
                L8:
                    java.lang.Object r0 = r0.get()
                    android.support.v4.media.MediaBrowserCompat$Subscription r0 = (android.support.v4.media.MediaBrowserCompat.Subscription) r0
                Le:
                    if (r0 != 0) goto L1a
                    android.support.v4.media.MediaBrowserCompat$SubscriptionCallback r0 = r6.this$0
                    java.util.List r8 = android.support.v4.media.MediaBrowserCompat.MediaItem.fromMediaItemList(r8)
                    r0.onChildrenLoaded(r7, r8)
                    return
                L1a:
                    java.util.List r8 = android.support.v4.media.MediaBrowserCompat.MediaItem.fromMediaItemList(r8)
                    java.util.List r1 = r0.getCallbacks()
                    java.util.List r0 = r0.getOptionsList()
                    r2 = 0
                L27:
                    int r3 = r1.size()
                    if (r2 >= r3) goto L47
                    java.lang.Object r3 = r0.get(r2)
                    android.os.Bundle r3 = (android.os.Bundle) r3
                    if (r3 != 0) goto L3b
                    android.support.v4.media.MediaBrowserCompat$SubscriptionCallback r3 = r6.this$0
                    r3.onChildrenLoaded(r7, r8)
                    goto L44
                L3b:
                    android.support.v4.media.MediaBrowserCompat$SubscriptionCallback r4 = r6.this$0
                    java.util.List r5 = r6.applyOptions(r8, r3)
                    r4.onChildrenLoaded(r7, r5, r3)
                L44:
                    int r2 = r2 + 1
                    goto L27
                L47:
                    return
            }

            @Override // android.support.v4.media.MediaBrowserCompatApi21.SubscriptionCallback
            public void onError(@androidx.annotation.NonNull java.lang.String r2) {
                    r1 = this;
                    android.support.v4.media.MediaBrowserCompat$SubscriptionCallback r0 = r1.this$0
                    r0.onError(r2)
                    return
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        private class StubApi26 extends android.support.v4.media.MediaBrowserCompat.SubscriptionCallback.StubApi21 implements android.support.v4.media.MediaBrowserCompatApi26.SubscriptionCallback {
            final /* synthetic */ android.support.v4.media.MediaBrowserCompat.SubscriptionCallback this$0;

            StubApi26(android.support.v4.media.MediaBrowserCompat.SubscriptionCallback r1) {
                    r0 = this;
                    r0.this$0 = r1
                    r0.<init>(r1)
                    return
            }

            @Override // android.support.v4.media.MediaBrowserCompatApi26.SubscriptionCallback
            public void onChildrenLoaded(@androidx.annotation.NonNull java.lang.String r2, java.util.List<?> r3, @androidx.annotation.NonNull android.os.Bundle r4) {
                    r1 = this;
                    android.support.v4.media.MediaBrowserCompat$SubscriptionCallback r0 = r1.this$0
                    java.util.List r3 = android.support.v4.media.MediaBrowserCompat.MediaItem.fromMediaItemList(r3)
                    r0.onChildrenLoaded(r2, r3, r4)
                    return
            }

            @Override // android.support.v4.media.MediaBrowserCompatApi26.SubscriptionCallback
            public void onError(@androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.NonNull android.os.Bundle r3) {
                    r1 = this;
                    android.support.v4.media.MediaBrowserCompat$SubscriptionCallback r0 = r1.this$0
                    r0.onError(r2, r3)
                    return
            }
        }

        public SubscriptionCallback() {
                r2 = this;
                r2.<init>()
                android.os.Binder r0 = new android.os.Binder
                r0.<init>()
                r2.mToken = r0
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 26
                if (r0 < r1) goto L1c
                android.support.v4.media.MediaBrowserCompat$SubscriptionCallback$StubApi26 r0 = new android.support.v4.media.MediaBrowserCompat$SubscriptionCallback$StubApi26
                r0.<init>(r2)
                java.lang.Object r0 = android.support.v4.media.MediaBrowserCompatApi26.createSubscriptionCallback(r0)
                r2.mSubscriptionCallbackObj = r0
                return
            L1c:
                android.support.v4.media.MediaBrowserCompat$SubscriptionCallback$StubApi21 r0 = new android.support.v4.media.MediaBrowserCompat$SubscriptionCallback$StubApi21
                r0.<init>(r2)
                java.lang.Object r0 = android.support.v4.media.MediaBrowserCompatApi21.createSubscriptionCallback(r0)
                r2.mSubscriptionCallbackObj = r0
                return
        }

        public void onChildrenLoaded(@androidx.annotation.NonNull java.lang.String r1, @androidx.annotation.NonNull java.util.List<android.support.v4.media.MediaBrowserCompat.MediaItem> r2) {
                r0 = this;
                return
        }

        public void onChildrenLoaded(@androidx.annotation.NonNull java.lang.String r1, @androidx.annotation.NonNull java.util.List<android.support.v4.media.MediaBrowserCompat.MediaItem> r2, @androidx.annotation.NonNull android.os.Bundle r3) {
                r0 = this;
                return
        }

        public void onError(@androidx.annotation.NonNull java.lang.String r1) {
                r0 = this;
                return
        }

        public void onError(@androidx.annotation.NonNull java.lang.String r1, @androidx.annotation.NonNull android.os.Bundle r2) {
                r0 = this;
                return
        }

        void setSubscription(android.support.v4.media.MediaBrowserCompat.Subscription r2) {
                r1 = this;
                java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                r0.<init>(r2)
                r1.mSubscriptionRef = r0
                return
        }
    }

    static {
            java.lang.String r0 = "MediaBrowserCompat"
            r1 = 3
            boolean r0 = android.util.Log.isLoggable(r0, r1)
            android.support.v4.media.MediaBrowserCompat.DEBUG = r0
            return
    }

    public MediaBrowserCompat(android.content.Context r3, android.content.ComponentName r4, android.support.v4.media.MediaBrowserCompat.ConnectionCallback r5, android.os.Bundle r6) {
            r2 = this;
            r2.<init>()
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L11
            android.support.v4.media.MediaBrowserCompat$MediaBrowserImplApi26 r0 = new android.support.v4.media.MediaBrowserCompat$MediaBrowserImplApi26
            r0.<init>(r3, r4, r5, r6)
            r2.mImpl = r0
            return
        L11:
            r1 = 23
            if (r0 < r1) goto L1d
            android.support.v4.media.MediaBrowserCompat$MediaBrowserImplApi23 r0 = new android.support.v4.media.MediaBrowserCompat$MediaBrowserImplApi23
            r0.<init>(r3, r4, r5, r6)
            r2.mImpl = r0
            return
        L1d:
            android.support.v4.media.MediaBrowserCompat$MediaBrowserImplApi21 r0 = new android.support.v4.media.MediaBrowserCompat$MediaBrowserImplApi21
            r0.<init>(r3, r4, r5, r6)
            r2.mImpl = r0
            return
    }

    public void connect() {
            r1 = this;
            android.support.v4.media.MediaBrowserCompat$MediaBrowserImpl r0 = r1.mImpl
            r0.connect()
            return
    }

    public void disconnect() {
            r1 = this;
            android.support.v4.media.MediaBrowserCompat$MediaBrowserImpl r0 = r1.mImpl
            r0.disconnect()
            return
    }

    @androidx.annotation.Nullable
    public android.os.Bundle getExtras() {
            r1 = this;
            android.support.v4.media.MediaBrowserCompat$MediaBrowserImpl r0 = r1.mImpl
            android.os.Bundle r0 = r0.getExtras()
            return r0
    }

    public void getItem(@androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.NonNull android.support.v4.media.MediaBrowserCompat.ItemCallback r3) {
            r1 = this;
            android.support.v4.media.MediaBrowserCompat$MediaBrowserImpl r0 = r1.mImpl
            r0.getItem(r2, r3)
            return
    }

    @androidx.annotation.Nullable
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public android.os.Bundle getNotifyChildrenChangedOptions() {
            r1 = this;
            android.support.v4.media.MediaBrowserCompat$MediaBrowserImpl r0 = r1.mImpl
            android.os.Bundle r0 = r0.getNotifyChildrenChangedOptions()
            return r0
    }

    @androidx.annotation.NonNull
    public java.lang.String getRoot() {
            r1 = this;
            android.support.v4.media.MediaBrowserCompat$MediaBrowserImpl r0 = r1.mImpl
            java.lang.String r0 = r0.getRoot()
            return r0
    }

    @androidx.annotation.NonNull
    public android.content.ComponentName getServiceComponent() {
            r1 = this;
            android.support.v4.media.MediaBrowserCompat$MediaBrowserImpl r0 = r1.mImpl
            android.content.ComponentName r0 = r0.getServiceComponent()
            return r0
    }

    @androidx.annotation.NonNull
    public android.support.v4.media.session.MediaSessionCompat.Token getSessionToken() {
            r1 = this;
            android.support.v4.media.MediaBrowserCompat$MediaBrowserImpl r0 = r1.mImpl
            android.support.v4.media.session.MediaSessionCompat$Token r0 = r0.getSessionToken()
            return r0
    }

    public boolean isConnected() {
            r1 = this;
            android.support.v4.media.MediaBrowserCompat$MediaBrowserImpl r0 = r1.mImpl
            boolean r0 = r0.isConnected()
            return r0
    }

    public void search(@androidx.annotation.NonNull java.lang.String r2, android.os.Bundle r3, @androidx.annotation.NonNull android.support.v4.media.MediaBrowserCompat.SearchCallback r4) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L16
            if (r4 == 0) goto Le
            android.support.v4.media.MediaBrowserCompat$MediaBrowserImpl r0 = r1.mImpl
            r0.search(r2, r3, r4)
            return
        Le:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "callback cannot be null"
            r2.<init>(r3)
            throw r2
        L16:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "query cannot be empty"
            r2.<init>(r3)
            throw r2
    }

    public void sendCustomAction(@androidx.annotation.NonNull java.lang.String r2, android.os.Bundle r3, @androidx.annotation.Nullable android.support.v4.media.MediaBrowserCompat.CustomActionCallback r4) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto Lc
            android.support.v4.media.MediaBrowserCompat$MediaBrowserImpl r0 = r1.mImpl
            r0.sendCustomAction(r2, r3, r4)
            return
        Lc:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "action cannot be empty"
            r2.<init>(r3)
            throw r2
    }

    public void subscribe(@androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.NonNull android.os.Bundle r3, @androidx.annotation.NonNull android.support.v4.media.MediaBrowserCompat.SubscriptionCallback r4) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L20
            if (r4 == 0) goto L18
            if (r3 == 0) goto L10
            android.support.v4.media.MediaBrowserCompat$MediaBrowserImpl r0 = r1.mImpl
            r0.subscribe(r2, r3, r4)
            return
        L10:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "options are null"
            r2.<init>(r3)
            throw r2
        L18:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "callback is null"
            r2.<init>(r3)
            throw r2
        L20:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "parentId is empty"
            r2.<init>(r3)
            throw r2
    }

    public void subscribe(@androidx.annotation.NonNull java.lang.String r3, @androidx.annotation.NonNull android.support.v4.media.MediaBrowserCompat.SubscriptionCallback r4) {
            r2 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L17
            if (r4 == 0) goto Lf
            android.support.v4.media.MediaBrowserCompat$MediaBrowserImpl r0 = r2.mImpl
            r1 = 0
            r0.subscribe(r3, r1, r4)
            return
        Lf:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "callback is null"
            r3.<init>(r4)
            throw r3
        L17:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "parentId is empty"
            r3.<init>(r4)
            throw r3
    }

    public void unsubscribe(@androidx.annotation.NonNull java.lang.String r3) {
            r2 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto Ld
            android.support.v4.media.MediaBrowserCompat$MediaBrowserImpl r0 = r2.mImpl
            r1 = 0
            r0.unsubscribe(r3, r1)
            return
        Ld:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "parentId is empty"
            r3.<init>(r0)
            throw r3
    }

    public void unsubscribe(@androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.NonNull android.support.v4.media.MediaBrowserCompat.SubscriptionCallback r3) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L16
            if (r3 == 0) goto Le
            android.support.v4.media.MediaBrowserCompat$MediaBrowserImpl r0 = r1.mImpl
            r0.unsubscribe(r2, r3)
            return
        Le:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "callback is null"
            r2.<init>(r3)
            throw r2
        L16:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "parentId is empty"
            r2.<init>(r3)
            throw r2
    }
}

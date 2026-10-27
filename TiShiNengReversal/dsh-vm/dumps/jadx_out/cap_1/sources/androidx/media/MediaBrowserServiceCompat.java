package androidx.media;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public abstract class MediaBrowserServiceCompat extends android.app.Service {
    static final boolean DEBUG = false;
    private static final float EPSILON = 1.0E-5f;

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public static final java.lang.String KEY_MEDIA_ITEM = "media_item";

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public static final java.lang.String KEY_SEARCH_RESULTS = "search_results";

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public static final int RESULT_ERROR = -1;
    static final int RESULT_FLAG_ON_LOAD_ITEM_NOT_IMPLEMENTED = 2;
    static final int RESULT_FLAG_ON_SEARCH_NOT_IMPLEMENTED = 4;
    static final int RESULT_FLAG_OPTION_NOT_HANDLED = 1;

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public static final int RESULT_OK = 0;

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public static final int RESULT_PROGRESS_UPDATE = 1;
    public static final java.lang.String SERVICE_INTERFACE = "android.media.browse.MediaBrowserService";
    static final java.lang.String TAG = "MBServiceCompat";
    final androidx.collection.ArrayMap<android.os.IBinder, androidx.media.MediaBrowserServiceCompat.ConnectionRecord> mConnections;
    androidx.media.MediaBrowserServiceCompat.ConnectionRecord mCurConnection;
    final androidx.media.MediaBrowserServiceCompat.ServiceHandler mHandler;
    private androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImpl mImpl;
    android.support.v4.media.session.MediaSessionCompat.Token mSession;





    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class BrowserRoot {
        public static final java.lang.String EXTRA_OFFLINE = "android.service.media.extra.OFFLINE";
        public static final java.lang.String EXTRA_RECENT = "android.service.media.extra.RECENT";
        public static final java.lang.String EXTRA_SUGGESTED = "android.service.media.extra.SUGGESTED";

        @java.lang.Deprecated
        public static final java.lang.String EXTRA_SUGGESTION_KEYWORDS = "android.service.media.extra.SUGGESTION_KEYWORDS";
        private final android.os.Bundle mExtras;
        private final java.lang.String mRootId;

        public BrowserRoot(@androidx.annotation.NonNull java.lang.String r1, @androidx.annotation.Nullable android.os.Bundle r2) {
                r0 = this;
                r0.<init>()
                if (r1 == 0) goto La
                r0.mRootId = r1
                r0.mExtras = r2
                return
            La:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "The root id in BrowserRoot cannot be null. Use null for BrowserRoot instead."
                r1.<init>(r2)
                throw r1
        }

        public android.os.Bundle getExtras() {
                r1 = this;
                android.os.Bundle r0 = r1.mExtras
                return r0
        }

        public java.lang.String getRootId() {
                r1 = this;
                java.lang.String r0 = r1.mRootId
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class ConnectionRecord implements android.os.IBinder.DeathRecipient {
        public final androidx.media.MediaSessionManager.RemoteUserInfo browserInfo;
        public final androidx.media.MediaBrowserServiceCompat.ServiceCallbacks callbacks;
        public final int pid;
        public final java.lang.String pkg;
        public androidx.media.MediaBrowserServiceCompat.BrowserRoot root;
        public final android.os.Bundle rootHints;
        public final java.util.HashMap<java.lang.String, java.util.List<androidx.core.util.Pair<android.os.IBinder, android.os.Bundle>>> subscriptions;
        final /* synthetic */ androidx.media.MediaBrowserServiceCompat this$0;
        public final int uid;


        ConnectionRecord(androidx.media.MediaBrowserServiceCompat r1, java.lang.String r2, int r3, int r4, android.os.Bundle r5, androidx.media.MediaBrowserServiceCompat.ServiceCallbacks r6) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                java.util.HashMap r1 = new java.util.HashMap
                r1.<init>()
                r0.subscriptions = r1
                r0.pkg = r2
                r0.pid = r3
                r0.uid = r4
                androidx.media.MediaSessionManager$RemoteUserInfo r1 = new androidx.media.MediaSessionManager$RemoteUserInfo
                r1.<init>(r2, r3, r4)
                r0.browserInfo = r1
                r0.rootHints = r5
                r0.callbacks = r6
                return
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
                r2 = this;
                androidx.media.MediaBrowserServiceCompat r0 = r2.this$0
                androidx.media.MediaBrowserServiceCompat$ServiceHandler r0 = r0.mHandler
                androidx.media.MediaBrowserServiceCompat$ConnectionRecord$1 r1 = new androidx.media.MediaBrowserServiceCompat$ConnectionRecord$1
                r1.<init>(r2)
                r0.post(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    interface MediaBrowserServiceImpl {
        android.os.Bundle getBrowserRootHints();

        androidx.media.MediaSessionManager.RemoteUserInfo getCurrentBrowserInfo();

        void notifyChildrenChanged(androidx.media.MediaSessionManager.RemoteUserInfo r1, java.lang.String r2, android.os.Bundle r3);

        void notifyChildrenChanged(java.lang.String r1, android.os.Bundle r2);

        android.os.IBinder onBind(android.content.Intent r1);

        void onCreate();

        void setSessionToken(android.support.v4.media.session.MediaSessionCompat.Token r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(21)
    class MediaBrowserServiceImplApi21 implements androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImpl, androidx.media.MediaBrowserServiceCompatApi21.ServiceCompatProxy {
        android.os.Messenger mMessenger;
        final java.util.List<android.os.Bundle> mRootExtrasList;
        java.lang.Object mServiceObj;
        final /* synthetic */ androidx.media.MediaBrowserServiceCompat this$0;





        MediaBrowserServiceImplApi21(androidx.media.MediaBrowserServiceCompat r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r0.mRootExtrasList = r1
                return
        }

        @Override // androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        public android.os.Bundle getBrowserRootHints() {
                r2 = this;
                android.os.Messenger r0 = r2.mMessenger
                r1 = 0
                if (r0 != 0) goto L6
                return r1
            L6:
                androidx.media.MediaBrowserServiceCompat r0 = r2.this$0
                androidx.media.MediaBrowserServiceCompat$ConnectionRecord r0 = r0.mCurConnection
                if (r0 == 0) goto L1d
                android.os.Bundle r0 = r0.rootHints
                if (r0 != 0) goto L11
                return r1
            L11:
                android.os.Bundle r0 = new android.os.Bundle
                androidx.media.MediaBrowserServiceCompat r1 = r2.this$0
                androidx.media.MediaBrowserServiceCompat$ConnectionRecord r1 = r1.mCurConnection
                android.os.Bundle r1 = r1.rootHints
                r0.<init>(r1)
                return r0
            L1d:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods"
                r0.<init>(r1)
                throw r0
        }

        @Override // androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        public androidx.media.MediaSessionManager.RemoteUserInfo getCurrentBrowserInfo() {
                r2 = this;
                androidx.media.MediaBrowserServiceCompat r0 = r2.this$0
                androidx.media.MediaBrowserServiceCompat$ConnectionRecord r0 = r0.mCurConnection
                if (r0 == 0) goto L9
                androidx.media.MediaSessionManager$RemoteUserInfo r0 = r0.browserInfo
                return r0
            L9:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods"
                r0.<init>(r1)
                throw r0
        }

        @Override // androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        public void notifyChildrenChanged(androidx.media.MediaSessionManager.RemoteUserInfo r1, java.lang.String r2, android.os.Bundle r3) {
                r0 = this;
                r0.notifyChildrenChangedForCompat(r1, r2, r3)
                return
        }

        @Override // androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        public void notifyChildrenChanged(java.lang.String r1, android.os.Bundle r2) {
                r0 = this;
                r0.notifyChildrenChangedForFramework(r1, r2)
                r0.notifyChildrenChangedForCompat(r1, r2)
                return
        }

        void notifyChildrenChangedForCompat(androidx.media.MediaSessionManager.RemoteUserInfo r3, java.lang.String r4, android.os.Bundle r5) {
                r2 = this;
                androidx.media.MediaBrowserServiceCompat r0 = r2.this$0
                androidx.media.MediaBrowserServiceCompat$ServiceHandler r0 = r0.mHandler
                androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi21$4 r1 = new androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi21$4
                r1.<init>(r2, r3, r4, r5)
                r0.post(r1)
                return
        }

        void notifyChildrenChangedForCompat(java.lang.String r3, android.os.Bundle r4) {
                r2 = this;
                androidx.media.MediaBrowserServiceCompat r0 = r2.this$0
                androidx.media.MediaBrowserServiceCompat$ServiceHandler r0 = r0.mHandler
                androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi21$3 r1 = new androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi21$3
                r1.<init>(r2, r3, r4)
                r0.post(r1)
                return
        }

        void notifyChildrenChangedForCompatOnHandler(androidx.media.MediaBrowserServiceCompat.ConnectionRecord r4, java.lang.String r5, android.os.Bundle r6) {
                r3 = this;
                java.util.HashMap<java.lang.String, java.util.List<androidx.core.util.Pair<android.os.IBinder, android.os.Bundle>>> r0 = r4.subscriptions
                java.lang.Object r0 = r0.get(r5)
                java.util.List r0 = (java.util.List) r0
                if (r0 == 0) goto L2e
                java.util.Iterator r0 = r0.iterator()
            Le:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L2e
                java.lang.Object r1 = r0.next()
                androidx.core.util.Pair r1 = (androidx.core.util.Pair) r1
                S r2 = r1.second
                android.os.Bundle r2 = (android.os.Bundle) r2
                boolean r2 = androidx.media.MediaBrowserCompatUtils.hasDuplicatedItems(r6, r2)
                if (r2 == 0) goto Le
                androidx.media.MediaBrowserServiceCompat r2 = r3.this$0
                S r1 = r1.second
                android.os.Bundle r1 = (android.os.Bundle) r1
                r2.performLoadChildren(r5, r4, r1, r6)
                goto Le
            L2e:
                return
        }

        void notifyChildrenChangedForFramework(java.lang.String r1, android.os.Bundle r2) {
                r0 = this;
                java.lang.Object r2 = r0.mServiceObj
                androidx.media.MediaBrowserServiceCompatApi21.notifyChildrenChanged(r2, r1)
                return
        }

        @Override // androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        public android.os.IBinder onBind(android.content.Intent r2) {
                r1 = this;
                java.lang.Object r0 = r1.mServiceObj
                android.os.IBinder r2 = androidx.media.MediaBrowserServiceCompatApi21.onBind(r0, r2)
                return r2
        }

        @Override // androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        public void onCreate() {
                r1 = this;
                androidx.media.MediaBrowserServiceCompat r0 = r1.this$0
                java.lang.Object r0 = androidx.media.MediaBrowserServiceCompatApi21.createService(r0, r1)
                r1.mServiceObj = r0
                androidx.media.MediaBrowserServiceCompatApi21.onCreate(r0)
                return
        }

        @Override // androidx.media.MediaBrowserServiceCompatApi21.ServiceCompatProxy
        public androidx.media.MediaBrowserServiceCompatApi21.BrowserRoot onGetRoot(java.lang.String r10, int r11, android.os.Bundle r12) {
                r9 = this;
                r0 = 0
                if (r12 == 0) goto L4e
                r1 = 0
                java.lang.String r2 = "extra_client_version"
                int r1 = r12.getInt(r2, r1)
                if (r1 == 0) goto L4e
                r12.remove(r2)
                android.os.Messenger r1 = new android.os.Messenger
                androidx.media.MediaBrowserServiceCompat r2 = r9.this$0
                androidx.media.MediaBrowserServiceCompat$ServiceHandler r2 = r2.mHandler
                r1.<init>(r2)
                r9.mMessenger = r1
                android.os.Bundle r1 = new android.os.Bundle
                r1.<init>()
                java.lang.String r2 = "extra_service_version"
                r3 = 2
                r1.putInt(r2, r3)
                android.os.Messenger r2 = r9.mMessenger
                android.os.IBinder r2 = r2.getBinder()
                java.lang.String r3 = "extra_messenger"
                androidx.core.app.BundleCompat.putBinder(r1, r3, r2)
                androidx.media.MediaBrowserServiceCompat r2 = r9.this$0
                android.support.v4.media.session.MediaSessionCompat$Token r2 = r2.mSession
                if (r2 == 0) goto L48
                android.support.v4.media.session.IMediaSession r2 = r2.getExtraBinder()
                if (r2 != 0) goto L3e
                r2 = r0
                goto L42
            L3e:
                android.os.IBinder r2 = r2.asBinder()
            L42:
                java.lang.String r3 = "extra_session_binder"
                androidx.core.app.BundleCompat.putBinder(r1, r3, r2)
                goto L4f
            L48:
                java.util.List<android.os.Bundle> r2 = r9.mRootExtrasList
                r2.add(r1)
                goto L4f
            L4e:
                r1 = r0
            L4f:
                androidx.media.MediaBrowserServiceCompat r3 = r9.this$0
                androidx.media.MediaBrowserServiceCompat$ConnectionRecord r2 = new androidx.media.MediaBrowserServiceCompat$ConnectionRecord
                r5 = -1
                r8 = 0
                r4 = r10
                r6 = r11
                r7 = r12
                r2.<init>(r3, r4, r5, r6, r7, r8)
                r3.mCurConnection = r2
                androidx.media.MediaBrowserServiceCompat r10 = r9.this$0
                androidx.media.MediaBrowserServiceCompat$BrowserRoot r10 = r10.onGetRoot(r4, r6, r7)
                androidx.media.MediaBrowserServiceCompat r11 = r9.this$0
                r11.mCurConnection = r0
                if (r10 != 0) goto L6a
                return r0
            L6a:
                if (r1 != 0) goto L71
                android.os.Bundle r1 = r10.getExtras()
                goto L7e
            L71:
                android.os.Bundle r11 = r10.getExtras()
                if (r11 == 0) goto L7e
                android.os.Bundle r11 = r10.getExtras()
                r1.putAll(r11)
            L7e:
                androidx.media.MediaBrowserServiceCompatApi21$BrowserRoot r11 = new androidx.media.MediaBrowserServiceCompatApi21$BrowserRoot
                java.lang.String r10 = r10.getRootId()
                r11.<init>(r10, r1)
                return r11
        }

        @Override // androidx.media.MediaBrowserServiceCompatApi21.ServiceCompatProxy
        public void onLoadChildren(java.lang.String r2, androidx.media.MediaBrowserServiceCompatApi21.ResultWrapper<java.util.List<android.os.Parcel>> r3) {
                r1 = this;
                androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi21$2 r0 = new androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi21$2
                r0.<init>(r1, r2, r3)
                androidx.media.MediaBrowserServiceCompat r3 = r1.this$0
                r3.onLoadChildren(r2, r0)
                return
        }

        @Override // androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        public void setSessionToken(android.support.v4.media.session.MediaSessionCompat.Token r3) {
                r2 = this;
                androidx.media.MediaBrowserServiceCompat r0 = r2.this$0
                androidx.media.MediaBrowserServiceCompat$ServiceHandler r0 = r0.mHandler
                androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi21$1 r1 = new androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi21$1
                r1.<init>(r2, r3)
                r0.postOrRun(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(23)
    class MediaBrowserServiceImplApi23 extends androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImplApi21 implements androidx.media.MediaBrowserServiceCompatApi23.ServiceCompatProxy {
        final /* synthetic */ androidx.media.MediaBrowserServiceCompat this$0;


        MediaBrowserServiceImplApi23(androidx.media.MediaBrowserServiceCompat r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r1)
                return
        }

        @Override // androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImplApi21, androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        public void onCreate() {
                r1 = this;
                androidx.media.MediaBrowserServiceCompat r0 = r1.this$0
                java.lang.Object r0 = androidx.media.MediaBrowserServiceCompatApi23.createService(r0, r1)
                r1.mServiceObj = r0
                androidx.media.MediaBrowserServiceCompatApi21.onCreate(r0)
                return
        }

        @Override // androidx.media.MediaBrowserServiceCompatApi23.ServiceCompatProxy
        public void onLoadItem(java.lang.String r2, androidx.media.MediaBrowserServiceCompatApi21.ResultWrapper<android.os.Parcel> r3) {
                r1 = this;
                androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi23$1 r0 = new androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi23$1
                r0.<init>(r1, r2, r3)
                androidx.media.MediaBrowserServiceCompat r3 = r1.this$0
                r3.onLoadItem(r2, r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(26)
    class MediaBrowserServiceImplApi26 extends androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImplApi23 implements androidx.media.MediaBrowserServiceCompatApi26.ServiceCompatProxy {
        final /* synthetic */ androidx.media.MediaBrowserServiceCompat this$0;


        MediaBrowserServiceImplApi26(androidx.media.MediaBrowserServiceCompat r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r1)
                return
        }

        @Override // androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImplApi21, androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        public android.os.Bundle getBrowserRootHints() {
                r2 = this;
                androidx.media.MediaBrowserServiceCompat r0 = r2.this$0
                androidx.media.MediaBrowserServiceCompat$ConnectionRecord r0 = r0.mCurConnection
                if (r0 == 0) goto L18
                android.os.Bundle r0 = r0.rootHints
                if (r0 != 0) goto Lc
                r0 = 0
                return r0
            Lc:
                android.os.Bundle r0 = new android.os.Bundle
                androidx.media.MediaBrowserServiceCompat r1 = r2.this$0
                androidx.media.MediaBrowserServiceCompat$ConnectionRecord r1 = r1.mCurConnection
                android.os.Bundle r1 = r1.rootHints
                r0.<init>(r1)
                return r0
            L18:
                java.lang.Object r0 = r2.mServiceObj
                android.os.Bundle r0 = androidx.media.MediaBrowserServiceCompatApi26.getBrowserRootHints(r0)
                return r0
        }

        @Override // androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImplApi21
        void notifyChildrenChangedForFramework(java.lang.String r2, android.os.Bundle r3) {
                r1 = this;
                if (r3 == 0) goto L8
                java.lang.Object r0 = r1.mServiceObj
                androidx.media.MediaBrowserServiceCompatApi26.notifyChildrenChanged(r0, r2, r3)
                return
            L8:
                super.notifyChildrenChangedForFramework(r2, r3)
                return
        }

        @Override // androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImplApi23, androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImplApi21, androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        public void onCreate() {
                r1 = this;
                androidx.media.MediaBrowserServiceCompat r0 = r1.this$0
                java.lang.Object r0 = androidx.media.MediaBrowserServiceCompatApi26.createService(r0, r1)
                r1.mServiceObj = r0
                androidx.media.MediaBrowserServiceCompatApi21.onCreate(r0)
                return
        }

        @Override // androidx.media.MediaBrowserServiceCompatApi26.ServiceCompatProxy
        public void onLoadChildren(java.lang.String r2, androidx.media.MediaBrowserServiceCompatApi26.ResultWrapper r3, android.os.Bundle r4) {
                r1 = this;
                androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi26$1 r0 = new androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi26$1
                r0.<init>(r1, r2, r3)
                androidx.media.MediaBrowserServiceCompat r3 = r1.this$0
                r3.onLoadChildren(r2, r0, r4)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(28)
    class MediaBrowserServiceImplApi28 extends androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImplApi26 {
        final /* synthetic */ androidx.media.MediaBrowserServiceCompat this$0;

        MediaBrowserServiceImplApi28(androidx.media.MediaBrowserServiceCompat r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r1)
                return
        }

        @Override // androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImplApi21, androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        public androidx.media.MediaSessionManager.RemoteUserInfo getCurrentBrowserInfo() {
                r2 = this;
                androidx.media.MediaBrowserServiceCompat r0 = r2.this$0
                androidx.media.MediaBrowserServiceCompat$ConnectionRecord r0 = r0.mCurConnection
                if (r0 == 0) goto L9
                androidx.media.MediaSessionManager$RemoteUserInfo r0 = r0.browserInfo
                return r0
            L9:
                java.lang.Object r0 = r2.mServiceObj
                android.service.media.MediaBrowserService r0 = (android.service.media.MediaBrowserService) r0
                android.media.session.MediaSessionManager$RemoteUserInfo r0 = androidx.media.b.a(r0)
                androidx.media.MediaSessionManager$RemoteUserInfo r1 = new androidx.media.MediaSessionManager$RemoteUserInfo
                r1.<init>(r0)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class MediaBrowserServiceImplBase implements androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImpl {
        private android.os.Messenger mMessenger;
        final /* synthetic */ androidx.media.MediaBrowserServiceCompat this$0;




        MediaBrowserServiceImplBase(androidx.media.MediaBrowserServiceCompat r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        public android.os.Bundle getBrowserRootHints() {
                r2 = this;
                androidx.media.MediaBrowserServiceCompat r0 = r2.this$0
                androidx.media.MediaBrowserServiceCompat$ConnectionRecord r0 = r0.mCurConnection
                if (r0 == 0) goto L18
                android.os.Bundle r0 = r0.rootHints
                if (r0 != 0) goto Lc
                r0 = 0
                return r0
            Lc:
                android.os.Bundle r0 = new android.os.Bundle
                androidx.media.MediaBrowserServiceCompat r1 = r2.this$0
                androidx.media.MediaBrowserServiceCompat$ConnectionRecord r1 = r1.mCurConnection
                android.os.Bundle r1 = r1.rootHints
                r0.<init>(r1)
                return r0
            L18:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "This should be called inside of onLoadChildren, onLoadItem, onSearch, or onCustomAction methods"
                r0.<init>(r1)
                throw r0
        }

        @Override // androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        public androidx.media.MediaSessionManager.RemoteUserInfo getCurrentBrowserInfo() {
                r2 = this;
                androidx.media.MediaBrowserServiceCompat r0 = r2.this$0
                androidx.media.MediaBrowserServiceCompat$ConnectionRecord r0 = r0.mCurConnection
                if (r0 == 0) goto L9
                androidx.media.MediaSessionManager$RemoteUserInfo r0 = r0.browserInfo
                return r0
            L9:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "This should be called inside of onLoadChildren, onLoadItem, onSearch, or onCustomAction methods"
                r0.<init>(r1)
                throw r0
        }

        @Override // androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        public void notifyChildrenChanged(@androidx.annotation.NonNull androidx.media.MediaSessionManager.RemoteUserInfo r3, @androidx.annotation.NonNull java.lang.String r4, android.os.Bundle r5) {
                r2 = this;
                androidx.media.MediaBrowserServiceCompat r0 = r2.this$0
                androidx.media.MediaBrowserServiceCompat$ServiceHandler r0 = r0.mHandler
                androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplBase$3 r1 = new androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplBase$3
                r1.<init>(r2, r3, r4, r5)
                r0.post(r1)
                return
        }

        @Override // androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        public void notifyChildrenChanged(@androidx.annotation.NonNull java.lang.String r3, android.os.Bundle r4) {
                r2 = this;
                androidx.media.MediaBrowserServiceCompat r0 = r2.this$0
                androidx.media.MediaBrowserServiceCompat$ServiceHandler r0 = r0.mHandler
                androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplBase$2 r1 = new androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplBase$2
                r1.<init>(r2, r3, r4)
                r0.post(r1)
                return
        }

        void notifyChildrenChangedOnHandler(androidx.media.MediaBrowserServiceCompat.ConnectionRecord r4, java.lang.String r5, android.os.Bundle r6) {
                r3 = this;
                java.util.HashMap<java.lang.String, java.util.List<androidx.core.util.Pair<android.os.IBinder, android.os.Bundle>>> r0 = r4.subscriptions
                java.lang.Object r0 = r0.get(r5)
                java.util.List r0 = (java.util.List) r0
                if (r0 == 0) goto L2e
                java.util.Iterator r0 = r0.iterator()
            Le:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L2e
                java.lang.Object r1 = r0.next()
                androidx.core.util.Pair r1 = (androidx.core.util.Pair) r1
                S r2 = r1.second
                android.os.Bundle r2 = (android.os.Bundle) r2
                boolean r2 = androidx.media.MediaBrowserCompatUtils.hasDuplicatedItems(r6, r2)
                if (r2 == 0) goto Le
                androidx.media.MediaBrowserServiceCompat r2 = r3.this$0
                S r1 = r1.second
                android.os.Bundle r1 = (android.os.Bundle) r1
                r2.performLoadChildren(r5, r4, r1, r6)
                goto Le
            L2e:
                return
        }

        @Override // androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        public android.os.IBinder onBind(android.content.Intent r2) {
                r1 = this;
                java.lang.String r0 = "android.media.browse.MediaBrowserService"
                java.lang.String r2 = r2.getAction()
                boolean r2 = r0.equals(r2)
                if (r2 == 0) goto L13
                android.os.Messenger r2 = r1.mMessenger
                android.os.IBinder r2 = r2.getBinder()
                return r2
            L13:
                r2 = 0
                return r2
        }

        @Override // androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        public void onCreate() {
                r2 = this;
                android.os.Messenger r0 = new android.os.Messenger
                androidx.media.MediaBrowserServiceCompat r1 = r2.this$0
                androidx.media.MediaBrowserServiceCompat$ServiceHandler r1 = r1.mHandler
                r0.<init>(r1)
                r2.mMessenger = r0
                return
        }

        @Override // androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        public void setSessionToken(android.support.v4.media.session.MediaSessionCompat.Token r3) {
                r2 = this;
                androidx.media.MediaBrowserServiceCompat r0 = r2.this$0
                androidx.media.MediaBrowserServiceCompat$ServiceHandler r0 = r0.mHandler
                androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplBase$1 r1 = new androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplBase$1
                r1.<init>(r2, r3)
                r0.post(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class Result<T> {
        private final java.lang.Object mDebug;
        private boolean mDetachCalled;
        private int mFlags;
        private boolean mSendErrorCalled;
        private boolean mSendProgressUpdateCalled;
        private boolean mSendResultCalled;

        Result(java.lang.Object r1) {
                r0 = this;
                r0.<init>()
                r0.mDebug = r1
                return
        }

        private void checkExtraFields(android.os.Bundle r3) {
                r2 = this;
                if (r3 != 0) goto L3
                goto L26
            L3:
                java.lang.String r0 = "android.media.browse.extra.DOWNLOAD_PROGRESS"
                boolean r1 = r3.containsKey(r0)
                if (r1 == 0) goto L26
                float r3 = r3.getFloat(r0)
                r0 = -1222130260(0xffffffffb727c5ac, float:-1.0E-5)
                int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
                if (r0 < 0) goto L1e
                r0 = 1065353300(0x3f800054, float:1.00001)
                int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
                if (r3 > 0) goto L1e
                goto L26
            L1e:
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "The value of the EXTRA_DOWNLOAD_PROGRESS field must be a float number within [0.0, 1.0]."
                r3.<init>(r0)
                throw r3
            L26:
                return
        }

        public void detach() {
                r3 = this;
                boolean r0 = r3.mDetachCalled
                if (r0 != 0) goto L42
                boolean r0 = r3.mSendResultCalled
                if (r0 != 0) goto L29
                boolean r0 = r3.mSendErrorCalled
                if (r0 != 0) goto L10
                r0 = 1
                r3.mDetachCalled = r0
                return
            L10:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "detach() called when sendError() had already been called for: "
                r1.append(r2)
                java.lang.Object r2 = r3.mDebug
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L29:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "detach() called when sendResult() had already been called for: "
                r1.append(r2)
                java.lang.Object r2 = r3.mDebug
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L42:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "detach() called when detach() had already been called for: "
                r1.append(r2)
                java.lang.Object r2 = r3.mDebug
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
        }

        int getFlags() {
                r1 = this;
                int r0 = r1.mFlags
                return r0
        }

        boolean isDone() {
                r1 = this;
                boolean r0 = r1.mDetachCalled
                if (r0 != 0) goto Lf
                boolean r0 = r1.mSendResultCalled
                if (r0 != 0) goto Lf
                boolean r0 = r1.mSendErrorCalled
                if (r0 == 0) goto Ld
                goto Lf
            Ld:
                r0 = 0
                return r0
            Lf:
                r0 = 1
                return r0
        }

        void onErrorSent(android.os.Bundle r3) {
                r2 = this;
                java.lang.UnsupportedOperationException r3 = new java.lang.UnsupportedOperationException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "It is not supported to send an error for "
                r0.append(r1)
                java.lang.Object r1 = r2.mDebug
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r3.<init>(r0)
                throw r3
        }

        void onProgressUpdateSent(android.os.Bundle r3) {
                r2 = this;
                java.lang.UnsupportedOperationException r3 = new java.lang.UnsupportedOperationException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "It is not supported to send an interim update for "
                r0.append(r1)
                java.lang.Object r1 = r2.mDebug
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r3.<init>(r0)
                throw r3
        }

        void onResultSent(T r1) {
                r0 = this;
                return
        }

        public void sendError(android.os.Bundle r3) {
                r2 = this;
                boolean r0 = r2.mSendResultCalled
                if (r0 != 0) goto Lf
                boolean r0 = r2.mSendErrorCalled
                if (r0 != 0) goto Lf
                r0 = 1
                r2.mSendErrorCalled = r0
                r2.onErrorSent(r3)
                return
            Lf:
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "sendError() called when either sendResult() or sendError() had already been called for: "
                r0.append(r1)
                java.lang.Object r1 = r2.mDebug
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r3.<init>(r0)
                throw r3
        }

        public void sendProgressUpdate(android.os.Bundle r3) {
                r2 = this;
                boolean r0 = r2.mSendResultCalled
                if (r0 != 0) goto L12
                boolean r0 = r2.mSendErrorCalled
                if (r0 != 0) goto L12
                r2.checkExtraFields(r3)
                r0 = 1
                r2.mSendProgressUpdateCalled = r0
                r2.onProgressUpdateSent(r3)
                return
            L12:
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "sendProgressUpdate() called when either sendResult() or sendError() had already been called for: "
                r0.append(r1)
                java.lang.Object r1 = r2.mDebug
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r3.<init>(r0)
                throw r3
        }

        public void sendResult(T r3) {
                r2 = this;
                boolean r0 = r2.mSendResultCalled
                if (r0 != 0) goto Lf
                boolean r0 = r2.mSendErrorCalled
                if (r0 != 0) goto Lf
                r0 = 1
                r2.mSendResultCalled = r0
                r2.onResultSent(r3)
                return
            Lf:
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "sendResult() called when either sendResult() or sendError() had already been called for: "
                r0.append(r1)
                java.lang.Object r1 = r2.mDebug
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r3.<init>(r0)
                throw r3
        }

        void setFlags(int r1) {
                r0 = this;
                r0.mFlags = r1
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class ServiceBinderImpl {
        final /* synthetic */ androidx.media.MediaBrowserServiceCompat this$0;










        ServiceBinderImpl(androidx.media.MediaBrowserServiceCompat r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        public void addSubscription(java.lang.String r8, android.os.IBinder r9, android.os.Bundle r10, androidx.media.MediaBrowserServiceCompat.ServiceCallbacks r11) {
                r7 = this;
                androidx.media.MediaBrowserServiceCompat r0 = r7.this$0
                androidx.media.MediaBrowserServiceCompat$ServiceHandler r0 = r0.mHandler
                androidx.media.MediaBrowserServiceCompat$ServiceBinderImpl$3 r1 = new androidx.media.MediaBrowserServiceCompat$ServiceBinderImpl$3
                r2 = r7
                r4 = r8
                r5 = r9
                r6 = r10
                r3 = r11
                r1.<init>(r2, r3, r4, r5, r6)
                r0.postOrRun(r1)
                return
        }

        public void connect(java.lang.String r9, int r10, int r11, android.os.Bundle r12, androidx.media.MediaBrowserServiceCompat.ServiceCallbacks r13) {
                r8 = this;
                androidx.media.MediaBrowserServiceCompat r0 = r8.this$0
                boolean r0 = r0.isValidPackage(r9, r11)
                if (r0 == 0) goto L1b
                androidx.media.MediaBrowserServiceCompat r0 = r8.this$0
                androidx.media.MediaBrowserServiceCompat$ServiceHandler r0 = r0.mHandler
                androidx.media.MediaBrowserServiceCompat$ServiceBinderImpl$1 r1 = new androidx.media.MediaBrowserServiceCompat$ServiceBinderImpl$1
                r2 = r8
                r4 = r9
                r5 = r10
                r6 = r11
                r7 = r12
                r3 = r13
                r1.<init>(r2, r3, r4, r5, r6, r7)
                r0.postOrRun(r1)
                return
            L1b:
                r4 = r9
                r6 = r11
                java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                java.lang.String r11 = "Package/uid mismatch: uid="
                r10.append(r11)
                r10.append(r6)
                java.lang.String r11 = " package="
                r10.append(r11)
                r10.append(r4)
                java.lang.String r10 = r10.toString()
                r9.<init>(r10)
                throw r9
        }

        public void disconnect(androidx.media.MediaBrowserServiceCompat.ServiceCallbacks r3) {
                r2 = this;
                androidx.media.MediaBrowserServiceCompat r0 = r2.this$0
                androidx.media.MediaBrowserServiceCompat$ServiceHandler r0 = r0.mHandler
                androidx.media.MediaBrowserServiceCompat$ServiceBinderImpl$2 r1 = new androidx.media.MediaBrowserServiceCompat$ServiceBinderImpl$2
                r1.<init>(r2, r3)
                r0.postOrRun(r1)
                return
        }

        public void getMediaItem(java.lang.String r3, android.support.v4.os.ResultReceiver r4, androidx.media.MediaBrowserServiceCompat.ServiceCallbacks r5) {
                r2 = this;
                boolean r0 = android.text.TextUtils.isEmpty(r3)
                if (r0 != 0) goto L15
                if (r4 != 0) goto L9
                goto L15
            L9:
                androidx.media.MediaBrowserServiceCompat r0 = r2.this$0
                androidx.media.MediaBrowserServiceCompat$ServiceHandler r0 = r0.mHandler
                androidx.media.MediaBrowserServiceCompat$ServiceBinderImpl$5 r1 = new androidx.media.MediaBrowserServiceCompat$ServiceBinderImpl$5
                r1.<init>(r2, r5, r3, r4)
                r0.postOrRun(r1)
            L15:
                return
        }

        public void registerCallbacks(androidx.media.MediaBrowserServiceCompat.ServiceCallbacks r9, java.lang.String r10, int r11, int r12, android.os.Bundle r13) {
                r8 = this;
                androidx.media.MediaBrowserServiceCompat r0 = r8.this$0
                androidx.media.MediaBrowserServiceCompat$ServiceHandler r0 = r0.mHandler
                androidx.media.MediaBrowserServiceCompat$ServiceBinderImpl$6 r1 = new androidx.media.MediaBrowserServiceCompat$ServiceBinderImpl$6
                r2 = r8
                r3 = r9
                r4 = r10
                r5 = r11
                r6 = r12
                r7 = r13
                r1.<init>(r2, r3, r4, r5, r6, r7)
                r0.postOrRun(r1)
                return
        }

        public void removeSubscription(java.lang.String r3, android.os.IBinder r4, androidx.media.MediaBrowserServiceCompat.ServiceCallbacks r5) {
                r2 = this;
                androidx.media.MediaBrowserServiceCompat r0 = r2.this$0
                androidx.media.MediaBrowserServiceCompat$ServiceHandler r0 = r0.mHandler
                androidx.media.MediaBrowserServiceCompat$ServiceBinderImpl$4 r1 = new androidx.media.MediaBrowserServiceCompat$ServiceBinderImpl$4
                r1.<init>(r2, r5, r3, r4)
                r0.postOrRun(r1)
                return
        }

        public void search(java.lang.String r8, android.os.Bundle r9, android.support.v4.os.ResultReceiver r10, androidx.media.MediaBrowserServiceCompat.ServiceCallbacks r11) {
                r7 = this;
                boolean r0 = android.text.TextUtils.isEmpty(r8)
                if (r0 != 0) goto L1a
                if (r10 != 0) goto L9
                goto L1a
            L9:
                androidx.media.MediaBrowserServiceCompat r0 = r7.this$0
                androidx.media.MediaBrowserServiceCompat$ServiceHandler r0 = r0.mHandler
                androidx.media.MediaBrowserServiceCompat$ServiceBinderImpl$8 r1 = new androidx.media.MediaBrowserServiceCompat$ServiceBinderImpl$8
                r2 = r7
                r4 = r8
                r5 = r9
                r6 = r10
                r3 = r11
                r1.<init>(r2, r3, r4, r5, r6)
                r0.postOrRun(r1)
            L1a:
                return
        }

        public void sendCustomAction(java.lang.String r8, android.os.Bundle r9, android.support.v4.os.ResultReceiver r10, androidx.media.MediaBrowserServiceCompat.ServiceCallbacks r11) {
                r7 = this;
                boolean r0 = android.text.TextUtils.isEmpty(r8)
                if (r0 != 0) goto L1a
                if (r10 != 0) goto L9
                goto L1a
            L9:
                androidx.media.MediaBrowserServiceCompat r0 = r7.this$0
                androidx.media.MediaBrowserServiceCompat$ServiceHandler r0 = r0.mHandler
                androidx.media.MediaBrowserServiceCompat$ServiceBinderImpl$9 r1 = new androidx.media.MediaBrowserServiceCompat$ServiceBinderImpl$9
                r2 = r7
                r4 = r8
                r5 = r9
                r6 = r10
                r3 = r11
                r1.<init>(r2, r3, r4, r5, r6)
                r0.postOrRun(r1)
            L1a:
                return
        }

        public void unregisterCallbacks(androidx.media.MediaBrowserServiceCompat.ServiceCallbacks r3) {
                r2 = this;
                androidx.media.MediaBrowserServiceCompat r0 = r2.this$0
                androidx.media.MediaBrowserServiceCompat$ServiceHandler r0 = r0.mHandler
                androidx.media.MediaBrowserServiceCompat$ServiceBinderImpl$7 r1 = new androidx.media.MediaBrowserServiceCompat$ServiceBinderImpl$7
                r1.<init>(r2, r3)
                r0.postOrRun(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private interface ServiceCallbacks {
        android.os.IBinder asBinder();

        void onConnect(java.lang.String r1, android.support.v4.media.session.MediaSessionCompat.Token r2, android.os.Bundle r3) throws android.os.RemoteException;

        void onConnectFailed() throws android.os.RemoteException;

        void onLoadChildren(java.lang.String r1, java.util.List<android.support.v4.media.MediaBrowserCompat.MediaItem> r2, android.os.Bundle r3, android.os.Bundle r4) throws android.os.RemoteException;
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class ServiceCallbacksCompat implements androidx.media.MediaBrowserServiceCompat.ServiceCallbacks {
        final android.os.Messenger mCallbacks;

        ServiceCallbacksCompat(android.os.Messenger r1) {
                r0 = this;
                r0.<init>()
                r0.mCallbacks = r1
                return
        }

        private void sendRequest(int r2, android.os.Bundle r3) throws android.os.RemoteException {
                r1 = this;
                android.os.Message r0 = android.os.Message.obtain()
                r0.what = r2
                r2 = 2
                r0.arg1 = r2
                r0.setData(r3)
                android.os.Messenger r2 = r1.mCallbacks
                r2.send(r0)
                return
        }

        @Override // androidx.media.MediaBrowserServiceCompat.ServiceCallbacks
        public android.os.IBinder asBinder() {
                r1 = this;
                android.os.Messenger r0 = r1.mCallbacks
                android.os.IBinder r0 = r0.getBinder()
                return r0
        }

        @Override // androidx.media.MediaBrowserServiceCompat.ServiceCallbacks
        public void onConnect(java.lang.String r3, android.support.v4.media.session.MediaSessionCompat.Token r4, android.os.Bundle r5) throws android.os.RemoteException {
                r2 = this;
                if (r5 != 0) goto L7
                android.os.Bundle r5 = new android.os.Bundle
                r5.<init>()
            L7:
                java.lang.String r0 = "extra_service_version"
                r1 = 2
                r5.putInt(r0, r1)
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                java.lang.String r1 = "data_media_item_id"
                r0.putString(r1, r3)
                java.lang.String r3 = "data_media_session_token"
                r0.putParcelable(r3, r4)
                java.lang.String r3 = "data_root_hints"
                r0.putBundle(r3, r5)
                r3 = 1
                r2.sendRequest(r3, r0)
                return
        }

        @Override // androidx.media.MediaBrowserServiceCompat.ServiceCallbacks
        public void onConnectFailed() throws android.os.RemoteException {
                r2 = this;
                r0 = 2
                r1 = 0
                r2.sendRequest(r0, r1)
                return
        }

        @Override // androidx.media.MediaBrowserServiceCompat.ServiceCallbacks
        public void onLoadChildren(java.lang.String r3, java.util.List<android.support.v4.media.MediaBrowserCompat.MediaItem> r4, android.os.Bundle r5, android.os.Bundle r6) throws android.os.RemoteException {
                r2 = this;
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                java.lang.String r1 = "data_media_item_id"
                r0.putString(r1, r3)
                java.lang.String r3 = "data_options"
                r0.putBundle(r3, r5)
                java.lang.String r3 = "data_notify_children_changed_options"
                r0.putBundle(r3, r6)
                if (r4 == 0) goto L28
                boolean r3 = r4 instanceof java.util.ArrayList
                if (r3 == 0) goto L1d
                java.util.ArrayList r4 = (java.util.ArrayList) r4
                goto L23
            L1d:
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>(r4)
                r4 = r3
            L23:
                java.lang.String r3 = "data_media_item_list"
                r0.putParcelableArrayList(r3, r4)
            L28:
                r3 = 3
                r2.sendRequest(r3, r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class ServiceHandler extends android.os.Handler {
        private final androidx.media.MediaBrowserServiceCompat.ServiceBinderImpl mServiceBinderImpl;
        final /* synthetic */ androidx.media.MediaBrowserServiceCompat this$0;

        ServiceHandler(androidx.media.MediaBrowserServiceCompat r2) {
                r1 = this;
                r1.this$0 = r2
                r1.<init>()
                androidx.media.MediaBrowserServiceCompat$ServiceBinderImpl r0 = new androidx.media.MediaBrowserServiceCompat$ServiceBinderImpl
                r0.<init>(r2)
                r1.mServiceBinderImpl = r0
                return
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message r10) {
                r9 = this;
                android.os.Bundle r0 = r10.getData()
                int r1 = r10.what
                java.lang.String r2 = "data_callback_token"
                java.lang.String r3 = "data_calling_uid"
                java.lang.String r4 = "data_calling_pid"
                java.lang.String r5 = "data_package_name"
                java.lang.String r6 = "data_root_hints"
                java.lang.String r7 = "data_media_item_id"
                java.lang.String r8 = "data_result_receiver"
                switch(r1) {
                    case 1: goto Le5;
                    case 2: goto Ld8;
                    case 3: goto Lba;
                    case 4: goto La5;
                    case 5: goto L8e;
                    case 6: goto L6c;
                    case 7: goto L5f;
                    case 8: goto L3d;
                    case 9: goto L1b;
                    default: goto L17;
                }
            L17:
                r10.toString()
                return
            L1b:
                java.lang.String r1 = "data_custom_action_extras"
                android.os.Bundle r1 = r0.getBundle(r1)
                android.support.v4.media.session.MediaSessionCompat.ensureClassLoader(r1)
                androidx.media.MediaBrowserServiceCompat$ServiceBinderImpl r2 = r9.mServiceBinderImpl
                java.lang.String r3 = "data_custom_action"
                java.lang.String r3 = r0.getString(r3)
                android.os.Parcelable r0 = r0.getParcelable(r8)
                android.support.v4.os.ResultReceiver r0 = (android.support.v4.os.ResultReceiver) r0
                androidx.media.MediaBrowserServiceCompat$ServiceCallbacksCompat r4 = new androidx.media.MediaBrowserServiceCompat$ServiceCallbacksCompat
                android.os.Messenger r10 = r10.replyTo
                r4.<init>(r10)
                r2.sendCustomAction(r3, r1, r0, r4)
                return
            L3d:
                java.lang.String r1 = "data_search_extras"
                android.os.Bundle r1 = r0.getBundle(r1)
                android.support.v4.media.session.MediaSessionCompat.ensureClassLoader(r1)
                androidx.media.MediaBrowserServiceCompat$ServiceBinderImpl r2 = r9.mServiceBinderImpl
                java.lang.String r3 = "data_search_query"
                java.lang.String r3 = r0.getString(r3)
                android.os.Parcelable r0 = r0.getParcelable(r8)
                android.support.v4.os.ResultReceiver r0 = (android.support.v4.os.ResultReceiver) r0
                androidx.media.MediaBrowserServiceCompat$ServiceCallbacksCompat r4 = new androidx.media.MediaBrowserServiceCompat$ServiceCallbacksCompat
                android.os.Messenger r10 = r10.replyTo
                r4.<init>(r10)
                r2.search(r3, r1, r0, r4)
                return
            L5f:
                androidx.media.MediaBrowserServiceCompat$ServiceBinderImpl r0 = r9.mServiceBinderImpl
                androidx.media.MediaBrowserServiceCompat$ServiceCallbacksCompat r1 = new androidx.media.MediaBrowserServiceCompat$ServiceCallbacksCompat
                android.os.Messenger r10 = r10.replyTo
                r1.<init>(r10)
                r0.unregisterCallbacks(r1)
                return
            L6c:
                android.os.Bundle r7 = r0.getBundle(r6)
                android.support.v4.media.session.MediaSessionCompat.ensureClassLoader(r7)
                androidx.media.MediaBrowserServiceCompat$ServiceBinderImpl r2 = r9.mServiceBinderImpl
                r1 = r3
                androidx.media.MediaBrowserServiceCompat$ServiceCallbacksCompat r3 = new androidx.media.MediaBrowserServiceCompat$ServiceCallbacksCompat
                android.os.Messenger r10 = r10.replyTo
                r3.<init>(r10)
                r8 = r4
                java.lang.String r4 = r0.getString(r5)
                int r5 = r0.getInt(r8)
                int r6 = r0.getInt(r1)
                r2.registerCallbacks(r3, r4, r5, r6, r7)
                return
            L8e:
                androidx.media.MediaBrowserServiceCompat$ServiceBinderImpl r1 = r9.mServiceBinderImpl
                java.lang.String r2 = r0.getString(r7)
                android.os.Parcelable r0 = r0.getParcelable(r8)
                android.support.v4.os.ResultReceiver r0 = (android.support.v4.os.ResultReceiver) r0
                androidx.media.MediaBrowserServiceCompat$ServiceCallbacksCompat r3 = new androidx.media.MediaBrowserServiceCompat$ServiceCallbacksCompat
                android.os.Messenger r10 = r10.replyTo
                r3.<init>(r10)
                r1.getMediaItem(r2, r0, r3)
                return
            La5:
                androidx.media.MediaBrowserServiceCompat$ServiceBinderImpl r1 = r9.mServiceBinderImpl
                java.lang.String r3 = r0.getString(r7)
                android.os.IBinder r0 = androidx.core.app.BundleCompat.getBinder(r0, r2)
                androidx.media.MediaBrowserServiceCompat$ServiceCallbacksCompat r2 = new androidx.media.MediaBrowserServiceCompat$ServiceCallbacksCompat
                android.os.Messenger r10 = r10.replyTo
                r2.<init>(r10)
                r1.removeSubscription(r3, r0, r2)
                return
            Lba:
                java.lang.String r1 = "data_options"
                android.os.Bundle r1 = r0.getBundle(r1)
                android.support.v4.media.session.MediaSessionCompat.ensureClassLoader(r1)
                androidx.media.MediaBrowserServiceCompat$ServiceBinderImpl r3 = r9.mServiceBinderImpl
                java.lang.String r4 = r0.getString(r7)
                android.os.IBinder r0 = androidx.core.app.BundleCompat.getBinder(r0, r2)
                androidx.media.MediaBrowserServiceCompat$ServiceCallbacksCompat r2 = new androidx.media.MediaBrowserServiceCompat$ServiceCallbacksCompat
                android.os.Messenger r10 = r10.replyTo
                r2.<init>(r10)
                r3.addSubscription(r4, r0, r1, r2)
                return
            Ld8:
                androidx.media.MediaBrowserServiceCompat$ServiceBinderImpl r0 = r9.mServiceBinderImpl
                androidx.media.MediaBrowserServiceCompat$ServiceCallbacksCompat r1 = new androidx.media.MediaBrowserServiceCompat$ServiceCallbacksCompat
                android.os.Messenger r10 = r10.replyTo
                r1.<init>(r10)
                r0.disconnect(r1)
                return
            Le5:
                r1 = r3
                r8 = r4
                android.os.Bundle r6 = r0.getBundle(r6)
                android.support.v4.media.session.MediaSessionCompat.ensureClassLoader(r6)
                androidx.media.MediaBrowserServiceCompat$ServiceBinderImpl r2 = r9.mServiceBinderImpl
                java.lang.String r3 = r0.getString(r5)
                int r4 = r0.getInt(r8)
                int r5 = r0.getInt(r1)
                androidx.media.MediaBrowserServiceCompat$ServiceCallbacksCompat r7 = new androidx.media.MediaBrowserServiceCompat$ServiceCallbacksCompat
                android.os.Messenger r10 = r10.replyTo
                r7.<init>(r10)
                r2.connect(r3, r4, r5, r6, r7)
                return
        }

        public void postOrRun(java.lang.Runnable r3) {
                r2 = this;
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                android.os.Looper r1 = r2.getLooper()
                java.lang.Thread r1 = r1.getThread()
                if (r0 != r1) goto L12
                r3.run()
                return
            L12:
                r2.post(r3)
                return
        }

        @Override // android.os.Handler
        public boolean sendMessageAtTime(android.os.Message r4, long r5) {
                r3 = this;
                android.os.Bundle r0 = r4.getData()
                java.lang.Class<android.support.v4.media.MediaBrowserCompat> r1 = android.support.v4.media.MediaBrowserCompat.class
                java.lang.ClassLoader r1 = r1.getClassLoader()
                r0.setClassLoader(r1)
                java.lang.String r1 = "data_calling_uid"
                int r2 = android.os.Binder.getCallingUid()
                r0.putInt(r1, r2)
                java.lang.String r1 = "data_calling_pid"
                int r2 = android.os.Binder.getCallingPid()
                r0.putInt(r1, r2)
                boolean r4 = super.sendMessageAtTime(r4, r5)
                return r4
        }
    }

    static {
            java.lang.String r0 = "MBServiceCompat"
            r1 = 3
            boolean r0 = android.util.Log.isLoggable(r0, r1)
            androidx.media.MediaBrowserServiceCompat.DEBUG = r0
            return
    }

    public MediaBrowserServiceCompat() {
            r1 = this;
            r1.<init>()
            androidx.collection.ArrayMap r0 = new androidx.collection.ArrayMap
            r0.<init>()
            r1.mConnections = r0
            androidx.media.MediaBrowserServiceCompat$ServiceHandler r0 = new androidx.media.MediaBrowserServiceCompat$ServiceHandler
            r0.<init>(r1)
            r1.mHandler = r0
            return
    }

    void addSubscription(java.lang.String r5, androidx.media.MediaBrowserServiceCompat.ConnectionRecord r6, android.os.IBinder r7, android.os.Bundle r8) {
            r4 = this;
            java.util.HashMap<java.lang.String, java.util.List<androidx.core.util.Pair<android.os.IBinder, android.os.Bundle>>> r0 = r6.subscriptions
            java.lang.Object r0 = r0.get(r5)
            java.util.List r0 = (java.util.List) r0
            if (r0 != 0) goto Lf
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        Lf:
            java.util.Iterator r1 = r0.iterator()
        L13:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2e
            java.lang.Object r2 = r1.next()
            androidx.core.util.Pair r2 = (androidx.core.util.Pair) r2
            F r3 = r2.first
            if (r7 != r3) goto L13
            S r2 = r2.second
            android.os.Bundle r2 = (android.os.Bundle) r2
            boolean r2 = androidx.media.MediaBrowserCompatUtils.areSameOptions(r8, r2)
            if (r2 == 0) goto L13
            return
        L2e:
            androidx.core.util.Pair r1 = new androidx.core.util.Pair
            r1.<init>(r7, r8)
            r0.add(r1)
            java.util.HashMap<java.lang.String, java.util.List<androidx.core.util.Pair<android.os.IBinder, android.os.Bundle>>> r7 = r6.subscriptions
            r7.put(r5, r0)
            r7 = 0
            r4.performLoadChildren(r5, r6, r8, r7)
            r4.mCurConnection = r6
            r4.onSubscribe(r5, r8)
            r4.mCurConnection = r7
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

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public void attachToBaseContext(android.content.Context r1) {
            r0 = this;
            r0.attachBaseContext(r1)
            return
    }

    @Override // android.app.Service
    public void dump(java.io.FileDescriptor r1, java.io.PrintWriter r2, java.lang.String[] r3) {
            r0 = this;
            return
    }

    public final android.os.Bundle getBrowserRootHints() {
            r1 = this;
            androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImpl r0 = r1.mImpl
            android.os.Bundle r0 = r0.getBrowserRootHints()
            return r0
    }

    @androidx.annotation.NonNull
    public final androidx.media.MediaSessionManager.RemoteUserInfo getCurrentBrowserInfo() {
            r1 = this;
            androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImpl r0 = r1.mImpl
            androidx.media.MediaSessionManager$RemoteUserInfo r0 = r0.getCurrentBrowserInfo()
            return r0
    }

    @androidx.annotation.Nullable
    public android.support.v4.media.session.MediaSessionCompat.Token getSessionToken() {
            r1 = this;
            android.support.v4.media.session.MediaSessionCompat$Token r0 = r1.mSession
            return r0
    }

    boolean isValidPackage(java.lang.String r5, int r6) {
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            android.content.pm.PackageManager r1 = r4.getPackageManager()
            java.lang.String[] r6 = r1.getPackagesForUid(r6)
            int r1 = r6.length
            r2 = 0
        Le:
            if (r2 >= r1) goto L1d
            r3 = r6[r2]
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L1a
            r5 = 1
            return r5
        L1a:
            int r2 = r2 + 1
            goto Le
        L1d:
            return r0
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public void notifyChildrenChanged(@androidx.annotation.NonNull androidx.media.MediaSessionManager.RemoteUserInfo r2, @androidx.annotation.NonNull java.lang.String r3, @androidx.annotation.NonNull android.os.Bundle r4) {
            r1 = this;
            if (r2 == 0) goto L1c
            if (r3 == 0) goto L14
            if (r4 == 0) goto Lc
            androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImpl r0 = r1.mImpl
            r0.notifyChildrenChanged(r2, r3, r4)
            return
        Lc:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "options cannot be null in notifyChildrenChanged"
            r2.<init>(r3)
            throw r2
        L14:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "parentId cannot be null in notifyChildrenChanged"
            r2.<init>(r3)
            throw r2
        L1c:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "remoteUserInfo cannot be null in notifyChildrenChanged"
            r2.<init>(r3)
            throw r2
    }

    public void notifyChildrenChanged(@androidx.annotation.NonNull java.lang.String r3) {
            r2 = this;
            if (r3 == 0) goto L9
            androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImpl r0 = r2.mImpl
            r1 = 0
            r0.notifyChildrenChanged(r3, r1)
            return
        L9:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "parentId cannot be null in notifyChildrenChanged"
            r3.<init>(r0)
            throw r3
    }

    public void notifyChildrenChanged(@androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.NonNull android.os.Bundle r3) {
            r1 = this;
            if (r2 == 0) goto L12
            if (r3 == 0) goto La
            androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImpl r0 = r1.mImpl
            r0.notifyChildrenChanged(r2, r3)
            return
        La:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "options cannot be null in notifyChildrenChanged"
            r2.<init>(r3)
            throw r2
        L12:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "parentId cannot be null in notifyChildrenChanged"
            r2.<init>(r3)
            throw r2
    }

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent r2) {
            r1 = this;
            androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImpl r0 = r1.mImpl
            android.os.IBinder r2 = r0.onBind(r2)
            return r2
    }

    @Override // android.app.Service
    public void onCreate() {
            r2 = this;
            super.onCreate()
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L11
            androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi28 r0 = new androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi28
            r0.<init>(r2)
            r2.mImpl = r0
            goto L30
        L11:
            r1 = 26
            if (r0 < r1) goto L1d
            androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi26 r0 = new androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi26
            r0.<init>(r2)
            r2.mImpl = r0
            goto L30
        L1d:
            r1 = 23
            if (r0 < r1) goto L29
            androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi23 r0 = new androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi23
            r0.<init>(r2)
            r2.mImpl = r0
            goto L30
        L29:
            androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi21 r0 = new androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi21
            r0.<init>(r2)
            r2.mImpl = r0
        L30:
            androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImpl r0 = r2.mImpl
            r0.onCreate()
            return
    }

    public void onCustomAction(@androidx.annotation.NonNull java.lang.String r1, android.os.Bundle r2, @androidx.annotation.NonNull androidx.media.MediaBrowserServiceCompat.Result<android.os.Bundle> r3) {
            r0 = this;
            r1 = 0
            r3.sendError(r1)
            return
    }

    @androidx.annotation.Nullable
    public abstract androidx.media.MediaBrowserServiceCompat.BrowserRoot onGetRoot(@androidx.annotation.NonNull java.lang.String r1, int r2, @androidx.annotation.Nullable android.os.Bundle r3);

    public abstract void onLoadChildren(@androidx.annotation.NonNull java.lang.String r1, @androidx.annotation.NonNull androidx.media.MediaBrowserServiceCompat.Result<java.util.List<android.support.v4.media.MediaBrowserCompat.MediaItem>> r2);

    public void onLoadChildren(@androidx.annotation.NonNull java.lang.String r1, @androidx.annotation.NonNull androidx.media.MediaBrowserServiceCompat.Result<java.util.List<android.support.v4.media.MediaBrowserCompat.MediaItem>> r2, @androidx.annotation.NonNull android.os.Bundle r3) {
            r0 = this;
            r3 = 1
            r2.setFlags(r3)
            r0.onLoadChildren(r1, r2)
            return
    }

    public void onLoadItem(java.lang.String r1, @androidx.annotation.NonNull androidx.media.MediaBrowserServiceCompat.Result<android.support.v4.media.MediaBrowserCompat.MediaItem> r2) {
            r0 = this;
            r1 = 2
            r2.setFlags(r1)
            r1 = 0
            r2.sendResult(r1)
            return
    }

    public void onSearch(@androidx.annotation.NonNull java.lang.String r1, android.os.Bundle r2, @androidx.annotation.NonNull androidx.media.MediaBrowserServiceCompat.Result<java.util.List<android.support.v4.media.MediaBrowserCompat.MediaItem>> r3) {
            r0 = this;
            r1 = 4
            r3.setFlags(r1)
            r1 = 0
            r3.sendResult(r1)
            return
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public void onSubscribe(java.lang.String r1, android.os.Bundle r2) {
            r0 = this;
            return
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public void onUnsubscribe(java.lang.String r1) {
            r0 = this;
            return
    }

    void performCustomAction(java.lang.String r2, android.os.Bundle r3, androidx.media.MediaBrowserServiceCompat.ConnectionRecord r4, android.support.v4.os.ResultReceiver r5) {
            r1 = this;
            androidx.media.MediaBrowserServiceCompat$4 r0 = new androidx.media.MediaBrowserServiceCompat$4
            r0.<init>(r1, r2, r5)
            r1.mCurConnection = r4
            r1.onCustomAction(r2, r3, r0)
            r4 = 0
            r1.mCurConnection = r4
            boolean r4 = r0.isDone()
            if (r4 == 0) goto L14
            return
        L14:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "onCustomAction must call detach() or sendResult() or sendError() before returning for action="
            r5.append(r0)
            r5.append(r2)
            java.lang.String r2 = " extras="
            r5.append(r2)
            r5.append(r3)
            java.lang.String r2 = r5.toString()
            r4.<init>(r2)
            throw r4
    }

    void performLoadChildren(java.lang.String r8, androidx.media.MediaBrowserServiceCompat.ConnectionRecord r9, android.os.Bundle r10, android.os.Bundle r11) {
            r7 = this;
            androidx.media.MediaBrowserServiceCompat$1 r0 = new androidx.media.MediaBrowserServiceCompat$1
            r4 = r8
            r1 = r7
            r2 = r8
            r3 = r9
            r5 = r10
            r6 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r1.mCurConnection = r3
            if (r5 != 0) goto L13
            r7.onLoadChildren(r2, r0)
            goto L16
        L13:
            r7.onLoadChildren(r2, r0, r5)
        L16:
            r8 = 0
            r1.mCurConnection = r8
            boolean r8 = r0.isDone()
            if (r8 == 0) goto L20
            return
        L20:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "onLoadChildren must call detach() or sendResult() before returning for package="
            r9.append(r10)
            java.lang.String r10 = r3.pkg
            r9.append(r10)
            java.lang.String r10 = " id="
            r9.append(r10)
            r9.append(r2)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
    }

    void performLoadItem(java.lang.String r2, androidx.media.MediaBrowserServiceCompat.ConnectionRecord r3, android.support.v4.os.ResultReceiver r4) {
            r1 = this;
            androidx.media.MediaBrowserServiceCompat$2 r0 = new androidx.media.MediaBrowserServiceCompat$2
            r0.<init>(r1, r2, r4)
            r1.mCurConnection = r3
            r1.onLoadItem(r2, r0)
            r3 = 0
            r1.mCurConnection = r3
            boolean r3 = r0.isDone()
            if (r3 == 0) goto L14
            return
        L14:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "onLoadItem must call detach() or sendResult() before returning for id="
            r4.append(r0)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r3.<init>(r2)
            throw r3
    }

    void performSearch(java.lang.String r2, android.os.Bundle r3, androidx.media.MediaBrowserServiceCompat.ConnectionRecord r4, android.support.v4.os.ResultReceiver r5) {
            r1 = this;
            androidx.media.MediaBrowserServiceCompat$3 r0 = new androidx.media.MediaBrowserServiceCompat$3
            r0.<init>(r1, r2, r5)
            r1.mCurConnection = r4
            r1.onSearch(r2, r3, r0)
            r3 = 0
            r1.mCurConnection = r3
            boolean r3 = r0.isDone()
            if (r3 == 0) goto L14
            return
        L14:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "onSearch must call detach() or sendResult() before returning for query="
            r4.append(r5)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r3.<init>(r2)
            throw r3
    }

    boolean removeSubscription(java.lang.String r7, androidx.media.MediaBrowserServiceCompat.ConnectionRecord r8, android.os.IBinder r9) {
            r6 = this;
            r0 = 0
            r1 = 1
            r2 = 0
            if (r9 != 0) goto L18
            java.util.HashMap<java.lang.String, java.util.List<androidx.core.util.Pair<android.os.IBinder, android.os.Bundle>>> r9 = r8.subscriptions     // Catch: java.lang.Throwable -> L16
            java.lang.Object r9 = r9.remove(r7)     // Catch: java.lang.Throwable -> L16
            if (r9 == 0) goto Le
            r0 = 1
        Le:
            r6.mCurConnection = r8
            r6.onUnsubscribe(r7)
            r6.mCurConnection = r2
            return r0
        L16:
            r9 = move-exception
            goto L47
        L18:
            java.util.HashMap<java.lang.String, java.util.List<androidx.core.util.Pair<android.os.IBinder, android.os.Bundle>>> r3 = r8.subscriptions     // Catch: java.lang.Throwable -> L16
            java.lang.Object r3 = r3.get(r7)     // Catch: java.lang.Throwable -> L16
            java.util.List r3 = (java.util.List) r3     // Catch: java.lang.Throwable -> L16
            if (r3 == 0) goto Le
            java.util.Iterator r4 = r3.iterator()     // Catch: java.lang.Throwable -> L16
        L26:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> L16
            if (r5 == 0) goto L3b
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> L16
            androidx.core.util.Pair r5 = (androidx.core.util.Pair) r5     // Catch: java.lang.Throwable -> L16
            F r5 = r5.first     // Catch: java.lang.Throwable -> L16
            if (r9 != r5) goto L26
            r4.remove()     // Catch: java.lang.Throwable -> L16
            r0 = 1
            goto L26
        L3b:
            int r9 = r3.size()     // Catch: java.lang.Throwable -> L16
            if (r9 != 0) goto Le
            java.util.HashMap<java.lang.String, java.util.List<androidx.core.util.Pair<android.os.IBinder, android.os.Bundle>>> r9 = r8.subscriptions     // Catch: java.lang.Throwable -> L16
            r9.remove(r7)     // Catch: java.lang.Throwable -> L16
            goto Le
        L47:
            r6.mCurConnection = r8
            r6.onUnsubscribe(r7)
            r6.mCurConnection = r2
            throw r9
    }

    public void setSessionToken(android.support.v4.media.session.MediaSessionCompat.Token r2) {
            r1 = this;
            if (r2 == 0) goto L16
            android.support.v4.media.session.MediaSessionCompat$Token r0 = r1.mSession
            if (r0 != 0) goto Le
            r1.mSession = r2
            androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImpl r0 = r1.mImpl
            r0.setSessionToken(r2)
            return
        Le:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "The session token has already been set."
            r2.<init>(r0)
            throw r2
        L16:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Session token may not be null."
            r2.<init>(r0)
            throw r2
    }
}

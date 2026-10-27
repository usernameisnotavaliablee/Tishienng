package androidx.media;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class MediaSessionManager {
    static final boolean DEBUG = false;
    static final java.lang.String TAG = "MediaSessionManager";
    private static final java.lang.Object sLock = null;
    private static volatile androidx.media.MediaSessionManager sSessionManager;
    androidx.media.MediaSessionManager.MediaSessionManagerImpl mImpl;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    interface MediaSessionManagerImpl {
        android.content.Context getContext();

        boolean isTrustedForMediaControl(androidx.media.MediaSessionManager.RemoteUserInfoImpl r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class RemoteUserInfo {
        public static final java.lang.String LEGACY_CONTROLLER = "android.media.session.MediaController";
        androidx.media.MediaSessionManager.RemoteUserInfoImpl mImpl;

        @androidx.annotation.RequiresApi(28)
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public RemoteUserInfo(android.media.session.MediaSessionManager.RemoteUserInfo r2) {
                r1 = this;
                r1.<init>()
                androidx.media.MediaSessionManagerImplApi28$RemoteUserInfoImplApi28 r0 = new androidx.media.MediaSessionManagerImplApi28$RemoteUserInfoImplApi28
                r0.<init>(r2)
                r1.mImpl = r0
                return
        }

        public RemoteUserInfo(@androidx.annotation.NonNull java.lang.String r3, int r4, int r5) {
                r2 = this;
                r2.<init>()
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 28
                if (r0 < r1) goto L11
                androidx.media.MediaSessionManagerImplApi28$RemoteUserInfoImplApi28 r0 = new androidx.media.MediaSessionManagerImplApi28$RemoteUserInfoImplApi28
                r0.<init>(r3, r4, r5)
                r2.mImpl = r0
                return
            L11:
                androidx.media.MediaSessionManagerImplBase$RemoteUserInfoImplBase r0 = new androidx.media.MediaSessionManagerImplBase$RemoteUserInfoImplBase
                r0.<init>(r3, r4, r5)
                r2.mImpl = r0
                return
        }

        public boolean equals(@androidx.annotation.Nullable java.lang.Object r2) {
                r1 = this;
                if (r1 != r2) goto L4
                r2 = 1
                return r2
            L4:
                boolean r0 = r2 instanceof androidx.media.MediaSessionManager.RemoteUserInfo
                if (r0 != 0) goto La
                r2 = 0
                return r2
            La:
                androidx.media.MediaSessionManager$RemoteUserInfoImpl r0 = r1.mImpl
                androidx.media.MediaSessionManager$RemoteUserInfo r2 = (androidx.media.MediaSessionManager.RemoteUserInfo) r2
                androidx.media.MediaSessionManager$RemoteUserInfoImpl r2 = r2.mImpl
                boolean r2 = r0.equals(r2)
                return r2
        }

        @androidx.annotation.NonNull
        public java.lang.String getPackageName() {
                r1 = this;
                androidx.media.MediaSessionManager$RemoteUserInfoImpl r0 = r1.mImpl
                java.lang.String r0 = r0.getPackageName()
                return r0
        }

        public int getPid() {
                r1 = this;
                androidx.media.MediaSessionManager$RemoteUserInfoImpl r0 = r1.mImpl
                int r0 = r0.getPid()
                return r0
        }

        public int getUid() {
                r1 = this;
                androidx.media.MediaSessionManager$RemoteUserInfoImpl r0 = r1.mImpl
                int r0 = r0.getUid()
                return r0
        }

        public int hashCode() {
                r1 = this;
                androidx.media.MediaSessionManager$RemoteUserInfoImpl r0 = r1.mImpl
                int r0 = r0.hashCode()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    interface RemoteUserInfoImpl {
        java.lang.String getPackageName();

        int getPid();

        int getUid();
    }

    static {
            java.lang.String r0 = "MediaSessionManager"
            r1 = 3
            boolean r0 = android.util.Log.isLoggable(r0, r1)
            androidx.media.MediaSessionManager.DEBUG = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            androidx.media.MediaSessionManager.sLock = r0
            return
    }

    private MediaSessionManager(android.content.Context r3) {
            r2 = this;
            r2.<init>()
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L11
            androidx.media.MediaSessionManagerImplApi28 r0 = new androidx.media.MediaSessionManagerImplApi28
            r0.<init>(r3)
            r2.mImpl = r0
            return
        L11:
            androidx.media.MediaSessionManagerImplApi21 r0 = new androidx.media.MediaSessionManagerImplApi21
            r0.<init>(r3)
            r2.mImpl = r0
            return
    }

    @androidx.annotation.NonNull
    public static androidx.media.MediaSessionManager getSessionManager(@androidx.annotation.NonNull android.content.Context r2) {
            androidx.media.MediaSessionManager r0 = androidx.media.MediaSessionManager.sSessionManager
            if (r0 != 0) goto L1f
            java.lang.Object r1 = androidx.media.MediaSessionManager.sLock
            monitor-enter(r1)
            androidx.media.MediaSessionManager r0 = androidx.media.MediaSessionManager.sSessionManager     // Catch: java.lang.Throwable -> L19
            if (r0 != 0) goto L1b
            androidx.media.MediaSessionManager r0 = new androidx.media.MediaSessionManager     // Catch: java.lang.Throwable -> L19
            android.content.Context r2 = r2.getApplicationContext()     // Catch: java.lang.Throwable -> L19
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L19
            androidx.media.MediaSessionManager.sSessionManager = r0     // Catch: java.lang.Throwable -> L19
            androidx.media.MediaSessionManager r0 = androidx.media.MediaSessionManager.sSessionManager     // Catch: java.lang.Throwable -> L19
            goto L1b
        L19:
            r2 = move-exception
            goto L1d
        L1b:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L19
            return r0
        L1d:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L19
            throw r2
        L1f:
            return r0
    }

    android.content.Context getContext() {
            r1 = this;
            androidx.media.MediaSessionManager$MediaSessionManagerImpl r0 = r1.mImpl
            android.content.Context r0 = r0.getContext()
            return r0
    }

    public boolean isTrustedForMediaControl(@androidx.annotation.NonNull androidx.media.MediaSessionManager.RemoteUserInfo r2) {
            r1 = this;
            if (r2 == 0) goto Lb
            androidx.media.MediaSessionManager$MediaSessionManagerImpl r0 = r1.mImpl
            androidx.media.MediaSessionManager$RemoteUserInfoImpl r2 = r2.mImpl
            boolean r2 = r0.isTrustedForMediaControl(r2)
            return r2
        Lb:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "userInfo should not be null"
            r2.<init>(r0)
            throw r2
    }
}

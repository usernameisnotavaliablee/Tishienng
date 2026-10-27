package androidx.media;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class MediaSessionManagerImplBase implements androidx.media.MediaSessionManager.MediaSessionManagerImpl {
    private static final boolean DEBUG = false;
    private static final java.lang.String ENABLED_NOTIFICATION_LISTENERS = "enabled_notification_listeners";
    private static final java.lang.String PERMISSION_MEDIA_CONTENT_CONTROL = "android.permission.MEDIA_CONTENT_CONTROL";
    private static final java.lang.String PERMISSION_STATUS_BAR_SERVICE = "android.permission.STATUS_BAR_SERVICE";
    private static final java.lang.String TAG = "MediaSessionManager";
    android.content.ContentResolver mContentResolver;
    android.content.Context mContext;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class RemoteUserInfoImplBase implements androidx.media.MediaSessionManager.RemoteUserInfoImpl {
        private java.lang.String mPackageName;
        private int mPid;
        private int mUid;

        RemoteUserInfoImplBase(java.lang.String r1, int r2, int r3) {
                r0 = this;
                r0.<init>()
                r0.mPackageName = r1
                r0.mPid = r2
                r0.mUid = r3
                return
        }

        public boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof androidx.media.MediaSessionManagerImplBase.RemoteUserInfoImplBase
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                androidx.media.MediaSessionManagerImplBase$RemoteUserInfoImplBase r5 = (androidx.media.MediaSessionManagerImplBase.RemoteUserInfoImplBase) r5
                java.lang.String r1 = r4.mPackageName
                java.lang.String r3 = r5.mPackageName
                boolean r1 = android.text.TextUtils.equals(r1, r3)
                if (r1 == 0) goto L23
                int r1 = r4.mPid
                int r3 = r5.mPid
                if (r1 != r3) goto L23
                int r1 = r4.mUid
                int r5 = r5.mUid
                if (r1 != r5) goto L23
                return r0
            L23:
                return r2
        }

        @Override // androidx.media.MediaSessionManager.RemoteUserInfoImpl
        public java.lang.String getPackageName() {
                r1 = this;
                java.lang.String r0 = r1.mPackageName
                return r0
        }

        @Override // androidx.media.MediaSessionManager.RemoteUserInfoImpl
        public int getPid() {
                r1 = this;
                int r0 = r1.mPid
                return r0
        }

        @Override // androidx.media.MediaSessionManager.RemoteUserInfoImpl
        public int getUid() {
                r1 = this;
                int r0 = r1.mUid
                return r0
        }

        public int hashCode() {
                r5 = this;
                java.lang.String r0 = r5.mPackageName
                int r1 = r5.mPid
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                int r2 = r5.mUid
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r3 = 3
                java.lang.Object[] r3 = new java.lang.Object[r3]
                r4 = 0
                r3[r4] = r0
                r0 = 1
                r3[r0] = r1
                r0 = 2
                r3[r0] = r2
                int r0 = androidx.core.util.ObjectsCompat.hash(r3)
                return r0
        }
    }

    static {
            boolean r0 = androidx.media.MediaSessionManager.DEBUG
            androidx.media.MediaSessionManagerImplBase.DEBUG = r0
            return
    }

    MediaSessionManagerImplBase(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            r0.mContext = r1
            android.content.ContentResolver r1 = r1.getContentResolver()
            r0.mContentResolver = r1
            return
    }

    private boolean isPermissionGranted(androidx.media.MediaSessionManager.RemoteUserInfoImpl r5, java.lang.String r6) {
            r4 = this;
            int r0 = r5.getPid()
            r1 = 0
            r2 = 1
            if (r0 >= 0) goto L1a
            android.content.Context r0 = r4.mContext
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            java.lang.String r5 = r5.getPackageName()
            int r5 = r0.checkPermission(r6, r5)
            if (r5 != 0) goto L19
            return r2
        L19:
            return r1
        L1a:
            android.content.Context r0 = r4.mContext
            int r3 = r5.getPid()
            int r5 = r5.getUid()
            int r5 = r0.checkPermission(r6, r3, r5)
            if (r5 != 0) goto L2b
            return r2
        L2b:
            return r1
    }

    @Override // androidx.media.MediaSessionManager.MediaSessionManagerImpl
    public android.content.Context getContext() {
            r1 = this;
            android.content.Context r0 = r1.mContext
            return r0
    }

    boolean isEnabledNotificationListener(@androidx.annotation.NonNull androidx.media.MediaSessionManager.RemoteUserInfoImpl r6) {
            r5 = this;
            android.content.ContentResolver r0 = r5.mContentResolver
            java.lang.String r1 = "enabled_notification_listeners"
            java.lang.String r0 = android.provider.Settings.Secure.getString(r0, r1)
            r1 = 0
            if (r0 == 0) goto L30
            java.lang.String r2 = ":"
            java.lang.String[] r0 = r0.split(r2)
            r2 = 0
        L12:
            int r3 = r0.length
            if (r2 >= r3) goto L30
            r3 = r0[r2]
            android.content.ComponentName r3 = android.content.ComponentName.unflattenFromString(r3)
            if (r3 == 0) goto L2d
            java.lang.String r3 = r3.getPackageName()
            java.lang.String r4 = r6.getPackageName()
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L2d
            r6 = 1
            return r6
        L2d:
            int r2 = r2 + 1
            goto L12
        L30:
            return r1
    }

    @Override // androidx.media.MediaSessionManager.MediaSessionManagerImpl
    public boolean isTrustedForMediaControl(@androidx.annotation.NonNull androidx.media.MediaSessionManager.RemoteUserInfoImpl r4) {
            r3 = this;
            r0 = 0
            android.content.Context r1 = r3.mContext     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L44
            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L44
            java.lang.String r2 = r4.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L44
            android.content.pm.ApplicationInfo r1 = r1.getApplicationInfo(r2, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L44
            int r1 = r1.uid
            int r2 = r4.getUid()
            if (r1 == r2) goto L22
            boolean r1 = androidx.media.MediaSessionManagerImplBase.DEBUG
            if (r1 == 0) goto L21
            r4.getPackageName()
            r4.getUid()
        L21:
            return r0
        L22:
            java.lang.String r1 = "android.permission.STATUS_BAR_SERVICE"
            boolean r1 = r3.isPermissionGranted(r4, r1)
            if (r1 != 0) goto L42
            java.lang.String r1 = "android.permission.MEDIA_CONTENT_CONTROL"
            boolean r1 = r3.isPermissionGranted(r4, r1)
            if (r1 != 0) goto L42
            int r1 = r4.getUid()
            r2 = 1000(0x3e8, float:1.401E-42)
            if (r1 == r2) goto L42
            boolean r4 = r3.isEnabledNotificationListener(r4)
            if (r4 == 0) goto L41
            goto L42
        L41:
            return r0
        L42:
            r4 = 1
            return r4
        L44:
            boolean r1 = androidx.media.MediaSessionManagerImplBase.DEBUG
            if (r1 == 0) goto L4c
            r4.getPackageName()
        L4c:
            return r0
    }
}

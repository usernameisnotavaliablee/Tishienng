package androidx.media.session;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class MediaButtonReceiver extends android.content.BroadcastReceiver {
    private static final java.lang.String TAG = "MediaButtonReceiver";

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class MediaButtonConnectionCallback extends android.support.v4.media.MediaBrowserCompat.ConnectionCallback {
        private final android.content.Context mContext;
        private final android.content.Intent mIntent;
        private android.support.v4.media.MediaBrowserCompat mMediaBrowser;
        private final android.content.BroadcastReceiver.PendingResult mPendingResult;

        MediaButtonConnectionCallback(android.content.Context r1, android.content.Intent r2, android.content.BroadcastReceiver.PendingResult r3) {
                r0 = this;
                r0.<init>()
                r0.mContext = r1
                r0.mIntent = r2
                r0.mPendingResult = r3
                return
        }

        private void finish() {
                r1 = this;
                android.support.v4.media.MediaBrowserCompat r0 = r1.mMediaBrowser
                r0.disconnect()
                android.content.BroadcastReceiver$PendingResult r0 = r1.mPendingResult
                r0.finish()
                return
        }

        @Override // android.support.v4.media.MediaBrowserCompat.ConnectionCallback
        public void onConnected() {
                r3 = this;
                android.support.v4.media.session.MediaControllerCompat r0 = new android.support.v4.media.session.MediaControllerCompat     // Catch: android.os.RemoteException -> L1a
                android.content.Context r1 = r3.mContext     // Catch: android.os.RemoteException -> L1a
                android.support.v4.media.MediaBrowserCompat r2 = r3.mMediaBrowser     // Catch: android.os.RemoteException -> L1a
                android.support.v4.media.session.MediaSessionCompat$Token r2 = r2.getSessionToken()     // Catch: android.os.RemoteException -> L1a
                r0.<init>(r1, r2)     // Catch: android.os.RemoteException -> L1a
                android.content.Intent r1 = r3.mIntent     // Catch: android.os.RemoteException -> L1a
                java.lang.String r2 = "android.intent.extra.KEY_EVENT"
                android.os.Parcelable r1 = r1.getParcelableExtra(r2)     // Catch: android.os.RemoteException -> L1a
                android.view.KeyEvent r1 = (android.view.KeyEvent) r1     // Catch: android.os.RemoteException -> L1a
                r0.dispatchMediaButtonEvent(r1)     // Catch: android.os.RemoteException -> L1a
            L1a:
                r3.finish()
                return
        }

        @Override // android.support.v4.media.MediaBrowserCompat.ConnectionCallback
        public void onConnectionFailed() {
                r0 = this;
                r0.finish()
                return
        }

        @Override // android.support.v4.media.MediaBrowserCompat.ConnectionCallback
        public void onConnectionSuspended() {
                r0 = this;
                r0.finish()
                return
        }

        void setMediaBrowser(android.support.v4.media.MediaBrowserCompat r1) {
                r0 = this;
                r0.mMediaBrowser = r1
                return
        }
    }

    public MediaButtonReceiver() {
            r0 = this;
            r0.<init>()
            return
    }

    public static android.app.PendingIntent buildMediaButtonPendingIntent(android.content.Context r1, long r2) {
            android.content.ComponentName r0 = getMediaButtonReceiverComponent(r1)
            if (r0 != 0) goto L8
            r1 = 0
            return r1
        L8:
            android.app.PendingIntent r1 = buildMediaButtonPendingIntent(r1, r0, r2)
            return r1
    }

    public static android.app.PendingIntent buildMediaButtonPendingIntent(android.content.Context r2, android.content.ComponentName r3, long r4) {
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            int r4 = android.support.v4.media.session.PlaybackStateCompat.toKeyCode(r4)
            if (r4 != 0) goto Lb
            return r0
        Lb:
            android.content.Intent r5 = new android.content.Intent
            java.lang.String r0 = "android.intent.action.MEDIA_BUTTON"
            r5.<init>(r0)
            r5.setComponent(r3)
            android.view.KeyEvent r3 = new android.view.KeyEvent
            r0 = 0
            r3.<init>(r0, r4)
            java.lang.String r1 = "android.intent.extra.KEY_EVENT"
            r5.putExtra(r1, r3)
            android.app.PendingIntent r2 = android.app.PendingIntent.getBroadcast(r2, r4, r5, r0)
            return r2
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public static android.content.ComponentName getMediaButtonReceiverComponent(android.content.Context r3) {
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.intent.action.MEDIA_BUTTON"
            r0.<init>(r1)
            java.lang.String r1 = r3.getPackageName()
            r0.setPackage(r1)
            android.content.pm.PackageManager r3 = r3.getPackageManager()
            r1 = 0
            java.util.List r3 = r3.queryBroadcastReceivers(r0, r1)
            int r0 = r3.size()
            r2 = 1
            if (r0 != r2) goto L30
            java.lang.Object r3 = r3.get(r1)
            android.content.pm.ResolveInfo r3 = (android.content.pm.ResolveInfo) r3
            android.content.ComponentName r0 = new android.content.ComponentName
            android.content.pm.ActivityInfo r3 = r3.activityInfo
            java.lang.String r1 = r3.packageName
            java.lang.String r3 = r3.name
            r0.<init>(r1, r3)
            return r0
        L30:
            r3.size()
            r3 = 0
            return r3
    }

    private static android.content.ComponentName getServiceComponentByAction(android.content.Context r3, java.lang.String r4) {
            android.content.pm.PackageManager r0 = r3.getPackageManager()
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r4)
            java.lang.String r3 = r3.getPackageName()
            r1.setPackage(r3)
            r3 = 0
            java.util.List r0 = r0.queryIntentServices(r1, r3)
            int r1 = r0.size()
            r2 = 1
            if (r1 != r2) goto L2e
            java.lang.Object r3 = r0.get(r3)
            android.content.pm.ResolveInfo r3 = (android.content.pm.ResolveInfo) r3
            android.content.ComponentName r4 = new android.content.ComponentName
            android.content.pm.ServiceInfo r3 = r3.serviceInfo
            java.lang.String r0 = r3.packageName
            java.lang.String r3 = r3.name
            r4.<init>(r0, r3)
            return r4
        L2e:
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L36
            r3 = 0
            return r3
        L36:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected 1 service that handles "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = ", found "
            r1.append(r4)
            int r4 = r0.size()
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r3.<init>(r4)
            throw r3
    }

    public static android.view.KeyEvent handleIntent(android.support.v4.media.session.MediaSessionCompat r2, android.content.Intent r3) {
            if (r2 == 0) goto L27
            if (r3 == 0) goto L27
            java.lang.String r0 = "android.intent.action.MEDIA_BUTTON"
            java.lang.String r1 = r3.getAction()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L27
            java.lang.String r0 = "android.intent.extra.KEY_EVENT"
            boolean r1 = r3.hasExtra(r0)
            if (r1 != 0) goto L19
            goto L27
        L19:
            android.os.Parcelable r3 = r3.getParcelableExtra(r0)
            android.view.KeyEvent r3 = (android.view.KeyEvent) r3
            android.support.v4.media.session.MediaControllerCompat r2 = r2.getController()
            r2.dispatchMediaButtonEvent(r3)
            return r3
        L27:
            r2 = 0
            return r2
    }

    private static void startForegroundService(android.content.Context r2, android.content.Intent r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto La
            androidx.media.session.a.a(r2, r3)
            return
        La:
            r2.startService(r3)
            return
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context r4, android.content.Intent r5) {
            r3 = this;
            if (r5 == 0) goto L4e
            java.lang.String r0 = r5.getAction()
            java.lang.String r1 = "android.intent.action.MEDIA_BUTTON"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L4e
            java.lang.String r0 = "android.intent.extra.KEY_EVENT"
            boolean r0 = r5.hasExtra(r0)
            if (r0 != 0) goto L17
            goto L4e
        L17:
            android.content.ComponentName r0 = getServiceComponentByAction(r4, r1)
            if (r0 == 0) goto L24
            r5.setComponent(r0)
            startForegroundService(r4, r5)
            return
        L24:
            java.lang.String r0 = "android.media.browse.MediaBrowserService"
            android.content.ComponentName r0 = getServiceComponentByAction(r4, r0)
            if (r0 == 0) goto L46
            android.content.BroadcastReceiver$PendingResult r1 = r3.goAsync()
            android.content.Context r4 = r4.getApplicationContext()
            androidx.media.session.MediaButtonReceiver$MediaButtonConnectionCallback r2 = new androidx.media.session.MediaButtonReceiver$MediaButtonConnectionCallback
            r2.<init>(r4, r5, r1)
            android.support.v4.media.MediaBrowserCompat r5 = new android.support.v4.media.MediaBrowserCompat
            r1 = 0
            r5.<init>(r4, r0, r2, r1)
            r2.setMediaBrowser(r5)
            r5.connect()
            return
        L46:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "Could not find any Service that handles android.intent.action.MEDIA_BUTTON or implements a media browser service."
            r4.<init>(r5)
            throw r4
        L4e:
            java.util.Objects.toString(r5)
            return
    }
}

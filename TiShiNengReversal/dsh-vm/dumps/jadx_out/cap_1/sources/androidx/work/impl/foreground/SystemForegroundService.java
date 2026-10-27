package androidx.work.impl.foreground;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class SystemForegroundService extends androidx.lifecycle.LifecycleService implements androidx.work.impl.foreground.SystemForegroundDispatcher.Callback {
    private static final java.lang.String TAG = null;

    @androidx.annotation.Nullable
    private static androidx.work.impl.foreground.SystemForegroundService sForegroundService;
    androidx.work.impl.foreground.SystemForegroundDispatcher mDispatcher;
    private android.os.Handler mHandler;
    private boolean mIsShutdown;
    android.app.NotificationManager mNotificationManager;




    static {
            java.lang.String r0 = "SystemFgService"
            java.lang.String r0 = androidx.work.Logger.tagWithPrefix(r0)
            androidx.work.impl.foreground.SystemForegroundService.TAG = r0
            r0 = 0
            androidx.work.impl.foreground.SystemForegroundService.sForegroundService = r0
            return
    }

    public SystemForegroundService() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.Nullable
    public static androidx.work.impl.foreground.SystemForegroundService getInstance() {
            androidx.work.impl.foreground.SystemForegroundService r0 = androidx.work.impl.foreground.SystemForegroundService.sForegroundService
            return r0
    }

    @androidx.annotation.MainThread
    private void initializeDispatcher() {
            r2 = this;
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            r2.mHandler = r0
            android.content.Context r0 = r2.getApplicationContext()
            java.lang.String r1 = "notification"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.app.NotificationManager r0 = (android.app.NotificationManager) r0
            r2.mNotificationManager = r0
            androidx.work.impl.foreground.SystemForegroundDispatcher r0 = new androidx.work.impl.foreground.SystemForegroundDispatcher
            android.content.Context r1 = r2.getApplicationContext()
            r0.<init>(r1)
            r2.mDispatcher = r0
            r0.setCallback(r2)
            return
    }

    @Override // androidx.work.impl.foreground.SystemForegroundDispatcher.Callback
    public void cancelNotification(int r3) {
            r2 = this;
            android.os.Handler r0 = r2.mHandler
            androidx.work.impl.foreground.SystemForegroundService$3 r1 = new androidx.work.impl.foreground.SystemForegroundService$3
            r1.<init>(r2, r3)
            r0.post(r1)
            return
    }

    @Override // androidx.work.impl.foreground.SystemForegroundDispatcher.Callback
    public void notify(int r3, @androidx.annotation.NonNull android.app.Notification r4) {
            r2 = this;
            android.os.Handler r0 = r2.mHandler
            androidx.work.impl.foreground.SystemForegroundService$2 r1 = new androidx.work.impl.foreground.SystemForegroundService$2
            r1.<init>(r2, r3, r4)
            r0.post(r1)
            return
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public void onCreate() {
            r0 = this;
            super.onCreate()
            androidx.work.impl.foreground.SystemForegroundService.sForegroundService = r0
            r0.initializeDispatcher()
            return
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public void onDestroy() {
            r1 = this;
            super.onDestroy()
            androidx.work.impl.foreground.SystemForegroundDispatcher r0 = r1.mDispatcher
            r0.onDestroy()
            return
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public int onStartCommand(@androidx.annotation.Nullable android.content.Intent r4, int r5, int r6) {
            r3 = this;
            super.onStartCommand(r4, r5, r6)
            boolean r5 = r3.mIsShutdown
            if (r5 == 0) goto L1f
            androidx.work.Logger r5 = androidx.work.Logger.get()
            java.lang.String r6 = androidx.work.impl.foreground.SystemForegroundService.TAG
            java.lang.String r0 = "Re-initializing SystemForegroundService after a request to shut-down."
            r1 = 0
            java.lang.Throwable[] r2 = new java.lang.Throwable[r1]
            r5.info(r6, r0, r2)
            androidx.work.impl.foreground.SystemForegroundDispatcher r5 = r3.mDispatcher
            r5.onDestroy()
            r3.initializeDispatcher()
            r3.mIsShutdown = r1
        L1f:
            if (r4 == 0) goto L26
            androidx.work.impl.foreground.SystemForegroundDispatcher r5 = r3.mDispatcher
            r5.onStartCommand(r4)
        L26:
            r4 = 3
            return r4
    }

    @Override // androidx.work.impl.foreground.SystemForegroundDispatcher.Callback
    public void startForeground(int r3, int r4, @androidx.annotation.NonNull android.app.Notification r5) {
            r2 = this;
            android.os.Handler r0 = r2.mHandler
            androidx.work.impl.foreground.SystemForegroundService$1 r1 = new androidx.work.impl.foreground.SystemForegroundService$1
            r1.<init>(r2, r3, r5, r4)
            r0.post(r1)
            return
    }

    @Override // androidx.work.impl.foreground.SystemForegroundDispatcher.Callback
    @androidx.annotation.MainThread
    public void stop() {
            r5 = this;
            r0 = 1
            r5.mIsShutdown = r0
            androidx.work.Logger r1 = androidx.work.Logger.get()
            java.lang.String r2 = androidx.work.impl.foreground.SystemForegroundService.TAG
            r3 = 0
            java.lang.Throwable[] r3 = new java.lang.Throwable[r3]
            java.lang.String r4 = "All commands completed."
            r1.debug(r2, r4, r3)
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 26
            if (r1 < r2) goto L1a
            r5.stopForeground(r0)
        L1a:
            r0 = 0
            androidx.work.impl.foreground.SystemForegroundService.sForegroundService = r0
            r5.stopSelf()
            return
    }
}

package androidx.core.app;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class NotificationManagerCompat {
    public static final java.lang.String ACTION_BIND_SIDE_CHANNEL = "android.support.BIND_NOTIFICATION_SIDE_CHANNEL";
    private static final java.lang.String CHECK_OP_NO_THROW = "checkOpNoThrow";
    public static final java.lang.String EXTRA_USE_SIDE_CHANNEL = "android.support.useSideChannel";
    public static final int IMPORTANCE_DEFAULT = 3;
    public static final int IMPORTANCE_HIGH = 4;
    public static final int IMPORTANCE_LOW = 2;
    public static final int IMPORTANCE_MAX = 5;
    public static final int IMPORTANCE_MIN = 1;
    public static final int IMPORTANCE_NONE = 0;
    public static final int IMPORTANCE_UNSPECIFIED = -1000;
    public static final int INTERRUPTION_FILTER_ALARMS = 4;
    public static final int INTERRUPTION_FILTER_ALL = 1;
    public static final int INTERRUPTION_FILTER_NONE = 3;
    public static final int INTERRUPTION_FILTER_PRIORITY = 2;
    public static final int INTERRUPTION_FILTER_UNKNOWN = 0;
    static final int MAX_SIDE_CHANNEL_SDK_VERSION = 19;
    private static final java.lang.String OP_POST_NOTIFICATION = "OP_POST_NOTIFICATION";
    private static final java.lang.String SETTING_ENABLED_NOTIFICATION_LISTENERS = "enabled_notification_listeners";
    private static final int SIDE_CHANNEL_RETRY_BASE_INTERVAL_MS = 1000;
    private static final int SIDE_CHANNEL_RETRY_MAX_COUNT = 6;
    private static final java.lang.String TAG = "NotifManCompat";

    @androidx.annotation.GuardedBy("sEnabledNotificationListenersLock")
    private static java.util.Set<java.lang.String> sEnabledNotificationListenerPackages;

    @androidx.annotation.GuardedBy("sEnabledNotificationListenersLock")
    private static java.lang.String sEnabledNotificationListeners;
    private static final java.lang.Object sEnabledNotificationListenersLock = null;
    private static final java.lang.Object sLock = null;

    @androidx.annotation.GuardedBy("sLock")
    private static androidx.core.app.NotificationManagerCompat.SideChannelManager sSideChannelManager;
    private final android.content.Context mContext;
    private final android.app.NotificationManager mNotificationManager;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(23)
    static class Api23Impl {
        private Api23Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        static java.util.List<android.service.notification.StatusBarNotification> getActiveNotifications(android.app.NotificationManager r0) {
                android.service.notification.StatusBarNotification[] r0 = r0.getActiveNotifications()
                if (r0 != 0) goto Lc
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                return r0
            Lc:
                java.util.List r0 = java.util.Arrays.asList(r0)
                return r0
        }

        @androidx.annotation.DoNotInline
        static int getCurrentInterruptionFilter(android.app.NotificationManager r0) {
                int r0 = r0.getCurrentInterruptionFilter()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(24)
    static class Api24Impl {
        private Api24Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        static boolean areNotificationsEnabled(android.app.NotificationManager r0) {
                boolean r0 = r0.areNotificationsEnabled()
                return r0
        }

        @androidx.annotation.DoNotInline
        static int getImportance(android.app.NotificationManager r0) {
                int r0 = r0.getImportance()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(26)
    static class Api26Impl {
        private Api26Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        static void createNotificationChannel(android.app.NotificationManager r0, android.app.NotificationChannel r1) {
                r0.createNotificationChannel(r1)
                return
        }

        @androidx.annotation.DoNotInline
        static void createNotificationChannelGroup(android.app.NotificationManager r0, android.app.NotificationChannelGroup r1) {
                r0.createNotificationChannelGroup(r1)
                return
        }

        @androidx.annotation.DoNotInline
        static void createNotificationChannelGroups(android.app.NotificationManager r0, java.util.List<android.app.NotificationChannelGroup> r1) {
                r0.createNotificationChannelGroups(r1)
                return
        }

        @androidx.annotation.DoNotInline
        static void createNotificationChannels(android.app.NotificationManager r0, java.util.List<android.app.NotificationChannel> r1) {
                r0.createNotificationChannels(r1)
                return
        }

        @androidx.annotation.DoNotInline
        static void deleteNotificationChannel(android.app.NotificationManager r0, java.lang.String r1) {
                r0.deleteNotificationChannel(r1)
                return
        }

        @androidx.annotation.DoNotInline
        static void deleteNotificationChannelGroup(android.app.NotificationManager r0, java.lang.String r1) {
                r0.deleteNotificationChannelGroup(r1)
                return
        }

        @androidx.annotation.DoNotInline
        static java.lang.String getId(android.app.NotificationChannel r0) {
                java.lang.String r0 = r0.getId()
                return r0
        }

        @androidx.annotation.DoNotInline
        static java.lang.String getId(android.app.NotificationChannelGroup r0) {
                java.lang.String r0 = r0.getId()
                return r0
        }

        @androidx.annotation.DoNotInline
        static android.app.NotificationChannel getNotificationChannel(android.app.NotificationManager r0, java.lang.String r1) {
                android.app.NotificationChannel r0 = r0.getNotificationChannel(r1)
                return r0
        }

        @androidx.annotation.DoNotInline
        static java.util.List<android.app.NotificationChannelGroup> getNotificationChannelGroups(android.app.NotificationManager r0) {
                java.util.List r0 = r0.getNotificationChannelGroups()
                return r0
        }

        @androidx.annotation.DoNotInline
        static java.util.List<android.app.NotificationChannel> getNotificationChannels(android.app.NotificationManager r0) {
                java.util.List r0 = r0.getNotificationChannels()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(28)
    static class Api28Impl {
        private Api28Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        static android.app.NotificationChannelGroup getNotificationChannelGroup(android.app.NotificationManager r0, java.lang.String r1) {
                android.app.NotificationChannelGroup r0 = r0.getNotificationChannelGroup(r1)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(30)
    static class Api30Impl {
        private Api30Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        static android.app.NotificationChannel getNotificationChannel(android.app.NotificationManager r0, java.lang.String r1, java.lang.String r2) {
                android.app.NotificationChannel r0 = r0.getNotificationChannel(r1, r2)
                return r0
        }

        @androidx.annotation.DoNotInline
        static java.lang.String getParentChannelId(android.app.NotificationChannel r0) {
                java.lang.String r0 = r0.getParentChannelId()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(34)
    static class Api34Impl {
        private Api34Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        static boolean canUseFullScreenIntent(android.app.NotificationManager r0) {
                boolean r0 = r0.canUseFullScreenIntent()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class CancelTask implements androidx.core.app.NotificationManagerCompat.Task {
        final boolean all;
        final int id;
        final java.lang.String packageName;
        final java.lang.String tag;

        CancelTask(java.lang.String r1) {
                r0 = this;
                r0.<init>()
                r0.packageName = r1
                r1 = 0
                r0.id = r1
                r1 = 0
                r0.tag = r1
                r1 = 1
                r0.all = r1
                return
        }

        CancelTask(java.lang.String r1, int r2, java.lang.String r3) {
                r0 = this;
                r0.<init>()
                r0.packageName = r1
                r0.id = r2
                r0.tag = r3
                r1 = 0
                r0.all = r1
                return
        }

        @Override // androidx.core.app.NotificationManagerCompat.Task
        public void send(android.support.v4.app.INotificationSideChannel r4) throws android.os.RemoteException {
                r3 = this;
                boolean r0 = r3.all
                if (r0 == 0) goto La
                java.lang.String r0 = r3.packageName
                r4.cancelAll(r0)
                return
            La:
                java.lang.String r0 = r3.packageName
                int r1 = r3.id
                java.lang.String r2 = r3.tag
                r4.cancel(r0, r1, r2)
                return
        }

        @androidx.annotation.NonNull
        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "CancelTask["
                r0.<init>(r1)
                java.lang.String r1 = "packageName:"
                r0.append(r1)
                java.lang.String r1 = r2.packageName
                r0.append(r1)
                java.lang.String r1 = ", id:"
                r0.append(r1)
                int r1 = r2.id
                r0.append(r1)
                java.lang.String r1 = ", tag:"
                r0.append(r1)
                java.lang.String r1 = r2.tag
                r0.append(r1)
                java.lang.String r1 = ", all:"
                r0.append(r1)
                boolean r1 = r2.all
                r0.append(r1)
                java.lang.String r1 = "]"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface InterruptionFilter {
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class NotificationWithIdAndTag {
        final int mId;
        android.app.Notification mNotification;
        final java.lang.String mTag;

        public NotificationWithIdAndTag(int r2, @androidx.annotation.NonNull android.app.Notification r3) {
                r1 = this;
                r0 = 0
                r1.<init>(r0, r2, r3)
                return
        }

        public NotificationWithIdAndTag(@androidx.annotation.Nullable java.lang.String r1, int r2, @androidx.annotation.NonNull android.app.Notification r3) {
                r0 = this;
                r0.<init>()
                r0.mTag = r1
                r0.mId = r2
                r0.mNotification = r3
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class NotifyTask implements androidx.core.app.NotificationManagerCompat.Task {
        final int id;
        final android.app.Notification notif;
        final java.lang.String packageName;
        final java.lang.String tag;

        NotifyTask(java.lang.String r1, int r2, java.lang.String r3, android.app.Notification r4) {
                r0 = this;
                r0.<init>()
                r0.packageName = r1
                r0.id = r2
                r0.tag = r3
                r0.notif = r4
                return
        }

        @Override // androidx.core.app.NotificationManagerCompat.Task
        public void send(android.support.v4.app.INotificationSideChannel r5) throws android.os.RemoteException {
                r4 = this;
                java.lang.String r0 = r4.packageName
                int r1 = r4.id
                java.lang.String r2 = r4.tag
                android.app.Notification r3 = r4.notif
                r5.notify(r0, r1, r2, r3)
                return
        }

        @androidx.annotation.NonNull
        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "NotifyTask["
                r0.<init>(r1)
                java.lang.String r1 = "packageName:"
                r0.append(r1)
                java.lang.String r1 = r2.packageName
                r0.append(r1)
                java.lang.String r1 = ", id:"
                r0.append(r1)
                int r1 = r2.id
                r0.append(r1)
                java.lang.String r1 = ", tag:"
                r0.append(r1)
                java.lang.String r1 = r2.tag
                r0.append(r1)
                java.lang.String r1 = "]"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class ServiceConnectedEvent {
        final android.content.ComponentName componentName;
        final android.os.IBinder iBinder;

        ServiceConnectedEvent(android.content.ComponentName r1, android.os.IBinder r2) {
                r0 = this;
                r0.<init>()
                r0.componentName = r1
                r0.iBinder = r2
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class SideChannelManager implements android.os.Handler.Callback, android.content.ServiceConnection {
        private static final int MSG_QUEUE_TASK = 0;
        private static final int MSG_RETRY_LISTENER_QUEUE = 3;
        private static final int MSG_SERVICE_CONNECTED = 1;
        private static final int MSG_SERVICE_DISCONNECTED = 2;
        private java.util.Set<java.lang.String> mCachedEnabledPackages;
        private final android.content.Context mContext;
        private final android.os.Handler mHandler;
        private final android.os.HandlerThread mHandlerThread;
        private final java.util.Map<android.content.ComponentName, androidx.core.app.NotificationManagerCompat.SideChannelManager.ListenerRecord> mRecordMap;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        private static class ListenerRecord {
            boolean bound;
            final android.content.ComponentName componentName;
            int retryCount;
            android.support.v4.app.INotificationSideChannel service;
            java.util.ArrayDeque<androidx.core.app.NotificationManagerCompat.Task> taskQueue;

            ListenerRecord(android.content.ComponentName r3) {
                    r2 = this;
                    r2.<init>()
                    r0 = 0
                    r2.bound = r0
                    java.util.ArrayDeque r1 = new java.util.ArrayDeque
                    r1.<init>()
                    r2.taskQueue = r1
                    r2.retryCount = r0
                    r2.componentName = r3
                    return
            }
        }

        SideChannelManager(android.content.Context r2) {
                r1 = this;
                r1.<init>()
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r1.mRecordMap = r0
                java.util.HashSet r0 = new java.util.HashSet
                r0.<init>()
                r1.mCachedEnabledPackages = r0
                r1.mContext = r2
                android.os.HandlerThread r2 = new android.os.HandlerThread
                java.lang.String r0 = "NotificationManagerCompat"
                r2.<init>(r0)
                r1.mHandlerThread = r2
                r2.start()
                android.os.Handler r0 = new android.os.Handler
                android.os.Looper r2 = r2.getLooper()
                r0.<init>(r2, r1)
                r1.mHandler = r0
                return
        }

        private boolean ensureServiceBound(androidx.core.app.NotificationManagerCompat.SideChannelManager.ListenerRecord r4) {
                r3 = this;
                boolean r0 = r4.bound
                if (r0 == 0) goto L6
                r4 = 1
                return r4
            L6:
                android.content.Intent r0 = new android.content.Intent
                java.lang.String r1 = "android.support.BIND_NOTIFICATION_SIDE_CHANNEL"
                r0.<init>(r1)
                android.content.ComponentName r1 = r4.componentName
                android.content.Intent r0 = r0.setComponent(r1)
                android.content.Context r1 = r3.mContext
                r2 = 33
                boolean r0 = r1.bindService(r0, r3, r2)
                r4.bound = r0
                if (r0 == 0) goto L23
                r0 = 0
                r4.retryCount = r0
                goto L2d
            L23:
                android.content.ComponentName r0 = r4.componentName
                java.util.Objects.toString(r0)
                android.content.Context r0 = r3.mContext
                r0.unbindService(r3)
            L2d:
                boolean r4 = r4.bound
                return r4
        }

        private void ensureServiceUnbound(androidx.core.app.NotificationManagerCompat.SideChannelManager.ListenerRecord r2) {
                r1 = this;
                boolean r0 = r2.bound
                if (r0 == 0) goto Lc
                android.content.Context r0 = r1.mContext
                r0.unbindService(r1)
                r0 = 0
                r2.bound = r0
            Lc:
                r0 = 0
                r2.service = r0
                return
        }

        private void handleQueueTask(androidx.core.app.NotificationManagerCompat.Task r4) {
                r3 = this;
                r3.updateListenerMap()
                java.util.Map<android.content.ComponentName, androidx.core.app.NotificationManagerCompat$SideChannelManager$ListenerRecord> r0 = r3.mRecordMap
                java.util.Collection r0 = r0.values()
                java.util.Iterator r0 = r0.iterator()
            Ld:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L22
                java.lang.Object r1 = r0.next()
                androidx.core.app.NotificationManagerCompat$SideChannelManager$ListenerRecord r1 = (androidx.core.app.NotificationManagerCompat.SideChannelManager.ListenerRecord) r1
                java.util.ArrayDeque<androidx.core.app.NotificationManagerCompat$Task> r2 = r1.taskQueue
                r2.add(r4)
                r3.processListenerQueue(r1)
                goto Ld
            L22:
                return
        }

        private void handleRetryListenerQueue(android.content.ComponentName r2) {
                r1 = this;
                java.util.Map<android.content.ComponentName, androidx.core.app.NotificationManagerCompat$SideChannelManager$ListenerRecord> r0 = r1.mRecordMap
                java.lang.Object r2 = r0.get(r2)
                androidx.core.app.NotificationManagerCompat$SideChannelManager$ListenerRecord r2 = (androidx.core.app.NotificationManagerCompat.SideChannelManager.ListenerRecord) r2
                if (r2 == 0) goto Ld
                r1.processListenerQueue(r2)
            Ld:
                return
        }

        private void handleServiceConnected(android.content.ComponentName r2, android.os.IBinder r3) {
                r1 = this;
                java.util.Map<android.content.ComponentName, androidx.core.app.NotificationManagerCompat$SideChannelManager$ListenerRecord> r0 = r1.mRecordMap
                java.lang.Object r2 = r0.get(r2)
                androidx.core.app.NotificationManagerCompat$SideChannelManager$ListenerRecord r2 = (androidx.core.app.NotificationManagerCompat.SideChannelManager.ListenerRecord) r2
                if (r2 == 0) goto L16
                android.support.v4.app.INotificationSideChannel r3 = android.support.v4.app.INotificationSideChannel.Stub.asInterface(r3)
                r2.service = r3
                r3 = 0
                r2.retryCount = r3
                r1.processListenerQueue(r2)
            L16:
                return
        }

        private void handleServiceDisconnected(android.content.ComponentName r2) {
                r1 = this;
                java.util.Map<android.content.ComponentName, androidx.core.app.NotificationManagerCompat$SideChannelManager$ListenerRecord> r0 = r1.mRecordMap
                java.lang.Object r2 = r0.get(r2)
                androidx.core.app.NotificationManagerCompat$SideChannelManager$ListenerRecord r2 = (androidx.core.app.NotificationManagerCompat.SideChannelManager.ListenerRecord) r2
                if (r2 == 0) goto Ld
                r1.ensureServiceUnbound(r2)
            Ld:
                return
        }

        private void processListenerQueue(androidx.core.app.NotificationManagerCompat.SideChannelManager.ListenerRecord r5) {
                r4 = this;
                java.lang.String r0 = "NotifManCompat"
                r1 = 3
                boolean r2 = android.util.Log.isLoggable(r0, r1)
                if (r2 == 0) goto L13
                android.content.ComponentName r2 = r5.componentName
                java.util.Objects.toString(r2)
                java.util.ArrayDeque<androidx.core.app.NotificationManagerCompat$Task> r2 = r5.taskQueue
                r2.size()
            L13:
                java.util.ArrayDeque<androidx.core.app.NotificationManagerCompat$Task> r2 = r5.taskQueue
                boolean r2 = r2.isEmpty()
                if (r2 == 0) goto L1c
                goto L65
            L1c:
                boolean r2 = r4.ensureServiceBound(r5)
                if (r2 == 0) goto L66
                android.support.v4.app.INotificationSideChannel r2 = r5.service
                if (r2 != 0) goto L27
                goto L66
            L27:
                java.util.ArrayDeque<androidx.core.app.NotificationManagerCompat$Task> r2 = r5.taskQueue
                java.lang.Object r2 = r2.peek()
                androidx.core.app.NotificationManagerCompat$Task r2 = (androidx.core.app.NotificationManagerCompat.Task) r2
                if (r2 != 0) goto L32
                goto L5a
            L32:
                boolean r3 = android.util.Log.isLoggable(r0, r1)     // Catch: android.os.DeadObjectException -> L3c android.os.RemoteException -> L49
                if (r3 == 0) goto L3e
                r2.toString()     // Catch: android.os.DeadObjectException -> L3c android.os.RemoteException -> L49
                goto L3e
            L3c:
                goto L4f
            L3e:
                android.support.v4.app.INotificationSideChannel r3 = r5.service     // Catch: android.os.DeadObjectException -> L3c android.os.RemoteException -> L49
                r2.send(r3)     // Catch: android.os.DeadObjectException -> L3c android.os.RemoteException -> L49
                java.util.ArrayDeque<androidx.core.app.NotificationManagerCompat$Task> r2 = r5.taskQueue     // Catch: android.os.DeadObjectException -> L3c android.os.RemoteException -> L49
                r2.remove()     // Catch: android.os.DeadObjectException -> L3c android.os.RemoteException -> L49
                goto L27
            L49:
                android.content.ComponentName r0 = r5.componentName
                java.util.Objects.toString(r0)
                goto L5a
            L4f:
                boolean r0 = android.util.Log.isLoggable(r0, r1)
                if (r0 == 0) goto L5a
                android.content.ComponentName r0 = r5.componentName
                java.util.Objects.toString(r0)
            L5a:
                java.util.ArrayDeque<androidx.core.app.NotificationManagerCompat$Task> r0 = r5.taskQueue
                boolean r0 = r0.isEmpty()
                if (r0 != 0) goto L65
                r4.scheduleListenerRetry(r5)
            L65:
                return
            L66:
                r4.scheduleListenerRetry(r5)
                return
        }

        private void scheduleListenerRetry(androidx.core.app.NotificationManagerCompat.SideChannelManager.ListenerRecord r5) {
                r4 = this;
                android.os.Handler r0 = r4.mHandler
                android.content.ComponentName r1 = r5.componentName
                r2 = 3
                boolean r0 = r0.hasMessages(r2, r1)
                if (r0 == 0) goto Lc
                return
            Lc:
                int r0 = r5.retryCount
                int r1 = r0 + 1
                r5.retryCount = r1
                r3 = 6
                if (r1 <= r3) goto L25
                java.util.ArrayDeque<androidx.core.app.NotificationManagerCompat$Task> r0 = r5.taskQueue
                r0.size()
                android.content.ComponentName r0 = r5.componentName
                java.util.Objects.toString(r0)
                java.util.ArrayDeque<androidx.core.app.NotificationManagerCompat$Task> r5 = r5.taskQueue
                r5.clear()
                return
            L25:
                r1 = 1
                int r0 = r1 << r0
                int r0 = r0 * 1000
                java.lang.String r1 = "NotifManCompat"
                android.util.Log.isLoggable(r1, r2)
                android.os.Handler r1 = r4.mHandler
                android.content.ComponentName r5 = r5.componentName
                android.os.Message r5 = r1.obtainMessage(r2, r5)
                android.os.Handler r1 = r4.mHandler
                long r2 = (long) r0
                r1.sendMessageDelayed(r5, r2)
                return
        }

        private void updateListenerMap() {
                r7 = this;
                android.content.Context r0 = r7.mContext
                java.util.Set r0 = androidx.core.app.NotificationManagerCompat.getEnabledListenerPackages(r0)
                java.util.Set<java.lang.String> r1 = r7.mCachedEnabledPackages
                boolean r1 = r0.equals(r1)
                if (r1 == 0) goto L10
                goto Lca
            L10:
                r7.mCachedEnabledPackages = r0
                android.content.Context r1 = r7.mContext
                android.content.pm.PackageManager r1 = r1.getPackageManager()
                android.content.Intent r2 = new android.content.Intent
                r2.<init>()
                java.lang.String r3 = "android.support.BIND_NOTIFICATION_SIDE_CHANNEL"
                android.content.Intent r2 = r2.setAction(r3)
                r3 = 0
                java.util.List r1 = r1.queryIntentServices(r2, r3)
                java.util.HashSet r2 = new java.util.HashSet
                r2.<init>()
                java.util.Iterator r1 = r1.iterator()
            L31:
                boolean r3 = r1.hasNext()
                if (r3 == 0) goto L61
                java.lang.Object r3 = r1.next()
                android.content.pm.ResolveInfo r3 = (android.content.pm.ResolveInfo) r3
                android.content.pm.ServiceInfo r4 = r3.serviceInfo
                java.lang.String r4 = r4.packageName
                boolean r4 = r0.contains(r4)
                if (r4 != 0) goto L48
                goto L31
            L48:
                android.content.ComponentName r4 = new android.content.ComponentName
                android.content.pm.ServiceInfo r5 = r3.serviceInfo
                java.lang.String r6 = r5.packageName
                java.lang.String r5 = r5.name
                r4.<init>(r6, r5)
                android.content.pm.ServiceInfo r3 = r3.serviceInfo
                java.lang.String r3 = r3.permission
                if (r3 == 0) goto L5d
                r4.toString()
                goto L31
            L5d:
                r2.add(r4)
                goto L31
            L61:
                java.util.Iterator r0 = r2.iterator()
            L65:
                boolean r1 = r0.hasNext()
                r3 = 3
                java.lang.String r4 = "NotifManCompat"
                if (r1 == 0) goto L90
                java.lang.Object r1 = r0.next()
                android.content.ComponentName r1 = (android.content.ComponentName) r1
                java.util.Map<android.content.ComponentName, androidx.core.app.NotificationManagerCompat$SideChannelManager$ListenerRecord> r5 = r7.mRecordMap
                boolean r5 = r5.containsKey(r1)
                if (r5 != 0) goto L65
                boolean r3 = android.util.Log.isLoggable(r4, r3)
                if (r3 == 0) goto L85
                java.util.Objects.toString(r1)
            L85:
                java.util.Map<android.content.ComponentName, androidx.core.app.NotificationManagerCompat$SideChannelManager$ListenerRecord> r3 = r7.mRecordMap
                androidx.core.app.NotificationManagerCompat$SideChannelManager$ListenerRecord r4 = new androidx.core.app.NotificationManagerCompat$SideChannelManager$ListenerRecord
                r4.<init>(r1)
                r3.put(r1, r4)
                goto L65
            L90:
                java.util.Map<android.content.ComponentName, androidx.core.app.NotificationManagerCompat$SideChannelManager$ListenerRecord> r0 = r7.mRecordMap
                java.util.Set r0 = r0.entrySet()
                java.util.Iterator r0 = r0.iterator()
            L9a:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto Lca
                java.lang.Object r1 = r0.next()
                java.util.Map$Entry r1 = (java.util.Map.Entry) r1
                java.lang.Object r5 = r1.getKey()
                boolean r5 = r2.contains(r5)
                if (r5 != 0) goto L9a
                boolean r5 = android.util.Log.isLoggable(r4, r3)
                if (r5 == 0) goto Lbd
                java.lang.Object r5 = r1.getKey()
                java.util.Objects.toString(r5)
            Lbd:
                java.lang.Object r1 = r1.getValue()
                androidx.core.app.NotificationManagerCompat$SideChannelManager$ListenerRecord r1 = (androidx.core.app.NotificationManagerCompat.SideChannelManager.ListenerRecord) r1
                r7.ensureServiceUnbound(r1)
                r0.remove()
                goto L9a
            Lca:
                return
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(android.os.Message r4) {
                r3 = this;
                int r0 = r4.what
                r1 = 1
                if (r0 == 0) goto L2b
                if (r0 == r1) goto L1f
                r2 = 2
                if (r0 == r2) goto L17
                r2 = 3
                if (r0 == r2) goto Lf
                r4 = 0
                return r4
            Lf:
                java.lang.Object r4 = r4.obj
                android.content.ComponentName r4 = (android.content.ComponentName) r4
                r3.handleRetryListenerQueue(r4)
                return r1
            L17:
                java.lang.Object r4 = r4.obj
                android.content.ComponentName r4 = (android.content.ComponentName) r4
                r3.handleServiceDisconnected(r4)
                return r1
            L1f:
                java.lang.Object r4 = r4.obj
                androidx.core.app.NotificationManagerCompat$ServiceConnectedEvent r4 = (androidx.core.app.NotificationManagerCompat.ServiceConnectedEvent) r4
                android.content.ComponentName r0 = r4.componentName
                android.os.IBinder r4 = r4.iBinder
                r3.handleServiceConnected(r0, r4)
                return r1
            L2b:
                java.lang.Object r4 = r4.obj
                androidx.core.app.NotificationManagerCompat$Task r4 = (androidx.core.app.NotificationManagerCompat.Task) r4
                r3.handleQueueTask(r4)
                return r1
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(android.content.ComponentName r3, android.os.IBinder r4) {
                r2 = this;
                java.lang.String r0 = "NotifManCompat"
                r1 = 3
                boolean r0 = android.util.Log.isLoggable(r0, r1)
                if (r0 == 0) goto Lc
                java.util.Objects.toString(r3)
            Lc:
                android.os.Handler r0 = r2.mHandler
                androidx.core.app.NotificationManagerCompat$ServiceConnectedEvent r1 = new androidx.core.app.NotificationManagerCompat$ServiceConnectedEvent
                r1.<init>(r3, r4)
                r3 = 1
                android.os.Message r3 = r0.obtainMessage(r3, r1)
                r3.sendToTarget()
                return
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(android.content.ComponentName r3) {
                r2 = this;
                java.lang.String r0 = "NotifManCompat"
                r1 = 3
                boolean r0 = android.util.Log.isLoggable(r0, r1)
                if (r0 == 0) goto Lc
                java.util.Objects.toString(r3)
            Lc:
                android.os.Handler r0 = r2.mHandler
                r1 = 2
                android.os.Message r3 = r0.obtainMessage(r1, r3)
                r3.sendToTarget()
                return
        }

        public void queueTask(androidx.core.app.NotificationManagerCompat.Task r3) {
                r2 = this;
                android.os.Handler r0 = r2.mHandler
                r1 = 0
                android.os.Message r3 = r0.obtainMessage(r1, r3)
                r3.sendToTarget()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private interface Task {
        void send(android.support.v4.app.INotificationSideChannel r1) throws android.os.RemoteException;
    }

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            androidx.core.app.NotificationManagerCompat.sEnabledNotificationListenersLock = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            androidx.core.app.NotificationManagerCompat.sEnabledNotificationListenerPackages = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            androidx.core.app.NotificationManagerCompat.sLock = r0
            return
    }

    @androidx.annotation.VisibleForTesting
    NotificationManagerCompat(@androidx.annotation.NonNull android.app.NotificationManager r1, @androidx.annotation.NonNull android.content.Context r2) {
            r0 = this;
            r0.<init>()
            r0.mContext = r2
            r0.mNotificationManager = r1
            return
    }

    private NotificationManagerCompat(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            r1.mContext = r2
            java.lang.String r0 = "notification"
            java.lang.Object r2 = r2.getSystemService(r0)
            android.app.NotificationManager r2 = (android.app.NotificationManager) r2
            r1.mNotificationManager = r2
            return
    }

    @androidx.annotation.NonNull
    public static androidx.core.app.NotificationManagerCompat from(@androidx.annotation.NonNull android.content.Context r1) {
            androidx.core.app.NotificationManagerCompat r0 = new androidx.core.app.NotificationManagerCompat
            r0.<init>(r1)
            return r0
    }

    @androidx.annotation.NonNull
    public static java.util.Set<java.lang.String> getEnabledListenerPackages(@androidx.annotation.NonNull android.content.Context r6) {
            android.content.ContentResolver r6 = r6.getContentResolver()
            java.lang.String r0 = "enabled_notification_listeners"
            java.lang.String r6 = android.provider.Settings.Secure.getString(r6, r0)
            java.lang.Object r0 = androidx.core.app.NotificationManagerCompat.sEnabledNotificationListenersLock
            monitor-enter(r0)
            if (r6 == 0) goto L41
            java.lang.String r1 = androidx.core.app.NotificationManagerCompat.sEnabledNotificationListeners     // Catch: java.lang.Throwable -> L38
            boolean r1 = r6.equals(r1)     // Catch: java.lang.Throwable -> L38
            if (r1 != 0) goto L41
            java.lang.String r1 = ":"
            r2 = -1
            java.lang.String[] r1 = r6.split(r1, r2)     // Catch: java.lang.Throwable -> L38
            java.util.HashSet r2 = new java.util.HashSet     // Catch: java.lang.Throwable -> L38
            int r3 = r1.length     // Catch: java.lang.Throwable -> L38
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L38
            int r3 = r1.length     // Catch: java.lang.Throwable -> L38
            r4 = 0
        L26:
            if (r4 >= r3) goto L3d
            r5 = r1[r4]     // Catch: java.lang.Throwable -> L38
            android.content.ComponentName r5 = android.content.ComponentName.unflattenFromString(r5)     // Catch: java.lang.Throwable -> L38
            if (r5 == 0) goto L3a
            java.lang.String r5 = r5.getPackageName()     // Catch: java.lang.Throwable -> L38
            r2.add(r5)     // Catch: java.lang.Throwable -> L38
            goto L3a
        L38:
            r6 = move-exception
            goto L45
        L3a:
            int r4 = r4 + 1
            goto L26
        L3d:
            androidx.core.app.NotificationManagerCompat.sEnabledNotificationListenerPackages = r2     // Catch: java.lang.Throwable -> L38
            androidx.core.app.NotificationManagerCompat.sEnabledNotificationListeners = r6     // Catch: java.lang.Throwable -> L38
        L41:
            java.util.Set<java.lang.String> r6 = androidx.core.app.NotificationManagerCompat.sEnabledNotificationListenerPackages     // Catch: java.lang.Throwable -> L38
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L38
            return r6
        L45:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L38
            throw r6
    }

    private void pushSideChannelQueue(androidx.core.app.NotificationManagerCompat.Task r4) {
            r3 = this;
            java.lang.Object r0 = androidx.core.app.NotificationManagerCompat.sLock
            monitor-enter(r0)
            androidx.core.app.NotificationManagerCompat$SideChannelManager r1 = androidx.core.app.NotificationManagerCompat.sSideChannelManager     // Catch: java.lang.Throwable -> L15
            if (r1 != 0) goto L17
            androidx.core.app.NotificationManagerCompat$SideChannelManager r1 = new androidx.core.app.NotificationManagerCompat$SideChannelManager     // Catch: java.lang.Throwable -> L15
            android.content.Context r2 = r3.mContext     // Catch: java.lang.Throwable -> L15
            android.content.Context r2 = r2.getApplicationContext()     // Catch: java.lang.Throwable -> L15
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L15
            androidx.core.app.NotificationManagerCompat.sSideChannelManager = r1     // Catch: java.lang.Throwable -> L15
            goto L17
        L15:
            r4 = move-exception
            goto L1e
        L17:
            androidx.core.app.NotificationManagerCompat$SideChannelManager r1 = androidx.core.app.NotificationManagerCompat.sSideChannelManager     // Catch: java.lang.Throwable -> L15
            r1.queueTask(r4)     // Catch: java.lang.Throwable -> L15
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            return
        L1e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            throw r4
    }

    private static boolean useSideChannelForNotification(android.app.Notification r1) {
            android.os.Bundle r1 = androidx.core.app.NotificationCompat.getExtras(r1)
            if (r1 == 0) goto L10
            java.lang.String r0 = "android.support.useSideChannel"
            boolean r1 = r1.getBoolean(r0)
            if (r1 == 0) goto L10
            r1 = 1
            return r1
        L10:
            r1 = 0
            return r1
    }

    public boolean areNotificationsEnabled() {
            r11 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto Ld
            android.app.NotificationManager r0 = r11.mNotificationManager
            boolean r0 = androidx.core.app.NotificationManagerCompat.Api24Impl.areNotificationsEnabled(r0)
            return r0
        Ld:
            android.content.Context r0 = r11.mContext
            java.lang.String r1 = "appops"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.app.AppOpsManager r0 = (android.app.AppOpsManager) r0
            android.content.Context r1 = r11.mContext
            android.content.pm.ApplicationInfo r1 = r1.getApplicationInfo()
            android.content.Context r2 = r11.mContext
            android.content.Context r2 = r2.getApplicationContext()
            java.lang.String r2 = r2.getPackageName()
            int r1 = r1.uid
            r3 = 1
            java.lang.Class<android.app.AppOpsManager> r4 = android.app.AppOpsManager.class
            java.lang.String r4 = r4.getName()     // Catch: java.lang.Throwable -> L74
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch: java.lang.Throwable -> L74
            java.lang.String r5 = "checkOpNoThrow"
            r6 = 3
            java.lang.Class[] r7 = new java.lang.Class[r6]     // Catch: java.lang.Throwable -> L74
            java.lang.Class r8 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L74
            r9 = 0
            r7[r9] = r8     // Catch: java.lang.Throwable -> L74
            r7[r3] = r8     // Catch: java.lang.Throwable -> L74
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r10 = 2
            r7[r10] = r8     // Catch: java.lang.Throwable -> L74
            java.lang.reflect.Method r5 = r4.getMethod(r5, r7)     // Catch: java.lang.Throwable -> L74
            java.lang.String r7 = "OP_POST_NOTIFICATION"
            java.lang.reflect.Field r4 = r4.getDeclaredField(r7)     // Catch: java.lang.Throwable -> L74
            java.lang.Class<java.lang.Integer> r7 = java.lang.Integer.class
            java.lang.Object r4 = r4.get(r7)     // Catch: java.lang.Throwable -> L74
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch: java.lang.Throwable -> L74
            r4.intValue()     // Catch: java.lang.Throwable -> L74
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L74
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L74
            r6[r9] = r4     // Catch: java.lang.Throwable -> L74
            r6[r3] = r1     // Catch: java.lang.Throwable -> L74
            r6[r10] = r2     // Catch: java.lang.Throwable -> L74
            java.lang.Object r0 = r5.invoke(r0, r6)     // Catch: java.lang.Throwable -> L74
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Throwable -> L74
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L74
            if (r0 != 0) goto L73
            return r3
        L73:
            return r9
        L74:
            return r3
    }

    public boolean canUseFullScreenIntent() {
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            r2 = 1
            if (r0 >= r1) goto L8
            return r2
        L8:
            r1 = 34
            if (r0 >= r1) goto L19
            android.content.Context r0 = r3.mContext
            java.lang.String r1 = "android.permission.USE_FULL_SCREEN_INTENT"
            int r0 = androidx.core.app.q.a(r0, r1)
            if (r0 != 0) goto L17
            return r2
        L17:
            r0 = 0
            return r0
        L19:
            android.app.NotificationManager r0 = r3.mNotificationManager
            boolean r0 = androidx.core.app.NotificationManagerCompat.Api34Impl.canUseFullScreenIntent(r0)
            return r0
    }

    public void cancel(int r2) {
            r1 = this;
            r0 = 0
            r1.cancel(r0, r2)
            return
    }

    public void cancel(@androidx.annotation.Nullable java.lang.String r2, int r3) {
            r1 = this;
            android.app.NotificationManager r0 = r1.mNotificationManager
            r0.cancel(r2, r3)
            return
    }

    public void cancelAll() {
            r1 = this;
            android.app.NotificationManager r0 = r1.mNotificationManager
            r0.cancelAll()
            return
    }

    public void createNotificationChannel(@androidx.annotation.NonNull android.app.NotificationChannel r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto Lb
            android.app.NotificationManager r0 = r2.mNotificationManager
            androidx.core.app.NotificationManagerCompat.Api26Impl.createNotificationChannel(r0, r3)
        Lb:
            return
    }

    public void createNotificationChannel(@androidx.annotation.NonNull androidx.core.app.NotificationChannelCompat r1) {
            r0 = this;
            android.app.NotificationChannel r1 = r1.getNotificationChannel()
            r0.createNotificationChannel(r1)
            return
    }

    public void createNotificationChannelGroup(@androidx.annotation.NonNull android.app.NotificationChannelGroup r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto Lb
            android.app.NotificationManager r0 = r2.mNotificationManager
            androidx.core.app.NotificationManagerCompat.Api26Impl.createNotificationChannelGroup(r0, r3)
        Lb:
            return
    }

    public void createNotificationChannelGroup(@androidx.annotation.NonNull androidx.core.app.NotificationChannelGroupCompat r1) {
            r0 = this;
            android.app.NotificationChannelGroup r1 = r1.getNotificationChannelGroup()
            r0.createNotificationChannelGroup(r1)
            return
    }

    public void createNotificationChannelGroups(@androidx.annotation.NonNull java.util.List<android.app.NotificationChannelGroup> r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto Lb
            android.app.NotificationManager r0 = r2.mNotificationManager
            androidx.core.app.NotificationManagerCompat.Api26Impl.createNotificationChannelGroups(r0, r3)
        Lb:
            return
    }

    public void createNotificationChannelGroupsCompat(@androidx.annotation.NonNull java.util.List<androidx.core.app.NotificationChannelGroupCompat> r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L32
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L32
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r3.size()
            r0.<init>(r1)
            java.util.Iterator r3 = r3.iterator()
        L19:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L2d
            java.lang.Object r1 = r3.next()
            androidx.core.app.NotificationChannelGroupCompat r1 = (androidx.core.app.NotificationChannelGroupCompat) r1
            android.app.NotificationChannelGroup r1 = r1.getNotificationChannelGroup()
            r0.add(r1)
            goto L19
        L2d:
            android.app.NotificationManager r3 = r2.mNotificationManager
            androidx.core.app.NotificationManagerCompat.Api26Impl.createNotificationChannelGroups(r3, r0)
        L32:
            return
    }

    public void createNotificationChannels(@androidx.annotation.NonNull java.util.List<android.app.NotificationChannel> r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto Lb
            android.app.NotificationManager r0 = r2.mNotificationManager
            androidx.core.app.NotificationManagerCompat.Api26Impl.createNotificationChannels(r0, r3)
        Lb:
            return
    }

    public void createNotificationChannelsCompat(@androidx.annotation.NonNull java.util.List<androidx.core.app.NotificationChannelCompat> r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L32
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L32
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r3.size()
            r0.<init>(r1)
            java.util.Iterator r3 = r3.iterator()
        L19:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L2d
            java.lang.Object r1 = r3.next()
            androidx.core.app.NotificationChannelCompat r1 = (androidx.core.app.NotificationChannelCompat) r1
            android.app.NotificationChannel r1 = r1.getNotificationChannel()
            r0.add(r1)
            goto L19
        L2d:
            android.app.NotificationManager r3 = r2.mNotificationManager
            androidx.core.app.NotificationManagerCompat.Api26Impl.createNotificationChannels(r3, r0)
        L32:
            return
    }

    public void deleteNotificationChannel(@androidx.annotation.NonNull java.lang.String r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto Lb
            android.app.NotificationManager r0 = r2.mNotificationManager
            androidx.core.app.NotificationManagerCompat.Api26Impl.deleteNotificationChannel(r0, r3)
        Lb:
            return
    }

    public void deleteNotificationChannelGroup(@androidx.annotation.NonNull java.lang.String r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto Lb
            android.app.NotificationManager r0 = r2.mNotificationManager
            androidx.core.app.NotificationManagerCompat.Api26Impl.deleteNotificationChannelGroup(r0, r3)
        Lb:
            return
    }

    public void deleteUnlistedNotificationChannels(@androidx.annotation.NonNull java.util.Collection<java.lang.String> r5) {
            r4 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L44
            android.app.NotificationManager r0 = r4.mNotificationManager
            java.util.List r0 = androidx.core.app.NotificationManagerCompat.Api26Impl.getNotificationChannels(r0)
            java.util.Iterator r0 = r0.iterator()
        L10:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L44
            java.lang.Object r1 = r0.next()
            android.app.NotificationChannel r1 = androidx.core.app.i.a(r1)
            java.lang.String r2 = androidx.core.app.NotificationManagerCompat.Api26Impl.getId(r1)
            boolean r2 = r5.contains(r2)
            if (r2 == 0) goto L29
            goto L10
        L29:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 30
            if (r2 < r3) goto L3a
            java.lang.String r2 = androidx.core.app.NotificationManagerCompat.Api30Impl.getParentChannelId(r1)
            boolean r2 = r5.contains(r2)
            if (r2 == 0) goto L3a
            goto L10
        L3a:
            android.app.NotificationManager r2 = r4.mNotificationManager
            java.lang.String r1 = androidx.core.app.NotificationManagerCompat.Api26Impl.getId(r1)
            androidx.core.app.NotificationManagerCompat.Api26Impl.deleteNotificationChannel(r2, r1)
            goto L10
        L44:
            return
    }

    @androidx.annotation.NonNull
    public java.util.List<android.service.notification.StatusBarNotification> getActiveNotifications() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto Ld
            android.app.NotificationManager r0 = r2.mNotificationManager
            java.util.List r0 = androidx.core.app.NotificationManagerCompat.Api23Impl.getActiveNotifications(r0)
            return r0
        Ld:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
    }

    public int getCurrentInterruptionFilter() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 >= r1) goto L8
            r0 = 0
            return r0
        L8:
            android.app.NotificationManager r0 = r2.mNotificationManager
            int r0 = androidx.core.app.NotificationManagerCompat.Api23Impl.getCurrentInterruptionFilter(r0)
            return r0
    }

    public int getImportance() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto Ld
            android.app.NotificationManager r0 = r2.mNotificationManager
            int r0 = androidx.core.app.NotificationManagerCompat.Api24Impl.getImportance(r0)
            return r0
        Ld:
            r0 = -1000(0xfffffffffffffc18, float:NaN)
            return r0
    }

    @androidx.annotation.Nullable
    public android.app.NotificationChannel getNotificationChannel(@androidx.annotation.NonNull java.lang.String r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto Ld
            android.app.NotificationManager r0 = r2.mNotificationManager
            android.app.NotificationChannel r3 = androidx.core.app.NotificationManagerCompat.Api26Impl.getNotificationChannel(r0, r3)
            return r3
        Ld:
            r3 = 0
            return r3
    }

    @androidx.annotation.Nullable
    public android.app.NotificationChannel getNotificationChannel(@androidx.annotation.NonNull java.lang.String r3, @androidx.annotation.NonNull java.lang.String r4) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto Ld
            android.app.NotificationManager r0 = r2.mNotificationManager
            android.app.NotificationChannel r3 = androidx.core.app.NotificationManagerCompat.Api30Impl.getNotificationChannel(r0, r3, r4)
            return r3
        Ld:
            android.app.NotificationChannel r3 = r2.getNotificationChannel(r3)
            return r3
    }

    @androidx.annotation.Nullable
    public androidx.core.app.NotificationChannelCompat getNotificationChannelCompat(@androidx.annotation.NonNull java.lang.String r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L12
            android.app.NotificationChannel r3 = r2.getNotificationChannel(r3)
            if (r3 == 0) goto L12
            androidx.core.app.NotificationChannelCompat r0 = new androidx.core.app.NotificationChannelCompat
            r0.<init>(r3)
            return r0
        L12:
            r3 = 0
            return r3
    }

    @androidx.annotation.Nullable
    public androidx.core.app.NotificationChannelCompat getNotificationChannelCompat(@androidx.annotation.NonNull java.lang.String r3, @androidx.annotation.NonNull java.lang.String r4) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L12
            android.app.NotificationChannel r3 = r2.getNotificationChannel(r3, r4)
            if (r3 == 0) goto L12
            androidx.core.app.NotificationChannelCompat r4 = new androidx.core.app.NotificationChannelCompat
            r4.<init>(r3)
            return r4
        L12:
            r3 = 0
            return r3
    }

    @androidx.annotation.Nullable
    public android.app.NotificationChannelGroup getNotificationChannelGroup(@androidx.annotation.NonNull java.lang.String r5) {
            r4 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Ld
            android.app.NotificationManager r0 = r4.mNotificationManager
            android.app.NotificationChannelGroup r5 = androidx.core.app.NotificationManagerCompat.Api28Impl.getNotificationChannelGroup(r0, r5)
            return r5
        Ld:
            r1 = 26
            r2 = 0
            if (r0 < r1) goto L33
            java.util.List r0 = r4.getNotificationChannelGroups()
            java.util.Iterator r0 = r0.iterator()
        L1a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L33
            java.lang.Object r1 = r0.next()
            android.app.NotificationChannelGroup r1 = androidx.core.app.r.a(r1)
            java.lang.String r3 = androidx.core.app.NotificationManagerCompat.Api26Impl.getId(r1)
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L1a
            return r1
        L33:
            return r2
    }

    @androidx.annotation.Nullable
    public androidx.core.app.NotificationChannelGroupCompat getNotificationChannelGroupCompat(@androidx.annotation.NonNull java.lang.String r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L12
            android.app.NotificationChannelGroup r3 = r2.getNotificationChannelGroup(r3)
            if (r3 == 0) goto L26
            androidx.core.app.NotificationChannelGroupCompat r0 = new androidx.core.app.NotificationChannelGroupCompat
            r0.<init>(r3)
            return r0
        L12:
            r1 = 26
            if (r0 < r1) goto L26
            android.app.NotificationChannelGroup r3 = r2.getNotificationChannelGroup(r3)
            if (r3 == 0) goto L26
            androidx.core.app.NotificationChannelGroupCompat r0 = new androidx.core.app.NotificationChannelGroupCompat
            java.util.List r1 = r2.getNotificationChannels()
            r0.<init>(r3, r1)
            return r0
        L26:
            r3 = 0
            return r3
    }

    @androidx.annotation.NonNull
    public java.util.List<android.app.NotificationChannelGroup> getNotificationChannelGroups() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto Ld
            android.app.NotificationManager r0 = r2.mNotificationManager
            java.util.List r0 = androidx.core.app.NotificationManagerCompat.Api26Impl.getNotificationChannelGroups(r0)
            return r0
        Ld:
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            return r0
    }

    @androidx.annotation.NonNull
    public java.util.List<androidx.core.app.NotificationChannelGroupCompat> getNotificationChannelGroupsCompat() {
            r6 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L4d
            java.util.List r1 = r6.getNotificationChannelGroups()
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L4d
            r2 = 28
            if (r0 < r2) goto L17
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            goto L1b
        L17:
            java.util.List r0 = r6.getNotificationChannels()
        L1b:
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = r1.size()
            r3.<init>(r4)
            java.util.Iterator r1 = r1.iterator()
        L28:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L4c
            java.lang.Object r4 = r1.next()
            android.app.NotificationChannelGroup r4 = androidx.core.app.r.a(r4)
            int r5 = android.os.Build.VERSION.SDK_INT
            if (r5 < r2) goto L43
            androidx.core.app.NotificationChannelGroupCompat r5 = new androidx.core.app.NotificationChannelGroupCompat
            r5.<init>(r4)
            r3.add(r5)
            goto L28
        L43:
            androidx.core.app.NotificationChannelGroupCompat r5 = new androidx.core.app.NotificationChannelGroupCompat
            r5.<init>(r4, r0)
            r3.add(r5)
            goto L28
        L4c:
            return r3
        L4d:
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            return r0
    }

    @androidx.annotation.NonNull
    public java.util.List<android.app.NotificationChannel> getNotificationChannels() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto Ld
            android.app.NotificationManager r0 = r2.mNotificationManager
            java.util.List r0 = androidx.core.app.NotificationManagerCompat.Api26Impl.getNotificationChannels(r0)
            return r0
        Ld:
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            return r0
    }

    @androidx.annotation.NonNull
    public java.util.List<androidx.core.app.NotificationChannelCompat> getNotificationChannelsCompat() {
            r4 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L35
            java.util.List r0 = r4.getNotificationChannels()
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L35
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.size()
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L1d:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L34
            java.lang.Object r2 = r0.next()
            android.app.NotificationChannel r2 = androidx.core.app.i.a(r2)
            androidx.core.app.NotificationChannelCompat r3 = new androidx.core.app.NotificationChannelCompat
            r3.<init>(r2)
            r1.add(r3)
            goto L1d
        L34:
            return r1
        L35:
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            return r0
    }

    @androidx.annotation.RequiresPermission("android.permission.POST_NOTIFICATIONS")
    public void notify(int r2, @androidx.annotation.NonNull android.app.Notification r3) {
            r1 = this;
            r0 = 0
            r1.notify(r0, r2, r3)
            return
    }

    @androidx.annotation.RequiresPermission("android.permission.POST_NOTIFICATIONS")
    public void notify(@androidx.annotation.Nullable java.lang.String r3, int r4, @androidx.annotation.NonNull android.app.Notification r5) {
            r2 = this;
            boolean r0 = useSideChannelForNotification(r5)
            if (r0 == 0) goto L1a
            androidx.core.app.NotificationManagerCompat$NotifyTask r0 = new androidx.core.app.NotificationManagerCompat$NotifyTask
            android.content.Context r1 = r2.mContext
            java.lang.String r1 = r1.getPackageName()
            r0.<init>(r1, r4, r3, r5)
            r2.pushSideChannelQueue(r0)
            android.app.NotificationManager r5 = r2.mNotificationManager
            r5.cancel(r3, r4)
            return
        L1a:
            android.app.NotificationManager r0 = r2.mNotificationManager
            r0.notify(r3, r4, r5)
            return
    }

    @androidx.annotation.RequiresPermission("android.permission.POST_NOTIFICATIONS")
    public void notify(@androidx.annotation.NonNull java.util.List<androidx.core.app.NotificationManagerCompat.NotificationWithIdAndTag> r6) {
            r5 = this;
            int r0 = r6.size()
            r1 = 0
        L5:
            if (r1 >= r0) goto L19
            java.lang.Object r2 = r6.get(r1)
            androidx.core.app.NotificationManagerCompat$NotificationWithIdAndTag r2 = (androidx.core.app.NotificationManagerCompat.NotificationWithIdAndTag) r2
            java.lang.String r3 = r2.mTag
            int r4 = r2.mId
            android.app.Notification r2 = r2.mNotification
            r5.notify(r3, r4, r2)
            int r1 = r1 + 1
            goto L5
        L19:
            return
    }
}

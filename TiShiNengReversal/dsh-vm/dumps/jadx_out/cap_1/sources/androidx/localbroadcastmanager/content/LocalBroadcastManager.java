package androidx.localbroadcastmanager.content;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@java.lang.Deprecated
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class LocalBroadcastManager {
    private static final boolean DEBUG = false;
    static final int MSG_EXEC_PENDING_BROADCASTS = 1;
    private static final java.lang.String TAG = "LocalBroadcastManager";
    private static androidx.localbroadcastmanager.content.LocalBroadcastManager mInstance;
    private static final java.lang.Object mLock = null;
    private final java.util.HashMap<java.lang.String, java.util.ArrayList<androidx.localbroadcastmanager.content.LocalBroadcastManager.ReceiverRecord>> mActions;
    private final android.content.Context mAppContext;
    private final android.os.Handler mHandler;
    private final java.util.ArrayList<androidx.localbroadcastmanager.content.LocalBroadcastManager.BroadcastRecord> mPendingBroadcasts;
    private final java.util.HashMap<android.content.BroadcastReceiver, java.util.ArrayList<androidx.localbroadcastmanager.content.LocalBroadcastManager.ReceiverRecord>> mReceivers;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class BroadcastRecord {
        final android.content.Intent intent;
        final java.util.ArrayList<androidx.localbroadcastmanager.content.LocalBroadcastManager.ReceiverRecord> receivers;

        BroadcastRecord(android.content.Intent r1, java.util.ArrayList<androidx.localbroadcastmanager.content.LocalBroadcastManager.ReceiverRecord> r2) {
                r0 = this;
                r0.<init>()
                r0.intent = r1
                r0.receivers = r2
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class ReceiverRecord {
        boolean broadcasting;
        boolean dead;
        final android.content.IntentFilter filter;
        final android.content.BroadcastReceiver receiver;

        ReceiverRecord(android.content.IntentFilter r1, android.content.BroadcastReceiver r2) {
                r0 = this;
                r0.<init>()
                r0.filter = r1
                r0.receiver = r2
                return
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r1 = 128(0x80, float:1.8E-43)
                r0.<init>(r1)
                java.lang.String r1 = "Receiver{"
                r0.append(r1)
                android.content.BroadcastReceiver r1 = r2.receiver
                r0.append(r1)
                java.lang.String r1 = " filter="
                r0.append(r1)
                android.content.IntentFilter r1 = r2.filter
                r0.append(r1)
                boolean r1 = r2.dead
                if (r1 == 0) goto L24
                java.lang.String r1 = " DEAD"
                r0.append(r1)
            L24:
                java.lang.String r1 = "}"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            androidx.localbroadcastmanager.content.LocalBroadcastManager.mLock = r0
            return
    }

    private LocalBroadcastManager(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.mReceivers = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.mActions = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mPendingBroadcasts = r0
            r1.mAppContext = r2
            androidx.localbroadcastmanager.content.LocalBroadcastManager$1 r0 = new androidx.localbroadcastmanager.content.LocalBroadcastManager$1
            android.os.Looper r2 = r2.getMainLooper()
            r0.<init>(r1, r2)
            r1.mHandler = r0
            return
    }

    @androidx.annotation.NonNull
    public static androidx.localbroadcastmanager.content.LocalBroadcastManager getInstance(@androidx.annotation.NonNull android.content.Context r2) {
            java.lang.Object r0 = androidx.localbroadcastmanager.content.LocalBroadcastManager.mLock
            monitor-enter(r0)
            androidx.localbroadcastmanager.content.LocalBroadcastManager r1 = androidx.localbroadcastmanager.content.LocalBroadcastManager.mInstance     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            androidx.localbroadcastmanager.content.LocalBroadcastManager r1 = new androidx.localbroadcastmanager.content.LocalBroadcastManager     // Catch: java.lang.Throwable -> L13
            android.content.Context r2 = r2.getApplicationContext()     // Catch: java.lang.Throwable -> L13
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L13
            androidx.localbroadcastmanager.content.LocalBroadcastManager.mInstance = r1     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r2 = move-exception
            goto L19
        L15:
            androidx.localbroadcastmanager.content.LocalBroadcastManager r2 = androidx.localbroadcastmanager.content.LocalBroadcastManager.mInstance     // Catch: java.lang.Throwable -> L13
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            return r2
        L19:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r2
    }

    void executePendingBroadcasts() {
            r10 = this;
        L0:
            java.util.HashMap<android.content.BroadcastReceiver, java.util.ArrayList<androidx.localbroadcastmanager.content.LocalBroadcastManager$ReceiverRecord>> r0 = r10.mReceivers
            monitor-enter(r0)
            java.util.ArrayList<androidx.localbroadcastmanager.content.LocalBroadcastManager$BroadcastRecord> r1 = r10.mPendingBroadcasts     // Catch: java.lang.Throwable -> Ld
            int r1 = r1.size()     // Catch: java.lang.Throwable -> Ld
            if (r1 > 0) goto Lf
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            return
        Ld:
            r1 = move-exception
            goto L46
        Lf:
            androidx.localbroadcastmanager.content.LocalBroadcastManager$BroadcastRecord[] r2 = new androidx.localbroadcastmanager.content.LocalBroadcastManager.BroadcastRecord[r1]     // Catch: java.lang.Throwable -> Ld
            java.util.ArrayList<androidx.localbroadcastmanager.content.LocalBroadcastManager$BroadcastRecord> r3 = r10.mPendingBroadcasts     // Catch: java.lang.Throwable -> Ld
            r3.toArray(r2)     // Catch: java.lang.Throwable -> Ld
            java.util.ArrayList<androidx.localbroadcastmanager.content.LocalBroadcastManager$BroadcastRecord> r3 = r10.mPendingBroadcasts     // Catch: java.lang.Throwable -> Ld
            r3.clear()     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            r0 = 0
            r3 = 0
        L1e:
            if (r3 >= r1) goto L0
            r4 = r2[r3]
            java.util.ArrayList<androidx.localbroadcastmanager.content.LocalBroadcastManager$ReceiverRecord> r5 = r4.receivers
            int r5 = r5.size()
            r6 = 0
        L29:
            if (r6 >= r5) goto L43
            java.util.ArrayList<androidx.localbroadcastmanager.content.LocalBroadcastManager$ReceiverRecord> r7 = r4.receivers
            java.lang.Object r7 = r7.get(r6)
            androidx.localbroadcastmanager.content.LocalBroadcastManager$ReceiverRecord r7 = (androidx.localbroadcastmanager.content.LocalBroadcastManager.ReceiverRecord) r7
            boolean r8 = r7.dead
            if (r8 != 0) goto L40
            android.content.BroadcastReceiver r7 = r7.receiver
            android.content.Context r8 = r10.mAppContext
            android.content.Intent r9 = r4.intent
            r7.onReceive(r8, r9)
        L40:
            int r6 = r6 + 1
            goto L29
        L43:
            int r3 = r3 + 1
            goto L1e
        L46:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            throw r1
    }

    public void registerReceiver(@androidx.annotation.NonNull android.content.BroadcastReceiver r7, @androidx.annotation.NonNull android.content.IntentFilter r8) {
            r6 = this;
            java.util.HashMap<android.content.BroadcastReceiver, java.util.ArrayList<androidx.localbroadcastmanager.content.LocalBroadcastManager$ReceiverRecord>> r0 = r6.mReceivers
            monitor-enter(r0)
            androidx.localbroadcastmanager.content.LocalBroadcastManager$ReceiverRecord r1 = new androidx.localbroadcastmanager.content.LocalBroadcastManager$ReceiverRecord     // Catch: java.lang.Throwable -> L1e
            r1.<init>(r8, r7)     // Catch: java.lang.Throwable -> L1e
            java.util.HashMap<android.content.BroadcastReceiver, java.util.ArrayList<androidx.localbroadcastmanager.content.LocalBroadcastManager$ReceiverRecord>> r2 = r6.mReceivers     // Catch: java.lang.Throwable -> L1e
            java.lang.Object r2 = r2.get(r7)     // Catch: java.lang.Throwable -> L1e
            java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch: java.lang.Throwable -> L1e
            r3 = 1
            if (r2 != 0) goto L20
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L1e
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L1e
            java.util.HashMap<android.content.BroadcastReceiver, java.util.ArrayList<androidx.localbroadcastmanager.content.LocalBroadcastManager$ReceiverRecord>> r4 = r6.mReceivers     // Catch: java.lang.Throwable -> L1e
            r4.put(r7, r2)     // Catch: java.lang.Throwable -> L1e
            goto L20
        L1e:
            r7 = move-exception
            goto L4a
        L20:
            r2.add(r1)     // Catch: java.lang.Throwable -> L1e
            r7 = 0
        L24:
            int r2 = r8.countActions()     // Catch: java.lang.Throwable -> L1e
            if (r7 >= r2) goto L48
            java.lang.String r2 = r8.getAction(r7)     // Catch: java.lang.Throwable -> L1e
            java.util.HashMap<java.lang.String, java.util.ArrayList<androidx.localbroadcastmanager.content.LocalBroadcastManager$ReceiverRecord>> r4 = r6.mActions     // Catch: java.lang.Throwable -> L1e
            java.lang.Object r4 = r4.get(r2)     // Catch: java.lang.Throwable -> L1e
            java.util.ArrayList r4 = (java.util.ArrayList) r4     // Catch: java.lang.Throwable -> L1e
            if (r4 != 0) goto L42
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L1e
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L1e
            java.util.HashMap<java.lang.String, java.util.ArrayList<androidx.localbroadcastmanager.content.LocalBroadcastManager$ReceiverRecord>> r5 = r6.mActions     // Catch: java.lang.Throwable -> L1e
            r5.put(r2, r4)     // Catch: java.lang.Throwable -> L1e
        L42:
            r4.add(r1)     // Catch: java.lang.Throwable -> L1e
            int r7 = r7 + 1
            goto L24
        L48:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1e
            return
        L4a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1e
            throw r7
    }

    public boolean sendBroadcast(@androidx.annotation.NonNull android.content.Intent r19) {
            r18 = this;
            r1 = r18
            r0 = r19
            java.util.HashMap<android.content.BroadcastReceiver, java.util.ArrayList<androidx.localbroadcastmanager.content.LocalBroadcastManager$ReceiverRecord>> r2 = r1.mReceivers
            monitor-enter(r2)
            java.lang.String r4 = r0.getAction()     // Catch: java.lang.Throwable -> L33
            android.content.Context r3 = r1.mAppContext     // Catch: java.lang.Throwable -> L33
            android.content.ContentResolver r3 = r3.getContentResolver()     // Catch: java.lang.Throwable -> L33
            java.lang.String r5 = r0.resolveTypeIfNeeded(r3)     // Catch: java.lang.Throwable -> L33
            android.net.Uri r7 = r0.getData()     // Catch: java.lang.Throwable -> L33
            java.lang.String r6 = r0.getScheme()     // Catch: java.lang.Throwable -> L33
            java.util.Set r8 = r0.getCategories()     // Catch: java.lang.Throwable -> L33
            int r3 = r0.getFlags()     // Catch: java.lang.Throwable -> L33
            r3 = r3 & 8
            r11 = 1
            if (r3 == 0) goto L2c
            r12 = 1
            goto L2d
        L2c:
            r12 = 0
        L2d:
            if (r12 == 0) goto L36
            r0.toString()     // Catch: java.lang.Throwable -> L33
            goto L36
        L33:
            r0 = move-exception
            goto Lba
        L36:
            java.util.HashMap<java.lang.String, java.util.ArrayList<androidx.localbroadcastmanager.content.LocalBroadcastManager$ReceiverRecord>> r3 = r1.mActions     // Catch: java.lang.Throwable -> L33
            java.lang.String r9 = r0.getAction()     // Catch: java.lang.Throwable -> L33
            java.lang.Object r3 = r3.get(r9)     // Catch: java.lang.Throwable -> L33
            r13 = r3
            java.util.ArrayList r13 = (java.util.ArrayList) r13     // Catch: java.lang.Throwable -> L33
            if (r13 == 0) goto Lb6
            if (r12 == 0) goto L4a
            r13.toString()     // Catch: java.lang.Throwable -> L33
        L4a:
            r3 = 0
            r14 = r3
            r15 = 0
        L4d:
            int r3 = r13.size()     // Catch: java.lang.Throwable -> L33
            if (r15 >= r3) goto L88
            java.lang.Object r3 = r13.get(r15)     // Catch: java.lang.Throwable -> L33
            androidx.localbroadcastmanager.content.LocalBroadcastManager$ReceiverRecord r3 = (androidx.localbroadcastmanager.content.LocalBroadcastManager.ReceiverRecord) r3     // Catch: java.lang.Throwable -> L33
            if (r12 == 0) goto L60
            android.content.IntentFilter r9 = r3.filter     // Catch: java.lang.Throwable -> L33
            java.util.Objects.toString(r9)     // Catch: java.lang.Throwable -> L33
        L60:
            boolean r9 = r3.broadcasting     // Catch: java.lang.Throwable -> L33
            if (r9 == 0) goto L65
            goto L85
        L65:
            r9 = r3
            android.content.IntentFilter r3 = r9.filter     // Catch: java.lang.Throwable -> L33
            r16 = r9
            java.lang.String r9 = "LocalBroadcastManager"
            r10 = r16
            int r3 = r3.match(r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L33
            if (r3 < 0) goto L85
            if (r12 == 0) goto L79
            java.lang.Integer.toHexString(r3)     // Catch: java.lang.Throwable -> L33
        L79:
            if (r14 != 0) goto L80
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L33
            r14.<init>()     // Catch: java.lang.Throwable -> L33
        L80:
            r14.add(r10)     // Catch: java.lang.Throwable -> L33
            r10.broadcasting = r11     // Catch: java.lang.Throwable -> L33
        L85:
            int r15 = r15 + 1
            goto L4d
        L88:
            if (r14 == 0) goto Lb6
            r3 = 0
        L8b:
            int r4 = r14.size()     // Catch: java.lang.Throwable -> L33
            if (r3 >= r4) goto L9d
            java.lang.Object r4 = r14.get(r3)     // Catch: java.lang.Throwable -> L33
            androidx.localbroadcastmanager.content.LocalBroadcastManager$ReceiverRecord r4 = (androidx.localbroadcastmanager.content.LocalBroadcastManager.ReceiverRecord) r4     // Catch: java.lang.Throwable -> L33
            r5 = 0
            r4.broadcasting = r5     // Catch: java.lang.Throwable -> L33
            int r3 = r3 + 1
            goto L8b
        L9d:
            java.util.ArrayList<androidx.localbroadcastmanager.content.LocalBroadcastManager$BroadcastRecord> r3 = r1.mPendingBroadcasts     // Catch: java.lang.Throwable -> L33
            androidx.localbroadcastmanager.content.LocalBroadcastManager$BroadcastRecord r4 = new androidx.localbroadcastmanager.content.LocalBroadcastManager$BroadcastRecord     // Catch: java.lang.Throwable -> L33
            r4.<init>(r0, r14)     // Catch: java.lang.Throwable -> L33
            r3.add(r4)     // Catch: java.lang.Throwable -> L33
            android.os.Handler r0 = r1.mHandler     // Catch: java.lang.Throwable -> L33
            boolean r0 = r0.hasMessages(r11)     // Catch: java.lang.Throwable -> L33
            if (r0 != 0) goto Lb4
            android.os.Handler r0 = r1.mHandler     // Catch: java.lang.Throwable -> L33
            r0.sendEmptyMessage(r11)     // Catch: java.lang.Throwable -> L33
        Lb4:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L33
            return r11
        Lb6:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L33
            r17 = 0
            return r17
        Lba:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L33
            throw r0
    }

    public void sendBroadcastSync(@androidx.annotation.NonNull android.content.Intent r1) {
            r0 = this;
            boolean r1 = r0.sendBroadcast(r1)
            if (r1 == 0) goto L9
            r0.executePendingBroadcasts()
        L9:
            return
    }

    public void unregisterReceiver(@androidx.annotation.NonNull android.content.BroadcastReceiver r12) {
            r11 = this;
            java.util.HashMap<android.content.BroadcastReceiver, java.util.ArrayList<androidx.localbroadcastmanager.content.LocalBroadcastManager$ReceiverRecord>> r0 = r11.mReceivers
            monitor-enter(r0)
            java.util.HashMap<android.content.BroadcastReceiver, java.util.ArrayList<androidx.localbroadcastmanager.content.LocalBroadcastManager$ReceiverRecord>> r1 = r11.mReceivers     // Catch: java.lang.Throwable -> Lf
            java.lang.Object r1 = r1.remove(r12)     // Catch: java.lang.Throwable -> Lf
            java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch: java.lang.Throwable -> Lf
            if (r1 != 0) goto L11
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return
        Lf:
            r12 = move-exception
            goto L66
        L11:
            int r2 = r1.size()     // Catch: java.lang.Throwable -> Lf
            r3 = 1
            int r2 = r2 - r3
        L17:
            if (r2 < 0) goto L64
            java.lang.Object r4 = r1.get(r2)     // Catch: java.lang.Throwable -> Lf
            androidx.localbroadcastmanager.content.LocalBroadcastManager$ReceiverRecord r4 = (androidx.localbroadcastmanager.content.LocalBroadcastManager.ReceiverRecord) r4     // Catch: java.lang.Throwable -> Lf
            r4.dead = r3     // Catch: java.lang.Throwable -> Lf
            r5 = 0
        L22:
            android.content.IntentFilter r6 = r4.filter     // Catch: java.lang.Throwable -> Lf
            int r6 = r6.countActions()     // Catch: java.lang.Throwable -> Lf
            if (r5 >= r6) goto L61
            android.content.IntentFilter r6 = r4.filter     // Catch: java.lang.Throwable -> Lf
            java.lang.String r6 = r6.getAction(r5)     // Catch: java.lang.Throwable -> Lf
            java.util.HashMap<java.lang.String, java.util.ArrayList<androidx.localbroadcastmanager.content.LocalBroadcastManager$ReceiverRecord>> r7 = r11.mActions     // Catch: java.lang.Throwable -> Lf
            java.lang.Object r7 = r7.get(r6)     // Catch: java.lang.Throwable -> Lf
            java.util.ArrayList r7 = (java.util.ArrayList) r7     // Catch: java.lang.Throwable -> Lf
            if (r7 == 0) goto L5e
            int r8 = r7.size()     // Catch: java.lang.Throwable -> Lf
            int r8 = r8 - r3
        L3f:
            if (r8 < 0) goto L53
            java.lang.Object r9 = r7.get(r8)     // Catch: java.lang.Throwable -> Lf
            androidx.localbroadcastmanager.content.LocalBroadcastManager$ReceiverRecord r9 = (androidx.localbroadcastmanager.content.LocalBroadcastManager.ReceiverRecord) r9     // Catch: java.lang.Throwable -> Lf
            android.content.BroadcastReceiver r10 = r9.receiver     // Catch: java.lang.Throwable -> Lf
            if (r10 != r12) goto L50
            r9.dead = r3     // Catch: java.lang.Throwable -> Lf
            r7.remove(r8)     // Catch: java.lang.Throwable -> Lf
        L50:
            int r8 = r8 + (-1)
            goto L3f
        L53:
            int r7 = r7.size()     // Catch: java.lang.Throwable -> Lf
            if (r7 > 0) goto L5e
            java.util.HashMap<java.lang.String, java.util.ArrayList<androidx.localbroadcastmanager.content.LocalBroadcastManager$ReceiverRecord>> r7 = r11.mActions     // Catch: java.lang.Throwable -> Lf
            r7.remove(r6)     // Catch: java.lang.Throwable -> Lf
        L5e:
            int r5 = r5 + 1
            goto L22
        L61:
            int r2 = r2 + (-1)
            goto L17
        L64:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return
        L66:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r12
    }
}

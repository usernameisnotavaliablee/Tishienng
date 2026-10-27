package com.bytedance.pangle;

@androidx.annotation.Keep
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public final class LocalBroadcastManager {
    private static final boolean DEBUG = false;
    static final int MSG_EXEC_PENDING_BROADCASTS = 1;
    private static final java.lang.String TAG = "LocalBroadcastManager";
    private static com.bytedance.pangle.LocalBroadcastManager mInstance;
    private static final java.lang.Object mLock = null;
    private final java.util.HashMap<java.lang.String, java.util.ArrayList<com.bytedance.pangle.LocalBroadcastManager.xt>> mActions;
    private final android.content.Context mAppContext;
    private final android.os.Handler mHandler;
    private final java.util.ArrayList<com.bytedance.pangle.LocalBroadcastManager.j> mPendingBroadcasts;
    private final java.util.HashMap<com.bytedance.pangle.receiver.PluginBroadcastReceiver, java.util.ArrayList<com.bytedance.pangle.LocalBroadcastManager.xt>> mReceivers;


    private static final class j {
        final android.content.Intent j;
        final java.util.ArrayList<com.bytedance.pangle.LocalBroadcastManager.xt> xt;

        j(android.content.Intent r1, java.util.ArrayList<com.bytedance.pangle.LocalBroadcastManager.xt> r2) {
                r0 = this;
                r0.<init>()
                r0.j = r1
                r0.xt = r2
                return
        }
    }

    private static final class xt {
        boolean cw;
        final android.content.IntentFilter j;
        boolean r;
        final com.bytedance.pangle.receiver.PluginBroadcastReceiver xt;

        xt(android.content.IntentFilter r1, com.bytedance.pangle.receiver.PluginBroadcastReceiver r2) {
                r0 = this;
                r0.<init>()
                r0.j = r1
                r0.xt = r2
                return
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r1 = 128(0x80, float:1.8E-43)
                r0.<init>(r1)
                java.lang.String r1 = "Receiver{"
                r0.append(r1)
                com.bytedance.pangle.receiver.PluginBroadcastReceiver r1 = r2.xt
                r0.append(r1)
                java.lang.String r1 = " filter="
                r0.append(r1)
                android.content.IntentFilter r1 = r2.j
                r0.append(r1)
                boolean r1 = r2.r
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
            com.bytedance.pangle.LocalBroadcastManager.mLock = r0
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
            com.bytedance.pangle.LocalBroadcastManager$1 r0 = new com.bytedance.pangle.LocalBroadcastManager$1
            android.os.Looper r2 = r2.getMainLooper()
            r0.<init>(r1, r2)
            r1.mHandler = r0
            return
    }

    public static com.bytedance.pangle.LocalBroadcastManager getInstance(android.content.Context r2) {
            java.lang.Object r0 = com.bytedance.pangle.LocalBroadcastManager.mLock
            monitor-enter(r0)
            com.bytedance.pangle.LocalBroadcastManager r1 = com.bytedance.pangle.LocalBroadcastManager.mInstance     // Catch: java.lang.Throwable -> L17
            if (r1 != 0) goto L19
            com.bytedance.pangle.LocalBroadcastManager r1 = new com.bytedance.pangle.LocalBroadcastManager     // Catch: java.lang.Throwable -> L17
            android.content.Context r2 = r2.getApplicationContext()     // Catch: java.lang.Throwable -> L17
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)     // Catch: java.lang.Throwable -> L17
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L17
            com.bytedance.pangle.LocalBroadcastManager.mInstance = r1     // Catch: java.lang.Throwable -> L17
            goto L19
        L17:
            r2 = move-exception
            goto L1d
        L19:
            com.bytedance.pangle.LocalBroadcastManager r2 = com.bytedance.pangle.LocalBroadcastManager.mInstance     // Catch: java.lang.Throwable -> L17
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            return r2
        L1d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            throw r2
    }

    void executePendingBroadcasts() {
            r10 = this;
        L0:
            java.util.HashMap<com.bytedance.pangle.receiver.PluginBroadcastReceiver, java.util.ArrayList<com.bytedance.pangle.LocalBroadcastManager$xt>> r0 = r10.mReceivers
            monitor-enter(r0)
            java.util.ArrayList<com.bytedance.pangle.LocalBroadcastManager$j> r1 = r10.mPendingBroadcasts     // Catch: java.lang.Throwable -> Ld
            int r1 = r1.size()     // Catch: java.lang.Throwable -> Ld
            if (r1 > 0) goto Lf
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            return
        Ld:
            r1 = move-exception
            goto L46
        Lf:
            com.bytedance.pangle.LocalBroadcastManager$j[] r2 = new com.bytedance.pangle.LocalBroadcastManager.j[r1]     // Catch: java.lang.Throwable -> Ld
            java.util.ArrayList<com.bytedance.pangle.LocalBroadcastManager$j> r3 = r10.mPendingBroadcasts     // Catch: java.lang.Throwable -> Ld
            r3.toArray(r2)     // Catch: java.lang.Throwable -> Ld
            java.util.ArrayList<com.bytedance.pangle.LocalBroadcastManager$j> r3 = r10.mPendingBroadcasts     // Catch: java.lang.Throwable -> Ld
            r3.clear()     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            r0 = 0
            r3 = 0
        L1e:
            if (r3 >= r1) goto L0
            r4 = r2[r3]
            java.util.ArrayList<com.bytedance.pangle.LocalBroadcastManager$xt> r5 = r4.xt
            int r5 = r5.size()
            r6 = 0
        L29:
            if (r6 >= r5) goto L43
            java.util.ArrayList<com.bytedance.pangle.LocalBroadcastManager$xt> r7 = r4.xt
            java.lang.Object r7 = r7.get(r6)
            com.bytedance.pangle.LocalBroadcastManager$xt r7 = (com.bytedance.pangle.LocalBroadcastManager.xt) r7
            boolean r8 = r7.r
            if (r8 != 0) goto L40
            com.bytedance.pangle.receiver.PluginBroadcastReceiver r7 = r7.xt
            android.content.Context r8 = r10.mAppContext
            android.content.Intent r9 = r4.j
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

    public void registerReceiver(com.bytedance.pangle.receiver.PluginBroadcastReceiver r7, android.content.IntentFilter r8) {
            r6 = this;
            java.util.HashMap<com.bytedance.pangle.receiver.PluginBroadcastReceiver, java.util.ArrayList<com.bytedance.pangle.LocalBroadcastManager$xt>> r0 = r6.mReceivers
            monitor-enter(r0)
            com.bytedance.pangle.LocalBroadcastManager$xt r1 = new com.bytedance.pangle.LocalBroadcastManager$xt     // Catch: java.lang.Throwable -> L1e
            r1.<init>(r8, r7)     // Catch: java.lang.Throwable -> L1e
            java.util.HashMap<com.bytedance.pangle.receiver.PluginBroadcastReceiver, java.util.ArrayList<com.bytedance.pangle.LocalBroadcastManager$xt>> r2 = r6.mReceivers     // Catch: java.lang.Throwable -> L1e
            java.lang.Object r2 = r2.get(r7)     // Catch: java.lang.Throwable -> L1e
            java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch: java.lang.Throwable -> L1e
            r3 = 1
            if (r2 != 0) goto L20
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L1e
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L1e
            java.util.HashMap<com.bytedance.pangle.receiver.PluginBroadcastReceiver, java.util.ArrayList<com.bytedance.pangle.LocalBroadcastManager$xt>> r4 = r6.mReceivers     // Catch: java.lang.Throwable -> L1e
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
            java.util.HashMap<java.lang.String, java.util.ArrayList<com.bytedance.pangle.LocalBroadcastManager$xt>> r4 = r6.mActions     // Catch: java.lang.Throwable -> L1e
            java.lang.Object r4 = r4.get(r2)     // Catch: java.lang.Throwable -> L1e
            java.util.ArrayList r4 = (java.util.ArrayList) r4     // Catch: java.lang.Throwable -> L1e
            if (r4 != 0) goto L42
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L1e
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L1e
            java.util.HashMap<java.lang.String, java.util.ArrayList<com.bytedance.pangle.LocalBroadcastManager$xt>> r5 = r6.mActions     // Catch: java.lang.Throwable -> L1e
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

    public boolean sendBroadcast(android.content.Intent r19) {
            r18 = this;
            r1 = r18
            r0 = r19
            java.util.HashMap<com.bytedance.pangle.receiver.PluginBroadcastReceiver, java.util.ArrayList<com.bytedance.pangle.LocalBroadcastManager$xt>> r2 = r1.mReceivers
            monitor-enter(r2)
            java.lang.String r4 = r0.getAction()     // Catch: java.lang.Throwable -> L52
            android.content.Context r3 = r1.mAppContext     // Catch: java.lang.Throwable -> L52
            android.content.ContentResolver r3 = r3.getContentResolver()     // Catch: java.lang.Throwable -> L52
            java.lang.String r5 = r0.resolveTypeIfNeeded(r3)     // Catch: java.lang.Throwable -> L52
            android.net.Uri r7 = r0.getData()     // Catch: java.lang.Throwable -> L52
            java.lang.String r6 = r0.getScheme()     // Catch: java.lang.Throwable -> L52
            java.util.Set r8 = r0.getCategories()     // Catch: java.lang.Throwable -> L52
            int r3 = r0.getFlags()     // Catch: java.lang.Throwable -> L52
            r3 = r3 & 8
            if (r3 == 0) goto L2b
            r12 = 1
            goto L2c
        L2b:
            r12 = 0
        L2c:
            if (r12 == 0) goto L55
            java.lang.String r3 = "LocalBroadcastManager"
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L52
            java.lang.String r13 = "Resolving type "
            r9.<init>(r13)     // Catch: java.lang.Throwable -> L52
            r9.append(r5)     // Catch: java.lang.Throwable -> L52
            java.lang.String r13 = " scheme "
            r9.append(r13)     // Catch: java.lang.Throwable -> L52
            r9.append(r6)     // Catch: java.lang.Throwable -> L52
            java.lang.String r13 = " of intent "
            r9.append(r13)     // Catch: java.lang.Throwable -> L52
            r9.append(r0)     // Catch: java.lang.Throwable -> L52
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> L52
            com.bytedance.sdk.openadsdk.api.m.j(r3, r9)     // Catch: java.lang.Throwable -> L52
            goto L55
        L52:
            r0 = move-exception
            goto L145
        L55:
            java.util.HashMap<java.lang.String, java.util.ArrayList<com.bytedance.pangle.LocalBroadcastManager$xt>> r3 = r1.mActions     // Catch: java.lang.Throwable -> L52
            java.lang.String r9 = r0.getAction()     // Catch: java.lang.Throwable -> L52
            java.lang.Object r3 = r3.get(r9)     // Catch: java.lang.Throwable -> L52
            r13 = r3
            java.util.ArrayList r13 = (java.util.ArrayList) r13     // Catch: java.lang.Throwable -> L52
            if (r13 == 0) goto L141
            if (r12 == 0) goto L75
            java.lang.String r3 = "LocalBroadcastManager"
            java.lang.String r9 = "Action list: "
            java.lang.String r14 = java.lang.String.valueOf(r13)     // Catch: java.lang.Throwable -> L52
            java.lang.String r9 = r9.concat(r14)     // Catch: java.lang.Throwable -> L52
            com.bytedance.sdk.openadsdk.api.m.j(r3, r9)     // Catch: java.lang.Throwable -> L52
        L75:
            r3 = 0
            r14 = r3
            r15 = 0
        L78:
            int r3 = r13.size()     // Catch: java.lang.Throwable -> L52
            if (r15 >= r3) goto L112
            java.lang.Object r3 = r13.get(r15)     // Catch: java.lang.Throwable -> L52
            com.bytedance.pangle.LocalBroadcastManager$xt r3 = (com.bytedance.pangle.LocalBroadcastManager.xt) r3     // Catch: java.lang.Throwable -> L52
            if (r12 == 0) goto L9b
            java.lang.String r9 = "LocalBroadcastManager"
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L52
            java.lang.String r11 = "Matching against filter "
            r10.<init>(r11)     // Catch: java.lang.Throwable -> L52
            android.content.IntentFilter r11 = r3.j     // Catch: java.lang.Throwable -> L52
            r10.append(r11)     // Catch: java.lang.Throwable -> L52
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> L52
            com.bytedance.sdk.openadsdk.api.m.j(r9, r10)     // Catch: java.lang.Throwable -> L52
        L9b:
            boolean r9 = r3.cw     // Catch: java.lang.Throwable -> L52
            if (r9 == 0) goto Lab
            if (r12 == 0) goto La8
            java.lang.String r3 = "LocalBroadcastManager"
            java.lang.String r9 = "  Filter's target already added"
            com.bytedance.sdk.openadsdk.api.m.j(r3, r9)     // Catch: java.lang.Throwable -> L52
        La8:
            r17 = r4
            goto L10c
        Lab:
            r9 = r3
            android.content.IntentFilter r3 = r9.j     // Catch: java.lang.Throwable -> L52
            r10 = r9
            java.lang.String r9 = "LocalBroadcastManager"
            int r3 = r3.match(r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L52
            if (r3 < 0) goto Le3
            if (r12 == 0) goto Ld3
            java.lang.String r9 = "LocalBroadcastManager"
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L52
            r17 = r4
            java.lang.String r4 = "  Filter matched!  match=0x"
            r11.<init>(r4)     // Catch: java.lang.Throwable -> L52
            java.lang.String r3 = java.lang.Integer.toHexString(r3)     // Catch: java.lang.Throwable -> L52
            r11.append(r3)     // Catch: java.lang.Throwable -> L52
            java.lang.String r3 = r11.toString()     // Catch: java.lang.Throwable -> L52
            com.bytedance.sdk.openadsdk.api.m.j(r9, r3)     // Catch: java.lang.Throwable -> L52
            goto Ld5
        Ld3:
            r17 = r4
        Ld5:
            if (r14 != 0) goto Ldc
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L52
            r14.<init>()     // Catch: java.lang.Throwable -> L52
        Ldc:
            r14.add(r10)     // Catch: java.lang.Throwable -> L52
            r3 = 1
            r10.cw = r3     // Catch: java.lang.Throwable -> L52
            goto L10c
        Le3:
            r17 = r4
            if (r12 == 0) goto L10c
            r4 = -4
            if (r3 == r4) goto Lff
            r4 = -3
            if (r3 == r4) goto Lfc
            r4 = -2
            if (r3 == r4) goto Lf9
            r4 = -1
            if (r3 == r4) goto Lf6
            java.lang.String r3 = "unknown reason"
            goto L101
        Lf6:
            java.lang.String r3 = "type"
            goto L101
        Lf9:
            java.lang.String r3 = "data"
            goto L101
        Lfc:
            java.lang.String r3 = "action"
            goto L101
        Lff:
            java.lang.String r3 = "category"
        L101:
            java.lang.String r4 = "LocalBroadcastManager"
            java.lang.String r9 = "  Filter did not match: "
            java.lang.String r3 = r9.concat(r3)     // Catch: java.lang.Throwable -> L52
            com.bytedance.sdk.openadsdk.api.m.j(r4, r3)     // Catch: java.lang.Throwable -> L52
        L10c:
            int r15 = r15 + 1
            r4 = r17
            goto L78
        L112:
            if (r14 == 0) goto L141
            r3 = 0
        L115:
            int r4 = r14.size()     // Catch: java.lang.Throwable -> L52
            if (r3 >= r4) goto L127
            java.lang.Object r4 = r14.get(r3)     // Catch: java.lang.Throwable -> L52
            com.bytedance.pangle.LocalBroadcastManager$xt r4 = (com.bytedance.pangle.LocalBroadcastManager.xt) r4     // Catch: java.lang.Throwable -> L52
            r5 = 0
            r4.cw = r5     // Catch: java.lang.Throwable -> L52
            int r3 = r3 + 1
            goto L115
        L127:
            java.util.ArrayList<com.bytedance.pangle.LocalBroadcastManager$j> r3 = r1.mPendingBroadcasts     // Catch: java.lang.Throwable -> L52
            com.bytedance.pangle.LocalBroadcastManager$j r4 = new com.bytedance.pangle.LocalBroadcastManager$j     // Catch: java.lang.Throwable -> L52
            r4.<init>(r0, r14)     // Catch: java.lang.Throwable -> L52
            r3.add(r4)     // Catch: java.lang.Throwable -> L52
            android.os.Handler r0 = r1.mHandler     // Catch: java.lang.Throwable -> L52
            r3 = 1
            boolean r0 = r0.hasMessages(r3)     // Catch: java.lang.Throwable -> L52
            if (r0 != 0) goto L13f
            android.os.Handler r0 = r1.mHandler     // Catch: java.lang.Throwable -> L52
            r0.sendEmptyMessage(r3)     // Catch: java.lang.Throwable -> L52
        L13f:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L52
            return r3
        L141:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L52
            r16 = 0
            return r16
        L145:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L52
            throw r0
    }

    public void sendBroadcastSync(android.content.Intent r1) {
            r0 = this;
            boolean r1 = r0.sendBroadcast(r1)
            if (r1 == 0) goto L9
            r0.executePendingBroadcasts()
        L9:
            return
    }

    public void unregisterReceiver(com.bytedance.pangle.receiver.PluginBroadcastReceiver r12) {
            r11 = this;
            java.util.HashMap<com.bytedance.pangle.receiver.PluginBroadcastReceiver, java.util.ArrayList<com.bytedance.pangle.LocalBroadcastManager$xt>> r0 = r11.mReceivers
            monitor-enter(r0)
            java.util.HashMap<com.bytedance.pangle.receiver.PluginBroadcastReceiver, java.util.ArrayList<com.bytedance.pangle.LocalBroadcastManager$xt>> r1 = r11.mReceivers     // Catch: java.lang.Throwable -> Lf
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
            com.bytedance.pangle.LocalBroadcastManager$xt r4 = (com.bytedance.pangle.LocalBroadcastManager.xt) r4     // Catch: java.lang.Throwable -> Lf
            r4.r = r3     // Catch: java.lang.Throwable -> Lf
            r5 = 0
        L22:
            android.content.IntentFilter r6 = r4.j     // Catch: java.lang.Throwable -> Lf
            int r6 = r6.countActions()     // Catch: java.lang.Throwable -> Lf
            if (r5 >= r6) goto L61
            android.content.IntentFilter r6 = r4.j     // Catch: java.lang.Throwable -> Lf
            java.lang.String r6 = r6.getAction(r5)     // Catch: java.lang.Throwable -> Lf
            java.util.HashMap<java.lang.String, java.util.ArrayList<com.bytedance.pangle.LocalBroadcastManager$xt>> r7 = r11.mActions     // Catch: java.lang.Throwable -> Lf
            java.lang.Object r7 = r7.get(r6)     // Catch: java.lang.Throwable -> Lf
            java.util.ArrayList r7 = (java.util.ArrayList) r7     // Catch: java.lang.Throwable -> Lf
            if (r7 == 0) goto L5e
            int r8 = r7.size()     // Catch: java.lang.Throwable -> Lf
            int r8 = r8 - r3
        L3f:
            if (r8 < 0) goto L53
            java.lang.Object r9 = r7.get(r8)     // Catch: java.lang.Throwable -> Lf
            com.bytedance.pangle.LocalBroadcastManager$xt r9 = (com.bytedance.pangle.LocalBroadcastManager.xt) r9     // Catch: java.lang.Throwable -> Lf
            com.bytedance.pangle.receiver.PluginBroadcastReceiver r10 = r9.xt     // Catch: java.lang.Throwable -> Lf
            if (r10 != r12) goto L50
            r9.r = r3     // Catch: java.lang.Throwable -> Lf
            r7.remove(r8)     // Catch: java.lang.Throwable -> Lf
        L50:
            int r8 = r8 + (-1)
            goto L3f
        L53:
            int r7 = r7.size()     // Catch: java.lang.Throwable -> Lf
            if (r7 > 0) goto L5e
            java.util.HashMap<java.lang.String, java.util.ArrayList<com.bytedance.pangle.LocalBroadcastManager$xt>> r7 = r11.mActions     // Catch: java.lang.Throwable -> Lf
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

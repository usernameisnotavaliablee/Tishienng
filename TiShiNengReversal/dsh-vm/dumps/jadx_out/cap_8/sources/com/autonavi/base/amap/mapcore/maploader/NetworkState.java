package com.autonavi.base.amap.mapcore.maploader;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class NetworkState {
    private boolean isNetReceiverRegistered;
    private com.autonavi.base.amap.mapcore.maploader.NetworkState.NetworkChangeListener mNetworkListener;
    private com.autonavi.base.amap.mapcore.maploader.NetworkState.MyBroadcastReceiver netChangeReceiver;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class MyBroadcastReceiver extends android.content.BroadcastReceiver {
        java.lang.ref.WeakReference<com.autonavi.base.amap.mapcore.maploader.NetworkState.NetworkChangeListener> reference;

        public MyBroadcastReceiver(com.autonavi.base.amap.mapcore.maploader.NetworkState.NetworkChangeListener r2) {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.reference = r0
                java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                r0.<init>(r2)
                r1.reference = r0
                return
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context r1, android.content.Intent r2) {
                r0 = this;
                java.lang.ref.WeakReference<com.autonavi.base.amap.mapcore.maploader.NetworkState$NetworkChangeListener> r2 = r0.reference
                if (r2 == 0) goto L15
                java.lang.Object r2 = r2.get()
                if (r2 == 0) goto L15
                java.lang.ref.WeakReference<com.autonavi.base.amap.mapcore.maploader.NetworkState$NetworkChangeListener> r2 = r0.reference
                java.lang.Object r2 = r2.get()
                com.autonavi.base.amap.mapcore.maploader.NetworkState$NetworkChangeListener r2 = (com.autonavi.base.amap.mapcore.maploader.NetworkState.NetworkChangeListener) r2
                r2.networkStateChanged(r1)
            L15:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface NetworkChangeListener {
        void networkStateChanged(android.content.Context r1);
    }

    public NetworkState() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.isNetReceiverRegistered = r0
            r0 = 0
            r1.netChangeReceiver = r0
            return
    }

    public static android.net.NetworkInfo getActiveNetworkInfo(android.content.Context r4) {
            r0 = 0
            java.lang.String r1 = "connectivity"
            java.lang.Object r4 = r4.getSystemService(r1)     // Catch: java.lang.Exception -> L35
            android.net.ConnectivityManager r4 = (android.net.ConnectivityManager) r4     // Catch: java.lang.Exception -> L35
            if (r4 != 0) goto Lc
            return r0
        Lc:
            android.net.NetworkInfo r1 = r4.getActiveNetworkInfo()     // Catch: java.lang.Exception -> L35
            if (r1 == 0) goto L19
            boolean r2 = r1.isConnected()     // Catch: java.lang.Exception -> L35
            if (r2 == 0) goto L19
            return r1
        L19:
            android.net.NetworkInfo[] r4 = r4.getAllNetworkInfo()     // Catch: java.lang.Exception -> L35
            if (r4 != 0) goto L20
            return r0
        L20:
            r2 = 0
        L21:
            int r3 = r4.length     // Catch: java.lang.Exception -> L35
            if (r2 >= r3) goto L34
            r3 = r4[r2]     // Catch: java.lang.Exception -> L35
            if (r3 == 0) goto L31
            boolean r3 = r3.isConnected()     // Catch: java.lang.Exception -> L35
            if (r3 == 0) goto L31
            r4 = r4[r2]     // Catch: java.lang.Exception -> L35
            return r4
        L31:
            int r2 = r2 + 1
            goto L21
        L34:
            return r1
        L35:
            return r0
    }

    public static boolean isNetworkConnected(android.content.Context r0) {
            android.net.NetworkInfo r0 = getActiveNetworkInfo(r0)
            if (r0 == 0) goto Le
            boolean r0 = r0.isConnected()
            if (r0 == 0) goto Le
            r0 = 1
            return r0
        Le:
            r0 = 0
            return r0
    }

    public void registerNetChangeReceiver(android.content.Context r4, boolean r5) {
            r3 = this;
            if (r5 == 0) goto L23
            boolean r0 = r3.isNetReceiverRegistered
            if (r0 != 0) goto L31
            android.content.IntentFilter r0 = new android.content.IntentFilter
            r0.<init>()
            java.lang.String r1 = "android.net.conn.CONNECTIVITY_CHANGE"
            r0.addAction(r1)
            com.autonavi.base.amap.mapcore.maploader.NetworkState$MyBroadcastReceiver r1 = r3.netChangeReceiver
            if (r1 != 0) goto L1d
            com.autonavi.base.amap.mapcore.maploader.NetworkState$MyBroadcastReceiver r1 = new com.autonavi.base.amap.mapcore.maploader.NetworkState$MyBroadcastReceiver
            com.autonavi.base.amap.mapcore.maploader.NetworkState$NetworkChangeListener r2 = r3.mNetworkListener
            r1.<init>(r2)
            r3.netChangeReceiver = r1
        L1d:
            com.autonavi.base.amap.mapcore.maploader.NetworkState$MyBroadcastReceiver r1 = r3.netChangeReceiver
            r4.registerReceiver(r1, r0)
            goto L31
        L23:
            boolean r0 = r3.isNetReceiverRegistered
            if (r0 == 0) goto L31
            com.autonavi.base.amap.mapcore.maploader.NetworkState$MyBroadcastReceiver r0 = r3.netChangeReceiver
            if (r0 == 0) goto L31
            r4.unregisterReceiver(r0)
            r4 = 0
            r3.netChangeReceiver = r4
        L31:
            r3.isNetReceiverRegistered = r5
            return
    }

    public void setNetworkListener(com.autonavi.base.amap.mapcore.maploader.NetworkState.NetworkChangeListener r1) {
            r0 = this;
            r0.mNetworkListener = r1
            return
    }
}

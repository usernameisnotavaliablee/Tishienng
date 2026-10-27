package com.autonavi.base.ae.gmap;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class NetworkProxyManager {
    private static com.autonavi.base.ae.gmap.NetworkProxyManager sInstance;
    private java.util.Map<java.lang.Long, com.autonavi.base.amap.mapcore.maploader.AMapLoader> aMapLoaderHashtable;
    private android.content.Context context;
    private java.util.Map<java.lang.Long, com.autonavi.base.ae.gmap.GLMapEngine> engines;
    private boolean isNetworkConnected;
    private com.autonavi.base.amap.mapcore.maploader.NetworkState.NetworkChangeListener networkChangeListener;
    private com.autonavi.base.ae.gmap.NetworkProxy networkProxy;
    private com.autonavi.base.amap.mapcore.maploader.NetworkState networkState;
    private java.lang.String userAgent;



    private NetworkProxyManager() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.isNetworkConnected = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.aMapLoaderHashtable = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.engines = r0
            com.autonavi.base.ae.gmap.NetworkProxyManager$1 r0 = new com.autonavi.base.ae.gmap.NetworkProxyManager$1
            r0.<init>(r1)
            r1.networkChangeListener = r0
            return
    }

    static /* synthetic */ boolean access$000(com.autonavi.base.ae.gmap.NetworkProxyManager r0) {
            boolean r0 = r0.isNetworkConnected
            return r0
    }

    static /* synthetic */ boolean access$002(com.autonavi.base.ae.gmap.NetworkProxyManager r0, boolean r1) {
            r0.isNetworkConnected = r1
            return r1
    }

    static /* synthetic */ java.util.Map access$100(com.autonavi.base.ae.gmap.NetworkProxyManager r0) {
            java.util.Map<java.lang.Long, com.autonavi.base.ae.gmap.GLMapEngine> r0 = r0.engines
            return r0
    }

    private synchronized void cancelAllAMapDownload() {
            r2 = this;
            monitor-enter(r2)
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap     // Catch: java.lang.Throwable -> L28
            java.util.Map<java.lang.Long, com.autonavi.base.amap.mapcore.maploader.AMapLoader> r1 = r2.aMapLoaderHashtable     // Catch: java.lang.Throwable -> L28
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L28
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L28
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L28
        L10:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L28
            if (r1 == 0) goto L26
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L28
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> L28
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L28
            com.autonavi.base.amap.mapcore.maploader.AMapLoader r1 = (com.autonavi.base.amap.mapcore.maploader.AMapLoader) r1     // Catch: java.lang.Throwable -> L28
            r1.doCancelAndNotify()     // Catch: java.lang.Throwable -> L28
            goto L10
        L26:
            monitor-exit(r2)
            return
        L28:
            monitor-exit(r2)
            return
    }

    public static com.autonavi.base.ae.gmap.NetworkProxyManager getInstance() {
            com.autonavi.base.ae.gmap.NetworkProxyManager r0 = com.autonavi.base.ae.gmap.NetworkProxyManager.sInstance
            if (r0 != 0) goto Lb
            com.autonavi.base.ae.gmap.NetworkProxyManager r0 = new com.autonavi.base.ae.gmap.NetworkProxyManager
            r0.<init>()
            com.autonavi.base.ae.gmap.NetworkProxyManager.sInstance = r0
        Lb:
            com.autonavi.base.ae.gmap.NetworkProxyManager r0 = com.autonavi.base.ae.gmap.NetworkProxyManager.sInstance
            return r0
    }

    private void initNetworkState() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "http.agent"
            java.lang.String r1 = java.lang.System.getProperty(r1)
            r0.append(r1)
            java.lang.String r1 = " amap/"
            r0.append(r1)
            android.content.Context r1 = r3.context
            java.lang.String r1 = com.autonavi.amap.mapcore.tools.GlMapUtil.getAppVersionName(r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.userAgent = r0
            com.autonavi.base.amap.mapcore.maploader.NetworkState r0 = new com.autonavi.base.amap.mapcore.maploader.NetworkState
            r0.<init>()
            r3.networkState = r0
            com.autonavi.base.amap.mapcore.maploader.NetworkState$NetworkChangeListener r1 = r3.networkChangeListener
            r0.setNetworkListener(r1)
            com.autonavi.base.amap.mapcore.maploader.NetworkState r0 = r3.networkState
            android.content.Context r1 = r3.context
            android.content.Context r1 = r1.getApplicationContext()
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)
            r2 = 1
            r0.registerNetChangeReceiver(r1, r2)
            android.content.Context r0 = r3.context
            android.content.Context r0 = r0.getApplicationContext()
            android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)
            boolean r0 = com.autonavi.base.amap.mapcore.maploader.NetworkState.isNetworkConnected(r0)
            r3.isNetworkConnected = r0
            return
    }

    private static native void nativeCancelDownLoad(long r0);

    private static native long nativeCreateNetworkProxy(java.lang.Object r0);

    private static native void nativeDestroyNetworkProxy(long r0);

    private static native void nativeFailedDownLoad(long r0, int r2);

    private static native void nativeFinishDownLoad(long r0);

    private static native void nativeInitNetworkProxy(long r0);

    private static native void nativeReceiveNetData(byte[] r0, long r1, int r3);

    private void releaseNetworkState() {
            r3 = this;
            com.autonavi.base.amap.mapcore.maploader.NetworkState r0 = r3.networkState
            if (r0 == 0) goto L1a
            android.content.Context r1 = r3.context
            android.content.Context r1 = r1.getApplicationContext()
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)
            r2 = 0
            r0.registerNetChangeReceiver(r1, r2)
            com.autonavi.base.amap.mapcore.maploader.NetworkState r0 = r3.networkState
            r1 = 0
            r0.setNetworkListener(r1)
            r3.networkState = r1
        L1a:
            return
    }

    public com.autonavi.base.ae.gmap.NetworkProxy createNetworkProxy() {
            r3 = this;
            long r0 = nativeCreateNetworkProxy(r3)
            com.autonavi.base.ae.gmap.NetworkProxy r2 = new com.autonavi.base.ae.gmap.NetworkProxy
            r2.<init>(r0)
            return r2
    }

    public void destroy() {
            r2 = this;
            com.autonavi.base.ae.gmap.NetworkProxy r0 = r2.networkProxy
            r1 = 0
            if (r0 == 0) goto La
            r2.destroyNetworkProxy(r0)
            r2.networkProxy = r1
        La:
            r2.releaseNetworkState()
            r2.context = r1
            return
    }

    public void destroyNetworkProxy(com.autonavi.base.ae.gmap.NetworkProxy r3) {
            r2 = this;
            long r0 = r3.networkProxyInstance
            nativeDestroyNetworkProxy(r0)
            return
    }

    public synchronized void finishDownLoad(long r3) {
            r2 = this;
            monitor-enter(r2)
            java.util.Map<java.lang.Long, com.autonavi.base.amap.mapcore.maploader.AMapLoader> r0 = r2.aMapLoaderHashtable     // Catch: java.lang.Throwable -> L1d
            java.lang.Long r1 = java.lang.Long.valueOf(r3)     // Catch: java.lang.Throwable -> L1d
            boolean r0 = r0.containsKey(r1)     // Catch: java.lang.Throwable -> L1d
            if (r0 != 0) goto Lf
            monitor-exit(r2)
            return
        Lf:
            nativeFinishDownLoad(r3)     // Catch: java.lang.Throwable -> L1d
            java.util.Map<java.lang.Long, com.autonavi.base.amap.mapcore.maploader.AMapLoader> r0 = r2.aMapLoaderHashtable     // Catch: java.lang.Throwable -> L1d
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch: java.lang.Throwable -> L1d
            r0.remove(r3)     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r2)
            return
        L1d:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1d
            throw r3
    }

    public java.lang.String getUserAgent() {
            r1 = this;
            java.lang.String r0 = r1.userAgent
            return r0
    }

    public void init() {
            r1 = this;
            com.autonavi.base.ae.gmap.NetworkProxy r0 = r1.createNetworkProxy()
            r1.networkProxy = r0
            r1.initNetworkProxy(r0)
            r1.initNetworkState()
            return
    }

    public void initContext(android.content.Context r1) {
            r0 = this;
            if (r1 != 0) goto L3
            return
        L3:
            android.content.Context r1 = r1.getApplicationContext()
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)
            r0.context = r1
            return
    }

    public void initNetworkProxy(com.autonavi.base.ae.gmap.NetworkProxy r3) {
            r2 = this;
            long r0 = r3.networkProxyInstance
            nativeInitNetworkProxy(r0)
            return
    }

    public boolean isNetworkConnected() {
            r1 = this;
            boolean r0 = r1.isNetworkConnected
            return r0
    }

    public boolean isReady() {
            r1 = this;
            android.content.Context r0 = r1.context
            if (r0 == 0) goto Le
            com.autonavi.base.ae.gmap.NetworkProxy r0 = r1.networkProxy
            if (r0 == 0) goto Le
            com.autonavi.base.amap.mapcore.maploader.NetworkState r0 = r1.networkState
            if (r0 == 0) goto Le
            r0 = 1
            return r0
        Le:
            r0 = 0
            return r0
    }

    public synchronized void netCancel(long r2, int r4) {
            r1 = this;
            monitor-enter(r1)
            java.util.Map<java.lang.Long, com.autonavi.base.amap.mapcore.maploader.AMapLoader> r4 = r1.aMapLoaderHashtable     // Catch: java.lang.Throwable -> L1e
            java.lang.Long r0 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> L1e
            boolean r4 = r4.containsKey(r0)     // Catch: java.lang.Throwable -> L1e
            if (r4 != 0) goto Lf
            monitor-exit(r1)
            return
        Lf:
            r4 = -1
            nativeFailedDownLoad(r2, r4)     // Catch: java.lang.Throwable -> L1e
            java.util.Map<java.lang.Long, com.autonavi.base.amap.mapcore.maploader.AMapLoader> r4 = r1.aMapLoaderHashtable     // Catch: java.lang.Throwable -> L1e
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> L1e
            r4.remove(r2)     // Catch: java.lang.Throwable -> L1e
            monitor-exit(r1)
            return
        L1e:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1e
            throw r2
    }

    public synchronized void netError(long r3, int r5, int r6) {
            r2 = this;
            monitor-enter(r2)
            java.util.Map<java.lang.Long, com.autonavi.base.amap.mapcore.maploader.AMapLoader> r0 = r2.aMapLoaderHashtable     // Catch: java.lang.Throwable -> L2c
            java.lang.Long r1 = java.lang.Long.valueOf(r3)     // Catch: java.lang.Throwable -> L2c
            boolean r0 = r0.containsKey(r1)     // Catch: java.lang.Throwable -> L2c
            if (r0 != 0) goto Lf
            monitor-exit(r2)
            return
        Lf:
            nativeFailedDownLoad(r3, r6)     // Catch: java.lang.Throwable -> L2c
            java.util.Map<java.lang.Long, com.autonavi.base.amap.mapcore.maploader.AMapLoader> r0 = r2.aMapLoaderHashtable     // Catch: java.lang.Throwable -> L2c
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch: java.lang.Throwable -> L2c
            r0.remove(r3)     // Catch: java.lang.Throwable -> L2c
            com.amap.api.maps.ExceptionLogger r3 = com.amap.api.maps.MapsInitializer.getExceptionLogger()     // Catch: java.lang.Throwable -> L2a
            if (r3 == 0) goto L28
            com.amap.api.maps.ExceptionLogger r3 = com.amap.api.maps.MapsInitializer.getExceptionLogger()     // Catch: java.lang.Throwable -> L2a
            r3.onDownloaderException(r5, r6)     // Catch: java.lang.Throwable -> L2a
        L28:
            monitor-exit(r2)
            return
        L2a:
            monitor-exit(r2)
            return
        L2c:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2c
            throw r3
    }

    public synchronized void netStop(long r2, int r4) {
            r1 = this;
            monitor-enter(r1)
            java.util.Map<java.lang.Long, com.autonavi.base.amap.mapcore.maploader.AMapLoader> r4 = r1.aMapLoaderHashtable     // Catch: java.lang.Throwable -> L1e
            java.lang.Long r0 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> L1e
            boolean r4 = r4.containsKey(r0)     // Catch: java.lang.Throwable -> L1e
            if (r4 != 0) goto Lf
            monitor-exit(r1)
            return
        Lf:
            r4 = -1
            nativeFailedDownLoad(r2, r4)     // Catch: java.lang.Throwable -> L1e
            java.util.Map<java.lang.Long, com.autonavi.base.amap.mapcore.maploader.AMapLoader> r4 = r1.aMapLoaderHashtable     // Catch: java.lang.Throwable -> L1e
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> L1e
            r4.remove(r2)     // Catch: java.lang.Throwable -> L1e
            monitor-exit(r1)
            return
        L1e:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1e
            throw r2
    }

    public void notifyMapEngineCreated(long r2, com.autonavi.base.ae.gmap.GLMapEngine r4) {
            r1 = this;
            java.util.Map<java.lang.Long, com.autonavi.base.ae.gmap.GLMapEngine> r0 = r1.engines
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r0.put(r2, r4)
            return
    }

    public void notifyMapEngineDestroyed(long r2) {
            r1 = this;
            java.util.Map<java.lang.Long, com.autonavi.base.ae.gmap.GLMapEngine> r0 = r1.engines
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r0.remove(r2)
            r1.cancelAllAMapDownload()
            return
    }

    public synchronized void receiveNetData(long r3, byte[] r5, int r6) {
            r2 = this;
            monitor-enter(r2)
            java.util.Map<java.lang.Long, com.autonavi.base.amap.mapcore.maploader.AMapLoader> r0 = r2.aMapLoaderHashtable     // Catch: java.lang.Throwable -> L14
            java.lang.Long r1 = java.lang.Long.valueOf(r3)     // Catch: java.lang.Throwable -> L14
            boolean r0 = r0.containsKey(r1)     // Catch: java.lang.Throwable -> L14
            if (r0 != 0) goto Lf
            monitor-exit(r2)
            return
        Lf:
            nativeReceiveNetData(r5, r3, r6)     // Catch: java.lang.Throwable -> L14
            monitor-exit(r2)
            return
        L14:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L14
            throw r3
    }

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    public synchronized int requireMapDataAsyn(int r5, byte[] r6) {
            r4 = this;
            monitor-enter(r4)
            r5 = 0
            if (r6 == 0) goto L74
            com.autonavi.base.amap.mapcore.maploader.AMapLoader$ADataRequestParam r0 = new com.autonavi.base.amap.mapcore.maploader.AMapLoader$ADataRequestParam     // Catch: java.lang.Throwable -> L71
            r0.<init>()     // Catch: java.lang.Throwable -> L71
            int r1 = com.autonavi.base.amap.mapcore.tools.GLConvertUtil.getInt(r6, r5)     // Catch: java.lang.Throwable -> L71
            r2 = 4
            java.lang.String r2 = com.autonavi.base.amap.mapcore.tools.GLConvertUtil.getString(r6, r2, r1)     // Catch: java.lang.Throwable -> L71
            r0.requestBaseUrl = r2     // Catch: java.lang.Throwable -> L71
            int r2 = r1 + 4
            int r2 = com.autonavi.base.amap.mapcore.tools.GLConvertUtil.getInt(r6, r2)     // Catch: java.lang.Throwable -> L71
            int r1 = r1 + 8
            java.lang.String r3 = com.autonavi.base.amap.mapcore.tools.GLConvertUtil.getString(r6, r1, r2)     // Catch: java.lang.Throwable -> L71
            r0.requestUrl = r3     // Catch: java.lang.Throwable -> L71
            int r1 = r1 + r2
            long r2 = com.autonavi.base.amap.mapcore.tools.GLConvertUtil.getLong(r6, r1)     // Catch: java.lang.Throwable -> L71
            r0.handler = r2     // Catch: java.lang.Throwable -> L71
            int r2 = r1 + 8
            int r2 = com.autonavi.base.amap.mapcore.tools.GLConvertUtil.getInt(r6, r2)     // Catch: java.lang.Throwable -> L71
            r0.nRequestType = r2     // Catch: java.lang.Throwable -> L71
            int r2 = r1 + 12
            int r2 = com.autonavi.base.amap.mapcore.tools.GLConvertUtil.getInt(r6, r2)     // Catch: java.lang.Throwable -> L71
            int r1 = r1 + 16
            byte[] r3 = com.autonavi.base.amap.mapcore.tools.GLConvertUtil.getSubBytes(r6, r1, r2)     // Catch: java.lang.Throwable -> L71
            r0.enCodeString = r3     // Catch: java.lang.Throwable -> L71
            int r1 = r1 + r2
            int r6 = com.autonavi.base.amap.mapcore.tools.GLConvertUtil.getInt(r6, r1)     // Catch: java.lang.Throwable -> L71
            r0.nCompress = r6     // Catch: java.lang.Throwable -> L71
            com.autonavi.base.amap.mapcore.maploader.AMapLoader r6 = new com.autonavi.base.amap.mapcore.maploader.AMapLoader     // Catch: java.lang.Throwable -> L71
            android.content.Context r1 = r4.context     // Catch: java.lang.Throwable -> L71
            r6.<init>(r1, r0)     // Catch: java.lang.Throwable -> L71
            java.util.Map<java.lang.Long, com.autonavi.base.amap.mapcore.maploader.AMapLoader> r1 = r4.aMapLoaderHashtable     // Catch: java.lang.Throwable -> L71
            long r2 = r0.handler     // Catch: java.lang.Throwable -> L71
            java.lang.Long r0 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> L71
            r1.put(r0, r6)     // Catch: java.lang.Throwable -> L71
            com.amap.api.col.3l.z2 r0 = com.amap.api.col.p0003l.z2.a()     // Catch: java.lang.Throwable -> L65
            com.autonavi.base.ae.gmap.NetworkProxyManager$2 r1 = new com.autonavi.base.ae.gmap.NetworkProxyManager$2     // Catch: java.lang.Throwable -> L65
            r1.<init>(r4, r6)     // Catch: java.lang.Throwable -> L65
            r0.b(r1)     // Catch: java.lang.Throwable -> L65
            goto L74
        L65:
            r6 = move-exception
            java.lang.String r0 = "download Thread"
            java.lang.String r1 = "requireMapData"
            com.amap.api.col.p0003l.w5.p(r6, r0, r1)     // Catch: java.lang.Throwable -> L71
            com.amap.api.col.p0003l.b3.D(r6)     // Catch: java.lang.Throwable -> L71
            goto L74
        L71:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L71
            throw r5
        L74:
            monitor-exit(r4)
            return r5
    }
}

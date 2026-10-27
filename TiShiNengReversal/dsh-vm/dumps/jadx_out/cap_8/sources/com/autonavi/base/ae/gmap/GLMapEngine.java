package com.autonavi.base.ae.gmap;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class GLMapEngine implements com.autonavi.amap.api.mapcore.IGLMapEngine, com.autonavi.base.amap.mapcore.IAMapEngineCallback {
    com.autonavi.base.ae.gmap.gloverlay.GLOverlayBundle<com.autonavi.base.ae.gmap.gloverlay.BaseMapOverlay<?, ?>> bundle;
    private android.content.Context context;
    private com.autonavi.base.ae.gmap.GLMapState copyGLMapState;
    private boolean isEngineRenderComplete;
    boolean isGestureStep;
    boolean isMoveCameraStep;
    boolean isNetworkConnected;
    private final java.util.List<com.autonavi.amap.mapcore.AbstractCameraUpdateMessage> mAnimateStateMessageList;
    private int mEngineID;
    private java.util.List<com.autonavi.base.amap.mapcore.message.AbstractGestureMapMessage> mGestureEndMessageList;
    private final java.util.List<com.autonavi.base.amap.mapcore.message.AbstractGestureMapMessage> mGestureMessageList;
    private com.autonavi.base.amap.api.mapcore.IAMapDelegate mGlMapView;
    private java.util.concurrent.locks.Lock mLock;
    private com.autonavi.base.amap.mapcore.interfaces.IAMapListener mMapListener;
    private long mNativeMapengineInstance;
    private com.autonavi.base.amap.mapcore.maploader.NetworkState mNetworkState;
    boolean mRequestDestroy;
    private java.util.concurrent.atomic.AtomicInteger mRequestID;
    private final java.util.List<com.autonavi.amap.mapcore.AbstractCameraUpdateMessage> mStateMessageList;
    private com.autonavi.base.amap.mapcore.tools.TextTextureGenerator mTextTextureGenerator;
    private com.autonavi.base.ae.gmap.glanimation.AdglMapAnimationMgr mapAnimationMgr;
    private int mapGestureCount;
    private java.lang.Object mutLock;
    com.autonavi.base.ae.gmap.GLMapState state;
    private com.autonavi.base.ae.gmap.TerrainOverlayProvider terrainTileProvider;




    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class InitParam {
        public java.lang.String mConfigContent;
        public java.lang.String mConfigPath;
        public java.lang.String mIntersectionResPath;
        public java.lang.String mOfflineDataPath;
        public java.lang.String mP3dCrossPath;
        public java.lang.String mRootPath;

        public InitParam() {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = ""
                r1.mRootPath = r0
                r1.mConfigPath = r0
                r1.mConfigContent = r0
                r1.mOfflineDataPath = r0
                r1.mP3dCrossPath = r0
                r1.mIntersectionResPath = r0
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class MapViewInitParam {
        public int engineId;
        public int height;
        public float mapZoomScale;
        public int screenHeight;
        public float screenScale;
        public int screenWidth;
        public int taskThreadCount;
        public float textScale;
        public int width;
        public int x;
        public int y;

        public MapViewInitParam() {
                r1 = this;
                r1.<init>()
                r0 = 8
                r1.taskThreadCount = r0
                return
        }
    }

    public GLMapEngine(android.content.Context r4, com.autonavi.base.amap.api.mapcore.IAMapDelegate r5) {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.mNativeMapengineInstance = r0
            r0 = 0
            r3.mGlMapView = r0
            java.util.Vector r1 = new java.util.Vector
            r1.<init>()
            r3.mStateMessageList = r1
            java.util.Vector r1 = new java.util.Vector
            r1.<init>()
            r3.mGestureMessageList = r1
            java.util.Vector r1 = new java.util.Vector
            r1.<init>()
            r3.mGestureEndMessageList = r1
            java.util.Vector r1 = new java.util.Vector
            r1.<init>()
            r3.mAnimateStateMessageList = r1
            r1 = 0
            r3.isMoveCameraStep = r1
            r3.isGestureStep = r1
            r3.mapGestureCount = r1
            r3.mapAnimationMgr = r0
            r3.copyGLMapState = r0
            java.util.concurrent.locks.ReentrantLock r2 = new java.util.concurrent.locks.ReentrantLock
            r2.<init>()
            r3.mLock = r2
            java.lang.Object r2 = new java.lang.Object
            r2.<init>()
            r3.mutLock = r2
            r3.mNetworkState = r0
            r3.bundle = r0
            r3.isEngineRenderComplete = r1
            r3.mRequestDestroy = r1
            r3.isNetworkConnected = r1
            r3.terrainTileProvider = r0
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r2 = 1
            r0.<init>(r2)
            r3.mRequestID = r0
            r3.mRequestDestroy = r1
            if (r4 != 0) goto L58
            return
        L58:
            android.content.Context r4 = r4.getApplicationContext()
            android.content.Context r4 = com.stub.StubApp.getOrigApplicationContext(r4)
            r3.context = r4
            r3.mGlMapView = r5
            com.autonavi.base.amap.mapcore.tools.TextTextureGenerator r4 = new com.autonavi.base.amap.mapcore.tools.TextTextureGenerator
            r4.<init>()
            r3.mTextTextureGenerator = r4
            com.autonavi.base.ae.gmap.glanimation.AdglMapAnimationMgr r4 = new com.autonavi.base.ae.gmap.glanimation.AdglMapAnimationMgr
            r4.<init>()
            r3.mapAnimationMgr = r4
            com.autonavi.base.ae.gmap.GLMapEngine$3 r0 = new com.autonavi.base.ae.gmap.GLMapEngine$3
            r0.<init>(r3)
            r4.setMapAnimationListener(r0)
            com.autonavi.base.ae.gmap.TerrainOverlayProvider r4 = new com.autonavi.base.ae.gmap.TerrainOverlayProvider
            com.amap.api.maps.interfaces.IGlOverlayLayer r5 = r5.getGlOverlayLayer()
            r4.<init>(r5)
            r3.terrainTileProvider = r4
            com.autonavi.base.ae.gmap.GLEngineIDController r4 = com.autonavi.base.ae.gmap.GLEngineIDController.getController()
            int r4 = r4.generate()
            r3.mEngineID = r4
            return
    }

    static /* synthetic */ void access$000(com.autonavi.base.ae.gmap.GLMapEngine r0, com.amap.api.maps.AMap.CancelableCallback r1) {
            r0.doMapAnimationFinishCallback(r1)
            return
    }

    private float adapterDpiScale(android.util.DisplayMetrics r8, int r9, int r10, int r11) {
            r7 = this;
            java.lang.Class<android.util.DisplayMetrics> r0 = android.util.DisplayMetrics.class
            java.lang.String r1 = getEMUI()
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r1 == 0) goto L69
            boolean r3 = r1.isEmpty()
            if (r3 != 0) goto L69
            java.lang.String r3 = "EmotionUI_8"
            int r3 = r1.indexOf(r3)
            r4 = -1
            if (r3 != r4) goto L21
            java.lang.String r3 = "EmotionUI_9"
            int r1 = r1.indexOf(r3)
            if (r1 == r4) goto L69
        L21:
            if (r11 <= 0) goto L69
            r1 = 1
            r3 = 0
            java.lang.String r4 = "noncompatWidthPixels"
            java.lang.reflect.Field r4 = r0.getDeclaredField(r4)     // Catch: java.lang.Throwable -> L33
            r4.setAccessible(r1)     // Catch: java.lang.Throwable -> L33
            int r4 = r4.getInt(r8)     // Catch: java.lang.Throwable -> L33
            goto L34
        L33:
            r4 = 0
        L34:
            java.lang.String r5 = "noncompatHeightPixels"
            java.lang.reflect.Field r5 = r0.getDeclaredField(r5)     // Catch: java.lang.Throwable -> L42
            r5.setAccessible(r1)     // Catch: java.lang.Throwable -> L42
            int r5 = r5.getInt(r8)     // Catch: java.lang.Throwable -> L42
            goto L43
        L42:
            r5 = 0
        L43:
            java.lang.String r6 = "noncompatDensityDpi"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r6)     // Catch: java.lang.Throwable -> L51
            r0.setAccessible(r1)     // Catch: java.lang.Throwable -> L51
            int r3 = r0.getInt(r8)     // Catch: java.lang.Throwable -> L51
            goto L52
        L51:
        L52:
            if (r3 > r11) goto L58
            if (r4 > r9) goto L58
            if (r5 <= r10) goto L69
        L58:
            float r8 = (float) r3
            float r9 = (float) r11
            float r8 = r8 / r9
            r9 = 1073741824(0x40000000, float:2.0)
            int r10 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r10 <= 0) goto L63
            r8 = 1073741824(0x40000000, float:2.0)
        L63:
            int r9 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r9 >= 0) goto L68
            goto L69
        L68:
            r2 = r8
        L69:
            return r2
    }

    private void doMapAnimationCancelCallback(com.amap.api.maps.AMap.CancelableCallback r3) {
            r2 = this;
            if (r3 != 0) goto L3
            goto L13
        L3:
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r2.mGlMapView
            if (r0 == 0) goto L13
            android.os.Handler r0 = r0.getMainHandler()
            com.autonavi.base.ae.gmap.GLMapEngine$1 r1 = new com.autonavi.base.ae.gmap.GLMapEngine$1
            r1.<init>(r2, r3)
            r0.post(r1)
        L13:
            return
    }

    private void doMapAnimationFinishCallback(com.amap.api.maps.AMap.CancelableCallback r3) {
            r2 = this;
            com.autonavi.base.amap.mapcore.interfaces.IAMapListener r0 = r2.mMapListener
            if (r0 == 0) goto L7
            r0.afterAnimation()
        L7:
            if (r3 != 0) goto La
            goto L1a
        La:
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r2.mGlMapView
            if (r0 == 0) goto L1a
            android.os.Handler r0 = r0.getMainHandler()
            com.autonavi.base.ae.gmap.GLMapEngine$2 r1 = new com.autonavi.base.ae.gmap.GLMapEngine$2
            r1.<init>(r2, r3)
            r0.post(r1)
        L1a:
            return
    }

    private void gestureBegin() {
            r1 = this;
            int r0 = r1.mapGestureCount
            int r0 = r0 + 1
            r1.mapGestureCount = r0
            return
    }

    private void gestureEnd() {
            r1 = this;
            int r0 = r1.mapGestureCount
            int r0 = r0 + (-1)
            r1.mapGestureCount = r0
            if (r0 != 0) goto Lb
            r1.recycleMessage()
        Lb:
            return
    }

    private static java.lang.String getEMUI() {
            java.lang.String r0 = "android.os.SystemProperties"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L21
            java.lang.String r1 = "get"
            r2 = 1
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L21
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r5 = 0
            r3[r5] = r4     // Catch: java.lang.Exception -> L21
            java.lang.reflect.Method r1 = r0.getDeclaredMethod(r1, r3)     // Catch: java.lang.Exception -> L21
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L21
            java.lang.String r3 = "ro.build.version.emui"
            r2[r5] = r3     // Catch: java.lang.Exception -> L21
            java.lang.Object r0 = r1.invoke(r0, r2)     // Catch: java.lang.Exception -> L21
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L21
            return r0
        L21:
            r0 = 0
            return r0
    }

    private void initAnimation() {
            r3 = this;
            java.util.List<com.autonavi.amap.mapcore.AbstractCameraUpdateMessage> r0 = r3.mStateMessageList
            int r0 = r0.size()
            if (r0 <= 0) goto L9
            goto L27
        L9:
            java.util.List<com.autonavi.amap.mapcore.AbstractCameraUpdateMessage> r0 = r3.mAnimateStateMessageList
            monitor-enter(r0)
            java.util.List<com.autonavi.amap.mapcore.AbstractCameraUpdateMessage> r1 = r3.mAnimateStateMessageList     // Catch: java.lang.Throwable -> L1e
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L1e
            if (r1 <= 0) goto L20
            java.util.List<com.autonavi.amap.mapcore.AbstractCameraUpdateMessage> r1 = r3.mAnimateStateMessageList     // Catch: java.lang.Throwable -> L1e
            r2 = 0
            java.lang.Object r1 = r1.remove(r2)     // Catch: java.lang.Throwable -> L1e
            com.autonavi.amap.mapcore.AbstractCameraUpdateMessage r1 = (com.autonavi.amap.mapcore.AbstractCameraUpdateMessage) r1     // Catch: java.lang.Throwable -> L1e
            goto L21
        L1e:
            r1 = move-exception
            goto L28
        L20:
            r1 = 0
        L21:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1e
            if (r1 == 0) goto L27
            r1.generateMapAnimation(r3)
        L27:
            return
        L28:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1e
            throw r1
    }

    public static native void nativeAddGestureSingleTapMessage(int r0, long r1, float r3, float r4);

    protected static native java.lang.String nativeAddNativeOverlay(int r0, long r1, int r3, int r4);

    private static native boolean nativeAddOverlayTexture(int r0, long r1, int r3, int r4, float r5, float r6, android.graphics.Bitmap r7, boolean r8, boolean r9);

    private static native void nativeCancelDownLoad(long r0);

    private static native boolean nativeCheckCustomStyleData(int r0, long r1, byte[] r3);

    private static native void nativeCreateAMapEngineWithFrame(long r0, int r2, int r3, int r4, int r5, int r6, int r7, int r8, float r9, float r10, float r11, int r12);

    private static native long nativeCreateAMapInstance(float r0, float r1, float r2, int r3);

    protected static native long nativeCreateOverlay(int r0, long r1, int r3);

    private static native int nativeCreateTextureFromImage(int r0, long r1, android.graphics.Bitmap r3);

    private static native void nativeDestroy(long r0);

    private static native void nativeDestroyCurrentState(long r0, long r2);

    protected static native void nativeDestroyOverlay(int r0, long r1);

    private static native void nativeFailedDownLoad(long r0, int r2);

    private static native void nativeFinishDownLoad(long r0);

    private static native void nativeGetCurTileIDs(int r0, long r1, int[] r3, int r4);

    private static native long nativeGetCurrentMapState(int r0, long r1);

    private static native long nativeGetGlOverlayMgrPtr(int r0, long r1);

    public static native java.lang.String nativeGetMapEngineVersion(int r0);

    private static native int[] nativeGetMapModeState(int r0, long r1, boolean r3);

    public static native java.lang.String nativeGetMapSDKDeps();

    public static native java.lang.String nativeGetMapSDKVersion();

    public static native long nativeGetNativeMapController(int r0, long r1);

    public static native int[] nativeGetScreenShot(int r0, long r1, int r3, int r4, int r5, int r6);

    private static native boolean nativeGetSrvViewStateBoolValue(int r0, long r1, int r3);

    public static native int nativeHideBuildings(int r0, long r1, com.amap.api.maps.model.LatLng[] r3);

    private static native void nativeInitAMapEngineCallback(long r0, java.lang.Object r2);

    private static native void nativeInitContourLineOptions(long r0, boolean r2);

    private static native void nativeInitOpenLayer(int r0, long r1, byte[] r3);

    private static native void nativeInitParam(java.lang.String r0, java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, int r6);

    private static native boolean nativeIsEngineCreated(long r0, int r2);

    public static native void nativeMainThreadTrigger(int r0, long r1);

    private static native void nativePopRenderState(int r0, long r1);

    private static native void nativePostRenderAMap(long r0, int r2);

    private static native void nativePushRendererState(int r0, long r1);

    private static native void nativeReceiveNetData(byte[] r0, long r1, int r3);

    protected static native void nativeRemoveNativeAllOverlay(int r0, long r1);

    protected static native void nativeRemoveNativeOverlay(int r0, long r1, java.lang.String r3);

    private static native void nativeRenderAMap(long r0, int r2);

    private static native void nativeSetAllContentEnable(int r0, long r1, boolean r3);

    private static native void nativeSetBuildingEnable(int r0, long r1, boolean r3);

    private static native void nativeSetBuildingTextureEnable(int r0, long r1, boolean r3);

    private static native void nativeSetCustomStyleData(int r0, long r1, byte[] r3, byte[] r4);

    private static native void nativeSetCustomStyleTexture(int r0, long r1, byte[] r3);

    private static native void nativeSetCustomThirdLayerStyle(int r0, long r1, java.lang.String r3);

    private static native void nativeSetHighlightSubwayEnable(int r0, long r1, boolean r3);

    private static native void nativeSetIndoorBuildingToBeActive(int r0, long r1, java.lang.String r3, int r4, java.lang.String r5);

    private static native void nativeSetIndoorEnable(int r0, long r1, boolean r3);

    private static native void nativeSetLabelEnable(int r0, long r1, boolean r3);

    private static native boolean nativeSetMapModeAndStyle(int r0, long r1, int[] r3);

    private static native void nativeSetNaviLabelEnable(int r0, long r1, boolean r3, int r4, int r5);

    private static native void nativeSetNetStatus(long r0, int r2);

    private static native void nativeSetOfflineDataEnable(int r0, long r1, boolean r3);

    private static native void nativeSetOpenLayerEnable(int r0, long r1, boolean r3);

    private static native void nativeSetParameter(int r0, long r1, int r3, int r4, int r5, int r6, int r7);

    private static native void nativeSetProjectionCenter(int r0, long r1, float r3, float r4);

    private static native void nativeSetRenderListenerStatus(int r0, long r1);

    private static native void nativeSetRoadArrowEnable(int r0, long r1, boolean r3);

    private static native void nativeSetServiceViewRect(int r0, long r1, int r3, int r4, int r5, int r6, int r7, int r8);

    private static native void nativeSetSetBackgroundTexture(int r0, long r1, byte[] r3);

    private static native void nativeSetSimple3DEnable(int r0, long r1, boolean r3);

    private static native void nativeSetSkyTexture(int r0, long r1, byte[] r3);

    private static native void nativeSetSrvViewStateBoolValue(int r0, long r1, int r3, boolean r4);

    private static native void nativeSetStyleChangeGradualEnable(int r0, long r1, boolean r3);

    public static native void nativeSetTerrainAuth(int r0, long r1, boolean r3);

    private static native void nativeSetTrafficEnable(int r0, long r1, boolean r3);

    private static native void nativeSetTrafficTexture(int r0, long r1, byte[] r3, long r4, int r6, int r7, int r8, int r9, int r10);

    private static native void nativeSetTrafficTextureAllInOne(int r0, long r1, byte[] r3);

    public static native void nativeSetVectorOverlayPath(int r0, long r1, java.lang.String r3);

    public static native void nativeShowHideBuildings(int r0, long r1, int r3);

    protected static native void nativeUpdateNativeArrowOverlay(int r0, long r1, java.lang.String r3, int[] r4, int[] r5, int r6, int r7, int r8, float r9, boolean r10, int r11, int r12, int r13);

    private boolean processAnimations(com.autonavi.base.ae.gmap.GLMapState r2) {
            r1 = this;
            com.autonavi.base.ae.gmap.glanimation.AdglMapAnimationMgr r0 = r1.mapAnimationMgr     // Catch: java.lang.Throwable -> L12
            int r0 = r0.getAnimationsCount()     // Catch: java.lang.Throwable -> L12
            if (r0 <= 0) goto L12
            r2.recalculate()     // Catch: java.lang.Throwable -> L12
            com.autonavi.base.ae.gmap.glanimation.AdglMapAnimationMgr r0 = r1.mapAnimationMgr     // Catch: java.lang.Throwable -> L12
            r0.doAnimations(r2)     // Catch: java.lang.Throwable -> L12
            r2 = 1
            return r2
        L12:
            r2 = 0
            return r2
    }

    private boolean processGestureMessage(com.autonavi.base.ae.gmap.GLMapState r6) {
            r5 = this;
            java.util.List<com.autonavi.base.amap.mapcore.message.AbstractGestureMapMessage> r0 = r5.mGestureMessageList
            int r0 = r0.size()
            r1 = 0
            if (r0 > 0) goto L10
            boolean r6 = r5.isGestureStep
            if (r6 == 0) goto Lf
            r5.isGestureStep = r1
        Lf:
            return r1
        L10:
            r0 = 1
            r5.isGestureStep = r0
            if (r6 != 0) goto L16
            return r1
        L16:
            java.util.List<com.autonavi.base.amap.mapcore.message.AbstractGestureMapMessage> r2 = r5.mGestureMessageList
            monitor-enter(r2)
            java.util.List<com.autonavi.base.amap.mapcore.message.AbstractGestureMapMessage> r3 = r5.mGestureMessageList     // Catch: java.lang.Throwable -> L2a
            int r3 = r3.size()     // Catch: java.lang.Throwable -> L2a
            if (r3 <= 0) goto L2c
            java.util.List<com.autonavi.base.amap.mapcore.message.AbstractGestureMapMessage> r3 = r5.mGestureMessageList     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r3 = r3.remove(r1)     // Catch: java.lang.Throwable -> L2a
            com.autonavi.base.amap.mapcore.message.AbstractGestureMapMessage r3 = (com.autonavi.base.amap.mapcore.message.AbstractGestureMapMessage) r3     // Catch: java.lang.Throwable -> L2a
            goto L2d
        L2a:
            r6 = move-exception
            goto L76
        L2c:
            r3 = 0
        L2d:
            if (r3 != 0) goto L3c
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2a
            java.util.List<com.autonavi.base.amap.mapcore.message.AbstractGestureMapMessage> r6 = r5.mGestureEndMessageList
            int r6 = r6.size()
            if (r6 <= 0) goto L3b
            r5.recycleMessage()
        L3b:
            return r0
        L3c:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2a
            int r2 = r3.width
            if (r2 != 0) goto L49
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r2 = r5.mGlMapView
            int r2 = r2.getMapWidth()
            r3.width = r2
        L49:
            int r2 = r3.height
            if (r2 != 0) goto L55
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r2 = r5.mGlMapView
            int r2 = r2.getMapHeight()
            r3.height = r2
        L55:
            int r2 = r3.getMapGestureState()
            r4 = 100
            if (r2 != r4) goto L61
            r5.gestureBegin()
            goto L70
        L61:
            r4 = 101(0x65, float:1.42E-43)
            if (r2 != r4) goto L69
            r3.runCameraUpdate(r6)
            goto L70
        L69:
            r4 = 102(0x66, float:1.43E-43)
            if (r2 != r4) goto L70
            r5.gestureEnd()
        L70:
            java.util.List<com.autonavi.base.amap.mapcore.message.AbstractGestureMapMessage> r2 = r5.mGestureEndMessageList
            r2.add(r3)
            goto L16
        L76:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2a
            throw r6
    }

    private boolean processMessage() {
            r6 = this;
            r0 = 0
            int r1 = r6.mEngineID     // Catch: java.lang.Exception -> L63
            com.autonavi.amap.api.mapcore.IGLMapState r1 = r6.getNewMapState(r1)     // Catch: java.lang.Exception -> L63
            com.autonavi.base.ae.gmap.GLMapState r1 = (com.autonavi.base.ae.gmap.GLMapState) r1     // Catch: java.lang.Exception -> L63
            boolean r2 = r6.processGestureMessage(r1)     // Catch: java.lang.Exception -> L63
            java.util.List<com.autonavi.base.amap.mapcore.message.AbstractGestureMapMessage> r3 = r6.mGestureMessageList     // Catch: java.lang.Exception -> L63
            int r3 = r3.size()     // Catch: java.lang.Exception -> L63
            r4 = 1
            if (r3 > 0) goto L23
            if (r2 != 0) goto L21
            boolean r2 = r6.processStateMapMessage(r1)     // Catch: java.lang.Exception -> L63
            if (r2 == 0) goto L1f
            goto L21
        L1f:
            r2 = 0
            goto L37
        L21:
            r2 = 1
            goto L37
        L23:
            java.util.List<com.autonavi.amap.mapcore.AbstractCameraUpdateMessage> r3 = r6.mStateMessageList     // Catch: java.lang.Exception -> L63
            monitor-enter(r3)     // Catch: java.lang.Exception -> L63
            java.util.List<com.autonavi.amap.mapcore.AbstractCameraUpdateMessage> r5 = r6.mStateMessageList     // Catch: java.lang.Throwable -> L34
            int r5 = r5.size()     // Catch: java.lang.Throwable -> L34
            if (r5 <= 0) goto L36
            java.util.List<com.autonavi.amap.mapcore.AbstractCameraUpdateMessage> r5 = r6.mStateMessageList     // Catch: java.lang.Throwable -> L34
            r5.clear()     // Catch: java.lang.Throwable -> L34
            goto L36
        L34:
            r1 = move-exception
            goto L61
        L36:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L34
        L37:
            if (r2 != 0) goto L41
            boolean r2 = r6.processAnimations(r1)     // Catch: java.lang.Exception -> L63
            if (r2 == 0) goto L40
            goto L41
        L40:
            r4 = 0
        L41:
            if (r4 == 0) goto L5d
            float r2 = r1.getCameraDegree()     // Catch: java.lang.Exception -> L63
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r3 = r6.mGlMapView     // Catch: java.lang.Exception -> L63
            com.autonavi.base.amap.mapcore.MapConfig r3 = r3.getMapConfig()     // Catch: java.lang.Exception -> L63
            float r5 = r1.getMapZoomer()     // Catch: java.lang.Exception -> L63
            float r2 = com.amap.api.col.p0003l.b3.i(r3, r2, r5)     // Catch: java.lang.Exception -> L63
            r1.setCameraDegree(r2)     // Catch: java.lang.Exception -> L63
            int r2 = r6.mEngineID     // Catch: java.lang.Exception -> L63
            r6.setMapState(r2, r1)     // Catch: java.lang.Exception -> L63
        L5d:
            r1.recycle()     // Catch: java.lang.Exception -> L63
            return r4
        L61:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L34
            throw r1     // Catch: java.lang.Exception -> L63
        L63:
            return r0
    }

    private boolean processStateMapMessage(com.autonavi.base.ae.gmap.GLMapState r5) {
            r4 = this;
            java.util.List<com.autonavi.amap.mapcore.AbstractCameraUpdateMessage> r0 = r4.mStateMessageList
            int r0 = r0.size()
            r1 = 0
            if (r0 > 0) goto L10
            boolean r5 = r4.isMoveCameraStep
            if (r5 == 0) goto Lf
            r4.isMoveCameraStep = r1
        Lf:
            return r1
        L10:
            r0 = 1
            r4.isMoveCameraStep = r0
            if (r5 != 0) goto L16
            return r1
        L16:
            java.util.List<com.autonavi.amap.mapcore.AbstractCameraUpdateMessage> r2 = r4.mStateMessageList
            monitor-enter(r2)
            java.util.List<com.autonavi.amap.mapcore.AbstractCameraUpdateMessage> r3 = r4.mStateMessageList     // Catch: java.lang.Throwable -> L2a
            int r3 = r3.size()     // Catch: java.lang.Throwable -> L2a
            if (r3 <= 0) goto L2c
            java.util.List<com.autonavi.amap.mapcore.AbstractCameraUpdateMessage> r3 = r4.mStateMessageList     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r3 = r3.remove(r1)     // Catch: java.lang.Throwable -> L2a
            com.autonavi.amap.mapcore.AbstractCameraUpdateMessage r3 = (com.autonavi.amap.mapcore.AbstractCameraUpdateMessage) r3     // Catch: java.lang.Throwable -> L2a
            goto L2d
        L2a:
            r5 = move-exception
            goto L51
        L2c:
            r3 = 0
        L2d:
            if (r3 != 0) goto L31
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2a
            return r0
        L31:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2a
            int r2 = r3.width
            if (r2 != 0) goto L3e
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r2 = r4.mGlMapView
            int r2 = r2.getMapWidth()
            r3.width = r2
        L3e:
            int r2 = r3.height
            if (r2 != 0) goto L4a
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r2 = r4.mGlMapView
            int r2 = r2.getMapHeight()
            r3.height = r2
        L4a:
            r5.recalculate()
            r3.runCameraUpdate(r5)
            goto L16
        L51:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2a
            throw r5
    }

    private void recycleMessage() {
            r2 = this;
        L0:
            java.util.List<com.autonavi.base.amap.mapcore.message.AbstractGestureMapMessage> r0 = r2.mGestureEndMessageList
            int r0 = r0.size()
            if (r0 <= 0) goto L3b
            java.util.List<com.autonavi.base.amap.mapcore.message.AbstractGestureMapMessage> r0 = r2.mGestureEndMessageList
            r1 = 0
            java.lang.Object r0 = r0.remove(r1)
            com.autonavi.base.amap.mapcore.message.AbstractGestureMapMessage r0 = (com.autonavi.base.amap.mapcore.message.AbstractGestureMapMessage) r0
            if (r0 == 0) goto L3b
            boolean r1 = r0 instanceof com.autonavi.base.amap.mapcore.message.MoveGestureMapMessage
            if (r1 == 0) goto L1d
            com.autonavi.base.amap.mapcore.message.MoveGestureMapMessage r0 = (com.autonavi.base.amap.mapcore.message.MoveGestureMapMessage) r0
            r0.recycle()
            goto L0
        L1d:
            boolean r1 = r0 instanceof com.autonavi.base.amap.mapcore.message.HoverGestureMapMessage
            if (r1 == 0) goto L27
            com.autonavi.base.amap.mapcore.message.HoverGestureMapMessage r0 = (com.autonavi.base.amap.mapcore.message.HoverGestureMapMessage) r0
            r0.recycle()
            goto L0
        L27:
            boolean r1 = r0 instanceof com.autonavi.base.amap.mapcore.message.RotateGestureMapMessage
            if (r1 == 0) goto L31
            com.autonavi.base.amap.mapcore.message.RotateGestureMapMessage r0 = (com.autonavi.base.amap.mapcore.message.RotateGestureMapMessage) r0
            r0.recycle()
            goto L0
        L31:
            boolean r1 = r0 instanceof com.autonavi.base.amap.mapcore.message.ScaleGestureMapMessage
            if (r1 == 0) goto L0
            com.autonavi.base.amap.mapcore.message.ScaleGestureMapMessage r0 = (com.autonavi.base.amap.mapcore.message.ScaleGestureMapMessage) r0
            r0.recycle()
            goto L0
        L3b:
            return
    }

    @Override // com.autonavi.base.amap.mapcore.IAMapEngineCallback
    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    public void OnIndoorBuildingActivity(int r2, byte[] r3) {
            r1 = this;
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r1.mGlMapView
            if (r0 == 0) goto L7
            r0.onIndoorBuildingActivity(r2, r3)     // Catch: java.lang.Throwable -> L7
        L7:
            return
    }

    public void addGestureMessage(int r1, com.autonavi.base.amap.mapcore.message.AbstractGestureMapMessage r2, boolean r3, int r4, int r5) {
            r0 = this;
            if (r2 != 0) goto L3
            return
        L3:
            r2.isGestureScaleByMapCenter = r3
            java.util.List<com.autonavi.base.amap.mapcore.message.AbstractGestureMapMessage> r1 = r0.mGestureMessageList
            monitor-enter(r1)
            java.util.List<com.autonavi.base.amap.mapcore.message.AbstractGestureMapMessage> r3 = r0.mGestureMessageList     // Catch: java.lang.Throwable -> Lf
            r3.add(r2)     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lf
            return
        Lf:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lf
            throw r2
    }

    public void addGestureSingleTapMessage(float r4, float r5) {
            r3 = this;
            int r0 = r3.mEngineID
            long r1 = r3.mNativeMapengineInstance
            nativeAddGestureSingleTapMessage(r0, r1, r4, r5)
            return
    }

    @Override // com.autonavi.amap.api.mapcore.IGLMapEngine
    public void addGroupAnimation(int r1, int r2, float r3, int r4, int r5, int r6, int r7, com.amap.api.maps.AMap.CancelableCallback r8) {
            r0 = this;
            com.autonavi.base.ae.gmap.glanimation.AdglMapAnimGroup r1 = new com.autonavi.base.ae.gmap.glanimation.AdglMapAnimGroup
            r1.<init>(r2)
            float r2 = (float) r5
            r5 = 0
            r1.setToCameraDegree(r2, r5)
            float r2 = (float) r4
            r1.setToMapAngle(r2, r5)
            r1.setToMapLevel(r3, r5)
            r1.setToMapCenterGeo(r6, r7, r5)
            com.autonavi.base.ae.gmap.glanimation.AdglMapAnimationMgr r2 = r0.mapAnimationMgr
            if (r2 == 0) goto L23
            boolean r2 = r1.isValid()
            if (r2 == 0) goto L23
            com.autonavi.base.ae.gmap.glanimation.AdglMapAnimationMgr r2 = r0.mapAnimationMgr
            r2.addAnimation(r1, r8)
        L23:
            return
    }

    public void addMessage(com.autonavi.amap.mapcore.AbstractCameraUpdateMessage r2, boolean r3) {
            r1 = this;
            if (r3 == 0) goto L14
            java.util.List<com.autonavi.amap.mapcore.AbstractCameraUpdateMessage> r3 = r1.mAnimateStateMessageList
            monitor-enter(r3)
            java.util.List<com.autonavi.amap.mapcore.AbstractCameraUpdateMessage> r0 = r1.mAnimateStateMessageList     // Catch: java.lang.Throwable -> L11
            r0.clear()     // Catch: java.lang.Throwable -> L11
            java.util.List<com.autonavi.amap.mapcore.AbstractCameraUpdateMessage> r0 = r1.mAnimateStateMessageList     // Catch: java.lang.Throwable -> L11
            r0.add(r2)     // Catch: java.lang.Throwable -> L11
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L11
            return
        L11:
            r2 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L11
            throw r2
        L14:
            java.util.List<com.autonavi.amap.mapcore.AbstractCameraUpdateMessage> r3 = r1.mStateMessageList
            monitor-enter(r3)
            java.util.List<com.autonavi.amap.mapcore.AbstractCameraUpdateMessage> r0 = r1.mStateMessageList     // Catch: java.lang.Throwable -> L1e
            r0.add(r2)     // Catch: java.lang.Throwable -> L1e
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1e
            return
        L1e:
            r2 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1e
            throw r2
    }

    public java.lang.String addNativeOverlay(int r7, int r8, int r9) {
            r6 = this;
            long r0 = r6.mNativeMapengineInstance
            r2 = 0
            r4 = 0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto L15
            java.lang.String r7 = nativeAddNativeOverlay(r7, r0, r8, r9)
            boolean r8 = android.text.TextUtils.isEmpty(r7)
            if (r8 == 0) goto L14
            return r4
        L14:
            return r7
        L15:
            return r4
    }

    public void addOverlayTexture(int r2, android.graphics.Bitmap r3, int r4, int r5) {
            r1 = this;
            com.autonavi.base.ae.gmap.gloverlay.GLTextureProperty r0 = new com.autonavi.base.ae.gmap.gloverlay.GLTextureProperty
            r0.<init>()
            r0.mId = r4
            r0.mAnchor = r5
            r0.mBitmap = r3
            r3 = 0
            r0.mXRatio = r3
            r0.mYRatio = r3
            r3 = 1
            r0.isGenMimps = r3
            r1.addOverlayTexture(r2, r0)
            return
    }

    public void addOverlayTexture(int r12, com.autonavi.base.ae.gmap.gloverlay.GLTextureProperty r13) {
            r11 = this;
            long r0 = r11.mNativeMapengineInstance
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L28
            if (r13 == 0) goto L28
            android.graphics.Bitmap r0 = r13.mBitmap
            if (r0 == 0) goto L28
            boolean r0 = r0.isRecycled()
            if (r0 != 0) goto L28
            long r2 = r11.mNativeMapengineInstance
            int r4 = r13.mId
            int r5 = r13.mAnchor
            float r6 = r13.mXRatio
            float r7 = r13.mYRatio
            android.graphics.Bitmap r8 = r13.mBitmap
            boolean r9 = r13.isGenMimps
            boolean r10 = r13.isRepeat
            r1 = r12
            nativeAddOverlayTexture(r1, r2, r4, r5, r6, r7, r8, r9, r10)
        L28:
            return
    }

    public boolean canStopMapRender(int r1) {
            r0 = this;
            boolean r1 = r0.isEngineRenderComplete
            return r1
    }

    @Override // com.autonavi.base.amap.mapcore.IAMapEngineCallback
    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    public void cancelRequireMapData(java.lang.Object r2) {
            r1 = this;
            if (r2 == 0) goto Lb
            boolean r0 = r2 instanceof com.autonavi.base.amap.mapcore.maploader.AMapLoader
            if (r0 == 0) goto Lb
            com.autonavi.base.amap.mapcore.maploader.AMapLoader r2 = (com.autonavi.base.amap.mapcore.maploader.AMapLoader) r2
            r2.doCancel()
        Lb:
            return
    }

    public void changeSurface(int r1, int r2) {
            r0 = this;
            return
    }

    public boolean checkCustomStyleData(int r7, byte[] r8) {
            r6 = this;
            r0 = 0
            if (r8 != 0) goto L4
            return r0
        L4:
            long r1 = r6.mNativeMapengineInstance
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto Ld
            return r0
        Ld:
            boolean r7 = nativeCheckCustomStyleData(r7, r1, r8)
            return r7
    }

    public void clearAllMessages(int r1) {
            r0 = this;
            return
    }

    public void clearAnimations(int r1, boolean r2) {
            r0 = this;
            com.autonavi.base.ae.gmap.glanimation.AdglMapAnimationMgr r1 = r0.mapAnimationMgr
            r1.clearAnimations()
            return
    }

    public void clearAnimations(int r1, boolean r2, int r3) {
            r0 = this;
            com.autonavi.base.ae.gmap.glanimation.AdglMapAnimationMgr r1 = r0.mapAnimationMgr
            r1.clearAnimations()
            return
    }

    public void createAMapEngineWithFrame(com.autonavi.base.ae.gmap.GLMapEngine.MapViewInitParam r17) {
            r16 = this;
            r1 = r16
            r0 = r17
            long r2 = r1.mNativeMapengineInstance
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L4d
            java.lang.Class<com.autonavi.base.ae.gmap.GLMapEngine> r2 = com.autonavi.base.ae.gmap.GLMapEngine.class
            monitor-enter(r2)
            long r3 = r1.mNativeMapengineInstance     // Catch: java.lang.Throwable -> L4a
            int r5 = r0.engineId     // Catch: java.lang.Throwable -> L4a
            int r6 = r0.x     // Catch: java.lang.Throwable -> L4a
            int r7 = r0.y     // Catch: java.lang.Throwable -> L4a
            int r8 = r0.width     // Catch: java.lang.Throwable -> L4a
            int r9 = r0.height     // Catch: java.lang.Throwable -> L4a
            int r10 = r0.screenWidth     // Catch: java.lang.Throwable -> L4a
            int r11 = r0.screenHeight     // Catch: java.lang.Throwable -> L4a
            float r12 = r0.screenScale     // Catch: java.lang.Throwable -> L4a
            float r13 = r0.textScale     // Catch: java.lang.Throwable -> L4a
            float r14 = r0.mapZoomScale     // Catch: java.lang.Throwable -> L4a
            int r15 = r0.taskThreadCount     // Catch: java.lang.Throwable -> L4a
            nativeCreateAMapEngineWithFrame(r3, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)     // Catch: java.lang.Throwable -> L4a
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4a
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r2 = r1.mGlMapView
            com.autonavi.base.amap.mapcore.MapConfig r2 = r2.getMapConfig()
            boolean r2 = r2.isTerrainEnable()
            if (r2 == 0) goto L4d
            java.lang.String r2 = "map_assets/style_1_17_for_terrain.data"
            android.content.Context r3 = r1.context
            byte[] r2 = com.autonavi.base.amap.mapcore.FileUtil.readFileContentsFromAssets(r3, r2)
            byte[] r2 = com.autonavi.base.amap.mapcore.FileUtil.uncompressToByteArray(r2)
            int r0 = r0.engineId
            r3 = 0
            r1.setCustomStyleData(r0, r2, r3)
            return
        L4a:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4a
            throw r0
        L4d:
            return
    }

    public boolean createAMapInstance(com.autonavi.base.ae.gmap.GLMapEngine.InitParam r13) {
            r12 = this;
            r0 = 0
            if (r13 != 0) goto L4
            return r0
        L4:
            java.lang.Class<com.autonavi.base.ae.gmap.GLMapEngine> r1 = com.autonavi.base.ae.gmap.GLMapEngine.class
            monitor-enter(r1)
            java.lang.String r6 = "http://mpsapi.amap.com/"
            java.lang.String r7 = "http://m5.amap.com/"
            android.content.Context r2 = r12.context     // Catch: java.lang.Throwable -> L51
            android.content.res.Resources r2 = r2.getResources()     // Catch: java.lang.Throwable -> L51
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()     // Catch: java.lang.Throwable -> L51
            int r8 = r2.densityDpi     // Catch: java.lang.Throwable -> L51
            float r9 = r2.density     // Catch: java.lang.Throwable -> L51
            int r3 = r2.widthPixels     // Catch: java.lang.Throwable -> L51
            int r4 = r2.heightPixels     // Catch: java.lang.Throwable -> L51
            float r10 = r12.adapterDpiScale(r2, r3, r4, r8)     // Catch: java.lang.Throwable -> L51
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r2 = r12.mGlMapView     // Catch: java.lang.Throwable -> L51
            com.autonavi.base.amap.mapcore.MapConfig r2 = r2.getMapConfig()     // Catch: java.lang.Throwable -> L51
            boolean r3 = com.amap.api.maps.MapsInitializer.isTerrainEnable()     // Catch: java.lang.Throwable -> L51
            r2.setTerrainEnable(r3)     // Catch: java.lang.Throwable -> L51
            boolean r11 = com.amap.api.maps.MapsInitializer.isTerrainEnable()     // Catch: java.lang.Throwable -> L51
            java.lang.String r2 = r13.mRootPath     // Catch: java.lang.Throwable -> L51
            java.lang.String r3 = r13.mConfigContent     // Catch: java.lang.Throwable -> L51
            java.lang.String r4 = r13.mOfflineDataPath     // Catch: java.lang.Throwable -> L51
            java.lang.String r5 = r13.mP3dCrossPath     // Catch: java.lang.Throwable -> L51
            nativeInitParam(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L51
            java.lang.String r13 = r13.mP3dCrossPath     // Catch: java.lang.Throwable -> L51
            com.autonavi.base.ae.gmap.bean.InitStorageParam.Holder.initPath(r13)     // Catch: java.lang.Throwable -> L51
            float r13 = (float) r8     // Catch: java.lang.Throwable -> L51
            long r2 = nativeCreateAMapInstance(r13, r9, r10, r11)     // Catch: java.lang.Throwable -> L51
            r12.mNativeMapengineInstance = r2     // Catch: java.lang.Throwable -> L51
            r4 = 0
            int r13 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r13 != 0) goto L54
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L51
            return r0
        L51:
            r0 = move-exception
            r13 = r0
            goto L8f
        L54:
            boolean r13 = com.amap.api.maps.MapsInitializer.isTerrainEnable()     // Catch: java.lang.Throwable -> L51
            if (r13 == 0) goto L63
            long r2 = r12.mNativeMapengineInstance     // Catch: java.lang.Throwable -> L51
            boolean r13 = com.amap.api.maps.MapsInitializer.isContourLineEnable()     // Catch: java.lang.Throwable -> L51
            nativeInitContourLineOptions(r2, r13)     // Catch: java.lang.Throwable -> L51
        L63:
            long r2 = r12.mNativeMapengineInstance     // Catch: java.lang.Throwable -> L51
            nativeInitAMapEngineCallback(r2, r12)     // Catch: java.lang.Throwable -> L51
            com.autonavi.base.ae.gmap.NetworkProxyManager r13 = com.autonavi.base.ae.gmap.NetworkProxyManager.getInstance()     // Catch: java.lang.Throwable -> L51
            boolean r13 = r13.isReady()     // Catch: java.lang.Throwable -> L51
            if (r13 != 0) goto L82
            com.autonavi.base.ae.gmap.NetworkProxyManager r13 = com.autonavi.base.ae.gmap.NetworkProxyManager.getInstance()     // Catch: java.lang.Throwable -> L51
            android.content.Context r0 = r12.context     // Catch: java.lang.Throwable -> L51
            r13.initContext(r0)     // Catch: java.lang.Throwable -> L51
            com.autonavi.base.ae.gmap.NetworkProxyManager r13 = com.autonavi.base.ae.gmap.NetworkProxyManager.getInstance()     // Catch: java.lang.Throwable -> L51
            r13.init()     // Catch: java.lang.Throwable -> L51
        L82:
            com.autonavi.base.ae.gmap.NetworkProxyManager r13 = com.autonavi.base.ae.gmap.NetworkProxyManager.getInstance()     // Catch: java.lang.Throwable -> L51
            int r0 = r12.mEngineID     // Catch: java.lang.Throwable -> L51
            long r2 = (long) r0     // Catch: java.lang.Throwable -> L51
            r13.notifyMapEngineCreated(r2, r12)     // Catch: java.lang.Throwable -> L51
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L51
            r13 = 1
            return r13
        L8f:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L51
            throw r13
    }

    public long createOverlay(int r6, int r7) {
            r5 = this;
            long r0 = r5.mNativeMapengineInstance
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Ld
            long r6 = nativeCreateOverlay(r6, r0, r7)
            return r6
        Ld:
            return r2
    }

    public int createOverlayTexture(int r6, android.graphics.Bitmap r7) {
            r5 = this;
            long r0 = r5.mNativeMapengineInstance
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L17
            if (r7 == 0) goto L17
            boolean r0 = r7.isRecycled()
            if (r0 != 0) goto L17
            long r0 = r5.mNativeMapengineInstance
            int r6 = nativeCreateTextureFromImage(r6, r0, r7)
            return r6
        L17:
            r6 = -1
            return r6
    }

    public void destroyAMapEngine() {
            r7 = this;
            r0 = 1
            r7.mRequestDestroy = r0     // Catch: java.lang.Throwable -> L73
            java.lang.Object r0 = r7.mutLock     // Catch: java.lang.Throwable -> L73
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L73
            long r1 = r7.mNativeMapengineInstance     // Catch: java.lang.Throwable -> L33
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L3b
            java.util.concurrent.locks.Lock r1 = r7.mLock     // Catch: java.lang.Throwable -> L33
            r1.lock()     // Catch: java.lang.Throwable -> L33
            com.autonavi.base.ae.gmap.GLMapState r1 = r7.copyGLMapState     // Catch: java.lang.Throwable -> L1b
            if (r1 == 0) goto L1d
            r1.recycle()     // Catch: java.lang.Throwable -> L1b
            goto L1d
        L1b:
            r1 = move-exception
            goto L35
        L1d:
            java.util.concurrent.locks.Lock r1 = r7.mLock     // Catch: java.lang.Throwable -> L33
            r1.unlock()     // Catch: java.lang.Throwable -> L33
            long r1 = r7.mNativeMapengineInstance     // Catch: java.lang.Throwable -> L33
            com.autonavi.base.ae.gmap.GLMapState r5 = r7.state     // Catch: java.lang.Throwable -> L33
            long r5 = r5.getNativeInstance()     // Catch: java.lang.Throwable -> L33
            nativeDestroyCurrentState(r1, r5)     // Catch: java.lang.Throwable -> L33
            long r1 = r7.mNativeMapengineInstance     // Catch: java.lang.Throwable -> L33
            nativeDestroy(r1)     // Catch: java.lang.Throwable -> L33
            goto L3b
        L33:
            r1 = move-exception
            goto L7e
        L35:
            java.util.concurrent.locks.Lock r2 = r7.mLock     // Catch: java.lang.Throwable -> L33
            r2.unlock()     // Catch: java.lang.Throwable -> L33
            throw r1     // Catch: java.lang.Throwable -> L33
        L3b:
            r7.mNativeMapengineInstance = r3     // Catch: java.lang.Throwable -> L33
            com.autonavi.base.ae.gmap.NetworkProxyManager r1 = com.autonavi.base.ae.gmap.NetworkProxyManager.getInstance()     // Catch: java.lang.Throwable -> L33
            int r2 = r7.mEngineID     // Catch: java.lang.Throwable -> L33
            long r2 = (long) r2     // Catch: java.lang.Throwable -> L33
            r1.notifyMapEngineDestroyed(r2)     // Catch: java.lang.Throwable -> L33
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L33
            r0 = 0
            r7.mGlMapView = r0     // Catch: java.lang.Throwable -> L73
            java.util.List<com.autonavi.amap.mapcore.AbstractCameraUpdateMessage> r1 = r7.mStateMessageList     // Catch: java.lang.Throwable -> L73
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L73
            java.util.List<com.autonavi.amap.mapcore.AbstractCameraUpdateMessage> r2 = r7.mStateMessageList     // Catch: java.lang.Throwable -> L7b
            r2.clear()     // Catch: java.lang.Throwable -> L7b
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L7b
            java.util.List<com.autonavi.amap.mapcore.AbstractCameraUpdateMessage> r1 = r7.mAnimateStateMessageList     // Catch: java.lang.Throwable -> L73
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L73
            java.util.List<com.autonavi.amap.mapcore.AbstractCameraUpdateMessage> r2 = r7.mAnimateStateMessageList     // Catch: java.lang.Throwable -> L78
            r2.clear()     // Catch: java.lang.Throwable -> L78
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L78
            java.util.List<com.autonavi.base.amap.mapcore.message.AbstractGestureMapMessage> r1 = r7.mGestureMessageList     // Catch: java.lang.Throwable -> L73
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L73
            java.util.List<com.autonavi.base.amap.mapcore.message.AbstractGestureMapMessage> r2 = r7.mGestureMessageList     // Catch: java.lang.Throwable -> L75
            r2.clear()     // Catch: java.lang.Throwable -> L75
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L75
            java.util.List<com.autonavi.base.amap.mapcore.message.AbstractGestureMapMessage> r1 = r7.mGestureEndMessageList     // Catch: java.lang.Throwable -> L73
            r1.clear()     // Catch: java.lang.Throwable -> L73
            r7.mMapListener = r0     // Catch: java.lang.Throwable -> L73
            r7.bundle = r0     // Catch: java.lang.Throwable -> L73
            com.amap.api.col.p0003l.z2.c()     // Catch: java.lang.Throwable -> L73
            return
        L73:
            r0 = move-exception
            goto L80
        L75:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L75
            throw r0     // Catch: java.lang.Throwable -> L73
        L78:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L78
            throw r0     // Catch: java.lang.Throwable -> L73
        L7b:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L7b
            throw r0     // Catch: java.lang.Throwable -> L73
        L7e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L33
            throw r1     // Catch: java.lang.Throwable -> L73
        L80:
            com.amap.api.col.p0003l.b3.D(r0)
            return
    }

    public void destroyOverlay(int r2, long r3) {
            r1 = this;
            java.lang.Class<com.autonavi.base.ae.gmap.GLMapEngine> r0 = com.autonavi.base.ae.gmap.GLMapEngine.class
            monitor-enter(r0)
            nativeDestroyOverlay(r2, r3)     // Catch: java.lang.Throwable -> L8
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8
            return
        L8:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8
            throw r2
    }

    @Override // com.autonavi.base.amap.mapcore.IAMapEngineCallback
    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    public int generateRequestId() {
            r1 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r1.mRequestID
            int r0 = r0.incrementAndGet()
            return r0
    }

    public int getAnimateionsCount() {
            r5 = this;
            long r0 = r5.mNativeMapengineInstance
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Lf
            com.autonavi.base.ae.gmap.glanimation.AdglMapAnimationMgr r0 = r5.mapAnimationMgr
            int r0 = r0.getAnimationsCount()
            return r0
        Lf:
            r0 = 0
            return r0
    }

    public com.autonavi.base.ae.gmap.GLMapState getCloneMapState() {
            r5 = this;
            java.util.concurrent.locks.Lock r0 = r5.mLock
            r0.lock()
            long r0 = r5.mNativeMapengineInstance     // Catch: java.lang.Throwable -> L1b
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L63
            com.autonavi.base.ae.gmap.GLMapState r2 = r5.copyGLMapState     // Catch: java.lang.Throwable -> L1b
            if (r2 != 0) goto L1d
            com.autonavi.base.ae.gmap.GLMapState r2 = new com.autonavi.base.ae.gmap.GLMapState     // Catch: java.lang.Throwable -> L1b
            int r3 = r5.mEngineID     // Catch: java.lang.Throwable -> L1b
            r2.<init>(r3, r0)     // Catch: java.lang.Throwable -> L1b
            r5.copyGLMapState = r2     // Catch: java.lang.Throwable -> L1b
            goto L1d
        L1b:
            r0 = move-exception
            goto L6b
        L1d:
            com.autonavi.base.ae.gmap.GLMapState r0 = r5.copyGLMapState     // Catch: java.lang.Throwable -> L1b
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r1 = r5.mGlMapView     // Catch: java.lang.Throwable -> L1b
            com.autonavi.base.amap.mapcore.MapConfig r1 = r1.getMapConfig()     // Catch: java.lang.Throwable -> L1b
            float r1 = r1.getSZ()     // Catch: java.lang.Throwable -> L1b
            r0.setMapZoomer(r1)     // Catch: java.lang.Throwable -> L1b
            com.autonavi.base.ae.gmap.GLMapState r0 = r5.copyGLMapState     // Catch: java.lang.Throwable -> L1b
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r1 = r5.mGlMapView     // Catch: java.lang.Throwable -> L1b
            com.autonavi.base.amap.mapcore.MapConfig r1 = r1.getMapConfig()     // Catch: java.lang.Throwable -> L1b
            float r1 = r1.getSC()     // Catch: java.lang.Throwable -> L1b
            r0.setCameraDegree(r1)     // Catch: java.lang.Throwable -> L1b
            com.autonavi.base.ae.gmap.GLMapState r0 = r5.copyGLMapState     // Catch: java.lang.Throwable -> L1b
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r1 = r5.mGlMapView     // Catch: java.lang.Throwable -> L1b
            com.autonavi.base.amap.mapcore.MapConfig r1 = r1.getMapConfig()     // Catch: java.lang.Throwable -> L1b
            float r1 = r1.getSR()     // Catch: java.lang.Throwable -> L1b
            r0.setMapAngle(r1)     // Catch: java.lang.Throwable -> L1b
            com.autonavi.base.ae.gmap.GLMapState r0 = r5.copyGLMapState     // Catch: java.lang.Throwable -> L1b
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r1 = r5.mGlMapView     // Catch: java.lang.Throwable -> L1b
            com.autonavi.base.amap.mapcore.MapConfig r1 = r1.getMapConfig()     // Catch: java.lang.Throwable -> L1b
            double r1 = r1.getSX()     // Catch: java.lang.Throwable -> L1b
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r3 = r5.mGlMapView     // Catch: java.lang.Throwable -> L1b
            com.autonavi.base.amap.mapcore.MapConfig r3 = r3.getMapConfig()     // Catch: java.lang.Throwable -> L1b
            double r3 = r3.getSY()     // Catch: java.lang.Throwable -> L1b
            r0.setMapGeoCenter(r1, r3)     // Catch: java.lang.Throwable -> L1b
        L63:
            java.util.concurrent.locks.Lock r0 = r5.mLock
            r0.unlock()
            com.autonavi.base.ae.gmap.GLMapState r0 = r5.copyGLMapState
            return r0
        L6b:
            java.util.concurrent.locks.Lock r1 = r5.mLock
            r1.unlock()
            throw r0
    }

    public android.content.Context getContext() {
            r1 = this;
            android.content.Context r0 = r1.context
            return r0
    }

    public void getCurTileIDs(int r4, int[] r5) {
            r3 = this;
            if (r5 == 0) goto L12
            r0 = 0
            r1 = 0
        L4:
            int r2 = r5.length
            if (r1 >= r2) goto Lc
            r5[r1] = r0
            int r1 = r1 + 1
            goto L4
        Lc:
            long r0 = r3.mNativeMapengineInstance
            int r2 = r5.length
            nativeGetCurTileIDs(r4, r0, r5, r2)
        L12:
            return
    }

    @Override // com.autonavi.base.amap.mapcore.IAMapEngineCallback
    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    public com.amap.api.maps.model.BitmapDescriptor getDefaultTerrainImage() {
            r1 = this;
            com.autonavi.base.ae.gmap.TerrainOverlayProvider r0 = r1.terrainTileProvider
            com.amap.api.maps.model.BitmapDescriptor r0 = r0.getDefaultTerrain()
            return r0
    }

    public int getEngineIDWithGestureInfo(com.autonavi.base.ae.gmap.gesture.EAMapPlatformGestureInfo r1) {
            r0 = this;
            int r1 = r0.mEngineID
            return r1
    }

    public int getEngineIDWithType(int r1) {
            r0 = this;
            int r1 = r0.mEngineID
            return r1
    }

    public long getGlOverlayMgrPtr(int r6) {
            r5 = this;
            long r0 = r5.mNativeMapengineInstance
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Ld
            long r0 = nativeGetGlOverlayMgrPtr(r6, r0)
            return r0
        Ld:
            return r2
    }

    public boolean getIsProcessBuildingMark(int r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    public int[] getMapModeState(int r6, boolean r7) {
            r5 = this;
            long r0 = r5.mNativeMapengineInstance
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Lb
            nativeGetMapModeState(r6, r0, r7)
        Lb:
            r6 = 0
            return r6
    }

    public com.autonavi.base.ae.gmap.GLMapState getMapState(int r12) {
            r11 = this;
            java.util.concurrent.locks.Lock r0 = r11.mLock
            r0.lock()
            long r0 = r11.mNativeMapengineInstance     // Catch: java.lang.Throwable -> L24
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L27
            com.autonavi.base.ae.gmap.GLMapState r4 = r11.state     // Catch: java.lang.Throwable -> L24
            if (r4 != 0) goto L27
            long r9 = nativeGetCurrentMapState(r12, r0)     // Catch: java.lang.Throwable -> L24
            int r0 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r0 == 0) goto L27
            com.autonavi.base.ae.gmap.GLMapState r5 = new com.autonavi.base.ae.gmap.GLMapState     // Catch: java.lang.Throwable -> L24
            long r7 = r11.mNativeMapengineInstance     // Catch: java.lang.Throwable -> L24
            r6 = r12
            r5.<init>(r6, r7, r9)     // Catch: java.lang.Throwable -> L24
            r11.state = r5     // Catch: java.lang.Throwable -> L24
            goto L27
        L24:
            r0 = move-exception
            r12 = r0
            goto L2f
        L27:
            java.util.concurrent.locks.Lock r12 = r11.mLock
            r12.unlock()
            com.autonavi.base.ae.gmap.GLMapState r12 = r11.state
            return r12
        L2f:
            java.util.concurrent.locks.Lock r0 = r11.mLock
            r0.unlock()
            throw r12
    }

    public long getMapStateInstance(int r3) {
            r2 = this;
            r0 = 0
            return r0
    }

    public long getNativeInstance() {
            r2 = this;
            long r0 = r2.mNativeMapengineInstance
            return r0
    }

    public long getNativeMapController(int r6) {
            r5 = this;
            long r0 = r5.mNativeMapengineInstance
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Ld
            long r0 = nativeGetNativeMapController(r6, r0)
            return r0
        Ld:
            return r2
    }

    @Override // com.autonavi.amap.api.mapcore.IGLMapEngine
    public com.autonavi.amap.api.mapcore.IGLMapState getNewMapState(int r6) {
            r5 = this;
            java.util.concurrent.locks.Lock r0 = r5.mLock
            r0.lock()
            long r0 = r5.mNativeMapengineInstance     // Catch: java.lang.Throwable -> L18
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L1a
            com.autonavi.base.ae.gmap.GLMapState r2 = new com.autonavi.base.ae.gmap.GLMapState     // Catch: java.lang.Throwable -> L18
            r2.<init>(r6, r0)     // Catch: java.lang.Throwable -> L18
            java.util.concurrent.locks.Lock r6 = r5.mLock
            r6.unlock()
            return r2
        L18:
            r6 = move-exception
            goto L21
        L1a:
            java.util.concurrent.locks.Lock r6 = r5.mLock
            r6.unlock()
            r6 = 0
            return r6
        L21:
            java.util.concurrent.locks.Lock r0 = r5.mLock
            r0.unlock()
            throw r6
    }

    public com.autonavi.base.ae.gmap.gloverlay.GLOverlayBundle getOverlayBundle(int r1) {
            r0 = this;
            com.autonavi.base.ae.gmap.gloverlay.GLOverlayBundle<com.autonavi.base.ae.gmap.gloverlay.BaseMapOverlay<?, ?>> r1 = r0.bundle
            return r1
    }

    public android.graphics.Bitmap getScreenShot(int r8, int r9, int r10, int r11, int r12) {
            r7 = this;
            long r1 = r7.mNativeMapengineInstance
            r3 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L1b
            r0 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            int[] r8 = nativeGetScreenShot(r0, r1, r3, r4, r5, r6)
            int r11 = r5 - r3
            int r12 = r6 - r4
            r9 = 1
            android.graphics.Bitmap r8 = com.amap.api.col.p0003l.b3.p(r8, r11, r12, r9)
            return r8
        L1b:
            r8 = 0
            return r8
    }

    @Override // com.autonavi.base.amap.mapcore.IAMapEngineCallback
    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    public java.util.List<com.amap.api.maps.model.BitmapDescriptor> getSkyBoxImages() {
            r1 = this;
            com.autonavi.base.ae.gmap.TerrainOverlayProvider r0 = r1.terrainTileProvider
            java.util.List r0 = r0.getSkyBoxImages()
            return r0
    }

    public boolean getSrvViewStateBoolValue(int r6, int r7) {
            r5 = this;
            long r0 = r5.mNativeMapengineInstance
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Ld
            boolean r6 = nativeGetSrvViewStateBoolValue(r6, r0, r7)
            return r6
        Ld:
            r6 = 0
            return r6
    }

    public com.autonavi.amap.mapcore.AbstractCameraUpdateMessage getStateMessage() {
            r3 = this;
            java.util.List<com.autonavi.amap.mapcore.AbstractCameraUpdateMessage> r0 = r3.mStateMessageList
            monitor-enter(r0)
            java.util.List<com.autonavi.amap.mapcore.AbstractCameraUpdateMessage> r1 = r3.mStateMessageList     // Catch: java.lang.Throwable -> Le
            int r1 = r1.size()     // Catch: java.lang.Throwable -> Le
            if (r1 != 0) goto L10
            r1 = 0
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            return r1
        Le:
            r1 = move-exception
            goto L1b
        L10:
            java.util.List<com.autonavi.amap.mapcore.AbstractCameraUpdateMessage> r1 = r3.mStateMessageList     // Catch: java.lang.Throwable -> Le
            r2 = 0
            java.lang.Object r1 = r1.remove(r2)     // Catch: java.lang.Throwable -> Le
            com.autonavi.amap.mapcore.AbstractCameraUpdateMessage r1 = (com.autonavi.amap.mapcore.AbstractCameraUpdateMessage) r1     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            return r1
        L1b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
    }

    public int getStateMessageCount() {
            r1 = this;
            java.util.List<com.autonavi.amap.mapcore.AbstractCameraUpdateMessage> r0 = r1.mStateMessageList
            int r0 = r0.size()
            return r0
    }

    @Override // com.autonavi.base.amap.mapcore.IAMapEngineCallback
    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    public com.autonavi.base.ae.gmap.bean.InitStorageParam getStorageInitParam() {
            r1 = this;
            com.autonavi.base.ae.gmap.bean.InitStorageParam r0 = com.autonavi.base.ae.gmap.bean.InitStorageParam.obtain()
            return r0
    }

    @Override // com.autonavi.base.amap.mapcore.IAMapEngineCallback
    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    public com.autonavi.base.ae.gmap.bean.TileProviderInner getTerrainTileProvider() {
            r1 = this;
            com.autonavi.base.ae.gmap.TerrainOverlayProvider r0 = r1.terrainTileProvider
            com.autonavi.base.ae.gmap.bean.TileProviderInner r0 = r0.getTileProvider()
            return r0
    }

    public int hideBuildings(java.util.List<com.amap.api.maps.model.LatLng> r6) {
            r5 = this;
            long r0 = r5.mNativeMapengineInstance
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto La
            r6 = -1
            return r6
        La:
            int r0 = r6.size()
            com.amap.api.maps.model.LatLng[] r0 = new com.amap.api.maps.model.LatLng[r0]
            r6.toArray(r0)
            int r6 = r5.mEngineID
            long r1 = r5.mNativeMapengineInstance
            int r6 = nativeHideBuildings(r6, r1, r0)
            return r6
    }

    public void initMapOpenLayer(java.lang.String r6) {
            r5 = this;
            long r0 = r5.mNativeMapengineInstance
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L13
            if (r6 == 0) goto L13
            int r2 = r5.mEngineID
            byte[] r6 = r6.getBytes()
            nativeInitOpenLayer(r2, r0, r6)
        L13:
            return
    }

    public void initNativeTexture(int r6) {
            r5 = this;
            java.lang.String r0 = "arrow/arrow_line_inner.png"
            com.amap.api.maps.model.BitmapDescriptor r0 = com.amap.api.maps.model.BitmapDescriptorFactory.fromAsset(r0)     // Catch: java.lang.Throwable -> L39
            r1 = 0
            if (r0 == 0) goto Le
            android.graphics.Bitmap r0 = r0.getBitmap()     // Catch: java.lang.Throwable -> L39
            goto Lf
        Le:
            r0 = r1
        Lf:
            java.lang.String r2 = "arrow/arrow_line_outer.png"
            com.amap.api.maps.model.BitmapDescriptor r2 = com.amap.api.maps.model.BitmapDescriptorFactory.fromAsset(r2)     // Catch: java.lang.Throwable -> L39
            if (r2 == 0) goto L1c
            android.graphics.Bitmap r2 = r2.getBitmap()     // Catch: java.lang.Throwable -> L39
            goto L1d
        L1c:
            r2 = r1
        L1d:
            java.lang.String r3 = "arrow/arrow_line_shadow.png"
            com.amap.api.maps.model.BitmapDescriptor r3 = com.amap.api.maps.model.BitmapDescriptorFactory.fromAsset(r3)     // Catch: java.lang.Throwable -> L39
            if (r3 == 0) goto L29
            android.graphics.Bitmap r1 = r3.getBitmap()     // Catch: java.lang.Throwable -> L39
        L29:
            r3 = 111(0x6f, float:1.56E-43)
            r4 = 4
            r5.addOverlayTexture(r6, r0, r3, r4)     // Catch: java.lang.Throwable -> L39
            r0 = 222(0xde, float:3.11E-43)
            r5.addOverlayTexture(r6, r2, r0, r4)     // Catch: java.lang.Throwable -> L39
            r0 = 333(0x14d, float:4.67E-43)
            r5.addOverlayTexture(r6, r1, r0, r4)     // Catch: java.lang.Throwable -> L39
        L39:
            return
    }

    public void interruptAnimation() {
            r3 = this;
            int r0 = r3.mEngineID
            boolean r0 = r3.isInMapAnimation(r0)
            if (r0 == 0) goto L26
            com.autonavi.base.ae.gmap.glanimation.AdglMapAnimationMgr r0 = r3.mapAnimationMgr     // Catch: java.lang.Throwable -> L18
            com.amap.api.maps.AMap$CancelableCallback r0 = r0.getCancelCallback()     // Catch: java.lang.Throwable -> L18
            r3.doMapAnimationCancelCallback(r0)     // Catch: java.lang.Throwable -> L18
            int r0 = r3.mEngineID     // Catch: java.lang.Throwable -> L18
            r1 = 0
            r3.clearAnimations(r0, r1)     // Catch: java.lang.Throwable -> L18
            return
        L18:
            r0 = move-exception
            java.lang.Class r1 = r3.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "CancelableCallback.onCancel"
            com.amap.api.col.p0003l.w5.p(r0, r1, r2)
        L26:
            return
    }

    public boolean isEngineCreated(int r6) {
            r5 = this;
            long r0 = r5.mNativeMapengineInstance
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Ld
            boolean r6 = nativeIsEngineCreated(r0, r6)
            return r6
        Ld:
            r6 = 0
            return r6
    }

    public boolean isInMapAction(int r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    public boolean isInMapAnimation(int r1) {
            r0 = this;
            int r1 = r0.getAnimateionsCount()
            if (r1 <= 0) goto L8
            r1 = 1
            return r1
        L8:
            r1 = 0
            return r1
    }

    public boolean isNetworkConnected() {
            r1 = this;
            boolean r0 = r1.isNetworkConnected
            return r0
    }

    @Override // com.autonavi.base.amap.mapcore.IAMapEngineCallback
    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    public void onAMapAppResourceRequest(com.autonavi.base.ae.gmap.AMapAppRequestParam r2) {
            r1 = this;
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r1.mGlMapView
            if (r0 == 0) goto L7
            r0.onAMapAppResourceRequest(r2)
        L7:
            return
    }

    public void onClearCache(int r1) {
            r0 = this;
            return
    }

    @Override // com.autonavi.base.amap.mapcore.IAMapEngineCallback
    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    public void onMapBlandClick(double r2, double r4) {
            r1 = this;
            com.autonavi.base.amap.mapcore.interfaces.IAMapListener r0 = r1.mMapListener
            if (r0 == 0) goto L7
            r0.onMapBlankClick(r2, r4)
        L7:
            return
    }

    @Override // com.autonavi.base.amap.mapcore.IAMapEngineCallback
    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    public void onMapPOIClick(com.autonavi.base.ae.gmap.MapPoi r2) {
            r1 = this;
            com.autonavi.base.amap.mapcore.interfaces.IAMapListener r0 = r1.mMapListener
            if (r0 == 0) goto L7
            r0.onMapPOIClick(r2)
        L7:
            return
    }

    @Override // com.autonavi.base.amap.mapcore.IAMapEngineCallback
    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    public void onMapRender(int r2, int r3) {
            r1 = this;
            r0 = 5
            if (r3 == r0) goto L2a
            r0 = 6
            if (r3 == r0) goto L1e
            r0 = 7
            if (r3 == r0) goto L12
            r2 = 13
            if (r3 == r2) goto Le
            goto L35
        Le:
            r2 = 1
            r1.isEngineRenderComplete = r2     // Catch: java.lang.Throwable -> L35
            return
        L12:
            com.autonavi.base.amap.mapcore.interfaces.IAMapListener r3 = r1.mMapListener     // Catch: java.lang.Throwable -> L35
            if (r3 == 0) goto L35
            com.autonavi.base.ae.gmap.GLMapState r0 = r1.getMapState(r2)     // Catch: java.lang.Throwable -> L35
            r3.afterRendererOver(r2, r0)     // Catch: java.lang.Throwable -> L35
            return
        L1e:
            com.autonavi.base.amap.mapcore.interfaces.IAMapListener r3 = r1.mMapListener     // Catch: java.lang.Throwable -> L35
            if (r3 == 0) goto L35
            com.autonavi.base.ae.gmap.GLMapState r0 = r1.getMapState(r2)     // Catch: java.lang.Throwable -> L35
            r3.afterDrawLabel(r2, r0)     // Catch: java.lang.Throwable -> L35
            return
        L2a:
            com.autonavi.base.amap.mapcore.interfaces.IAMapListener r3 = r1.mMapListener     // Catch: java.lang.Throwable -> L35
            if (r3 == 0) goto L35
            com.autonavi.base.ae.gmap.GLMapState r0 = r1.getMapState(r2)     // Catch: java.lang.Throwable -> L35
            r3.beforeDrawLabel(r2, r0)     // Catch: java.lang.Throwable -> L35
        L35:
            return
    }

    public void popRendererState() {
            r5 = this;
            long r0 = r5.mNativeMapengineInstance
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Ld
            int r2 = r5.mEngineID
            nativePopRenderState(r2, r0)
        Ld:
            return
    }

    public void pushRendererState() {
            r5 = this;
            long r0 = r5.mNativeMapengineInstance
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Ld
            int r2 = r5.mEngineID
            nativePushRendererState(r2, r0)
        Ld:
            return
    }

    public void putResourceData(int r1, byte[] r2) {
            r0 = this;
            return
    }

    @Override // com.autonavi.base.amap.mapcore.IAMapEngineCallback
    public void reloadMapResource(int r1, java.lang.String r2, int r3) {
            r0 = this;
            return
    }

    public void removeNativeAllOverlay(int r6) {
            r5 = this;
            long r0 = r5.mNativeMapengineInstance
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Lb
            nativeRemoveNativeAllOverlay(r6, r0)
        Lb:
            return
    }

    public void removeNativeOverlay(int r6, java.lang.String r7) {
            r5 = this;
            long r0 = r5.mNativeMapengineInstance
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Ld
            if (r7 == 0) goto Ld
            nativeRemoveNativeOverlay(r6, r0, r7)
        Ld:
            return
    }

    public void renderAMap() {
            r5 = this;
            long r0 = r5.mNativeMapengineInstance
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L35
            boolean r0 = r5.processMessage()
            java.lang.Class<com.autonavi.base.ae.gmap.GLMapEngine> r1 = com.autonavi.base.ae.gmap.GLMapEngine.class
            monitor-enter(r1)
            long r2 = r5.mNativeMapengineInstance     // Catch: java.lang.Throwable -> L32
            int r4 = r5.mEngineID     // Catch: java.lang.Throwable -> L32
            nativeRenderAMap(r2, r4)     // Catch: java.lang.Throwable -> L32
            long r2 = r5.mNativeMapengineInstance     // Catch: java.lang.Throwable -> L32
            int r4 = r5.mEngineID     // Catch: java.lang.Throwable -> L32
            nativePostRenderAMap(r2, r4)     // Catch: java.lang.Throwable -> L32
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L32
            r5.initAnimation()
            if (r0 == 0) goto L26
            r5.startCheckEngineRenderComplete()
        L26:
            boolean r0 = r5.isEngineRenderComplete
            if (r0 != 0) goto L35
            int r0 = r5.mEngineID
            long r1 = r5.mNativeMapengineInstance
            nativeSetRenderListenerStatus(r0, r1)
            return
        L32:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L32
            throw r0
        L35:
            return
    }

    @Override // com.autonavi.base.amap.mapcore.IAMapEngineCallback
    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    public byte[] requireCharBitmap(int r1, int r2, int r3) {
            r0 = this;
            com.autonavi.base.amap.mapcore.tools.TextTextureGenerator r1 = r0.mTextTextureGenerator
            byte[] r1 = r1.getTextPixelBuffer(r2, r3)
            return r1
    }

    @Override // com.autonavi.base.amap.mapcore.IAMapEngineCallback
    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    public byte[] requireCharsWidths(int r1, int[] r2, int r3, int r4) {
            r0 = this;
            com.autonavi.base.amap.mapcore.tools.TextTextureGenerator r1 = r0.mTextTextureGenerator
            byte[] r1 = r1.getCharsWidths(r2)
            return r1
    }

    @Override // com.autonavi.base.amap.mapcore.IAMapEngineCallback
    public void requireMapRender(int r1, int r2, int r3) {
            r0 = this;
            return
    }

    @Override // com.autonavi.base.amap.mapcore.IAMapEngineCallback
    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    public byte[] requireMapResource(int r5, java.lang.String r6) {
            r4 = this;
            r5 = 0
            if (r6 != 0) goto L4
            return r5
        L4:
            java.lang.String r0 = "map_assets/"
            java.lang.String r0 = r0.concat(r6)
            java.lang.String r1 = "icons_5"
            java.lang.String r2 = "bktile"
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r3 = r4.mGlMapView     // Catch: java.lang.Throwable -> L2f
            com.autonavi.base.amap.mapcore.MapConfig r3 = r3.getMapConfig()     // Catch: java.lang.Throwable -> L2f
            boolean r3 = r3.isCustomStyleEnable()     // Catch: java.lang.Throwable -> L2f
            if (r3 == 0) goto L66
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r3 = r4.mGlMapView     // Catch: java.lang.Throwable -> L2f
            com.amap.api.col.3l.v8 r3 = r3.getCustomStyleManager()     // Catch: java.lang.Throwable -> L2f
            if (r3 == 0) goto L31
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r3 = r4.mGlMapView     // Catch: java.lang.Throwable -> L2f
            com.amap.api.col.3l.v8 r3 = r3.getCustomStyleManager()     // Catch: java.lang.Throwable -> L2f
            byte[] r3 = r3.i(r6)     // Catch: java.lang.Throwable -> L2f
            if (r3 == 0) goto L32
            return r3
        L2f:
            r6 = move-exception
            goto L6d
        L31:
            r3 = r5
        L32:
            boolean r1 = r6.startsWith(r1)     // Catch: java.lang.Throwable -> L2f
            if (r1 == 0) goto L47
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r6 = r4.mGlMapView     // Catch: java.lang.Throwable -> L2f
            com.autonavi.base.amap.mapcore.MapConfig r6 = r6.getMapConfig()     // Catch: java.lang.Throwable -> L2f
            java.lang.String r6 = r6.getCustomTextureResourcePath()     // Catch: java.lang.Throwable -> L2f
            byte[] r3 = com.autonavi.base.amap.mapcore.FileUtil.readFileContents(r6)     // Catch: java.lang.Throwable -> L2f
            goto L63
        L47:
            boolean r6 = r6.startsWith(r2)     // Catch: java.lang.Throwable -> L2f
            if (r6 == 0) goto L63
            android.content.Context r6 = r4.context     // Catch: java.lang.Throwable -> L2f
            byte[] r3 = com.autonavi.base.amap.mapcore.FileUtil.readFileContentsFromAssets(r6, r0)     // Catch: java.lang.Throwable -> L2f
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r6 = r4.mGlMapView     // Catch: java.lang.Throwable -> L2f
            com.autonavi.base.amap.mapcore.MapConfig r6 = r6.getMapConfig()     // Catch: java.lang.Throwable -> L2f
            int r6 = r6.getCustomBackgroundColor()     // Catch: java.lang.Throwable -> L2f
            if (r6 == 0) goto L63
            byte[] r3 = com.amap.api.col.p0003l.b3.S(r3, r6)     // Catch: java.lang.Throwable -> L2f
        L63:
            if (r3 == 0) goto L66
            return r3
        L66:
            android.content.Context r6 = r4.context     // Catch: java.lang.Throwable -> L2f
            byte[] r5 = com.autonavi.base.amap.mapcore.FileUtil.readFileContentsFromAssets(r6, r0)     // Catch: java.lang.Throwable -> L2f
            return r5
        L6d:
            com.amap.api.col.p0003l.b3.D(r6)
            return r5
    }

    public void setAllContentEnable(int r6, boolean r7) {
            r5 = this;
            long r0 = r5.mNativeMapengineInstance
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L16
            r2 = 0
            if (r7 == 0) goto L10
            r7 = 1
            nativeSetAllContentEnable(r6, r0, r7)
            goto L13
        L10:
            nativeSetAllContentEnable(r6, r0, r2)
        L13:
            r5.setSimple3DEnable(r6, r2)
        L16:
            return
    }

    public void setBackgroundTexture(int r6, byte[] r7) {
            r5 = this;
            if (r7 != 0) goto L3
            goto Le
        L3:
            long r0 = r5.mNativeMapengineInstance
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Le
            nativeSetSetBackgroundTexture(r6, r0, r7)
        Le:
            return
    }

    public void setBuildingEnable(int r6, boolean r7) {
            r5 = this;
            long r0 = r5.mNativeMapengineInstance
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Lb
            nativeSetBuildingEnable(r6, r0, r7)
        Lb:
            return
    }

    public void setBuildingTextureEnable(int r6, boolean r7) {
            r5 = this;
            long r0 = r5.mNativeMapengineInstance
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Lb
            nativeSetBuildingTextureEnable(r6, r0, r7)
        Lb:
            return
    }

    public void setCustomStyleData(int r6, byte[] r7, byte[] r8) {
            r5 = this;
            if (r7 != 0) goto L3
            goto Le
        L3:
            long r0 = r5.mNativeMapengineInstance
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Le
            nativeSetCustomStyleData(r6, r0, r7, r8)
        Le:
            return
    }

    public void setCustomStyleTexture(int r6, byte[] r7) {
            r5 = this;
            if (r7 != 0) goto L3
            goto Le
        L3:
            long r0 = r5.mNativeMapengineInstance
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Le
            nativeSetCustomStyleTexture(r6, r0, r7)
        Le:
            return
    }

    public void setCustomThirdLayerStyle(int r5, java.lang.String r6) {
            r4 = this;
            boolean r5 = android.text.TextUtils.isEmpty(r6)
            if (r5 == 0) goto L7
            goto L14
        L7:
            long r0 = r4.mNativeMapengineInstance
            r2 = 0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto L14
            int r5 = r4.mEngineID
            nativeSetCustomThirdLayerStyle(r5, r0, r6)
        L14:
            return
    }

    public void setHighlightSubwayEnable(int r6, boolean r7) {
            r5 = this;
            long r0 = r5.mNativeMapengineInstance
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Lb
            nativeSetHighlightSubwayEnable(r6, r0, r7)
        Lb:
            return
    }

    public void setIndoorBuildingToBeActive(int r8, java.lang.String r9, int r10, java.lang.String r11) {
            r7 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 != 0) goto L1c
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            if (r0 == 0) goto Ld
            goto L1c
        Ld:
            long r2 = r7.mNativeMapengineInstance
            r0 = 0
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 == 0) goto L1c
            r1 = r8
            r4 = r9
            r5 = r10
            r6 = r11
            nativeSetIndoorBuildingToBeActive(r1, r2, r4, r5, r6)
        L1c:
            return
    }

    public void setIndoorEnable(int r6, boolean r7) {
            r5 = this;
            long r0 = r5.mNativeMapengineInstance
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Lb
            nativeSetIndoorEnable(r6, r0, r7)
        Lb:
            return
    }

    public void setLabelEnable(int r6, boolean r7) {
            r5 = this;
            long r0 = r5.mNativeMapengineInstance
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Lb
            nativeSetLabelEnable(r6, r0, r7)
        Lb:
            return
    }

    public void setMapListener(com.autonavi.base.amap.mapcore.interfaces.IAMapListener r1) {
            r0 = this;
            r0.mMapListener = r1
            return
    }

    public boolean setMapModeAndStyle(int r6, int r7, int r8, boolean r9, com.autonavi.base.ae.gmap.style.StyleItem[] r10) {
            r5 = this;
            long r0 = r5.mNativeMapengineInstance
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto La
            r6 = 0
            return r6
        La:
            boolean r0 = r5.setNativeMapModeAndStyle(r6, r7, r8)
            if (r10 == 0) goto L6e
            if (r9 == 0) goto L6e
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r7 = r5.mGlMapView
            com.autonavi.base.amap.mapcore.MapConfig r7 = r7.getMapConfig()
            int r7 = r7.getCustomBackgroundColor()
            if (r7 == 0) goto L40
            android.content.Context r8 = r5.context
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "map_custom"
            r9.<init>(r10)
            java.lang.String r10 = java.io.File.separator
            r9.append(r10)
            java.lang.String r10 = "custom_bktile.data"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            byte[] r8 = com.autonavi.base.amap.mapcore.FileUtil.readFileContentsFromAssets(r8, r9)
            byte[] r7 = com.amap.api.col.p0003l.b3.S(r8, r7)
            r5.setBackgroundTexture(r6, r7)
        L40:
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r7 = r5.mGlMapView
            com.autonavi.base.amap.mapcore.MapConfig r7 = r7.getMapConfig()
            java.lang.String r7 = r7.getCustomTextureResourcePath()
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r8 = r5.mGlMapView
            com.autonavi.base.amap.mapcore.MapConfig r8 = r8.getMapConfig()
            boolean r8 = r8.isProFunctionAuthEnable()
            if (r8 == 0) goto Laa
            boolean r8 = android.text.TextUtils.isEmpty(r7)
            if (r8 != 0) goto Laa
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r8 = r5.mGlMapView
            com.autonavi.base.amap.mapcore.MapConfig r8 = r8.getMapConfig()
            r9 = 1
            r8.setUseProFunction(r9)
            byte[] r7 = com.autonavi.base.amap.mapcore.FileUtil.readFileContents(r7)
            r5.setCustomStyleTexture(r6, r7)
            return r0
        L6e:
            if (r7 != 0) goto Laa
            if (r8 != 0) goto Laa
            android.content.Context r7 = r5.context
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "map_assets"
            r8.<init>(r9)
            java.lang.String r10 = java.io.File.separator
            r8.append(r10)
            java.lang.String r1 = "bktile.data"
            r8.append(r1)
            java.lang.String r8 = r8.toString()
            byte[] r7 = com.autonavi.base.amap.mapcore.FileUtil.readFileContentsFromAssets(r7, r8)
            r5.setBackgroundTexture(r6, r7)
            android.content.Context r7 = r5.context
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r9)
            r8.append(r10)
            java.lang.String r9 = "icons_5_21_1680057953.data"
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            byte[] r7 = com.autonavi.base.amap.mapcore.FileUtil.readFileContentsFromAssets(r7, r8)
            r5.setCustomStyleTexture(r6, r7)
        Laa:
            return r0
    }

    public void setMapOpenLayerEnable(boolean r6) {
            r5 = this;
            long r0 = r5.mNativeMapengineInstance
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Ld
            int r2 = r5.mEngineID
            nativeSetOpenLayerEnable(r2, r0, r6)
        Ld:
            return
    }

    public void setMapState(int r2, com.autonavi.base.ae.gmap.GLMapState r3) {
            r1 = this;
            r0 = 1
            r1.setMapState(r2, r3, r0)
            return
    }

    public void setMapState(int r6, com.autonavi.base.ae.gmap.GLMapState r7, boolean r8) {
            r5 = this;
            long r0 = r5.mNativeMapengineInstance
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L30
            if (r8 == 0) goto L19
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r8 = r5.mGlMapView
            if (r8 == 0) goto L19
            com.autonavi.base.amap.mapcore.MapConfig r8 = r8.getMapConfig()
            if (r8 == 0) goto L19
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r8 = r5.mGlMapView
            r8.checkMapState(r7)
        L19:
            java.util.concurrent.locks.Lock r8 = r5.mLock
            r8.lock()
            long r0 = r5.mNativeMapengineInstance     // Catch: java.lang.Throwable -> L29
            r7.setNativeMapengineState(r6, r0)     // Catch: java.lang.Throwable -> L29
            java.util.concurrent.locks.Lock r6 = r5.mLock
            r6.unlock()
            return
        L29:
            r6 = move-exception
            java.util.concurrent.locks.Lock r7 = r5.mLock
            r7.unlock()
            throw r6
        L30:
            return
    }

    public boolean setNativeMapModeAndStyle(int r6, int r7, int r8) {
            r5 = this;
            long r0 = r5.mNativeMapengineInstance
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto La
            r6 = 0
            return r6
        La:
            int[] r7 = new int[]{r7, r8}
            boolean r6 = nativeSetMapModeAndStyle(r6, r0, r7)
            return r6
    }

    public void setNaviLabelEnable(int r7, boolean r8, int r9, int r10) {
            r6 = this;
            long r1 = r6.mNativeMapengineInstance
            r3 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto Lf
            r0 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            nativeSetNaviLabelEnable(r0, r1, r3, r4, r5)
        Lf:
            return
    }

    public void setNetStatus(boolean r6) {
            r5 = this;
            boolean r0 = r5.mRequestDestroy
            if (r0 == 0) goto L5
            goto Ld
        L5:
            long r0 = r5.mNativeMapengineInstance
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto Le
        Ld:
            return
        Le:
            nativeSetNetStatus(r0, r6)
            return
    }

    public void setOfflineDataEnable(int r6, boolean r7) {
            r5 = this;
            long r0 = r5.mNativeMapengineInstance
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Lb
            nativeSetOfflineDataEnable(r6, r0, r7)
        Lb:
            return
    }

    public void setOvelayBundle(int r1, com.autonavi.base.ae.gmap.gloverlay.GLOverlayBundle<com.autonavi.base.ae.gmap.gloverlay.BaseMapOverlay<?, ?>> r2) {
            r0 = this;
            r0.bundle = r2
            return
    }

    public void setParamater(int r10, int r11, int r12, int r13, int r14, int r15) {
            r9 = this;
            java.util.concurrent.locks.Lock r0 = r9.mLock
            r0.lock()
            long r2 = r9.mNativeMapengineInstance     // Catch: java.lang.Throwable -> L17
            r0 = 0
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 == 0) goto L1a
            r1 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r8 = r15
            nativeSetParameter(r1, r2, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L17
            goto L1a
        L17:
            r0 = move-exception
            r10 = r0
            goto L20
        L1a:
            java.util.concurrent.locks.Lock r10 = r9.mLock
            r10.unlock()
            return
        L20:
            java.util.concurrent.locks.Lock r11 = r9.mLock
            r11.unlock()
            throw r10
    }

    public void setProjectionCenter(int r6, int r7, int r8) {
            r5 = this;
            long r0 = r5.mNativeMapengineInstance
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Ld
            float r7 = (float) r7
            float r8 = (float) r8
            nativeSetProjectionCenter(r6, r0, r7, r8)
        Ld:
            return
    }

    public void setRoadArrowEnable(int r6, boolean r7) {
            r5 = this;
            long r0 = r5.mNativeMapengineInstance
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Lb
            nativeSetRoadArrowEnable(r6, r0, r7)
        Lb:
            return
    }

    public void setServiceViewRect(int r10, int r11, int r12, int r13, int r14, int r15, int r16) {
            r9 = this;
            long r1 = r9.mNativeMapengineInstance
            r0 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r7 = r15
            r8 = r16
            nativeSetServiceViewRect(r0, r1, r3, r4, r5, r6, r7, r8)
            return
    }

    public void setSimple3DEnable(int r6, boolean r7) {
            r5 = this;
            long r0 = r5.mNativeMapengineInstance
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Lb
            nativeSetSimple3DEnable(r6, r0, r7)
        Lb:
            return
    }

    public void setSkyTexture(int r6, byte[] r7) {
            r5 = this;
            if (r7 != 0) goto L3
            goto Le
        L3:
            long r0 = r5.mNativeMapengineInstance
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Le
            nativeSetSkyTexture(r6, r0, r7)
        Le:
            return
    }

    public void setSrvViewStateBoolValue(int r6, int r7, boolean r8) {
            r5 = this;
            long r0 = r5.mNativeMapengineInstance
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Lb
            nativeSetSrvViewStateBoolValue(r6, r0, r7, r8)
        Lb:
            return
    }

    public void setStyleChangeGradualEnable(int r6, boolean r7) {
            r5 = this;
            long r0 = r5.mNativeMapengineInstance
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Lb
            nativeSetStyleChangeGradualEnable(r6, r0, r7)
        Lb:
            return
    }

    public void setTerrainAuth(boolean r6) {
            r5 = this;
            long r0 = r5.mNativeMapengineInstance
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L9
            return
        L9:
            int r2 = r5.mEngineID
            nativeSetTerrainAuth(r2, r0, r6)
            return
    }

    public void setTrafficEnable(int r6, boolean r7) {
            r5 = this;
            long r0 = r5.mNativeMapengineInstance
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Lb
            nativeSetTrafficEnable(r6, r0, r7)
        Lb:
            return
    }

    public void setTrafficStyleWithTexture(int r12, byte[] r13, com.amap.api.maps.model.MyTrafficStyle r14) {
            r11 = this;
            long r1 = r11.mNativeMapengineInstance
            r3 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L26
            if (r14 != 0) goto Lb
            goto L26
        Lb:
            int r0 = r13.length
            long r4 = (long) r0
            int r6 = r14.getExtremelySmoothColor()
            int r7 = r14.getSmoothColor()
            int r8 = r14.getSlowColor()
            int r9 = r14.getCongestedColor()
            int r10 = r14.getSeriousCongestedColor()
            r0 = r12
            r3 = r13
            nativeSetTrafficTexture(r0, r1, r3, r4, r6, r7, r8, r9, r10)
        L26:
            return
    }

    public void setTrafficStyleWithTextureData(int r6, byte[] r7) {
            r5 = this;
            long r0 = r5.mNativeMapengineInstance
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Ld
            if (r7 == 0) goto Ld
            nativeSetTrafficTextureAllInOne(r6, r0, r7)
        Ld:
            return
    }

    public void setVectorOverlayPath(java.lang.String r6) {
            r5 = this;
            long r0 = r5.mNativeMapengineInstance
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L9
            return
        L9:
            int r2 = r5.mEngineID
            nativeSetVectorOverlayPath(r2, r0, r6)
            return
    }

    public void showHideBuildings(int r6) {
            r5 = this;
            long r0 = r5.mNativeMapengineInstance
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L9
            return
        L9:
            int r2 = r5.mEngineID
            nativeShowHideBuildings(r2, r0, r6)
            return
    }

    public void startCheckEngineRenderComplete() {
            r1 = this;
            r0 = 0
            r1.isEngineRenderComplete = r0
            return
    }

    public void startMapSlidAnim(int r7, android.graphics.Point r8, float r9, float r10) {
            r6 = this;
            if (r8 != 0) goto L4
            goto La7
        L4:
            r8 = 1
            r6.clearAnimations(r7, r8)     // Catch: java.lang.Throwable -> La7
            com.autonavi.base.ae.gmap.GLMapState r7 = r6.getCloneMapState()     // Catch: java.lang.Throwable -> La7
            r7.reset()     // Catch: java.lang.Throwable -> La7
            r7.recalculate()     // Catch: java.lang.Throwable -> La7
            float r0 = java.lang.Math.abs(r9)     // Catch: java.lang.Throwable -> La7
            float r1 = java.lang.Math.abs(r10)     // Catch: java.lang.Throwable -> La7
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 <= 0) goto L20
            r3 = r0
            goto L21
        L20:
            r3 = r1
        L21:
            r4 = 1178304512(0x463b8000, float:12000.0)
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 <= 0) goto L4c
            r3 = -969179136(0xffffffffc63b8000, float:-12000.0)
            r5 = 0
            if (r2 <= 0) goto L3b
            int r9 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r9 <= 0) goto L35
            r3 = 1178304512(0x463b8000, float:12000.0)
        L35:
            float r4 = r4 / r0
            float r4 = r4 * r10
            r9 = r3
            r10 = r4
            goto L4c
        L3b:
            float r0 = r4 / r1
            float r0 = r0 * r9
            int r9 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r9 <= 0) goto L48
            r9 = r0
            r10 = 1178304512(0x463b8000, float:12000.0)
            goto L4c
        L48:
            r9 = r0
            r10 = -969179136(0xffffffffc63b8000, float:-12000.0)
        L4c:
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r6.mGlMapView     // Catch: java.lang.Throwable -> La7
            com.autonavi.base.amap.mapcore.MapConfig r0 = r0.getMapConfig()     // Catch: java.lang.Throwable -> La7
            boolean r0 = r0.isTerrainEnable()     // Catch: java.lang.Throwable -> La7
            r1 = 0
            r2 = 500(0x1f4, float:7.0E-43)
            if (r0 == 0) goto L6c
            com.autonavi.base.ae.gmap.glanimation.AdglMapAnimFlingP20 r8 = new com.autonavi.base.ae.gmap.glanimation.AdglMapAnimFlingP20     // Catch: java.lang.Throwable -> La7
            r8.<init>(r2)     // Catch: java.lang.Throwable -> La7
            r8.setPositionAndVelocity(r9, r10)     // Catch: java.lang.Throwable -> La7
            r8.commitAnimation(r7)     // Catch: java.lang.Throwable -> La7
            com.autonavi.base.ae.gmap.glanimation.AdglMapAnimationMgr r7 = r6.mapAnimationMgr     // Catch: java.lang.Throwable -> La7
            r7.addAnimation(r8, r1)     // Catch: java.lang.Throwable -> La7
            return
        L6c:
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r6.mGlMapView     // Catch: java.lang.Throwable -> La7
            int r0 = r0.getMapWidth()     // Catch: java.lang.Throwable -> La7
            int r0 = r0 >> r8
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r3 = r6.mGlMapView     // Catch: java.lang.Throwable -> La7
            int r3 = r3.getMapHeight()     // Catch: java.lang.Throwable -> La7
            int r8 = r3 >> 1
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r3 = r6.mGlMapView     // Catch: java.lang.Throwable -> La7
            boolean r3 = r3.isUseAnchor()     // Catch: java.lang.Throwable -> La7
            if (r3 == 0) goto L97
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r8 = r6.mGlMapView     // Catch: java.lang.Throwable -> La7
            com.autonavi.base.amap.mapcore.MapConfig r8 = r8.getMapConfig()     // Catch: java.lang.Throwable -> La7
            int r0 = r8.getAnchorX()     // Catch: java.lang.Throwable -> La7
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r8 = r6.mGlMapView     // Catch: java.lang.Throwable -> La7
            com.autonavi.base.amap.mapcore.MapConfig r8 = r8.getMapConfig()     // Catch: java.lang.Throwable -> La7
            int r8 = r8.getAnchorY()     // Catch: java.lang.Throwable -> La7
        L97:
            com.autonavi.base.ae.gmap.glanimation.AdglMapAnimFling r3 = new com.autonavi.base.ae.gmap.glanimation.AdglMapAnimFling     // Catch: java.lang.Throwable -> La7
            r3.<init>(r2, r0, r8)     // Catch: java.lang.Throwable -> La7
            r3.setPositionAndVelocity(r9, r10)     // Catch: java.lang.Throwable -> La7
            r3.commitAnimation(r7)     // Catch: java.lang.Throwable -> La7
            com.autonavi.base.ae.gmap.glanimation.AdglMapAnimationMgr r7 = r6.mapAnimationMgr     // Catch: java.lang.Throwable -> La7
            r7.addAnimation(r3, r1)     // Catch: java.lang.Throwable -> La7
        La7:
            return
    }

    public void startPivotZoomRotateAnim(int r1, android.graphics.Point r2, float r3, int r4, int r5) {
            r0 = this;
            return
    }

    public void triggerMainThread() {
            r3 = this;
            int r0 = r3.mEngineID
            long r1 = r3.mNativeMapengineInstance
            nativeMainThreadTrigger(r0, r1)
            return
    }

    public void updateNativeArrowOverlay(int r15, java.lang.String r16, int[] r17, int[] r18, int r19, int r20, int r21, float r22, int r23, int r24, int r25, boolean r26) {
            r14 = this;
            long r1 = r14.mNativeMapengineInstance
            r3 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L24
            if (r16 == 0) goto L24
            r0 = r15
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r9 = r22
            r11 = r23
            r12 = r24
            r13 = r25
            r10 = r26
            nativeUpdateNativeArrowOverlay(r0, r1, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
        L24:
            return
    }
}

package com.amap.api.maps;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class MapsInitializer {
    public static final int HTTP = 1;
    public static final int HTTPS = 2;
    public static java.lang.String TERRAIN_LOCAL_DEM_SOURCE_PATH = null;
    private static boolean closeTileOverlay = false;
    private static com.amap.api.maps.ExceptionLogger exceptionLogger = null;
    private static boolean isContourLineEnable = false;
    private static boolean isLoadWorldGridMap = false;
    private static boolean isNeedDownloadCoordinateConvertLibrary = true;
    private static boolean isNetWorkEnable = true;
    private static boolean isPolyline2Enable = true;
    private static boolean isSupportRecycleView = true;
    private static boolean isTerrainEnable = false;
    private static boolean isTextureDestroyedRender = false;
    private static boolean isTextureSizeChangedInvoked = false;
    private static boolean isTextureViewDestorySync = true;
    private static boolean isloadWorldVectorMap = true;
    private static int mProtocol = 1;
    private static java.lang.String mWorldVectorOfflineMapStyleAssetsPath = "";
    private static java.lang.String mWorldVectorOfflineMapStyleFilePath = "";
    public static java.lang.String sdcardDir = "";

    static {
            return
    }

    public MapsInitializer() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void disableCachedMapDataUpdate(boolean r0) {
            return
    }

    public static java.lang.String getDeviceId(android.content.Context r0) {
            java.lang.String r0 = com.amap.api.col.p0003l.i4.a0(r0)
            return r0
    }

    public static com.amap.api.maps.ExceptionLogger getExceptionLogger() {
            com.amap.api.maps.ExceptionLogger r0 = com.amap.api.maps.MapsInitializer.exceptionLogger
            return r0
    }

    public static boolean getNetWorkEnable() {
            boolean r0 = com.amap.api.maps.MapsInitializer.isNetWorkEnable
            return r0
    }

    public static boolean getPolyline2Enable() {
            r0 = 1
            return r0
    }

    public static int getProtocol() {
            int r0 = com.amap.api.maps.MapsInitializer.mProtocol
            return r0
    }

    public static boolean getTextureDestroyRender() {
            boolean r0 = com.amap.api.maps.MapsInitializer.isTextureDestroyedRender
            return r0
    }

    public static boolean getTextureSizeChangedInvoked() {
            boolean r0 = com.amap.api.maps.MapsInitializer.isTextureSizeChangedInvoked
            return r0
    }

    public static boolean getTextureViewDestorySync() {
            boolean r0 = com.amap.api.maps.MapsInitializer.isTextureViewDestorySync
            return r0
    }

    public static java.lang.String getVersion() {
            java.lang.String r0 = "10.0.600"
            return r0
    }

    public static java.lang.String getWorldVectorOfflineMapStyleAssetsPath() {
            java.lang.String r0 = com.amap.api.maps.MapsInitializer.mWorldVectorOfflineMapStyleAssetsPath
            return r0
    }

    public static java.lang.String getWorldVectorOfflineMapStyleFilePath() {
            java.lang.String r0 = com.amap.api.maps.MapsInitializer.mWorldVectorOfflineMapStyleFilePath
            return r0
    }

    public static void initialize(android.content.Context r0) throws android.os.RemoteException {
            if (r0 == 0) goto Lc
            android.content.Context r0 = r0.getApplicationContext()
            android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)
            com.amap.api.col.p0003l.d.f3124f = r0
        Lc:
            return
    }

    public static boolean isContourLineEnable() {
            boolean r0 = com.amap.api.maps.MapsInitializer.isContourLineEnable
            return r0
    }

    public static boolean isDisableCachedMapDataUpdate() {
            r0 = 0
            return r0
    }

    public static boolean isDownloadCoordinateConvertLibrary() {
            boolean r0 = com.amap.api.maps.MapsInitializer.isNeedDownloadCoordinateConvertLibrary
            return r0
    }

    public static boolean isLoadWorldGridMap() {
            boolean r0 = com.amap.api.maps.MapsInitializer.isLoadWorldGridMap
            return r0
    }

    public static boolean isLoadWorldVectorMap() {
            boolean r0 = com.amap.api.maps.MapsInitializer.isloadWorldVectorMap
            return r0
    }

    public static boolean isSupportRecycleView() {
            boolean r0 = com.amap.api.maps.MapsInitializer.isSupportRecycleView
            return r0
    }

    public static boolean isTerrainEnable() {
            boolean r0 = com.amap.api.maps.MapsInitializer.isTerrainEnable
            return r0
    }

    public static void loadWorldVectorMap(boolean r0) {
            com.amap.api.maps.MapsInitializer.isloadWorldVectorMap = r0
            return
    }

    public static void setApiKey(java.lang.String r1) {
            if (r1 == 0) goto L11
            java.lang.String r0 = r1.trim()
            int r0 = r0.length()
            if (r0 <= 0) goto L11
            android.content.Context r0 = com.amap.api.col.p0003l.d.f3124f
            com.amap.api.col.p0003l.g4.l(r0, r1)
        L11:
            return
    }

    public static void setBuildingHeight(int r0) {
            return
    }

    public static void setContourLIneEnable(boolean r0) {
            com.amap.api.maps.MapsInitializer.isContourLineEnable = r0
            return
    }

    public static void setDownloadCoordinateConvertLibrary(boolean r0) {
            com.amap.api.maps.MapsInitializer.isNeedDownloadCoordinateConvertLibrary = r0
            return
    }

    public static void setExceptionLogger(com.amap.api.maps.ExceptionLogger r0) {
            com.amap.api.maps.MapsInitializer.exceptionLogger = r0
            return
    }

    public static void setHost(java.lang.String r1) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto Le
            r1 = -1
            com.amap.api.col.p0003l.s6.a = r1
            java.lang.String r1 = ""
            com.amap.api.col.p0003l.s6.f3973b = r1
            return
        Le:
            r0 = 1
            com.amap.api.col.p0003l.s6.a = r0
            com.amap.api.col.p0003l.s6.f3973b = r1
            return
    }

    public static void setNetWorkEnable(boolean r0) {
            com.amap.api.maps.MapsInitializer.isNetWorkEnable = r0
            return
    }

    public static void setPolyline2Enable(boolean r0) {
            return
    }

    public static void setProtocol(int r0) {
            com.amap.api.maps.MapsInitializer.mProtocol = r0
            return
    }

    public static void setSupportRecycleView(boolean r0) {
            com.amap.api.maps.MapsInitializer.isSupportRecycleView = r0
            return
    }

    public static void setTerrainEnable(boolean r0) {
            com.amap.api.maps.MapsInitializer.isTerrainEnable = r0
            return
    }

    public static void setTextureDestroyedRender(boolean r0) {
            com.amap.api.maps.MapsInitializer.isTextureDestroyedRender = r0
            return
    }

    public static void setTextureSizeChangedInvoked(boolean r0) {
            com.amap.api.maps.MapsInitializer.isTextureSizeChangedInvoked = r0
            return
    }

    public static void setTextureViewDestorySync(boolean r0) {
            com.amap.api.maps.MapsInitializer.isTextureViewDestorySync = r0
            return
    }

    public static void setWorldVectorOfflineMapStyleAssetsPath(java.lang.String r0) {
            com.amap.api.maps.MapsInitializer.mWorldVectorOfflineMapStyleAssetsPath = r0
            return
    }

    public static void setWorldVectorOfflineMapStyleFilePath(java.lang.String r0) {
            com.amap.api.maps.MapsInitializer.mWorldVectorOfflineMapStyleFilePath = r0
            return
    }

    public static synchronized void updatePrivacyAgree(android.content.Context r2, boolean r3) {
            java.lang.Class<com.amap.api.maps.MapsInitializer> r0 = com.amap.api.maps.MapsInitializer.class
            monitor-enter(r0)
            com.amap.api.col.3l.p4 r1 = com.amap.api.col.p0003l.b3.s()     // Catch: java.lang.Throwable -> Lc
            com.amap.api.col.p0003l.ft.i(r2, r3, r1)     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r0)
            return
        Lc:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            throw r2
    }

    public static synchronized void updatePrivacyShow(android.content.Context r2, boolean r3, boolean r4) {
            java.lang.Class<com.amap.api.maps.MapsInitializer> r0 = com.amap.api.maps.MapsInitializer.class
            monitor-enter(r0)
            com.amap.api.col.3l.p4 r1 = com.amap.api.col.p0003l.b3.s()     // Catch: java.lang.Throwable -> Lc
            com.amap.api.col.p0003l.ft.j(r2, r3, r4, r1)     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r0)
            return
        Lc:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            throw r2
    }
}

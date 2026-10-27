package com.autonavi.base.amap.mapcore;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class MapConfig implements com.autonavi.amap.mapcore.interfaces.IMapConfig, java.lang.Cloneable {
    public static final int DEFAULT_RATIO = 1;
    private static final int GEO_POINT_ZOOM = 20;
    public static final float MAX_ZOOM = 20.0f;
    public static final float MAX_ZOOM_INDOOR = 20.0f;
    public static final float MIN_ZOOM = 3.0f;
    public static final int MSG_ACTION_MAINTHREAD_TRIGGER = 30;
    public static final int MSG_ACTION_ONBASEPOICLICK = 20;
    public static final int MSG_ACTION_ONMAPCLICK = 19;
    public static final int MSG_AUTH_FAILURE = 2;
    public static final int MSG_CALLBACK_MAPLOADED = 16;
    public static final int MSG_CALLBACK_ONTOUCHEVENT = 14;
    public static final int MSG_CALLBACK_SCREENSHOT = 15;
    public static final int MSG_CAMERAUPDATE_CHANGE = 10;
    public static final int MSG_CAMERAUPDATE_FINISH = 11;
    public static final int MSG_COMPASSVIEW_CHANGESTATE = 13;
    public static final int MSG_INFOWINDOW_UPDATE = 18;
    public static final int MSG_TILEOVERLAY_REFRESH = 17;
    public static final int MSG_ZOOMVIEW_CHANGESTATE = 12;
    private static final int TILE_SIZE_POW = 8;
    private int abroadState;
    private int anchorX;
    private int anchorY;
    private volatile double changeGridRatio;
    private volatile double changeRatio;
    private java.util.concurrent.atomic.AtomicInteger changedCounter;
    private int customBackgroundColor;
    private java.lang.String customTextureResourcePath;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    private com.autonavi.base.amap.mapcore.Rectangle geoRectangle;
    private int gridX;
    private int gridY;
    private boolean isAbroadEnable;
    private boolean isBearingChanged;
    private boolean isBuildingEnable;
    private boolean isCenterChanged;
    private boolean isCustomStyleEnabled;
    private boolean isHideLogoEnable;
    private boolean isIndoorEnable;
    private boolean isMapTextEnable;
    private boolean isNeedUpdateMapRectNextFrame;
    private boolean isNeedUpdateZoomControllerState;
    private boolean isProFunctionAuthEnable;
    private boolean isSetLimitZoomLevel;
    private boolean isTerrainEnable;
    private boolean isTiltChanged;
    private boolean isTouchPoiEnable;
    private boolean isTrafficEnabled;
    private boolean isUseProFunction;
    private boolean isWorldMapEnable;
    private boolean isZoomChanged;
    com.autonavi.base.amap.mapcore.MapConfig lastMapconfig;
    private com.autonavi.amap.mapcore.IPoint[] limitIPoints;
    private com.amap.api.maps.model.LatLngBounds limitLatLngBounds;
    private java.lang.String mCustomStyleID;
    private java.lang.String mCustomStylePath;
    private java.lang.String mMapLanguage;
    private int mMapStyleMode;
    private int mMapStyleTime;
    private boolean mapEnable;
    private com.autonavi.amap.mapcore.DPoint mapGeoCenter;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    private int mapHeight;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    private float mapPerPixelUnitLength;
    private com.autonavi.base.amap.mapcore.FPoint[] mapRect;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    private int mapWidth;
    private float mapZoomScale;
    public float maxZoomLevel;
    public float minZoomLevel;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    float[] mvpMatrix;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    float[] projectionMatrix;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    private float sC;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    private float sR;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    private double sX;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    private double sY;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    private float sZ;
    private float skyHeight;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    private int[] tilsIDs;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    float[] viewMatrix;

    public MapConfig(boolean r9) {
            r8 = this;
            r8.<init>()
            r0 = 1101004800(0x41a00000, float:20.0)
            r8.maxZoomLevel = r0
            r0 = 1077936128(0x40400000, float:3.0)
            r8.minZoomLevel = r0
            r0 = 0
            r8.mapRect = r0
            com.autonavi.base.amap.mapcore.Rectangle r1 = new com.autonavi.base.amap.mapcore.Rectangle
            r1.<init>()
            r8.geoRectangle = r1
            r1 = 0
            r8.isIndoorEnable = r1
            r2 = 1
            r8.isBuildingEnable = r2
            r8.isMapTextEnable = r2
            r8.isTrafficEnabled = r1
            r8.isCustomStyleEnabled = r1
            r3 = 4731691883087003648(0x41aa58b2b6000000, double:2.21010267E8)
            r8.sX = r3
            r3 = 4726597233246470144(0x41983f241c000000, double:1.01697799E8)
            r8.sY = r3
            com.autonavi.amap.mapcore.DPoint r3 = new com.autonavi.amap.mapcore.DPoint
            double r4 = r8.sX
            double r6 = r8.sY
            r3.<init>(r4, r6)
            r8.mapGeoCenter = r3
            r3 = 1092616192(0x41200000, float:10.0)
            r8.sZ = r3
            r3 = 0
            r8.sC = r3
            r8.sR = r3
            r8.lastMapconfig = r0
            r8.isCenterChanged = r1
            r8.isZoomChanged = r1
            r8.isTiltChanged = r1
            r8.isBearingChanged = r1
            r8.isNeedUpdateZoomControllerState = r1
            r8.isNeedUpdateMapRectNextFrame = r1
            r8.mMapStyleMode = r1
            r8.mMapStyleTime = r1
            r8.anchorX = r1
            java.lang.String r0 = "zh_cn"
            r8.mMapLanguage = r0
            r8.isHideLogoEnable = r1
            r8.isWorldMapEnable = r1
            r8.isTouchPoiEnable = r2
            r8.abroadState = r2
            r8.isAbroadEnable = r1
            r8.isTerrainEnable = r1
            r0 = 16
            float[] r4 = new float[r0]
            r8.viewMatrix = r4
            float[] r4 = new float[r0]
            r8.projectionMatrix = r4
            float[] r0 = new float[r0]
            r8.mvpMatrix = r0
            r0 = 100
            int[] r0 = new int[r0]
            r8.tilsIDs = r0
            r8.mapEnable = r2
            r8.anchorY = r1
            r8.isProFunctionAuthEnable = r2
            r8.isUseProFunction = r1
            r0 = -1
            r8.customBackgroundColor = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            r8.mapZoomScale = r0
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r0.<init>(r1)
            r8.changedCounter = r0
            r4 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r8.changeRatio = r4
            r8.changeGridRatio = r4
            r8.gridX = r1
            r8.gridY = r1
            if (r9 == 0) goto Lc2
            com.autonavi.base.amap.mapcore.MapConfig r9 = new com.autonavi.base.amap.mapcore.MapConfig
            r9.<init>(r1)
            r8.lastMapconfig = r9
            r9.setGridXY(r1, r1)
            com.autonavi.base.amap.mapcore.MapConfig r9 = r8.lastMapconfig
            r0 = 0
            r9.setSX(r0)
            com.autonavi.base.amap.mapcore.MapConfig r9 = r8.lastMapconfig
            r9.setSY(r0)
            com.autonavi.base.amap.mapcore.MapConfig r9 = r8.lastMapconfig
            r9.setSZ(r3)
            com.autonavi.base.amap.mapcore.MapConfig r9 = r8.lastMapconfig
            r9.setSC(r3)
            com.autonavi.base.amap.mapcore.MapConfig r9 = r8.lastMapconfig
            r9.setSR(r3)
        Lc2:
            return
    }

    private void changeRatio() {
            r13 = this;
            com.autonavi.base.amap.mapcore.MapConfig r0 = r13.lastMapconfig
            double r0 = r0.getSX()
            com.autonavi.base.amap.mapcore.MapConfig r2 = r13.lastMapconfig
            double r2 = r2.getSY()
            com.autonavi.base.amap.mapcore.MapConfig r4 = r13.lastMapconfig
            float r4 = r4.getSZ()
            com.autonavi.base.amap.mapcore.MapConfig r5 = r13.lastMapconfig
            float r5 = r5.getSC()
            com.autonavi.base.amap.mapcore.MapConfig r6 = r13.lastMapconfig
            float r6 = r6.getSR()
            double r7 = r13.sX
            double r7 = r7 - r0
            double r0 = java.lang.Math.abs(r7)
            double r7 = r13.sY
            double r7 = r7 - r2
            double r2 = java.lang.Math.abs(r7)
            double r0 = r0 + r2
            r13.changeRatio = r0
            double r0 = r13.changeRatio
            r2 = 4611686018427387904(0x4000000000000000, double:2.0)
            r7 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r9 = 0
            int r11 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r11 != 0) goto L3d
            r0 = r7
            goto L41
        L3d:
            double r0 = r13.changeRatio
            double r0 = r0 * r2
        L41:
            r13.changeRatio = r0
            double r0 = r13.changeRatio
            float r11 = r13.sZ
            int r12 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r12 != 0) goto L4d
            r11 = r7
            goto L53
        L4d:
            float r4 = r4 - r11
            float r4 = java.lang.Math.abs(r4)
            double r11 = (double) r4
        L53:
            double r0 = r0 * r11
            r13.changeRatio = r0
            float r0 = r13.sC
            r1 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r4 != 0) goto L62
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L67
        L62:
            float r5 = r5 - r0
            float r0 = java.lang.Math.abs(r5)
        L67:
            float r4 = r13.sR
            int r5 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r5 != 0) goto L6e
            goto L73
        L6e:
            float r6 = r6 - r4
            float r1 = java.lang.Math.abs(r6)
        L73:
            double r4 = r13.changeRatio
            double r11 = (double) r0
            double r4 = r4 * r11
            r13.changeRatio = r4
            double r4 = r13.changeRatio
            double r0 = (double) r1
            double r4 = r4 * r0
            r13.changeRatio = r4
            com.autonavi.base.amap.mapcore.MapConfig r4 = r13.lastMapconfig
            int r4 = r4.getGridX()
            int r5 = r13.gridX
            int r4 = r4 - r5
            int r4 = java.lang.Math.abs(r4)
            com.autonavi.base.amap.mapcore.MapConfig r5 = r13.lastMapconfig
            int r5 = r5.getGridY()
            int r6 = r13.gridY
            int r5 = r5 - r6
            int r4 = r4 + r5
            double r4 = (double) r4
            r13.changeGridRatio = r4
            double r4 = r13.changeGridRatio
            int r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r6 != 0) goto La2
            goto La6
        La2:
            double r4 = r13.changeGridRatio
            double r7 = r4 * r2
        La6:
            r13.changeGridRatio = r7
            double r2 = r13.changeGridRatio
            double r2 = r2 * r11
            r13.changeGridRatio = r2
            double r2 = r13.changeGridRatio
            double r2 = r2 * r0
            r13.changeGridRatio = r2
            return
    }

    public void addChangedCounter() {
            r1 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r1.changedCounter
            r0.incrementAndGet()
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IMapConfig
    public int getAbroadState() {
            r1 = this;
            int r0 = r1.abroadState
            return r0
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IMapConfig
    public int getAnchorX() {
            r1 = this;
            int r0 = r1.anchorX
            return r0
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IMapConfig
    public int getAnchorY() {
            r1 = this;
            int r0 = r1.anchorY
            return r0
    }

    public double getChangeGridRatio() {
            r2 = this;
            double r0 = r2.changeGridRatio
            return r0
    }

    public double getChangeRatio() {
            r2 = this;
            double r0 = r2.changeRatio
            return r0
    }

    public int getChangedCounter() {
            r1 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r1.changedCounter
            int r0 = r0.get()
            return r0
    }

    public int getCustomBackgroundColor() {
            r1 = this;
            int r0 = r1.customBackgroundColor
            return r0
    }

    public java.lang.String getCustomStyleID() {
            r1 = this;
            java.lang.String r0 = r1.mCustomStyleID
            return r0
    }

    public java.lang.String getCustomStylePath() {
            r1 = this;
            java.lang.String r0 = r1.mCustomStylePath
            return r0
    }

    public java.lang.String getCustomTextureResourcePath() {
            r1 = this;
            java.lang.String r0 = r1.customTextureResourcePath
            return r0
    }

    public com.autonavi.base.amap.mapcore.Rectangle getGeoRectangle() {
            r1 = this;
            com.autonavi.base.amap.mapcore.Rectangle r0 = r1.geoRectangle
            return r0
    }

    protected int getGridX() {
            r1 = this;
            int r0 = r1.gridX
            return r0
    }

    protected int getGridY() {
            r1 = this;
            int r0 = r1.gridY
            return r0
    }

    public com.autonavi.amap.mapcore.IPoint[] getLimitIPoints() {
            r1 = this;
            com.autonavi.amap.mapcore.IPoint[] r0 = r1.limitIPoints
            return r0
    }

    public com.amap.api.maps.model.LatLngBounds getLimitLatLngBounds() {
            r1 = this;
            com.amap.api.maps.model.LatLngBounds r0 = r1.limitLatLngBounds
            return r0
    }

    public com.autonavi.amap.mapcore.DPoint getMapGeoCenter() {
            r1 = this;
            com.autonavi.amap.mapcore.DPoint r0 = r1.mapGeoCenter
            return r0
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IMapConfig
    public int getMapHeight() {
            r1 = this;
            int r0 = r1.mapHeight
            return r0
    }

    public java.lang.String getMapLanguage() {
            r1 = this;
            java.lang.String r0 = r1.mMapLanguage
            return r0
    }

    public int getMapStyleMode() {
            r1 = this;
            int r0 = r1.mMapStyleMode
            return r0
    }

    public int getMapStyleTime() {
            r1 = this;
            int r0 = r1.mMapStyleTime
            return r0
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IMapConfig
    public int getMapWidth() {
            r1 = this;
            int r0 = r1.mapWidth
            return r0
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IMapConfig
    public float getMapZoomScale() {
            r1 = this;
            float r0 = r1.mapZoomScale
            return r0
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IMapConfig
    public float getMaxZoomLevel() {
            r1 = this;
            float r0 = r1.maxZoomLevel
            return r0
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IMapConfig
    public float getMinZoomLevel() {
            r1 = this;
            float r0 = r1.minZoomLevel
            return r0
    }

    public float[] getMvpMatrix() {
            r1 = this;
            float[] r0 = r1.mvpMatrix
            return r0
    }

    public float[] getProjectionMatrix() {
            r1 = this;
            float[] r0 = r1.projectionMatrix
            return r0
    }

    public float getSC() {
            r1 = this;
            float r0 = r1.sC
            return r0
    }

    public float getSR() {
            r1 = this;
            float r0 = r1.sR
            return r0
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IMapConfig
    public double getSX() {
            r2 = this;
            double r0 = r2.sX
            return r0
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IMapConfig
    public double getSY() {
            r2 = this;
            double r0 = r2.sY
            return r0
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IMapConfig
    public float getSZ() {
            r1 = this;
            float r0 = r1.sZ
            return r0
    }

    public float getSkyHeight() {
            r1 = this;
            float r0 = r1.skyHeight
            return r0
    }

    public float[] getViewMatrix() {
            r1 = this;
            float[] r0 = r1.viewMatrix
            return r0
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IMapConfig
    public boolean isAbroadEnable() {
            r1 = this;
            boolean r0 = r1.isAbroadEnable
            return r0
    }

    public boolean isBearingChanged() {
            r1 = this;
            boolean r0 = r1.isBearingChanged
            return r0
    }

    public boolean isBuildingEnable() {
            r1 = this;
            boolean r0 = r1.isBuildingEnable
            return r0
    }

    public boolean isCustomStyleEnable() {
            r1 = this;
            boolean r0 = r1.isCustomStyleEnabled
            return r0
    }

    public boolean isHideLogoEnable() {
            r1 = this;
            boolean r0 = r1.isHideLogoEnable
            return r0
    }

    public boolean isIndoorEnable() {
            r1 = this;
            boolean r0 = r1.isIndoorEnable
            return r0
    }

    public boolean isMapEnable() {
            r1 = this;
            boolean r0 = r1.mapEnable
            return r0
    }

    public boolean isMapStateChange() {
            r14 = this;
            com.autonavi.base.amap.mapcore.MapConfig r0 = r14.lastMapconfig
            r1 = 0
            if (r0 == 0) goto L94
            double r2 = r0.getSX()
            com.autonavi.base.amap.mapcore.MapConfig r0 = r14.lastMapconfig
            double r4 = r0.getSY()
            com.autonavi.base.amap.mapcore.MapConfig r0 = r14.lastMapconfig
            float r0 = r0.getSZ()
            com.autonavi.base.amap.mapcore.MapConfig r6 = r14.lastMapconfig
            float r6 = r6.getSC()
            com.autonavi.base.amap.mapcore.MapConfig r7 = r14.lastMapconfig
            float r7 = r7.getSR()
            double r8 = r14.sX
            r10 = 1
            int r11 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r11 == 0) goto L2a
            r2 = 1
            goto L2b
        L2a:
            r2 = 0
        L2b:
            r14.isCenterChanged = r2
            double r11 = r14.sY
            int r3 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r3 == 0) goto L34
            r2 = 1
        L34:
            r14.isCenterChanged = r2
            float r3 = r14.sZ
            int r4 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r4 == 0) goto L3e
            r4 = 1
            goto L3f
        L3e:
            r4 = 0
        L3f:
            r14.isZoomChanged = r4
            if (r4 == 0) goto L5d
            float r5 = r14.minZoomLevel
            int r13 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r13 <= 0) goto L5b
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 <= 0) goto L5b
            float r5 = r14.maxZoomLevel
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L5b
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 < 0) goto L58
            goto L5b
        L58:
            r14.isNeedUpdateZoomControllerState = r1
            goto L5d
        L5b:
            r14.isNeedUpdateZoomControllerState = r10
        L5d:
            float r0 = r14.sC
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 == 0) goto L65
            r0 = 1
            goto L66
        L65:
            r0 = 0
        L66:
            r14.isTiltChanged = r0
            float r5 = r14.sR
            int r5 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r5 == 0) goto L70
            r5 = 1
            goto L71
        L70:
            r5 = 0
        L71:
            r14.isBearingChanged = r5
            if (r2 != 0) goto L81
            if (r4 != 0) goto L81
            if (r0 != 0) goto L81
            if (r5 != 0) goto L81
            boolean r0 = r14.isNeedUpdateMapRectNextFrame
            if (r0 == 0) goto L80
            goto L81
        L80:
            r10 = 0
        L81:
            if (r10 == 0) goto L93
            r14.isNeedUpdateMapRectNextFrame = r1
            int r0 = (int) r3
            int r1 = (int) r8
            int r0 = 28 - r0
            int r1 = r1 >> r0
            int r2 = (int) r11
            int r0 = r2 >> r0
            r14.setGridXY(r1, r0)
            r14.changeRatio()
        L93:
            return r10
        L94:
            return r1
    }

    public boolean isMapTextEnable() {
            r1 = this;
            boolean r0 = r1.isMapTextEnable
            return r0
    }

    public boolean isNeedUpdateZoomControllerState() {
            r1 = this;
            boolean r0 = r1.isNeedUpdateZoomControllerState
            return r0
    }

    public boolean isProFunctionAuthEnable() {
            r1 = this;
            boolean r0 = r1.isProFunctionAuthEnable
            return r0
    }

    public boolean isSetLimitZoomLevel() {
            r1 = this;
            boolean r0 = r1.isSetLimitZoomLevel
            return r0
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IMapConfig
    public boolean isTerrainEnable() {
            r1 = this;
            boolean r0 = r1.isTerrainEnable
            return r0
    }

    public boolean isTiltChanged() {
            r1 = this;
            boolean r0 = r1.isTiltChanged
            return r0
    }

    public boolean isTouchPoiEnable() {
            r1 = this;
            boolean r0 = r1.isTouchPoiEnable
            return r0
    }

    public boolean isTrafficEnabled() {
            r1 = this;
            boolean r0 = r1.isTrafficEnabled
            return r0
    }

    public boolean isUseProFunction() {
            r1 = this;
            boolean r0 = r1.isUseProFunction
            return r0
    }

    public boolean isWorldMapEnable() {
            r1 = this;
            boolean r0 = r1.isWorldMapEnable
            return r0
    }

    public boolean isZoomChanged() {
            r1 = this;
            boolean r0 = r1.isZoomChanged
            return r0
    }

    public void resetChangedCounter() {
            r2 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r2.changedCounter
            r1 = 0
            r0.set(r1)
            return
    }

    public void resetMinMaxZoomPreference() {
            r1 = this;
            r0 = 1077936128(0x40400000, float:3.0)
            r1.minZoomLevel = r0
            r0 = 1101004800(0x41a00000, float:20.0)
            r1.maxZoomLevel = r0
            r0 = 0
            r1.isSetLimitZoomLevel = r0
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IMapConfig
    public void setAbroadEnable(boolean r1) {
            r0 = this;
            r0.isAbroadEnable = r1
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IMapConfig
    public void setAbroadState(int r1) {
            r0 = this;
            r0.abroadState = r1
            return
    }

    public void setAnchorX(int r1) {
            r0 = this;
            r0.anchorX = r1
            return
    }

    public void setAnchorY(int r1) {
            r0 = this;
            r0.anchorY = r1
            return
    }

    public void setBuildingEnable(boolean r1) {
            r0 = this;
            r0.isBuildingEnable = r1
            return
    }

    public void setCustomBackgroundColor(int r1) {
            r0 = this;
            r0.customBackgroundColor = r1
            return
    }

    public void setCustomStyleEnable(boolean r1) {
            r0 = this;
            r0.isCustomStyleEnabled = r1
            return
    }

    public void setCustomStyleID(java.lang.String r1) {
            r0 = this;
            r0.mCustomStyleID = r1
            return
    }

    public void setCustomStylePath(java.lang.String r1) {
            r0 = this;
            r0.mCustomStylePath = r1
            return
    }

    public void setCustomTextureResourcePath(java.lang.String r1) {
            r0 = this;
            r0.customTextureResourcePath = r1
            return
    }

    protected void setGridXY(int r4, int r5) {
            r3 = this;
            com.autonavi.base.amap.mapcore.MapConfig r0 = r3.lastMapconfig
            if (r0 == 0) goto Lb
            int r1 = r3.gridX
            int r2 = r3.gridY
            r0.setGridXY(r1, r2)
        Lb:
            r3.gridX = r4
            r3.gridY = r5
            return
    }

    public void setHideLogoEnble(boolean r1) {
            r0 = this;
            r0.isHideLogoEnable = r1
            return
    }

    public void setIndoorEnable(boolean r1) {
            r0 = this;
            r0.isIndoorEnable = r1
            return
    }

    public void setLimitIPoints(com.autonavi.amap.mapcore.IPoint[] r1) {
            r0 = this;
            r0.limitIPoints = r1
            return
    }

    public void setLimitLatLngBounds(com.amap.api.maps.model.LatLngBounds r1) {
            r0 = this;
            r0.limitLatLngBounds = r1
            if (r1 != 0) goto L7
            r0.resetMinMaxZoomPreference()
        L7:
            return
    }

    public void setMapEnable(boolean r1) {
            r0 = this;
            r0.mapEnable = r1
            return
    }

    public void setMapHeight(int r1) {
            r0 = this;
            r0.mapHeight = r1
            return
    }

    public void setMapLanguage(java.lang.String r1) {
            r0 = this;
            r0.mMapLanguage = r1
            return
    }

    public void setMapStyleMode(int r1) {
            r0 = this;
            r0.mMapStyleMode = r1
            return
    }

    public void setMapStyleTime(int r1) {
            r0 = this;
            r0.mMapStyleTime = r1
            return
    }

    public void setMapTextEnable(boolean r1) {
            r0 = this;
            r0.isMapTextEnable = r1
            return
    }

    public void setMapWidth(int r1) {
            r0 = this;
            r0.mapWidth = r1
            return
    }

    public void setMapZoomScale(float r1) {
            r0 = this;
            r0.mapZoomScale = r1
            return
    }

    public void setMaxZoomLevel(float r3) {
            r2 = this;
            r0 = 1101004800(0x41a00000, float:20.0)
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 <= 0) goto L8
            r3 = 1101004800(0x41a00000, float:20.0)
        L8:
            r0 = 1077936128(0x40400000, float:3.0)
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 >= 0) goto L10
            r3 = 1077936128(0x40400000, float:3.0)
        L10:
            float r0 = r2.getMinZoomLevel()
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 >= 0) goto L1c
            float r3 = r2.getMinZoomLevel()
        L1c:
            r0 = 1
            r2.isSetLimitZoomLevel = r0
            r2.maxZoomLevel = r3
            return
    }

    public void setMinZoomLevel(float r3) {
            r2 = this;
            r0 = 1077936128(0x40400000, float:3.0)
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 >= 0) goto L8
            r3 = 1077936128(0x40400000, float:3.0)
        L8:
            r0 = 1101004800(0x41a00000, float:20.0)
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 <= 0) goto L10
            r3 = 1101004800(0x41a00000, float:20.0)
        L10:
            float r0 = r2.getMaxZoomLevel()
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 <= 0) goto L1c
            float r3 = r2.getMaxZoomLevel()
        L1c:
            r0 = 1
            r2.isSetLimitZoomLevel = r0
            r2.minZoomLevel = r3
            return
    }

    public void setProFunctionAuthEnable(boolean r1) {
            r0 = this;
            r0.isProFunctionAuthEnable = r1
            return
    }

    public void setSC(float r3) {
            r2 = this;
            com.autonavi.base.amap.mapcore.MapConfig r0 = r2.lastMapconfig
            if (r0 == 0) goto L9
            float r1 = r2.sC
            r0.setSC(r1)
        L9:
            r2.sC = r3
            return
    }

    public void setSR(float r3) {
            r2 = this;
            com.autonavi.base.amap.mapcore.MapConfig r0 = r2.lastMapconfig
            if (r0 == 0) goto L9
            float r1 = r2.sR
            r0.setSR(r1)
        L9:
            r2.sR = r3
            return
    }

    public void setSX(double r4) {
            r3 = this;
            com.autonavi.base.amap.mapcore.MapConfig r0 = r3.lastMapconfig
            if (r0 == 0) goto L9
            double r1 = r3.sX
            r0.setSX(r1)
        L9:
            r3.sX = r4
            com.autonavi.amap.mapcore.DPoint r0 = r3.mapGeoCenter
            r0.x = r4
            return
    }

    public void setSY(double r4) {
            r3 = this;
            com.autonavi.base.amap.mapcore.MapConfig r0 = r3.lastMapconfig
            if (r0 == 0) goto L9
            double r1 = r3.sY
            r0.setSY(r1)
        L9:
            r3.sY = r4
            com.autonavi.amap.mapcore.DPoint r0 = r3.mapGeoCenter
            r0.x = r4
            return
    }

    public void setSZ(float r3) {
            r2 = this;
            com.autonavi.base.amap.mapcore.MapConfig r0 = r2.lastMapconfig
            if (r0 == 0) goto L9
            float r1 = r2.sZ
            r0.setSZ(r1)
        L9:
            r2.sZ = r3
            return
    }

    public void setSkyHeight(float r1) {
            r0 = this;
            r0.skyHeight = r1
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IMapConfig
    public void setTerrainEnable(boolean r1) {
            r0 = this;
            r0.isTerrainEnable = r1
            return
    }

    public void setTouchPoiEnable(boolean r1) {
            r0 = this;
            r0.isTouchPoiEnable = r1
            return
    }

    public void setTrafficEnabled(boolean r1) {
            r0 = this;
            r0.isTrafficEnabled = r1
            return
    }

    public void setUseProFunction(boolean r1) {
            r0 = this;
            r0.isUseProFunction = r1
            return
    }

    public void setWorldMapEnable(boolean r1) {
            r0 = this;
            r0.isWorldMapEnable = r1
            return
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = " sX: "
            r0.append(r1)
            double r1 = r3.sX
            r0.append(r1)
            java.lang.String r1 = " sY: "
            r0.append(r1)
            double r1 = r3.sY
            r0.append(r1)
            java.lang.String r1 = " sZ: "
            r0.append(r1)
            float r1 = r3.sZ
            r0.append(r1)
            java.lang.String r1 = " sC: "
            r0.append(r1)
            float r1 = r3.sC
            r0.append(r1)
            java.lang.String r1 = " sR: "
            r0.append(r1)
            float r1 = r3.sR
            r0.append(r1)
            java.lang.String r1 = " skyHeight: "
            r0.append(r1)
            float r1 = r3.skyHeight
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public void updateFinalMatrix() {
            r6 = this;
            float[] r0 = r6.mvpMatrix
            float[] r2 = r6.projectionMatrix
            float[] r4 = r6.viewMatrix
            r5 = 0
            r1 = 0
            r3 = 0
            android.opengl.Matrix.multiplyMM(r0, r1, r2, r3, r4, r5)
            return
    }

    public void updateMapRectNextFrame(boolean r1) {
            r0 = this;
            r0.isNeedUpdateMapRectNextFrame = r1
            return
    }
}

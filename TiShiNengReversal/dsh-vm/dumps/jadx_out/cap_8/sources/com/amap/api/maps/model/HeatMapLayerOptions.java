package com.amap.api.maps.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class HeatMapLayerOptions extends com.amap.api.maps.model.BaseOptions {

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    public static final com.amap.api.maps.model.Gradient DEFAULT_GRADIENT = null;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    private static final int[] DEFAULT_GRADIENT_COLORS = null;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    private static final float[] DEFAULT_GRADIENT_START_POINTS = null;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    public static final double DEFAULT_OPACITY = 0.6d;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    public static final int DEFAULT_RADIUS = 12;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    public static final int TYPE_GRID = 1;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    public static final int TYPE_HEXAGON = 2;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    public static final int TYPE_NORMAL = 0;
    private boolean isPointsUpdated;
    private boolean isVisible;
    private int[] mColors;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    private java.util.Collection<com.amap.api.maps.model.WeightedLatLng> mData;
    private float mGap;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    private com.amap.api.maps.model.Gradient mGradient;
    private double mLatitude;
    private float mOpacity;
    private float mSize;
    private float[] mStartPoints;
    private int mType;
    private double maxIntensity;
    private float maxZoom;
    private float minZoom;
    private double[] pointList;
    private float zIndex;

    static {
            r0 = 102(0x66, float:1.43E-43)
            r1 = 225(0xe1, float:3.15E-43)
            r2 = 0
            int r0 = android.graphics.Color.rgb(r0, r1, r2)
            r1 = 255(0xff, float:3.57E-43)
            int r1 = android.graphics.Color.rgb(r1, r2, r2)
            int[] r0 = new int[]{r0, r1}
            com.amap.api.maps.model.HeatMapLayerOptions.DEFAULT_GRADIENT_COLORS = r0
            r1 = 2
            float[] r1 = new float[r1]
            r1 = {x0026: FILL_ARRAY_DATA , data: [1045220557, 1065353216} // fill-array
            com.amap.api.maps.model.HeatMapLayerOptions.DEFAULT_GRADIENT_START_POINTS = r1
            com.amap.api.maps.model.Gradient r2 = new com.amap.api.maps.model.Gradient
            r2.<init>(r0, r1)
            com.amap.api.maps.model.HeatMapLayerOptions.DEFAULT_GRADIENT = r2
            return
    }

    public HeatMapLayerOptions() {
            r2 = this;
            r2.<init>()
            com.amap.api.maps.model.Gradient r0 = com.amap.api.maps.model.HeatMapLayerOptions.DEFAULT_GRADIENT
            r2.mGradient = r0
            r0 = 1157234688(0x44fa0000, float:2000.0)
            r2.mSize = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            r2.mOpacity = r0
            r0 = 0
            r2.maxIntensity = r0
            r0 = 1101004800(0x41a00000, float:20.0)
            r2.maxZoom = r0
            r0 = 1077936128(0x40400000, float:3.0)
            r2.minZoom = r0
            r0 = 0
            r2.mGap = r0
            r1 = 2
            r2.mType = r1
            r2.zIndex = r0
            r0 = 1
            r2.isVisible = r0
            r0 = 0
            r2.isPointsUpdated = r0
            java.lang.String r0 = "HeatMapLayerOptions"
            r2.type = r0
            return
    }

    private static java.util.Collection<com.amap.api.maps.model.WeightedLatLng> a(java.util.Collection<com.amap.api.maps.model.LatLng> r3) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r3 = r3.iterator()
        L9:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L1e
            java.lang.Object r1 = r3.next()
            com.amap.api.maps.model.LatLng r1 = (com.amap.api.maps.model.LatLng) r1
            com.amap.api.maps.model.WeightedLatLng r2 = new com.amap.api.maps.model.WeightedLatLng
            r2.<init>(r1)
            r0.add(r2)
            goto L9
        L1e:
            return r0
    }

    private void a() {
            r15 = this;
            boolean r0 = r15.isPointsUpdated
            if (r0 == 0) goto L75
            java.util.Collection r0 = r15.getData()
            if (r0 != 0) goto Lc
            goto L75
        Lc:
            int r1 = r0.size()
            int r1 = r1 * 3
            double[] r1 = new double[r1]
            r15.pointList = r1
            java.util.Iterator r0 = r0.iterator()
            r1 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            r3 = 0
            r3 = r1
            r5 = 0
        L1f:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L60
            java.lang.Object r6 = r0.next()
            com.amap.api.maps.model.WeightedLatLng r6 = (com.amap.api.maps.model.WeightedLatLng) r6
            if (r6 == 0) goto L1f
            com.amap.api.maps.model.LatLng r7 = r6.latLng
            if (r7 == 0) goto L1f
            double[] r8 = r15.pointList
            int r9 = r5 * 3
            double r10 = r7.latitude
            r8[r9] = r10
            int r12 = r9 + 1
            double r13 = r7.longitude
            r8[r12] = r13
            int r9 = r9 + 2
            double r6 = r6.intensity
            r8[r9] = r6
            int r5 = r5 + 1
            boolean r6 = java.lang.Double.isNaN(r1)
            if (r6 == 0) goto L4e
            r1 = r10
        L4e:
            boolean r6 = java.lang.Double.isNaN(r3)
            if (r6 == 0) goto L55
            r3 = r10
        L55:
            int r6 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r6 <= 0) goto L5a
            r3 = r10
        L5a:
            int r6 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r6 >= 0) goto L1f
            r1 = r10
            goto L1f
        L60:
            boolean r0 = java.lang.Double.isNaN(r1)
            if (r0 != 0) goto L71
            boolean r0 = java.lang.Double.isNaN(r3)
            if (r0 != 0) goto L71
            double r1 = r1 + r3
            r3 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r1 = r1 / r3
            goto L73
        L71:
            r1 = 0
        L73:
            r15.mLatitude = r1
        L75:
            return
    }

    public com.amap.api.maps.model.HeatMapLayerOptions data(java.util.Collection<com.amap.api.maps.model.LatLng> r1) {
            r0 = this;
            java.util.Collection r1 = a(r1)
            com.amap.api.maps.model.HeatMapLayerOptions r1 = r0.weightedData(r1)
            return r1
    }

    public com.amap.api.maps.model.HeatMapLayerOptions gap(float r1) {
            r0 = this;
            r0.mGap = r1
            return r0
    }

    public java.util.Collection<com.amap.api.maps.model.WeightedLatLng> getData() {
            r1 = this;
            java.util.Collection<com.amap.api.maps.model.WeightedLatLng> r0 = r1.mData
            return r0
    }

    public float getGap() {
            r1 = this;
            float r0 = r1.mGap
            return r0
    }

    public com.amap.api.maps.model.Gradient getGradient() {
            r1 = this;
            com.amap.api.maps.model.Gradient r0 = r1.mGradient
            return r0
    }

    public double getMaxIntensity() {
            r2 = this;
            double r0 = r2.maxIntensity
            return r0
    }

    public float getMaxZoom() {
            r1 = this;
            float r0 = r1.maxZoom
            return r0
    }

    public float getMinZoom() {
            r1 = this;
            float r0 = r1.minZoom
            return r0
    }

    public float getOpacity() {
            r1 = this;
            float r0 = r1.mOpacity
            return r0
    }

    public float getSize() {
            r1 = this;
            float r0 = r1.mSize
            return r0
    }

    public int getType() {
            r1 = this;
            int r0 = r1.mType
            return r0
    }

    public float getZIndex() {
            r1 = this;
            float r0 = r1.zIndex
            return r0
    }

    public com.amap.api.maps.model.HeatMapLayerOptions gradient(com.amap.api.maps.model.Gradient r1) {
            r0 = this;
            r0.mGradient = r1
            if (r1 == 0) goto L12
            int[] r1 = r1.getColors()
            r0.mColors = r1
            com.amap.api.maps.model.Gradient r1 = r0.mGradient
            float[] r1 = r1.getStartPoints()
            r0.mStartPoints = r1
        L12:
            return r0
    }

    public boolean isVisible() {
            r1 = this;
            boolean r0 = r1.isVisible
            return r0
    }

    public com.amap.api.maps.model.HeatMapLayerOptions maxIntensity(double r1) {
            r0 = this;
            r0.maxIntensity = r1
            return r0
    }

    public com.amap.api.maps.model.HeatMapLayerOptions maxZoom(float r1) {
            r0 = this;
            r0.maxZoom = r1
            return r0
    }

    public com.amap.api.maps.model.HeatMapLayerOptions minZoom(float r1) {
            r0 = this;
            r0.minZoom = r1
            return r0
    }

    public com.amap.api.maps.model.HeatMapLayerOptions opacity(float r2) {
            r1 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            float r2 = java.lang.Math.min(r2, r0)
            r0 = 0
            float r2 = java.lang.Math.max(r0, r2)
            r1.mOpacity = r2
            return r1
    }

    public com.amap.api.maps.model.HeatMapLayerOptions size(float r1) {
            r0 = this;
            r0.mSize = r1
            return r0
    }

    public com.amap.api.maps.model.HeatMapLayerOptions type(int r1) {
            r0 = this;
            r0.mType = r1
            return r0
    }

    public com.amap.api.maps.model.HeatMapLayerOptions visible(boolean r1) {
            r0 = this;
            r0.isVisible = r1
            return r0
    }

    public com.amap.api.maps.model.HeatMapLayerOptions weightedData(java.util.Collection<com.amap.api.maps.model.WeightedLatLng> r1) {
            r0 = this;
            r0.mData = r1
            r1 = 1
            r0.isPointsUpdated = r1
            r0.a()
            return r0
    }

    public com.amap.api.maps.model.HeatMapLayerOptions zIndex(float r1) {
            r0 = this;
            r0.zIndex = r1
            return r0
    }
}

package com.amap.api.maps.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class GL3DModelOptions extends com.amap.api.maps.model.BaseOptions {

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    private double altitude;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    private com.amap.api.maps.model.BitmapDescriptor bitmapDescriptor;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    private boolean fixedDisplaySizeEnabled;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    private double fixedDisplaySizeX;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    private double fixedDisplaySizeY;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    private int fixedLength;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    private boolean isModeltUpdate;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    private com.amap.api.maps.model.LatLng latLng;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    private java.lang.String modelData;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    private float rotate;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    private java.lang.String snippet;
    private java.util.List<java.lang.Float> textrueList;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    private java.lang.String title;
    private java.util.List<java.lang.Float> vertextList;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    private boolean visibile;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    private int zIndex;

    public GL3DModelOptions() {
            r4 = this;
            r4.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4.vertextList = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4.textrueList = r0
            r0 = 0
            r4.isModeltUpdate = r0
            r1 = 50
            r4.fixedLength = r1
            r1 = 0
            r4.altitude = r1
            r1 = 1
            r4.fixedDisplaySizeEnabled = r1
            r2 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            r4.fixedDisplaySizeX = r2
            r4.fixedDisplaySizeY = r2
            r4.visibile = r1
            r4.zIndex = r0
            java.lang.String r0 = "GL3DModelOptions"
            r4.type = r0
            return
    }

    public com.amap.api.maps.model.GL3DModelOptions angle(float r1) {
            r0 = this;
            r0.rotate = r1
            return r0
    }

    public double getAltitude() {
            r2 = this;
            double r0 = r2.altitude
            return r0
    }

    public float getAngle() {
            r1 = this;
            float r0 = r1.rotate
            return r0
    }

    public com.amap.api.maps.model.BitmapDescriptor getBitmapDescriptor() {
            r1 = this;
            com.amap.api.maps.model.BitmapDescriptor r0 = r1.bitmapDescriptor
            return r0
    }

    public android.util.Pair<java.lang.Double, java.lang.Double> getFixDisplaySize() {
            r3 = this;
            double r0 = r3.fixedDisplaySizeX
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            double r1 = r3.fixedDisplaySizeY
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            android.util.Pair r0 = android.util.Pair.create(r0, r1)
            return r0
    }

    public com.amap.api.maps.model.LatLng getLatLng() {
            r1 = this;
            com.amap.api.maps.model.LatLng r0 = r1.latLng
            return r0
    }

    public int getModelFixedLength() {
            r1 = this;
            int r0 = r1.fixedLength
            return r0
    }

    public java.lang.String getSnippet() {
            r1 = this;
            java.lang.String r0 = r1.snippet
            return r0
    }

    public java.util.List<java.lang.Float> getTextrue() {
            r1 = this;
            java.util.List<java.lang.Float> r0 = r1.textrueList
            return r0
    }

    public java.lang.String getTitle() {
            r1 = this;
            java.lang.String r0 = r1.title
            return r0
    }

    public java.util.List<java.lang.Float> getVertext() {
            r1 = this;
            java.util.List<java.lang.Float> r0 = r1.vertextList
            return r0
    }

    public int getZIndex() {
            r1 = this;
            int r0 = r1.zIndex
            return r0
    }

    public boolean isFixedDisplaySizeEnabled() {
            r1 = this;
            boolean r0 = r1.fixedDisplaySizeEnabled
            return r0
    }

    public boolean isVisible() {
            r1 = this;
            boolean r0 = r1.visibile
            return r0
    }

    public com.amap.api.maps.model.GL3DModelOptions position(com.amap.api.maps.model.LatLng r1) {
            r0 = this;
            r0.latLng = r1
            return r0
    }

    public com.amap.api.maps.model.GL3DModelOptions setAltitude(double r1) {
            r0 = this;
            r0.altitude = r1
            return r0
    }

    public com.amap.api.maps.model.GL3DModelOptions setFixDisplaySize(double r1, double r3) {
            r0 = this;
            r0.fixedDisplaySizeX = r1
            r0.fixedDisplaySizeY = r3
            return r0
    }

    public com.amap.api.maps.model.GL3DModelOptions setFixedDisplaySizeEnabled(boolean r1) {
            r0 = this;
            r0.fixedDisplaySizeEnabled = r1
            return r0
    }

    public com.amap.api.maps.model.GL3DModelOptions setModelFixedLength(int r1) {
            r0 = this;
            r0.fixedLength = r1
            return r0
    }

    public com.amap.api.maps.model.GL3DModelOptions setVisible(boolean r1) {
            r0 = this;
            r0.visibile = r1
            return r0
    }

    public com.amap.api.maps.model.GL3DModelOptions setzIndex(int r1) {
            r0 = this;
            r0.zIndex = r1
            return r0
    }

    public com.amap.api.maps.model.GL3DModelOptions snippet(java.lang.String r1) {
            r0 = this;
            r0.snippet = r1
            return r0
    }

    public com.amap.api.maps.model.GL3DModelOptions textureDrawable(com.amap.api.maps.model.BitmapDescriptor r1) {
            r0 = this;
            r0.bitmapDescriptor = r1
            return r0
    }

    public com.amap.api.maps.model.GL3DModelOptions title(java.lang.String r1) {
            r0 = this;
            r0.title = r1
            return r0
    }

    public com.amap.api.maps.model.GL3DModelOptions vertexData(java.lang.String r2) {
            r1 = this;
            if (r2 == 0) goto Ld
            int r0 = r2.length()
            if (r0 <= 0) goto Ld
            r1.modelData = r2
            r2 = 1
            r1.isModeltUpdate = r2
        Ld:
            return r1
    }

    public com.amap.api.maps.model.GL3DModelOptions vertexData(java.util.List<java.lang.Float> r6, java.util.List<java.lang.Float> r7) {
            r5 = this;
            r5.vertextList = r6
            r5.textrueList = r7
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.util.List<java.lang.Float> r7 = r5.vertextList
            java.lang.String r0 = "\n"
            r1 = 0
            java.lang.String r2 = " "
            if (r7 == 0) goto L4d
            r7 = 0
        L13:
            java.util.List<java.lang.Float> r3 = r5.vertextList
            int r3 = r3.size()
            int r3 = r3 + (-3)
            if (r7 >= r3) goto L4d
            java.lang.String r3 = "v "
            r6.append(r3)
            java.util.List<java.lang.Float> r3 = r5.vertextList
            java.lang.Object r3 = r3.get(r7)
            r6.append(r3)
            r6.append(r2)
            java.util.List<java.lang.Float> r3 = r5.vertextList
            int r4 = r7 + 1
            java.lang.Object r3 = r3.get(r4)
            r6.append(r3)
            r6.append(r2)
            java.util.List<java.lang.Float> r3 = r5.vertextList
            int r4 = r7 + 2
            java.lang.Object r3 = r3.get(r4)
            r6.append(r3)
            r6.append(r0)
            int r7 = r7 + 3
            goto L13
        L4d:
            java.util.List<java.lang.Float> r7 = r5.textrueList
            if (r7 == 0) goto L86
        L51:
            java.util.List<java.lang.Float> r7 = r5.textrueList
            int r7 = r7.size()
            int r7 = r7 + (-2)
            if (r1 >= r7) goto L86
            java.lang.String r7 = "vt "
            r6.append(r7)
            java.util.List<java.lang.Float> r7 = r5.textrueList
            java.lang.Object r7 = r7.get(r1)
            r6.append(r7)
            r6.append(r2)
            java.util.List<java.lang.Float> r7 = r5.textrueList
            int r3 = r1 + 1
            java.lang.Object r7 = r7.get(r3)
            java.lang.Float r7 = (java.lang.Float) r7
            float r7 = r7.floatValue()
            r3 = 1065353216(0x3f800000, float:1.0)
            float r3 = r3 - r7
            r6.append(r3)
            r6.append(r0)
            int r1 = r1 + 2
            goto L51
        L86:
            java.lang.String r6 = r6.toString()
            r5.vertexData(r6)
            return r5
    }
}

package com.amap.api.maps.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class NavigateArrowOptions extends com.amap.api.maps.model.BaseOptions implements android.os.Parcelable, java.lang.Cloneable {

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    public static final com.amap.api.maps.model.NavigateArrowOptionsCreator CREATOR = null;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    java.lang.String a;
    private int arrowLineInnerResId;
    private int arrowLineOuterResId;
    private int arrowLineShadowResId;
    private boolean is3DModel;
    private boolean isVisible;
    private final java.util.List<com.amap.api.maps.model.LatLng> points;
    private int sideColor;
    private int topColor;
    private float width;
    private float zIndex;

    static {
            com.amap.api.maps.model.NavigateArrowOptionsCreator r0 = new com.amap.api.maps.model.NavigateArrowOptionsCreator
            r0.<init>()
            com.amap.api.maps.model.NavigateArrowOptions.CREATOR = r0
            return
    }

    public NavigateArrowOptions() {
            r4 = this;
            r4.<init>()
            r0 = 1092616192(0x41200000, float:10.0)
            r4.width = r0
            r0 = 235(0xeb, float:3.3E-43)
            r1 = 204(0xcc, float:2.86E-43)
            r2 = 221(0xdd, float:3.1E-43)
            r3 = 87
            int r0 = android.graphics.Color.argb(r2, r3, r0, r1)
            r4.topColor = r0
            r0 = 172(0xac, float:2.41E-43)
            r1 = 146(0x92, float:2.05E-43)
            r2 = 170(0xaa, float:2.38E-43)
            r3 = 0
            int r0 = android.graphics.Color.argb(r2, r3, r0, r1)
            r4.sideColor = r0
            r0 = 0
            r4.zIndex = r0
            r0 = 1
            r4.isVisible = r0
            r4.is3DModel = r3
            r0 = 111(0x6f, float:1.56E-43)
            r4.arrowLineInnerResId = r0
            r0 = 222(0xde, float:3.11E-43)
            r4.arrowLineOuterResId = r0
            r0 = 333(0x14d, float:4.67E-43)
            r4.arrowLineShadowResId = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4.points = r0
            java.lang.String r0 = "NavigateArrowOptions"
            r4.type = r0
            return
    }

    public final com.amap.api.maps.model.NavigateArrowOptions add(com.amap.api.maps.model.LatLng r2) {
            r1 = this;
            java.util.List<com.amap.api.maps.model.LatLng> r0 = r1.points
            r0.add(r2)
            return r1
    }

    public final com.amap.api.maps.model.NavigateArrowOptions add(com.amap.api.maps.model.LatLng... r2) {
            r1 = this;
            java.util.List<com.amap.api.maps.model.LatLng> r0 = r1.points
            java.util.List r2 = java.util.Arrays.asList(r2)
            r0.addAll(r2)
            return r1
    }

    public final com.amap.api.maps.model.NavigateArrowOptions addAll(java.lang.Iterable<com.amap.api.maps.model.LatLng> r3) {
            r2 = this;
            java.util.Iterator r3 = r3.iterator()
        L4:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L16
            java.lang.Object r0 = r3.next()
            com.amap.api.maps.model.LatLng r0 = (com.amap.api.maps.model.LatLng) r0
            java.util.List<com.amap.api.maps.model.LatLng> r1 = r2.points
            r1.add(r0)
            goto L4
        L16:
            return r2
    }

    public final com.amap.api.maps.model.NavigateArrowOptions clone() {
            r3 = this;
            super.clone()     // Catch: java.lang.CloneNotSupportedException -> L3
        L3:
            com.amap.api.maps.model.NavigateArrowOptions r0 = new com.amap.api.maps.model.NavigateArrowOptions
            r0.<init>()
            java.util.List<com.amap.api.maps.model.LatLng> r1 = r0.points
            java.util.List<com.amap.api.maps.model.LatLng> r2 = r3.points
            r1.addAll(r2)
            float r1 = r3.width
            r0.width = r1
            int r1 = r3.topColor
            r0.topColor = r1
            int r1 = r3.sideColor
            r0.sideColor = r1
            float r1 = r3.zIndex
            r0.zIndex = r1
            boolean r1 = r3.isVisible
            r0.isVisible = r1
            boolean r1 = r3.is3DModel
            r0.is3DModel = r1
            java.lang.String r1 = r3.a
            r0.a = r1
            int r1 = r3.arrowLineInnerResId
            r0.arrowLineInnerResId = r1
            int r1 = r3.arrowLineOuterResId
            r0.arrowLineOuterResId = r1
            int r1 = r3.arrowLineShadowResId
            r0.arrowLineShadowResId = r1
            return r0
    }

    /* renamed from: clone, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ java.lang.Object m14clone() throws java.lang.CloneNotSupportedException {
            r1 = this;
            com.amap.api.maps.model.NavigateArrowOptions r0 = r1.clone()
            return r0
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public final java.util.List<com.amap.api.maps.model.LatLng> getPoints() {
            r1 = this;
            java.util.List<com.amap.api.maps.model.LatLng> r0 = r1.points
            return r0
    }

    public final int getSideColor() {
            r1 = this;
            int r0 = r1.sideColor
            return r0
    }

    public final int getTopColor() {
            r1 = this;
            int r0 = r1.topColor
            return r0
    }

    public final float getWidth() {
            r1 = this;
            float r0 = r1.width
            return r0
    }

    public final float getZIndex() {
            r1 = this;
            float r0 = r1.zIndex
            return r0
    }

    public final boolean is3DModel() {
            r1 = this;
            boolean r0 = r1.is3DModel
            return r0
    }

    public final boolean isVisible() {
            r1 = this;
            boolean r0 = r1.isVisible
            return r0
    }

    public final com.amap.api.maps.model.NavigateArrowOptions set3DModel(boolean r1) {
            r0 = this;
            r0.is3DModel = r1
            return r0
    }

    public final void setPoints(java.util.List<com.amap.api.maps.model.LatLng> r2) {
            r1 = this;
            if (r2 == 0) goto Le
            java.util.List<com.amap.api.maps.model.LatLng> r0 = r1.points
            if (r0 == r2) goto Le
            r0.clear()     // Catch: java.lang.Throwable -> Le
            java.util.List<com.amap.api.maps.model.LatLng> r0 = r1.points     // Catch: java.lang.Throwable -> Le
            r0.addAll(r2)     // Catch: java.lang.Throwable -> Le
        Le:
            return
    }

    public final com.amap.api.maps.model.NavigateArrowOptions sideColor(int r1) {
            r0 = this;
            r0.sideColor = r1
            return r0
    }

    public final com.amap.api.maps.model.NavigateArrowOptions topColor(int r1) {
            r0 = this;
            r0.topColor = r1
            return r0
    }

    public final com.amap.api.maps.model.NavigateArrowOptions visible(boolean r1) {
            r0 = this;
            r0.isVisible = r1
            return r0
    }

    public final com.amap.api.maps.model.NavigateArrowOptions width(float r1) {
            r0 = this;
            r0.width = r1
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            java.util.List<com.amap.api.maps.model.LatLng> r2 = r0.points
            r1.writeTypedList(r2)
            float r2 = r0.width
            r1.writeFloat(r2)
            int r2 = r0.topColor
            r1.writeInt(r2)
            int r2 = r0.sideColor
            r1.writeInt(r2)
            float r2 = r0.zIndex
            r1.writeFloat(r2)
            boolean r2 = r0.isVisible
            byte r2 = (byte) r2
            r1.writeByte(r2)
            java.lang.String r2 = r0.a
            r1.writeString(r2)
            boolean r2 = r0.is3DModel
            byte r2 = (byte) r2
            r1.writeByte(r2)
            return
    }

    public final com.amap.api.maps.model.NavigateArrowOptions zIndex(float r1) {
            r0 = this;
            r0.zIndex = r1
            return r0
    }
}

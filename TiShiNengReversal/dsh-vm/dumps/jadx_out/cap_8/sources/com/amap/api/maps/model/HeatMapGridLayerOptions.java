package com.amap.api.maps.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class HeatMapGridLayerOptions extends com.amap.api.maps.model.BaseOptions {

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    public static final int TYPE_GRID = 1;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    public static final int TYPE_HEXAGON = 2;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    public static final int TYPE_NORMAL = 0;
    private boolean isPointsUpdated;
    private boolean isVisible;
    private java.util.List<com.amap.api.maps.model.ColorLatLng> mData;
    private int mType;
    private float maxZoom;
    private float minZoom;
    private float zIndex;

    public HeatMapGridLayerOptions() {
            r1 = this;
            r1.<init>()
            r0 = 1101004800(0x41a00000, float:20.0)
            r1.maxZoom = r0
            r0 = 1077936128(0x40400000, float:3.0)
            r1.minZoom = r0
            r0 = 0
            r1.zIndex = r0
            r0 = 1
            r1.isVisible = r0
            r0 = 2
            r1.mType = r0
            r0 = 0
            r1.isPointsUpdated = r0
            java.lang.String r0 = "HeatMapGridLayerOptions"
            r1.type = r0
            return
    }

    public com.amap.api.maps.model.HeatMapGridLayerOptions data(java.util.List<com.amap.api.maps.model.ColorLatLng> r1) {
            r0 = this;
            r0.mData = r1
            r1 = 1
            r0.isPointsUpdated = r1
            return r0
    }

    public java.util.List<com.amap.api.maps.model.ColorLatLng> getData() {
            r1 = this;
            java.util.List<com.amap.api.maps.model.ColorLatLng> r0 = r1.mData
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

    public boolean isVisible() {
            r1 = this;
            boolean r0 = r1.isVisible
            return r0
    }

    public com.amap.api.maps.model.HeatMapGridLayerOptions maxZoom(float r1) {
            r0 = this;
            r0.maxZoom = r1
            return r0
    }

    public com.amap.api.maps.model.HeatMapGridLayerOptions minZoom(float r1) {
            r0 = this;
            r0.minZoom = r1
            return r0
    }

    public com.amap.api.maps.model.HeatMapGridLayerOptions type(int r1) {
            r0 = this;
            r0.mType = r1
            return r0
    }

    public com.amap.api.maps.model.HeatMapGridLayerOptions visible(boolean r1) {
            r0 = this;
            r0.isVisible = r1
            return r0
    }

    public com.amap.api.maps.model.HeatMapGridLayerOptions zIndex(float r1) {
            r0 = this;
            r0.zIndex = r1
            return r0
    }
}

package com.amap.api.maps.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class BuildingOverlayOptions extends com.amap.api.maps.model.BaseOptions {
    private int buildingHeight;
    private int buildingHeightScale;
    private java.util.List<com.amap.api.maps.model.LatLng> buildingLatlngs;
    private int[] buildingLatlngsPoints;
    private int buildingSideColor;
    private int buildingTopColor;
    private boolean isVisible;
    private float zindex;

    public BuildingOverlayOptions() {
            r2 = this;
            r2.<init>()
            r0 = -1
            r2.buildingHeight = r0
            r0 = 1
            r2.buildingHeightScale = r0
            r1 = -7829368(0xffffffffff888888, float:NaN)
            r2.buildingTopColor = r1
            r2.buildingSideColor = r1
            r2.isVisible = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.buildingLatlngs = r0
            return
    }

    public int getBuildingHeight() {
            r1 = this;
            int r0 = r1.buildingHeight
            return r0
    }

    public int getBuildingHeightScale() {
            r1 = this;
            int r0 = r1.buildingHeightScale
            return r0
    }

    public java.util.List<com.amap.api.maps.model.LatLng> getBuildingLatlngs() {
            r1 = this;
            java.util.List<com.amap.api.maps.model.LatLng> r0 = r1.buildingLatlngs
            return r0
    }

    public int getBuildingSideColor() {
            r1 = this;
            int r0 = r1.buildingSideColor
            return r0
    }

    public int getBuildingTopColor() {
            r1 = this;
            int r0 = r1.buildingTopColor
            return r0
    }

    public synchronized int[] getPoints() {
            r8 = this;
            monitor-enter(r8)
            java.util.List<com.amap.api.maps.model.LatLng> r0 = r8.buildingLatlngs     // Catch: java.lang.Throwable -> L40
            r1 = 0
            if (r0 == 0) goto L47
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L40
            if (r0 <= 0) goto L47
            java.util.List<com.amap.api.maps.model.LatLng> r0 = r8.buildingLatlngs     // Catch: java.lang.Throwable -> L40
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L40
            int r0 = r0 * 2
            int[] r0 = new int[r0]     // Catch: java.lang.Throwable -> L40
            r2 = 0
        L17:
            java.util.List<com.amap.api.maps.model.LatLng> r3 = r8.buildingLatlngs     // Catch: java.lang.Throwable -> L40
            int r3 = r3.size()     // Catch: java.lang.Throwable -> L40
            if (r1 >= r3) goto L45
            java.util.List<com.amap.api.maps.model.LatLng> r3 = r8.buildingLatlngs     // Catch: java.lang.Throwable -> L40
            java.lang.Object r3 = r3.get(r1)     // Catch: java.lang.Throwable -> L40
            com.amap.api.maps.model.LatLng r3 = (com.amap.api.maps.model.LatLng) r3     // Catch: java.lang.Throwable -> L40
            if (r3 == 0) goto L42
            double r4 = r3.latitude     // Catch: java.lang.Throwable -> L40
            double r6 = r3.longitude     // Catch: java.lang.Throwable -> L40
            r3 = 20
            android.graphics.Point r3 = com.autonavi.amap.mapcore.VirtualEarthProjection.latLongToPixels(r4, r6, r3)     // Catch: java.lang.Throwable -> L40
            int r4 = r2 + 1
            int r5 = r3.x     // Catch: java.lang.Throwable -> L40
            r0[r2] = r5     // Catch: java.lang.Throwable -> L40
            int r2 = r2 + 2
            int r3 = r3.y     // Catch: java.lang.Throwable -> L40
            r0[r4] = r3     // Catch: java.lang.Throwable -> L40
            goto L42
        L40:
            r0 = move-exception
            goto L4b
        L42:
            int r1 = r1 + 1
            goto L17
        L45:
            monitor-exit(r8)
            return r0
        L47:
            int[] r0 = new int[r1]     // Catch: java.lang.Throwable -> L40
            monitor-exit(r8)
            return r0
        L4b:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L40
            throw r0
    }

    public float getZIndex() {
            r1 = this;
            float r0 = r1.zindex
            return r0
    }

    public boolean isVisible() {
            r1 = this;
            boolean r0 = r1.isVisible
            return r0
    }

    public com.amap.api.maps.model.BuildingOverlayOptions setBuildingHeight(int r1) {
            r0 = this;
            r0.buildingHeight = r1
            return r0
    }

    public com.amap.api.maps.model.BuildingOverlayOptions setBuildingHeightScale(int r1) {
            r0 = this;
            r0.buildingHeightScale = r1
            return r0
    }

    public synchronized com.amap.api.maps.model.BuildingOverlayOptions setBuildingLatlngs(java.util.List<com.amap.api.maps.model.LatLng> r8) {
            r7 = this;
            monitor-enter(r7)
            r7.buildingLatlngs = r8     // Catch: java.lang.Throwable -> L3e
            if (r8 == 0) goto L40
            int r0 = r8.size()     // Catch: java.lang.Throwable -> L3e
            if (r0 <= 0) goto L40
            int r0 = r8.size()     // Catch: java.lang.Throwable -> L3e
            int r0 = r0 * 2
            int[] r0 = new int[r0]     // Catch: java.lang.Throwable -> L3e
            r7.buildingLatlngsPoints = r0     // Catch: java.lang.Throwable -> L3e
            r0 = 0
            r1 = 0
        L17:
            int r2 = r8.size()     // Catch: java.lang.Throwable -> L3e
            if (r0 >= r2) goto L40
            java.lang.Object r2 = r8.get(r0)     // Catch: java.lang.Throwable -> L3e
            com.amap.api.maps.model.LatLng r2 = (com.amap.api.maps.model.LatLng) r2     // Catch: java.lang.Throwable -> L3e
            double r3 = r2.latitude     // Catch: java.lang.Throwable -> L3e
            double r5 = r2.longitude     // Catch: java.lang.Throwable -> L3e
            r2 = 20
            android.graphics.Point r2 = com.autonavi.amap.mapcore.VirtualEarthProjection.latLongToPixels(r3, r5, r2)     // Catch: java.lang.Throwable -> L3e
            int[] r3 = r7.buildingLatlngsPoints     // Catch: java.lang.Throwable -> L3e
            int r4 = r1 + 1
            int r5 = r2.x     // Catch: java.lang.Throwable -> L3e
            r3[r1] = r5     // Catch: java.lang.Throwable -> L3e
            int r1 = r1 + 2
            int r2 = r2.y     // Catch: java.lang.Throwable -> L3e
            r3[r4] = r2     // Catch: java.lang.Throwable -> L3e
            int r0 = r0 + 1
            goto L17
        L3e:
            r8 = move-exception
            goto L42
        L40:
            monitor-exit(r7)
            return r7
        L42:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L3e
            throw r8
    }

    public com.amap.api.maps.model.BuildingOverlayOptions setBuildingSideColor(int r1) {
            r0 = this;
            r0.buildingSideColor = r1
            return r0
    }

    public com.amap.api.maps.model.BuildingOverlayOptions setBuildingTopColor(int r1) {
            r0 = this;
            r0.buildingTopColor = r1
            return r0
    }

    public void setVisible(boolean r1) {
            r0 = this;
            r0.isVisible = r1
            return
    }

    public void setZIndex(float r1) {
            r0 = this;
            r0.zindex = r1
            return
    }
}

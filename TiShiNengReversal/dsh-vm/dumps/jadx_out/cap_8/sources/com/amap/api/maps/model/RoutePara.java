package com.amap.api.maps.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class RoutePara {
    private int drivingRouteStyle;
    private java.lang.String endName;
    private com.amap.api.maps.model.LatLng endPoint;
    private java.lang.String startName;
    private com.amap.api.maps.model.LatLng startPoint;
    private int transitRouteStyle;

    public RoutePara() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.drivingRouteStyle = r0
            r1.transitRouteStyle = r0
            return
    }

    public int getDrivingRouteStyle() {
            r1 = this;
            int r0 = r1.drivingRouteStyle
            return r0
    }

    public java.lang.String getEndName() {
            r1 = this;
            java.lang.String r0 = r1.endName
            return r0
    }

    public com.amap.api.maps.model.LatLng getEndPoint() {
            r1 = this;
            com.amap.api.maps.model.LatLng r0 = r1.endPoint
            return r0
    }

    public java.lang.String getStartName() {
            r1 = this;
            java.lang.String r0 = r1.startName
            return r0
    }

    public com.amap.api.maps.model.LatLng getStartPoint() {
            r1 = this;
            com.amap.api.maps.model.LatLng r0 = r1.startPoint
            return r0
    }

    public int getTransitRouteStyle() {
            r1 = this;
            int r0 = r1.transitRouteStyle
            return r0
    }

    public void setDrivingRouteStyle(int r2) {
            r1 = this;
            if (r2 < 0) goto L8
            r0 = 9
            if (r2 >= r0) goto L8
            r1.drivingRouteStyle = r2
        L8:
            return
    }

    public void setEndName(java.lang.String r1) {
            r0 = this;
            r0.endName = r1
            return
    }

    public void setEndPoint(com.amap.api.maps.model.LatLng r1) {
            r0 = this;
            r0.endPoint = r1
            return
    }

    public void setStartName(java.lang.String r1) {
            r0 = this;
            r0.startName = r1
            return
    }

    public void setStartPoint(com.amap.api.maps.model.LatLng r1) {
            r0 = this;
            r0.startPoint = r1
            return
    }

    public void setTransitRouteStyle(int r2) {
            r1 = this;
            if (r2 < 0) goto L7
            r0 = 6
            if (r2 >= r0) goto L7
            r1.transitRouteStyle = r2
        L7:
            return
    }
}

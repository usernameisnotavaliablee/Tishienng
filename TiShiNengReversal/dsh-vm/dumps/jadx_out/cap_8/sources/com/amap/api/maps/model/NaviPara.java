package com.amap.api.maps.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class NaviPara {

    @java.lang.Deprecated
    public static final int DRIVING_AVOID_CONGESTION = 4;

    @java.lang.Deprecated
    public static final int DRIVING_DEFAULT = 0;

    @java.lang.Deprecated
    public static final int DRIVING_NO_HIGHWAY = 3;

    @java.lang.Deprecated
    public static final int DRIVING_NO_HIGHWAY_AVOID_CONGESTION = 6;

    @java.lang.Deprecated
    public static final int DRIVING_NO_HIGHWAY_AVOID_SHORT_MONEY = 5;

    @java.lang.Deprecated
    public static final int DRIVING_NO_HIGHWAY_SAVE_MONEY_AVOID_CONGESTION = 8;

    @java.lang.Deprecated
    public static final int DRIVING_SAVE_MONEY = 1;

    @java.lang.Deprecated
    public static final int DRIVING_SAVE_MONEY_AVOID_CONGESTION = 7;

    @java.lang.Deprecated
    public static final int DRIVING_SHORT_DISTANCE = 2;
    private com.amap.api.maps.model.LatLng latLng;
    private int naviStyle;

    public NaviPara() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.naviStyle = r0
            return
    }

    public int getNaviStyle() {
            r1 = this;
            int r0 = r1.naviStyle
            return r0
    }

    public com.amap.api.maps.model.LatLng getTargetPoint() {
            r1 = this;
            com.amap.api.maps.model.LatLng r0 = r1.latLng
            return r0
    }

    public void setNaviStyle(int r2) {
            r1 = this;
            if (r2 < 0) goto L8
            r0 = 9
            if (r2 >= r0) goto L8
            r1.naviStyle = r2
        L8:
            return
    }

    public void setTargetPoint(com.amap.api.maps.model.LatLng r1) {
            r0 = this;
            r0.latLng = r1
            return
    }
}

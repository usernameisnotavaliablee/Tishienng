package com.autonavi.base.ae.gmap.gloverlay;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public interface IRouteOverlayInner {
    void addRouteItem(int r1, com.amap.api.col.p0003l.er[] r2, int r3, com.amap.api.col.p0003l.eq r4, int[] r5);

    void addRouteName();

    android.util.Pair<java.lang.Float, java.lang.Float> getDisplayRange();

    int getOverlayProperty();

    boolean isVisible();

    void remove();

    void removeRouteName();

    void setArrow3DTexture(com.amap.api.maps.model.BitmapDescriptor r1);

    void setArrowFlow(boolean r1);

    void setCar2DPosition(int r1, float r2);

    void setCar3DPosition(int r1, float r2);

    void setDisplayRange(float r1, float r2);

    void setHighlightParam(com.amap.api.maps.model.RouteOverlay.RouteOverlayHighLightParam r1);

    void setHighlightType(int r1);

    void setLine2DWidth(int r1, int r2);

    void setLineWidthScale(float r1);

    void setOverlayProperty(int r1);

    void setRouteItemParam(com.amap.api.col.p0003l.er r1);

    void setSelectStatus(boolean r1);

    void setShowArrow(boolean r1);

    void setShowNaviRouteNameCountMap(java.util.Map<java.lang.Integer, java.lang.Integer> r1);

    void setVisible(boolean r1);
}

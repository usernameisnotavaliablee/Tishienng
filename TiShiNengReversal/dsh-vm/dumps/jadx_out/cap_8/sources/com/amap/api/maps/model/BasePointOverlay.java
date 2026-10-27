package com.amap.api.maps.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class BasePointOverlay extends com.amap.api.maps.model.BaseOverlay {
    public BasePointOverlay(java.lang.String r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public abstract void destroy();

    public abstract java.lang.String getId();

    public abstract java.lang.Object getObject();

    public abstract com.amap.api.maps.model.LatLng getPosition();

    public abstract float getRotateAngle();

    public abstract java.lang.String getSnippet();

    public abstract java.lang.String getTitle();

    public abstract boolean isInfoWindowEnable();

    public abstract boolean isVisible();

    public abstract void remove();

    public abstract void setAnimation(com.amap.api.maps.model.animation.Animation r1);

    public abstract void setGeoPoint(com.autonavi.amap.mapcore.IPoint r1);

    public abstract void setObject(java.lang.Object r1);

    public abstract void setPosition(com.amap.api.maps.model.LatLng r1);

    public abstract void setRotateAngle(float r1);

    public abstract void setSnippet(java.lang.String r1);

    public abstract void setTitle(java.lang.String r1);

    public abstract void setVisible(boolean r1);

    public abstract void showInfoWindow();

    public abstract boolean startAnimation();
}

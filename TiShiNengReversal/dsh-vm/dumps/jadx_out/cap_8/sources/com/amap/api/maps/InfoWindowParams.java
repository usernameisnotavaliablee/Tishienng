package com.amap.api.maps;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class InfoWindowParams {
    public static final int INFOWINDOW_TYPE_IMAGE = 1;
    public static final int INFOWINDOW_TYPE_VIEW = 2;
    private android.view.View infoContent;
    private android.view.View infoWindow;
    private int infoWindowType;
    private int mInfoWindowUpdateTime;

    public InfoWindowParams() {
            r1 = this;
            r1.<init>()
            r0 = 2
            r1.infoWindowType = r0
            return
    }

    public android.view.View getInfoContents() {
            r1 = this;
            android.view.View r0 = r1.infoContent
            return r0
    }

    public android.view.View getInfoWindow() {
            r1 = this;
            android.view.View r0 = r1.infoWindow
            return r0
    }

    public int getInfoWindowType() {
            r1 = this;
            int r0 = r1.infoWindowType
            return r0
    }

    public long getInfoWindowUpdateTime() {
            r2 = this;
            int r0 = r2.mInfoWindowUpdateTime
            long r0 = (long) r0
            return r0
    }

    public void setInfoContent(android.view.View r1) {
            r0 = this;
            r0.infoContent = r1
            return
    }

    public void setInfoWindow(android.view.View r1) {
            r0 = this;
            r0.infoWindow = r1
            return
    }

    public void setInfoWindowType(int r1) {
            r0 = this;
            r0.infoWindowType = r1
            return
    }

    public void setInfoWindowUpdateTime(int r1) {
            r0 = this;
            r0.mInfoWindowUpdateTime = r1
            return
    }
}

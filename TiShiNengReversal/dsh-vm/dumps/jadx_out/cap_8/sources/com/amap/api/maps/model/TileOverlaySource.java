package com.amap.api.maps.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class TileOverlaySource {

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    public static int TILESOURCE_TYPE_FBO_TEXTURE = 4;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    public static int TILESOURCE_TYPE_IMAGE = 1;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    public static int TILESOURCE_TYPE_IMAGE_DEM = 3;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    public static int TILESOURCE_TYPE_VECTOR = 2;
    private java.lang.String attribute;
    private boolean cacheEnabled;
    private final int id;
    private int maxZoom;
    private int minZoom;
    private final int type;
    private final java.lang.String url;

    static {
            return
    }

    public TileOverlaySource(int r2, int r3, java.lang.String r4) {
            r1 = this;
            r1.<init>()
            r0 = 3
            r1.minZoom = r0
            r0 = 20
            r1.maxZoom = r0
            r0 = 1
            r1.cacheEnabled = r0
            r1.url = r4
            r1.type = r3
            r1.id = r2
            return
    }

    public int getId() {
            r1 = this;
            int r0 = r1.id
            return r0
    }

    public int getMaxZoom() {
            r1 = this;
            int r0 = r1.maxZoom
            return r0
    }

    public int getMinZoom() {
            r1 = this;
            int r0 = r1.minZoom
            return r0
    }

    public int getType() {
            r1 = this;
            int r0 = r1.type
            return r0
    }

    public java.lang.String getUrl() {
            r1 = this;
            java.lang.String r0 = r1.url
            return r0
    }

    public boolean isCacheEnabled() {
            r1 = this;
            boolean r0 = r1.cacheEnabled
            return r0
    }

    public void setCacheEnabled(boolean r1) {
            r0 = this;
            r0.cacheEnabled = r1
            return
    }

    public void setMaxZoom(int r1) {
            r0 = this;
            r0.maxZoom = r1
            return
    }

    public void setMinZoom(int r1) {
            r0 = this;
            r0.minZoom = r1
            return
    }
}

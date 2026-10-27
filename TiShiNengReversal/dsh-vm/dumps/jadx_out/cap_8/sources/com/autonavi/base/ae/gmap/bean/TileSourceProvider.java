package com.autonavi.base.ae.gmap.bean;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public interface TileSourceProvider extends com.amap.api.maps.model.TileProvider {
    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    void cancel(com.autonavi.base.ae.gmap.bean.TileSourceReq r1);

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    com.amap.api.maps.model.Tile getTile(com.autonavi.base.ae.gmap.bean.TileSourceReq r1);
}

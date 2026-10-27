package com.amap.api.maps.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public interface TileProvider {
    public static final com.amap.api.maps.model.Tile NO_TILE = null;

    static {
            r0 = -1
            r1 = 0
            com.amap.api.maps.model.Tile r0 = com.amap.api.maps.model.Tile.obtain(r0, r0, r1)
            com.amap.api.maps.model.TileProvider.NO_TILE = r0
            return
    }

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    com.amap.api.maps.model.Tile getTile(int r1, int r2, int r3);

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    int getTileHeight();

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    int getTileWidth();
}

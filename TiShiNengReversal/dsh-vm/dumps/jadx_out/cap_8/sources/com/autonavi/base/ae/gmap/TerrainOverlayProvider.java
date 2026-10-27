package com.autonavi.base.ae.gmap;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class TerrainOverlayProvider {
    private static final int TERRAIN_OVERLAY_SOURCE_BASE_ID = 1;
    private static final int TERRAIN_OVERLAY_SOURCE_HIGH_ID = 0;
    private com.autonavi.base.ae.gmap.bean.TileProviderInner tileProviderInner;

    public TerrainOverlayProvider(com.amap.api.maps.interfaces.IGlOverlayLayer r7) {
            r6 = this;
            r6.<init>()
            com.amap.api.maps.model.TileOverlaySource r0 = new com.amap.api.maps.model.TileOverlaySource
            int r1 = com.amap.api.maps.model.TileOverlaySource.TILESOURCE_TYPE_IMAGE_DEM
            java.lang.String r2 = "http://restsdk.amap.com/rest/lbs/dem/data?z=%d&x=%d&y=%d&type=2"
            r3 = 0
            r0.<init>(r3, r1, r2)
            r1 = 3
            r0.setMinZoom(r1)
            r1 = 10
            r0.setMaxZoom(r1)
            r1 = 1
            r0.setCacheEnabled(r1)
            int r2 = com.amap.api.maps.model.TileOverlaySource.TILESOURCE_TYPE_FBO_TEXTURE
            com.amap.api.maps.model.TileOverlaySource r4 = new com.amap.api.maps.model.TileOverlaySource
            java.lang.String r5 = "http://mst01.is.autonavi.com/appmaptile?z=%d&x=%d&y=%d&lang=zh_cn&size=1&scale=1&style=6"
            r4.<init>(r1, r2, r5)
            int r5 = com.amap.api.maps.model.TileOverlaySource.TILESOURCE_TYPE_FBO_TEXTURE
            if (r2 == r5) goto L28
            r3 = 1
        L28:
            r4.setCacheEnabled(r3)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r1.add(r0)
            r1.add(r4)
            com.autonavi.base.ae.gmap.bean.TileProviderInner r2 = new com.autonavi.base.ae.gmap.bean.TileProviderInner
            com.amap.api.col.3l.h r3 = new com.amap.api.col.3l.h
            r3.<init>(r0, r4)
            r2.<init>(r3)
            r6.tileProviderInner = r2
            java.lang.String r0 = "TerrainTileOverlay"
            r2.init(r7, r0)
            com.autonavi.base.ae.gmap.bean.TileProviderInner r7 = r6.tileProviderInner
            r7.setTileSource(r1)
            return
    }

    public com.amap.api.maps.model.BitmapDescriptor getDefaultTerrain() {
            r1 = this;
            java.lang.String r0 = "terrainDefault.png"
            com.amap.api.maps.model.BitmapDescriptor r0 = com.amap.api.maps.model.BitmapDescriptorFactory.fromAsset(r0)
            return r0
    }

    public java.util.List<com.amap.api.maps.model.BitmapDescriptor> getSkyBoxImages() {
            r6 = this;
            java.lang.String r4 = "map_custom/skybox/top.png"
            java.lang.String r5 = "map_custom/skybox/bottom.png"
            java.lang.String r0 = "map_custom/skybox/right.png"
            java.lang.String r1 = "map_custom/skybox/left.png"
            java.lang.String r2 = "map_custom/skybox/front.png"
            java.lang.String r3 = "map_custom/skybox/back.png"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3, r4, r5}
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 0
        L16:
            r3 = 6
            if (r2 >= r3) goto L25
            r3 = r0[r2]
            com.amap.api.maps.model.BitmapDescriptor r3 = com.amap.api.maps.model.BitmapDescriptorFactory.fromAsset(r3)
            r1.add(r3)
            int r2 = r2 + 1
            goto L16
        L25:
            return r1
    }

    public com.autonavi.base.ae.gmap.bean.TileProviderInner getTileProvider() {
            r1 = this;
            com.autonavi.base.ae.gmap.bean.TileProviderInner r0 = r1.tileProviderInner
            return r0
    }
}

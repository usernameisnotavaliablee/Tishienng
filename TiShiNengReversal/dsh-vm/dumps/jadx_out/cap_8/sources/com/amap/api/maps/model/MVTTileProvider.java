package com.amap.api.maps.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class MVTTileProvider implements com.amap.api.maps.model.TileProvider {
    private java.lang.String id;
    private java.lang.String key;
    private int tileSize;
    private java.lang.String url;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class a extends com.amap.api.col.p0003l.k2 {
        java.lang.String a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.amap.api.maps.model.MVTTileProvider f4999b;

        public a(com.amap.api.maps.model.MVTTileProvider r1, java.lang.String r2) {
                r0 = this;
                r0.f4999b = r1
                r0.<init>()
                r1 = 0
                r0.isPostFlag = r1
                r0.a = r2
                return
        }

        @Override // com.amap.api.col.p0003l.Cif
        public final java.lang.String getURL() {
                r1 = this;
                java.lang.String r0 = r1.a
                return r0
        }
    }

    public MVTTileProvider(java.lang.String r1, java.lang.String r2, java.lang.String r3) {
            r0 = this;
            r0.<init>()
            r0.url = r1
            r0.key = r2
            r0.id = r3
            r1 = 256(0x100, float:3.59E-43)
            r0.tileSize = r1
            return
    }

    private java.lang.String a(int r4, int r5, int r6, int r7) {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r3.url
            r0.append(r1)
            java.lang.String r1 = "?z=%d&x=%d&y=%d&size=%d&key="
            r0.append(r1)
            java.lang.String r1 = r3.key
            r0.append(r1)
            java.lang.String r1 = "&id="
            r0.append(r1)
            java.lang.String r1 = r3.id
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r1 = 4
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            r4 = 1
            r1[r4] = r5
            r4 = 2
            r1[r4] = r6
            r4 = 3
            r1[r4] = r7
            java.lang.String r4 = java.lang.String.format(r0, r1)
            return r4
    }

    private byte[] a(int r2, int r3, int r4) {
            r1 = this;
            int r0 = r1.tileSize
            java.lang.String r2 = r1.a(r2, r3, r4, r0)
            com.amap.api.maps.model.MVTTileProvider$a r3 = new com.amap.api.maps.model.MVTTileProvider$a     // Catch: java.lang.Exception -> L10
            r3.<init>(r1, r2)     // Catch: java.lang.Exception -> L10
            byte[] r2 = r3.makeHttpRequestWithInterrupted()     // Catch: java.lang.Exception -> L10
            return r2
        L10:
            r2 = 0
            return r2
    }

    public final java.lang.String getId() {
            r1 = this;
            java.lang.String r0 = r1.id
            return r0
    }

    public final java.lang.String getKey() {
            r1 = this;
            java.lang.String r0 = r1.key
            return r0
    }

    @Override // com.amap.api.maps.model.TileProvider
    public final com.amap.api.maps.model.Tile getTile(int r2, int r3, int r4) {
            r1 = this;
            byte[] r2 = r1.a(r4, r2, r3)
            if (r2 != 0) goto L9
            com.amap.api.maps.model.Tile r2 = com.amap.api.maps.model.TileProvider.NO_TILE
            return r2
        L9:
            com.amap.api.maps.model.Tile r3 = new com.amap.api.maps.model.Tile
            int r4 = r1.tileSize
            r0 = 0
            r3.<init>(r4, r4, r2, r0)
            return r3
    }

    @Override // com.amap.api.maps.model.TileProvider
    public final int getTileHeight() {
            r1 = this;
            int r0 = r1.tileSize
            return r0
    }

    @Override // com.amap.api.maps.model.TileProvider
    public final int getTileWidth() {
            r1 = this;
            int r0 = r1.tileSize
            return r0
    }

    public final java.lang.String getUrl() {
            r1 = this;
            java.lang.String r0 = r1.url
            return r0
    }
}

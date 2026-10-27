package com.amap.api.maps.model.amap3dmodeltile;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class AMap3DModelTileProvider implements com.amap.api.maps.model.TileProvider {
    private static final java.lang.String DEFAULT_URL = "https://lbs-3dtiles-service.amap.com/basemap/tiles/staging?compose=building@1669011850923&compose=tree@1668678765481&z=%d&x=%d&y=%d";
    private int tileSize;
    private java.lang.String url;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class AMap3DModelRequest extends com.amap.api.col.p0003l.k2 {
        private java.lang.String baseQueryStr;
        private java.lang.String baseUrl;

        public AMap3DModelRequest(java.lang.String r5) {
                r4 = this;
                r4.<init>()
                java.lang.String r0 = ""
                r4.baseUrl = r0
                r4.baseQueryStr = r0
                r0 = 0
                r4.isPostFlag = r0
                java.lang.String r1 = "?"
                boolean r2 = r5.contains(r1)
                if (r2 != 0) goto L26
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r5)
                r0.append(r1)
                java.lang.String r5 = r0.toString()
                r4.baseUrl = r5
                return
            L26:
                java.lang.String r2 = "\\?"
                java.lang.String[] r5 = r5.split(r2)
                int r2 = r5.length
                r3 = 1
                if (r2 <= r3) goto L47
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r0 = r5[r0]
                r2.append(r0)
                r2.append(r1)
                java.lang.String r0 = r2.toString()
                r4.baseUrl = r0
                r5 = r5[r3]
                r4.baseQueryStr = r5
            L47:
                return
        }

        @Override // com.amap.api.col.p0003l.Cif
        public java.lang.String getURL() {
                r3 = this;
                java.lang.StringBuffer r0 = new java.lang.StringBuffer
                r0.<init>()
                java.lang.String r1 = r3.baseQueryStr
                r0.append(r1)
                java.lang.String r1 = "&key="
                r0.append(r1)
                android.content.Context r1 = com.amap.api.col.p0003l.d.f3124f
                java.lang.String r1 = com.amap.api.col.p0003l.f4.j(r1)
                r0.append(r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = r3.baseUrl
                r1.append(r2)
                java.lang.String r0 = r0.toString()
                java.lang.String r0 = r3.appendTsScode(r0)
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                return r0
        }
    }

    public AMap3DModelTileProvider() {
            r1 = this;
            r1.<init>()
            r0 = 256(0x100, float:3.59E-43)
            r1.tileSize = r0
            return
    }

    private byte[] a(int r1, int r2, int r3) {
            r0 = this;
            java.lang.String r1 = r0.b(r1, r2, r3)
            com.amap.api.maps.model.amap3dmodeltile.AMap3DModelTileProvider$AMap3DModelRequest r2 = new com.amap.api.maps.model.amap3dmodeltile.AMap3DModelTileProvider$AMap3DModelRequest     // Catch: java.lang.Exception -> Le
            r2.<init>(r1)     // Catch: java.lang.Exception -> Le
            byte[] r1 = r2.makeHttpRequestWithInterrupted()     // Catch: java.lang.Exception -> Le
            return r1
        Le:
            r1 = 0
            return r1
    }

    private java.lang.String b(int r4, int r5, int r6) {
            r3 = this;
            java.lang.String r0 = r3.url
            if (r0 == 0) goto L5
            goto L7
        L5:
            java.lang.String r0 = "https://lbs-3dtiles-service.amap.com/basemap/tiles/staging?compose=building@1669011850923&compose=tree@1668678765481&z=%d&x=%d&y=%d"
        L7:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            r4 = 1
            r1[r4] = r5
            r4 = 2
            r1[r4] = r6
            java.lang.String r4 = java.lang.String.format(r0, r1)
            return r4
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

    public final void setUrl(java.lang.String r1) {
            r0 = this;
            r0.url = r1
            return
    }
}

package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class h implements com.autonavi.base.ae.gmap.bean.TileSourceProvider {
    private int a;

    /* renamed from: b, reason: collision with root package name */
    private final com.amap.api.maps.model.TileOverlaySource f3440b;

    /* renamed from: c, reason: collision with root package name */
    private final com.amap.api.maps.model.TileOverlaySource f3441c;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class a extends com.amap.api.col.p0003l.k2 {
        private java.lang.String r;
        private java.lang.String s;
        final /* synthetic */ com.amap.api.col.p0003l.h t;

        public a(com.amap.api.col.p0003l.h r2, int r3, int r4, int r5, java.lang.String r6) {
                r1 = this;
                r1.t = r2
                r1.<init>()
                java.lang.String r2 = ""
                r1.r = r2
                r1.s = r2
                java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r5 = 3
                java.lang.Object[] r5 = new java.lang.Object[r5]
                r0 = 0
                r5[r0] = r2
                r2 = 1
                r5[r2] = r3
                r3 = 2
                r5[r3] = r4
                java.lang.String r3 = java.lang.String.format(r6, r5)
                java.lang.String r4 = "?"
                boolean r5 = r3.contains(r4)
                if (r5 != 0) goto L41
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r3)
                r2.append(r4)
                java.lang.String r2 = r2.toString()
                r1.r = r2
                return
            L41:
                java.lang.String r5 = "\\?"
                java.lang.String[] r3 = r3.split(r5)
                int r5 = r3.length
                if (r5 <= r2) goto L61
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                r6 = r3[r0]
                r5.append(r6)
                r5.append(r4)
                java.lang.String r4 = r5.toString()
                r1.r = r4
                r2 = r3[r2]
                r1.s = r2
            L61:
                return
        }

        @Override // com.amap.api.col.p0003l.k2, com.amap.api.col.p0003l.Cif
        public final java.util.Map<java.lang.String, java.lang.String> getRequestHead() {
                r1 = this;
                java.util.Map r0 = super.getRequestHead()
                return r0
        }

        @Override // com.amap.api.col.p0003l.Cif
        public final java.lang.String getURL() {
                r3 = this;
                java.lang.StringBuffer r0 = new java.lang.StringBuffer
                r0.<init>()
                java.lang.String r1 = r3.s
                r0.append(r1)
                java.lang.String r1 = "&key="
                r0.append(r1)
                android.content.Context r1 = com.amap.api.col.p0003l.d.f3124f
                java.lang.String r1 = com.amap.api.col.p0003l.f4.j(r1)
                r0.append(r1)
                java.lang.String r1 = "&channel=amapapi"
                r0.append(r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = r3.r
                r1.append(r2)
                java.lang.String r0 = r0.toString()
                java.lang.String r0 = r3.appendTsScode(r0)
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                return r0
        }
    }

    public h(com.amap.api.maps.model.TileOverlaySource r2, com.amap.api.maps.model.TileOverlaySource r3) {
            r1 = this;
            r1.<init>()
            r0 = 256(0x100, float:3.59E-43)
            r1.a = r0
            r1.f3440b = r2
            r1.f3441c = r3
            return
    }

    private com.amap.api.maps.model.Tile a(com.autonavi.base.ae.gmap.bean.TileSourceReq r8) {
            r7 = this;
            java.lang.String r0 = "/"
            java.lang.String r1 = com.amap.api.maps.MapsInitializer.TERRAIN_LOCAL_DEM_SOURCE_PATH
            r2 = 1
            int r3 = r8.x     // Catch: java.io.FileNotFoundException -> Lc java.lang.Throwable -> Lb1
            if (r3 <= 0) goto Le
            int r3 = r3 / 10
            goto Le
        Lc:
            goto L66
        Le:
            int r4 = r8.y     // Catch: java.io.FileNotFoundException -> Lc java.lang.Throwable -> Lb1
            if (r4 <= 0) goto L14
            int r4 = r4 / 10
        L14:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.io.FileNotFoundException -> Lc java.lang.Throwable -> Lb1
            r5.<init>()     // Catch: java.io.FileNotFoundException -> Lc java.lang.Throwable -> Lb1
            r5.append(r1)     // Catch: java.io.FileNotFoundException -> Lc java.lang.Throwable -> Lb1
            int r6 = r8.zoom     // Catch: java.io.FileNotFoundException -> Lc java.lang.Throwable -> Lb1
            r5.append(r6)     // Catch: java.io.FileNotFoundException -> Lc java.lang.Throwable -> Lb1
            r5.append(r0)     // Catch: java.io.FileNotFoundException -> Lc java.lang.Throwable -> Lb1
            r5.append(r3)     // Catch: java.io.FileNotFoundException -> Lc java.lang.Throwable -> Lb1
            r5.append(r0)     // Catch: java.io.FileNotFoundException -> Lc java.lang.Throwable -> Lb1
            r5.append(r4)     // Catch: java.io.FileNotFoundException -> Lc java.lang.Throwable -> Lb1
            r5.append(r0)     // Catch: java.io.FileNotFoundException -> Lc java.lang.Throwable -> Lb1
            int r0 = r8.x     // Catch: java.io.FileNotFoundException -> Lc java.lang.Throwable -> Lb1
            r5.append(r0)     // Catch: java.io.FileNotFoundException -> Lc java.lang.Throwable -> Lb1
            java.lang.String r0 = "_"
            r5.append(r0)     // Catch: java.io.FileNotFoundException -> Lc java.lang.Throwable -> Lb1
            int r0 = r8.y     // Catch: java.io.FileNotFoundException -> Lc java.lang.Throwable -> Lb1
            r5.append(r0)     // Catch: java.io.FileNotFoundException -> Lc java.lang.Throwable -> Lb1
            java.lang.String r0 = ".png"
            r5.append(r0)     // Catch: java.io.FileNotFoundException -> Lc java.lang.Throwable -> Lb1
            java.lang.String r0 = r5.toString()     // Catch: java.io.FileNotFoundException -> Lc java.lang.Throwable -> Lb1
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.io.FileNotFoundException -> Lc java.lang.Throwable -> Lb1
            java.io.File r4 = new java.io.File     // Catch: java.io.FileNotFoundException -> Lc java.lang.Throwable -> Lb1
            r4.<init>(r0)     // Catch: java.io.FileNotFoundException -> Lc java.lang.Throwable -> Lb1
            r3.<init>(r4)     // Catch: java.io.FileNotFoundException -> Lc java.lang.Throwable -> Lb1
            int r0 = r3.available()     // Catch: java.io.FileNotFoundException -> Lc java.lang.Throwable -> Lb1
            byte[] r0 = new byte[r0]     // Catch: java.io.FileNotFoundException -> Lc java.lang.Throwable -> Lb1
            r3.read(r0)     // Catch: java.io.FileNotFoundException -> Lc java.lang.Throwable -> Lb1
            com.amap.api.maps.model.Tile r4 = new com.amap.api.maps.model.Tile     // Catch: java.io.FileNotFoundException -> Lc java.lang.Throwable -> Lb1
            int r5 = r7.a     // Catch: java.io.FileNotFoundException -> Lc java.lang.Throwable -> Lb1
            r4.<init>(r5, r5, r0, r2)     // Catch: java.io.FileNotFoundException -> Lc java.lang.Throwable -> Lb1
            r3.close()     // Catch: java.io.FileNotFoundException -> Lc java.lang.Throwable -> Lb1
            return r4
        L66:
            int r0 = r8.x
            int r3 = r8.zoom
            int r4 = r3 + (-6)
            int r0 = r0 >> r4
            int r8 = r8.y
            int r3 = r3 + (-6)
            int r8 = r8 >> r3
            r3 = 51
            if (r0 < r3) goto Lb1
            r3 = 53
            if (r0 > r3) goto Lb1
            r0 = 28
            if (r8 < r0) goto Lb1
            r0 = 31
            if (r8 > r0) goto Lb1
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r1)
            java.lang.String r0 = "default.png"
            r8.append(r0)
            java.lang.String r8 = r8.toString()
            java.io.FileInputStream r0 = new java.io.FileInputStream
            java.io.File r1 = new java.io.File
            r1.<init>(r8)
            r0.<init>(r1)
            int r8 = r0.available()
            byte[] r8 = new byte[r8]
            r0.read(r8)
            com.amap.api.maps.model.Tile r1 = new com.amap.api.maps.model.Tile
            int r3 = r7.a
            r1.<init>(r3, r3, r8, r2)
            r0.close()
            return r1
        Lb1:
            com.amap.api.maps.model.Tile r8 = com.amap.api.maps.model.TileProvider.NO_TILE
            return r8
    }

    private byte[] b(int r7, int r8, int r9, java.lang.String r10) {
            r6 = this;
            com.amap.api.col.3l.h$a r0 = new com.amap.api.col.3l.h$a     // Catch: java.lang.Throwable -> Lf
            r1 = r6
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> Lf
            byte[] r7 = r0.makeHttpRequestWithInterrupted()     // Catch: java.lang.Throwable -> Lf
            return r7
        Lf:
            r7 = 0
            return r7
    }

    @Override // com.autonavi.base.ae.gmap.bean.TileSourceProvider
    public final void cancel(com.autonavi.base.ae.gmap.bean.TileSourceReq r1) {
            r0 = this;
            return
    }

    @Override // com.amap.api.maps.model.TileProvider
    public final com.amap.api.maps.model.Tile getTile(int r1, int r2, int r3) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // com.autonavi.base.ae.gmap.bean.TileSourceProvider
    public final com.amap.api.maps.model.Tile getTile(com.autonavi.base.ae.gmap.bean.TileSourceReq r6) {
            r5 = this;
            if (r6 != 0) goto L5
            com.amap.api.maps.model.Tile r6 = com.amap.api.maps.model.TileProvider.NO_TILE
            return r6
        L5:
            com.amap.api.maps.model.Tile r0 = com.amap.api.maps.model.TileProvider.NO_TILE
            int r1 = r6.sourceType     // Catch: java.lang.Exception -> L41
            com.amap.api.maps.model.TileOverlaySource r2 = r5.f3441c     // Catch: java.lang.Exception -> L41
            int r2 = r2.getId()     // Catch: java.lang.Exception -> L41
            if (r1 != r2) goto L18
            com.amap.api.maps.model.TileOverlaySource r1 = r5.f3441c     // Catch: java.lang.Exception -> L41
            java.lang.String r1 = r1.getUrl()     // Catch: java.lang.Exception -> L41
            goto L1e
        L18:
            com.amap.api.maps.model.TileOverlaySource r1 = r5.f3440b     // Catch: java.lang.Exception -> L41
            java.lang.String r1 = r1.getUrl()     // Catch: java.lang.Exception -> L41
        L1e:
            if (r1 != 0) goto L21
            return r0
        L21:
            java.lang.String r2 = com.amap.api.maps.MapsInitializer.TERRAIN_LOCAL_DEM_SOURCE_PATH     // Catch: java.lang.Exception -> L41
            if (r2 == 0) goto L2a
            com.amap.api.maps.model.Tile r2 = r5.a(r6)     // Catch: java.lang.Exception -> L41
            goto L2b
        L2a:
            r2 = r0
        L2b:
            if (r2 != r0) goto L40
            com.amap.api.maps.model.Tile r0 = new com.amap.api.maps.model.Tile     // Catch: java.lang.Exception -> L41
            int r2 = r5.a     // Catch: java.lang.Exception -> L41
            int r3 = r6.x     // Catch: java.lang.Exception -> L41
            int r4 = r6.y     // Catch: java.lang.Exception -> L41
            int r6 = r6.zoom     // Catch: java.lang.Exception -> L41
            byte[] r6 = r5.b(r3, r4, r6, r1)     // Catch: java.lang.Exception -> L41
            r1 = 1
            r0.<init>(r2, r2, r6, r1)     // Catch: java.lang.Exception -> L41
            return r0
        L40:
            return r2
        L41:
            com.amap.api.maps.model.Tile r6 = com.amap.api.maps.model.TileProvider.NO_TILE
            return r6
    }

    @Override // com.amap.api.maps.model.TileProvider
    public final int getTileHeight() {
            r1 = this;
            int r0 = r1.a
            return r0
    }

    @Override // com.amap.api.maps.model.TileProvider
    public final int getTileWidth() {
            r1 = this;
            int r0 = r1.a
            return r0
    }
}

package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class j2 implements com.amap.api.maps.model.TileProvider {
    private final int a;

    /* renamed from: b, reason: collision with root package name */
    private final int f3542b;

    /* renamed from: c, reason: collision with root package name */
    private com.autonavi.base.amap.mapcore.MapConfig f3543c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f3544d;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class a extends com.amap.api.col.p0003l.k2 {
        private int r;
        private int s;
        private int t;
        private java.lang.String u;
        private java.lang.String v;
        java.util.Random w;
        final /* synthetic */ com.amap.api.col.p0003l.j2 x;

        public a(com.amap.api.col.p0003l.j2 r1, int r2, int r3, int r4, java.lang.String r5) {
                r0 = this;
                r0.x = r1
                r0.<init>()
                java.lang.String r1 = ""
                r0.v = r1
                java.util.Random r1 = new java.util.Random
                r1.<init>()
                r0.w = r1
                r0.r = r2
                r0.s = r3
                r0.t = r4
                r0.u = r5
                java.lang.String r1 = r0.i()
                r0.v = r1
                return
        }

        private java.lang.String i() {
                r4 = this;
                int r0 = r4.r
                int r1 = r4.s
                int r2 = r4.t
                boolean r0 = com.amap.api.col.p0003l.u2.b(r0, r1, r2)
                if (r0 != 0) goto L1d
                int r0 = r4.t
                r1 = 6
                if (r0 >= r1) goto L12
                goto L1d
            L12:
                boolean r0 = com.amap.api.maps.MapsInitializer.isLoadWorldGridMap()
                if (r0 == 0) goto L1b
                java.lang.String r0 = "http://restsdk.amap.com/v4/gridmap?"
                return r0
            L1b:
                r0 = 0
                return r0
            L1d:
                java.util.Random r0 = r4.w
                r1 = 100000(0x186a0, float:1.4013E-40)
                int r0 = r0.nextInt(r1)
                int r0 = r0 % 4
                java.util.Locale r1 = java.util.Locale.US
                r2 = 1
                int r0 = r0 + r2
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = 0
                r2[r3] = r0
                java.lang.String r0 = "http://wprd0%d.is.autonavi.com/appmaptile?"
                java.lang.String r0 = java.lang.String.format(r1, r0, r2)
                return r0
        }

        @Override // com.amap.api.col.p0003l.Cif
        public final java.lang.String getURL() {
                r6 = this;
                java.lang.StringBuffer r0 = new java.lang.StringBuffer
                r0.<init>()
                java.lang.String r1 = "key="
                r0.append(r1)
                android.content.Context r1 = com.amap.api.col.p0003l.d.f3124f
                java.lang.String r1 = com.amap.api.col.p0003l.f4.j(r1)
                r0.append(r1)
                java.lang.String r1 = "&channel=amapapi"
                r0.append(r1)
                int r1 = r6.r
                int r2 = r6.s
                int r3 = r6.t
                boolean r1 = com.amap.api.col.p0003l.u2.b(r1, r2, r3)
                java.lang.String r2 = "&z="
                java.lang.String r3 = "&y="
                java.lang.String r4 = "&x="
                if (r1 != 0) goto L68
                int r1 = r6.t
                r5 = 6
                if (r1 >= r5) goto L30
                goto L68
            L30:
                boolean r1 = com.amap.api.maps.MapsInitializer.isLoadWorldGridMap()
                if (r1 == 0) goto L85
                r0.append(r4)
                int r1 = r6.r
                r0.append(r1)
                r0.append(r3)
                int r1 = r6.s
                r0.append(r1)
                r0.append(r2)
                int r1 = r6.t
                r0.append(r1)
                java.lang.String r1 = "&ds=0"
                r0.append(r1)
                java.lang.String r1 = "&dpitype=webrd"
                r0.append(r1)
                java.lang.String r1 = "&lang="
                r0.append(r1)
                java.lang.String r1 = r6.u
                r0.append(r1)
                java.lang.String r1 = "&scale=2"
                r0.append(r1)
                goto L85
            L68:
                r0.append(r2)
                int r1 = r6.t
                r0.append(r1)
                r0.append(r4)
                int r1 = r6.r
                r0.append(r1)
                r0.append(r3)
                int r1 = r6.s
                r0.append(r1)
                java.lang.String r1 = "&lang=en&size=1&scale=1&style=7"
                r0.append(r1)
            L85:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = r6.v
                r1.append(r2)
                java.lang.String r0 = r0.toString()
                java.lang.String r0 = r6.appendTsScode(r0)
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                return r0
        }
    }

    public j2(com.autonavi.base.amap.mapcore.MapConfig r2) {
            r1 = this;
            r1.<init>()
            r0 = 256(0x100, float:3.59E-43)
            r1.a = r0
            r1.f3542b = r0
            r1.f3543c = r2
            r2 = 0
            r1.f3544d = r2
            return
    }

    private byte[] a(int r7, int r8, int r9, java.lang.String r10) throws java.io.IOException {
            r6 = this;
            com.amap.api.col.3l.j2$a r0 = new com.amap.api.col.3l.j2$a     // Catch: java.lang.Throwable -> Lf
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

    @Override // com.amap.api.maps.model.TileProvider
    public final com.amap.api.maps.model.Tile getTile(int r4, int r5, int r6) {
            r3 = this;
            boolean r0 = r3.f3544d     // Catch: java.io.IOException -> L52
            java.lang.String r1 = "zh_cn"
            if (r0 != 0) goto L38
            com.autonavi.base.amap.mapcore.MapConfig r0 = r3.f3543c     // Catch: java.io.IOException -> L52
            java.lang.String r0 = r0.getMapLanguage()     // Catch: java.io.IOException -> L52
            boolean r0 = r0.equals(r1)     // Catch: java.io.IOException -> L52
            r2 = 6
            if (r0 == 0) goto L27
            boolean r0 = com.amap.api.maps.MapsInitializer.isLoadWorldGridMap()     // Catch: java.io.IOException -> L52
            if (r0 != 0) goto L1c
            com.amap.api.maps.model.Tile r4 = com.amap.api.maps.model.TileProvider.NO_TILE     // Catch: java.io.IOException -> L52
            return r4
        L1c:
            if (r6 < r2) goto L24
            boolean r0 = com.amap.api.col.p0003l.u2.b(r4, r5, r6)     // Catch: java.io.IOException -> L52
            if (r0 == 0) goto L38
        L24:
            com.amap.api.maps.model.Tile r4 = com.amap.api.maps.model.TileProvider.NO_TILE     // Catch: java.io.IOException -> L52
            return r4
        L27:
            boolean r0 = com.amap.api.maps.MapsInitializer.isLoadWorldGridMap()     // Catch: java.io.IOException -> L52
            if (r0 != 0) goto L38
            if (r6 < r2) goto L38
            boolean r0 = com.amap.api.col.p0003l.u2.b(r4, r5, r6)     // Catch: java.io.IOException -> L52
            if (r0 != 0) goto L38
            com.amap.api.maps.model.Tile r4 = com.amap.api.maps.model.TileProvider.NO_TILE     // Catch: java.io.IOException -> L52
            return r4
        L38:
            com.autonavi.base.amap.mapcore.MapConfig r0 = r3.f3543c     // Catch: java.io.IOException -> L52
            if (r0 == 0) goto L40
            java.lang.String r1 = r0.getMapLanguage()     // Catch: java.io.IOException -> L52
        L40:
            byte[] r4 = r3.a(r4, r5, r6, r1)     // Catch: java.io.IOException -> L52
            if (r4 != 0) goto L49
            com.amap.api.maps.model.Tile r4 = com.amap.api.maps.model.TileProvider.NO_TILE     // Catch: java.io.IOException -> L52
            return r4
        L49:
            int r5 = r3.a     // Catch: java.io.IOException -> L52
            int r6 = r3.f3542b     // Catch: java.io.IOException -> L52
            com.amap.api.maps.model.Tile r4 = com.amap.api.maps.model.Tile.obtain(r5, r6, r4)     // Catch: java.io.IOException -> L52
            return r4
        L52:
            com.amap.api.maps.model.Tile r4 = com.amap.api.maps.model.TileProvider.NO_TILE
            return r4
    }

    @Override // com.amap.api.maps.model.TileProvider
    public final int getTileHeight() {
            r1 = this;
            int r0 = r1.f3542b
            return r0
    }

    @Override // com.amap.api.maps.model.TileProvider
    public final int getTileWidth() {
            r1 = this;
            int r0 = r1.a
            return r0
    }
}

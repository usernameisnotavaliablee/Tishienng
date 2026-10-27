package com.amap.api.maps.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class UrlTileProvider implements com.amap.api.maps.model.TileProvider {
    private final int height;
    private final int width;

    public UrlTileProvider(int r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.width = r1
            r0.height = r2
            return
    }

    private static long a(java.io.InputStream r5, java.io.OutputStream r6) throws java.io.IOException {
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r0 = new byte[r0]
            r1 = 0
        L6:
            int r3 = r5.read(r0)
            r4 = -1
            if (r3 == r4) goto L14
            r4 = 0
            r6.write(r0, r4, r3)
            long r3 = (long) r3
            long r1 = r1 + r3
            goto L6
        L14:
            return r1
    }

    private static byte[] a(java.io.InputStream r1) throws java.io.IOException {
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            a(r1, r0)
            byte[] r1 = r0.toByteArray()
            return r1
    }

    @Override // com.amap.api.maps.model.TileProvider
    public final com.amap.api.maps.model.Tile getTile(int r1, int r2, int r3) {
            r0 = this;
            java.net.URL r1 = r0.getTileUrl(r1, r2, r3)
            if (r1 != 0) goto L9
            com.amap.api.maps.model.Tile r1 = com.amap.api.maps.model.TileProvider.NO_TILE
            return r1
        L9:
            int r2 = r0.width     // Catch: java.io.IOException -> L1a
            int r3 = r0.height     // Catch: java.io.IOException -> L1a
            java.io.InputStream r1 = r1.openStream()     // Catch: java.io.IOException -> L1a
            byte[] r1 = a(r1)     // Catch: java.io.IOException -> L1a
            com.amap.api.maps.model.Tile r1 = com.amap.api.maps.model.Tile.obtain(r2, r3, r1)     // Catch: java.io.IOException -> L1a
            return r1
        L1a:
            com.amap.api.maps.model.Tile r1 = com.amap.api.maps.model.TileProvider.NO_TILE
            return r1
    }

    @Override // com.amap.api.maps.model.TileProvider
    public int getTileHeight() {
            r1 = this;
            int r0 = r1.height
            return r0
    }

    public abstract java.net.URL getTileUrl(int r1, int r2, int r3);

    @Override // com.amap.api.maps.model.TileProvider
    public int getTileWidth() {
            r1 = this;
            int r0 = r1.width
            return r0
    }
}

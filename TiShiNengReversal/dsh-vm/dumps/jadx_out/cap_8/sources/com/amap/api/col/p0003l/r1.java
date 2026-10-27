package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class r1 {
    private final com.autonavi.base.amap.api.mapcore.IAMapDelegate a;

    /* renamed from: b, reason: collision with root package name */
    private com.amap.api.maps.model.TileOverlay f3839b;

    /* renamed from: c, reason: collision with root package name */
    private com.amap.api.maps.model.TileOverlay f3840c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f3841d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f3842e;

    public r1(com.autonavi.base.amap.api.mapcore.IAMapDelegate r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f3841d = r0
            r1.f3842e = r0
            r1.a = r2
            return
    }

    private void b() {
            r2 = this;
            com.amap.api.maps.model.TileOverlay r0 = r2.f3839b
            if (r0 != 0) goto L37
            com.amap.api.col.3l.j2 r0 = new com.amap.api.col.3l.j2
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r1 = r2.a
            com.autonavi.base.amap.mapcore.MapConfig r1 = r1.getMapConfig()
            r0.<init>(r1)
            com.amap.api.maps.model.TileOverlayOptions r1 = new com.amap.api.maps.model.TileOverlayOptions
            r1.<init>()
            com.amap.api.maps.model.TileOverlayOptions r0 = r1.tileProvider(r0)
            r1 = 10485760(0xa00000, float:1.469368E-38)
            r0.memCacheSize(r1)
            r1 = 20480(0x5000, float:2.8699E-41)
            r0.diskCacheSize(r1)
            boolean r1 = r2.f3841d
            r0.visible(r1)
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r1 = r2.a     // Catch: android.os.RemoteException -> L37
            com.amap.api.maps.model.TileOverlay r1 = r1.addTileOverlay(r0)     // Catch: android.os.RemoteException -> L37
            r2.f3839b = r1     // Catch: android.os.RemoteException -> L37
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r1 = r2.a     // Catch: android.os.RemoteException -> L37
            com.amap.api.maps.model.TileOverlay r0 = r1.addTileOverlay(r0)     // Catch: android.os.RemoteException -> L37
            r2.f3840c = r0     // Catch: android.os.RemoteException -> L37
        L37:
            return
    }

    private void c() {
            r2 = this;
            boolean r0 = r2.e()
            if (r0 == 0) goto L9
            r2.b()
        L9:
            boolean r1 = r2.f3841d
            if (r1 == r0) goto L16
            r2.f3841d = r0
            com.amap.api.maps.model.TileOverlay r1 = r2.f3839b
            if (r1 == 0) goto L16
            r1.setVisible(r0)
        L16:
            return
    }

    private void d() {
            r2 = this;
            boolean r0 = f()
            if (r0 == 0) goto L9
            r2.b()
        L9:
            boolean r1 = r2.f3842e
            if (r1 == r0) goto L16
            r2.f3842e = r0
            com.amap.api.maps.model.TileOverlay r1 = r2.f3840c
            if (r1 == 0) goto L16
            r1.setVisible(r0)
        L16:
            return
    }

    private boolean e() {
            r2 = this;
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r2.a
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            com.autonavi.base.amap.mapcore.MapConfig r0 = r0.getMapConfig()
            java.lang.String r0 = r0.getMapLanguage()
            java.lang.String r1 = "en"
            boolean r0 = r0.equals(r1)
            return r0
    }

    private static boolean f() {
            boolean r0 = com.amap.api.maps.MapsInitializer.isLoadWorldGridMap()
            return r0
    }

    public final void a() {
            r0 = this;
            r0.c()
            r0.d()
            return
    }
}

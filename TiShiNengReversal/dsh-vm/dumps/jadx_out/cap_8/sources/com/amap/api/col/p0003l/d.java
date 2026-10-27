package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class d implements com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate {

    /* renamed from: f, reason: collision with root package name */
    public static volatile android.content.Context f3124f;

    /* renamed from: g, reason: collision with root package name */
    private static java.lang.String f3125g;
    private com.autonavi.amap.mapcore.interfaces.IAMap a;

    /* renamed from: b, reason: collision with root package name */
    public int f3126b;

    /* renamed from: c, reason: collision with root package name */
    private int f3127c;

    /* renamed from: d, reason: collision with root package name */
    private com.amap.api.maps.AMapOptions f3128d;

    /* renamed from: e, reason: collision with root package name */
    boolean f3129e;

    public d(int r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f3126b = r0
            r0 = 1
            r1.f3129e = r0
            int r2 = r2 % 3
            r1.f3127c = r2
            d()
            return
    }

    private static void a() {
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L59
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()     // Catch: java.lang.Throwable -> L59
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
        Lc:
            int r5 = r0.length     // Catch: java.lang.Throwable -> L59
            if (r1 >= r5) goto L50
            r5 = r0[r1]     // Catch: java.lang.Throwable -> L59
            java.lang.String r5 = r5.getClassName()     // Catch: java.lang.Throwable -> L59
            r6 = 1
            if (r5 == 0) goto L27
            r5 = r0[r1]     // Catch: java.lang.Throwable -> L59
            java.lang.String r5 = r5.getClassName()     // Catch: java.lang.Throwable -> L59
            java.lang.String r7 = "TextureMapView"
            boolean r5 = r5.endsWith(r7)     // Catch: java.lang.Throwable -> L59
            if (r5 == 0) goto L27
            r3 = 1
        L27:
            r5 = r0[r1]     // Catch: java.lang.Throwable -> L59
            java.lang.String r5 = r5.getClassName()     // Catch: java.lang.Throwable -> L59
            if (r5 == 0) goto L3e
            r5 = r0[r1]     // Catch: java.lang.Throwable -> L59
            java.lang.String r5 = r5.getClassName()     // Catch: java.lang.Throwable -> L59
            java.lang.String r7 = "Fragment"
            boolean r5 = r5.endsWith(r7)     // Catch: java.lang.Throwable -> L59
            if (r5 == 0) goto L3e
            r2 = 1
        L3e:
            java.lang.String r5 = "OnDestroyView"
            r7 = r0[r1]     // Catch: java.lang.Throwable -> L59
            java.lang.String r7 = r7.getMethodName()     // Catch: java.lang.Throwable -> L59
            boolean r5 = r5.equalsIgnoreCase(r7)     // Catch: java.lang.Throwable -> L59
            if (r5 == 0) goto L4d
            r4 = 1
        L4d:
            int r1 = r1 + 1
            goto Lc
        L50:
            if (r2 == 0) goto L59
            if (r3 == 0) goto L59
            if (r4 != 0) goto L59
            e()     // Catch: java.lang.Throwable -> L59
        L59:
            return
    }

    private static void b(android.content.Context r0) {
            if (r0 == 0) goto Lc
            android.content.Context r0 = r0.getApplicationContext()
            android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)
            com.amap.api.col.p0003l.d.f3124f = r0
        Lc:
            return
    }

    private void c(com.amap.api.maps.AMapOptions r3) throws android.os.RemoteException {
            r2 = this;
            if (r3 == 0) goto L65
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r2.a
            if (r0 == 0) goto L65
            com.amap.api.maps.model.CameraPosition r0 = r3.getCamera()
            if (r0 == 0) goto L15
            com.autonavi.amap.mapcore.interfaces.IAMap r1 = r2.a
            com.amap.api.maps.CameraUpdate r0 = com.amap.api.maps.CameraUpdateFactory.newCameraPosition(r0)
            r1.moveCamera(r0)
        L15:
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r2.a
            com.amap.api.maps.UiSettings r0 = r0.getAMapUiSettings()
            boolean r1 = r3.getRotateGesturesEnabled()
            r0.setRotateGesturesEnabled(r1)
            boolean r1 = r3.getScrollGesturesEnabled()
            r0.setScrollGesturesEnabled(r1)
            boolean r1 = r3.getTiltGesturesEnabled()
            r0.setTiltGesturesEnabled(r1)
            boolean r1 = r3.getZoomControlsEnabled()
            r0.setZoomControlsEnabled(r1)
            boolean r1 = r3.getZoomGesturesEnabled()
            r0.setZoomGesturesEnabled(r1)
            boolean r1 = r3.getCompassEnabled()
            r0.setCompassEnabled(r1)
            boolean r1 = r3.getScaleControlsEnabled()
            r0.setScaleControlsEnabled(r1)
            int r1 = r3.getLogoPosition()
            r0.setLogoPosition(r1)
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r2.a
            int r1 = r3.getMapType()
            r0.setMapType(r1)
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r2.a
            boolean r3 = r3.getZOrderOnTop()
            r0.setZOrderOnTop(r3)
        L65:
            return
    }

    private static void d() {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L18
            r0.<init>()     // Catch: java.lang.Throwable -> L18
            r1 = 0
        L6:
            r2 = 80
            if (r1 >= r2) goto L12
            java.lang.String r2 = "="
            r0.append(r2)     // Catch: java.lang.Throwable -> L18
            int r1 = r1 + 1
            goto L6
        L12:
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L18
            com.amap.api.col.p0003l.d.f3125g = r0     // Catch: java.lang.Throwable -> L18
        L18:
            return
    }

    private static void e() {
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate
    public final com.autonavi.amap.mapcore.interfaces.IAMap getMap() throws android.os.RemoteException {
            r3 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r3.a
            if (r0 != 0) goto L88
            android.content.Context r0 = com.amap.api.col.p0003l.d.f3124f
            if (r0 != 0) goto La
            r0 = 0
            return r0
        La:
            android.content.Context r0 = com.amap.api.col.p0003l.d.f3124f
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r0 = r0.densityDpi
            r1 = 120(0x78, float:1.68E-43)
            if (r0 > r1) goto L1f
            r0 = 1056964608(0x3f000000, float:0.5)
            com.amap.api.col.p0003l.ha.a = r0
            goto L54
        L1f:
            r1 = 160(0xa0, float:2.24E-43)
            if (r0 > r1) goto L29
            r0 = 1061997773(0x3f4ccccd, float:0.8)
            com.amap.api.col.p0003l.ha.a = r0
            goto L54
        L29:
            r1 = 240(0xf0, float:3.36E-43)
            if (r0 > r1) goto L33
            r0 = 1063172178(0x3f5eb852, float:0.87)
            com.amap.api.col.p0003l.ha.a = r0
            goto L54
        L33:
            r1 = 320(0x140, float:4.48E-43)
            if (r0 > r1) goto L3c
            r0 = 1065353216(0x3f800000, float:1.0)
            com.amap.api.col.p0003l.ha.a = r0
            goto L54
        L3c:
            r1 = 480(0x1e0, float:6.73E-43)
            if (r0 > r1) goto L45
            r0 = 1069547520(0x3fc00000, float:1.5)
            com.amap.api.col.p0003l.ha.a = r0
            goto L54
        L45:
            r1 = 640(0x280, float:8.97E-43)
            if (r0 > r1) goto L4f
            r0 = 1072064102(0x3fe66666, float:1.8)
            com.amap.api.col.p0003l.ha.a = r0
            goto L54
        L4f:
            r0 = 1063675494(0x3f666666, float:0.9)
            com.amap.api.col.p0003l.ha.a = r0
        L54:
            int r0 = r3.f3127c
            if (r0 != 0) goto L68
            com.amap.api.col.3l.n r0 = new com.amap.api.col.3l.n
            android.content.Context r1 = com.amap.api.col.p0003l.d.f3124f
            boolean r2 = r3.f3129e
            r0.<init>(r1, r2)
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r0.b()
            r3.a = r0
            goto L88
        L68:
            r1 = 1
            if (r0 != r1) goto L7b
            com.amap.api.col.3l.o r0 = new com.amap.api.col.3l.o
            android.content.Context r1 = com.amap.api.col.p0003l.d.f3124f
            boolean r2 = r3.f3129e
            r0.<init>(r1, r2)
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r0.r()
            r3.a = r0
            goto L88
        L7b:
            com.amap.api.col.3l.z9 r0 = new com.amap.api.col.3l.z9
            android.content.Context r1 = com.amap.api.col.p0003l.d.f3124f
            r0.<init>(r1)
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r0.a()
            r3.a = r0
        L88:
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r3.a
            return r0
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate
    public final boolean isReady() throws android.os.RemoteException {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate
    public final void loadWorldVectorMap(boolean r2) {
            r1 = this;
            r1.f3129e = r2
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.a
            if (r0 == 0) goto L9
            r0.loadWorldVectorMap(r2)
        L9:
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate
    public void onCreate(android.os.Bundle r1) throws android.os.RemoteException {
            r0 = this;
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate
    public final android.view.View onCreateView(android.view.LayoutInflater r2, android.view.ViewGroup r3, android.os.Bundle r4) throws android.os.RemoteException {
            r1 = this;
            android.content.Context r3 = com.amap.api.col.p0003l.d.f3124f
            if (r3 != 0) goto L15
            if (r2 == 0) goto L15
            android.content.Context r2 = r2.getContext()
            android.content.Context r2 = r2.getApplicationContext()
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)
            r1.setContext(r2)
        L15:
            com.autonavi.amap.mapcore.interfaces.IAMap r2 = r1.getMap()     // Catch: java.lang.Throwable -> L47
            r1.a = r2     // Catch: java.lang.Throwable -> L47
            int r3 = r1.f3126b     // Catch: java.lang.Throwable -> L47
            r2.setVisibilityEx(r3)     // Catch: java.lang.Throwable -> L47
            com.amap.api.maps.AMapOptions r2 = r1.f3128d     // Catch: java.lang.Throwable -> L47
            if (r2 != 0) goto L42
            if (r4 == 0) goto L42
            java.lang.String r2 = "MAP_OPTIONS"
            byte[] r2 = r4.getByteArray(r2)     // Catch: java.lang.Throwable -> L47
            if (r2 == 0) goto L42
            android.os.Parcel r3 = android.os.Parcel.obtain()     // Catch: java.lang.Throwable -> L47
            int r4 = r2.length     // Catch: java.lang.Throwable -> L47
            r0 = 0
            r3.unmarshall(r2, r0, r4)     // Catch: java.lang.Throwable -> L47
            r3.setDataPosition(r0)     // Catch: java.lang.Throwable -> L47
            com.amap.api.maps.AMapOptionsCreator r2 = com.amap.api.maps.AMapOptions.CREATOR     // Catch: java.lang.Throwable -> L47
            com.amap.api.maps.AMapOptions r2 = r2.createFromParcel(r3)     // Catch: java.lang.Throwable -> L47
            r1.f3128d = r2     // Catch: java.lang.Throwable -> L47
        L42:
            com.amap.api.maps.AMapOptions r2 = r1.f3128d     // Catch: java.lang.Throwable -> L47
            r1.c(r2)     // Catch: java.lang.Throwable -> L47
        L47:
            com.autonavi.amap.mapcore.interfaces.IAMap r2 = r1.a
            android.view.View r2 = r2.getView()
            return r2
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate
    public final void onDestroy() throws android.os.RemoteException {
            r1 = this;
            a()
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.a
            if (r0 == 0) goto L12
            r0.clear()
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.a
            r0.destroy()
            r0 = 0
            r1.a = r0
        L12:
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate
    public final void onDestroyView() throws android.os.RemoteException {
            r0 = this;
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate
    public final void onInflate(android.app.Activity r1, com.amap.api.maps.AMapOptions r2, android.os.Bundle r3) throws android.os.RemoteException {
            r0 = this;
            android.content.Context r1 = r1.getApplicationContext()
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)
            r0.setContext(r1)
            r0.f3128d = r2
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate
    public final void onLowMemory() throws android.os.RemoteException {
            r0 = this;
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate
    public final void onPause() throws android.os.RemoteException {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.a
            if (r0 == 0) goto L7
            r0.onActivityPause()
        L7:
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate
    public final void onResume() throws android.os.RemoteException {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.a
            if (r0 == 0) goto L7
            r0.onActivityResume()
        L7:
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate
    public final void onSaveInstanceState(android.os.Bundle r4) throws android.os.RemoteException {
            r3 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r3.a
            if (r0 == 0) goto L30
            com.amap.api.maps.AMapOptions r0 = r3.f3128d
            if (r0 != 0) goto Lf
            com.amap.api.maps.AMapOptions r0 = new com.amap.api.maps.AMapOptions
            r0.<init>()
            r3.f3128d = r0
        Lf:
            android.os.Parcel r0 = android.os.Parcel.obtain()     // Catch: java.lang.Throwable -> L30
            com.amap.api.maps.AMapOptions r1 = r3.f3128d     // Catch: java.lang.Throwable -> L30
            com.autonavi.amap.mapcore.interfaces.IAMap r2 = r3.getMap()     // Catch: java.lang.Throwable -> L30
            com.amap.api.maps.model.CameraPosition r2 = r2.getCameraPosition()     // Catch: java.lang.Throwable -> L30
            com.amap.api.maps.AMapOptions r1 = r1.camera(r2)     // Catch: java.lang.Throwable -> L30
            r3.f3128d = r1     // Catch: java.lang.Throwable -> L30
            r2 = 0
            r1.writeToParcel(r0, r2)     // Catch: java.lang.Throwable -> L30
            java.lang.String r1 = "MAP_OPTIONS"
            byte[] r0 = r0.marshall()     // Catch: java.lang.Throwable -> L30
            r4.putByteArray(r1, r0)     // Catch: java.lang.Throwable -> L30
        L30:
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate
    public final void setContext(android.content.Context r1) {
            r0 = this;
            b(r1)
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate
    public final void setOptions(com.amap.api.maps.AMapOptions r1) {
            r0 = this;
            r0.f3128d = r1
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate
    public final void setVisibility(int r2) {
            r1 = this;
            r1.f3126b = r2
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.a
            if (r0 == 0) goto L9
            r0.setVisibilityEx(r2)
        L9:
            return
    }
}

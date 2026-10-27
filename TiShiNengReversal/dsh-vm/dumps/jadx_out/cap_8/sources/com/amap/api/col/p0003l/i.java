package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
final class i implements com.autonavi.base.amap.api.mapcore.IUiSettingsDelegate {
    private com.autonavi.base.amap.api.mapcore.IAMapDelegate a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f3473b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f3474c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f3475d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f3476e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f3477f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f3478g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f3479h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f3480i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f3481j;

    /* renamed from: k, reason: collision with root package name */
    private int f3482k;
    private int l;
    private boolean m;
    private boolean n;
    private boolean o;
    final android.os.Handler p;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class a extends android.os.Handler {
        final /* synthetic */ com.amap.api.col.p0003l.i a;

        a(com.amap.api.col.p0003l.i r1, android.os.Looper r2) {
                r0 = this;
                r0.a = r1
                r0.<init>(r2)
                return
        }

        @Override // android.os.Handler
        public final void handleMessage(android.os.Message r3) {
                r2 = this;
                if (r3 == 0) goto L85
                com.amap.api.col.3l.i r0 = r2.a
                com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = com.amap.api.col.p0003l.i.a(r0)
                if (r0 != 0) goto Lc
                goto L85
            Lc:
                int r3 = r3.what     // Catch: java.lang.Throwable -> L1c
                switch(r3) {
                    case 0: goto L6e;
                    case 1: goto L5e;
                    case 2: goto L4e;
                    case 3: goto L3e;
                    case 4: goto L2e;
                    case 5: goto L1e;
                    case 6: goto L12;
                    default: goto L11;
                }     // Catch: java.lang.Throwable -> L1c
            L11:
                goto L85
            L12:
                com.amap.api.col.3l.i r3 = r2.a     // Catch: java.lang.Throwable -> L1c
                com.autonavi.base.amap.api.mapcore.IAMapDelegate r3 = com.amap.api.col.p0003l.i.a(r3)     // Catch: java.lang.Throwable -> L1c
                r3.refreshLogo()     // Catch: java.lang.Throwable -> L1c
                return
            L1c:
                r3 = move-exception
                goto L7e
            L1e:
                com.amap.api.col.3l.i r3 = r2.a     // Catch: java.lang.Throwable -> L1c
                com.autonavi.base.amap.api.mapcore.IAMapDelegate r3 = com.amap.api.col.p0003l.i.a(r3)     // Catch: java.lang.Throwable -> L1c
                com.amap.api.col.3l.i r0 = r2.a     // Catch: java.lang.Throwable -> L1c
                boolean r0 = com.amap.api.col.p0003l.i.g(r0)     // Catch: java.lang.Throwable -> L1c
                r3.showLogoEnabled(r0)     // Catch: java.lang.Throwable -> L1c
                return
            L2e:
                com.amap.api.col.3l.i r3 = r2.a     // Catch: java.lang.Throwable -> L1c
                com.autonavi.base.amap.api.mapcore.IAMapDelegate r3 = com.amap.api.col.p0003l.i.a(r3)     // Catch: java.lang.Throwable -> L1c
                com.amap.api.col.3l.i r0 = r2.a     // Catch: java.lang.Throwable -> L1c
                boolean r0 = com.amap.api.col.p0003l.i.f(r0)     // Catch: java.lang.Throwable -> L1c
                r3.showIndoorSwitchControlsEnabled(r0)     // Catch: java.lang.Throwable -> L1c
                return
            L3e:
                com.amap.api.col.3l.i r3 = r2.a     // Catch: java.lang.Throwable -> L1c
                com.autonavi.base.amap.api.mapcore.IAMapDelegate r3 = com.amap.api.col.p0003l.i.a(r3)     // Catch: java.lang.Throwable -> L1c
                com.amap.api.col.3l.i r0 = r2.a     // Catch: java.lang.Throwable -> L1c
                boolean r0 = com.amap.api.col.p0003l.i.e(r0)     // Catch: java.lang.Throwable -> L1c
                r3.showMyLocationButtonEnabled(r0)     // Catch: java.lang.Throwable -> L1c
                return
            L4e:
                com.amap.api.col.3l.i r3 = r2.a     // Catch: java.lang.Throwable -> L1c
                com.autonavi.base.amap.api.mapcore.IAMapDelegate r3 = com.amap.api.col.p0003l.i.a(r3)     // Catch: java.lang.Throwable -> L1c
                com.amap.api.col.3l.i r0 = r2.a     // Catch: java.lang.Throwable -> L1c
                boolean r0 = com.amap.api.col.p0003l.i.d(r0)     // Catch: java.lang.Throwable -> L1c
                r3.showCompassEnabled(r0)     // Catch: java.lang.Throwable -> L1c
                return
            L5e:
                com.amap.api.col.3l.i r3 = r2.a     // Catch: java.lang.Throwable -> L1c
                com.autonavi.base.amap.api.mapcore.IAMapDelegate r3 = com.amap.api.col.p0003l.i.a(r3)     // Catch: java.lang.Throwable -> L1c
                com.amap.api.col.3l.i r0 = r2.a     // Catch: java.lang.Throwable -> L1c
                boolean r0 = com.amap.api.col.p0003l.i.c(r0)     // Catch: java.lang.Throwable -> L1c
                r3.showScaleEnabled(r0)     // Catch: java.lang.Throwable -> L1c
                return
            L6e:
                com.amap.api.col.3l.i r3 = r2.a     // Catch: java.lang.Throwable -> L1c
                com.autonavi.base.amap.api.mapcore.IAMapDelegate r3 = com.amap.api.col.p0003l.i.a(r3)     // Catch: java.lang.Throwable -> L1c
                com.amap.api.col.3l.i r0 = r2.a     // Catch: java.lang.Throwable -> L1c
                boolean r0 = com.amap.api.col.p0003l.i.b(r0)     // Catch: java.lang.Throwable -> L1c
                r3.showZoomControlsEnabled(r0)     // Catch: java.lang.Throwable -> L1c
                return
            L7e:
                java.lang.String r0 = "UiSettingsDelegateImp"
                java.lang.String r1 = "handleMessage"
                com.amap.api.col.p0003l.w5.p(r3, r0, r1)
            L85:
                return
        }
    }

    i(com.autonavi.base.amap.api.mapcore.IAMapDelegate r3) {
            r2 = this;
            r2.<init>()
            r0 = 1
            r2.f3473b = r0
            r2.f3474c = r0
            r2.f3475d = r0
            r1 = 0
            r2.f3476e = r1
            r2.f3477f = r0
            r2.f3478g = r0
            r2.f3479h = r0
            r2.f3480i = r1
            r2.f3481j = r0
            r2.f3482k = r1
            r2.l = r0
            r2.m = r0
            r2.n = r1
            r2.o = r1
            com.amap.api.col.3l.i$a r0 = new com.amap.api.col.3l.i$a
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r2, r1)
            r2.p = r0
            r2.a = r3
            return
    }

    static /* synthetic */ com.autonavi.base.amap.api.mapcore.IAMapDelegate a(com.amap.api.col.p0003l.i r0) {
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r0.a
            return r0
    }

    static /* synthetic */ boolean b(com.amap.api.col.p0003l.i r0) {
            boolean r0 = r0.f3478g
            return r0
    }

    static /* synthetic */ boolean c(com.amap.api.col.p0003l.i r0) {
            boolean r0 = r0.f3480i
            return r0
    }

    static /* synthetic */ boolean d(com.amap.api.col.p0003l.i r0) {
            boolean r0 = r0.f3479h
            return r0
    }

    static /* synthetic */ boolean e(com.amap.api.col.p0003l.i r0) {
            boolean r0 = r0.f3476e
            return r0
    }

    static /* synthetic */ boolean f(com.amap.api.col.p0003l.i r0) {
            boolean r0 = r0.m
            return r0
    }

    static /* synthetic */ boolean g(com.amap.api.col.p0003l.i r0) {
            boolean r0 = r0.f3481j
            return r0
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IUiSettings
    public final float getLogoMarginRate(int r2) {
            r1 = this;
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r1.a
            float r2 = r0.getLogoMarginRate(r2)
            return r2
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IUiSettings
    public final int getLogoPosition() throws android.os.RemoteException {
            r1 = this;
            int r0 = r1.f3482k
            return r0
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IUiSettings
    public final int getZoomPosition() throws android.os.RemoteException {
            r1 = this;
            int r0 = r1.l
            return r0
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IUiSettings
    public final boolean isCompassEnabled() throws android.os.RemoteException {
            r1 = this;
            boolean r0 = r1.f3479h
            return r0
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IUiSettings
    public final boolean isGestureScaleByMapCenter() throws android.os.RemoteException {
            r1 = this;
            boolean r0 = r1.o
            return r0
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IUiSettings
    public final boolean isIndoorSwitchEnabled() throws android.os.RemoteException {
            r1 = this;
            boolean r0 = r1.m
            return r0
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IUiSettings
    public final boolean isLogoEnable() {
            r1 = this;
            boolean r0 = r1.f3481j
            return r0
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IUiSettings
    public final boolean isMyLocationButtonEnabled() throws android.os.RemoteException {
            r1 = this;
            boolean r0 = r1.f3476e
            return r0
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IUiSettings
    public final boolean isRotateGesturesEnabled() throws android.os.RemoteException {
            r1 = this;
            boolean r0 = r1.f3473b
            return r0
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IUiSettings
    public final boolean isScaleControlsEnabled() throws android.os.RemoteException {
            r1 = this;
            boolean r0 = r1.f3480i
            return r0
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IUiSettings
    public final boolean isScrollGesturesEnabled() throws android.os.RemoteException {
            r1 = this;
            boolean r0 = r1.f3474c
            return r0
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IUiSettings
    public final boolean isTiltGesturesEnabled() throws android.os.RemoteException {
            r1 = this;
            boolean r0 = r1.f3475d
            return r0
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IUiSettings
    public final boolean isZoomControlsEnabled() throws android.os.RemoteException {
            r1 = this;
            boolean r0 = r1.f3478g
            return r0
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IUiSettings
    public final boolean isZoomGesturesEnabled() throws android.os.RemoteException {
            r1 = this;
            boolean r0 = r1.f3477f
            return r0
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IUiSettings
    public final boolean isZoomInByScreenCenter() {
            r1 = this;
            boolean r0 = r1.n
            return r0
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IUiSettings
    public final void requestRefreshLogo() {
            r2 = this;
            android.os.Handler r0 = r2.p
            r1 = 6
            android.os.Message r0 = r0.obtainMessage(r1)
            r0.sendToTarget()
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IUiSettings
    public final void setAllGesturesEnabled(boolean r1) throws android.os.RemoteException {
            r0 = this;
            r0.setRotateGesturesEnabled(r1)
            r0.setTiltGesturesEnabled(r1)
            r0.setZoomGesturesEnabled(r1)
            r0.setScrollGesturesEnabled(r1)
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IUiSettings
    public final void setCompassEnabled(boolean r2) throws android.os.RemoteException {
            r1 = this;
            r1.f3479h = r2
            android.os.Handler r2 = r1.p
            r0 = 2
            android.os.Message r2 = r2.obtainMessage(r0)
            r2.sendToTarget()
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IUiSettings
    public final void setGestureScaleByMapCenter(boolean r1) throws android.os.RemoteException {
            r0 = this;
            r0.o = r1
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IUiSettings
    public final void setIndoorSwitchEnabled(boolean r2) throws android.os.RemoteException {
            r1 = this;
            r1.m = r2
            android.os.Handler r2 = r1.p
            r0 = 4
            android.os.Message r2 = r2.obtainMessage(r0)
            r2.sendToTarget()
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IUiSettings
    public final void setLogoBottomMargin(int r2) {
            r1 = this;
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r1.a
            r0.setLogoBottomMargin(r2)
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IUiSettings
    public final void setLogoEnable(boolean r2) {
            r1 = this;
            r1.f3481j = r2
            android.os.Handler r2 = r1.p
            r0 = 5
            android.os.Message r2 = r2.obtainMessage(r0)
            r2.sendToTarget()
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IUiSettings
    public final void setLogoLeftMargin(int r2) {
            r1 = this;
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r1.a
            r0.setLogoLeftMargin(r2)
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IUiSettings
    public final void setLogoMarginRate(int r2, float r3) {
            r1 = this;
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r1.a
            r0.setLogoMarginRate(r2, r3)
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IUiSettings
    public final void setLogoPosition(int r2) throws android.os.RemoteException {
            r1 = this;
            r1.f3482k = r2
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r1.a
            r0.setLogoPosition(r2)
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IUiSettings
    public final void setMyLocationButtonEnabled(boolean r2) throws android.os.RemoteException {
            r1 = this;
            r1.f3476e = r2
            android.os.Handler r2 = r1.p
            r0 = 3
            android.os.Message r2 = r2.obtainMessage(r0)
            r2.sendToTarget()
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IUiSettings
    public final void setRotateGesturesEnabled(boolean r1) throws android.os.RemoteException {
            r0 = this;
            r0.f3473b = r1
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IUiSettings
    public final void setScaleControlsEnabled(boolean r2) throws android.os.RemoteException {
            r1 = this;
            r1.f3480i = r2
            android.os.Handler r2 = r1.p
            r0 = 1
            android.os.Message r2 = r2.obtainMessage(r0)
            r2.sendToTarget()
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IUiSettings
    public final void setScrollGesturesEnabled(boolean r1) throws android.os.RemoteException {
            r0 = this;
            r0.f3474c = r1
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IUiSettings
    public final void setTiltGesturesEnabled(boolean r1) throws android.os.RemoteException {
            r0 = this;
            r0.f3475d = r1
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IUiSettings
    public final void setZoomControlsEnabled(boolean r2) throws android.os.RemoteException {
            r1 = this;
            r1.f3478g = r2
            android.os.Handler r2 = r1.p
            r0 = 0
            android.os.Message r2 = r2.obtainMessage(r0)
            r2.sendToTarget()
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IUiSettings
    public final void setZoomGesturesEnabled(boolean r1) throws android.os.RemoteException {
            r0 = this;
            r0.f3477f = r1
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IUiSettings
    public final void setZoomInByScreenCenter(boolean r1) {
            r0 = this;
            r0.n = r1
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IUiSettings
    public final void setZoomPosition(int r2) throws android.os.RemoteException {
            r1 = this;
            r1.l = r2
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r1.a
            r0.setZoomPosition(r2)
            return
    }
}

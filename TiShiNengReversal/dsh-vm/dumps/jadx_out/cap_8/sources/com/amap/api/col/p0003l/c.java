package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class c implements com.amap.api.maps.interfaces.IGlOverlayLayer, com.autonavi.base.amap.mapcore.AMapNativeGlOverlayLayer.NativeFunCallListener {
    com.autonavi.base.amap.api.mapcore.IAMapDelegate a;

    /* renamed from: b, reason: collision with root package name */
    private android.content.Context f3031b;

    /* renamed from: c, reason: collision with root package name */
    private int f3032c;

    /* renamed from: d, reason: collision with root package name */
    private final java.lang.Object f3033d;

    /* renamed from: e, reason: collision with root package name */
    private com.autonavi.base.amap.mapcore.AMapNativeGlOverlayLayer f3034e;

    /* renamed from: f, reason: collision with root package name */
    private final java.util.Map<java.lang.String, com.amap.api.maps.model.BaseOverlay> f3035f;

    /* renamed from: g, reason: collision with root package name */
    private com.amap.api.col.p0003l.r1 f3036g;

    /* renamed from: h, reason: collision with root package name */
    private com.amap.api.maps.model.BitmapDescriptor f3037h;

    /* renamed from: i, reason: collision with root package name */
    private com.amap.api.maps.model.BitmapDescriptor f3038i;

    /* renamed from: j, reason: collision with root package name */
    private com.amap.api.maps.model.BitmapDescriptor f3039j;

    /* renamed from: k, reason: collision with root package name */
    private com.amap.api.maps.model.BitmapDescriptor f3040k;
    private com.amap.api.maps.model.BitmapDescriptor l;
    private com.amap.api.maps.model.BitmapDescriptor m;
    private com.amap.api.maps.model.BitmapDescriptor n;
    private com.amap.api.maps.model.BitmapDescriptor o;
    boolean p;
    java.util.List<java.lang.String> q;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class a extends com.amap.api.col.p0003l.c8 {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.autonavi.base.ae.gmap.AMapAppRequestParam f3041d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ com.amap.api.col.p0003l.c f3042e;

        a(com.amap.api.col.p0003l.c r1, com.autonavi.base.ae.gmap.AMapAppRequestParam r2) {
                r0 = this;
                r0.f3042e = r1
                r0.f3041d = r2
                r0.<init>()
                return
        }

        @Override // com.amap.api.col.p0003l.c8
        public final void runTask() {
                r4 = this;
                com.amap.api.maps.model.amap3dmodeltile.AMap3DModelTileProvider$AMap3DModelRequest r0 = new com.amap.api.maps.model.amap3dmodeltile.AMap3DModelTileProvider$AMap3DModelRequest     // Catch: java.lang.Exception -> L2f
                com.autonavi.base.ae.gmap.AMapAppRequestParam r1 = r4.f3041d     // Catch: java.lang.Exception -> L2f
                java.lang.String r1 = r1.getUrl()     // Catch: java.lang.Exception -> L2f
                r0.<init>(r1)     // Catch: java.lang.Exception -> L2f
                byte[] r0 = r0.makeHttpRequestWithInterrupted()     // Catch: java.lang.Exception -> L2f
                com.autonavi.base.ae.gmap.AMapAppResourceItem r1 = new com.autonavi.base.ae.gmap.AMapAppResourceItem     // Catch: java.lang.Exception -> L2f
                r1.<init>()     // Catch: java.lang.Exception -> L2f
                r1.setData(r0)     // Catch: java.lang.Exception -> L2f
                int r0 = r0.length     // Catch: java.lang.Exception -> L2f
                long r2 = (long) r0     // Catch: java.lang.Exception -> L2f
                r1.setSize(r2)     // Catch: java.lang.Exception -> L2f
                com.autonavi.base.ae.gmap.AMapAppRequestParam r0 = r4.f3041d     // Catch: java.lang.Exception -> L2f
                int r0 = r0.getResourceType()     // Catch: java.lang.Exception -> L2f
                r1.setResourceType(r0)     // Catch: java.lang.Exception -> L2f
                com.autonavi.base.ae.gmap.AMapAppRequestParam r0 = r4.f3041d     // Catch: java.lang.Exception -> L2f
                com.autonavi.base.ae.gmap.ResourceCallback r0 = r0.getCallback()     // Catch: java.lang.Exception -> L2f
                r0.callSuccess(r1)     // Catch: java.lang.Exception -> L2f
                return
            L2f:
                r0 = move-exception
                com.autonavi.base.ae.gmap.AMapAppRequestParam r1 = r4.f3041d
                com.autonavi.base.ae.gmap.ResourceCallback r1 = r1.getCallback()
                java.lang.String r0 = r0.getMessage()
                r1.callFailed(r0)
                return
        }
    }

    public c(com.autonavi.base.amap.api.mapcore.IAMapDelegate r3, android.content.Context r4) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.f3032c = r0
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r2.f3033d = r1
            java.util.concurrent.ConcurrentHashMap r1 = new java.util.concurrent.ConcurrentHashMap
            r1.<init>()
            r2.f3035f = r1
            r1 = 0
            r2.f3037h = r1
            r2.f3038i = r1
            r2.f3039j = r1
            r2.f3040k = r1
            r2.l = r1
            r2.m = r1
            r2.n = r1
            r2.o = r1
            r2.p = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.q = r0
            r2.a = r3
            r2.f3031b = r4
            com.autonavi.base.amap.mapcore.AMapNativeGlOverlayLayer r4 = new com.autonavi.base.amap.mapcore.AMapNativeGlOverlayLayer
            r4.<init>()
            r2.f3034e = r4
            com.amap.api.col.3l.r1 r4 = new com.amap.api.col.3l.r1
            r4.<init>(r3)
            r2.f3036g = r4
            return
    }

    private com.amap.api.maps.model.BitmapDescriptor a(android.view.View r4) {
            r3 = this;
            if (r4 != 0) goto L4
            r4 = 0
            return r4
        L4:
            boolean r0 = r4 instanceof android.widget.RelativeLayout
            r1 = 1
            if (r0 == 0) goto L1b
            android.content.Context r0 = r3.f3031b
            if (r0 == 0) goto L1b
            android.widget.LinearLayout r0 = new android.widget.LinearLayout
            android.content.Context r2 = r3.f3031b
            r0.<init>(r2)
            r0.setOrientation(r1)
            r0.addView(r4)
            r4 = r0
        L1b:
            r4.setDrawingCacheEnabled(r1)
            r0 = 0
            r4.setDrawingCacheQuality(r0)
            android.graphics.Bitmap r4 = com.amap.api.col.p0003l.b3.n(r4)
            com.amap.api.maps.model.BitmapDescriptor r4 = com.amap.api.maps.model.BitmapDescriptorFactory.fromBitmap(r4)
            return r4
    }

    private void b(java.lang.String r2, com.amap.api.maps.model.BaseOptions r3) {
            r1 = this;
            com.autonavi.base.amap.mapcore.AMapNativeGlOverlayLayer r0 = r1.f3034e     // Catch: java.lang.Throwable -> L6
            r0.createOverlay(r2, r3)     // Catch: java.lang.Throwable -> L6
            return
        L6:
            r2 = move-exception
            java.lang.String r3 = "GlOverlayLayer"
            java.lang.String r0 = "addOverlay"
            com.amap.api.col.p0003l.w5.p(r2, r3, r0)
            r2.getMessage()
            return
    }

    private void c(java.lang.String r2, com.amap.api.maps.model.BaseOverlay r3, com.amap.api.maps.model.BaseOptions r4) {
            r1 = this;
            r1.b(r2, r4)
            java.util.Map<java.lang.String, com.amap.api.maps.model.BaseOverlay> r4 = r1.f3035f
            monitor-enter(r4)
            java.util.Map<java.lang.String, com.amap.api.maps.model.BaseOverlay> r0 = r1.f3035f     // Catch: java.lang.Throwable -> Ld
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Ld
            return
        Ld:
            r2 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Ld
            throw r2
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final boolean IsCircleContainPoint(com.amap.api.maps.model.CircleOptions r6, com.amap.api.maps.model.LatLng r7) {
            r5 = this;
            r0 = 0
            if (r7 == 0) goto L45
            if (r6 != 0) goto L6
            goto L45
        L6:
            monitor-enter(r6)     // Catch: java.lang.Throwable -> L45
            java.util.List r1 = r6.getHoleOptions()     // Catch: java.lang.Throwable -> L2b
            if (r1 == 0) goto L2d
            int r2 = r1.size()     // Catch: java.lang.Throwable -> L2b
            if (r2 <= 0) goto L2d
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L2b
        L17:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L2b
            if (r2 == 0) goto L2d
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L2b
            com.amap.api.maps.model.BaseHoleOptions r2 = (com.amap.api.maps.model.BaseHoleOptions) r2     // Catch: java.lang.Throwable -> L2b
            boolean r2 = com.amap.api.col.p0003l.b3.K(r2, r7)     // Catch: java.lang.Throwable -> L2b
            if (r2 == 0) goto L17
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L2b
            return r0
        L2b:
            r7 = move-exception
            goto L43
        L2d:
            double r1 = r6.getRadius()     // Catch: java.lang.Throwable -> L2b
            com.amap.api.maps.model.LatLng r3 = r6.getCenter()     // Catch: java.lang.Throwable -> L2b
            float r7 = com.amap.api.maps.AMapUtils.calculateLineDistance(r3, r7)     // Catch: java.lang.Throwable -> L2b
            double r3 = (double) r7     // Catch: java.lang.Throwable -> L2b
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r7 < 0) goto L41
            r7 = 1
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L2b
            return r7
        L41:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L2b
            return r0
        L43:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L2b
            throw r7     // Catch: java.lang.Throwable -> L45
        L45:
            return r0
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final boolean IsPolygonContainsPoint(com.amap.api.maps.model.PolygonOptions r4, com.amap.api.maps.model.LatLng r5) {
            r3 = this;
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            java.util.List r1 = r4.getHoleOptions()     // Catch: java.lang.Throwable -> L30
            if (r1 == 0) goto L27
            int r2 = r1.size()     // Catch: java.lang.Throwable -> L30
            if (r2 <= 0) goto L27
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L30
        L14:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L30
            if (r2 == 0) goto L27
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L30
            com.amap.api.maps.model.BaseHoleOptions r2 = (com.amap.api.maps.model.BaseHoleOptions) r2     // Catch: java.lang.Throwable -> L30
            boolean r2 = com.amap.api.col.p0003l.b3.K(r2, r5)     // Catch: java.lang.Throwable -> L30
            if (r2 == 0) goto L14
            return r0
        L27:
            java.util.List r4 = r4.getPoints()     // Catch: java.lang.Throwable -> L30
            boolean r4 = com.amap.api.col.p0003l.b3.M(r5, r4)     // Catch: java.lang.Throwable -> L30
            return r4
        L30:
            return r0
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final com.amap.api.maps.model.BaseOverlay addOverlayObject(java.lang.String r1, com.amap.api.maps.model.BaseOverlay r2, com.amap.api.maps.model.BaseOptions r3) {
            r0 = this;
            r0.c(r1, r2, r3)
            return r2
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final void changeOverlayIndex() {
            r0 = this;
            return
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final boolean checkInBounds(java.lang.String r5) {
            r4 = this;
            com.autonavi.base.amap.mapcore.AMapNativeGlOverlayLayer r0 = r4.f3034e
            r1 = 1
            if (r0 == 0) goto L1b
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r3 = 0
            r2[r3] = r5
            java.lang.String r3 = "checkInBounds"
            java.lang.Object r5 = r0.getNativeProperties(r5, r3, r2)
            boolean r0 = r5 instanceof java.lang.Boolean
            if (r0 == 0) goto L1b
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            return r5
        L1b:
            return r1
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final synchronized void clear(java.lang.String... r8) {
            r7 = this;
            monitor-enter(r7)
            com.autonavi.base.amap.mapcore.AMapNativeGlOverlayLayer r0 = r7.f3034e     // Catch: java.lang.Throwable -> Lb
            if (r0 == 0) goto Ld
            if (r8 == 0) goto Ld
            r0.clear(r8)     // Catch: java.lang.Throwable -> Lb
            goto Ld
        Lb:
            r8 = move-exception
            goto L4e
        Ld:
            java.util.Map<java.lang.String, com.amap.api.maps.model.BaseOverlay> r0 = r7.f3035f     // Catch: java.lang.Throwable -> Lb
            monitor-enter(r0)     // Catch: java.lang.Throwable -> Lb
            if (r8 == 0) goto L44
            java.util.Map<java.lang.String, com.amap.api.maps.model.BaseOverlay> r1 = r7.f3035f     // Catch: java.lang.Throwable -> L3b
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Throwable -> L3b
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L3b
        L1c:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L3b
            if (r2 == 0) goto L49
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L3b
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch: java.lang.Throwable -> L3b
            int r3 = r8.length     // Catch: java.lang.Throwable -> L3b
            r4 = 0
        L2a:
            if (r4 >= r3) goto L40
            r5 = r8[r4]     // Catch: java.lang.Throwable -> L3b
            if (r5 == 0) goto L3d
            java.lang.Object r6 = r2.getKey()     // Catch: java.lang.Throwable -> L3b
            boolean r5 = r5.equals(r6)     // Catch: java.lang.Throwable -> L3b
            if (r5 == 0) goto L3d
            goto L1c
        L3b:
            r8 = move-exception
            goto L4c
        L3d:
            int r4 = r4 + 1
            goto L2a
        L40:
            r1.remove()     // Catch: java.lang.Throwable -> L3b
            goto L1c
        L44:
            java.util.Map<java.lang.String, com.amap.api.maps.model.BaseOverlay> r8 = r7.f3035f     // Catch: java.lang.Throwable -> L3b
            r8.clear()     // Catch: java.lang.Throwable -> L3b
        L49:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3b
            monitor-exit(r7)
            return
        L4c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3b
            throw r8     // Catch: java.lang.Throwable -> Lb
        L4e:
            java.lang.String r0 = "GlOverlayLayer"
            java.lang.String r1 = "clear"
            com.amap.api.col.p0003l.w5.p(r8, r0, r1)     // Catch: java.lang.Throwable -> L57
            monitor-exit(r7)
            return
        L57:
            r8 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L57
            throw r8
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final void clearOverlayByType(java.lang.String r6) {
            r5 = this;
            java.util.Map<java.lang.String, com.amap.api.maps.model.BaseOverlay> r0 = r5.f3035f
            monitor-enter(r0)
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L31
            r1.<init>()     // Catch: java.lang.Throwable -> L31
            java.util.Map<java.lang.String, com.amap.api.maps.model.BaseOverlay> r2 = r5.f3035f     // Catch: java.lang.Throwable -> L31
            java.util.Set r2 = r2.entrySet()     // Catch: java.lang.Throwable -> L31
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L31
        L12:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L31
            if (r3 == 0) goto L33
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L31
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch: java.lang.Throwable -> L31
            java.lang.Object r3 = r3.getKey()     // Catch: java.lang.Throwable -> L31
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L31
            boolean r4 = r3.contains(r6)     // Catch: java.lang.Throwable -> L31
            if (r4 == 0) goto L12
            r2.remove()     // Catch: java.lang.Throwable -> L31
            r1.add(r3)     // Catch: java.lang.Throwable -> L31
            goto L12
        L31:
            r6 = move-exception
            goto L49
        L33:
            java.util.Iterator r6 = r1.iterator()     // Catch: java.lang.Throwable -> L31
        L37:
            boolean r1 = r6.hasNext()     // Catch: java.lang.Throwable -> L31
            if (r1 == 0) goto L47
            java.lang.Object r1 = r6.next()     // Catch: java.lang.Throwable -> L31
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L31
            r5.removeOverlay(r1)     // Catch: java.lang.Throwable -> L31
            goto L37
        L47:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L31
            return
        L49:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L31
            throw r6
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final void clearTileCache() {
            r4 = this;
            com.autonavi.base.amap.mapcore.AMapNativeGlOverlayLayer r0 = r4.f3034e
            if (r0 == 0) goto Lc
            java.lang.String r1 = "clearTileCache"
            r2 = 0
            java.lang.String r3 = ""
            r0.getNativeProperties(r3, r1, r2)
        Lc:
            return
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final java.lang.String createId(java.lang.String r3) {
            r2 = this;
            java.lang.Object r0 = r2.f3033d
            monitor-enter(r0)
            int r1 = r2.f3032c     // Catch: java.lang.Throwable -> L1c
            int r1 = r1 + 1
            r2.f3032c = r1     // Catch: java.lang.Throwable -> L1c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1c
            r1.<init>()     // Catch: java.lang.Throwable -> L1c
            r1.append(r3)     // Catch: java.lang.Throwable -> L1c
            int r3 = r2.f3032c     // Catch: java.lang.Throwable -> L1c
            r1.append(r3)     // Catch: java.lang.Throwable -> L1c
            java.lang.String r3 = r1.toString()     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
            return r3
        L1c:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
            throw r3
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final synchronized void destroy() {
            r3 = this;
            monitor-enter(r3)
            com.autonavi.base.amap.mapcore.AMapNativeGlOverlayLayer r0 = r3.f3034e     // Catch: java.lang.Throwable -> L25
            if (r0 != 0) goto L7
            monitor-exit(r3)
            return
        L7:
            java.util.Map<java.lang.String, com.amap.api.maps.model.BaseOverlay> r0 = r3.f3035f     // Catch: java.lang.Throwable -> L25
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L25
            java.util.Map<java.lang.String, com.amap.api.maps.model.BaseOverlay> r1 = r3.f3035f     // Catch: java.lang.Throwable -> L27
            r1.clear()     // Catch: java.lang.Throwable -> L27
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L27
            com.autonavi.base.amap.mapcore.AMapNativeGlOverlayLayer r0 = r3.f3034e     // Catch: java.lang.Throwable -> L25
            java.lang.String r1 = ""
            java.lang.String[] r1 = new java.lang.String[]{r1}     // Catch: java.lang.Throwable -> L25
            r0.clear(r1)     // Catch: java.lang.Throwable -> L25
            com.autonavi.base.amap.mapcore.AMapNativeGlOverlayLayer r0 = r3.f3034e     // Catch: java.lang.Throwable -> L25
            r0.destroy()     // Catch: java.lang.Throwable -> L25
            r0 = 0
            r3.f3034e = r0     // Catch: java.lang.Throwable -> L25
            monitor-exit(r3)
            return
        L25:
            r0 = move-exception
            goto L2a
        L27:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L27
            throw r1     // Catch: java.lang.Throwable -> L25
        L2a:
            java.lang.String r1 = "GlOverlayLayer"
            java.lang.String r2 = "destroy"
            com.amap.api.col.p0003l.w5.p(r0, r1, r2)     // Catch: java.lang.Throwable -> L33
            monitor-exit(r3)
            return
        L33:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L33
            throw r0
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final synchronized boolean draw(int r3, int r4, boolean r5) {
            r2 = this;
            monitor-enter(r2)
            r0 = 0
            com.amap.api.col.3l.r1 r1 = r2.f3036g     // Catch: java.lang.Throwable -> La
            if (r1 == 0) goto Lc
            r1.a()     // Catch: java.lang.Throwable -> La
            goto Lc
        La:
            r3 = move-exception
            goto L1f
        Lc:
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r1 = r2.a     // Catch: java.lang.Throwable -> La
            com.autonavi.base.amap.mapcore.MapConfig r1 = r1.getMapConfig()     // Catch: java.lang.Throwable -> La
            if (r1 != 0) goto L16
            monitor-exit(r2)
            return r0
        L16:
            com.autonavi.base.amap.mapcore.AMapNativeGlOverlayLayer r1 = r2.f3034e     // Catch: java.lang.Throwable -> La
            if (r1 == 0) goto L1d
            r1.render(r3, r4, r5)     // Catch: java.lang.Throwable -> La
        L1d:
            r0 = 1
            goto L26
        L1f:
            java.lang.String r4 = "GlOverlayLayer"
            java.lang.String r5 = "draw"
            com.amap.api.col.p0003l.w5.p(r3, r4, r5)     // Catch: java.lang.Throwable -> L28
        L26:
            monitor-exit(r2)
            return r0
        L28:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L28
            throw r3
    }

    @Override // com.autonavi.base.amap.mapcore.AMapNativeGlOverlayLayer.NativeFunCallListener
    public final void getAMapResource(com.autonavi.base.ae.gmap.AMapAppRequestParam r3) {
            r2 = this;
            com.amap.api.col.3l.z2 r0 = com.amap.api.col.p0003l.z2.a()
            com.amap.api.col.3l.c$a r1 = new com.amap.api.col.3l.c$a
            r1.<init>(r2, r3)
            r0.b(r1)
            return
    }

    @Override // com.autonavi.base.amap.mapcore.AMapNativeGlOverlayLayer.NativeFunCallListener
    public final com.amap.api.maps.model.BitmapDescriptor getBuildInImageData(int r2) {
            r1 = this;
            java.lang.String r0 = "amap_sdk_lineTexture.png"
            switch(r2) {
                case 0: goto Lc4;
                case 1: goto La7;
                case 2: goto L88;
                case 3: goto L69;
                case 4: goto L52;
                case 5: goto L39;
                case 6: goto L20;
                case 7: goto L7;
                default: goto L5;
            }
        L5:
            goto Le1
        L7:
            com.amap.api.maps.model.BitmapDescriptor r2 = r1.o     // Catch: java.lang.Throwable -> Le1
            if (r2 == 0) goto L15
            android.graphics.Bitmap r2 = r2.getBitmap()     // Catch: java.lang.Throwable -> Le1
            boolean r2 = r2.isRecycled()     // Catch: java.lang.Throwable -> Le1
            if (r2 == 0) goto L1d
        L15:
            java.lang.String r2 = "arrow/arrow_line_shadow.png"
            com.amap.api.maps.model.BitmapDescriptor r2 = com.amap.api.maps.model.BitmapDescriptorFactory.fromAsset(r2)     // Catch: java.lang.Throwable -> Le1
            r1.o = r2     // Catch: java.lang.Throwable -> Le1
        L1d:
            com.amap.api.maps.model.BitmapDescriptor r2 = r1.o     // Catch: java.lang.Throwable -> Le1
            return r2
        L20:
            com.amap.api.maps.model.BitmapDescriptor r2 = r1.n     // Catch: java.lang.Throwable -> Le1
            if (r2 == 0) goto L2e
            android.graphics.Bitmap r2 = r2.getBitmap()     // Catch: java.lang.Throwable -> Le1
            boolean r2 = r2.isRecycled()     // Catch: java.lang.Throwable -> Le1
            if (r2 == 0) goto L36
        L2e:
            java.lang.String r2 = "arrow/arrow_line_outer.png"
            com.amap.api.maps.model.BitmapDescriptor r2 = com.amap.api.maps.model.BitmapDescriptorFactory.fromAsset(r2)     // Catch: java.lang.Throwable -> Le1
            r1.n = r2     // Catch: java.lang.Throwable -> Le1
        L36:
            com.amap.api.maps.model.BitmapDescriptor r2 = r1.n     // Catch: java.lang.Throwable -> Le1
            return r2
        L39:
            com.amap.api.maps.model.BitmapDescriptor r2 = r1.m     // Catch: java.lang.Throwable -> Le1
            if (r2 == 0) goto L47
            android.graphics.Bitmap r2 = r2.getBitmap()     // Catch: java.lang.Throwable -> Le1
            boolean r2 = r2.isRecycled()     // Catch: java.lang.Throwable -> Le1
            if (r2 == 0) goto L4f
        L47:
            java.lang.String r2 = "arrow/arrow_line_inner.png"
            com.amap.api.maps.model.BitmapDescriptor r2 = com.amap.api.maps.model.BitmapDescriptorFactory.fromAsset(r2)     // Catch: java.lang.Throwable -> Le1
            r1.m = r2     // Catch: java.lang.Throwable -> Le1
        L4f:
            com.amap.api.maps.model.BitmapDescriptor r2 = r1.m     // Catch: java.lang.Throwable -> Le1
            return r2
        L52:
            com.amap.api.maps.model.BitmapDescriptor r2 = r1.l     // Catch: java.lang.Throwable -> Le1
            if (r2 == 0) goto L60
            android.graphics.Bitmap r2 = r2.getBitmap()     // Catch: java.lang.Throwable -> Le1
            boolean r2 = r2.isRecycled()     // Catch: java.lang.Throwable -> Le1
            if (r2 == 0) goto L66
        L60:
            com.amap.api.maps.model.BitmapDescriptor r2 = com.amap.api.maps.model.BitmapDescriptorFactory.defaultMarker()     // Catch: java.lang.Throwable -> Le1
            r1.l = r2     // Catch: java.lang.Throwable -> Le1
        L66:
            com.amap.api.maps.model.BitmapDescriptor r2 = r1.l     // Catch: java.lang.Throwable -> Le1
            return r2
        L69:
            com.amap.api.maps.model.BitmapDescriptor r2 = r1.f3038i     // Catch: java.lang.Throwable -> Le1
            if (r2 == 0) goto L77
            android.graphics.Bitmap r2 = r2.getBitmap()     // Catch: java.lang.Throwable -> Le1
            boolean r2 = r2.isRecycled()     // Catch: java.lang.Throwable -> Le1
            if (r2 == 0) goto L85
        L77:
            android.content.Context r2 = r1.f3031b     // Catch: java.lang.Throwable -> Le1
            java.lang.String r0 = "amap_sdk_lineDashTexture_square.png"
            android.graphics.Bitmap r2 = com.amap.api.col.p0003l.b3.l(r2, r0)     // Catch: java.lang.Throwable -> Le1
            com.amap.api.maps.model.BitmapDescriptor r2 = com.amap.api.maps.model.BitmapDescriptorFactory.fromBitmap(r2)     // Catch: java.lang.Throwable -> Le1
            r1.f3038i = r2     // Catch: java.lang.Throwable -> Le1
        L85:
            com.amap.api.maps.model.BitmapDescriptor r2 = r1.f3038i     // Catch: java.lang.Throwable -> Le1
            return r2
        L88:
            com.amap.api.maps.model.BitmapDescriptor r2 = r1.f3039j     // Catch: java.lang.Throwable -> Le1
            if (r2 == 0) goto L96
            android.graphics.Bitmap r2 = r2.getBitmap()     // Catch: java.lang.Throwable -> Le1
            boolean r2 = r2.isRecycled()     // Catch: java.lang.Throwable -> Le1
            if (r2 == 0) goto La4
        L96:
            android.content.Context r2 = r1.f3031b     // Catch: java.lang.Throwable -> Le1
            java.lang.String r0 = "amap_sdk_lineDashTexture_circle.png"
            android.graphics.Bitmap r2 = com.amap.api.col.p0003l.b3.l(r2, r0)     // Catch: java.lang.Throwable -> Le1
            com.amap.api.maps.model.BitmapDescriptor r2 = com.amap.api.maps.model.BitmapDescriptorFactory.fromBitmap(r2)     // Catch: java.lang.Throwable -> Le1
            r1.f3039j = r2     // Catch: java.lang.Throwable -> Le1
        La4:
            com.amap.api.maps.model.BitmapDescriptor r2 = r1.f3039j     // Catch: java.lang.Throwable -> Le1
            return r2
        La7:
            com.amap.api.maps.model.BitmapDescriptor r2 = r1.f3040k     // Catch: java.lang.Throwable -> Le1
            if (r2 == 0) goto Lb5
            android.graphics.Bitmap r2 = r2.getBitmap()     // Catch: java.lang.Throwable -> Le1
            boolean r2 = r2.isRecycled()     // Catch: java.lang.Throwable -> Le1
            if (r2 == 0) goto Lc1
        Lb5:
            android.content.Context r2 = r1.f3031b     // Catch: java.lang.Throwable -> Le1
            android.graphics.Bitmap r2 = com.amap.api.col.p0003l.b3.l(r2, r0)     // Catch: java.lang.Throwable -> Le1
            com.amap.api.maps.model.BitmapDescriptor r2 = com.amap.api.maps.model.BitmapDescriptorFactory.fromBitmap(r2)     // Catch: java.lang.Throwable -> Le1
            r1.f3040k = r2     // Catch: java.lang.Throwable -> Le1
        Lc1:
            com.amap.api.maps.model.BitmapDescriptor r2 = r1.f3040k     // Catch: java.lang.Throwable -> Le1
            return r2
        Lc4:
            com.amap.api.maps.model.BitmapDescriptor r2 = r1.f3037h     // Catch: java.lang.Throwable -> Le1
            if (r2 == 0) goto Ld2
            android.graphics.Bitmap r2 = r2.getBitmap()     // Catch: java.lang.Throwable -> Le1
            boolean r2 = r2.isRecycled()     // Catch: java.lang.Throwable -> Le1
            if (r2 == 0) goto Lde
        Ld2:
            android.content.Context r2 = r1.f3031b     // Catch: java.lang.Throwable -> Le1
            android.graphics.Bitmap r2 = com.amap.api.col.p0003l.b3.l(r2, r0)     // Catch: java.lang.Throwable -> Le1
            com.amap.api.maps.model.BitmapDescriptor r2 = com.amap.api.maps.model.BitmapDescriptorFactory.fromBitmap(r2)     // Catch: java.lang.Throwable -> Le1
            r1.f3037h = r2     // Catch: java.lang.Throwable -> Le1
        Lde:
            com.amap.api.maps.model.BitmapDescriptor r2 = r1.f3037h     // Catch: java.lang.Throwable -> Le1
            return r2
        Le1:
            r2 = 0
            return r2
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final int getCurrentParticleNum(java.lang.String r2) {
            r1 = this;
            com.autonavi.base.amap.mapcore.AMapNativeGlOverlayLayer r0 = r1.f3034e
            if (r0 == 0) goto L9
            int r2 = r0.getCurrentParticleNum(r2)
            return r2
        L9:
            r2 = 0
            return r2
    }

    @Override // com.autonavi.base.amap.mapcore.AMapNativeGlOverlayLayer.NativeFunCallListener
    public final com.amap.api.maps.model.BitmapDescriptor getCustomImageData(com.amap.api.maps.model.ImageOptions r18) {
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 0
            if (r1 != 0) goto L8
            return r2
        L8:
            int r3 = r1.type
            com.amap.api.maps.model.ImageOptions$ShapeType r4 = com.amap.api.maps.model.ImageOptions.ShapeType.CIRCLE
            int r4 = r4.value()
            r5 = 2
            r6 = 0
            r8 = 1
            r9 = 0
            if (r3 != r4) goto L58
            float r3 = r1.radius
            double r10 = (double) r3
            int r4 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r4 != 0) goto L1f
            return r2
        L1f:
            int r2 = (int) r3
            android.content.Context r3 = r0.f3031b
            float r2 = (float) r2
            int r2 = com.amap.api.col.p0003l.v2.a(r3, r2)
            float r2 = (float) r2
            int r3 = (int) r2
            int r3 = r3 * 2
            android.graphics.Bitmap$Config r4 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r3, r3, r4)
            android.graphics.Paint r4 = new android.graphics.Paint
            r4.<init>()
            r4.setAntiAlias(r8)
            android.graphics.Canvas r5 = new android.graphics.Canvas
            r5.<init>(r3)
            android.graphics.Path r6 = new android.graphics.Path
            r6.<init>()
            android.graphics.Path$Direction r7 = android.graphics.Path.Direction.CW
            r6.addCircle(r2, r2, r2, r7)
            r5.clipPath(r6)
            int r1 = r1.color
            r5.drawColor(r1)
            r5.drawBitmap(r3, r9, r9, r4)
            com.amap.api.maps.model.BitmapDescriptor r1 = com.amap.api.maps.model.BitmapDescriptorFactory.fromBitmap(r3)
            return r1
        L58:
            int r3 = r1.type
            com.amap.api.maps.model.ImageOptions$ShapeType r4 = com.amap.api.maps.model.ImageOptions.ShapeType.TEXT
            int r4 = r4.value()
            r10 = 0
            if (r3 != r4) goto Lbb
            java.lang.String r3 = r1.content
            int r4 = r1.fontSize
            boolean r5 = r3.isEmpty()
            if (r5 == 0) goto L6e
            return r2
        L6e:
            android.content.Context r2 = r0.f3031b
            float r4 = (float) r4
            int r2 = com.amap.api.col.p0003l.v2.a(r2, r4)
            float r2 = (float) r2
            android.graphics.Paint r4 = new android.graphics.Paint
            r4.<init>()
            r4.setTextSize(r2)
            r4.setFakeBoldText(r8)
            int r1 = r1.color
            r4.setColor(r1)
            float r1 = r4.measureText(r3)
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            int r5 = r3.length()
            r4.getTextBounds(r3, r10, r5, r2)
            int r5 = r2.height()
            int r1 = (int) r1
            android.graphics.Bitmap$Config r6 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createBitmap(r1, r5, r6)
            android.graphics.Canvas r5 = new android.graphics.Canvas
            r5.<init>(r1)
            r5.save()
            r5.drawColor(r10)
            int r2 = r2.top
            int r2 = -r2
            float r2 = (float) r2
            r5.drawText(r3, r9, r2, r4)
            r5.restore()
            com.amap.api.maps.model.BitmapDescriptor r1 = com.amap.api.maps.model.BitmapDescriptorFactory.fromBitmap(r1)
            return r1
        Lbb:
            int r3 = r1.type
            com.amap.api.maps.model.ImageOptions$ShapeType r4 = com.amap.api.maps.model.ImageOptions.ShapeType.DEFAULT
            int r4 = r4.value()
            if (r3 != r4) goto L118
            float r3 = r1.radius
            double r11 = (double) r3
            int r4 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r4 != 0) goto Lcd
            return r2
        Lcd:
            int r2 = (int) r3
            android.content.Context r3 = r0.f3031b
            float r2 = (float) r2
            int r2 = com.amap.api.col.p0003l.v2.a(r3, r2)
            float r14 = (float) r2
            int r2 = (int) r14
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r2 = android.graphics.Bitmap.createBitmap(r2, r2, r3)
            android.graphics.Paint r3 = new android.graphics.Paint
            r3.<init>()
            r3.setAntiAlias(r8)
            android.graphics.Canvas r4 = new android.graphics.Canvas
            r4.<init>(r2)
            android.graphics.Path r11 = new android.graphics.Path
            r11.<init>()
            r13 = 0
            android.graphics.Path$Direction r16 = android.graphics.Path.Direction.CW
            r12 = 0
            r15 = r14
            r11.addRect(r12, r13, r14, r15, r16)
            r4.clipPath(r11)
            double[] r1 = r1.rgba
            r6 = r1[r10]
            r10 = r1[r8]
            r12 = r1[r5]
            r5 = 3
            r14 = r1[r5]
            float r1 = (float) r14
            float r5 = (float) r6
            float r6 = (float) r10
            float r7 = (float) r12
            int r1 = com.amap.api.col.p0003l.b.a(r1, r5, r6, r7)
            r4.drawColor(r1)
            r4.drawBitmap(r2, r9, r9, r3)
            com.amap.api.maps.model.BitmapDescriptor r1 = com.amap.api.maps.model.BitmapDescriptorFactory.fromBitmap(r2)
            return r1
        L118:
            return r2
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final com.amap.api.maps.model.BaseOverlay getHitBaseOverlay(android.view.MotionEvent r6, int r7) {
            r5 = this;
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r5.a
            if (r0 == 0) goto L28
            com.autonavi.amap.mapcore.DPoint r0 = com.autonavi.amap.mapcore.DPoint.obtain()
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r1 = r5.a
            float r2 = r6.getX()
            int r2 = (int) r2
            float r6 = r6.getY()
            int r6 = (int) r6
            r1.getPixel2LatLng(r2, r6, r0)
            com.amap.api.maps.model.LatLng r6 = new com.amap.api.maps.model.LatLng
            double r1 = r0.y
            double r3 = r0.x
            r6.<init>(r1, r3)
            r0.recycle()
            com.amap.api.maps.model.BaseOverlay r6 = r5.getHitBaseOverlay(r6, r7)
            return r6
        L28:
            r6 = 0
            return r6
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final synchronized com.amap.api.maps.model.BaseOverlay getHitBaseOverlay(com.amap.api.maps.model.LatLng r3, int r4) {
            r2 = this;
            monitor-enter(r2)
            com.autonavi.base.amap.mapcore.AMapNativeGlOverlayLayer r0 = r2.f3034e     // Catch: java.lang.Throwable -> L23
            r1 = 0
            if (r0 == 0) goto L25
            java.lang.String r3 = r0.contain(r3, r4)     // Catch: java.lang.Throwable -> L23
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L23
            if (r4 == 0) goto L12
            monitor-exit(r2)
            return r1
        L12:
            java.util.Map<java.lang.String, com.amap.api.maps.model.BaseOverlay> r4 = r2.f3035f     // Catch: java.lang.Throwable -> L23
            monitor-enter(r4)     // Catch: java.lang.Throwable -> L23
            java.util.Map<java.lang.String, com.amap.api.maps.model.BaseOverlay> r0 = r2.f3035f     // Catch: java.lang.Throwable -> L20
            java.lang.Object r3 = r0.get(r3)     // Catch: java.lang.Throwable -> L20
            com.amap.api.maps.model.BaseOverlay r3 = (com.amap.api.maps.model.BaseOverlay) r3     // Catch: java.lang.Throwable -> L20
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L20
            monitor-exit(r2)
            return r3
        L20:
            r3 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L20
            throw r3     // Catch: java.lang.Throwable -> L23
        L23:
            r3 = move-exception
            goto L27
        L25:
            monitor-exit(r2)
            return r1
        L27:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L23
            throw r3
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final synchronized com.amap.api.maps.model.Polyline getHitOverlay(com.amap.api.maps.model.LatLng r3, int r4) {
            r2 = this;
            monitor-enter(r2)
            com.autonavi.base.amap.mapcore.AMapNativeGlOverlayLayer r0 = r2.f3034e     // Catch: java.lang.Throwable -> L2b
            r1 = 0
            if (r0 == 0) goto L2d
            java.lang.String r3 = r0.contain(r3, r4)     // Catch: java.lang.Throwable -> L2b
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L2b
            if (r4 == 0) goto L12
            monitor-exit(r2)
            return r1
        L12:
            java.util.Map<java.lang.String, com.amap.api.maps.model.BaseOverlay> r4 = r2.f3035f     // Catch: java.lang.Throwable -> L2b
            monitor-enter(r4)     // Catch: java.lang.Throwable -> L2b
            java.util.Map<java.lang.String, com.amap.api.maps.model.BaseOverlay> r0 = r2.f3035f     // Catch: java.lang.Throwable -> L25
            java.lang.Object r3 = r0.get(r3)     // Catch: java.lang.Throwable -> L25
            com.amap.api.maps.model.BaseOverlay r3 = (com.amap.api.maps.model.BaseOverlay) r3     // Catch: java.lang.Throwable -> L25
            boolean r0 = r3 instanceof com.amap.api.maps.model.Polyline     // Catch: java.lang.Throwable -> L25
            if (r0 == 0) goto L27
            r1 = r3
            com.amap.api.maps.model.Polyline r1 = (com.amap.api.maps.model.Polyline) r1     // Catch: java.lang.Throwable -> L25
            goto L27
        L25:
            r3 = move-exception
            goto L29
        L27:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L25
            goto L2d
        L29:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L25
            throw r3     // Catch: java.lang.Throwable -> L2b
        L2b:
            r3 = move-exception
            goto L2f
        L2d:
            monitor-exit(r2)
            return r1
        L2f:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2b
            throw r3
    }

    @Override // com.autonavi.base.amap.mapcore.AMapNativeGlOverlayLayer.NativeFunCallListener
    public final com.amap.api.maps.model.BitmapDescriptor getInfoContents(java.lang.String r3) {
            r2 = this;
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r2.a
            if (r0 == 0) goto L21
            com.amap.api.col.3l.a0 r0 = r0.getInfoWindowDelegate()
            if (r0 == 0) goto L21
            java.util.Map<java.lang.String, com.amap.api.maps.model.BaseOverlay> r1 = r2.f3035f
            java.lang.Object r3 = r1.get(r3)
            com.amap.api.maps.model.BaseOverlay r3 = (com.amap.api.maps.model.BaseOverlay) r3
            boolean r1 = r3 instanceof com.amap.api.maps.model.BasePointOverlay
            if (r1 == 0) goto L21
            com.amap.api.maps.model.BasePointOverlay r3 = (com.amap.api.maps.model.BasePointOverlay) r3
            android.view.View r3 = r0.p(r3)
            com.amap.api.maps.model.BitmapDescriptor r3 = r2.a(r3)
            return r3
        L21:
            r3 = 0
            return r3
    }

    @Override // com.autonavi.base.amap.mapcore.AMapNativeGlOverlayLayer.NativeFunCallListener
    public final com.amap.api.maps.model.BitmapDescriptor getInfoWindow(java.lang.String r3) {
            r2 = this;
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r2.a
            if (r0 == 0) goto L21
            com.amap.api.col.3l.a0 r0 = r0.getInfoWindowDelegate()
            if (r0 == 0) goto L21
            java.util.Map<java.lang.String, com.amap.api.maps.model.BaseOverlay> r1 = r2.f3035f
            java.lang.Object r3 = r1.get(r3)
            com.amap.api.maps.model.BaseOverlay r3 = (com.amap.api.maps.model.BaseOverlay) r3
            boolean r1 = r3 instanceof com.amap.api.maps.model.BasePointOverlay
            if (r1 == 0) goto L21
            com.amap.api.maps.model.BasePointOverlay r3 = (com.amap.api.maps.model.BasePointOverlay) r3
            android.view.View r3 = r0.d(r3)
            com.amap.api.maps.model.BitmapDescriptor r3 = r2.a(r3)
            return r3
        L21:
            r3 = 0
            return r3
    }

    @Override // com.autonavi.base.amap.mapcore.AMapNativeGlOverlayLayer.NativeFunCallListener
    public final com.amap.api.maps.model.BitmapDescriptor getInfoWindowClick(java.lang.String r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // com.autonavi.base.amap.mapcore.AMapNativeGlOverlayLayer.NativeFunCallListener
    public final long getInfoWindowUpdateOffsetTime(java.lang.String r3) {
            r2 = this;
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r2.a
            if (r0 == 0) goto L1d
            com.amap.api.col.3l.a0 r0 = r0.getInfoWindowDelegate()
            if (r0 == 0) goto L1d
            java.util.Map<java.lang.String, com.amap.api.maps.model.BaseOverlay> r1 = r2.f3035f
            java.lang.Object r3 = r1.get(r3)
            com.amap.api.maps.model.BaseOverlay r3 = (com.amap.api.maps.model.BaseOverlay) r3
            boolean r1 = r3 instanceof com.amap.api.maps.model.BasePointOverlay
            if (r1 == 0) goto L1d
            com.amap.api.maps.model.BasePointOverlay r3 = (com.amap.api.maps.model.BasePointOverlay) r3
            long r0 = r0.u(r3)
            return r0
        L1d:
            r0 = 0
            return r0
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final com.autonavi.base.amap.api.mapcore.IAMapDelegate getMap() {
            r1 = this;
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r1.a
            return r0
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final java.util.List<com.amap.api.maps.model.Marker> getMapScreenMarkers() {
            r4 = this;
            com.autonavi.base.amap.mapcore.AMapNativeGlOverlayLayer r0 = r4.f3034e
            if (r0 == 0) goto L50
            java.util.List<java.lang.String> r0 = r4.q
            r0.clear()
            com.autonavi.base.amap.mapcore.AMapNativeGlOverlayLayer r0 = r4.f3034e
            java.util.List<java.lang.String> r1 = r4.q
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r1
            java.lang.String r1 = ""
            java.lang.String r3 = "getMapScreenOverlays"
            r0.getNativeProperties(r1, r3, r2)
            java.util.List<java.lang.String> r0 = r4.q
            int r0 = r0.size()
            if (r0 <= 0) goto L50
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List<java.lang.String> r1 = r4.q
            java.util.Iterator r1 = r1.iterator()
        L2d:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L4f
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L2d
            java.lang.String r3 = "MARKER"
            boolean r3 = r2.contains(r3)
            if (r3 == 0) goto L2d
            java.util.Map<java.lang.String, com.amap.api.maps.model.BaseOverlay> r3 = r4.f3035f
            java.lang.Object r2 = r3.get(r2)
            com.amap.api.maps.model.Marker r2 = (com.amap.api.maps.model.Marker) r2
            r0.add(r2)
            goto L2d
        L4f:
            return r0
        L50:
            r0 = 0
            return r0
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final void getMarkerInfoWindowOffset(java.lang.String r4, com.autonavi.base.amap.mapcore.FPoint r5) {
            r3 = this;
            com.autonavi.base.amap.mapcore.AMapNativeGlOverlayLayer r0 = r3.f3034e
            if (r0 == 0) goto L1b
            java.lang.String r1 = "getMarkerInfoWindowOffset"
            r2 = 0
            java.lang.Object r4 = r0.getNativeProperties(r4, r1, r2)
            boolean r0 = r4 instanceof android.graphics.Point
            if (r0 == 0) goto L1b
            android.graphics.Point r4 = (android.graphics.Point) r4
            int r0 = r4.x
            float r0 = (float) r0
            r5.x = r0
            int r4 = r4.y
            float r4 = (float) r4
            r5.y = r4
        L1b:
            return
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final com.amap.api.maps.model.MultiPointItem getMultiPointItem(com.amap.api.maps.model.LatLng r4) {
            r3 = this;
            com.autonavi.base.amap.mapcore.AMapNativeGlOverlayLayer r0 = r3.f3034e     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L42
            r1 = 1
            com.amap.api.maps.model.LatLng[] r1 = new com.amap.api.maps.model.LatLng[r1]     // Catch: java.lang.Throwable -> L42
            r2 = 0
            r1[r2] = r4     // Catch: java.lang.Throwable -> L42
            java.lang.String r4 = ""
            java.lang.String r2 = "getMultiPointItem"
            java.lang.Object r4 = r0.getNativeProperties(r4, r2, r1)     // Catch: java.lang.Throwable -> L42
            boolean r0 = r4 instanceof com.autonavi.base.ae.gmap.bean.MultiPointItemHitTest     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L42
            com.autonavi.base.ae.gmap.bean.MultiPointItemHitTest r4 = (com.autonavi.base.ae.gmap.bean.MultiPointItemHitTest) r4     // Catch: java.lang.Throwable -> L42
            int r0 = r4.index     // Catch: java.lang.Throwable -> L42
            r1 = -1
            if (r0 == r1) goto L42
            java.util.Map<java.lang.String, com.amap.api.maps.model.BaseOverlay> r0 = r3.f3035f     // Catch: java.lang.Throwable -> L42
            java.lang.String r1 = r4.overlayName     // Catch: java.lang.Throwable -> L42
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L42
            com.amap.api.maps.model.BaseOverlay r0 = (com.amap.api.maps.model.BaseOverlay) r0     // Catch: java.lang.Throwable -> L42
            boolean r1 = r0 instanceof com.amap.api.maps.model.MultiPointOverlay     // Catch: java.lang.Throwable -> L42
            if (r1 == 0) goto L42
            com.amap.api.maps.model.MultiPointOverlay r0 = (com.amap.api.maps.model.MultiPointOverlay) r0     // Catch: java.lang.Throwable -> L42
            java.util.List r0 = r0.getItems()     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L42
            int r1 = r0.size()     // Catch: java.lang.Throwable -> L42
            int r4 = r4.index     // Catch: java.lang.Throwable -> L42
            if (r1 <= r4) goto L42
            java.lang.Object r4 = r0.get(r4)     // Catch: java.lang.Throwable -> L42
            com.amap.api.maps.model.MultiPointItem r4 = (com.amap.api.maps.model.MultiPointItem) r4     // Catch: java.lang.Throwable -> L42
            return r4
        L42:
            r4 = 0
            return r4
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final java.lang.Object getNativeProperties(java.lang.String r2, java.lang.String r3, java.lang.Object[] r4) {
            r1 = this;
            com.autonavi.base.amap.mapcore.AMapNativeGlOverlayLayer r0 = r1.f3034e
            if (r0 == 0) goto L9
            java.lang.Object r2 = r0.getNativeProperties(r2, r3, r4)
            return r2
        L9:
            r2 = 0
            return r2
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final com.amap.api.maps.model.LatLng getNearestLatLng(com.amap.api.maps.model.PolylineOptions r7, com.amap.api.maps.model.LatLng r8) {
            r6 = this;
            r0 = 0
            if (r8 == 0) goto L4d
            if (r7 != 0) goto L6
            goto L4d
        L6:
            java.util.List r7 = r7.getPoints()
            if (r7 == 0) goto L4d
            int r1 = r7.size()
            if (r1 != 0) goto L13
            goto L4d
        L13:
            r1 = 0
            r2 = 0
            r2 = 0
            r3 = 0
        L17:
            int r4 = r7.size()     // Catch: java.lang.Throwable -> L2a
            if (r1 >= r4) goto L3f
            if (r1 != 0) goto L2c
            java.lang.Object r3 = r7.get(r1)     // Catch: java.lang.Throwable -> L2a
            com.amap.api.maps.model.LatLng r3 = (com.amap.api.maps.model.LatLng) r3     // Catch: java.lang.Throwable -> L2a
            float r3 = com.amap.api.maps.AMapUtils.calculateLineDistance(r8, r3)     // Catch: java.lang.Throwable -> L2a
            goto L3c
        L2a:
            r7 = move-exception
            goto L46
        L2c:
            java.lang.Object r4 = r7.get(r1)     // Catch: java.lang.Throwable -> L2a
            com.amap.api.maps.model.LatLng r4 = (com.amap.api.maps.model.LatLng) r4     // Catch: java.lang.Throwable -> L2a
            float r4 = com.amap.api.maps.AMapUtils.calculateLineDistance(r8, r4)     // Catch: java.lang.Throwable -> L2a
            int r5 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r5 <= 0) goto L3c
            r2 = r1
            r3 = r4
        L3c:
            int r1 = r1 + 1
            goto L17
        L3f:
            java.lang.Object r7 = r7.get(r2)     // Catch: java.lang.Throwable -> L2a
            com.amap.api.maps.model.LatLng r7 = (com.amap.api.maps.model.LatLng) r7     // Catch: java.lang.Throwable -> L2a
            return r7
        L46:
            java.lang.String r8 = "PolylineDelegate"
            java.lang.String r1 = "getNearestLatLng"
            com.amap.api.col.p0003l.w5.p(r7, r8, r1)
        L4d:
            return r0
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final void getOverlayScreenPos(java.lang.String r4, com.autonavi.base.amap.mapcore.FPoint r5) {
            r3 = this;
            java.util.Map<java.lang.String, com.amap.api.maps.model.BaseOverlay> r0 = r3.f3035f
            java.lang.Object r0 = r0.get(r4)
            com.amap.api.maps.model.BaseOverlay r0 = (com.amap.api.maps.model.BaseOverlay) r0
            boolean r0 = r0 instanceof com.amap.api.maps.model.BasePointOverlay
            if (r0 == 0) goto L25
            com.autonavi.base.amap.mapcore.AMapNativeGlOverlayLayer r0 = r3.f3034e
            java.lang.String r1 = "getMarkerScreenPos"
            r2 = 0
            java.lang.Object r4 = r0.getNativeProperties(r4, r1, r2)
            boolean r0 = r4 instanceof android.graphics.Point
            if (r0 == 0) goto L25
            android.graphics.Point r4 = (android.graphics.Point) r4
            int r0 = r4.x
            float r0 = (float) r0
            r5.x = r0
            int r4 = r4.y
            float r4 = (float) r4
            r5.y = r4
        L25:
            return
    }

    @Override // com.autonavi.base.amap.mapcore.AMapNativeGlOverlayLayer.NativeFunCallListener
    public final com.amap.api.maps.model.BitmapDescriptor getOverturnInfoWindow(java.lang.String r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // com.autonavi.base.amap.mapcore.AMapNativeGlOverlayLayer.NativeFunCallListener
    public final com.amap.api.maps.model.BitmapDescriptor getOverturnInfoWindowClick(java.lang.String r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final void hideInfoWindow(java.lang.String r5) {
            r4 = this;
            com.autonavi.base.amap.mapcore.AMapNativeGlOverlayLayer r0 = r4.f3034e
            r1 = 0
            if (r0 == 0) goto L18
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r4.a
            r0.hideInfoWindow()
            com.autonavi.base.amap.mapcore.AMapNativeGlOverlayLayer r0 = r4.f3034e
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r2[r1] = r3
            java.lang.String r3 = "setInfoWindowShown"
            r0.getNativeProperties(r5, r3, r2)
        L18:
            r4.setRunLowFrame(r1)
            return
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final boolean isGLTFAnimated() {
            r5 = this;
            java.util.Map<java.lang.String, com.amap.api.maps.model.BaseOverlay> r0 = r5.f3035f
            monitor-enter(r0)
            java.util.Map<java.lang.String, com.amap.api.maps.model.BaseOverlay> r1 = r5.f3035f     // Catch: java.lang.Throwable -> L37
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Throwable -> L37
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L37
        Ld:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L37
            if (r2 == 0) goto L39
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L37
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch: java.lang.Throwable -> L37
            java.lang.Object r3 = r2.getKey()     // Catch: java.lang.Throwable -> L37
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L37
            java.lang.Object r2 = r2.getValue()     // Catch: java.lang.Throwable -> L37
            com.amap.api.maps.model.BaseOverlay r2 = (com.amap.api.maps.model.BaseOverlay) r2     // Catch: java.lang.Throwable -> L37
            java.lang.String r4 = "GLTFOVERLAY"
            boolean r3 = r3.contains(r4)     // Catch: java.lang.Throwable -> L37
            if (r3 == 0) goto Ld
            com.amap.api.maps.model.GLTFOverlay r2 = (com.amap.api.maps.model.GLTFOverlay) r2     // Catch: java.lang.Throwable -> L37
            boolean r2 = r2.isAnimated()     // Catch: java.lang.Throwable -> L37
            if (r2 == 0) goto Ld
            r1 = 1
            goto L3a
        L37:
            r1 = move-exception
            goto L3c
        L39:
            r1 = 0
        L3a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L37
            return r1
        L3c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L37
            throw r1
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final void onCreateAMapInstance() {
            r3 = this;
            com.autonavi.base.amap.mapcore.AMapNativeGlOverlayLayer r0 = r3.f3034e
            if (r0 != 0) goto Lb
            com.autonavi.base.amap.mapcore.AMapNativeGlOverlayLayer r0 = new com.autonavi.base.amap.mapcore.AMapNativeGlOverlayLayer
            r0.<init>()
            r3.f3034e = r0
        Lb:
            com.autonavi.base.amap.mapcore.AMapNativeGlOverlayLayer r0 = r3.f3034e
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r1 = r3.a
            int r1 = r1.getNativeEngineID()
            r0.setEngineId(r1)
            com.autonavi.base.amap.mapcore.AMapNativeGlOverlayLayer r0 = r3.f3034e
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r1 = r3.a
            com.autonavi.base.ae.gmap.GLMapEngine r1 = r1.getGLMapEngine()
            long r1 = r1.getNativeInstance()
            r0.createNative(r1)
            com.autonavi.base.amap.mapcore.AMapNativeGlOverlayLayer r0 = r3.f3034e
            r0.setNativeFunCallListener(r3)
            return
    }

    @Override // com.autonavi.base.amap.mapcore.AMapNativeGlOverlayLayer.NativeFunCallListener
    public final void onRedrawInfowindow() {
            r1 = this;
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r1.a
            if (r0 == 0) goto L7
            r0.redrawInfoWindow()
        L7:
            return
    }

    @Override // com.autonavi.base.amap.mapcore.AMapNativeGlOverlayLayer.NativeFunCallListener
    public final void onSetRunLowFrame(boolean r1) {
            r0 = this;
            r0.setRunLowFrame(r1)
            return
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final boolean removeOverlay(java.lang.String r4) {
            r3 = this;
            com.autonavi.base.amap.mapcore.AMapNativeGlOverlayLayer r0 = r3.f3034e
            if (r0 == 0) goto L9
            r0.removeOverlay(r4)
            r0 = 1
            goto La
        L9:
            r0 = 0
        La:
            java.util.Map<java.lang.String, com.amap.api.maps.model.BaseOverlay> r1 = r3.f3035f
            monitor-enter(r1)
            java.util.Map<java.lang.String, com.amap.api.maps.model.BaseOverlay> r2 = r3.f3035f     // Catch: java.lang.Throwable -> L14
            r2.remove(r4)     // Catch: java.lang.Throwable -> L14
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L14
            return r0
        L14:
            r4 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L14
            throw r4
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final boolean removeOverlay(java.lang.String r1, boolean r2) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final void set2Top(java.lang.String r4) {
            r3 = this;
            com.autonavi.base.amap.mapcore.AMapNativeGlOverlayLayer r0 = r3.f3034e
            if (r0 == 0) goto La
            java.lang.String r1 = "set2Top"
            r2 = 0
            r0.getNativeProperties(r4, r1, r2)
        La:
            return
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final void setFlingState(boolean r4) {
            r3 = this;
            com.autonavi.base.amap.mapcore.AMapNativeGlOverlayLayer r0 = r3.f3034e
            if (r0 == 0) goto L15
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            java.lang.String r4 = ""
            java.lang.String r2 = "setFlingState"
            r0.getNativeProperties(r4, r2, r1)
        L15:
            return
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final void setRunLowFrame(boolean r2) {
            r1 = this;
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r1.a
            if (r0 == 0) goto L7
            r0.setRunLowFrame(r2)
        L7:
            return
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final void showInfoWindow(java.lang.String r3) {
            r2 = this;
            com.autonavi.base.amap.mapcore.AMapNativeGlOverlayLayer r0 = r2.f3034e
            if (r0 == 0) goto L17
            java.util.Map<java.lang.String, com.amap.api.maps.model.BaseOverlay> r0 = r2.f3035f
            if (r0 == 0) goto L17
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r1 = r2.a     // Catch: android.os.RemoteException -> L17
            java.lang.Object r3 = r0.get(r3)     // Catch: android.os.RemoteException -> L17
            com.amap.api.maps.model.BaseOverlay r3 = (com.amap.api.maps.model.BaseOverlay) r3     // Catch: android.os.RemoteException -> L17
            r1.showInfoWindow(r3)     // Catch: android.os.RemoteException -> L17
            r3 = 0
            r2.setRunLowFrame(r3)     // Catch: android.os.RemoteException -> L17
        L17:
            return
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final void updateOption(java.lang.String r2, com.amap.api.maps.model.BaseOptions r3) {
            r1 = this;
            com.autonavi.base.amap.mapcore.AMapNativeGlOverlayLayer r0 = r1.f3034e     // Catch: java.lang.Throwable -> Lf
            if (r0 != 0) goto L5
            return
        L5:
            r0 = 0
            r1.setRunLowFrame(r0)     // Catch: java.lang.Throwable -> Lf
            com.autonavi.base.amap.mapcore.AMapNativeGlOverlayLayer r0 = r1.f3034e     // Catch: java.lang.Throwable -> Lf
            r0.updateOptions(r2, r3)     // Catch: java.lang.Throwable -> Lf
            return
        Lf:
            r2 = move-exception
            java.lang.String r3 = "GlOverlayLayer"
            java.lang.String r0 = "updateOption"
            com.amap.api.col.p0003l.w5.p(r2, r3, r0)
            return
    }
}

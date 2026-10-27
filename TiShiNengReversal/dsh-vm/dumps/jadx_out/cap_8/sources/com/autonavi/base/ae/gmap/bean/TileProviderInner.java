package com.autonavi.base.ae.gmap.bean;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class TileProviderInner {

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    private java.lang.ref.WeakReference<com.amap.api.maps.interfaces.IGlOverlayLayer> glOverlayLayerRef;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    private java.util.List<com.amap.api.maps.model.TileOverlaySource> mTileSource;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    private java.lang.String overlayName;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    private final java.util.HashMap<java.lang.String, com.amap.api.col.p0003l.c8> reqTaskHandleHashMap;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    private final com.amap.api.maps.model.TileProvider tileProvider;



    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    public TileProviderInner(com.amap.api.maps.model.TileProvider r2) {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.reqTaskHandleHashMap = r0
            r1.tileProvider = r2
            return
    }

    static /* synthetic */ java.util.HashMap access$000(com.autonavi.base.ae.gmap.bean.TileProviderInner r0) {
            java.util.HashMap<java.lang.String, com.amap.api.col.3l.c8> r0 = r0.reqTaskHandleHashMap
            return r0
    }

    static /* synthetic */ com.amap.api.maps.model.TileProvider access$100(com.autonavi.base.ae.gmap.bean.TileProviderInner r0) {
            com.amap.api.maps.model.TileProvider r0 = r0.tileProvider
            return r0
    }

    static /* synthetic */ void access$200(com.autonavi.base.ae.gmap.bean.TileProviderInner r0, com.amap.api.maps.model.Tile r1, com.autonavi.base.ae.gmap.bean.TileReqTaskHandle r2, java.lang.String r3) {
            r0.finishDownload(r1, r2, r3)
            return
    }

    static /* synthetic */ java.lang.Object access$300(com.autonavi.base.ae.gmap.bean.TileProviderInner r0, java.lang.String r1, java.lang.Object[] r2) {
            java.lang.Object r0 = r0.callNativeFunction(r1, r2)
            return r0
    }

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    private java.lang.Object callNativeFunction(java.lang.String r3, java.lang.Object[] r4) {
            r2 = this;
            java.lang.ref.WeakReference<com.amap.api.maps.interfaces.IGlOverlayLayer> r0 = r2.glOverlayLayerRef     // Catch: java.lang.Throwable -> L19
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L19
            com.amap.api.maps.interfaces.IGlOverlayLayer r0 = (com.amap.api.maps.interfaces.IGlOverlayLayer) r0     // Catch: java.lang.Throwable -> L19
            java.lang.String r1 = r2.overlayName     // Catch: java.lang.Throwable -> L19
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L19
            if (r1 != 0) goto L19
            if (r0 == 0) goto L19
            java.lang.String r1 = r2.overlayName     // Catch: java.lang.Throwable -> L19
            java.lang.Object r3 = r0.getNativeProperties(r1, r3, r4)     // Catch: java.lang.Throwable -> L19
            return r3
        L19:
            r3 = 0
            return r3
    }

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    private java.lang.String createKey(int r2, int r3, int r4, long r5) {
            r1 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.String r2 = " "
            r0.append(r2)
            r0.append(r3)
            r0.append(r2)
            r0.append(r4)
            java.lang.String r2 = "-"
            r0.append(r2)
            r0.append(r5)
            java.lang.String r2 = r0.toString()
            return r2
    }

    private void finishDownload(com.amap.api.maps.model.Tile r3, com.autonavi.base.ae.gmap.bean.TileReqTaskHandle r4, java.lang.String r5) {
            r2 = this;
            java.lang.ref.WeakReference<com.amap.api.maps.interfaces.IGlOverlayLayer> r0 = r2.glOverlayLayerRef
            java.lang.Object r0 = r0.get()
            com.amap.api.maps.interfaces.IGlOverlayLayer r0 = (com.amap.api.maps.interfaces.IGlOverlayLayer) r0
            if (r0 != 0) goto Lb
            return
        Lb:
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r0.getMap()
            com.autonavi.base.ae.gmap.bean.TileProviderInner$2 r1 = new com.autonavi.base.ae.gmap.bean.TileProviderInner$2
            r1.<init>(r2, r5, r4, r3)
            r0.queueEvent(r1)
            return
    }

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    public void cancelTile(com.autonavi.base.ae.gmap.bean.TileSourceReq r8, com.autonavi.base.ae.gmap.bean.TileReqTaskHandle r9) {
            r7 = this;
            int r2 = r8.x
            int r3 = r8.y
            int r4 = r8.zoom
            long r5 = r9.nativeObj
            r1 = r7
            java.lang.String r0 = r1.createKey(r2, r3, r4, r5)
            java.util.HashMap<java.lang.String, com.amap.api.col.3l.c8> r2 = r1.reqTaskHandleHashMap
            monitor-enter(r2)
            java.util.HashMap<java.lang.String, com.amap.api.col.3l.c8> r3 = r1.reqTaskHandleHashMap     // Catch: java.lang.Throwable -> L1a
            boolean r3 = r3.containsKey(r0)     // Catch: java.lang.Throwable -> L1a
            if (r3 != 0) goto L1d
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1a
            return
        L1a:
            r0 = move-exception
            r8 = r0
            goto L42
        L1d:
            java.util.HashMap<java.lang.String, com.amap.api.col.3l.c8> r3 = r1.reqTaskHandleHashMap     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r3 = r3.get(r0)     // Catch: java.lang.Throwable -> L1a
            com.amap.api.col.3l.c8 r3 = (com.amap.api.col.p0003l.c8) r3     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1a
            if (r3 == 0) goto L2e
            com.amap.api.col.p0003l.z2.a()
            com.amap.api.col.p0003l.z2.d(r3)
        L2e:
            r2 = 1
            r9.status = r2
            com.amap.api.maps.model.Tile r2 = com.amap.api.maps.model.TileProvider.NO_TILE
            r7.finishDownload(r2, r9, r0)
            com.amap.api.maps.model.TileProvider r9 = r1.tileProvider     // Catch: java.lang.Throwable -> L41
            boolean r0 = r9 instanceof com.autonavi.base.ae.gmap.bean.TileSourceProvider     // Catch: java.lang.Throwable -> L41
            if (r0 == 0) goto L41
            com.autonavi.base.ae.gmap.bean.TileSourceProvider r9 = (com.autonavi.base.ae.gmap.bean.TileSourceProvider) r9     // Catch: java.lang.Throwable -> L41
            r9.cancel(r8)     // Catch: java.lang.Throwable -> L41
        L41:
            return
        L42:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1a
            throw r8
    }

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    public void getTile(com.autonavi.base.ae.gmap.bean.TileSourceReq r8, com.autonavi.base.ae.gmap.bean.TileReqTaskHandle r9) {
            r7 = this;
            int r2 = r8.x
            int r3 = r8.y
            int r4 = r8.zoom
            long r5 = r9.nativeObj
            r1 = r7
            java.lang.String r0 = r1.createKey(r2, r3, r4, r5)
            com.autonavi.base.ae.gmap.bean.TileProviderInner$1 r2 = new com.autonavi.base.ae.gmap.bean.TileProviderInner$1
            r2.<init>(r7, r0, r8, r9)
            java.util.HashMap<java.lang.String, com.amap.api.col.3l.c8> r8 = r1.reqTaskHandleHashMap
            monitor-enter(r8)
            java.util.HashMap<java.lang.String, com.amap.api.col.3l.c8> r9 = r1.reqTaskHandleHashMap     // Catch: java.lang.Throwable -> L1f
            boolean r9 = r9.containsKey(r0)     // Catch: java.lang.Throwable -> L1f
            if (r9 == 0) goto L22
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L1f
            return
        L1f:
            r0 = move-exception
            r9 = r0
            goto L30
        L22:
            java.util.HashMap<java.lang.String, com.amap.api.col.3l.c8> r9 = r1.reqTaskHandleHashMap     // Catch: java.lang.Throwable -> L1f
            r9.put(r0, r2)     // Catch: java.lang.Throwable -> L1f
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L1f
            com.amap.api.col.3l.z2 r8 = com.amap.api.col.p0003l.z2.a()
            r8.b(r2)
            return
        L30:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L1f
            throw r9
    }

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    public int getTileHeight() {
            r1 = this;
            com.amap.api.maps.model.TileProvider r0 = r1.tileProvider
            if (r0 == 0) goto L9
            int r0 = r0.getTileHeight()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    public int getTileWidth() {
            r1 = this;
            com.amap.api.maps.model.TileProvider r0 = r1.tileProvider
            if (r0 == 0) goto L9
            int r0 = r0.getTileWidth()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    public void init(com.amap.api.maps.interfaces.IGlOverlayLayer r2, java.lang.String r3) {
            r1 = this;
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            r1.glOverlayLayerRef = r0
            r1.overlayName = r3
            return
    }

    public void setTileSource(java.util.List<com.amap.api.maps.model.TileOverlaySource> r1) {
            r0 = this;
            r0.mTileSource = r1
            return
    }
}

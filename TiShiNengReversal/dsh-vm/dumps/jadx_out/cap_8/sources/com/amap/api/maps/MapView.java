package com.amap.api.maps;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class MapView extends android.widget.FrameLayout implements com.amap.api.maps.BaseMapView {
    private com.amap.api.maps.AMap aMap;
    private com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate mapFragmentDelegate;
    private int visibility;

    public MapView(android.content.Context r2) {
            r1 = this;
            r1.<init>(r2)
            r0 = 0
            r1.visibility = r0
            com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate r0 = r1.getMapFragmentDelegate()
            r0.setContext(r2)
            return
    }

    public MapView(android.content.Context r3, android.util.AttributeSet r4) {
            r2 = this;
            r2.<init>(r3, r4)
            r0 = 0
            r2.visibility = r0
            r1 = 16842972(0x10100dc, float:2.3694175E-38)
            int r4 = r4.getAttributeIntValue(r1, r0)     // Catch: java.lang.Throwable -> Lf
            r2.visibility = r4     // Catch: java.lang.Throwable -> Lf
        Lf:
            com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate r4 = r2.getMapFragmentDelegate()
            r4.setContext(r3)
            com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate r3 = r2.getMapFragmentDelegate()
            int r4 = r2.visibility
            r3.setVisibility(r4)
            return
    }

    public MapView(android.content.Context r2, android.util.AttributeSet r3, int r4) {
            r1 = this;
            r1.<init>(r2, r3, r4)
            r4 = 0
            r1.visibility = r4
            r0 = 16842972(0x10100dc, float:2.3694175E-38)
            int r3 = r3.getAttributeIntValue(r0, r4)     // Catch: java.lang.Throwable -> Lf
            r1.visibility = r3     // Catch: java.lang.Throwable -> Lf
        Lf:
            com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate r3 = r1.getMapFragmentDelegate()
            r3.setContext(r2)
            com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate r2 = r1.getMapFragmentDelegate()
            int r3 = r1.visibility
            r2.setVisibility(r3)
            return
    }

    public MapView(android.content.Context r2, com.amap.api.maps.AMapOptions r3) {
            r1 = this;
            r1.<init>(r2)
            r0 = 0
            r1.visibility = r0
            com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate r0 = r1.getMapFragmentDelegate()
            r0.setContext(r2)
            com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate r2 = r1.getMapFragmentDelegate()
            r2.setOptions(r3)
            return
    }

    public com.amap.api.maps.AMap getMap() {
            r2 = this;
            com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate r0 = r2.getMapFragmentDelegate()
            r1 = 0
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r0.getMap()     // Catch: java.lang.Throwable -> L1a
            if (r0 != 0) goto Lc
            return r1
        Lc:
            com.amap.api.maps.AMap r1 = r2.aMap
            if (r1 != 0) goto L17
            com.amap.api.maps.AMap r1 = new com.amap.api.maps.AMap
            r1.<init>(r0)
            r2.aMap = r1
        L17:
            com.amap.api.maps.AMap r0 = r2.aMap
            return r0
        L1a:
            return r1
    }

    protected com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate getMapFragmentDelegate() {
            r2 = this;
            com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate r0 = r2.mapFragmentDelegate
            if (r0 != 0) goto Le
            if (r0 != 0) goto Le
            com.amap.api.col.3l.d r0 = new com.amap.api.col.3l.d
            r1 = 0
            r0.<init>(r1)
            r2.mapFragmentDelegate = r0
        Le:
            com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate r0 = r2.mapFragmentDelegate
            return r0
    }

    @Override // com.amap.api.maps.BaseMapView
    public void loadWorldVectorMap(boolean r2) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate r0 = r1.getMapFragmentDelegate()     // Catch: java.lang.Throwable -> L7
            r0.loadWorldVectorMap(r2)     // Catch: java.lang.Throwable -> L7
        L7:
            return
    }

    public void onCreate(android.os.Bundle r3) {
            r2 = this;
            com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate r0 = r2.getMapFragmentDelegate()     // Catch: java.lang.Throwable -> L12
            r1 = 0
            android.view.View r3 = r0.onCreateView(r1, r1, r3)     // Catch: java.lang.Throwable -> L12
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams     // Catch: java.lang.Throwable -> L12
            r1 = -1
            r0.<init>(r1, r1)     // Catch: java.lang.Throwable -> L12
            r2.addView(r3, r0)     // Catch: java.lang.Throwable -> L12
        L12:
            return
    }

    public final void onDestroy() {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate r0 = r1.getMapFragmentDelegate()     // Catch: java.lang.Throwable -> La
            r0.onDestroy()     // Catch: java.lang.Throwable -> La
            r0 = 0
            r1.aMap = r0     // Catch: java.lang.Throwable -> La
        La:
            return
    }

    public final void onLowMemory() {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate r0 = r1.getMapFragmentDelegate()     // Catch: java.lang.Throwable -> L7
            r0.onLowMemory()     // Catch: java.lang.Throwable -> L7
        L7:
            return
    }

    public final void onPause() {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate r0 = r1.getMapFragmentDelegate()     // Catch: java.lang.Throwable -> L7
            r0.onPause()     // Catch: java.lang.Throwable -> L7
        L7:
            return
    }

    public final void onResume() {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate r0 = r1.getMapFragmentDelegate()     // Catch: java.lang.Throwable -> L7
            r0.onResume()     // Catch: java.lang.Throwable -> L7
        L7:
            return
    }

    public final void onSaveInstanceState(android.os.Bundle r2) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate r0 = r1.getMapFragmentDelegate()     // Catch: java.lang.Throwable -> L7
            r0.onSaveInstanceState(r2)     // Catch: java.lang.Throwable -> L7
        L7:
            return
    }

    @Override // android.view.View
    public void setLayerType(int r1, android.graphics.Paint r2) {
            r0 = this;
            return
    }

    @Override // android.view.View
    public void setVisibility(int r2) {
            r1 = this;
            super.setVisibility(r2)
            com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate r0 = r1.getMapFragmentDelegate()
            r0.setVisibility(r2)
            return
    }
}

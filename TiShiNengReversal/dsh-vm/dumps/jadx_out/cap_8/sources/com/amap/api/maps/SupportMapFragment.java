package com.amap.api.maps;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class SupportMapFragment extends androidx.fragment.app.Fragment implements com.amap.api.maps.BaseMapView {
    private com.amap.api.maps.AMap aMap;
    private com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate mapFragmentDelegate;

    public SupportMapFragment() {
            r0 = this;
            r0.<init>()
            return
    }

    private com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate a() {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.getActivity()
            com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate r0 = r1.getMapFragmentDelegate(r0)
            return r0
    }

    public static com.amap.api.maps.SupportMapFragment newInstance() {
            com.amap.api.maps.AMapOptions r0 = new com.amap.api.maps.AMapOptions
            r0.<init>()
            com.amap.api.maps.SupportMapFragment r0 = newInstance(r0)
            return r0
    }

    public static com.amap.api.maps.SupportMapFragment newInstance(com.amap.api.maps.AMapOptions r4) {
            com.amap.api.maps.SupportMapFragment r0 = new com.amap.api.maps.SupportMapFragment
            r0.<init>()
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            android.os.Parcel r2 = android.os.Parcel.obtain()     // Catch: java.lang.Throwable -> L1b
            r3 = 0
            r4.writeToParcel(r2, r3)     // Catch: java.lang.Throwable -> L1b
            java.lang.String r4 = "MAP_OPTIONS"
            byte[] r2 = r2.marshall()     // Catch: java.lang.Throwable -> L1b
            r1.putByteArray(r4, r2)     // Catch: java.lang.Throwable -> L1b
        L1b:
            r0.setArguments(r1)
            return r0
    }

    public com.amap.api.maps.AMap getMap() {
            r2 = this;
            com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate r0 = r2.a()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r0.getMap()     // Catch: java.lang.Throwable -> L1d
            if (r0 != 0) goto Lf
            return r1
        Lf:
            com.amap.api.maps.AMap r1 = r2.aMap
            if (r1 != 0) goto L1a
            com.amap.api.maps.AMap r1 = new com.amap.api.maps.AMap
            r1.<init>(r0)
            r2.aMap = r1
        L1a:
            com.amap.api.maps.AMap r0 = r2.aMap
            return r0
        L1d:
            return r1
    }

    protected com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate getMapFragmentDelegate(android.content.Context r3) {
            r2 = this;
            com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate r0 = r2.mapFragmentDelegate
            if (r0 != 0) goto L11
            if (r0 != 0) goto L11
            com.amap.api.col.3l.d r0 = new com.amap.api.col.3l.d
            r1 = 0
            r0.<init>(r1)
            r2.mapFragmentDelegate = r0
            r0.setContext(r3)
        L11:
            com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate r3 = r2.mapFragmentDelegate
            return r3
    }

    @Override // com.amap.api.maps.BaseMapView
    public void loadWorldVectorMap(boolean r2) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate r0 = r1.a()     // Catch: java.lang.Throwable -> L7
            r0.loadWorldVectorMap(r2)     // Catch: java.lang.Throwable -> L7
        L7:
            return
    }

    public void onAttach(android.app.Activity r1) {
            r0 = this;
            super.onAttach(r1)
            return
    }

    public void onCreate(android.os.Bundle r1) {
            r0 = this;
            super.onCreate(r1)
            return
    }

    public android.view.View onCreateView(android.view.LayoutInflater r2, android.view.ViewGroup r3, android.os.Bundle r4) {
            r1 = this;
            if (r4 != 0) goto L6
            android.os.Bundle r4 = r1.getArguments()     // Catch: java.lang.Throwable -> Lf
        L6:
            com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate r0 = r1.a()     // Catch: java.lang.Throwable -> Lf
            android.view.View r2 = r0.onCreateView(r2, r3, r4)     // Catch: java.lang.Throwable -> Lf
            return r2
        Lf:
            r2 = 0
            return r2
    }

    public void onDestroy() {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate r0 = r1.a()     // Catch: java.lang.Throwable -> La
            r0.onDestroy()     // Catch: java.lang.Throwable -> La
            r0 = 0
            r1.aMap = r0     // Catch: java.lang.Throwable -> La
        La:
            super.onDestroy()
            return
    }

    public void onDestroyView() {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate r0 = r1.a()     // Catch: java.lang.Throwable -> L7
            r0.onDestroyView()     // Catch: java.lang.Throwable -> L7
        L7:
            super.onDestroyView()
            return
    }

    public void onInflate(android.app.Activity r2, android.util.AttributeSet r3, android.os.Bundle r4) {
            r1 = this;
            super.onInflate(r2, r3, r4)
            com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate r3 = r1.getMapFragmentDelegate(r2)     // Catch: java.lang.Throwable -> Lf
            com.amap.api.maps.AMapOptions r0 = new com.amap.api.maps.AMapOptions     // Catch: java.lang.Throwable -> Lf
            r0.<init>()     // Catch: java.lang.Throwable -> Lf
            r3.onInflate(r2, r0, r4)     // Catch: java.lang.Throwable -> Lf
        Lf:
            return
    }

    public void onLowMemory() {
            r1 = this;
            super.onLowMemory()
            com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate r0 = r1.a()     // Catch: java.lang.Throwable -> La
            r0.onLowMemory()     // Catch: java.lang.Throwable -> La
        La:
            return
    }

    public void onPause() {
            r1 = this;
            super.onPause()
            com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate r0 = r1.a()     // Catch: java.lang.Throwable -> La
            r0.onPause()     // Catch: java.lang.Throwable -> La
        La:
            return
    }

    public void onResume() {
            r1 = this;
            super.onResume()
            com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate r0 = r1.a()     // Catch: java.lang.Throwable -> La
            r0.onResume()     // Catch: java.lang.Throwable -> La
        La:
            return
    }

    public void onSaveInstanceState(android.os.Bundle r2) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate r0 = r1.a()     // Catch: java.lang.Throwable -> L7
            r0.onSaveInstanceState(r2)     // Catch: java.lang.Throwable -> L7
        L7:
            super.onSaveInstanceState(r2)
            return
    }

    public void setArguments(android.os.Bundle r1) {
            r0 = this;
            super.setArguments(r1)
            return
    }

    public void setUserVisibleHint(boolean r2) {
            r1 = this;
            super.setUserVisibleHint(r2)
            if (r2 == 0) goto Le
            com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate r2 = r1.a()
            r0 = 0
            r2.setVisibility(r0)
            return
        Le:
            com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate r2 = r1.a()
            r0 = 8
            r2.setVisibility(r0)
            return
    }
}

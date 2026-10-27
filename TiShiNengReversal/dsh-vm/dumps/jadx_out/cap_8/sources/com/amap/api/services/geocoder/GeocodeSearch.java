package com.amap.api.services.geocoder;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class GeocodeSearch {
    public static final java.lang.String AMAP = "autonavi";
    public static final java.lang.String EXTENSIONS_ALL = "all";
    public static final java.lang.String EXTENSIONS_BASE = "base";
    public static final java.lang.String GPS = "gps";
    private com.amap.api.services.interfaces.IGeocodeSearch a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface OnGeocodeSearchListener {
        void onGeocodeSearched(com.amap.api.services.geocoder.GeocodeResult r1, int r2);

        void onRegeocodeSearched(com.amap.api.services.geocoder.RegeocodeResult r1, int r2);
    }

    public GeocodeSearch(android.content.Context r2) throws com.amap.api.services.core.AMapException {
            r1 = this;
            r1.<init>()
            com.amap.api.services.interfaces.IGeocodeSearch r0 = r1.a
            if (r0 != 0) goto L18
            com.amap.api.col.s.n0 r0 = new com.amap.api.col.s.n0     // Catch: java.lang.Exception -> Lf
            r0.<init>(r2)     // Catch: java.lang.Exception -> Lf
            r1.a = r0     // Catch: java.lang.Exception -> Lf
            return
        Lf:
            r2 = move-exception
            boolean r0 = r2 instanceof com.amap.api.services.core.AMapException
            if (r0 != 0) goto L15
            goto L18
        L15:
            com.amap.api.services.core.AMapException r2 = (com.amap.api.services.core.AMapException) r2
            throw r2
        L18:
            return
    }

    public final com.amap.api.services.geocoder.RegeocodeAddress getFromLocation(com.amap.api.services.geocoder.RegeocodeQuery r2) throws com.amap.api.services.core.AMapException {
            r1 = this;
            com.amap.api.services.interfaces.IGeocodeSearch r0 = r1.a
            if (r0 == 0) goto L9
            com.amap.api.services.geocoder.RegeocodeAddress r2 = r0.getFromLocation(r2)
            return r2
        L9:
            r2 = 0
            return r2
    }

    public final void getFromLocationAsyn(com.amap.api.services.geocoder.RegeocodeQuery r2) {
            r1 = this;
            com.amap.api.services.interfaces.IGeocodeSearch r0 = r1.a
            if (r0 == 0) goto L7
            r0.getFromLocationAsyn(r2)
        L7:
            return
    }

    public final java.util.List<com.amap.api.services.geocoder.GeocodeAddress> getFromLocationName(com.amap.api.services.geocoder.GeocodeQuery r2) throws com.amap.api.services.core.AMapException {
            r1 = this;
            com.amap.api.services.interfaces.IGeocodeSearch r0 = r1.a
            if (r0 == 0) goto L9
            java.util.List r2 = r0.getFromLocationName(r2)
            return r2
        L9:
            r2 = 0
            return r2
    }

    public final void getFromLocationNameAsyn(com.amap.api.services.geocoder.GeocodeQuery r2) {
            r1 = this;
            com.amap.api.services.interfaces.IGeocodeSearch r0 = r1.a
            if (r0 == 0) goto L7
            r0.getFromLocationNameAsyn(r2)
        L7:
            return
    }

    public final void setOnGeocodeSearchListener(com.amap.api.services.geocoder.GeocodeSearch.OnGeocodeSearchListener r2) {
            r1 = this;
            com.amap.api.services.interfaces.IGeocodeSearch r0 = r1.a
            if (r0 == 0) goto L7
            r0.setOnGeocodeSearchListener(r2)
        L7:
            return
    }
}

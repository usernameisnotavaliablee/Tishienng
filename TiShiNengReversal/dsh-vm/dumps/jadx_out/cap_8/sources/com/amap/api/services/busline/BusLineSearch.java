package com.amap.api.services.busline;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class BusLineSearch {
    public static final java.lang.String EXTENSIONS_ALL = "all";
    public static final java.lang.String EXTENSIONS_BASE = "base";
    private com.amap.api.services.interfaces.IBusLineSearch a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface OnBusLineSearchListener {
        void onBusLineSearched(com.amap.api.services.busline.BusLineResult r1, int r2);
    }

    public BusLineSearch(android.content.Context r2, com.amap.api.services.busline.BusLineQuery r3) throws com.amap.api.services.core.AMapException {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.a = r0
            com.amap.api.col.s.i0 r0 = new com.amap.api.col.s.i0     // Catch: java.lang.Exception -> Le
            r0.<init>(r2, r3)     // Catch: java.lang.Exception -> Le
            r1.a = r0     // Catch: java.lang.Exception -> Le
            return
        Le:
            r2 = move-exception
            boolean r3 = r2 instanceof com.amap.api.services.core.AMapException
            if (r3 != 0) goto L14
            return
        L14:
            com.amap.api.services.core.AMapException r2 = (com.amap.api.services.core.AMapException) r2
            throw r2
    }

    public com.amap.api.services.busline.BusLineQuery getQuery() {
            r1 = this;
            com.amap.api.services.interfaces.IBusLineSearch r0 = r1.a
            if (r0 == 0) goto L9
            com.amap.api.services.busline.BusLineQuery r0 = r0.getQuery()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public com.amap.api.services.busline.BusLineResult searchBusLine() throws com.amap.api.services.core.AMapException {
            r1 = this;
            com.amap.api.services.interfaces.IBusLineSearch r0 = r1.a
            if (r0 == 0) goto L9
            com.amap.api.services.busline.BusLineResult r0 = r0.searchBusLine()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public void searchBusLineAsyn() {
            r1 = this;
            com.amap.api.services.interfaces.IBusLineSearch r0 = r1.a
            if (r0 == 0) goto L7
            r0.searchBusLineAsyn()
        L7:
            return
    }

    public void setOnBusLineSearchListener(com.amap.api.services.busline.BusLineSearch.OnBusLineSearchListener r2) {
            r1 = this;
            com.amap.api.services.interfaces.IBusLineSearch r0 = r1.a
            if (r0 == 0) goto L7
            r0.setOnBusLineSearchListener(r2)
        L7:
            return
    }

    public void setQuery(com.amap.api.services.busline.BusLineQuery r2) {
            r1 = this;
            com.amap.api.services.interfaces.IBusLineSearch r0 = r1.a
            if (r0 == 0) goto L7
            r0.setQuery(r2)
        L7:
            return
    }
}

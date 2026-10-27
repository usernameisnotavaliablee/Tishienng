package com.amap.api.services.busline;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class BusStationSearch {
    private com.amap.api.services.interfaces.IBusStationSearch a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface OnBusStationSearchListener {
        void onBusStationSearched(com.amap.api.services.busline.BusStationResult r1, int r2);
    }

    public BusStationSearch(android.content.Context r2, com.amap.api.services.busline.BusStationQuery r3) throws com.amap.api.services.core.AMapException {
            r1 = this;
            r1.<init>()
            com.amap.api.services.interfaces.IBusStationSearch r0 = r1.a
            if (r0 != 0) goto L18
            com.amap.api.col.s.j0 r0 = new com.amap.api.col.s.j0     // Catch: java.lang.Exception -> Lf
            r0.<init>(r2, r3)     // Catch: java.lang.Exception -> Lf
            r1.a = r0     // Catch: java.lang.Exception -> Lf
            return
        Lf:
            r2 = move-exception
            boolean r3 = r2 instanceof com.amap.api.services.core.AMapException
            if (r3 != 0) goto L15
            goto L18
        L15:
            com.amap.api.services.core.AMapException r2 = (com.amap.api.services.core.AMapException) r2
            throw r2
        L18:
            return
    }

    public com.amap.api.services.busline.BusStationQuery getQuery() {
            r1 = this;
            com.amap.api.services.interfaces.IBusStationSearch r0 = r1.a
            if (r0 == 0) goto L9
            com.amap.api.services.busline.BusStationQuery r0 = r0.getQuery()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public com.amap.api.services.busline.BusStationResult searchBusStation() throws com.amap.api.services.core.AMapException {
            r1 = this;
            com.amap.api.services.interfaces.IBusStationSearch r0 = r1.a
            if (r0 == 0) goto L9
            com.amap.api.services.busline.BusStationResult r0 = r0.searchBusStation()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public void searchBusStationAsyn() {
            r1 = this;
            com.amap.api.services.interfaces.IBusStationSearch r0 = r1.a
            if (r0 == 0) goto L7
            r0.searchBusStationAsyn()
        L7:
            return
    }

    public void setOnBusStationSearchListener(com.amap.api.services.busline.BusStationSearch.OnBusStationSearchListener r2) {
            r1 = this;
            com.amap.api.services.interfaces.IBusStationSearch r0 = r1.a
            if (r0 == 0) goto L7
            r0.setOnBusStationSearchListener(r2)
        L7:
            return
    }

    public void setQuery(com.amap.api.services.busline.BusStationQuery r2) {
            r1 = this;
            com.amap.api.services.interfaces.IBusStationSearch r0 = r1.a
            if (r0 == 0) goto L7
            r0.setQuery(r2)
        L7:
            return
    }
}

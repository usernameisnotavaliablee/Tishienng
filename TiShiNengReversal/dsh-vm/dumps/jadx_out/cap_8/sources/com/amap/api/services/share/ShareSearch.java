package com.amap.api.services.share;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class ShareSearch {
    public static final int BusComfortable = 4;
    public static final int BusDefault = 0;
    public static final int BusLeaseChange = 2;
    public static final int BusLeaseWalk = 3;
    public static final int BusNoSubway = 5;
    public static final int BusSaveMoney = 1;
    public static final int DrivingAvoidCongestion = 4;
    public static final int DrivingDefault = 0;
    public static final int DrivingNoHighWay = 3;
    public static final int DrivingNoHighWayAvoidCongestion = 6;
    public static final int DrivingNoHighWaySaveMoney = 5;
    public static final int DrivingNoHighWaySaveMoneyAvoidCongestion = 8;
    public static final int DrivingSaveMoney = 1;
    public static final int DrivingSaveMoneyAvoidCongestion = 7;
    public static final int DrivingShortDistance = 2;
    public static final int NaviAvoidCongestion = 4;
    public static final int NaviDefault = 0;
    public static final int NaviNoHighWay = 3;
    public static final int NaviNoHighWayAvoidCongestion = 6;
    public static final int NaviNoHighWaySaveMoney = 5;
    public static final int NaviNoHighWaySaveMoneyAvoidCongestion = 8;
    public static final int NaviSaveMoney = 1;
    public static final int NaviSaveMoneyAvoidCongestion = 7;
    public static final int NaviShortDistance = 2;
    private com.amap.api.services.interfaces.IShareSearch a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface OnShareSearchListener {
        void onBusRouteShareUrlSearched(java.lang.String r1, int r2);

        void onDrivingRouteShareUrlSearched(java.lang.String r1, int r2);

        void onLocationShareUrlSearched(java.lang.String r1, int r2);

        void onNaviShareUrlSearched(java.lang.String r1, int r2);

        void onPoiShareUrlSearched(java.lang.String r1, int r2);

        void onWalkRouteShareUrlSearched(java.lang.String r1, int r2);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class ShareBusRouteQuery {
        private com.amap.api.services.share.ShareSearch.ShareFromAndTo a;

        /* renamed from: b, reason: collision with root package name */
        private int f5617b;

        public ShareBusRouteQuery(com.amap.api.services.share.ShareSearch.ShareFromAndTo r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.f5617b = r2
                return
        }

        public int getBusMode() {
                r1 = this;
                int r0 = r1.f5617b
                return r0
        }

        public com.amap.api.services.share.ShareSearch.ShareFromAndTo getShareFromAndTo() {
                r1 = this;
                com.amap.api.services.share.ShareSearch$ShareFromAndTo r0 = r1.a
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class ShareDrivingRouteQuery {
        private com.amap.api.services.share.ShareSearch.ShareFromAndTo a;

        /* renamed from: b, reason: collision with root package name */
        private int f5618b;

        public ShareDrivingRouteQuery(com.amap.api.services.share.ShareSearch.ShareFromAndTo r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.f5618b = r2
                return
        }

        public int getDrivingMode() {
                r1 = this;
                int r0 = r1.f5618b
                return r0
        }

        public com.amap.api.services.share.ShareSearch.ShareFromAndTo getShareFromAndTo() {
                r1 = this;
                com.amap.api.services.share.ShareSearch$ShareFromAndTo r0 = r1.a
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class ShareFromAndTo {
        private com.amap.api.services.core.LatLonPoint a;

        /* renamed from: b, reason: collision with root package name */
        private com.amap.api.services.core.LatLonPoint f5619b;

        /* renamed from: c, reason: collision with root package name */
        private java.lang.String f5620c;

        /* renamed from: d, reason: collision with root package name */
        private java.lang.String f5621d;

        public ShareFromAndTo(com.amap.api.services.core.LatLonPoint r2, com.amap.api.services.core.LatLonPoint r3) {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "起点"
                r1.f5620c = r0
                java.lang.String r0 = "终点"
                r1.f5621d = r0
                r1.a = r2
                r1.f5619b = r3
                return
        }

        public com.amap.api.services.core.LatLonPoint getFrom() {
                r1 = this;
                com.amap.api.services.core.LatLonPoint r0 = r1.a
                return r0
        }

        public java.lang.String getFromName() {
                r1 = this;
                java.lang.String r0 = r1.f5620c
                return r0
        }

        public com.amap.api.services.core.LatLonPoint getTo() {
                r1 = this;
                com.amap.api.services.core.LatLonPoint r0 = r1.f5619b
                return r0
        }

        public java.lang.String getToName() {
                r1 = this;
                java.lang.String r0 = r1.f5621d
                return r0
        }

        public void setFromName(java.lang.String r1) {
                r0 = this;
                r0.f5620c = r1
                return
        }

        public void setToName(java.lang.String r1) {
                r0 = this;
                r0.f5621d = r1
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class ShareNaviQuery {
        private com.amap.api.services.share.ShareSearch.ShareFromAndTo a;

        /* renamed from: b, reason: collision with root package name */
        private int f5622b;

        public ShareNaviQuery(com.amap.api.services.share.ShareSearch.ShareFromAndTo r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.f5622b = r2
                return
        }

        public com.amap.api.services.share.ShareSearch.ShareFromAndTo getFromAndTo() {
                r1 = this;
                com.amap.api.services.share.ShareSearch$ShareFromAndTo r0 = r1.a
                return r0
        }

        public int getNaviMode() {
                r1 = this;
                int r0 = r1.f5622b
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class ShareWalkRouteQuery {
        private com.amap.api.services.share.ShareSearch.ShareFromAndTo a;

        /* renamed from: b, reason: collision with root package name */
        private int f5623b;

        public ShareWalkRouteQuery(com.amap.api.services.share.ShareSearch.ShareFromAndTo r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.f5623b = r2
                return
        }

        public com.amap.api.services.share.ShareSearch.ShareFromAndTo getShareFromAndTo() {
                r1 = this;
                com.amap.api.services.share.ShareSearch$ShareFromAndTo r0 = r1.a
                return r0
        }

        public int getWalkMode() {
                r1 = this;
                int r0 = r1.f5623b
                return r0
        }
    }

    public ShareSearch(android.content.Context r2) throws com.amap.api.services.core.AMapException {
            r1 = this;
            r1.<init>()
            com.amap.api.services.interfaces.IShareSearch r0 = r1.a
            if (r0 != 0) goto L18
            com.amap.api.col.s.v0 r0 = new com.amap.api.col.s.v0     // Catch: java.lang.Exception -> Lf
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

    public java.lang.String searchBusRouteShareUrl(com.amap.api.services.share.ShareSearch.ShareBusRouteQuery r2) throws com.amap.api.services.core.AMapException {
            r1 = this;
            com.amap.api.services.interfaces.IShareSearch r0 = r1.a
            if (r0 == 0) goto L7
            r0.searchBusRouteShareUrl(r2)
        L7:
            r2 = 0
            return r2
    }

    public void searchBusRouteShareUrlAsyn(com.amap.api.services.share.ShareSearch.ShareBusRouteQuery r2) {
            r1 = this;
            com.amap.api.services.interfaces.IShareSearch r0 = r1.a
            if (r0 == 0) goto L7
            r0.searchBusRouteShareUrlAsyn(r2)
        L7:
            return
    }

    public java.lang.String searchDrivingRouteShareUrl(com.amap.api.services.share.ShareSearch.ShareDrivingRouteQuery r2) throws com.amap.api.services.core.AMapException {
            r1 = this;
            com.amap.api.services.interfaces.IShareSearch r0 = r1.a
            if (r0 == 0) goto L7
            r0.searchDrivingRouteShareUrl(r2)
        L7:
            r2 = 0
            return r2
    }

    public void searchDrivingRouteShareUrlAsyn(com.amap.api.services.share.ShareSearch.ShareDrivingRouteQuery r2) {
            r1 = this;
            com.amap.api.services.interfaces.IShareSearch r0 = r1.a
            if (r0 == 0) goto L7
            r0.searchDrivingRouteShareUrlAsyn(r2)
        L7:
            return
    }

    public java.lang.String searchLocationShareUrl(com.amap.api.services.core.LatLonSharePoint r2) throws com.amap.api.services.core.AMapException {
            r1 = this;
            com.amap.api.services.interfaces.IShareSearch r0 = r1.a
            if (r0 == 0) goto L7
            r0.searchLocationShareUrl(r2)
        L7:
            r2 = 0
            return r2
    }

    public void searchLocationShareUrlAsyn(com.amap.api.services.core.LatLonSharePoint r2) {
            r1 = this;
            com.amap.api.services.interfaces.IShareSearch r0 = r1.a
            if (r0 == 0) goto L7
            r0.searchLocationShareUrlAsyn(r2)
        L7:
            return
    }

    public java.lang.String searchNaviShareUrl(com.amap.api.services.share.ShareSearch.ShareNaviQuery r2) throws com.amap.api.services.core.AMapException {
            r1 = this;
            com.amap.api.services.interfaces.IShareSearch r0 = r1.a
            if (r0 == 0) goto L7
            r0.searchNaviShareUrl(r2)
        L7:
            r2 = 0
            return r2
    }

    public void searchNaviShareUrlAsyn(com.amap.api.services.share.ShareSearch.ShareNaviQuery r2) {
            r1 = this;
            com.amap.api.services.interfaces.IShareSearch r0 = r1.a
            if (r0 == 0) goto L7
            r0.searchNaviShareUrlAsyn(r2)
        L7:
            return
    }

    public java.lang.String searchPoiShareUrl(com.amap.api.services.core.PoiItem r2) throws com.amap.api.services.core.AMapException {
            r1 = this;
            com.amap.api.services.interfaces.IShareSearch r0 = r1.a
            if (r0 == 0) goto L7
            r0.searchPoiShareUrl(r2)
        L7:
            r2 = 0
            return r2
    }

    public void searchPoiShareUrlAsyn(com.amap.api.services.core.PoiItem r2) {
            r1 = this;
            com.amap.api.services.interfaces.IShareSearch r0 = r1.a
            if (r0 == 0) goto L7
            r0.searchPoiShareUrlAsyn(r2)
        L7:
            return
    }

    public java.lang.String searchWalkRouteShareUrl(com.amap.api.services.share.ShareSearch.ShareWalkRouteQuery r2) throws com.amap.api.services.core.AMapException {
            r1 = this;
            com.amap.api.services.interfaces.IShareSearch r0 = r1.a
            if (r0 == 0) goto L7
            r0.searchWalkRouteShareUrl(r2)
        L7:
            r2 = 0
            return r2
    }

    public void searchWalkRouteShareUrlAsyn(com.amap.api.services.share.ShareSearch.ShareWalkRouteQuery r2) {
            r1 = this;
            com.amap.api.services.interfaces.IShareSearch r0 = r1.a
            if (r0 == 0) goto L7
            r0.searchWalkRouteShareUrlAsyn(r2)
        L7:
            return
    }

    public void setOnShareSearchListener(com.amap.api.services.share.ShareSearch.OnShareSearchListener r2) {
            r1 = this;
            com.amap.api.services.interfaces.IShareSearch r0 = r1.a
            if (r0 == 0) goto L7
            r0.setOnShareSearchListener(r2)
        L7:
            return
    }
}

package com.amap.api.services.routepoisearch;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class RoutePOISearch {
    public static final int DrivingAvoidCongestion = 4;
    public static final int DrivingDefault = 0;
    public static final int DrivingNoExpressways = 3;
    public static final int DrivingNoHighAvoidCongestionSaveMoney = 9;
    public static final int DrivingNoHighWay = 6;
    public static final int DrivingNoHighWaySaveMoney = 7;
    public static final int DrivingSaveMoney = 1;
    public static final int DrivingSaveMoneyAvoidCongestion = 8;
    public static final int DrivingShortDistance = 2;
    private com.amap.api.services.interfaces.IRoutePOISearch a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface OnRoutePOISearchListener {
        void onRoutePoiSearched(com.amap.api.services.routepoisearch.RoutePOISearchResult r1, int r2);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum RoutePOISearchType extends java.lang.Enum<com.amap.api.services.routepoisearch.RoutePOISearch.RoutePOISearchType> {
        public static final com.amap.api.services.routepoisearch.RoutePOISearch.RoutePOISearchType TypeATM = null;
        public static final com.amap.api.services.routepoisearch.RoutePOISearch.RoutePOISearchType TypeChargeStation = null;
        public static final com.amap.api.services.routepoisearch.RoutePOISearch.RoutePOISearchType TypeFillingStation = null;
        public static final com.amap.api.services.routepoisearch.RoutePOISearch.RoutePOISearchType TypeFood = null;
        public static final com.amap.api.services.routepoisearch.RoutePOISearch.RoutePOISearchType TypeGasStation = null;
        public static final com.amap.api.services.routepoisearch.RoutePOISearch.RoutePOISearchType TypeHotel = null;
        public static final com.amap.api.services.routepoisearch.RoutePOISearch.RoutePOISearchType TypeMaintenanceStation = null;
        public static final com.amap.api.services.routepoisearch.RoutePOISearch.RoutePOISearchType TypeServiceArea = null;
        public static final com.amap.api.services.routepoisearch.RoutePOISearch.RoutePOISearchType TypeToilet = null;
        private static final /* synthetic */ com.amap.api.services.routepoisearch.RoutePOISearch.RoutePOISearchType[] a = null;

        static {
                com.amap.api.services.routepoisearch.RoutePOISearch$RoutePOISearchType r0 = new com.amap.api.services.routepoisearch.RoutePOISearch$RoutePOISearchType
                java.lang.String r1 = "TypeGasStation"
                r2 = 0
                r0.<init>(r1, r2)
                com.amap.api.services.routepoisearch.RoutePOISearch.RoutePOISearchType.TypeGasStation = r0
                com.amap.api.services.routepoisearch.RoutePOISearch$RoutePOISearchType r1 = new com.amap.api.services.routepoisearch.RoutePOISearch$RoutePOISearchType
                java.lang.String r3 = "TypeMaintenanceStation"
                r4 = 1
                r1.<init>(r3, r4)
                com.amap.api.services.routepoisearch.RoutePOISearch.RoutePOISearchType.TypeMaintenanceStation = r1
                com.amap.api.services.routepoisearch.RoutePOISearch$RoutePOISearchType r3 = new com.amap.api.services.routepoisearch.RoutePOISearch$RoutePOISearchType
                java.lang.String r5 = "TypeATM"
                r6 = 2
                r3.<init>(r5, r6)
                com.amap.api.services.routepoisearch.RoutePOISearch.RoutePOISearchType.TypeATM = r3
                com.amap.api.services.routepoisearch.RoutePOISearch$RoutePOISearchType r5 = new com.amap.api.services.routepoisearch.RoutePOISearch$RoutePOISearchType
                java.lang.String r7 = "TypeToilet"
                r8 = 3
                r5.<init>(r7, r8)
                com.amap.api.services.routepoisearch.RoutePOISearch.RoutePOISearchType.TypeToilet = r5
                com.amap.api.services.routepoisearch.RoutePOISearch$RoutePOISearchType r7 = new com.amap.api.services.routepoisearch.RoutePOISearch$RoutePOISearchType
                java.lang.String r9 = "TypeFillingStation"
                r10 = 4
                r7.<init>(r9, r10)
                com.amap.api.services.routepoisearch.RoutePOISearch.RoutePOISearchType.TypeFillingStation = r7
                com.amap.api.services.routepoisearch.RoutePOISearch$RoutePOISearchType r9 = new com.amap.api.services.routepoisearch.RoutePOISearch$RoutePOISearchType
                java.lang.String r11 = "TypeServiceArea"
                r12 = 5
                r9.<init>(r11, r12)
                com.amap.api.services.routepoisearch.RoutePOISearch.RoutePOISearchType.TypeServiceArea = r9
                com.amap.api.services.routepoisearch.RoutePOISearch$RoutePOISearchType r11 = new com.amap.api.services.routepoisearch.RoutePOISearch$RoutePOISearchType
                java.lang.String r13 = "TypeChargeStation"
                r14 = 6
                r11.<init>(r13, r14)
                com.amap.api.services.routepoisearch.RoutePOISearch.RoutePOISearchType.TypeChargeStation = r11
                com.amap.api.services.routepoisearch.RoutePOISearch$RoutePOISearchType r13 = new com.amap.api.services.routepoisearch.RoutePOISearch$RoutePOISearchType
                java.lang.String r15 = "TypeFood"
                r16 = 0
                r2 = 7
                r13.<init>(r15, r2)
                com.amap.api.services.routepoisearch.RoutePOISearch.RoutePOISearchType.TypeFood = r13
                com.amap.api.services.routepoisearch.RoutePOISearch$RoutePOISearchType r15 = new com.amap.api.services.routepoisearch.RoutePOISearch$RoutePOISearchType
                r17 = 7
                java.lang.String r2 = "TypeHotel"
                r18 = 1
                r4 = 8
                r15.<init>(r2, r4)
                com.amap.api.services.routepoisearch.RoutePOISearch.RoutePOISearchType.TypeHotel = r15
                r2 = 9
                com.amap.api.services.routepoisearch.RoutePOISearch$RoutePOISearchType[] r2 = new com.amap.api.services.routepoisearch.RoutePOISearch.RoutePOISearchType[r2]
                r2[r16] = r0
                r2[r18] = r1
                r2[r6] = r3
                r2[r8] = r5
                r2[r10] = r7
                r2[r12] = r9
                r2[r14] = r11
                r2[r17] = r13
                r2[r4] = r15
                com.amap.api.services.routepoisearch.RoutePOISearch.RoutePOISearchType.a = r2
                return
        }

        RoutePOISearchType(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.amap.api.services.routepoisearch.RoutePOISearch.RoutePOISearchType valueOf(java.lang.String r1) {
                java.lang.Class<com.amap.api.services.routepoisearch.RoutePOISearch$RoutePOISearchType> r0 = com.amap.api.services.routepoisearch.RoutePOISearch.RoutePOISearchType.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.amap.api.services.routepoisearch.RoutePOISearch$RoutePOISearchType r1 = (com.amap.api.services.routepoisearch.RoutePOISearch.RoutePOISearchType) r1
                return r1
        }

        public static com.amap.api.services.routepoisearch.RoutePOISearch.RoutePOISearchType[] values() {
                com.amap.api.services.routepoisearch.RoutePOISearch$RoutePOISearchType[] r0 = com.amap.api.services.routepoisearch.RoutePOISearch.RoutePOISearchType.a
                java.lang.Object r0 = r0.clone()
                com.amap.api.services.routepoisearch.RoutePOISearch$RoutePOISearchType[] r0 = (com.amap.api.services.routepoisearch.RoutePOISearch.RoutePOISearchType[]) r0
                return r0
        }
    }

    public RoutePOISearch(android.content.Context r2, com.amap.api.services.routepoisearch.RoutePOISearchQuery r3) throws com.amap.api.services.core.AMapException {
            r1 = this;
            r1.<init>()
            com.amap.api.services.interfaces.IRoutePOISearch r0 = r1.a
            if (r0 != 0) goto L18
            com.amap.api.col.s.s0 r0 = new com.amap.api.col.s.s0     // Catch: java.lang.Exception -> Lf
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

    public com.amap.api.services.routepoisearch.RoutePOISearchResult searchRoutePOI() throws com.amap.api.services.core.AMapException {
            r1 = this;
            com.amap.api.services.interfaces.IRoutePOISearch r0 = r1.a
            if (r0 == 0) goto L9
            com.amap.api.services.routepoisearch.RoutePOISearchResult r0 = r0.searchRoutePOI()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public void searchRoutePOIAsyn() {
            r1 = this;
            com.amap.api.services.interfaces.IRoutePOISearch r0 = r1.a
            if (r0 == 0) goto L7
            r0.searchRoutePOIAsyn()
        L7:
            return
    }

    public void setPoiSearchListener(com.amap.api.services.routepoisearch.RoutePOISearch.OnRoutePOISearchListener r2) {
            r1 = this;
            com.amap.api.services.interfaces.IRoutePOISearch r0 = r1.a
            if (r0 == 0) goto L7
            r0.setRoutePOISearchListener(r2)
        L7:
            return
    }

    public void setQuery(com.amap.api.services.routepoisearch.RoutePOISearchQuery r2) {
            r1 = this;
            com.amap.api.services.interfaces.IRoutePOISearch r0 = r1.a
            if (r0 == 0) goto L7
            r0.setQuery(r2)
        L7:
            return
    }
}

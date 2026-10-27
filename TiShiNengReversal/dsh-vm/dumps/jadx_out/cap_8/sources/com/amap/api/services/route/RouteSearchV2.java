package com.amap.api.services.route;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class RouteSearchV2 {
    private com.amap.api.services.interfaces.IRouteSearchV2 a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class AlternativeRoute {
        public static final int ALTERNATIVE_ROUTE_ONE = 1;
        public static final int ALTERNATIVE_ROUTE_THREE = 3;
        public static final int ALTERNATIVE_ROUTE_TWO = 2;
        final /* synthetic */ com.amap.api.services.route.RouteSearchV2 a;

        public AlternativeRoute(com.amap.api.services.route.RouteSearchV2 r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class BusMode {
        public static final int BUS_COMFORTABLE = 4;
        public static final int BUS_DEFAULT = 0;
        public static final int BUS_LEASE_CHANGE = 2;
        public static final int BUS_LEASE_WALK = 3;
        public static final int BUS_NO_SUBWAY = 5;
        public static final int BUS_SAVE_MONEY = 1;
        public static final int BUS_SUBWAY = 6;
        public static final int BUS_SUBWAY_FIRST = 7;
        public static final int BUS_WASTE_LESS = 8;

        public BusMode() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class BusRouteQuery implements android.os.Parcelable, java.lang.Cloneable {
        public static final android.os.Parcelable.Creator<com.amap.api.services.route.RouteSearchV2.BusRouteQuery> CREATOR = null;
        private com.amap.api.services.route.RouteSearchV2.FromAndTo a;

        /* renamed from: b, reason: collision with root package name */
        private int f5502b;

        /* renamed from: c, reason: collision with root package name */
        private java.lang.String f5503c;

        /* renamed from: d, reason: collision with root package name */
        private java.lang.String f5504d;

        /* renamed from: e, reason: collision with root package name */
        private java.lang.String f5505e;

        /* renamed from: f, reason: collision with root package name */
        private java.lang.String f5506f;

        /* renamed from: g, reason: collision with root package name */
        private int f5507g;

        /* renamed from: h, reason: collision with root package name */
        private java.lang.String f5508h;

        /* renamed from: i, reason: collision with root package name */
        private java.lang.String f5509i;

        /* renamed from: j, reason: collision with root package name */
        private java.lang.String f5510j;

        /* renamed from: k, reason: collision with root package name */
        private java.lang.String f5511k;
        private int l;
        private int m;
        private int n;
        private int o;


        static {
                com.amap.api.services.route.RouteSearchV2$BusRouteQuery$1 r0 = new com.amap.api.services.route.RouteSearchV2$BusRouteQuery$1
                r0.<init>()
                com.amap.api.services.route.RouteSearchV2.BusRouteQuery.CREATOR = r0
                return
        }

        public BusRouteQuery() {
                r2 = this;
                r2.<init>()
                r0 = 0
                r2.f5502b = r0
                r2.f5507g = r0
                r1 = 5
                r2.l = r1
                r2.m = r0
                r0 = 4
                r2.n = r0
                r0 = 1
                r2.o = r0
                return
        }

        public BusRouteQuery(android.os.Parcel r3) {
                r2 = this;
                r2.<init>()
                r0 = 0
                r2.f5502b = r0
                r2.f5507g = r0
                r1 = 5
                r2.l = r1
                r2.m = r0
                r0 = 4
                r2.n = r0
                r0 = 1
                r2.o = r0
                java.lang.Class<com.amap.api.services.route.RouteSearchV2$FromAndTo> r0 = com.amap.api.services.route.RouteSearchV2.FromAndTo.class
                java.lang.ClassLoader r0 = r0.getClassLoader()
                android.os.Parcelable r0 = r3.readParcelable(r0)
                com.amap.api.services.route.RouteSearchV2$FromAndTo r0 = (com.amap.api.services.route.RouteSearchV2.FromAndTo) r0
                r2.a = r0
                int r0 = r3.readInt()
                r2.f5502b = r0
                java.lang.String r0 = r3.readString()
                r2.f5503c = r0
                int r0 = r3.readInt()
                r2.f5507g = r0
                java.lang.String r0 = r3.readString()
                r2.f5504d = r0
                int r0 = r3.readInt()
                r2.o = r0
                java.lang.String r0 = r3.readString()
                r2.f5508h = r0
                java.lang.String r0 = r3.readString()
                r2.f5509i = r0
                java.lang.String r0 = r3.readString()
                r2.f5505e = r0
                java.lang.String r0 = r3.readString()
                r2.f5506f = r0
                int r0 = r3.readInt()
                r2.n = r0
                int r0 = r3.readInt()
                r2.m = r0
                int r0 = r3.readInt()
                r2.l = r0
                java.lang.String r0 = r3.readString()
                r2.f5510j = r0
                java.lang.String r3 = r3.readString()
                r2.f5511k = r3
                return
        }

        public BusRouteQuery(com.amap.api.services.route.RouteSearchV2.FromAndTo r2, int r3, java.lang.String r4, int r5) {
                r1 = this;
                r1.<init>()
                r0 = 5
                r1.l = r0
                r0 = 0
                r1.m = r0
                r0 = 4
                r1.n = r0
                r0 = 1
                r1.o = r0
                r1.a = r2
                r1.f5502b = r3
                r1.f5503c = r4
                r1.f5507g = r5
                return
        }

        public com.amap.api.services.route.RouteSearchV2.BusRouteQuery clone() {
                r5 = this;
                super.clone()     // Catch: java.lang.CloneNotSupportedException -> L4
                goto Lc
            L4:
                r0 = move-exception
                java.lang.String r1 = "RouteSearchV2"
                java.lang.String r2 = "BusRouteQueryclone"
                com.amap.api.col.s.j4.i(r0, r1, r2)
            Lc:
                com.amap.api.services.route.RouteSearchV2$BusRouteQuery r0 = new com.amap.api.services.route.RouteSearchV2$BusRouteQuery
                com.amap.api.services.route.RouteSearchV2$FromAndTo r1 = r5.a
                int r2 = r5.f5502b
                java.lang.String r3 = r5.f5503c
                int r4 = r5.f5507g
                r0.<init>(r1, r2, r3, r4)
                java.lang.String r1 = r5.f5504d
                r0.setCityd(r1)
                int r1 = r5.o
                r0.setShowFields(r1)
                java.lang.String r1 = r5.f5505e
                r0.setDate(r1)
                java.lang.String r1 = r5.f5506f
                r0.setTime(r1)
                java.lang.String r1 = r5.f5510j
                r0.setAd1(r1)
                java.lang.String r1 = r5.f5511k
                r0.setAd2(r1)
                java.lang.String r1 = r5.f5508h
                r0.setOriginPoiId(r1)
                java.lang.String r1 = r5.f5509i
                r0.setDestinationPoiId(r1)
                int r1 = r5.n
                r0.setMaxTrans(r1)
                int r1 = r5.m
                r0.setMultiExport(r1)
                int r1 = r5.l
                r0.setAlternativeRoute(r1)
                return r0
        }

        /* renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ java.lang.Object m36clone() throws java.lang.CloneNotSupportedException {
                r1 = this;
                com.amap.api.services.route.RouteSearchV2$BusRouteQuery r0 = r1.clone()
                return r0
        }

        @Override // android.os.Parcelable
        public int describeContents() {
                r1 = this;
                r0 = 0
                return r0
        }

        public boolean equals(java.lang.Object r4) {
                r3 = this;
                if (r3 != r4) goto L4
                r4 = 1
                return r4
            L4:
                r0 = 0
                if (r4 == 0) goto La0
                java.lang.Class r1 = r3.getClass()
                java.lang.Class r2 = r4.getClass()
                if (r1 == r2) goto L13
                goto La0
            L13:
                com.amap.api.services.route.RouteSearchV2$BusRouteQuery r4 = (com.amap.api.services.route.RouteSearchV2.BusRouteQuery) r4
                int r1 = r3.f5502b
                int r2 = r4.f5502b
                if (r1 == r2) goto L1c
                return r0
            L1c:
                int r1 = r3.f5507g
                int r2 = r4.f5507g
                if (r1 == r2) goto L23
                return r0
            L23:
                java.lang.String r1 = r3.f5508h
                java.lang.String r2 = r4.f5508h
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L2e
                return r0
            L2e:
                java.lang.String r1 = r3.f5509i
                java.lang.String r2 = r4.f5509i
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L39
                return r0
            L39:
                int r1 = r3.l
                int r2 = r4.l
                if (r1 == r2) goto L40
                return r0
            L40:
                int r1 = r3.m
                int r2 = r4.m
                if (r1 == r2) goto L47
                return r0
            L47:
                int r1 = r3.n
                int r2 = r4.n
                if (r1 == r2) goto L4e
                return r0
            L4e:
                int r1 = r3.o
                int r2 = r4.o
                if (r1 == r2) goto L55
                return r0
            L55:
                com.amap.api.services.route.RouteSearchV2$FromAndTo r1 = r3.a
                com.amap.api.services.route.RouteSearchV2$FromAndTo r2 = r4.a
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L60
                return r0
            L60:
                java.lang.String r1 = r3.f5503c
                java.lang.String r2 = r4.f5503c
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L6b
                return r0
            L6b:
                java.lang.String r1 = r3.f5504d
                java.lang.String r2 = r4.f5504d
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L76
                return r0
            L76:
                java.lang.String r1 = r3.f5505e
                java.lang.String r2 = r4.f5505e
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L81
                return r0
            L81:
                java.lang.String r1 = r3.f5506f
                java.lang.String r2 = r4.f5506f
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L8c
                return r0
            L8c:
                java.lang.String r1 = r3.f5510j
                java.lang.String r2 = r4.f5510j
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L97
                return r0
            L97:
                java.lang.String r0 = r3.f5511k
                java.lang.String r4 = r4.f5511k
                boolean r4 = r0.equals(r4)
                return r4
            La0:
                return r0
        }

        public java.lang.String getAd1() {
                r1 = this;
                java.lang.String r0 = r1.f5510j
                return r0
        }

        public java.lang.String getAd2() {
                r1 = this;
                java.lang.String r0 = r1.f5511k
                return r0
        }

        public int getAlternativeRoute() {
                r1 = this;
                int r0 = r1.l
                return r0
        }

        public java.lang.String getCity() {
                r1 = this;
                java.lang.String r0 = r1.f5503c
                return r0
        }

        public java.lang.String getCityd() {
                r1 = this;
                java.lang.String r0 = r1.f5504d
                return r0
        }

        public java.lang.String getDate() {
                r1 = this;
                java.lang.String r0 = r1.f5505e
                return r0
        }

        public java.lang.String getDestinationPoiId() {
                r1 = this;
                java.lang.String r0 = r1.f5509i
                return r0
        }

        public com.amap.api.services.route.RouteSearchV2.FromAndTo getFromAndTo() {
                r1 = this;
                com.amap.api.services.route.RouteSearchV2$FromAndTo r0 = r1.a
                return r0
        }

        public int getMaxTrans() {
                r1 = this;
                int r0 = r1.n
                return r0
        }

        public int getMode() {
                r1 = this;
                int r0 = r1.f5502b
                return r0
        }

        public int getMultiExport() {
                r1 = this;
                int r0 = r1.m
                return r0
        }

        public int getNightFlag() {
                r1 = this;
                int r0 = r1.f5507g
                return r0
        }

        public java.lang.String getOriginPoiId() {
                r1 = this;
                java.lang.String r0 = r1.f5508h
                return r0
        }

        public int getShowFields() {
                r1 = this;
                int r0 = r1.o
                return r0
        }

        public java.lang.String getTime() {
                r1 = this;
                java.lang.String r0 = r1.f5506f
                return r0
        }

        public int hashCode() {
                r2 = this;
                com.amap.api.services.route.RouteSearchV2$FromAndTo r0 = r2.a
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                int r1 = r2.f5502b
                int r0 = r0 + r1
                int r0 = r0 * 31
                java.lang.String r1 = r2.f5503c
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                java.lang.String r1 = r2.f5504d
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                java.lang.String r1 = r2.f5505e
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                java.lang.String r1 = r2.f5506f
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                int r1 = r2.f5507g
                int r0 = r0 + r1
                int r0 = r0 * 31
                java.lang.String r1 = r2.f5508h
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                java.lang.String r1 = r2.f5509i
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                java.lang.String r1 = r2.f5510j
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                java.lang.String r1 = r2.f5511k
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                int r1 = r2.l
                int r0 = r0 + r1
                int r0 = r0 * 31
                int r1 = r2.m
                int r0 = r0 + r1
                int r0 = r0 * 31
                int r1 = r2.n
                int r0 = r0 + r1
                int r0 = r0 * 31
                int r1 = r2.o
                int r0 = r0 + r1
                return r0
        }

        public void setAd1(java.lang.String r1) {
                r0 = this;
                r0.f5510j = r1
                return
        }

        public void setAd2(java.lang.String r1) {
                r0 = this;
                r0.f5511k = r1
                return
        }

        public void setAlternativeRoute(int r1) {
                r0 = this;
                r0.l = r1
                return
        }

        public void setCityd(java.lang.String r1) {
                r0 = this;
                r0.f5504d = r1
                return
        }

        public void setDate(java.lang.String r1) {
                r0 = this;
                r0.f5505e = r1
                return
        }

        public void setDestinationPoiId(java.lang.String r1) {
                r0 = this;
                r0.f5509i = r1
                return
        }

        public void setMaxTrans(int r1) {
                r0 = this;
                r0.n = r1
                return
        }

        public void setMultiExport(int r1) {
                r0 = this;
                r0.m = r1
                return
        }

        public void setOriginPoiId(java.lang.String r1) {
                r0 = this;
                r0.f5508h = r1
                return
        }

        public void setShowFields(int r1) {
                r0 = this;
                r0.o = r1
                return
        }

        public void setTime(java.lang.String r1) {
                r0 = this;
                r0.f5506f = r1
                return
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel r2, int r3) {
                r1 = this;
                com.amap.api.services.route.RouteSearchV2$FromAndTo r0 = r1.a
                r2.writeParcelable(r0, r3)
                int r3 = r1.f5502b
                r2.writeInt(r3)
                java.lang.String r3 = r1.f5503c
                r2.writeString(r3)
                int r3 = r1.f5507g
                r2.writeInt(r3)
                java.lang.String r3 = r1.f5504d
                r2.writeString(r3)
                int r3 = r1.o
                r2.writeInt(r3)
                java.lang.String r3 = r1.f5508h
                r2.writeString(r3)
                java.lang.String r3 = r1.f5509i
                r2.writeString(r3)
                java.lang.String r3 = r1.f5510j
                r2.writeString(r3)
                java.lang.String r3 = r1.f5511k
                r2.writeString(r3)
                int r3 = r1.l
                r2.writeInt(r3)
                int r3 = r1.n
                r2.writeInt(r3)
                int r3 = r1.m
                r2.writeInt(r3)
                java.lang.String r3 = r1.f5505e
                r2.writeString(r3)
                java.lang.String r3 = r1.f5506f
                r2.writeString(r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class CurveCost {
        private float a;

        /* renamed from: b, reason: collision with root package name */
        private float f5512b;

        public CurveCost() {
                r0 = this;
                r0.<init>()
                return
        }

        public float getAccess() {
                r1 = this;
                float r0 = r1.a
                return r0
        }

        public float getValue() {
                r1 = this;
                float r0 = r1.f5512b
                return r0
        }

        public void setAccess(float r1) {
                r0 = this;
                r0.a = r1
                return
        }

        public void setValue(float r1) {
                r0 = this;
                r0.f5512b = r1
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class CustomCostMode {
        private java.util.List<com.amap.api.services.route.RouteSearchV2.SpeedCost> a;

        /* renamed from: b, reason: collision with root package name */
        private com.amap.api.services.route.RouteSearchV2.CurveCost f5513b;

        /* renamed from: c, reason: collision with root package name */
        private com.amap.api.services.route.RouteSearchV2.SlopeCost f5514c;

        /* renamed from: d, reason: collision with root package name */
        private float f5515d;

        /* renamed from: e, reason: collision with root package name */
        private com.amap.api.services.route.RouteSearchV2.TransCost f5516e;

        /* renamed from: f, reason: collision with root package name */
        private float f5517f;

        /* renamed from: g, reason: collision with root package name */
        private com.amap.api.services.route.RouteSearchV2.PowerTrainLoss f5518g;

        public CustomCostMode() {
                r0 = this;
                r0.<init>()
                return
        }

        public float getAuxCost() {
                r1 = this;
                float r0 = r1.f5515d
                return r0
        }

        public com.amap.api.services.route.RouteSearchV2.CurveCost getCurveCost() {
                r1 = this;
                com.amap.api.services.route.RouteSearchV2$CurveCost r0 = r1.f5513b
                return r0
        }

        public float getFerryCost() {
                r1 = this;
                float r0 = r1.f5517f
                return r0
        }

        public com.amap.api.services.route.RouteSearchV2.PowerTrainLoss getPowerTrainLosses() {
                r1 = this;
                com.amap.api.services.route.RouteSearchV2$PowerTrainLoss r0 = r1.f5518g
                return r0
        }

        public com.amap.api.services.route.RouteSearchV2.SlopeCost getSlopeCost() {
                r1 = this;
                com.amap.api.services.route.RouteSearchV2$SlopeCost r0 = r1.f5514c
                return r0
        }

        public java.util.List<com.amap.api.services.route.RouteSearchV2.SpeedCost> getSpeedCosts() {
                r1 = this;
                java.util.List<com.amap.api.services.route.RouteSearchV2$SpeedCost> r0 = r1.a
                return r0
        }

        public com.amap.api.services.route.RouteSearchV2.TransCost getTransCost() {
                r1 = this;
                com.amap.api.services.route.RouteSearchV2$TransCost r0 = r1.f5516e
                return r0
        }

        public void setAuxCost(float r1) {
                r0 = this;
                r0.f5515d = r1
                return
        }

        public void setCurveCost(com.amap.api.services.route.RouteSearchV2.CurveCost r1) {
                r0 = this;
                r0.f5513b = r1
                return
        }

        public void setFerryCost(float r1) {
                r0 = this;
                r0.f5517f = r1
                return
        }

        public void setPowerTrainLosses(com.amap.api.services.route.RouteSearchV2.PowerTrainLoss r1) {
                r0 = this;
                r0.f5518g = r1
                return
        }

        public void setSlopeCost(com.amap.api.services.route.RouteSearchV2.SlopeCost r1) {
                r0 = this;
                r0.f5514c = r1
                return
        }

        public void setSpeedCosts(java.util.List<com.amap.api.services.route.RouteSearchV2.SpeedCost> r1) {
                r0 = this;
                r0.a = r1
                return
        }

        public void setTransCost(com.amap.api.services.route.RouteSearchV2.TransCost r1) {
                r0 = this;
                r0.f5516e = r1
                return
        }

        public java.lang.String toJson() {
                r9 = this;
                org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L107
                r0.<init>()     // Catch: org.json.JSONException -> L107
                org.json.JSONArray r1 = new org.json.JSONArray     // Catch: org.json.JSONException -> L107
                r1.<init>()     // Catch: org.json.JSONException -> L107
                java.util.List<com.amap.api.services.route.RouteSearchV2$SpeedCost> r2 = r9.a     // Catch: org.json.JSONException -> L107
                java.lang.String r3 = "speed"
                java.lang.String r4 = "value"
                if (r2 == 0) goto L3f
                java.util.Iterator r2 = r2.iterator()     // Catch: org.json.JSONException -> L107
            L16:
                boolean r5 = r2.hasNext()     // Catch: org.json.JSONException -> L107
                if (r5 == 0) goto L3a
                java.lang.Object r5 = r2.next()     // Catch: org.json.JSONException -> L107
                com.amap.api.services.route.RouteSearchV2$SpeedCost r5 = (com.amap.api.services.route.RouteSearchV2.SpeedCost) r5     // Catch: org.json.JSONException -> L107
                org.json.JSONObject r6 = new org.json.JSONObject     // Catch: org.json.JSONException -> L107
                r6.<init>()     // Catch: org.json.JSONException -> L107
                int r7 = r5.getSpeed()     // Catch: org.json.JSONException -> L107
                r6.put(r3, r7)     // Catch: org.json.JSONException -> L107
                float r5 = r5.getValue()     // Catch: org.json.JSONException -> L107
                double r7 = (double) r5     // Catch: org.json.JSONException -> L107
                r6.put(r4, r7)     // Catch: org.json.JSONException -> L107
                r1.put(r6)     // Catch: org.json.JSONException -> L107
                goto L16
            L3a:
                java.lang.String r2 = "speed_cost"
                r0.put(r2, r1)     // Catch: org.json.JSONException -> L107
            L3f:
                com.amap.api.services.route.RouteSearchV2$CurveCost r1 = r9.f5513b     // Catch: org.json.JSONException -> L107
                java.lang.String r2 = "access"
                if (r1 == 0) goto L63
                org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L107
                r1.<init>()     // Catch: org.json.JSONException -> L107
                com.amap.api.services.route.RouteSearchV2$CurveCost r5 = r9.f5513b     // Catch: org.json.JSONException -> L107
                float r5 = r5.getAccess()     // Catch: org.json.JSONException -> L107
                double r5 = (double) r5     // Catch: org.json.JSONException -> L107
                r1.put(r2, r5)     // Catch: org.json.JSONException -> L107
                com.amap.api.services.route.RouteSearchV2$CurveCost r5 = r9.f5513b     // Catch: org.json.JSONException -> L107
                float r5 = r5.getValue()     // Catch: org.json.JSONException -> L107
                double r5 = (double) r5     // Catch: org.json.JSONException -> L107
                r1.put(r4, r5)     // Catch: org.json.JSONException -> L107
                java.lang.String r5 = "curve_cost"
                r0.put(r5, r1)     // Catch: org.json.JSONException -> L107
            L63:
                com.amap.api.services.route.RouteSearchV2$SlopeCost r1 = r9.f5514c     // Catch: org.json.JSONException -> L107
                if (r1 == 0) goto L89
                org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L107
                r1.<init>()     // Catch: org.json.JSONException -> L107
                java.lang.String r5 = "up"
                com.amap.api.services.route.RouteSearchV2$SlopeCost r6 = r9.f5514c     // Catch: org.json.JSONException -> L107
                float r6 = r6.getUp()     // Catch: org.json.JSONException -> L107
                double r6 = (double) r6     // Catch: org.json.JSONException -> L107
                r1.put(r5, r6)     // Catch: org.json.JSONException -> L107
                java.lang.String r5 = "down"
                com.amap.api.services.route.RouteSearchV2$SlopeCost r6 = r9.f5514c     // Catch: org.json.JSONException -> L107
                float r6 = r6.getDown()     // Catch: org.json.JSONException -> L107
                double r6 = (double) r6     // Catch: org.json.JSONException -> L107
                r1.put(r5, r6)     // Catch: org.json.JSONException -> L107
                java.lang.String r5 = "slope_cost"
                r0.put(r5, r1)     // Catch: org.json.JSONException -> L107
            L89:
                java.lang.String r1 = "aux_cost"
                float r5 = r9.f5515d     // Catch: org.json.JSONException -> L107
                double r5 = (double) r5     // Catch: org.json.JSONException -> L107
                r0.put(r1, r5)     // Catch: org.json.JSONException -> L107
                com.amap.api.services.route.RouteSearchV2$TransCost r1 = r9.f5516e     // Catch: org.json.JSONException -> L107
                if (r1 == 0) goto Lb5
                org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L107
                r1.<init>()     // Catch: org.json.JSONException -> L107
                com.amap.api.services.route.RouteSearchV2$TransCost r5 = r9.f5516e     // Catch: org.json.JSONException -> L107
                float r5 = r5.getAccess()     // Catch: org.json.JSONException -> L107
                double r5 = (double) r5     // Catch: org.json.JSONException -> L107
                r1.put(r2, r5)     // Catch: org.json.JSONException -> L107
                java.lang.String r2 = "decess"
                com.amap.api.services.route.RouteSearchV2$TransCost r5 = r9.f5516e     // Catch: org.json.JSONException -> L107
                float r5 = r5.getDecess()     // Catch: org.json.JSONException -> L107
                double r5 = (double) r5     // Catch: org.json.JSONException -> L107
                r1.put(r2, r5)     // Catch: org.json.JSONException -> L107
                java.lang.String r2 = "trans_cost"
                r0.put(r2, r1)     // Catch: org.json.JSONException -> L107
            Lb5:
                java.lang.String r1 = "ferry_cost"
                float r2 = r9.f5517f     // Catch: org.json.JSONException -> L107
                double r5 = (double) r2     // Catch: org.json.JSONException -> L107
                r0.put(r1, r5)     // Catch: org.json.JSONException -> L107
                com.amap.api.services.route.RouteSearchV2$PowerTrainLoss r1 = r9.f5518g     // Catch: org.json.JSONException -> L107
                if (r1 == 0) goto L102
                org.json.JSONArray r1 = new org.json.JSONArray     // Catch: org.json.JSONException -> L107
                r1.<init>()     // Catch: org.json.JSONException -> L107
                org.json.JSONObject r2 = new org.json.JSONObject     // Catch: org.json.JSONException -> L107
                r2.<init>()     // Catch: org.json.JSONException -> L107
                java.lang.String r5 = "powerdemand"
                com.amap.api.services.route.RouteSearchV2$PowerTrainLoss r6 = r9.f5518g     // Catch: org.json.JSONException -> L107
                int r6 = r6.getPowerDemand()     // Catch: org.json.JSONException -> L107
                r2.put(r5, r6)     // Catch: org.json.JSONException -> L107
                com.amap.api.services.route.RouteSearchV2$PowerTrainLoss r5 = r9.f5518g     // Catch: org.json.JSONException -> L107
                float r5 = r5.getPowerDemandValue()     // Catch: org.json.JSONException -> L107
                double r5 = (double) r5     // Catch: org.json.JSONException -> L107
                r2.put(r4, r5)     // Catch: org.json.JSONException -> L107
                org.json.JSONObject r5 = new org.json.JSONObject     // Catch: org.json.JSONException -> L107
                r5.<init>()     // Catch: org.json.JSONException -> L107
                com.amap.api.services.route.RouteSearchV2$PowerTrainLoss r6 = r9.f5518g     // Catch: org.json.JSONException -> L107
                int r6 = r6.getSpeed()     // Catch: org.json.JSONException -> L107
                r5.put(r3, r6)     // Catch: org.json.JSONException -> L107
                com.amap.api.services.route.RouteSearchV2$PowerTrainLoss r3 = r9.f5518g     // Catch: org.json.JSONException -> L107
                int r3 = r3.getSpeedValue()     // Catch: org.json.JSONException -> L107
                r5.put(r4, r3)     // Catch: org.json.JSONException -> L107
                r1.put(r2)     // Catch: org.json.JSONException -> L107
                r1.put(r5)     // Catch: org.json.JSONException -> L107
                java.lang.String r2 = "powertrain_loss"
                r0.put(r2, r1)     // Catch: org.json.JSONException -> L107
            L102:
                java.lang.String r0 = r0.toString()     // Catch: org.json.JSONException -> L107
                return r0
            L107:
                r0 = 0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class DriveRouteQuery implements android.os.Parcelable, java.lang.Cloneable {
        public static final android.os.Parcelable.Creator<com.amap.api.services.route.RouteSearchV2.DriveRouteQuery> CREATOR = null;
        private com.amap.api.services.route.RouteSearchV2.FromAndTo a;

        /* renamed from: b, reason: collision with root package name */
        private com.amap.api.services.route.RouteSearchV2.NewEnergy f5519b;

        /* renamed from: c, reason: collision with root package name */
        private int f5520c;

        /* renamed from: d, reason: collision with root package name */
        private java.util.List<com.amap.api.services.core.LatLonPoint> f5521d;

        /* renamed from: e, reason: collision with root package name */
        private java.util.List<java.util.List<com.amap.api.services.core.LatLonPoint>> f5522e;

        /* renamed from: f, reason: collision with root package name */
        private java.lang.String f5523f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f5524g;

        /* renamed from: h, reason: collision with root package name */
        private int f5525h;

        /* renamed from: i, reason: collision with root package name */
        private java.lang.String f5526i;

        /* renamed from: j, reason: collision with root package name */
        private int f5527j;


        static {
                com.amap.api.services.route.RouteSearchV2$DriveRouteQuery$1 r0 = new com.amap.api.services.route.RouteSearchV2$DriveRouteQuery$1
                r0.<init>()
                com.amap.api.services.route.RouteSearchV2.DriveRouteQuery.CREATOR = r0
                return
        }

        public DriveRouteQuery() {
                r2 = this;
                r2.<init>()
                com.amap.api.services.route.RouteSearchV2$DrivingStrategy r0 = com.amap.api.services.route.RouteSearchV2.DrivingStrategy.DEFAULT
                int r0 = r0.getValue()
                r2.f5520c = r0
                r0 = 1
                r2.f5524g = r0
                r1 = 0
                r2.f5525h = r1
                r1 = 0
                r2.f5526i = r1
                r2.f5527j = r0
                return
        }

        public DriveRouteQuery(android.os.Parcel r7) {
                r6 = this;
                r6.<init>()
                com.amap.api.services.route.RouteSearchV2$DrivingStrategy r0 = com.amap.api.services.route.RouteSearchV2.DrivingStrategy.DEFAULT
                int r0 = r0.getValue()
                r6.f5520c = r0
                r0 = 1
                r6.f5524g = r0
                r1 = 0
                r6.f5525h = r1
                r2 = 0
                r6.f5526i = r2
                r6.f5527j = r0
                java.lang.Class<com.amap.api.services.route.RouteSearchV2$FromAndTo> r3 = com.amap.api.services.route.RouteSearchV2.FromAndTo.class
                java.lang.ClassLoader r3 = r3.getClassLoader()
                android.os.Parcelable r3 = r7.readParcelable(r3)
                com.amap.api.services.route.RouteSearchV2$FromAndTo r3 = (com.amap.api.services.route.RouteSearchV2.FromAndTo) r3
                r6.a = r3
                int r3 = r7.readInt()
                r6.f5520c = r3
                android.os.Parcelable$Creator<com.amap.api.services.core.LatLonPoint> r3 = com.amap.api.services.core.LatLonPoint.CREATOR
                java.util.ArrayList r3 = r7.createTypedArrayList(r3)
                r6.f5521d = r3
                int r3 = r7.readInt()
                if (r3 != 0) goto L3b
                r6.f5522e = r2
                goto L42
            L3b:
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                r6.f5522e = r2
            L42:
                r2 = 0
            L43:
                if (r2 >= r3) goto L53
                java.util.List<java.util.List<com.amap.api.services.core.LatLonPoint>> r4 = r6.f5522e
                android.os.Parcelable$Creator<com.amap.api.services.core.LatLonPoint> r5 = com.amap.api.services.core.LatLonPoint.CREATOR
                java.util.ArrayList r5 = r7.createTypedArrayList(r5)
                r4.add(r5)
                int r2 = r2 + 1
                goto L43
            L53:
                java.lang.String r2 = r7.readString()
                r6.f5523f = r2
                int r2 = r7.readInt()
                if (r2 != r0) goto L60
                goto L61
            L60:
                r0 = 0
            L61:
                r6.f5524g = r0
                int r0 = r7.readInt()
                r6.f5525h = r0
                java.lang.String r0 = r7.readString()
                r6.f5526i = r0
                int r7 = r7.readInt()
                r6.f5527j = r7
                return
        }

        public DriveRouteQuery(com.amap.api.services.route.RouteSearchV2.FromAndTo r3, com.amap.api.services.route.RouteSearchV2.DrivingStrategy r4, java.util.List<com.amap.api.services.core.LatLonPoint> r5, java.util.List<java.util.List<com.amap.api.services.core.LatLonPoint>> r6, java.lang.String r7) {
                r2 = this;
                r2.<init>()
                com.amap.api.services.route.RouteSearchV2$DrivingStrategy r0 = com.amap.api.services.route.RouteSearchV2.DrivingStrategy.DEFAULT
                int r0 = r0.getValue()
                r2.f5520c = r0
                r0 = 1
                r2.f5524g = r0
                r1 = 0
                r2.f5525h = r1
                r1 = 0
                r2.f5526i = r1
                r2.f5527j = r0
                r2.a = r3
                int r3 = r4.getValue()
                r2.f5520c = r3
                r2.f5521d = r5
                r2.f5522e = r6
                r2.f5523f = r7
                return
        }

        public com.amap.api.services.route.RouteSearchV2.DriveRouteQuery clone() {
                r9 = this;
                super.clone()     // Catch: java.lang.CloneNotSupportedException -> L4
                goto Lc
            L4:
                r0 = move-exception
                java.lang.String r1 = "RouteSearchV2"
                java.lang.String r2 = "DriveRouteQueryclone"
                com.amap.api.col.s.j4.i(r0, r1, r2)
            Lc:
                com.amap.api.services.route.RouteSearchV2$DriveRouteQuery r3 = new com.amap.api.services.route.RouteSearchV2$DriveRouteQuery
                com.amap.api.services.route.RouteSearchV2$FromAndTo r4 = r9.a
                int r0 = r9.f5520c
                com.amap.api.services.route.RouteSearchV2$DrivingStrategy r5 = com.amap.api.services.route.RouteSearchV2.DrivingStrategy.fromValue(r0)
                java.util.List<com.amap.api.services.core.LatLonPoint> r6 = r9.f5521d
                java.util.List<java.util.List<com.amap.api.services.core.LatLonPoint>> r7 = r9.f5522e
                java.lang.String r8 = r9.f5523f
                r3.<init>(r4, r5, r6, r7, r8)
                boolean r0 = r9.f5524g
                r3.setUseFerry(r0)
                int r0 = r9.f5525h
                r3.setCarType(r0)
                java.lang.String r0 = r9.f5526i
                r3.setExclude(r0)
                int r0 = r9.f5527j
                r3.setShowFields(r0)
                com.amap.api.services.route.RouteSearchV2$NewEnergy r0 = r9.f5519b
                r3.setNewEnergy(r0)
                return r3
        }

        /* renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ java.lang.Object m37clone() throws java.lang.CloneNotSupportedException {
                r1 = this;
                com.amap.api.services.route.RouteSearchV2$DriveRouteQuery r0 = r1.clone()
                return r0
        }

        @Override // android.os.Parcelable
        public int describeContents() {
                r1 = this;
                r0 = 0
                return r0
        }

        public boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                r1 = 0
                if (r5 != 0) goto L8
                return r1
            L8:
                java.lang.Class r2 = r4.getClass()
                java.lang.Class r3 = r5.getClass()
                if (r2 == r3) goto L13
                return r1
            L13:
                com.amap.api.services.route.RouteSearchV2$DriveRouteQuery r5 = (com.amap.api.services.route.RouteSearchV2.DriveRouteQuery) r5
                java.lang.String r2 = r4.f5523f
                if (r2 != 0) goto L1e
                java.lang.String r2 = r5.f5523f
                if (r2 == 0) goto L27
                return r1
            L1e:
                java.lang.String r3 = r5.f5523f
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L27
                return r1
            L27:
                java.util.List<java.util.List<com.amap.api.services.core.LatLonPoint>> r2 = r4.f5522e
                if (r2 != 0) goto L30
                java.util.List<java.util.List<com.amap.api.services.core.LatLonPoint>> r2 = r5.f5522e
                if (r2 == 0) goto L39
                return r1
            L30:
                java.util.List<java.util.List<com.amap.api.services.core.LatLonPoint>> r3 = r5.f5522e
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L39
                return r1
            L39:
                com.amap.api.services.route.RouteSearchV2$FromAndTo r2 = r4.a
                if (r2 != 0) goto L42
                com.amap.api.services.route.RouteSearchV2$FromAndTo r2 = r5.a
                if (r2 == 0) goto L4b
                return r1
            L42:
                com.amap.api.services.route.RouteSearchV2$FromAndTo r3 = r5.a
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L4b
                return r1
            L4b:
                int r2 = r4.f5520c
                int r3 = r5.f5520c
                if (r2 == r3) goto L52
                return r1
            L52:
                java.util.List<com.amap.api.services.core.LatLonPoint> r2 = r4.f5521d
                if (r2 != 0) goto L5b
                java.util.List<com.amap.api.services.core.LatLonPoint> r5 = r5.f5521d
                if (r5 == 0) goto L7b
                return r1
            L5b:
                java.util.List<com.amap.api.services.core.LatLonPoint> r3 = r5.f5521d
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L64
                return r1
            L64:
                boolean r2 = r4.f5524g
                boolean r3 = r5.isUseFerry()
                if (r2 == r3) goto L6d
                return r1
            L6d:
                int r2 = r4.f5525h
                int r3 = r5.f5525h
                if (r2 == r3) goto L74
                return r1
            L74:
                int r2 = r4.f5527j
                int r5 = r5.f5527j
                if (r2 == r5) goto L7b
                return r1
            L7b:
                return r0
        }

        public java.lang.String getAvoidRoad() {
                r1 = this;
                java.lang.String r0 = r1.f5523f
                return r0
        }

        public java.util.List<java.util.List<com.amap.api.services.core.LatLonPoint>> getAvoidpolygons() {
                r1 = this;
                java.util.List<java.util.List<com.amap.api.services.core.LatLonPoint>> r0 = r1.f5522e
                return r0
        }

        public java.lang.String getAvoidpolygonsStr() {
                r8 = this;
                java.lang.StringBuffer r0 = new java.lang.StringBuffer
                r0.<init>()
                java.util.List<java.util.List<com.amap.api.services.core.LatLonPoint>> r1 = r8.f5522e
                if (r1 == 0) goto L69
                int r1 = r1.size()
                if (r1 != 0) goto L10
                goto L69
            L10:
                r1 = 0
                r2 = 0
            L12:
                java.util.List<java.util.List<com.amap.api.services.core.LatLonPoint>> r3 = r8.f5522e
                int r3 = r3.size()
                if (r2 >= r3) goto L64
                java.util.List<java.util.List<com.amap.api.services.core.LatLonPoint>> r3 = r8.f5522e
                java.lang.Object r3 = r3.get(r2)
                java.util.List r3 = (java.util.List) r3
                r4 = 0
            L23:
                int r5 = r3.size()
                if (r4 >= r5) goto L52
                java.lang.Object r5 = r3.get(r4)
                com.amap.api.services.core.LatLonPoint r5 = (com.amap.api.services.core.LatLonPoint) r5
                double r6 = r5.getLongitude()
                r0.append(r6)
                java.lang.String r6 = ","
                r0.append(r6)
                double r5 = r5.getLatitude()
                r0.append(r5)
                int r5 = r3.size()
                int r5 = r5 + (-1)
                if (r4 >= r5) goto L4f
                java.lang.String r5 = ";"
                r0.append(r5)
            L4f:
                int r4 = r4 + 1
                goto L23
            L52:
                java.util.List<java.util.List<com.amap.api.services.core.LatLonPoint>> r3 = r8.f5522e
                int r3 = r3.size()
                int r3 = r3 + (-1)
                if (r2 >= r3) goto L61
                java.lang.String r3 = "|"
                r0.append(r3)
            L61:
                int r2 = r2 + 1
                goto L12
            L64:
                java.lang.String r0 = r0.toString()
                return r0
            L69:
                r0 = 0
                return r0
        }

        public int getCarType() {
                r1 = this;
                int r0 = r1.f5525h
                return r0
        }

        public java.lang.String getExclude() {
                r1 = this;
                java.lang.String r0 = r1.f5526i
                return r0
        }

        public com.amap.api.services.route.RouteSearchV2.FromAndTo getFromAndTo() {
                r1 = this;
                com.amap.api.services.route.RouteSearchV2$FromAndTo r0 = r1.a
                return r0
        }

        public com.amap.api.services.route.RouteSearchV2.DrivingStrategy getMode() {
                r1 = this;
                int r0 = r1.f5520c
                com.amap.api.services.route.RouteSearchV2$DrivingStrategy r0 = com.amap.api.services.route.RouteSearchV2.DrivingStrategy.fromValue(r0)
                return r0
        }

        public com.amap.api.services.route.RouteSearchV2.NewEnergy getNewEnergy() {
                r1 = this;
                com.amap.api.services.route.RouteSearchV2$NewEnergy r0 = r1.f5519b
                return r0
        }

        public java.util.List<com.amap.api.services.core.LatLonPoint> getPassedByPoints() {
                r1 = this;
                java.util.List<com.amap.api.services.core.LatLonPoint> r0 = r1.f5521d
                return r0
        }

        public java.lang.String getPassedPointStr() {
                r5 = this;
                java.lang.StringBuffer r0 = new java.lang.StringBuffer
                r0.<init>()
                java.util.List<com.amap.api.services.core.LatLonPoint> r1 = r5.f5521d
                if (r1 == 0) goto L4b
                int r1 = r1.size()
                if (r1 != 0) goto L10
                goto L4b
            L10:
                r1 = 0
            L11:
                java.util.List<com.amap.api.services.core.LatLonPoint> r2 = r5.f5521d
                int r2 = r2.size()
                if (r1 >= r2) goto L46
                java.util.List<com.amap.api.services.core.LatLonPoint> r2 = r5.f5521d
                java.lang.Object r2 = r2.get(r1)
                com.amap.api.services.core.LatLonPoint r2 = (com.amap.api.services.core.LatLonPoint) r2
                double r3 = r2.getLongitude()
                r0.append(r3)
                java.lang.String r3 = ","
                r0.append(r3)
                double r2 = r2.getLatitude()
                r0.append(r2)
                java.util.List<com.amap.api.services.core.LatLonPoint> r2 = r5.f5521d
                int r2 = r2.size()
                int r2 = r2 + (-1)
                if (r1 >= r2) goto L43
                java.lang.String r2 = ";"
                r0.append(r2)
            L43:
                int r1 = r1 + 1
                goto L11
            L46:
                java.lang.String r0 = r0.toString()
                return r0
            L4b:
                r0 = 0
                return r0
        }

        public int getShowFields() {
                r1 = this;
                int r0 = r1.f5527j
                return r0
        }

        public boolean hasAvoidRoad() {
                r1 = this;
                java.lang.String r0 = r1.getAvoidRoad()
                boolean r0 = com.amap.api.col.s.j4.j(r0)
                if (r0 == 0) goto Lc
                r0 = 0
                return r0
            Lc:
                r0 = 1
                return r0
        }

        public boolean hasAvoidpolygons() {
                r1 = this;
                java.lang.String r0 = r1.getAvoidpolygonsStr()
                boolean r0 = com.amap.api.col.s.j4.j(r0)
                if (r0 == 0) goto Lc
                r0 = 0
                return r0
            Lc:
                r0 = 1
                return r0
        }

        public boolean hasPassPoint() {
                r1 = this;
                java.lang.String r0 = r1.getPassedPointStr()
                boolean r0 = com.amap.api.col.s.j4.j(r0)
                if (r0 == 0) goto Lc
                r0 = 0
                return r0
            Lc:
                r0 = 1
                return r0
        }

        public int hashCode() {
                r3 = this;
                java.lang.String r0 = r3.f5523f
                r1 = 0
                if (r0 != 0) goto L7
                r0 = 0
                goto Lb
            L7:
                int r0 = r0.hashCode()
            Lb:
                int r0 = r0 + 31
                int r0 = r0 * 31
                java.util.List<java.util.List<com.amap.api.services.core.LatLonPoint>> r2 = r3.f5522e
                if (r2 != 0) goto L15
                r2 = 0
                goto L19
            L15:
                int r2 = r2.hashCode()
            L19:
                int r0 = r0 + r2
                int r0 = r0 * 31
                com.amap.api.services.route.RouteSearchV2$FromAndTo r2 = r3.a
                if (r2 != 0) goto L22
                r2 = 0
                goto L26
            L22:
                int r2 = r2.hashCode()
            L26:
                int r0 = r0 + r2
                int r0 = r0 * 31
                int r2 = r3.f5520c
                int r0 = r0 + r2
                int r0 = r0 * 31
                java.util.List<com.amap.api.services.core.LatLonPoint> r2 = r3.f5521d
                if (r2 != 0) goto L33
                goto L37
            L33:
                int r1 = r2.hashCode()
            L37:
                int r0 = r0 + r1
                int r0 = r0 * 31
                int r1 = r3.f5525h
                int r0 = r0 + r1
                return r0
        }

        public boolean isUseFerry() {
                r1 = this;
                boolean r0 = r1.f5524g
                return r0
        }

        public void setCarType(int r1) {
                r0 = this;
                r0.f5525h = r1
                return
        }

        public void setExclude(java.lang.String r1) {
                r0 = this;
                r0.f5526i = r1
                return
        }

        public void setNewEnergy(com.amap.api.services.route.RouteSearchV2.NewEnergy r1) {
                r0 = this;
                r0.f5519b = r1
                return
        }

        public void setShowFields(int r1) {
                r0 = this;
                r0.f5527j = r1
                return
        }

        public void setUseFerry(boolean r1) {
                r0 = this;
                r0.f5524g = r1
                return
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel r2, int r3) {
                r1 = this;
                com.amap.api.services.route.RouteSearchV2$FromAndTo r0 = r1.a
                r2.writeParcelable(r0, r3)
                int r3 = r1.f5520c
                r2.writeInt(r3)
                java.util.List<com.amap.api.services.core.LatLonPoint> r3 = r1.f5521d
                r2.writeTypedList(r3)
                java.util.List<java.util.List<com.amap.api.services.core.LatLonPoint>> r3 = r1.f5522e
                if (r3 != 0) goto L18
                r3 = 0
                r2.writeInt(r3)
                goto L35
            L18:
                int r3 = r3.size()
                r2.writeInt(r3)
                java.util.List<java.util.List<com.amap.api.services.core.LatLonPoint>> r3 = r1.f5522e
                java.util.Iterator r3 = r3.iterator()
            L25:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L35
                java.lang.Object r0 = r3.next()
                java.util.List r0 = (java.util.List) r0
                r2.writeTypedList(r0)
                goto L25
            L35:
                java.lang.String r3 = r1.f5523f
                r2.writeString(r3)
                boolean r3 = r1.f5524g
                r2.writeInt(r3)
                int r3 = r1.f5525h
                r2.writeInt(r3)
                java.lang.String r3 = r1.f5526i
                r2.writeString(r3)
                int r3 = r1.f5527j
                r2.writeInt(r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum DrivingStrategy extends java.lang.Enum<com.amap.api.services.route.RouteSearchV2.DrivingStrategy> {
        public static final com.amap.api.services.route.RouteSearchV2.DrivingStrategy AVOID_CONGESTION = null;
        public static final com.amap.api.services.route.RouteSearchV2.DrivingStrategy AVOID_CONGESTION_AVOID_HIGHWAY = null;
        public static final com.amap.api.services.route.RouteSearchV2.DrivingStrategy AVOID_CONGESTION_HIGHWAY_PRIORITY = null;
        public static final com.amap.api.services.route.RouteSearchV2.DrivingStrategy AVOID_CONGESTION_LESS_CHARGE = null;
        public static final com.amap.api.services.route.RouteSearchV2.DrivingStrategy AVOID_CONGESTION_LESS_CHARGE_AVOID_HIGHWAY = null;
        public static final com.amap.api.services.route.RouteSearchV2.DrivingStrategy AVOID_CONGESTION_ROAD_PRIORITY = null;
        public static final com.amap.api.services.route.RouteSearchV2.DrivingStrategy AVOID_CONGESTION_SPEED_PRIORITY = null;
        public static final com.amap.api.services.route.RouteSearchV2.DrivingStrategy AVOID_HIGHWAY = null;
        public static final com.amap.api.services.route.RouteSearchV2.DrivingStrategy DEFAULT = null;
        public static final com.amap.api.services.route.RouteSearchV2.DrivingStrategy HIGHWAY_PRIORITY = null;
        public static final com.amap.api.services.route.RouteSearchV2.DrivingStrategy LESS_CHARGE = null;
        public static final com.amap.api.services.route.RouteSearchV2.DrivingStrategy LESS_CHARGE_AVOID_HIGHWAY = null;
        public static final com.amap.api.services.route.RouteSearchV2.DrivingStrategy ROAD_PRIORITY = null;
        public static final com.amap.api.services.route.RouteSearchV2.DrivingStrategy SPEED_PRIORITY = null;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ com.amap.api.services.route.RouteSearchV2.DrivingStrategy[] f5528b = null;
        int a;

        static {
                com.amap.api.services.route.RouteSearchV2$DrivingStrategy r0 = new com.amap.api.services.route.RouteSearchV2$DrivingStrategy
                r1 = 32
                java.lang.String r2 = "DEFAULT"
                r3 = 0
                r0.<init>(r2, r3, r1)
                com.amap.api.services.route.RouteSearchV2.DrivingStrategy.DEFAULT = r0
                com.amap.api.services.route.RouteSearchV2$DrivingStrategy r1 = new com.amap.api.services.route.RouteSearchV2$DrivingStrategy
                r2 = 33
                java.lang.String r4 = "AVOID_CONGESTION"
                r5 = 1
                r1.<init>(r4, r5, r2)
                com.amap.api.services.route.RouteSearchV2.DrivingStrategy.AVOID_CONGESTION = r1
                com.amap.api.services.route.RouteSearchV2$DrivingStrategy r2 = new com.amap.api.services.route.RouteSearchV2$DrivingStrategy
                r4 = 34
                java.lang.String r6 = "HIGHWAY_PRIORITY"
                r7 = 2
                r2.<init>(r6, r7, r4)
                com.amap.api.services.route.RouteSearchV2.DrivingStrategy.HIGHWAY_PRIORITY = r2
                com.amap.api.services.route.RouteSearchV2$DrivingStrategy r4 = new com.amap.api.services.route.RouteSearchV2$DrivingStrategy
                r6 = 35
                java.lang.String r8 = "AVOID_HIGHWAY"
                r9 = 3
                r4.<init>(r8, r9, r6)
                com.amap.api.services.route.RouteSearchV2.DrivingStrategy.AVOID_HIGHWAY = r4
                com.amap.api.services.route.RouteSearchV2$DrivingStrategy r6 = new com.amap.api.services.route.RouteSearchV2$DrivingStrategy
                r8 = 36
                java.lang.String r10 = "LESS_CHARGE"
                r11 = 4
                r6.<init>(r10, r11, r8)
                com.amap.api.services.route.RouteSearchV2.DrivingStrategy.LESS_CHARGE = r6
                com.amap.api.services.route.RouteSearchV2$DrivingStrategy r8 = new com.amap.api.services.route.RouteSearchV2$DrivingStrategy
                r10 = 37
                java.lang.String r12 = "ROAD_PRIORITY"
                r13 = 5
                r8.<init>(r12, r13, r10)
                com.amap.api.services.route.RouteSearchV2.DrivingStrategy.ROAD_PRIORITY = r8
                com.amap.api.services.route.RouteSearchV2$DrivingStrategy r10 = new com.amap.api.services.route.RouteSearchV2$DrivingStrategy
                r12 = 38
                java.lang.String r14 = "SPEED_PRIORITY"
                r15 = 6
                r10.<init>(r14, r15, r12)
                com.amap.api.services.route.RouteSearchV2.DrivingStrategy.SPEED_PRIORITY = r10
                com.amap.api.services.route.RouteSearchV2$DrivingStrategy r12 = new com.amap.api.services.route.RouteSearchV2$DrivingStrategy
                r14 = 39
                r16 = 0
                java.lang.String r3 = "AVOID_CONGESTION_HIGHWAY_PRIORITY"
                r17 = 1
                r5 = 7
                r12.<init>(r3, r5, r14)
                com.amap.api.services.route.RouteSearchV2.DrivingStrategy.AVOID_CONGESTION_HIGHWAY_PRIORITY = r12
                com.amap.api.services.route.RouteSearchV2$DrivingStrategy r3 = new com.amap.api.services.route.RouteSearchV2$DrivingStrategy
                r14 = 40
                r18 = 7
                java.lang.String r5 = "AVOID_CONGESTION_AVOID_HIGHWAY"
                r19 = 2
                r7 = 8
                r3.<init>(r5, r7, r14)
                com.amap.api.services.route.RouteSearchV2.DrivingStrategy.AVOID_CONGESTION_AVOID_HIGHWAY = r3
                com.amap.api.services.route.RouteSearchV2$DrivingStrategy r5 = new com.amap.api.services.route.RouteSearchV2$DrivingStrategy
                r14 = 41
                r20 = 8
                java.lang.String r7 = "AVOID_CONGESTION_LESS_CHARGE"
                r21 = 3
                r9 = 9
                r5.<init>(r7, r9, r14)
                com.amap.api.services.route.RouteSearchV2.DrivingStrategy.AVOID_CONGESTION_LESS_CHARGE = r5
                com.amap.api.services.route.RouteSearchV2$DrivingStrategy r7 = new com.amap.api.services.route.RouteSearchV2$DrivingStrategy
                r14 = 42
                r22 = 9
                java.lang.String r9 = "LESS_CHARGE_AVOID_HIGHWAY"
                r23 = 4
                r11 = 10
                r7.<init>(r9, r11, r14)
                com.amap.api.services.route.RouteSearchV2.DrivingStrategy.LESS_CHARGE_AVOID_HIGHWAY = r7
                com.amap.api.services.route.RouteSearchV2$DrivingStrategy r9 = new com.amap.api.services.route.RouteSearchV2$DrivingStrategy
                r14 = 43
                r24 = 10
                java.lang.String r11 = "AVOID_CONGESTION_LESS_CHARGE_AVOID_HIGHWAY"
                r25 = 5
                r13 = 11
                r9.<init>(r11, r13, r14)
                com.amap.api.services.route.RouteSearchV2.DrivingStrategy.AVOID_CONGESTION_LESS_CHARGE_AVOID_HIGHWAY = r9
                com.amap.api.services.route.RouteSearchV2$DrivingStrategy r11 = new com.amap.api.services.route.RouteSearchV2$DrivingStrategy
                r14 = 44
                r26 = 11
                java.lang.String r13 = "AVOID_CONGESTION_ROAD_PRIORITY"
                r27 = 6
                r15 = 12
                r11.<init>(r13, r15, r14)
                com.amap.api.services.route.RouteSearchV2.DrivingStrategy.AVOID_CONGESTION_ROAD_PRIORITY = r11
                com.amap.api.services.route.RouteSearchV2$DrivingStrategy r13 = new com.amap.api.services.route.RouteSearchV2$DrivingStrategy
                r14 = 45
                r28 = 12
                java.lang.String r15 = "AVOID_CONGESTION_SPEED_PRIORITY"
                r29 = r0
                r0 = 13
                r13.<init>(r15, r0, r14)
                com.amap.api.services.route.RouteSearchV2.DrivingStrategy.AVOID_CONGESTION_SPEED_PRIORITY = r13
                r14 = 14
                com.amap.api.services.route.RouteSearchV2$DrivingStrategy[] r14 = new com.amap.api.services.route.RouteSearchV2.DrivingStrategy[r14]
                r14[r16] = r29
                r14[r17] = r1
                r14[r19] = r2
                r14[r21] = r4
                r14[r23] = r6
                r14[r25] = r8
                r14[r27] = r10
                r14[r18] = r12
                r14[r20] = r3
                r14[r22] = r5
                r14[r24] = r7
                r14[r26] = r9
                r14[r28] = r11
                r14[r0] = r13
                com.amap.api.services.route.RouteSearchV2.DrivingStrategy.f5528b = r14
                return
        }

        DrivingStrategy(java.lang.String r1, int r2, int r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.a = r3
                return
        }

        public static com.amap.api.services.route.RouteSearchV2.DrivingStrategy fromValue(int r1) {
                com.amap.api.services.route.RouteSearchV2$DrivingStrategy[] r0 = values()
                int r1 = r1 + (-32)
                r1 = r0[r1]
                return r1
        }

        public static com.amap.api.services.route.RouteSearchV2.DrivingStrategy valueOf(java.lang.String r1) {
                java.lang.Class<com.amap.api.services.route.RouteSearchV2$DrivingStrategy> r0 = com.amap.api.services.route.RouteSearchV2.DrivingStrategy.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.amap.api.services.route.RouteSearchV2$DrivingStrategy r1 = (com.amap.api.services.route.RouteSearchV2.DrivingStrategy) r1
                return r1
        }

        public static com.amap.api.services.route.RouteSearchV2.DrivingStrategy[] values() {
                com.amap.api.services.route.RouteSearchV2$DrivingStrategy[] r0 = com.amap.api.services.route.RouteSearchV2.DrivingStrategy.f5528b
                java.lang.Object r0 = r0.clone()
                com.amap.api.services.route.RouteSearchV2$DrivingStrategy[] r0 = (com.amap.api.services.route.RouteSearchV2.DrivingStrategy[]) r0
                return r0
        }

        public final int getValue() {
                r1 = this;
                int r0 = r1.a
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class FromAndTo implements android.os.Parcelable, java.lang.Cloneable {
        public static final android.os.Parcelable.Creator<com.amap.api.services.route.RouteSearchV2.FromAndTo> CREATOR = null;
        private com.amap.api.services.core.LatLonPoint a;

        /* renamed from: b, reason: collision with root package name */
        private com.amap.api.services.core.LatLonPoint f5529b;

        /* renamed from: c, reason: collision with root package name */
        private java.lang.String f5530c;

        /* renamed from: d, reason: collision with root package name */
        private java.lang.String f5531d;

        /* renamed from: e, reason: collision with root package name */
        private java.lang.String f5532e;

        /* renamed from: f, reason: collision with root package name */
        private java.lang.String f5533f;

        /* renamed from: g, reason: collision with root package name */
        private java.lang.String f5534g;


        static {
                com.amap.api.services.route.RouteSearchV2$FromAndTo$1 r0 = new com.amap.api.services.route.RouteSearchV2$FromAndTo$1
                r0.<init>()
                com.amap.api.services.route.RouteSearchV2.FromAndTo.CREATOR = r0
                return
        }

        public FromAndTo() {
                r0 = this;
                r0.<init>()
                return
        }

        public FromAndTo(android.os.Parcel r3) {
                r2 = this;
                r2.<init>()
                java.lang.Class<com.amap.api.services.core.LatLonPoint> r0 = com.amap.api.services.core.LatLonPoint.class
                java.lang.ClassLoader r1 = r0.getClassLoader()
                android.os.Parcelable r1 = r3.readParcelable(r1)
                com.amap.api.services.core.LatLonPoint r1 = (com.amap.api.services.core.LatLonPoint) r1
                r2.a = r1
                java.lang.ClassLoader r0 = r0.getClassLoader()
                android.os.Parcelable r0 = r3.readParcelable(r0)
                com.amap.api.services.core.LatLonPoint r0 = (com.amap.api.services.core.LatLonPoint) r0
                r2.f5529b = r0
                java.lang.String r0 = r3.readString()
                r2.f5530c = r0
                java.lang.String r0 = r3.readString()
                r2.f5531d = r0
                java.lang.String r0 = r3.readString()
                r2.f5532e = r0
                java.lang.String r3 = r3.readString()
                r2.f5533f = r3
                return
        }

        public FromAndTo(com.amap.api.services.core.LatLonPoint r1, com.amap.api.services.core.LatLonPoint r2) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.f5529b = r2
                return
        }

        public com.amap.api.services.route.RouteSearchV2.FromAndTo clone() {
                r3 = this;
                super.clone()     // Catch: java.lang.CloneNotSupportedException -> L4
                goto Lc
            L4:
                r0 = move-exception
                java.lang.String r1 = "RouteSearchV2"
                java.lang.String r2 = "FromAndToclone"
                com.amap.api.col.s.j4.i(r0, r1, r2)
            Lc:
                com.amap.api.services.route.RouteSearchV2$FromAndTo r0 = new com.amap.api.services.route.RouteSearchV2$FromAndTo
                com.amap.api.services.core.LatLonPoint r1 = r3.a
                com.amap.api.services.core.LatLonPoint r2 = r3.f5529b
                r0.<init>(r1, r2)
                java.lang.String r1 = r3.f5530c
                r0.setStartPoiID(r1)
                java.lang.String r1 = r3.f5531d
                r0.setDestinationPoiID(r1)
                java.lang.String r1 = r3.f5532e
                r0.setOriginType(r1)
                java.lang.String r1 = r3.f5533f
                r0.setDestinationType(r1)
                return r0
        }

        /* renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ java.lang.Object m38clone() throws java.lang.CloneNotSupportedException {
                r1 = this;
                com.amap.api.services.route.RouteSearchV2$FromAndTo r0 = r1.clone()
                return r0
        }

        @Override // android.os.Parcelable
        public int describeContents() {
                r1 = this;
                r0 = 0
                return r0
        }

        public boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                r1 = 0
                if (r5 != 0) goto L8
                return r1
            L8:
                java.lang.Class r2 = r4.getClass()
                java.lang.Class r3 = r5.getClass()
                if (r2 == r3) goto L13
                return r1
            L13:
                com.amap.api.services.route.RouteSearchV2$FromAndTo r5 = (com.amap.api.services.route.RouteSearchV2.FromAndTo) r5
                java.lang.String r2 = r4.f5531d
                if (r2 != 0) goto L1e
                java.lang.String r2 = r5.f5531d
                if (r2 == 0) goto L27
                return r1
            L1e:
                java.lang.String r3 = r5.f5531d
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L27
                return r1
            L27:
                com.amap.api.services.core.LatLonPoint r2 = r4.a
                if (r2 != 0) goto L30
                com.amap.api.services.core.LatLonPoint r2 = r5.a
                if (r2 == 0) goto L39
                return r1
            L30:
                com.amap.api.services.core.LatLonPoint r3 = r5.a
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L39
                return r1
            L39:
                java.lang.String r2 = r4.f5530c
                if (r2 != 0) goto L42
                java.lang.String r2 = r5.f5530c
                if (r2 == 0) goto L4b
                return r1
            L42:
                java.lang.String r3 = r5.f5530c
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L4b
                return r1
            L4b:
                com.amap.api.services.core.LatLonPoint r2 = r4.f5529b
                if (r2 != 0) goto L54
                com.amap.api.services.core.LatLonPoint r2 = r5.f5529b
                if (r2 == 0) goto L5d
                return r1
            L54:
                com.amap.api.services.core.LatLonPoint r3 = r5.f5529b
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L5d
                return r1
            L5d:
                java.lang.String r2 = r4.f5532e
                if (r2 != 0) goto L66
                java.lang.String r2 = r5.f5532e
                if (r2 == 0) goto L6f
                return r1
            L66:
                java.lang.String r3 = r5.f5532e
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L6f
                return r1
            L6f:
                java.lang.String r2 = r4.f5533f
                if (r2 != 0) goto L78
                java.lang.String r5 = r5.f5533f
                if (r5 == 0) goto L81
                return r1
            L78:
                java.lang.String r5 = r5.f5533f
                boolean r5 = r2.equals(r5)
                if (r5 != 0) goto L81
                return r1
            L81:
                return r0
        }

        public java.lang.String getDestinationPoiID() {
                r1 = this;
                java.lang.String r0 = r1.f5531d
                return r0
        }

        public java.lang.String getDestinationType() {
                r1 = this;
                java.lang.String r0 = r1.f5533f
                return r0
        }

        public com.amap.api.services.core.LatLonPoint getFrom() {
                r1 = this;
                com.amap.api.services.core.LatLonPoint r0 = r1.a
                return r0
        }

        public java.lang.String getOriginType() {
                r1 = this;
                java.lang.String r0 = r1.f5532e
                return r0
        }

        public java.lang.String getPlateNumber() {
                r1 = this;
                java.lang.String r0 = r1.f5534g
                return r0
        }

        public java.lang.String getStartPoiID() {
                r1 = this;
                java.lang.String r0 = r1.f5530c
                return r0
        }

        public com.amap.api.services.core.LatLonPoint getTo() {
                r1 = this;
                com.amap.api.services.core.LatLonPoint r0 = r1.f5529b
                return r0
        }

        public int hashCode() {
                r3 = this;
                java.lang.String r0 = r3.f5531d
                r1 = 0
                if (r0 != 0) goto L7
                r0 = 0
                goto Lb
            L7:
                int r0 = r0.hashCode()
            Lb:
                int r0 = r0 + 31
                int r0 = r0 * 31
                com.amap.api.services.core.LatLonPoint r2 = r3.a
                if (r2 != 0) goto L15
                r2 = 0
                goto L19
            L15:
                int r2 = r2.hashCode()
            L19:
                int r0 = r0 + r2
                int r0 = r0 * 31
                java.lang.String r2 = r3.f5530c
                if (r2 != 0) goto L22
                r2 = 0
                goto L26
            L22:
                int r2 = r2.hashCode()
            L26:
                int r0 = r0 + r2
                int r0 = r0 * 31
                com.amap.api.services.core.LatLonPoint r2 = r3.f5529b
                if (r2 != 0) goto L2f
                r2 = 0
                goto L33
            L2f:
                int r2 = r2.hashCode()
            L33:
                int r0 = r0 + r2
                int r0 = r0 * 31
                java.lang.String r2 = r3.f5532e
                if (r2 != 0) goto L3c
                r2 = 0
                goto L40
            L3c:
                int r2 = r2.hashCode()
            L40:
                int r0 = r0 + r2
                int r0 = r0 * 31
                java.lang.String r2 = r3.f5533f
                if (r2 != 0) goto L48
                goto L4c
            L48:
                int r1 = r2.hashCode()
            L4c:
                int r0 = r0 + r1
                return r0
        }

        public void setDestinationPoiID(java.lang.String r1) {
                r0 = this;
                r0.f5531d = r1
                return
        }

        public void setDestinationType(java.lang.String r1) {
                r0 = this;
                r0.f5533f = r1
                return
        }

        public void setOriginType(java.lang.String r1) {
                r0 = this;
                r0.f5532e = r1
                return
        }

        public void setPlateNumber(java.lang.String r1) {
                r0 = this;
                r0.f5534g = r1
                return
        }

        public void setStartPoiID(java.lang.String r1) {
                r0 = this;
                r0.f5530c = r1
                return
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel r2, int r3) {
                r1 = this;
                com.amap.api.services.core.LatLonPoint r0 = r1.a
                r2.writeParcelable(r0, r3)
                com.amap.api.services.core.LatLonPoint r0 = r1.f5529b
                r2.writeParcelable(r0, r3)
                java.lang.String r3 = r1.f5530c
                r2.writeString(r3)
                java.lang.String r3 = r1.f5531d
                r2.writeString(r3)
                java.lang.String r3 = r1.f5532e
                r2.writeString(r3)
                java.lang.String r3 = r1.f5533f
                r2.writeString(r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class NewEnergy {
        private java.lang.String a;

        /* renamed from: b, reason: collision with root package name */
        private com.amap.api.services.route.RouteSearchV2.CustomCostMode f5535b;

        /* renamed from: c, reason: collision with root package name */
        private float f5536c;

        /* renamed from: d, reason: collision with root package name */
        private float f5537d;

        /* renamed from: e, reason: collision with root package name */
        private float f5538e;

        /* renamed from: f, reason: collision with root package name */
        private float f5539f;

        /* renamed from: g, reason: collision with root package name */
        private float f5540g;

        /* renamed from: h, reason: collision with root package name */
        private java.lang.String f5541h;

        /* renamed from: i, reason: collision with root package name */
        private int f5542i;

        public NewEnergy() {
                r1 = this;
                r1.<init>()
                r0 = -1082130432(0xffffffffbf800000, float:-1.0)
                r1.f5536c = r0
                r1.f5537d = r0
                r0 = 1069547520(0x3fc00000, float:1.5)
                r1.f5538e = r0
                r0 = 1120403456(0x42c80000, float:100.0)
                r1.f5539f = r0
                r0 = 0
                r1.f5540g = r0
                r0 = 0
                r1.f5542i = r0
                return
        }

        public java.lang.String buildParam() {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r3.a
                if (r1 == 0) goto L13
                java.lang.String r1 = "&key="
                r0.append(r1)
                java.lang.String r1 = r3.a
                r0.append(r1)
            L13:
                com.amap.api.services.route.RouteSearchV2$CustomCostMode r1 = r3.f5535b
                if (r1 == 0) goto L25
                java.lang.String r1 = "&custom_cost_mode="
                r0.append(r1)
                com.amap.api.services.route.RouteSearchV2$CustomCostMode r1 = r3.f5535b
                java.lang.String r1 = r1.toJson()
                r0.append(r1)
            L25:
                float r1 = r3.f5536c
                r2 = 0
                int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
                if (r1 <= 0) goto L36
                java.lang.String r1 = "&max_vehicle_charge="
                r0.append(r1)
                float r1 = r3.f5536c
                r0.append(r1)
            L36:
                float r1 = r3.f5537d
                int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
                if (r1 <= 0) goto L46
                java.lang.String r1 = "&vehicle_charge="
                r0.append(r1)
                float r1 = r3.f5537d
                r0.append(r1)
            L46:
                java.lang.String r1 = "&load="
                r0.append(r1)
                float r1 = r3.f5538e
                r0.append(r1)
                java.lang.String r1 = "&leaving_percent="
                r0.append(r1)
                float r1 = r3.f5539f
                r0.append(r1)
                java.lang.String r1 = "&arriving_percent="
                r0.append(r1)
                float r1 = r3.f5540g
                r0.append(r1)
                java.lang.String r1 = r3.f5541h
                if (r1 == 0) goto L72
                java.lang.String r1 = "&custom_charging_arguments="
                r0.append(r1)
                java.lang.String r1 = r3.f5541h
                r0.append(r1)
            L72:
                int r1 = r3.f5542i
                if (r1 <= 0) goto L80
                java.lang.String r1 = "&waypoints_arriving_percent="
                r0.append(r1)
                int r1 = r3.f5542i
                r0.append(r1)
            L80:
                java.lang.String r0 = r0.toString()
                return r0
        }

        public float getArrivingPercent() {
                r1 = this;
                float r0 = r1.f5540g
                return r0
        }

        public java.lang.String getCustomChargingArguments() {
                r1 = this;
                java.lang.String r0 = r1.f5541h
                return r0
        }

        public com.amap.api.services.route.RouteSearchV2.CustomCostMode getCustomCostMode() {
                r1 = this;
                com.amap.api.services.route.RouteSearchV2$CustomCostMode r0 = r1.f5535b
                return r0
        }

        public java.lang.String getKey() {
                r1 = this;
                java.lang.String r0 = r1.a
                return r0
        }

        public float getLeavingPercent() {
                r1 = this;
                float r0 = r1.f5539f
                return r0
        }

        public float getLoad() {
                r1 = this;
                float r0 = r1.f5538e
                return r0
        }

        public float getMaxVehicleCharge() {
                r1 = this;
                float r0 = r1.f5536c
                return r0
        }

        public float getVehicleCharge() {
                r1 = this;
                float r0 = r1.f5537d
                return r0
        }

        public int getWaypointsArrivingPercent() {
                r1 = this;
                int r0 = r1.f5542i
                return r0
        }

        public void setArrivingPercent(float r1) {
                r0 = this;
                r0.f5540g = r1
                return
        }

        public void setCustomChargingArguments(java.lang.String r1) {
                r0 = this;
                r0.f5541h = r1
                return
        }

        public void setCustomCostMode(com.amap.api.services.route.RouteSearchV2.CustomCostMode r1) {
                r0 = this;
                r0.f5535b = r1
                return
        }

        public void setKey(java.lang.String r1) {
                r0 = this;
                r0.a = r1
                return
        }

        public void setLeavingPercent(float r1) {
                r0 = this;
                r0.f5539f = r1
                return
        }

        public void setLoad(float r1) {
                r0 = this;
                r0.f5538e = r1
                return
        }

        public void setMaxVehicleCharge(float r1) {
                r0 = this;
                r0.f5536c = r1
                return
        }

        public void setVehicleCharge(float r1) {
                r0 = this;
                r0.f5537d = r1
                return
        }

        public void setWaypointsArrivingPercent(int r1) {
                r0 = this;
                r0.f5542i = r1
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface OnRoutePlanSearchListener {
        void onDriveRoutePlanSearched(com.amap.api.services.route.DriveRoutePlanResult r1, int r2);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface OnRouteSearchListener {
        void onBusRouteSearched(com.amap.api.services.route.BusRouteResultV2 r1, int r2);

        void onDriveRouteSearched(com.amap.api.services.route.DriveRouteResultV2 r1, int r2);

        void onRideRouteSearched(com.amap.api.services.route.RideRouteResultV2 r1, int r2);

        void onWalkRouteSearched(com.amap.api.services.route.WalkRouteResultV2 r1, int r2);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface OnTruckRouteSearchListener {
        void onTruckRouteSearched(com.amap.api.services.route.TruckRouteRestult r1, int r2);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class PowerTrainLoss {
        private int a;

        /* renamed from: b, reason: collision with root package name */
        private float f5543b;

        /* renamed from: c, reason: collision with root package name */
        private int f5544c;

        /* renamed from: d, reason: collision with root package name */
        private int f5545d;

        public PowerTrainLoss() {
                r0 = this;
                r0.<init>()
                return
        }

        public int getPowerDemand() {
                r1 = this;
                int r0 = r1.a
                return r0
        }

        public float getPowerDemandValue() {
                r1 = this;
                float r0 = r1.f5543b
                return r0
        }

        public int getSpeed() {
                r1 = this;
                int r0 = r1.f5544c
                return r0
        }

        public int getSpeedValue() {
                r1 = this;
                int r0 = r1.f5545d
                return r0
        }

        public void setPowerDemand(int r1) {
                r0 = this;
                r0.a = r1
                return
        }

        public void setPowerDemandValue(float r1) {
                r0 = this;
                r0.f5543b = r1
                return
        }

        public void setSpeed(int r1) {
                r0 = this;
                r0.f5544c = r1
                return
        }

        public void setSpeedValue(int r1) {
                r0 = this;
                r0.f5545d = r1
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class RideRouteQuery implements android.os.Parcelable, java.lang.Cloneable {
        public static final android.os.Parcelable.Creator<com.amap.api.services.route.RouteSearchV2.RideRouteQuery> CREATOR = null;
        private com.amap.api.services.route.RouteSearchV2.FromAndTo a;

        /* renamed from: b, reason: collision with root package name */
        private int f5546b;

        /* renamed from: c, reason: collision with root package name */
        private int f5547c;


        static {
                com.amap.api.services.route.RouteSearchV2$RideRouteQuery$1 r0 = new com.amap.api.services.route.RouteSearchV2$RideRouteQuery$1
                r0.<init>()
                com.amap.api.services.route.RouteSearchV2.RideRouteQuery.CREATOR = r0
                return
        }

        public RideRouteQuery() {
                r1 = this;
                r1.<init>()
                r0 = 1
                r1.f5546b = r0
                r1.f5547c = r0
                return
        }

        public RideRouteQuery(android.os.Parcel r2) {
                r1 = this;
                r1.<init>()
                r0 = 1
                r1.f5546b = r0
                r1.f5547c = r0
                java.lang.Class<com.amap.api.services.route.RouteSearch$FromAndTo> r0 = com.amap.api.services.route.RouteSearch.FromAndTo.class
                java.lang.ClassLoader r0 = r0.getClassLoader()
                android.os.Parcelable r0 = r2.readParcelable(r0)
                com.amap.api.services.route.RouteSearchV2$FromAndTo r0 = (com.amap.api.services.route.RouteSearchV2.FromAndTo) r0
                r1.a = r0
                int r0 = r2.readInt()
                r1.f5547c = r0
                int r2 = r2.readInt()
                r1.f5546b = r2
                return
        }

        public RideRouteQuery(com.amap.api.services.route.RouteSearchV2.FromAndTo r2) {
                r1 = this;
                r1.<init>()
                r0 = 1
                r1.f5546b = r0
                r1.f5547c = r0
                r1.a = r2
                return
        }

        public com.amap.api.services.route.RouteSearchV2.RideRouteQuery clone() {
                r3 = this;
                super.clone()     // Catch: java.lang.CloneNotSupportedException -> L4
                goto Lc
            L4:
                r0 = move-exception
                java.lang.String r1 = "RouteSearchV2"
                java.lang.String r2 = "RideRouteQueryclone"
                com.amap.api.col.s.j4.i(r0, r1, r2)
            Lc:
                com.amap.api.services.route.RouteSearchV2$RideRouteQuery r0 = new com.amap.api.services.route.RouteSearchV2$RideRouteQuery
                com.amap.api.services.route.RouteSearchV2$FromAndTo r1 = r3.a
                r0.<init>(r1)
                int r1 = r3.f5546b
                r0.setShowFields(r1)
                int r1 = r3.f5547c
                r0.setAlternativeRoute(r1)
                return r0
        }

        /* renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ java.lang.Object m39clone() throws java.lang.CloneNotSupportedException {
                r1 = this;
                com.amap.api.services.route.RouteSearchV2$RideRouteQuery r0 = r1.clone()
                return r0
        }

        @Override // android.os.Parcelable
        public int describeContents() {
                r1 = this;
                r0 = 0
                return r0
        }

        public boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                r1 = 0
                if (r5 != 0) goto L8
                return r1
            L8:
                java.lang.Class r2 = r4.getClass()
                java.lang.Class r3 = r5.getClass()
                if (r2 == r3) goto L13
                return r1
            L13:
                com.amap.api.services.route.RouteSearchV2$RideRouteQuery r5 = (com.amap.api.services.route.RouteSearchV2.RideRouteQuery) r5
                com.amap.api.services.route.RouteSearchV2$FromAndTo r2 = r4.a
                if (r2 != 0) goto L1e
                com.amap.api.services.route.RouteSearchV2$FromAndTo r2 = r5.a
                if (r2 == 0) goto L27
                return r1
            L1e:
                com.amap.api.services.route.RouteSearchV2$FromAndTo r3 = r5.a
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L27
                return r1
            L27:
                int r2 = r4.f5546b
                int r3 = r5.f5546b
                if (r2 == r3) goto L2e
                return r1
            L2e:
                int r2 = r4.f5547c
                int r5 = r5.f5547c
                if (r2 == r5) goto L35
                return r1
            L35:
                return r0
        }

        public int getAlternativeRoute() {
                r1 = this;
                int r0 = r1.f5547c
                return r0
        }

        public com.amap.api.services.route.RouteSearchV2.FromAndTo getFromAndTo() {
                r1 = this;
                com.amap.api.services.route.RouteSearchV2$FromAndTo r0 = r1.a
                return r0
        }

        public int getShowFields() {
                r1 = this;
                int r0 = r1.f5546b
                return r0
        }

        public int hashCode() {
                r2 = this;
                com.amap.api.services.route.RouteSearchV2$FromAndTo r0 = r2.a
                if (r0 != 0) goto L6
                r0 = 0
                goto La
            L6:
                int r0 = r0.hashCode()
            La:
                int r0 = r0 + 31
                int r0 = r0 * 31
                int r1 = r2.f5546b
                int r0 = r0 + r1
                int r0 = r0 * 31
                int r1 = r2.f5547c
                int r0 = r0 + r1
                return r0
        }

        public void setAlternativeRoute(int r1) {
                r0 = this;
                r0.f5547c = r1
                return
        }

        public void setShowFields(int r1) {
                r0 = this;
                r0.f5546b = r1
                return
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel r2, int r3) {
                r1 = this;
                com.amap.api.services.route.RouteSearchV2$FromAndTo r0 = r1.a
                r2.writeParcelable(r0, r3)
                int r3 = r1.f5547c
                r2.writeInt(r3)
                int r3 = r1.f5546b
                r2.writeInt(r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class ShowFields {
        public static final int ALL = -1;
        public static final int CHARGE_STATION_INFO = 64;
        public static final int CITIES = 8;
        public static final int COST = 1;
        public static final int ELEC_COSUME_INFO = 32;
        public static final int NAVI = 4;
        public static final int POLINE = 16;
        public static final int TMCS = 2;

        public ShowFields() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class SlopeCost {
        private float a;

        /* renamed from: b, reason: collision with root package name */
        private float f5548b;

        public SlopeCost() {
                r0 = this;
                r0.<init>()
                return
        }

        public float getDown() {
                r1 = this;
                float r0 = r1.f5548b
                return r0
        }

        public float getUp() {
                r1 = this;
                float r0 = r1.a
                return r0
        }

        public void setDown(float r1) {
                r0 = this;
                r0.f5548b = r1
                return
        }

        public void setUp(float r1) {
                r0 = this;
                r0.a = r1
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class SpeedCost {
        private int a;

        /* renamed from: b, reason: collision with root package name */
        private float f5549b;

        public SpeedCost() {
                r0 = this;
                r0.<init>()
                return
        }

        public int getSpeed() {
                r1 = this;
                int r0 = r1.a
                return r0
        }

        public float getValue() {
                r1 = this;
                float r0 = r1.f5549b
                return r0
        }

        public void setSpeed(int r1) {
                r0 = this;
                r0.a = r1
                return
        }

        public void setValue(float r1) {
                r0 = this;
                r0.f5549b = r1
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class TransCost {
        private float a;

        /* renamed from: b, reason: collision with root package name */
        private float f5550b;

        public TransCost() {
                r0 = this;
                r0.<init>()
                return
        }

        public float getAccess() {
                r1 = this;
                float r0 = r1.a
                return r0
        }

        public float getDecess() {
                r1 = this;
                float r0 = r1.f5550b
                return r0
        }

        public void setAccess(float r1) {
                r0 = this;
                r0.a = r1
                return
        }

        public void setDecess(float r1) {
                r0 = this;
                r0.f5550b = r1
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class WalkRouteQuery implements android.os.Parcelable, java.lang.Cloneable {
        public static final android.os.Parcelable.Creator<com.amap.api.services.route.RouteSearchV2.WalkRouteQuery> CREATOR = null;
        private com.amap.api.services.route.RouteSearchV2.FromAndTo a;

        /* renamed from: b, reason: collision with root package name */
        private int f5551b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f5552c;

        /* renamed from: d, reason: collision with root package name */
        private int f5553d;


        static {
                com.amap.api.services.route.RouteSearchV2$WalkRouteQuery$1 r0 = new com.amap.api.services.route.RouteSearchV2$WalkRouteQuery$1
                r0.<init>()
                com.amap.api.services.route.RouteSearchV2.WalkRouteQuery.CREATOR = r0
                return
        }

        public WalkRouteQuery() {
                r2 = this;
                r2.<init>()
                r0 = 1
                r2.f5551b = r0
                r1 = 0
                r2.f5552c = r1
                r2.f5553d = r0
                return
        }

        public WalkRouteQuery(android.os.Parcel r4) {
                r3 = this;
                r3.<init>()
                r0 = 1
                r3.f5551b = r0
                r1 = 0
                r3.f5552c = r1
                r3.f5553d = r0
                java.lang.Class<com.amap.api.services.route.RouteSearchV2$FromAndTo> r2 = com.amap.api.services.route.RouteSearchV2.FromAndTo.class
                java.lang.ClassLoader r2 = r2.getClassLoader()
                android.os.Parcelable r2 = r4.readParcelable(r2)
                com.amap.api.services.route.RouteSearchV2$FromAndTo r2 = (com.amap.api.services.route.RouteSearchV2.FromAndTo) r2
                r3.a = r2
                boolean[] r0 = new boolean[r0]
                r4.readBooleanArray(r0)
                boolean r0 = r0[r1]
                r3.f5552c = r0
                int r0 = r4.readInt()
                r3.f5553d = r0
                int r4 = r4.readInt()
                r3.f5551b = r4
                return
        }

        public WalkRouteQuery(com.amap.api.services.route.RouteSearchV2.FromAndTo r3) {
                r2 = this;
                r2.<init>()
                r0 = 1
                r2.f5551b = r0
                r1 = 0
                r2.f5552c = r1
                r2.f5553d = r0
                r2.a = r3
                return
        }

        public com.amap.api.services.route.RouteSearchV2.WalkRouteQuery clone() {
                r3 = this;
                super.clone()     // Catch: java.lang.CloneNotSupportedException -> L4
                goto Lc
            L4:
                r0 = move-exception
                java.lang.String r1 = "RouteSearchV2"
                java.lang.String r2 = "WalkRouteQueryclone"
                com.amap.api.col.s.j4.i(r0, r1, r2)
            Lc:
                com.amap.api.services.route.RouteSearchV2$WalkRouteQuery r0 = new com.amap.api.services.route.RouteSearchV2$WalkRouteQuery
                com.amap.api.services.route.RouteSearchV2$FromAndTo r1 = r3.a
                r0.<init>(r1)
                int r1 = r3.f5551b
                r0.setShowFields(r1)
                boolean r1 = r3.f5552c
                r0.setIndoor(r1)
                int r1 = r3.f5553d
                r0.setAlternativeRoute(r1)
                return r0
        }

        /* renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ java.lang.Object m40clone() throws java.lang.CloneNotSupportedException {
                r1 = this;
                com.amap.api.services.route.RouteSearchV2$WalkRouteQuery r0 = r1.clone()
                return r0
        }

        @Override // android.os.Parcelable
        public int describeContents() {
                r1 = this;
                r0 = 0
                return r0
        }

        public boolean equals(java.lang.Object r4) {
                r3 = this;
                if (r3 != r4) goto L4
                r4 = 1
                return r4
            L4:
                r0 = 0
                if (r4 == 0) goto L32
                java.lang.Class r1 = r3.getClass()
                java.lang.Class r2 = r4.getClass()
                if (r1 == r2) goto L12
                goto L32
            L12:
                com.amap.api.services.route.RouteSearchV2$WalkRouteQuery r4 = (com.amap.api.services.route.RouteSearchV2.WalkRouteQuery) r4
                int r1 = r3.f5551b
                int r2 = r4.f5551b
                if (r1 == r2) goto L1b
                return r0
            L1b:
                boolean r1 = r3.f5552c
                boolean r2 = r4.f5552c
                if (r1 == r2) goto L22
                return r0
            L22:
                int r1 = r3.f5553d
                int r2 = r4.f5553d
                if (r1 == r2) goto L29
                return r0
            L29:
                com.amap.api.services.route.RouteSearchV2$FromAndTo r0 = r3.a
                com.amap.api.services.route.RouteSearchV2$FromAndTo r4 = r4.a
                boolean r4 = r0.equals(r4)
                return r4
            L32:
                return r0
        }

        public int getAlternativeRoute() {
                r1 = this;
                int r0 = r1.f5553d
                return r0
        }

        public com.amap.api.services.route.RouteSearchV2.FromAndTo getFromAndTo() {
                r1 = this;
                com.amap.api.services.route.RouteSearchV2$FromAndTo r0 = r1.a
                return r0
        }

        public int getShowFields() {
                r1 = this;
                int r0 = r1.f5551b
                return r0
        }

        public int hashCode() {
                r2 = this;
                com.amap.api.services.route.RouteSearchV2$FromAndTo r0 = r2.a
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                int r1 = r2.f5551b
                int r0 = r0 + r1
                int r0 = r0 * 31
                boolean r1 = r2.f5552c
                int r0 = r0 + r1
                int r0 = r0 * 31
                int r1 = r2.f5553d
                int r0 = r0 + r1
                return r0
        }

        public boolean isIndoor() {
                r1 = this;
                boolean r0 = r1.f5552c
                return r0
        }

        public void setAlternativeRoute(int r1) {
                r0 = this;
                r0.f5553d = r1
                return
        }

        public void setIndoor(boolean r1) {
                r0 = this;
                r0.f5552c = r1
                return
        }

        public void setShowFields(int r1) {
                r0 = this;
                r0.f5551b = r1
                return
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel r3, int r4) {
                r2 = this;
                com.amap.api.services.route.RouteSearchV2$FromAndTo r0 = r2.a
                r3.writeParcelable(r0, r4)
                boolean r4 = r2.f5552c
                r0 = 1
                boolean[] r0 = new boolean[r0]
                r1 = 0
                r0[r1] = r4
                r3.writeBooleanArray(r0)
                int r4 = r2.f5553d
                r3.writeInt(r4)
                int r4 = r2.f5551b
                r3.writeInt(r4)
                return
        }
    }

    public RouteSearchV2(android.content.Context r2) throws com.amap.api.services.core.AMapException {
            r1 = this;
            r1.<init>()
            com.amap.api.services.interfaces.IRouteSearchV2 r0 = r1.a
            if (r0 != 0) goto L18
            com.amap.api.col.s.u0 r0 = new com.amap.api.col.s.u0     // Catch: java.lang.Exception -> Lf
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

    public com.amap.api.services.route.BusRouteResultV2 calculateBusRoute(com.amap.api.services.route.RouteSearchV2.BusRouteQuery r2) throws com.amap.api.services.core.AMapException {
            r1 = this;
            com.amap.api.services.interfaces.IRouteSearchV2 r0 = r1.a
            if (r0 == 0) goto L9
            com.amap.api.services.route.BusRouteResultV2 r2 = r0.calculateBusRoute(r2)
            return r2
        L9:
            r2 = 0
            return r2
    }

    public void calculateBusRouteAsyn(com.amap.api.services.route.RouteSearchV2.BusRouteQuery r2) {
            r1 = this;
            com.amap.api.services.interfaces.IRouteSearchV2 r0 = r1.a
            if (r0 == 0) goto L7
            r0.calculateBusRouteAsyn(r2)
        L7:
            return
    }

    public com.amap.api.services.route.DriveRouteResultV2 calculateDriveRoute(com.amap.api.services.route.RouteSearchV2.DriveRouteQuery r2) throws com.amap.api.services.core.AMapException {
            r1 = this;
            com.amap.api.services.interfaces.IRouteSearchV2 r0 = r1.a
            if (r0 == 0) goto L9
            com.amap.api.services.route.DriveRouteResultV2 r2 = r0.calculateDriveRoute(r2)
            return r2
        L9:
            r2 = 0
            return r2
    }

    public void calculateDriveRouteAsyn(com.amap.api.services.route.RouteSearchV2.DriveRouteQuery r2) {
            r1 = this;
            com.amap.api.services.interfaces.IRouteSearchV2 r0 = r1.a
            if (r0 == 0) goto L7
            r0.calculateDriveRouteAsyn(r2)
        L7:
            return
    }

    public com.amap.api.services.route.RideRouteResultV2 calculateRideRoute(com.amap.api.services.route.RouteSearchV2.RideRouteQuery r2) throws com.amap.api.services.core.AMapException {
            r1 = this;
            com.amap.api.services.interfaces.IRouteSearchV2 r0 = r1.a
            if (r0 == 0) goto L9
            com.amap.api.services.route.RideRouteResultV2 r2 = r0.calculateRideRoute(r2)
            return r2
        L9:
            r2 = 0
            return r2
    }

    public void calculateRideRouteAsyn(com.amap.api.services.route.RouteSearchV2.RideRouteQuery r2) {
            r1 = this;
            com.amap.api.services.interfaces.IRouteSearchV2 r0 = r1.a
            if (r0 == 0) goto L7
            r0.calculateRideRouteAsyn(r2)
        L7:
            return
    }

    public com.amap.api.services.route.WalkRouteResultV2 calculateWalkRoute(com.amap.api.services.route.RouteSearchV2.WalkRouteQuery r2) throws com.amap.api.services.core.AMapException {
            r1 = this;
            com.amap.api.services.interfaces.IRouteSearchV2 r0 = r1.a
            if (r0 == 0) goto L9
            com.amap.api.services.route.WalkRouteResultV2 r2 = r0.calculateWalkRoute(r2)
            return r2
        L9:
            r2 = 0
            return r2
    }

    public void calculateWalkRouteAsyn(com.amap.api.services.route.RouteSearchV2.WalkRouteQuery r2) {
            r1 = this;
            com.amap.api.services.interfaces.IRouteSearchV2 r0 = r1.a
            if (r0 == 0) goto L7
            r0.calculateWalkRouteAsyn(r2)
        L7:
            return
    }

    public void setRouteSearchListener(com.amap.api.services.route.RouteSearchV2.OnRouteSearchListener r2) {
            r1 = this;
            com.amap.api.services.interfaces.IRouteSearchV2 r0 = r1.a
            if (r0 == 0) goto L7
            r0.setRouteSearchListener(r2)
        L7:
            return
    }
}

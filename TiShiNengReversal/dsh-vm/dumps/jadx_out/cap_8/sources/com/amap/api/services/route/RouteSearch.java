package com.amap.api.services.route;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class RouteSearch {
    public static final int BUS_COMFORTABLE = 4;
    public static final int BUS_DEFAULT = 0;
    public static final int BUS_LEASE_CHANGE = 2;
    public static final int BUS_LEASE_WALK = 3;
    public static final int BUS_NO_SUBWAY = 5;
    public static final int BUS_SAVE_MONEY = 1;
    public static final int BusComfortable = 4;
    public static final int BusDefault = 0;
    public static final int BusLeaseChange = 2;
    public static final int BusLeaseWalk = 3;
    public static final int BusNoSubway = 5;
    public static final int BusSaveMoney = 1;
    public static final int DRIVEING_PLAN_AVOID_CONGESTION_CHOICE_HIGHWAY = 9;
    public static final int DRIVEING_PLAN_AVOID_CONGESTION_FASTEST_SAVE_MONEY = 11;
    public static final int DRIVEING_PLAN_AVOID_CONGESTION_NO_HIGHWAY = 4;
    public static final int DRIVEING_PLAN_AVOID_CONGESTION_SAVE_MONEY = 6;
    public static final int DRIVEING_PLAN_AVOID_CONGESTION_SAVE_MONEY_NO_HIGHWAY = 7;
    public static final int DRIVEING_PLAN_CHOICE_HIGHWAY = 8;
    public static final int DRIVEING_PLAN_DEFAULT = 1;
    public static final int DRIVEING_PLAN_FASTEST_SHORTEST = 10;
    public static final int DRIVEING_PLAN_NO_HIGHWAY = 2;
    public static final int DRIVEING_PLAN_SAVE_MONEY = 3;
    public static final int DRIVEING_PLAN_SAVE_MONEY_NO_HIGHWAY = 5;
    public static final java.lang.String DRIVING_EXCLUDE_FERRY = "ferry";
    public static final java.lang.String DRIVING_EXCLUDE_MOTORWAY = "motorway";
    public static final java.lang.String DRIVING_EXCLUDE_TOLL = "toll";
    public static final int DRIVING_MULTI_CHOICE_AVOID_CONGESTION = 12;
    public static final int DRIVING_MULTI_CHOICE_AVOID_CONGESTION_NO_HIGHWAY = 15;
    public static final int DRIVING_MULTI_CHOICE_AVOID_CONGESTION_NO_HIGHWAY_SAVE_MONEY = 18;
    public static final int DRIVING_MULTI_CHOICE_AVOID_CONGESTION_SAVE_MONEY = 17;
    public static final int DRIVING_MULTI_CHOICE_HIGHWAY = 19;
    public static final int DRIVING_MULTI_CHOICE_HIGHWAY_AVOID_CONGESTION = 20;
    public static final int DRIVING_MULTI_CHOICE_NO_HIGHWAY = 13;
    public static final int DRIVING_MULTI_CHOICE_SAVE_MONEY = 14;
    public static final int DRIVING_MULTI_CHOICE_SAVE_MONEY_NO_HIGHWAY = 16;
    public static final int DRIVING_MULTI_STRATEGY_FASTEST_SAVE_MONEY_SHORTEST = 5;
    public static final int DRIVING_MULTI_STRATEGY_FASTEST_SHORTEST = 11;
    public static final int DRIVING_MULTI_STRATEGY_FASTEST_SHORTEST_AVOID_CONGESTION = 10;
    public static final int DRIVING_NORMAL_CAR = 0;
    public static final int DRIVING_PLUGIN_HYBRID_CAR = 2;
    public static final int DRIVING_PURE_ELECTRIC_VEHICLE = 1;
    public static final int DRIVING_SINGLE_AVOID_CONGESTION = 4;
    public static final int DRIVING_SINGLE_DEFAULT = 0;
    public static final int DRIVING_SINGLE_NO_EXPRESSWAYS = 3;
    public static final int DRIVING_SINGLE_NO_HIGHWAY = 6;
    public static final int DRIVING_SINGLE_NO_HIGHWAY_SAVE_MONEY = 7;
    public static final int DRIVING_SINGLE_NO_HIGHWAY_SAVE_MONEY_AVOID_CONGESTION = 9;
    public static final int DRIVING_SINGLE_SAVE_MONEY = 1;
    public static final int DRIVING_SINGLE_SAVE_MONEY_AVOID_CONGESTION = 8;
    public static final int DRIVING_SINGLE_SHORTEST = 2;
    public static final int DrivingAvoidCongestion = 4;
    public static final int DrivingDefault = 0;
    public static final int DrivingMultiStrategy = 5;
    public static final int DrivingNoExpressways = 3;
    public static final int DrivingNoHighAvoidCongestionSaveMoney = 9;
    public static final int DrivingNoHighWay = 6;
    public static final int DrivingNoHighWaySaveMoney = 7;
    public static final int DrivingSaveMoney = 1;
    public static final int DrivingSaveMoneyAvoidCongestion = 8;
    public static final int DrivingShortDistance = 2;
    public static final java.lang.String EXTENSIONS_ALL = "all";
    public static final java.lang.String EXTENSIONS_BASE = "base";
    public static final int RIDING_DEFAULT = 0;
    public static final int RIDING_FAST = 2;
    public static final int RIDING_RECOMMEND = 1;
    public static final int RidingDefault = 0;
    public static final int RidingFast = 2;
    public static final int RidingRecommend = 1;
    public static final int TRUCK_AVOID_CONGESTION = 1;
    public static final int TRUCK_AVOID_CONGESTION_CHOICE_HIGHWAY = 9;
    public static final int TRUCK_AVOID_CONGESTION_NO_HIGHWAY = 4;
    public static final int TRUCK_AVOID_CONGESTION__SAVE_MONEY = 6;
    public static final int TRUCK_AVOID_CONGESTION__SAVE_MONEY_NO_HIGHWAY = 7;
    public static final int TRUCK_CHOICE_HIGHWAY = 8;
    public static final int TRUCK_NO_HIGHWAY = 2;
    public static final int TRUCK_SAVE_MONEY = 3;
    public static final int TRUCK_SAVE_MONEY_NO_HIGHWAY = 5;
    public static final int TRUCK_SIZE_HEAVY = 4;
    public static final int TRUCK_SIZE_LIGHT = 2;
    public static final int TRUCK_SIZE_MEDIUM = 3;
    public static final int TRUCK_SIZE_MINI = 1;
    public static final int WALK_DEFAULT = 0;
    public static final int WALK_MULTI_PATH = 1;
    public static final int WalkDefault = 0;
    public static final int WalkMultipath = 1;
    private com.amap.api.services.interfaces.IRouteSearch a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class BusRouteQuery implements android.os.Parcelable, java.lang.Cloneable {
        public static final android.os.Parcelable.Creator<com.amap.api.services.route.RouteSearch.BusRouteQuery> CREATOR = null;
        private com.amap.api.services.route.RouteSearch.FromAndTo a;

        /* renamed from: b, reason: collision with root package name */
        private int f5463b;

        /* renamed from: c, reason: collision with root package name */
        private java.lang.String f5464c;

        /* renamed from: d, reason: collision with root package name */
        private java.lang.String f5465d;

        /* renamed from: e, reason: collision with root package name */
        private int f5466e;

        /* renamed from: f, reason: collision with root package name */
        private java.lang.String f5467f;


        static {
                com.amap.api.services.route.RouteSearch$BusRouteQuery$1 r0 = new com.amap.api.services.route.RouteSearch$BusRouteQuery$1
                r0.<init>()
                com.amap.api.services.route.RouteSearch.BusRouteQuery.CREATOR = r0
                return
        }

        public BusRouteQuery() {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "base"
                r1.f5467f = r0
                return
        }

        public BusRouteQuery(android.os.Parcel r2) {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "base"
                r1.f5467f = r0
                java.lang.Class<com.amap.api.services.route.RouteSearch$FromAndTo> r0 = com.amap.api.services.route.RouteSearch.FromAndTo.class
                java.lang.ClassLoader r0 = r0.getClassLoader()
                android.os.Parcelable r0 = r2.readParcelable(r0)
                com.amap.api.services.route.RouteSearch$FromAndTo r0 = (com.amap.api.services.route.RouteSearch.FromAndTo) r0
                r1.a = r0
                int r0 = r2.readInt()
                r1.f5463b = r0
                java.lang.String r0 = r2.readString()
                r1.f5464c = r0
                int r0 = r2.readInt()
                r1.f5466e = r0
                java.lang.String r0 = r2.readString()
                r1.f5465d = r0
                java.lang.String r2 = r2.readString()
                r1.f5467f = r2
                return
        }

        public BusRouteQuery(com.amap.api.services.route.RouteSearch.FromAndTo r2, int r3, java.lang.String r4, int r5) {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "base"
                r1.f5467f = r0
                r1.a = r2
                r1.f5463b = r3
                r1.f5464c = r4
                r1.f5466e = r5
                return
        }

        public com.amap.api.services.route.RouteSearch.BusRouteQuery clone() {
                r5 = this;
                super.clone()     // Catch: java.lang.CloneNotSupportedException -> L4
                goto Lc
            L4:
                r0 = move-exception
                java.lang.String r1 = "RouteSearch"
                java.lang.String r2 = "BusRouteQueryclone"
                com.amap.api.col.s.j4.i(r0, r1, r2)
            Lc:
                com.amap.api.services.route.RouteSearch$BusRouteQuery r0 = new com.amap.api.services.route.RouteSearch$BusRouteQuery
                com.amap.api.services.route.RouteSearch$FromAndTo r1 = r5.a
                int r2 = r5.f5463b
                java.lang.String r3 = r5.f5464c
                int r4 = r5.f5466e
                r0.<init>(r1, r2, r3, r4)
                java.lang.String r1 = r5.f5465d
                r0.setCityd(r1)
                java.lang.String r1 = r5.f5467f
                r0.setExtensions(r1)
                return r0
        }

        /* renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ java.lang.Object m29clone() throws java.lang.CloneNotSupportedException {
                r1 = this;
                com.amap.api.services.route.RouteSearch$BusRouteQuery r0 = r1.clone()
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
                com.amap.api.services.route.RouteSearch$BusRouteQuery r5 = (com.amap.api.services.route.RouteSearch.BusRouteQuery) r5
                java.lang.String r2 = r4.f5464c
                if (r2 != 0) goto L1e
                java.lang.String r2 = r5.f5464c
                if (r2 == 0) goto L27
                return r1
            L1e:
                java.lang.String r3 = r5.f5464c
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L27
                return r1
            L27:
                java.lang.String r2 = r4.f5465d
                if (r2 != 0) goto L30
                java.lang.String r2 = r5.f5465d
                if (r2 == 0) goto L39
                return r1
            L30:
                java.lang.String r3 = r5.f5465d
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L39
                return r1
            L39:
                java.lang.String r2 = r4.f5467f
                if (r2 != 0) goto L42
                java.lang.String r2 = r5.f5467f
                if (r2 == 0) goto L4b
                return r1
            L42:
                java.lang.String r3 = r5.f5467f
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L4b
                return r1
            L4b:
                com.amap.api.services.route.RouteSearch$FromAndTo r2 = r4.a
                if (r2 != 0) goto L54
                com.amap.api.services.route.RouteSearch$FromAndTo r2 = r5.a
                if (r2 == 0) goto L5d
                return r1
            L54:
                com.amap.api.services.route.RouteSearch$FromAndTo r3 = r5.a
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L5d
                return r1
            L5d:
                int r2 = r4.f5463b
                int r3 = r5.f5463b
                if (r2 == r3) goto L64
                return r1
            L64:
                int r2 = r4.f5466e
                int r5 = r5.f5466e
                if (r2 == r5) goto L6b
                return r1
            L6b:
                return r0
        }

        public java.lang.String getCity() {
                r1 = this;
                java.lang.String r0 = r1.f5464c
                return r0
        }

        public java.lang.String getCityd() {
                r1 = this;
                java.lang.String r0 = r1.f5465d
                return r0
        }

        public java.lang.String getExtensions() {
                r1 = this;
                java.lang.String r0 = r1.f5467f
                return r0
        }

        public com.amap.api.services.route.RouteSearch.FromAndTo getFromAndTo() {
                r1 = this;
                com.amap.api.services.route.RouteSearch$FromAndTo r0 = r1.a
                return r0
        }

        public int getMode() {
                r1 = this;
                int r0 = r1.f5463b
                return r0
        }

        public int getNightFlag() {
                r1 = this;
                int r0 = r1.f5466e
                return r0
        }

        public int hashCode() {
                r3 = this;
                java.lang.String r0 = r3.f5464c
                r1 = 0
                if (r0 != 0) goto L7
                r0 = 0
                goto Lb
            L7:
                int r0 = r0.hashCode()
            Lb:
                int r0 = r0 + 31
                int r0 = r0 * 31
                com.amap.api.services.route.RouteSearch$FromAndTo r2 = r3.a
                if (r2 != 0) goto L15
                r2 = 0
                goto L19
            L15:
                int r2 = r2.hashCode()
            L19:
                int r0 = r0 + r2
                int r0 = r0 * 31
                int r2 = r3.f5463b
                int r0 = r0 + r2
                int r0 = r0 * 31
                int r2 = r3.f5466e
                int r0 = r0 + r2
                int r0 = r0 * 31
                java.lang.String r2 = r3.f5465d
                if (r2 != 0) goto L2b
                goto L2f
            L2b:
                int r1 = r2.hashCode()
            L2f:
                int r0 = r0 + r1
                return r0
        }

        public void setCityd(java.lang.String r1) {
                r0 = this;
                r0.f5465d = r1
                return
        }

        public void setExtensions(java.lang.String r1) {
                r0 = this;
                r0.f5467f = r1
                return
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel r2, int r3) {
                r1 = this;
                com.amap.api.services.route.RouteSearch$FromAndTo r0 = r1.a
                r2.writeParcelable(r0, r3)
                int r3 = r1.f5463b
                r2.writeInt(r3)
                java.lang.String r3 = r1.f5464c
                r2.writeString(r3)
                int r3 = r1.f5466e
                r2.writeInt(r3)
                java.lang.String r3 = r1.f5465d
                r2.writeString(r3)
                java.lang.String r3 = r1.f5467f
                r2.writeString(r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class DrivePlanQuery implements android.os.Parcelable, java.lang.Cloneable {
        public static final android.os.Parcelable.Creator<com.amap.api.services.route.RouteSearch.DrivePlanQuery> CREATOR = null;
        private com.amap.api.services.route.RouteSearch.FromAndTo a;

        /* renamed from: b, reason: collision with root package name */
        private java.lang.String f5468b;

        /* renamed from: c, reason: collision with root package name */
        private int f5469c;

        /* renamed from: d, reason: collision with root package name */
        private int f5470d;

        /* renamed from: e, reason: collision with root package name */
        private int f5471e;

        /* renamed from: f, reason: collision with root package name */
        private int f5472f;

        /* renamed from: g, reason: collision with root package name */
        private int f5473g;


        static {
                com.amap.api.services.route.RouteSearch$DrivePlanQuery$1 r0 = new com.amap.api.services.route.RouteSearch$DrivePlanQuery$1
                r0.<init>()
                com.amap.api.services.route.RouteSearch.DrivePlanQuery.CREATOR = r0
                return
        }

        public DrivePlanQuery() {
                r1 = this;
                r1.<init>()
                r0 = 1
                r1.f5469c = r0
                r0 = 0
                r1.f5470d = r0
                r1.f5471e = r0
                r1.f5472f = r0
                r0 = 48
                r1.f5473g = r0
                return
        }

        protected DrivePlanQuery(android.os.Parcel r2) {
                r1 = this;
                r1.<init>()
                r0 = 1
                r1.f5469c = r0
                r0 = 0
                r1.f5470d = r0
                r1.f5471e = r0
                r1.f5472f = r0
                r0 = 48
                r1.f5473g = r0
                java.lang.Class<com.amap.api.services.route.RouteSearch$FromAndTo> r0 = com.amap.api.services.route.RouteSearch.FromAndTo.class
                java.lang.ClassLoader r0 = r0.getClassLoader()
                android.os.Parcelable r0 = r2.readParcelable(r0)
                com.amap.api.services.route.RouteSearch$FromAndTo r0 = (com.amap.api.services.route.RouteSearch.FromAndTo) r0
                r1.a = r0
                java.lang.String r0 = r2.readString()
                r1.f5468b = r0
                int r0 = r2.readInt()
                r1.f5469c = r0
                int r0 = r2.readInt()
                r1.f5470d = r0
                int r0 = r2.readInt()
                r1.f5471e = r0
                int r0 = r2.readInt()
                r1.f5472f = r0
                int r2 = r2.readInt()
                r1.f5473g = r2
                return
        }

        public DrivePlanQuery(com.amap.api.services.route.RouteSearch.FromAndTo r2, int r3, int r4, int r5) {
                r1 = this;
                r1.<init>()
                r0 = 1
                r1.f5469c = r0
                r0 = 0
                r1.f5470d = r0
                r1.a = r2
                r1.f5471e = r3
                r1.f5472f = r4
                r1.f5473g = r5
                return
        }

        public com.amap.api.services.route.RouteSearch.DrivePlanQuery clone() {
                r5 = this;
                super.clone()     // Catch: java.lang.CloneNotSupportedException -> L4
                goto Lc
            L4:
                r0 = move-exception
                java.lang.String r1 = "RouteSearch"
                java.lang.String r2 = "DriveRouteQueryclone"
                com.amap.api.col.s.j4.i(r0, r1, r2)
            Lc:
                com.amap.api.services.route.RouteSearch$DrivePlanQuery r0 = new com.amap.api.services.route.RouteSearch$DrivePlanQuery
                com.amap.api.services.route.RouteSearch$FromAndTo r1 = r5.a
                int r2 = r5.f5471e
                int r3 = r5.f5472f
                int r4 = r5.f5473g
                r0.<init>(r1, r2, r3, r4)
                java.lang.String r1 = r5.f5468b
                r0.setDestParentPoiID(r1)
                int r1 = r5.f5469c
                r0.setMode(r1)
                int r1 = r5.f5470d
                r0.setCarType(r1)
                return r0
        }

        /* renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ java.lang.Object m30clone() throws java.lang.CloneNotSupportedException {
                r1 = this;
                com.amap.api.services.route.RouteSearch$DrivePlanQuery r0 = r1.clone()
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
                com.amap.api.services.route.RouteSearch$DrivePlanQuery r5 = (com.amap.api.services.route.RouteSearch.DrivePlanQuery) r5
                com.amap.api.services.route.RouteSearch$FromAndTo r2 = r4.a
                if (r2 != 0) goto L1e
                com.amap.api.services.route.RouteSearch$FromAndTo r2 = r5.a
                if (r2 == 0) goto L27
                return r1
            L1e:
                com.amap.api.services.route.RouteSearch$FromAndTo r3 = r5.a
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L27
                return r1
            L27:
                java.lang.String r2 = r4.f5468b
                if (r2 != 0) goto L30
                java.lang.String r2 = r5.f5468b
                if (r2 == 0) goto L39
                return r1
            L30:
                java.lang.String r3 = r5.f5468b
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L39
                return r1
            L39:
                int r2 = r4.f5469c
                int r3 = r5.f5469c
                if (r2 == r3) goto L40
                return r1
            L40:
                int r2 = r4.f5470d
                int r3 = r5.f5470d
                if (r2 == r3) goto L47
                return r1
            L47:
                int r2 = r4.f5471e
                int r3 = r5.f5471e
                if (r2 == r3) goto L4e
                return r1
            L4e:
                int r2 = r4.f5472f
                int r3 = r5.f5472f
                if (r2 == r3) goto L55
                return r1
            L55:
                int r2 = r4.f5473g
                int r5 = r5.f5473g
                if (r2 == r5) goto L5c
                return r1
            L5c:
                return r0
        }

        public int getCarType() {
                r1 = this;
                int r0 = r1.f5470d
                return r0
        }

        public int getCount() {
                r1 = this;
                int r0 = r1.f5473g
                return r0
        }

        public java.lang.String getDestParentPoiID() {
                r1 = this;
                java.lang.String r0 = r1.f5468b
                return r0
        }

        public int getFirstTime() {
                r1 = this;
                int r0 = r1.f5471e
                return r0
        }

        public com.amap.api.services.route.RouteSearch.FromAndTo getFromAndTo() {
                r1 = this;
                com.amap.api.services.route.RouteSearch$FromAndTo r0 = r1.a
                return r0
        }

        public int getInterval() {
                r1 = this;
                int r0 = r1.f5472f
                return r0
        }

        public int getMode() {
                r1 = this;
                int r0 = r1.f5469c
                return r0
        }

        public int hashCode() {
                r3 = this;
                com.amap.api.services.route.RouteSearch$FromAndTo r0 = r3.a
                r1 = 0
                if (r0 != 0) goto L7
                r0 = 0
                goto Lb
            L7:
                int r0 = r0.hashCode()
            Lb:
                int r0 = r0 + 31
                int r0 = r0 * 31
                java.lang.String r2 = r3.f5468b
                if (r2 != 0) goto L14
                goto L18
            L14:
                int r1 = r2.hashCode()
            L18:
                int r0 = r0 + r1
                int r0 = r0 * 31
                int r1 = r3.f5469c
                int r0 = r0 + r1
                int r0 = r0 * 31
                int r1 = r3.f5470d
                int r0 = r0 + r1
                int r0 = r0 * 31
                int r1 = r3.f5471e
                int r0 = r0 + r1
                int r0 = r0 * 31
                int r1 = r3.f5472f
                int r0 = r0 + r1
                int r0 = r0 * 31
                int r1 = r3.f5473g
                int r0 = r0 + r1
                return r0
        }

        public void setCarType(int r1) {
                r0 = this;
                r0.f5470d = r1
                return
        }

        public void setDestParentPoiID(java.lang.String r1) {
                r0 = this;
                r0.f5468b = r1
                return
        }

        public void setMode(int r1) {
                r0 = this;
                r0.f5469c = r1
                return
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel r2, int r3) {
                r1 = this;
                com.amap.api.services.route.RouteSearch$FromAndTo r0 = r1.a
                r2.writeParcelable(r0, r3)
                java.lang.String r3 = r1.f5468b
                r2.writeString(r3)
                int r3 = r1.f5469c
                r2.writeInt(r3)
                int r3 = r1.f5470d
                r2.writeInt(r3)
                int r3 = r1.f5471e
                r2.writeInt(r3)
                int r3 = r1.f5472f
                r2.writeInt(r3)
                int r3 = r1.f5473g
                r2.writeInt(r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class DriveRouteQuery implements android.os.Parcelable, java.lang.Cloneable {
        public static final android.os.Parcelable.Creator<com.amap.api.services.route.RouteSearch.DriveRouteQuery> CREATOR = null;
        private com.amap.api.services.route.RouteSearch.FromAndTo a;

        /* renamed from: b, reason: collision with root package name */
        private int f5474b;

        /* renamed from: c, reason: collision with root package name */
        private java.util.List<com.amap.api.services.core.LatLonPoint> f5475c;

        /* renamed from: d, reason: collision with root package name */
        private java.util.List<java.util.List<com.amap.api.services.core.LatLonPoint>> f5476d;

        /* renamed from: e, reason: collision with root package name */
        private java.lang.String f5477e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f5478f;

        /* renamed from: g, reason: collision with root package name */
        private int f5479g;

        /* renamed from: h, reason: collision with root package name */
        private java.lang.String f5480h;

        /* renamed from: i, reason: collision with root package name */
        private java.lang.String f5481i;


        static {
                com.amap.api.services.route.RouteSearch$DriveRouteQuery$1 r0 = new com.amap.api.services.route.RouteSearch$DriveRouteQuery$1
                r0.<init>()
                com.amap.api.services.route.RouteSearch.DriveRouteQuery.CREATOR = r0
                return
        }

        public DriveRouteQuery() {
                r1 = this;
                r1.<init>()
                r0 = 1
                r1.f5478f = r0
                r0 = 0
                r1.f5479g = r0
                r0 = 0
                r1.f5480h = r0
                java.lang.String r0 = "base"
                r1.f5481i = r0
                return
        }

        public DriveRouteQuery(android.os.Parcel r7) {
                r6 = this;
                r6.<init>()
                r0 = 1
                r6.f5478f = r0
                r1 = 0
                r6.f5479g = r1
                r2 = 0
                r6.f5480h = r2
                java.lang.String r3 = "base"
                r6.f5481i = r3
                java.lang.Class<com.amap.api.services.route.RouteSearch$FromAndTo> r3 = com.amap.api.services.route.RouteSearch.FromAndTo.class
                java.lang.ClassLoader r3 = r3.getClassLoader()
                android.os.Parcelable r3 = r7.readParcelable(r3)
                com.amap.api.services.route.RouteSearch$FromAndTo r3 = (com.amap.api.services.route.RouteSearch.FromAndTo) r3
                r6.a = r3
                int r3 = r7.readInt()
                r6.f5474b = r3
                android.os.Parcelable$Creator<com.amap.api.services.core.LatLonPoint> r3 = com.amap.api.services.core.LatLonPoint.CREATOR
                java.util.ArrayList r3 = r7.createTypedArrayList(r3)
                r6.f5475c = r3
                int r3 = r7.readInt()
                if (r3 != 0) goto L35
                r6.f5476d = r2
                goto L3c
            L35:
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                r6.f5476d = r2
            L3c:
                r2 = 0
            L3d:
                if (r2 >= r3) goto L4d
                java.util.List<java.util.List<com.amap.api.services.core.LatLonPoint>> r4 = r6.f5476d
                android.os.Parcelable$Creator<com.amap.api.services.core.LatLonPoint> r5 = com.amap.api.services.core.LatLonPoint.CREATOR
                java.util.ArrayList r5 = r7.createTypedArrayList(r5)
                r4.add(r5)
                int r2 = r2 + 1
                goto L3d
            L4d:
                java.lang.String r2 = r7.readString()
                r6.f5477e = r2
                int r2 = r7.readInt()
                if (r2 != r0) goto L5a
                goto L5b
            L5a:
                r0 = 0
            L5b:
                r6.f5478f = r0
                int r0 = r7.readInt()
                r6.f5479g = r0
                java.lang.String r0 = r7.readString()
                r6.f5480h = r0
                java.lang.String r7 = r7.readString()
                r6.f5481i = r7
                return
        }

        public DriveRouteQuery(com.amap.api.services.route.RouteSearch.FromAndTo r2, int r3, java.util.List<com.amap.api.services.core.LatLonPoint> r4, java.util.List<java.util.List<com.amap.api.services.core.LatLonPoint>> r5, java.lang.String r6) {
                r1 = this;
                r1.<init>()
                r0 = 1
                r1.f5478f = r0
                r0 = 0
                r1.f5479g = r0
                r0 = 0
                r1.f5480h = r0
                java.lang.String r0 = "base"
                r1.f5481i = r0
                r1.a = r2
                r1.f5474b = r3
                r1.f5475c = r4
                r1.f5476d = r5
                r1.f5477e = r6
                return
        }

        public com.amap.api.services.route.RouteSearch.DriveRouteQuery clone() {
                r9 = this;
                super.clone()     // Catch: java.lang.CloneNotSupportedException -> L4
                goto Lc
            L4:
                r0 = move-exception
                java.lang.String r1 = "RouteSearch"
                java.lang.String r2 = "DriveRouteQueryclone"
                com.amap.api.col.s.j4.i(r0, r1, r2)
            Lc:
                com.amap.api.services.route.RouteSearch$DriveRouteQuery r3 = new com.amap.api.services.route.RouteSearch$DriveRouteQuery
                com.amap.api.services.route.RouteSearch$FromAndTo r4 = r9.a
                int r5 = r9.f5474b
                java.util.List<com.amap.api.services.core.LatLonPoint> r6 = r9.f5475c
                java.util.List<java.util.List<com.amap.api.services.core.LatLonPoint>> r7 = r9.f5476d
                java.lang.String r8 = r9.f5477e
                r3.<init>(r4, r5, r6, r7, r8)
                boolean r0 = r9.f5478f
                r3.setUseFerry(r0)
                int r0 = r9.f5479g
                r3.setCarType(r0)
                java.lang.String r0 = r9.f5480h
                r3.setExclude(r0)
                java.lang.String r0 = r9.f5481i
                r3.setExtensions(r0)
                return r3
        }

        /* renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ java.lang.Object m31clone() throws java.lang.CloneNotSupportedException {
                r1 = this;
                com.amap.api.services.route.RouteSearch$DriveRouteQuery r0 = r1.clone()
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
                com.amap.api.services.route.RouteSearch$DriveRouteQuery r5 = (com.amap.api.services.route.RouteSearch.DriveRouteQuery) r5
                java.lang.String r2 = r4.f5477e
                if (r2 != 0) goto L1e
                java.lang.String r2 = r5.f5477e
                if (r2 == 0) goto L27
                return r1
            L1e:
                java.lang.String r3 = r5.f5477e
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L27
                return r1
            L27:
                java.util.List<java.util.List<com.amap.api.services.core.LatLonPoint>> r2 = r4.f5476d
                if (r2 != 0) goto L30
                java.util.List<java.util.List<com.amap.api.services.core.LatLonPoint>> r2 = r5.f5476d
                if (r2 == 0) goto L39
                return r1
            L30:
                java.util.List<java.util.List<com.amap.api.services.core.LatLonPoint>> r3 = r5.f5476d
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L39
                return r1
            L39:
                com.amap.api.services.route.RouteSearch$FromAndTo r2 = r4.a
                if (r2 != 0) goto L42
                com.amap.api.services.route.RouteSearch$FromAndTo r2 = r5.a
                if (r2 == 0) goto L4b
                return r1
            L42:
                com.amap.api.services.route.RouteSearch$FromAndTo r3 = r5.a
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L4b
                return r1
            L4b:
                int r2 = r4.f5474b
                int r3 = r5.f5474b
                if (r2 == r3) goto L52
                return r1
            L52:
                java.util.List<com.amap.api.services.core.LatLonPoint> r2 = r4.f5475c
                if (r2 != 0) goto L5b
                java.util.List<com.amap.api.services.core.LatLonPoint> r2 = r5.f5475c
                if (r2 == 0) goto L74
                return r1
            L5b:
                java.util.List<com.amap.api.services.core.LatLonPoint> r3 = r5.f5475c
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L64
                return r1
            L64:
                boolean r2 = r4.f5478f
                boolean r3 = r5.isUseFerry()
                if (r2 == r3) goto L6d
                return r1
            L6d:
                int r2 = r4.f5479g
                int r3 = r5.f5479g
                if (r2 == r3) goto L74
                return r1
            L74:
                java.lang.String r2 = r4.f5481i
                if (r2 != 0) goto L7d
                java.lang.String r5 = r5.f5481i
                if (r5 == 0) goto L86
                return r1
            L7d:
                java.lang.String r5 = r5.f5481i
                boolean r5 = r2.equals(r5)
                if (r5 != 0) goto L86
                return r1
            L86:
                return r0
        }

        public java.lang.String getAvoidRoad() {
                r1 = this;
                java.lang.String r0 = r1.f5477e
                return r0
        }

        public java.util.List<java.util.List<com.amap.api.services.core.LatLonPoint>> getAvoidpolygons() {
                r1 = this;
                java.util.List<java.util.List<com.amap.api.services.core.LatLonPoint>> r0 = r1.f5476d
                return r0
        }

        public java.lang.String getAvoidpolygonsStr() {
                r8 = this;
                java.lang.StringBuffer r0 = new java.lang.StringBuffer
                r0.<init>()
                java.util.List<java.util.List<com.amap.api.services.core.LatLonPoint>> r1 = r8.f5476d
                if (r1 == 0) goto L69
                int r1 = r1.size()
                if (r1 != 0) goto L10
                goto L69
            L10:
                r1 = 0
                r2 = 0
            L12:
                java.util.List<java.util.List<com.amap.api.services.core.LatLonPoint>> r3 = r8.f5476d
                int r3 = r3.size()
                if (r2 >= r3) goto L64
                java.util.List<java.util.List<com.amap.api.services.core.LatLonPoint>> r3 = r8.f5476d
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
                java.util.List<java.util.List<com.amap.api.services.core.LatLonPoint>> r3 = r8.f5476d
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
                int r0 = r1.f5479g
                return r0
        }

        public java.lang.String getExclude() {
                r1 = this;
                java.lang.String r0 = r1.f5480h
                return r0
        }

        public java.lang.String getExtensions() {
                r1 = this;
                java.lang.String r0 = r1.f5481i
                return r0
        }

        public com.amap.api.services.route.RouteSearch.FromAndTo getFromAndTo() {
                r1 = this;
                com.amap.api.services.route.RouteSearch$FromAndTo r0 = r1.a
                return r0
        }

        public int getMode() {
                r1 = this;
                int r0 = r1.f5474b
                return r0
        }

        public java.util.List<com.amap.api.services.core.LatLonPoint> getPassedByPoints() {
                r1 = this;
                java.util.List<com.amap.api.services.core.LatLonPoint> r0 = r1.f5475c
                return r0
        }

        public java.lang.String getPassedPointStr() {
                r5 = this;
                java.lang.StringBuffer r0 = new java.lang.StringBuffer
                r0.<init>()
                java.util.List<com.amap.api.services.core.LatLonPoint> r1 = r5.f5475c
                if (r1 == 0) goto L4b
                int r1 = r1.size()
                if (r1 != 0) goto L10
                goto L4b
            L10:
                r1 = 0
            L11:
                java.util.List<com.amap.api.services.core.LatLonPoint> r2 = r5.f5475c
                int r2 = r2.size()
                if (r1 >= r2) goto L46
                java.util.List<com.amap.api.services.core.LatLonPoint> r2 = r5.f5475c
                java.lang.Object r2 = r2.get(r1)
                com.amap.api.services.core.LatLonPoint r2 = (com.amap.api.services.core.LatLonPoint) r2
                double r3 = r2.getLongitude()
                r0.append(r3)
                java.lang.String r3 = ","
                r0.append(r3)
                double r2 = r2.getLatitude()
                r0.append(r2)
                java.util.List<com.amap.api.services.core.LatLonPoint> r2 = r5.f5475c
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
                java.lang.String r0 = r3.f5477e
                r1 = 0
                if (r0 != 0) goto L7
                r0 = 0
                goto Lb
            L7:
                int r0 = r0.hashCode()
            Lb:
                int r0 = r0 + 31
                int r0 = r0 * 31
                java.util.List<java.util.List<com.amap.api.services.core.LatLonPoint>> r2 = r3.f5476d
                if (r2 != 0) goto L15
                r2 = 0
                goto L19
            L15:
                int r2 = r2.hashCode()
            L19:
                int r0 = r0 + r2
                int r0 = r0 * 31
                com.amap.api.services.route.RouteSearch$FromAndTo r2 = r3.a
                if (r2 != 0) goto L22
                r2 = 0
                goto L26
            L22:
                int r2 = r2.hashCode()
            L26:
                int r0 = r0 + r2
                int r0 = r0 * 31
                int r2 = r3.f5474b
                int r0 = r0 + r2
                int r0 = r0 * 31
                java.util.List<com.amap.api.services.core.LatLonPoint> r2 = r3.f5475c
                if (r2 != 0) goto L33
                goto L37
            L33:
                int r1 = r2.hashCode()
            L37:
                int r0 = r0 + r1
                int r0 = r0 * 31
                int r1 = r3.f5479g
                int r0 = r0 + r1
                return r0
        }

        public boolean isUseFerry() {
                r1 = this;
                boolean r0 = r1.f5478f
                return r0
        }

        public void setCarType(int r1) {
                r0 = this;
                r0.f5479g = r1
                return
        }

        public void setExclude(java.lang.String r1) {
                r0 = this;
                r0.f5480h = r1
                return
        }

        public void setExtensions(java.lang.String r1) {
                r0 = this;
                r0.f5481i = r1
                return
        }

        public void setUseFerry(boolean r1) {
                r0 = this;
                r0.f5478f = r1
                return
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel r2, int r3) {
                r1 = this;
                com.amap.api.services.route.RouteSearch$FromAndTo r0 = r1.a
                r2.writeParcelable(r0, r3)
                int r3 = r1.f5474b
                r2.writeInt(r3)
                java.util.List<com.amap.api.services.core.LatLonPoint> r3 = r1.f5475c
                r2.writeTypedList(r3)
                java.util.List<java.util.List<com.amap.api.services.core.LatLonPoint>> r3 = r1.f5476d
                if (r3 != 0) goto L18
                r3 = 0
                r2.writeInt(r3)
                goto L35
            L18:
                int r3 = r3.size()
                r2.writeInt(r3)
                java.util.List<java.util.List<com.amap.api.services.core.LatLonPoint>> r3 = r1.f5476d
                java.util.Iterator r3 = r3.iterator()
            L25:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L35
                java.lang.Object r0 = r3.next()
                java.util.List r0 = (java.util.List) r0
                r2.writeTypedList(r0)
                goto L25
            L35:
                java.lang.String r3 = r1.f5477e
                r2.writeString(r3)
                boolean r3 = r1.f5478f
                r2.writeInt(r3)
                int r3 = r1.f5479g
                r2.writeInt(r3)
                java.lang.String r3 = r1.f5480h
                r2.writeString(r3)
                java.lang.String r3 = r1.f5481i
                r2.writeString(r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class FromAndTo implements android.os.Parcelable, java.lang.Cloneable {
        public static final android.os.Parcelable.Creator<com.amap.api.services.route.RouteSearch.FromAndTo> CREATOR = null;
        private com.amap.api.services.core.LatLonPoint a;

        /* renamed from: b, reason: collision with root package name */
        private com.amap.api.services.core.LatLonPoint f5482b;

        /* renamed from: c, reason: collision with root package name */
        private java.lang.String f5483c;

        /* renamed from: d, reason: collision with root package name */
        private java.lang.String f5484d;

        /* renamed from: e, reason: collision with root package name */
        private java.lang.String f5485e;

        /* renamed from: f, reason: collision with root package name */
        private java.lang.String f5486f;

        /* renamed from: g, reason: collision with root package name */
        private java.lang.String f5487g;

        /* renamed from: h, reason: collision with root package name */
        private java.lang.String f5488h;


        static {
                com.amap.api.services.route.RouteSearch$FromAndTo$1 r0 = new com.amap.api.services.route.RouteSearch$FromAndTo$1
                r0.<init>()
                com.amap.api.services.route.RouteSearch.FromAndTo.CREATOR = r0
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
                r2.f5482b = r0
                java.lang.String r0 = r3.readString()
                r2.f5483c = r0
                java.lang.String r0 = r3.readString()
                r2.f5484d = r0
                java.lang.String r0 = r3.readString()
                r2.f5485e = r0
                java.lang.String r3 = r3.readString()
                r2.f5486f = r3
                return
        }

        public FromAndTo(com.amap.api.services.core.LatLonPoint r1, com.amap.api.services.core.LatLonPoint r2) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.f5482b = r2
                return
        }

        public com.amap.api.services.route.RouteSearch.FromAndTo clone() {
                r3 = this;
                super.clone()     // Catch: java.lang.CloneNotSupportedException -> L4
                goto Lc
            L4:
                r0 = move-exception
                java.lang.String r1 = "RouteSearch"
                java.lang.String r2 = "FromAndToclone"
                com.amap.api.col.s.j4.i(r0, r1, r2)
            Lc:
                com.amap.api.services.route.RouteSearch$FromAndTo r0 = new com.amap.api.services.route.RouteSearch$FromAndTo
                com.amap.api.services.core.LatLonPoint r1 = r3.a
                com.amap.api.services.core.LatLonPoint r2 = r3.f5482b
                r0.<init>(r1, r2)
                java.lang.String r1 = r3.f5483c
                r0.setStartPoiID(r1)
                java.lang.String r1 = r3.f5484d
                r0.setDestinationPoiID(r1)
                java.lang.String r1 = r3.f5485e
                r0.setOriginType(r1)
                java.lang.String r1 = r3.f5486f
                r0.setDestinationType(r1)
                return r0
        }

        /* renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ java.lang.Object m32clone() throws java.lang.CloneNotSupportedException {
                r1 = this;
                com.amap.api.services.route.RouteSearch$FromAndTo r0 = r1.clone()
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
                com.amap.api.services.route.RouteSearch$FromAndTo r5 = (com.amap.api.services.route.RouteSearch.FromAndTo) r5
                java.lang.String r2 = r4.f5484d
                if (r2 != 0) goto L1e
                java.lang.String r2 = r5.f5484d
                if (r2 == 0) goto L27
                return r1
            L1e:
                java.lang.String r3 = r5.f5484d
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
                java.lang.String r2 = r4.f5483c
                if (r2 != 0) goto L42
                java.lang.String r2 = r5.f5483c
                if (r2 == 0) goto L4b
                return r1
            L42:
                java.lang.String r3 = r5.f5483c
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L4b
                return r1
            L4b:
                com.amap.api.services.core.LatLonPoint r2 = r4.f5482b
                if (r2 != 0) goto L54
                com.amap.api.services.core.LatLonPoint r2 = r5.f5482b
                if (r2 == 0) goto L5d
                return r1
            L54:
                com.amap.api.services.core.LatLonPoint r3 = r5.f5482b
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L5d
                return r1
            L5d:
                java.lang.String r2 = r4.f5485e
                if (r2 != 0) goto L66
                java.lang.String r2 = r5.f5485e
                if (r2 == 0) goto L6f
                return r1
            L66:
                java.lang.String r3 = r5.f5485e
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L6f
                return r1
            L6f:
                java.lang.String r2 = r4.f5486f
                if (r2 != 0) goto L78
                java.lang.String r5 = r5.f5486f
                if (r5 == 0) goto L81
                return r1
            L78:
                java.lang.String r5 = r5.f5486f
                boolean r5 = r2.equals(r5)
                if (r5 != 0) goto L81
                return r1
            L81:
                return r0
        }

        public java.lang.String getDestinationPoiID() {
                r1 = this;
                java.lang.String r0 = r1.f5484d
                return r0
        }

        public java.lang.String getDestinationType() {
                r1 = this;
                java.lang.String r0 = r1.f5486f
                return r0
        }

        public com.amap.api.services.core.LatLonPoint getFrom() {
                r1 = this;
                com.amap.api.services.core.LatLonPoint r0 = r1.a
                return r0
        }

        public java.lang.String getOriginType() {
                r1 = this;
                java.lang.String r0 = r1.f5485e
                return r0
        }

        public java.lang.String getPlateNumber() {
                r1 = this;
                java.lang.String r0 = r1.f5488h
                return r0
        }

        public java.lang.String getPlateProvince() {
                r1 = this;
                java.lang.String r0 = r1.f5487g
                return r0
        }

        public java.lang.String getStartPoiID() {
                r1 = this;
                java.lang.String r0 = r1.f5483c
                return r0
        }

        public com.amap.api.services.core.LatLonPoint getTo() {
                r1 = this;
                com.amap.api.services.core.LatLonPoint r0 = r1.f5482b
                return r0
        }

        public int hashCode() {
                r3 = this;
                java.lang.String r0 = r3.f5484d
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
                java.lang.String r2 = r3.f5483c
                if (r2 != 0) goto L22
                r2 = 0
                goto L26
            L22:
                int r2 = r2.hashCode()
            L26:
                int r0 = r0 + r2
                int r0 = r0 * 31
                com.amap.api.services.core.LatLonPoint r2 = r3.f5482b
                if (r2 != 0) goto L2f
                r2 = 0
                goto L33
            L2f:
                int r2 = r2.hashCode()
            L33:
                int r0 = r0 + r2
                int r0 = r0 * 31
                java.lang.String r2 = r3.f5485e
                if (r2 != 0) goto L3c
                r2 = 0
                goto L40
            L3c:
                int r2 = r2.hashCode()
            L40:
                int r0 = r0 + r2
                int r0 = r0 * 31
                java.lang.String r2 = r3.f5486f
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
                r0.f5484d = r1
                return
        }

        public void setDestinationType(java.lang.String r1) {
                r0 = this;
                r0.f5486f = r1
                return
        }

        public void setOriginType(java.lang.String r1) {
                r0 = this;
                r0.f5485e = r1
                return
        }

        public void setPlateNumber(java.lang.String r1) {
                r0 = this;
                r0.f5488h = r1
                return
        }

        public void setPlateProvince(java.lang.String r1) {
                r0 = this;
                r0.f5487g = r1
                return
        }

        public void setStartPoiID(java.lang.String r1) {
                r0 = this;
                r0.f5483c = r1
                return
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel r2, int r3) {
                r1 = this;
                com.amap.api.services.core.LatLonPoint r0 = r1.a
                r2.writeParcelable(r0, r3)
                com.amap.api.services.core.LatLonPoint r0 = r1.f5482b
                r2.writeParcelable(r0, r3)
                java.lang.String r3 = r1.f5483c
                r2.writeString(r3)
                java.lang.String r3 = r1.f5484d
                r2.writeString(r3)
                java.lang.String r3 = r1.f5485e
                r2.writeString(r3)
                java.lang.String r3 = r1.f5486f
                r2.writeString(r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface OnRoutePlanSearchListener {
        void onDriveRoutePlanSearched(com.amap.api.services.route.DriveRoutePlanResult r1, int r2);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface OnRouteSearchListener {
        void onBusRouteSearched(com.amap.api.services.route.BusRouteResult r1, int r2);

        void onDriveRouteSearched(com.amap.api.services.route.DriveRouteResult r1, int r2);

        void onRideRouteSearched(com.amap.api.services.route.RideRouteResult r1, int r2);

        void onWalkRouteSearched(com.amap.api.services.route.WalkRouteResult r1, int r2);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface OnTruckRouteSearchListener {
        void onTruckRouteSearched(com.amap.api.services.route.TruckRouteRestult r1, int r2);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class RideRouteQuery implements android.os.Parcelable, java.lang.Cloneable {
        public static final android.os.Parcelable.Creator<com.amap.api.services.route.RouteSearch.RideRouteQuery> CREATOR = null;
        private com.amap.api.services.route.RouteSearch.FromAndTo a;

        /* renamed from: b, reason: collision with root package name */
        private int f5489b;

        /* renamed from: c, reason: collision with root package name */
        private java.lang.String f5490c;


        static {
                com.amap.api.services.route.RouteSearch$RideRouteQuery$1 r0 = new com.amap.api.services.route.RouteSearch$RideRouteQuery$1
                r0.<init>()
                com.amap.api.services.route.RouteSearch.RideRouteQuery.CREATOR = r0
                return
        }

        public RideRouteQuery() {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "base"
                r1.f5490c = r0
                return
        }

        public RideRouteQuery(android.os.Parcel r2) {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "base"
                r1.f5490c = r0
                java.lang.Class<com.amap.api.services.route.RouteSearch$FromAndTo> r0 = com.amap.api.services.route.RouteSearch.FromAndTo.class
                java.lang.ClassLoader r0 = r0.getClassLoader()
                android.os.Parcelable r0 = r2.readParcelable(r0)
                com.amap.api.services.route.RouteSearch$FromAndTo r0 = (com.amap.api.services.route.RouteSearch.FromAndTo) r0
                r1.a = r0
                int r0 = r2.readInt()
                r1.f5489b = r0
                java.lang.String r2 = r2.readString()
                r1.f5490c = r2
                return
        }

        public RideRouteQuery(com.amap.api.services.route.RouteSearch.FromAndTo r2) {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "base"
                r1.f5490c = r0
                r1.a = r2
                return
        }

        public RideRouteQuery(com.amap.api.services.route.RouteSearch.FromAndTo r2, int r3) {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "base"
                r1.f5490c = r0
                r1.a = r2
                r1.f5489b = r3
                return
        }

        public com.amap.api.services.route.RouteSearch.RideRouteQuery clone() {
                r3 = this;
                super.clone()     // Catch: java.lang.CloneNotSupportedException -> L4
                goto Lc
            L4:
                r0 = move-exception
                java.lang.String r1 = "RouteSearch"
                java.lang.String r2 = "RideRouteQueryclone"
                com.amap.api.col.s.j4.i(r0, r1, r2)
            Lc:
                com.amap.api.services.route.RouteSearch$RideRouteQuery r0 = new com.amap.api.services.route.RouteSearch$RideRouteQuery
                com.amap.api.services.route.RouteSearch$FromAndTo r1 = r3.a
                r0.<init>(r1)
                java.lang.String r1 = r3.f5490c
                r0.setExtensions(r1)
                return r0
        }

        /* renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ java.lang.Object m33clone() throws java.lang.CloneNotSupportedException {
                r1 = this;
                com.amap.api.services.route.RouteSearch$RideRouteQuery r0 = r1.clone()
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
                com.amap.api.services.route.RouteSearch$RideRouteQuery r5 = (com.amap.api.services.route.RouteSearch.RideRouteQuery) r5
                com.amap.api.services.route.RouteSearch$FromAndTo r2 = r4.a
                if (r2 != 0) goto L1e
                com.amap.api.services.route.RouteSearch$FromAndTo r2 = r5.a
                if (r2 == 0) goto L27
                return r1
            L1e:
                com.amap.api.services.route.RouteSearch$FromAndTo r3 = r5.a
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L27
                return r1
            L27:
                int r2 = r4.f5489b
                int r5 = r5.f5489b
                if (r2 == r5) goto L2e
                return r1
            L2e:
                return r0
        }

        public java.lang.String getExtensions() {
                r1 = this;
                java.lang.String r0 = r1.f5490c
                return r0
        }

        public com.amap.api.services.route.RouteSearch.FromAndTo getFromAndTo() {
                r1 = this;
                com.amap.api.services.route.RouteSearch$FromAndTo r0 = r1.a
                return r0
        }

        public int getMode() {
                r1 = this;
                int r0 = r1.f5489b
                return r0
        }

        public int hashCode() {
                r2 = this;
                com.amap.api.services.route.RouteSearch$FromAndTo r0 = r2.a
                if (r0 != 0) goto L6
                r0 = 0
                goto La
            L6:
                int r0 = r0.hashCode()
            La:
                int r0 = r0 + 31
                int r0 = r0 * 31
                int r1 = r2.f5489b
                int r0 = r0 + r1
                return r0
        }

        public void setExtensions(java.lang.String r1) {
                r0 = this;
                r0.f5490c = r1
                return
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel r2, int r3) {
                r1 = this;
                com.amap.api.services.route.RouteSearch$FromAndTo r0 = r1.a
                r2.writeParcelable(r0, r3)
                int r3 = r1.f5489b
                r2.writeInt(r3)
                java.lang.String r3 = r1.f5490c
                r2.writeString(r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class TruckRouteQuery implements android.os.Parcelable, java.lang.Cloneable {
        public static final android.os.Parcelable.Creator<com.amap.api.services.route.RouteSearch.TruckRouteQuery> CREATOR = null;
        private com.amap.api.services.route.RouteSearch.FromAndTo a;

        /* renamed from: b, reason: collision with root package name */
        private int f5491b;

        /* renamed from: c, reason: collision with root package name */
        private int f5492c;

        /* renamed from: d, reason: collision with root package name */
        private java.util.List<com.amap.api.services.core.LatLonPoint> f5493d;

        /* renamed from: e, reason: collision with root package name */
        private float f5494e;

        /* renamed from: f, reason: collision with root package name */
        private float f5495f;

        /* renamed from: g, reason: collision with root package name */
        private float f5496g;

        /* renamed from: h, reason: collision with root package name */
        private float f5497h;

        /* renamed from: i, reason: collision with root package name */
        private float f5498i;

        /* renamed from: j, reason: collision with root package name */
        private java.lang.String f5499j;


        static {
                com.amap.api.services.route.RouteSearch$TruckRouteQuery$1 r0 = new com.amap.api.services.route.RouteSearch$TruckRouteQuery$1
                r0.<init>()
                com.amap.api.services.route.RouteSearch.TruckRouteQuery.CREATOR = r0
                return
        }

        protected TruckRouteQuery(android.os.Parcel r2) {
                r1 = this;
                r1.<init>()
                r0 = 2
                r1.f5491b = r0
                java.lang.String r0 = "base"
                r1.f5499j = r0
                java.lang.Class<com.amap.api.services.route.RouteSearch$FromAndTo> r0 = com.amap.api.services.route.RouteSearch.FromAndTo.class
                java.lang.ClassLoader r0 = r0.getClassLoader()
                android.os.Parcelable r0 = r2.readParcelable(r0)
                com.amap.api.services.route.RouteSearch$FromAndTo r0 = (com.amap.api.services.route.RouteSearch.FromAndTo) r0
                r1.a = r0
                int r0 = r2.readInt()
                r1.f5491b = r0
                int r0 = r2.readInt()
                r1.f5492c = r0
                android.os.Parcelable$Creator<com.amap.api.services.core.LatLonPoint> r0 = com.amap.api.services.core.LatLonPoint.CREATOR
                java.util.ArrayList r0 = r2.createTypedArrayList(r0)
                r1.f5493d = r0
                float r0 = r2.readFloat()
                r1.f5494e = r0
                float r0 = r2.readFloat()
                r1.f5495f = r0
                float r0 = r2.readFloat()
                r1.f5496g = r0
                float r0 = r2.readFloat()
                r1.f5497h = r0
                float r0 = r2.readFloat()
                r1.f5498i = r0
                java.lang.String r2 = r2.readString()
                r1.f5499j = r2
                return
        }

        public TruckRouteQuery(com.amap.api.services.route.RouteSearch.FromAndTo r2, int r3, java.util.List<com.amap.api.services.core.LatLonPoint> r4, int r5) {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "base"
                r1.f5499j = r0
                r1.a = r2
                r1.f5492c = r3
                r1.f5493d = r4
                r1.f5491b = r5
                return
        }

        public com.amap.api.services.route.RouteSearch.TruckRouteQuery clone() {
                r5 = this;
                super.clone()     // Catch: java.lang.CloneNotSupportedException -> L4
                goto Lc
            L4:
                r0 = move-exception
                java.lang.String r1 = "RouteSearch"
                java.lang.String r2 = "TruckRouteQueryclone"
                com.amap.api.col.s.j4.i(r0, r1, r2)
            Lc:
                com.amap.api.services.route.RouteSearch$TruckRouteQuery r0 = new com.amap.api.services.route.RouteSearch$TruckRouteQuery
                com.amap.api.services.route.RouteSearch$FromAndTo r1 = r5.a
                int r2 = r5.f5492c
                java.util.List<com.amap.api.services.core.LatLonPoint> r3 = r5.f5493d
                int r4 = r5.f5491b
                r0.<init>(r1, r2, r3, r4)
                java.lang.String r1 = r5.f5499j
                r0.setExtensions(r1)
                return r0
        }

        /* renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ java.lang.Object m34clone() throws java.lang.CloneNotSupportedException {
                r1 = this;
                com.amap.api.services.route.RouteSearch$TruckRouteQuery r0 = r1.clone()
                return r0
        }

        @Override // android.os.Parcelable
        public int describeContents() {
                r1 = this;
                r0 = 0
                return r0
        }

        public java.lang.String getExtensions() {
                r1 = this;
                java.lang.String r0 = r1.f5499j
                return r0
        }

        public com.amap.api.services.route.RouteSearch.FromAndTo getFromAndTo() {
                r1 = this;
                com.amap.api.services.route.RouteSearch$FromAndTo r0 = r1.a
                return r0
        }

        public int getMode() {
                r1 = this;
                int r0 = r1.f5492c
                return r0
        }

        public java.util.List<com.amap.api.services.core.LatLonPoint> getPassedByPoints() {
                r1 = this;
                java.util.List<com.amap.api.services.core.LatLonPoint> r0 = r1.f5493d
                return r0
        }

        public java.lang.String getPassedPointStr() {
                r5 = this;
                java.lang.StringBuffer r0 = new java.lang.StringBuffer
                r0.<init>()
                java.util.List<com.amap.api.services.core.LatLonPoint> r1 = r5.f5493d
                if (r1 == 0) goto L4b
                int r1 = r1.size()
                if (r1 != 0) goto L10
                goto L4b
            L10:
                r1 = 0
            L11:
                java.util.List<com.amap.api.services.core.LatLonPoint> r2 = r5.f5493d
                int r2 = r2.size()
                if (r1 >= r2) goto L46
                java.util.List<com.amap.api.services.core.LatLonPoint> r2 = r5.f5493d
                java.lang.Object r2 = r2.get(r1)
                com.amap.api.services.core.LatLonPoint r2 = (com.amap.api.services.core.LatLonPoint) r2
                double r3 = r2.getLongitude()
                r0.append(r3)
                java.lang.String r3 = ","
                r0.append(r3)
                double r2 = r2.getLatitude()
                r0.append(r2)
                java.util.List<com.amap.api.services.core.LatLonPoint> r2 = r5.f5493d
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

        public float getTruckAxis() {
                r1 = this;
                float r0 = r1.f5498i
                return r0
        }

        public float getTruckHeight() {
                r1 = this;
                float r0 = r1.f5494e
                return r0
        }

        public float getTruckLoad() {
                r1 = this;
                float r0 = r1.f5496g
                return r0
        }

        public int getTruckSize() {
                r1 = this;
                int r0 = r1.f5491b
                return r0
        }

        public float getTruckWeight() {
                r1 = this;
                float r0 = r1.f5497h
                return r0
        }

        public float getTruckWidth() {
                r1 = this;
                float r0 = r1.f5495f
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

        public void setExtensions(java.lang.String r1) {
                r0 = this;
                r0.f5499j = r1
                return
        }

        public void setMode(int r1) {
                r0 = this;
                r0.f5492c = r1
                return
        }

        public void setTruckAxis(float r1) {
                r0 = this;
                r0.f5498i = r1
                return
        }

        public void setTruckHeight(float r1) {
                r0 = this;
                r0.f5494e = r1
                return
        }

        public void setTruckLoad(float r1) {
                r0 = this;
                r0.f5496g = r1
                return
        }

        public void setTruckSize(int r1) {
                r0 = this;
                r0.f5491b = r1
                return
        }

        public void setTruckWeight(float r1) {
                r0 = this;
                r0.f5497h = r1
                return
        }

        public void setTruckWidth(float r1) {
                r0 = this;
                r0.f5495f = r1
                return
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel r2, int r3) {
                r1 = this;
                com.amap.api.services.route.RouteSearch$FromAndTo r0 = r1.a
                r2.writeParcelable(r0, r3)
                int r3 = r1.f5491b
                r2.writeInt(r3)
                int r3 = r1.f5492c
                r2.writeInt(r3)
                java.util.List<com.amap.api.services.core.LatLonPoint> r3 = r1.f5493d
                r2.writeTypedList(r3)
                float r3 = r1.f5494e
                r2.writeFloat(r3)
                float r3 = r1.f5495f
                r2.writeFloat(r3)
                float r3 = r1.f5496g
                r2.writeFloat(r3)
                float r3 = r1.f5497h
                r2.writeFloat(r3)
                float r3 = r1.f5498i
                r2.writeFloat(r3)
                java.lang.String r3 = r1.f5499j
                r2.writeString(r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class WalkRouteQuery implements android.os.Parcelable, java.lang.Cloneable {
        public static final android.os.Parcelable.Creator<com.amap.api.services.route.RouteSearch.WalkRouteQuery> CREATOR = null;
        private com.amap.api.services.route.RouteSearch.FromAndTo a;

        /* renamed from: b, reason: collision with root package name */
        private int f5500b;

        /* renamed from: c, reason: collision with root package name */
        private java.lang.String f5501c;


        static {
                com.amap.api.services.route.RouteSearch$WalkRouteQuery$1 r0 = new com.amap.api.services.route.RouteSearch$WalkRouteQuery$1
                r0.<init>()
                com.amap.api.services.route.RouteSearch.WalkRouteQuery.CREATOR = r0
                return
        }

        public WalkRouteQuery() {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "base"
                r1.f5501c = r0
                return
        }

        public WalkRouteQuery(android.os.Parcel r2) {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "base"
                r1.f5501c = r0
                java.lang.Class<com.amap.api.services.route.RouteSearch$FromAndTo> r0 = com.amap.api.services.route.RouteSearch.FromAndTo.class
                java.lang.ClassLoader r0 = r0.getClassLoader()
                android.os.Parcelable r0 = r2.readParcelable(r0)
                com.amap.api.services.route.RouteSearch$FromAndTo r0 = (com.amap.api.services.route.RouteSearch.FromAndTo) r0
                r1.a = r0
                int r0 = r2.readInt()
                r1.f5500b = r0
                java.lang.String r2 = r2.readString()
                r1.f5501c = r2
                return
        }

        public WalkRouteQuery(com.amap.api.services.route.RouteSearch.FromAndTo r2) {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "base"
                r1.f5501c = r0
                r1.a = r2
                return
        }

        public WalkRouteQuery(com.amap.api.services.route.RouteSearch.FromAndTo r2, int r3) {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "base"
                r1.f5501c = r0
                r1.a = r2
                r1.f5500b = r3
                return
        }

        public com.amap.api.services.route.RouteSearch.WalkRouteQuery clone() {
                r3 = this;
                super.clone()     // Catch: java.lang.CloneNotSupportedException -> L4
                goto Lc
            L4:
                r0 = move-exception
                java.lang.String r1 = "RouteSearch"
                java.lang.String r2 = "WalkRouteQueryclone"
                com.amap.api.col.s.j4.i(r0, r1, r2)
            Lc:
                com.amap.api.services.route.RouteSearch$WalkRouteQuery r0 = new com.amap.api.services.route.RouteSearch$WalkRouteQuery
                com.amap.api.services.route.RouteSearch$FromAndTo r1 = r3.a
                r0.<init>(r1)
                java.lang.String r1 = r3.f5501c
                r0.setExtensions(r1)
                return r0
        }

        /* renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ java.lang.Object m35clone() throws java.lang.CloneNotSupportedException {
                r1 = this;
                com.amap.api.services.route.RouteSearch$WalkRouteQuery r0 = r1.clone()
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
                com.amap.api.services.route.RouteSearch$WalkRouteQuery r5 = (com.amap.api.services.route.RouteSearch.WalkRouteQuery) r5
                com.amap.api.services.route.RouteSearch$FromAndTo r2 = r4.a
                if (r2 != 0) goto L1e
                com.amap.api.services.route.RouteSearch$FromAndTo r2 = r5.a
                if (r2 == 0) goto L27
                return r1
            L1e:
                com.amap.api.services.route.RouteSearch$FromAndTo r3 = r5.a
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L27
                return r1
            L27:
                java.lang.String r2 = r4.f5501c
                if (r2 != 0) goto L30
                java.lang.String r2 = r5.f5501c
                if (r2 == 0) goto L39
                return r1
            L30:
                java.lang.String r3 = r5.f5501c
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L39
                return r1
            L39:
                int r2 = r4.f5500b
                int r5 = r5.f5500b
                if (r2 == r5) goto L40
                return r1
            L40:
                return r0
        }

        public java.lang.String getExtensions() {
                r1 = this;
                java.lang.String r0 = r1.f5501c
                return r0
        }

        public com.amap.api.services.route.RouteSearch.FromAndTo getFromAndTo() {
                r1 = this;
                com.amap.api.services.route.RouteSearch$FromAndTo r0 = r1.a
                return r0
        }

        public int getMode() {
                r1 = this;
                int r0 = r1.f5500b
                return r0
        }

        public int hashCode() {
                r2 = this;
                com.amap.api.services.route.RouteSearch$FromAndTo r0 = r2.a
                if (r0 != 0) goto L6
                r0 = 0
                goto La
            L6:
                int r0 = r0.hashCode()
            La:
                int r0 = r0 + 31
                int r0 = r0 * 31
                int r1 = r2.f5500b
                int r0 = r0 + r1
                return r0
        }

        public void setExtensions(java.lang.String r1) {
                r0 = this;
                r0.f5501c = r1
                return
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel r2, int r3) {
                r1 = this;
                com.amap.api.services.route.RouteSearch$FromAndTo r0 = r1.a
                r2.writeParcelable(r0, r3)
                int r3 = r1.f5500b
                r2.writeInt(r3)
                java.lang.String r3 = r1.f5501c
                r2.writeString(r3)
                return
        }
    }

    public RouteSearch(android.content.Context r2) throws com.amap.api.services.core.AMapException {
            r1 = this;
            r1.<init>()
            com.amap.api.services.interfaces.IRouteSearch r0 = r1.a
            if (r0 != 0) goto L18
            com.amap.api.col.s.t0 r0 = new com.amap.api.col.s.t0     // Catch: java.lang.Exception -> Lf
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

    public com.amap.api.services.route.BusRouteResult calculateBusRoute(com.amap.api.services.route.RouteSearch.BusRouteQuery r2) throws com.amap.api.services.core.AMapException {
            r1 = this;
            com.amap.api.services.interfaces.IRouteSearch r0 = r1.a
            if (r0 == 0) goto L9
            com.amap.api.services.route.BusRouteResult r2 = r0.calculateBusRoute(r2)
            return r2
        L9:
            r2 = 0
            return r2
    }

    public void calculateBusRouteAsyn(com.amap.api.services.route.RouteSearch.BusRouteQuery r2) {
            r1 = this;
            com.amap.api.services.interfaces.IRouteSearch r0 = r1.a
            if (r0 == 0) goto L7
            r0.calculateBusRouteAsyn(r2)
        L7:
            return
    }

    public com.amap.api.services.route.DriveRoutePlanResult calculateDrivePlan(com.amap.api.services.route.RouteSearch.DrivePlanQuery r2) throws com.amap.api.services.core.AMapException {
            r1 = this;
            com.amap.api.services.interfaces.IRouteSearch r0 = r1.a
            if (r0 == 0) goto L9
            com.amap.api.services.route.DriveRoutePlanResult r2 = r0.calculateDrivePlan(r2)
            return r2
        L9:
            r2 = 0
            return r2
    }

    public void calculateDrivePlanAsyn(com.amap.api.services.route.RouteSearch.DrivePlanQuery r2) {
            r1 = this;
            com.amap.api.services.interfaces.IRouteSearch r0 = r1.a
            if (r0 == 0) goto L7
            r0.calculateDrivePlanAsyn(r2)
        L7:
            return
    }

    public com.amap.api.services.route.DriveRouteResult calculateDriveRoute(com.amap.api.services.route.RouteSearch.DriveRouteQuery r2) throws com.amap.api.services.core.AMapException {
            r1 = this;
            com.amap.api.services.interfaces.IRouteSearch r0 = r1.a
            if (r0 == 0) goto L9
            com.amap.api.services.route.DriveRouteResult r2 = r0.calculateDriveRoute(r2)
            return r2
        L9:
            r2 = 0
            return r2
    }

    public void calculateDriveRouteAsyn(com.amap.api.services.route.RouteSearch.DriveRouteQuery r2) {
            r1 = this;
            com.amap.api.services.interfaces.IRouteSearch r0 = r1.a
            if (r0 == 0) goto L7
            r0.calculateDriveRouteAsyn(r2)
        L7:
            return
    }

    public com.amap.api.services.route.RideRouteResult calculateRideRoute(com.amap.api.services.route.RouteSearch.RideRouteQuery r2) throws com.amap.api.services.core.AMapException {
            r1 = this;
            com.amap.api.services.interfaces.IRouteSearch r0 = r1.a
            if (r0 == 0) goto L9
            com.amap.api.services.route.RideRouteResult r2 = r0.calculateRideRoute(r2)
            return r2
        L9:
            r2 = 0
            return r2
    }

    public void calculateRideRouteAsyn(com.amap.api.services.route.RouteSearch.RideRouteQuery r2) {
            r1 = this;
            com.amap.api.services.interfaces.IRouteSearch r0 = r1.a
            if (r0 == 0) goto L7
            r0.calculateRideRouteAsyn(r2)
        L7:
            return
    }

    public com.amap.api.services.route.TruckRouteRestult calculateTruckRoute(com.amap.api.services.route.RouteSearch.TruckRouteQuery r2) throws com.amap.api.services.core.AMapException {
            r1 = this;
            com.amap.api.services.interfaces.IRouteSearch r0 = r1.a
            if (r0 == 0) goto L9
            com.amap.api.services.route.TruckRouteRestult r2 = r0.calculateTruckRoute(r2)
            return r2
        L9:
            r2 = 0
            return r2
    }

    public void calculateTruckRouteAsyn(com.amap.api.services.route.RouteSearch.TruckRouteQuery r2) {
            r1 = this;
            com.amap.api.services.interfaces.IRouteSearch r0 = r1.a
            if (r0 == 0) goto L7
            r0.calculateTruckRouteAsyn(r2)
        L7:
            return
    }

    public com.amap.api.services.route.WalkRouteResult calculateWalkRoute(com.amap.api.services.route.RouteSearch.WalkRouteQuery r2) throws com.amap.api.services.core.AMapException {
            r1 = this;
            com.amap.api.services.interfaces.IRouteSearch r0 = r1.a
            if (r0 == 0) goto L9
            com.amap.api.services.route.WalkRouteResult r2 = r0.calculateWalkRoute(r2)
            return r2
        L9:
            r2 = 0
            return r2
    }

    public void calculateWalkRouteAsyn(com.amap.api.services.route.RouteSearch.WalkRouteQuery r2) {
            r1 = this;
            com.amap.api.services.interfaces.IRouteSearch r0 = r1.a
            if (r0 == 0) goto L7
            r0.calculateWalkRouteAsyn(r2)
        L7:
            return
    }

    public void setOnRoutePlanSearchListener(com.amap.api.services.route.RouteSearch.OnRoutePlanSearchListener r2) {
            r1 = this;
            com.amap.api.services.interfaces.IRouteSearch r0 = r1.a
            if (r0 == 0) goto L7
            r0.setOnRoutePlanSearchListener(r2)
        L7:
            return
    }

    public void setOnTruckRouteSearchListener(com.amap.api.services.route.RouteSearch.OnTruckRouteSearchListener r2) {
            r1 = this;
            com.amap.api.services.interfaces.IRouteSearch r0 = r1.a
            if (r0 == 0) goto L7
            r0.setOnTruckRouteSearchListener(r2)
        L7:
            return
    }

    public void setRouteSearchListener(com.amap.api.services.route.RouteSearch.OnRouteSearchListener r2) {
            r1 = this;
            com.amap.api.services.interfaces.IRouteSearch r0 = r1.a
            if (r0 == 0) goto L7
            r0.setRouteSearchListener(r2)
        L7:
            return
    }
}

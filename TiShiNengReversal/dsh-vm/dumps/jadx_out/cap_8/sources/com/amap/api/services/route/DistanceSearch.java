package com.amap.api.services.route;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class DistanceSearch {
    public static final java.lang.String EXTENSIONS_ALL = "all";
    public static final java.lang.String EXTENSIONS_BASE = "base";
    public static final int TYPE_DISTANCE = 0;
    public static final int TYPE_DRIVING_DISTANCE = 1;
    public static final int TYPE_WALK_DISTANCE = 3;
    private com.amap.api.services.interfaces.IDistanceSearch a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class DistanceQuery implements android.os.Parcelable, java.lang.Cloneable {
        public static final android.os.Parcelable.Creator<com.amap.api.services.route.DistanceSearch.DistanceQuery> CREATOR = null;
        private int a;

        /* renamed from: b, reason: collision with root package name */
        private java.util.List<com.amap.api.services.core.LatLonPoint> f5376b;

        /* renamed from: c, reason: collision with root package name */
        private com.amap.api.services.core.LatLonPoint f5377c;

        /* renamed from: d, reason: collision with root package name */
        private java.lang.String f5378d;

        /* renamed from: e, reason: collision with root package name */
        private int f5379e;


        static {
                com.amap.api.services.route.DistanceSearch$DistanceQuery$1 r0 = new com.amap.api.services.route.DistanceSearch$DistanceQuery$1
                r0.<init>()
                com.amap.api.services.route.DistanceSearch.DistanceQuery.CREATOR = r0
                return
        }

        public DistanceQuery() {
                r1 = this;
                r1.<init>()
                r0 = 1
                r1.a = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.f5376b = r0
                java.lang.String r0 = "base"
                r1.f5378d = r0
                r0 = 4
                r1.f5379e = r0
                return
        }

        protected DistanceQuery(android.os.Parcel r2) {
                r1 = this;
                r1.<init>()
                r0 = 1
                r1.a = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.f5376b = r0
                java.lang.String r0 = "base"
                r1.f5378d = r0
                r0 = 4
                r1.f5379e = r0
                int r0 = r2.readInt()
                r1.a = r0
                android.os.Parcelable$Creator<com.amap.api.services.core.LatLonPoint> r0 = com.amap.api.services.core.LatLonPoint.CREATOR
                java.util.ArrayList r0 = r2.createTypedArrayList(r0)
                r1.f5376b = r0
                java.lang.Class<com.amap.api.services.core.LatLonPoint> r0 = com.amap.api.services.core.LatLonPoint.class
                java.lang.ClassLoader r0 = r0.getClassLoader()
                android.os.Parcelable r0 = r2.readParcelable(r0)
                com.amap.api.services.core.LatLonPoint r0 = (com.amap.api.services.core.LatLonPoint) r0
                r1.f5377c = r0
                java.lang.String r0 = r2.readString()
                r1.f5378d = r0
                int r2 = r2.readInt()
                r1.f5379e = r2
                return
        }

        public void addOrigins(com.amap.api.services.core.LatLonPoint... r5) {
                r4 = this;
                int r0 = r5.length
                r1 = 0
            L2:
                if (r1 >= r0) goto L10
                r2 = r5[r1]
                if (r2 == 0) goto Ld
                java.util.List<com.amap.api.services.core.LatLonPoint> r3 = r4.f5376b
                r3.add(r2)
            Ld:
                int r1 = r1 + 1
                goto L2
            L10:
                return
        }

        public com.amap.api.services.route.DistanceSearch.DistanceQuery clone() {
                r3 = this;
                super.clone()     // Catch: java.lang.CloneNotSupportedException -> L4
                goto Lc
            L4:
                r0 = move-exception
                java.lang.String r1 = "DistanceSearch"
                java.lang.String r2 = "DistanceQueryclone"
                com.amap.api.col.s.j4.i(r0, r1, r2)
            Lc:
                com.amap.api.services.route.DistanceSearch$DistanceQuery r0 = new com.amap.api.services.route.DistanceSearch$DistanceQuery
                r0.<init>()
                int r1 = r3.a
                r0.setType(r1)
                java.util.List<com.amap.api.services.core.LatLonPoint> r1 = r3.f5376b
                r0.setOrigins(r1)
                com.amap.api.services.core.LatLonPoint r1 = r3.f5377c
                r0.setDestination(r1)
                java.lang.String r1 = r3.f5378d
                r0.setExtensions(r1)
                int r1 = r3.f5379e
                r0.setMode(r1)
                return r0
        }

        /* renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ java.lang.Object m28clone() throws java.lang.CloneNotSupportedException {
                r1 = this;
                com.amap.api.services.route.DistanceSearch$DistanceQuery r0 = r1.clone()
                return r0
        }

        @Override // android.os.Parcelable
        public int describeContents() {
                r1 = this;
                r0 = 0
                return r0
        }

        public com.amap.api.services.core.LatLonPoint getDestination() {
                r1 = this;
                com.amap.api.services.core.LatLonPoint r0 = r1.f5377c
                return r0
        }

        public java.lang.String getExtensions() {
                r1 = this;
                java.lang.String r0 = r1.f5378d
                return r0
        }

        public int getMode() {
                r1 = this;
                int r0 = r1.f5379e
                return r0
        }

        public java.util.List<com.amap.api.services.core.LatLonPoint> getOrigins() {
                r1 = this;
                java.util.List<com.amap.api.services.core.LatLonPoint> r0 = r1.f5376b
                return r0
        }

        public int getType() {
                r1 = this;
                int r0 = r1.a
                return r0
        }

        public void setDestination(com.amap.api.services.core.LatLonPoint r1) {
                r0 = this;
                r0.f5377c = r1
                return
        }

        public void setExtensions(java.lang.String r1) {
                r0 = this;
                r0.f5378d = r1
                return
        }

        public void setMode(int r1) {
                r0 = this;
                r0.f5379e = r1
                return
        }

        public void setOrigins(java.util.List<com.amap.api.services.core.LatLonPoint> r1) {
                r0 = this;
                if (r1 == 0) goto L4
                r0.f5376b = r1
            L4:
                return
        }

        public void setType(int r1) {
                r0 = this;
                r0.a = r1
                return
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel r2, int r3) {
                r1 = this;
                int r0 = r1.a
                r2.writeInt(r0)
                java.util.List<com.amap.api.services.core.LatLonPoint> r0 = r1.f5376b
                r2.writeTypedList(r0)
                com.amap.api.services.core.LatLonPoint r0 = r1.f5377c
                r2.writeParcelable(r0, r3)
                java.lang.String r3 = r1.f5378d
                r2.writeString(r3)
                int r3 = r1.f5379e
                r2.writeInt(r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface OnDistanceSearchListener {
        void onDistanceSearched(com.amap.api.services.route.DistanceResult r1, int r2);
    }

    public DistanceSearch(android.content.Context r2) throws com.amap.api.services.core.AMapException {
            r1 = this;
            r1.<init>()
            com.amap.api.services.interfaces.IDistanceSearch r0 = r1.a
            if (r0 != 0) goto L18
            com.amap.api.col.s.l0 r0 = new com.amap.api.col.s.l0     // Catch: java.lang.Exception -> Lf
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

    public com.amap.api.services.route.DistanceResult calculateRouteDistance(com.amap.api.services.route.DistanceSearch.DistanceQuery r2) throws com.amap.api.services.core.AMapException {
            r1 = this;
            com.amap.api.services.interfaces.IDistanceSearch r0 = r1.a
            if (r0 == 0) goto L9
            com.amap.api.services.route.DistanceResult r2 = r0.calculateRouteDistance(r2)
            return r2
        L9:
            r2 = 0
            return r2
    }

    public void calculateRouteDistanceAsyn(com.amap.api.services.route.DistanceSearch.DistanceQuery r2) {
            r1 = this;
            com.amap.api.services.interfaces.IDistanceSearch r0 = r1.a
            if (r0 == 0) goto L7
            r0.calculateRouteDistanceAsyn(r2)
        L7:
            return
    }

    public void setDistanceSearchListener(com.amap.api.services.route.DistanceSearch.OnDistanceSearchListener r2) {
            r1 = this;
            com.amap.api.services.interfaces.IDistanceSearch r0 = r1.a
            if (r0 == 0) goto L7
            r0.setDistanceSearchListener(r2)
        L7:
            return
    }
}

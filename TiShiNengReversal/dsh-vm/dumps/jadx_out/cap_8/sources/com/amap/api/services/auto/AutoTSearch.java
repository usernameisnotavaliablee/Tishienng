package com.amap.api.services.auto;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class AutoTSearch {
    private com.amap.api.services.interfaces.IAutoTSearch a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class FilterBox implements android.os.Parcelable, java.lang.Cloneable {
        public static final android.os.Parcelable.Creator<com.amap.api.services.auto.AutoTSearch.FilterBox> CREATOR = null;
        private java.lang.String a;

        /* renamed from: b, reason: collision with root package name */
        private java.lang.String f5067b;

        /* renamed from: c, reason: collision with root package name */
        private java.lang.String f5068c;

        /* renamed from: d, reason: collision with root package name */
        private java.lang.String f5069d;

        /* renamed from: e, reason: collision with root package name */
        private java.lang.String f5070e;


        static {
                com.amap.api.services.auto.AutoTSearch$FilterBox$1 r0 = new com.amap.api.services.auto.AutoTSearch$FilterBox$1
                r0.<init>()
                com.amap.api.services.auto.AutoTSearch.FilterBox.CREATOR = r0
                return
        }

        public FilterBox() {
                r0 = this;
                r0.<init>()
                return
        }

        protected FilterBox(android.os.Parcel r2) {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = r2.readString()
                r1.a = r0
                java.lang.String r0 = r2.readString()
                r1.f5067b = r0
                java.lang.String r0 = r2.readString()
                r1.f5068c = r0
                java.lang.String r0 = r2.readString()
                r1.f5069d = r0
                java.lang.String r2 = r2.readString()
                r1.f5070e = r2
                return
        }

        public com.amap.api.services.auto.AutoTSearch.FilterBox clone() {
                r2 = this;
                super.clone()     // Catch: java.lang.CloneNotSupportedException -> L3
            L3:
                com.amap.api.services.auto.AutoTSearch$FilterBox r0 = new com.amap.api.services.auto.AutoTSearch$FilterBox
                r0.<init>()
                java.lang.String r1 = r2.a
                r0.setRetainState(r1)
                java.lang.String r1 = r2.f5067b
                r0.setCheckedLevel(r1)
                java.lang.String r1 = r2.f5068c
                r0.setClassifyV2Data(r1)
                java.lang.String r1 = r2.f5069d
                r0.setClassifyV2Level2Data(r1)
                java.lang.String r1 = r2.f5070e
                r0.setClassifyV2Level3Data(r1)
                return r0
        }

        /* renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ java.lang.Object m17clone() throws java.lang.CloneNotSupportedException {
                r1 = this;
                com.amap.api.services.auto.AutoTSearch$FilterBox r0 = r1.clone()
                return r0
        }

        @Override // android.os.Parcelable
        public int describeContents() {
                r1 = this;
                r0 = 0
                return r0
        }

        public java.lang.String getCheckedLevel() {
                r1 = this;
                java.lang.String r0 = r1.f5067b
                return r0
        }

        public java.lang.String getClassifyV2Data() {
                r1 = this;
                java.lang.String r0 = r1.f5068c
                return r0
        }

        public java.lang.String getClassifyV2Level2Data() {
                r1 = this;
                java.lang.String r0 = r1.f5069d
                return r0
        }

        public java.lang.String getClassifyV2Level3Data() {
                r1 = this;
                java.lang.String r0 = r1.f5070e
                return r0
        }

        public java.lang.String getRetainState() {
                r1 = this;
                java.lang.String r0 = r1.a
                return r0
        }

        public void setCheckedLevel(java.lang.String r1) {
                r0 = this;
                r0.f5067b = r1
                return
        }

        public void setClassifyV2Data(java.lang.String r1) {
                r0 = this;
                r0.f5068c = r1
                return
        }

        public void setClassifyV2Level2Data(java.lang.String r1) {
                r0 = this;
                r0.f5069d = r1
                return
        }

        public void setClassifyV2Level3Data(java.lang.String r1) {
                r0 = this;
                r0.f5070e = r1
                return
        }

        public void setRetainState(java.lang.String r1) {
                r0 = this;
                r0.a = r1
                return
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel r1, int r2) {
                r0 = this;
                java.lang.String r2 = r0.a
                r1.writeString(r2)
                java.lang.String r2 = r0.f5067b
                r1.writeString(r2)
                java.lang.String r2 = r0.f5068c
                r1.writeString(r2)
                java.lang.String r2 = r0.f5069d
                r1.writeString(r2)
                java.lang.String r2 = r0.f5070e
                r1.writeString(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface OnChargeStationListener {
        void onChargeStationSearched(com.amap.api.services.auto.AutoTChargeStationResult r1, int r2);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class Query implements android.os.Parcelable, java.lang.Cloneable {
        public static final android.os.Parcelable.Creator<com.amap.api.services.auto.AutoTSearch.Query> CREATOR = null;
        private java.lang.String a;

        /* renamed from: b, reason: collision with root package name */
        private java.lang.String f5071b;

        /* renamed from: c, reason: collision with root package name */
        private java.lang.String f5072c;

        /* renamed from: d, reason: collision with root package name */
        private java.lang.String f5073d;

        /* renamed from: e, reason: collision with root package name */
        private java.lang.String f5074e;

        /* renamed from: f, reason: collision with root package name */
        private int f5075f;

        /* renamed from: g, reason: collision with root package name */
        private int f5076g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f5077h;

        /* renamed from: i, reason: collision with root package name */
        private java.lang.String f5078i;

        /* renamed from: j, reason: collision with root package name */
        private int f5079j;

        /* renamed from: k, reason: collision with root package name */
        private com.amap.api.services.core.LatLonPoint f5080k;
        private java.lang.String l;
        private java.lang.String m;
        private com.amap.api.services.auto.AutoTSearch.FilterBox n;
        private java.lang.String o;
        private java.lang.String p;


        static {
                com.amap.api.services.auto.AutoTSearch$Query$1 r0 = new com.amap.api.services.auto.AutoTSearch$Query$1
                r0.<init>()
                com.amap.api.services.auto.AutoTSearch.Query.CREATOR = r0
                return
        }

        public Query() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.f5077h = r0
                return
        }

        protected Query(android.os.Parcel r3) {
                r2 = this;
                r2.<init>()
                r0 = 0
                r2.f5077h = r0
                java.lang.String r1 = r3.readString()
                r2.a = r1
                java.lang.String r1 = r3.readString()
                r2.f5071b = r1
                java.lang.String r1 = r3.readString()
                r2.f5072c = r1
                java.lang.String r1 = r3.readString()
                r2.f5073d = r1
                java.lang.String r1 = r3.readString()
                r2.f5074e = r1
                int r1 = r3.readInt()
                r2.f5075f = r1
                int r1 = r3.readInt()
                r2.f5076g = r1
                byte r1 = r3.readByte()
                if (r1 == 0) goto L37
                r0 = 1
            L37:
                r2.f5077h = r0
                java.lang.String r0 = r3.readString()
                r2.f5078i = r0
                int r0 = r3.readInt()
                r2.f5079j = r0
                java.lang.Class<com.amap.api.services.core.LatLonPoint> r0 = com.amap.api.services.core.LatLonPoint.class
                java.lang.ClassLoader r0 = r0.getClassLoader()
                android.os.Parcelable r0 = r3.readParcelable(r0)
                com.amap.api.services.core.LatLonPoint r0 = (com.amap.api.services.core.LatLonPoint) r0
                r2.f5080k = r0
                java.lang.String r0 = r3.readString()
                r2.l = r0
                java.lang.String r0 = r3.readString()
                r2.m = r0
                java.lang.Class<com.amap.api.services.auto.AutoTSearch$FilterBox> r0 = com.amap.api.services.auto.AutoTSearch.FilterBox.class
                java.lang.ClassLoader r0 = r0.getClassLoader()
                android.os.Parcelable r0 = r3.readParcelable(r0)
                com.amap.api.services.auto.AutoTSearch$FilterBox r0 = (com.amap.api.services.auto.AutoTSearch.FilterBox) r0
                r2.n = r0
                java.lang.String r0 = r3.readString()
                r2.o = r0
                java.lang.String r3 = r3.readString()
                r2.p = r3
                return
        }

        public com.amap.api.services.auto.AutoTSearch.Query clone() {
                r2 = this;
                super.clone()     // Catch: java.lang.CloneNotSupportedException -> L3
            L3:
                com.amap.api.services.auto.AutoTSearch$Query r0 = new com.amap.api.services.auto.AutoTSearch$Query
                r0.<init>()
                java.lang.String r1 = r2.a
                r0.setAdCode(r1)
                java.lang.String r1 = r2.f5071b
                r0.setCity(r1)
                java.lang.String r1 = r2.f5072c
                r0.setDataType(r1)
                java.lang.String r1 = r2.f5073d
                r0.setGeoObj(r1)
                java.lang.String r1 = r2.f5074e
                r0.setKeywords(r1)
                int r1 = r2.f5075f
                r0.setPageNum(r1)
                int r1 = r2.f5076g
                r0.setPageSize(r1)
                boolean r1 = r2.f5077h
                r0.setQii(r1)
                java.lang.String r1 = r2.f5078i
                r0.setQueryType(r1)
                int r1 = r2.f5079j
                r0.setRange(r1)
                com.amap.api.services.core.LatLonPoint r1 = r2.f5080k
                r0.setLatLonPoint(r1)
                java.lang.String r1 = r2.l
                r0.setUserLoc(r1)
                java.lang.String r1 = r2.m
                r0.setUserCity(r1)
                java.lang.String r1 = r2.o
                r0.setAccessKey(r1)
                java.lang.String r1 = r2.p
                r0.setSecretKey(r1)
                com.amap.api.services.auto.AutoTSearch$FilterBox r1 = r2.n
                r0.setFilterBox(r1)
                return r0
        }

        /* renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ java.lang.Object m18clone() throws java.lang.CloneNotSupportedException {
                r1 = this;
                com.amap.api.services.auto.AutoTSearch$Query r0 = r1.clone()
                return r0
        }

        @Override // android.os.Parcelable
        public int describeContents() {
                r1 = this;
                r0 = 0
                return r0
        }

        public java.lang.String getAccessKey() {
                r1 = this;
                java.lang.String r0 = r1.o
                return r0
        }

        public java.lang.String getAdCode() {
                r1 = this;
                java.lang.String r0 = r1.a
                return r0
        }

        public java.lang.String getCity() {
                r1 = this;
                java.lang.String r0 = r1.f5071b
                return r0
        }

        public java.lang.String getDataType() {
                r1 = this;
                java.lang.String r0 = r1.f5072c
                return r0
        }

        public com.amap.api.services.auto.AutoTSearch.FilterBox getFilterBox() {
                r1 = this;
                com.amap.api.services.auto.AutoTSearch$FilterBox r0 = r1.n
                return r0
        }

        public java.lang.String getGeoObj() {
                r1 = this;
                java.lang.String r0 = r1.f5073d
                return r0
        }

        public java.lang.String getKeywords() {
                r1 = this;
                java.lang.String r0 = r1.f5074e
                return r0
        }

        public com.amap.api.services.core.LatLonPoint getLatLonPoint() {
                r1 = this;
                com.amap.api.services.core.LatLonPoint r0 = r1.f5080k
                return r0
        }

        public int getPageNum() {
                r1 = this;
                int r0 = r1.f5075f
                return r0
        }

        public int getPageSize() {
                r1 = this;
                int r0 = r1.f5076g
                return r0
        }

        public java.lang.String getQueryType() {
                r1 = this;
                java.lang.String r0 = r1.f5078i
                return r0
        }

        public int getRange() {
                r1 = this;
                int r0 = r1.f5079j
                return r0
        }

        public java.lang.String getSecretKey() {
                r1 = this;
                java.lang.String r0 = r1.p
                return r0
        }

        public java.lang.String getUserCity() {
                r1 = this;
                java.lang.String r0 = r1.m
                return r0
        }

        public java.lang.String getUserLoc() {
                r1 = this;
                java.lang.String r0 = r1.l
                return r0
        }

        public boolean isQii() {
                r1 = this;
                boolean r0 = r1.f5077h
                return r0
        }

        public void setAccessKey(java.lang.String r1) {
                r0 = this;
                r0.o = r1
                return
        }

        public void setAdCode(java.lang.String r1) {
                r0 = this;
                r0.a = r1
                return
        }

        public void setCity(java.lang.String r1) {
                r0 = this;
                r0.f5071b = r1
                return
        }

        public void setDataType(java.lang.String r1) {
                r0 = this;
                r0.f5072c = r1
                return
        }

        public void setFilterBox(com.amap.api.services.auto.AutoTSearch.FilterBox r1) {
                r0 = this;
                r0.n = r1
                return
        }

        public void setGeoObj(java.lang.String r1) {
                r0 = this;
                r0.f5073d = r1
                return
        }

        public void setKeywords(java.lang.String r1) {
                r0 = this;
                r0.f5074e = r1
                return
        }

        public void setLatLonPoint(com.amap.api.services.core.LatLonPoint r1) {
                r0 = this;
                r0.f5080k = r1
                return
        }

        public void setPageNum(int r1) {
                r0 = this;
                r0.f5075f = r1
                return
        }

        public void setPageSize(int r1) {
                r0 = this;
                r0.f5076g = r1
                return
        }

        public void setQii(boolean r1) {
                r0 = this;
                r0.f5077h = r1
                return
        }

        public void setQueryType(java.lang.String r1) {
                r0 = this;
                r0.f5078i = r1
                return
        }

        public void setRange(int r1) {
                r0 = this;
                r0.f5079j = r1
                return
        }

        public void setSecretKey(java.lang.String r1) {
                r0 = this;
                r0.p = r1
                return
        }

        public void setUserCity(java.lang.String r1) {
                r0 = this;
                r0.m = r1
                return
        }

        public void setUserLoc(java.lang.String r1) {
                r0 = this;
                r0.l = r1
                return
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel r2, int r3) {
                r1 = this;
                java.lang.String r0 = r1.a
                r2.writeString(r0)
                java.lang.String r0 = r1.f5071b
                r2.writeString(r0)
                java.lang.String r0 = r1.f5072c
                r2.writeString(r0)
                java.lang.String r0 = r1.f5073d
                r2.writeString(r0)
                java.lang.String r0 = r1.f5074e
                r2.writeString(r0)
                int r0 = r1.f5075f
                r2.writeInt(r0)
                int r0 = r1.f5076g
                r2.writeInt(r0)
                boolean r0 = r1.f5077h
                byte r0 = (byte) r0
                r2.writeByte(r0)
                java.lang.String r0 = r1.f5078i
                r2.writeString(r0)
                int r0 = r1.f5079j
                r2.writeInt(r0)
                com.amap.api.services.core.LatLonPoint r0 = r1.f5080k
                r2.writeParcelable(r0, r3)
                java.lang.String r0 = r1.l
                r2.writeString(r0)
                java.lang.String r0 = r1.m
                r2.writeString(r0)
                com.amap.api.services.auto.AutoTSearch$FilterBox r0 = r1.n
                r2.writeParcelable(r0, r3)
                java.lang.String r3 = r1.o
                r2.writeString(r3)
                java.lang.String r3 = r1.p
                r2.writeString(r3)
                return
        }
    }

    public AutoTSearch(android.content.Context r2) throws com.amap.api.services.core.AMapException {
            r1 = this;
            r1.<init>()
            com.amap.api.services.interfaces.IAutoTSearch r0 = r1.a
            if (r0 != 0) goto L18
            com.amap.api.col.s.h0 r0 = new com.amap.api.col.s.h0     // Catch: java.lang.Exception -> Lf
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

    public com.amap.api.services.auto.AutoTChargeStationResult searchChargeStation() throws com.amap.api.services.core.AMapException {
            r1 = this;
            com.amap.api.services.interfaces.IAutoTSearch r0 = r1.a
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            com.amap.api.services.auto.AutoTChargeStationResult r0 = r0.searchChargeStation()
            return r0
    }

    public void searchChargeStationAsync() throws com.amap.api.services.core.AMapException {
            r1 = this;
            com.amap.api.services.interfaces.IAutoTSearch r0 = r1.a
            if (r0 != 0) goto L5
            return
        L5:
            r0.searchChargeStationAsync()
            return
    }

    public void setChargeStationListener(com.amap.api.services.auto.AutoTSearch.OnChargeStationListener r2) {
            r1 = this;
            com.amap.api.services.interfaces.IAutoTSearch r0 = r1.a
            if (r0 != 0) goto L5
            goto L7
        L5:
            if (r2 != 0) goto L8
        L7:
            return
        L8:
            r0.setChargeStationListener(r2)
            return
    }

    public void setQuery(com.amap.api.services.auto.AutoTSearch.Query r2) {
            r1 = this;
            com.amap.api.services.interfaces.IAutoTSearch r0 = r1.a
            if (r0 != 0) goto L5
            return
        L5:
            r0.setQuery(r2)
            return
    }
}

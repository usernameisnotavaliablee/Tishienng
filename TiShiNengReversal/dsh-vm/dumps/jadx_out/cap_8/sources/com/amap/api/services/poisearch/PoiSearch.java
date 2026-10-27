package com.amap.api.services.poisearch;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class PoiSearch {
    public static final java.lang.String CHINESE = "zh-CN";
    public static final java.lang.String ENGLISH = "en";
    public static final java.lang.String EXTENSIONS_ALL = "all";
    public static final java.lang.String EXTENSIONS_BASE = "base";
    private com.amap.api.services.interfaces.IPoiSearch a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface OnPoiSearchListener {
        void onPoiItemSearched(com.amap.api.services.core.PoiItem r1, int r2);

        void onPoiSearched(com.amap.api.services.poisearch.PoiResult r1, int r2);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class Query implements java.lang.Cloneable {
        private java.lang.String a;

        /* renamed from: b, reason: collision with root package name */
        private java.lang.String f5279b;

        /* renamed from: c, reason: collision with root package name */
        private java.lang.String f5280c;

        /* renamed from: d, reason: collision with root package name */
        private int f5281d;

        /* renamed from: e, reason: collision with root package name */
        private int f5282e;

        /* renamed from: f, reason: collision with root package name */
        private java.lang.String f5283f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f5284g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f5285h;

        /* renamed from: i, reason: collision with root package name */
        private java.lang.String f5286i;

        /* renamed from: j, reason: collision with root package name */
        private boolean f5287j;

        /* renamed from: k, reason: collision with root package name */
        private com.amap.api.services.core.LatLonPoint f5288k;
        private boolean l;
        private java.lang.String m;

        public Query(java.lang.String r2, java.lang.String r3) {
                r1 = this;
                r0 = 0
                r1.<init>(r2, r3, r0)
                return
        }

        public Query(java.lang.String r3, java.lang.String r4, java.lang.String r5) {
                r2 = this;
                r2.<init>()
                r0 = 1
                r2.f5281d = r0
                r1 = 20
                r2.f5282e = r1
                java.lang.String r1 = "zh-CN"
                r2.f5283f = r1
                r1 = 0
                r2.f5284g = r1
                r2.f5285h = r1
                r2.f5287j = r0
                r2.l = r0
                java.lang.String r0 = "base"
                r2.m = r0
                r2.a = r3
                r2.f5279b = r4
                r2.f5280c = r5
                return
        }

        private static java.lang.String a() {
                java.lang.String r0 = ""
                return r0
        }

        public com.amap.api.services.poisearch.PoiSearch.Query clone() {
                r4 = this;
                super.clone()     // Catch: java.lang.CloneNotSupportedException -> L4
                goto Lc
            L4:
                r0 = move-exception
                java.lang.String r1 = "PoiSearch"
                java.lang.String r2 = "queryclone"
                com.amap.api.col.s.j4.i(r0, r1, r2)
            Lc:
                com.amap.api.services.poisearch.PoiSearch$Query r0 = new com.amap.api.services.poisearch.PoiSearch$Query
                java.lang.String r1 = r4.a
                java.lang.String r2 = r4.f5279b
                java.lang.String r3 = r4.f5280c
                r0.<init>(r1, r2, r3)
                int r1 = r4.f5281d
                r0.setPageNum(r1)
                int r1 = r4.f5282e
                r0.setPageSize(r1)
                java.lang.String r1 = r4.f5283f
                r0.setQueryLanguage(r1)
                boolean r1 = r4.f5284g
                r0.setCityLimit(r1)
                boolean r1 = r4.f5285h
                r0.requireSubPois(r1)
                java.lang.String r1 = r4.f5286i
                r0.setBuilding(r1)
                com.amap.api.services.core.LatLonPoint r1 = r4.f5288k
                r0.setLocation(r1)
                boolean r1 = r4.f5287j
                r0.setDistanceSort(r1)
                boolean r1 = r4.l
                r0.setSpecial(r1)
                java.lang.String r1 = r4.m
                r0.setExtensions(r1)
                return r0
        }

        /* renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ java.lang.Object m24clone() throws java.lang.CloneNotSupportedException {
                r1 = this;
                com.amap.api.services.poisearch.PoiSearch$Query r0 = r1.clone()
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
                com.amap.api.services.poisearch.PoiSearch$Query r5 = (com.amap.api.services.poisearch.PoiSearch.Query) r5
                java.lang.String r2 = r4.f5279b
                if (r2 != 0) goto L1e
                java.lang.String r2 = r5.f5279b
                if (r2 == 0) goto L27
                return r1
            L1e:
                java.lang.String r3 = r5.f5279b
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L27
                return r1
            L27:
                java.lang.String r2 = r4.f5280c
                if (r2 != 0) goto L30
                java.lang.String r2 = r5.f5280c
                if (r2 == 0) goto L39
                return r1
            L30:
                java.lang.String r3 = r5.f5280c
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L39
                return r1
            L39:
                java.lang.String r2 = r4.f5283f
                if (r2 != 0) goto L42
                java.lang.String r2 = r5.f5283f
                if (r2 == 0) goto L4b
                return r1
            L42:
                java.lang.String r3 = r5.f5283f
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L4b
                return r1
            L4b:
                int r2 = r4.f5281d
                int r3 = r5.f5281d
                if (r2 == r3) goto L52
                return r1
            L52:
                int r2 = r4.f5282e
                int r3 = r5.f5282e
                if (r2 == r3) goto L59
                return r1
            L59:
                java.lang.String r2 = r4.a
                if (r2 != 0) goto L62
                java.lang.String r2 = r5.a
                if (r2 == 0) goto L6b
                return r1
            L62:
                java.lang.String r3 = r5.a
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L6b
                return r1
            L6b:
                java.lang.String r2 = r4.f5286i
                if (r2 != 0) goto L74
                java.lang.String r2 = r5.f5286i
                if (r2 == 0) goto L7d
                return r1
            L74:
                java.lang.String r3 = r5.f5286i
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L7d
                return r1
            L7d:
                boolean r2 = r4.f5284g
                boolean r3 = r5.f5284g
                if (r2 == r3) goto L84
                return r1
            L84:
                boolean r2 = r4.f5285h
                boolean r3 = r5.f5285h
                if (r2 == r3) goto L8b
                return r1
            L8b:
                boolean r2 = r4.l
                boolean r3 = r5.l
                if (r2 == r3) goto L92
                return r1
            L92:
                java.lang.String r2 = r4.m
                if (r2 != 0) goto L9b
                java.lang.String r5 = r5.m
                if (r5 == 0) goto La4
                return r1
            L9b:
                java.lang.String r5 = r5.m
                boolean r5 = r2.equals(r5)
                if (r5 != 0) goto La4
                return r1
            La4:
                return r0
        }

        public java.lang.String getBuilding() {
                r1 = this;
                java.lang.String r0 = r1.f5286i
                return r0
        }

        public java.lang.String getCategory() {
                r2 = this;
                java.lang.String r0 = r2.f5279b
                if (r0 == 0) goto L1a
                java.lang.String r1 = "00"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L1a
                java.lang.String r0 = r2.f5279b
                java.lang.String r1 = "00|"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L17
                goto L1a
            L17:
                java.lang.String r0 = r2.f5279b
                return r0
            L1a:
                java.lang.String r0 = a()
                return r0
        }

        public java.lang.String getCity() {
                r1 = this;
                java.lang.String r0 = r1.f5280c
                return r0
        }

        public boolean getCityLimit() {
                r1 = this;
                boolean r0 = r1.f5284g
                return r0
        }

        public java.lang.String getExtensions() {
                r1 = this;
                java.lang.String r0 = r1.m
                return r0
        }

        public com.amap.api.services.core.LatLonPoint getLocation() {
                r1 = this;
                com.amap.api.services.core.LatLonPoint r0 = r1.f5288k
                return r0
        }

        public int getPageNum() {
                r1 = this;
                int r0 = r1.f5281d
                return r0
        }

        public int getPageSize() {
                r1 = this;
                int r0 = r1.f5282e
                return r0
        }

        protected java.lang.String getQueryLanguage() {
                r1 = this;
                java.lang.String r0 = r1.f5283f
                return r0
        }

        public java.lang.String getQueryString() {
                r1 = this;
                java.lang.String r0 = r1.a
                return r0
        }

        public int hashCode() {
                r5 = this;
                java.lang.String r0 = r5.f5279b
                r1 = 0
                if (r0 != 0) goto L7
                r0 = 0
                goto Lb
            L7:
                int r0 = r0.hashCode()
            Lb:
                int r0 = r0 + 31
                int r0 = r0 * 31
                java.lang.String r2 = r5.f5280c
                if (r2 != 0) goto L15
                r2 = 0
                goto L19
            L15:
                int r2 = r2.hashCode()
            L19:
                int r0 = r0 + r2
                int r0 = r0 * 31
                boolean r2 = r5.f5284g
                r3 = 1237(0x4d5, float:1.733E-42)
                r4 = 1231(0x4cf, float:1.725E-42)
                if (r2 == 0) goto L27
                r2 = 1231(0x4cf, float:1.725E-42)
                goto L29
            L27:
                r2 = 1237(0x4d5, float:1.733E-42)
            L29:
                int r0 = r0 + r2
                int r0 = r0 * 31
                boolean r2 = r5.f5285h
                if (r2 == 0) goto L32
                r3 = 1231(0x4cf, float:1.725E-42)
            L32:
                int r0 = r0 + r3
                int r0 = r0 * 31
                java.lang.String r2 = r5.f5283f
                if (r2 != 0) goto L3b
                r2 = 0
                goto L3f
            L3b:
                int r2 = r2.hashCode()
            L3f:
                int r0 = r0 + r2
                int r0 = r0 * 31
                int r2 = r5.f5281d
                int r0 = r0 + r2
                int r0 = r0 * 31
                int r2 = r5.f5282e
                int r0 = r0 + r2
                int r0 = r0 * 31
                java.lang.String r2 = r5.a
                if (r2 != 0) goto L52
                r2 = 0
                goto L56
            L52:
                int r2 = r2.hashCode()
            L56:
                int r0 = r0 + r2
                int r0 = r0 * 31
                java.lang.String r2 = r5.f5286i
                if (r2 != 0) goto L5e
                goto L62
            L5e:
                int r1 = r2.hashCode()
            L62:
                int r0 = r0 + r1
                return r0
        }

        public boolean isDistanceSort() {
                r1 = this;
                boolean r0 = r1.f5287j
                return r0
        }

        public boolean isRequireSubPois() {
                r1 = this;
                boolean r0 = r1.f5285h
                return r0
        }

        public boolean isSpecial() {
                r1 = this;
                boolean r0 = r1.l
                return r0
        }

        public boolean queryEquals(com.amap.api.services.poisearch.PoiSearch.Query r5) {
                r4 = this;
                r0 = 0
                if (r5 != 0) goto L4
                return r0
            L4:
                r1 = 1
                if (r5 != r4) goto L8
                return r1
            L8:
                java.lang.String r2 = r5.a
                java.lang.String r3 = r4.a
                boolean r2 = com.amap.api.services.poisearch.PoiSearch.a(r2, r3)
                if (r2 == 0) goto L5d
                java.lang.String r2 = r5.f5279b
                java.lang.String r3 = r4.f5279b
                boolean r2 = com.amap.api.services.poisearch.PoiSearch.a(r2, r3)
                if (r2 == 0) goto L5d
                java.lang.String r2 = r5.f5283f
                java.lang.String r3 = r4.f5283f
                boolean r2 = com.amap.api.services.poisearch.PoiSearch.a(r2, r3)
                if (r2 == 0) goto L5d
                java.lang.String r2 = r5.f5280c
                java.lang.String r3 = r4.f5280c
                boolean r2 = com.amap.api.services.poisearch.PoiSearch.a(r2, r3)
                if (r2 == 0) goto L5d
                java.lang.String r2 = r5.m
                java.lang.String r3 = r4.m
                boolean r2 = com.amap.api.services.poisearch.PoiSearch.a(r2, r3)
                if (r2 == 0) goto L5d
                java.lang.String r2 = r5.f5286i
                java.lang.String r3 = r4.f5286i
                boolean r2 = com.amap.api.services.poisearch.PoiSearch.a(r2, r3)
                if (r2 == 0) goto L5d
                boolean r2 = r5.f5284g
                boolean r3 = r4.f5284g
                if (r2 != r3) goto L5d
                int r2 = r5.f5282e
                int r3 = r4.f5282e
                if (r2 != r3) goto L5d
                boolean r2 = r5.f5287j
                boolean r3 = r4.f5287j
                if (r2 != r3) goto L5d
                boolean r5 = r5.l
                boolean r2 = r4.l
                if (r5 != r2) goto L5d
                return r1
            L5d:
                return r0
        }

        public void requireSubPois(boolean r1) {
                r0 = this;
                r0.f5285h = r1
                return
        }

        public void setBuilding(java.lang.String r1) {
                r0 = this;
                r0.f5286i = r1
                return
        }

        public void setCityLimit(boolean r1) {
                r0 = this;
                r0.f5284g = r1
                return
        }

        public void setDistanceSort(boolean r1) {
                r0 = this;
                r0.f5287j = r1
                return
        }

        public void setExtensions(java.lang.String r1) {
                r0 = this;
                r0.m = r1
                return
        }

        public void setLocation(com.amap.api.services.core.LatLonPoint r1) {
                r0 = this;
                r0.f5288k = r1
                return
        }

        public void setPageNum(int r1) {
                r0 = this;
                if (r1 > 0) goto L3
                r1 = 1
            L3:
                r0.f5281d = r1
                return
        }

        public void setPageSize(int r2) {
                r1 = this;
                if (r2 > 0) goto L7
                r2 = 20
                r1.f5282e = r2
                return
            L7:
                r0 = 30
                if (r2 <= r0) goto Le
                r1.f5282e = r0
                return
            Le:
                r1.f5282e = r2
                return
        }

        public void setQueryLanguage(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "en"
                boolean r2 = r0.equals(r2)
                if (r2 == 0) goto Lb
                r1.f5283f = r0
                return
            Lb:
                java.lang.String r2 = "zh-CN"
                r1.f5283f = r2
                return
        }

        public void setSpecial(boolean r1) {
                r0 = this;
                r0.l = r1
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class SearchBound implements java.lang.Cloneable {
        public static final java.lang.String BOUND_SHAPE = "Bound";
        public static final java.lang.String ELLIPSE_SHAPE = "Ellipse";
        public static final java.lang.String POLYGON_SHAPE = "Polygon";
        public static final java.lang.String RECTANGLE_SHAPE = "Rectangle";
        private com.amap.api.services.core.LatLonPoint a;

        /* renamed from: b, reason: collision with root package name */
        private com.amap.api.services.core.LatLonPoint f5289b;

        /* renamed from: c, reason: collision with root package name */
        private int f5290c;

        /* renamed from: d, reason: collision with root package name */
        private com.amap.api.services.core.LatLonPoint f5291d;

        /* renamed from: e, reason: collision with root package name */
        private java.lang.String f5292e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f5293f;

        /* renamed from: g, reason: collision with root package name */
        private java.util.List<com.amap.api.services.core.LatLonPoint> f5294g;

        public SearchBound(com.amap.api.services.core.LatLonPoint r2, int r3) {
                r1 = this;
                r1.<init>()
                r0 = 1
                r1.f5293f = r0
                java.lang.String r0 = "Bound"
                r1.f5292e = r0
                r1.f5290c = r3
                r1.f5291d = r2
                return
        }

        public SearchBound(com.amap.api.services.core.LatLonPoint r2, int r3, boolean r4) {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "Bound"
                r1.f5292e = r0
                r1.f5290c = r3
                r1.f5291d = r2
                r1.f5293f = r4
                return
        }

        public SearchBound(com.amap.api.services.core.LatLonPoint r2, com.amap.api.services.core.LatLonPoint r3) {
                r1 = this;
                r1.<init>()
                r0 = 1500(0x5dc, float:2.102E-42)
                r1.f5290c = r0
                r0 = 1
                r1.f5293f = r0
                java.lang.String r0 = "Rectangle"
                r1.f5292e = r0
                r1.a(r2, r3)
                return
        }

        private SearchBound(com.amap.api.services.core.LatLonPoint r1, com.amap.api.services.core.LatLonPoint r2, int r3, com.amap.api.services.core.LatLonPoint r4, java.lang.String r5, java.util.List<com.amap.api.services.core.LatLonPoint> r6, boolean r7) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.f5289b = r2
                r0.f5290c = r3
                r0.f5291d = r4
                r0.f5292e = r5
                r0.f5294g = r6
                r0.f5293f = r7
                return
        }

        public SearchBound(java.util.List<com.amap.api.services.core.LatLonPoint> r2) {
                r1 = this;
                r1.<init>()
                r0 = 1500(0x5dc, float:2.102E-42)
                r1.f5290c = r0
                r0 = 1
                r1.f5293f = r0
                java.lang.String r0 = "Polygon"
                r1.f5292e = r0
                r1.f5294g = r2
                return
        }

        private void a(com.amap.api.services.core.LatLonPoint r9, com.amap.api.services.core.LatLonPoint r10) {
                r8 = this;
                r8.a = r9
                r8.f5289b = r10
                double r9 = r9.getLatitude()
                com.amap.api.services.core.LatLonPoint r0 = r8.f5289b
                double r0 = r0.getLatitude()
                int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r2 >= 0) goto L22
                com.amap.api.services.core.LatLonPoint r9 = r8.a
                double r9 = r9.getLongitude()
                com.amap.api.services.core.LatLonPoint r0 = r8.f5289b
                double r0 = r0.getLongitude()
                int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r2 < 0) goto L29
            L22:
                java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
                java.lang.String r10 = "invalid rect "
                r9.<init>(r10)
            L29:
                com.amap.api.services.core.LatLonPoint r9 = new com.amap.api.services.core.LatLonPoint
                com.amap.api.services.core.LatLonPoint r10 = r8.a
                double r0 = r10.getLatitude()
                com.amap.api.services.core.LatLonPoint r10 = r8.f5289b
                double r2 = r10.getLatitude()
                double r0 = r0 + r2
                r2 = 4611686018427387904(0x4000000000000000, double:2.0)
                double r0 = r0 / r2
                com.amap.api.services.core.LatLonPoint r10 = r8.a
                double r4 = r10.getLongitude()
                com.amap.api.services.core.LatLonPoint r10 = r8.f5289b
                double r6 = r10.getLongitude()
                double r4 = r4 + r6
                double r4 = r4 / r2
                r9.<init>(r0, r4)
                r8.f5291d = r9
                return
        }

        public com.amap.api.services.poisearch.PoiSearch.SearchBound clone() {
                r11 = this;
                super.clone()     // Catch: java.lang.CloneNotSupportedException -> L4
                goto Lc
            L4:
                r0 = move-exception
                java.lang.String r1 = "PoiSearch"
                java.lang.String r2 = "SearchBoundClone"
                com.amap.api.col.s.j4.i(r0, r1, r2)
            Lc:
                com.amap.api.services.poisearch.PoiSearch$SearchBound r3 = new com.amap.api.services.poisearch.PoiSearch$SearchBound
                com.amap.api.services.core.LatLonPoint r4 = r11.a
                com.amap.api.services.core.LatLonPoint r5 = r11.f5289b
                int r6 = r11.f5290c
                com.amap.api.services.core.LatLonPoint r7 = r11.f5291d
                java.lang.String r8 = r11.f5292e
                java.util.List<com.amap.api.services.core.LatLonPoint> r9 = r11.f5294g
                boolean r10 = r11.f5293f
                r3.<init>(r4, r5, r6, r7, r8, r9, r10)
                return r3
        }

        /* renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ java.lang.Object m25clone() throws java.lang.CloneNotSupportedException {
                r1 = this;
                com.amap.api.services.poisearch.PoiSearch$SearchBound r0 = r1.clone()
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
                com.amap.api.services.poisearch.PoiSearch$SearchBound r5 = (com.amap.api.services.poisearch.PoiSearch.SearchBound) r5
                com.amap.api.services.core.LatLonPoint r2 = r4.f5291d
                if (r2 != 0) goto L1e
                com.amap.api.services.core.LatLonPoint r2 = r5.f5291d
                if (r2 == 0) goto L27
                return r1
            L1e:
                com.amap.api.services.core.LatLonPoint r3 = r5.f5291d
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L27
                return r1
            L27:
                boolean r2 = r4.f5293f
                boolean r3 = r5.f5293f
                if (r2 == r3) goto L2e
                return r1
            L2e:
                com.amap.api.services.core.LatLonPoint r2 = r4.a
                if (r2 != 0) goto L37
                com.amap.api.services.core.LatLonPoint r2 = r5.a
                if (r2 == 0) goto L40
                return r1
            L37:
                com.amap.api.services.core.LatLonPoint r3 = r5.a
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L40
                return r1
            L40:
                com.amap.api.services.core.LatLonPoint r2 = r4.f5289b
                if (r2 != 0) goto L49
                com.amap.api.services.core.LatLonPoint r2 = r5.f5289b
                if (r2 == 0) goto L52
                return r1
            L49:
                com.amap.api.services.core.LatLonPoint r3 = r5.f5289b
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L52
                return r1
            L52:
                java.util.List<com.amap.api.services.core.LatLonPoint> r2 = r4.f5294g
                if (r2 != 0) goto L5b
                java.util.List<com.amap.api.services.core.LatLonPoint> r2 = r5.f5294g
                if (r2 == 0) goto L64
                return r1
            L5b:
                java.util.List<com.amap.api.services.core.LatLonPoint> r3 = r5.f5294g
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L64
                return r1
            L64:
                int r2 = r4.f5290c
                int r3 = r5.f5290c
                if (r2 == r3) goto L6b
                return r1
            L6b:
                java.lang.String r2 = r4.f5292e
                if (r2 != 0) goto L74
                java.lang.String r5 = r5.f5292e
                if (r5 == 0) goto L7d
                return r1
            L74:
                java.lang.String r5 = r5.f5292e
                boolean r5 = r2.equals(r5)
                if (r5 != 0) goto L7d
                return r1
            L7d:
                return r0
        }

        public com.amap.api.services.core.LatLonPoint getCenter() {
                r1 = this;
                com.amap.api.services.core.LatLonPoint r0 = r1.f5291d
                return r0
        }

        public com.amap.api.services.core.LatLonPoint getLowerLeft() {
                r1 = this;
                com.amap.api.services.core.LatLonPoint r0 = r1.a
                return r0
        }

        public java.util.List<com.amap.api.services.core.LatLonPoint> getPolyGonList() {
                r1 = this;
                java.util.List<com.amap.api.services.core.LatLonPoint> r0 = r1.f5294g
                return r0
        }

        public int getRange() {
                r1 = this;
                int r0 = r1.f5290c
                return r0
        }

        public java.lang.String getShape() {
                r1 = this;
                java.lang.String r0 = r1.f5292e
                return r0
        }

        public com.amap.api.services.core.LatLonPoint getUpperRight() {
                r1 = this;
                com.amap.api.services.core.LatLonPoint r0 = r1.f5289b
                return r0
        }

        public int hashCode() {
                r3 = this;
                com.amap.api.services.core.LatLonPoint r0 = r3.f5291d
                r1 = 0
                if (r0 != 0) goto L7
                r0 = 0
                goto Lb
            L7:
                int r0 = r0.hashCode()
            Lb:
                int r0 = r0 + 31
                int r0 = r0 * 31
                boolean r2 = r3.f5293f
                if (r2 == 0) goto L16
                r2 = 1231(0x4cf, float:1.725E-42)
                goto L18
            L16:
                r2 = 1237(0x4d5, float:1.733E-42)
            L18:
                int r0 = r0 + r2
                int r0 = r0 * 31
                com.amap.api.services.core.LatLonPoint r2 = r3.a
                if (r2 != 0) goto L21
                r2 = 0
                goto L25
            L21:
                int r2 = r2.hashCode()
            L25:
                int r0 = r0 + r2
                int r0 = r0 * 31
                com.amap.api.services.core.LatLonPoint r2 = r3.f5289b
                if (r2 != 0) goto L2e
                r2 = 0
                goto L32
            L2e:
                int r2 = r2.hashCode()
            L32:
                int r0 = r0 + r2
                int r0 = r0 * 31
                java.util.List<com.amap.api.services.core.LatLonPoint> r2 = r3.f5294g
                if (r2 != 0) goto L3b
                r2 = 0
                goto L3f
            L3b:
                int r2 = r2.hashCode()
            L3f:
                int r0 = r0 + r2
                int r0 = r0 * 31
                int r2 = r3.f5290c
                int r0 = r0 + r2
                int r0 = r0 * 31
                java.lang.String r2 = r3.f5292e
                if (r2 != 0) goto L4c
                goto L50
            L4c:
                int r1 = r2.hashCode()
            L50:
                int r0 = r0 + r1
                return r0
        }

        public boolean isDistanceSort() {
                r1 = this;
                boolean r0 = r1.f5293f
                return r0
        }
    }

    public PoiSearch(android.content.Context r2, com.amap.api.services.poisearch.PoiSearch.Query r3) throws com.amap.api.services.core.AMapException {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.a = r0
            com.amap.api.col.s.q0 r0 = new com.amap.api.col.s.q0     // Catch: java.lang.Exception -> Le
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

    static /* synthetic */ boolean a(java.lang.String r0, java.lang.String r1) {
            boolean r0 = b(r0, r1)
            return r0
    }

    private static boolean b(java.lang.String r0, java.lang.String r1) {
            if (r0 != 0) goto L6
            if (r1 != 0) goto L6
            r0 = 1
            return r0
        L6:
            if (r0 == 0) goto Lf
            if (r1 == 0) goto Lf
            boolean r0 = r0.equals(r1)
            return r0
        Lf:
            r0 = 0
            return r0
    }

    public com.amap.api.services.poisearch.PoiSearch.SearchBound getBound() {
            r1 = this;
            com.amap.api.services.interfaces.IPoiSearch r0 = r1.a
            if (r0 == 0) goto L9
            com.amap.api.services.poisearch.PoiSearch$SearchBound r0 = r0.getBound()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public java.lang.String getLanguage() {
            r1 = this;
            com.amap.api.services.interfaces.IPoiSearch r0 = r1.a
            if (r0 == 0) goto L9
            java.lang.String r0 = r0.getLanguage()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public com.amap.api.services.poisearch.PoiSearch.Query getQuery() {
            r1 = this;
            com.amap.api.services.interfaces.IPoiSearch r0 = r1.a
            if (r0 == 0) goto L9
            com.amap.api.services.poisearch.PoiSearch$Query r0 = r0.getQuery()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public com.amap.api.services.poisearch.PoiResult searchPOI() throws com.amap.api.services.core.AMapException {
            r1 = this;
            com.amap.api.services.interfaces.IPoiSearch r0 = r1.a
            if (r0 == 0) goto L9
            com.amap.api.services.poisearch.PoiResult r0 = r0.searchPOI()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public void searchPOIAsyn() {
            r1 = this;
            com.amap.api.services.interfaces.IPoiSearch r0 = r1.a
            if (r0 == 0) goto L7
            r0.searchPOIAsyn()
        L7:
            return
    }

    public com.amap.api.services.core.PoiItem searchPOIId(java.lang.String r2) throws com.amap.api.services.core.AMapException {
            r1 = this;
            com.amap.api.services.interfaces.IPoiSearch r0 = r1.a
            if (r0 == 0) goto L9
            com.amap.api.services.core.PoiItem r2 = r0.searchPOIId(r2)
            return r2
        L9:
            r2 = 0
            return r2
    }

    public void searchPOIIdAsyn(java.lang.String r2) {
            r1 = this;
            com.amap.api.services.interfaces.IPoiSearch r0 = r1.a
            if (r0 == 0) goto L7
            r0.searchPOIIdAsyn(r2)
        L7:
            return
    }

    public void setBound(com.amap.api.services.poisearch.PoiSearch.SearchBound r2) {
            r1 = this;
            com.amap.api.services.interfaces.IPoiSearch r0 = r1.a
            if (r0 == 0) goto L7
            r0.setBound(r2)
        L7:
            return
    }

    public void setLanguage(java.lang.String r2) {
            r1 = this;
            com.amap.api.services.interfaces.IPoiSearch r0 = r1.a
            if (r0 == 0) goto L7
            r0.setLanguage(r2)
        L7:
            return
    }

    public void setOnPoiSearchListener(com.amap.api.services.poisearch.PoiSearch.OnPoiSearchListener r2) {
            r1 = this;
            com.amap.api.services.interfaces.IPoiSearch r0 = r1.a
            if (r0 == 0) goto L7
            r0.setOnPoiSearchListener(r2)
        L7:
            return
    }

    public void setQuery(com.amap.api.services.poisearch.PoiSearch.Query r2) {
            r1 = this;
            com.amap.api.services.interfaces.IPoiSearch r0 = r1.a
            if (r0 == 0) goto L7
            r0.setQuery(r2)
        L7:
            return
    }
}

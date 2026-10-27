package com.amap.api.services.cloud;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class CloudSearch {
    private com.amap.api.services.interfaces.ICloudSearch a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface OnCloudSearchListener {
        void onCloudItemDetailSearched(com.amap.api.services.cloud.CloudItemDetail r1, int r2);

        void onCloudSearched(com.amap.api.services.cloud.CloudResult r1, int r2);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class Query implements java.lang.Cloneable {
        private java.lang.String a;

        /* renamed from: b, reason: collision with root package name */
        private int f5124b;

        /* renamed from: c, reason: collision with root package name */
        private int f5125c;

        /* renamed from: d, reason: collision with root package name */
        private java.lang.String f5126d;

        /* renamed from: e, reason: collision with root package name */
        private com.amap.api.services.cloud.CloudSearch.SearchBound f5127e;

        /* renamed from: f, reason: collision with root package name */
        private com.amap.api.services.cloud.CloudSearch.Sortingrules f5128f;

        /* renamed from: g, reason: collision with root package name */
        private java.util.ArrayList<com.amap.api.col.s.i> f5129g;

        /* renamed from: h, reason: collision with root package name */
        private java.util.List<java.lang.String> f5130h;

        private Query() {
                r1 = this;
                r1.<init>()
                r0 = 1
                r1.f5124b = r0
                r0 = 20
                r1.f5125c = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.f5129g = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.f5130h = r0
                return
        }

        public Query(java.lang.String r2, java.lang.String r3, com.amap.api.services.cloud.CloudSearch.SearchBound r4) throws com.amap.api.services.core.AMapException {
                r1 = this;
                r1.<init>()
                r0 = 1
                r1.f5124b = r0
                r0 = 20
                r1.f5125c = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.f5129g = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.f5130h = r0
                boolean r0 = com.amap.api.col.s.j4.j(r2)
                if (r0 != 0) goto L27
                if (r4 == 0) goto L27
                r1.f5126d = r2
                r1.a = r3
                r1.f5127e = r4
                return
            L27:
                com.amap.api.services.core.AMapException r2 = new com.amap.api.services.core.AMapException
                java.lang.String r3 = "无效的参数 - IllegalArgumentException"
                r2.<init>(r3)
                throw r2
        }

        private java.util.ArrayList<com.amap.api.col.s.i> a() {
                r2 = this;
                java.util.ArrayList<com.amap.api.col.s.i> r0 = r2.f5129g
                if (r0 != 0) goto L6
                r0 = 0
                return r0
            L6:
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                java.util.ArrayList<com.amap.api.col.s.i> r1 = r2.f5129g
                r0.addAll(r1)
                return r0
        }

        private static boolean a(com.amap.api.services.cloud.CloudSearch.SearchBound r0, com.amap.api.services.cloud.CloudSearch.SearchBound r1) {
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

        private static boolean a(com.amap.api.services.cloud.CloudSearch.Sortingrules r0, com.amap.api.services.cloud.CloudSearch.Sortingrules r1) {
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

        private java.util.ArrayList<java.lang.String> b() {
                r2 = this;
                java.util.List<java.lang.String> r0 = r2.f5130h
                if (r0 != 0) goto L6
                r0 = 0
                return r0
            L6:
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                java.util.List<java.lang.String> r1 = r2.f5130h
                r0.addAll(r1)
                return r0
        }

        public void addFilterNum(java.lang.String r2, java.lang.String r3, java.lang.String r4) {
                r1 = this;
                com.amap.api.col.s.i r0 = new com.amap.api.col.s.i
                r0.<init>(r2, r3, r4)
                java.util.ArrayList<com.amap.api.col.s.i> r2 = r1.f5129g
                r2.add(r0)
                return
        }

        public void addFilterString(java.lang.String r3, java.lang.String r4) {
                r2 = this;
                if (r3 == 0) goto L18
                if (r4 == 0) goto L18
                java.util.List<java.lang.String> r0 = r2.f5130h
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r3)
                r1.append(r4)
                java.lang.String r3 = r1.toString()
                r0.add(r3)
            L18:
                return
        }

        public com.amap.api.services.cloud.CloudSearch.Query clone() {
                r5 = this;
                super.clone()     // Catch: java.lang.CloneNotSupportedException -> L3
            L3:
                r0 = 0
                com.amap.api.services.cloud.CloudSearch$Query r1 = new com.amap.api.services.cloud.CloudSearch$Query     // Catch: com.amap.api.services.core.AMapException -> L30
                java.lang.String r2 = r5.f5126d     // Catch: com.amap.api.services.core.AMapException -> L30
                java.lang.String r3 = r5.a     // Catch: com.amap.api.services.core.AMapException -> L30
                com.amap.api.services.cloud.CloudSearch$SearchBound r4 = r5.f5127e     // Catch: com.amap.api.services.core.AMapException -> L30
                r1.<init>(r2, r3, r4)     // Catch: com.amap.api.services.core.AMapException -> L30
                int r0 = r5.f5124b     // Catch: com.amap.api.services.core.AMapException -> L2d
                r1.setPageNum(r0)     // Catch: com.amap.api.services.core.AMapException -> L2d
                int r0 = r5.f5125c     // Catch: com.amap.api.services.core.AMapException -> L2d
                r1.setPageSize(r0)     // Catch: com.amap.api.services.core.AMapException -> L2d
                com.amap.api.services.cloud.CloudSearch$Sortingrules r0 = r5.getSortingrules()     // Catch: com.amap.api.services.core.AMapException -> L2d
                r1.setSortingrules(r0)     // Catch: com.amap.api.services.core.AMapException -> L2d
                java.util.ArrayList r0 = r5.a()     // Catch: com.amap.api.services.core.AMapException -> L2d
                r1.f5129g = r0     // Catch: com.amap.api.services.core.AMapException -> L2d
                java.util.ArrayList r0 = r5.b()     // Catch: com.amap.api.services.core.AMapException -> L2d
                r1.f5130h = r0     // Catch: com.amap.api.services.core.AMapException -> L2d
                goto L32
            L2d:
                r0 = r1
                goto L31
            L30:
            L31:
                r1 = r0
            L32:
                if (r1 != 0) goto L3a
                com.amap.api.services.cloud.CloudSearch$Query r0 = new com.amap.api.services.cloud.CloudSearch$Query
                r0.<init>()
                return r0
            L3a:
                return r1
        }

        /* renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ java.lang.Object m21clone() throws java.lang.CloneNotSupportedException {
                r1 = this;
                com.amap.api.services.cloud.CloudSearch$Query r0 = r1.clone()
                return r0
        }

        public boolean equals(java.lang.Object r4) {
                r3 = this;
                r0 = 0
                if (r4 == 0) goto L1b
                boolean r1 = r4 instanceof com.amap.api.services.cloud.CloudSearch.Query
                if (r1 != 0) goto L8
                goto L1b
            L8:
                r1 = 1
                if (r4 != r3) goto Lc
                return r1
            Lc:
                com.amap.api.services.cloud.CloudSearch$Query r4 = (com.amap.api.services.cloud.CloudSearch.Query) r4
                boolean r2 = r3.queryEquals(r4)
                if (r2 == 0) goto L1b
                int r4 = r4.f5124b
                int r2 = r3.f5124b
                if (r4 != r2) goto L1b
                return r1
            L1b:
                return r0
        }

        public com.amap.api.services.cloud.CloudSearch.SearchBound getBound() {
                r1 = this;
                com.amap.api.services.cloud.CloudSearch$SearchBound r0 = r1.f5127e
                return r0
        }

        public java.lang.String getFilterNumString() {
                r6 = this;
                java.lang.String r0 = "&&"
                java.lang.StringBuffer r1 = new java.lang.StringBuffer
                r1.<init>()
                java.util.ArrayList<com.amap.api.col.s.i> r2 = r6.f5129g     // Catch: java.lang.Throwable -> L4b
                int r2 = r2.size()     // Catch: java.lang.Throwable -> L4b
                r3 = 0
            Le:
                if (r3 >= r2) goto L4b
                java.util.ArrayList<com.amap.api.col.s.i> r4 = r6.f5129g     // Catch: java.lang.Throwable -> L4b
                java.lang.Object r4 = r4.get(r3)     // Catch: java.lang.Throwable -> L4b
                com.amap.api.col.s.i r4 = (com.amap.api.col.s.i) r4     // Catch: java.lang.Throwable -> L4b
                java.lang.String r5 = r4.a()     // Catch: java.lang.Throwable -> L4b
                r1.append(r5)     // Catch: java.lang.Throwable -> L4b
                java.lang.String r5 = ">="
                r1.append(r5)     // Catch: java.lang.Throwable -> L4b
                java.lang.String r5 = r4.b()     // Catch: java.lang.Throwable -> L4b
                r1.append(r5)     // Catch: java.lang.Throwable -> L4b
                r1.append(r0)     // Catch: java.lang.Throwable -> L4b
                java.lang.String r5 = r4.a()     // Catch: java.lang.Throwable -> L4b
                r1.append(r5)     // Catch: java.lang.Throwable -> L4b
                java.lang.String r5 = "<="
                r1.append(r5)     // Catch: java.lang.Throwable -> L4b
                java.lang.String r4 = r4.c()     // Catch: java.lang.Throwable -> L4b
                r1.append(r4)     // Catch: java.lang.Throwable -> L4b
                int r4 = r2 + (-1)
                if (r3 == r4) goto L48
                r1.append(r0)     // Catch: java.lang.Throwable -> L4b
            L48:
                int r3 = r3 + 1
                goto Le
            L4b:
                java.lang.String r0 = r1.toString()
                return r0
        }

        public java.lang.String getFilterString() {
                r4 = this;
                java.lang.StringBuffer r0 = new java.lang.StringBuffer
                r0.<init>()
                java.util.List<java.lang.String> r1 = r4.f5130h     // Catch: java.lang.Throwable -> L25
                int r1 = r1.size()     // Catch: java.lang.Throwable -> L25
                r2 = 0
            Lc:
                if (r2 >= r1) goto L25
                java.util.List<java.lang.String> r3 = r4.f5130h     // Catch: java.lang.Throwable -> L25
                java.lang.Object r3 = r3.get(r2)     // Catch: java.lang.Throwable -> L25
                java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L25
                r0.append(r3)     // Catch: java.lang.Throwable -> L25
                int r3 = r1 + (-1)
                if (r2 == r3) goto L22
                java.lang.String r3 = "&&"
                r0.append(r3)     // Catch: java.lang.Throwable -> L25
            L22:
                int r2 = r2 + 1
                goto Lc
            L25:
                java.lang.String r0 = r0.toString()
                return r0
        }

        public int getPageNum() {
                r1 = this;
                int r0 = r1.f5124b
                return r0
        }

        public int getPageSize() {
                r1 = this;
                int r0 = r1.f5125c
                return r0
        }

        public java.lang.String getQueryString() {
                r1 = this;
                java.lang.String r0 = r1.a
                return r0
        }

        public com.amap.api.services.cloud.CloudSearch.Sortingrules getSortingrules() {
                r1 = this;
                com.amap.api.services.cloud.CloudSearch$Sortingrules r0 = r1.f5128f
                return r0
        }

        public java.lang.String getTableID() {
                r1 = this;
                java.lang.String r0 = r1.f5126d
                return r0
        }

        public int hashCode() {
                r3 = this;
                java.util.ArrayList<com.amap.api.col.s.i> r0 = r3.f5129g
                r1 = 0
                if (r0 != 0) goto L7
                r0 = 0
                goto Lb
            L7:
                int r0 = r0.hashCode()
            Lb:
                int r0 = r0 + 31
                int r0 = r0 * 31
                java.util.List<java.lang.String> r2 = r3.f5130h
                if (r2 != 0) goto L15
                r2 = 0
                goto L19
            L15:
                int r2 = r2.hashCode()
            L19:
                int r0 = r0 + r2
                int r0 = r0 * 31
                com.amap.api.services.cloud.CloudSearch$SearchBound r2 = r3.f5127e
                if (r2 != 0) goto L22
                r2 = 0
                goto L26
            L22:
                int r2 = r2.hashCode()
            L26:
                int r0 = r0 + r2
                int r0 = r0 * 31
                int r2 = r3.f5124b
                int r0 = r0 + r2
                int r0 = r0 * 31
                int r2 = r3.f5125c
                int r0 = r0 + r2
                int r0 = r0 * 31
                java.lang.String r2 = r3.a
                if (r2 != 0) goto L39
                r2 = 0
                goto L3d
            L39:
                int r2 = r2.hashCode()
            L3d:
                int r0 = r0 + r2
                int r0 = r0 * 31
                com.amap.api.services.cloud.CloudSearch$Sortingrules r2 = r3.f5128f
                if (r2 != 0) goto L46
                r2 = 0
                goto L4a
            L46:
                int r2 = r2.hashCode()
            L4a:
                int r0 = r0 + r2
                int r0 = r0 * 31
                java.lang.String r2 = r3.f5126d
                if (r2 != 0) goto L52
                goto L56
            L52:
                int r1 = r2.hashCode()
            L56:
                int r0 = r0 + r1
                return r0
        }

        public boolean queryEquals(com.amap.api.services.cloud.CloudSearch.Query r5) {
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
                boolean r2 = com.amap.api.services.cloud.CloudSearch.a(r2, r3)
                if (r2 == 0) goto L5f
                java.lang.String r2 = r5.getTableID()
                java.lang.String r3 = r4.getTableID()
                boolean r2 = com.amap.api.services.cloud.CloudSearch.a(r2, r3)
                if (r2 == 0) goto L5f
                java.lang.String r2 = r5.getFilterString()
                java.lang.String r3 = r4.getFilterString()
                boolean r2 = com.amap.api.services.cloud.CloudSearch.a(r2, r3)
                if (r2 == 0) goto L5f
                java.lang.String r2 = r5.getFilterNumString()
                java.lang.String r3 = r4.getFilterNumString()
                boolean r2 = com.amap.api.services.cloud.CloudSearch.a(r2, r3)
                if (r2 == 0) goto L5f
                int r2 = r5.f5125c
                int r3 = r4.f5125c
                if (r2 != r3) goto L5f
                com.amap.api.services.cloud.CloudSearch$SearchBound r2 = r5.getBound()
                com.amap.api.services.cloud.CloudSearch$SearchBound r3 = r4.getBound()
                boolean r2 = a(r2, r3)
                if (r2 == 0) goto L5f
                com.amap.api.services.cloud.CloudSearch$Sortingrules r5 = r5.getSortingrules()
                com.amap.api.services.cloud.CloudSearch$Sortingrules r2 = r4.getSortingrules()
                boolean r5 = a(r5, r2)
                if (r5 == 0) goto L5f
                return r1
            L5f:
                return r0
        }

        public void setBound(com.amap.api.services.cloud.CloudSearch.SearchBound r1) {
                r0 = this;
                r0.f5127e = r1
                return
        }

        public void setPageNum(int r1) {
                r0 = this;
                r0.f5124b = r1
                return
        }

        public void setPageSize(int r2) {
                r1 = this;
                if (r2 > 0) goto L7
                r2 = 20
                r1.f5125c = r2
                return
            L7:
                r0 = 100
                if (r2 <= r0) goto Le
                r1.f5125c = r0
                return
            Le:
                r1.f5125c = r2
                return
        }

        public void setSortingrules(com.amap.api.services.cloud.CloudSearch.Sortingrules r1) {
                r0 = this;
                r0.f5128f = r1
                return
        }

        public void setTableID(java.lang.String r1) {
                r0 = this;
                r0.f5126d = r1
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class SearchBound implements java.lang.Cloneable {
        public static final java.lang.String BOUND_SHAPE = "Bound";
        public static final java.lang.String LOCAL_SHAPE = "Local";
        public static final java.lang.String POLYGON_SHAPE = "Polygon";
        public static final java.lang.String RECTANGLE_SHAPE = "Rectangle";
        private com.amap.api.services.core.LatLonPoint a;

        /* renamed from: b, reason: collision with root package name */
        private com.amap.api.services.core.LatLonPoint f5131b;

        /* renamed from: c, reason: collision with root package name */
        private int f5132c;

        /* renamed from: d, reason: collision with root package name */
        private com.amap.api.services.core.LatLonPoint f5133d;

        /* renamed from: e, reason: collision with root package name */
        private java.lang.String f5134e;

        /* renamed from: f, reason: collision with root package name */
        private java.util.List<com.amap.api.services.core.LatLonPoint> f5135f;

        /* renamed from: g, reason: collision with root package name */
        private java.lang.String f5136g;

        public SearchBound(com.amap.api.services.core.LatLonPoint r2, int r3) {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "Bound"
                r1.f5134e = r0
                r1.f5132c = r3
                r1.f5133d = r2
                return
        }

        public SearchBound(com.amap.api.services.core.LatLonPoint r2, com.amap.api.services.core.LatLonPoint r3) {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "Rectangle"
                r1.f5134e = r0
                boolean r2 = r1.a(r2, r3)
                if (r2 != 0) goto L14
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r3 = "invalid rect "
                r2.<init>(r3)
            L14:
                return
        }

        public SearchBound(java.lang.String r2) {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "Local"
                r1.f5134e = r0
                r1.f5136g = r2
                return
        }

        public SearchBound(java.util.List<com.amap.api.services.core.LatLonPoint> r2) {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "Polygon"
                r1.f5134e = r0
                r1.f5135f = r2
                return
        }

        private java.util.List<com.amap.api.services.core.LatLonPoint> a() {
                r8 = this;
                java.util.List<com.amap.api.services.core.LatLonPoint> r0 = r8.f5135f
                if (r0 != 0) goto L6
                r0 = 0
                return r0
            L6:
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                java.util.List<com.amap.api.services.core.LatLonPoint> r1 = r8.f5135f
                java.util.Iterator r1 = r1.iterator()
            L11:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L2e
                java.lang.Object r2 = r1.next()
                com.amap.api.services.core.LatLonPoint r2 = (com.amap.api.services.core.LatLonPoint) r2
                com.amap.api.services.core.LatLonPoint r3 = new com.amap.api.services.core.LatLonPoint
                double r4 = r2.getLatitude()
                double r6 = r2.getLongitude()
                r3.<init>(r4, r6)
                r0.add(r3)
                goto L11
            L2e:
                return r0
        }

        private boolean a(com.amap.api.services.core.LatLonPoint r5, com.amap.api.services.core.LatLonPoint r6) {
                r4 = this;
                r4.a = r5
                r4.f5131b = r6
                r0 = 0
                if (r5 == 0) goto L2b
                if (r6 != 0) goto La
                goto L2b
            La:
                double r5 = r5.getLatitude()
                com.amap.api.services.core.LatLonPoint r1 = r4.f5131b
                double r1 = r1.getLatitude()
                int r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
                if (r3 >= 0) goto L2b
                com.amap.api.services.core.LatLonPoint r5 = r4.a
                double r5 = r5.getLongitude()
                com.amap.api.services.core.LatLonPoint r1 = r4.f5131b
                double r1 = r1.getLongitude()
                int r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
                if (r3 < 0) goto L29
                goto L2b
            L29:
                r5 = 1
                return r5
            L2b:
                return r0
        }

        private static boolean a(java.util.List<com.amap.api.services.core.LatLonPoint> r6, java.util.List<com.amap.api.services.core.LatLonPoint> r7) {
                r0 = 1
                if (r6 != 0) goto L6
                if (r7 != 0) goto L6
                return r0
            L6:
                r1 = 0
                if (r6 == 0) goto L31
                if (r7 == 0) goto L31
                int r2 = r6.size()
                int r3 = r7.size()
                if (r2 != r3) goto L31
                int r2 = r6.size()
                r3 = 0
            L1a:
                if (r3 >= r2) goto L30
                java.lang.Object r4 = r6.get(r3)
                com.amap.api.services.core.LatLonPoint r4 = (com.amap.api.services.core.LatLonPoint) r4
                java.lang.Object r5 = r7.get(r3)
                boolean r4 = r4.equals(r5)
                if (r4 != 0) goto L2d
                return r1
            L2d:
                int r3 = r3 + 1
                goto L1a
            L30:
                return r0
            L31:
                return r1
        }

        public com.amap.api.services.cloud.CloudSearch.SearchBound clone() {
                r3 = this;
                super.clone()     // Catch: java.lang.CloneNotSupportedException -> L4
                goto L5
            L4:
            L5:
                java.lang.String r0 = r3.getShape()
                java.lang.String r1 = "Bound"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L1b
                com.amap.api.services.cloud.CloudSearch$SearchBound r0 = new com.amap.api.services.cloud.CloudSearch$SearchBound
                com.amap.api.services.core.LatLonPoint r1 = r3.f5133d
                int r2 = r3.f5132c
                r0.<init>(r1, r2)
                return r0
            L1b:
                java.lang.String r0 = r3.getShape()
                java.lang.String r1 = "Polygon"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L31
                com.amap.api.services.cloud.CloudSearch$SearchBound r0 = new com.amap.api.services.cloud.CloudSearch$SearchBound
                java.util.List r1 = r3.a()
                r0.<init>(r1)
                return r0
            L31:
                java.lang.String r0 = r3.getShape()
                java.lang.String r1 = "Local"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L45
                com.amap.api.services.cloud.CloudSearch$SearchBound r0 = new com.amap.api.services.cloud.CloudSearch$SearchBound
                java.lang.String r1 = r3.f5136g
                r0.<init>(r1)
                return r0
            L45:
                com.amap.api.services.cloud.CloudSearch$SearchBound r0 = new com.amap.api.services.cloud.CloudSearch$SearchBound
                com.amap.api.services.core.LatLonPoint r1 = r3.a
                com.amap.api.services.core.LatLonPoint r2 = r3.f5131b
                r0.<init>(r1, r2)
                return r0
        }

        /* renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ java.lang.Object m22clone() throws java.lang.CloneNotSupportedException {
                r1 = this;
                com.amap.api.services.cloud.CloudSearch$SearchBound r0 = r1.clone()
                return r0
        }

        public boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 0
                if (r5 == 0) goto L77
                boolean r1 = r5 instanceof com.amap.api.services.cloud.CloudSearch.SearchBound
                if (r1 != 0) goto L8
                goto L77
            L8:
                com.amap.api.services.cloud.CloudSearch$SearchBound r5 = (com.amap.api.services.cloud.CloudSearch.SearchBound) r5
                java.lang.String r1 = r4.getShape()
                java.lang.String r2 = r5.getShape()
                boolean r1 = r1.equalsIgnoreCase(r2)
                if (r1 != 0) goto L19
                return r0
            L19:
                java.lang.String r1 = r4.getShape()
                java.lang.String r2 = "Bound"
                boolean r1 = r1.equals(r2)
                r2 = 1
                if (r1 == 0) goto L38
                com.amap.api.services.core.LatLonPoint r1 = r5.f5133d
                com.amap.api.services.core.LatLonPoint r3 = r4.f5133d
                boolean r1 = r1.equals(r3)
                if (r1 == 0) goto L37
                int r5 = r5.f5132c
                int r1 = r4.f5132c
                if (r5 != r1) goto L37
                return r2
            L37:
                return r0
            L38:
                java.lang.String r1 = r4.getShape()
                java.lang.String r3 = "Polygon"
                boolean r1 = r1.equals(r3)
                if (r1 == 0) goto L4d
                java.util.List<com.amap.api.services.core.LatLonPoint> r5 = r5.f5135f
                java.util.List<com.amap.api.services.core.LatLonPoint> r0 = r4.f5135f
                boolean r5 = a(r5, r0)
                return r5
            L4d:
                java.lang.String r1 = r4.getShape()
                java.lang.String r3 = "Local"
                boolean r1 = r1.equals(r3)
                if (r1 == 0) goto L62
                java.lang.String r5 = r5.f5136g
                java.lang.String r0 = r4.f5136g
                boolean r5 = r5.equals(r0)
                return r5
            L62:
                com.amap.api.services.core.LatLonPoint r1 = r5.a
                com.amap.api.services.core.LatLonPoint r3 = r4.a
                boolean r1 = r1.equals(r3)
                if (r1 == 0) goto L77
                com.amap.api.services.core.LatLonPoint r5 = r5.f5131b
                com.amap.api.services.core.LatLonPoint r1 = r4.f5131b
                boolean r5 = r5.equals(r1)
                if (r5 == 0) goto L77
                return r2
            L77:
                return r0
        }

        public com.amap.api.services.core.LatLonPoint getCenter() {
                r1 = this;
                com.amap.api.services.core.LatLonPoint r0 = r1.f5133d
                return r0
        }

        public java.lang.String getCity() {
                r1 = this;
                java.lang.String r0 = r1.f5136g
                return r0
        }

        public com.amap.api.services.core.LatLonPoint getLowerLeft() {
                r1 = this;
                com.amap.api.services.core.LatLonPoint r0 = r1.a
                return r0
        }

        public java.util.List<com.amap.api.services.core.LatLonPoint> getPolyGonList() {
                r1 = this;
                java.util.List<com.amap.api.services.core.LatLonPoint> r0 = r1.f5135f
                return r0
        }

        public int getRange() {
                r1 = this;
                int r0 = r1.f5132c
                return r0
        }

        public java.lang.String getShape() {
                r1 = this;
                java.lang.String r0 = r1.f5134e
                return r0
        }

        public com.amap.api.services.core.LatLonPoint getUpperRight() {
                r1 = this;
                com.amap.api.services.core.LatLonPoint r0 = r1.f5131b
                return r0
        }

        public int hashCode() {
                r3 = this;
                com.amap.api.services.core.LatLonPoint r0 = r3.f5133d
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
                com.amap.api.services.core.LatLonPoint r2 = r3.f5131b
                if (r2 != 0) goto L22
                r2 = 0
                goto L26
            L22:
                int r2 = r2.hashCode()
            L26:
                int r0 = r0 + r2
                int r0 = r0 * 31
                java.util.List<com.amap.api.services.core.LatLonPoint> r2 = r3.f5135f
                if (r2 != 0) goto L2f
                r2 = 0
                goto L33
            L2f:
                int r2 = r2.hashCode()
            L33:
                int r0 = r0 + r2
                int r0 = r0 * 31
                int r2 = r3.f5132c
                int r0 = r0 + r2
                int r0 = r0 * 31
                java.lang.String r2 = r3.f5134e
                if (r2 != 0) goto L41
                r2 = 0
                goto L45
            L41:
                int r2 = r2.hashCode()
            L45:
                int r0 = r0 + r2
                int r0 = r0 * 31
                java.lang.String r2 = r3.f5136g
                if (r2 != 0) goto L4d
                goto L51
            L4d:
                int r1 = r2.hashCode()
            L51:
                int r0 = r0 + r1
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class Sortingrules {
        public static final int DISTANCE = 1;
        public static final int WEIGHT = 0;
        private int a;

        /* renamed from: b, reason: collision with root package name */
        private java.lang.String f5137b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f5138c;

        public Sortingrules(int r2) {
                r1 = this;
                r1.<init>()
                r0 = 1
                r1.f5138c = r0
                r1.a = r2
                return
        }

        public Sortingrules(java.lang.String r2, boolean r3) {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.a = r0
                r1.f5137b = r2
                r1.f5138c = r3
                return
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
                com.amap.api.services.cloud.CloudSearch$Sortingrules r5 = (com.amap.api.services.cloud.CloudSearch.Sortingrules) r5
                boolean r2 = r4.f5138c
                boolean r3 = r5.f5138c
                if (r2 == r3) goto L1c
                return r1
            L1c:
                java.lang.String r2 = r4.f5137b
                if (r2 != 0) goto L25
                java.lang.String r2 = r5.f5137b
                if (r2 == 0) goto L2e
                return r1
            L25:
                java.lang.String r3 = r5.f5137b
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L2e
                return r1
            L2e:
                int r2 = r4.a
                int r5 = r5.a
                if (r2 == r5) goto L35
                return r1
            L35:
                return r0
        }

        public int hashCode() {
                r2 = this;
                boolean r0 = r2.f5138c
                if (r0 == 0) goto L7
                r0 = 1231(0x4cf, float:1.725E-42)
                goto L9
            L7:
                r0 = 1237(0x4d5, float:1.733E-42)
            L9:
                int r0 = r0 + 31
                int r0 = r0 * 31
                java.lang.String r1 = r2.f5137b
                if (r1 != 0) goto L13
                r1 = 0
                goto L17
            L13:
                int r1 = r1.hashCode()
            L17:
                int r0 = r0 + r1
                int r0 = r0 * 31
                int r1 = r2.a
                int r0 = r0 + r1
                return r0
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.String r0 = r2.f5137b
                boolean r0 = com.amap.api.col.s.j4.j(r0)
                if (r0 == 0) goto L18
                int r0 = r2.a
                if (r0 != 0) goto Lf
                java.lang.String r0 = "_weight:desc"
                return r0
            Lf:
                r1 = 1
                if (r0 != r1) goto L15
                java.lang.String r0 = "_distance:asc"
                return r0
            L15:
                java.lang.String r0 = ""
                return r0
            L18:
                boolean r0 = r2.f5138c
                if (r0 == 0) goto L30
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r2.f5137b
                r0.append(r1)
                java.lang.String r1 = ":asc"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
            L30:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r2.f5137b
                r0.append(r1)
                java.lang.String r1 = ":desc"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    public CloudSearch(android.content.Context r2) throws com.amap.api.services.core.AMapException {
            r1 = this;
            r1.<init>()
            com.amap.api.services.interfaces.ICloudSearch r0 = r1.a
            if (r0 != 0) goto L18
            com.amap.api.col.s.k0 r0 = new com.amap.api.col.s.k0     // Catch: java.lang.Exception -> Lf
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

    public void searchCloudAsyn(com.amap.api.services.cloud.CloudSearch.Query r2) {
            r1 = this;
            com.amap.api.services.interfaces.ICloudSearch r0 = r1.a
            if (r0 == 0) goto L7
            r0.searchCloudAsyn(r2)
        L7:
            return
    }

    public void searchCloudDetailAsyn(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            com.amap.api.services.interfaces.ICloudSearch r0 = r1.a
            if (r0 == 0) goto L7
            r0.searchCloudDetailAsyn(r2, r3)
        L7:
            return
    }

    public void setOnCloudSearchListener(com.amap.api.services.cloud.CloudSearch.OnCloudSearchListener r2) {
            r1 = this;
            com.amap.api.services.interfaces.ICloudSearch r0 = r1.a
            if (r0 == 0) goto L7
            r0.setOnCloudSearchListener(r2)
        L7:
            return
    }
}

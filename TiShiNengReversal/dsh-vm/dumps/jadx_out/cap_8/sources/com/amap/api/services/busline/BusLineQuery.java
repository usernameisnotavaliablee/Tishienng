package com.amap.api.services.busline;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class BusLineQuery implements java.lang.Cloneable {
    private java.lang.String a;

    /* renamed from: b, reason: collision with root package name */
    private java.lang.String f5091b;

    /* renamed from: c, reason: collision with root package name */
    private int f5092c;

    /* renamed from: d, reason: collision with root package name */
    private int f5093d;

    /* renamed from: e, reason: collision with root package name */
    private com.amap.api.services.busline.BusLineQuery.SearchType f5094e;

    /* renamed from: f, reason: collision with root package name */
    private java.lang.String f5095f;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum SearchType extends java.lang.Enum<com.amap.api.services.busline.BusLineQuery.SearchType> {
        public static final com.amap.api.services.busline.BusLineQuery.SearchType BY_LINE_ID = null;
        public static final com.amap.api.services.busline.BusLineQuery.SearchType BY_LINE_NAME = null;
        private static final /* synthetic */ com.amap.api.services.busline.BusLineQuery.SearchType[] a = null;

        static {
                com.amap.api.services.busline.BusLineQuery$SearchType r0 = new com.amap.api.services.busline.BusLineQuery$SearchType
                java.lang.String r1 = "BY_LINE_ID"
                r2 = 0
                r0.<init>(r1, r2)
                com.amap.api.services.busline.BusLineQuery.SearchType.BY_LINE_ID = r0
                com.amap.api.services.busline.BusLineQuery$SearchType r1 = new com.amap.api.services.busline.BusLineQuery$SearchType
                java.lang.String r3 = "BY_LINE_NAME"
                r4 = 1
                r1.<init>(r3, r4)
                com.amap.api.services.busline.BusLineQuery.SearchType.BY_LINE_NAME = r1
                r3 = 2
                com.amap.api.services.busline.BusLineQuery$SearchType[] r3 = new com.amap.api.services.busline.BusLineQuery.SearchType[r3]
                r3[r2] = r0
                r3[r4] = r1
                com.amap.api.services.busline.BusLineQuery.SearchType.a = r3
                return
        }

        SearchType(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.amap.api.services.busline.BusLineQuery.SearchType valueOf(java.lang.String r1) {
                java.lang.Class<com.amap.api.services.busline.BusLineQuery$SearchType> r0 = com.amap.api.services.busline.BusLineQuery.SearchType.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.amap.api.services.busline.BusLineQuery$SearchType r1 = (com.amap.api.services.busline.BusLineQuery.SearchType) r1
                return r1
        }

        public static com.amap.api.services.busline.BusLineQuery.SearchType[] values() {
                com.amap.api.services.busline.BusLineQuery$SearchType[] r0 = com.amap.api.services.busline.BusLineQuery.SearchType.a
                java.lang.Object r0 = r0.clone()
                com.amap.api.services.busline.BusLineQuery$SearchType[] r0 = (com.amap.api.services.busline.BusLineQuery.SearchType[]) r0
                return r0
        }
    }

    public BusLineQuery(java.lang.String r2, com.amap.api.services.busline.BusLineQuery.SearchType r3, java.lang.String r4) {
            r1 = this;
            r1.<init>()
            r0 = 20
            r1.f5092c = r0
            r0 = 1
            r1.f5093d = r0
            java.lang.String r0 = "base"
            r1.f5095f = r0
            r1.a = r2
            r1.f5094e = r3
            r1.f5091b = r4
            return
    }

    public com.amap.api.services.busline.BusLineQuery clone() {
            r4 = this;
            com.amap.api.services.busline.BusLineQuery r0 = new com.amap.api.services.busline.BusLineQuery
            java.lang.String r1 = r4.a
            com.amap.api.services.busline.BusLineQuery$SearchType r2 = r4.f5094e
            java.lang.String r3 = r4.f5091b
            r0.<init>(r1, r2, r3)
            int r1 = r4.f5093d
            r0.setPageNumber(r1)
            int r1 = r4.f5092c
            r0.setPageSize(r1)
            java.lang.String r1 = r4.f5095f
            r0.setExtensions(r1)
            return r0
    }

    /* renamed from: clone, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ java.lang.Object m19clone() throws java.lang.CloneNotSupportedException {
            r1 = this;
            com.amap.api.services.busline.BusLineQuery r0 = r1.clone()
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
            com.amap.api.services.busline.BusLineQuery r5 = (com.amap.api.services.busline.BusLineQuery) r5
            com.amap.api.services.busline.BusLineQuery$SearchType r2 = r4.f5094e
            com.amap.api.services.busline.BusLineQuery$SearchType r3 = r5.f5094e
            if (r2 == r3) goto L1c
            return r1
        L1c:
            java.lang.String r2 = r4.f5091b
            if (r2 != 0) goto L25
            java.lang.String r2 = r5.f5091b
            if (r2 == 0) goto L2e
            return r1
        L25:
            java.lang.String r3 = r5.f5091b
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L2e
            return r1
        L2e:
            int r2 = r4.f5093d
            int r3 = r5.f5093d
            if (r2 == r3) goto L35
            return r1
        L35:
            int r2 = r4.f5092c
            int r3 = r5.f5092c
            if (r2 == r3) goto L3c
            return r1
        L3c:
            java.lang.String r2 = r4.a
            if (r2 != 0) goto L45
            java.lang.String r2 = r5.a
            if (r2 == 0) goto L4e
            return r1
        L45:
            java.lang.String r3 = r5.a
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L4e
            return r1
        L4e:
            java.lang.String r2 = r4.f5095f
            if (r2 != 0) goto L57
            java.lang.String r5 = r5.f5095f
            if (r5 == 0) goto L60
            return r1
        L57:
            java.lang.String r5 = r5.f5095f
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L60
            return r1
        L60:
            return r0
    }

    public com.amap.api.services.busline.BusLineQuery.SearchType getCategory() {
            r1 = this;
            com.amap.api.services.busline.BusLineQuery$SearchType r0 = r1.f5094e
            return r0
    }

    public java.lang.String getCity() {
            r1 = this;
            java.lang.String r0 = r1.f5091b
            return r0
    }

    public java.lang.String getExtensions() {
            r1 = this;
            java.lang.String r0 = r1.f5095f
            return r0
    }

    public int getPageNumber() {
            r1 = this;
            int r0 = r1.f5093d
            return r0
    }

    public int getPageSize() {
            r1 = this;
            int r0 = r1.f5092c
            return r0
    }

    public java.lang.String getQueryString() {
            r1 = this;
            java.lang.String r0 = r1.a
            return r0
    }

    public int hashCode() {
            r3 = this;
            com.amap.api.services.busline.BusLineQuery$SearchType r0 = r3.f5094e
            r1 = 0
            if (r0 != 0) goto L7
            r0 = 0
            goto Lb
        L7:
            int r0 = r0.hashCode()
        Lb:
            int r0 = r0 + 31
            int r0 = r0 * 31
            java.lang.String r2 = r3.f5091b
            if (r2 != 0) goto L15
            r2 = 0
            goto L19
        L15:
            int r2 = r2.hashCode()
        L19:
            int r0 = r0 + r2
            int r0 = r0 * 31
            int r2 = r3.f5093d
            int r0 = r0 + r2
            int r0 = r0 * 31
            int r2 = r3.f5092c
            int r0 = r0 + r2
            int r0 = r0 * 31
            java.lang.String r2 = r3.a
            if (r2 != 0) goto L2c
            r2 = 0
            goto L30
        L2c:
            int r2 = r2.hashCode()
        L30:
            int r0 = r0 + r2
            int r0 = r0 * 31
            java.lang.String r2 = r3.f5095f
            if (r2 != 0) goto L38
            goto L3c
        L38:
            int r1 = r2.hashCode()
        L3c:
            int r0 = r0 + r1
            return r0
    }

    public void setCategory(com.amap.api.services.busline.BusLineQuery.SearchType r1) {
            r0 = this;
            r0.f5094e = r1
            return
    }

    public void setCity(java.lang.String r1) {
            r0 = this;
            r0.f5091b = r1
            return
    }

    public void setExtensions(java.lang.String r1) {
            r0 = this;
            r0.f5095f = r1
            return
    }

    public void setPageNumber(int r1) {
            r0 = this;
            if (r1 > 0) goto L3
            r1 = 1
        L3:
            r0.f5093d = r1
            return
    }

    public void setPageSize(int r1) {
            r0 = this;
            r0.f5092c = r1
            return
    }

    public void setQueryString(java.lang.String r1) {
            r0 = this;
            r0.a = r1
            return
    }

    public boolean weakEquals(com.amap.api.services.busline.BusLineQuery r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 != 0) goto L8
            return r1
        L8:
            java.lang.String r2 = r4.a
            if (r2 != 0) goto L13
            java.lang.String r2 = r5.getQueryString()
            if (r2 == 0) goto L20
            return r1
        L13:
            java.lang.String r2 = r5.getQueryString()
            java.lang.String r3 = r4.a
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L20
            return r1
        L20:
            java.lang.String r2 = r4.f5091b
            if (r2 != 0) goto L2b
            java.lang.String r2 = r5.getCity()
            if (r2 == 0) goto L38
            return r1
        L2b:
            java.lang.String r2 = r5.getCity()
            java.lang.String r3 = r4.f5091b
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L38
            return r1
        L38:
            int r2 = r4.f5092c
            int r3 = r5.getPageSize()
            if (r2 == r3) goto L41
            return r1
        L41:
            com.amap.api.services.busline.BusLineQuery$SearchType r5 = r5.getCategory()
            com.amap.api.services.busline.BusLineQuery$SearchType r2 = r4.f5094e
            int r5 = r5.compareTo(r2)
            if (r5 == 0) goto L4e
            return r1
        L4e:
            return r0
    }
}

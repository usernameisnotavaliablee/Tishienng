package com.amap.api.services.busline;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class BusStationQuery implements java.lang.Cloneable {
    private java.lang.String a;

    /* renamed from: b, reason: collision with root package name */
    private java.lang.String f5105b;

    /* renamed from: c, reason: collision with root package name */
    private int f5106c;

    /* renamed from: d, reason: collision with root package name */
    private int f5107d;

    public BusStationQuery(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            r1.<init>()
            r0 = 20
            r1.f5106c = r0
            r0 = 1
            r1.f5107d = r0
            r1.a = r2
            r1.f5105b = r3
            boolean r2 = r1.a()
            if (r2 != 0) goto L1b
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Empty query"
            r2.<init>(r3)
        L1b:
            return
    }

    private boolean a() {
            r1 = this;
            java.lang.String r0 = r1.a
            boolean r0 = com.amap.api.col.s.j4.j(r0)
            if (r0 != 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    public com.amap.api.services.busline.BusStationQuery clone() {
            r3 = this;
            com.amap.api.services.busline.BusStationQuery r0 = new com.amap.api.services.busline.BusStationQuery
            java.lang.String r1 = r3.a
            java.lang.String r2 = r3.f5105b
            r0.<init>(r1, r2)
            int r1 = r3.f5107d
            r0.setPageNumber(r1)
            int r1 = r3.f5106c
            r0.setPageSize(r1)
            return r0
    }

    /* renamed from: clone, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ java.lang.Object m20clone() throws java.lang.CloneNotSupportedException {
            r1 = this;
            com.amap.api.services.busline.BusStationQuery r0 = r1.clone()
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
            com.amap.api.services.busline.BusStationQuery r5 = (com.amap.api.services.busline.BusStationQuery) r5
            java.lang.String r2 = r4.f5105b
            if (r2 != 0) goto L1e
            java.lang.String r2 = r5.f5105b
            if (r2 == 0) goto L27
            return r1
        L1e:
            java.lang.String r3 = r5.f5105b
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L27
            return r1
        L27:
            int r2 = r4.f5107d
            int r3 = r5.f5107d
            if (r2 == r3) goto L2e
            return r1
        L2e:
            int r2 = r4.f5106c
            int r3 = r5.f5106c
            if (r2 == r3) goto L35
            return r1
        L35:
            java.lang.String r2 = r4.a
            if (r2 != 0) goto L3e
            java.lang.String r5 = r5.a
            if (r5 == 0) goto L47
            return r1
        L3e:
            java.lang.String r5 = r5.a
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L47
            return r1
        L47:
            return r0
    }

    public java.lang.String getCity() {
            r1 = this;
            java.lang.String r0 = r1.f5105b
            return r0
    }

    public int getPageNumber() {
            r1 = this;
            int r0 = r1.f5107d
            return r0
    }

    public int getPageSize() {
            r1 = this;
            int r0 = r1.f5106c
            return r0
    }

    public java.lang.String getQueryString() {
            r1 = this;
            java.lang.String r0 = r1.a
            return r0
    }

    public int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f5105b
            r1 = 0
            if (r0 != 0) goto L7
            r0 = 0
            goto Lb
        L7:
            int r0 = r0.hashCode()
        Lb:
            int r0 = r0 + 31
            int r0 = r0 * 31
            int r2 = r3.f5107d
            int r0 = r0 + r2
            int r0 = r0 * 31
            int r2 = r3.f5106c
            int r0 = r0 + r2
            int r0 = r0 * 31
            java.lang.String r2 = r3.a
            if (r2 != 0) goto L1e
            goto L22
        L1e:
            int r1 = r2.hashCode()
        L22:
            int r0 = r0 + r1
            return r0
    }

    public void setCity(java.lang.String r1) {
            r0 = this;
            r0.f5105b = r1
            return
    }

    public void setPageNumber(int r1) {
            r0 = this;
            if (r1 > 0) goto L3
            r1 = 1
        L3:
            r0.f5107d = r1
            return
    }

    public void setPageSize(int r1) {
            r0 = this;
            r0.f5106c = r1
            return
    }

    public void setQueryString(java.lang.String r1) {
            r0 = this;
            r0.a = r1
            return
    }

    public boolean weakEquals(com.amap.api.services.busline.BusStationQuery r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 != 0) goto L8
            return r1
        L8:
            java.lang.String r2 = r4.f5105b
            if (r2 != 0) goto L11
            java.lang.String r2 = r5.f5105b
            if (r2 == 0) goto L1a
            return r1
        L11:
            java.lang.String r3 = r5.f5105b
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L1a
            return r1
        L1a:
            int r2 = r4.f5106c
            int r3 = r5.f5106c
            if (r2 == r3) goto L21
            return r1
        L21:
            java.lang.String r2 = r4.a
            if (r2 != 0) goto L2a
            java.lang.String r5 = r5.a
            if (r5 == 0) goto L33
            return r1
        L2a:
            java.lang.String r5 = r5.a
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L33
            return r1
        L33:
            return r0
    }
}

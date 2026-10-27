package com.amap.api.services.district;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class DistrictSearchQuery implements android.os.Parcelable, java.lang.Cloneable {
    public static final android.os.Parcelable.Creator<com.amap.api.services.district.DistrictSearchQuery> CREATOR = null;
    public static final java.lang.String KEYWORDS_BUSINESS = "biz_area";
    public static final java.lang.String KEYWORDS_CITY = "city";
    public static final java.lang.String KEYWORDS_COUNTRY = "country";
    public static final java.lang.String KEYWORDS_DISTRICT = "district";
    public static final java.lang.String KEYWORDS_PROVINCE = "province";
    private int a;

    /* renamed from: b, reason: collision with root package name */
    private int f5179b;

    /* renamed from: c, reason: collision with root package name */
    private java.lang.String f5180c;

    /* renamed from: d, reason: collision with root package name */
    private java.lang.String f5181d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f5182e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f5183f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f5184g;

    /* renamed from: h, reason: collision with root package name */
    private int f5185h;


    static {
            com.amap.api.services.district.DistrictSearchQuery$1 r0 = new com.amap.api.services.district.DistrictSearchQuery$1
            r0.<init>()
            com.amap.api.services.district.DistrictSearchQuery.CREATOR = r0
            return
    }

    public DistrictSearchQuery() {
            r2 = this;
            r2.<init>()
            r0 = 1
            r2.a = r0
            r1 = 20
            r2.f5179b = r1
            r2.f5182e = r0
            r1 = 0
            r2.f5183f = r1
            r2.f5184g = r1
            r2.f5185h = r0
            return
    }

    public DistrictSearchQuery(java.lang.String r3, java.lang.String r4, int r5) {
            r2 = this;
            r2.<init>()
            r0 = 20
            r2.f5179b = r0
            r0 = 1
            r2.f5182e = r0
            r1 = 0
            r2.f5183f = r1
            r2.f5184g = r1
            r2.f5185h = r0
            r2.f5180c = r3
            r2.f5181d = r4
            r2.a = r5
            return
    }

    public DistrictSearchQuery(java.lang.String r1, java.lang.String r2, int r3, boolean r4, int r5) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r0.f5182e = r4
            r0.f5179b = r5
            return
    }

    public boolean checkKeyWords() {
            r3 = this;
            java.lang.String r0 = r3.f5180c
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            java.lang.String r0 = r0.trim()
            java.lang.String r2 = ""
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L13
            return r1
        L13:
            r0 = 1
            return r0
    }

    public boolean checkLevels() {
            r3 = this;
            java.lang.String r0 = r3.f5181d
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            java.lang.String r0 = r0.trim()
            java.lang.String r2 = "country"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L4c
            java.lang.String r0 = r3.f5181d
            java.lang.String r0 = r0.trim()
            java.lang.String r2 = "province"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L4c
            java.lang.String r0 = r3.f5181d
            java.lang.String r0 = r0.trim()
            java.lang.String r2 = "city"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L4c
            java.lang.String r0 = r3.f5181d
            java.lang.String r0 = r0.trim()
            java.lang.String r2 = "district"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L4c
            java.lang.String r0 = r3.f5181d
            java.lang.String r0 = r0.trim()
            java.lang.String r2 = "biz_area"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L4b
            goto L4c
        L4b:
            return r1
        L4c:
            r0 = 1
            return r0
    }

    public com.amap.api.services.district.DistrictSearchQuery clone() {
            r3 = this;
            super.clone()     // Catch: java.lang.CloneNotSupportedException -> L4
            goto Lc
        L4:
            r0 = move-exception
            java.lang.String r1 = "DistrictSearchQuery"
            java.lang.String r2 = "clone"
            com.amap.api.col.s.j4.i(r0, r1, r2)
        Lc:
            com.amap.api.services.district.DistrictSearchQuery r0 = new com.amap.api.services.district.DistrictSearchQuery
            r0.<init>()
            java.lang.String r1 = r3.f5180c
            r0.setKeywords(r1)
            java.lang.String r1 = r3.f5181d
            r0.setKeywordsLevel(r1)
            int r1 = r3.a
            r0.setPageNum(r1)
            int r1 = r3.f5179b
            r0.setPageSize(r1)
            boolean r1 = r3.f5182e
            r0.setShowChild(r1)
            int r1 = r3.f5185h
            r0.setSubDistrict(r1)
            boolean r1 = r3.f5184g
            r0.setShowBoundary(r1)
            boolean r1 = r3.f5183f
            r0.setShowBusinessArea(r1)
            return r0
    }

    /* renamed from: clone, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ java.lang.Object m23clone() throws java.lang.CloneNotSupportedException {
            r1 = this;
            com.amap.api.services.district.DistrictSearchQuery r0 = r1.clone()
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
            com.amap.api.services.district.DistrictSearchQuery r5 = (com.amap.api.services.district.DistrictSearchQuery) r5
            boolean r2 = r4.f5184g
            boolean r3 = r5.f5184g
            if (r2 == r3) goto L1c
            return r1
        L1c:
            java.lang.String r2 = r4.f5180c
            if (r2 != 0) goto L25
            java.lang.String r2 = r5.f5180c
            if (r2 == 0) goto L2e
            return r1
        L25:
            java.lang.String r3 = r5.f5180c
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L2e
            return r1
        L2e:
            int r2 = r4.a
            int r3 = r5.a
            if (r2 == r3) goto L35
            return r1
        L35:
            int r2 = r4.f5179b
            int r3 = r5.f5179b
            if (r2 == r3) goto L3c
            return r1
        L3c:
            boolean r2 = r4.f5182e
            boolean r3 = r5.f5182e
            if (r2 == r3) goto L43
            return r1
        L43:
            int r2 = r4.f5185h
            int r5 = r5.f5185h
            if (r2 == r5) goto L4a
            return r1
        L4a:
            return r0
    }

    public java.lang.String getKeywords() {
            r1 = this;
            java.lang.String r0 = r1.f5180c
            return r0
    }

    public java.lang.String getKeywordsLevel() {
            r1 = this;
            java.lang.String r0 = r1.f5181d
            return r0
    }

    public int getPageNum() {
            r1 = this;
            int r0 = r1.a
            if (r0 > 0) goto L5
            r0 = 1
        L5:
            return r0
    }

    public int getPageSize() {
            r1 = this;
            int r0 = r1.f5179b
            return r0
    }

    public int getSubDistrict() {
            r1 = this;
            int r0 = r1.f5185h
            return r0
    }

    public int hashCode() {
            r5 = this;
            boolean r0 = r5.f5184g
            r1 = 1237(0x4d5, float:1.733E-42)
            r2 = 1231(0x4cf, float:1.725E-42)
            if (r0 == 0) goto Lb
            r0 = 1231(0x4cf, float:1.725E-42)
            goto Ld
        Lb:
            r0 = 1237(0x4d5, float:1.733E-42)
        Ld:
            int r0 = r0 + 31
            int r0 = r0 * 31
            java.lang.String r3 = r5.f5180c
            r4 = 0
            if (r3 != 0) goto L18
            r3 = 0
            goto L1c
        L18:
            int r3 = r3.hashCode()
        L1c:
            int r0 = r0 + r3
            int r0 = r0 * 31
            java.lang.String r3 = r5.f5181d
            if (r3 != 0) goto L24
            goto L28
        L24:
            int r4 = r3.hashCode()
        L28:
            int r0 = r0 + r4
            int r0 = r0 * 31
            int r3 = r5.a
            int r0 = r0 + r3
            int r0 = r0 * 31
            int r3 = r5.f5179b
            int r0 = r0 + r3
            int r0 = r0 * 31
            boolean r3 = r5.f5182e
            if (r3 == 0) goto L3b
            r1 = 1231(0x4cf, float:1.725E-42)
        L3b:
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r5.f5185h
            int r0 = r0 + r1
            return r0
    }

    public boolean isShowBoundary() {
            r1 = this;
            boolean r0 = r1.f5184g
            return r0
    }

    public boolean isShowBusinessArea() {
            r1 = this;
            boolean r0 = r1.f5183f
            return r0
    }

    public boolean isShowChild() {
            r1 = this;
            boolean r0 = r1.f5182e
            return r0
    }

    public void setKeywords(java.lang.String r1) {
            r0 = this;
            r0.f5180c = r1
            return
    }

    public void setKeywordsLevel(java.lang.String r1) {
            r0 = this;
            r0.f5181d = r1
            return
    }

    public void setPageNum(int r1) {
            r0 = this;
            r0.a = r1
            return
    }

    public void setPageSize(int r1) {
            r0 = this;
            r0.f5179b = r1
            return
    }

    public void setShowBoundary(boolean r1) {
            r0 = this;
            r0.f5184g = r1
            return
    }

    public void setShowBusinessArea(boolean r1) {
            r0 = this;
            r0.f5183f = r1
            return
    }

    public void setShowChild(boolean r1) {
            r0 = this;
            r0.f5182e = r1
            return
    }

    public void setSubDistrict(int r1) {
            r0 = this;
            r0.f5185h = r1
            return
    }

    public boolean weakEquals(com.amap.api.services.district.DistrictSearchQuery r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 != 0) goto L8
            return r1
        L8:
            java.lang.String r2 = r4.f5180c
            if (r2 != 0) goto L11
            java.lang.String r2 = r5.f5180c
            if (r2 == 0) goto L1a
            return r1
        L11:
            java.lang.String r3 = r5.f5180c
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L1a
            return r1
        L1a:
            int r2 = r4.f5179b
            int r3 = r5.f5179b
            if (r2 == r3) goto L21
            return r1
        L21:
            boolean r2 = r4.f5182e
            boolean r3 = r5.f5182e
            if (r2 == r3) goto L28
            return r1
        L28:
            boolean r2 = r4.f5184g
            boolean r3 = r5.f5184g
            if (r2 == r3) goto L2f
            return r1
        L2f:
            int r2 = r4.f5185h
            int r5 = r5.f5185h
            if (r2 == r5) goto L36
            return r1
        L36:
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            java.lang.String r2 = r0.f5180c
            r1.writeString(r2)
            java.lang.String r2 = r0.f5181d
            r1.writeString(r2)
            int r2 = r0.a
            r1.writeInt(r2)
            int r2 = r0.f5179b
            r1.writeInt(r2)
            boolean r2 = r0.f5182e
            byte r2 = (byte) r2
            r1.writeByte(r2)
            boolean r2 = r0.f5184g
            byte r2 = (byte) r2
            r1.writeByte(r2)
            boolean r2 = r0.f5183f
            byte r2 = (byte) r2
            r1.writeByte(r2)
            int r2 = r0.f5185h
            r1.writeInt(r2)
            return
    }
}

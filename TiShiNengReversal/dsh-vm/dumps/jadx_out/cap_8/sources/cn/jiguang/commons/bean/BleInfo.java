package cn.jiguang.commons.bean;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class BleInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<cn.jiguang.commons.bean.BleInfo> CREATOR = null;
    private java.lang.String a;

    /* renamed from: c, reason: collision with root package name */
    private java.lang.String f968c;

    /* renamed from: d, reason: collision with root package name */
    private int f969d;

    /* renamed from: e, reason: collision with root package name */
    private int f970e;

    /* renamed from: f, reason: collision with root package name */
    private java.util.List f971f;

    class a implements android.os.Parcelable.Creator {
        a() {
                r0 = this;
                r0.<init>()
                return
        }

        public cn.jiguang.commons.bean.BleInfo a(android.os.Parcel r2) {
                r1 = this;
                cn.jiguang.commons.bean.BleInfo r0 = new cn.jiguang.commons.bean.BleInfo
                r0.<init>(r2)
                return r0
        }

        public cn.jiguang.commons.bean.BleInfo[] a(int r1) {
                r0 = this;
                cn.jiguang.commons.bean.BleInfo[] r1 = new cn.jiguang.commons.bean.BleInfo[r1]
                return r1
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r1) {
                r0 = this;
                cn.jiguang.commons.bean.BleInfo r1 = r0.a(r1)
                return r1
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ java.lang.Object[] newArray(int r1) {
                r0 = this;
                cn.jiguang.commons.bean.BleInfo[] r1 = r0.a(r1)
                return r1
        }
    }

    static {
            cn.jiguang.commons.bean.BleInfo$a r0 = new cn.jiguang.commons.bean.BleInfo$a
            r0.<init>()
            cn.jiguang.commons.bean.BleInfo.CREATOR = r0
            return
    }

    public BleInfo() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = ""
            r1.a = r0
            r1.f968c = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f971f = r0
            return
    }

    protected BleInfo(android.os.Parcel r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = ""
            r1.a = r0
            r1.f968c = r0
            java.lang.String r0 = r2.readString()
            r1.a = r0
            java.lang.String r0 = r2.readString()
            r1.f968c = r0
            int r0 = r2.readInt()
            r1.f969d = r0
            int r0 = r2.readInt()
            r1.f970e = r0
            android.os.Parcelable$Creator<cn.jiguang.commons.bean.Peripheral> r0 = cn.jiguang.commons.bean.Peripheral.CREATOR
            java.util.ArrayList r2 = r2.createTypedArrayList(r0)
            r1.f971f = r2
            return
    }

    public org.json.JSONObject a() {
            r5 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = r5.a
            java.lang.String r2 = ""
            if (r1 == 0) goto Lc
            goto Ld
        Lc:
            r1 = r2
        Ld:
            java.lang.String r3 = "name"
            r0.put(r3, r1)
            java.lang.String r1 = r5.f968c
            if (r1 == 0) goto L17
            r2 = r1
        L17:
            java.lang.String r1 = "address"
            r0.put(r1, r2)
            int r1 = r5.f969d
            java.lang.String r2 = "scan_m"
            r0.put(r2, r1)
            int r1 = r5.f970e
            java.lang.String r2 = "state"
            r0.put(r2, r1)
            org.json.JSONArray r1 = new org.json.JSONArray
            r1.<init>()
            java.util.List r2 = r5.f971f
            if (r2 == 0) goto L55
            java.util.Iterator r2 = r2.iterator()
        L37:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L55
            java.lang.Object r3 = r2.next()
            cn.jiguang.commons.bean.Peripheral r3 = (cn.jiguang.commons.bean.Peripheral) r3
            if (r3 == 0) goto L37
            org.json.JSONObject r3 = r3.k()
            if (r3 == 0) goto L37
            int r4 = r3.length()
            if (r4 <= 0) goto L37
            r1.put(r3)
            goto L37
        L55:
            java.lang.String r2 = "pls"
            r0.put(r2, r1)
            return r0
    }

    public void a(int r1) {
            r0 = this;
            r0.f969d = r1
            return
    }

    public void a(cn.jiguang.commons.bean.Peripheral r2) {
            r1 = this;
            if (r2 == 0) goto L7
            java.util.List r0 = r1.f971f
            r0.add(r2)
        L7:
            return
    }

    public void a(java.lang.String r1) {
            r0 = this;
            if (r1 == 0) goto L3
            goto L5
        L3:
            java.lang.String r1 = ""
        L5:
            r0.f968c = r1
            return
    }

    public void c(int r1) {
            r0 = this;
            r0.f970e = r1
            return
    }

    public void c(java.lang.String r1) {
            r0 = this;
            if (r1 == 0) goto L3
            goto L5
        L3:
            java.lang.String r1 = ""
        L5:
            r0.a = r1
            return
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            java.lang.String r2 = r0.a
            r1.writeString(r2)
            java.lang.String r2 = r0.f968c
            r1.writeString(r2)
            int r2 = r0.f969d
            r1.writeInt(r2)
            int r2 = r0.f970e
            r1.writeInt(r2)
            java.util.List r2 = r0.f971f
            r1.writeTypedList(r2)
            return
    }
}

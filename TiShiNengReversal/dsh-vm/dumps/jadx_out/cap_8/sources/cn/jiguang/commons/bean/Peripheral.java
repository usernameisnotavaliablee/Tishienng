package cn.jiguang.commons.bean;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class Peripheral implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<cn.jiguang.commons.bean.Peripheral> CREATOR = null;
    private int a;

    /* renamed from: c, reason: collision with root package name */
    private int f987c;

    /* renamed from: d, reason: collision with root package name */
    private java.lang.String f988d;

    /* renamed from: e, reason: collision with root package name */
    private java.lang.String f989e;

    /* renamed from: f, reason: collision with root package name */
    private int f990f;

    /* renamed from: g, reason: collision with root package name */
    private int f991g;

    /* renamed from: h, reason: collision with root package name */
    private java.util.List f992h;

    /* renamed from: i, reason: collision with root package name */
    private cn.jiguang.commons.bean.EddystoneData f993i;

    /* renamed from: j, reason: collision with root package name */
    private cn.jiguang.commons.bean.IBeaconData f994j;

    class a implements android.os.Parcelable.Creator {
        a() {
                r0 = this;
                r0.<init>()
                return
        }

        public cn.jiguang.commons.bean.Peripheral a(android.os.Parcel r2) {
                r1 = this;
                cn.jiguang.commons.bean.Peripheral r0 = new cn.jiguang.commons.bean.Peripheral
                r0.<init>(r2)
                return r0
        }

        public cn.jiguang.commons.bean.Peripheral[] a(int r1) {
                r0 = this;
                cn.jiguang.commons.bean.Peripheral[] r1 = new cn.jiguang.commons.bean.Peripheral[r1]
                return r1
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r1) {
                r0 = this;
                cn.jiguang.commons.bean.Peripheral r1 = r0.a(r1)
                return r1
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ java.lang.Object[] newArray(int r1) {
                r0 = this;
                cn.jiguang.commons.bean.Peripheral[] r1 = r0.a(r1)
                return r1
        }
    }

    static {
            cn.jiguang.commons.bean.Peripheral$a r0 = new cn.jiguang.commons.bean.Peripheral$a
            r0.<init>()
            cn.jiguang.commons.bean.Peripheral.CREATOR = r0
            return
    }

    public Peripheral() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = ""
            r1.f988d = r0
            r1.f989e = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f992h = r0
            return
    }

    protected Peripheral(android.os.Parcel r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = ""
            r1.f988d = r0
            r1.f989e = r0
            int r0 = r2.readInt()
            r1.a = r0
            int r0 = r2.readInt()
            r1.f987c = r0
            java.lang.String r0 = r2.readString()
            r1.f988d = r0
            java.lang.String r0 = r2.readString()
            r1.f989e = r0
            int r0 = r2.readInt()
            r1.f990f = r0
            int r0 = r2.readInt()
            r1.f991g = r0
            java.util.ArrayList r0 = r2.createStringArrayList()
            r1.f992h = r0
            java.lang.Class<cn.jiguang.commons.bean.EddystoneData> r0 = cn.jiguang.commons.bean.EddystoneData.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r0 = r2.readParcelable(r0)
            cn.jiguang.commons.bean.EddystoneData r0 = (cn.jiguang.commons.bean.EddystoneData) r0
            r1.f993i = r0
            java.lang.Class<cn.jiguang.commons.bean.IBeaconData> r0 = cn.jiguang.commons.bean.IBeaconData.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r2 = r2.readParcelable(r0)
            cn.jiguang.commons.bean.IBeaconData r2 = (cn.jiguang.commons.bean.IBeaconData) r2
            r1.f994j = r2
            return
    }

    public java.lang.String a() {
            r1 = this;
            java.lang.String r0 = r1.f988d
            return r0
    }

    public void a(int r1) {
            r0 = this;
            r0.f990f = r1
            return
    }

    public void a(cn.jiguang.commons.bean.EddystoneData r1) {
            r0 = this;
            r0.f993i = r1
            return
    }

    public void a(cn.jiguang.commons.bean.IBeaconData r1) {
            r0 = this;
            r0.f994j = r1
            return
    }

    public void a(java.lang.String r2) {
            r1 = this;
            if (r2 == 0) goto Ld
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Ld
            java.util.List r0 = r1.f992h
            r0.add(r2)
        Ld:
            return
    }

    public int c() {
            r1 = this;
            int r0 = r1.f990f
            return r0
    }

    public void c(int r1) {
            r0 = this;
            r0.f987c = r1
            return
    }

    public void c(java.lang.String r1) {
            r0 = this;
            if (r1 == 0) goto L3
            goto L5
        L3:
            java.lang.String r1 = ""
        L5:
            r0.f988d = r1
            return
    }

    public int d() {
            r1 = this;
            int r0 = r1.f987c
            return r0
    }

    public void d(int r1) {
            r0 = this;
            r0.f991g = r1
            return
    }

    public void d(java.lang.String r1) {
            r0 = this;
            if (r1 == 0) goto L3
            goto L5
        L3:
            java.lang.String r1 = ""
        L5:
            r0.f989e = r1
            return
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public cn.jiguang.commons.bean.EddystoneData e() {
            r1 = this;
            cn.jiguang.commons.bean.EddystoneData r0 = r1.f993i
            return r0
    }

    public void e(int r1) {
            r0 = this;
            r0.a = r1
            return
    }

    public cn.jiguang.commons.bean.IBeaconData f() {
            r1 = this;
            cn.jiguang.commons.bean.IBeaconData r0 = r1.f994j
            return r0
    }

    public java.lang.String g() {
            r1 = this;
            java.lang.String r0 = r1.f989e
            return r0
    }

    public int h() {
            r1 = this;
            int r0 = r1.f991g
            return r0
    }

    public int i() {
            r1 = this;
            int r0 = r1.a
            return r0
    }

    public java.util.List j() {
            r1 = this;
            java.util.List r0 = r1.f992h
            return r0
    }

    public org.json.JSONObject k() {
            r5 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            int r1 = r5.a
            java.lang.String r2 = "type"
            r0.put(r2, r1)
            int r1 = r5.f987c
            java.lang.String r2 = "class"
            r0.put(r2, r1)
            java.lang.String r1 = r5.f988d
            java.lang.String r2 = ""
            if (r1 == 0) goto L1a
            goto L1b
        L1a:
            r1 = r2
        L1b:
            java.lang.String r3 = "address"
            r0.put(r3, r1)
            java.lang.String r1 = r5.f989e
            if (r1 == 0) goto L25
            r2 = r1
        L25:
            java.lang.String r1 = "name"
            r0.put(r1, r2)
            int r1 = r5.f990f
            java.lang.String r2 = "b_state"
            r0.put(r2, r1)
            int r1 = r5.f991g
            java.lang.String r2 = "rssi"
            r0.put(r2, r1)
            org.json.JSONArray r1 = new org.json.JSONArray
            r1.<init>()
            java.util.List r2 = r5.f992h
            if (r2 == 0) goto L5b
            java.util.Iterator r2 = r2.iterator()
        L45:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L5b
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto L45
            r1.put(r3)
            goto L45
        L5b:
            java.lang.String r2 = "uuids"
            r0.put(r2, r1)
            cn.jiguang.commons.bean.EddystoneData r1 = r5.f993i
            if (r1 == 0) goto L6a
        L65:
            org.json.JSONObject r1 = r1.m()
            goto L70
        L6a:
            cn.jiguang.commons.bean.EddystoneData r1 = new cn.jiguang.commons.bean.EddystoneData
            r1.<init>()
            goto L65
        L70:
            java.lang.String r2 = "edd"
            r0.put(r2, r1)
            cn.jiguang.commons.bean.IBeaconData r1 = r5.f994j
            if (r1 == 0) goto L7e
        L79:
            org.json.JSONObject r1 = r1.f()
            goto L84
        L7e:
            cn.jiguang.commons.bean.IBeaconData r1 = new cn.jiguang.commons.bean.IBeaconData
            r1.<init>()
            goto L79
        L84:
            java.lang.String r2 = "iBe"
            r0.put(r2, r1)
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r2, int r3) {
            r1 = this;
            int r0 = r1.a
            r2.writeInt(r0)
            int r0 = r1.f987c
            r2.writeInt(r0)
            java.lang.String r0 = r1.f988d
            r2.writeString(r0)
            java.lang.String r0 = r1.f989e
            r2.writeString(r0)
            int r0 = r1.f990f
            r2.writeInt(r0)
            int r0 = r1.f991g
            r2.writeInt(r0)
            java.util.List r0 = r1.f992h
            r2.writeStringList(r0)
            cn.jiguang.commons.bean.EddystoneData r0 = r1.f993i
            r2.writeParcelable(r0, r3)
            cn.jiguang.commons.bean.IBeaconData r0 = r1.f994j
            r2.writeParcelable(r0, r3)
            return
    }
}

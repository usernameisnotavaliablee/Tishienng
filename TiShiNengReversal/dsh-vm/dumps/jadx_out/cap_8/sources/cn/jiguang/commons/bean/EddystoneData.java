package cn.jiguang.commons.bean;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class EddystoneData implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<cn.jiguang.commons.bean.EddystoneData> CREATOR = null;
    private java.lang.String a;

    /* renamed from: c, reason: collision with root package name */
    private int f975c;

    /* renamed from: d, reason: collision with root package name */
    private java.lang.String f976d;

    /* renamed from: e, reason: collision with root package name */
    private java.util.List f977e;

    /* renamed from: f, reason: collision with root package name */
    private java.lang.String f978f;

    /* renamed from: g, reason: collision with root package name */
    private java.util.List f979g;

    /* renamed from: h, reason: collision with root package name */
    private int f980h;

    /* renamed from: i, reason: collision with root package name */
    private int f981i;

    /* renamed from: j, reason: collision with root package name */
    private int f982j;

    /* renamed from: k, reason: collision with root package name */
    private int f983k;
    private int l;
    private java.util.List m;
    private java.util.List n;

    class a implements android.os.Parcelable.Creator {
        a() {
                r0 = this;
                r0.<init>()
                return
        }

        public cn.jiguang.commons.bean.EddystoneData a(android.os.Parcel r2) {
                r1 = this;
                cn.jiguang.commons.bean.EddystoneData r0 = new cn.jiguang.commons.bean.EddystoneData
                r0.<init>(r2)
                return r0
        }

        public cn.jiguang.commons.bean.EddystoneData[] a(int r1) {
                r0 = this;
                cn.jiguang.commons.bean.EddystoneData[] r1 = new cn.jiguang.commons.bean.EddystoneData[r1]
                return r1
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r1) {
                r0 = this;
                cn.jiguang.commons.bean.EddystoneData r1 = r0.a(r1)
                return r1
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ java.lang.Object[] newArray(int r1) {
                r0 = this;
                cn.jiguang.commons.bean.EddystoneData[] r1 = r0.a(r1)
                return r1
        }
    }

    static {
            cn.jiguang.commons.bean.EddystoneData$a r0 = new cn.jiguang.commons.bean.EddystoneData$a
            r0.<init>()
            cn.jiguang.commons.bean.EddystoneData.CREATOR = r0
            return
    }

    public EddystoneData() {
            r2 = this;
            r2.<init>()
            java.lang.String r0 = ""
            r2.a = r0
            r1 = -1
            r2.f975c = r1
            r2.f976d = r0
            r2.f978f = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.f977e = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.f979g = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.m = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.n = r0
            return
    }

    protected EddystoneData(android.os.Parcel r3) {
            r2 = this;
            r2.<init>()
            java.lang.String r0 = ""
            r2.a = r0
            r1 = -1
            r2.f975c = r1
            r2.f976d = r0
            r2.f978f = r0
            java.lang.String r0 = r3.readString()
            r2.a = r0
            int r0 = r3.readInt()
            r2.f975c = r0
            java.lang.String r0 = r3.readString()
            r2.f976d = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.f977e = r0
            java.lang.Class<java.lang.Integer> r1 = java.lang.Integer.class
            java.lang.ClassLoader r1 = r1.getClassLoader()
            r3.readList(r0, r1)
            java.lang.String r0 = r3.readString()
            r2.f978f = r0
            java.util.ArrayList r0 = r3.createStringArrayList()
            r2.f979g = r0
            int r0 = r3.readInt()
            r2.f980h = r0
            int r0 = r3.readInt()
            r2.f981i = r0
            int r0 = r3.readInt()
            r2.f982j = r0
            int r0 = r3.readInt()
            r2.f983k = r0
            int r0 = r3.readInt()
            r2.l = r0
            java.util.ArrayList r0 = r3.createStringArrayList()
            r2.m = r0
            java.util.ArrayList r3 = r3.createStringArrayList()
            r2.n = r3
            return
    }

    public int a() {
            r1 = this;
            int r0 = r1.f975c
            return r0
    }

    public void a(int r1) {
            r0 = this;
            r0.f975c = r1
            return
    }

    public void a(java.lang.String r1) {
            r0 = this;
            if (r1 == 0) goto L3
            goto L5
        L3:
            java.lang.String r1 = ""
        L5:
            r0.f976d = r1
            return
    }

    public void a(java.util.List r1) {
            r0 = this;
            if (r1 == 0) goto L3
            goto L8
        L3:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L8:
            r0.f977e = r1
            return
    }

    public java.lang.String c() {
            r1 = this;
            java.lang.String r0 = r1.f976d
            return r0
    }

    public void c(int r1) {
            r0 = this;
            r0.l = r1
            return
    }

    public void c(java.lang.String r1) {
            r0 = this;
            if (r1 == 0) goto L3
            goto L5
        L3:
            java.lang.String r1 = ""
        L5:
            r0.f978f = r1
            return
    }

    public void c(java.util.List r1) {
            r0 = this;
            if (r1 == 0) goto L3
            goto L8
        L3:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L8:
            r0.m = r1
            return
    }

    public int d() {
            r1 = this;
            int r0 = r1.l
            return r0
    }

    public void d(int r1) {
            r0 = this;
            r0.f982j = r1
            return
    }

    public void d(java.util.List r1) {
            r0 = this;
            if (r1 == 0) goto L3
            goto L8
        L3:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L8:
            r0.f979g = r1
            return
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public java.util.List e() {
            r1 = this;
            java.util.List r0 = r1.f977e
            return r0
    }

    public void e(int r1) {
            r0 = this;
            r0.f983k = r1
            return
    }

    public java.util.List f() {
            r1 = this;
            java.util.List r0 = r1.m
            return r0
    }

    public void f(int r1) {
            r0 = this;
            r0.f981i = r1
            return
    }

    public int g() {
            r1 = this;
            int r0 = r1.f982j
            return r0
    }

    public void g(int r1) {
            r0 = this;
            r0.f980h = r1
            return
    }

    public int h() {
            r1 = this;
            int r0 = r1.f983k
            return r0
    }

    public java.lang.String i() {
            r1 = this;
            java.lang.String r0 = r1.f978f
            return r0
    }

    public java.util.List j() {
            r1 = this;
            java.util.List r0 = r1.f979g
            return r0
    }

    public int k() {
            r1 = this;
            int r0 = r1.f981i
            return r0
    }

    public int l() {
            r1 = this;
            int r0 = r1.f980h
            return r0
    }

    public org.json.JSONObject m() {
            r4 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = r4.a
            java.lang.String r2 = "adv_sid"
            r0.put(r2, r1)
            int r1 = r4.f975c
            java.lang.String r2 = "adv_f"
            r0.put(r2, r1)
            java.lang.String r1 = r4.f976d
            java.lang.String r2 = "name"
            r0.put(r2, r1)
            org.json.JSONArray r1 = new org.json.JSONArray
            r1.<init>()
            java.util.List r2 = r4.f977e
            java.util.Iterator r2 = r2.iterator()
        L25:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L35
            java.lang.Object r3 = r2.next()
            java.lang.Integer r3 = (java.lang.Integer) r3
            r1.put(r3)
            goto L25
        L35:
            java.lang.String r2 = "man_id"
            r0.put(r2, r1)
            java.lang.String r1 = r4.f978f
            java.lang.String r2 = "s_data"
            r0.put(r2, r1)
            org.json.JSONArray r1 = new org.json.JSONArray
            r1.<init>()
            java.util.List r2 = r4.f979g
            java.util.Iterator r2 = r2.iterator()
        L4c:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L5c
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            r1.put(r3)
            goto L4c
        L5c:
            java.lang.String r2 = "s_uuids"
            r0.put(r2, r1)
            int r1 = r4.f980h
            java.lang.String r2 = "tpl"
            r0.put(r2, r1)
            int r1 = r4.f981i
            java.lang.String r2 = "tp"
            r0.put(r2, r1)
            int r1 = r4.f982j
            java.lang.String r2 = "pphy"
            r0.put(r2, r1)
            int r1 = r4.f983k
            java.lang.String r2 = "sphy"
            r0.put(r2, r1)
            int r1 = r4.l
            java.lang.String r2 = "isC"
            r0.put(r2, r1)
            org.json.JSONArray r1 = new org.json.JSONArray
            r1.<init>()
            java.util.List r2 = r4.m
            java.util.Iterator r2 = r2.iterator()
        L8f:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L9f
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            r1.put(r3)
            goto L8f
        L9f:
            java.lang.String r2 = "o_uuids_k"
            r0.put(r2, r1)
            org.json.JSONArray r1 = new org.json.JSONArray
            r1.<init>()
            java.util.List r2 = r4.n
            java.util.Iterator r2 = r2.iterator()
        Laf:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto Lbf
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            r1.put(r3)
            goto Laf
        Lbf:
            java.lang.String r2 = "s_uuids_k"
            r0.put(r2, r1)
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            java.lang.String r2 = r0.a
            r1.writeString(r2)
            int r2 = r0.f975c
            r1.writeInt(r2)
            java.lang.String r2 = r0.f976d
            r1.writeString(r2)
            java.util.List r2 = r0.f977e
            r1.writeList(r2)
            java.lang.String r2 = r0.f978f
            r1.writeString(r2)
            java.util.List r2 = r0.f979g
            r1.writeStringList(r2)
            int r2 = r0.f980h
            r1.writeInt(r2)
            int r2 = r0.f981i
            r1.writeInt(r2)
            int r2 = r0.f982j
            r1.writeInt(r2)
            int r2 = r0.f983k
            r1.writeInt(r2)
            int r2 = r0.l
            r1.writeInt(r2)
            java.util.List r2 = r0.m
            r1.writeStringList(r2)
            java.util.List r2 = r0.n
            r1.writeStringList(r2)
            return
    }
}

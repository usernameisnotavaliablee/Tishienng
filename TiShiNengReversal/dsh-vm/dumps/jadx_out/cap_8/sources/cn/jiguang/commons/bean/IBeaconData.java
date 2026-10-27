package cn.jiguang.commons.bean;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class IBeaconData implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<cn.jiguang.commons.bean.IBeaconData> CREATOR = null;
    private java.lang.String a;

    /* renamed from: c, reason: collision with root package name */
    private int f984c;

    /* renamed from: d, reason: collision with root package name */
    private int f985d;

    /* renamed from: e, reason: collision with root package name */
    private int f986e;

    class a implements android.os.Parcelable.Creator {
        a() {
                r0 = this;
                r0.<init>()
                return
        }

        public cn.jiguang.commons.bean.IBeaconData a(android.os.Parcel r2) {
                r1 = this;
                cn.jiguang.commons.bean.IBeaconData r0 = new cn.jiguang.commons.bean.IBeaconData
                r0.<init>(r2)
                return r0
        }

        public cn.jiguang.commons.bean.IBeaconData[] a(int r1) {
                r0 = this;
                cn.jiguang.commons.bean.IBeaconData[] r1 = new cn.jiguang.commons.bean.IBeaconData[r1]
                return r1
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r1) {
                r0 = this;
                cn.jiguang.commons.bean.IBeaconData r1 = r0.a(r1)
                return r1
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ java.lang.Object[] newArray(int r1) {
                r0 = this;
                cn.jiguang.commons.bean.IBeaconData[] r1 = r0.a(r1)
                return r1
        }
    }

    static {
            cn.jiguang.commons.bean.IBeaconData$a r0 = new cn.jiguang.commons.bean.IBeaconData$a
            r0.<init>()
            cn.jiguang.commons.bean.IBeaconData.CREATOR = r0
            return
    }

    public IBeaconData() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = ""
            r1.a = r0
            return
    }

    protected IBeaconData(android.os.Parcel r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = ""
            r1.a = r0
            java.lang.String r0 = r2.readString()
            r1.a = r0
            int r0 = r2.readInt()
            r1.f984c = r0
            int r0 = r2.readInt()
            r1.f985d = r0
            int r2 = r2.readInt()
            r1.f986e = r2
            return
    }

    public int a() {
            r1 = this;
            int r0 = r1.f984c
            return r0
    }

    public void a(int r1) {
            r0 = this;
            r0.f984c = r1
            return
    }

    public void a(java.lang.String r1) {
            r0 = this;
            if (r1 == 0) goto L3
            goto L5
        L3:
            java.lang.String r1 = ""
        L5:
            r0.a = r1
            return
    }

    public int c() {
            r1 = this;
            int r0 = r1.f986e
            return r0
    }

    public void c(int r1) {
            r0 = this;
            r0.f986e = r1
            return
    }

    public int d() {
            r1 = this;
            int r0 = r1.f985d
            return r0
    }

    public void d(int r1) {
            r0 = this;
            r0.f985d = r1
            return
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public java.lang.String e() {
            r1 = this;
            java.lang.String r0 = r1.a
            return r0
    }

    public org.json.JSONObject f() {
            r3 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = r3.a
            if (r1 == 0) goto La
            goto Lc
        La:
            java.lang.String r1 = ""
        Lc:
            java.lang.String r2 = "pUuid"
            r0.put(r2, r1)
            int r1 = r3.f984c
            java.lang.String r2 = "major"
            r0.put(r2, r1)
            int r1 = r3.f985d
            java.lang.String r2 = "minor"
            r0.put(r2, r1)
            int r1 = r3.f986e
            java.lang.String r2 = "mPo"
            r0.put(r2, r1)
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            java.lang.String r2 = r0.a
            r1.writeString(r2)
            int r2 = r0.f984c
            r1.writeInt(r2)
            int r2 = r0.f985d
            r1.writeInt(r2)
            int r2 = r0.f986e
            r1.writeInt(r2)
            return
    }
}

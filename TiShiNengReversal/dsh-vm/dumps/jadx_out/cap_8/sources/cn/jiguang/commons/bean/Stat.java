package cn.jiguang.commons.bean;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class Stat extends cn.jiguang.commons.bean.ProcFile {
    public static final android.os.Parcelable.Creator<cn.jiguang.commons.bean.Stat> CREATOR = null;

    /* renamed from: c, reason: collision with root package name */
    private final java.lang.String[] f995c;

    class a implements android.os.Parcelable.Creator {
        a() {
                r0 = this;
                r0.<init>()
                return
        }

        public cn.jiguang.commons.bean.Stat a(android.os.Parcel r3) {
                r2 = this;
                cn.jiguang.commons.bean.Stat r0 = new cn.jiguang.commons.bean.Stat
                r1 = 0
                r0.<init>(r3, r1)
                return r0
        }

        public cn.jiguang.commons.bean.Stat[] a(int r1) {
                r0 = this;
                cn.jiguang.commons.bean.Stat[] r1 = new cn.jiguang.commons.bean.Stat[r1]
                return r1
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r1) {
                r0 = this;
                cn.jiguang.commons.bean.Stat r1 = r0.a(r1)
                return r1
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ java.lang.Object[] newArray(int r1) {
                r0 = this;
                cn.jiguang.commons.bean.Stat[] r1 = r0.a(r1)
                return r1
        }
    }

    static {
            cn.jiguang.commons.bean.Stat$a r0 = new cn.jiguang.commons.bean.Stat$a
            r0.<init>()
            cn.jiguang.commons.bean.Stat.CREATOR = r0
            return
    }

    private Stat(android.os.Parcel r1) {
            r0 = this;
            r0.<init>(r1)
            java.lang.String[] r1 = r1.createStringArray()
            r0.f995c = r1
            return
    }

    /* synthetic */ Stat(android.os.Parcel r1, cn.jiguang.commons.bean.Stat.a r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    private Stat(java.lang.String r2) {
            r1 = this;
            r1.<init>(r2)
            java.lang.String r2 = r1.a
            java.lang.String r0 = "\\s+"
            java.lang.String[] r2 = r2.split(r0)
            r1.f995c = r2
            return
    }

    public static cn.jiguang.commons.bean.Stat a(int r4) {
            cn.jiguang.commons.bean.Stat r0 = new cn.jiguang.commons.bean.Stat
            java.util.Locale r1 = java.util.Locale.ENGLISH
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r4
            java.lang.String r4 = "/proc/%d/stat"
            java.lang.String r4 = java.lang.String.format(r1, r4, r2)
            r0.<init>(r4)
            return r0
    }

    public long a() {
            r2 = this;
            java.lang.String[] r0 = r2.f995c
            r1 = 16
            r0 = r0[r1]
            long r0 = java.lang.Long.parseLong(r0)
            return r0
    }

    public long c() {
            r2 = this;
            java.lang.String[] r0 = r2.f995c
            r1 = 15
            r0 = r0[r1]
            long r0 = java.lang.Long.parseLong(r0)
            return r0
    }

    public java.lang.String d() {
            r3 = this;
            java.lang.String[] r0 = r3.f995c
            r1 = 1
            r0 = r0[r1]
            java.lang.String r1 = "("
            java.lang.String r2 = ""
            java.lang.String r0 = r0.replace(r1, r2)
            java.lang.String r1 = ")"
            java.lang.String r0 = r0.replace(r1, r2)
            return r0
    }

    public long e() {
            r2 = this;
            java.lang.String[] r0 = r2.f995c
            r1 = 19
            r0 = r0[r1]
            long r0 = java.lang.Long.parseLong(r0)
            return r0
    }

    public int f() {
            r2 = this;
            java.lang.String[] r0 = r2.f995c
            r1 = 40
            r0 = r0[r1]
            int r0 = java.lang.Integer.parseInt(r0)
            return r0
    }

    public long g() {
            r2 = this;
            java.lang.String[] r0 = r2.f995c
            r1 = 17
            r0 = r0[r1]
            long r0 = java.lang.Long.parseLong(r0)
            return r0
    }

    public int h() {
            r2 = this;
            java.lang.String[] r0 = r2.f995c
            r1 = 39
            r0 = r0[r1]
            int r0 = java.lang.Integer.parseInt(r0)
            return r0
    }

    public long i() {
            r2 = this;
            java.lang.String[] r0 = r2.f995c
            r1 = 21
            r0 = r0[r1]
            long r0 = java.lang.Long.parseLong(r0)
            return r0
    }

    public char j() {
            r2 = this;
            java.lang.String[] r0 = r2.f995c
            r1 = 2
            r0 = r0[r1]
            r1 = 0
            char r0 = r0.charAt(r1)
            return r0
    }

    public long k() {
            r2 = this;
            java.lang.String[] r0 = r2.f995c
            r1 = 14
            r0 = r0[r1]
            long r0 = java.lang.Long.parseLong(r0)
            return r0
    }

    public int l() {
            r2 = this;
            java.lang.String[] r0 = r2.f995c
            r1 = 7
            r0 = r0[r1]
            int r0 = java.lang.Integer.parseInt(r0)
            return r0
    }

    public long m() {
            r2 = this;
            java.lang.String[] r0 = r2.f995c
            r1 = 13
            r0 = r0[r1]
            long r0 = java.lang.Long.parseLong(r0)
            return r0
    }

    public long n() {
            r2 = this;
            java.lang.String[] r0 = r2.f995c
            r1 = 22
            r0 = r0[r1]
            long r0 = java.lang.Long.parseLong(r0)
            return r0
    }

    @Override // cn.jiguang.commons.bean.ProcFile, android.os.Parcelable
    public void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            super.writeToParcel(r1, r2)
            java.lang.String[] r2 = r0.f995c
            r1.writeStringArray(r2)
            return
    }
}

package cn.jiguang.commons.bean;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class AndroidProcess implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<cn.jiguang.commons.bean.AndroidProcess> CREATOR = null;
    public final java.lang.String a;

    /* renamed from: c, reason: collision with root package name */
    public final int f967c;

    class a implements android.os.Parcelable.Creator {
        a() {
                r0 = this;
                r0.<init>()
                return
        }

        public cn.jiguang.commons.bean.AndroidProcess a(android.os.Parcel r2) {
                r1 = this;
                cn.jiguang.commons.bean.AndroidProcess r0 = new cn.jiguang.commons.bean.AndroidProcess
                r0.<init>(r2)
                return r0
        }

        public cn.jiguang.commons.bean.AndroidProcess[] a(int r1) {
                r0 = this;
                cn.jiguang.commons.bean.AndroidProcess[] r1 = new cn.jiguang.commons.bean.AndroidProcess[r1]
                return r1
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r1) {
                r0 = this;
                cn.jiguang.commons.bean.AndroidProcess r1 = r0.a(r1)
                return r1
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ java.lang.Object[] newArray(int r1) {
                r0 = this;
                cn.jiguang.commons.bean.AndroidProcess[] r1 = r0.a(r1)
                return r1
        }
    }

    static {
            cn.jiguang.commons.bean.AndroidProcess$a r0 = new cn.jiguang.commons.bean.AndroidProcess$a
            r0.<init>()
            cn.jiguang.commons.bean.AndroidProcess.CREATOR = r0
            return
    }

    public AndroidProcess(int r1) {
            r0 = this;
            r0.<init>()
            r0.f967c = r1
            java.lang.String r1 = r0.a(r1)
            r0.a = r1
            return
    }

    protected AndroidProcess(android.os.Parcel r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = r2.readString()
            r1.a = r0
            int r2 = r2.readInt()
            r1.f967c = r2
            return
    }

    private java.lang.String a(int r7) {
            r6 = this;
            r0 = 0
            r1 = 1
            java.util.Locale r2 = java.util.Locale.ENGLISH     // Catch: java.io.IOException -> L1b
            java.lang.String r3 = "/proc/%d/cmdline"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)     // Catch: java.io.IOException -> L1b
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch: java.io.IOException -> L1b
            r5[r0] = r4     // Catch: java.io.IOException -> L1b
            java.lang.String r2 = java.lang.String.format(r2, r3, r5)     // Catch: java.io.IOException -> L1b
            java.lang.String r2 = cn.jiguang.commons.bean.ProcFile.a(r2)     // Catch: java.io.IOException -> L1b
            java.lang.String r2 = r2.trim()     // Catch: java.io.IOException -> L1b
            goto L1c
        L1b:
            r2 = 0
        L1c:
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 == 0) goto L41
            cn.jiguang.commons.bean.Stat r2 = cn.jiguang.commons.bean.Stat.a(r7)     // Catch: java.lang.Exception -> L2b
            java.lang.String r7 = r2.d()     // Catch: java.lang.Exception -> L2b
            return r7
        L2b:
            java.io.IOException r2 = new java.io.IOException
            java.util.Locale r3 = java.util.Locale.ENGLISH
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r7
            java.lang.String r7 = "Error reading /proc/%d/stat"
            java.lang.String r7 = java.lang.String.format(r3, r7, r1)
            r2.<init>(r7)
            throw r2
        L41:
            return r2
    }

    public cn.jiguang.commons.bean.Cgroup a() {
            r1 = this;
            int r0 = r1.f967c
            cn.jiguang.commons.bean.Cgroup r0 = cn.jiguang.commons.bean.Cgroup.a(r0)
            return r0
    }

    public java.lang.String a(java.lang.String r5) {
            r4 = this;
            java.util.Locale r0 = java.util.Locale.ENGLISH
            int r1 = r4.f967c
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r1
            r1 = 1
            r2[r1] = r5
            java.lang.String r5 = "/proc/%d/%s"
            java.lang.String r5 = java.lang.String.format(r0, r5, r2)
            java.lang.String r5 = cn.jiguang.commons.bean.ProcFile.a(r5)
            return r5
    }

    public int c() {
            r1 = this;
            java.lang.String r0 = "oom_adj"
            java.lang.String r0 = r1.a(r0)
            int r0 = java.lang.Integer.parseInt(r0)
            return r0
    }

    public int d() {
            r1 = this;
            java.lang.String r0 = "oom_score"
            java.lang.String r0 = r1.a(r0)
            int r0 = java.lang.Integer.parseInt(r0)
            return r0
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public int e() {
            r1 = this;
            java.lang.String r0 = "oom_score_adj"
            java.lang.String r0 = r1.a(r0)
            int r0 = java.lang.Integer.parseInt(r0)
            return r0
    }

    public cn.jiguang.commons.bean.Stat f() {
            r1 = this;
            int r0 = r1.f967c
            cn.jiguang.commons.bean.Stat r0 = cn.jiguang.commons.bean.Stat.a(r0)
            return r0
    }

    public cn.jiguang.commons.bean.Status g() {
            r1 = this;
            int r0 = r1.f967c
            cn.jiguang.commons.bean.Status r0 = cn.jiguang.commons.bean.Status.a(r0)
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            java.lang.String r2 = r0.a
            r1.writeString(r2)
            int r2 = r0.f967c
            r1.writeInt(r2)
            return
    }
}

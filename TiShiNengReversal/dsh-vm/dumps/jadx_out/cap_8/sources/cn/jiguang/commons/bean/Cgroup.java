package cn.jiguang.commons.bean;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class Cgroup extends cn.jiguang.commons.bean.ProcFile {
    public static final android.os.Parcelable.Creator<cn.jiguang.commons.bean.Cgroup> CREATOR = null;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.ArrayList f972c;

    class a implements android.os.Parcelable.Creator {
        a() {
                r0 = this;
                r0.<init>()
                return
        }

        public cn.jiguang.commons.bean.Cgroup a(android.os.Parcel r3) {
                r2 = this;
                cn.jiguang.commons.bean.Cgroup r0 = new cn.jiguang.commons.bean.Cgroup
                r1 = 0
                r0.<init>(r3, r1)
                return r0
        }

        public cn.jiguang.commons.bean.Cgroup[] a(int r1) {
                r0 = this;
                cn.jiguang.commons.bean.Cgroup[] r1 = new cn.jiguang.commons.bean.Cgroup[r1]
                return r1
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r1) {
                r0 = this;
                cn.jiguang.commons.bean.Cgroup r1 = r0.a(r1)
                return r1
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ java.lang.Object[] newArray(int r1) {
                r0 = this;
                cn.jiguang.commons.bean.Cgroup[] r1 = r0.a(r1)
                return r1
        }
    }

    static {
            cn.jiguang.commons.bean.Cgroup$a r0 = new cn.jiguang.commons.bean.Cgroup$a
            r0.<init>()
            cn.jiguang.commons.bean.Cgroup.CREATOR = r0
            return
    }

    private Cgroup(android.os.Parcel r2) {
            r1 = this;
            r1.<init>(r2)
            android.os.Parcelable$Creator<cn.jiguang.commons.bean.ControlGroup> r0 = cn.jiguang.commons.bean.ControlGroup.CREATOR
            java.util.ArrayList r2 = r2.createTypedArrayList(r0)
            r1.f972c = r2
            return
    }

    /* synthetic */ Cgroup(android.os.Parcel r1, cn.jiguang.commons.bean.Cgroup.a r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    private Cgroup(java.lang.String r6) {
            r5 = this;
            r5.<init>(r6)
            java.lang.String r6 = r5.a
            java.lang.String r0 = "\n"
            java.lang.String[] r6 = r6.split(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r5.f972c = r0
            int r0 = r6.length
            r1 = 0
        L14:
            if (r1 >= r0) goto L25
            r2 = r6[r1]
            java.util.ArrayList r3 = r5.f972c     // Catch: java.lang.Exception -> L22
            cn.jiguang.commons.bean.ControlGroup r4 = new cn.jiguang.commons.bean.ControlGroup     // Catch: java.lang.Exception -> L22
            r4.<init>(r2)     // Catch: java.lang.Exception -> L22
            r3.add(r4)     // Catch: java.lang.Exception -> L22
        L22:
            int r1 = r1 + 1
            goto L14
        L25:
            return
    }

    public static cn.jiguang.commons.bean.Cgroup a(int r4) {
            cn.jiguang.commons.bean.Cgroup r0 = new cn.jiguang.commons.bean.Cgroup
            java.util.Locale r1 = java.util.Locale.ENGLISH
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r4
            java.lang.String r4 = "/proc/%d/cgroup"
            java.lang.String r4 = java.lang.String.format(r1, r4, r2)
            r0.<init>(r4)
            return r0
    }

    public cn.jiguang.commons.bean.ControlGroup c(java.lang.String r7) {
            r6 = this;
            java.util.ArrayList r0 = r6.f972c
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2a
            java.lang.Object r1 = r0.next()
            cn.jiguang.commons.bean.ControlGroup r1 = (cn.jiguang.commons.bean.ControlGroup) r1
            java.lang.String r2 = r1.f973c
            java.lang.String r3 = ","
            java.lang.String[] r2 = r2.split(r3)
            int r3 = r2.length
            r4 = 0
        L1c:
            if (r4 >= r3) goto L6
            r5 = r2[r4]
            boolean r5 = r5.equals(r7)
            if (r5 == 0) goto L27
            return r1
        L27:
            int r4 = r4 + 1
            goto L1c
        L2a:
            r7 = 0
            return r7
    }

    @Override // cn.jiguang.commons.bean.ProcFile, android.os.Parcelable
    public void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            super.writeToParcel(r1, r2)
            java.util.ArrayList r2 = r0.f972c
            r1.writeTypedList(r2)
            return
    }
}

package cn.jiguang.commons.bean;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class Status extends cn.jiguang.commons.bean.ProcFile {
    public static final android.os.Parcelable.Creator<cn.jiguang.commons.bean.Status> CREATOR = null;

    class a implements android.os.Parcelable.Creator {
        a() {
                r0 = this;
                r0.<init>()
                return
        }

        public cn.jiguang.commons.bean.Status a(android.os.Parcel r3) {
                r2 = this;
                cn.jiguang.commons.bean.Status r0 = new cn.jiguang.commons.bean.Status
                r1 = 0
                r0.<init>(r3, r1)
                return r0
        }

        public cn.jiguang.commons.bean.Status[] a(int r1) {
                r0 = this;
                cn.jiguang.commons.bean.Status[] r1 = new cn.jiguang.commons.bean.Status[r1]
                return r1
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r1) {
                r0 = this;
                cn.jiguang.commons.bean.Status r1 = r0.a(r1)
                return r1
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ java.lang.Object[] newArray(int r1) {
                r0 = this;
                cn.jiguang.commons.bean.Status[] r1 = r0.a(r1)
                return r1
        }
    }

    static {
            cn.jiguang.commons.bean.Status$a r0 = new cn.jiguang.commons.bean.Status$a
            r0.<init>()
            cn.jiguang.commons.bean.Status.CREATOR = r0
            return
    }

    private Status(android.os.Parcel r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    /* synthetic */ Status(android.os.Parcel r1, cn.jiguang.commons.bean.Status.a r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    private Status(java.lang.String r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public static cn.jiguang.commons.bean.Status a(int r4) {
            cn.jiguang.commons.bean.Status r0 = new cn.jiguang.commons.bean.Status
            java.util.Locale r1 = java.util.Locale.ENGLISH
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r4
            java.lang.String r4 = "/proc/%d/status"
            java.lang.String r4 = java.lang.String.format(r1, r4, r2)
            r0.<init>(r4)
            return r0
    }

    public int a() {
            r2 = this;
            java.lang.String r0 = "Uid"
            java.lang.String r0 = r2.c(r0)     // Catch: java.lang.Exception -> L14
            java.lang.String r1 = "\\s+"
            java.lang.String[] r0 = r0.split(r1)     // Catch: java.lang.Exception -> L14
            r1 = 0
            r0 = r0[r1]     // Catch: java.lang.Exception -> L14
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Exception -> L14
            return r0
        L14:
            r0 = -1
            return r0
    }

    public java.lang.String c(java.lang.String r7) {
            r6 = this;
            java.lang.String r0 = r6.a
            java.lang.String r1 = "\n"
            java.lang.String[] r0 = r0.split(r1)
            int r1 = r0.length
            r2 = 0
        La:
            if (r2 >= r1) goto L43
            r3 = r0[r2]
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r7)
            java.lang.String r5 = ":"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            boolean r4 = r3.startsWith(r4)
            if (r4 == 0) goto L40
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r7)
            r0.append(r5)
            java.lang.String r7 = r0.toString()
            java.lang.String[] r7 = r3.split(r7)
            r0 = 1
            r7 = r7[r0]
            java.lang.String r7 = r7.trim()
            return r7
        L40:
            int r2 = r2 + 1
            goto La
        L43:
            r7 = 0
            return r7
    }
}

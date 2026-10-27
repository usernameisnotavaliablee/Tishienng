package cn.jiguang.ak;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class e {
    public static final cn.jiguang.ak.e a = null;

    /* renamed from: b, reason: collision with root package name */
    private final java.util.UUID f530b;

    static {
            cn.jiguang.ak.e r0 = new cn.jiguang.ak.e
            java.util.UUID r1 = new java.util.UUID
            r2 = 0
            r1.<init>(r2, r2)
            r0.<init>(r1)
            cn.jiguang.ak.e.a = r0
            return
    }

    public e() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    public e(java.util.UUID r1) {
            r0 = this;
            r0.<init>()
            if (r1 != 0) goto L9
            java.util.UUID r1 = java.util.UUID.randomUUID()
        L9:
            r0.f530b = r1
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L1d
            java.lang.Class<cn.jiguang.ak.e> r2 = cn.jiguang.ak.e.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L10
            goto L1d
        L10:
            cn.jiguang.ak.e r5 = (cn.jiguang.ak.e) r5
            java.util.UUID r2 = r4.f530b
            java.util.UUID r5 = r5.f530b
            int r5 = r2.compareTo(r5)
            if (r5 != 0) goto L1d
            return r0
        L1d:
            return r1
    }

    public int hashCode() {
            r1 = this;
            java.util.UUID r0 = r1.f530b
            int r0 = r0.hashCode()
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.util.UUID r0 = r3.f530b
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "-"
            java.lang.String r2 = ""
            java.lang.String r0 = r0.replace(r1, r2)
            return r0
    }
}

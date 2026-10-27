package cn.jpush.android.f;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class b {
    public java.lang.String a;

    /* renamed from: b, reason: collision with root package name */
    public long f1787b;

    public b(java.lang.String r1, long r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.f1787b = r2
            return
    }

    @android.annotation.TargetApi(19)
    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            r1 = 0
            if (r8 == 0) goto L25
            java.lang.Class<cn.jpush.android.f.b> r2 = cn.jpush.android.f.b.class
            java.lang.Class r3 = r8.getClass()
            if (r2 == r3) goto L10
            goto L25
        L10:
            cn.jpush.android.f.b r8 = (cn.jpush.android.f.b) r8
            long r2 = r7.f1787b
            long r4 = r8.f1787b
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L25
            java.lang.String r2 = r7.a
            java.lang.String r8 = r8.a
            boolean r8 = java.util.Objects.equals(r2, r8)
            if (r8 == 0) goto L25
            return r0
        L25:
            return r1
    }

    @android.annotation.TargetApi(19)
    public final int hashCode() {
            r4 = this;
            java.lang.String r0 = r4.a
            long r1 = r4.f1787b
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r0
            r0 = 1
            r2[r0] = r1
            int r0 = java.util.Objects.hash(r2)
            return r0
    }
}

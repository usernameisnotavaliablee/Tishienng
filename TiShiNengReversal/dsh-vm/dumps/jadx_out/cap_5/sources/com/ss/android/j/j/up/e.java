package com.ss.android.j.j.up;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class e {
    public long a;
    public int b;
    public long c;
    public long d;
    public java.lang.String e;
    public int f;
    public boolean g;

    public e() {
            r3 = this;
            r3.<init>()
            r0 = -1
            r3.a = r0
            r2 = -1
            r3.b = r2
            r3.c = r0
            r3.d = r0
            r0 = 0
            r3.f = r0
            return
    }

    public void a(com.ss.android.socialbase.downloader.ae.cw r3) {
            r2 = this;
            if (r3 != 0) goto L3
            return
        L3:
            int r0 = r3.ae()
            long r0 = (long) r0
            r2.a = r0
            int r0 = r3.i()
            r2.b = r0
            long r0 = r3.uq()
            r2.d = r0
            long r0 = r3.ka()
            r2.c = r0
            java.lang.String r0 = r3.ws()
            r2.e = r0
            com.ss.android.socialbase.downloader.up.j r0 = r3.hk()
            if (r0 == 0) goto L2f
            int r0 = r0.j()
            r2.f = r0
            goto L32
        L2f:
            r0 = 0
            r2.f = r0
        L32:
            boolean r3 = r3.x()
            r2.g = r3
            return
    }

    public boolean equals(java.lang.Object r10) {
            r9 = this;
            boolean r0 = r10 instanceof com.ss.android.j.j.up.e
            if (r0 == 0) goto L5e
            com.ss.android.j.j.up.e r10 = (com.ss.android.j.j.up.e) r10
            long r0 = r9.a
            long r2 = r10.a
            r4 = 0
            r5 = 1
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 != 0) goto L12
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            int r1 = r9.b
            int r2 = r10.b
            if (r1 != r2) goto L1b
            r1 = 1
            goto L1c
        L1b:
            r1 = 0
        L1c:
            long r2 = r9.c
            long r6 = r10.c
            int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r8 != 0) goto L26
            r2 = 1
            goto L27
        L26:
            r2 = 0
        L27:
            java.lang.String r3 = r9.e
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L37
            java.lang.String r3 = r10.e
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L51
        L37:
            java.lang.String r3 = r9.e
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L53
            java.lang.String r3 = r10.e
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L53
            java.lang.String r3 = r9.e
            java.lang.String r10 = r10.e
            boolean r10 = r3.equals(r10)
            if (r10 == 0) goto L53
        L51:
            r10 = 1
            goto L54
        L53:
            r10 = 0
        L54:
            if (r0 == 0) goto L5d
            if (r1 == 0) goto L5d
            if (r2 == 0) goto L5d
            if (r10 == 0) goto L5d
            return r5
        L5d:
            return r4
        L5e:
            boolean r10 = super.equals(r10)
            return r10
    }

    public int hashCode() {
            r6 = this;
            long r0 = r6.a
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            int r1 = r6.b
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            long r2 = r6.c
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.String r3 = r6.e
            r4 = 4
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r5 = 0
            r4[r5] = r0
            r0 = 1
            r4[r0] = r1
            r0 = 2
            r4[r0] = r2
            r0 = 3
            r4[r0] = r3
            int r0 = java.util.Arrays.hashCode(r4)
            return r0
    }
}

package cn.jiguang.commons.I;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class c {

    static /* synthetic */ class a {
        public a() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    private static class b {
        private static final cn.jiguang.commons.I.c a = null;

        static {
                cn.jiguang.commons.I.c r0 = new cn.jiguang.commons.I.c
                r1 = 0
                r0.<init>(r1)
                cn.jiguang.commons.I.c.b.a = r0
                return
        }

        public b() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ cn.jiguang.commons.I.c a() {
                cn.jiguang.commons.I.c r0 = cn.jiguang.commons.I.c.b.a
                return r0
        }
    }

    private c() {
            r0 = this;
            r0.<init>()
            return
    }

    /* synthetic */ c(cn.jiguang.commons.I.c.a r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public static cn.jiguang.commons.I.c a() {
            cn.jiguang.commons.I.c r0 = cn.jiguang.commons.I.c.b.a()
            return r0
    }

    public java.util.List a(boolean r9) {
            r8 = this;
            r0 = 3001(0xbb9, float:4.205E-42)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "collect:cmd="
            r1.append(r2)
            r1.append(r9)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "JLocationCell"
            cn.jiguang.commons.w.a.a(r2, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r3 = 0
            cn.jiguang.commons.g.n r4 = cn.jiguang.commons.g.n.a()     // Catch: java.lang.Exception -> L9f
            r5 = 1501(0x5dd, float:2.103E-42)
            java.util.List r4 = r4.c(r5, r9)     // Catch: java.lang.Exception -> L9f
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L9f
            r5.<init>()     // Catch: java.lang.Exception -> L9f
            java.lang.String r6 = "ret:"
            r5.append(r6)     // Catch: java.lang.Exception -> L9f
            if (r4 != 0) goto L3a
            r6 = 0
            goto L3e
        L3a:
            int r6 = r4.size()     // Catch: java.lang.Exception -> L9f
        L3e:
            r5.append(r6)     // Catch: java.lang.Exception -> L9f
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Exception -> L9f
            cn.jiguang.commons.w.a.a(r2, r5)     // Catch: java.lang.Exception -> L9f
            if (r4 == 0) goto Lbe
            boolean r5 = r4.isEmpty()     // Catch: java.lang.Exception -> L9f
            if (r5 == 0) goto L52
            goto Lbe
        L52:
            cn.jiguang.commons.g.n r5 = cn.jiguang.commons.g.n.a()     // Catch: java.lang.Exception -> L9f
            r6 = 1506(0x5e2, float:2.11E-42)
            java.lang.String r5 = r5.d(r6, r9)     // Catch: java.lang.Exception -> L9f
            cn.jiguang.commons.g.n r6 = cn.jiguang.commons.g.n.a()     // Catch: java.lang.Exception -> L9f
            r7 = 1507(0x5e3, float:2.112E-42)
            java.lang.String r9 = r6.d(r7, r9)     // Catch: java.lang.Exception -> L9f
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L9f
            r6.<init>()     // Catch: java.lang.Exception -> L9f
            java.lang.String r7 = "opr:"
            r6.append(r7)     // Catch: java.lang.Exception -> L9f
            r6.append(r5)     // Catch: java.lang.Exception -> L9f
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Exception -> L9f
            cn.jiguang.commons.w.a.a(r2, r6)     // Catch: java.lang.Exception -> L9f
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Exception -> L9f
        L7e:
            boolean r6 = r4.hasNext()     // Catch: java.lang.Exception -> L9f
            if (r6 == 0) goto La5
            java.lang.Object r6 = r4.next()     // Catch: java.lang.Exception -> L9f
            android.telephony.CellInfo r6 = (android.telephony.CellInfo) r6     // Catch: java.lang.Exception -> L9f
            if (r6 != 0) goto L8d
            goto L7e
        L8d:
            cn.jiguang.commons.c.h r6 = cn.jiguang.commons.L.f.a(r6)     // Catch: java.lang.Exception -> L9f
            if (r6 != 0) goto L94
            goto L7e
        L94:
            java.lang.String r7 = r6.f1031f     // Catch: java.lang.Exception -> L9f
            boolean r7 = android.text.TextUtils.equals(r7, r5)     // Catch: java.lang.Exception -> L9f
            if (r7 == 0) goto La1
            r6.f1032g = r9     // Catch: java.lang.Exception -> L9f
            goto La1
        L9f:
            r9 = move-exception
            goto Lcb
        La1:
            r1.add(r6)     // Catch: java.lang.Exception -> L9f
            goto L7e
        La5:
            boolean r9 = r1.isEmpty()     // Catch: java.lang.Exception -> L9f
            if (r9 != 0) goto Lb6
            cn.jiguang.commons.A.a r9 = cn.jiguang.commons.A.a.f()     // Catch: java.lang.Exception -> L9f
            r0 = 3000(0xbb8, float:4.204E-42)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Exception -> L9f
            goto Lba
        Lb6:
            cn.jiguang.commons.A.a r9 = cn.jiguang.commons.A.a.f()     // Catch: java.lang.Exception -> L9f
        Lba:
            r9.f(r0)     // Catch: java.lang.Exception -> L9f
            return r1
        Lbe:
            java.lang.String r9 = "no cell"
            cn.jiguang.commons.w.a.f(r2, r9)     // Catch: java.lang.Exception -> L9f
            cn.jiguang.commons.A.a r9 = cn.jiguang.commons.A.a.f()     // Catch: java.lang.Exception -> L9f
            r9.f(r0)     // Catch: java.lang.Exception -> L9f
            return r3
        Lcb:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "err:"
            r0.append(r1)
            java.lang.String r9 = r9.getMessage()
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            cn.jiguang.commons.w.a.c(r2, r9)
            cn.jiguang.commons.A.a r9 = cn.jiguang.commons.A.a.f()
            r0 = 3002(0xbba, float:4.207E-42)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r9.f(r0)
            return r3
    }
}

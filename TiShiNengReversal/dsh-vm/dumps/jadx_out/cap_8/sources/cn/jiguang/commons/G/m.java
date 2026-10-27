package cn.jiguang.commons.g;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class m {
    public m() {
            r0 = this;
            r0.<init>()
            return
    }

    private java.lang.Object a(int r2, boolean r3, java.lang.Object... r4) {
            r1 = this;
            cn.jiguang.commons.g.o r0 = cn.jiguang.commons.g.o.e()
            java.lang.Object r2 = r0.c(r2, r3, r4)
            return r2
    }

    private java.lang.Object c(int r3, boolean r4, java.lang.Object... r5) {
            r2 = this;
            cn.jiguang.commons.d.c r0 = cn.jiguang.commons.d.c.a()
            java.lang.Object r0 = r0.d(r3)
            boolean r1 = cn.jiguang.commons.L.ad.a(r0)
            if (r1 == 0) goto Lf
            return r0
        Lf:
            cn.jiguang.commons.d.c r0 = cn.jiguang.commons.d.c.a()
            java.lang.Object r0 = r0.c(r3)
            boolean r1 = cn.jiguang.commons.L.ad.a(r0)
            if (r1 == 0) goto L1e
            return r0
        L1e:
            java.lang.Object r3 = r2.a(r3, r4, r5)
            return r3
    }

    private java.lang.Object f(int r3, boolean r4, java.lang.Object... r5) {
            r2 = this;
            java.lang.Object r4 = r2.a(r3, r4, r5)
            boolean r5 = cn.jiguang.commons.L.ad.a(r4)
            if (r5 == 0) goto Lb
            return r4
        Lb:
            cn.jiguang.commons.d.c r4 = cn.jiguang.commons.d.c.a()
            cn.jiguang.commons.c.c r4 = r4.a(r3)
            java.lang.String r5 = "DataCollectionStrategy"
            java.lang.String r0 = "get:"
            if (r4 == 0) goto L56
            java.lang.Object r4 = r4.a()
            boolean r1 = cn.jiguang.commons.L.ad.a(r4)
            if (r1 == 0) goto L3b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r3)
            java.lang.String r3 = ":mem"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            cn.jiguang.commons.w.a.a(r5, r3)
            return r4
        L3b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r3)
            java.lang.String r3 = ":cache_invalid,val="
            r1.append(r3)
            r1.append(r4)
            java.lang.String r3 = r1.toString()
        L52:
            cn.jiguang.commons.w.a.a(r5, r3)
            goto L6b
        L56:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            r4.append(r3)
            java.lang.String r3 = ":no_cache"
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            goto L52
        L6b:
            r3 = 0
            return r3
    }

    private java.lang.Object g(int r3, boolean r4, java.lang.Object... r5) {
            r2 = this;
            cn.jiguang.commons.d.c r0 = cn.jiguang.commons.d.c.a()
            java.lang.Object r0 = r0.d(r3)
            boolean r1 = cn.jiguang.commons.L.ad.a(r0)
            if (r1 == 0) goto Lf
            return r0
        Lf:
            cn.jiguang.commons.d.c r0 = cn.jiguang.commons.d.c.a()
            java.lang.Object r0 = r0.e(r3)
            boolean r1 = cn.jiguang.commons.L.ad.a(r0)
            if (r1 == 0) goto L1e
            return r0
        L1e:
            java.lang.Object r3 = r2.a(r3, r4, r5)
            return r3
    }

    public java.lang.Object d(int r5, boolean r6, java.lang.Object... r7) {
            r4 = this;
            java.lang.String r0 = "DataCollectionStrategy"
            r1 = 0
            boolean r2 = cn.jiguang.commons.g.k.a(r5)     // Catch: java.lang.Exception -> L45
            if (r2 == 0) goto La
            return r1
        La:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L45
            r2.<init>()     // Catch: java.lang.Exception -> L45
            java.lang.String r3 = "getData called: configId="
            r2.append(r3)     // Catch: java.lang.Exception -> L45
            r2.append(r5)     // Catch: java.lang.Exception -> L45
            java.lang.String r3 = ", isCmd="
            r2.append(r3)     // Catch: java.lang.Exception -> L45
            r2.append(r6)     // Catch: java.lang.Exception -> L45
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L45
            cn.jiguang.commons.w.a.a(r0, r2)     // Catch: java.lang.Exception -> L45
            if (r6 == 0) goto L47
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L45
            r2.<init>()     // Catch: java.lang.Exception -> L45
            java.lang.String r3 = "direct col configId:"
            r2.append(r3)     // Catch: java.lang.Exception -> L45
            r2.append(r5)     // Catch: java.lang.Exception -> L45
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L45
            cn.jiguang.commons.w.a.a(r0, r2)     // Catch: java.lang.Exception -> L45
            cn.jiguang.commons.g.o r2 = cn.jiguang.commons.g.o.e()     // Catch: java.lang.Exception -> L45
            java.lang.Object r5 = r2.c(r5, r6, r7)     // Catch: java.lang.Exception -> L45
            return r5
        L45:
            r6 = move-exception
            goto L4c
        L47:
            java.lang.Object r5 = r4.e(r5, r6, r7)     // Catch: java.lang.Exception -> L45
            return r5
        L4c:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r2 = "getData error for configId:"
            r7.append(r2)
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            cn.jiguang.commons.w.a.c(r0, r5, r6)
            return r1
    }

    public java.lang.Object e(int r5, boolean r6, java.lang.Object... r7) {
            r4 = this;
            int r0 = cn.jiguang.commons.f.g.c(r5)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "get:"
            r1.append(r2)
            r1.append(r5)
            java.lang.String r2 = ":s"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "DataCollectionStrategy"
            cn.jiguang.commons.w.a.a(r2, r1)
            r1 = 1
            if (r0 == r1) goto L5e
            r1 = 2
            if (r0 == r1) goto L59
            r1 = 3
            if (r0 == r1) goto L54
            r1 = 4
            if (r0 == r1) goto L4f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "gdi: unknown s "
            r1.append(r3)
            r1.append(r0)
            java.lang.String r0 = " for "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = r1.toString()
            cn.jiguang.commons.w.a.f(r2, r0)
            java.lang.Object r5 = r4.g(r5, r6, r7)
            return r5
        L4f:
            java.lang.Object r5 = r4.f(r5, r6, r7)
            return r5
        L54:
            java.lang.Object r5 = r4.f(r5, r6, r7)
            return r5
        L59:
            java.lang.Object r5 = r4.c(r5, r6, r7)
            return r5
        L5e:
            java.lang.Object r5 = r4.g(r5, r6, r7)
            return r5
    }
}

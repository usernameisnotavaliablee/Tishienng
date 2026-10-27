package cn.jiguang.ab;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class i implements java.util.concurrent.Callable<cn.jiguang.ab.l> {
    private java.util.LinkedHashSet<cn.jiguang.ab.g> a;

    /* renamed from: b, reason: collision with root package name */
    private cn.jiguang.ab.k f278b;

    public i(cn.jiguang.ab.k r2) {
            r1 = this;
            r1.<init>()
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r1.a = r0
            r1.f278b = r2
            return
    }

    private java.util.LinkedHashSet<cn.jiguang.ab.g> a(android.content.Context r2) {
            r1 = this;
            cn.jiguang.e.a r0 = cn.jiguang.e.a.aG()
            java.lang.Object r2 = cn.jiguang.e.b.a(r2, r0)
            java.lang.String r2 = (java.lang.String) r2
            java.util.LinkedHashSet r2 = cn.jiguang.ab.g.c(r2)
            if (r2 == 0) goto L18
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L17
            goto L18
        L17:
            return r2
        L18:
            java.util.LinkedHashMap r2 = cn.jiguang.aa.a.b()
            java.util.LinkedHashSet r2 = cn.jiguang.ab.g.a(r2)
            return r2
    }

    private void a(cn.jiguang.ab.p r9, cn.jiguang.ab.f r10) {
            r8 = this;
            java.util.LinkedHashMap r0 = cn.jiguang.aa.a.a()
            java.util.LinkedHashSet r0 = cn.jiguang.ab.g.a(r0)
            java.util.LinkedHashSet<cn.jiguang.ab.g> r1 = r8.a
            r0.removeAll(r1)
            cn.jiguang.ab.k r1 = r8.f278b
            android.content.Context r1 = r1.a
            boolean r1 = cn.jiguang.av.b.e(r1)
            java.util.LinkedList r0 = cn.jiguang.av.x.a(r0)
            if (r1 == 0) goto L1f
            java.util.List r0 = cn.jiguang.av.x.a(r0)
        L1f:
            java.util.Iterator r0 = r0.iterator()
        L23:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L36
            java.lang.Object r2 = r0.next()
            cn.jiguang.ab.g r2 = (cn.jiguang.ab.g) r2
            boolean r2 = r8.a(r2, r9, r10)
            if (r2 == 0) goto L23
            goto L79
        L36:
            cn.jiguang.ab.k r0 = r8.f278b
            android.content.Context r0 = r0.a
            r2 = r1 ^ 1
            cn.jiguang.e.a r2 = cn.jiguang.e.a.b(r2)
            java.lang.Object r0 = cn.jiguang.e.b.a(r0, r2)
            java.lang.String r0 = (java.lang.String) r0
            cn.jiguang.ab.g r0 = cn.jiguang.ab.g.a(r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "main sis: last good sis "
            r2.append(r3)
            java.lang.String r4 = "v4"
            java.lang.String r5 = "v6"
            if (r1 == 0) goto L5e
            r6 = r5
            goto L5f
        L5e:
            r6 = r4
        L5f:
            r2.append(r6)
            java.lang.String r6 = " address="
            r2.append(r6)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            java.lang.String r7 = "Sis"
            cn.jiguang.w.f.c(r7, r2)
            boolean r0 = r8.a(r0, r9, r10)
            if (r0 == 0) goto L7a
        L79:
            return
        L7a:
            cn.jiguang.ab.k r0 = r8.f278b
            android.content.Context r0 = r0.a
            cn.jiguang.e.a r2 = cn.jiguang.e.a.b(r1)
            java.lang.Object r0 = cn.jiguang.e.b.a(r0, r2)
            java.lang.String r0 = (java.lang.String) r0
            cn.jiguang.ab.g r0 = cn.jiguang.ab.g.a(r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r3)
            if (r1 == 0) goto L97
            goto L98
        L97:
            r4 = r5
        L98:
            r2.append(r4)
            r2.append(r6)
            r2.append(r0)
            java.lang.String r1 = r2.toString()
            cn.jiguang.w.f.c(r7, r1)
            r8.a(r0, r9, r10)
            return
    }

    private boolean a(cn.jiguang.ab.g r10, cn.jiguang.ab.p r11, cn.jiguang.ab.f r12) {
            r9 = this;
            boolean r0 = r11.a()
            r1 = 1
            if (r0 == 0) goto L8
            return r1
        L8:
            r0 = 0
            if (r10 == 0) goto L84
            boolean r2 = r10.a()
            if (r2 == 0) goto L84
            java.util.LinkedHashSet<cn.jiguang.ab.g> r2 = r9.a
            boolean r2 = r2.contains(r10)
            if (r2 == 0) goto L1a
            goto L84
        L1a:
            cn.jiguang.ae.b r3 = cn.jiguang.ae.b.a()
            cn.jiguang.ab.k r2 = r9.f278b
            android.content.Context r4 = r2.a
            java.lang.String r5 = r10.a
            r6 = 3000(0xbb8, double:1.482E-320)
            boolean r8 = r2.a()
            java.net.InetAddress[] r2 = r3.b(r4, r5, r6, r8)
            if (r2 == 0) goto L84
            int r3 = r2.length
            if (r3 != 0) goto L34
            goto L84
        L34:
            java.util.List r2 = java.util.Arrays.asList(r2)
            java.util.LinkedList r2 = cn.jiguang.av.x.a(r2)
            cn.jiguang.ab.k r3 = r9.f278b
            android.content.Context r3 = r3.a
            java.util.LinkedList r2 = cn.jiguang.av.x.a(r3, r2)
            java.util.Iterator r2 = r2.iterator()
        L48:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L7f
            java.lang.Object r3 = r2.next()
            java.net.InetAddress r3 = (java.net.InetAddress) r3
            boolean r4 = r11.a()
            if (r4 == 0) goto L5b
            return r1
        L5b:
            cn.jiguang.ab.g r4 = new cn.jiguang.ab.g
            int r5 = r10.f270b
            r4.<init>(r3, r5)
            java.util.LinkedHashSet<cn.jiguang.ab.g> r3 = r9.a
            boolean r3 = r3.contains(r4)
            if (r3 != 0) goto L48
            boolean r3 = r12.a(r4)
            if (r3 == 0) goto L48
            java.util.LinkedHashSet<cn.jiguang.ab.g> r1 = r9.a
            r1.add(r4)
            cn.jiguang.ab.o r1 = new cn.jiguang.ab.o
            cn.jiguang.ab.k r2 = r9.f278b
            r1.<init>(r2, r11, r12)
            r11.a(r1)
        L7f:
            java.util.LinkedHashSet<cn.jiguang.ab.g> r11 = r9.a
            r11.add(r10)
        L84:
            return r0
    }

    private void b(cn.jiguang.ab.p r7, cn.jiguang.ab.f r8) {
            r6 = this;
            cn.jiguang.ab.k r0 = r6.f278b
            android.content.Context r0 = r0.a
            java.util.LinkedHashSet r0 = r6.a(r0)
            java.util.LinkedHashSet<cn.jiguang.ab.g> r1 = r6.a
            r0.removeAll(r1)
            java.util.LinkedList r0 = cn.jiguang.av.x.a(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "main sis: default sis"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "Sis"
            cn.jiguang.w.f.c(r2, r1)
            java.util.Iterator r1 = r0.iterator()
        L2b:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L3e
            java.lang.Object r3 = r1.next()
            cn.jiguang.ab.g r3 = (cn.jiguang.ab.g) r3
            boolean r3 = r6.a(r3, r7, r8)
            if (r3 == 0) goto L2b
            goto L84
        L3e:
            cn.jiguang.ac.l r1 = cn.jiguang.ac.l.a()
            java.lang.String r3 = cn.jiguang.aa.a.c()
            r4 = 10000(0x2710, double:4.9407E-320)
            java.util.LinkedHashSet r1 = r1.a(r3, r4)
            r0.clear()
            if (r1 == 0) goto L5a
            java.util.LinkedHashSet<cn.jiguang.ab.g> r0 = r6.a
            r1.removeAll(r0)
            java.util.LinkedList r0 = cn.jiguang.av.x.a(r1)
        L5a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "main sis: sis srv"
            r1.append(r3)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            cn.jiguang.w.f.c(r2, r1)
            java.util.Iterator r0 = r0.iterator()
        L72:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L84
            java.lang.Object r1 = r0.next()
            cn.jiguang.ab.g r1 = (cn.jiguang.ab.g) r1
            boolean r1 = r6.a(r1, r7, r8)
            if (r1 == 0) goto L72
        L84:
            return
    }

    public cn.jiguang.ab.l a() {
            r8 = this;
            cn.jiguang.ab.f r0 = new cn.jiguang.ab.f
            r0.<init>()
            cn.jiguang.ab.p r1 = new cn.jiguang.ab.p
            java.lang.String r2 = "ss"
            r3 = 5
            r4 = 2000(0x7d0, float:2.803E-42)
            r5 = 0
            r1.<init>(r3, r4, r5, r2)
            r8.a(r1, r0)
            java.lang.String r2 = "main sis: after host and last good, wait Result"
            java.lang.String r3 = "Sis"
            cn.jiguang.w.f.c(r3, r2)
            r6 = 60000(0xea60, double:2.9644E-319)
            java.lang.Object r2 = r1.a(r6)
            boolean r4 = r2 instanceof cn.jiguang.ab.l
            if (r4 == 0) goto L28
            cn.jiguang.ab.l r2 = (cn.jiguang.ab.l) r2
            return r2
        L28:
            r8.b(r1, r0)
            java.lang.String r0 = "main sis: after default and srv, wait Result"
            cn.jiguang.w.f.c(r3, r0)
            java.lang.Object r0 = r1.a(r6)
            r2 = 0
            r1.a(r2)
            boolean r1 = r0 instanceof cn.jiguang.ab.l
            if (r1 == 0) goto L3f
            cn.jiguang.ab.l r0 = (cn.jiguang.ab.l) r0
            return r0
        L3f:
            return r5
    }

    @Override // java.util.concurrent.Callable
    public /* synthetic */ cn.jiguang.ab.l call() {
            r1 = this;
            cn.jiguang.ab.l r0 = r1.a()
            return r0
    }
}

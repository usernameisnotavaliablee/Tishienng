package cn.jiguang.ab;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class f {
    private java.util.LinkedHashSet<cn.jiguang.ab.g> a;

    /* renamed from: b, reason: collision with root package name */
    private java.util.LinkedHashSet<cn.jiguang.ab.g> f268b;

    /* renamed from: c, reason: collision with root package name */
    private java.util.List<java.lang.Boolean> f269c;

    public f() {
            r1 = this;
            r1.<init>()
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r1.a = r0
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r1.f268b = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f269c = r0
            return
    }

    private cn.jiguang.ab.g a(boolean r3, boolean r4) {
            r2 = this;
            if (r3 == 0) goto L5
            java.util.LinkedHashSet<cn.jiguang.ab.g> r0 = r2.f268b
            goto L7
        L5:
            java.util.LinkedHashSet<cn.jiguang.ab.g> r0 = r2.a
        L7:
            if (r4 == 0) goto Lb
            r4 = 0
            goto L12
        Lb:
            if (r3 == 0) goto L10
            java.util.LinkedHashSet<cn.jiguang.ab.g> r4 = r2.a
            goto L12
        L10:
            java.util.LinkedHashSet<cn.jiguang.ab.g> r4 = r2.f268b
        L12:
            if (r4 == 0) goto L31
            boolean r1 = r4.isEmpty()
            if (r1 == 0) goto L1b
            goto L31
        L1b:
            if (r0 == 0) goto L2a
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L24
            goto L2a
        L24:
            boolean r3 = r2.a(r3)
            if (r3 == 0) goto L31
        L2a:
            java.lang.Object r3 = a(r4)
        L2e:
            cn.jiguang.ab.g r3 = (cn.jiguang.ab.g) r3
            return r3
        L31:
            java.lang.Object r3 = a(r0)
            goto L2e
    }

    private static <T> T a(java.util.Collection<T> r2) {
            r0 = 0
            if (r2 == 0) goto L1b
            boolean r1 = r2.isEmpty()
            if (r1 == 0) goto La
            goto L1b
        La:
            java.util.Iterator r2 = r2.iterator()
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L1b
            java.lang.Object r0 = r2.next()
            r2.remove()
        L1b:
            return r0
    }

    private boolean a(boolean r6) {
            r5 = this;
            java.util.List<java.lang.Boolean> r0 = r5.f269c
            int r0 = r0.size()
            r1 = 0
            r2 = 2
            if (r0 >= r2) goto Lb
            return r1
        Lb:
            java.util.List<java.lang.Boolean> r0 = r5.f269c
            int r0 = r0.size()
            r3 = 1
            int r0 = r0 - r3
        L13:
            java.util.List<java.lang.Boolean> r4 = r5.f269c
            int r4 = r4.size()
            int r4 = r4 - r2
            if (r0 < r4) goto L2e
            java.util.List<java.lang.Boolean> r4 = r5.f269c
            java.lang.Object r4 = r4.get(r0)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == r6) goto L2b
            return r1
        L2b:
            int r0 = r0 + (-1)
            goto L13
        L2e:
            return r3
    }

    public cn.jiguang.ab.g a(int r5) {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "current ipv4List="
            r0.append(r1)
            java.util.LinkedHashSet<cn.jiguang.ab.g> r1 = r4.a
            r0.append(r1)
            java.lang.String r1 = " ipv6List="
            r0.append(r1)
            java.util.LinkedHashSet<cn.jiguang.ab.g> r1 = r4.f268b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "IpPool"
            cn.jiguang.w.f.c(r1, r0)
            r0 = 0
            if (r5 == 0) goto L3f
            r2 = 1
            if (r5 == r2) goto L3a
            r3 = 2
            if (r5 == r3) goto L35
            r3 = 3
            if (r5 == r3) goto L30
            r5 = 0
            goto L43
        L30:
            cn.jiguang.ab.g r5 = r4.a(r2, r0)
            goto L43
        L35:
            cn.jiguang.ab.g r5 = r4.a(r2, r2)
            goto L43
        L3a:
            cn.jiguang.ab.g r5 = r4.a(r0, r2)
            goto L43
        L3f:
            cn.jiguang.ab.g r5 = r4.a(r0, r0)
        L43:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "get ipPort="
            r0.append(r2)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            cn.jiguang.w.f.c(r1, r0)
            if (r5 == 0) goto L70
            java.net.InetAddress r0 = r5.f271c
            boolean r1 = r0 instanceof java.net.Inet4Address
            if (r1 == 0) goto L67
            java.util.List<java.lang.Boolean> r0 = r4.f269c
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
        L63:
            r0.add(r1)
            return r5
        L67:
            boolean r0 = r0 instanceof java.net.Inet6Address
            if (r0 == 0) goto L70
            java.util.List<java.lang.Boolean> r0 = r4.f269c
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            goto L63
        L70:
            return r5
    }

    public void a() {
            r1 = this;
            java.util.LinkedHashSet<cn.jiguang.ab.g> r0 = r1.a     // Catch: java.lang.Throwable -> La
            r0.clear()     // Catch: java.lang.Throwable -> La
            java.util.LinkedHashSet<cn.jiguang.ab.g> r0 = r1.f268b     // Catch: java.lang.Throwable -> La
            r0.clear()     // Catch: java.lang.Throwable -> La
        La:
            return
    }

    public boolean a(cn.jiguang.ab.g r3) {
            r2 = this;
            if (r3 == 0) goto L1c
            boolean r0 = r3.a()
            if (r0 == 0) goto L1c
            java.net.InetAddress r0 = r3.f271c
            boolean r1 = r0 instanceof java.net.Inet4Address
            if (r1 == 0) goto L15
            java.util.LinkedHashSet<cn.jiguang.ab.g> r0 = r2.a
        L10:
            boolean r3 = r0.add(r3)
            return r3
        L15:
            boolean r0 = r0 instanceof java.net.Inet6Address
            if (r0 == 0) goto L1c
            java.util.LinkedHashSet<cn.jiguang.ab.g> r0 = r2.f268b
            goto L10
        L1c:
            r3 = 0
            return r3
    }
}

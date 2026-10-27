package cn.jiguang.ac;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class h implements java.io.Serializable {
    private java.util.List a;

    /* renamed from: b, reason: collision with root package name */
    private short f359b;

    /* renamed from: c, reason: collision with root package name */
    private short f360c;

    public h() {
            r2 = this;
            r2.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 1
            r0.<init>(r1)
            r2.a = r0
            r0 = 0
            r2.f359b = r0
            r2.f360c = r0
            return
    }

    public h(cn.jiguang.ac.i r1) {
            r0 = this;
            r0.<init>()
            r0.b(r1)
            return
    }

    private java.lang.String a(java.util.Iterator r4) {
            r3 = this;
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
        L5:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L2e
            java.lang.Object r1 = r4.next()
            cn.jiguang.ac.i r1 = (cn.jiguang.ac.i) r1
            java.lang.String r2 = "["
            r0.append(r2)
            java.lang.String r1 = r1.c()
            r0.append(r1)
            java.lang.String r1 = "]"
            r0.append(r1)
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L5
            java.lang.String r1 = " "
            r0.append(r1)
            goto L5
        L2e:
            java.lang.String r4 = r0.toString()
            return r4
    }

    private synchronized java.util.Iterator a(boolean r5, boolean r6) {
            r4 = this;
            monitor-enter(r4)
            java.util.List r0 = r4.a     // Catch: java.lang.Throwable -> Le
            int r0 = r0.size()     // Catch: java.lang.Throwable -> Le
            if (r5 == 0) goto L10
            short r1 = r4.f359b     // Catch: java.lang.Throwable -> Le
            int r1 = r0 - r1
            goto L12
        Le:
            r5 = move-exception
            goto L5e
        L10:
            short r1 = r4.f359b     // Catch: java.lang.Throwable -> Le
        L12:
            if (r1 != 0) goto L1c
            java.util.List r5 = java.util.Collections.EMPTY_LIST     // Catch: java.lang.Throwable -> Le
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> Le
            monitor-exit(r4)
            return r5
        L1c:
            r2 = 0
            if (r5 == 0) goto L31
            if (r6 != 0) goto L23
            r6 = 0
            goto L35
        L23:
            short r6 = r4.f360c     // Catch: java.lang.Throwable -> Le
            if (r6 < r1) goto L29
            r4.f360c = r2     // Catch: java.lang.Throwable -> Le
        L29:
            short r6 = r4.f360c     // Catch: java.lang.Throwable -> Le
            int r3 = r6 + 1
            short r3 = (short) r3     // Catch: java.lang.Throwable -> Le
            r4.f360c = r3     // Catch: java.lang.Throwable -> Le
            goto L35
        L31:
            short r6 = r4.f359b     // Catch: java.lang.Throwable -> Le
            int r6 = r0 - r6
        L35:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Le
            r3.<init>(r1)     // Catch: java.lang.Throwable -> Le
            if (r5 == 0) goto L51
            java.util.List r5 = r4.a     // Catch: java.lang.Throwable -> Le
            java.util.List r5 = r5.subList(r6, r1)     // Catch: java.lang.Throwable -> Le
            r3.addAll(r5)     // Catch: java.lang.Throwable -> Le
            if (r6 == 0) goto L58
            java.util.List r5 = r4.a     // Catch: java.lang.Throwable -> Le
            java.util.List r5 = r5.subList(r2, r6)     // Catch: java.lang.Throwable -> Le
        L4d:
            r3.addAll(r5)     // Catch: java.lang.Throwable -> Le
            goto L58
        L51:
            java.util.List r5 = r4.a     // Catch: java.lang.Throwable -> Le
            java.util.List r5 = r5.subList(r6, r0)     // Catch: java.lang.Throwable -> Le
            goto L4d
        L58:
            java.util.Iterator r5 = r3.iterator()     // Catch: java.lang.Throwable -> Le
            monitor-exit(r4)
            return r5
        L5e:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Le
            throw r5
    }

    private void b(cn.jiguang.ac.i r4) {
            r3 = this;
            short r0 = r3.f359b
            if (r0 != 0) goto La
            java.util.List r0 = r3.a
            r0.add(r4)
            return
        La:
            java.util.List r0 = r3.a
            int r1 = r0.size()
            short r2 = r3.f359b
            int r1 = r1 - r2
            r0.add(r1, r4)
            return
    }

    public synchronized java.util.Iterator a() {
            r1 = this;
            monitor-enter(r1)
            r0 = 1
            java.util.Iterator r0 = r1.a(r0, r0)     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return r0
        L8:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8
            throw r0
    }

    public synchronized void a(cn.jiguang.ac.i r7) {
            r6 = this;
            monitor-enter(r6)
            java.util.List r0 = r6.a     // Catch: java.lang.Throwable -> Le
            int r0 = r0.size()     // Catch: java.lang.Throwable -> Le
            if (r0 != 0) goto L10
            r6.b(r7)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r6)
            return
        Le:
            r7 = move-exception
            goto L77
        L10:
            cn.jiguang.ac.i r0 = r6.f()     // Catch: java.lang.Throwable -> Le
            boolean r1 = r7.a(r0)     // Catch: java.lang.Throwable -> Le
            if (r1 == 0) goto L6f
            long r1 = r7.h()     // Catch: java.lang.Throwable -> Le
            long r3 = r0.h()     // Catch: java.lang.Throwable -> Le
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L62
            long r1 = r7.h()     // Catch: java.lang.Throwable -> Le
            long r3 = r0.h()     // Catch: java.lang.Throwable -> Le
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L3e
            cn.jiguang.ac.i r7 = r7.i()     // Catch: java.lang.Throwable -> Le
            long r0 = r0.h()     // Catch: java.lang.Throwable -> Le
            r7.a(r0)     // Catch: java.lang.Throwable -> Le
            goto L62
        L3e:
            r0 = 0
        L3f:
            java.util.List r1 = r6.a     // Catch: java.lang.Throwable -> Le
            int r1 = r1.size()     // Catch: java.lang.Throwable -> Le
            if (r0 >= r1) goto L62
            java.util.List r1 = r6.a     // Catch: java.lang.Throwable -> Le
            java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Throwable -> Le
            cn.jiguang.ac.i r1 = (cn.jiguang.ac.i) r1     // Catch: java.lang.Throwable -> Le
            cn.jiguang.ac.i r1 = r1.i()     // Catch: java.lang.Throwable -> Le
            long r2 = r7.h()     // Catch: java.lang.Throwable -> Le
            r1.a(r2)     // Catch: java.lang.Throwable -> Le
            java.util.List r2 = r6.a     // Catch: java.lang.Throwable -> Le
            r2.set(r0, r1)     // Catch: java.lang.Throwable -> Le
            int r0 = r0 + 1
            goto L3f
        L62:
            java.util.List r0 = r6.a     // Catch: java.lang.Throwable -> Le
            boolean r0 = r0.contains(r7)     // Catch: java.lang.Throwable -> Le
            if (r0 != 0) goto L6d
            r6.b(r7)     // Catch: java.lang.Throwable -> Le
        L6d:
            monitor-exit(r6)
            return
        L6f:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> Le
            java.lang.String r0 = "record does not match rrset"
            r7.<init>(r0)     // Catch: java.lang.Throwable -> Le
            throw r7     // Catch: java.lang.Throwable -> Le
        L77:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> Le
            throw r7
    }

    public cn.jiguang.ac.g b() {
            r1 = this;
            cn.jiguang.ac.i r0 = r1.f()
            cn.jiguang.ac.g r0 = r0.d()
            return r0
    }

    public int c() {
            r1 = this;
            cn.jiguang.ac.i r0 = r1.f()
            int r0 = r0.f()
            return r0
    }

    public int d() {
            r1 = this;
            cn.jiguang.ac.i r0 = r1.f()
            int r0 = r0.g()
            return r0
    }

    public synchronized long e() {
            r2 = this;
            monitor-enter(r2)
            cn.jiguang.ac.i r0 = r2.f()     // Catch: java.lang.Throwable -> Lb
            long r0 = r0.h()     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r2)
            return r0
        Lb:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lb
            throw r0
    }

    public synchronized cn.jiguang.ac.i f() {
            r2 = this;
            monitor-enter(r2)
            java.util.List r0 = r2.a     // Catch: java.lang.Throwable -> L14
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L14
            if (r0 == 0) goto L16
            java.util.List r0 = r2.a     // Catch: java.lang.Throwable -> L14
            r1 = 0
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L14
            cn.jiguang.ac.i r0 = (cn.jiguang.ac.i) r0     // Catch: java.lang.Throwable -> L14
            monitor-exit(r2)
            return r0
        L14:
            r0 = move-exception
            goto L1e
        L16:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L14
            java.lang.String r1 = "rrset is empty"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L14
            throw r0     // Catch: java.lang.Throwable -> L14
        L1e:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L14
            throw r0
    }

    public java.lang.String toString() {
            r5 = this;
            java.util.List r0 = r5.a
            int r0 = r0.size()
            if (r0 != 0) goto Lc
            java.lang.String r0 = "{empty}"
            return r0
        Lc:
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            java.lang.String r1 = "{ "
            r0.append(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            cn.jiguang.ac.g r2 = r5.b()
            r1.append(r2)
            java.lang.String r2 = " "
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            long r3 = r5.e()
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            r1 = 1
            r2 = 0
            java.util.Iterator r1 = r5.a(r1, r2)
            java.lang.String r1 = r5.a(r1)
            r0.append(r1)
            short r1 = r5.f359b
            if (r1 <= 0) goto L66
            java.lang.String r1 = " sigs: "
            r0.append(r1)
            java.util.Iterator r1 = r5.a(r2, r2)
            java.lang.String r1 = r5.a(r1)
            r0.append(r1)
        L66:
            java.lang.String r1 = " }"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}

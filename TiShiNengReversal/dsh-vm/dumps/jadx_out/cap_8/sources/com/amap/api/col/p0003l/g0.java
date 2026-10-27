package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class g0 extends java.lang.Thread {
    private android.content.Context a;

    /* renamed from: b, reason: collision with root package name */
    private com.amap.api.col.p0003l.s0 f3373b;

    public g0(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            com.amap.api.col.3l.s0 r1 = com.amap.api.col.p0003l.s0.b(r1)
            r0.f3373b = r1
            return
    }

    private static com.amap.api.col.p0003l.n0 a(java.io.File r1) {
            java.lang.String r1 = com.amap.api.col.p0003l.b3.w(r1)
            com.amap.api.col.3l.n0 r0 = new com.amap.api.col.3l.n0
            r0.<init>()
            r0.o(r1)
            return r0
    }

    private com.amap.api.col.p0003l.n0 b(java.lang.String r9) {
            r8 = this;
            java.lang.String r0 = "quanguo"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto La
            java.lang.String r9 = "quanguogaiyaotu"
        La:
            android.content.Context r0 = r8.a
            com.amap.api.col.3l.c0 r0 = com.amap.api.col.p0003l.c0.b(r0)
            r1 = 0
            if (r0 == 0) goto L5d
            java.lang.String r0 = r0.E(r9)
            java.io.File r2 = new java.io.File
            android.content.Context r3 = r8.a
            java.lang.String r3 = com.amap.api.col.p0003l.b3.f0(r3)
            r2.<init>(r3)
            java.io.File[] r2 = r2.listFiles()
            if (r2 != 0) goto L29
            return r1
        L29:
            int r3 = r2.length
            r4 = 0
        L2b:
            if (r4 >= r3) goto L5d
            r5 = r2[r4]
            java.lang.String r6 = r5.getName()
            boolean r6 = r6.contains(r0)
            if (r6 != 0) goto L43
            java.lang.String r6 = r5.getName()
            boolean r6 = r6.contains(r9)
            if (r6 == 0) goto L5a
        L43:
            java.lang.String r6 = r5.getName()
            java.lang.String r7 = ".zip.tmp.dt"
            boolean r6 = r6.endsWith(r7)
            if (r6 == 0) goto L5a
            com.amap.api.col.3l.n0 r1 = a(r5)
            java.lang.String r5 = r1.a()
            if (r5 == 0) goto L5a
            return r1
        L5a:
            int r4 = r4 + 1
            goto L2b
        L5d:
            return r1
    }

    private void c() {
            r10 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.amap.api.col.3l.s0 r1 = r10.f3373b
            java.util.ArrayList r1 = r1.c()
            java.lang.String r2 = "vmap/"
            r10.d(r0, r2)
            java.lang.String r2 = "map/"
            r10.d(r0, r2)
            r10.g(r0, r2)
            java.util.ArrayList r2 = r10.f()
            java.util.Iterator r3 = r1.iterator()
        L20:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto Lec
            java.lang.Object r4 = r3.next()
            com.amap.api.col.3l.n0 r4 = (com.amap.api.col.p0003l.n0) r4
            if (r4 == 0) goto L20
            java.lang.String r5 = r4.a()
            if (r5 == 0) goto L20
            int r5 = r4.l
            r6 = 4
            r7 = -1
            r8 = 1
            if (r5 == r6) goto Lc0
            r6 = 7
            if (r5 != r6) goto L40
            goto Lc0
        L40:
            r6 = 0
            if (r5 == 0) goto L87
            if (r5 != r8) goto L46
            goto L87
        L46:
            r9 = 3
            if (r5 != r9) goto L20
            int r5 = r4.i()
            if (r5 == 0) goto L20
            java.lang.String r5 = r4.e()
            boolean r5 = r2.contains(r5)
            if (r5 != 0) goto L63
            java.lang.String r5 = r4.j()
            boolean r5 = r2.contains(r5)
            if (r5 == 0) goto L64
        L63:
            r6 = 1
        L64:
            if (r6 != 0) goto L7e
            java.lang.String r5 = r4.g()
            java.lang.String r5 = com.amap.api.col.p0003l.a1.i(r5)
            if (r5 == 0) goto L7e
            int r5 = r2.indexOf(r5)
            if (r5 == r7) goto L7e
            java.lang.String r6 = r4.j()
            r2.set(r5, r6)
            goto L7f
        L7e:
            r8 = r6
        L7f:
            if (r8 != 0) goto L20
            com.amap.api.col.3l.s0 r5 = r10.f3373b
            r5.k(r4)
            goto L20
        L87:
            java.lang.String r5 = r4.e()
            boolean r5 = r2.contains(r5)
            if (r5 != 0) goto L9b
            java.lang.String r5 = r4.j()
            boolean r5 = r2.contains(r5)
            if (r5 == 0) goto L9c
        L9b:
            r6 = 1
        L9c:
            if (r6 != 0) goto Lb6
            java.lang.String r5 = r4.g()
            java.lang.String r5 = com.amap.api.col.p0003l.a1.i(r5)
            if (r5 == 0) goto Lb6
            int r5 = r2.indexOf(r5)
            if (r5 == r7) goto Lb6
            java.lang.String r6 = r4.j()
            r2.set(r5, r6)
            goto Lb7
        Lb6:
            r8 = r6
        Lb7:
            if (r8 != 0) goto L20
            com.amap.api.col.3l.s0 r5 = r10.f3373b
            r5.k(r4)
            goto L20
        Lc0:
            java.lang.String r5 = r4.j()
            boolean r5 = r0.contains(r5)
            if (r5 != 0) goto Le2
            java.lang.String r6 = r4.g()
            java.lang.String r6 = com.amap.api.col.p0003l.a1.i(r6)
            if (r6 == 0) goto Le2
            int r6 = r0.indexOf(r6)
            if (r6 == r7) goto Le2
            java.lang.String r5 = r4.j()
            r0.set(r6, r5)
            goto Le3
        Le2:
            r8 = r5
        Le3:
            if (r8 != 0) goto L20
            com.amap.api.col.3l.s0 r5 = r10.f3373b
            r5.k(r4)
            goto L20
        Lec:
            java.util.Iterator r0 = r0.iterator()
        Lf0:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L10e
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            boolean r3 = e(r2, r1)
            if (r3 != 0) goto Lf0
            com.amap.api.col.3l.n0 r2 = r10.b(r2)
            if (r2 == 0) goto Lf0
            com.amap.api.col.3l.s0 r3 = r10.f3373b
            r3.e(r2)
            goto Lf0
        L10e:
            android.content.Context r0 = r10.a
            com.amap.api.col.3l.c0 r0 = com.amap.api.col.p0003l.c0.b(r0)
            if (r0 == 0) goto L119
            r0.j()
        L119:
            return
    }

    private void d(java.util.ArrayList<java.lang.String> r7, java.lang.String r8) {
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            android.content.Context r1 = r6.a
            java.lang.String r1 = com.amap.api.col.p0003l.b3.X(r1)
            r0.append(r1)
            r0.append(r8)
            java.io.File r8 = new java.io.File
            java.lang.String r0 = r0.toString()
            r8.<init>(r0)
            boolean r0 = r8.exists()
            if (r0 != 0) goto L21
            goto L5d
        L21:
            java.io.File[] r8 = r8.listFiles()
            if (r8 != 0) goto L28
            goto L5d
        L28:
            int r0 = r8.length
            r1 = 0
            r2 = 0
        L2b:
            if (r2 >= r0) goto L5d
            r3 = r8[r2]
            java.lang.String r4 = r3.getName()
            java.lang.String r5 = ".dat"
            boolean r4 = r4.endsWith(r5)
            if (r4 == 0) goto L5a
            java.lang.String r3 = r3.getName()
            r4 = 46
            int r4 = r3.lastIndexOf(r4)
            if (r4 < 0) goto L5a
            int r5 = r3.length()
            if (r4 >= r5) goto L5a
            java.lang.String r3 = r3.substring(r1, r4)
            boolean r4 = r7.contains(r3)
            if (r4 != 0) goto L5a
            r7.add(r3)
        L5a:
            int r2 = r2 + 1
            goto L2b
        L5d:
            return
    }

    private static boolean e(java.lang.String r1, java.util.ArrayList<com.amap.api.col.p0003l.n0> r2) {
            java.util.Iterator r2 = r2.iterator()
        L4:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L1c
            java.lang.Object r0 = r2.next()
            com.amap.api.col.3l.n0 r0 = (com.amap.api.col.p0003l.n0) r0
            java.lang.String r0 = r0.j()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L4
            r1 = 1
            return r1
        L1c:
            r1 = 0
            return r1
    }

    private java.util.ArrayList<java.lang.String> f() {
            r8 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            android.content.Context r2 = r8.a
            java.lang.String r2 = com.amap.api.col.p0003l.b3.f0(r2)
            r1.append(r2)
            java.io.File r2 = new java.io.File
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            boolean r1 = r2.exists()
            if (r1 != 0) goto L23
            goto L59
        L23:
            java.io.File[] r1 = r2.listFiles()
            if (r1 != 0) goto L2a
            goto L59
        L2a:
            int r2 = r1.length
            r3 = 0
            r4 = 0
        L2d:
            if (r4 >= r2) goto L59
            r5 = r1[r4]
            java.lang.String r6 = r5.getName()
            java.lang.String r7 = ".zip"
            boolean r6 = r6.endsWith(r7)
            if (r6 == 0) goto L56
            java.lang.String r5 = r5.getName()
            r6 = 46
            int r6 = r5.lastIndexOf(r6)
            if (r6 < 0) goto L56
            int r7 = r5.length()
            if (r6 >= r7) goto L56
            java.lang.String r5 = r5.substring(r3, r6)
            r0.add(r5)
        L56:
            int r4 = r4 + 1
            goto L2d
        L59:
            return r0
    }

    private void g(java.util.ArrayList<java.lang.String> r14, java.lang.String r15) {
            r13 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            android.content.Context r1 = r13.a
            java.lang.String r1 = com.amap.api.col.p0003l.b3.v(r1)
            r0.append(r1)
            r0.append(r15)
            java.io.File r15 = new java.io.File
            java.lang.String r0 = r0.toString()
            r15.<init>(r0)
            boolean r0 = r15.exists()
            if (r0 != 0) goto L22
            goto L8f
        L22:
            java.io.File[] r15 = r15.listFiles()
            if (r15 != 0) goto L29
            goto L8f
        L29:
            int r0 = r15.length
            r1 = 0
            r2 = 0
        L2c:
            if (r2 >= r0) goto L8f
            r3 = r15[r2]
            boolean r4 = r3.isDirectory()
            if (r4 == 0) goto L8c
            java.lang.String r4 = r3.getName()
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 != 0) goto L8c
            java.lang.String[] r3 = r3.list()
            if (r3 == 0) goto L8c
            int r5 = r3.length
            if (r5 <= 0) goto L8c
            boolean r5 = r14.contains(r4)
            if (r5 != 0) goto L8c
            java.lang.String r5 = "a0"
            boolean r5 = r4.equals(r5)
            java.lang.String r6 = "m1.ans"
            if (r5 == 0) goto L69
            int r5 = r3.length
            r7 = 0
        L5b:
            if (r7 >= r5) goto L8c
            r8 = r3[r7]
            boolean r8 = r6.equals(r8)
            if (r8 == 0) goto L66
            goto L89
        L66:
            int r7 = r7 + 1
            goto L5b
        L69:
            int r5 = r3.length
            r7 = 0
            r8 = 0
            r9 = 0
        L6d:
            if (r7 >= r5) goto L85
            r10 = r3[r7]
            boolean r11 = r6.equals(r10)
            r12 = 1
            if (r11 == 0) goto L79
            r8 = 1
        L79:
            java.lang.String r11 = "m3.ans"
            boolean r10 = r11.equals(r10)
            if (r10 == 0) goto L82
            r9 = 1
        L82:
            int r7 = r7 + 1
            goto L6d
        L85:
            if (r8 == 0) goto L8c
            if (r9 == 0) goto L8c
        L89:
            r14.add(r4)
        L8c:
            int r2 = r2 + 1
            goto L2c
        L8f:
            return
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
            r0 = this;
            r0.c()     // Catch: java.lang.Throwable -> L3
        L3:
            return
    }
}

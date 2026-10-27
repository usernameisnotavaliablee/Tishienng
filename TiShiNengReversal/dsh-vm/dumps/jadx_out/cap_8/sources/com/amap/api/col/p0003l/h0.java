package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class h0 {
    public java.util.ArrayList<com.amap.api.maps.offlinemap.OfflineMapProvince> a;

    /* renamed from: b, reason: collision with root package name */
    private com.amap.api.col.p0003l.s0 f3442b;

    /* renamed from: c, reason: collision with root package name */
    private android.content.Context f3443c;

    public h0(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.a = r0
            r1.f3443c = r2
            com.amap.api.col.3l.s0 r2 = com.amap.api.col.p0003l.s0.b(r2)
            r1.f3442b = r2
            return
    }

    private void d(com.amap.api.col.p0003l.ax r4, com.amap.api.maps.offlinemap.OfflineMapCity r5) {
            r3 = this;
            com.amap.api.col.3l.g1 r0 = r4.s()
            int r0 = r0.d()
            com.amap.api.col.3l.g1 r1 = r4.s()
            com.amap.api.col.3l.g1 r2 = r4.f2985f
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L1c
            com.amap.api.col.3l.n0 r1 = r4.G()
            r3.p(r1)
            goto L4e
        L1c:
            com.amap.api.col.3l.g1 r1 = r4.s()
            com.amap.api.col.3l.g1 r2 = r4.f2990k
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L35
            r4.getCity()
            r3.o(r4)
            com.amap.api.col.3l.n0 r1 = r4.G()
            r1.n()
        L35:
            int r1 = r4.getcompleteCode()
            com.amap.api.col.3l.g1 r2 = r4.s()
            int r2 = r2.d()
            boolean r1 = k(r1, r2)
            if (r1 == 0) goto L4e
            com.amap.api.col.3l.n0 r1 = r4.G()
            r3.f(r1)
        L4e:
            r5.setState(r0)
            int r4 = r4.getcompleteCode()
            r5.setCompleteCode(r4)
            return
    }

    private void e(com.amap.api.col.p0003l.ax r4, com.amap.api.maps.offlinemap.OfflineMapProvince r5) {
            r3 = this;
            com.amap.api.col.3l.g1 r0 = r4.s()
            int r0 = r0.d()
            r1 = 6
            if (r0 != r1) goto L26
            r5.setState(r0)
            r4 = 0
            r5.setCompleteCode(r4)
            com.amap.api.col.3l.n0 r4 = new com.amap.api.col.3l.n0
            android.content.Context r0 = r3.f3443c
            r4.<init>(r5, r0)
            r3.p(r4)
            java.lang.String r4 = r5.getProvinceCode()     // Catch: java.lang.Throwable -> L86
            android.content.Context r5 = r3.f3443c     // Catch: java.lang.Throwable -> L86
            com.amap.api.col.p0003l.a1.k(r4, r5)     // Catch: java.lang.Throwable -> L86
            return
        L26:
            boolean r1 = j(r0)
            if (r1 == 0) goto L86
            boolean r1 = l(r5)
            if (r1 == 0) goto L86
            java.lang.String r1 = r4.getPinyin()
            java.lang.String r2 = r5.getPinyin()
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L6e
            r5.setState(r0)
            int r0 = r4.getcompleteCode()
            r5.setCompleteCode(r0)
            java.lang.String r0 = r4.getVersion()
            r5.setVersion(r0)
            java.lang.String r0 = r4.getUrl()
            r5.setUrl(r0)
            com.amap.api.col.3l.n0 r0 = new com.amap.api.col.3l.n0
            android.content.Context r1 = r3.f3443c
            r0.<init>(r5, r1)
            java.lang.String r5 = r4.l()
            r0.m(r5)
            java.lang.String r4 = r4.getCode()
            r0.d(r4)
            goto L7d
        L6e:
            r5.setState(r0)
            r4 = 100
            r5.setCompleteCode(r4)
            com.amap.api.col.3l.n0 r0 = new com.amap.api.col.3l.n0
            android.content.Context r4 = r3.f3443c
            r0.<init>(r5, r4)
        L7d:
            r0.n()
            r3.f(r0)
            r0.a()
        L86:
            return
    }

    private void f(com.amap.api.col.p0003l.n0 r2) {
            r1 = this;
            com.amap.api.col.3l.s0 r0 = r1.f3442b
            if (r0 == 0) goto L9
            if (r2 == 0) goto L9
            r0.e(r2)
        L9:
            return
    }

    private static void g(com.amap.api.maps.offlinemap.OfflineMapCity r2, com.amap.api.maps.offlinemap.OfflineMapCity r3) {
            java.lang.String r0 = r3.getUrl()
            r2.setUrl(r0)
            java.lang.String r0 = r3.getVersion()
            r2.setVersion(r0)
            long r0 = r3.getSize()
            r2.setSize(r0)
            java.lang.String r0 = r3.getCode()
            r2.setCode(r0)
            java.lang.String r0 = r3.getPinyin()
            r2.setPinyin(r0)
            java.lang.String r3 = r3.getJianpin()
            r2.setJianpin(r3)
            return
    }

    private static void h(com.amap.api.maps.offlinemap.OfflineMapProvince r2, com.amap.api.maps.offlinemap.OfflineMapProvince r3) {
            java.lang.String r0 = r3.getUrl()
            r2.setUrl(r0)
            java.lang.String r0 = r3.getVersion()
            r2.setVersion(r0)
            long r0 = r3.getSize()
            r2.setSize(r0)
            java.lang.String r0 = r3.getPinyin()
            r2.setPinyin(r0)
            java.lang.String r3 = r3.getJianpin()
            r2.setJianpin(r3)
            return
    }

    private static boolean j(int r1) {
            r0 = 4
            if (r1 != r0) goto L5
            r1 = 1
            return r1
        L5:
            r1 = 0
            return r1
    }

    private static boolean k(int r1, int r2) {
            r0 = 1
            if (r2 != r0) goto Ld
            r2 = 2
            if (r1 <= r2) goto Ld
            r2 = 98
            if (r1 < r2) goto Lb
            goto Ld
        Lb:
            r1 = 0
            return r1
        Ld:
            return r0
    }

    private static boolean l(com.amap.api.maps.offlinemap.OfflineMapProvince r3) {
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            java.util.ArrayList r3 = r3.getCityList()
            java.util.Iterator r3 = r3.iterator()
        Lc:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L20
            java.lang.Object r1 = r3.next()
            com.amap.api.maps.offlinemap.OfflineMapCity r1 = (com.amap.api.maps.offlinemap.OfflineMapCity) r1
            int r1 = r1.getState()
            r2 = 4
            if (r1 == r2) goto Lc
            return r0
        L20:
            r3 = 1
            return r3
    }

    private void o(com.amap.api.col.p0003l.ax r7) {
            r6 = this;
            java.io.File r0 = new java.io.File
            android.content.Context r1 = r6.f3443c
            java.lang.String r1 = com.amap.api.col.p0003l.b3.f0(r1)
            r0.<init>(r1)
            java.io.File[] r0 = r0.listFiles()
            if (r0 != 0) goto L12
            goto L44
        L12:
            int r1 = r0.length
            r2 = 0
        L14:
            if (r2 >= r1) goto L44
            r3 = r0[r2]
            boolean r4 = r3.isFile()
            if (r4 == 0) goto L41
            boolean r4 = r3.exists()
            if (r4 == 0) goto L41
            java.lang.String r4 = r3.getName()
            java.lang.String r5 = r7.getAdcode()
            boolean r4 = r4.contains(r5)
            if (r4 == 0) goto L41
            java.lang.String r4 = r3.getName()
            java.lang.String r5 = ".zip.tmp.dt"
            boolean r4 = r4.endsWith(r5)
            if (r4 == 0) goto L41
            r3.delete()
        L41:
            int r2 = r2 + 1
            goto L14
        L44:
            return
    }

    private void p(com.amap.api.col.p0003l.n0 r2) {
            r1 = this;
            com.amap.api.col.3l.s0 r0 = r1.f3442b
            if (r0 == 0) goto L7
            r0.k(r2)
        L7:
            return
    }

    private static boolean q(int r2) {
            r0 = 1
            if (r2 == 0) goto L1d
            r1 = 2
            if (r2 == r1) goto L1d
            r1 = 3
            if (r2 == r1) goto L1d
            if (r2 == r0) goto L1d
            r1 = 102(0x66, float:1.43E-43)
            if (r2 == r1) goto L1d
            r1 = 101(0x65, float:1.42E-43)
            if (r2 == r1) goto L1d
            r1 = 103(0x67, float:1.44E-43)
            if (r2 == r1) goto L1d
            r1 = -1
            if (r2 != r1) goto L1b
            goto L1d
        L1b:
            r2 = 0
            return r2
        L1d:
            return r0
    }

    private void x() {
            r2 = this;
            java.util.ArrayList<com.amap.api.maps.offlinemap.OfflineMapProvince> r0 = r2.a
            if (r0 == 0) goto Lf
            monitor-enter(r0)
            java.util.ArrayList<com.amap.api.maps.offlinemap.OfflineMapProvince> r1 = r2.a     // Catch: java.lang.Throwable -> Lc
            r1.clear()     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            return
        Lc:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            throw r1
        Lf:
            return
    }

    public final com.amap.api.maps.offlinemap.OfflineMapCity a(java.lang.String r7) {
            r6 = this;
            r0 = 0
            if (r7 == 0) goto L47
            java.lang.String r1 = ""
            boolean r1 = r1.equals(r7)
            if (r1 == 0) goto Lc
            goto L47
        Lc:
            java.util.ArrayList<com.amap.api.maps.offlinemap.OfflineMapProvince> r1 = r6.a
            monitor-enter(r1)
            java.util.ArrayList<com.amap.api.maps.offlinemap.OfflineMapProvince> r2 = r6.a     // Catch: java.lang.Throwable -> L41
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L41
        L15:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L41
            if (r3 == 0) goto L43
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L41
            com.amap.api.maps.offlinemap.OfflineMapProvince r3 = (com.amap.api.maps.offlinemap.OfflineMapProvince) r3     // Catch: java.lang.Throwable -> L41
            java.util.ArrayList r3 = r3.getCityList()     // Catch: java.lang.Throwable -> L41
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L41
        L29:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L41
            if (r4 == 0) goto L15
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L41
            com.amap.api.maps.offlinemap.OfflineMapCity r4 = (com.amap.api.maps.offlinemap.OfflineMapCity) r4     // Catch: java.lang.Throwable -> L41
            java.lang.String r5 = r4.getCode()     // Catch: java.lang.Throwable -> L41
            boolean r5 = r5.equals(r7)     // Catch: java.lang.Throwable -> L41
            if (r5 == 0) goto L29
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L41
            return r4
        L41:
            r7 = move-exception
            goto L45
        L43:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L41
            return r0
        L45:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L41
            throw r7
        L47:
            return r0
    }

    public final java.util.ArrayList<com.amap.api.maps.offlinemap.OfflineMapProvince> b() {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList<com.amap.api.maps.offlinemap.OfflineMapProvince> r1 = r4.a
            monitor-enter(r1)
            java.util.ArrayList<com.amap.api.maps.offlinemap.OfflineMapProvince> r2 = r4.a     // Catch: java.lang.Throwable -> L1e
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L1e
        Le:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L1e
            if (r3 == 0) goto L20
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L1e
            com.amap.api.maps.offlinemap.OfflineMapProvince r3 = (com.amap.api.maps.offlinemap.OfflineMapProvince) r3     // Catch: java.lang.Throwable -> L1e
            r0.add(r3)     // Catch: java.lang.Throwable -> L1e
            goto Le
        L1e:
            r0 = move-exception
            goto L22
        L20:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1e
            return r0
        L22:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1e
            throw r0
    }

    public final void c(com.amap.api.col.p0003l.ax r9) {
            r8 = this;
            java.lang.String r0 = r9.getPinyin()
            java.util.ArrayList<com.amap.api.maps.offlinemap.OfflineMapProvince> r1 = r8.a
            monitor-enter(r1)
            java.util.ArrayList<com.amap.api.maps.offlinemap.OfflineMapProvince> r2 = r8.a     // Catch: java.lang.Throwable -> L48
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L48
        Ld:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L48
            if (r3 == 0) goto L4a
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L48
            com.amap.api.maps.offlinemap.OfflineMapProvince r3 = (com.amap.api.maps.offlinemap.OfflineMapProvince) r3     // Catch: java.lang.Throwable -> L48
            if (r3 == 0) goto Ld
            java.util.ArrayList r4 = r3.getCityList()     // Catch: java.lang.Throwable -> L48
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L48
        L23:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> L48
            if (r5 == 0) goto Ld
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> L48
            com.amap.api.maps.offlinemap.OfflineMapCity r5 = (com.amap.api.maps.offlinemap.OfflineMapCity) r5     // Catch: java.lang.Throwable -> L48
            java.lang.String r6 = r5.getPinyin()     // Catch: java.lang.Throwable -> L48
            java.lang.String r6 = r6.trim()     // Catch: java.lang.Throwable -> L48
            java.lang.String r7 = r0.trim()     // Catch: java.lang.Throwable -> L48
            boolean r6 = r6.equals(r7)     // Catch: java.lang.Throwable -> L48
            if (r6 == 0) goto L23
            r8.d(r9, r5)     // Catch: java.lang.Throwable -> L48
            r8.e(r9, r3)     // Catch: java.lang.Throwable -> L48
            goto L4a
        L48:
            r9 = move-exception
            goto L4c
        L4a:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L48
            return
        L4c:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L48
            throw r9
    }

    public final void i(java.util.List<com.amap.api.maps.offlinemap.OfflineMapProvince> r13) {
            r12 = this;
            java.util.ArrayList<com.amap.api.maps.offlinemap.OfflineMapProvince> r0 = r12.a
            monitor-enter(r0)
            java.util.ArrayList<com.amap.api.maps.offlinemap.OfflineMapProvince> r1 = r12.a     // Catch: java.lang.Throwable -> L62
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L62
            if (r1 <= 0) goto Lb9
            r1 = 0
            r2 = 0
        Ld:
            java.util.ArrayList<com.amap.api.maps.offlinemap.OfflineMapProvince> r3 = r12.a     // Catch: java.lang.Throwable -> L62
            int r3 = r3.size()     // Catch: java.lang.Throwable -> L62
            if (r2 >= r3) goto Lcf
            java.util.ArrayList<com.amap.api.maps.offlinemap.OfflineMapProvince> r3 = r12.a     // Catch: java.lang.Throwable -> L62
            java.lang.Object r3 = r3.get(r2)     // Catch: java.lang.Throwable -> L62
            com.amap.api.maps.offlinemap.OfflineMapProvince r3 = (com.amap.api.maps.offlinemap.OfflineMapProvince) r3     // Catch: java.lang.Throwable -> L62
            java.util.Iterator r4 = r13.iterator()     // Catch: java.lang.Throwable -> L62
        L21:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> L62
            r6 = 0
            if (r5 == 0) goto L72
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> L62
            com.amap.api.maps.offlinemap.OfflineMapProvince r5 = (com.amap.api.maps.offlinemap.OfflineMapProvince) r5     // Catch: java.lang.Throwable -> L62
            java.lang.String r7 = r3.getPinyin()     // Catch: java.lang.Throwable -> L62
            java.lang.String r8 = r5.getPinyin()     // Catch: java.lang.Throwable -> L62
            boolean r7 = r7.equals(r8)     // Catch: java.lang.Throwable -> L62
            if (r7 == 0) goto L3d
            goto L73
        L3d:
            java.lang.String r7 = r3.getPinyin()     // Catch: java.lang.Throwable -> L62
            java.lang.String r8 = "quanguogaiyaotu"
            boolean r7 = r7.equals(r8)     // Catch: java.lang.Throwable -> L62
            if (r7 != 0) goto L65
            java.lang.String r7 = r3.getProvinceCode()     // Catch: java.lang.Throwable -> L62
            java.lang.String r8 = "000001"
            boolean r7 = r7.equals(r8)     // Catch: java.lang.Throwable -> L62
            if (r7 != 0) goto L65
            java.lang.String r7 = r3.getProvinceCode()     // Catch: java.lang.Throwable -> L62
            java.lang.String r8 = "100000"
            boolean r7 = r7.equals(r8)     // Catch: java.lang.Throwable -> L62
            if (r7 == 0) goto L21
            goto L65
        L62:
            r13 = move-exception
            goto Ld1
        L65:
            java.lang.String r7 = r5.getPinyin()     // Catch: java.lang.Throwable -> L62
            java.lang.String r8 = "quanguogaiyaotu"
            boolean r7 = r7.equals(r8)     // Catch: java.lang.Throwable -> L62
            if (r7 == 0) goto L21
            goto L73
        L72:
            r5 = r6
        L73:
            if (r5 == 0) goto Lb5
            h(r3, r5)     // Catch: java.lang.Throwable -> L62
            java.util.ArrayList r3 = r3.getCityList()     // Catch: java.lang.Throwable -> L62
            java.util.ArrayList r4 = r5.getCityList()     // Catch: java.lang.Throwable -> L62
            r5 = 0
        L81:
            int r7 = r3.size()     // Catch: java.lang.Throwable -> L62
            if (r5 >= r7) goto Lb5
            java.lang.Object r7 = r3.get(r5)     // Catch: java.lang.Throwable -> L62
            com.amap.api.maps.offlinemap.OfflineMapCity r7 = (com.amap.api.maps.offlinemap.OfflineMapCity) r7     // Catch: java.lang.Throwable -> L62
            java.util.Iterator r8 = r4.iterator()     // Catch: java.lang.Throwable -> L62
        L91:
            boolean r9 = r8.hasNext()     // Catch: java.lang.Throwable -> L62
            if (r9 == 0) goto Lac
            java.lang.Object r9 = r8.next()     // Catch: java.lang.Throwable -> L62
            com.amap.api.maps.offlinemap.OfflineMapCity r9 = (com.amap.api.maps.offlinemap.OfflineMapCity) r9     // Catch: java.lang.Throwable -> L62
            java.lang.String r10 = r7.getPinyin()     // Catch: java.lang.Throwable -> L62
            java.lang.String r11 = r9.getPinyin()     // Catch: java.lang.Throwable -> L62
            boolean r10 = r10.equals(r11)     // Catch: java.lang.Throwable -> L62
            if (r10 == 0) goto L91
            goto Lad
        Lac:
            r9 = r6
        Lad:
            if (r9 == 0) goto Lb2
            g(r7, r9)     // Catch: java.lang.Throwable -> L62
        Lb2:
            int r5 = r5 + 1
            goto L81
        Lb5:
            int r2 = r2 + 1
            goto Ld
        Lb9:
            java.util.Iterator r13 = r13.iterator()     // Catch: java.lang.Throwable -> L62
        Lbd:
            boolean r1 = r13.hasNext()     // Catch: java.lang.Throwable -> L62
            if (r1 == 0) goto Lcf
            java.lang.Object r1 = r13.next()     // Catch: java.lang.Throwable -> L62
            com.amap.api.maps.offlinemap.OfflineMapProvince r1 = (com.amap.api.maps.offlinemap.OfflineMapProvince) r1     // Catch: java.lang.Throwable -> L62
            java.util.ArrayList<com.amap.api.maps.offlinemap.OfflineMapProvince> r2 = r12.a     // Catch: java.lang.Throwable -> L62
            r2.add(r1)     // Catch: java.lang.Throwable -> L62
            goto Lbd
        Lcf:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L62
            return
        Ld1:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L62
            throw r13
    }

    public final com.amap.api.maps.offlinemap.OfflineMapCity m(java.lang.String r8) {
            r7 = this;
            r0 = 0
            if (r8 == 0) goto L4f
            java.lang.String r1 = ""
            boolean r1 = r1.equals(r8)
            if (r1 == 0) goto Lc
            goto L4f
        Lc:
            java.util.ArrayList<com.amap.api.maps.offlinemap.OfflineMapProvince> r1 = r7.a
            monitor-enter(r1)
            java.util.ArrayList<com.amap.api.maps.offlinemap.OfflineMapProvince> r2 = r7.a     // Catch: java.lang.Throwable -> L49
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L49
        L15:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L49
            if (r3 == 0) goto L4b
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L49
            com.amap.api.maps.offlinemap.OfflineMapProvince r3 = (com.amap.api.maps.offlinemap.OfflineMapProvince) r3     // Catch: java.lang.Throwable -> L49
            java.util.ArrayList r3 = r3.getCityList()     // Catch: java.lang.Throwable -> L49
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L49
        L29:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L49
            if (r4 == 0) goto L15
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L49
            com.amap.api.maps.offlinemap.OfflineMapCity r4 = (com.amap.api.maps.offlinemap.OfflineMapCity) r4     // Catch: java.lang.Throwable -> L49
            java.lang.String r5 = r4.getCity()     // Catch: java.lang.Throwable -> L49
            java.lang.String r5 = r5.trim()     // Catch: java.lang.Throwable -> L49
            java.lang.String r6 = r8.trim()     // Catch: java.lang.Throwable -> L49
            boolean r5 = r5.equalsIgnoreCase(r6)     // Catch: java.lang.Throwable -> L49
            if (r5 == 0) goto L29
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L49
            return r4
        L49:
            r8 = move-exception
            goto L4d
        L4b:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L49
            return r0
        L4d:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L49
            throw r8
        L4f:
            return r0
    }

    public final java.util.ArrayList<com.amap.api.maps.offlinemap.OfflineMapCity> n() {
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList<com.amap.api.maps.offlinemap.OfflineMapProvince> r1 = r5.a
            monitor-enter(r1)
            java.util.ArrayList<com.amap.api.maps.offlinemap.OfflineMapProvince> r2 = r5.a     // Catch: java.lang.Throwable -> L32
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L32
        Le:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L32
            if (r3 == 0) goto L34
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L32
            com.amap.api.maps.offlinemap.OfflineMapProvince r3 = (com.amap.api.maps.offlinemap.OfflineMapProvince) r3     // Catch: java.lang.Throwable -> L32
            java.util.ArrayList r3 = r3.getCityList()     // Catch: java.lang.Throwable -> L32
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L32
        L22:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L32
            if (r4 == 0) goto Le
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L32
            com.amap.api.maps.offlinemap.OfflineMapCity r4 = (com.amap.api.maps.offlinemap.OfflineMapCity) r4     // Catch: java.lang.Throwable -> L32
            r0.add(r4)     // Catch: java.lang.Throwable -> L32
            goto L22
        L32:
            r0 = move-exception
            goto L36
        L34:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L32
            return r0
        L36:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L32
            throw r0
    }

    public final com.amap.api.maps.offlinemap.OfflineMapProvince r(java.lang.String r7) {
            r6 = this;
            r0 = 0
            if (r7 == 0) goto L3b
            java.lang.String r1 = ""
            boolean r1 = r1.equals(r7)
            if (r1 == 0) goto Lc
            goto L3b
        Lc:
            java.util.ArrayList<com.amap.api.maps.offlinemap.OfflineMapProvince> r1 = r6.a
            monitor-enter(r1)
            java.util.ArrayList<com.amap.api.maps.offlinemap.OfflineMapProvince> r2 = r6.a     // Catch: java.lang.Throwable -> L35
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L35
        L15:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L35
            if (r3 == 0) goto L37
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L35
            com.amap.api.maps.offlinemap.OfflineMapProvince r3 = (com.amap.api.maps.offlinemap.OfflineMapProvince) r3     // Catch: java.lang.Throwable -> L35
            java.lang.String r4 = r3.getProvinceName()     // Catch: java.lang.Throwable -> L35
            java.lang.String r4 = r4.trim()     // Catch: java.lang.Throwable -> L35
            java.lang.String r5 = r7.trim()     // Catch: java.lang.Throwable -> L35
            boolean r4 = r4.equalsIgnoreCase(r5)     // Catch: java.lang.Throwable -> L35
            if (r4 == 0) goto L15
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L35
            return r3
        L35:
            r7 = move-exception
            goto L39
        L37:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L35
            return r0
        L39:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L35
            throw r7
        L3b:
            return r0
    }

    public final java.util.ArrayList<com.amap.api.maps.offlinemap.OfflineMapCity> s() {
            r7 = this;
            java.util.ArrayList<com.amap.api.maps.offlinemap.OfflineMapProvince> r0 = r7.a
            monitor-enter(r0)
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L3f
            r1.<init>()     // Catch: java.lang.Throwable -> L3f
            java.util.ArrayList<com.amap.api.maps.offlinemap.OfflineMapProvince> r2 = r7.a     // Catch: java.lang.Throwable -> L3f
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L3f
        Le:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L3f
            if (r3 == 0) goto L45
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L3f
            com.amap.api.maps.offlinemap.OfflineMapProvince r3 = (com.amap.api.maps.offlinemap.OfflineMapProvince) r3     // Catch: java.lang.Throwable -> L3f
            if (r3 == 0) goto Le
            java.util.ArrayList r3 = r3.getCityList()     // Catch: java.lang.Throwable -> L3f
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L3f
        L24:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L3f
            if (r4 == 0) goto Le
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L3f
            com.amap.api.maps.offlinemap.OfflineMapCity r4 = (com.amap.api.maps.offlinemap.OfflineMapCity) r4     // Catch: java.lang.Throwable -> L3f
            int r5 = r4.getState()     // Catch: java.lang.Throwable -> L3f
            r6 = 4
            if (r5 == r6) goto L41
            int r5 = r4.getState()     // Catch: java.lang.Throwable -> L3f
            r6 = 7
            if (r5 != r6) goto L24
            goto L41
        L3f:
            r1 = move-exception
            goto L47
        L41:
            r1.add(r4)     // Catch: java.lang.Throwable -> L3f
            goto L24
        L45:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3f
            return r1
        L47:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3f
            throw r1
    }

    public final java.util.ArrayList<com.amap.api.maps.offlinemap.OfflineMapProvince> t() {
            r6 = this;
            java.util.ArrayList<com.amap.api.maps.offlinemap.OfflineMapProvince> r0 = r6.a
            monitor-enter(r0)
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L2b
            r1.<init>()     // Catch: java.lang.Throwable -> L2b
            java.util.ArrayList<com.amap.api.maps.offlinemap.OfflineMapProvince> r2 = r6.a     // Catch: java.lang.Throwable -> L2b
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L2b
        Le:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L2b
            if (r3 == 0) goto L31
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L2b
            com.amap.api.maps.offlinemap.OfflineMapProvince r3 = (com.amap.api.maps.offlinemap.OfflineMapProvince) r3     // Catch: java.lang.Throwable -> L2b
            if (r3 == 0) goto Le
            int r4 = r3.getState()     // Catch: java.lang.Throwable -> L2b
            r5 = 4
            if (r4 == r5) goto L2d
            int r4 = r3.getState()     // Catch: java.lang.Throwable -> L2b
            r5 = 7
            if (r4 != r5) goto Le
            goto L2d
        L2b:
            r1 = move-exception
            goto L33
        L2d:
            r1.add(r3)     // Catch: java.lang.Throwable -> L2b
            goto Le
        L31:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2b
            return r1
        L33:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2b
            throw r1
    }

    public final java.util.ArrayList<com.amap.api.maps.offlinemap.OfflineMapCity> u() {
            r6 = this;
            java.util.ArrayList<com.amap.api.maps.offlinemap.OfflineMapProvince> r0 = r6.a
            monitor-enter(r0)
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L3e
            r1.<init>()     // Catch: java.lang.Throwable -> L3e
            java.util.ArrayList<com.amap.api.maps.offlinemap.OfflineMapProvince> r2 = r6.a     // Catch: java.lang.Throwable -> L3e
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L3e
        Le:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L3e
            if (r3 == 0) goto L40
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L3e
            com.amap.api.maps.offlinemap.OfflineMapProvince r3 = (com.amap.api.maps.offlinemap.OfflineMapProvince) r3     // Catch: java.lang.Throwable -> L3e
            if (r3 == 0) goto Le
            java.util.ArrayList r3 = r3.getCityList()     // Catch: java.lang.Throwable -> L3e
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L3e
        L24:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L3e
            if (r4 == 0) goto Le
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L3e
            com.amap.api.maps.offlinemap.OfflineMapCity r4 = (com.amap.api.maps.offlinemap.OfflineMapCity) r4     // Catch: java.lang.Throwable -> L3e
            int r5 = r4.getState()     // Catch: java.lang.Throwable -> L3e
            boolean r5 = q(r5)     // Catch: java.lang.Throwable -> L3e
            if (r5 == 0) goto L24
            r1.add(r4)     // Catch: java.lang.Throwable -> L3e
            goto L24
        L3e:
            r1 = move-exception
            goto L42
        L40:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3e
            return r1
        L42:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3e
            throw r1
    }

    public final java.util.ArrayList<com.amap.api.maps.offlinemap.OfflineMapProvince> v() {
            r5 = this;
            java.util.ArrayList<com.amap.api.maps.offlinemap.OfflineMapProvince> r0 = r5.a
            monitor-enter(r0)
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L2a
            r1.<init>()     // Catch: java.lang.Throwable -> L2a
            java.util.ArrayList<com.amap.api.maps.offlinemap.OfflineMapProvince> r2 = r5.a     // Catch: java.lang.Throwable -> L2a
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L2a
        Le:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L2a
            if (r3 == 0) goto L2c
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L2a
            com.amap.api.maps.offlinemap.OfflineMapProvince r3 = (com.amap.api.maps.offlinemap.OfflineMapProvince) r3     // Catch: java.lang.Throwable -> L2a
            if (r3 == 0) goto Le
            int r4 = r3.getState()     // Catch: java.lang.Throwable -> L2a
            boolean r4 = q(r4)     // Catch: java.lang.Throwable -> L2a
            if (r4 == 0) goto Le
            r1.add(r3)     // Catch: java.lang.Throwable -> L2a
            goto Le
        L2a:
            r1 = move-exception
            goto L2e
        L2c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2a
            return r1
        L2e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2a
            throw r1
    }

    public final void w() {
            r1 = this;
            r1.x()
            r0 = 0
            r1.f3442b = r0
            r1.f3443c = r0
            return
    }
}

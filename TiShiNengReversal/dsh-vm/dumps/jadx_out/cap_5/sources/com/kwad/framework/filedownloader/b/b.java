package com.kwad.framework.filedownloader.b;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class b implements com.kwad.framework.filedownloader.b.a {
    final android.util.SparseArray<com.kwad.framework.filedownloader.d.c> amG;
    final android.util.SparseArray<java.util.List<com.kwad.framework.filedownloader.d.a>> amH;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements com.kwad.framework.filedownloader.b.a.InterfaceC0111a {
        final /* synthetic */ com.kwad.framework.filedownloader.b.b amI;

        a(com.kwad.framework.filedownloader.b.b r1) {
                r0 = this;
                r0.amI = r1
                r0.<init>()
                return
        }

        @Override // com.kwad.framework.filedownloader.b.a.InterfaceC0111a
        public final void a(int r1, com.kwad.framework.filedownloader.d.c r2) {
                r0 = this;
                return
        }

        @Override // com.kwad.framework.filedownloader.b.a.InterfaceC0111a
        public final void c(com.kwad.framework.filedownloader.d.c r1) {
                r0 = this;
                return
        }

        @Override // java.lang.Iterable
        public final java.util.Iterator<com.kwad.framework.filedownloader.d.c> iterator() {
                r2 = this;
                com.kwad.framework.filedownloader.b.b$b r0 = new com.kwad.framework.filedownloader.b.b$b
                com.kwad.framework.filedownloader.b.b r1 = r2.amI
                r0.<init>(r1)
                return r0
        }

        @Override // com.kwad.framework.filedownloader.b.a.InterfaceC0111a
        public final void xU() {
                r0 = this;
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.kwad.framework.filedownloader.b.b$b, reason: collision with other inner class name */
    class C0112b implements java.util.Iterator<com.kwad.framework.filedownloader.d.c> {
        final /* synthetic */ com.kwad.framework.filedownloader.b.b amI;

        C0112b(com.kwad.framework.filedownloader.b.b r1) {
                r0 = this;
                r0.amI = r1
                r0.<init>()
                return
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // java.util.Iterator
        public final /* bridge */ /* synthetic */ com.kwad.framework.filedownloader.d.c next() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // java.util.Iterator
        public final void remove() {
                r0 = this;
                return
        }
    }

    public b() {
            r1 = this;
            r1.<init>()
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r1.amG = r0
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r1.amH = r0
            return
    }

    private void d(com.kwad.framework.filedownloader.d.c r4) {
            r3 = this;
            android.util.SparseArray<com.kwad.framework.filedownloader.d.c> r0 = r3.amG
            monitor-enter(r0)
            android.util.SparseArray<com.kwad.framework.filedownloader.d.c> r1 = r3.amG     // Catch: java.lang.Throwable -> Le
            int r2 = r4.getId()     // Catch: java.lang.Throwable -> Le
            r1.put(r2, r4)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            return
        Le:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r4
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final void a(int r3, int r4, long r5) {
            r2 = this;
            android.util.SparseArray<java.util.List<com.kwad.framework.filedownloader.d.a>> r0 = r2.amH
            monitor-enter(r0)
            android.util.SparseArray<java.util.List<com.kwad.framework.filedownloader.d.a>> r1 = r2.amH     // Catch: java.lang.Throwable -> L29
            java.lang.Object r3 = r1.get(r3)     // Catch: java.lang.Throwable -> L29
            java.util.List r3 = (java.util.List) r3     // Catch: java.lang.Throwable -> L29
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L29
            if (r3 != 0) goto Lf
            goto L28
        Lf:
            java.util.Iterator r3 = r3.iterator()
        L13:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L28
            java.lang.Object r0 = r3.next()
            com.kwad.framework.filedownloader.d.a r0 = (com.kwad.framework.filedownloader.d.a) r0
            int r1 = r0.getIndex()
            if (r1 != r4) goto L13
            r0.X(r5)
        L28:
            return
        L29:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L29
            throw r3
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final void a(int r1, long r2, java.lang.String r4, java.lang.String r5) {
            r0 = this;
            return
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final void a(int r1, java.lang.String r2, long r3, long r5, int r7) {
            r0 = this;
            return
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final void a(int r1, java.lang.Throwable r2) {
            r0 = this;
            return
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final void a(int r1, java.lang.Throwable r2, long r3) {
            r0 = this;
            return
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final void a(com.kwad.framework.filedownloader.d.a r5) {
            r4 = this;
            int r0 = r5.getId()     // Catch: java.lang.Exception -> L25
            android.util.SparseArray<java.util.List<com.kwad.framework.filedownloader.d.a>> r1 = r4.amH     // Catch: java.lang.Exception -> L25
            monitor-enter(r1)     // Catch: java.lang.Exception -> L25
            android.util.SparseArray<java.util.List<com.kwad.framework.filedownloader.d.a>> r2 = r4.amH     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r2 = r2.get(r0)     // Catch: java.lang.Throwable -> L1c
            java.util.List r2 = (java.util.List) r2     // Catch: java.lang.Throwable -> L1c
            if (r2 != 0) goto L1e
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L1c
            r2.<init>()     // Catch: java.lang.Throwable -> L1c
            android.util.SparseArray<java.util.List<com.kwad.framework.filedownloader.d.a>> r3 = r4.amH     // Catch: java.lang.Throwable -> L1c
            r3.put(r0, r2)     // Catch: java.lang.Throwable -> L1c
            goto L1e
        L1c:
            r5 = move-exception
            goto L23
        L1e:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1c
            r2.add(r5)     // Catch: java.lang.Exception -> L25
            return
        L23:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1c
            throw r5     // Catch: java.lang.Exception -> L25
        L25:
            return
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final void b(int r1, long r2) {
            r0 = this;
            return
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final void b(com.kwad.framework.filedownloader.d.c r4) {
            r3 = this;
            if (r4 != 0) goto Lb
            java.lang.String r4 = "update but model == null!"
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            com.kwad.framework.filedownloader.f.d.d(r3, r4, r0)
            return
        Lb:
            int r0 = r4.getId()
            com.kwad.framework.filedownloader.d.c r0 = r3.bD(r0)
            if (r0 == 0) goto L2f
            android.util.SparseArray<com.kwad.framework.filedownloader.d.c> r0 = r3.amG
            monitor-enter(r0)
            android.util.SparseArray<com.kwad.framework.filedownloader.d.c> r1 = r3.amG     // Catch: java.lang.Throwable -> L2c
            int r2 = r4.getId()     // Catch: java.lang.Throwable -> L2c
            r1.remove(r2)     // Catch: java.lang.Throwable -> L2c
            android.util.SparseArray<com.kwad.framework.filedownloader.d.c> r1 = r3.amG     // Catch: java.lang.Throwable -> L2c
            int r2 = r4.getId()     // Catch: java.lang.Throwable -> L2c
            r1.put(r2, r4)     // Catch: java.lang.Throwable -> L2c
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2c
            return
        L2c:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2c
            throw r4
        L2f:
            r3.d(r4)
            return
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final void bC(int r1) {
            r0 = this;
            return
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final com.kwad.framework.filedownloader.d.c bD(int r3) {
            r2 = this;
            android.util.SparseArray<com.kwad.framework.filedownloader.d.c> r0 = r2.amG
            monitor-enter(r0)
            android.util.SparseArray<com.kwad.framework.filedownloader.d.c> r1 = r2.amG     // Catch: java.lang.Throwable -> Ld
            java.lang.Object r3 = r1.get(r3)     // Catch: java.lang.Throwable -> Ld
            com.kwad.framework.filedownloader.d.c r3 = (com.kwad.framework.filedownloader.d.c) r3     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            return r3
        Ld:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            throw r3
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final java.util.List<com.kwad.framework.filedownloader.d.a> bE(int r4) {
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Exception -> L1a
            r0.<init>()     // Catch: java.lang.Exception -> L1a
            android.util.SparseArray<java.util.List<com.kwad.framework.filedownloader.d.a>> r1 = r3.amH     // Catch: java.lang.Exception -> L1a
            monitor-enter(r1)     // Catch: java.lang.Exception -> L1a
            android.util.SparseArray<java.util.List<com.kwad.framework.filedownloader.d.a>> r2 = r3.amH     // Catch: java.lang.Throwable -> L17
            java.lang.Object r4 = r2.get(r4)     // Catch: java.lang.Throwable -> L17
            java.util.List r4 = (java.util.List) r4     // Catch: java.lang.Throwable -> L17
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L17
            if (r4 == 0) goto L16
            r0.addAll(r4)     // Catch: java.lang.Exception -> L1a
        L16:
            return r0
        L17:
            r4 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L17
            throw r4     // Catch: java.lang.Exception -> L1a
        L1a:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            return r4
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final void bF(int r3) {
            r2 = this;
            android.util.SparseArray<java.util.List<com.kwad.framework.filedownloader.d.a>> r0 = r2.amH     // Catch: java.lang.Exception -> Ld
            monitor-enter(r0)     // Catch: java.lang.Exception -> Ld
            android.util.SparseArray<java.util.List<com.kwad.framework.filedownloader.d.a>> r1 = r2.amH     // Catch: java.lang.Throwable -> La
            r1.remove(r3)     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return
        La:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r3     // Catch: java.lang.Exception -> Ld
        Ld:
            return
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final boolean bG(int r3) {
            r2 = this;
            android.util.SparseArray<com.kwad.framework.filedownloader.d.c> r0 = r2.amG
            monitor-enter(r0)
            android.util.SparseArray<com.kwad.framework.filedownloader.d.c> r1 = r2.amG     // Catch: java.lang.Throwable -> Lb
            r1.remove(r3)     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            r3 = 1
            return r3
        Lb:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r3
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final void bH(int r1) {
            r0 = this;
            return
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final void c(int r1, long r2) {
            r0 = this;
            r0.bG(r1)
            return
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final void clear() {
            r2 = this;
            android.util.SparseArray<com.kwad.framework.filedownloader.d.c> r0 = r2.amG
            monitor-enter(r0)
            android.util.SparseArray<com.kwad.framework.filedownloader.d.c> r1 = r2.amG     // Catch: java.lang.Throwable -> La
            r1.clear()     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return
        La:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r1
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final void d(int r1, long r2) {
            r0 = this;
            return
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final void t(int r1, int r2) {
            r0 = this;
            return
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final com.kwad.framework.filedownloader.b.a.InterfaceC0111a xT() {
            r1 = this;
            com.kwad.framework.filedownloader.b.b$a r0 = new com.kwad.framework.filedownloader.b.b$a
            r0.<init>(r1)
            return r0
    }
}

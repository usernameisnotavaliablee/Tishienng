package com.beizi.ad.internal.i.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
abstract class e implements com.beizi.ad.internal.i.a.a {
    private final java.util.concurrent.ExecutorService a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class a implements java.util.concurrent.Callable<java.lang.Void> {
        final /* synthetic */ com.beizi.ad.internal.i.a.e a;

        /* renamed from: b, reason: collision with root package name */
        private final java.io.File f6956b;

        public a(com.beizi.ad.internal.i.a.e r1, java.io.File r2) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                r0.f6956b = r2
                return
        }

        public java.lang.Void a() throws java.lang.Exception {
                r2 = this;
                com.beizi.ad.internal.i.a.e r0 = r2.a
                java.io.File r1 = r2.f6956b
                com.beizi.ad.internal.i.a.e.a(r0, r1)
                r0 = 0
                return r0
        }

        @Override // java.util.concurrent.Callable
        public /* synthetic */ java.lang.Void call() throws java.lang.Exception {
                r1 = this;
                java.lang.Void r0 = r1.a()
                return r0
        }
    }

    e() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newSingleThreadExecutor()
            r1.a = r0
            return
    }

    static /* synthetic */ void a(com.beizi.ad.internal.i.a.e r0, java.io.File r1) throws java.io.IOException {
            r0.b(r1)
            return
    }

    private void a(java.util.List<java.io.File> r7) {
            r6 = this;
            long r0 = r6.b(r7)
            int r2 = r7.size()
            java.util.Iterator r7 = r7.iterator()
        Lc:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L2c
            java.lang.Object r3 = r7.next()
            java.io.File r3 = (java.io.File) r3
            boolean r4 = r6.a(r3, r0, r2)
            if (r4 != 0) goto Lc
            long r4 = r3.length()
            boolean r3 = r3.delete()
            if (r3 == 0) goto Lc
            int r2 = r2 + (-1)
            long r0 = r0 - r4
            goto Lc
        L2c:
            return
    }

    private long b(java.util.List<java.io.File> r5) {
            r4 = this;
            java.util.Iterator r5 = r5.iterator()
            r0 = 0
        L6:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L18
            java.lang.Object r2 = r5.next()
            java.io.File r2 = (java.io.File) r2
            long r2 = r2.length()
            long r0 = r0 + r2
            goto L6
        L18:
            return r0
    }

    private void b(java.io.File r1) throws java.io.IOException {
            r0 = this;
            com.beizi.ad.internal.i.a.d.c(r1)
            java.io.File r1 = r1.getParentFile()
            java.util.List r1 = com.beizi.ad.internal.i.a.d.b(r1)
            r0.a(r1)
            return
    }

    @Override // com.beizi.ad.internal.i.a.a
    public void a(java.io.File r3) throws java.io.IOException {
            r2 = this;
            java.util.concurrent.ExecutorService r0 = r2.a
            com.beizi.ad.internal.i.a.e$a r1 = new com.beizi.ad.internal.i.a.e$a
            r1.<init>(r2, r3)
            r0.submit(r1)
            return
    }

    protected abstract boolean a(java.io.File r1, long r2, int r4);
}

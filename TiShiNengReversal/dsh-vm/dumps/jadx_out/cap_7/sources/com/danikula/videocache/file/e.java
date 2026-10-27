package com.danikula.videocache.file;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public abstract class e implements com.danikula.videocache.file.a {
    private static final org.slf4j.c b = null;
    private final java.util.concurrent.ExecutorService a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class a implements java.util.concurrent.Callable<java.lang.Void> {
        private final java.io.File a;
        final /* synthetic */ com.danikula.videocache.file.e b;

        public a(com.danikula.videocache.file.e r1, java.io.File r2) {
                r0 = this;
                r0.b = r1
                r0.<init>()
                r0.a = r2
                return
        }

        @Override // java.util.concurrent.Callable
        public /* bridge */ /* synthetic */ java.lang.Void call() throws java.lang.Exception {
                r1 = this;
                java.lang.Void r0 = r1.call2()
                return r0
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: call, reason: avoid collision after fix types in other method */
        public java.lang.Void call2() throws java.lang.Exception {
                r2 = this;
                com.danikula.videocache.file.e r0 = r2.b
                java.io.File r1 = r2.a
                com.danikula.videocache.file.e.c(r0, r1)
                r0 = 0
                return r0
        }
    }

    static {
            java.lang.String r0 = "LruDiskUsage"
            org.slf4j.c r0 = org.slf4j.d.j(r0)
            com.danikula.videocache.file.e.b = r0
            return
    }

    public e() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newSingleThreadExecutor()
            r1.a = r0
            return
    }

    static /* synthetic */ void c(com.danikula.videocache.file.e r0, java.io.File r1) throws java.io.IOException {
            r0.e(r1)
            return
    }

    private long d(java.util.List<java.io.File> r5) {
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

    private void e(java.io.File r1) throws java.io.IOException {
            r0 = this;
            com.danikula.videocache.file.d.e(r1)
            java.io.File r1 = r1.getParentFile()
            java.util.List r1 = com.danikula.videocache.file.d.a(r1)
            r0.f(r1)
            return
    }

    private void f(java.util.List<java.io.File> r8) {
            r7 = this;
            long r0 = r7.d(r8)
            int r2 = r8.size()
            java.util.Iterator r8 = r8.iterator()
        Lc:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto L63
            java.lang.Object r3 = r8.next()
            java.io.File r3 = (java.io.File) r3
            boolean r4 = r7.b(r3, r0, r2)
            if (r4 != 0) goto Lc
            long r4 = r3.length()
            boolean r6 = r3.delete()
            if (r6 == 0) goto L47
            int r2 = r2 + (-1)
            long r0 = r0 - r4
            org.slf4j.c r4 = com.danikula.videocache.file.e.b
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Cache file "
            r5.append(r6)
            r5.append(r3)
            java.lang.String r3 = " is deleted because it exceeds cache limit"
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r4.info(r3)
            goto Lc
        L47:
            org.slf4j.c r4 = com.danikula.videocache.file.e.b
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Error deleting file "
            r5.append(r6)
            r5.append(r3)
            java.lang.String r3 = " for trimming cache"
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r4.error(r3)
            goto Lc
        L63:
            return
    }

    @Override // com.danikula.videocache.file.a
    public void a(java.io.File r3) throws java.io.IOException {
            r2 = this;
            java.util.concurrent.ExecutorService r0 = r2.a
            com.danikula.videocache.file.e$a r1 = new com.danikula.videocache.file.e$a
            r1.<init>(r2, r3)
            r0.submit(r1)
            return
    }

    protected abstract boolean b(java.io.File r1, long r2, int r4);
}

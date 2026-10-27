package com.beizi.ad.internal.i;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
class j {
    private final java.util.concurrent.ExecutorService a;

    /* renamed from: b, reason: collision with root package name */
    private final java.lang.String f6987b;

    /* renamed from: c, reason: collision with root package name */
    private final int f6988c;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.beizi.ad.internal.i.j$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class a implements java.util.concurrent.Callable<java.lang.Boolean> {
        final /* synthetic */ com.beizi.ad.internal.i.j a;

        private a(com.beizi.ad.internal.i.j r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        /* synthetic */ a(com.beizi.ad.internal.i.j r1, com.beizi.ad.internal.i.j.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public java.lang.Boolean a() throws java.lang.Exception {
                r1 = this;
                com.beizi.ad.internal.i.j r0 = r1.a
                boolean r0 = com.beizi.ad.internal.i.j.a(r0)
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                return r0
        }

        @Override // java.util.concurrent.Callable
        public /* synthetic */ java.lang.Boolean call() throws java.lang.Exception {
                r1 = this;
                java.lang.Boolean r0 = r1.a()
                return r0
        }
    }

    j(java.lang.String r2, int r3) {
            r1 = this;
            r1.<init>()
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newSingleThreadExecutor()
            r1.a = r0
            java.lang.Object r2 = com.beizi.ad.internal.i.k.a(r2)
            java.lang.String r2 = (java.lang.String) r2
            r1.f6987b = r2
            r1.f6988c = r3
            return
    }

    private boolean a() throws com.beizi.ad.internal.i.m {
            r4 = this;
            java.lang.String r0 = r4.b()
            com.beizi.ad.internal.i.h r1 = new com.beizi.ad.internal.i.h
            r1.<init>(r0)
            r0 = 0
            java.lang.String r2 = "ping ok"
            byte[] r2 = r2.getBytes()     // Catch: java.lang.Throwable -> L21 com.beizi.ad.internal.i.m -> L26
            r1.a(r0)     // Catch: java.lang.Throwable -> L21 com.beizi.ad.internal.i.m -> L26
            int r3 = r2.length     // Catch: java.lang.Throwable -> L21 com.beizi.ad.internal.i.m -> L26
            byte[] r3 = new byte[r3]     // Catch: java.lang.Throwable -> L21 com.beizi.ad.internal.i.m -> L26
            r1.a(r3)     // Catch: java.lang.Throwable -> L21 com.beizi.ad.internal.i.m -> L26
            boolean r0 = java.util.Arrays.equals(r2, r3)     // Catch: java.lang.Throwable -> L21 com.beizi.ad.internal.i.m -> L26
            r1.b()
            return r0
        L21:
            r0 = move-exception
            r1.b()
            throw r0
        L26:
            r1.b()
            return r0
    }

    static /* synthetic */ boolean a(com.beizi.ad.internal.i.j r0) throws com.beizi.ad.internal.i.m {
            boolean r0 = r0.a()
            return r0
    }

    private java.lang.String b() {
            r6 = this;
            java.lang.String r0 = "aHR0cDovLyVzOiVkLyVz"
            java.lang.String r0 = com.beizi.ad.lance.a.b.b(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto Le
            r0 = 0
            return r0
        Le:
            java.util.Locale r1 = java.util.Locale.US
            java.lang.String r2 = r6.f6987b
            int r3 = r6.f6988c
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r5 = 0
            r4[r5] = r2
            r2 = 1
            r4[r2] = r3
            java.lang.String r2 = "ping"
            r3 = 2
            r4[r3] = r2
            java.lang.String r0 = java.lang.String.format(r1, r0, r4)
            return r0
    }

    void a(java.net.Socket r2) throws java.io.IOException {
            r1 = this;
            java.io.OutputStream r2 = r2.getOutputStream()
            java.lang.String r0 = "HTTP/1.1 200 OK\n\n"
            byte[] r0 = r0.getBytes()
            r2.write(r0)
            java.lang.String r0 = "ping ok"
            byte[] r0 = r0.getBytes()
            r2.write(r0)
            return
    }

    boolean a(int r8, int r9) {
            r7 = this;
            r0 = 0
            r1 = 1
            if (r8 < r1) goto L6
            r2 = 1
            goto L7
        L6:
            r2 = 0
        L7:
            com.beizi.ad.internal.i.k.a(r2)
            if (r9 <= 0) goto Le
            r2 = 1
            goto Lf
        Le:
            r2 = 0
        Lf:
            com.beizi.ad.internal.i.k.a(r2)
            r2 = 0
        L13:
            if (r2 >= r8) goto L36
            java.util.concurrent.ExecutorService r3 = r7.a     // Catch: java.lang.Throwable -> L31
            com.beizi.ad.internal.i.j$a r4 = new com.beizi.ad.internal.i.j$a     // Catch: java.lang.Throwable -> L31
            r5 = 0
            r4.<init>(r7, r5)     // Catch: java.lang.Throwable -> L31
            java.util.concurrent.Future r3 = r3.submit(r4)     // Catch: java.lang.Throwable -> L31
            long r4 = (long) r9     // Catch: java.lang.Throwable -> L31
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> L31
            java.lang.Object r3 = r3.get(r4, r6)     // Catch: java.lang.Throwable -> L31
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> L31
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> L31
            if (r3 == 0) goto L31
            return r1
        L31:
            int r2 = r2 + 1
            int r9 = r9 * 2
            goto L13
        L36:
            return r0
    }

    boolean a(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "ping"
            boolean r2 = r0.equals(r2)
            return r2
    }
}

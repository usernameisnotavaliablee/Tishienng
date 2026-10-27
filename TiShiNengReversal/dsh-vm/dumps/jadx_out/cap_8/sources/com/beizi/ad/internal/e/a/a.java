package com.beizi.ad.internal.e.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class a {
    public com.beizi.ad.internal.f.c a;

    /* renamed from: b, reason: collision with root package name */
    com.beizi.ad.internal.f f6734b;

    /* renamed from: c, reason: collision with root package name */
    com.beizi.ad.internal.d.a f6735c;

    /* renamed from: d, reason: collision with root package name */
    boolean f6736d;

    /* renamed from: e, reason: collision with root package name */
    boolean f6737e;

    /* renamed from: f, reason: collision with root package name */
    int f6738f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f6739g;

    /* renamed from: h, reason: collision with root package name */
    private final android.os.Handler f6740h;

    /* renamed from: i, reason: collision with root package name */
    private long f6741i;

    /* renamed from: j, reason: collision with root package name */
    private long f6742j;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.beizi.ad.internal.e.a.a$1, reason: invalid class name */
    class AnonymousClass1 implements com.beizi.ad.internal.f.b {
        final /* synthetic */ com.beizi.ad.i a;

        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }

        @Override // com.beizi.ad.internal.f.b
        public com.beizi.ad.internal.k a() {
                r1 = this;
                com.beizi.ad.internal.k r0 = com.beizi.ad.internal.k.f7005g
                return r0
        }

        @Override // com.beizi.ad.internal.f.b
        public boolean b() {
                r1 = this;
                r0 = 1
                return r0
        }

        @Override // com.beizi.ad.internal.f.b
        public com.beizi.ad.internal.view.c c() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // com.beizi.ad.internal.f.b
        public com.beizi.ad.i d() {
                r1 = this;
                com.beizi.ad.i r0 = r1.a
                return r0
        }

        @Override // com.beizi.ad.internal.f.b
        public java.lang.String e() {
                r1 = this;
                java.lang.String r0 = ""
                return r0
        }

        @Override // com.beizi.ad.internal.f.b
        public java.lang.String f() {
                r1 = this;
                com.beizi.ad.i r0 = r1.a
                java.lang.String r0 = r0.f()
                return r0
        }

        @Override // com.beizi.ad.internal.f.b
        public java.lang.String g() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // com.beizi.ad.internal.f.b
        public void h() {
                r1 = this;
                com.beizi.ad.i r0 = r1.a
                r0.h()
                return
        }

        @Override // com.beizi.ad.internal.f.b
        public boolean i() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // com.beizi.ad.internal.f.b
        public com.beizi.ad.internal.f.c j() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // com.beizi.ad.internal.f.b
        public java.lang.String k() {
                r1 = this;
                r0 = 0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.beizi.ad.internal.e.a.a$a, reason: collision with other inner class name */
    private class AsyncTaskC0103a extends com.beizi.ad.internal.h.d {
        com.beizi.ad.internal.f a;

        /* renamed from: b, reason: collision with root package name */
        final int f6743b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.beizi.ad.internal.e.a.a f6744c;

        /* renamed from: d, reason: collision with root package name */
        private final java.lang.String f6745d;

        /* renamed from: e, reason: collision with root package name */
        private final java.util.HashMap<java.lang.String, java.lang.Object> f6746e;

        /* renamed from: f, reason: collision with root package name */
        private final boolean f6747f;

        /* renamed from: g, reason: collision with root package name */
        private final long f6748g;

        /* renamed from: h, reason: collision with root package name */
        private final long f6749h;

        private AsyncTaskC0103a(com.beizi.ad.internal.e.a.a r1, com.beizi.ad.internal.f r2, java.lang.String r3, int r4, java.util.HashMap<java.lang.String, java.lang.Object> r5, boolean r6, long r7, long r9) {
                r0 = this;
                r0.f6744c = r1
                r1 = 1
                r0.<init>(r1, r1)
                r0.a = r2
                r0.f6745d = r3
                r0.f6743b = r4
                r0.f6746e = r5
                r0.f6747f = r6
                r0.f6748g = r7
                r0.f6749h = r9
                return
        }

        /* synthetic */ AsyncTaskC0103a(com.beizi.ad.internal.e.a.a r1, com.beizi.ad.internal.f r2, java.lang.String r3, int r4, java.util.HashMap r5, boolean r6, long r7, long r9, com.beizi.ad.internal.e.a.a.AnonymousClass1 r11) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r9)
                return
        }

        @Override // com.beizi.ad.internal.h.d
        protected java.lang.String a() {
                r6 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = r6.f6745d
                r0.<init>(r1)
                java.lang.String r1 = "&reason="
                r0.append(r1)
                int r1 = r6.f6743b
                r0.append(r1)
                java.lang.String r1 = "&uid="
                r0.append(r1)
                com.beizi.ad.internal.h.a r1 = com.beizi.ad.internal.h.a.a()
                java.lang.String r1 = r1.d()
                java.lang.String r1 = android.net.Uri.encode(r1)
                r0.append(r1)
                long r1 = r6.f6748g
                r3 = 0
                int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r5 <= 0) goto L3f
                java.lang.String r1 = "&latency="
                r0.append(r1)
                long r1 = r6.f6748g
                java.lang.String r1 = java.lang.String.valueOf(r1)
                java.lang.String r1 = android.net.Uri.encode(r1)
                r0.append(r1)
            L3f:
                long r1 = r6.f6749h
                int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r5 <= 0) goto L57
                java.lang.String r1 = "&total_latency="
                r0.append(r1)
                long r1 = r6.f6749h
                java.lang.String r1 = java.lang.String.valueOf(r1)
                java.lang.String r1 = android.net.Uri.encode(r1)
                r0.append(r1)
            L57:
                java.lang.String r0 = r0.toString()
                return r0
        }

        @Override // com.beizi.ad.internal.h.d
        protected void a(com.beizi.ad.internal.h.e r4) {
                r3 = this;
                boolean r0 = r3.f6747f
                if (r0 == 0) goto L5
                goto L9
            L5:
                com.beizi.ad.internal.f r0 = r3.a
                if (r0 != 0) goto La
            L9:
                return
            La:
                if (r4 == 0) goto L2d
                boolean r1 = r4.a()
                if (r1 == 0) goto L2d
                com.beizi.ad.internal.f.c r1 = new com.beizi.ad.internal.f.c
                com.beizi.ad.internal.k r2 = com.beizi.ad.internal.k.f7005g
                r1.<init>(r4, r2)
                java.util.HashMap<java.lang.String, java.lang.Object> r4 = r3.f6746e
                java.lang.String r2 = "ORIENTATION"
                boolean r4 = r4.containsKey(r2)
                if (r4 == 0) goto L2e
                java.util.HashMap<java.lang.String, java.lang.Object> r4 = r3.f6746e
                java.lang.Object r4 = r4.get(r2)
                r1.a(r2, r4)
                goto L2e
            L2d:
                r1 = 0
            L2e:
                r0.a(r1)
                return
        }

        @Override // com.beizi.ad.internal.h.d, android.os.AsyncTask
        protected /* synthetic */ void onPostExecute(com.beizi.ad.internal.h.e r1) {
                r0 = this;
                com.beizi.ad.internal.h.e r1 = (com.beizi.ad.internal.h.e) r1
                r0.a(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class b extends android.os.Handler {
        java.lang.ref.WeakReference<com.beizi.ad.internal.e.a.a> a;

        public b(com.beizi.ad.internal.e.a.a r2) {
                r1 = this;
                r1.<init>()
                java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                r0.<init>(r2)
                r1.a = r0
                return
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message r3) {
                r2 = this;
                java.lang.ref.WeakReference<com.beizi.ad.internal.e.a.a> r3 = r2.a
                java.lang.Object r3 = r3.get()
                com.beizi.ad.internal.e.a.a r3 = (com.beizi.ad.internal.e.a.a) r3
                if (r3 == 0) goto L1d
                boolean r0 = r3.f6737e
                if (r0 == 0) goto Lf
                goto L1d
            Lf:
                r0 = 0
                r1 = 0
                r3.a(r0)     // Catch: java.lang.Throwable -> L17 java.lang.IllegalArgumentException -> L1b
                r3.f6735c = r1
                return
            L17:
                r0 = move-exception
                r3.f6735c = r1
                throw r0
            L1b:
                r3.f6735c = r1
            L1d:
                return
        }
    }

    private a(com.beizi.ad.internal.d.a r7, com.beizi.ad.internal.f r8, com.beizi.ad.internal.f.c r9) {
            r6 = this;
            r6.<init>()
            r0 = 0
            r6.f6736d = r0
            r6.f6737e = r0
            r6.f6739g = r0
            com.beizi.ad.internal.e.a.a$b r0 = new com.beizi.ad.internal.e.a.a$b
            r0.<init>(r6)
            r6.f6740h = r0
            r0 = -1
            r6.f6741i = r0
            r6.f6742j = r0
            if (r7 != 0) goto L1f
            r7 = 3
            r6.f6738f = r7
            r4 = r6
            goto La4
        L1f:
            r6.f6734b = r8
            r6.f6735c = r7
            r6.a = r9
            r6.b()
            r6.d()
            java.lang.String r9 = r7.a()     // Catch: java.lang.IllegalAccessException -> L69 java.lang.InstantiationException -> L6c java.lang.LinkageError -> L6f java.lang.ClassCastException -> L72 java.lang.ClassNotFoundException -> L75
            java.lang.Class r9 = java.lang.Class.forName(r9)     // Catch: java.lang.IllegalAccessException -> L69 java.lang.InstantiationException -> L6c java.lang.LinkageError -> L6f java.lang.ClassCastException -> L72 java.lang.ClassNotFoundException -> L75
            java.lang.Object r9 = r9.newInstance()     // Catch: java.lang.IllegalAccessException -> L69 java.lang.InstantiationException -> L6c java.lang.LinkageError -> L6f java.lang.ClassCastException -> L72 java.lang.ClassNotFoundException -> L75
            r0 = r9
            com.beizi.ad.internal.e.a.b r0 = (com.beizi.ad.internal.e.a.b) r0     // Catch: java.lang.IllegalAccessException -> L69 java.lang.InstantiationException -> L6c java.lang.LinkageError -> L6f java.lang.ClassCastException -> L72 java.lang.ClassNotFoundException -> L75
            com.beizi.ad.internal.e r9 = r8.c()     // Catch: java.lang.IllegalAccessException -> L69 java.lang.InstantiationException -> L6c java.lang.LinkageError -> L6f java.lang.ClassCastException -> L72 java.lang.ClassNotFoundException -> L75
            if (r9 == 0) goto L78
            com.beizi.ad.internal.e r9 = r8.c()     // Catch: java.lang.IllegalAccessException -> L69 java.lang.InstantiationException -> L6c java.lang.LinkageError -> L6f java.lang.ClassCastException -> L72 java.lang.ClassNotFoundException -> L75
            android.content.Context r1 = r9.b()     // Catch: java.lang.IllegalAccessException -> L69 java.lang.InstantiationException -> L6c java.lang.LinkageError -> L6f java.lang.ClassCastException -> L72 java.lang.ClassNotFoundException -> L75
            java.lang.String r2 = r7.e()     // Catch: java.lang.IllegalAccessException -> L69 java.lang.InstantiationException -> L6c java.lang.LinkageError -> L6f java.lang.ClassCastException -> L72 java.lang.ClassNotFoundException -> L75
            java.lang.String r3 = r7.b()     // Catch: java.lang.IllegalAccessException -> L69 java.lang.InstantiationException -> L6c java.lang.LinkageError -> L6f java.lang.ClassCastException -> L72 java.lang.ClassNotFoundException -> L75
            com.beizi.ad.b.a r5 = r8.d()     // Catch: java.lang.IllegalAccessException -> L69 java.lang.InstantiationException -> L6c java.lang.LinkageError -> L6f java.lang.ClassCastException -> L72 java.lang.ClassNotFoundException -> L75
            r4 = r6
            r0.a(r1, r2, r3, r4, r5)     // Catch: java.lang.IllegalAccessException -> L5a java.lang.InstantiationException -> L5d java.lang.LinkageError -> L60 java.lang.ClassCastException -> L63 java.lang.ClassNotFoundException -> L66
            goto La4
        L5a:
            r0 = move-exception
        L5b:
            r8 = r0
            goto L7d
        L5d:
            r0 = move-exception
        L5e:
            r8 = r0
            goto L85
        L60:
            r0 = move-exception
        L61:
            r8 = r0
            goto L8d
        L63:
            r0 = move-exception
        L64:
            r8 = r0
            goto L95
        L66:
            r0 = move-exception
        L67:
            r8 = r0
            goto L9d
        L69:
            r0 = move-exception
            r4 = r6
            goto L5b
        L6c:
            r0 = move-exception
            r4 = r6
            goto L5e
        L6f:
            r0 = move-exception
            r4 = r6
            goto L61
        L72:
            r0 = move-exception
            r4 = r6
            goto L64
        L75:
            r0 = move-exception
            r4 = r6
            goto L67
        L78:
            r4 = r6
            r8 = 1
            r4.f6738f = r8     // Catch: java.lang.IllegalAccessException -> L5a java.lang.InstantiationException -> L5d java.lang.LinkageError -> L60 java.lang.ClassCastException -> L63 java.lang.ClassNotFoundException -> L66
            goto La4
        L7d:
            java.lang.String r7 = r7.a()
            r6.a(r8, r7)
            goto La4
        L85:
            java.lang.String r7 = r7.a()
            r6.a(r8, r7)
            goto La4
        L8d:
            java.lang.String r7 = r7.a()
            r6.a(r8, r7)
            goto La4
        L95:
            java.lang.String r7 = r7.a()
            r6.a(r8, r7)
            goto La4
        L9d:
            java.lang.String r7 = r7.a()
            r6.a(r8, r7)
        La4:
            int r7 = r4.f6738f
            r8 = -1
            if (r7 == r8) goto Lac
            r6.a(r7)
        Lac:
            return
    }

    private long a(com.beizi.ad.internal.f r6) {
            r5 = this;
            if (r6 == 0) goto Lf
            long r0 = r5.f6742j
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto Lf
            long r0 = r6.a(r0)
            return r0
        Lf:
            r0 = -1
            return r0
    }

    public static com.beizi.ad.internal.e.a.a a(com.beizi.ad.internal.d.a r1, com.beizi.ad.internal.f r2, com.beizi.ad.internal.f.c r3) {
            com.beizi.ad.internal.e.a.a r0 = new com.beizi.ad.internal.e.a.a
            r0.<init>(r1, r2, r3)
            return r0
    }

    private void a(java.lang.Throwable r2, java.lang.String r3) {
            r1 = this;
            boolean r2 = com.beizi.ad.internal.h.o.a(r3)
            if (r2 != 0) goto Lf
            com.beizi.ad.internal.h r2 = com.beizi.ad.internal.h.a()
            com.beizi.ad.internal.k r0 = com.beizi.ad.internal.k.f7005g
            r2.a(r0, r3)
        Lf:
            r2 = 3
            r1.f6738f = r2
            return
    }

    @android.annotation.SuppressLint({"InlinedApi", "NewApi"})
    private void b(int r16) {
            r15 = this;
            r4 = r16
            boolean r0 = r15.f6737e
            if (r0 == 0) goto L8
            goto L70
        L8:
            com.beizi.ad.internal.f r2 = r15.f6734b
            com.beizi.ad.internal.d.a r0 = r15.f6735c
            r12 = 0
            r13 = -1
            if (r0 == 0) goto L6b
            java.lang.String r0 = r0.f()
            boolean r0 = com.beizi.ad.internal.h.o.a(r0)
            if (r0 == 0) goto L1b
            goto L6b
        L1b:
            r0 = 1
            r14 = 0
            if (r2 == 0) goto L31
            java.util.LinkedList r1 = r2.b()
            if (r1 == 0) goto L31
            java.util.LinkedList r1 = r2.b()
            int r1 = r1.size()
            if (r1 <= 0) goto L31
            r1 = 1
            goto L32
        L31:
            r1 = 0
        L32:
            if (r4 != r13) goto L36
            r6 = 1
            goto L37
        L36:
            r6 = r1
        L37:
            com.beizi.ad.internal.e.a.a$a r0 = new com.beizi.ad.internal.e.a.a$a
            com.beizi.ad.internal.d.a r1 = r15.f6735c
            java.lang.String r3 = r1.f()
            com.beizi.ad.internal.d.a r1 = r15.f6735c
            java.util.HashMap r5 = r1.g()
            long r7 = r15.f()
            long r9 = r15.a(r2)
            r11 = 0
            r1 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r9, r11)
            com.beizi.ad.lance.a.c r1 = com.beizi.ad.lance.a.c.b()     // Catch: java.lang.Throwable -> L60
            java.util.concurrent.ExecutorService r1 = r1.f()     // Catch: java.lang.Throwable -> L60
            java.lang.Void[] r3 = new java.lang.Void[r14]     // Catch: java.lang.Throwable -> L60
            r0.executeOnExecutor(r1, r3)     // Catch: java.lang.Throwable -> L60
            goto L61
        L60:
        L61:
            if (r6 == 0) goto L70
            if (r4 == r13) goto L70
            if (r2 == 0) goto L70
            r2.a(r12)
            goto L70
        L6b:
            if (r4 != r13) goto L6e
            goto L70
        L6e:
            if (r2 != 0) goto L71
        L70:
            return
        L71:
            r2.a(r12)
            return
    }

    private long f() {
            r7 = this;
            long r0 = r7.f6741i
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L10
            long r4 = r7.f6742j
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 <= 0) goto L10
            long r4 = r4 - r0
            return r4
        L10:
            r0 = -1
            return r0
    }

    protected void a() {
            r1 = this;
            r0 = 0
            r1.f6735c = r0
            return
    }

    public void a(int r2) {
            r1 = this;
            boolean r0 = r1.f6736d
            if (r0 != 0) goto L18
            boolean r0 = r1.f6737e
            if (r0 == 0) goto L9
            goto L18
        L9:
            r1.e()
            r1.c()
            r1.b(r2)
            r2 = 1
            r1.f6737e = r2
            r1.a()
        L18:
            return
    }

    public void a(boolean r1) {
            r0 = this;
            r0.f6739g = r1
            if (r1 == 0) goto L7
            r0.a()
        L7:
            return
    }

    void b() {
            r4 = this;
            boolean r0 = r4.f6736d
            if (r0 != 0) goto L11
            boolean r0 = r4.f6737e
            if (r0 == 0) goto L9
            goto L11
        L9:
            android.os.Handler r0 = r4.f6740h
            r1 = 0
            r2 = 15000(0x3a98, double:7.411E-320)
            r0.sendEmptyMessageDelayed(r1, r2)
        L11:
            return
    }

    void c() {
            r2 = this;
            android.os.Handler r0 = r2.f6740h
            r1 = 0
            r0.removeMessages(r1)
            return
    }

    protected void d() {
            r2 = this;
            long r0 = java.lang.System.currentTimeMillis()
            r2.f6741i = r0
            return
    }

    protected void e() {
            r2 = this;
            long r0 = java.lang.System.currentTimeMillis()
            r2.f6742j = r0
            return
    }
}

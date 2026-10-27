package com.beizi.ad.internal.d;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class b {

    /* renamed from: j, reason: collision with root package name */
    static java.util.HashMap<java.lang.String, java.lang.String> f6679j;
    protected com.beizi.ad.internal.k a;

    /* renamed from: b, reason: collision with root package name */
    protected com.beizi.ad.b.b f6680b;

    /* renamed from: c, reason: collision with root package name */
    protected com.beizi.ad.internal.d.a f6681c;

    /* renamed from: d, reason: collision with root package name */
    protected com.beizi.ad.internal.c f6682d;

    /* renamed from: e, reason: collision with root package name */
    protected com.beizi.ad.internal.d.e f6683e;

    /* renamed from: f, reason: collision with root package name */
    protected com.beizi.ad.internal.f.c f6684f;

    /* renamed from: g, reason: collision with root package name */
    protected boolean f6685g;

    /* renamed from: h, reason: collision with root package name */
    protected boolean f6686h;

    /* renamed from: i, reason: collision with root package name */
    protected boolean f6687i;

    /* renamed from: k, reason: collision with root package name */
    protected boolean f6688k;
    private java.lang.ref.SoftReference<com.beizi.ad.internal.f> l;
    private final android.os.Handler m;
    private long n;
    private long o;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.beizi.ad.internal.d.b$1, reason: invalid class name */
    class AnonymousClass1 implements com.beizi.ad.internal.f.b {
        final /* synthetic */ com.beizi.ad.internal.d.b a;

        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }

        @Override // com.beizi.ad.internal.f.b
        public com.beizi.ad.internal.k a() {
                r1 = this;
                com.beizi.ad.internal.d.b r0 = r1.a
                com.beizi.ad.internal.k r0 = r0.a
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
                com.beizi.ad.internal.d.b r0 = r1.a
                com.beizi.ad.internal.d.e r0 = r0.f6683e
                return r0
        }

        @Override // com.beizi.ad.internal.f.b
        public com.beizi.ad.i d() {
                r1 = this;
                r0 = 0
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
                r0 = 0
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
                com.beizi.ad.internal.d.b r0 = r1.a
                com.beizi.ad.internal.d.e r0 = r0.f6683e
                r0.destroy()
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
    private class a extends com.beizi.ad.internal.h.d {
        java.lang.ref.WeakReference<com.beizi.ad.internal.f> a;

        /* renamed from: b, reason: collision with root package name */
        final int f6692b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.beizi.ad.internal.d.b f6693c;

        /* renamed from: d, reason: collision with root package name */
        private final java.lang.String f6694d;

        /* renamed from: e, reason: collision with root package name */
        private final java.util.HashMap<java.lang.String, java.lang.Object> f6695e;

        /* renamed from: f, reason: collision with root package name */
        private final boolean f6696f;

        /* renamed from: g, reason: collision with root package name */
        private final long f6697g;

        /* renamed from: h, reason: collision with root package name */
        private final long f6698h;

        private a(com.beizi.ad.internal.d.b r1, com.beizi.ad.internal.f r2, java.lang.String r3, int r4, java.util.HashMap<java.lang.String, java.lang.Object> r5, boolean r6, long r7, long r9) {
                r0 = this;
                r0.f6693c = r1
                r1 = 1
                r0.<init>(r1, r1)
                java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
                r1.<init>(r2)
                r0.a = r1
                r0.f6694d = r3
                r0.f6692b = r4
                r0.f6695e = r5
                r0.f6696f = r6
                r0.f6697g = r7
                r0.f6698h = r9
                return
        }

        /* synthetic */ a(com.beizi.ad.internal.d.b r1, com.beizi.ad.internal.f r2, java.lang.String r3, int r4, java.util.HashMap r5, boolean r6, long r7, long r9, com.beizi.ad.internal.d.b.AnonymousClass1 r11) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r9)
                return
        }

        @Override // com.beizi.ad.internal.h.d
        protected java.lang.String a() {
                r6 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = r6.f6694d
                r0.<init>(r1)
                java.lang.String r1 = "&errorCode="
                r0.append(r1)
                int r1 = r6.f6692b
                r0.append(r1)
                com.beizi.ad.internal.h.a r1 = com.beizi.ad.internal.h.a.a()
                java.lang.String r2 = r1.d()
                boolean r2 = com.beizi.ad.internal.h.o.a(r2)
                if (r2 != 0) goto L2f
                java.lang.String r2 = "&sdkuid="
                r0.append(r2)
                java.lang.String r1 = r1.d()
                java.lang.String r1 = android.net.Uri.encode(r1)
                r0.append(r1)
            L2f:
                long r1 = r6.f6697g
                r3 = 0
                int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r5 <= 0) goto L49
                java.lang.String r1 = "&latency="
                r0.append(r1)
                long r1 = r6.f6697g
                java.lang.String r1 = java.lang.String.valueOf(r1)
                java.lang.String r1 = android.net.Uri.encode(r1)
                r0.append(r1)
            L49:
                long r1 = r6.f6698h
                int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r5 <= 0) goto L61
                java.lang.String r1 = "&total_latency="
                r0.append(r1)
                long r1 = r6.f6698h
                java.lang.String r1 = java.lang.String.valueOf(r1)
                java.lang.String r1 = android.net.Uri.encode(r1)
                r0.append(r1)
            L61:
                java.lang.String r0 = r0.toString()
                return r0
        }

        @Override // com.beizi.ad.internal.h.d
        protected void a(com.beizi.ad.internal.h.e r4) {
                r3 = this;
                boolean r0 = r3.f6696f
                if (r0 == 0) goto L5
                goto Lf
            L5:
                java.lang.ref.WeakReference<com.beizi.ad.internal.f> r0 = r3.a
                java.lang.Object r0 = r0.get()
                com.beizi.ad.internal.f r0 = (com.beizi.ad.internal.f) r0
                if (r0 != 0) goto L10
            Lf:
                return
            L10:
                if (r4 == 0) goto L40
                boolean r1 = r4.a()
                if (r1 == 0) goto L40
                com.beizi.ad.internal.f.c r1 = new com.beizi.ad.internal.f.c
                com.beizi.ad.internal.d.b r2 = r3.f6693c
                com.beizi.ad.internal.k r2 = r2.a
                r1.<init>(r4, r2)
                java.util.HashMap<java.lang.String, java.lang.Object> r4 = r3.f6695e
                java.lang.String r2 = "ORIENTATION"
                boolean r4 = r4.containsKey(r2)
                if (r4 == 0) goto L41
                java.util.HashMap<java.lang.String, java.lang.Object> r4 = r3.f6695e
                java.lang.Object r4 = r4.get(r2)
                java.lang.String r2 = "h"
                boolean r4 = r4.equals(r2)
                if (r4 == 0) goto L3b
                r4 = 1
                goto L3c
            L3b:
                r4 = 2
            L3c:
                r1.a(r4)
                goto L41
            L40:
                r1 = 0
            L41:
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
    /* renamed from: com.beizi.ad.internal.d.b$b, reason: collision with other inner class name */
    static class HandlerC0101b extends android.os.Handler {
        java.lang.ref.WeakReference<com.beizi.ad.internal.d.b> a;

        public HandlerC0101b(com.beizi.ad.internal.d.b r2) {
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
                java.lang.ref.WeakReference<com.beizi.ad.internal.d.b> r3 = r2.a
                java.lang.Object r3 = r3.get()
                com.beizi.ad.internal.d.b r3 = (com.beizi.ad.internal.d.b) r3
                if (r3 == 0) goto L23
                boolean r0 = r3.f6685g
                if (r0 == 0) goto Lf
                goto L23
            Lf:
                r0 = 0
                r1 = 0
                r3.a(r0)     // Catch: java.lang.IllegalArgumentException -> L14 java.lang.Throwable -> L1b
            L14:
                r3.f6682d = r1
                r3.f6680b = r1
                r3.f6681c = r1
                return
            L1b:
                r0 = move-exception
                r3.f6682d = r1
                r3.f6680b = r1
                r3.f6681c = r1
                throw r0
            L23:
                return
        }
    }

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.beizi.ad.internal.d.b.f6679j = r0
            return
    }

    b(com.beizi.ad.internal.f r4, com.beizi.ad.internal.d.a r5, com.beizi.ad.internal.c r6, com.beizi.ad.internal.k r7, com.beizi.ad.internal.f.c r8) {
            r3 = this;
            r3.<init>()
            com.beizi.ad.internal.d.e r0 = new com.beizi.ad.internal.d.e
            r0.<init>(r3)
            r3.f6683e = r0
            r0 = 0
            r3.f6685g = r0
            r3.f6686h = r0
            r3.f6687i = r0
            com.beizi.ad.internal.d.b$b r1 = new com.beizi.ad.internal.d.b$b
            r1.<init>(r3)
            r3.m = r1
            r1 = -1
            r3.n = r1
            r3.o = r1
            r3.f6688k = r0
            java.util.HashMap<java.lang.String, java.lang.String> r0 = com.beizi.ad.internal.d.b.f6679j
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L3d
            java.lang.String r0 = "1"
            java.lang.String r1 = "Baidu"
            r3.a(r0, r1)
            java.lang.String r0 = "4"
            java.lang.String r1 = "GDT"
            r3.a(r0, r1)
            java.lang.String r0 = "43"
            java.lang.String r1 = "AFP"
            r3.a(r0, r1)
        L3d:
            r3.f6684f = r8
            java.lang.ref.SoftReference r8 = new java.lang.ref.SoftReference
            r8.<init>(r4)
            r3.l = r8
            r3.f6681c = r5
            r3.f6682d = r6
            r3.a = r7
            r4 = -1
            if (r5 != 0) goto L51
            r5 = 3
            goto L5a
        L51:
            boolean r5 = r3.l()
            if (r5 != 0) goto L59
            r5 = 2
            goto L5a
        L59:
            r5 = -1
        L5a:
            if (r5 == r4) goto L5f
            r3.a(r5)
        L5f:
            return
    }

    private long a(com.beizi.ad.internal.f r6) {
            r5 = this;
            if (r6 == 0) goto Lf
            long r0 = r5.o
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto Lf
            long r0 = r6.a(r0)
            return r0
        Lf:
            r0 = -1
            return r0
    }

    private void a(java.lang.Throwable r2, java.lang.String r3) {
            r1 = this;
            boolean r2 = com.beizi.ad.internal.h.o.a(r3)
            if (r2 != 0) goto Lf
            com.beizi.ad.internal.h r2 = com.beizi.ad.internal.h.a()
            com.beizi.ad.internal.k r0 = r1.a
            r2.a(r0, r3)
        Lf:
            return
    }

    @android.annotation.SuppressLint({"InlinedApi", "NewApi"})
    private void b(int r16) {
            r15 = this;
            r4 = r16
            boolean r0 = r15.f6685g
            if (r0 == 0) goto L8
            goto L6f
        L8:
            java.lang.ref.SoftReference<com.beizi.ad.internal.f> r0 = r15.l
            java.lang.Object r0 = r0.get()
            r2 = r0
            com.beizi.ad.internal.f r2 = (com.beizi.ad.internal.f) r2
            com.beizi.ad.internal.d.a r0 = r15.f6681c
            r12 = 0
            r13 = -1
            if (r0 == 0) goto L6a
            java.lang.String r0 = r0.f()
            boolean r0 = com.beizi.ad.internal.h.o.a(r0)
            if (r0 == 0) goto L22
            goto L6a
        L22:
            r0 = 1
            r14 = 0
            if (r2 == 0) goto L38
            java.util.LinkedList r1 = r2.b()
            if (r1 == 0) goto L38
            java.util.LinkedList r1 = r2.b()
            int r1 = r1.size()
            if (r1 <= 0) goto L38
            r1 = 1
            goto L39
        L38:
            r1 = 0
        L39:
            if (r4 != r13) goto L3d
            r6 = 1
            goto L3e
        L3d:
            r6 = r1
        L3e:
            com.beizi.ad.internal.d.b$a r0 = new com.beizi.ad.internal.d.b$a
            com.beizi.ad.internal.d.a r1 = r15.f6681c
            java.lang.String r3 = r1.f()
            com.beizi.ad.internal.d.a r1 = r15.f6681c
            java.util.HashMap r5 = r1.g()
            long r7 = r15.m()
            long r9 = r15.a(r2)
            r11 = 0
            r1 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r9, r11)
            java.lang.Void[] r1 = new java.lang.Void[r14]     // Catch: java.lang.Throwable -> L5f
            r0.execute(r1)     // Catch: java.lang.Throwable -> L5f
            goto L60
        L5f:
        L60:
            if (r6 == 0) goto L6f
            if (r4 == r13) goto L6f
            if (r2 == 0) goto L6f
            r2.a(r12)
            goto L6f
        L6a:
            if (r4 != r13) goto L6d
            goto L6f
        L6d:
            if (r2 != 0) goto L70
        L6f:
            return
        L70:
            r2.a(r12)
            return
    }

    private boolean l() {
            r7 = this;
            java.lang.String r0 = "."
            r1 = 0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.reflect.InvocationTargetException -> L61 java.lang.NoSuchMethodException -> L64 java.lang.ClassCastException -> L67 java.lang.IllegalAccessException -> L6a java.lang.InstantiationException -> L6d java.lang.LinkageError -> L70 java.lang.ClassNotFoundException -> L73
            r2.<init>()     // Catch: java.lang.reflect.InvocationTargetException -> L61 java.lang.NoSuchMethodException -> L64 java.lang.ClassCastException -> L67 java.lang.IllegalAccessException -> L6a java.lang.InstantiationException -> L6d java.lang.LinkageError -> L70 java.lang.ClassNotFoundException -> L73
            com.beizi.ad.internal.d.a r3 = r7.f6681c     // Catch: java.lang.reflect.InvocationTargetException -> L61 java.lang.NoSuchMethodException -> L64 java.lang.ClassCastException -> L67 java.lang.IllegalAccessException -> L6a java.lang.InstantiationException -> L6d java.lang.LinkageError -> L70 java.lang.ClassNotFoundException -> L73
            java.lang.String r3 = r3.a()     // Catch: java.lang.reflect.InvocationTargetException -> L61 java.lang.NoSuchMethodException -> L64 java.lang.ClassCastException -> L67 java.lang.IllegalAccessException -> L6a java.lang.InstantiationException -> L6d java.lang.LinkageError -> L70 java.lang.ClassNotFoundException -> L73
            r2.append(r3)     // Catch: java.lang.reflect.InvocationTargetException -> L61 java.lang.NoSuchMethodException -> L64 java.lang.ClassCastException -> L67 java.lang.IllegalAccessException -> L6a java.lang.InstantiationException -> L6d java.lang.LinkageError -> L70 java.lang.ClassNotFoundException -> L73
            r2.append(r0)     // Catch: java.lang.reflect.InvocationTargetException -> L61 java.lang.NoSuchMethodException -> L64 java.lang.ClassCastException -> L67 java.lang.IllegalAccessException -> L6a java.lang.InstantiationException -> L6d java.lang.LinkageError -> L70 java.lang.ClassNotFoundException -> L73
            com.beizi.ad.internal.k r3 = r7.a     // Catch: java.lang.reflect.InvocationTargetException -> L61 java.lang.NoSuchMethodException -> L64 java.lang.ClassCastException -> L67 java.lang.IllegalAccessException -> L6a java.lang.InstantiationException -> L6d java.lang.LinkageError -> L70 java.lang.ClassNotFoundException -> L73
            java.lang.String r3 = r3.toString()     // Catch: java.lang.reflect.InvocationTargetException -> L61 java.lang.NoSuchMethodException -> L64 java.lang.ClassCastException -> L67 java.lang.IllegalAccessException -> L6a java.lang.InstantiationException -> L6d java.lang.LinkageError -> L70 java.lang.ClassNotFoundException -> L73
            r2.append(r3)     // Catch: java.lang.reflect.InvocationTargetException -> L61 java.lang.NoSuchMethodException -> L64 java.lang.ClassCastException -> L67 java.lang.IllegalAccessException -> L6a java.lang.InstantiationException -> L6d java.lang.LinkageError -> L70 java.lang.ClassNotFoundException -> L73
            java.lang.String r2 = r2.toString()     // Catch: java.lang.reflect.InvocationTargetException -> L61 java.lang.NoSuchMethodException -> L64 java.lang.ClassCastException -> L67 java.lang.IllegalAccessException -> L6a java.lang.InstantiationException -> L6d java.lang.LinkageError -> L70 java.lang.ClassNotFoundException -> L73
            java.util.HashMap<java.lang.String, java.lang.String> r3 = com.beizi.ad.internal.d.b.f6679j     // Catch: java.lang.reflect.InvocationTargetException -> L61 java.lang.NoSuchMethodException -> L64 java.lang.ClassCastException -> L67 java.lang.IllegalAccessException -> L6a java.lang.InstantiationException -> L6d java.lang.LinkageError -> L70 java.lang.ClassNotFoundException -> L73
            java.lang.Object r3 = r3.get(r2)     // Catch: java.lang.reflect.InvocationTargetException -> L61 java.lang.NoSuchMethodException -> L64 java.lang.ClassCastException -> L67 java.lang.IllegalAccessException -> L6a java.lang.InstantiationException -> L6d java.lang.LinkageError -> L70 java.lang.ClassNotFoundException -> L73
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.reflect.InvocationTargetException -> L61 java.lang.NoSuchMethodException -> L64 java.lang.ClassCastException -> L67 java.lang.IllegalAccessException -> L6a java.lang.InstantiationException -> L6d java.lang.LinkageError -> L70 java.lang.ClassNotFoundException -> L73
            com.beizi.ad.internal.h r4 = com.beizi.ad.internal.h.a()     // Catch: java.lang.reflect.InvocationTargetException -> L61 java.lang.NoSuchMethodException -> L64 java.lang.ClassCastException -> L67 java.lang.IllegalAccessException -> L6a java.lang.InstantiationException -> L6d java.lang.LinkageError -> L70 java.lang.ClassNotFoundException -> L73
            java.util.HashMap<java.lang.String, java.lang.String> r4 = r4.f6836f     // Catch: java.lang.reflect.InvocationTargetException -> L61 java.lang.NoSuchMethodException -> L64 java.lang.ClassCastException -> L67 java.lang.IllegalAccessException -> L6a java.lang.InstantiationException -> L6d java.lang.LinkageError -> L70 java.lang.ClassNotFoundException -> L73
            java.lang.Object r4 = r4.get(r2)     // Catch: java.lang.reflect.InvocationTargetException -> L61 java.lang.NoSuchMethodException -> L64 java.lang.ClassCastException -> L67 java.lang.IllegalAccessException -> L6a java.lang.InstantiationException -> L6d java.lang.LinkageError -> L70 java.lang.ClassNotFoundException -> L73
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.reflect.InvocationTargetException -> L61 java.lang.NoSuchMethodException -> L64 java.lang.ClassCastException -> L67 java.lang.IllegalAccessException -> L6a java.lang.InstantiationException -> L6d java.lang.LinkageError -> L70 java.lang.ClassNotFoundException -> L73
            boolean r5 = com.beizi.ad.internal.h.o.a(r4)     // Catch: java.lang.reflect.InvocationTargetException -> L61 java.lang.NoSuchMethodException -> L64 java.lang.ClassCastException -> L67 java.lang.IllegalAccessException -> L6a java.lang.InstantiationException -> L6d java.lang.LinkageError -> L70 java.lang.ClassNotFoundException -> L73
            r6 = 1
            if (r5 == 0) goto La1
            boolean r4 = com.beizi.ad.internal.h.o.a(r3)     // Catch: java.lang.reflect.InvocationTargetException -> L61 java.lang.NoSuchMethodException -> L64 java.lang.ClassCastException -> L67 java.lang.IllegalAccessException -> L6a java.lang.InstantiationException -> L6d java.lang.LinkageError -> L70 java.lang.ClassNotFoundException -> L73
            if (r4 == 0) goto L76
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.reflect.InvocationTargetException -> L61 java.lang.NoSuchMethodException -> L64 java.lang.ClassCastException -> L67 java.lang.IllegalAccessException -> L6a java.lang.InstantiationException -> L6d java.lang.LinkageError -> L70 java.lang.ClassNotFoundException -> L73
            r3.<init>()     // Catch: java.lang.reflect.InvocationTargetException -> L61 java.lang.NoSuchMethodException -> L64 java.lang.ClassCastException -> L67 java.lang.IllegalAccessException -> L6a java.lang.InstantiationException -> L6d java.lang.LinkageError -> L70 java.lang.ClassNotFoundException -> L73
            java.lang.Class r4 = r7.getClass()     // Catch: java.lang.reflect.InvocationTargetException -> L61 java.lang.NoSuchMethodException -> L64 java.lang.ClassCastException -> L67 java.lang.IllegalAccessException -> L6a java.lang.InstantiationException -> L6d java.lang.LinkageError -> L70 java.lang.ClassNotFoundException -> L73
            java.lang.Package r4 = r4.getPackage()     // Catch: java.lang.reflect.InvocationTargetException -> L61 java.lang.NoSuchMethodException -> L64 java.lang.ClassCastException -> L67 java.lang.IllegalAccessException -> L6a java.lang.InstantiationException -> L6d java.lang.LinkageError -> L70 java.lang.ClassNotFoundException -> L73
            java.lang.String r4 = r4.getName()     // Catch: java.lang.reflect.InvocationTargetException -> L61 java.lang.NoSuchMethodException -> L64 java.lang.ClassCastException -> L67 java.lang.IllegalAccessException -> L6a java.lang.InstantiationException -> L6d java.lang.LinkageError -> L70 java.lang.ClassNotFoundException -> L73
            r3.append(r4)     // Catch: java.lang.reflect.InvocationTargetException -> L61 java.lang.NoSuchMethodException -> L64 java.lang.ClassCastException -> L67 java.lang.IllegalAccessException -> L6a java.lang.InstantiationException -> L6d java.lang.LinkageError -> L70 java.lang.ClassNotFoundException -> L73
            r3.append(r0)     // Catch: java.lang.reflect.InvocationTargetException -> L61 java.lang.NoSuchMethodException -> L64 java.lang.ClassCastException -> L67 java.lang.IllegalAccessException -> L6a java.lang.InstantiationException -> L6d java.lang.LinkageError -> L70 java.lang.ClassNotFoundException -> L73
            r3.append(r2)     // Catch: java.lang.reflect.InvocationTargetException -> L61 java.lang.NoSuchMethodException -> L64 java.lang.ClassCastException -> L67 java.lang.IllegalAccessException -> L6a java.lang.InstantiationException -> L6d java.lang.LinkageError -> L70 java.lang.ClassNotFoundException -> L73
            java.lang.String r0 = r3.toString()     // Catch: java.lang.reflect.InvocationTargetException -> L61 java.lang.NoSuchMethodException -> L64 java.lang.ClassCastException -> L67 java.lang.IllegalAccessException -> L6a java.lang.InstantiationException -> L6d java.lang.LinkageError -> L70 java.lang.ClassNotFoundException -> L73
            goto L94
        L61:
            r0 = move-exception
            goto Lda
        L64:
            r0 = move-exception
            goto Le4
        L67:
            r0 = move-exception
            goto Lee
        L6a:
            r0 = move-exception
            goto Lf8
        L6d:
            r0 = move-exception
            goto L102
        L70:
            r0 = move-exception
            goto L10c
        L73:
            r0 = move-exception
            goto L116
        L76:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.reflect.InvocationTargetException -> L61 java.lang.NoSuchMethodException -> L64 java.lang.ClassCastException -> L67 java.lang.IllegalAccessException -> L6a java.lang.InstantiationException -> L6d java.lang.LinkageError -> L70 java.lang.ClassNotFoundException -> L73
            r2.<init>()     // Catch: java.lang.reflect.InvocationTargetException -> L61 java.lang.NoSuchMethodException -> L64 java.lang.ClassCastException -> L67 java.lang.IllegalAccessException -> L6a java.lang.InstantiationException -> L6d java.lang.LinkageError -> L70 java.lang.ClassNotFoundException -> L73
            java.lang.Class r4 = r7.getClass()     // Catch: java.lang.reflect.InvocationTargetException -> L61 java.lang.NoSuchMethodException -> L64 java.lang.ClassCastException -> L67 java.lang.IllegalAccessException -> L6a java.lang.InstantiationException -> L6d java.lang.LinkageError -> L70 java.lang.ClassNotFoundException -> L73
            java.lang.Package r4 = r4.getPackage()     // Catch: java.lang.reflect.InvocationTargetException -> L61 java.lang.NoSuchMethodException -> L64 java.lang.ClassCastException -> L67 java.lang.IllegalAccessException -> L6a java.lang.InstantiationException -> L6d java.lang.LinkageError -> L70 java.lang.ClassNotFoundException -> L73
            java.lang.String r4 = r4.getName()     // Catch: java.lang.reflect.InvocationTargetException -> L61 java.lang.NoSuchMethodException -> L64 java.lang.ClassCastException -> L67 java.lang.IllegalAccessException -> L6a java.lang.InstantiationException -> L6d java.lang.LinkageError -> L70 java.lang.ClassNotFoundException -> L73
            r2.append(r4)     // Catch: java.lang.reflect.InvocationTargetException -> L61 java.lang.NoSuchMethodException -> L64 java.lang.ClassCastException -> L67 java.lang.IllegalAccessException -> L6a java.lang.InstantiationException -> L6d java.lang.LinkageError -> L70 java.lang.ClassNotFoundException -> L73
            r2.append(r0)     // Catch: java.lang.reflect.InvocationTargetException -> L61 java.lang.NoSuchMethodException -> L64 java.lang.ClassCastException -> L67 java.lang.IllegalAccessException -> L6a java.lang.InstantiationException -> L6d java.lang.LinkageError -> L70 java.lang.ClassNotFoundException -> L73
            r2.append(r3)     // Catch: java.lang.reflect.InvocationTargetException -> L61 java.lang.NoSuchMethodException -> L64 java.lang.ClassCastException -> L67 java.lang.IllegalAccessException -> L6a java.lang.InstantiationException -> L6d java.lang.LinkageError -> L70 java.lang.ClassNotFoundException -> L73
            java.lang.String r0 = r2.toString()     // Catch: java.lang.reflect.InvocationTargetException -> L61 java.lang.NoSuchMethodException -> L64 java.lang.ClassCastException -> L67 java.lang.IllegalAccessException -> L6a java.lang.InstantiationException -> L6d java.lang.LinkageError -> L70 java.lang.ClassNotFoundException -> L73
        L94:
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.reflect.InvocationTargetException -> L61 java.lang.NoSuchMethodException -> L64 java.lang.ClassCastException -> L67 java.lang.IllegalAccessException -> L6a java.lang.InstantiationException -> L6d java.lang.LinkageError -> L70 java.lang.ClassNotFoundException -> L73
            java.lang.Object r0 = r0.newInstance()     // Catch: java.lang.reflect.InvocationTargetException -> L61 java.lang.NoSuchMethodException -> L64 java.lang.ClassCastException -> L67 java.lang.IllegalAccessException -> L6a java.lang.InstantiationException -> L6d java.lang.LinkageError -> L70 java.lang.ClassNotFoundException -> L73
            com.beizi.ad.b.b r0 = (com.beizi.ad.b.b) r0     // Catch: java.lang.reflect.InvocationTargetException -> L61 java.lang.NoSuchMethodException -> L64 java.lang.ClassCastException -> L67 java.lang.IllegalAccessException -> L6a java.lang.InstantiationException -> L6d java.lang.LinkageError -> L70 java.lang.ClassNotFoundException -> L73
            r7.f6680b = r0     // Catch: java.lang.reflect.InvocationTargetException -> L61 java.lang.NoSuchMethodException -> L64 java.lang.ClassCastException -> L67 java.lang.IllegalAccessException -> L6a java.lang.InstantiationException -> L6d java.lang.LinkageError -> L70 java.lang.ClassNotFoundException -> L73
            goto Ld9
        La1:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.reflect.InvocationTargetException -> L61 java.lang.NoSuchMethodException -> L64 java.lang.ClassCastException -> L67 java.lang.IllegalAccessException -> L6a java.lang.InstantiationException -> L6d java.lang.LinkageError -> L70 java.lang.ClassNotFoundException -> L73
            r3.<init>()     // Catch: java.lang.reflect.InvocationTargetException -> L61 java.lang.NoSuchMethodException -> L64 java.lang.ClassCastException -> L67 java.lang.IllegalAccessException -> L6a java.lang.InstantiationException -> L6d java.lang.LinkageError -> L70 java.lang.ClassNotFoundException -> L73
            java.lang.Class r5 = r7.getClass()     // Catch: java.lang.reflect.InvocationTargetException -> L61 java.lang.NoSuchMethodException -> L64 java.lang.ClassCastException -> L67 java.lang.IllegalAccessException -> L6a java.lang.InstantiationException -> L6d java.lang.LinkageError -> L70 java.lang.ClassNotFoundException -> L73
            java.lang.Package r5 = r5.getPackage()     // Catch: java.lang.reflect.InvocationTargetException -> L61 java.lang.NoSuchMethodException -> L64 java.lang.ClassCastException -> L67 java.lang.IllegalAccessException -> L6a java.lang.InstantiationException -> L6d java.lang.LinkageError -> L70 java.lang.ClassNotFoundException -> L73
            java.lang.String r5 = r5.getName()     // Catch: java.lang.reflect.InvocationTargetException -> L61 java.lang.NoSuchMethodException -> L64 java.lang.ClassCastException -> L67 java.lang.IllegalAccessException -> L6a java.lang.InstantiationException -> L6d java.lang.LinkageError -> L70 java.lang.ClassNotFoundException -> L73
            r3.append(r5)     // Catch: java.lang.reflect.InvocationTargetException -> L61 java.lang.NoSuchMethodException -> L64 java.lang.ClassCastException -> L67 java.lang.IllegalAccessException -> L6a java.lang.InstantiationException -> L6d java.lang.LinkageError -> L70 java.lang.ClassNotFoundException -> L73
            r3.append(r0)     // Catch: java.lang.reflect.InvocationTargetException -> L61 java.lang.NoSuchMethodException -> L64 java.lang.ClassCastException -> L67 java.lang.IllegalAccessException -> L6a java.lang.InstantiationException -> L6d java.lang.LinkageError -> L70 java.lang.ClassNotFoundException -> L73
            r3.append(r4)     // Catch: java.lang.reflect.InvocationTargetException -> L61 java.lang.NoSuchMethodException -> L64 java.lang.ClassCastException -> L67 java.lang.IllegalAccessException -> L6a java.lang.InstantiationException -> L6d java.lang.LinkageError -> L70 java.lang.ClassNotFoundException -> L73
            java.lang.String r0 = r3.toString()     // Catch: java.lang.reflect.InvocationTargetException -> L61 java.lang.NoSuchMethodException -> L64 java.lang.ClassCastException -> L67 java.lang.IllegalAccessException -> L6a java.lang.InstantiationException -> L6d java.lang.LinkageError -> L70 java.lang.ClassNotFoundException -> L73
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.reflect.InvocationTargetException -> L61 java.lang.NoSuchMethodException -> L64 java.lang.ClassCastException -> L67 java.lang.IllegalAccessException -> L6a java.lang.InstantiationException -> L6d java.lang.LinkageError -> L70 java.lang.ClassNotFoundException -> L73
            java.lang.Class[] r3 = new java.lang.Class[r6]     // Catch: java.lang.reflect.InvocationTargetException -> L61 java.lang.NoSuchMethodException -> L64 java.lang.ClassCastException -> L67 java.lang.IllegalAccessException -> L6a java.lang.InstantiationException -> L6d java.lang.LinkageError -> L70 java.lang.ClassNotFoundException -> L73
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r3[r1] = r4     // Catch: java.lang.reflect.InvocationTargetException -> L61 java.lang.NoSuchMethodException -> L64 java.lang.ClassCastException -> L67 java.lang.IllegalAccessException -> L6a java.lang.InstantiationException -> L6d java.lang.LinkageError -> L70 java.lang.ClassNotFoundException -> L73
            java.lang.reflect.Constructor r0 = r0.getConstructor(r3)     // Catch: java.lang.reflect.InvocationTargetException -> L61 java.lang.NoSuchMethodException -> L64 java.lang.ClassCastException -> L67 java.lang.IllegalAccessException -> L6a java.lang.InstantiationException -> L6d java.lang.LinkageError -> L70 java.lang.ClassNotFoundException -> L73
            java.lang.Object[] r3 = new java.lang.Object[r6]     // Catch: java.lang.reflect.InvocationTargetException -> L61 java.lang.NoSuchMethodException -> L64 java.lang.ClassCastException -> L67 java.lang.IllegalAccessException -> L6a java.lang.InstantiationException -> L6d java.lang.LinkageError -> L70 java.lang.ClassNotFoundException -> L73
            r3[r1] = r2     // Catch: java.lang.reflect.InvocationTargetException -> L61 java.lang.NoSuchMethodException -> L64 java.lang.ClassCastException -> L67 java.lang.IllegalAccessException -> L6a java.lang.InstantiationException -> L6d java.lang.LinkageError -> L70 java.lang.ClassNotFoundException -> L73
            java.lang.Object r0 = r0.newInstance(r3)     // Catch: java.lang.reflect.InvocationTargetException -> L61 java.lang.NoSuchMethodException -> L64 java.lang.ClassCastException -> L67 java.lang.IllegalAccessException -> L6a java.lang.InstantiationException -> L6d java.lang.LinkageError -> L70 java.lang.ClassNotFoundException -> L73
            com.beizi.ad.b.b r0 = (com.beizi.ad.b.b) r0     // Catch: java.lang.reflect.InvocationTargetException -> L61 java.lang.NoSuchMethodException -> L64 java.lang.ClassCastException -> L67 java.lang.IllegalAccessException -> L6a java.lang.InstantiationException -> L6d java.lang.LinkageError -> L70 java.lang.ClassNotFoundException -> L73
            r7.f6680b = r0     // Catch: java.lang.reflect.InvocationTargetException -> L61 java.lang.NoSuchMethodException -> L64 java.lang.ClassCastException -> L67 java.lang.IllegalAccessException -> L6a java.lang.InstantiationException -> L6d java.lang.LinkageError -> L70 java.lang.ClassNotFoundException -> L73
        Ld9:
            return r6
        Lda:
            com.beizi.ad.internal.d.a r2 = r7.f6681c
            java.lang.String r2 = r2.a()
            r7.a(r0, r2)
            goto L11f
        Le4:
            com.beizi.ad.internal.d.a r2 = r7.f6681c
            java.lang.String r2 = r2.a()
            r7.a(r0, r2)
            goto L11f
        Lee:
            com.beizi.ad.internal.d.a r2 = r7.f6681c
            java.lang.String r2 = r2.a()
            r7.a(r0, r2)
            goto L11f
        Lf8:
            com.beizi.ad.internal.d.a r2 = r7.f6681c
            java.lang.String r2 = r2.a()
            r7.a(r0, r2)
            goto L11f
        L102:
            com.beizi.ad.internal.d.a r2 = r7.f6681c
            java.lang.String r2 = r2.a()
            r7.a(r0, r2)
            goto L11f
        L10c:
            com.beizi.ad.internal.d.a r2 = r7.f6681c
            java.lang.String r2 = r2.a()
            r7.a(r0, r2)
            goto L11f
        L116:
            com.beizi.ad.internal.d.a r2 = r7.f6681c
            java.lang.String r2 = r2.a()
            r7.a(r0, r2)
        L11f:
            return r1
    }

    private long m() {
            r7 = this;
            long r0 = r7.n
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L10
            long r4 = r7.o
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 <= 0) goto L10
            long r4 = r4 - r0
            return r4
        L10:
            r0 = -1
            return r0
    }

    protected com.beizi.ad.b.a a() {
            r1 = this;
            java.lang.ref.SoftReference<com.beizi.ad.internal.f> r0 = r1.l
            java.lang.Object r0 = r0.get()
            com.beizi.ad.internal.f r0 = (com.beizi.ad.internal.f) r0
            if (r0 == 0) goto Lf
            com.beizi.ad.b.a r0 = r0.d()
            return r0
        Lf:
            r0 = 0
            return r0
    }

    public void a(int r2) {
            r1 = this;
            boolean r0 = r1.f6686h
            if (r0 != 0) goto L1c
            boolean r0 = r1.f6685g
            if (r0 != 0) goto L1c
            boolean r0 = r1.f6687i
            if (r0 == 0) goto Ld
            goto L1c
        Ld:
            r1.h()
            r1.f()
            r1.b(r2)
            r2 = 1
            r1.f6685g = r2
            r1.b()
        L1c:
            return
    }

    void a(java.lang.String r6, java.lang.String r7) {
            r5 = this;
            java.util.HashMap<java.lang.String, java.lang.String> r0 = com.beizi.ad.internal.d.b.f6679j
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r6)
            java.lang.String r2 = ".SPLASH"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r7)
            java.lang.String r3 = "Splash"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.put(r1, r2)
            java.util.HashMap<java.lang.String, java.lang.String> r0 = com.beizi.ad.internal.d.b.f6679j
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r6)
            java.lang.String r2 = ".BANNER"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r7)
            java.lang.String r3 = "Banner"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.put(r1, r2)
            java.util.HashMap<java.lang.String, java.lang.String> r0 = com.beizi.ad.internal.d.b.f6679j
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r6)
            java.lang.String r2 = ".INTERSTITIAL"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r7)
            java.lang.String r3 = "Interstitial"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.put(r1, r2)
            java.util.HashMap<java.lang.String, java.lang.String> r0 = com.beizi.ad.internal.d.b.f6679j
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r6)
            java.lang.String r2 = ".NATIVE"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r7)
            java.lang.String r4 = "Native"
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r0.put(r1, r2)
            java.util.HashMap<java.lang.String, java.lang.String> r0 = com.beizi.ad.internal.d.b.f6679j
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r6)
            java.lang.String r6 = ".REWARDEDVIDEO"
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r7)
            r1.append(r3)
            java.lang.String r7 = r1.toString()
            r0.put(r6, r7)
            return
    }

    public void a(boolean r1) {
            r0 = this;
            r0.f6688k = r1
            if (r1 == 0) goto L7
            r0.b()
        L7:
            return
    }

    boolean a(java.lang.Class r3) {
            r2 = this;
            boolean r0 = r2.f6685g
            r1 = 0
            if (r0 == 0) goto L6
            return r1
        L6:
            com.beizi.ad.b.b r0 = r2.f6680b
            if (r0 == 0) goto L15
            if (r3 == 0) goto L15
            boolean r3 = r3.isInstance(r0)
            if (r3 != 0) goto L13
            goto L15
        L13:
            r3 = 1
            return r3
        L15:
            r3 = 3
            r2.a(r3)
            return r1
    }

    protected void b() {
            r1 = this;
            com.beizi.ad.b.b r0 = r1.f6680b
            if (r0 == 0) goto L7
            r0.b()
        L7:
            r0 = 1
            r1.f6687i = r0
            r0 = 0
            r1.f6680b = r0
            r1.f6681c = r0
            return
    }

    public abstract void c();

    public boolean d() {
            r1 = this;
            boolean r0 = r1.f6687i
            return r0
    }

    void e() {
            r4 = this;
            boolean r0 = r4.f6686h
            if (r0 != 0) goto L11
            boolean r0 = r4.f6685g
            if (r0 == 0) goto L9
            goto L11
        L9:
            android.os.Handler r0 = r4.m
            r1 = 0
            r2 = 15000(0x3a98, double:7.411E-320)
            r0.sendEmptyMessageDelayed(r1, r2)
        L11:
            return
    }

    void f() {
            r2 = this;
            android.os.Handler r0 = r2.m
            r1 = 0
            r0.removeMessages(r1)
            return
    }

    protected void g() {
            r2 = this;
            long r0 = java.lang.System.currentTimeMillis()
            r2.n = r0
            return
    }

    protected void h() {
            r2 = this;
            long r0 = java.lang.System.currentTimeMillis()
            r2.o = r0
            return
    }

    public abstract void i();

    public abstract void j();

    public abstract void k();
}

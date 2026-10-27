package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* renamed from: com.amap.api.col.3l.if, reason: invalid class name */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class Cif {
    public static final int DEFAULT_RETRY_TIMEOUT = 5000;
    private boolean a;

    /* renamed from: b, reason: collision with root package name */
    private int f3518b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f3519c;

    /* renamed from: d, reason: collision with root package name */
    private java.lang.String f3520d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f3521e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f3522f;

    /* renamed from: g, reason: collision with root package name */
    private com.amap.api.col.p0003l.Cif.a f3523g;

    /* renamed from: h, reason: collision with root package name */
    private com.amap.api.col.p0003l.Cif.b f3524h;
    int l;
    int m;
    java.net.Proxy n;
    com.amap.api.col.3l.s6.a o;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.amap.api.col.3l.if$a */
    public enum a extends java.lang.Enum<com.amap.api.col.p0003l.Cif.a> {
        public static final com.amap.api.col.p0003l.Cif.a a = null;

        /* renamed from: b, reason: collision with root package name */
        public static final com.amap.api.col.p0003l.Cif.a f3525b = null;

        /* renamed from: c, reason: collision with root package name */
        public static final com.amap.api.col.p0003l.Cif.a f3526c = null;

        /* renamed from: d, reason: collision with root package name */
        public static final com.amap.api.col.p0003l.Cif.a f3527d = null;

        /* renamed from: e, reason: collision with root package name */
        public static final com.amap.api.col.p0003l.Cif.a f3528e = null;

        /* renamed from: g, reason: collision with root package name */
        private static final /* synthetic */ com.amap.api.col.p0003l.Cif.a[] f3529g = null;

        /* renamed from: f, reason: collision with root package name */
        private int f3530f;

        static {
                com.amap.api.col.3l.if$a r0 = new com.amap.api.col.3l.if$a
                java.lang.String r1 = "NORMAL"
                r2 = 0
                r0.<init>(r1, r2, r2)
                com.amap.api.col.p0003l.Cif.a.a = r0
                com.amap.api.col.3l.if$a r1 = new com.amap.api.col.3l.if$a
                java.lang.String r3 = "INTERRUPT_IO"
                r4 = 1
                r1.<init>(r3, r4, r4)
                com.amap.api.col.p0003l.Cif.a.f3525b = r1
                com.amap.api.col.3l.if$a r3 = new com.amap.api.col.3l.if$a
                java.lang.String r5 = "NEVER"
                r6 = 2
                r3.<init>(r5, r6, r6)
                com.amap.api.col.p0003l.Cif.a.f3526c = r3
                com.amap.api.col.3l.if$a r5 = new com.amap.api.col.3l.if$a
                java.lang.String r7 = "FIX"
                r8 = 3
                r5.<init>(r7, r8, r8)
                com.amap.api.col.p0003l.Cif.a.f3527d = r5
                com.amap.api.col.3l.if$a r7 = new com.amap.api.col.3l.if$a
                java.lang.String r9 = "SINGLE"
                r10 = 4
                r7.<init>(r9, r10, r10)
                com.amap.api.col.p0003l.Cif.a.f3528e = r7
                r9 = 5
                com.amap.api.col.3l.if$a[] r9 = new com.amap.api.col.p0003l.Cif.a[r9]
                r9[r2] = r0
                r9[r4] = r1
                r9[r6] = r3
                r9[r8] = r5
                r9[r10] = r7
                com.amap.api.col.p0003l.Cif.a.f3529g = r9
                return
        }

        a(java.lang.String r1, int r2, int r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.f3530f = r3
                return
        }

        public static com.amap.api.col.p0003l.Cif.a valueOf(java.lang.String r1) {
                java.lang.Class<com.amap.api.col.3l.if$a> r0 = com.amap.api.col.p0003l.Cif.a.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.amap.api.col.3l.if$a r1 = (com.amap.api.col.p0003l.Cif.a) r1
                return r1
        }

        public static com.amap.api.col.p0003l.Cif.a[] values() {
                com.amap.api.col.3l.if$a[] r0 = com.amap.api.col.p0003l.Cif.a.f3529g
                java.lang.Object r0 = r0.clone()
                com.amap.api.col.3l.if$a[] r0 = (com.amap.api.col.p0003l.Cif.a[]) r0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.amap.api.col.3l.if$b */
    public enum b extends java.lang.Enum<com.amap.api.col.p0003l.Cif.b> {
        public static final com.amap.api.col.p0003l.Cif.b a = null;

        /* renamed from: b, reason: collision with root package name */
        public static final com.amap.api.col.p0003l.Cif.b f3531b = null;

        /* renamed from: c, reason: collision with root package name */
        public static final com.amap.api.col.p0003l.Cif.b f3532c = null;

        /* renamed from: d, reason: collision with root package name */
        public static final com.amap.api.col.p0003l.Cif.b f3533d = null;

        /* renamed from: e, reason: collision with root package name */
        public static final com.amap.api.col.p0003l.Cif.b f3534e = null;

        /* renamed from: f, reason: collision with root package name */
        public static final com.amap.api.col.p0003l.Cif.b f3535f = null;

        /* renamed from: g, reason: collision with root package name */
        public static final com.amap.api.col.p0003l.Cif.b f3536g = null;

        /* renamed from: i, reason: collision with root package name */
        private static final /* synthetic */ com.amap.api.col.p0003l.Cif.b[] f3537i = null;

        /* renamed from: h, reason: collision with root package name */
        private int f3538h;

        static {
                com.amap.api.col.3l.if$b r0 = new com.amap.api.col.3l.if$b
                java.lang.String r1 = "FIRST_NONDEGRADE"
                r2 = 0
                r0.<init>(r1, r2, r2)
                com.amap.api.col.p0003l.Cif.b.a = r0
                com.amap.api.col.3l.if$b r1 = new com.amap.api.col.3l.if$b
                java.lang.String r3 = "NEVER_GRADE"
                r4 = 1
                r1.<init>(r3, r4, r4)
                com.amap.api.col.p0003l.Cif.b.f3531b = r1
                com.amap.api.col.3l.if$b r3 = new com.amap.api.col.3l.if$b
                java.lang.String r5 = "DEGRADE_BYERROR"
                r6 = 2
                r3.<init>(r5, r6, r6)
                com.amap.api.col.p0003l.Cif.b.f3532c = r3
                com.amap.api.col.3l.if$b r5 = new com.amap.api.col.3l.if$b
                java.lang.String r7 = "DEGRADE_ONLY"
                r8 = 3
                r5.<init>(r7, r8, r8)
                com.amap.api.col.p0003l.Cif.b.f3533d = r5
                com.amap.api.col.3l.if$b r7 = new com.amap.api.col.3l.if$b
                java.lang.String r9 = "FIX_NONDEGRADE"
                r10 = 4
                r7.<init>(r9, r10, r10)
                com.amap.api.col.p0003l.Cif.b.f3534e = r7
                com.amap.api.col.3l.if$b r9 = new com.amap.api.col.3l.if$b
                java.lang.String r11 = "FIX_DEGRADE_BYERROR"
                r12 = 5
                r9.<init>(r11, r12, r12)
                com.amap.api.col.p0003l.Cif.b.f3535f = r9
                com.amap.api.col.3l.if$b r11 = new com.amap.api.col.3l.if$b
                java.lang.String r13 = "FIX_DEGRADE_ONLY"
                r14 = 6
                r11.<init>(r13, r14, r14)
                com.amap.api.col.p0003l.Cif.b.f3536g = r11
                r13 = 7
                com.amap.api.col.3l.if$b[] r13 = new com.amap.api.col.p0003l.Cif.b[r13]
                r13[r2] = r0
                r13[r4] = r1
                r13[r6] = r3
                r13[r8] = r5
                r13[r10] = r7
                r13[r12] = r9
                r13[r14] = r11
                com.amap.api.col.p0003l.Cif.b.f3537i = r13
                return
        }

        b(java.lang.String r1, int r2, int r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.f3538h = r3
                return
        }

        public static com.amap.api.col.p0003l.Cif.b valueOf(java.lang.String r1) {
                java.lang.Class<com.amap.api.col.3l.if$b> r0 = com.amap.api.col.p0003l.Cif.b.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.amap.api.col.3l.if$b r1 = (com.amap.api.col.p0003l.Cif.b) r1
                return r1
        }

        public static com.amap.api.col.p0003l.Cif.b[] values() {
                com.amap.api.col.3l.if$b[] r0 = com.amap.api.col.p0003l.Cif.b.f3537i
                java.lang.Object r0 = r0.clone()
                com.amap.api.col.3l.if$b[] r0 = (com.amap.api.col.p0003l.Cif.b[]) r0
                return r0
        }

        public final int a() {
                r1 = this;
                int r0 = r1.f3538h
                return r0
        }

        public final boolean b() {
                r2 = this;
                int r0 = r2.f3538h
                com.amap.api.col.3l.if$b r1 = com.amap.api.col.p0003l.Cif.b.a
                int r1 = r1.f3538h
                if (r0 == r1) goto L17
                com.amap.api.col.3l.if$b r1 = com.amap.api.col.p0003l.Cif.b.f3531b
                int r1 = r1.f3538h
                if (r0 == r1) goto L17
                com.amap.api.col.3l.if$b r1 = com.amap.api.col.p0003l.Cif.b.f3534e
                int r1 = r1.f3538h
                if (r0 != r1) goto L15
                goto L17
            L15:
                r0 = 0
                return r0
            L17:
                r0 = 1
                return r0
        }

        public final boolean c() {
                r2 = this;
                int r0 = r2.f3538h
                com.amap.api.col.3l.if$b r1 = com.amap.api.col.p0003l.Cif.b.f3532c
                int r1 = r1.f3538h
                if (r0 == r1) goto L1d
                com.amap.api.col.3l.if$b r1 = com.amap.api.col.p0003l.Cif.b.f3533d
                int r1 = r1.f3538h
                if (r0 == r1) goto L1d
                com.amap.api.col.3l.if$b r1 = com.amap.api.col.p0003l.Cif.b.f3535f
                int r1 = r1.f3538h
                if (r0 == r1) goto L1d
                com.amap.api.col.3l.if$b r1 = com.amap.api.col.p0003l.Cif.b.f3536g
                int r1 = r1.f3538h
                if (r0 != r1) goto L1b
                goto L1d
            L1b:
                r0 = 0
                return r0
            L1d:
                r0 = 1
                return r0
        }

        public final boolean d() {
                r2 = this;
                int r0 = r2.f3538h
                com.amap.api.col.3l.if$b r1 = com.amap.api.col.p0003l.Cif.b.f3532c
                int r1 = r1.f3538h
                if (r0 == r1) goto L11
                com.amap.api.col.3l.if$b r1 = com.amap.api.col.p0003l.Cif.b.f3535f
                int r1 = r1.f3538h
                if (r0 != r1) goto Lf
                goto L11
            Lf:
                r0 = 0
                return r0
            L11:
                r0 = 1
                return r0
        }

        public final boolean e() {
                r2 = this;
                int r0 = r2.f3538h
                com.amap.api.col.3l.if$b r1 = com.amap.api.col.p0003l.Cif.b.f3531b
                int r1 = r1.f3538h
                if (r0 != r1) goto La
                r0 = 1
                return r0
            La:
                r0 = 0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.amap.api.col.3l.if$c */
    public enum c extends java.lang.Enum<com.amap.api.col.p0003l.Cif.c> {
        public static final com.amap.api.col.p0003l.Cif.c a = null;

        /* renamed from: b, reason: collision with root package name */
        public static final com.amap.api.col.p0003l.Cif.c f3539b = null;

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ com.amap.api.col.p0003l.Cif.c[] f3540d = null;

        /* renamed from: c, reason: collision with root package name */
        private int f3541c;

        static {
                com.amap.api.col.3l.if$c r0 = new com.amap.api.col.3l.if$c
                java.lang.String r1 = "HTTP"
                r2 = 0
                r0.<init>(r1, r2, r2)
                com.amap.api.col.p0003l.Cif.c.a = r0
                com.amap.api.col.3l.if$c r1 = new com.amap.api.col.3l.if$c
                java.lang.String r3 = "HTTPS"
                r4 = 1
                r1.<init>(r3, r4, r4)
                com.amap.api.col.p0003l.Cif.c.f3539b = r1
                r3 = 2
                com.amap.api.col.3l.if$c[] r3 = new com.amap.api.col.p0003l.Cif.c[r3]
                r3[r2] = r0
                r3[r4] = r1
                com.amap.api.col.p0003l.Cif.c.f3540d = r3
                return
        }

        c(java.lang.String r1, int r2, int r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.f3541c = r3
                return
        }

        public static com.amap.api.col.p0003l.Cif.c valueOf(java.lang.String r1) {
                java.lang.Class<com.amap.api.col.3l.if$c> r0 = com.amap.api.col.p0003l.Cif.c.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.amap.api.col.3l.if$c r1 = (com.amap.api.col.p0003l.Cif.c) r1
                return r1
        }

        public static com.amap.api.col.p0003l.Cif.c[] values() {
                com.amap.api.col.3l.if$c[] r0 = com.amap.api.col.p0003l.Cif.c.f3540d
                java.lang.Object r0 = r0.clone()
                com.amap.api.col.3l.if$c[] r0 = (com.amap.api.col.p0003l.Cif.c[]) r0
                return r0
        }
    }

    public Cif() {
            r2 = this;
            r2.<init>()
            r0 = 20000(0x4e20, float:2.8026E-41)
            r2.l = r0
            r2.m = r0
            r1 = 0
            r2.n = r1
            r1 = 0
            r2.a = r1
            r2.f3518b = r0
            r0 = 1
            r2.f3519c = r0
            com.amap.api.col.3l.if$a r0 = com.amap.api.col.p0003l.Cif.a.a
            r2.f3523g = r0
            com.amap.api.col.3l.if$b r0 = com.amap.api.col.p0003l.Cif.b.a
            r2.f3524h = r0
            return
    }

    private java.lang.String e(java.lang.String r3) {
            r2 = this;
            byte[] r0 = r2.getEntityBytes()
            if (r0 == 0) goto L34
            int r0 = r0.length
            if (r0 != 0) goto La
            goto L34
        La:
            java.util.Map r0 = r2.getParams()
            java.util.HashMap<java.lang.String, java.lang.String> r1 = com.amap.api.col.p0003l.s6.f3976e
            if (r1 == 0) goto L19
            if (r0 == 0) goto L18
            r0.putAll(r1)
            goto L19
        L18:
            r0 = r1
        L19:
            if (r0 != 0) goto L1c
            goto L34
        L1c:
            java.lang.String r0 = com.amap.api.col.p0003l.x6.i(r0)
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            r1.<init>()
            r1.append(r3)
            java.lang.String r3 = "?"
            r1.append(r3)
            r1.append(r0)
            java.lang.String r3 = r1.toString()
        L34:
            return r3
    }

    final java.lang.String a() {
            r1 = this;
            java.lang.String r0 = r1.getURL()
            java.lang.String r0 = r1.e(r0)
            return r0
    }

    final java.lang.String b() {
            r1 = this;
            java.lang.String r0 = r1.getIPV6URL()
            java.lang.String r0 = r1.e(r0)
            return r0
    }

    public int getConntectionTimeout() {
            r1 = this;
            int r0 = r1.l
            return r0
    }

    protected com.amap.api.col.p0003l.Cif.a getDegradeAbility() {
            r1 = this;
            com.amap.api.col.3l.if$a r0 = r1.f3523g
            return r0
    }

    protected com.amap.api.col.p0003l.Cif.b getDegradeType() {
            r1 = this;
            com.amap.api.col.3l.if$b r0 = r1.f3524h
            return r0
    }

    public byte[] getEntityBytes() {
            r1 = this;
            r0 = 0
            return r0
    }

    protected java.lang.String getIPDNSName() {
            r1 = this;
            java.lang.String r0 = ""
            return r0
    }

    public java.lang.String getIPV6URL() {
            r1 = this;
            java.lang.String r0 = r1.getURL()
            return r0
    }

    protected java.lang.String getNon_degrade_final_Host() {
            r1 = this;
            java.lang.String r0 = r1.f3520d
            return r0
    }

    public abstract java.util.Map<java.lang.String, java.lang.String> getParams();

    public java.net.Proxy getProxy() {
            r1 = this;
            java.net.Proxy r0 = r1.n
            return r0
    }

    protected int getReal_max_timeout() {
            r1 = this;
            int r0 = r1.f3518b
            return r0
    }

    public abstract java.util.Map<java.lang.String, java.lang.String> getRequestHead();

    public java.lang.String getSDKName() {
            r1 = this;
            java.lang.String r0 = ""
            return r0
    }

    public int getSoTimeout() {
            r1 = this;
            int r0 = r1.m
            return r0
    }

    public abstract java.lang.String getURL();

    public com.amap.api.col.3l.s6.a getUrlConnectionImpl() {
            r1 = this;
            com.amap.api.col.3l.s6$a r0 = r1.o
            return r0
    }

    protected boolean isBinary() {
            r1 = this;
            boolean r0 = r1.a
            return r0
    }

    protected boolean isHostToIP() {
            r1 = this;
            boolean r0 = r1.f3519c
            return r0
    }

    protected boolean isHttps() {
            r1 = this;
            boolean r0 = r1.f3522f
            return r0
    }

    protected boolean isIPRequest() {
            r1 = this;
            java.lang.String r0 = r1.getIPDNSName()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    protected boolean isIPV6Request() {
            r1 = this;
            boolean r0 = r1.f3521e
            return r0
    }

    public boolean isIgnoreGZip() {
            r1 = this;
            r0 = 0
            return r0
    }

    public boolean isSupportIPV6() {
            r1 = this;
            r0 = 0
            return r0
    }

    protected java.lang.String parseSDKNameFromPlatInfo(java.lang.String r9) {
            r8 = this;
            java.lang.String r0 = "="
            java.lang.String r1 = ""
            boolean r2 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Throwable -> L30
            if (r2 != 0) goto L66
            java.lang.String r2 = "&"
            java.lang.String[] r9 = r9.split(r2)     // Catch: java.lang.Throwable -> L30
            int r2 = r9.length     // Catch: java.lang.Throwable -> L30
            r3 = 1
            if (r2 <= r3) goto L66
            int r2 = r9.length     // Catch: java.lang.Throwable -> L30
            r4 = 0
            r5 = r1
        L17:
            if (r4 >= r2) goto L32
            r6 = r9[r4]     // Catch: java.lang.Throwable -> L30
            java.lang.String r7 = "sdkversion"
            boolean r7 = r6.contains(r7)     // Catch: java.lang.Throwable -> L30
            if (r7 == 0) goto L24
            r5 = r6
        L24:
            java.lang.String r7 = "product"
            boolean r7 = r6.contains(r7)     // Catch: java.lang.Throwable -> L30
            if (r7 == 0) goto L2d
            goto L33
        L2d:
            int r4 = r4 + 1
            goto L17
        L30:
            r9 = move-exception
            goto L67
        L32:
            r6 = r1
        L33:
            boolean r9 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> L30
            if (r9 != 0) goto L66
            java.lang.String[] r9 = r6.split(r0)     // Catch: java.lang.Throwable -> L30
            int r2 = r9.length     // Catch: java.lang.Throwable -> L30
            if (r2 <= r3) goto L66
            r9 = r9[r3]     // Catch: java.lang.Throwable -> L30
            java.lang.String r1 = r9.trim()     // Catch: java.lang.Throwable -> L30
            boolean r9 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L30
            if (r9 != 0) goto L66
            java.lang.String r9 = com.amap.api.col.p0003l.f5.a(r1)     // Catch: java.lang.Throwable -> L30
            boolean r9 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Throwable -> L30
            if (r9 == 0) goto L66
            java.lang.String[] r9 = r5.split(r0)     // Catch: java.lang.Throwable -> L30
            int r0 = r9.length     // Catch: java.lang.Throwable -> L30
            if (r0 <= r3) goto L66
            r9 = r9[r3]     // Catch: java.lang.Throwable -> L30
            java.lang.String r9 = r9.trim()     // Catch: java.lang.Throwable -> L30
            com.amap.api.col.p0003l.f5.b(r1, r9)     // Catch: java.lang.Throwable -> L30
        L66:
            return r1
        L67:
            java.lang.String r0 = "ht"
            java.lang.String r2 = "pnfp"
            com.amap.api.col.p0003l.r5.e(r9, r0, r2)
            return r1
    }

    protected java.lang.String parseSdkNameFromHeader(java.util.Map<java.lang.String, java.lang.String> r4) {
            r3 = this;
            java.lang.String r0 = "platinfo"
            r1 = 0
            if (r4 != 0) goto L6
            return r1
        L6:
            boolean r2 = r4.containsKey(r0)     // Catch: java.lang.Throwable -> L17
            if (r2 == 0) goto L19
            java.lang.Object r4 = r4.get(r0)     // Catch: java.lang.Throwable -> L17
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L17
            java.lang.String r4 = r3.parseSDKNameFromPlatInfo(r4)     // Catch: java.lang.Throwable -> L17
            return r4
        L17:
            r4 = move-exception
            goto L1a
        L19:
            return r1
        L1a:
            java.lang.String r0 = "ht"
            java.lang.String r2 = "pnfh"
            com.amap.api.col.p0003l.r5.e(r4, r0, r2)
            return r1
    }

    protected java.lang.String parseSdkNameFromRequest() {
            r4 = this;
            java.lang.String r0 = r4.getSDKName()     // Catch: java.lang.Throwable -> L25
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L1a
            if (r1 == 0) goto L24
            boolean r1 = r4.a     // Catch: java.lang.Throwable -> L1a
            if (r1 == 0) goto L1c
            r1 = r4
            com.amap.api.col.3l.t6 r1 = (com.amap.api.col.p0003l.t6) r1     // Catch: java.lang.Throwable -> L1a
            java.lang.String r1 = r1.g()     // Catch: java.lang.Throwable -> L1a
            java.lang.String r0 = r4.parseSDKNameFromPlatInfo(r1)     // Catch: java.lang.Throwable -> L1a
            return r0
        L1a:
            r1 = move-exception
            goto L28
        L1c:
            java.util.Map r1 = r4.getRequestHead()     // Catch: java.lang.Throwable -> L1a
            java.lang.String r0 = r4.parseSdkNameFromHeader(r1)     // Catch: java.lang.Throwable -> L1a
        L24:
            return r0
        L25:
            r1 = move-exception
            java.lang.String r0 = ""
        L28:
            java.lang.String r2 = "ht"
            java.lang.String r3 = "pnfr"
            com.amap.api.col.p0003l.r5.e(r1, r2, r3)
            return r0
    }

    public void setBinary(boolean r1) {
            r0 = this;
            r0.a = r1
            return
    }

    public final void setConnectionTimeout(int r1) {
            r0 = this;
            r0.l = r1
            return
    }

    public void setDegradeAbility(com.amap.api.col.p0003l.Cif.a r1) {
            r0 = this;
            r0.f3523g = r1
            return
    }

    public void setDegradeType(com.amap.api.col.p0003l.Cif.b r1) {
            r0 = this;
            r0.f3524h = r1
            return
    }

    public void setHostToIP(boolean r1) {
            r0 = this;
            r0.f3519c = r1
            return
    }

    public void setHttpProtocol(com.amap.api.col.p0003l.Cif.c r2) {
            r1 = this;
            com.amap.api.col.3l.if$c r0 = com.amap.api.col.p0003l.Cif.c.f3539b
            if (r2 != r0) goto L6
            r2 = 1
            goto L7
        L6:
            r2 = 0
        L7:
            r1.f3522f = r2
            return
    }

    public void setIPV6Request(boolean r1) {
            r0 = this;
            r0.f3521e = r1
            return
    }

    public void setNon_degrade_final_Host(java.lang.String r1) {
            r0 = this;
            r0.f3520d = r1
            return
    }

    public final void setProxy(java.net.Proxy r1) {
            r0 = this;
            r0.n = r1
            return
    }

    public void setReal_max_timeout(int r1) {
            r0 = this;
            r0.f3518b = r1
            return
    }

    public final void setSoTimeout(int r1) {
            r0 = this;
            r0.m = r1
            return
    }

    public void setUrlConnectionImpl(com.amap.api.col.3l.s6.a r1) {
            r0 = this;
            r0.o = r1
            return
    }
}

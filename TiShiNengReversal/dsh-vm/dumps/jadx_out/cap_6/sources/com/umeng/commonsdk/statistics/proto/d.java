package com.umeng.commonsdk.statistics.proto;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class d implements com.umeng.analytics.pro.br<com.umeng.commonsdk.statistics.proto.d, com.umeng.commonsdk.statistics.proto.d.e>, java.io.Serializable, java.lang.Cloneable {
    public static final java.util.Map<com.umeng.commonsdk.statistics.proto.d.e, com.umeng.analytics.pro.cd> d = null;
    private static final long e = 2846460275012375038L;
    private static final com.umeng.analytics.pro.cv f = null;
    private static final com.umeng.analytics.pro.cl g = null;
    private static final com.umeng.analytics.pro.cl h = null;
    private static final com.umeng.analytics.pro.cl i = null;
    private static final java.util.Map<java.lang.Class<? extends com.umeng.analytics.pro.cy>, com.umeng.analytics.pro.cz> j = null;
    private static final int k = 0;
    public java.util.Map<java.lang.String, com.umeng.commonsdk.statistics.proto.e> a;
    public int b;
    public java.lang.String c;
    private byte l;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.umeng.commonsdk.statistics.proto.d$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class a extends com.umeng.analytics.pro.da<com.umeng.commonsdk.statistics.proto.d> {
        private a() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ a(com.umeng.commonsdk.statistics.proto.d.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.umeng.analytics.pro.cy
        public /* synthetic */ void a(com.umeng.analytics.pro.cq r1, com.umeng.analytics.pro.br r2) throws com.umeng.analytics.pro.bx {
                r0 = this;
                com.umeng.commonsdk.statistics.proto.d r2 = (com.umeng.commonsdk.statistics.proto.d) r2
                r0.b(r1, r2)
                return
        }

        public void a(com.umeng.analytics.pro.cq r7, com.umeng.commonsdk.statistics.proto.d r8) throws com.umeng.analytics.pro.bx {
                r6 = this;
                r7.j()
            L3:
                com.umeng.analytics.pro.cl r0 = r7.l()
                byte r1 = r0.b
                if (r1 != 0) goto L33
                r7.k()
                boolean r7 = r8.h()
                if (r7 == 0) goto L18
                r8.l()
                return
            L18:
                com.umeng.analytics.pro.cr r7 = new com.umeng.analytics.pro.cr
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r0 = "Required field 'version' was not found in serialized data! Struct: "
                r8.append(r0)
                java.lang.String r0 = r6.toString()
                r8.append(r0)
                java.lang.String r8 = r8.toString()
                r7.<init>(r8)
                throw r7
            L33:
                short r0 = r0.c
                r2 = 2
                r3 = 1
                if (r0 == r3) goto L66
                if (r0 == r2) goto L54
                r2 = 3
                if (r0 == r2) goto L42
                com.umeng.analytics.pro.ct.a(r7, r1)
                goto L9c
            L42:
                r0 = 11
                if (r1 != r0) goto L50
                java.lang.String r0 = r7.z()
                r8.c = r0
                r8.c(r3)
                goto L9c
            L50:
                com.umeng.analytics.pro.ct.a(r7, r1)
                goto L9c
            L54:
                r0 = 8
                if (r1 != r0) goto L62
                int r0 = r7.w()
                r8.b = r0
                r8.b(r3)
                goto L9c
            L62:
                com.umeng.analytics.pro.ct.a(r7, r1)
                goto L9c
            L66:
                r0 = 13
                if (r1 != r0) goto L99
                com.umeng.analytics.pro.cn r0 = r7.n()
                java.util.HashMap r1 = new java.util.HashMap
                int r4 = r0.c
                int r4 = r4 * 2
                r1.<init>(r4)
                r8.a = r1
                r1 = 0
            L7a:
                int r2 = r0.c
                if (r1 >= r2) goto L92
                java.lang.String r2 = r7.z()
                com.umeng.commonsdk.statistics.proto.e r4 = new com.umeng.commonsdk.statistics.proto.e
                r4.<init>()
                r4.read(r7)
                java.util.Map<java.lang.String, com.umeng.commonsdk.statistics.proto.e> r5 = r8.a
                r5.put(r2, r4)
                int r1 = r1 + 1
                goto L7a
            L92:
                r7.o()
                r8.a(r3)
                goto L9c
            L99:
                com.umeng.analytics.pro.ct.a(r7, r1)
            L9c:
                r7.m()
                goto L3
        }

        @Override // com.umeng.analytics.pro.cy
        public /* synthetic */ void b(com.umeng.analytics.pro.cq r1, com.umeng.analytics.pro.br r2) throws com.umeng.analytics.pro.bx {
                r0 = this;
                com.umeng.commonsdk.statistics.proto.d r2 = (com.umeng.commonsdk.statistics.proto.d) r2
                r0.a(r1, r2)
                return
        }

        public void b(com.umeng.analytics.pro.cq r5, com.umeng.commonsdk.statistics.proto.d r6) throws com.umeng.analytics.pro.bx {
                r4 = this;
                r6.l()
                com.umeng.analytics.pro.cv r0 = com.umeng.commonsdk.statistics.proto.d.m()
                r5.a(r0)
                java.util.Map<java.lang.String, com.umeng.commonsdk.statistics.proto.e> r0 = r6.a
                if (r0 == 0) goto L56
                com.umeng.analytics.pro.cl r0 = com.umeng.commonsdk.statistics.proto.d.n()
                r5.a(r0)
                com.umeng.analytics.pro.cn r0 = new com.umeng.analytics.pro.cn
                java.util.Map<java.lang.String, com.umeng.commonsdk.statistics.proto.e> r1 = r6.a
                int r1 = r1.size()
                r2 = 11
                r3 = 12
                r0.<init>(r2, r3, r1)
                r5.a(r0)
                java.util.Map<java.lang.String, com.umeng.commonsdk.statistics.proto.e> r0 = r6.a
                java.util.Set r0 = r0.entrySet()
                java.util.Iterator r0 = r0.iterator()
            L31:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L50
                java.lang.Object r1 = r0.next()
                java.util.Map$Entry r1 = (java.util.Map.Entry) r1
                java.lang.Object r2 = r1.getKey()
                java.lang.String r2 = (java.lang.String) r2
                r5.a(r2)
                java.lang.Object r1 = r1.getValue()
                com.umeng.commonsdk.statistics.proto.e r1 = (com.umeng.commonsdk.statistics.proto.e) r1
                r1.write(r5)
                goto L31
            L50:
                r5.e()
                r5.c()
            L56:
                com.umeng.analytics.pro.cl r0 = com.umeng.commonsdk.statistics.proto.d.o()
                r5.a(r0)
                int r0 = r6.b
                r5.a(r0)
                r5.c()
                java.lang.String r0 = r6.c
                if (r0 == 0) goto L78
                com.umeng.analytics.pro.cl r0 = com.umeng.commonsdk.statistics.proto.d.p()
                r5.a(r0)
                java.lang.String r6 = r6.c
                r5.a(r6)
                r5.c()
            L78:
                r5.d()
                r5.b()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class b implements com.umeng.analytics.pro.cz {
        private b() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ b(com.umeng.commonsdk.statistics.proto.d.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public com.umeng.commonsdk.statistics.proto.d.a a() {
                r2 = this;
                com.umeng.commonsdk.statistics.proto.d$a r0 = new com.umeng.commonsdk.statistics.proto.d$a
                r1 = 0
                r0.<init>(r1)
                return r0
        }

        @Override // com.umeng.analytics.pro.cz
        public /* synthetic */ com.umeng.analytics.pro.cy b() {
                r1 = this;
                com.umeng.commonsdk.statistics.proto.d$a r0 = r1.a()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class c extends com.umeng.analytics.pro.db<com.umeng.commonsdk.statistics.proto.d> {
        private c() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ c(com.umeng.commonsdk.statistics.proto.d.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.umeng.analytics.pro.cy
        public /* bridge */ /* synthetic */ void a(com.umeng.analytics.pro.cq r1, com.umeng.analytics.pro.br r2) throws com.umeng.analytics.pro.bx {
                r0 = this;
                com.umeng.commonsdk.statistics.proto.d r2 = (com.umeng.commonsdk.statistics.proto.d) r2
                r0.a(r1, r2)
                return
        }

        public void a(com.umeng.analytics.pro.cq r4, com.umeng.commonsdk.statistics.proto.d r5) throws com.umeng.analytics.pro.bx {
                r3 = this;
                com.umeng.analytics.pro.cw r4 = (com.umeng.analytics.pro.cw) r4
                java.util.Map<java.lang.String, com.umeng.commonsdk.statistics.proto.e> r0 = r5.a
                int r0 = r0.size()
                r4.a(r0)
                java.util.Map<java.lang.String, com.umeng.commonsdk.statistics.proto.e> r0 = r5.a
                java.util.Set r0 = r0.entrySet()
                java.util.Iterator r0 = r0.iterator()
            L15:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L34
                java.lang.Object r1 = r0.next()
                java.util.Map$Entry r1 = (java.util.Map.Entry) r1
                java.lang.Object r2 = r1.getKey()
                java.lang.String r2 = (java.lang.String) r2
                r4.a(r2)
                java.lang.Object r1 = r1.getValue()
                com.umeng.commonsdk.statistics.proto.e r1 = (com.umeng.commonsdk.statistics.proto.e) r1
                r1.write(r4)
                goto L15
            L34:
                int r0 = r5.b
                r4.a(r0)
                java.lang.String r5 = r5.c
                r4.a(r5)
                return
        }

        @Override // com.umeng.analytics.pro.cy
        public /* bridge */ /* synthetic */ void b(com.umeng.analytics.pro.cq r1, com.umeng.analytics.pro.br r2) throws com.umeng.analytics.pro.bx {
                r0 = this;
                com.umeng.commonsdk.statistics.proto.d r2 = (com.umeng.commonsdk.statistics.proto.d) r2
                r0.b(r1, r2)
                return
        }

        public void b(com.umeng.analytics.pro.cq r6, com.umeng.commonsdk.statistics.proto.d r7) throws com.umeng.analytics.pro.bx {
                r5 = this;
                com.umeng.analytics.pro.cw r6 = (com.umeng.analytics.pro.cw) r6
                com.umeng.analytics.pro.cn r0 = new com.umeng.analytics.pro.cn
                r1 = 12
                int r2 = r6.w()
                r3 = 11
                r0.<init>(r3, r1, r2)
                java.util.HashMap r1 = new java.util.HashMap
                int r2 = r0.c
                int r2 = r2 * 2
                r1.<init>(r2)
                r7.a = r1
                r1 = 0
            L1b:
                int r2 = r0.c
                if (r1 >= r2) goto L33
                java.lang.String r2 = r6.z()
                com.umeng.commonsdk.statistics.proto.e r3 = new com.umeng.commonsdk.statistics.proto.e
                r3.<init>()
                r3.read(r6)
                java.util.Map<java.lang.String, com.umeng.commonsdk.statistics.proto.e> r4 = r7.a
                r4.put(r2, r3)
                int r1 = r1 + 1
                goto L1b
            L33:
                r0 = 1
                r7.a(r0)
                int r1 = r6.w()
                r7.b = r1
                r7.b(r0)
                java.lang.String r6 = r6.z()
                r7.c = r6
                r7.c(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.umeng.commonsdk.statistics.proto.d$d, reason: collision with other inner class name */
    private static class C0055d implements com.umeng.analytics.pro.cz {
        private C0055d() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ C0055d(com.umeng.commonsdk.statistics.proto.d.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public com.umeng.commonsdk.statistics.proto.d.c a() {
                r2 = this;
                com.umeng.commonsdk.statistics.proto.d$c r0 = new com.umeng.commonsdk.statistics.proto.d$c
                r1 = 0
                r0.<init>(r1)
                return r0
        }

        @Override // com.umeng.analytics.pro.cz
        public /* synthetic */ com.umeng.analytics.pro.cy b() {
                r1 = this;
                com.umeng.commonsdk.statistics.proto.d$c r0 = r1.a()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum e extends java.lang.Enum<com.umeng.commonsdk.statistics.proto.d.e> implements com.umeng.analytics.pro.by {
        public static final com.umeng.commonsdk.statistics.proto.d.e a = null;
        public static final com.umeng.commonsdk.statistics.proto.d.e b = null;
        public static final com.umeng.commonsdk.statistics.proto.d.e c = null;
        private static final java.util.Map<java.lang.String, com.umeng.commonsdk.statistics.proto.d.e> d = null;
        private static final /* synthetic */ com.umeng.commonsdk.statistics.proto.d.e[] g = null;
        private final short e;
        private final java.lang.String f;

        static {
                com.umeng.commonsdk.statistics.proto.d$e r0 = new com.umeng.commonsdk.statistics.proto.d$e
                java.lang.String r1 = "property"
                java.lang.String r2 = "PROPERTY"
                r3 = 0
                r4 = 1
                r0.<init>(r2, r3, r4, r1)
                com.umeng.commonsdk.statistics.proto.d.e.a = r0
                com.umeng.commonsdk.statistics.proto.d$e r1 = new com.umeng.commonsdk.statistics.proto.d$e
                java.lang.String r2 = "version"
                java.lang.String r5 = "VERSION"
                r6 = 2
                r1.<init>(r5, r4, r6, r2)
                com.umeng.commonsdk.statistics.proto.d.e.b = r1
                com.umeng.commonsdk.statistics.proto.d$e r2 = new com.umeng.commonsdk.statistics.proto.d$e
                java.lang.String r5 = "checksum"
                java.lang.String r7 = "CHECKSUM"
                r8 = 3
                r2.<init>(r7, r6, r8, r5)
                com.umeng.commonsdk.statistics.proto.d.e.c = r2
                com.umeng.commonsdk.statistics.proto.d$e[] r5 = new com.umeng.commonsdk.statistics.proto.d.e[r8]
                r5[r3] = r0
                r5[r4] = r1
                r5[r6] = r2
                com.umeng.commonsdk.statistics.proto.d.e.g = r5
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                com.umeng.commonsdk.statistics.proto.d.e.d = r0
                java.lang.Class<com.umeng.commonsdk.statistics.proto.d$e> r0 = com.umeng.commonsdk.statistics.proto.d.e.class
                java.util.EnumSet r0 = java.util.EnumSet.allOf(r0)
                java.util.Iterator r0 = r0.iterator()
            L40:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L56
                java.lang.Object r1 = r0.next()
                com.umeng.commonsdk.statistics.proto.d$e r1 = (com.umeng.commonsdk.statistics.proto.d.e) r1
                java.util.Map<java.lang.String, com.umeng.commonsdk.statistics.proto.d$e> r2 = com.umeng.commonsdk.statistics.proto.d.e.d
                java.lang.String r3 = r1.b()
                r2.put(r3, r1)
                goto L40
            L56:
                return
        }

        e(java.lang.String r1, int r2, short r3, java.lang.String r4) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.e = r3
                r0.f = r4
                return
        }

        public static com.umeng.commonsdk.statistics.proto.d.e a(int r1) {
                r0 = 1
                if (r1 == r0) goto L11
                r0 = 2
                if (r1 == r0) goto Le
                r0 = 3
                if (r1 == r0) goto Lb
                r1 = 0
                return r1
            Lb:
                com.umeng.commonsdk.statistics.proto.d$e r1 = com.umeng.commonsdk.statistics.proto.d.e.c
                return r1
            Le:
                com.umeng.commonsdk.statistics.proto.d$e r1 = com.umeng.commonsdk.statistics.proto.d.e.b
                return r1
            L11:
                com.umeng.commonsdk.statistics.proto.d$e r1 = com.umeng.commonsdk.statistics.proto.d.e.a
                return r1
        }

        public static com.umeng.commonsdk.statistics.proto.d.e a(java.lang.String r1) {
                java.util.Map<java.lang.String, com.umeng.commonsdk.statistics.proto.d$e> r0 = com.umeng.commonsdk.statistics.proto.d.e.d
                java.lang.Object r1 = r0.get(r1)
                com.umeng.commonsdk.statistics.proto.d$e r1 = (com.umeng.commonsdk.statistics.proto.d.e) r1
                return r1
        }

        public static com.umeng.commonsdk.statistics.proto.d.e b(int r3) {
                com.umeng.commonsdk.statistics.proto.d$e r0 = a(r3)
                if (r0 == 0) goto L7
                return r0
            L7:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Field "
                r1.append(r2)
                r1.append(r3)
                java.lang.String r3 = " doesn't exist!"
                r1.append(r3)
                java.lang.String r3 = r1.toString()
                r0.<init>(r3)
                throw r0
        }

        public static com.umeng.commonsdk.statistics.proto.d.e valueOf(java.lang.String r1) {
                java.lang.Class<com.umeng.commonsdk.statistics.proto.d$e> r0 = com.umeng.commonsdk.statistics.proto.d.e.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.umeng.commonsdk.statistics.proto.d$e r1 = (com.umeng.commonsdk.statistics.proto.d.e) r1
                return r1
        }

        public static com.umeng.commonsdk.statistics.proto.d.e[] values() {
                com.umeng.commonsdk.statistics.proto.d$e[] r0 = com.umeng.commonsdk.statistics.proto.d.e.g
                java.lang.Object r0 = r0.clone()
                com.umeng.commonsdk.statistics.proto.d$e[] r0 = (com.umeng.commonsdk.statistics.proto.d.e[]) r0
                return r0
        }

        @Override // com.umeng.analytics.pro.by
        public short a() {
                r1 = this;
                short r0 = r1.e
                return r0
        }

        @Override // com.umeng.analytics.pro.by
        public java.lang.String b() {
                r1 = this;
                java.lang.String r0 = r1.f
                return r0
        }
    }

    static {
            com.umeng.analytics.pro.cv r0 = new com.umeng.analytics.pro.cv
            java.lang.String r1 = "Imprint"
            r0.<init>(r1)
            com.umeng.commonsdk.statistics.proto.d.f = r0
            com.umeng.analytics.pro.cl r0 = new com.umeng.analytics.pro.cl
            java.lang.String r1 = "property"
            r2 = 13
            r3 = 1
            r0.<init>(r1, r2, r3)
            com.umeng.commonsdk.statistics.proto.d.g = r0
            com.umeng.analytics.pro.cl r0 = new com.umeng.analytics.pro.cl
            r4 = 2
            java.lang.String r5 = "version"
            r6 = 8
            r0.<init>(r5, r6, r4)
            com.umeng.commonsdk.statistics.proto.d.h = r0
            com.umeng.analytics.pro.cl r0 = new com.umeng.analytics.pro.cl
            r4 = 3
            java.lang.String r7 = "checksum"
            r8 = 11
            r0.<init>(r7, r8, r4)
            com.umeng.commonsdk.statistics.proto.d.i = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.umeng.commonsdk.statistics.proto.d.j = r0
            com.umeng.commonsdk.statistics.proto.d$b r4 = new com.umeng.commonsdk.statistics.proto.d$b
            r9 = 0
            r4.<init>(r9)
            java.lang.Class<com.umeng.analytics.pro.da> r10 = com.umeng.analytics.pro.da.class
            r0.put(r10, r4)
            com.umeng.commonsdk.statistics.proto.d$d r4 = new com.umeng.commonsdk.statistics.proto.d$d
            r4.<init>(r9)
            java.lang.Class<com.umeng.analytics.pro.db> r9 = com.umeng.analytics.pro.db.class
            r0.put(r9, r4)
            java.util.EnumMap r0 = new java.util.EnumMap
            java.lang.Class<com.umeng.commonsdk.statistics.proto.d$e> r4 = com.umeng.commonsdk.statistics.proto.d.e.class
            r0.<init>(r4)
            com.umeng.commonsdk.statistics.proto.d$e r4 = com.umeng.commonsdk.statistics.proto.d.e.a
            com.umeng.analytics.pro.cd r9 = new com.umeng.analytics.pro.cd
            com.umeng.analytics.pro.cg r10 = new com.umeng.analytics.pro.cg
            com.umeng.analytics.pro.ce r11 = new com.umeng.analytics.pro.ce
            r11.<init>(r8)
            com.umeng.analytics.pro.ci r12 = new com.umeng.analytics.pro.ci
            r13 = 12
            java.lang.Class<com.umeng.commonsdk.statistics.proto.e> r14 = com.umeng.commonsdk.statistics.proto.e.class
            r12.<init>(r13, r14)
            r10.<init>(r2, r11, r12)
            r9.<init>(r1, r3, r10)
            r0.put(r4, r9)
            com.umeng.commonsdk.statistics.proto.d$e r1 = com.umeng.commonsdk.statistics.proto.d.e.b
            com.umeng.analytics.pro.cd r2 = new com.umeng.analytics.pro.cd
            com.umeng.analytics.pro.ce r4 = new com.umeng.analytics.pro.ce
            r4.<init>(r6)
            r2.<init>(r5, r3, r4)
            r0.put(r1, r2)
            com.umeng.commonsdk.statistics.proto.d$e r1 = com.umeng.commonsdk.statistics.proto.d.e.c
            com.umeng.analytics.pro.cd r2 = new com.umeng.analytics.pro.cd
            com.umeng.analytics.pro.ce r4 = new com.umeng.analytics.pro.ce
            r4.<init>(r8)
            r2.<init>(r7, r3, r4)
            r0.put(r1, r2)
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)
            com.umeng.commonsdk.statistics.proto.d.d = r0
            java.lang.Class<com.umeng.commonsdk.statistics.proto.d> r1 = com.umeng.commonsdk.statistics.proto.d.class
            com.umeng.analytics.pro.cd.a(r1, r0)
            return
    }

    public d() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.l = r0
            return
    }

    public d(com.umeng.commonsdk.statistics.proto.d r6) {
            r5 = this;
            r5.<init>()
            r0 = 0
            r5.l = r0
            byte r0 = r6.l
            r5.l = r0
            boolean r0 = r6.e()
            if (r0 == 0) goto L42
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Map<java.lang.String, com.umeng.commonsdk.statistics.proto.e> r1 = r6.a
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L1f:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L40
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r2.getValue()
            com.umeng.commonsdk.statistics.proto.e r2 = (com.umeng.commonsdk.statistics.proto.e) r2
            com.umeng.commonsdk.statistics.proto.e r4 = new com.umeng.commonsdk.statistics.proto.e
            r4.<init>(r2)
            r0.put(r3, r4)
            goto L1f
        L40:
            r5.a = r0
        L42:
            int r0 = r6.b
            r5.b = r0
            boolean r0 = r6.k()
            if (r0 == 0) goto L50
            java.lang.String r6 = r6.c
            r5.c = r6
        L50:
            return
    }

    public d(java.util.Map<java.lang.String, com.umeng.commonsdk.statistics.proto.e> r1, int r2, java.lang.String r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r1 = 1
            r0.b(r1)
            r0.c = r3
            return
    }

    private void a(java.io.ObjectInputStream r3) throws java.io.IOException, java.lang.ClassNotFoundException {
            r2 = this;
            r0 = 0
            r2.l = r0     // Catch: com.umeng.analytics.pro.bx -> L11
            com.umeng.analytics.pro.ck r0 = new com.umeng.analytics.pro.ck     // Catch: com.umeng.analytics.pro.bx -> L11
            com.umeng.analytics.pro.dc r1 = new com.umeng.analytics.pro.dc     // Catch: com.umeng.analytics.pro.bx -> L11
            r1.<init>(r3)     // Catch: com.umeng.analytics.pro.bx -> L11
            r0.<init>(r1)     // Catch: com.umeng.analytics.pro.bx -> L11
            r2.read(r0)     // Catch: com.umeng.analytics.pro.bx -> L11
            return
        L11:
            r3 = move-exception
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r3 = r3.getMessage()
            r0.<init>(r3)
            throw r0
    }

    private void a(java.io.ObjectOutputStream r3) throws java.io.IOException {
            r2 = this;
            com.umeng.analytics.pro.ck r0 = new com.umeng.analytics.pro.ck     // Catch: com.umeng.analytics.pro.bx -> Le
            com.umeng.analytics.pro.dc r1 = new com.umeng.analytics.pro.dc     // Catch: com.umeng.analytics.pro.bx -> Le
            r1.<init>(r3)     // Catch: com.umeng.analytics.pro.bx -> Le
            r0.<init>(r1)     // Catch: com.umeng.analytics.pro.bx -> Le
            r2.write(r0)     // Catch: com.umeng.analytics.pro.bx -> Le
            return
        Le:
            r3 = move-exception
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r3 = r3.getMessage()
            r0.<init>(r3)
            throw r0
    }

    static /* synthetic */ com.umeng.analytics.pro.cv m() {
            com.umeng.analytics.pro.cv r0 = com.umeng.commonsdk.statistics.proto.d.f
            return r0
    }

    static /* synthetic */ com.umeng.analytics.pro.cl n() {
            com.umeng.analytics.pro.cl r0 = com.umeng.commonsdk.statistics.proto.d.g
            return r0
    }

    static /* synthetic */ com.umeng.analytics.pro.cl o() {
            com.umeng.analytics.pro.cl r0 = com.umeng.commonsdk.statistics.proto.d.h
            return r0
    }

    static /* synthetic */ com.umeng.analytics.pro.cl p() {
            com.umeng.analytics.pro.cl r0 = com.umeng.commonsdk.statistics.proto.d.i
            return r0
    }

    public com.umeng.commonsdk.statistics.proto.d a() {
            r1 = this;
            com.umeng.commonsdk.statistics.proto.d r0 = new com.umeng.commonsdk.statistics.proto.d
            r0.<init>(r1)
            return r0
    }

    public com.umeng.commonsdk.statistics.proto.d a(int r1) {
            r0 = this;
            r0.b = r1
            r1 = 1
            r0.b(r1)
            return r0
    }

    public com.umeng.commonsdk.statistics.proto.d a(java.lang.String r1) {
            r0 = this;
            r0.c = r1
            return r0
    }

    public com.umeng.commonsdk.statistics.proto.d a(java.util.Map<java.lang.String, com.umeng.commonsdk.statistics.proto.e> r1) {
            r0 = this;
            r0.a = r1
            return r0
    }

    public void a(java.lang.String r2, com.umeng.commonsdk.statistics.proto.e r3) {
            r1 = this;
            java.util.Map<java.lang.String, com.umeng.commonsdk.statistics.proto.e> r0 = r1.a
            if (r0 != 0) goto Lb
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.a = r0
        Lb:
            java.util.Map<java.lang.String, com.umeng.commonsdk.statistics.proto.e> r0 = r1.a
            r0.put(r2, r3)
            return
    }

    public void a(boolean r1) {
            r0 = this;
            if (r1 != 0) goto L5
            r1 = 0
            r0.a = r1
        L5:
            return
    }

    public int b() {
            r1 = this;
            java.util.Map<java.lang.String, com.umeng.commonsdk.statistics.proto.e> r0 = r1.a
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            int r0 = r0.size()
            return r0
    }

    public com.umeng.commonsdk.statistics.proto.d.e b(int r1) {
            r0 = this;
            com.umeng.commonsdk.statistics.proto.d$e r1 = com.umeng.commonsdk.statistics.proto.d.e.a(r1)
            return r1
    }

    public void b(boolean r3) {
            r2 = this;
            byte r0 = r2.l
            r1 = 0
            byte r3 = com.umeng.analytics.pro.bo.a(r0, r1, r3)
            r2.l = r3
            return
    }

    public java.util.Map<java.lang.String, com.umeng.commonsdk.statistics.proto.e> c() {
            r1 = this;
            java.util.Map<java.lang.String, com.umeng.commonsdk.statistics.proto.e> r0 = r1.a
            return r0
    }

    public void c(boolean r1) {
            r0 = this;
            if (r1 != 0) goto L5
            r1 = 0
            r0.c = r1
        L5:
            return
    }

    @Override // com.umeng.analytics.pro.br
    public void clear() {
            r2 = this;
            r0 = 0
            r2.a = r0
            r1 = 0
            r2.b(r1)
            r2.b = r1
            r2.c = r0
            return
    }

    public void d() {
            r1 = this;
            r0 = 0
            r1.a = r0
            return
    }

    @Override // com.umeng.analytics.pro.br
    public /* synthetic */ com.umeng.analytics.pro.br<com.umeng.commonsdk.statistics.proto.d, com.umeng.commonsdk.statistics.proto.d.e> deepCopy() {
            r1 = this;
            com.umeng.commonsdk.statistics.proto.d r0 = r1.a()
            return r0
    }

    public boolean e() {
            r1 = this;
            java.util.Map<java.lang.String, com.umeng.commonsdk.statistics.proto.e> r0 = r1.a
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public int f() {
            r1 = this;
            int r0 = r1.b
            return r0
    }

    @Override // com.umeng.analytics.pro.br
    public /* synthetic */ com.umeng.commonsdk.statistics.proto.d.e fieldForId(int r1) {
            r0 = this;
            com.umeng.commonsdk.statistics.proto.d$e r1 = r0.b(r1)
            return r1
    }

    public void g() {
            r2 = this;
            byte r0 = r2.l
            r1 = 0
            byte r0 = com.umeng.analytics.pro.bo.b(r0, r1)
            r2.l = r0
            return
    }

    public boolean h() {
            r2 = this;
            byte r0 = r2.l
            r1 = 0
            boolean r0 = com.umeng.analytics.pro.bo.a(r0, r1)
            return r0
    }

    public java.lang.String i() {
            r1 = this;
            java.lang.String r0 = r1.c
            return r0
    }

    public void j() {
            r1 = this;
            r0 = 0
            r1.c = r0
            return
    }

    public boolean k() {
            r1 = this;
            java.lang.String r0 = r1.c
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public void l() throws com.umeng.analytics.pro.bx {
            r3 = this;
            java.util.Map<java.lang.String, com.umeng.commonsdk.statistics.proto.e> r0 = r3.a
            if (r0 == 0) goto L24
            java.lang.String r0 = r3.c
            if (r0 == 0) goto L9
            return
        L9:
            com.umeng.analytics.pro.cr r0 = new com.umeng.analytics.pro.cr
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Required field 'checksum' was not present! Struct: "
            r1.append(r2)
            java.lang.String r2 = r3.toString()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L24:
            com.umeng.analytics.pro.cr r0 = new com.umeng.analytics.pro.cr
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Required field 'property' was not present! Struct: "
            r1.append(r2)
            java.lang.String r2 = r3.toString()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @Override // com.umeng.analytics.pro.br
    public void read(com.umeng.analytics.pro.cq r3) throws com.umeng.analytics.pro.bx {
            r2 = this;
            java.util.Map<java.lang.Class<? extends com.umeng.analytics.pro.cy>, com.umeng.analytics.pro.cz> r0 = com.umeng.commonsdk.statistics.proto.d.j
            java.lang.Class r1 = r3.D()
            java.lang.Object r0 = r0.get(r1)
            com.umeng.analytics.pro.cz r0 = (com.umeng.analytics.pro.cz) r0
            com.umeng.analytics.pro.cy r0 = r0.b()
            r0.b(r3, r2)
            return
    }

    public java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Imprint("
            r0.<init>(r1)
            java.lang.String r1 = "property:"
            r0.append(r1)
            java.util.Map<java.lang.String, com.umeng.commonsdk.statistics.proto.e> r1 = r4.a
            java.lang.String r2 = "null"
            if (r1 != 0) goto L16
            r0.append(r2)
            goto L19
        L16:
            r0.append(r1)
        L19:
            java.lang.String r1 = ", "
            r0.append(r1)
            java.lang.String r3 = "version:"
            r0.append(r3)
            int r3 = r4.b
            r0.append(r3)
            r0.append(r1)
            java.lang.String r1 = "checksum:"
            r0.append(r1)
            java.lang.String r1 = r4.c
            if (r1 != 0) goto L38
            r0.append(r2)
            goto L3b
        L38:
            r0.append(r1)
        L3b:
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // com.umeng.analytics.pro.br
    public void write(com.umeng.analytics.pro.cq r3) throws com.umeng.analytics.pro.bx {
            r2 = this;
            java.util.Map<java.lang.Class<? extends com.umeng.analytics.pro.cy>, com.umeng.analytics.pro.cz> r0 = com.umeng.commonsdk.statistics.proto.d.j
            java.lang.Class r1 = r3.D()
            java.lang.Object r0 = r0.get(r1)
            com.umeng.analytics.pro.cz r0 = (com.umeng.analytics.pro.cz) r0
            com.umeng.analytics.pro.cy r0 = r0.b()
            r0.a(r3, r2)
            return
    }
}

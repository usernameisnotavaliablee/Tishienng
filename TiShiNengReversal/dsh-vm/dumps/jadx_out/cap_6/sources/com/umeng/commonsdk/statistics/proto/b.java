package com.umeng.commonsdk.statistics.proto;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class b implements com.umeng.analytics.pro.br<com.umeng.commonsdk.statistics.proto.b, com.umeng.commonsdk.statistics.proto.b.e>, java.io.Serializable, java.lang.Cloneable {
    public static final java.util.Map<com.umeng.commonsdk.statistics.proto.b.e, com.umeng.analytics.pro.cd> d = null;
    private static final long e = -6496538196005191531L;
    private static final com.umeng.analytics.pro.cv f = null;
    private static final com.umeng.analytics.pro.cl g = null;
    private static final com.umeng.analytics.pro.cl h = null;
    private static final com.umeng.analytics.pro.cl i = null;
    private static final java.util.Map<java.lang.Class<? extends com.umeng.analytics.pro.cy>, com.umeng.analytics.pro.cz> j = null;
    private static final int k = 0;
    private static final int l = 1;
    public java.lang.String a;
    public long b;
    public int c;
    private byte m;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.umeng.commonsdk.statistics.proto.b$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class a extends com.umeng.analytics.pro.da<com.umeng.commonsdk.statistics.proto.b> {
        private a() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ a(com.umeng.commonsdk.statistics.proto.b.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.umeng.analytics.pro.cy
        public /* synthetic */ void a(com.umeng.analytics.pro.cq r1, com.umeng.analytics.pro.br r2) throws com.umeng.analytics.pro.bx {
                r0 = this;
                com.umeng.commonsdk.statistics.proto.b r2 = (com.umeng.commonsdk.statistics.proto.b) r2
                r0.b(r1, r2)
                return
        }

        public void a(com.umeng.analytics.pro.cq r5, com.umeng.commonsdk.statistics.proto.b r6) throws com.umeng.analytics.pro.bx {
                r4 = this;
                r5.j()
            L3:
                com.umeng.analytics.pro.cl r0 = r5.l()
                byte r1 = r0.b
                if (r1 != 0) goto L54
                r5.k()
                boolean r5 = r6.g()
                if (r5 == 0) goto L39
                boolean r5 = r6.j()
                if (r5 == 0) goto L1e
                r6.k()
                return
            L1e:
                com.umeng.analytics.pro.cr r5 = new com.umeng.analytics.pro.cr
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r0 = "Required field 'version' was not found in serialized data! Struct: "
                r6.append(r0)
                java.lang.String r0 = r4.toString()
                r6.append(r0)
                java.lang.String r6 = r6.toString()
                r5.<init>(r6)
                throw r5
            L39:
                com.umeng.analytics.pro.cr r5 = new com.umeng.analytics.pro.cr
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r0 = "Required field 'ts' was not found in serialized data! Struct: "
                r6.append(r0)
                java.lang.String r0 = r4.toString()
                r6.append(r0)
                java.lang.String r6 = r6.toString()
                r5.<init>(r6)
                throw r5
            L54:
                short r0 = r0.c
                r2 = 1
                if (r0 == r2) goto L87
                r3 = 2
                if (r0 == r3) goto L75
                r3 = 3
                if (r0 == r3) goto L63
                com.umeng.analytics.pro.ct.a(r5, r1)
                goto L98
            L63:
                r0 = 8
                if (r1 != r0) goto L71
                int r0 = r5.w()
                r6.c = r0
                r6.c(r2)
                goto L98
            L71:
                com.umeng.analytics.pro.ct.a(r5, r1)
                goto L98
            L75:
                r0 = 10
                if (r1 != r0) goto L83
                long r0 = r5.x()
                r6.b = r0
                r6.b(r2)
                goto L98
            L83:
                com.umeng.analytics.pro.ct.a(r5, r1)
                goto L98
            L87:
                r0 = 11
                if (r1 != r0) goto L95
                java.lang.String r0 = r5.z()
                r6.a = r0
                r6.a(r2)
                goto L98
            L95:
                com.umeng.analytics.pro.ct.a(r5, r1)
            L98:
                r5.m()
                goto L3
        }

        @Override // com.umeng.analytics.pro.cy
        public /* synthetic */ void b(com.umeng.analytics.pro.cq r1, com.umeng.analytics.pro.br r2) throws com.umeng.analytics.pro.bx {
                r0 = this;
                com.umeng.commonsdk.statistics.proto.b r2 = (com.umeng.commonsdk.statistics.proto.b) r2
                r0.a(r1, r2)
                return
        }

        public void b(com.umeng.analytics.pro.cq r3, com.umeng.commonsdk.statistics.proto.b r4) throws com.umeng.analytics.pro.bx {
                r2 = this;
                r4.k()
                com.umeng.analytics.pro.cv r0 = com.umeng.commonsdk.statistics.proto.b.l()
                r3.a(r0)
                java.lang.String r0 = r4.a
                if (r0 == 0) goto L1d
                com.umeng.analytics.pro.cl r0 = com.umeng.commonsdk.statistics.proto.b.m()
                r3.a(r0)
                java.lang.String r0 = r4.a
                r3.a(r0)
                r3.c()
            L1d:
                com.umeng.analytics.pro.cl r0 = com.umeng.commonsdk.statistics.proto.b.n()
                r3.a(r0)
                long r0 = r4.b
                r3.a(r0)
                r3.c()
                com.umeng.analytics.pro.cl r0 = com.umeng.commonsdk.statistics.proto.b.o()
                r3.a(r0)
                int r4 = r4.c
                r3.a(r4)
                r3.c()
                r3.d()
                r3.b()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.umeng.commonsdk.statistics.proto.b$b, reason: collision with other inner class name */
    private static class C0053b implements com.umeng.analytics.pro.cz {
        private C0053b() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ C0053b(com.umeng.commonsdk.statistics.proto.b.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public com.umeng.commonsdk.statistics.proto.b.a a() {
                r2 = this;
                com.umeng.commonsdk.statistics.proto.b$a r0 = new com.umeng.commonsdk.statistics.proto.b$a
                r1 = 0
                r0.<init>(r1)
                return r0
        }

        @Override // com.umeng.analytics.pro.cz
        public /* synthetic */ com.umeng.analytics.pro.cy b() {
                r1 = this;
                com.umeng.commonsdk.statistics.proto.b$a r0 = r1.a()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class c extends com.umeng.analytics.pro.db<com.umeng.commonsdk.statistics.proto.b> {
        private c() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ c(com.umeng.commonsdk.statistics.proto.b.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.umeng.analytics.pro.cy
        public /* bridge */ /* synthetic */ void a(com.umeng.analytics.pro.cq r1, com.umeng.analytics.pro.br r2) throws com.umeng.analytics.pro.bx {
                r0 = this;
                com.umeng.commonsdk.statistics.proto.b r2 = (com.umeng.commonsdk.statistics.proto.b) r2
                r0.a(r1, r2)
                return
        }

        public void a(com.umeng.analytics.pro.cq r3, com.umeng.commonsdk.statistics.proto.b r4) throws com.umeng.analytics.pro.bx {
                r2 = this;
                com.umeng.analytics.pro.cw r3 = (com.umeng.analytics.pro.cw) r3
                java.lang.String r0 = r4.a
                r3.a(r0)
                long r0 = r4.b
                r3.a(r0)
                int r4 = r4.c
                r3.a(r4)
                return
        }

        @Override // com.umeng.analytics.pro.cy
        public /* bridge */ /* synthetic */ void b(com.umeng.analytics.pro.cq r1, com.umeng.analytics.pro.br r2) throws com.umeng.analytics.pro.bx {
                r0 = this;
                com.umeng.commonsdk.statistics.proto.b r2 = (com.umeng.commonsdk.statistics.proto.b) r2
                r0.b(r1, r2)
                return
        }

        public void b(com.umeng.analytics.pro.cq r4, com.umeng.commonsdk.statistics.proto.b r5) throws com.umeng.analytics.pro.bx {
                r3 = this;
                com.umeng.analytics.pro.cw r4 = (com.umeng.analytics.pro.cw) r4
                java.lang.String r0 = r4.z()
                r5.a = r0
                r0 = 1
                r5.a(r0)
                long r1 = r4.x()
                r5.b = r1
                r5.b(r0)
                int r4 = r4.w()
                r5.c = r4
                r5.c(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class d implements com.umeng.analytics.pro.cz {
        private d() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ d(com.umeng.commonsdk.statistics.proto.b.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public com.umeng.commonsdk.statistics.proto.b.c a() {
                r2 = this;
                com.umeng.commonsdk.statistics.proto.b$c r0 = new com.umeng.commonsdk.statistics.proto.b$c
                r1 = 0
                r0.<init>(r1)
                return r0
        }

        @Override // com.umeng.analytics.pro.cz
        public /* synthetic */ com.umeng.analytics.pro.cy b() {
                r1 = this;
                com.umeng.commonsdk.statistics.proto.b$c r0 = r1.a()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum e extends java.lang.Enum<com.umeng.commonsdk.statistics.proto.b.e> implements com.umeng.analytics.pro.by {
        public static final com.umeng.commonsdk.statistics.proto.b.e a = null;
        public static final com.umeng.commonsdk.statistics.proto.b.e b = null;
        public static final com.umeng.commonsdk.statistics.proto.b.e c = null;
        private static final java.util.Map<java.lang.String, com.umeng.commonsdk.statistics.proto.b.e> d = null;
        private static final /* synthetic */ com.umeng.commonsdk.statistics.proto.b.e[] g = null;
        private final short e;
        private final java.lang.String f;

        static {
                com.umeng.commonsdk.statistics.proto.b$e r0 = new com.umeng.commonsdk.statistics.proto.b$e
                java.lang.String r1 = "identity"
                java.lang.String r2 = "IDENTITY"
                r3 = 0
                r4 = 1
                r0.<init>(r2, r3, r4, r1)
                com.umeng.commonsdk.statistics.proto.b.e.a = r0
                com.umeng.commonsdk.statistics.proto.b$e r1 = new com.umeng.commonsdk.statistics.proto.b$e
                java.lang.String r2 = "ts"
                java.lang.String r5 = "TS"
                r6 = 2
                r1.<init>(r5, r4, r6, r2)
                com.umeng.commonsdk.statistics.proto.b.e.b = r1
                com.umeng.commonsdk.statistics.proto.b$e r2 = new com.umeng.commonsdk.statistics.proto.b$e
                java.lang.String r5 = "version"
                java.lang.String r7 = "VERSION"
                r8 = 3
                r2.<init>(r7, r6, r8, r5)
                com.umeng.commonsdk.statistics.proto.b.e.c = r2
                com.umeng.commonsdk.statistics.proto.b$e[] r5 = new com.umeng.commonsdk.statistics.proto.b.e[r8]
                r5[r3] = r0
                r5[r4] = r1
                r5[r6] = r2
                com.umeng.commonsdk.statistics.proto.b.e.g = r5
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                com.umeng.commonsdk.statistics.proto.b.e.d = r0
                java.lang.Class<com.umeng.commonsdk.statistics.proto.b$e> r0 = com.umeng.commonsdk.statistics.proto.b.e.class
                java.util.EnumSet r0 = java.util.EnumSet.allOf(r0)
                java.util.Iterator r0 = r0.iterator()
            L40:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L56
                java.lang.Object r1 = r0.next()
                com.umeng.commonsdk.statistics.proto.b$e r1 = (com.umeng.commonsdk.statistics.proto.b.e) r1
                java.util.Map<java.lang.String, com.umeng.commonsdk.statistics.proto.b$e> r2 = com.umeng.commonsdk.statistics.proto.b.e.d
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

        public static com.umeng.commonsdk.statistics.proto.b.e a(int r1) {
                r0 = 1
                if (r1 == r0) goto L11
                r0 = 2
                if (r1 == r0) goto Le
                r0 = 3
                if (r1 == r0) goto Lb
                r1 = 0
                return r1
            Lb:
                com.umeng.commonsdk.statistics.proto.b$e r1 = com.umeng.commonsdk.statistics.proto.b.e.c
                return r1
            Le:
                com.umeng.commonsdk.statistics.proto.b$e r1 = com.umeng.commonsdk.statistics.proto.b.e.b
                return r1
            L11:
                com.umeng.commonsdk.statistics.proto.b$e r1 = com.umeng.commonsdk.statistics.proto.b.e.a
                return r1
        }

        public static com.umeng.commonsdk.statistics.proto.b.e a(java.lang.String r1) {
                java.util.Map<java.lang.String, com.umeng.commonsdk.statistics.proto.b$e> r0 = com.umeng.commonsdk.statistics.proto.b.e.d
                java.lang.Object r1 = r0.get(r1)
                com.umeng.commonsdk.statistics.proto.b$e r1 = (com.umeng.commonsdk.statistics.proto.b.e) r1
                return r1
        }

        public static com.umeng.commonsdk.statistics.proto.b.e b(int r3) {
                com.umeng.commonsdk.statistics.proto.b$e r0 = a(r3)
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

        public static com.umeng.commonsdk.statistics.proto.b.e valueOf(java.lang.String r1) {
                java.lang.Class<com.umeng.commonsdk.statistics.proto.b$e> r0 = com.umeng.commonsdk.statistics.proto.b.e.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.umeng.commonsdk.statistics.proto.b$e r1 = (com.umeng.commonsdk.statistics.proto.b.e) r1
                return r1
        }

        public static com.umeng.commonsdk.statistics.proto.b.e[] values() {
                com.umeng.commonsdk.statistics.proto.b$e[] r0 = com.umeng.commonsdk.statistics.proto.b.e.g
                java.lang.Object r0 = r0.clone()
                com.umeng.commonsdk.statistics.proto.b$e[] r0 = (com.umeng.commonsdk.statistics.proto.b.e[]) r0
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
            java.lang.String r1 = "IdSnapshot"
            r0.<init>(r1)
            com.umeng.commonsdk.statistics.proto.b.f = r0
            com.umeng.analytics.pro.cl r0 = new com.umeng.analytics.pro.cl
            java.lang.String r1 = "identity"
            r2 = 11
            r3 = 1
            r0.<init>(r1, r2, r3)
            com.umeng.commonsdk.statistics.proto.b.g = r0
            com.umeng.analytics.pro.cl r0 = new com.umeng.analytics.pro.cl
            r4 = 2
            java.lang.String r5 = "ts"
            r6 = 10
            r0.<init>(r5, r6, r4)
            com.umeng.commonsdk.statistics.proto.b.h = r0
            com.umeng.analytics.pro.cl r0 = new com.umeng.analytics.pro.cl
            r4 = 3
            java.lang.String r7 = "version"
            r8 = 8
            r0.<init>(r7, r8, r4)
            com.umeng.commonsdk.statistics.proto.b.i = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.umeng.commonsdk.statistics.proto.b.j = r0
            com.umeng.commonsdk.statistics.proto.b$b r4 = new com.umeng.commonsdk.statistics.proto.b$b
            r9 = 0
            r4.<init>(r9)
            java.lang.Class<com.umeng.analytics.pro.da> r10 = com.umeng.analytics.pro.da.class
            r0.put(r10, r4)
            com.umeng.commonsdk.statistics.proto.b$d r4 = new com.umeng.commonsdk.statistics.proto.b$d
            r4.<init>(r9)
            java.lang.Class<com.umeng.analytics.pro.db> r9 = com.umeng.analytics.pro.db.class
            r0.put(r9, r4)
            java.util.EnumMap r0 = new java.util.EnumMap
            java.lang.Class<com.umeng.commonsdk.statistics.proto.b$e> r4 = com.umeng.commonsdk.statistics.proto.b.e.class
            r0.<init>(r4)
            com.umeng.commonsdk.statistics.proto.b$e r4 = com.umeng.commonsdk.statistics.proto.b.e.a
            com.umeng.analytics.pro.cd r9 = new com.umeng.analytics.pro.cd
            com.umeng.analytics.pro.ce r10 = new com.umeng.analytics.pro.ce
            r10.<init>(r2)
            r9.<init>(r1, r3, r10)
            r0.put(r4, r9)
            com.umeng.commonsdk.statistics.proto.b$e r1 = com.umeng.commonsdk.statistics.proto.b.e.b
            com.umeng.analytics.pro.cd r2 = new com.umeng.analytics.pro.cd
            com.umeng.analytics.pro.ce r4 = new com.umeng.analytics.pro.ce
            r4.<init>(r6)
            r2.<init>(r5, r3, r4)
            r0.put(r1, r2)
            com.umeng.commonsdk.statistics.proto.b$e r1 = com.umeng.commonsdk.statistics.proto.b.e.c
            com.umeng.analytics.pro.cd r2 = new com.umeng.analytics.pro.cd
            com.umeng.analytics.pro.ce r4 = new com.umeng.analytics.pro.ce
            r4.<init>(r8)
            r2.<init>(r7, r3, r4)
            r0.put(r1, r2)
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)
            com.umeng.commonsdk.statistics.proto.b.d = r0
            java.lang.Class<com.umeng.commonsdk.statistics.proto.b> r1 = com.umeng.commonsdk.statistics.proto.b.class
            com.umeng.analytics.pro.cd.a(r1, r0)
            return
    }

    public b() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.m = r0
            return
    }

    public b(com.umeng.commonsdk.statistics.proto.b r3) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.m = r0
            byte r0 = r3.m
            r2.m = r0
            boolean r0 = r3.d()
            if (r0 == 0) goto L14
            java.lang.String r0 = r3.a
            r2.a = r0
        L14:
            long r0 = r3.b
            r2.b = r0
            int r3 = r3.c
            r2.c = r3
            return
    }

    public b(java.lang.String r1, long r2, int r4) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r1 = 1
            r0.b(r1)
            r0.c = r4
            r0.c(r1)
            return
    }

    private void a(java.io.ObjectInputStream r3) throws java.io.IOException, java.lang.ClassNotFoundException {
            r2 = this;
            r0 = 0
            r2.m = r0     // Catch: com.umeng.analytics.pro.bx -> L11
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

    static /* synthetic */ com.umeng.analytics.pro.cv l() {
            com.umeng.analytics.pro.cv r0 = com.umeng.commonsdk.statistics.proto.b.f
            return r0
    }

    static /* synthetic */ com.umeng.analytics.pro.cl m() {
            com.umeng.analytics.pro.cl r0 = com.umeng.commonsdk.statistics.proto.b.g
            return r0
    }

    static /* synthetic */ com.umeng.analytics.pro.cl n() {
            com.umeng.analytics.pro.cl r0 = com.umeng.commonsdk.statistics.proto.b.h
            return r0
    }

    static /* synthetic */ com.umeng.analytics.pro.cl o() {
            com.umeng.analytics.pro.cl r0 = com.umeng.commonsdk.statistics.proto.b.i
            return r0
    }

    public com.umeng.commonsdk.statistics.proto.b a() {
            r1 = this;
            com.umeng.commonsdk.statistics.proto.b r0 = new com.umeng.commonsdk.statistics.proto.b
            r0.<init>(r1)
            return r0
    }

    public com.umeng.commonsdk.statistics.proto.b a(int r1) {
            r0 = this;
            r0.c = r1
            r1 = 1
            r0.c(r1)
            return r0
    }

    public com.umeng.commonsdk.statistics.proto.b a(long r1) {
            r0 = this;
            r0.b = r1
            r1 = 1
            r0.b(r1)
            return r0
    }

    public com.umeng.commonsdk.statistics.proto.b a(java.lang.String r1) {
            r0 = this;
            r0.a = r1
            return r0
    }

    public void a(boolean r1) {
            r0 = this;
            if (r1 != 0) goto L5
            r1 = 0
            r0.a = r1
        L5:
            return
    }

    public com.umeng.commonsdk.statistics.proto.b.e b(int r1) {
            r0 = this;
            com.umeng.commonsdk.statistics.proto.b$e r1 = com.umeng.commonsdk.statistics.proto.b.e.a(r1)
            return r1
    }

    public java.lang.String b() {
            r1 = this;
            java.lang.String r0 = r1.a
            return r0
    }

    public void b(boolean r3) {
            r2 = this;
            byte r0 = r2.m
            r1 = 0
            byte r3 = com.umeng.analytics.pro.bo.a(r0, r1, r3)
            r2.m = r3
            return
    }

    public void c() {
            r1 = this;
            r0 = 0
            r1.a = r0
            return
    }

    public void c(boolean r3) {
            r2 = this;
            byte r0 = r2.m
            r1 = 1
            byte r3 = com.umeng.analytics.pro.bo.a(r0, r1, r3)
            r2.m = r3
            return
    }

    @Override // com.umeng.analytics.pro.br
    public void clear() {
            r3 = this;
            r0 = 0
            r3.a = r0
            r0 = 0
            r3.b(r0)
            r1 = 0
            r3.b = r1
            r3.c(r0)
            r3.c = r0
            return
    }

    public boolean d() {
            r1 = this;
            java.lang.String r0 = r1.a
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    @Override // com.umeng.analytics.pro.br
    public /* synthetic */ com.umeng.analytics.pro.br<com.umeng.commonsdk.statistics.proto.b, com.umeng.commonsdk.statistics.proto.b.e> deepCopy() {
            r1 = this;
            com.umeng.commonsdk.statistics.proto.b r0 = r1.a()
            return r0
    }

    public long e() {
            r2 = this;
            long r0 = r2.b
            return r0
    }

    public void f() {
            r2 = this;
            byte r0 = r2.m
            r1 = 0
            byte r0 = com.umeng.analytics.pro.bo.b(r0, r1)
            r2.m = r0
            return
    }

    @Override // com.umeng.analytics.pro.br
    public /* synthetic */ com.umeng.commonsdk.statistics.proto.b.e fieldForId(int r1) {
            r0 = this;
            com.umeng.commonsdk.statistics.proto.b$e r1 = r0.b(r1)
            return r1
    }

    public boolean g() {
            r2 = this;
            byte r0 = r2.m
            r1 = 0
            boolean r0 = com.umeng.analytics.pro.bo.a(r0, r1)
            return r0
    }

    public int h() {
            r1 = this;
            int r0 = r1.c
            return r0
    }

    public void i() {
            r2 = this;
            byte r0 = r2.m
            r1 = 1
            byte r0 = com.umeng.analytics.pro.bo.b(r0, r1)
            r2.m = r0
            return
    }

    public boolean j() {
            r2 = this;
            byte r0 = r2.m
            r1 = 1
            boolean r0 = com.umeng.analytics.pro.bo.a(r0, r1)
            return r0
    }

    public void k() throws com.umeng.analytics.pro.bx {
            r3 = this;
            java.lang.String r0 = r3.a
            if (r0 == 0) goto L5
            return
        L5:
            com.umeng.analytics.pro.cr r0 = new com.umeng.analytics.pro.cr
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Required field 'identity' was not present! Struct: "
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
            java.util.Map<java.lang.Class<? extends com.umeng.analytics.pro.cy>, com.umeng.analytics.pro.cz> r0 = com.umeng.commonsdk.statistics.proto.b.j
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
            java.lang.String r1 = "IdSnapshot("
            r0.<init>(r1)
            java.lang.String r1 = "identity:"
            r0.append(r1)
            java.lang.String r1 = r4.a
            if (r1 != 0) goto L16
            java.lang.String r1 = "null"
            r0.append(r1)
            goto L19
        L16:
            r0.append(r1)
        L19:
            java.lang.String r1 = ", "
            r0.append(r1)
            java.lang.String r2 = "ts:"
            r0.append(r2)
            long r2 = r4.b
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = "version:"
            r0.append(r1)
            int r1 = r4.c
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // com.umeng.analytics.pro.br
    public void write(com.umeng.analytics.pro.cq r3) throws com.umeng.analytics.pro.bx {
            r2 = this;
            java.util.Map<java.lang.Class<? extends com.umeng.analytics.pro.cy>, com.umeng.analytics.pro.cz> r0 = com.umeng.commonsdk.statistics.proto.b.j
            java.lang.Class r1 = r3.D()
            java.lang.Object r0 = r0.get(r1)
            com.umeng.analytics.pro.cz r0 = (com.umeng.analytics.pro.cz) r0
            com.umeng.analytics.pro.cy r0 = r0.b()
            r0.a(r3, r2)
            return
    }
}

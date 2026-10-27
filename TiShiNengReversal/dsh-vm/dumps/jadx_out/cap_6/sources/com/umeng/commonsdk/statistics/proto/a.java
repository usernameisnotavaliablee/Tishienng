package com.umeng.commonsdk.statistics.proto;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class a implements com.umeng.analytics.pro.br<com.umeng.commonsdk.statistics.proto.a, com.umeng.commonsdk.statistics.proto.a.e>, java.io.Serializable, java.lang.Cloneable {
    public static final java.util.Map<com.umeng.commonsdk.statistics.proto.a.e, com.umeng.analytics.pro.cd> e = null;
    private static final long f = 9132678615281394583L;
    private static final com.umeng.analytics.pro.cv g = null;
    private static final com.umeng.analytics.pro.cl h = null;
    private static final com.umeng.analytics.pro.cl i = null;
    private static final com.umeng.analytics.pro.cl j = null;
    private static final com.umeng.analytics.pro.cl k = null;
    private static final java.util.Map<java.lang.Class<? extends com.umeng.analytics.pro.cy>, com.umeng.analytics.pro.cz> l = null;
    private static final int m = 0;
    public java.lang.String a;
    public java.lang.String b;
    public java.lang.String c;
    public long d;
    private byte n;
    private com.umeng.commonsdk.statistics.proto.a.e[] o;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.umeng.commonsdk.statistics.proto.a$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.umeng.commonsdk.statistics.proto.a$a, reason: collision with other inner class name */
    private static class C0052a extends com.umeng.analytics.pro.da<com.umeng.commonsdk.statistics.proto.a> {
        private C0052a() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ C0052a(com.umeng.commonsdk.statistics.proto.a.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.umeng.analytics.pro.cy
        public /* synthetic */ void a(com.umeng.analytics.pro.cq r1, com.umeng.analytics.pro.br r2) throws com.umeng.analytics.pro.bx {
                r0 = this;
                com.umeng.commonsdk.statistics.proto.a r2 = (com.umeng.commonsdk.statistics.proto.a) r2
                r0.b(r1, r2)
                return
        }

        public void a(com.umeng.analytics.pro.cq r6, com.umeng.commonsdk.statistics.proto.a r7) throws com.umeng.analytics.pro.bx {
                r5 = this;
                r6.j()
            L3:
                com.umeng.analytics.pro.cl r0 = r6.l()
                byte r1 = r0.b
                if (r1 != 0) goto L33
                r6.k()
                boolean r6 = r7.m()
                if (r6 == 0) goto L18
                r7.n()
                return
            L18:
                com.umeng.analytics.pro.cr r6 = new com.umeng.analytics.pro.cr
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r0 = "Required field 'ts' was not found in serialized data! Struct: "
                r7.append(r0)
                java.lang.String r0 = r5.toString()
                r7.append(r0)
                java.lang.String r7 = r7.toString()
                r6.<init>(r7)
                throw r6
            L33:
                short r0 = r0.c
                r2 = 11
                r3 = 1
                if (r0 == r3) goto L79
                r4 = 2
                if (r0 == r4) goto L69
                r4 = 3
                if (r0 == r4) goto L59
                r2 = 4
                if (r0 == r2) goto L47
                com.umeng.analytics.pro.ct.a(r6, r1)
                goto L88
            L47:
                r0 = 10
                if (r1 != r0) goto L55
                long r0 = r6.x()
                r7.d = r0
                r7.d(r3)
                goto L88
            L55:
                com.umeng.analytics.pro.ct.a(r6, r1)
                goto L88
            L59:
                if (r1 != r2) goto L65
                java.lang.String r0 = r6.z()
                r7.c = r0
                r7.c(r3)
                goto L88
            L65:
                com.umeng.analytics.pro.ct.a(r6, r1)
                goto L88
            L69:
                if (r1 != r2) goto L75
                java.lang.String r0 = r6.z()
                r7.b = r0
                r7.b(r3)
                goto L88
            L75:
                com.umeng.analytics.pro.ct.a(r6, r1)
                goto L88
            L79:
                if (r1 != r2) goto L85
                java.lang.String r0 = r6.z()
                r7.a = r0
                r7.a(r3)
                goto L88
            L85:
                com.umeng.analytics.pro.ct.a(r6, r1)
            L88:
                r6.m()
                goto L3
        }

        @Override // com.umeng.analytics.pro.cy
        public /* synthetic */ void b(com.umeng.analytics.pro.cq r1, com.umeng.analytics.pro.br r2) throws com.umeng.analytics.pro.bx {
                r0 = this;
                com.umeng.commonsdk.statistics.proto.a r2 = (com.umeng.commonsdk.statistics.proto.a) r2
                r0.a(r1, r2)
                return
        }

        public void b(com.umeng.analytics.pro.cq r3, com.umeng.commonsdk.statistics.proto.a r4) throws com.umeng.analytics.pro.bx {
                r2 = this;
                r4.n()
                com.umeng.analytics.pro.cv r0 = com.umeng.commonsdk.statistics.proto.a.o()
                r3.a(r0)
                java.lang.String r0 = r4.a
                if (r0 == 0) goto L1d
                com.umeng.analytics.pro.cl r0 = com.umeng.commonsdk.statistics.proto.a.p()
                r3.a(r0)
                java.lang.String r0 = r4.a
                r3.a(r0)
                r3.c()
            L1d:
                java.lang.String r0 = r4.b
                if (r0 == 0) goto L36
                boolean r0 = r4.g()
                if (r0 == 0) goto L36
                com.umeng.analytics.pro.cl r0 = com.umeng.commonsdk.statistics.proto.a.q()
                r3.a(r0)
                java.lang.String r0 = r4.b
                r3.a(r0)
                r3.c()
            L36:
                java.lang.String r0 = r4.c
                if (r0 == 0) goto L49
                com.umeng.analytics.pro.cl r0 = com.umeng.commonsdk.statistics.proto.a.r()
                r3.a(r0)
                java.lang.String r0 = r4.c
                r3.a(r0)
                r3.c()
            L49:
                com.umeng.analytics.pro.cl r0 = com.umeng.commonsdk.statistics.proto.a.s()
                r3.a(r0)
                long r0 = r4.d
                r3.a(r0)
                r3.c()
                r3.d()
                r3.b()
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

        /* synthetic */ b(com.umeng.commonsdk.statistics.proto.a.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public com.umeng.commonsdk.statistics.proto.a.C0052a a() {
                r2 = this;
                com.umeng.commonsdk.statistics.proto.a$a r0 = new com.umeng.commonsdk.statistics.proto.a$a
                r1 = 0
                r0.<init>(r1)
                return r0
        }

        @Override // com.umeng.analytics.pro.cz
        public /* synthetic */ com.umeng.analytics.pro.cy b() {
                r1 = this;
                com.umeng.commonsdk.statistics.proto.a$a r0 = r1.a()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class c extends com.umeng.analytics.pro.db<com.umeng.commonsdk.statistics.proto.a> {
        private c() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ c(com.umeng.commonsdk.statistics.proto.a.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.umeng.analytics.pro.cy
        public /* bridge */ /* synthetic */ void a(com.umeng.analytics.pro.cq r1, com.umeng.analytics.pro.br r2) throws com.umeng.analytics.pro.bx {
                r0 = this;
                com.umeng.commonsdk.statistics.proto.a r2 = (com.umeng.commonsdk.statistics.proto.a) r2
                r0.a(r1, r2)
                return
        }

        public void a(com.umeng.analytics.pro.cq r3, com.umeng.commonsdk.statistics.proto.a r4) throws com.umeng.analytics.pro.bx {
                r2 = this;
                com.umeng.analytics.pro.cw r3 = (com.umeng.analytics.pro.cw) r3
                java.lang.String r0 = r4.a
                r3.a(r0)
                java.lang.String r0 = r4.c
                r3.a(r0)
                long r0 = r4.d
                r3.a(r0)
                java.util.BitSet r0 = new java.util.BitSet
                r0.<init>()
                boolean r1 = r4.g()
                if (r1 == 0) goto L20
                r1 = 0
                r0.set(r1)
            L20:
                r1 = 1
                r3.a(r0, r1)
                boolean r0 = r4.g()
                if (r0 == 0) goto L2f
                java.lang.String r4 = r4.b
                r3.a(r4)
            L2f:
                return
        }

        @Override // com.umeng.analytics.pro.cy
        public /* bridge */ /* synthetic */ void b(com.umeng.analytics.pro.cq r1, com.umeng.analytics.pro.br r2) throws com.umeng.analytics.pro.bx {
                r0 = this;
                com.umeng.commonsdk.statistics.proto.a r2 = (com.umeng.commonsdk.statistics.proto.a) r2
                r0.b(r1, r2)
                return
        }

        public void b(com.umeng.analytics.pro.cq r4, com.umeng.commonsdk.statistics.proto.a r5) throws com.umeng.analytics.pro.bx {
                r3 = this;
                com.umeng.analytics.pro.cw r4 = (com.umeng.analytics.pro.cw) r4
                java.lang.String r0 = r4.z()
                r5.a = r0
                r0 = 1
                r5.a(r0)
                java.lang.String r1 = r4.z()
                r5.c = r1
                r5.c(r0)
                long r1 = r4.x()
                r5.d = r1
                r5.d(r0)
                java.util.BitSet r1 = r4.b(r0)
                r2 = 0
                boolean r1 = r1.get(r2)
                if (r1 == 0) goto L32
                java.lang.String r4 = r4.z()
                r5.b = r4
                r5.b(r0)
            L32:
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

        /* synthetic */ d(com.umeng.commonsdk.statistics.proto.a.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public com.umeng.commonsdk.statistics.proto.a.c a() {
                r2 = this;
                com.umeng.commonsdk.statistics.proto.a$c r0 = new com.umeng.commonsdk.statistics.proto.a$c
                r1 = 0
                r0.<init>(r1)
                return r0
        }

        @Override // com.umeng.analytics.pro.cz
        public /* synthetic */ com.umeng.analytics.pro.cy b() {
                r1 = this;
                com.umeng.commonsdk.statistics.proto.a$c r0 = r1.a()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum e extends java.lang.Enum<com.umeng.commonsdk.statistics.proto.a.e> implements com.umeng.analytics.pro.by {
        public static final com.umeng.commonsdk.statistics.proto.a.e a = null;
        public static final com.umeng.commonsdk.statistics.proto.a.e b = null;
        public static final com.umeng.commonsdk.statistics.proto.a.e c = null;
        public static final com.umeng.commonsdk.statistics.proto.a.e d = null;
        private static final java.util.Map<java.lang.String, com.umeng.commonsdk.statistics.proto.a.e> e = null;
        private static final /* synthetic */ com.umeng.commonsdk.statistics.proto.a.e[] h = null;
        private final short f;
        private final java.lang.String g;

        static {
                com.umeng.commonsdk.statistics.proto.a$e r0 = new com.umeng.commonsdk.statistics.proto.a$e
                java.lang.String r1 = "domain"
                java.lang.String r2 = "DOMAIN"
                r3 = 0
                r4 = 1
                r0.<init>(r2, r3, r4, r1)
                com.umeng.commonsdk.statistics.proto.a.e.a = r0
                com.umeng.commonsdk.statistics.proto.a$e r1 = new com.umeng.commonsdk.statistics.proto.a$e
                java.lang.String r2 = "old_id"
                java.lang.String r5 = "OLD_ID"
                r6 = 2
                r1.<init>(r5, r4, r6, r2)
                com.umeng.commonsdk.statistics.proto.a.e.b = r1
                com.umeng.commonsdk.statistics.proto.a$e r2 = new com.umeng.commonsdk.statistics.proto.a$e
                java.lang.String r5 = "new_id"
                java.lang.String r7 = "NEW_ID"
                r8 = 3
                r2.<init>(r7, r6, r8, r5)
                com.umeng.commonsdk.statistics.proto.a.e.c = r2
                com.umeng.commonsdk.statistics.proto.a$e r5 = new com.umeng.commonsdk.statistics.proto.a$e
                java.lang.String r7 = "ts"
                java.lang.String r9 = "TS"
                r10 = 4
                r5.<init>(r9, r8, r10, r7)
                com.umeng.commonsdk.statistics.proto.a.e.d = r5
                com.umeng.commonsdk.statistics.proto.a$e[] r7 = new com.umeng.commonsdk.statistics.proto.a.e[r10]
                r7[r3] = r0
                r7[r4] = r1
                r7[r6] = r2
                r7[r8] = r5
                com.umeng.commonsdk.statistics.proto.a.e.h = r7
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                com.umeng.commonsdk.statistics.proto.a.e.e = r0
                java.lang.Class<com.umeng.commonsdk.statistics.proto.a$e> r0 = com.umeng.commonsdk.statistics.proto.a.e.class
                java.util.EnumSet r0 = java.util.EnumSet.allOf(r0)
                java.util.Iterator r0 = r0.iterator()
            L4e:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L64
                java.lang.Object r1 = r0.next()
                com.umeng.commonsdk.statistics.proto.a$e r1 = (com.umeng.commonsdk.statistics.proto.a.e) r1
                java.util.Map<java.lang.String, com.umeng.commonsdk.statistics.proto.a$e> r2 = com.umeng.commonsdk.statistics.proto.a.e.e
                java.lang.String r3 = r1.b()
                r2.put(r3, r1)
                goto L4e
            L64:
                return
        }

        e(java.lang.String r1, int r2, short r3, java.lang.String r4) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.f = r3
                r0.g = r4
                return
        }

        public static com.umeng.commonsdk.statistics.proto.a.e a(int r1) {
                r0 = 1
                if (r1 == r0) goto L17
                r0 = 2
                if (r1 == r0) goto L14
                r0 = 3
                if (r1 == r0) goto L11
                r0 = 4
                if (r1 == r0) goto Le
                r1 = 0
                return r1
            Le:
                com.umeng.commonsdk.statistics.proto.a$e r1 = com.umeng.commonsdk.statistics.proto.a.e.d
                return r1
            L11:
                com.umeng.commonsdk.statistics.proto.a$e r1 = com.umeng.commonsdk.statistics.proto.a.e.c
                return r1
            L14:
                com.umeng.commonsdk.statistics.proto.a$e r1 = com.umeng.commonsdk.statistics.proto.a.e.b
                return r1
            L17:
                com.umeng.commonsdk.statistics.proto.a$e r1 = com.umeng.commonsdk.statistics.proto.a.e.a
                return r1
        }

        public static com.umeng.commonsdk.statistics.proto.a.e a(java.lang.String r1) {
                java.util.Map<java.lang.String, com.umeng.commonsdk.statistics.proto.a$e> r0 = com.umeng.commonsdk.statistics.proto.a.e.e
                java.lang.Object r1 = r0.get(r1)
                com.umeng.commonsdk.statistics.proto.a$e r1 = (com.umeng.commonsdk.statistics.proto.a.e) r1
                return r1
        }

        public static com.umeng.commonsdk.statistics.proto.a.e b(int r3) {
                com.umeng.commonsdk.statistics.proto.a$e r0 = a(r3)
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

        public static com.umeng.commonsdk.statistics.proto.a.e valueOf(java.lang.String r1) {
                java.lang.Class<com.umeng.commonsdk.statistics.proto.a$e> r0 = com.umeng.commonsdk.statistics.proto.a.e.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.umeng.commonsdk.statistics.proto.a$e r1 = (com.umeng.commonsdk.statistics.proto.a.e) r1
                return r1
        }

        public static com.umeng.commonsdk.statistics.proto.a.e[] values() {
                com.umeng.commonsdk.statistics.proto.a$e[] r0 = com.umeng.commonsdk.statistics.proto.a.e.h
                java.lang.Object r0 = r0.clone()
                com.umeng.commonsdk.statistics.proto.a$e[] r0 = (com.umeng.commonsdk.statistics.proto.a.e[]) r0
                return r0
        }

        @Override // com.umeng.analytics.pro.by
        public short a() {
                r1 = this;
                short r0 = r1.f
                return r0
        }

        @Override // com.umeng.analytics.pro.by
        public java.lang.String b() {
                r1 = this;
                java.lang.String r0 = r1.g
                return r0
        }
    }

    static {
            com.umeng.analytics.pro.cv r0 = new com.umeng.analytics.pro.cv
            java.lang.String r1 = "IdJournal"
            r0.<init>(r1)
            com.umeng.commonsdk.statistics.proto.a.g = r0
            com.umeng.analytics.pro.cl r0 = new com.umeng.analytics.pro.cl
            java.lang.String r1 = "domain"
            r2 = 11
            r3 = 1
            r0.<init>(r1, r2, r3)
            com.umeng.commonsdk.statistics.proto.a.h = r0
            com.umeng.analytics.pro.cl r0 = new com.umeng.analytics.pro.cl
            java.lang.String r4 = "old_id"
            r5 = 2
            r0.<init>(r4, r2, r5)
            com.umeng.commonsdk.statistics.proto.a.i = r0
            com.umeng.analytics.pro.cl r0 = new com.umeng.analytics.pro.cl
            r6 = 3
            java.lang.String r7 = "new_id"
            r0.<init>(r7, r2, r6)
            com.umeng.commonsdk.statistics.proto.a.j = r0
            com.umeng.analytics.pro.cl r0 = new com.umeng.analytics.pro.cl
            r6 = 4
            java.lang.String r8 = "ts"
            r9 = 10
            r0.<init>(r8, r9, r6)
            com.umeng.commonsdk.statistics.proto.a.k = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.umeng.commonsdk.statistics.proto.a.l = r0
            com.umeng.commonsdk.statistics.proto.a$b r6 = new com.umeng.commonsdk.statistics.proto.a$b
            r10 = 0
            r6.<init>(r10)
            java.lang.Class<com.umeng.analytics.pro.da> r11 = com.umeng.analytics.pro.da.class
            r0.put(r11, r6)
            com.umeng.commonsdk.statistics.proto.a$d r6 = new com.umeng.commonsdk.statistics.proto.a$d
            r6.<init>(r10)
            java.lang.Class<com.umeng.analytics.pro.db> r10 = com.umeng.analytics.pro.db.class
            r0.put(r10, r6)
            java.util.EnumMap r0 = new java.util.EnumMap
            java.lang.Class<com.umeng.commonsdk.statistics.proto.a$e> r6 = com.umeng.commonsdk.statistics.proto.a.e.class
            r0.<init>(r6)
            com.umeng.commonsdk.statistics.proto.a$e r6 = com.umeng.commonsdk.statistics.proto.a.e.a
            com.umeng.analytics.pro.cd r10 = new com.umeng.analytics.pro.cd
            com.umeng.analytics.pro.ce r11 = new com.umeng.analytics.pro.ce
            r11.<init>(r2)
            r10.<init>(r1, r3, r11)
            r0.put(r6, r10)
            com.umeng.commonsdk.statistics.proto.a$e r1 = com.umeng.commonsdk.statistics.proto.a.e.b
            com.umeng.analytics.pro.cd r6 = new com.umeng.analytics.pro.cd
            com.umeng.analytics.pro.ce r10 = new com.umeng.analytics.pro.ce
            r10.<init>(r2)
            r6.<init>(r4, r5, r10)
            r0.put(r1, r6)
            com.umeng.commonsdk.statistics.proto.a$e r1 = com.umeng.commonsdk.statistics.proto.a.e.c
            com.umeng.analytics.pro.cd r4 = new com.umeng.analytics.pro.cd
            com.umeng.analytics.pro.ce r5 = new com.umeng.analytics.pro.ce
            r5.<init>(r2)
            r4.<init>(r7, r3, r5)
            r0.put(r1, r4)
            com.umeng.commonsdk.statistics.proto.a$e r1 = com.umeng.commonsdk.statistics.proto.a.e.d
            com.umeng.analytics.pro.cd r2 = new com.umeng.analytics.pro.cd
            com.umeng.analytics.pro.ce r4 = new com.umeng.analytics.pro.ce
            r4.<init>(r9)
            r2.<init>(r8, r3, r4)
            r0.put(r1, r2)
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)
            com.umeng.commonsdk.statistics.proto.a.e = r0
            java.lang.Class<com.umeng.commonsdk.statistics.proto.a> r1 = com.umeng.commonsdk.statistics.proto.a.class
            com.umeng.analytics.pro.cd.a(r1, r0)
            return
    }

    public a() {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.n = r0
            r1 = 1
            com.umeng.commonsdk.statistics.proto.a$e[] r1 = new com.umeng.commonsdk.statistics.proto.a.e[r1]
            com.umeng.commonsdk.statistics.proto.a$e r2 = com.umeng.commonsdk.statistics.proto.a.e.b
            r1[r0] = r2
            r3.o = r1
            return
    }

    public a(com.umeng.commonsdk.statistics.proto.a r4) {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.n = r0
            r1 = 1
            com.umeng.commonsdk.statistics.proto.a$e[] r1 = new com.umeng.commonsdk.statistics.proto.a.e[r1]
            com.umeng.commonsdk.statistics.proto.a$e r2 = com.umeng.commonsdk.statistics.proto.a.e.b
            r1[r0] = r2
            r3.o = r1
            byte r0 = r4.n
            r3.n = r0
            boolean r0 = r4.d()
            if (r0 == 0) goto L1d
            java.lang.String r0 = r4.a
            r3.a = r0
        L1d:
            boolean r0 = r4.g()
            if (r0 == 0) goto L27
            java.lang.String r0 = r4.b
            r3.b = r0
        L27:
            boolean r0 = r4.j()
            if (r0 == 0) goto L31
            java.lang.String r0 = r4.c
            r3.c = r0
        L31:
            long r0 = r4.d
            r3.d = r0
            return
    }

    public a(java.lang.String r1, java.lang.String r2, long r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.c = r2
            r0.d = r3
            r1 = 1
            r0.d(r1)
            return
    }

    private void a(java.io.ObjectInputStream r3) throws java.io.IOException, java.lang.ClassNotFoundException {
            r2 = this;
            r0 = 0
            r2.n = r0     // Catch: com.umeng.analytics.pro.bx -> L11
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

    static /* synthetic */ com.umeng.analytics.pro.cv o() {
            com.umeng.analytics.pro.cv r0 = com.umeng.commonsdk.statistics.proto.a.g
            return r0
    }

    static /* synthetic */ com.umeng.analytics.pro.cl p() {
            com.umeng.analytics.pro.cl r0 = com.umeng.commonsdk.statistics.proto.a.h
            return r0
    }

    static /* synthetic */ com.umeng.analytics.pro.cl q() {
            com.umeng.analytics.pro.cl r0 = com.umeng.commonsdk.statistics.proto.a.i
            return r0
    }

    static /* synthetic */ com.umeng.analytics.pro.cl r() {
            com.umeng.analytics.pro.cl r0 = com.umeng.commonsdk.statistics.proto.a.j
            return r0
    }

    static /* synthetic */ com.umeng.analytics.pro.cl s() {
            com.umeng.analytics.pro.cl r0 = com.umeng.commonsdk.statistics.proto.a.k
            return r0
    }

    public com.umeng.commonsdk.statistics.proto.a.e a(int r1) {
            r0 = this;
            com.umeng.commonsdk.statistics.proto.a$e r1 = com.umeng.commonsdk.statistics.proto.a.e.a(r1)
            return r1
    }

    public com.umeng.commonsdk.statistics.proto.a a() {
            r1 = this;
            com.umeng.commonsdk.statistics.proto.a r0 = new com.umeng.commonsdk.statistics.proto.a
            r0.<init>(r1)
            return r0
    }

    public com.umeng.commonsdk.statistics.proto.a a(long r1) {
            r0 = this;
            r0.d = r1
            r1 = 1
            r0.d(r1)
            return r0
    }

    public com.umeng.commonsdk.statistics.proto.a a(java.lang.String r1) {
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

    public com.umeng.commonsdk.statistics.proto.a b(java.lang.String r1) {
            r0 = this;
            r0.b = r1
            return r0
    }

    public java.lang.String b() {
            r1 = this;
            java.lang.String r0 = r1.a
            return r0
    }

    public void b(boolean r1) {
            r0 = this;
            if (r1 != 0) goto L5
            r1 = 0
            r0.b = r1
        L5:
            return
    }

    public com.umeng.commonsdk.statistics.proto.a c(java.lang.String r1) {
            r0 = this;
            r0.c = r1
            return r0
    }

    public void c() {
            r1 = this;
            r0 = 0
            r1.a = r0
            return
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
            r2.b = r0
            r2.c = r0
            r0 = 0
            r2.d(r0)
            r0 = 0
            r2.d = r0
            return
    }

    public void d(boolean r3) {
            r2 = this;
            byte r0 = r2.n
            r1 = 0
            byte r3 = com.umeng.analytics.pro.bo.a(r0, r1, r3)
            r2.n = r3
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
    public /* synthetic */ com.umeng.analytics.pro.br<com.umeng.commonsdk.statistics.proto.a, com.umeng.commonsdk.statistics.proto.a.e> deepCopy() {
            r1 = this;
            com.umeng.commonsdk.statistics.proto.a r0 = r1.a()
            return r0
    }

    public java.lang.String e() {
            r1 = this;
            java.lang.String r0 = r1.b
            return r0
    }

    public void f() {
            r1 = this;
            r0 = 0
            r1.b = r0
            return
    }

    @Override // com.umeng.analytics.pro.br
    public /* synthetic */ com.umeng.commonsdk.statistics.proto.a.e fieldForId(int r1) {
            r0 = this;
            com.umeng.commonsdk.statistics.proto.a$e r1 = r0.a(r1)
            return r1
    }

    public boolean g() {
            r1 = this;
            java.lang.String r0 = r1.b
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public java.lang.String h() {
            r1 = this;
            java.lang.String r0 = r1.c
            return r0
    }

    public void i() {
            r1 = this;
            r0 = 0
            r1.c = r0
            return
    }

    public boolean j() {
            r1 = this;
            java.lang.String r0 = r1.c
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public long k() {
            r2 = this;
            long r0 = r2.d
            return r0
    }

    public void l() {
            r2 = this;
            byte r0 = r2.n
            r1 = 0
            byte r0 = com.umeng.analytics.pro.bo.b(r0, r1)
            r2.n = r0
            return
    }

    public boolean m() {
            r2 = this;
            byte r0 = r2.n
            r1 = 0
            boolean r0 = com.umeng.analytics.pro.bo.a(r0, r1)
            return r0
    }

    public void n() throws com.umeng.analytics.pro.bx {
            r3 = this;
            java.lang.String r0 = r3.a
            if (r0 == 0) goto L24
            java.lang.String r0 = r3.c
            if (r0 == 0) goto L9
            return
        L9:
            com.umeng.analytics.pro.cr r0 = new com.umeng.analytics.pro.cr
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Required field 'new_id' was not present! Struct: "
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
            java.lang.String r2 = "Required field 'domain' was not present! Struct: "
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
            java.util.Map<java.lang.Class<? extends com.umeng.analytics.pro.cy>, com.umeng.analytics.pro.cz> r0 = com.umeng.commonsdk.statistics.proto.a.l
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
            java.lang.String r1 = "IdJournal("
            r0.<init>(r1)
            java.lang.String r1 = "domain:"
            r0.append(r1)
            java.lang.String r1 = r4.a
            java.lang.String r2 = "null"
            if (r1 != 0) goto L16
            r0.append(r2)
            goto L19
        L16:
            r0.append(r1)
        L19:
            boolean r1 = r4.g()
            java.lang.String r3 = ", "
            if (r1 == 0) goto L34
            r0.append(r3)
            java.lang.String r1 = "old_id:"
            r0.append(r1)
            java.lang.String r1 = r4.b
            if (r1 != 0) goto L31
            r0.append(r2)
            goto L34
        L31:
            r0.append(r1)
        L34:
            r0.append(r3)
            java.lang.String r1 = "new_id:"
            r0.append(r1)
            java.lang.String r1 = r4.c
            if (r1 != 0) goto L44
            r0.append(r2)
            goto L47
        L44:
            r0.append(r1)
        L47:
            r0.append(r3)
            java.lang.String r1 = "ts:"
            r0.append(r1)
            long r1 = r4.d
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // com.umeng.analytics.pro.br
    public void write(com.umeng.analytics.pro.cq r3) throws com.umeng.analytics.pro.bx {
            r2 = this;
            java.util.Map<java.lang.Class<? extends com.umeng.analytics.pro.cy>, com.umeng.analytics.pro.cz> r0 = com.umeng.commonsdk.statistics.proto.a.l
            java.lang.Class r1 = r3.D()
            java.lang.Object r0 = r0.get(r1)
            com.umeng.analytics.pro.cz r0 = (com.umeng.analytics.pro.cz) r0
            com.umeng.analytics.pro.cy r0 = r0.b()
            r0.a(r3, r2)
            return
    }
}

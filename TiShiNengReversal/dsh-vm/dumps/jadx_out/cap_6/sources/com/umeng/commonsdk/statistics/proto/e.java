package com.umeng.commonsdk.statistics.proto;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class e implements com.umeng.analytics.pro.br<com.umeng.commonsdk.statistics.proto.e, com.umeng.commonsdk.statistics.proto.e.EnumC0056e>, java.io.Serializable, java.lang.Cloneable {
    public static final java.util.Map<com.umeng.commonsdk.statistics.proto.e.EnumC0056e, com.umeng.analytics.pro.cd> d = null;
    private static final long e = 7501688097813630241L;
    private static final com.umeng.analytics.pro.cv f = null;
    private static final com.umeng.analytics.pro.cl g = null;
    private static final com.umeng.analytics.pro.cl h = null;
    private static final com.umeng.analytics.pro.cl i = null;
    private static final java.util.Map<java.lang.Class<? extends com.umeng.analytics.pro.cy>, com.umeng.analytics.pro.cz> j = null;
    private static final int k = 0;
    public java.lang.String a;
    public long b;
    public java.lang.String c;
    private byte l;
    private com.umeng.commonsdk.statistics.proto.e.EnumC0056e[] m;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.umeng.commonsdk.statistics.proto.e$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class a extends com.umeng.analytics.pro.da<com.umeng.commonsdk.statistics.proto.e> {
        private a() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ a(com.umeng.commonsdk.statistics.proto.e.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.umeng.analytics.pro.cy
        public /* synthetic */ void a(com.umeng.analytics.pro.cq r1, com.umeng.analytics.pro.br r2) throws com.umeng.analytics.pro.bx {
                r0 = this;
                com.umeng.commonsdk.statistics.proto.e r2 = (com.umeng.commonsdk.statistics.proto.e) r2
                r0.b(r1, r2)
                return
        }

        public void a(com.umeng.analytics.pro.cq r6, com.umeng.commonsdk.statistics.proto.e r7) throws com.umeng.analytics.pro.bx {
                r5 = this;
                r6.j()
            L3:
                com.umeng.analytics.pro.cl r0 = r6.l()
                byte r1 = r0.b
                if (r1 != 0) goto L12
                r6.k()
                r7.k()
                return
            L12:
                short r0 = r0.c
                r2 = 11
                r3 = 1
                if (r0 == r3) goto L45
                r4 = 2
                if (r0 == r4) goto L33
                r4 = 3
                if (r0 == r4) goto L23
                com.umeng.analytics.pro.ct.a(r6, r1)
                goto L54
            L23:
                if (r1 != r2) goto L2f
                java.lang.String r0 = r6.z()
                r7.c = r0
                r7.c(r3)
                goto L54
            L2f:
                com.umeng.analytics.pro.ct.a(r6, r1)
                goto L54
            L33:
                r0 = 10
                if (r1 != r0) goto L41
                long r0 = r6.x()
                r7.b = r0
                r7.b(r3)
                goto L54
            L41:
                com.umeng.analytics.pro.ct.a(r6, r1)
                goto L54
            L45:
                if (r1 != r2) goto L51
                java.lang.String r0 = r6.z()
                r7.a = r0
                r7.a(r3)
                goto L54
            L51:
                com.umeng.analytics.pro.ct.a(r6, r1)
            L54:
                r6.m()
                goto L3
        }

        @Override // com.umeng.analytics.pro.cy
        public /* synthetic */ void b(com.umeng.analytics.pro.cq r1, com.umeng.analytics.pro.br r2) throws com.umeng.analytics.pro.bx {
                r0 = this;
                com.umeng.commonsdk.statistics.proto.e r2 = (com.umeng.commonsdk.statistics.proto.e) r2
                r0.a(r1, r2)
                return
        }

        public void b(com.umeng.analytics.pro.cq r3, com.umeng.commonsdk.statistics.proto.e r4) throws com.umeng.analytics.pro.bx {
                r2 = this;
                r4.k()
                com.umeng.analytics.pro.cv r0 = com.umeng.commonsdk.statistics.proto.e.l()
                r3.a(r0)
                java.lang.String r0 = r4.a
                if (r0 == 0) goto L23
                boolean r0 = r4.d()
                if (r0 == 0) goto L23
                com.umeng.analytics.pro.cl r0 = com.umeng.commonsdk.statistics.proto.e.m()
                r3.a(r0)
                java.lang.String r0 = r4.a
                r3.a(r0)
                r3.c()
            L23:
                boolean r0 = r4.g()
                if (r0 == 0) goto L38
                com.umeng.analytics.pro.cl r0 = com.umeng.commonsdk.statistics.proto.e.n()
                r3.a(r0)
                long r0 = r4.b
                r3.a(r0)
                r3.c()
            L38:
                java.lang.String r0 = r4.c
                if (r0 == 0) goto L51
                boolean r0 = r4.j()
                if (r0 == 0) goto L51
                com.umeng.analytics.pro.cl r0 = com.umeng.commonsdk.statistics.proto.e.o()
                r3.a(r0)
                java.lang.String r4 = r4.c
                r3.a(r4)
                r3.c()
            L51:
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

        /* synthetic */ b(com.umeng.commonsdk.statistics.proto.e.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public com.umeng.commonsdk.statistics.proto.e.a a() {
                r2 = this;
                com.umeng.commonsdk.statistics.proto.e$a r0 = new com.umeng.commonsdk.statistics.proto.e$a
                r1 = 0
                r0.<init>(r1)
                return r0
        }

        @Override // com.umeng.analytics.pro.cz
        public /* synthetic */ com.umeng.analytics.pro.cy b() {
                r1 = this;
                com.umeng.commonsdk.statistics.proto.e$a r0 = r1.a()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class c extends com.umeng.analytics.pro.db<com.umeng.commonsdk.statistics.proto.e> {
        private c() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ c(com.umeng.commonsdk.statistics.proto.e.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.umeng.analytics.pro.cy
        public /* bridge */ /* synthetic */ void a(com.umeng.analytics.pro.cq r1, com.umeng.analytics.pro.br r2) throws com.umeng.analytics.pro.bx {
                r0 = this;
                com.umeng.commonsdk.statistics.proto.e r2 = (com.umeng.commonsdk.statistics.proto.e) r2
                r0.a(r1, r2)
                return
        }

        public void a(com.umeng.analytics.pro.cq r3, com.umeng.commonsdk.statistics.proto.e r4) throws com.umeng.analytics.pro.bx {
                r2 = this;
                com.umeng.analytics.pro.cw r3 = (com.umeng.analytics.pro.cw) r3
                java.util.BitSet r0 = new java.util.BitSet
                r0.<init>()
                boolean r1 = r4.d()
                if (r1 == 0) goto L11
                r1 = 0
                r0.set(r1)
            L11:
                boolean r1 = r4.g()
                if (r1 == 0) goto L1b
                r1 = 1
                r0.set(r1)
            L1b:
                boolean r1 = r4.j()
                if (r1 == 0) goto L25
                r1 = 2
                r0.set(r1)
            L25:
                r1 = 3
                r3.a(r0, r1)
                boolean r0 = r4.d()
                if (r0 == 0) goto L34
                java.lang.String r0 = r4.a
                r3.a(r0)
            L34:
                boolean r0 = r4.g()
                if (r0 == 0) goto L3f
                long r0 = r4.b
                r3.a(r0)
            L3f:
                boolean r0 = r4.j()
                if (r0 == 0) goto L4a
                java.lang.String r4 = r4.c
                r3.a(r4)
            L4a:
                return
        }

        @Override // com.umeng.analytics.pro.cy
        public /* bridge */ /* synthetic */ void b(com.umeng.analytics.pro.cq r1, com.umeng.analytics.pro.br r2) throws com.umeng.analytics.pro.bx {
                r0 = this;
                com.umeng.commonsdk.statistics.proto.e r2 = (com.umeng.commonsdk.statistics.proto.e) r2
                r0.b(r1, r2)
                return
        }

        public void b(com.umeng.analytics.pro.cq r6, com.umeng.commonsdk.statistics.proto.e r7) throws com.umeng.analytics.pro.bx {
                r5 = this;
                com.umeng.analytics.pro.cw r6 = (com.umeng.analytics.pro.cw) r6
                r0 = 3
                java.util.BitSet r0 = r6.b(r0)
                r1 = 0
                boolean r1 = r0.get(r1)
                r2 = 1
                if (r1 == 0) goto L18
                java.lang.String r1 = r6.z()
                r7.a = r1
                r7.a(r2)
            L18:
                boolean r1 = r0.get(r2)
                if (r1 == 0) goto L27
                long r3 = r6.x()
                r7.b = r3
                r7.b(r2)
            L27:
                r1 = 2
                boolean r0 = r0.get(r1)
                if (r0 == 0) goto L37
                java.lang.String r6 = r6.z()
                r7.c = r6
                r7.c(r2)
            L37:
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

        /* synthetic */ d(com.umeng.commonsdk.statistics.proto.e.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public com.umeng.commonsdk.statistics.proto.e.c a() {
                r2 = this;
                com.umeng.commonsdk.statistics.proto.e$c r0 = new com.umeng.commonsdk.statistics.proto.e$c
                r1 = 0
                r0.<init>(r1)
                return r0
        }

        @Override // com.umeng.analytics.pro.cz
        public /* synthetic */ com.umeng.analytics.pro.cy b() {
                r1 = this;
                com.umeng.commonsdk.statistics.proto.e$c r0 = r1.a()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.umeng.commonsdk.statistics.proto.e$e, reason: collision with other inner class name */
    public enum EnumC0056e extends java.lang.Enum<com.umeng.commonsdk.statistics.proto.e.EnumC0056e> implements com.umeng.analytics.pro.by {
        public static final com.umeng.commonsdk.statistics.proto.e.EnumC0056e a = null;
        public static final com.umeng.commonsdk.statistics.proto.e.EnumC0056e b = null;
        public static final com.umeng.commonsdk.statistics.proto.e.EnumC0056e c = null;
        private static final java.util.Map<java.lang.String, com.umeng.commonsdk.statistics.proto.e.EnumC0056e> d = null;
        private static final /* synthetic */ com.umeng.commonsdk.statistics.proto.e.EnumC0056e[] g = null;
        private final short e;
        private final java.lang.String f;

        static {
                com.umeng.commonsdk.statistics.proto.e$e r0 = new com.umeng.commonsdk.statistics.proto.e$e
                java.lang.String r1 = "value"
                java.lang.String r2 = "VALUE"
                r3 = 0
                r4 = 1
                r0.<init>(r2, r3, r4, r1)
                com.umeng.commonsdk.statistics.proto.e.EnumC0056e.a = r0
                com.umeng.commonsdk.statistics.proto.e$e r1 = new com.umeng.commonsdk.statistics.proto.e$e
                java.lang.String r2 = "ts"
                java.lang.String r5 = "TS"
                r6 = 2
                r1.<init>(r5, r4, r6, r2)
                com.umeng.commonsdk.statistics.proto.e.EnumC0056e.b = r1
                com.umeng.commonsdk.statistics.proto.e$e r2 = new com.umeng.commonsdk.statistics.proto.e$e
                java.lang.String r5 = "guid"
                java.lang.String r7 = "GUID"
                r8 = 3
                r2.<init>(r7, r6, r8, r5)
                com.umeng.commonsdk.statistics.proto.e.EnumC0056e.c = r2
                com.umeng.commonsdk.statistics.proto.e$e[] r5 = new com.umeng.commonsdk.statistics.proto.e.EnumC0056e[r8]
                r5[r3] = r0
                r5[r4] = r1
                r5[r6] = r2
                com.umeng.commonsdk.statistics.proto.e.EnumC0056e.g = r5
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                com.umeng.commonsdk.statistics.proto.e.EnumC0056e.d = r0
                java.lang.Class<com.umeng.commonsdk.statistics.proto.e$e> r0 = com.umeng.commonsdk.statistics.proto.e.EnumC0056e.class
                java.util.EnumSet r0 = java.util.EnumSet.allOf(r0)
                java.util.Iterator r0 = r0.iterator()
            L40:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L56
                java.lang.Object r1 = r0.next()
                com.umeng.commonsdk.statistics.proto.e$e r1 = (com.umeng.commonsdk.statistics.proto.e.EnumC0056e) r1
                java.util.Map<java.lang.String, com.umeng.commonsdk.statistics.proto.e$e> r2 = com.umeng.commonsdk.statistics.proto.e.EnumC0056e.d
                java.lang.String r3 = r1.b()
                r2.put(r3, r1)
                goto L40
            L56:
                return
        }

        EnumC0056e(java.lang.String r1, int r2, short r3, java.lang.String r4) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.e = r3
                r0.f = r4
                return
        }

        public static com.umeng.commonsdk.statistics.proto.e.EnumC0056e a(int r1) {
                r0 = 1
                if (r1 == r0) goto L11
                r0 = 2
                if (r1 == r0) goto Le
                r0 = 3
                if (r1 == r0) goto Lb
                r1 = 0
                return r1
            Lb:
                com.umeng.commonsdk.statistics.proto.e$e r1 = com.umeng.commonsdk.statistics.proto.e.EnumC0056e.c
                return r1
            Le:
                com.umeng.commonsdk.statistics.proto.e$e r1 = com.umeng.commonsdk.statistics.proto.e.EnumC0056e.b
                return r1
            L11:
                com.umeng.commonsdk.statistics.proto.e$e r1 = com.umeng.commonsdk.statistics.proto.e.EnumC0056e.a
                return r1
        }

        public static com.umeng.commonsdk.statistics.proto.e.EnumC0056e a(java.lang.String r1) {
                java.util.Map<java.lang.String, com.umeng.commonsdk.statistics.proto.e$e> r0 = com.umeng.commonsdk.statistics.proto.e.EnumC0056e.d
                java.lang.Object r1 = r0.get(r1)
                com.umeng.commonsdk.statistics.proto.e$e r1 = (com.umeng.commonsdk.statistics.proto.e.EnumC0056e) r1
                return r1
        }

        public static com.umeng.commonsdk.statistics.proto.e.EnumC0056e b(int r3) {
                com.umeng.commonsdk.statistics.proto.e$e r0 = a(r3)
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

        public static com.umeng.commonsdk.statistics.proto.e.EnumC0056e valueOf(java.lang.String r1) {
                java.lang.Class<com.umeng.commonsdk.statistics.proto.e$e> r0 = com.umeng.commonsdk.statistics.proto.e.EnumC0056e.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.umeng.commonsdk.statistics.proto.e$e r1 = (com.umeng.commonsdk.statistics.proto.e.EnumC0056e) r1
                return r1
        }

        public static com.umeng.commonsdk.statistics.proto.e.EnumC0056e[] values() {
                com.umeng.commonsdk.statistics.proto.e$e[] r0 = com.umeng.commonsdk.statistics.proto.e.EnumC0056e.g
                java.lang.Object r0 = r0.clone()
                com.umeng.commonsdk.statistics.proto.e$e[] r0 = (com.umeng.commonsdk.statistics.proto.e.EnumC0056e[]) r0
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
            java.lang.String r1 = "ImprintValue"
            r0.<init>(r1)
            com.umeng.commonsdk.statistics.proto.e.f = r0
            com.umeng.analytics.pro.cl r0 = new com.umeng.analytics.pro.cl
            r1 = 1
            java.lang.String r2 = "value"
            r3 = 11
            r0.<init>(r2, r3, r1)
            com.umeng.commonsdk.statistics.proto.e.g = r0
            com.umeng.analytics.pro.cl r0 = new com.umeng.analytics.pro.cl
            java.lang.String r1 = "ts"
            r4 = 10
            r5 = 2
            r0.<init>(r1, r4, r5)
            com.umeng.commonsdk.statistics.proto.e.h = r0
            com.umeng.analytics.pro.cl r0 = new com.umeng.analytics.pro.cl
            r6 = 3
            java.lang.String r7 = "guid"
            r0.<init>(r7, r3, r6)
            com.umeng.commonsdk.statistics.proto.e.i = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.umeng.commonsdk.statistics.proto.e.j = r0
            com.umeng.commonsdk.statistics.proto.e$b r6 = new com.umeng.commonsdk.statistics.proto.e$b
            r8 = 0
            r6.<init>(r8)
            java.lang.Class<com.umeng.analytics.pro.da> r9 = com.umeng.analytics.pro.da.class
            r0.put(r9, r6)
            com.umeng.commonsdk.statistics.proto.e$d r6 = new com.umeng.commonsdk.statistics.proto.e$d
            r6.<init>(r8)
            java.lang.Class<com.umeng.analytics.pro.db> r8 = com.umeng.analytics.pro.db.class
            r0.put(r8, r6)
            java.util.EnumMap r0 = new java.util.EnumMap
            java.lang.Class<com.umeng.commonsdk.statistics.proto.e$e> r6 = com.umeng.commonsdk.statistics.proto.e.EnumC0056e.class
            r0.<init>(r6)
            com.umeng.commonsdk.statistics.proto.e$e r6 = com.umeng.commonsdk.statistics.proto.e.EnumC0056e.a
            com.umeng.analytics.pro.cd r8 = new com.umeng.analytics.pro.cd
            com.umeng.analytics.pro.ce r9 = new com.umeng.analytics.pro.ce
            r9.<init>(r3)
            r8.<init>(r2, r5, r9)
            r0.put(r6, r8)
            com.umeng.commonsdk.statistics.proto.e$e r2 = com.umeng.commonsdk.statistics.proto.e.EnumC0056e.b
            com.umeng.analytics.pro.cd r6 = new com.umeng.analytics.pro.cd
            com.umeng.analytics.pro.ce r8 = new com.umeng.analytics.pro.ce
            r8.<init>(r4)
            r6.<init>(r1, r5, r8)
            r0.put(r2, r6)
            com.umeng.commonsdk.statistics.proto.e$e r1 = com.umeng.commonsdk.statistics.proto.e.EnumC0056e.c
            com.umeng.analytics.pro.cd r2 = new com.umeng.analytics.pro.cd
            com.umeng.analytics.pro.ce r4 = new com.umeng.analytics.pro.ce
            r4.<init>(r3)
            r2.<init>(r7, r5, r4)
            r0.put(r1, r2)
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)
            com.umeng.commonsdk.statistics.proto.e.d = r0
            java.lang.Class<com.umeng.commonsdk.statistics.proto.e> r1 = com.umeng.commonsdk.statistics.proto.e.class
            com.umeng.analytics.pro.cd.a(r1, r0)
            return
    }

    public e() {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.l = r0
            r1 = 3
            com.umeng.commonsdk.statistics.proto.e$e[] r1 = new com.umeng.commonsdk.statistics.proto.e.EnumC0056e[r1]
            com.umeng.commonsdk.statistics.proto.e$e r2 = com.umeng.commonsdk.statistics.proto.e.EnumC0056e.a
            r1[r0] = r2
            com.umeng.commonsdk.statistics.proto.e$e r0 = com.umeng.commonsdk.statistics.proto.e.EnumC0056e.b
            r2 = 1
            r1[r2] = r0
            com.umeng.commonsdk.statistics.proto.e$e r0 = com.umeng.commonsdk.statistics.proto.e.EnumC0056e.c
            r2 = 2
            r1[r2] = r0
            r3.m = r1
            return
    }

    public e(long r1, java.lang.String r3) {
            r0 = this;
            r0.<init>()
            r0.b = r1
            r1 = 1
            r0.b(r1)
            r0.c = r3
            return
    }

    public e(com.umeng.commonsdk.statistics.proto.e r4) {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.l = r0
            r1 = 3
            com.umeng.commonsdk.statistics.proto.e$e[] r1 = new com.umeng.commonsdk.statistics.proto.e.EnumC0056e[r1]
            com.umeng.commonsdk.statistics.proto.e$e r2 = com.umeng.commonsdk.statistics.proto.e.EnumC0056e.a
            r1[r0] = r2
            com.umeng.commonsdk.statistics.proto.e$e r0 = com.umeng.commonsdk.statistics.proto.e.EnumC0056e.b
            r2 = 1
            r1[r2] = r0
            com.umeng.commonsdk.statistics.proto.e$e r0 = com.umeng.commonsdk.statistics.proto.e.EnumC0056e.c
            r2 = 2
            r1[r2] = r0
            r3.m = r1
            byte r0 = r4.l
            r3.l = r0
            boolean r0 = r4.d()
            if (r0 == 0) goto L27
            java.lang.String r0 = r4.a
            r3.a = r0
        L27:
            long r0 = r4.b
            r3.b = r0
            boolean r0 = r4.j()
            if (r0 == 0) goto L35
            java.lang.String r4 = r4.c
            r3.c = r4
        L35:
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

    static /* synthetic */ com.umeng.analytics.pro.cv l() {
            com.umeng.analytics.pro.cv r0 = com.umeng.commonsdk.statistics.proto.e.f
            return r0
    }

    static /* synthetic */ com.umeng.analytics.pro.cl m() {
            com.umeng.analytics.pro.cl r0 = com.umeng.commonsdk.statistics.proto.e.g
            return r0
    }

    static /* synthetic */ com.umeng.analytics.pro.cl n() {
            com.umeng.analytics.pro.cl r0 = com.umeng.commonsdk.statistics.proto.e.h
            return r0
    }

    static /* synthetic */ com.umeng.analytics.pro.cl o() {
            com.umeng.analytics.pro.cl r0 = com.umeng.commonsdk.statistics.proto.e.i
            return r0
    }

    public com.umeng.commonsdk.statistics.proto.e.EnumC0056e a(int r1) {
            r0 = this;
            com.umeng.commonsdk.statistics.proto.e$e r1 = com.umeng.commonsdk.statistics.proto.e.EnumC0056e.a(r1)
            return r1
    }

    public com.umeng.commonsdk.statistics.proto.e a() {
            r1 = this;
            com.umeng.commonsdk.statistics.proto.e r0 = new com.umeng.commonsdk.statistics.proto.e
            r0.<init>(r1)
            return r0
    }

    public com.umeng.commonsdk.statistics.proto.e a(long r1) {
            r0 = this;
            r0.b = r1
            r1 = 1
            r0.b(r1)
            return r0
    }

    public com.umeng.commonsdk.statistics.proto.e a(java.lang.String r1) {
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

    public com.umeng.commonsdk.statistics.proto.e b(java.lang.String r1) {
            r0 = this;
            r0.c = r1
            return r0
    }

    public java.lang.String b() {
            r1 = this;
            java.lang.String r0 = r1.a
            return r0
    }

    public void b(boolean r3) {
            r2 = this;
            byte r0 = r2.l
            r1 = 0
            byte r3 = com.umeng.analytics.pro.bo.a(r0, r1, r3)
            r2.l = r3
            return
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
            r3 = this;
            r0 = 0
            r3.a = r0
            r1 = 0
            r3.b(r1)
            r1 = 0
            r3.b = r1
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
    public /* synthetic */ com.umeng.analytics.pro.br<com.umeng.commonsdk.statistics.proto.e, com.umeng.commonsdk.statistics.proto.e.EnumC0056e> deepCopy() {
            r1 = this;
            com.umeng.commonsdk.statistics.proto.e r0 = r1.a()
            return r0
    }

    public long e() {
            r2 = this;
            long r0 = r2.b
            return r0
    }

    public void f() {
            r2 = this;
            byte r0 = r2.l
            r1 = 0
            byte r0 = com.umeng.analytics.pro.bo.b(r0, r1)
            r2.l = r0
            return
    }

    @Override // com.umeng.analytics.pro.br
    public /* synthetic */ com.umeng.commonsdk.statistics.proto.e.EnumC0056e fieldForId(int r1) {
            r0 = this;
            com.umeng.commonsdk.statistics.proto.e$e r1 = r0.a(r1)
            return r1
    }

    public boolean g() {
            r2 = this;
            byte r0 = r2.l
            r1 = 0
            boolean r0 = com.umeng.analytics.pro.bo.a(r0, r1)
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

    public void k() throws com.umeng.analytics.pro.bx {
            r0 = this;
            return
    }

    @Override // com.umeng.analytics.pro.br
    public void read(com.umeng.analytics.pro.cq r3) throws com.umeng.analytics.pro.bx {
            r2 = this;
            java.util.Map<java.lang.Class<? extends com.umeng.analytics.pro.cy>, com.umeng.analytics.pro.cz> r0 = com.umeng.commonsdk.statistics.proto.e.j
            java.lang.Class r1 = r3.D()
            java.lang.Object r0 = r0.get(r1)
            com.umeng.analytics.pro.cz r0 = (com.umeng.analytics.pro.cz) r0
            com.umeng.analytics.pro.cy r0 = r0.b()
            r0.b(r3, r2)
            return
    }

    public java.lang.String toString() {
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ImprintValue("
            r0.<init>(r1)
            boolean r1 = r6.d()
            java.lang.String r2 = ", "
            java.lang.String r3 = "null"
            if (r1 == 0) goto L24
            java.lang.String r1 = "value:"
            r0.append(r1)
            java.lang.String r1 = r6.a
            if (r1 != 0) goto L1e
            r0.append(r3)
            goto L21
        L1e:
            r0.append(r1)
        L21:
            r0.append(r2)
        L24:
            java.lang.String r1 = "ts:"
            r0.append(r1)
            long r4 = r6.b
            r0.append(r4)
            r0.append(r2)
            java.lang.String r1 = "guid:"
            r0.append(r1)
            java.lang.String r1 = r6.c
            if (r1 != 0) goto L3e
            r0.append(r3)
            goto L41
        L3e:
            r0.append(r1)
        L41:
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // com.umeng.analytics.pro.br
    public void write(com.umeng.analytics.pro.cq r3) throws com.umeng.analytics.pro.bx {
            r2 = this;
            java.util.Map<java.lang.Class<? extends com.umeng.analytics.pro.cy>, com.umeng.analytics.pro.cz> r0 = com.umeng.commonsdk.statistics.proto.e.j
            java.lang.Class r1 = r3.D()
            java.lang.Object r0 = r0.get(r1)
            com.umeng.analytics.pro.cz r0 = (com.umeng.analytics.pro.cz) r0
            com.umeng.analytics.pro.cy r0 = r0.b()
            r0.a(r3, r2)
            return
    }
}

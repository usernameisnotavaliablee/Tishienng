package com.umeng.commonsdk.statistics.proto;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class c implements com.umeng.analytics.pro.br<com.umeng.commonsdk.statistics.proto.c, com.umeng.commonsdk.statistics.proto.c.e>, java.io.Serializable, java.lang.Cloneable {
    public static final java.util.Map<com.umeng.commonsdk.statistics.proto.c.e, com.umeng.analytics.pro.cd> d = null;
    private static final long e = -5764118265293965743L;
    private static final com.umeng.analytics.pro.cv f = null;
    private static final com.umeng.analytics.pro.cl g = null;
    private static final com.umeng.analytics.pro.cl h = null;
    private static final com.umeng.analytics.pro.cl i = null;
    private static final java.util.Map<java.lang.Class<? extends com.umeng.analytics.pro.cy>, com.umeng.analytics.pro.cz> j = null;
    public java.util.Map<java.lang.String, com.umeng.commonsdk.statistics.proto.b> a;
    public java.util.List<com.umeng.commonsdk.statistics.proto.a> b;
    public java.lang.String c;
    private com.umeng.commonsdk.statistics.proto.c.e[] k;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.umeng.commonsdk.statistics.proto.c$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class a extends com.umeng.analytics.pro.da<com.umeng.commonsdk.statistics.proto.c> {
        private a() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ a(com.umeng.commonsdk.statistics.proto.c.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.umeng.analytics.pro.cy
        public /* synthetic */ void a(com.umeng.analytics.pro.cq r1, com.umeng.analytics.pro.br r2) throws com.umeng.analytics.pro.bx {
                r0 = this;
                com.umeng.commonsdk.statistics.proto.c r2 = (com.umeng.commonsdk.statistics.proto.c) r2
                r0.b(r1, r2)
                return
        }

        public void a(com.umeng.analytics.pro.cq r7, com.umeng.commonsdk.statistics.proto.c r8) throws com.umeng.analytics.pro.bx {
                r6 = this;
                r7.j()
            L3:
                com.umeng.analytics.pro.cl r0 = r7.l()
                byte r1 = r0.b
                if (r1 != 0) goto L12
                r7.k()
                r8.n()
                return
            L12:
                short r0 = r0.c
                r2 = 0
                r3 = 2
                r4 = 1
                if (r0 == r4) goto L65
                if (r0 == r3) goto L35
                r2 = 3
                if (r0 == r2) goto L23
                com.umeng.analytics.pro.ct.a(r7, r1)
                goto L9a
            L23:
                r0 = 11
                if (r1 != r0) goto L31
                java.lang.String r0 = r7.z()
                r8.c = r0
                r8.c(r4)
                goto L9a
            L31:
                com.umeng.analytics.pro.ct.a(r7, r1)
                goto L9a
            L35:
                r0 = 15
                if (r1 != r0) goto L61
                com.umeng.analytics.pro.cm r0 = r7.p()
                java.util.ArrayList r1 = new java.util.ArrayList
                int r3 = r0.b
                r1.<init>(r3)
                r8.b = r1
            L46:
                int r1 = r0.b
                if (r2 >= r1) goto L5a
                com.umeng.commonsdk.statistics.proto.a r1 = new com.umeng.commonsdk.statistics.proto.a
                r1.<init>()
                r1.read(r7)
                java.util.List<com.umeng.commonsdk.statistics.proto.a> r3 = r8.b
                r3.add(r1)
                int r2 = r2 + 1
                goto L46
            L5a:
                r7.q()
                r8.b(r4)
                goto L9a
            L61:
                com.umeng.analytics.pro.ct.a(r7, r1)
                goto L9a
            L65:
                r0 = 13
                if (r1 != r0) goto L97
                com.umeng.analytics.pro.cn r0 = r7.n()
                java.util.HashMap r1 = new java.util.HashMap
                int r5 = r0.c
                int r5 = r5 * 2
                r1.<init>(r5)
                r8.a = r1
            L78:
                int r1 = r0.c
                if (r2 >= r1) goto L90
                java.lang.String r1 = r7.z()
                com.umeng.commonsdk.statistics.proto.b r3 = new com.umeng.commonsdk.statistics.proto.b
                r3.<init>()
                r3.read(r7)
                java.util.Map<java.lang.String, com.umeng.commonsdk.statistics.proto.b> r5 = r8.a
                r5.put(r1, r3)
                int r2 = r2 + 1
                goto L78
            L90:
                r7.o()
                r8.a(r4)
                goto L9a
            L97:
                com.umeng.analytics.pro.ct.a(r7, r1)
            L9a:
                r7.m()
                goto L3
        }

        @Override // com.umeng.analytics.pro.cy
        public /* synthetic */ void b(com.umeng.analytics.pro.cq r1, com.umeng.analytics.pro.br r2) throws com.umeng.analytics.pro.bx {
                r0 = this;
                com.umeng.commonsdk.statistics.proto.c r2 = (com.umeng.commonsdk.statistics.proto.c) r2
                r0.a(r1, r2)
                return
        }

        public void b(com.umeng.analytics.pro.cq r5, com.umeng.commonsdk.statistics.proto.c r6) throws com.umeng.analytics.pro.bx {
                r4 = this;
                r6.n()
                com.umeng.analytics.pro.cv r0 = com.umeng.commonsdk.statistics.proto.c.o()
                r5.a(r0)
                java.util.Map<java.lang.String, com.umeng.commonsdk.statistics.proto.b> r0 = r6.a
                r1 = 12
                if (r0 == 0) goto L56
                com.umeng.analytics.pro.cl r0 = com.umeng.commonsdk.statistics.proto.c.p()
                r5.a(r0)
                com.umeng.analytics.pro.cn r0 = new com.umeng.analytics.pro.cn
                java.util.Map<java.lang.String, com.umeng.commonsdk.statistics.proto.b> r2 = r6.a
                int r2 = r2.size()
                r3 = 11
                r0.<init>(r3, r1, r2)
                r5.a(r0)
                java.util.Map<java.lang.String, com.umeng.commonsdk.statistics.proto.b> r0 = r6.a
                java.util.Set r0 = r0.entrySet()
                java.util.Iterator r0 = r0.iterator()
            L31:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L50
                java.lang.Object r2 = r0.next()
                java.util.Map$Entry r2 = (java.util.Map.Entry) r2
                java.lang.Object r3 = r2.getKey()
                java.lang.String r3 = (java.lang.String) r3
                r5.a(r3)
                java.lang.Object r2 = r2.getValue()
                com.umeng.commonsdk.statistics.proto.b r2 = (com.umeng.commonsdk.statistics.proto.b) r2
                r2.write(r5)
                goto L31
            L50:
                r5.e()
                r5.c()
            L56:
                java.util.List<com.umeng.commonsdk.statistics.proto.a> r0 = r6.b
                if (r0 == 0) goto L91
                boolean r0 = r6.j()
                if (r0 == 0) goto L91
                com.umeng.analytics.pro.cl r0 = com.umeng.commonsdk.statistics.proto.c.q()
                r5.a(r0)
                com.umeng.analytics.pro.cm r0 = new com.umeng.analytics.pro.cm
                java.util.List<com.umeng.commonsdk.statistics.proto.a> r2 = r6.b
                int r2 = r2.size()
                r0.<init>(r1, r2)
                r5.a(r0)
                java.util.List<com.umeng.commonsdk.statistics.proto.a> r0 = r6.b
                java.util.Iterator r0 = r0.iterator()
            L7b:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L8b
                java.lang.Object r1 = r0.next()
                com.umeng.commonsdk.statistics.proto.a r1 = (com.umeng.commonsdk.statistics.proto.a) r1
                r1.write(r5)
                goto L7b
            L8b:
                r5.f()
                r5.c()
            L91:
                java.lang.String r0 = r6.c
                if (r0 == 0) goto Laa
                boolean r0 = r6.m()
                if (r0 == 0) goto Laa
                com.umeng.analytics.pro.cl r0 = com.umeng.commonsdk.statistics.proto.c.r()
                r5.a(r0)
                java.lang.String r6 = r6.c
                r5.a(r6)
                r5.c()
            Laa:
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

        /* synthetic */ b(com.umeng.commonsdk.statistics.proto.c.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public com.umeng.commonsdk.statistics.proto.c.a a() {
                r2 = this;
                com.umeng.commonsdk.statistics.proto.c$a r0 = new com.umeng.commonsdk.statistics.proto.c$a
                r1 = 0
                r0.<init>(r1)
                return r0
        }

        @Override // com.umeng.analytics.pro.cz
        public /* synthetic */ com.umeng.analytics.pro.cy b() {
                r1 = this;
                com.umeng.commonsdk.statistics.proto.c$a r0 = r1.a()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.umeng.commonsdk.statistics.proto.c$c, reason: collision with other inner class name */
    private static class C0054c extends com.umeng.analytics.pro.db<com.umeng.commonsdk.statistics.proto.c> {
        private C0054c() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ C0054c(com.umeng.commonsdk.statistics.proto.c.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.umeng.analytics.pro.cy
        public /* bridge */ /* synthetic */ void a(com.umeng.analytics.pro.cq r1, com.umeng.analytics.pro.br r2) throws com.umeng.analytics.pro.bx {
                r0 = this;
                com.umeng.commonsdk.statistics.proto.c r2 = (com.umeng.commonsdk.statistics.proto.c) r2
                r0.a(r1, r2)
                return
        }

        public void a(com.umeng.analytics.pro.cq r4, com.umeng.commonsdk.statistics.proto.c r5) throws com.umeng.analytics.pro.bx {
                r3 = this;
                com.umeng.analytics.pro.cw r4 = (com.umeng.analytics.pro.cw) r4
                java.util.Map<java.lang.String, com.umeng.commonsdk.statistics.proto.b> r0 = r5.a
                int r0 = r0.size()
                r4.a(r0)
                java.util.Map<java.lang.String, com.umeng.commonsdk.statistics.proto.b> r0 = r5.a
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
                com.umeng.commonsdk.statistics.proto.b r1 = (com.umeng.commonsdk.statistics.proto.b) r1
                r1.write(r4)
                goto L15
            L34:
                java.util.BitSet r0 = new java.util.BitSet
                r0.<init>()
                boolean r1 = r5.j()
                if (r1 == 0) goto L43
                r1 = 0
                r0.set(r1)
            L43:
                boolean r1 = r5.m()
                if (r1 == 0) goto L4d
                r1 = 1
                r0.set(r1)
            L4d:
                r1 = 2
                r4.a(r0, r1)
                boolean r0 = r5.j()
                if (r0 == 0) goto L76
                java.util.List<com.umeng.commonsdk.statistics.proto.a> r0 = r5.b
                int r0 = r0.size()
                r4.a(r0)
                java.util.List<com.umeng.commonsdk.statistics.proto.a> r0 = r5.b
                java.util.Iterator r0 = r0.iterator()
            L66:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L76
                java.lang.Object r1 = r0.next()
                com.umeng.commonsdk.statistics.proto.a r1 = (com.umeng.commonsdk.statistics.proto.a) r1
                r1.write(r4)
                goto L66
            L76:
                boolean r0 = r5.m()
                if (r0 == 0) goto L81
                java.lang.String r5 = r5.c
                r4.a(r5)
            L81:
                return
        }

        @Override // com.umeng.analytics.pro.cy
        public /* bridge */ /* synthetic */ void b(com.umeng.analytics.pro.cq r1, com.umeng.analytics.pro.br r2) throws com.umeng.analytics.pro.bx {
                r0 = this;
                com.umeng.commonsdk.statistics.proto.c r2 = (com.umeng.commonsdk.statistics.proto.c) r2
                r0.b(r1, r2)
                return
        }

        public void b(com.umeng.analytics.pro.cq r9, com.umeng.commonsdk.statistics.proto.c r10) throws com.umeng.analytics.pro.bx {
                r8 = this;
                com.umeng.analytics.pro.cw r9 = (com.umeng.analytics.pro.cw) r9
                com.umeng.analytics.pro.cn r0 = new com.umeng.analytics.pro.cn
                int r1 = r9.w()
                r2 = 11
                r3 = 12
                r0.<init>(r2, r3, r1)
                java.util.HashMap r1 = new java.util.HashMap
                int r2 = r0.c
                r4 = 2
                int r2 = r2 * 2
                r1.<init>(r2)
                r10.a = r1
                r1 = 0
                r2 = 0
            L1d:
                int r5 = r0.c
                if (r2 >= r5) goto L35
                java.lang.String r5 = r9.z()
                com.umeng.commonsdk.statistics.proto.b r6 = new com.umeng.commonsdk.statistics.proto.b
                r6.<init>()
                r6.read(r9)
                java.util.Map<java.lang.String, com.umeng.commonsdk.statistics.proto.b> r7 = r10.a
                r7.put(r5, r6)
                int r2 = r2 + 1
                goto L1d
            L35:
                r0 = 1
                r10.a(r0)
                java.util.BitSet r2 = r9.b(r4)
                boolean r4 = r2.get(r1)
                if (r4 == 0) goto L6c
                com.umeng.analytics.pro.cm r4 = new com.umeng.analytics.pro.cm
                int r5 = r9.w()
                r4.<init>(r3, r5)
                java.util.ArrayList r3 = new java.util.ArrayList
                int r5 = r4.b
                r3.<init>(r5)
                r10.b = r3
            L55:
                int r3 = r4.b
                if (r1 >= r3) goto L69
                com.umeng.commonsdk.statistics.proto.a r3 = new com.umeng.commonsdk.statistics.proto.a
                r3.<init>()
                r3.read(r9)
                java.util.List<com.umeng.commonsdk.statistics.proto.a> r5 = r10.b
                r5.add(r3)
                int r1 = r1 + 1
                goto L55
            L69:
                r10.b(r0)
            L6c:
                boolean r1 = r2.get(r0)
                if (r1 == 0) goto L7b
                java.lang.String r9 = r9.z()
                r10.c = r9
                r10.c(r0)
            L7b:
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

        /* synthetic */ d(com.umeng.commonsdk.statistics.proto.c.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public com.umeng.commonsdk.statistics.proto.c.C0054c a() {
                r2 = this;
                com.umeng.commonsdk.statistics.proto.c$c r0 = new com.umeng.commonsdk.statistics.proto.c$c
                r1 = 0
                r0.<init>(r1)
                return r0
        }

        @Override // com.umeng.analytics.pro.cz
        public /* synthetic */ com.umeng.analytics.pro.cy b() {
                r1 = this;
                com.umeng.commonsdk.statistics.proto.c$c r0 = r1.a()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum e extends java.lang.Enum<com.umeng.commonsdk.statistics.proto.c.e> implements com.umeng.analytics.pro.by {
        public static final com.umeng.commonsdk.statistics.proto.c.e a = null;
        public static final com.umeng.commonsdk.statistics.proto.c.e b = null;
        public static final com.umeng.commonsdk.statistics.proto.c.e c = null;
        private static final java.util.Map<java.lang.String, com.umeng.commonsdk.statistics.proto.c.e> d = null;
        private static final /* synthetic */ com.umeng.commonsdk.statistics.proto.c.e[] g = null;
        private final short e;
        private final java.lang.String f;

        static {
                com.umeng.commonsdk.statistics.proto.c$e r0 = new com.umeng.commonsdk.statistics.proto.c$e
                java.lang.String r1 = "snapshots"
                java.lang.String r2 = "SNAPSHOTS"
                r3 = 0
                r4 = 1
                r0.<init>(r2, r3, r4, r1)
                com.umeng.commonsdk.statistics.proto.c.e.a = r0
                com.umeng.commonsdk.statistics.proto.c$e r1 = new com.umeng.commonsdk.statistics.proto.c$e
                java.lang.String r2 = "journals"
                java.lang.String r5 = "JOURNALS"
                r6 = 2
                r1.<init>(r5, r4, r6, r2)
                com.umeng.commonsdk.statistics.proto.c.e.b = r1
                com.umeng.commonsdk.statistics.proto.c$e r2 = new com.umeng.commonsdk.statistics.proto.c$e
                java.lang.String r5 = "checksum"
                java.lang.String r7 = "CHECKSUM"
                r8 = 3
                r2.<init>(r7, r6, r8, r5)
                com.umeng.commonsdk.statistics.proto.c.e.c = r2
                com.umeng.commonsdk.statistics.proto.c$e[] r5 = new com.umeng.commonsdk.statistics.proto.c.e[r8]
                r5[r3] = r0
                r5[r4] = r1
                r5[r6] = r2
                com.umeng.commonsdk.statistics.proto.c.e.g = r5
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                com.umeng.commonsdk.statistics.proto.c.e.d = r0
                java.lang.Class<com.umeng.commonsdk.statistics.proto.c$e> r0 = com.umeng.commonsdk.statistics.proto.c.e.class
                java.util.EnumSet r0 = java.util.EnumSet.allOf(r0)
                java.util.Iterator r0 = r0.iterator()
            L40:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L56
                java.lang.Object r1 = r0.next()
                com.umeng.commonsdk.statistics.proto.c$e r1 = (com.umeng.commonsdk.statistics.proto.c.e) r1
                java.util.Map<java.lang.String, com.umeng.commonsdk.statistics.proto.c$e> r2 = com.umeng.commonsdk.statistics.proto.c.e.d
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

        public static com.umeng.commonsdk.statistics.proto.c.e a(int r1) {
                r0 = 1
                if (r1 == r0) goto L11
                r0 = 2
                if (r1 == r0) goto Le
                r0 = 3
                if (r1 == r0) goto Lb
                r1 = 0
                return r1
            Lb:
                com.umeng.commonsdk.statistics.proto.c$e r1 = com.umeng.commonsdk.statistics.proto.c.e.c
                return r1
            Le:
                com.umeng.commonsdk.statistics.proto.c$e r1 = com.umeng.commonsdk.statistics.proto.c.e.b
                return r1
            L11:
                com.umeng.commonsdk.statistics.proto.c$e r1 = com.umeng.commonsdk.statistics.proto.c.e.a
                return r1
        }

        public static com.umeng.commonsdk.statistics.proto.c.e a(java.lang.String r1) {
                java.util.Map<java.lang.String, com.umeng.commonsdk.statistics.proto.c$e> r0 = com.umeng.commonsdk.statistics.proto.c.e.d
                java.lang.Object r1 = r0.get(r1)
                com.umeng.commonsdk.statistics.proto.c$e r1 = (com.umeng.commonsdk.statistics.proto.c.e) r1
                return r1
        }

        public static com.umeng.commonsdk.statistics.proto.c.e b(int r3) {
                com.umeng.commonsdk.statistics.proto.c$e r0 = a(r3)
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

        public static com.umeng.commonsdk.statistics.proto.c.e valueOf(java.lang.String r1) {
                java.lang.Class<com.umeng.commonsdk.statistics.proto.c$e> r0 = com.umeng.commonsdk.statistics.proto.c.e.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.umeng.commonsdk.statistics.proto.c$e r1 = (com.umeng.commonsdk.statistics.proto.c.e) r1
                return r1
        }

        public static com.umeng.commonsdk.statistics.proto.c.e[] values() {
                com.umeng.commonsdk.statistics.proto.c$e[] r0 = com.umeng.commonsdk.statistics.proto.c.e.g
                java.lang.Object r0 = r0.clone()
                com.umeng.commonsdk.statistics.proto.c$e[] r0 = (com.umeng.commonsdk.statistics.proto.c.e[]) r0
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
            java.lang.String r1 = "IdTracking"
            r0.<init>(r1)
            com.umeng.commonsdk.statistics.proto.c.f = r0
            com.umeng.analytics.pro.cl r0 = new com.umeng.analytics.pro.cl
            java.lang.String r1 = "snapshots"
            r2 = 13
            r3 = 1
            r0.<init>(r1, r2, r3)
            com.umeng.commonsdk.statistics.proto.c.g = r0
            com.umeng.analytics.pro.cl r0 = new com.umeng.analytics.pro.cl
            java.lang.String r4 = "journals"
            r5 = 15
            r6 = 2
            r0.<init>(r4, r5, r6)
            com.umeng.commonsdk.statistics.proto.c.h = r0
            com.umeng.analytics.pro.cl r0 = new com.umeng.analytics.pro.cl
            r7 = 3
            java.lang.String r8 = "checksum"
            r9 = 11
            r0.<init>(r8, r9, r7)
            com.umeng.commonsdk.statistics.proto.c.i = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.umeng.commonsdk.statistics.proto.c.j = r0
            com.umeng.commonsdk.statistics.proto.c$b r7 = new com.umeng.commonsdk.statistics.proto.c$b
            r10 = 0
            r7.<init>(r10)
            java.lang.Class<com.umeng.analytics.pro.da> r11 = com.umeng.analytics.pro.da.class
            r0.put(r11, r7)
            com.umeng.commonsdk.statistics.proto.c$d r7 = new com.umeng.commonsdk.statistics.proto.c$d
            r7.<init>(r10)
            java.lang.Class<com.umeng.analytics.pro.db> r10 = com.umeng.analytics.pro.db.class
            r0.put(r10, r7)
            java.util.EnumMap r0 = new java.util.EnumMap
            java.lang.Class<com.umeng.commonsdk.statistics.proto.c$e> r7 = com.umeng.commonsdk.statistics.proto.c.e.class
            r0.<init>(r7)
            com.umeng.commonsdk.statistics.proto.c$e r7 = com.umeng.commonsdk.statistics.proto.c.e.a
            com.umeng.analytics.pro.cd r10 = new com.umeng.analytics.pro.cd
            com.umeng.analytics.pro.cg r11 = new com.umeng.analytics.pro.cg
            com.umeng.analytics.pro.ce r12 = new com.umeng.analytics.pro.ce
            r12.<init>(r9)
            com.umeng.analytics.pro.ci r13 = new com.umeng.analytics.pro.ci
            java.lang.Class<com.umeng.commonsdk.statistics.proto.b> r14 = com.umeng.commonsdk.statistics.proto.b.class
            r15 = 12
            r13.<init>(r15, r14)
            r11.<init>(r2, r12, r13)
            r10.<init>(r1, r3, r11)
            r0.put(r7, r10)
            com.umeng.commonsdk.statistics.proto.c$e r1 = com.umeng.commonsdk.statistics.proto.c.e.b
            com.umeng.analytics.pro.cd r2 = new com.umeng.analytics.pro.cd
            com.umeng.analytics.pro.cf r3 = new com.umeng.analytics.pro.cf
            com.umeng.analytics.pro.ci r7 = new com.umeng.analytics.pro.ci
            java.lang.Class<com.umeng.commonsdk.statistics.proto.a> r10 = com.umeng.commonsdk.statistics.proto.a.class
            r7.<init>(r15, r10)
            r3.<init>(r5, r7)
            r2.<init>(r4, r6, r3)
            r0.put(r1, r2)
            com.umeng.commonsdk.statistics.proto.c$e r1 = com.umeng.commonsdk.statistics.proto.c.e.c
            com.umeng.analytics.pro.cd r2 = new com.umeng.analytics.pro.cd
            com.umeng.analytics.pro.ce r3 = new com.umeng.analytics.pro.ce
            r3.<init>(r9)
            r2.<init>(r8, r6, r3)
            r0.put(r1, r2)
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)
            com.umeng.commonsdk.statistics.proto.c.d = r0
            java.lang.Class<com.umeng.commonsdk.statistics.proto.c> r1 = com.umeng.commonsdk.statistics.proto.c.class
            com.umeng.analytics.pro.cd.a(r1, r0)
            return
    }

    public c() {
            r3 = this;
            r3.<init>()
            r0 = 2
            com.umeng.commonsdk.statistics.proto.c$e[] r0 = new com.umeng.commonsdk.statistics.proto.c.e[r0]
            com.umeng.commonsdk.statistics.proto.c$e r1 = com.umeng.commonsdk.statistics.proto.c.e.b
            r2 = 0
            r0[r2] = r1
            com.umeng.commonsdk.statistics.proto.c$e r1 = com.umeng.commonsdk.statistics.proto.c.e.c
            r2 = 1
            r0[r2] = r1
            r3.k = r0
            return
    }

    public c(com.umeng.commonsdk.statistics.proto.c r6) {
            r5 = this;
            r5.<init>()
            r0 = 2
            com.umeng.commonsdk.statistics.proto.c$e[] r0 = new com.umeng.commonsdk.statistics.proto.c.e[r0]
            com.umeng.commonsdk.statistics.proto.c$e r1 = com.umeng.commonsdk.statistics.proto.c.e.b
            r2 = 0
            r0[r2] = r1
            com.umeng.commonsdk.statistics.proto.c$e r1 = com.umeng.commonsdk.statistics.proto.c.e.c
            r2 = 1
            r0[r2] = r1
            r5.k = r0
            boolean r0 = r6.e()
            if (r0 == 0) goto L4a
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Map<java.lang.String, com.umeng.commonsdk.statistics.proto.b> r1 = r6.a
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L27:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L48
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r2.getValue()
            com.umeng.commonsdk.statistics.proto.b r2 = (com.umeng.commonsdk.statistics.proto.b) r2
            com.umeng.commonsdk.statistics.proto.b r4 = new com.umeng.commonsdk.statistics.proto.b
            r4.<init>(r2)
            r0.put(r3, r4)
            goto L27
        L48:
            r5.a = r0
        L4a:
            boolean r0 = r6.j()
            if (r0 == 0) goto L72
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List<com.umeng.commonsdk.statistics.proto.a> r1 = r6.b
            java.util.Iterator r1 = r1.iterator()
        L5b:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L70
            java.lang.Object r2 = r1.next()
            com.umeng.commonsdk.statistics.proto.a r2 = (com.umeng.commonsdk.statistics.proto.a) r2
            com.umeng.commonsdk.statistics.proto.a r3 = new com.umeng.commonsdk.statistics.proto.a
            r3.<init>(r2)
            r0.add(r3)
            goto L5b
        L70:
            r5.b = r0
        L72:
            boolean r0 = r6.m()
            if (r0 == 0) goto L7c
            java.lang.String r6 = r6.c
            r5.c = r6
        L7c:
            return
    }

    public c(java.util.Map<java.lang.String, com.umeng.commonsdk.statistics.proto.b> r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    private void a(java.io.ObjectInputStream r3) throws java.io.IOException, java.lang.ClassNotFoundException {
            r2 = this;
            com.umeng.analytics.pro.ck r0 = new com.umeng.analytics.pro.ck     // Catch: com.umeng.analytics.pro.bx -> Le
            com.umeng.analytics.pro.dc r1 = new com.umeng.analytics.pro.dc     // Catch: com.umeng.analytics.pro.bx -> Le
            r1.<init>(r3)     // Catch: com.umeng.analytics.pro.bx -> Le
            r0.<init>(r1)     // Catch: com.umeng.analytics.pro.bx -> Le
            r2.read(r0)     // Catch: com.umeng.analytics.pro.bx -> Le
            return
        Le:
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
            com.umeng.analytics.pro.cv r0 = com.umeng.commonsdk.statistics.proto.c.f
            return r0
    }

    static /* synthetic */ com.umeng.analytics.pro.cl p() {
            com.umeng.analytics.pro.cl r0 = com.umeng.commonsdk.statistics.proto.c.g
            return r0
    }

    static /* synthetic */ com.umeng.analytics.pro.cl q() {
            com.umeng.analytics.pro.cl r0 = com.umeng.commonsdk.statistics.proto.c.h
            return r0
    }

    static /* synthetic */ com.umeng.analytics.pro.cl r() {
            com.umeng.analytics.pro.cl r0 = com.umeng.commonsdk.statistics.proto.c.i
            return r0
    }

    public com.umeng.commonsdk.statistics.proto.c.e a(int r1) {
            r0 = this;
            com.umeng.commonsdk.statistics.proto.c$e r1 = com.umeng.commonsdk.statistics.proto.c.e.a(r1)
            return r1
    }

    public com.umeng.commonsdk.statistics.proto.c a() {
            r1 = this;
            com.umeng.commonsdk.statistics.proto.c r0 = new com.umeng.commonsdk.statistics.proto.c
            r0.<init>(r1)
            return r0
    }

    public com.umeng.commonsdk.statistics.proto.c a(java.lang.String r1) {
            r0 = this;
            r0.c = r1
            return r0
    }

    public com.umeng.commonsdk.statistics.proto.c a(java.util.List<com.umeng.commonsdk.statistics.proto.a> r1) {
            r0 = this;
            r0.b = r1
            return r0
    }

    public com.umeng.commonsdk.statistics.proto.c a(java.util.Map<java.lang.String, com.umeng.commonsdk.statistics.proto.b> r1) {
            r0 = this;
            r0.a = r1
            return r0
    }

    public void a(com.umeng.commonsdk.statistics.proto.a r2) {
            r1 = this;
            java.util.List<com.umeng.commonsdk.statistics.proto.a> r0 = r1.b
            if (r0 != 0) goto Lb
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.b = r0
        Lb:
            java.util.List<com.umeng.commonsdk.statistics.proto.a> r0 = r1.b
            r0.add(r2)
            return
    }

    public void a(java.lang.String r2, com.umeng.commonsdk.statistics.proto.b r3) {
            r1 = this;
            java.util.Map<java.lang.String, com.umeng.commonsdk.statistics.proto.b> r0 = r1.a
            if (r0 != 0) goto Lb
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.a = r0
        Lb:
            java.util.Map<java.lang.String, com.umeng.commonsdk.statistics.proto.b> r0 = r1.a
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
            java.util.Map<java.lang.String, com.umeng.commonsdk.statistics.proto.b> r0 = r1.a
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            int r0 = r0.size()
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

    public java.util.Map<java.lang.String, com.umeng.commonsdk.statistics.proto.b> c() {
            r1 = this;
            java.util.Map<java.lang.String, com.umeng.commonsdk.statistics.proto.b> r0 = r1.a
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
            r1 = this;
            r0 = 0
            r1.a = r0
            r1.b = r0
            r1.c = r0
            return
    }

    public void d() {
            r1 = this;
            r0 = 0
            r1.a = r0
            return
    }

    @Override // com.umeng.analytics.pro.br
    public /* synthetic */ com.umeng.analytics.pro.br<com.umeng.commonsdk.statistics.proto.c, com.umeng.commonsdk.statistics.proto.c.e> deepCopy() {
            r1 = this;
            com.umeng.commonsdk.statistics.proto.c r0 = r1.a()
            return r0
    }

    public boolean e() {
            r1 = this;
            java.util.Map<java.lang.String, com.umeng.commonsdk.statistics.proto.b> r0 = r1.a
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public int f() {
            r1 = this;
            java.util.List<com.umeng.commonsdk.statistics.proto.a> r0 = r1.b
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            int r0 = r0.size()
            return r0
    }

    @Override // com.umeng.analytics.pro.br
    public /* synthetic */ com.umeng.commonsdk.statistics.proto.c.e fieldForId(int r1) {
            r0 = this;
            com.umeng.commonsdk.statistics.proto.c$e r1 = r0.a(r1)
            return r1
    }

    public java.util.Iterator<com.umeng.commonsdk.statistics.proto.a> g() {
            r1 = this;
            java.util.List<com.umeng.commonsdk.statistics.proto.a> r0 = r1.b
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.util.Iterator r0 = r0.iterator()
            return r0
    }

    public java.util.List<com.umeng.commonsdk.statistics.proto.a> h() {
            r1 = this;
            java.util.List<com.umeng.commonsdk.statistics.proto.a> r0 = r1.b
            return r0
    }

    public void i() {
            r1 = this;
            r0 = 0
            r1.b = r0
            return
    }

    public boolean j() {
            r1 = this;
            java.util.List<com.umeng.commonsdk.statistics.proto.a> r0 = r1.b
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public java.lang.String k() {
            r1 = this;
            java.lang.String r0 = r1.c
            return r0
    }

    public void l() {
            r1 = this;
            r0 = 0
            r1.c = r0
            return
    }

    public boolean m() {
            r1 = this;
            java.lang.String r0 = r1.c
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public void n() throws com.umeng.analytics.pro.bx {
            r3 = this;
            java.util.Map<java.lang.String, com.umeng.commonsdk.statistics.proto.b> r0 = r3.a
            if (r0 == 0) goto L5
            return
        L5:
            com.umeng.analytics.pro.cr r0 = new com.umeng.analytics.pro.cr
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Required field 'snapshots' was not present! Struct: "
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
            java.util.Map<java.lang.Class<? extends com.umeng.analytics.pro.cy>, com.umeng.analytics.pro.cz> r0 = com.umeng.commonsdk.statistics.proto.c.j
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
            java.lang.String r1 = "IdTracking("
            r0.<init>(r1)
            java.lang.String r1 = "snapshots:"
            r0.append(r1)
            java.util.Map<java.lang.String, com.umeng.commonsdk.statistics.proto.b> r1 = r4.a
            java.lang.String r2 = "null"
            if (r1 != 0) goto L16
            r0.append(r2)
            goto L19
        L16:
            r0.append(r1)
        L19:
            boolean r1 = r4.j()
            java.lang.String r3 = ", "
            if (r1 == 0) goto L34
            r0.append(r3)
            java.lang.String r1 = "journals:"
            r0.append(r1)
            java.util.List<com.umeng.commonsdk.statistics.proto.a> r1 = r4.b
            if (r1 != 0) goto L31
            r0.append(r2)
            goto L34
        L31:
            r0.append(r1)
        L34:
            boolean r1 = r4.m()
            if (r1 == 0) goto L4d
            r0.append(r3)
            java.lang.String r1 = "checksum:"
            r0.append(r1)
            java.lang.String r1 = r4.c
            if (r1 != 0) goto L4a
            r0.append(r2)
            goto L4d
        L4a:
            r0.append(r1)
        L4d:
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // com.umeng.analytics.pro.br
    public void write(com.umeng.analytics.pro.cq r3) throws com.umeng.analytics.pro.bx {
            r2 = this;
            java.util.Map<java.lang.Class<? extends com.umeng.analytics.pro.cy>, com.umeng.analytics.pro.cz> r0 = com.umeng.commonsdk.statistics.proto.c.j
            java.lang.Class r1 = r3.D()
            java.lang.Object r0 = r0.get(r1)
            com.umeng.analytics.pro.cz r0 = (com.umeng.analytics.pro.cz) r0
            com.umeng.analytics.pro.cy r0 = r0.b()
            r0.a(r3, r2)
            return
    }
}

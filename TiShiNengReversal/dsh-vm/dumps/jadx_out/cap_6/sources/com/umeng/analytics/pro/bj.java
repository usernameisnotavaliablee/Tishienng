package com.umeng.analytics.pro;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class bj implements com.umeng.analytics.pro.br<com.umeng.analytics.pro.bj, com.umeng.analytics.pro.bj.e>, java.io.Serializable, java.lang.Cloneable {
    private static final int A = 2;
    private static final int B = 3;
    public static final java.util.Map<com.umeng.analytics.pro.bj.e, com.umeng.analytics.pro.cd> k = null;
    private static final long l = 420342210744516016L;
    private static final com.umeng.analytics.pro.cv m = null;
    private static final com.umeng.analytics.pro.cl n = null;
    private static final com.umeng.analytics.pro.cl o = null;
    private static final com.umeng.analytics.pro.cl p = null;

    /* renamed from: q, reason: collision with root package name */
    private static final com.umeng.analytics.pro.cl f24q = null;
    private static final com.umeng.analytics.pro.cl r = null;
    private static final com.umeng.analytics.pro.cl s = null;
    private static final com.umeng.analytics.pro.cl t = null;
    private static final com.umeng.analytics.pro.cl u = null;
    private static final com.umeng.analytics.pro.cl v = null;
    private static final com.umeng.analytics.pro.cl w = null;
    private static final java.util.Map<java.lang.Class<? extends com.umeng.analytics.pro.cy>, com.umeng.analytics.pro.cz> x = null;
    private static final int y = 0;
    private static final int z = 1;
    private byte C;
    private com.umeng.analytics.pro.bj.e[] D;
    public java.lang.String a;
    public java.lang.String b;
    public java.lang.String c;
    public int d;
    public int e;
    public int f;
    public java.nio.ByteBuffer g;
    public java.lang.String h;
    public java.lang.String i;
    public int j;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.umeng.analytics.pro.bj$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class a extends com.umeng.analytics.pro.da<com.umeng.analytics.pro.bj> {
        private a() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ a(com.umeng.analytics.pro.bj.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public void a(com.umeng.analytics.pro.cq r6, com.umeng.analytics.pro.bj r7) throws com.umeng.analytics.pro.bx {
                r5 = this;
                r6.j()
            L3:
                com.umeng.analytics.pro.cl r0 = r6.l()
                byte r1 = r0.b
                if (r1 != 0) goto L75
                r6.k()
                boolean r6 = r7.m()
                if (r6 == 0) goto L5a
                boolean r6 = r7.p()
                if (r6 == 0) goto L3f
                boolean r6 = r7.s()
                if (r6 == 0) goto L24
                r7.G()
                return
            L24:
                com.umeng.analytics.pro.cr r6 = new com.umeng.analytics.pro.cr
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r0 = "Required field 'length' was not found in serialized data! Struct: "
                r7.append(r0)
                java.lang.String r0 = r5.toString()
                r7.append(r0)
                java.lang.String r7 = r7.toString()
                r6.<init>(r7)
                throw r6
            L3f:
                com.umeng.analytics.pro.cr r6 = new com.umeng.analytics.pro.cr
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r0 = "Required field 'ts_secs' was not found in serialized data! Struct: "
                r7.append(r0)
                java.lang.String r0 = r5.toString()
                r7.append(r0)
                java.lang.String r7 = r7.toString()
                r6.<init>(r7)
                throw r6
            L5a:
                com.umeng.analytics.pro.cr r6 = new com.umeng.analytics.pro.cr
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r0 = "Required field 'serial_num' was not found in serialized data! Struct: "
                r7.append(r0)
                java.lang.String r0 = r5.toString()
                r7.append(r0)
                java.lang.String r7 = r7.toString()
                r6.<init>(r7)
                throw r6
            L75:
                short r0 = r0.c
                r2 = 8
                r3 = 11
                r4 = 1
                switch(r0) {
                    case 1: goto L11b;
                    case 2: goto L10b;
                    case 3: goto Lfb;
                    case 4: goto Leb;
                    case 5: goto Ldb;
                    case 6: goto Lcb;
                    case 7: goto Lba;
                    case 8: goto La8;
                    case 9: goto L96;
                    case 10: goto L84;
                    default: goto L7f;
                }
            L7f:
                com.umeng.analytics.pro.ct.a(r6, r1)
                goto L12a
            L84:
                if (r1 != r2) goto L91
                int r0 = r6.w()
                r7.j = r0
                r7.j(r4)
                goto L12a
            L91:
                com.umeng.analytics.pro.ct.a(r6, r1)
                goto L12a
            L96:
                if (r1 != r3) goto La3
                java.lang.String r0 = r6.z()
                r7.i = r0
                r7.i(r4)
                goto L12a
            La3:
                com.umeng.analytics.pro.ct.a(r6, r1)
                goto L12a
            La8:
                if (r1 != r3) goto Lb5
                java.lang.String r0 = r6.z()
                r7.h = r0
                r7.h(r4)
                goto L12a
            Lb5:
                com.umeng.analytics.pro.ct.a(r6, r1)
                goto L12a
            Lba:
                if (r1 != r3) goto Lc7
                java.nio.ByteBuffer r0 = r6.A()
                r7.g = r0
                r7.g(r4)
                goto L12a
            Lc7:
                com.umeng.analytics.pro.ct.a(r6, r1)
                goto L12a
            Lcb:
                if (r1 != r2) goto Ld7
                int r0 = r6.w()
                r7.f = r0
                r7.f(r4)
                goto L12a
            Ld7:
                com.umeng.analytics.pro.ct.a(r6, r1)
                goto L12a
            Ldb:
                if (r1 != r2) goto Le7
                int r0 = r6.w()
                r7.e = r0
                r7.e(r4)
                goto L12a
            Le7:
                com.umeng.analytics.pro.ct.a(r6, r1)
                goto L12a
            Leb:
                if (r1 != r2) goto Lf7
                int r0 = r6.w()
                r7.d = r0
                r7.d(r4)
                goto L12a
            Lf7:
                com.umeng.analytics.pro.ct.a(r6, r1)
                goto L12a
            Lfb:
                if (r1 != r3) goto L107
                java.lang.String r0 = r6.z()
                r7.c = r0
                r7.c(r4)
                goto L12a
            L107:
                com.umeng.analytics.pro.ct.a(r6, r1)
                goto L12a
            L10b:
                if (r1 != r3) goto L117
                java.lang.String r0 = r6.z()
                r7.b = r0
                r7.b(r4)
                goto L12a
            L117:
                com.umeng.analytics.pro.ct.a(r6, r1)
                goto L12a
            L11b:
                if (r1 != r3) goto L127
                java.lang.String r0 = r6.z()
                r7.a = r0
                r7.a(r4)
                goto L12a
            L127:
                com.umeng.analytics.pro.ct.a(r6, r1)
            L12a:
                r6.m()
                goto L3
        }

        @Override // com.umeng.analytics.pro.cy
        public /* synthetic */ void a(com.umeng.analytics.pro.cq r1, com.umeng.analytics.pro.br r2) throws com.umeng.analytics.pro.bx {
                r0 = this;
                com.umeng.analytics.pro.bj r2 = (com.umeng.analytics.pro.bj) r2
                r0.b(r1, r2)
                return
        }

        public void b(com.umeng.analytics.pro.cq r2, com.umeng.analytics.pro.bj r3) throws com.umeng.analytics.pro.bx {
                r1 = this;
                r3.G()
                com.umeng.analytics.pro.cv r0 = com.umeng.analytics.pro.bj.H()
                r2.a(r0)
                java.lang.String r0 = r3.a
                if (r0 == 0) goto L1d
                com.umeng.analytics.pro.cl r0 = com.umeng.analytics.pro.bj.I()
                r2.a(r0)
                java.lang.String r0 = r3.a
                r2.a(r0)
                r2.c()
            L1d:
                java.lang.String r0 = r3.b
                if (r0 == 0) goto L30
                com.umeng.analytics.pro.cl r0 = com.umeng.analytics.pro.bj.J()
                r2.a(r0)
                java.lang.String r0 = r3.b
                r2.a(r0)
                r2.c()
            L30:
                java.lang.String r0 = r3.c
                if (r0 == 0) goto L43
                com.umeng.analytics.pro.cl r0 = com.umeng.analytics.pro.bj.K()
                r2.a(r0)
                java.lang.String r0 = r3.c
                r2.a(r0)
                r2.c()
            L43:
                com.umeng.analytics.pro.cl r0 = com.umeng.analytics.pro.bj.L()
                r2.a(r0)
                int r0 = r3.d
                r2.a(r0)
                r2.c()
                com.umeng.analytics.pro.cl r0 = com.umeng.analytics.pro.bj.M()
                r2.a(r0)
                int r0 = r3.e
                r2.a(r0)
                r2.c()
                com.umeng.analytics.pro.cl r0 = com.umeng.analytics.pro.bj.N()
                r2.a(r0)
                int r0 = r3.f
                r2.a(r0)
                r2.c()
                java.nio.ByteBuffer r0 = r3.g
                if (r0 == 0) goto L83
                com.umeng.analytics.pro.cl r0 = com.umeng.analytics.pro.bj.O()
                r2.a(r0)
                java.nio.ByteBuffer r0 = r3.g
                r2.a(r0)
                r2.c()
            L83:
                java.lang.String r0 = r3.h
                if (r0 == 0) goto L96
                com.umeng.analytics.pro.cl r0 = com.umeng.analytics.pro.bj.P()
                r2.a(r0)
                java.lang.String r0 = r3.h
                r2.a(r0)
                r2.c()
            L96:
                java.lang.String r0 = r3.i
                if (r0 == 0) goto La9
                com.umeng.analytics.pro.cl r0 = com.umeng.analytics.pro.bj.Q()
                r2.a(r0)
                java.lang.String r0 = r3.i
                r2.a(r0)
                r2.c()
            La9:
                boolean r0 = r3.F()
                if (r0 == 0) goto Lbe
                com.umeng.analytics.pro.cl r0 = com.umeng.analytics.pro.bj.R()
                r2.a(r0)
                int r3 = r3.j
                r2.a(r3)
                r2.c()
            Lbe:
                r2.d()
                r2.b()
                return
        }

        @Override // com.umeng.analytics.pro.cy
        public /* synthetic */ void b(com.umeng.analytics.pro.cq r1, com.umeng.analytics.pro.br r2) throws com.umeng.analytics.pro.bx {
                r0 = this;
                com.umeng.analytics.pro.bj r2 = (com.umeng.analytics.pro.bj) r2
                r0.a(r1, r2)
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

        /* synthetic */ b(com.umeng.analytics.pro.bj.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public com.umeng.analytics.pro.bj.a a() {
                r2 = this;
                com.umeng.analytics.pro.bj$a r0 = new com.umeng.analytics.pro.bj$a
                r1 = 0
                r0.<init>(r1)
                return r0
        }

        @Override // com.umeng.analytics.pro.cz
        public /* synthetic */ com.umeng.analytics.pro.cy b() {
                r1 = this;
                com.umeng.analytics.pro.bj$a r0 = r1.a()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class c extends com.umeng.analytics.pro.db<com.umeng.analytics.pro.bj> {
        private c() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ c(com.umeng.analytics.pro.bj.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public void a(com.umeng.analytics.pro.cq r3, com.umeng.analytics.pro.bj r4) throws com.umeng.analytics.pro.bx {
                r2 = this;
                com.umeng.analytics.pro.cw r3 = (com.umeng.analytics.pro.cw) r3
                java.lang.String r0 = r4.a
                r3.a(r0)
                java.lang.String r0 = r4.b
                r3.a(r0)
                java.lang.String r0 = r4.c
                r3.a(r0)
                int r0 = r4.d
                r3.a(r0)
                int r0 = r4.e
                r3.a(r0)
                int r0 = r4.f
                r3.a(r0)
                java.nio.ByteBuffer r0 = r4.g
                r3.a(r0)
                java.lang.String r0 = r4.h
                r3.a(r0)
                java.lang.String r0 = r4.i
                r3.a(r0)
                java.util.BitSet r0 = new java.util.BitSet
                r0.<init>()
                boolean r1 = r4.F()
                if (r1 == 0) goto L3e
                r1 = 0
                r0.set(r1)
            L3e:
                r1 = 1
                r3.a(r0, r1)
                boolean r0 = r4.F()
                if (r0 == 0) goto L4d
                int r4 = r4.j
                r3.a(r4)
            L4d:
                return
        }

        @Override // com.umeng.analytics.pro.cy
        public /* bridge */ /* synthetic */ void a(com.umeng.analytics.pro.cq r1, com.umeng.analytics.pro.br r2) throws com.umeng.analytics.pro.bx {
                r0 = this;
                com.umeng.analytics.pro.bj r2 = (com.umeng.analytics.pro.bj) r2
                r0.a(r1, r2)
                return
        }

        public void b(com.umeng.analytics.pro.cq r4, com.umeng.analytics.pro.bj r5) throws com.umeng.analytics.pro.bx {
                r3 = this;
                com.umeng.analytics.pro.cw r4 = (com.umeng.analytics.pro.cw) r4
                java.lang.String r0 = r4.z()
                r5.a = r0
                r0 = 1
                r5.a(r0)
                java.lang.String r1 = r4.z()
                r5.b = r1
                r5.b(r0)
                java.lang.String r1 = r4.z()
                r5.c = r1
                r5.c(r0)
                int r1 = r4.w()
                r5.d = r1
                r5.d(r0)
                int r1 = r4.w()
                r5.e = r1
                r5.e(r0)
                int r1 = r4.w()
                r5.f = r1
                r5.f(r0)
                java.nio.ByteBuffer r1 = r4.A()
                r5.g = r1
                r5.g(r0)
                java.lang.String r1 = r4.z()
                r5.h = r1
                r5.h(r0)
                java.lang.String r1 = r4.z()
                r5.i = r1
                r5.i(r0)
                java.util.BitSet r1 = r4.b(r0)
                r2 = 0
                boolean r1 = r1.get(r2)
                if (r1 == 0) goto L68
                int r4 = r4.w()
                r5.j = r4
                r5.j(r0)
            L68:
                return
        }

        @Override // com.umeng.analytics.pro.cy
        public /* bridge */ /* synthetic */ void b(com.umeng.analytics.pro.cq r1, com.umeng.analytics.pro.br r2) throws com.umeng.analytics.pro.bx {
                r0 = this;
                com.umeng.analytics.pro.bj r2 = (com.umeng.analytics.pro.bj) r2
                r0.b(r1, r2)
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

        /* synthetic */ d(com.umeng.analytics.pro.bj.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public com.umeng.analytics.pro.bj.c a() {
                r2 = this;
                com.umeng.analytics.pro.bj$c r0 = new com.umeng.analytics.pro.bj$c
                r1 = 0
                r0.<init>(r1)
                return r0
        }

        @Override // com.umeng.analytics.pro.cz
        public /* synthetic */ com.umeng.analytics.pro.cy b() {
                r1 = this;
                com.umeng.analytics.pro.bj$c r0 = r1.a()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum e extends java.lang.Enum<com.umeng.analytics.pro.bj.e> implements com.umeng.analytics.pro.by {
        public static final com.umeng.analytics.pro.bj.e a = null;
        public static final com.umeng.analytics.pro.bj.e b = null;
        public static final com.umeng.analytics.pro.bj.e c = null;
        public static final com.umeng.analytics.pro.bj.e d = null;
        public static final com.umeng.analytics.pro.bj.e e = null;
        public static final com.umeng.analytics.pro.bj.e f = null;
        public static final com.umeng.analytics.pro.bj.e g = null;
        public static final com.umeng.analytics.pro.bj.e h = null;
        public static final com.umeng.analytics.pro.bj.e i = null;
        public static final com.umeng.analytics.pro.bj.e j = null;
        private static final java.util.Map<java.lang.String, com.umeng.analytics.pro.bj.e> k = null;
        private static final /* synthetic */ com.umeng.analytics.pro.bj.e[] n = null;
        private final short l;
        private final java.lang.String m;

        static {
                com.umeng.analytics.pro.bj$e r0 = new com.umeng.analytics.pro.bj$e
                java.lang.String r1 = "version"
                java.lang.String r2 = "VERSION"
                r3 = 0
                r4 = 1
                r0.<init>(r2, r3, r4, r1)
                com.umeng.analytics.pro.bj.e.a = r0
                com.umeng.analytics.pro.bj$e r1 = new com.umeng.analytics.pro.bj$e
                java.lang.String r2 = "address"
                java.lang.String r5 = "ADDRESS"
                r6 = 2
                r1.<init>(r5, r4, r6, r2)
                com.umeng.analytics.pro.bj.e.b = r1
                com.umeng.analytics.pro.bj$e r2 = new com.umeng.analytics.pro.bj$e
                java.lang.String r5 = "signature"
                java.lang.String r7 = "SIGNATURE"
                r8 = 3
                r2.<init>(r7, r6, r8, r5)
                com.umeng.analytics.pro.bj.e.c = r2
                com.umeng.analytics.pro.bj$e r5 = new com.umeng.analytics.pro.bj$e
                java.lang.String r7 = "serial_num"
                java.lang.String r9 = "SERIAL_NUM"
                r10 = 4
                r5.<init>(r9, r8, r10, r7)
                com.umeng.analytics.pro.bj.e.d = r5
                com.umeng.analytics.pro.bj$e r7 = new com.umeng.analytics.pro.bj$e
                java.lang.String r9 = "ts_secs"
                java.lang.String r11 = "TS_SECS"
                r12 = 5
                r7.<init>(r11, r10, r12, r9)
                com.umeng.analytics.pro.bj.e.e = r7
                com.umeng.analytics.pro.bj$e r9 = new com.umeng.analytics.pro.bj$e
                java.lang.String r11 = "length"
                java.lang.String r13 = "LENGTH"
                r14 = 6
                r9.<init>(r13, r12, r14, r11)
                com.umeng.analytics.pro.bj.e.f = r9
                com.umeng.analytics.pro.bj$e r11 = new com.umeng.analytics.pro.bj$e
                java.lang.String r13 = "entity"
                java.lang.String r15 = "ENTITY"
                r16 = 0
                r3 = 7
                r11.<init>(r15, r14, r3, r13)
                com.umeng.analytics.pro.bj.e.g = r11
                com.umeng.analytics.pro.bj$e r13 = new com.umeng.analytics.pro.bj$e
                java.lang.String r15 = "guid"
                r17 = 1
                java.lang.String r4 = "GUID"
                r18 = 2
                r6 = 8
                r13.<init>(r4, r3, r6, r15)
                com.umeng.analytics.pro.bj.e.h = r13
                com.umeng.analytics.pro.bj$e r4 = new com.umeng.analytics.pro.bj$e
                java.lang.String r15 = "checksum"
                r19 = 7
                java.lang.String r3 = "CHECKSUM"
                r20 = 3
                r8 = 9
                r4.<init>(r3, r6, r8, r15)
                com.umeng.analytics.pro.bj.e.i = r4
                com.umeng.analytics.pro.bj$e r3 = new com.umeng.analytics.pro.bj$e
                java.lang.String r15 = "codex"
                r21 = 8
                java.lang.String r6 = "CODEX"
                r22 = 4
                r10 = 10
                r3.<init>(r6, r8, r10, r15)
                com.umeng.analytics.pro.bj.e.j = r3
                com.umeng.analytics.pro.bj$e[] r6 = new com.umeng.analytics.pro.bj.e[r10]
                r6[r16] = r0
                r6[r17] = r1
                r6[r18] = r2
                r6[r20] = r5
                r6[r22] = r7
                r6[r12] = r9
                r6[r14] = r11
                r6[r19] = r13
                r6[r21] = r4
                r6[r8] = r3
                com.umeng.analytics.pro.bj.e.n = r6
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                com.umeng.analytics.pro.bj.e.k = r0
                java.lang.Class<com.umeng.analytics.pro.bj$e> r0 = com.umeng.analytics.pro.bj.e.class
                java.util.EnumSet r0 = java.util.EnumSet.allOf(r0)
                java.util.Iterator r0 = r0.iterator()
            Lb3:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto Lc9
                java.lang.Object r1 = r0.next()
                com.umeng.analytics.pro.bj$e r1 = (com.umeng.analytics.pro.bj.e) r1
                java.util.Map<java.lang.String, com.umeng.analytics.pro.bj$e> r2 = com.umeng.analytics.pro.bj.e.k
                java.lang.String r3 = r1.b()
                r2.put(r3, r1)
                goto Lb3
            Lc9:
                return
        }

        e(java.lang.String r1, int r2, short r3, java.lang.String r4) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.l = r3
                r0.m = r4
                return
        }

        public static com.umeng.analytics.pro.bj.e a(int r0) {
                switch(r0) {
                    case 1: goto L20;
                    case 2: goto L1d;
                    case 3: goto L1a;
                    case 4: goto L17;
                    case 5: goto L14;
                    case 6: goto L11;
                    case 7: goto Le;
                    case 8: goto Lb;
                    case 9: goto L8;
                    case 10: goto L5;
                    default: goto L3;
                }
            L3:
                r0 = 0
                return r0
            L5:
                com.umeng.analytics.pro.bj$e r0 = com.umeng.analytics.pro.bj.e.j
                return r0
            L8:
                com.umeng.analytics.pro.bj$e r0 = com.umeng.analytics.pro.bj.e.i
                return r0
            Lb:
                com.umeng.analytics.pro.bj$e r0 = com.umeng.analytics.pro.bj.e.h
                return r0
            Le:
                com.umeng.analytics.pro.bj$e r0 = com.umeng.analytics.pro.bj.e.g
                return r0
            L11:
                com.umeng.analytics.pro.bj$e r0 = com.umeng.analytics.pro.bj.e.f
                return r0
            L14:
                com.umeng.analytics.pro.bj$e r0 = com.umeng.analytics.pro.bj.e.e
                return r0
            L17:
                com.umeng.analytics.pro.bj$e r0 = com.umeng.analytics.pro.bj.e.d
                return r0
            L1a:
                com.umeng.analytics.pro.bj$e r0 = com.umeng.analytics.pro.bj.e.c
                return r0
            L1d:
                com.umeng.analytics.pro.bj$e r0 = com.umeng.analytics.pro.bj.e.b
                return r0
            L20:
                com.umeng.analytics.pro.bj$e r0 = com.umeng.analytics.pro.bj.e.a
                return r0
        }

        public static com.umeng.analytics.pro.bj.e a(java.lang.String r1) {
                java.util.Map<java.lang.String, com.umeng.analytics.pro.bj$e> r0 = com.umeng.analytics.pro.bj.e.k
                java.lang.Object r1 = r0.get(r1)
                com.umeng.analytics.pro.bj$e r1 = (com.umeng.analytics.pro.bj.e) r1
                return r1
        }

        public static com.umeng.analytics.pro.bj.e b(int r3) {
                com.umeng.analytics.pro.bj$e r0 = a(r3)
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

        public static com.umeng.analytics.pro.bj.e valueOf(java.lang.String r1) {
                java.lang.Class<com.umeng.analytics.pro.bj$e> r0 = com.umeng.analytics.pro.bj.e.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.umeng.analytics.pro.bj$e r1 = (com.umeng.analytics.pro.bj.e) r1
                return r1
        }

        public static com.umeng.analytics.pro.bj.e[] values() {
                com.umeng.analytics.pro.bj$e[] r0 = com.umeng.analytics.pro.bj.e.n
                java.lang.Object r0 = r0.clone()
                com.umeng.analytics.pro.bj$e[] r0 = (com.umeng.analytics.pro.bj.e[]) r0
                return r0
        }

        @Override // com.umeng.analytics.pro.by
        public short a() {
                r1 = this;
                short r0 = r1.l
                return r0
        }

        @Override // com.umeng.analytics.pro.by
        public java.lang.String b() {
                r1 = this;
                java.lang.String r0 = r1.m
                return r0
        }
    }

    static {
            com.umeng.analytics.pro.cv r0 = new com.umeng.analytics.pro.cv
            java.lang.String r1 = "UMEnvelope"
            r0.<init>(r1)
            com.umeng.analytics.pro.bj.m = r0
            com.umeng.analytics.pro.cl r0 = new com.umeng.analytics.pro.cl
            java.lang.String r1 = "version"
            r2 = 11
            r3 = 1
            r0.<init>(r1, r2, r3)
            com.umeng.analytics.pro.bj.n = r0
            com.umeng.analytics.pro.cl r0 = new com.umeng.analytics.pro.cl
            java.lang.String r4 = "address"
            r5 = 2
            r0.<init>(r4, r2, r5)
            com.umeng.analytics.pro.bj.o = r0
            com.umeng.analytics.pro.cl r0 = new com.umeng.analytics.pro.cl
            r6 = 3
            java.lang.String r7 = "signature"
            r0.<init>(r7, r2, r6)
            com.umeng.analytics.pro.bj.p = r0
            com.umeng.analytics.pro.cl r0 = new com.umeng.analytics.pro.cl
            r6 = 4
            java.lang.String r8 = "serial_num"
            r9 = 8
            r0.<init>(r8, r9, r6)
            com.umeng.analytics.pro.bj.f24q = r0
            com.umeng.analytics.pro.cl r0 = new com.umeng.analytics.pro.cl
            r6 = 5
            java.lang.String r10 = "ts_secs"
            r0.<init>(r10, r9, r6)
            com.umeng.analytics.pro.bj.r = r0
            com.umeng.analytics.pro.cl r0 = new com.umeng.analytics.pro.cl
            r6 = 6
            java.lang.String r11 = "length"
            r0.<init>(r11, r9, r6)
            com.umeng.analytics.pro.bj.s = r0
            com.umeng.analytics.pro.cl r0 = new com.umeng.analytics.pro.cl
            r6 = 7
            java.lang.String r12 = "entity"
            r0.<init>(r12, r2, r6)
            com.umeng.analytics.pro.bj.t = r0
            com.umeng.analytics.pro.cl r0 = new com.umeng.analytics.pro.cl
            java.lang.String r6 = "guid"
            r0.<init>(r6, r2, r9)
            com.umeng.analytics.pro.bj.u = r0
            com.umeng.analytics.pro.cl r0 = new com.umeng.analytics.pro.cl
            r13 = 9
            java.lang.String r14 = "checksum"
            r0.<init>(r14, r2, r13)
            com.umeng.analytics.pro.bj.v = r0
            com.umeng.analytics.pro.cl r0 = new com.umeng.analytics.pro.cl
            r13 = 10
            java.lang.String r15 = "codex"
            r0.<init>(r15, r9, r13)
            com.umeng.analytics.pro.bj.w = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.umeng.analytics.pro.bj.x = r0
            com.umeng.analytics.pro.bj$b r13 = new com.umeng.analytics.pro.bj$b
            r5 = 0
            r13.<init>(r5)
            java.lang.Class<com.umeng.analytics.pro.da> r9 = com.umeng.analytics.pro.da.class
            r0.put(r9, r13)
            com.umeng.analytics.pro.bj$d r9 = new com.umeng.analytics.pro.bj$d
            r9.<init>(r5)
            java.lang.Class<com.umeng.analytics.pro.db> r5 = com.umeng.analytics.pro.db.class
            r0.put(r5, r9)
            java.util.EnumMap r0 = new java.util.EnumMap
            java.lang.Class<com.umeng.analytics.pro.bj$e> r5 = com.umeng.analytics.pro.bj.e.class
            r0.<init>(r5)
            com.umeng.analytics.pro.bj$e r5 = com.umeng.analytics.pro.bj.e.a
            com.umeng.analytics.pro.cd r9 = new com.umeng.analytics.pro.cd
            com.umeng.analytics.pro.ce r13 = new com.umeng.analytics.pro.ce
            r13.<init>(r2)
            r9.<init>(r1, r3, r13)
            r0.put(r5, r9)
            com.umeng.analytics.pro.bj$e r1 = com.umeng.analytics.pro.bj.e.b
            com.umeng.analytics.pro.cd r5 = new com.umeng.analytics.pro.cd
            com.umeng.analytics.pro.ce r9 = new com.umeng.analytics.pro.ce
            r9.<init>(r2)
            r5.<init>(r4, r3, r9)
            r0.put(r1, r5)
            com.umeng.analytics.pro.bj$e r1 = com.umeng.analytics.pro.bj.e.c
            com.umeng.analytics.pro.cd r4 = new com.umeng.analytics.pro.cd
            com.umeng.analytics.pro.ce r5 = new com.umeng.analytics.pro.ce
            r5.<init>(r2)
            r4.<init>(r7, r3, r5)
            r0.put(r1, r4)
            com.umeng.analytics.pro.bj$e r1 = com.umeng.analytics.pro.bj.e.d
            com.umeng.analytics.pro.cd r4 = new com.umeng.analytics.pro.cd
            com.umeng.analytics.pro.ce r5 = new com.umeng.analytics.pro.ce
            r7 = 8
            r5.<init>(r7)
            r4.<init>(r8, r3, r5)
            r0.put(r1, r4)
            com.umeng.analytics.pro.bj$e r1 = com.umeng.analytics.pro.bj.e.e
            com.umeng.analytics.pro.cd r4 = new com.umeng.analytics.pro.cd
            com.umeng.analytics.pro.ce r5 = new com.umeng.analytics.pro.ce
            r5.<init>(r7)
            r4.<init>(r10, r3, r5)
            r0.put(r1, r4)
            com.umeng.analytics.pro.bj$e r1 = com.umeng.analytics.pro.bj.e.f
            com.umeng.analytics.pro.cd r4 = new com.umeng.analytics.pro.cd
            com.umeng.analytics.pro.ce r5 = new com.umeng.analytics.pro.ce
            r5.<init>(r7)
            r4.<init>(r11, r3, r5)
            r0.put(r1, r4)
            com.umeng.analytics.pro.bj$e r1 = com.umeng.analytics.pro.bj.e.g
            com.umeng.analytics.pro.cd r4 = new com.umeng.analytics.pro.cd
            com.umeng.analytics.pro.ce r5 = new com.umeng.analytics.pro.ce
            r5.<init>(r2, r3)
            r4.<init>(r12, r3, r5)
            r0.put(r1, r4)
            com.umeng.analytics.pro.bj$e r1 = com.umeng.analytics.pro.bj.e.h
            com.umeng.analytics.pro.cd r4 = new com.umeng.analytics.pro.cd
            com.umeng.analytics.pro.ce r5 = new com.umeng.analytics.pro.ce
            r5.<init>(r2)
            r4.<init>(r6, r3, r5)
            r0.put(r1, r4)
            com.umeng.analytics.pro.bj$e r1 = com.umeng.analytics.pro.bj.e.i
            com.umeng.analytics.pro.cd r4 = new com.umeng.analytics.pro.cd
            com.umeng.analytics.pro.ce r5 = new com.umeng.analytics.pro.ce
            r5.<init>(r2)
            r4.<init>(r14, r3, r5)
            r0.put(r1, r4)
            com.umeng.analytics.pro.bj$e r1 = com.umeng.analytics.pro.bj.e.j
            com.umeng.analytics.pro.cd r2 = new com.umeng.analytics.pro.cd
            com.umeng.analytics.pro.ce r3 = new com.umeng.analytics.pro.ce
            r7 = 8
            r3.<init>(r7)
            r4 = 2
            r2.<init>(r15, r4, r3)
            r0.put(r1, r2)
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)
            com.umeng.analytics.pro.bj.k = r0
            java.lang.Class<com.umeng.analytics.pro.bj> r1 = com.umeng.analytics.pro.bj.class
            com.umeng.analytics.pro.cd.a(r1, r0)
            return
    }

    public bj() {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.C = r0
            r1 = 1
            com.umeng.analytics.pro.bj$e[] r1 = new com.umeng.analytics.pro.bj.e[r1]
            com.umeng.analytics.pro.bj$e r2 = com.umeng.analytics.pro.bj.e.j
            r1[r0] = r2
            r3.D = r1
            return
    }

    public bj(com.umeng.analytics.pro.bj r4) {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.C = r0
            r1 = 1
            com.umeng.analytics.pro.bj$e[] r1 = new com.umeng.analytics.pro.bj.e[r1]
            com.umeng.analytics.pro.bj$e r2 = com.umeng.analytics.pro.bj.e.j
            r1[r0] = r2
            r3.D = r1
            byte r0 = r4.C
            r3.C = r0
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
            int r0 = r4.d
            r3.d = r0
            int r0 = r4.e
            r3.e = r0
            int r0 = r4.f
            r3.f = r0
            boolean r0 = r4.w()
            if (r0 == 0) goto L4b
            java.nio.ByteBuffer r0 = r4.g
            java.nio.ByteBuffer r0 = com.umeng.analytics.pro.bs.d(r0)
            r3.g = r0
        L4b:
            boolean r0 = r4.z()
            if (r0 == 0) goto L55
            java.lang.String r0 = r4.h
            r3.h = r0
        L55:
            boolean r0 = r4.C()
            if (r0 == 0) goto L5f
            java.lang.String r0 = r4.i
            r3.i = r0
        L5f:
            int r4 = r4.j
            r3.j = r4
            return
    }

    public bj(java.lang.String r1, java.lang.String r2, java.lang.String r3, int r4, int r5, int r6, java.nio.ByteBuffer r7, java.lang.String r8, java.lang.String r9) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r1 = 1
            r0.d(r1)
            r0.e = r5
            r0.e(r1)
            r0.f = r6
            r0.f(r1)
            r0.g = r7
            r0.h = r8
            r0.i = r9
            return
    }

    static /* synthetic */ com.umeng.analytics.pro.cv H() {
            com.umeng.analytics.pro.cv r0 = com.umeng.analytics.pro.bj.m
            return r0
    }

    static /* synthetic */ com.umeng.analytics.pro.cl I() {
            com.umeng.analytics.pro.cl r0 = com.umeng.analytics.pro.bj.n
            return r0
    }

    static /* synthetic */ com.umeng.analytics.pro.cl J() {
            com.umeng.analytics.pro.cl r0 = com.umeng.analytics.pro.bj.o
            return r0
    }

    static /* synthetic */ com.umeng.analytics.pro.cl K() {
            com.umeng.analytics.pro.cl r0 = com.umeng.analytics.pro.bj.p
            return r0
    }

    static /* synthetic */ com.umeng.analytics.pro.cl L() {
            com.umeng.analytics.pro.cl r0 = com.umeng.analytics.pro.bj.f24q
            return r0
    }

    static /* synthetic */ com.umeng.analytics.pro.cl M() {
            com.umeng.analytics.pro.cl r0 = com.umeng.analytics.pro.bj.r
            return r0
    }

    static /* synthetic */ com.umeng.analytics.pro.cl N() {
            com.umeng.analytics.pro.cl r0 = com.umeng.analytics.pro.bj.s
            return r0
    }

    static /* synthetic */ com.umeng.analytics.pro.cl O() {
            com.umeng.analytics.pro.cl r0 = com.umeng.analytics.pro.bj.t
            return r0
    }

    static /* synthetic */ com.umeng.analytics.pro.cl P() {
            com.umeng.analytics.pro.cl r0 = com.umeng.analytics.pro.bj.u
            return r0
    }

    static /* synthetic */ com.umeng.analytics.pro.cl Q() {
            com.umeng.analytics.pro.cl r0 = com.umeng.analytics.pro.bj.v
            return r0
    }

    static /* synthetic */ com.umeng.analytics.pro.cl R() {
            com.umeng.analytics.pro.cl r0 = com.umeng.analytics.pro.bj.w
            return r0
    }

    private void a(java.io.ObjectInputStream r3) throws java.io.IOException, java.lang.ClassNotFoundException {
            r2 = this;
            r0 = 0
            r2.C = r0     // Catch: com.umeng.analytics.pro.bx -> L11
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

    public java.lang.String A() {
            r1 = this;
            java.lang.String r0 = r1.i
            return r0
    }

    public void B() {
            r1 = this;
            r0 = 0
            r1.i = r0
            return
    }

    public boolean C() {
            r1 = this;
            java.lang.String r0 = r1.i
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public int D() {
            r1 = this;
            int r0 = r1.j
            return r0
    }

    public void E() {
            r2 = this;
            byte r0 = r2.C
            r1 = 3
            byte r0 = com.umeng.analytics.pro.bo.b(r0, r1)
            r2.C = r0
            return
    }

    public boolean F() {
            r2 = this;
            byte r0 = r2.C
            r1 = 3
            boolean r0 = com.umeng.analytics.pro.bo.a(r0, r1)
            return r0
    }

    public void G() throws com.umeng.analytics.pro.bx {
            r3 = this;
            java.lang.String r0 = r3.a
            if (r0 == 0) goto La0
            java.lang.String r0 = r3.b
            if (r0 == 0) goto L85
            java.lang.String r0 = r3.c
            if (r0 == 0) goto L6a
            java.nio.ByteBuffer r0 = r3.g
            if (r0 == 0) goto L4f
            java.lang.String r0 = r3.h
            if (r0 == 0) goto L34
            java.lang.String r0 = r3.i
            if (r0 == 0) goto L19
            return
        L19:
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
        L34:
            com.umeng.analytics.pro.cr r0 = new com.umeng.analytics.pro.cr
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Required field 'guid' was not present! Struct: "
            r1.append(r2)
            java.lang.String r2 = r3.toString()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L4f:
            com.umeng.analytics.pro.cr r0 = new com.umeng.analytics.pro.cr
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Required field 'entity' was not present! Struct: "
            r1.append(r2)
            java.lang.String r2 = r3.toString()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L6a:
            com.umeng.analytics.pro.cr r0 = new com.umeng.analytics.pro.cr
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Required field 'signature' was not present! Struct: "
            r1.append(r2)
            java.lang.String r2 = r3.toString()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L85:
            com.umeng.analytics.pro.cr r0 = new com.umeng.analytics.pro.cr
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Required field 'address' was not present! Struct: "
            r1.append(r2)
            java.lang.String r2 = r3.toString()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        La0:
            com.umeng.analytics.pro.cr r0 = new com.umeng.analytics.pro.cr
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Required field 'version' was not present! Struct: "
            r1.append(r2)
            java.lang.String r2 = r3.toString()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public com.umeng.analytics.pro.bj a() {
            r1 = this;
            com.umeng.analytics.pro.bj r0 = new com.umeng.analytics.pro.bj
            r0.<init>(r1)
            return r0
    }

    public com.umeng.analytics.pro.bj a(int r1) {
            r0 = this;
            r0.d = r1
            r1 = 1
            r0.d(r1)
            return r0
    }

    public com.umeng.analytics.pro.bj a(java.lang.String r1) {
            r0 = this;
            r0.a = r1
            return r0
    }

    public com.umeng.analytics.pro.bj a(java.nio.ByteBuffer r1) {
            r0 = this;
            r0.g = r1
            return r0
    }

    public com.umeng.analytics.pro.bj a(byte[] r1) {
            r0 = this;
            if (r1 != 0) goto L4
            r1 = 0
            goto L8
        L4:
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.wrap(r1)
        L8:
            r0.a(r1)
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

    public com.umeng.analytics.pro.bj b(int r1) {
            r0 = this;
            r0.e = r1
            r1 = 1
            r0.e(r1)
            return r0
    }

    public com.umeng.analytics.pro.bj b(java.lang.String r1) {
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

    public com.umeng.analytics.pro.bj c(int r1) {
            r0 = this;
            r0.f = r1
            r1 = 1
            r0.f(r1)
            return r0
    }

    public com.umeng.analytics.pro.bj c(java.lang.String r1) {
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
            r1 = 0
            r2.d(r1)
            r2.d = r1
            r2.e(r1)
            r2.e = r1
            r2.f(r1)
            r2.f = r1
            r2.g = r0
            r2.h = r0
            r2.i = r0
            r2.j(r1)
            r2.j = r1
            return
    }

    public com.umeng.analytics.pro.bj d(int r1) {
            r0 = this;
            r0.j = r1
            r1 = 1
            r0.j(r1)
            return r0
    }

    public com.umeng.analytics.pro.bj d(java.lang.String r1) {
            r0 = this;
            r0.h = r1
            return r0
    }

    public void d(boolean r3) {
            r2 = this;
            byte r0 = r2.C
            r1 = 0
            byte r3 = com.umeng.analytics.pro.bo.a(r0, r1, r3)
            r2.C = r3
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
    public /* synthetic */ com.umeng.analytics.pro.br<com.umeng.analytics.pro.bj, com.umeng.analytics.pro.bj.e> deepCopy() {
            r1 = this;
            com.umeng.analytics.pro.bj r0 = r1.a()
            return r0
    }

    public com.umeng.analytics.pro.bj.e e(int r1) {
            r0 = this;
            com.umeng.analytics.pro.bj$e r1 = com.umeng.analytics.pro.bj.e.a(r1)
            return r1
    }

    public com.umeng.analytics.pro.bj e(java.lang.String r1) {
            r0 = this;
            r0.i = r1
            return r0
    }

    public java.lang.String e() {
            r1 = this;
            java.lang.String r0 = r1.b
            return r0
    }

    public void e(boolean r3) {
            r2 = this;
            byte r0 = r2.C
            r1 = 1
            byte r3 = com.umeng.analytics.pro.bo.a(r0, r1, r3)
            r2.C = r3
            return
    }

    public void f() {
            r1 = this;
            r0 = 0
            r1.b = r0
            return
    }

    public void f(boolean r3) {
            r2 = this;
            byte r0 = r2.C
            r1 = 2
            byte r3 = com.umeng.analytics.pro.bo.a(r0, r1, r3)
            r2.C = r3
            return
    }

    @Override // com.umeng.analytics.pro.br
    public /* synthetic */ com.umeng.analytics.pro.bj.e fieldForId(int r1) {
            r0 = this;
            com.umeng.analytics.pro.bj$e r1 = r0.e(r1)
            return r1
    }

    public void g(boolean r1) {
            r0 = this;
            if (r1 != 0) goto L5
            r1 = 0
            r0.g = r1
        L5:
            return
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

    public void h(boolean r1) {
            r0 = this;
            if (r1 != 0) goto L5
            r1 = 0
            r0.h = r1
        L5:
            return
    }

    public void i() {
            r1 = this;
            r0 = 0
            r1.c = r0
            return
    }

    public void i(boolean r1) {
            r0 = this;
            if (r1 != 0) goto L5
            r1 = 0
            r0.i = r1
        L5:
            return
    }

    public void j(boolean r3) {
            r2 = this;
            byte r0 = r2.C
            r1 = 3
            byte r3 = com.umeng.analytics.pro.bo.a(r0, r1, r3)
            r2.C = r3
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

    public int k() {
            r1 = this;
            int r0 = r1.d
            return r0
    }

    public void l() {
            r2 = this;
            byte r0 = r2.C
            r1 = 0
            byte r0 = com.umeng.analytics.pro.bo.b(r0, r1)
            r2.C = r0
            return
    }

    public boolean m() {
            r2 = this;
            byte r0 = r2.C
            r1 = 0
            boolean r0 = com.umeng.analytics.pro.bo.a(r0, r1)
            return r0
    }

    public int n() {
            r1 = this;
            int r0 = r1.e
            return r0
    }

    public void o() {
            r2 = this;
            byte r0 = r2.C
            r1 = 1
            byte r0 = com.umeng.analytics.pro.bo.b(r0, r1)
            r2.C = r0
            return
    }

    public boolean p() {
            r2 = this;
            byte r0 = r2.C
            r1 = 1
            boolean r0 = com.umeng.analytics.pro.bo.a(r0, r1)
            return r0
    }

    public int q() {
            r1 = this;
            int r0 = r1.f
            return r0
    }

    public void r() {
            r2 = this;
            byte r0 = r2.C
            r1 = 2
            byte r0 = com.umeng.analytics.pro.bo.b(r0, r1)
            r2.C = r0
            return
    }

    @Override // com.umeng.analytics.pro.br
    public void read(com.umeng.analytics.pro.cq r3) throws com.umeng.analytics.pro.bx {
            r2 = this;
            java.util.Map<java.lang.Class<? extends com.umeng.analytics.pro.cy>, com.umeng.analytics.pro.cz> r0 = com.umeng.analytics.pro.bj.x
            java.lang.Class r1 = r3.D()
            java.lang.Object r0 = r0.get(r1)
            com.umeng.analytics.pro.cz r0 = (com.umeng.analytics.pro.cz) r0
            com.umeng.analytics.pro.cy r0 = r0.b()
            r0.b(r3, r2)
            return
    }

    public boolean s() {
            r2 = this;
            byte r0 = r2.C
            r1 = 2
            boolean r0 = com.umeng.analytics.pro.bo.a(r0, r1)
            return r0
    }

    public byte[] t() {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.g
            java.nio.ByteBuffer r0 = com.umeng.analytics.pro.bs.c(r0)
            r1.a(r0)
            java.nio.ByteBuffer r0 = r1.g
            if (r0 != 0) goto Lf
            r0 = 0
            return r0
        Lf:
            byte[] r0 = r0.array()
            return r0
    }

    public java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "UMEnvelope("
            r0.<init>(r1)
            java.lang.String r1 = "version:"
            r0.append(r1)
            java.lang.String r1 = r4.a
            java.lang.String r2 = "null"
            if (r1 != 0) goto L16
            r0.append(r2)
            goto L19
        L16:
            r0.append(r1)
        L19:
            java.lang.String r1 = ", "
            r0.append(r1)
            java.lang.String r3 = "address:"
            r0.append(r3)
            java.lang.String r3 = r4.b
            if (r3 != 0) goto L2b
            r0.append(r2)
            goto L2e
        L2b:
            r0.append(r3)
        L2e:
            r0.append(r1)
            java.lang.String r3 = "signature:"
            r0.append(r3)
            java.lang.String r3 = r4.c
            if (r3 != 0) goto L3e
            r0.append(r2)
            goto L41
        L3e:
            r0.append(r3)
        L41:
            r0.append(r1)
            java.lang.String r3 = "serial_num:"
            r0.append(r3)
            int r3 = r4.d
            r0.append(r3)
            r0.append(r1)
            java.lang.String r3 = "ts_secs:"
            r0.append(r3)
            int r3 = r4.e
            r0.append(r3)
            r0.append(r1)
            java.lang.String r3 = "length:"
            r0.append(r3)
            int r3 = r4.f
            r0.append(r3)
            r0.append(r1)
            java.lang.String r3 = "entity:"
            r0.append(r3)
            java.nio.ByteBuffer r3 = r4.g
            if (r3 != 0) goto L78
            r0.append(r2)
            goto L7b
        L78:
            com.umeng.analytics.pro.bs.a(r3, r0)
        L7b:
            r0.append(r1)
            java.lang.String r3 = "guid:"
            r0.append(r3)
            java.lang.String r3 = r4.h
            if (r3 != 0) goto L8b
            r0.append(r2)
            goto L8e
        L8b:
            r0.append(r3)
        L8e:
            r0.append(r1)
            java.lang.String r3 = "checksum:"
            r0.append(r3)
            java.lang.String r3 = r4.i
            if (r3 != 0) goto L9e
            r0.append(r2)
            goto La1
        L9e:
            r0.append(r3)
        La1:
            boolean r2 = r4.F()
            if (r2 == 0) goto Lb4
            r0.append(r1)
            java.lang.String r1 = "codex:"
            r0.append(r1)
            int r1 = r4.j
            r0.append(r1)
        Lb4:
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public java.nio.ByteBuffer u() {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.g
            return r0
    }

    public void v() {
            r1 = this;
            r0 = 0
            r1.g = r0
            return
    }

    public boolean w() {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.g
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    @Override // com.umeng.analytics.pro.br
    public void write(com.umeng.analytics.pro.cq r3) throws com.umeng.analytics.pro.bx {
            r2 = this;
            java.util.Map<java.lang.Class<? extends com.umeng.analytics.pro.cy>, com.umeng.analytics.pro.cz> r0 = com.umeng.analytics.pro.bj.x
            java.lang.Class r1 = r3.D()
            java.lang.Object r0 = r0.get(r1)
            com.umeng.analytics.pro.cz r0 = (com.umeng.analytics.pro.cz) r0
            com.umeng.analytics.pro.cy r0 = r0.b()
            r0.a(r3, r2)
            return
    }

    public java.lang.String x() {
            r1 = this;
            java.lang.String r0 = r1.h
            return r0
    }

    public void y() {
            r1 = this;
            r0 = 0
            r1.h = r0
            return
    }

    public boolean z() {
            r1 = this;
            java.lang.String r0 = r1.h
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }
}

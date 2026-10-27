package com.umeng.commonsdk.statistics.proto;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class Response implements com.umeng.analytics.pro.br<com.umeng.commonsdk.statistics.proto.Response, com.umeng.commonsdk.statistics.proto.Response.e>, java.io.Serializable, java.lang.Cloneable {
    private static final com.umeng.analytics.pro.cl IMPRINT_FIELD_DESC = null;
    private static final com.umeng.analytics.pro.cl MSG_FIELD_DESC = null;
    private static final com.umeng.analytics.pro.cl RESP_CODE_FIELD_DESC = null;
    private static final com.umeng.analytics.pro.cv STRUCT_DESC = null;
    private static final int __RESP_CODE_ISSET_ID = 0;
    public static final java.util.Map<com.umeng.commonsdk.statistics.proto.Response.e, com.umeng.analytics.pro.cd> metaDataMap = null;
    private static final java.util.Map<java.lang.Class<? extends com.umeng.analytics.pro.cy>, com.umeng.analytics.pro.cz> schemes = null;
    private static final long serialVersionUID = -4549277923241195391L;
    private byte __isset_bitfield;
    public com.umeng.commonsdk.statistics.proto.d imprint;
    public java.lang.String msg;
    private com.umeng.commonsdk.statistics.proto.Response.e[] optionals;
    public int resp_code;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.umeng.commonsdk.statistics.proto.Response$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class a extends com.umeng.analytics.pro.da<com.umeng.commonsdk.statistics.proto.Response> {
        private a() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ a(com.umeng.commonsdk.statistics.proto.Response.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.umeng.analytics.pro.cy
        public /* synthetic */ void a(com.umeng.analytics.pro.cq r1, com.umeng.analytics.pro.br r2) throws com.umeng.analytics.pro.bx {
                r0 = this;
                com.umeng.commonsdk.statistics.proto.Response r2 = (com.umeng.commonsdk.statistics.proto.Response) r2
                r0.b(r1, r2)
                return
        }

        public void a(com.umeng.analytics.pro.cq r5, com.umeng.commonsdk.statistics.proto.Response r6) throws com.umeng.analytics.pro.bx {
                r4 = this;
                r5.j()
            L3:
                com.umeng.analytics.pro.cl r0 = r5.l()
                byte r1 = r0.b
                if (r1 != 0) goto L33
                r5.k()
                boolean r5 = r6.isSetResp_code()
                if (r5 == 0) goto L18
                r6.validate()
                return
            L18:
                com.umeng.analytics.pro.cr r5 = new com.umeng.analytics.pro.cr
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r0 = "Required field 'resp_code' was not found in serialized data! Struct: "
                r6.append(r0)
                java.lang.String r0 = r4.toString()
                r6.append(r0)
                java.lang.String r6 = r6.toString()
                r5.<init>(r6)
                throw r5
            L33:
                short r0 = r0.c
                r2 = 1
                if (r0 == r2) goto L6a
                r3 = 2
                if (r0 == r3) goto L58
                r3 = 3
                if (r0 == r3) goto L42
                com.umeng.analytics.pro.ct.a(r5, r1)
                goto L7b
            L42:
                r0 = 12
                if (r1 != r0) goto L54
                com.umeng.commonsdk.statistics.proto.d r0 = new com.umeng.commonsdk.statistics.proto.d
                r0.<init>()
                r6.imprint = r0
                r0.read(r5)
                r6.setImprintIsSet(r2)
                goto L7b
            L54:
                com.umeng.analytics.pro.ct.a(r5, r1)
                goto L7b
            L58:
                r0 = 11
                if (r1 != r0) goto L66
                java.lang.String r0 = r5.z()
                r6.msg = r0
                r6.setMsgIsSet(r2)
                goto L7b
            L66:
                com.umeng.analytics.pro.ct.a(r5, r1)
                goto L7b
            L6a:
                r0 = 8
                if (r1 != r0) goto L78
                int r0 = r5.w()
                r6.resp_code = r0
                r6.setResp_codeIsSet(r2)
                goto L7b
            L78:
                com.umeng.analytics.pro.ct.a(r5, r1)
            L7b:
                r5.m()
                goto L3
        }

        @Override // com.umeng.analytics.pro.cy
        public /* synthetic */ void b(com.umeng.analytics.pro.cq r1, com.umeng.analytics.pro.br r2) throws com.umeng.analytics.pro.bx {
                r0 = this;
                com.umeng.commonsdk.statistics.proto.Response r2 = (com.umeng.commonsdk.statistics.proto.Response) r2
                r0.a(r1, r2)
                return
        }

        public void b(com.umeng.analytics.pro.cq r2, com.umeng.commonsdk.statistics.proto.Response r3) throws com.umeng.analytics.pro.bx {
                r1 = this;
                r3.validate()
                com.umeng.analytics.pro.cv r0 = com.umeng.commonsdk.statistics.proto.Response.access$300()
                r2.a(r0)
                com.umeng.analytics.pro.cl r0 = com.umeng.commonsdk.statistics.proto.Response.access$400()
                r2.a(r0)
                int r0 = r3.resp_code
                r2.a(r0)
                r2.c()
                java.lang.String r0 = r3.msg
                if (r0 == 0) goto L32
                boolean r0 = r3.isSetMsg()
                if (r0 == 0) goto L32
                com.umeng.analytics.pro.cl r0 = com.umeng.commonsdk.statistics.proto.Response.access$500()
                r2.a(r0)
                java.lang.String r0 = r3.msg
                r2.a(r0)
                r2.c()
            L32:
                com.umeng.commonsdk.statistics.proto.d r0 = r3.imprint
                if (r0 == 0) goto L4b
                boolean r0 = r3.isSetImprint()
                if (r0 == 0) goto L4b
                com.umeng.analytics.pro.cl r0 = com.umeng.commonsdk.statistics.proto.Response.access$600()
                r2.a(r0)
                com.umeng.commonsdk.statistics.proto.d r3 = r3.imprint
                r3.write(r2)
                r2.c()
            L4b:
                r2.d()
                r2.b()
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

        /* synthetic */ b(com.umeng.commonsdk.statistics.proto.Response.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public com.umeng.commonsdk.statistics.proto.Response.a a() {
                r2 = this;
                com.umeng.commonsdk.statistics.proto.Response$a r0 = new com.umeng.commonsdk.statistics.proto.Response$a
                r1 = 0
                r0.<init>(r1)
                return r0
        }

        @Override // com.umeng.analytics.pro.cz
        public /* synthetic */ com.umeng.analytics.pro.cy b() {
                r1 = this;
                com.umeng.commonsdk.statistics.proto.Response$a r0 = r1.a()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class c extends com.umeng.analytics.pro.db<com.umeng.commonsdk.statistics.proto.Response> {
        private c() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ c(com.umeng.commonsdk.statistics.proto.Response.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.umeng.analytics.pro.cy
        public /* bridge */ /* synthetic */ void a(com.umeng.analytics.pro.cq r1, com.umeng.analytics.pro.br r2) throws com.umeng.analytics.pro.bx {
                r0 = this;
                com.umeng.commonsdk.statistics.proto.Response r2 = (com.umeng.commonsdk.statistics.proto.Response) r2
                r0.a(r1, r2)
                return
        }

        public void a(com.umeng.analytics.pro.cq r3, com.umeng.commonsdk.statistics.proto.Response r4) throws com.umeng.analytics.pro.bx {
                r2 = this;
                com.umeng.analytics.pro.cw r3 = (com.umeng.analytics.pro.cw) r3
                int r0 = r4.resp_code
                r3.a(r0)
                java.util.BitSet r0 = new java.util.BitSet
                r0.<init>()
                boolean r1 = r4.isSetMsg()
                if (r1 == 0) goto L16
                r1 = 0
                r0.set(r1)
            L16:
                boolean r1 = r4.isSetImprint()
                if (r1 == 0) goto L20
                r1 = 1
                r0.set(r1)
            L20:
                r1 = 2
                r3.a(r0, r1)
                boolean r0 = r4.isSetMsg()
                if (r0 == 0) goto L2f
                java.lang.String r0 = r4.msg
                r3.a(r0)
            L2f:
                boolean r0 = r4.isSetImprint()
                if (r0 == 0) goto L3a
                com.umeng.commonsdk.statistics.proto.d r4 = r4.imprint
                r4.write(r3)
            L3a:
                return
        }

        @Override // com.umeng.analytics.pro.cy
        public /* bridge */ /* synthetic */ void b(com.umeng.analytics.pro.cq r1, com.umeng.analytics.pro.br r2) throws com.umeng.analytics.pro.bx {
                r0 = this;
                com.umeng.commonsdk.statistics.proto.Response r2 = (com.umeng.commonsdk.statistics.proto.Response) r2
                r0.b(r1, r2)
                return
        }

        public void b(com.umeng.analytics.pro.cq r4, com.umeng.commonsdk.statistics.proto.Response r5) throws com.umeng.analytics.pro.bx {
                r3 = this;
                com.umeng.analytics.pro.cw r4 = (com.umeng.analytics.pro.cw) r4
                int r0 = r4.w()
                r5.resp_code = r0
                r0 = 1
                r5.setResp_codeIsSet(r0)
                r1 = 2
                java.util.BitSet r1 = r4.b(r1)
                r2 = 0
                boolean r2 = r1.get(r2)
                if (r2 == 0) goto L21
                java.lang.String r2 = r4.z()
                r5.msg = r2
                r5.setMsgIsSet(r0)
            L21:
                boolean r1 = r1.get(r0)
                if (r1 == 0) goto L34
                com.umeng.commonsdk.statistics.proto.d r1 = new com.umeng.commonsdk.statistics.proto.d
                r1.<init>()
                r5.imprint = r1
                r1.read(r4)
                r5.setImprintIsSet(r0)
            L34:
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

        /* synthetic */ d(com.umeng.commonsdk.statistics.proto.Response.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public com.umeng.commonsdk.statistics.proto.Response.c a() {
                r2 = this;
                com.umeng.commonsdk.statistics.proto.Response$c r0 = new com.umeng.commonsdk.statistics.proto.Response$c
                r1 = 0
                r0.<init>(r1)
                return r0
        }

        @Override // com.umeng.analytics.pro.cz
        public /* synthetic */ com.umeng.analytics.pro.cy b() {
                r1 = this;
                com.umeng.commonsdk.statistics.proto.Response$c r0 = r1.a()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum e extends java.lang.Enum<com.umeng.commonsdk.statistics.proto.Response.e> implements com.umeng.analytics.pro.by {
        public static final com.umeng.commonsdk.statistics.proto.Response.e a = null;
        public static final com.umeng.commonsdk.statistics.proto.Response.e b = null;
        public static final com.umeng.commonsdk.statistics.proto.Response.e c = null;
        private static final java.util.Map<java.lang.String, com.umeng.commonsdk.statistics.proto.Response.e> d = null;
        private static final /* synthetic */ com.umeng.commonsdk.statistics.proto.Response.e[] g = null;
        private final short e;
        private final java.lang.String f;

        static {
                com.umeng.commonsdk.statistics.proto.Response$e r0 = new com.umeng.commonsdk.statistics.proto.Response$e
                java.lang.String r1 = "resp_code"
                java.lang.String r2 = "RESP_CODE"
                r3 = 0
                r4 = 1
                r0.<init>(r2, r3, r4, r1)
                com.umeng.commonsdk.statistics.proto.Response.e.a = r0
                com.umeng.commonsdk.statistics.proto.Response$e r1 = new com.umeng.commonsdk.statistics.proto.Response$e
                java.lang.String r2 = "msg"
                java.lang.String r5 = "MSG"
                r6 = 2
                r1.<init>(r5, r4, r6, r2)
                com.umeng.commonsdk.statistics.proto.Response.e.b = r1
                com.umeng.commonsdk.statistics.proto.Response$e r2 = new com.umeng.commonsdk.statistics.proto.Response$e
                java.lang.String r5 = "imprint"
                java.lang.String r7 = "IMPRINT"
                r8 = 3
                r2.<init>(r7, r6, r8, r5)
                com.umeng.commonsdk.statistics.proto.Response.e.c = r2
                com.umeng.commonsdk.statistics.proto.Response$e[] r5 = new com.umeng.commonsdk.statistics.proto.Response.e[r8]
                r5[r3] = r0
                r5[r4] = r1
                r5[r6] = r2
                com.umeng.commonsdk.statistics.proto.Response.e.g = r5
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                com.umeng.commonsdk.statistics.proto.Response.e.d = r0
                java.lang.Class<com.umeng.commonsdk.statistics.proto.Response$e> r0 = com.umeng.commonsdk.statistics.proto.Response.e.class
                java.util.EnumSet r0 = java.util.EnumSet.allOf(r0)
                java.util.Iterator r0 = r0.iterator()
            L40:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L56
                java.lang.Object r1 = r0.next()
                com.umeng.commonsdk.statistics.proto.Response$e r1 = (com.umeng.commonsdk.statistics.proto.Response.e) r1
                java.util.Map<java.lang.String, com.umeng.commonsdk.statistics.proto.Response$e> r2 = com.umeng.commonsdk.statistics.proto.Response.e.d
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

        public static com.umeng.commonsdk.statistics.proto.Response.e a(int r1) {
                r0 = 1
                if (r1 == r0) goto L11
                r0 = 2
                if (r1 == r0) goto Le
                r0 = 3
                if (r1 == r0) goto Lb
                r1 = 0
                return r1
            Lb:
                com.umeng.commonsdk.statistics.proto.Response$e r1 = com.umeng.commonsdk.statistics.proto.Response.e.c
                return r1
            Le:
                com.umeng.commonsdk.statistics.proto.Response$e r1 = com.umeng.commonsdk.statistics.proto.Response.e.b
                return r1
            L11:
                com.umeng.commonsdk.statistics.proto.Response$e r1 = com.umeng.commonsdk.statistics.proto.Response.e.a
                return r1
        }

        public static com.umeng.commonsdk.statistics.proto.Response.e a(java.lang.String r1) {
                java.util.Map<java.lang.String, com.umeng.commonsdk.statistics.proto.Response$e> r0 = com.umeng.commonsdk.statistics.proto.Response.e.d
                java.lang.Object r1 = r0.get(r1)
                com.umeng.commonsdk.statistics.proto.Response$e r1 = (com.umeng.commonsdk.statistics.proto.Response.e) r1
                return r1
        }

        public static com.umeng.commonsdk.statistics.proto.Response.e b(int r3) {
                com.umeng.commonsdk.statistics.proto.Response$e r0 = a(r3)
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

        public static com.umeng.commonsdk.statistics.proto.Response.e valueOf(java.lang.String r1) {
                java.lang.Class<com.umeng.commonsdk.statistics.proto.Response$e> r0 = com.umeng.commonsdk.statistics.proto.Response.e.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.umeng.commonsdk.statistics.proto.Response$e r1 = (com.umeng.commonsdk.statistics.proto.Response.e) r1
                return r1
        }

        public static com.umeng.commonsdk.statistics.proto.Response.e[] values() {
                com.umeng.commonsdk.statistics.proto.Response$e[] r0 = com.umeng.commonsdk.statistics.proto.Response.e.g
                java.lang.Object r0 = r0.clone()
                com.umeng.commonsdk.statistics.proto.Response$e[] r0 = (com.umeng.commonsdk.statistics.proto.Response.e[]) r0
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
            java.lang.String r1 = "Response"
            r0.<init>(r1)
            com.umeng.commonsdk.statistics.proto.Response.STRUCT_DESC = r0
            com.umeng.analytics.pro.cl r0 = new com.umeng.analytics.pro.cl
            java.lang.String r1 = "resp_code"
            r2 = 8
            r3 = 1
            r0.<init>(r1, r2, r3)
            com.umeng.commonsdk.statistics.proto.Response.RESP_CODE_FIELD_DESC = r0
            com.umeng.analytics.pro.cl r0 = new com.umeng.analytics.pro.cl
            java.lang.String r4 = "msg"
            r5 = 11
            r6 = 2
            r0.<init>(r4, r5, r6)
            com.umeng.commonsdk.statistics.proto.Response.MSG_FIELD_DESC = r0
            com.umeng.analytics.pro.cl r0 = new com.umeng.analytics.pro.cl
            r7 = 3
            java.lang.String r8 = "imprint"
            r9 = 12
            r0.<init>(r8, r9, r7)
            com.umeng.commonsdk.statistics.proto.Response.IMPRINT_FIELD_DESC = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.umeng.commonsdk.statistics.proto.Response.schemes = r0
            com.umeng.commonsdk.statistics.proto.Response$b r7 = new com.umeng.commonsdk.statistics.proto.Response$b
            r10 = 0
            r7.<init>(r10)
            java.lang.Class<com.umeng.analytics.pro.da> r11 = com.umeng.analytics.pro.da.class
            r0.put(r11, r7)
            com.umeng.commonsdk.statistics.proto.Response$d r7 = new com.umeng.commonsdk.statistics.proto.Response$d
            r7.<init>(r10)
            java.lang.Class<com.umeng.analytics.pro.db> r10 = com.umeng.analytics.pro.db.class
            r0.put(r10, r7)
            java.util.EnumMap r0 = new java.util.EnumMap
            java.lang.Class<com.umeng.commonsdk.statistics.proto.Response$e> r7 = com.umeng.commonsdk.statistics.proto.Response.e.class
            r0.<init>(r7)
            com.umeng.commonsdk.statistics.proto.Response$e r7 = com.umeng.commonsdk.statistics.proto.Response.e.a
            com.umeng.analytics.pro.cd r10 = new com.umeng.analytics.pro.cd
            com.umeng.analytics.pro.ce r11 = new com.umeng.analytics.pro.ce
            r11.<init>(r2)
            r10.<init>(r1, r3, r11)
            r0.put(r7, r10)
            com.umeng.commonsdk.statistics.proto.Response$e r1 = com.umeng.commonsdk.statistics.proto.Response.e.b
            com.umeng.analytics.pro.cd r2 = new com.umeng.analytics.pro.cd
            com.umeng.analytics.pro.ce r3 = new com.umeng.analytics.pro.ce
            r3.<init>(r5)
            r2.<init>(r4, r6, r3)
            r0.put(r1, r2)
            com.umeng.commonsdk.statistics.proto.Response$e r1 = com.umeng.commonsdk.statistics.proto.Response.e.c
            com.umeng.analytics.pro.cd r2 = new com.umeng.analytics.pro.cd
            com.umeng.analytics.pro.ci r3 = new com.umeng.analytics.pro.ci
            java.lang.Class<com.umeng.commonsdk.statistics.proto.d> r4 = com.umeng.commonsdk.statistics.proto.d.class
            r3.<init>(r9, r4)
            r2.<init>(r8, r6, r3)
            r0.put(r1, r2)
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)
            com.umeng.commonsdk.statistics.proto.Response.metaDataMap = r0
            java.lang.Class<com.umeng.commonsdk.statistics.proto.Response> r1 = com.umeng.commonsdk.statistics.proto.Response.class
            com.umeng.analytics.pro.cd.a(r1, r0)
            return
    }

    public Response() {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.__isset_bitfield = r0
            r1 = 2
            com.umeng.commonsdk.statistics.proto.Response$e[] r1 = new com.umeng.commonsdk.statistics.proto.Response.e[r1]
            com.umeng.commonsdk.statistics.proto.Response$e r2 = com.umeng.commonsdk.statistics.proto.Response.e.b
            r1[r0] = r2
            com.umeng.commonsdk.statistics.proto.Response$e r0 = com.umeng.commonsdk.statistics.proto.Response.e.c
            r2 = 1
            r1[r2] = r0
            r3.optionals = r1
            return
    }

    public Response(int r1) {
            r0 = this;
            r0.<init>()
            r0.resp_code = r1
            r1 = 1
            r0.setResp_codeIsSet(r1)
            return
    }

    public Response(com.umeng.commonsdk.statistics.proto.Response r4) {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.__isset_bitfield = r0
            r1 = 2
            com.umeng.commonsdk.statistics.proto.Response$e[] r1 = new com.umeng.commonsdk.statistics.proto.Response.e[r1]
            com.umeng.commonsdk.statistics.proto.Response$e r2 = com.umeng.commonsdk.statistics.proto.Response.e.b
            r1[r0] = r2
            com.umeng.commonsdk.statistics.proto.Response$e r0 = com.umeng.commonsdk.statistics.proto.Response.e.c
            r2 = 1
            r1[r2] = r0
            r3.optionals = r1
            byte r0 = r4.__isset_bitfield
            r3.__isset_bitfield = r0
            int r0 = r4.resp_code
            r3.resp_code = r0
            boolean r0 = r4.isSetMsg()
            if (r0 == 0) goto L26
            java.lang.String r0 = r4.msg
            r3.msg = r0
        L26:
            boolean r0 = r4.isSetImprint()
            if (r0 == 0) goto L35
            com.umeng.commonsdk.statistics.proto.d r0 = new com.umeng.commonsdk.statistics.proto.d
            com.umeng.commonsdk.statistics.proto.d r4 = r4.imprint
            r0.<init>(r4)
            r3.imprint = r0
        L35:
            return
    }

    static /* synthetic */ com.umeng.analytics.pro.cv access$300() {
            com.umeng.analytics.pro.cv r0 = com.umeng.commonsdk.statistics.proto.Response.STRUCT_DESC
            return r0
    }

    static /* synthetic */ com.umeng.analytics.pro.cl access$400() {
            com.umeng.analytics.pro.cl r0 = com.umeng.commonsdk.statistics.proto.Response.RESP_CODE_FIELD_DESC
            return r0
    }

    static /* synthetic */ com.umeng.analytics.pro.cl access$500() {
            com.umeng.analytics.pro.cl r0 = com.umeng.commonsdk.statistics.proto.Response.MSG_FIELD_DESC
            return r0
    }

    static /* synthetic */ com.umeng.analytics.pro.cl access$600() {
            com.umeng.analytics.pro.cl r0 = com.umeng.commonsdk.statistics.proto.Response.IMPRINT_FIELD_DESC
            return r0
    }

    private void readObject(java.io.ObjectInputStream r3) throws java.io.IOException, java.lang.ClassNotFoundException {
            r2 = this;
            r0 = 0
            r2.__isset_bitfield = r0     // Catch: com.umeng.analytics.pro.bx -> L11
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

    private void writeObject(java.io.ObjectOutputStream r3) throws java.io.IOException {
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

    @Override // com.umeng.analytics.pro.br
    public void clear() {
            r1 = this;
            r0 = 0
            r1.setResp_codeIsSet(r0)
            r1.resp_code = r0
            r0 = 0
            r1.msg = r0
            r1.imprint = r0
            return
    }

    @Override // com.umeng.analytics.pro.br
    public /* bridge */ /* synthetic */ com.umeng.analytics.pro.br<com.umeng.commonsdk.statistics.proto.Response, com.umeng.commonsdk.statistics.proto.Response.e> deepCopy() {
            r1 = this;
            com.umeng.commonsdk.statistics.proto.Response r0 = r1.deepCopy2()
            return r0
    }

    @Override // com.umeng.analytics.pro.br
    /* renamed from: deepCopy, reason: avoid collision after fix types in other method */
    public com.umeng.analytics.pro.br<com.umeng.commonsdk.statistics.proto.Response, com.umeng.commonsdk.statistics.proto.Response.e> deepCopy2() {
            r1 = this;
            com.umeng.commonsdk.statistics.proto.Response r0 = new com.umeng.commonsdk.statistics.proto.Response
            r0.<init>(r1)
            return r0
    }

    @Override // com.umeng.analytics.pro.br
    public /* bridge */ /* synthetic */ com.umeng.commonsdk.statistics.proto.Response.e fieldForId(int r1) {
            r0 = this;
            com.umeng.commonsdk.statistics.proto.Response$e r1 = r0.fieldForId2(r1)
            return r1
    }

    @Override // com.umeng.analytics.pro.br
    /* renamed from: fieldForId, reason: avoid collision after fix types in other method */
    public com.umeng.commonsdk.statistics.proto.Response.e fieldForId2(int r1) {
            r0 = this;
            com.umeng.commonsdk.statistics.proto.Response$e r1 = com.umeng.commonsdk.statistics.proto.Response.e.a(r1)
            return r1
    }

    public com.umeng.commonsdk.statistics.proto.d getImprint() {
            r1 = this;
            com.umeng.commonsdk.statistics.proto.d r0 = r1.imprint
            return r0
    }

    public java.lang.String getMsg() {
            r1 = this;
            java.lang.String r0 = r1.msg
            return r0
    }

    public int getResp_code() {
            r1 = this;
            int r0 = r1.resp_code
            return r0
    }

    public boolean isSetImprint() {
            r1 = this;
            com.umeng.commonsdk.statistics.proto.d r0 = r1.imprint
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public boolean isSetMsg() {
            r1 = this;
            java.lang.String r0 = r1.msg
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public boolean isSetResp_code() {
            r2 = this;
            byte r0 = r2.__isset_bitfield
            r1 = 0
            boolean r0 = com.umeng.analytics.pro.bo.a(r0, r1)
            return r0
    }

    @Override // com.umeng.analytics.pro.br
    public void read(com.umeng.analytics.pro.cq r3) throws com.umeng.analytics.pro.bx {
            r2 = this;
            java.util.Map<java.lang.Class<? extends com.umeng.analytics.pro.cy>, com.umeng.analytics.pro.cz> r0 = com.umeng.commonsdk.statistics.proto.Response.schemes
            java.lang.Class r1 = r3.D()
            java.lang.Object r0 = r0.get(r1)
            com.umeng.analytics.pro.cz r0 = (com.umeng.analytics.pro.cz) r0
            com.umeng.analytics.pro.cy r0 = r0.b()
            r0.b(r3, r2)
            return
    }

    public com.umeng.commonsdk.statistics.proto.Response setImprint(com.umeng.commonsdk.statistics.proto.d r1) {
            r0 = this;
            r0.imprint = r1
            return r0
    }

    public void setImprintIsSet(boolean r1) {
            r0 = this;
            if (r1 != 0) goto L5
            r1 = 0
            r0.imprint = r1
        L5:
            return
    }

    public com.umeng.commonsdk.statistics.proto.Response setMsg(java.lang.String r1) {
            r0 = this;
            r0.msg = r1
            return r0
    }

    public void setMsgIsSet(boolean r1) {
            r0 = this;
            if (r1 != 0) goto L5
            r1 = 0
            r0.msg = r1
        L5:
            return
    }

    public com.umeng.commonsdk.statistics.proto.Response setResp_code(int r1) {
            r0 = this;
            r0.resp_code = r1
            r1 = 1
            r0.setResp_codeIsSet(r1)
            return r0
    }

    public void setResp_codeIsSet(boolean r3) {
            r2 = this;
            byte r0 = r2.__isset_bitfield
            r1 = 0
            byte r3 = com.umeng.analytics.pro.bo.a(r0, r1, r3)
            r2.__isset_bitfield = r3
            return
    }

    public java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Response("
            r0.<init>(r1)
            java.lang.String r1 = "resp_code:"
            r0.append(r1)
            int r1 = r4.resp_code
            r0.append(r1)
            boolean r1 = r4.isSetMsg()
            java.lang.String r2 = "null"
            java.lang.String r3 = ", "
            if (r1 == 0) goto L2e
            r0.append(r3)
            java.lang.String r1 = "msg:"
            r0.append(r1)
            java.lang.String r1 = r4.msg
            if (r1 != 0) goto L2b
            r0.append(r2)
            goto L2e
        L2b:
            r0.append(r1)
        L2e:
            boolean r1 = r4.isSetImprint()
            if (r1 == 0) goto L47
            r0.append(r3)
            java.lang.String r1 = "imprint:"
            r0.append(r1)
            com.umeng.commonsdk.statistics.proto.d r1 = r4.imprint
            if (r1 != 0) goto L44
            r0.append(r2)
            goto L47
        L44:
            r0.append(r1)
        L47:
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public void unsetImprint() {
            r1 = this;
            r0 = 0
            r1.imprint = r0
            return
    }

    public void unsetMsg() {
            r1 = this;
            r0 = 0
            r1.msg = r0
            return
    }

    public void unsetResp_code() {
            r2 = this;
            byte r0 = r2.__isset_bitfield
            r1 = 0
            byte r0 = com.umeng.analytics.pro.bo.b(r0, r1)
            r2.__isset_bitfield = r0
            return
    }

    public void validate() throws com.umeng.analytics.pro.bx {
            r1 = this;
            com.umeng.commonsdk.statistics.proto.d r0 = r1.imprint
            if (r0 == 0) goto L7
            r0.l()
        L7:
            return
    }

    @Override // com.umeng.analytics.pro.br
    public void write(com.umeng.analytics.pro.cq r3) throws com.umeng.analytics.pro.bx {
            r2 = this;
            java.util.Map<java.lang.Class<? extends com.umeng.analytics.pro.cy>, com.umeng.analytics.pro.cz> r0 = com.umeng.commonsdk.statistics.proto.Response.schemes
            java.lang.Class r1 = r3.D()
            java.lang.Object r0 = r0.get(r1)
            com.umeng.analytics.pro.cz r0 = (com.umeng.analytics.pro.cz) r0
            com.umeng.analytics.pro.cy r0 = r0.b()
            r0.a(r3, r2)
            return
    }
}

package com.bumptech.glide.repackaged.com.squareup.javapoet;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class TypeSpec {

    /* renamed from: q, reason: collision with root package name */
    static final /* synthetic */ boolean f477q = false;
    public final com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec.Kind a;
    public final java.lang.String b;
    public final com.bumptech.glide.repackaged.com.squareup.javapoet.d c;
    public final com.bumptech.glide.repackaged.com.squareup.javapoet.d d;
    public final java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.a> e;
    public final java.util.Set<javax.lang.model.element.Modifier> f;
    public final java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.m> g;
    public final com.bumptech.glide.repackaged.com.squareup.javapoet.l h;
    public final java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.l> i;
    public final java.util.Map<java.lang.String, com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec> j;
    public final java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.f> k;

    /* renamed from: l, reason: collision with root package name */
    public final com.bumptech.glide.repackaged.com.squareup.javapoet.d f478l;

    /* renamed from: m, reason: collision with root package name */
    public final com.bumptech.glide.repackaged.com.squareup.javapoet.d f479m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.i> f480n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec> f481o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.List<javax.lang.model.element.Element> f482p;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum Kind extends java.lang.Enum<com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec.Kind> {
        private static final /* synthetic */ com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec.Kind[] $VALUES = null;
        public static final com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec.Kind ANNOTATION = null;
        public static final com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec.Kind CLASS = null;
        public static final com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec.Kind ENUM = null;
        public static final com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec.Kind INTERFACE = null;
        private final java.util.Set<javax.lang.model.element.Modifier> asMemberModifiers;
        private final java.util.Set<javax.lang.model.element.Modifier> implicitFieldModifiers;
        private final java.util.Set<javax.lang.model.element.Modifier> implicitMethodModifiers;
        private final java.util.Set<javax.lang.model.element.Modifier> implicitTypeModifiers;

        static {
                com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec$Kind r0 = new com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec$Kind
                java.util.Set r3 = java.util.Collections.EMPTY_SET
                java.lang.String r1 = "CLASS"
                r2 = 0
                r4 = r3
                r5 = r3
                r6 = r3
                r0.<init>(r1, r2, r3, r4, r5, r6)
                com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec.Kind.CLASS = r0
                com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec$Kind r4 = new com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec$Kind
                r11 = 3
                javax.lang.model.element.Modifier[] r1 = new javax.lang.model.element.Modifier[r11]
                javax.lang.model.element.Modifier r2 = javax.lang.model.element.Modifier.PUBLIC
                r12 = 0
                r1[r12] = r2
                javax.lang.model.element.Modifier r2 = javax.lang.model.element.Modifier.STATIC
                r13 = 1
                r1[r13] = r2
                javax.lang.model.element.Modifier r2 = javax.lang.model.element.Modifier.FINAL
                r14 = 2
                r1[r14] = r2
                java.util.List r1 = java.util.Arrays.asList(r1)
                java.util.Set r7 = com.bumptech.glide.repackaged.com.squareup.javapoet.n.i(r1)
                javax.lang.model.element.Modifier[] r1 = new javax.lang.model.element.Modifier[r14]
                javax.lang.model.element.Modifier r2 = javax.lang.model.element.Modifier.PUBLIC
                r1[r12] = r2
                javax.lang.model.element.Modifier r2 = javax.lang.model.element.Modifier.ABSTRACT
                r1[r13] = r2
                java.util.List r1 = java.util.Arrays.asList(r1)
                java.util.Set r8 = com.bumptech.glide.repackaged.com.squareup.javapoet.n.i(r1)
                javax.lang.model.element.Modifier[] r1 = new javax.lang.model.element.Modifier[r14]
                javax.lang.model.element.Modifier r2 = javax.lang.model.element.Modifier.PUBLIC
                r1[r12] = r2
                javax.lang.model.element.Modifier r2 = javax.lang.model.element.Modifier.STATIC
                r1[r13] = r2
                java.util.List r1 = java.util.Arrays.asList(r1)
                java.util.Set r9 = com.bumptech.glide.repackaged.com.squareup.javapoet.n.i(r1)
                javax.lang.model.element.Modifier[] r1 = new javax.lang.model.element.Modifier[r13]
                javax.lang.model.element.Modifier r2 = javax.lang.model.element.Modifier.STATIC
                r1[r12] = r2
                java.util.List r1 = java.util.Arrays.asList(r1)
                java.util.Set r10 = com.bumptech.glide.repackaged.com.squareup.javapoet.n.i(r1)
                java.lang.String r5 = "INTERFACE"
                r6 = 1
                r4.<init>(r5, r6, r7, r8, r9, r10)
                r8 = r4
                com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec.Kind.INTERFACE = r8
                com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec$Kind r1 = new com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec$Kind
                javax.lang.model.element.Modifier r2 = javax.lang.model.element.Modifier.STATIC
                java.util.Set r7 = java.util.Collections.singleton(r2)
                java.lang.String r2 = "ENUM"
                r4 = r3
                r3 = 2
                r5 = r4
                r6 = r4
                r1.<init>(r2, r3, r4, r5, r6, r7)
                com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec.Kind.ENUM = r1
                com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec$Kind r15 = new com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec$Kind
                javax.lang.model.element.Modifier[] r2 = new javax.lang.model.element.Modifier[r11]
                javax.lang.model.element.Modifier r3 = javax.lang.model.element.Modifier.PUBLIC
                r2[r12] = r3
                javax.lang.model.element.Modifier r3 = javax.lang.model.element.Modifier.STATIC
                r2[r13] = r3
                javax.lang.model.element.Modifier r3 = javax.lang.model.element.Modifier.FINAL
                r2[r14] = r3
                java.util.List r2 = java.util.Arrays.asList(r2)
                java.util.Set r18 = com.bumptech.glide.repackaged.com.squareup.javapoet.n.i(r2)
                javax.lang.model.element.Modifier[] r2 = new javax.lang.model.element.Modifier[r14]
                javax.lang.model.element.Modifier r3 = javax.lang.model.element.Modifier.PUBLIC
                r2[r12] = r3
                javax.lang.model.element.Modifier r3 = javax.lang.model.element.Modifier.ABSTRACT
                r2[r13] = r3
                java.util.List r2 = java.util.Arrays.asList(r2)
                java.util.Set r19 = com.bumptech.glide.repackaged.com.squareup.javapoet.n.i(r2)
                javax.lang.model.element.Modifier[] r2 = new javax.lang.model.element.Modifier[r14]
                javax.lang.model.element.Modifier r3 = javax.lang.model.element.Modifier.PUBLIC
                r2[r12] = r3
                javax.lang.model.element.Modifier r3 = javax.lang.model.element.Modifier.STATIC
                r2[r13] = r3
                java.util.List r2 = java.util.Arrays.asList(r2)
                java.util.Set r20 = com.bumptech.glide.repackaged.com.squareup.javapoet.n.i(r2)
                javax.lang.model.element.Modifier[] r2 = new javax.lang.model.element.Modifier[r13]
                javax.lang.model.element.Modifier r3 = javax.lang.model.element.Modifier.STATIC
                r2[r12] = r3
                java.util.List r2 = java.util.Arrays.asList(r2)
                java.util.Set r21 = com.bumptech.glide.repackaged.com.squareup.javapoet.n.i(r2)
                java.lang.String r16 = "ANNOTATION"
                r17 = 3
                r15.<init>(r16, r17, r18, r19, r20, r21)
                com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec.Kind.ANNOTATION = r15
                r2 = 4
                com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec$Kind[] r2 = new com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec.Kind[r2]
                r2[r12] = r0
                r2[r13] = r8
                r2[r14] = r1
                r2[r11] = r15
                com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec.Kind.$VALUES = r2
                return
        }

        Kind(java.lang.String r1, int r2, java.util.Set r3, java.util.Set r4, java.util.Set r5, java.util.Set r6) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.implicitFieldModifiers = r3
                r0.implicitMethodModifiers = r4
                r0.implicitTypeModifiers = r5
                r0.asMemberModifiers = r6
                return
        }

        static /* synthetic */ java.util.Set access$1700(com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec.Kind r0) {
                java.util.Set<javax.lang.model.element.Modifier> r0 = r0.asMemberModifiers
                return r0
        }

        static /* synthetic */ java.util.Set access$1800(com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec.Kind r0) {
                java.util.Set<javax.lang.model.element.Modifier> r0 = r0.implicitFieldModifiers
                return r0
        }

        static /* synthetic */ java.util.Set access$1900(com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec.Kind r0) {
                java.util.Set<javax.lang.model.element.Modifier> r0 = r0.implicitMethodModifiers
                return r0
        }

        static /* synthetic */ java.util.Set access$2000(com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec.Kind r0) {
                java.util.Set<javax.lang.model.element.Modifier> r0 = r0.implicitTypeModifiers
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static /* synthetic */ class a {
        public a() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class b {
        private final com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec.Kind a;
        private final java.lang.String b;
        private final com.bumptech.glide.repackaged.com.squareup.javapoet.d c;
        private final com.bumptech.glide.repackaged.com.squareup.javapoet.d.b d;
        private final java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.a> e;
        private final java.util.List<javax.lang.model.element.Modifier> f;
        private final java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.m> g;
        private com.bumptech.glide.repackaged.com.squareup.javapoet.l h;
        private final java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.l> i;
        private final java.util.Map<java.lang.String, com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec> j;
        private final java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.f> k;

        /* renamed from: l, reason: collision with root package name */
        private final com.bumptech.glide.repackaged.com.squareup.javapoet.d.b f483l;

        /* renamed from: m, reason: collision with root package name */
        private final com.bumptech.glide.repackaged.com.squareup.javapoet.d.b f484m;

        /* renamed from: n, reason: collision with root package name */
        private final java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.i> f485n;

        /* renamed from: o, reason: collision with root package name */
        private final java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec> f486o;

        /* renamed from: p, reason: collision with root package name */
        private final java.util.List<javax.lang.model.element.Element> f487p;

        private b(com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec.Kind r4, java.lang.String r5, com.bumptech.glide.repackaged.com.squareup.javapoet.d r6) {
                r3 = this;
                r3.<init>()
                com.bumptech.glide.repackaged.com.squareup.javapoet.d$b r0 = com.bumptech.glide.repackaged.com.squareup.javapoet.d.a()
                r3.d = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r3.e = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r3.f = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r3.g = r0
                com.bumptech.glide.repackaged.com.squareup.javapoet.c r0 = com.bumptech.glide.repackaged.com.squareup.javapoet.c.f489y
                r3.h = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r3.i = r0
                java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
                r0.<init>()
                r3.j = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r3.k = r0
                com.bumptech.glide.repackaged.com.squareup.javapoet.d$b r0 = com.bumptech.glide.repackaged.com.squareup.javapoet.d.a()
                r3.f483l = r0
                com.bumptech.glide.repackaged.com.squareup.javapoet.d$b r0 = com.bumptech.glide.repackaged.com.squareup.javapoet.d.a()
                r3.f484m = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r3.f485n = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r3.f486o = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r3.f487p = r0
                r0 = 1
                r1 = 0
                if (r5 == 0) goto L65
                boolean r2 = javax.lang.model.SourceVersion.isName(r5)
                if (r2 == 0) goto L63
                goto L65
            L63:
                r2 = 0
                goto L66
            L65:
                r2 = 1
            L66:
                java.lang.Object[] r0 = new java.lang.Object[r0]
                r0[r1] = r5
                java.lang.String r1 = "not a valid name: %s"
                com.bumptech.glide.repackaged.com.squareup.javapoet.n.b(r2, r1, r0)
                r3.a = r4
                r3.b = r5
                r3.c = r6
                return
        }

        /* synthetic */ b(com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec.Kind r1, java.lang.String r2, com.bumptech.glide.repackaged.com.squareup.javapoet.d r3, com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec.a r4) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                return
        }

        static /* synthetic */ com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec.Kind a(com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec.b r0) {
                com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec$Kind r0 = r0.a
                return r0
        }

        static /* synthetic */ java.lang.String b(com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec.b r0) {
                java.lang.String r0 = r0.b
                return r0
        }

        static /* synthetic */ java.util.List c(com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec.b r0) {
                java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.f> r0 = r0.k
                return r0
        }

        static /* synthetic */ com.bumptech.glide.repackaged.com.squareup.javapoet.d.b d(com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec.b r0) {
                com.bumptech.glide.repackaged.com.squareup.javapoet.d$b r0 = r0.f483l
                return r0
        }

        static /* synthetic */ com.bumptech.glide.repackaged.com.squareup.javapoet.d.b e(com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec.b r0) {
                com.bumptech.glide.repackaged.com.squareup.javapoet.d$b r0 = r0.f484m
                return r0
        }

        static /* synthetic */ java.util.List f(com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec.b r0) {
                java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.i> r0 = r0.f485n
                return r0
        }

        static /* synthetic */ java.util.List g(com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec.b r0) {
                java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec> r0 = r0.f486o
                return r0
        }

        static /* synthetic */ java.util.List h(com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec.b r0) {
                java.util.List<javax.lang.model.element.Element> r0 = r0.f487p
                return r0
        }

        static /* synthetic */ com.bumptech.glide.repackaged.com.squareup.javapoet.d i(com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec.b r0) {
                com.bumptech.glide.repackaged.com.squareup.javapoet.d r0 = r0.c
                return r0
        }

        static /* synthetic */ com.bumptech.glide.repackaged.com.squareup.javapoet.d.b j(com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec.b r0) {
                com.bumptech.glide.repackaged.com.squareup.javapoet.d$b r0 = r0.d
                return r0
        }

        static /* synthetic */ java.util.List k(com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec.b r0) {
                java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.a> r0 = r0.e
                return r0
        }

        static /* synthetic */ java.util.List l(com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec.b r0) {
                java.util.List<javax.lang.model.element.Modifier> r0 = r0.f
                return r0
        }

        static /* synthetic */ java.util.List m(com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec.b r0) {
                java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.m> r0 = r0.g
                return r0
        }

        static /* synthetic */ com.bumptech.glide.repackaged.com.squareup.javapoet.l n(com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec.b r0) {
                com.bumptech.glide.repackaged.com.squareup.javapoet.l r0 = r0.h
                return r0
        }

        static /* synthetic */ java.util.List o(com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec.b r0) {
                java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.l> r0 = r0.i
                return r0
        }

        static /* synthetic */ java.util.Map p(com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec.b r0) {
                java.util.Map<java.lang.String, com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec> r0 = r0.j
                return r0
        }

        public com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec.b A(com.bumptech.glide.repackaged.com.squareup.javapoet.m r4) {
                r3 = this;
                com.bumptech.glide.repackaged.com.squareup.javapoet.d r0 = r3.c
                r1 = 0
                if (r0 != 0) goto L7
                r0 = 1
                goto L8
            L7:
                r0 = 0
            L8:
                java.lang.String r2 = "forbidden on anonymous types."
                java.lang.Object[] r1 = new java.lang.Object[r1]
                com.bumptech.glide.repackaged.com.squareup.javapoet.n.d(r0, r2, r1)
                java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.m> r0 = r3.g
                r0.add(r4)
                return r3
        }

        public com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec B() {
                r8 = this;
                com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec$Kind r0 = r8.a
                com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec$Kind r1 = com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec.Kind.ENUM
                r2 = 0
                r3 = 1
                if (r0 != r1) goto L13
                java.util.Map<java.lang.String, com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec> r0 = r8.j
                boolean r0 = r0.isEmpty()
                if (r0 != 0) goto L11
                goto L13
            L11:
                r0 = 0
                goto L14
            L13:
                r0 = 1
            L14:
                java.lang.String r1 = r8.b
                java.lang.Object[] r4 = new java.lang.Object[r3]
                r4[r2] = r1
                java.lang.String r1 = "at least one enum constant is required for %s"
                com.bumptech.glide.repackaged.com.squareup.javapoet.n.b(r0, r1, r4)
                java.util.List<javax.lang.model.element.Modifier> r0 = r8.f
                javax.lang.model.element.Modifier r1 = javax.lang.model.element.Modifier.ABSTRACT
                boolean r0 = r0.contains(r1)
                if (r0 != 0) goto L32
                com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec$Kind r0 = r8.a
                com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec$Kind r1 = com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec.Kind.CLASS
                if (r0 == r1) goto L30
                goto L32
            L30:
                r0 = 0
                goto L33
            L32:
                r0 = 1
            L33:
                java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.i> r1 = r8.f485n
                java.util.Iterator r1 = r1.iterator()
            L39:
                boolean r4 = r1.hasNext()
                if (r4 == 0) goto L64
                java.lang.Object r4 = r1.next()
                com.bumptech.glide.repackaged.com.squareup.javapoet.i r4 = (com.bumptech.glide.repackaged.com.squareup.javapoet.i) r4
                if (r0 != 0) goto L52
                javax.lang.model.element.Modifier r5 = javax.lang.model.element.Modifier.ABSTRACT
                boolean r5 = r4.c(r5)
                if (r5 != 0) goto L50
                goto L52
            L50:
                r5 = 0
                goto L53
            L52:
                r5 = 1
            L53:
                java.lang.String r6 = r8.b
                java.lang.String r4 = r4.a
                r7 = 2
                java.lang.Object[] r7 = new java.lang.Object[r7]
                r7[r2] = r6
                r7[r3] = r4
                java.lang.String r4 = "non-abstract type %s cannot declare abstract method %s"
                com.bumptech.glide.repackaged.com.squareup.javapoet.n.b(r5, r4, r7)
                goto L39
            L64:
                com.bumptech.glide.repackaged.com.squareup.javapoet.l r0 = r8.h
                com.bumptech.glide.repackaged.com.squareup.javapoet.c r1 = com.bumptech.glide.repackaged.com.squareup.javapoet.c.f489y
                boolean r0 = r0.equals(r1)
                r0 = r0 ^ r3
                java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.l> r1 = r8.i
                int r1 = r1.size()
                int r0 = r0 + r1
                com.bumptech.glide.repackaged.com.squareup.javapoet.d r1 = r8.c
                if (r1 == 0) goto L7c
                if (r0 > r3) goto L7b
                goto L7c
            L7b:
                r3 = 0
            L7c:
                java.lang.String r0 = "anonymous type has too many supertypes"
                java.lang.Object[] r1 = new java.lang.Object[r2]
                com.bumptech.glide.repackaged.com.squareup.javapoet.n.b(r3, r0, r1)
                com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec r0 = new com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec
                r1 = 0
                r0.<init>(r8, r1)
                return r0
        }

        public com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec.b C(com.bumptech.glide.repackaged.com.squareup.javapoet.l r6) {
                r5 = this;
                com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec$Kind r0 = r5.a
                com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec$Kind r1 = com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec.Kind.CLASS
                r2 = 1
                r3 = 0
                if (r0 != r1) goto La
                r0 = 1
                goto Lb
            La:
                r0 = 0
            Lb:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r4 = "only classes have super classes, not "
                r1.append(r4)
                com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec$Kind r4 = r5.a
                r1.append(r4)
                java.lang.String r1 = r1.toString()
                java.lang.Object[] r4 = new java.lang.Object[r3]
                com.bumptech.glide.repackaged.com.squareup.javapoet.n.d(r0, r1, r4)
                com.bumptech.glide.repackaged.com.squareup.javapoet.l r0 = r5.h
                com.bumptech.glide.repackaged.com.squareup.javapoet.c r1 = com.bumptech.glide.repackaged.com.squareup.javapoet.c.f489y
                if (r0 != r1) goto L2b
                r0 = 1
                goto L2c
            L2b:
                r0 = 0
            L2c:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r4 = "superclass already set to "
                r1.append(r4)
                com.bumptech.glide.repackaged.com.squareup.javapoet.l r4 = r5.h
                r1.append(r4)
                java.lang.String r1 = r1.toString()
                java.lang.Object[] r4 = new java.lang.Object[r3]
                com.bumptech.glide.repackaged.com.squareup.javapoet.n.d(r0, r1, r4)
                boolean r0 = r6.p()
                r0 = r0 ^ r2
                java.lang.String r1 = "superclass may not be a primitive"
                java.lang.Object[] r2 = new java.lang.Object[r3]
                com.bumptech.glide.repackaged.com.squareup.javapoet.n.b(r0, r1, r2)
                r5.h = r6
                return r5
        }

        public com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec.b q(com.bumptech.glide.repackaged.com.squareup.javapoet.a r2) {
                r1 = this;
                java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.a> r0 = r1.e
                r0.add(r2)
                return r1
        }

        public com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec.b r(com.bumptech.glide.repackaged.com.squareup.javapoet.f r10) {
                r9 = this;
                com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec$Kind r0 = r9.a
                com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec$Kind r1 = com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec.Kind.INTERFACE
                if (r0 == r1) goto La
                com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec$Kind r1 = com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec.Kind.ANNOTATION
                if (r0 != r1) goto L41
            La:
                java.util.Set<javax.lang.model.element.Modifier> r0 = r10.e
                r1 = 2
                javax.lang.model.element.Modifier[] r2 = new javax.lang.model.element.Modifier[r1]
                javax.lang.model.element.Modifier r3 = javax.lang.model.element.Modifier.PUBLIC
                r4 = 0
                r2[r4] = r3
                javax.lang.model.element.Modifier r3 = javax.lang.model.element.Modifier.PRIVATE
                r5 = 1
                r2[r5] = r3
                com.bumptech.glide.repackaged.com.squareup.javapoet.n.k(r0, r2)
                javax.lang.model.element.Modifier r0 = javax.lang.model.element.Modifier.STATIC
                javax.lang.model.element.Modifier r2 = javax.lang.model.element.Modifier.FINAL
                java.util.EnumSet r0 = java.util.EnumSet.of(r0, r2)
                java.util.Set<javax.lang.model.element.Modifier> r2 = r10.e
                boolean r2 = r2.containsAll(r0)
                com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec$Kind r3 = r9.a
                java.lang.String r6 = r9.b
                java.lang.String r7 = r10.b
                r8 = 4
                java.lang.Object[] r8 = new java.lang.Object[r8]
                r8[r4] = r3
                r8[r5] = r6
                r8[r1] = r7
                r1 = 3
                r8[r1] = r0
                java.lang.String r0 = "%s %s.%s requires modifiers %s"
                com.bumptech.glide.repackaged.com.squareup.javapoet.n.d(r2, r0, r8)
            L41:
                java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.f> r0 = r9.k
                r0.add(r10)
                return r9
        }

        public com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec.b s(com.bumptech.glide.repackaged.com.squareup.javapoet.l r1, java.lang.String r2, javax.lang.model.element.Modifier... r3) {
                r0 = this;
                com.bumptech.glide.repackaged.com.squareup.javapoet.f$b r1 = com.bumptech.glide.repackaged.com.squareup.javapoet.f.a(r1, r2, r3)
                com.bumptech.glide.repackaged.com.squareup.javapoet.f r1 = r1.h()
                com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec$b r1 = r0.r(r1)
                return r1
        }

        public com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec.b t(com.bumptech.glide.repackaged.com.squareup.javapoet.d r2) {
                r1 = this;
                com.bumptech.glide.repackaged.com.squareup.javapoet.d$b r0 = r1.d
                r0.a(r2)
                return r1
        }

        public com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec.b u(java.lang.String r2, java.lang.Object... r3) {
                r1 = this;
                com.bumptech.glide.repackaged.com.squareup.javapoet.d$b r0 = r1.d
                r0.b(r2, r3)
                return r1
        }

        public com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec.b v(com.bumptech.glide.repackaged.com.squareup.javapoet.i r12) {
                r11 = this;
                com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec$Kind r0 = r11.a
                com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec$Kind r1 = com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec.Kind.INTERFACE
                r2 = 3
                r3 = 2
                r4 = 0
                r5 = 1
                if (r0 != r1) goto L2d
                java.util.Set<javax.lang.model.element.Modifier> r0 = r12.d
                javax.lang.model.element.Modifier[] r6 = new javax.lang.model.element.Modifier[r2]
                javax.lang.model.element.Modifier r7 = javax.lang.model.element.Modifier.ABSTRACT
                r6[r4] = r7
                javax.lang.model.element.Modifier r7 = javax.lang.model.element.Modifier.STATIC
                r6[r5] = r7
                javax.lang.model.element.Modifier r7 = com.bumptech.glide.repackaged.com.squareup.javapoet.n.a
                r6[r3] = r7
                com.bumptech.glide.repackaged.com.squareup.javapoet.n.k(r0, r6)
                java.util.Set<javax.lang.model.element.Modifier> r0 = r12.d
                javax.lang.model.element.Modifier[] r6 = new javax.lang.model.element.Modifier[r3]
                javax.lang.model.element.Modifier r7 = javax.lang.model.element.Modifier.PUBLIC
                r6[r4] = r7
                javax.lang.model.element.Modifier r7 = javax.lang.model.element.Modifier.PRIVATE
                r6[r5] = r7
                com.bumptech.glide.repackaged.com.squareup.javapoet.n.k(r0, r6)
                goto L55
            L2d:
                com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec$Kind r6 = com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec.Kind.ANNOTATION
                if (r0 != r6) goto L55
                java.util.Set<javax.lang.model.element.Modifier> r6 = r12.d
                java.util.Set r0 = com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec.Kind.access$1900(r0)
                boolean r0 = r6.equals(r0)
                com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec$Kind r6 = r11.a
                java.lang.String r7 = r11.b
                java.lang.String r8 = r12.a
                java.util.Set r9 = com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec.Kind.access$1900(r6)
                r10 = 4
                java.lang.Object[] r10 = new java.lang.Object[r10]
                r10[r4] = r6
                r10[r5] = r7
                r10[r3] = r8
                r10[r2] = r9
                java.lang.String r6 = "%s %s.%s requires modifiers %s"
                com.bumptech.glide.repackaged.com.squareup.javapoet.n.d(r0, r6, r10)
            L55:
                com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec$Kind r0 = r11.a
                com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec$Kind r6 = com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec.Kind.ANNOTATION
                if (r0 == r6) goto L73
                com.bumptech.glide.repackaged.com.squareup.javapoet.d r6 = r12.k
                if (r6 != 0) goto L61
                r6 = 1
                goto L62
            L61:
                r6 = 0
            L62:
                java.lang.String r7 = r11.b
                java.lang.String r8 = r12.a
                java.lang.Object[] r9 = new java.lang.Object[r2]
                r9[r4] = r0
                r9[r5] = r7
                r9[r3] = r8
                java.lang.String r0 = "%s %s.%s cannot have a default value"
                com.bumptech.glide.repackaged.com.squareup.javapoet.n.d(r6, r0, r9)
            L73:
                com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec$Kind r0 = r11.a
                if (r0 == r1) goto L91
                java.util.Set<javax.lang.model.element.Modifier> r0 = r12.d
                boolean r0 = com.bumptech.glide.repackaged.com.squareup.javapoet.n.e(r0)
                r0 = r0 ^ r5
                com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec$Kind r1 = r11.a
                java.lang.String r6 = r11.b
                java.lang.String r7 = r12.a
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r2[r4] = r1
                r2[r5] = r6
                r2[r3] = r7
                java.lang.String r1 = "%s %s.%s cannot be default"
                com.bumptech.glide.repackaged.com.squareup.javapoet.n.d(r0, r1, r2)
            L91:
                java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.i> r0 = r11.f485n
                r0.add(r12)
                return r11
        }

        public com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec.b w(java.lang.Iterable<com.bumptech.glide.repackaged.com.squareup.javapoet.i> r4) {
                r3 = this;
                r0 = 0
                if (r4 == 0) goto L5
                r1 = 1
                goto L6
            L5:
                r1 = 0
            L6:
                java.lang.String r2 = "methodSpecs == null"
                java.lang.Object[] r0 = new java.lang.Object[r0]
                com.bumptech.glide.repackaged.com.squareup.javapoet.n.b(r1, r2, r0)
                java.util.Iterator r4 = r4.iterator()
            L11:
                boolean r0 = r4.hasNext()
                if (r0 == 0) goto L21
                java.lang.Object r0 = r4.next()
                com.bumptech.glide.repackaged.com.squareup.javapoet.i r0 = (com.bumptech.glide.repackaged.com.squareup.javapoet.i) r0
                r3.v(r0)
                goto L11
            L21:
                return r3
        }

        public com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec.b x(javax.lang.model.element.Modifier... r9) {
                r8 = this;
                com.bumptech.glide.repackaged.com.squareup.javapoet.d r0 = r8.c
                r1 = 1
                r2 = 0
                if (r0 != 0) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                java.lang.String r3 = "forbidden on anonymous types."
                java.lang.Object[] r4 = new java.lang.Object[r2]
                com.bumptech.glide.repackaged.com.squareup.javapoet.n.d(r0, r3, r4)
                int r0 = r9.length
                r3 = 0
            L12:
                if (r3 >= r0) goto L2a
                r4 = r9[r3]
                if (r4 == 0) goto L1a
                r5 = 1
                goto L1b
            L1a:
                r5 = 0
            L1b:
                java.lang.String r6 = "modifiers contain null"
                java.lang.Object[] r7 = new java.lang.Object[r2]
                com.bumptech.glide.repackaged.com.squareup.javapoet.n.b(r5, r6, r7)
                java.util.List<javax.lang.model.element.Modifier> r5 = r8.f
                r5.add(r4)
                int r3 = r3 + 1
                goto L12
            L2a:
                return r8
        }

        public com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec.b y(com.bumptech.glide.repackaged.com.squareup.javapoet.l r4) {
                r3 = this;
                r0 = 0
                if (r4 == 0) goto L5
                r1 = 1
                goto L6
            L5:
                r1 = 0
            L6:
                java.lang.String r2 = "superinterface == null"
                java.lang.Object[] r0 = new java.lang.Object[r0]
                com.bumptech.glide.repackaged.com.squareup.javapoet.n.b(r1, r2, r0)
                java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.l> r0 = r3.i
                r0.add(r4)
                return r3
        }

        public com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec.b z(java.lang.reflect.Type r1) {
                r0 = this;
                com.bumptech.glide.repackaged.com.squareup.javapoet.l r1 = com.bumptech.glide.repackaged.com.squareup.javapoet.l.j(r1)
                com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec$b r1 = r0.y(r1)
                return r1
        }
    }

    static {
            return
    }

    private TypeSpec(com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec.b r3) {
            r2 = this;
            r2.<init>()
            com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec$Kind r0 = com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec.b.a(r3)
            r2.a = r0
            java.lang.String r0 = com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec.b.b(r3)
            r2.b = r0
            com.bumptech.glide.repackaged.com.squareup.javapoet.d r0 = com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec.b.i(r3)
            r2.c = r0
            com.bumptech.glide.repackaged.com.squareup.javapoet.d$b r0 = com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec.b.j(r3)
            com.bumptech.glide.repackaged.com.squareup.javapoet.d r0 = r0.j()
            r2.d = r0
            java.util.List r0 = com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec.b.k(r3)
            java.util.List r0 = com.bumptech.glide.repackaged.com.squareup.javapoet.n.f(r0)
            r2.e = r0
            java.util.List r0 = com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec.b.l(r3)
            java.util.Set r0 = com.bumptech.glide.repackaged.com.squareup.javapoet.n.i(r0)
            r2.f = r0
            java.util.List r0 = com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec.b.m(r3)
            java.util.List r0 = com.bumptech.glide.repackaged.com.squareup.javapoet.n.f(r0)
            r2.g = r0
            com.bumptech.glide.repackaged.com.squareup.javapoet.l r0 = com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec.b.n(r3)
            r2.h = r0
            java.util.List r0 = com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec.b.o(r3)
            java.util.List r0 = com.bumptech.glide.repackaged.com.squareup.javapoet.n.f(r0)
            r2.i = r0
            java.util.Map r0 = com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec.b.p(r3)
            java.util.Map r0 = com.bumptech.glide.repackaged.com.squareup.javapoet.n.g(r0)
            r2.j = r0
            java.util.List r0 = com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec.b.c(r3)
            java.util.List r0 = com.bumptech.glide.repackaged.com.squareup.javapoet.n.f(r0)
            r2.k = r0
            com.bumptech.glide.repackaged.com.squareup.javapoet.d$b r0 = com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec.b.d(r3)
            com.bumptech.glide.repackaged.com.squareup.javapoet.d r0 = r0.j()
            r2.f478l = r0
            com.bumptech.glide.repackaged.com.squareup.javapoet.d$b r0 = com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec.b.e(r3)
            com.bumptech.glide.repackaged.com.squareup.javapoet.d r0 = r0.j()
            r2.f479m = r0
            java.util.List r0 = com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec.b.f(r3)
            java.util.List r0 = com.bumptech.glide.repackaged.com.squareup.javapoet.n.f(r0)
            r2.f480n = r0
            java.util.List r0 = com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec.b.g(r3)
            java.util.List r0 = com.bumptech.glide.repackaged.com.squareup.javapoet.n.f(r0)
            r2.f481o = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r1 = com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec.b.h(r3)
            r0.addAll(r1)
            java.util.List r3 = com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec.b.g(r3)
            java.util.Iterator r3 = r3.iterator()
        L9d:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto Laf
            java.lang.Object r1 = r3.next()
            com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec r1 = (com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec) r1
            java.util.List<javax.lang.model.element.Element> r1 = r1.f482p
            r0.addAll(r1)
            goto L9d
        Laf:
            java.util.List r3 = com.bumptech.glide.repackaged.com.squareup.javapoet.n.f(r0)
            r2.f482p = r3
            return
    }

    /* synthetic */ TypeSpec(com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec.b r1, com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec.a r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    private TypeSpec(com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec r4) {
            r3 = this;
            r3.<init>()
            com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec$Kind r0 = r4.a
            r3.a = r0
            java.lang.String r0 = r4.b
            r3.b = r0
            r0 = 0
            r3.c = r0
            com.bumptech.glide.repackaged.com.squareup.javapoet.d r1 = r4.d
            r3.d = r1
            java.util.List r1 = java.util.Collections.EMPTY_LIST
            r3.e = r1
            java.util.Set r2 = java.util.Collections.EMPTY_SET
            r3.f = r2
            r3.g = r1
            r3.h = r0
            r3.i = r1
            java.util.Map r0 = java.util.Collections.EMPTY_MAP
            r3.j = r0
            r3.k = r1
            com.bumptech.glide.repackaged.com.squareup.javapoet.d r0 = r4.f478l
            r3.f478l = r0
            com.bumptech.glide.repackaged.com.squareup.javapoet.d r4 = r4.f479m
            r3.f479m = r4
            r3.f480n = r1
            r3.f481o = r1
            r3.f482p = r1
            return
    }

    public static com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec.b a(java.lang.String r4) {
            com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec$b r0 = new com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec$b
            com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec$Kind r1 = com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec.Kind.CLASS
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = "name == null"
            java.lang.Object r4 = com.bumptech.glide.repackaged.com.squareup.javapoet.n.c(r4, r3, r2)
            java.lang.String r4 = (java.lang.String) r4
            r2 = 0
            r0.<init>(r1, r4, r2, r2)
            return r0
    }

    void b(com.bumptech.glide.repackaged.com.squareup.javapoet.e r10, java.lang.String r11, java.util.Set<javax.lang.model.element.Modifier> r12) throws java.io.IOException {
            r9 = this;
            int r0 = r10.f495n
            r1 = -1
            r10.f495n = r1
            java.lang.String r1 = " {\n"
            r2 = 1
            r3 = 0
            if (r11 == 0) goto L5b
            com.bumptech.glide.repackaged.com.squareup.javapoet.d r12 = r9.d     // Catch: java.lang.Throwable -> L38
            r10.h(r12)     // Catch: java.lang.Throwable -> L38
            java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.a> r12 = r9.e     // Catch: java.lang.Throwable -> L38
            r10.e(r12, r3)     // Catch: java.lang.Throwable -> L38
            java.lang.String r12 = "$L"
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L38
            r4[r3] = r11     // Catch: java.lang.Throwable -> L38
            r10.c(r12, r4)     // Catch: java.lang.Throwable -> L38
            com.bumptech.glide.repackaged.com.squareup.javapoet.d r12 = r9.c     // Catch: java.lang.Throwable -> L38
            java.util.List<java.lang.String> r12 = r12.a     // Catch: java.lang.Throwable -> L38
            boolean r12 = r12.isEmpty()     // Catch: java.lang.Throwable -> L38
            if (r12 != 0) goto L3b
            java.lang.String r12 = "("
            r10.b(r12)     // Catch: java.lang.Throwable -> L38
            com.bumptech.glide.repackaged.com.squareup.javapoet.d r12 = r9.c     // Catch: java.lang.Throwable -> L38
            r10.a(r12)     // Catch: java.lang.Throwable -> L38
            java.lang.String r12 = ")"
            r10.b(r12)     // Catch: java.lang.Throwable -> L38
            goto L3b
        L38:
            r11 = move-exception
            goto L2c7
        L3b:
            java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.f> r12 = r9.k     // Catch: java.lang.Throwable -> L38
            boolean r12 = r12.isEmpty()     // Catch: java.lang.Throwable -> L38
            if (r12 == 0) goto L56
            java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.i> r12 = r9.f480n     // Catch: java.lang.Throwable -> L38
            boolean r12 = r12.isEmpty()     // Catch: java.lang.Throwable -> L38
            if (r12 == 0) goto L56
            java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec> r12 = r9.f481o     // Catch: java.lang.Throwable -> L38
            boolean r12 = r12.isEmpty()     // Catch: java.lang.Throwable -> L38
            if (r12 == 0) goto L56
            r10.f495n = r0
            return
        L56:
            r10.b(r1)     // Catch: java.lang.Throwable -> L38
            goto L157
        L5b:
            com.bumptech.glide.repackaged.com.squareup.javapoet.d r4 = r9.c     // Catch: java.lang.Throwable -> L38
            if (r4 == 0) goto L87
            java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.l> r12 = r9.i     // Catch: java.lang.Throwable -> L38
            boolean r12 = r12.isEmpty()     // Catch: java.lang.Throwable -> L38
            if (r12 != 0) goto L70
            java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.l> r12 = r9.i     // Catch: java.lang.Throwable -> L38
            java.lang.Object r12 = r12.get(r3)     // Catch: java.lang.Throwable -> L38
            com.bumptech.glide.repackaged.com.squareup.javapoet.l r12 = (com.bumptech.glide.repackaged.com.squareup.javapoet.l) r12     // Catch: java.lang.Throwable -> L38
            goto L72
        L70:
            com.bumptech.glide.repackaged.com.squareup.javapoet.l r12 = r9.h     // Catch: java.lang.Throwable -> L38
        L72:
            java.lang.String r1 = "new $T("
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L38
            r4[r3] = r12     // Catch: java.lang.Throwable -> L38
            r10.c(r1, r4)     // Catch: java.lang.Throwable -> L38
            com.bumptech.glide.repackaged.com.squareup.javapoet.d r12 = r9.c     // Catch: java.lang.Throwable -> L38
            r10.a(r12)     // Catch: java.lang.Throwable -> L38
            java.lang.String r12 = ") {\n"
            r10.b(r12)     // Catch: java.lang.Throwable -> L38
            goto L157
        L87:
            com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec r4 = new com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec     // Catch: java.lang.Throwable -> L38
            r4.<init>(r9)     // Catch: java.lang.Throwable -> L38
            r10.x(r4)     // Catch: java.lang.Throwable -> L38
            com.bumptech.glide.repackaged.com.squareup.javapoet.d r4 = r9.d     // Catch: java.lang.Throwable -> L38
            r10.h(r4)     // Catch: java.lang.Throwable -> L38
            java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.a> r4 = r9.e     // Catch: java.lang.Throwable -> L38
            r10.e(r4, r3)     // Catch: java.lang.Throwable -> L38
            java.util.Set<javax.lang.model.element.Modifier> r4 = r9.f     // Catch: java.lang.Throwable -> L38
            com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec$Kind r5 = r9.a     // Catch: java.lang.Throwable -> L38
            java.util.Set r5 = com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec.Kind.access$1700(r5)     // Catch: java.lang.Throwable -> L38
            java.util.Set r12 = com.bumptech.glide.repackaged.com.squareup.javapoet.n.m(r12, r5)     // Catch: java.lang.Throwable -> L38
            r10.k(r4, r12)     // Catch: java.lang.Throwable -> L38
            com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec$Kind r12 = r9.a     // Catch: java.lang.Throwable -> L38
            com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec$Kind r4 = com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec.Kind.ANNOTATION     // Catch: java.lang.Throwable -> L38
            r5 = 2
            java.lang.String r6 = "$L $L"
            if (r12 != r4) goto Lbf
            java.lang.String r12 = r9.b     // Catch: java.lang.Throwable -> L38
            java.lang.Object[] r4 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L38
            java.lang.String r5 = "@interface"
            r4[r3] = r5     // Catch: java.lang.Throwable -> L38
            r4[r2] = r12     // Catch: java.lang.Throwable -> L38
            r10.c(r6, r4)     // Catch: java.lang.Throwable -> L38
            goto Ld4
        Lbf:
            java.lang.String r12 = r12.name()     // Catch: java.lang.Throwable -> L38
            java.util.Locale r4 = java.util.Locale.US     // Catch: java.lang.Throwable -> L38
            java.lang.String r12 = r12.toLowerCase(r4)     // Catch: java.lang.Throwable -> L38
            java.lang.String r4 = r9.b     // Catch: java.lang.Throwable -> L38
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L38
            r5[r3] = r12     // Catch: java.lang.Throwable -> L38
            r5[r2] = r4     // Catch: java.lang.Throwable -> L38
            r10.c(r6, r5)     // Catch: java.lang.Throwable -> L38
        Ld4:
            java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.m> r12 = r9.g     // Catch: java.lang.Throwable -> L38
            r10.m(r12)     // Catch: java.lang.Throwable -> L38
            com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec$Kind r12 = r9.a     // Catch: java.lang.Throwable -> L38
            com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec$Kind r4 = com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec.Kind.INTERFACE     // Catch: java.lang.Throwable -> L38
            if (r12 != r4) goto Le4
            java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.l> r12 = r9.i     // Catch: java.lang.Throwable -> L38
            java.util.List r4 = java.util.Collections.EMPTY_LIST     // Catch: java.lang.Throwable -> L38
            goto Lf9
        Le4:
            com.bumptech.glide.repackaged.com.squareup.javapoet.l r12 = r9.h     // Catch: java.lang.Throwable -> L38
            com.bumptech.glide.repackaged.com.squareup.javapoet.c r4 = com.bumptech.glide.repackaged.com.squareup.javapoet.c.f489y     // Catch: java.lang.Throwable -> L38
            boolean r12 = r12.equals(r4)     // Catch: java.lang.Throwable -> L38
            if (r12 == 0) goto Lf1
            java.util.List r12 = java.util.Collections.EMPTY_LIST     // Catch: java.lang.Throwable -> L38
            goto Lf7
        Lf1:
            com.bumptech.glide.repackaged.com.squareup.javapoet.l r12 = r9.h     // Catch: java.lang.Throwable -> L38
            java.util.List r12 = java.util.Collections.singletonList(r12)     // Catch: java.lang.Throwable -> L38
        Lf7:
            java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.l> r4 = r9.i     // Catch: java.lang.Throwable -> L38
        Lf9:
            boolean r5 = r12.isEmpty()     // Catch: java.lang.Throwable -> L38
            java.lang.String r6 = " $T"
            java.lang.String r7 = ","
            if (r5 != 0) goto L127
            java.lang.String r5 = " extends"
            r10.b(r5)     // Catch: java.lang.Throwable -> L38
            java.util.Iterator r12 = r12.iterator()     // Catch: java.lang.Throwable -> L38
            r5 = 1
        L10d:
            boolean r8 = r12.hasNext()     // Catch: java.lang.Throwable -> L38
            if (r8 == 0) goto L127
            java.lang.Object r8 = r12.next()     // Catch: java.lang.Throwable -> L38
            com.bumptech.glide.repackaged.com.squareup.javapoet.l r8 = (com.bumptech.glide.repackaged.com.squareup.javapoet.l) r8     // Catch: java.lang.Throwable -> L38
            if (r5 != 0) goto L11e
            r10.b(r7)     // Catch: java.lang.Throwable -> L38
        L11e:
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L38
            r5[r3] = r8     // Catch: java.lang.Throwable -> L38
            r10.c(r6, r5)     // Catch: java.lang.Throwable -> L38
            r5 = 0
            goto L10d
        L127:
            boolean r12 = r4.isEmpty()     // Catch: java.lang.Throwable -> L38
            if (r12 != 0) goto L151
            java.lang.String r12 = " implements"
            r10.b(r12)     // Catch: java.lang.Throwable -> L38
            java.util.Iterator r12 = r4.iterator()     // Catch: java.lang.Throwable -> L38
            r4 = 1
        L137:
            boolean r5 = r12.hasNext()     // Catch: java.lang.Throwable -> L38
            if (r5 == 0) goto L151
            java.lang.Object r5 = r12.next()     // Catch: java.lang.Throwable -> L38
            com.bumptech.glide.repackaged.com.squareup.javapoet.l r5 = (com.bumptech.glide.repackaged.com.squareup.javapoet.l) r5     // Catch: java.lang.Throwable -> L38
            if (r4 != 0) goto L148
            r10.b(r7)     // Catch: java.lang.Throwable -> L38
        L148:
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L38
            r4[r3] = r5     // Catch: java.lang.Throwable -> L38
            r10.c(r6, r4)     // Catch: java.lang.Throwable -> L38
            r4 = 0
            goto L137
        L151:
            r10.v()     // Catch: java.lang.Throwable -> L38
            r10.b(r1)     // Catch: java.lang.Throwable -> L38
        L157:
            r10.x(r9)     // Catch: java.lang.Throwable -> L38
            r10.r()     // Catch: java.lang.Throwable -> L38
            java.util.Map<java.lang.String, com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec> r12 = r9.j     // Catch: java.lang.Throwable -> L38
            java.util.Set r12 = r12.entrySet()     // Catch: java.lang.Throwable -> L38
            java.util.Iterator r12 = r12.iterator()     // Catch: java.lang.Throwable -> L38
        L167:
            boolean r1 = r12.hasNext()     // Catch: java.lang.Throwable -> L38
            java.lang.String r4 = "\n"
            if (r1 == 0) goto L1bb
            java.lang.Object r1 = r12.next()     // Catch: java.lang.Throwable -> L38
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> L38
            if (r2 != 0) goto L17a
            r10.b(r4)     // Catch: java.lang.Throwable -> L38
        L17a:
            java.lang.Object r2 = r1.getValue()     // Catch: java.lang.Throwable -> L38
            com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec r2 = (com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec) r2     // Catch: java.lang.Throwable -> L38
            java.lang.Object r1 = r1.getKey()     // Catch: java.lang.Throwable -> L38
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L38
            java.util.Set r5 = java.util.Collections.EMPTY_SET     // Catch: java.lang.Throwable -> L38
            r2.b(r10, r1, r5)     // Catch: java.lang.Throwable -> L38
            boolean r1 = r12.hasNext()     // Catch: java.lang.Throwable -> L38
            if (r1 == 0) goto L197
            java.lang.String r1 = ",\n"
            r10.b(r1)     // Catch: java.lang.Throwable -> L38
            goto L1b9
        L197:
            java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.f> r1 = r9.k     // Catch: java.lang.Throwable -> L38
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L38
            if (r1 == 0) goto L1b4
            java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.i> r1 = r9.f480n     // Catch: java.lang.Throwable -> L38
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L38
            if (r1 == 0) goto L1b4
            java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec> r1 = r9.f481o     // Catch: java.lang.Throwable -> L38
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L38
            if (r1 != 0) goto L1b0
            goto L1b4
        L1b0:
            r10.b(r4)     // Catch: java.lang.Throwable -> L38
            goto L1b9
        L1b4:
            java.lang.String r1 = ";\n"
            r10.b(r1)     // Catch: java.lang.Throwable -> L38
        L1b9:
            r2 = 0
            goto L167
        L1bb:
            java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.f> r12 = r9.k     // Catch: java.lang.Throwable -> L38
            java.util.Iterator r12 = r12.iterator()     // Catch: java.lang.Throwable -> L38
        L1c1:
            boolean r1 = r12.hasNext()     // Catch: java.lang.Throwable -> L38
            if (r1 == 0) goto L1e6
            java.lang.Object r1 = r12.next()     // Catch: java.lang.Throwable -> L38
            com.bumptech.glide.repackaged.com.squareup.javapoet.f r1 = (com.bumptech.glide.repackaged.com.squareup.javapoet.f) r1     // Catch: java.lang.Throwable -> L38
            javax.lang.model.element.Modifier r5 = javax.lang.model.element.Modifier.STATIC     // Catch: java.lang.Throwable -> L38
            boolean r5 = r1.c(r5)     // Catch: java.lang.Throwable -> L38
            if (r5 != 0) goto L1d6
            goto L1c1
        L1d6:
            if (r2 != 0) goto L1db
            r10.b(r4)     // Catch: java.lang.Throwable -> L38
        L1db:
            com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec$Kind r2 = r9.a     // Catch: java.lang.Throwable -> L38
            java.util.Set r2 = com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec.Kind.access$1800(r2)     // Catch: java.lang.Throwable -> L38
            r1.b(r10, r2)     // Catch: java.lang.Throwable -> L38
            r2 = 0
            goto L1c1
        L1e6:
            com.bumptech.glide.repackaged.com.squareup.javapoet.d r12 = r9.f478l     // Catch: java.lang.Throwable -> L38
            boolean r12 = r12.b()     // Catch: java.lang.Throwable -> L38
            if (r12 != 0) goto L1f9
            if (r2 != 0) goto L1f3
            r10.b(r4)     // Catch: java.lang.Throwable -> L38
        L1f3:
            com.bumptech.glide.repackaged.com.squareup.javapoet.d r12 = r9.f478l     // Catch: java.lang.Throwable -> L38
            r10.a(r12)     // Catch: java.lang.Throwable -> L38
            r2 = 0
        L1f9:
            java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.f> r12 = r9.k     // Catch: java.lang.Throwable -> L38
            java.util.Iterator r12 = r12.iterator()     // Catch: java.lang.Throwable -> L38
        L1ff:
            boolean r1 = r12.hasNext()     // Catch: java.lang.Throwable -> L38
            if (r1 == 0) goto L224
            java.lang.Object r1 = r12.next()     // Catch: java.lang.Throwable -> L38
            com.bumptech.glide.repackaged.com.squareup.javapoet.f r1 = (com.bumptech.glide.repackaged.com.squareup.javapoet.f) r1     // Catch: java.lang.Throwable -> L38
            javax.lang.model.element.Modifier r5 = javax.lang.model.element.Modifier.STATIC     // Catch: java.lang.Throwable -> L38
            boolean r5 = r1.c(r5)     // Catch: java.lang.Throwable -> L38
            if (r5 == 0) goto L214
            goto L1ff
        L214:
            if (r2 != 0) goto L219
            r10.b(r4)     // Catch: java.lang.Throwable -> L38
        L219:
            com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec$Kind r2 = r9.a     // Catch: java.lang.Throwable -> L38
            java.util.Set r2 = com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec.Kind.access$1800(r2)     // Catch: java.lang.Throwable -> L38
            r1.b(r10, r2)     // Catch: java.lang.Throwable -> L38
            r2 = 0
            goto L1ff
        L224:
            com.bumptech.glide.repackaged.com.squareup.javapoet.d r12 = r9.f479m     // Catch: java.lang.Throwable -> L38
            boolean r12 = r12.b()     // Catch: java.lang.Throwable -> L38
            if (r12 != 0) goto L237
            if (r2 != 0) goto L231
            r10.b(r4)     // Catch: java.lang.Throwable -> L38
        L231:
            com.bumptech.glide.repackaged.com.squareup.javapoet.d r12 = r9.f479m     // Catch: java.lang.Throwable -> L38
            r10.a(r12)     // Catch: java.lang.Throwable -> L38
            r2 = 0
        L237:
            java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.i> r12 = r9.f480n     // Catch: java.lang.Throwable -> L38
            java.util.Iterator r12 = r12.iterator()     // Catch: java.lang.Throwable -> L38
        L23d:
            boolean r1 = r12.hasNext()     // Catch: java.lang.Throwable -> L38
            if (r1 == 0) goto L262
            java.lang.Object r1 = r12.next()     // Catch: java.lang.Throwable -> L38
            com.bumptech.glide.repackaged.com.squareup.javapoet.i r1 = (com.bumptech.glide.repackaged.com.squareup.javapoet.i) r1     // Catch: java.lang.Throwable -> L38
            boolean r5 = r1.d()     // Catch: java.lang.Throwable -> L38
            if (r5 != 0) goto L250
            goto L23d
        L250:
            if (r2 != 0) goto L255
            r10.b(r4)     // Catch: java.lang.Throwable -> L38
        L255:
            java.lang.String r2 = r9.b     // Catch: java.lang.Throwable -> L38
            com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec$Kind r5 = r9.a     // Catch: java.lang.Throwable -> L38
            java.util.Set r5 = com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec.Kind.access$1900(r5)     // Catch: java.lang.Throwable -> L38
            r1.b(r10, r2, r5)     // Catch: java.lang.Throwable -> L38
            r2 = 0
            goto L23d
        L262:
            java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.i> r12 = r9.f480n     // Catch: java.lang.Throwable -> L38
            java.util.Iterator r12 = r12.iterator()     // Catch: java.lang.Throwable -> L38
        L268:
            boolean r1 = r12.hasNext()     // Catch: java.lang.Throwable -> L38
            if (r1 == 0) goto L28d
            java.lang.Object r1 = r12.next()     // Catch: java.lang.Throwable -> L38
            com.bumptech.glide.repackaged.com.squareup.javapoet.i r1 = (com.bumptech.glide.repackaged.com.squareup.javapoet.i) r1     // Catch: java.lang.Throwable -> L38
            boolean r5 = r1.d()     // Catch: java.lang.Throwable -> L38
            if (r5 == 0) goto L27b
            goto L268
        L27b:
            if (r2 != 0) goto L280
            r10.b(r4)     // Catch: java.lang.Throwable -> L38
        L280:
            java.lang.String r2 = r9.b     // Catch: java.lang.Throwable -> L38
            com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec$Kind r5 = r9.a     // Catch: java.lang.Throwable -> L38
            java.util.Set r5 = com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec.Kind.access$1900(r5)     // Catch: java.lang.Throwable -> L38
            r1.b(r10, r2, r5)     // Catch: java.lang.Throwable -> L38
            r2 = 0
            goto L268
        L28d:
            java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec> r12 = r9.f481o     // Catch: java.lang.Throwable -> L38
            java.util.Iterator r12 = r12.iterator()     // Catch: java.lang.Throwable -> L38
        L293:
            boolean r1 = r12.hasNext()     // Catch: java.lang.Throwable -> L38
            if (r1 == 0) goto L2b0
            java.lang.Object r1 = r12.next()     // Catch: java.lang.Throwable -> L38
            com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec r1 = (com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec) r1     // Catch: java.lang.Throwable -> L38
            if (r2 != 0) goto L2a4
            r10.b(r4)     // Catch: java.lang.Throwable -> L38
        L2a4:
            com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec$Kind r2 = r9.a     // Catch: java.lang.Throwable -> L38
            java.util.Set r2 = com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec.Kind.access$2000(r2)     // Catch: java.lang.Throwable -> L38
            r5 = 0
            r1.b(r10, r5, r2)     // Catch: java.lang.Throwable -> L38
            r2 = 0
            goto L293
        L2b0:
            r10.B()     // Catch: java.lang.Throwable -> L38
            r10.v()     // Catch: java.lang.Throwable -> L38
            java.lang.String r12 = "}"
            r10.b(r12)     // Catch: java.lang.Throwable -> L38
            if (r11 != 0) goto L2c4
            com.bumptech.glide.repackaged.com.squareup.javapoet.d r11 = r9.c     // Catch: java.lang.Throwable -> L38
            if (r11 != 0) goto L2c4
            r10.b(r4)     // Catch: java.lang.Throwable -> L38
        L2c4:
            r10.f495n = r0
            return
        L2c7:
            r10.f495n = r0
            throw r11
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            if (r3 != r4) goto L4
            r4 = 1
            return r4
        L4:
            r0 = 0
            if (r4 != 0) goto L8
            return r0
        L8:
            java.lang.Class<com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec> r1 = com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec.class
            java.lang.Class r2 = r4.getClass()
            if (r1 == r2) goto L11
            return r0
        L11:
            java.lang.String r0 = r3.toString()
            java.lang.String r4 = r4.toString()
            boolean r4 = r0.equals(r4)
            return r4
    }

    public int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.toString()
            int r0 = r0.hashCode()
            return r0
    }

    public java.lang.String toString() {
            r4 = this;
            java.io.StringWriter r0 = new java.io.StringWriter
            r0.<init>()
            com.bumptech.glide.repackaged.com.squareup.javapoet.e r1 = new com.bumptech.glide.repackaged.com.squareup.javapoet.e     // Catch: java.io.IOException -> L15
            r1.<init>(r0)     // Catch: java.io.IOException -> L15
            java.util.Set r2 = java.util.Collections.EMPTY_SET     // Catch: java.io.IOException -> L15
            r3 = 0
            r4.b(r1, r3, r2)     // Catch: java.io.IOException -> L15
            java.lang.String r0 = r0.toString()     // Catch: java.io.IOException -> L15
            return r0
        L15:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
    }
}

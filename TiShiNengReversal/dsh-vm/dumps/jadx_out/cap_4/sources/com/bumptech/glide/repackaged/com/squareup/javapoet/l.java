package com.bumptech.glide.repackaged.com.squareup.javapoet;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class l {
    public static final com.bumptech.glide.repackaged.com.squareup.javapoet.l d = null;
    public static final com.bumptech.glide.repackaged.com.squareup.javapoet.l e = null;
    public static final com.bumptech.glide.repackaged.com.squareup.javapoet.l f = null;
    public static final com.bumptech.glide.repackaged.com.squareup.javapoet.l g = null;
    public static final com.bumptech.glide.repackaged.com.squareup.javapoet.l h = null;
    public static final com.bumptech.glide.repackaged.com.squareup.javapoet.l i = null;
    public static final com.bumptech.glide.repackaged.com.squareup.javapoet.l j = null;
    public static final com.bumptech.glide.repackaged.com.squareup.javapoet.l k = null;

    /* renamed from: l, reason: collision with root package name */
    public static final com.bumptech.glide.repackaged.com.squareup.javapoet.l f499l = null;

    /* renamed from: m, reason: collision with root package name */
    public static final com.bumptech.glide.repackaged.com.squareup.javapoet.c f500m = null;

    /* renamed from: n, reason: collision with root package name */
    private static final com.bumptech.glide.repackaged.com.squareup.javapoet.c f501n = null;

    /* renamed from: o, reason: collision with root package name */
    private static final com.bumptech.glide.repackaged.com.squareup.javapoet.c f502o = null;

    /* renamed from: p, reason: collision with root package name */
    private static final com.bumptech.glide.repackaged.com.squareup.javapoet.c f503p = null;

    /* renamed from: q, reason: collision with root package name */
    private static final com.bumptech.glide.repackaged.com.squareup.javapoet.c f504q = null;

    /* renamed from: r, reason: collision with root package name */
    private static final com.bumptech.glide.repackaged.com.squareup.javapoet.c f505r = null;

    /* renamed from: s, reason: collision with root package name */
    private static final com.bumptech.glide.repackaged.com.squareup.javapoet.c f506s = null;

    /* renamed from: t, reason: collision with root package name */
    private static final com.bumptech.glide.repackaged.com.squareup.javapoet.c f507t = null;

    /* renamed from: u, reason: collision with root package name */
    private static final com.bumptech.glide.repackaged.com.squareup.javapoet.c f508u = null;

    /* renamed from: v, reason: collision with root package name */
    private static final com.bumptech.glide.repackaged.com.squareup.javapoet.c f509v = null;
    private final java.lang.String a;
    public final java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.a> b;
    private java.lang.String c;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class a extends javax.lang.model.util.SimpleTypeVisitor7<com.bumptech.glide.repackaged.com.squareup.javapoet.l, java.lang.Void> {
        final /* synthetic */ java.util.Map a;

        a(java.util.Map r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        protected com.bumptech.glide.repackaged.com.squareup.javapoet.l a(javax.lang.model.type.TypeMirror r3, java.lang.Void r4) {
                r2 = this;
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Unexpected type mirror: "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                r4.<init>(r3)
                throw r4
        }

        protected /* bridge */ /* synthetic */ java.lang.Object b(javax.lang.model.type.TypeMirror r1, java.lang.Object r2) {
                r0 = this;
                java.lang.Void r2 = (java.lang.Void) r2
                com.bumptech.glide.repackaged.com.squareup.javapoet.l r1 = r0.a(r1, r2)
                return r1
        }

        public com.bumptech.glide.repackaged.com.squareup.javapoet.b c(javax.lang.model.type.ArrayType r1, java.lang.Void r2) {
                r0 = this;
                java.util.Map r2 = r0.a
                com.bumptech.glide.repackaged.com.squareup.javapoet.b r1 = com.bumptech.glide.repackaged.com.squareup.javapoet.b.u(r1, r2)
                return r1
        }

        public /* bridge */ /* synthetic */ java.lang.Object d(javax.lang.model.type.ArrayType r1, java.lang.Object r2) {
                r0 = this;
                java.lang.Void r2 = (java.lang.Void) r2
                com.bumptech.glide.repackaged.com.squareup.javapoet.b r1 = r0.c(r1, r2)
                return r1
        }

        public com.bumptech.glide.repackaged.com.squareup.javapoet.l e(javax.lang.model.type.DeclaredType r6, java.lang.Void r7) {
                r5 = this;
                javax.lang.model.element.Element r7 = r6.asElement()
                javax.lang.model.element.TypeElement r7 = (javax.lang.model.element.TypeElement) r7
                com.bumptech.glide.repackaged.com.squareup.javapoet.c r7 = com.bumptech.glide.repackaged.com.squareup.javapoet.c.y(r7)
                javax.lang.model.type.TypeMirror r0 = r6.getEnclosingType()
                javax.lang.model.type.TypeKind r1 = r0.getKind()
                javax.lang.model.type.TypeKind r2 = javax.lang.model.type.TypeKind.NONE
                r3 = 0
                if (r1 == r2) goto L2e
                javax.lang.model.element.Element r1 = r6.asElement()
                java.util.Set r1 = r1.getModifiers()
                javax.lang.model.element.Modifier r2 = javax.lang.model.element.Modifier.STATIC
                boolean r1 = r1.contains(r2)
                if (r1 != 0) goto L2e
                java.lang.Object r0 = r0.accept(r5, r3)
                com.bumptech.glide.repackaged.com.squareup.javapoet.l r0 = (com.bumptech.glide.repackaged.com.squareup.javapoet.l) r0
                goto L2f
            L2e:
                r0 = r3
            L2f:
                java.util.List r1 = r6.getTypeArguments()
                boolean r1 = r1.isEmpty()
                if (r1 == 0) goto L3e
                boolean r1 = r0 instanceof com.bumptech.glide.repackaged.com.squareup.javapoet.k
                if (r1 != 0) goto L3e
                return r7
            L3e:
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                java.util.List r6 = r6.getTypeArguments()
                java.util.Iterator r6 = r6.iterator()
            L4b:
                boolean r2 = r6.hasNext()
                if (r2 == 0) goto L61
                java.lang.Object r2 = r6.next()
                javax.lang.model.type.TypeMirror r2 = (javax.lang.model.type.TypeMirror) r2
                java.util.Map r4 = r5.a
                com.bumptech.glide.repackaged.com.squareup.javapoet.l r2 = com.bumptech.glide.repackaged.com.squareup.javapoet.l.m(r2, r4)
                r1.add(r2)
                goto L4b
            L61:
                boolean r6 = r0 instanceof com.bumptech.glide.repackaged.com.squareup.javapoet.k
                if (r6 == 0) goto L70
                com.bumptech.glide.repackaged.com.squareup.javapoet.k r0 = (com.bumptech.glide.repackaged.com.squareup.javapoet.k) r0
                java.lang.String r6 = r7.I()
                com.bumptech.glide.repackaged.com.squareup.javapoet.k r6 = r0.v(r6, r1)
                return r6
            L70:
                com.bumptech.glide.repackaged.com.squareup.javapoet.k r6 = new com.bumptech.glide.repackaged.com.squareup.javapoet.k
                r6.<init>(r3, r7, r1)
                return r6
        }

        public /* bridge */ /* synthetic */ java.lang.Object f(javax.lang.model.type.DeclaredType r1, java.lang.Object r2) {
                r0 = this;
                java.lang.Void r2 = (java.lang.Void) r2
                com.bumptech.glide.repackaged.com.squareup.javapoet.l r1 = r0.e(r1, r2)
                return r1
        }

        public com.bumptech.glide.repackaged.com.squareup.javapoet.l g(javax.lang.model.type.ErrorType r1, java.lang.Void r2) {
                r0 = this;
                com.bumptech.glide.repackaged.com.squareup.javapoet.l r1 = r0.e(r1, r2)
                return r1
        }

        public /* bridge */ /* synthetic */ java.lang.Object h(javax.lang.model.type.ErrorType r1, java.lang.Object r2) {
                r0 = this;
                java.lang.Void r2 = (java.lang.Void) r2
                com.bumptech.glide.repackaged.com.squareup.javapoet.l r1 = r0.g(r1, r2)
                return r1
        }

        public com.bumptech.glide.repackaged.com.squareup.javapoet.l i(javax.lang.model.type.NoType r3, java.lang.Void r4) {
                r2 = this;
                javax.lang.model.type.TypeKind r0 = r3.getKind()
                javax.lang.model.type.TypeKind r1 = javax.lang.model.type.TypeKind.VOID
                if (r0 != r1) goto Lb
                com.bumptech.glide.repackaged.com.squareup.javapoet.l r3 = com.bumptech.glide.repackaged.com.squareup.javapoet.l.d
                return r3
            Lb:
                java.lang.Object r3 = super.visitUnknown(r3, r4)
                com.bumptech.glide.repackaged.com.squareup.javapoet.l r3 = (com.bumptech.glide.repackaged.com.squareup.javapoet.l) r3
                return r3
        }

        public /* bridge */ /* synthetic */ java.lang.Object j(javax.lang.model.type.NoType r1, java.lang.Object r2) {
                r0 = this;
                java.lang.Void r2 = (java.lang.Void) r2
                com.bumptech.glide.repackaged.com.squareup.javapoet.l r1 = r0.i(r1, r2)
                return r1
        }

        public com.bumptech.glide.repackaged.com.squareup.javapoet.l k(javax.lang.model.type.PrimitiveType r1, java.lang.Void r2) {
                r0 = this;
                int[] r2 = com.bumptech.glide.repackaged.com.squareup.javapoet.l.b.a
                javax.lang.model.type.TypeKind r1 = r1.getKind()
                int r1 = r1.ordinal()
                r1 = r2[r1]
                switch(r1) {
                    case 1: goto L2a;
                    case 2: goto L27;
                    case 3: goto L24;
                    case 4: goto L21;
                    case 5: goto L1e;
                    case 6: goto L1b;
                    case 7: goto L18;
                    case 8: goto L15;
                    default: goto Lf;
                }
            Lf:
                java.lang.AssertionError r1 = new java.lang.AssertionError
                r1.<init>()
                throw r1
            L15:
                com.bumptech.glide.repackaged.com.squareup.javapoet.l r1 = com.bumptech.glide.repackaged.com.squareup.javapoet.l.f499l
                return r1
            L18:
                com.bumptech.glide.repackaged.com.squareup.javapoet.l r1 = com.bumptech.glide.repackaged.com.squareup.javapoet.l.k
                return r1
            L1b:
                com.bumptech.glide.repackaged.com.squareup.javapoet.l r1 = com.bumptech.glide.repackaged.com.squareup.javapoet.l.j
                return r1
            L1e:
                com.bumptech.glide.repackaged.com.squareup.javapoet.l r1 = com.bumptech.glide.repackaged.com.squareup.javapoet.l.i
                return r1
            L21:
                com.bumptech.glide.repackaged.com.squareup.javapoet.l r1 = com.bumptech.glide.repackaged.com.squareup.javapoet.l.h
                return r1
            L24:
                com.bumptech.glide.repackaged.com.squareup.javapoet.l r1 = com.bumptech.glide.repackaged.com.squareup.javapoet.l.g
                return r1
            L27:
                com.bumptech.glide.repackaged.com.squareup.javapoet.l r1 = com.bumptech.glide.repackaged.com.squareup.javapoet.l.f
                return r1
            L2a:
                com.bumptech.glide.repackaged.com.squareup.javapoet.l r1 = com.bumptech.glide.repackaged.com.squareup.javapoet.l.e
                return r1
        }

        public /* bridge */ /* synthetic */ java.lang.Object l(javax.lang.model.type.PrimitiveType r1, java.lang.Object r2) {
                r0 = this;
                java.lang.Void r2 = (java.lang.Void) r2
                com.bumptech.glide.repackaged.com.squareup.javapoet.l r1 = r0.k(r1, r2)
                return r1
        }

        public com.bumptech.glide.repackaged.com.squareup.javapoet.l m(javax.lang.model.type.TypeVariable r1, java.lang.Void r2) {
                r0 = this;
                java.util.Map r2 = r0.a
                com.bumptech.glide.repackaged.com.squareup.javapoet.m r1 = com.bumptech.glide.repackaged.com.squareup.javapoet.m.x(r1, r2)
                return r1
        }

        public /* bridge */ /* synthetic */ java.lang.Object n(javax.lang.model.type.TypeVariable r1, java.lang.Object r2) {
                r0 = this;
                java.lang.Void r2 = (java.lang.Void) r2
                com.bumptech.glide.repackaged.com.squareup.javapoet.l r1 = r0.m(r1, r2)
                return r1
        }

        public com.bumptech.glide.repackaged.com.squareup.javapoet.l o(javax.lang.model.type.WildcardType r1, java.lang.Void r2) {
                r0 = this;
                java.util.Map r2 = r0.a
                com.bumptech.glide.repackaged.com.squareup.javapoet.l r1 = com.bumptech.glide.repackaged.com.squareup.javapoet.o.u(r1, r2)
                return r1
        }

        public /* bridge */ /* synthetic */ java.lang.Object p(javax.lang.model.type.WildcardType r1, java.lang.Object r2) {
                r0 = this;
                java.lang.Void r2 = (java.lang.Void) r2
                com.bumptech.glide.repackaged.com.squareup.javapoet.l r1 = r0.o(r1, r2)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static /* synthetic */ class b {
        static final /* synthetic */ int[] a = null;

        static {
                javax.lang.model.type.TypeKind[] r0 = javax.lang.model.type.TypeKind.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.bumptech.glide.repackaged.com.squareup.javapoet.l.b.a = r0
                javax.lang.model.type.TypeKind r1 = javax.lang.model.type.TypeKind.BOOLEAN     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.bumptech.glide.repackaged.com.squareup.javapoet.l.b.a     // Catch: java.lang.NoSuchFieldError -> L1d
                javax.lang.model.type.TypeKind r1 = javax.lang.model.type.TypeKind.BYTE     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.bumptech.glide.repackaged.com.squareup.javapoet.l.b.a     // Catch: java.lang.NoSuchFieldError -> L28
                javax.lang.model.type.TypeKind r1 = javax.lang.model.type.TypeKind.SHORT     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = com.bumptech.glide.repackaged.com.squareup.javapoet.l.b.a     // Catch: java.lang.NoSuchFieldError -> L33
                javax.lang.model.type.TypeKind r1 = javax.lang.model.type.TypeKind.INT     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = com.bumptech.glide.repackaged.com.squareup.javapoet.l.b.a     // Catch: java.lang.NoSuchFieldError -> L3e
                javax.lang.model.type.TypeKind r1 = javax.lang.model.type.TypeKind.LONG     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                int[] r0 = com.bumptech.glide.repackaged.com.squareup.javapoet.l.b.a     // Catch: java.lang.NoSuchFieldError -> L49
                javax.lang.model.type.TypeKind r1 = javax.lang.model.type.TypeKind.CHAR     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
            L49:
                int[] r0 = com.bumptech.glide.repackaged.com.squareup.javapoet.l.b.a     // Catch: java.lang.NoSuchFieldError -> L54
                javax.lang.model.type.TypeKind r1 = javax.lang.model.type.TypeKind.FLOAT     // Catch: java.lang.NoSuchFieldError -> L54
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L54
                r2 = 7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L54
            L54:
                int[] r0 = com.bumptech.glide.repackaged.com.squareup.javapoet.l.b.a     // Catch: java.lang.NoSuchFieldError -> L60
                javax.lang.model.type.TypeKind r1 = javax.lang.model.type.TypeKind.DOUBLE     // Catch: java.lang.NoSuchFieldError -> L60
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L60
                r2 = 8
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L60
            L60:
                return
        }

        public b() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    static {
            com.bumptech.glide.repackaged.com.squareup.javapoet.l r0 = new com.bumptech.glide.repackaged.com.squareup.javapoet.l
            java.lang.String r1 = "void"
            r0.<init>(r1)
            com.bumptech.glide.repackaged.com.squareup.javapoet.l.d = r0
            com.bumptech.glide.repackaged.com.squareup.javapoet.l r0 = new com.bumptech.glide.repackaged.com.squareup.javapoet.l
            java.lang.String r1 = "boolean"
            r0.<init>(r1)
            com.bumptech.glide.repackaged.com.squareup.javapoet.l.e = r0
            com.bumptech.glide.repackaged.com.squareup.javapoet.l r0 = new com.bumptech.glide.repackaged.com.squareup.javapoet.l
            java.lang.String r1 = "byte"
            r0.<init>(r1)
            com.bumptech.glide.repackaged.com.squareup.javapoet.l.f = r0
            com.bumptech.glide.repackaged.com.squareup.javapoet.l r0 = new com.bumptech.glide.repackaged.com.squareup.javapoet.l
            java.lang.String r1 = "short"
            r0.<init>(r1)
            com.bumptech.glide.repackaged.com.squareup.javapoet.l.g = r0
            com.bumptech.glide.repackaged.com.squareup.javapoet.l r0 = new com.bumptech.glide.repackaged.com.squareup.javapoet.l
            java.lang.String r1 = "int"
            r0.<init>(r1)
            com.bumptech.glide.repackaged.com.squareup.javapoet.l.h = r0
            com.bumptech.glide.repackaged.com.squareup.javapoet.l r0 = new com.bumptech.glide.repackaged.com.squareup.javapoet.l
            java.lang.String r1 = "long"
            r0.<init>(r1)
            com.bumptech.glide.repackaged.com.squareup.javapoet.l.i = r0
            com.bumptech.glide.repackaged.com.squareup.javapoet.l r0 = new com.bumptech.glide.repackaged.com.squareup.javapoet.l
            java.lang.String r1 = "char"
            r0.<init>(r1)
            com.bumptech.glide.repackaged.com.squareup.javapoet.l.j = r0
            com.bumptech.glide.repackaged.com.squareup.javapoet.l r0 = new com.bumptech.glide.repackaged.com.squareup.javapoet.l
            java.lang.String r1 = "float"
            r0.<init>(r1)
            com.bumptech.glide.repackaged.com.squareup.javapoet.l.k = r0
            com.bumptech.glide.repackaged.com.squareup.javapoet.l r0 = new com.bumptech.glide.repackaged.com.squareup.javapoet.l
            java.lang.String r1 = "double"
            r0.<init>(r1)
            com.bumptech.glide.repackaged.com.squareup.javapoet.l.f499l = r0
            r0 = 0
            java.lang.String[] r1 = new java.lang.String[r0]
            java.lang.String r2 = "java.lang"
            java.lang.String r3 = "Object"
            com.bumptech.glide.repackaged.com.squareup.javapoet.c r1 = com.bumptech.glide.repackaged.com.squareup.javapoet.c.x(r2, r3, r1)
            com.bumptech.glide.repackaged.com.squareup.javapoet.l.f500m = r1
            java.lang.String r1 = "Void"
            java.lang.String[] r3 = new java.lang.String[r0]
            com.bumptech.glide.repackaged.com.squareup.javapoet.c r1 = com.bumptech.glide.repackaged.com.squareup.javapoet.c.x(r2, r1, r3)
            com.bumptech.glide.repackaged.com.squareup.javapoet.l.f501n = r1
            java.lang.String r1 = "Boolean"
            java.lang.String[] r3 = new java.lang.String[r0]
            com.bumptech.glide.repackaged.com.squareup.javapoet.c r1 = com.bumptech.glide.repackaged.com.squareup.javapoet.c.x(r2, r1, r3)
            com.bumptech.glide.repackaged.com.squareup.javapoet.l.f502o = r1
            java.lang.String r1 = "Byte"
            java.lang.String[] r3 = new java.lang.String[r0]
            com.bumptech.glide.repackaged.com.squareup.javapoet.c r1 = com.bumptech.glide.repackaged.com.squareup.javapoet.c.x(r2, r1, r3)
            com.bumptech.glide.repackaged.com.squareup.javapoet.l.f503p = r1
            java.lang.String r1 = "Short"
            java.lang.String[] r3 = new java.lang.String[r0]
            com.bumptech.glide.repackaged.com.squareup.javapoet.c r1 = com.bumptech.glide.repackaged.com.squareup.javapoet.c.x(r2, r1, r3)
            com.bumptech.glide.repackaged.com.squareup.javapoet.l.f504q = r1
            java.lang.String r1 = "Integer"
            java.lang.String[] r3 = new java.lang.String[r0]
            com.bumptech.glide.repackaged.com.squareup.javapoet.c r1 = com.bumptech.glide.repackaged.com.squareup.javapoet.c.x(r2, r1, r3)
            com.bumptech.glide.repackaged.com.squareup.javapoet.l.f505r = r1
            java.lang.String r1 = "Long"
            java.lang.String[] r3 = new java.lang.String[r0]
            com.bumptech.glide.repackaged.com.squareup.javapoet.c r1 = com.bumptech.glide.repackaged.com.squareup.javapoet.c.x(r2, r1, r3)
            com.bumptech.glide.repackaged.com.squareup.javapoet.l.f506s = r1
            java.lang.String r1 = "Character"
            java.lang.String[] r3 = new java.lang.String[r0]
            com.bumptech.glide.repackaged.com.squareup.javapoet.c r1 = com.bumptech.glide.repackaged.com.squareup.javapoet.c.x(r2, r1, r3)
            com.bumptech.glide.repackaged.com.squareup.javapoet.l.f507t = r1
            java.lang.String r1 = "Float"
            java.lang.String[] r3 = new java.lang.String[r0]
            com.bumptech.glide.repackaged.com.squareup.javapoet.c r1 = com.bumptech.glide.repackaged.com.squareup.javapoet.c.x(r2, r1, r3)
            com.bumptech.glide.repackaged.com.squareup.javapoet.l.f508u = r1
            java.lang.String r1 = "Double"
            java.lang.String[] r0 = new java.lang.String[r0]
            com.bumptech.glide.repackaged.com.squareup.javapoet.c r0 = com.bumptech.glide.repackaged.com.squareup.javapoet.c.x(r2, r1, r0)
            com.bumptech.glide.repackaged.com.squareup.javapoet.l.f509v = r0
            return
    }

    private l(java.lang.String r2) {
            r1 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.<init>(r2, r0)
            return
    }

    private l(java.lang.String r1, java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.a> r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            java.util.List r1 = com.bumptech.glide.repackaged.com.squareup.javapoet.n.f(r2)
            r0.b = r1
            return
    }

    l(java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.a> r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r0, r2)
            return
    }

    static com.bumptech.glide.repackaged.com.squareup.javapoet.l c(com.bumptech.glide.repackaged.com.squareup.javapoet.l r1) {
            boolean r0 = r1 instanceof com.bumptech.glide.repackaged.com.squareup.javapoet.b
            if (r0 == 0) goto L9
            com.bumptech.glide.repackaged.com.squareup.javapoet.b r1 = (com.bumptech.glide.repackaged.com.squareup.javapoet.b) r1
            com.bumptech.glide.repackaged.com.squareup.javapoet.l r1 = r1.f488w
            return r1
        L9:
            r1 = 0
            return r1
    }

    public static com.bumptech.glide.repackaged.com.squareup.javapoet.l j(java.lang.reflect.Type r1) {
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            com.bumptech.glide.repackaged.com.squareup.javapoet.l r1 = k(r1, r0)
            return r1
    }

    static com.bumptech.glide.repackaged.com.squareup.javapoet.l k(java.lang.reflect.Type r2, java.util.Map<java.lang.reflect.Type, com.bumptech.glide.repackaged.com.squareup.javapoet.m> r3) {
            boolean r0 = r2 instanceof java.lang.Class
            if (r0 == 0) goto L5e
            r0 = r2
            java.lang.Class r0 = (java.lang.Class) r0
            java.lang.Class r1 = java.lang.Void.TYPE
            if (r2 != r1) goto Le
            com.bumptech.glide.repackaged.com.squareup.javapoet.l r2 = com.bumptech.glide.repackaged.com.squareup.javapoet.l.d
            return r2
        Le:
            java.lang.Class r1 = java.lang.Boolean.TYPE
            if (r2 != r1) goto L15
            com.bumptech.glide.repackaged.com.squareup.javapoet.l r2 = com.bumptech.glide.repackaged.com.squareup.javapoet.l.e
            return r2
        L15:
            java.lang.Class r1 = java.lang.Byte.TYPE
            if (r2 != r1) goto L1c
            com.bumptech.glide.repackaged.com.squareup.javapoet.l r2 = com.bumptech.glide.repackaged.com.squareup.javapoet.l.f
            return r2
        L1c:
            java.lang.Class r1 = java.lang.Short.TYPE
            if (r2 != r1) goto L23
            com.bumptech.glide.repackaged.com.squareup.javapoet.l r2 = com.bumptech.glide.repackaged.com.squareup.javapoet.l.g
            return r2
        L23:
            java.lang.Class r1 = java.lang.Integer.TYPE
            if (r2 != r1) goto L2a
            com.bumptech.glide.repackaged.com.squareup.javapoet.l r2 = com.bumptech.glide.repackaged.com.squareup.javapoet.l.h
            return r2
        L2a:
            java.lang.Class r1 = java.lang.Long.TYPE
            if (r2 != r1) goto L31
            com.bumptech.glide.repackaged.com.squareup.javapoet.l r2 = com.bumptech.glide.repackaged.com.squareup.javapoet.l.i
            return r2
        L31:
            java.lang.Class r1 = java.lang.Character.TYPE
            if (r2 != r1) goto L38
            com.bumptech.glide.repackaged.com.squareup.javapoet.l r2 = com.bumptech.glide.repackaged.com.squareup.javapoet.l.j
            return r2
        L38:
            java.lang.Class r1 = java.lang.Float.TYPE
            if (r2 != r1) goto L3f
            com.bumptech.glide.repackaged.com.squareup.javapoet.l r2 = com.bumptech.glide.repackaged.com.squareup.javapoet.l.k
            return r2
        L3f:
            java.lang.Class r1 = java.lang.Double.TYPE
            if (r2 != r1) goto L46
            com.bumptech.glide.repackaged.com.squareup.javapoet.l r2 = com.bumptech.glide.repackaged.com.squareup.javapoet.l.f499l
            return r2
        L46:
            boolean r2 = r0.isArray()
            if (r2 == 0) goto L59
            java.lang.Class r2 = r0.getComponentType()
            com.bumptech.glide.repackaged.com.squareup.javapoet.l r2 = k(r2, r3)
            com.bumptech.glide.repackaged.com.squareup.javapoet.b r2 = com.bumptech.glide.repackaged.com.squareup.javapoet.b.v(r2)
            return r2
        L59:
            com.bumptech.glide.repackaged.com.squareup.javapoet.c r2 = com.bumptech.glide.repackaged.com.squareup.javapoet.c.w(r0)
            return r2
        L5e:
            boolean r0 = r2 instanceof java.lang.reflect.ParameterizedType
            if (r0 == 0) goto L69
            java.lang.reflect.ParameterizedType r2 = (java.lang.reflect.ParameterizedType) r2
            com.bumptech.glide.repackaged.com.squareup.javapoet.k r2 = com.bumptech.glide.repackaged.com.squareup.javapoet.k.u(r2, r3)
            return r2
        L69:
            boolean r0 = r2 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto L74
            java.lang.reflect.WildcardType r2 = (java.lang.reflect.WildcardType) r2
            com.bumptech.glide.repackaged.com.squareup.javapoet.l r2 = com.bumptech.glide.repackaged.com.squareup.javapoet.o.t(r2, r3)
            return r2
        L74:
            boolean r0 = r2 instanceof java.lang.reflect.TypeVariable
            if (r0 == 0) goto L7f
            java.lang.reflect.TypeVariable r2 = (java.lang.reflect.TypeVariable) r2
            com.bumptech.glide.repackaged.com.squareup.javapoet.m r2 = com.bumptech.glide.repackaged.com.squareup.javapoet.m.u(r2, r3)
            return r2
        L7f:
            boolean r0 = r2 instanceof java.lang.reflect.GenericArrayType
            if (r0 == 0) goto L8a
            java.lang.reflect.GenericArrayType r2 = (java.lang.reflect.GenericArrayType) r2
            com.bumptech.glide.repackaged.com.squareup.javapoet.b r2 = com.bumptech.glide.repackaged.com.squareup.javapoet.b.t(r2, r3)
            return r2
        L8a:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "unexpected type: "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r3.<init>(r2)
            throw r3
    }

    public static com.bumptech.glide.repackaged.com.squareup.javapoet.l l(javax.lang.model.type.TypeMirror r1) {
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            com.bumptech.glide.repackaged.com.squareup.javapoet.l r1 = m(r1, r0)
            return r1
    }

    static com.bumptech.glide.repackaged.com.squareup.javapoet.l m(javax.lang.model.type.TypeMirror r1, java.util.Map<javax.lang.model.element.TypeParameterElement, com.bumptech.glide.repackaged.com.squareup.javapoet.m> r2) {
            com.bumptech.glide.repackaged.com.squareup.javapoet.l$a r0 = new com.bumptech.glide.repackaged.com.squareup.javapoet.l$a
            r0.<init>(r2)
            r2 = 0
            java.lang.Object r1 = r1.accept(r0, r2)
            com.bumptech.glide.repackaged.com.squareup.javapoet.l r1 = (com.bumptech.glide.repackaged.com.squareup.javapoet.l) r1
            return r1
    }

    static java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.l> q(java.lang.reflect.Type[] r4, java.util.Map<java.lang.reflect.Type, com.bumptech.glide.repackaged.com.squareup.javapoet.m> r5) {
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r4.length
            r0.<init>(r1)
            int r1 = r4.length
            r2 = 0
        L8:
            if (r2 >= r1) goto L16
            r3 = r4[r2]
            com.bumptech.glide.repackaged.com.squareup.javapoet.l r3 = k(r3, r5)
            r0.add(r3)
            int r2 = r2 + 1
            goto L8
        L16:
            return r0
    }

    public com.bumptech.glide.repackaged.com.squareup.javapoet.l a(java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.a> r3) {
            r2 = this;
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "annotations == null"
            com.bumptech.glide.repackaged.com.squareup.javapoet.n.c(r3, r1, r0)
            com.bumptech.glide.repackaged.com.squareup.javapoet.l r0 = new com.bumptech.glide.repackaged.com.squareup.javapoet.l
            java.lang.String r1 = r2.a
            java.util.List r3 = r2.d(r3)
            r0.<init>(r1, r3)
            return r0
    }

    public final com.bumptech.glide.repackaged.com.squareup.javapoet.l b(com.bumptech.glide.repackaged.com.squareup.javapoet.a... r1) {
            r0 = this;
            java.util.List r1 = java.util.Arrays.asList(r1)
            com.bumptech.glide.repackaged.com.squareup.javapoet.l r1 = r0.a(r1)
            return r1
    }

    protected final java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.a> d(java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.a> r3) {
            r2 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.a> r1 = r2.b
            r0.<init>(r1)
            r0.addAll(r3)
            return r0
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            if (r3 != r4) goto L4
            r4 = 1
            return r4
        L4:
            r0 = 0
            if (r4 != 0) goto L8
            return r0
        L8:
            java.lang.Class r1 = r3.getClass()
            java.lang.Class r2 = r4.getClass()
            if (r1 == r2) goto L13
            return r0
        L13:
            java.lang.String r0 = r3.toString()
            java.lang.String r4 = r4.toString()
            boolean r4 = r0.equals(r4)
            return r4
    }

    com.bumptech.glide.repackaged.com.squareup.javapoet.e h(com.bumptech.glide.repackaged.com.squareup.javapoet.e r2) throws java.io.IOException {
            r1 = this;
            java.lang.String r0 = r1.a
            if (r0 == 0) goto L9
            com.bumptech.glide.repackaged.com.squareup.javapoet.e r2 = r2.d(r0)
            return r2
        L9:
            java.lang.AssertionError r2 = new java.lang.AssertionError
            r2.<init>()
            throw r2
    }

    public final int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.toString()
            int r0 = r0.hashCode()
            return r0
    }

    com.bumptech.glide.repackaged.com.squareup.javapoet.e i(com.bumptech.glide.repackaged.com.squareup.javapoet.e r4) throws java.io.IOException {
            r3 = this;
            java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.a> r0 = r3.b
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1c
            java.lang.Object r1 = r0.next()
            com.bumptech.glide.repackaged.com.squareup.javapoet.a r1 = (com.bumptech.glide.repackaged.com.squareup.javapoet.a) r1
            r2 = 1
            r1.c(r4, r2)
            java.lang.String r1 = " "
            r4.b(r1)
            goto L6
        L1c:
            return r4
    }

    public boolean n() {
            r1 = this;
            java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.a> r0 = r1.b
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            return r0
    }

    public boolean o() {
            r1 = this;
            com.bumptech.glide.repackaged.com.squareup.javapoet.c r0 = com.bumptech.glide.repackaged.com.squareup.javapoet.l.f502o
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L43
            com.bumptech.glide.repackaged.com.squareup.javapoet.c r0 = com.bumptech.glide.repackaged.com.squareup.javapoet.l.f503p
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L43
            com.bumptech.glide.repackaged.com.squareup.javapoet.c r0 = com.bumptech.glide.repackaged.com.squareup.javapoet.l.f504q
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L43
            com.bumptech.glide.repackaged.com.squareup.javapoet.c r0 = com.bumptech.glide.repackaged.com.squareup.javapoet.l.f505r
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L43
            com.bumptech.glide.repackaged.com.squareup.javapoet.c r0 = com.bumptech.glide.repackaged.com.squareup.javapoet.l.f506s
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L43
            com.bumptech.glide.repackaged.com.squareup.javapoet.c r0 = com.bumptech.glide.repackaged.com.squareup.javapoet.l.f507t
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L43
            com.bumptech.glide.repackaged.com.squareup.javapoet.c r0 = com.bumptech.glide.repackaged.com.squareup.javapoet.l.f508u
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L43
            com.bumptech.glide.repackaged.com.squareup.javapoet.c r0 = com.bumptech.glide.repackaged.com.squareup.javapoet.l.f509v
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L41
            goto L43
        L41:
            r0 = 0
            return r0
        L43:
            r0 = 1
            return r0
    }

    public boolean p() {
            r1 = this;
            java.lang.String r0 = r1.a
            if (r0 == 0) goto La
            com.bumptech.glide.repackaged.com.squareup.javapoet.l r0 = com.bumptech.glide.repackaged.com.squareup.javapoet.l.d
            if (r1 == r0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    public com.bumptech.glide.repackaged.com.squareup.javapoet.l r() {
            r2 = this;
            com.bumptech.glide.repackaged.com.squareup.javapoet.l r0 = new com.bumptech.glide.repackaged.com.squareup.javapoet.l
            java.lang.String r1 = r2.a
            r0.<init>(r1)
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = r2.c
            if (r0 != 0) goto L21
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L1b
            r0.<init>()     // Catch: java.io.IOException -> L1b
            com.bumptech.glide.repackaged.com.squareup.javapoet.e r1 = new com.bumptech.glide.repackaged.com.squareup.javapoet.e     // Catch: java.io.IOException -> L1b
            r1.<init>(r0)     // Catch: java.io.IOException -> L1b
            r2.i(r1)     // Catch: java.io.IOException -> L1b
            r2.h(r1)     // Catch: java.io.IOException -> L1b
            java.lang.String r0 = r0.toString()     // Catch: java.io.IOException -> L1b
            r2.c = r0     // Catch: java.io.IOException -> L1b
            return r0
        L1b:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L21:
            return r0
    }
}

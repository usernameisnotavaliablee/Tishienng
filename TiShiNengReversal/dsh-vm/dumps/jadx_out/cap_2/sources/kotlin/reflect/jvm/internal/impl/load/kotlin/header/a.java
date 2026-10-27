package kotlin.reflect.jvm.internal.impl.load.kotlin.header;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class a implements kotlin.reflect.jvm.internal.impl.load.kotlin.x.c {
    private static boolean j;
    private static final java.util.Map<kotlin.reflect.jvm.internal.impl.name.b, kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind> k = null;
    private int[] a;
    private java.lang.String b;
    private int c;
    private java.lang.String d;
    private java.lang.String[] e;
    private java.lang.String[] f;
    private java.lang.String[] g;
    private kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind h;
    private java.lang.String[] i;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.header.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C0048a {
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static abstract class b implements kotlin.reflect.jvm.internal.impl.load.kotlin.x.b {
        private final java.util.List<java.lang.String> a;

        public b() {
                r1 = this;
                r1.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.a = r0
                return
        }

        private static /* synthetic */ void e(int r6) {
                r0 = 3
                java.lang.Object[] r1 = new java.lang.Object[r0]
                r2 = 0
                r3 = 2
                r4 = 1
                if (r6 == r4) goto L1b
                if (r6 == r3) goto L16
                if (r6 == r0) goto L11
                java.lang.String r5 = "enumClassId"
                r1[r2] = r5
                goto L1f
            L11:
                java.lang.String r5 = "classId"
                r1[r2] = r5
                goto L1f
            L16:
                java.lang.String r5 = "classLiteralValue"
                r1[r2] = r5
                goto L1f
            L1b:
                java.lang.String r5 = "enumEntryName"
                r1[r2] = r5
            L1f:
                java.lang.String r2 = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$CollectStringArrayAnnotationVisitor"
                r1[r4] = r2
                if (r6 == r3) goto L31
                if (r6 == r0) goto L2c
                java.lang.String r6 = "visitEnum"
                r1[r3] = r6
                goto L35
            L2c:
                java.lang.String r6 = "visitAnnotation"
                r1[r3] = r6
                goto L35
            L31:
                java.lang.String r6 = "visitClassLiteral"
                r1[r3] = r6
            L35:
                java.lang.String r6 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
                java.lang.String r6 = java.lang.String.format(r6, r1)
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                r0.<init>(r6)
                throw r0
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.x.b
        public void a(@org.jetbrains.annotations.Nullable java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof java.lang.String
                if (r0 == 0) goto Lb
                java.util.List<java.lang.String> r0 = r1.a
                java.lang.String r2 = (java.lang.String) r2
                r0.add(r2)
            Lb:
                return
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.x.b
        @org.jetbrains.annotations.Nullable
        public kotlin.reflect.jvm.internal.impl.load.kotlin.x.a b(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.b r1) {
                r0 = this;
                if (r1 != 0) goto L6
                r1 = 3
                e(r1)
            L6:
                r1 = 0
                return r1
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.x.b
        public void c(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.b r1, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r2) {
                r0 = this;
                if (r1 != 0) goto L6
                r1 = 0
                e(r1)
            L6:
                if (r2 != 0) goto Lc
                r1 = 1
                e(r1)
            Lc:
                return
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.x.b
        public void d(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.resolve.constants.f r1) {
                r0 = this;
                if (r1 != 0) goto L6
                r1 = 2
                e(r1)
            L6:
                return
        }

        protected abstract void f(@org.jetbrains.annotations.NotNull java.lang.String[] r1);

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.x.b
        public void visitEnd() {
                r2 = this;
                java.util.List<java.lang.String> r0 = r2.a
                r1 = 0
                java.lang.String[] r1 = new java.lang.String[r1]
                java.lang.Object[] r0 = r0.toArray(r1)
                java.lang.String[] r0 = (java.lang.String[]) r0
                r2.f(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class c implements kotlin.reflect.jvm.internal.impl.load.kotlin.x.a {
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.load.kotlin.header.a a;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.header.a$c$a, reason: collision with other inner class name */
        class C0049a extends kotlin.reflect.jvm.internal.impl.load.kotlin.header.a.b {
            final /* synthetic */ kotlin.reflect.jvm.internal.impl.load.kotlin.header.a.c b;

            C0049a(kotlin.reflect.jvm.internal.impl.load.kotlin.header.a.c r1) {
                    r0 = this;
                    r0.b = r1
                    r0.<init>()
                    return
            }

            private static /* synthetic */ void e(int r2) {
                    r2 = 3
                    java.lang.Object[] r2 = new java.lang.Object[r2]
                    java.lang.String r0 = "result"
                    r1 = 0
                    r2[r1] = r0
                    java.lang.String r0 = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$1"
                    r1 = 1
                    r2[r1] = r0
                    java.lang.String r0 = "visitEnd"
                    r1 = 2
                    r2[r1] = r0
                    java.lang.String r0 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
                    java.lang.String r2 = java.lang.String.format(r0, r2)
                    java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                    r0.<init>(r2)
                    throw r0
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.header.a.b
            protected void f(@org.jetbrains.annotations.NotNull java.lang.String[] r2) {
                    r1 = this;
                    if (r2 != 0) goto L6
                    r0 = 0
                    e(r0)
                L6:
                    kotlin.reflect.jvm.internal.impl.load.kotlin.header.a$c r0 = r1.b
                    kotlin.reflect.jvm.internal.impl.load.kotlin.header.a r0 = r0.a
                    kotlin.reflect.jvm.internal.impl.load.kotlin.header.a.j(r0, r2)
                    return
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class b extends kotlin.reflect.jvm.internal.impl.load.kotlin.header.a.b {
            final /* synthetic */ kotlin.reflect.jvm.internal.impl.load.kotlin.header.a.c b;

            b(kotlin.reflect.jvm.internal.impl.load.kotlin.header.a.c r1) {
                    r0 = this;
                    r0.b = r1
                    r0.<init>()
                    return
            }

            private static /* synthetic */ void e(int r2) {
                    r2 = 3
                    java.lang.Object[] r2 = new java.lang.Object[r2]
                    java.lang.String r0 = "result"
                    r1 = 0
                    r2[r1] = r0
                    java.lang.String r0 = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$2"
                    r1 = 1
                    r2[r1] = r0
                    java.lang.String r0 = "visitEnd"
                    r1 = 2
                    r2[r1] = r0
                    java.lang.String r0 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
                    java.lang.String r2 = java.lang.String.format(r0, r2)
                    java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                    r0.<init>(r2)
                    throw r0
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.header.a.b
            protected void f(@org.jetbrains.annotations.NotNull java.lang.String[] r2) {
                    r1 = this;
                    if (r2 != 0) goto L6
                    r0 = 0
                    e(r0)
                L6:
                    kotlin.reflect.jvm.internal.impl.load.kotlin.header.a$c r0 = r1.b
                    kotlin.reflect.jvm.internal.impl.load.kotlin.header.a r0 = r0.a
                    kotlin.reflect.jvm.internal.impl.load.kotlin.header.a.k(r0, r2)
                    return
            }
        }

        private c(kotlin.reflect.jvm.internal.impl.load.kotlin.header.a r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        /* synthetic */ c(kotlin.reflect.jvm.internal.impl.load.kotlin.header.a r1, kotlin.reflect.jvm.internal.impl.load.kotlin.header.a.C0048a r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        private static /* synthetic */ void f(int r6) {
                r0 = 3
                java.lang.Object[] r1 = new java.lang.Object[r0]
                r2 = 0
                r3 = 2
                r4 = 1
                if (r6 == r4) goto L1b
                if (r6 == r3) goto L16
                if (r6 == r0) goto L11
                java.lang.String r5 = "classLiteralValue"
                r1[r2] = r5
                goto L1f
            L11:
                java.lang.String r5 = "classId"
                r1[r2] = r5
                goto L1f
            L16:
                java.lang.String r5 = "enumEntryName"
                r1[r2] = r5
                goto L1f
            L1b:
                java.lang.String r5 = "enumClassId"
                r1[r2] = r5
            L1f:
                java.lang.String r2 = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor"
                r1[r4] = r2
                if (r6 == r4) goto L33
                if (r6 == r3) goto L33
                if (r6 == r0) goto L2e
                java.lang.String r6 = "visitClassLiteral"
                r1[r3] = r6
                goto L37
            L2e:
                java.lang.String r6 = "visitAnnotation"
                r1[r3] = r6
                goto L37
            L33:
                java.lang.String r6 = "visitEnum"
                r1[r3] = r6
            L37:
                java.lang.String r6 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
                java.lang.String r6 = java.lang.String.format(r6, r1)
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                r0.<init>(r6)
                throw r0
        }

        @org.jetbrains.annotations.NotNull
        private kotlin.reflect.jvm.internal.impl.load.kotlin.x.b g() {
                r1 = this;
                kotlin.reflect.jvm.internal.impl.load.kotlin.header.a$c$a r0 = new kotlin.reflect.jvm.internal.impl.load.kotlin.header.a$c$a
                r0.<init>(r1)
                return r0
        }

        @org.jetbrains.annotations.NotNull
        private kotlin.reflect.jvm.internal.impl.load.kotlin.x.b h() {
                r1 = this;
                kotlin.reflect.jvm.internal.impl.load.kotlin.header.a$c$b r0 = new kotlin.reflect.jvm.internal.impl.load.kotlin.header.a$c$b
                r0.<init>(r1)
                return r0
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.x.a
        public void a(@org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.name.f r1, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.b r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r3) {
                r0 = this;
                if (r2 != 0) goto L6
                r1 = 1
                f(r1)
            L6:
                if (r3 != 0) goto Lc
                r1 = 2
                f(r1)
            Lc:
                return
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.x.a
        @org.jetbrains.annotations.Nullable
        public kotlin.reflect.jvm.internal.impl.load.kotlin.x.a b(@org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.name.f r1, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.b r2) {
                r0 = this;
                if (r2 != 0) goto L6
                r1 = 3
                f(r1)
            L6:
                r1 = 0
                return r1
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.x.a
        public void c(@org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.name.f r1, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.resolve.constants.f r2) {
                r0 = this;
                if (r2 != 0) goto L6
                r1 = 0
                f(r1)
            L6:
                return
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.x.a
        public void d(@org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.name.f r2, @org.jetbrains.annotations.Nullable java.lang.Object r3) {
                r1 = this;
                if (r2 != 0) goto L4
                goto L83
            L4:
                java.lang.String r2 = r2.b()
                java.lang.String r0 = "k"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L24
                boolean r2 = r3 instanceof java.lang.Integer
                if (r2 == 0) goto L83
                kotlin.reflect.jvm.internal.impl.load.kotlin.header.a r2 = r1.a
                java.lang.Integer r3 = (java.lang.Integer) r3
                int r3 = r3.intValue()
                kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind r3 = kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind.getById(r3)
                kotlin.reflect.jvm.internal.impl.load.kotlin.header.a.e(r2, r3)
                return
            L24:
                java.lang.String r0 = "mv"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L38
                boolean r2 = r3 instanceof int[]
                if (r2 == 0) goto L83
                kotlin.reflect.jvm.internal.impl.load.kotlin.header.a r2 = r1.a
                int[] r3 = (int[]) r3
                kotlin.reflect.jvm.internal.impl.load.kotlin.header.a.f(r2, r3)
                return
            L38:
                java.lang.String r0 = "xs"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L52
                boolean r2 = r3 instanceof java.lang.String
                if (r2 == 0) goto L83
                java.lang.String r3 = (java.lang.String) r3
                boolean r2 = r3.isEmpty()
                if (r2 != 0) goto L83
                kotlin.reflect.jvm.internal.impl.load.kotlin.header.a r2 = r1.a
                kotlin.reflect.jvm.internal.impl.load.kotlin.header.a.g(r2, r3)
                return
            L52:
                java.lang.String r0 = "xi"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L6a
                boolean r2 = r3 instanceof java.lang.Integer
                if (r2 == 0) goto L83
                kotlin.reflect.jvm.internal.impl.load.kotlin.header.a r2 = r1.a
                java.lang.Integer r3 = (java.lang.Integer) r3
                int r3 = r3.intValue()
                kotlin.reflect.jvm.internal.impl.load.kotlin.header.a.h(r2, r3)
                return
            L6a:
                java.lang.String r0 = "pn"
                boolean r2 = r0.equals(r2)
                if (r2 == 0) goto L83
                boolean r2 = r3 instanceof java.lang.String
                if (r2 == 0) goto L83
                java.lang.String r3 = (java.lang.String) r3
                boolean r2 = r3.isEmpty()
                if (r2 != 0) goto L83
                kotlin.reflect.jvm.internal.impl.load.kotlin.header.a r2 = r1.a
                kotlin.reflect.jvm.internal.impl.load.kotlin.header.a.i(r2, r3)
            L83:
                return
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.x.a
        @org.jetbrains.annotations.Nullable
        public kotlin.reflect.jvm.internal.impl.load.kotlin.x.b e(@org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.name.f r3) {
                r2 = this;
                r0 = 0
                if (r3 == 0) goto L8
                java.lang.String r3 = r3.b()
                goto L9
            L8:
                r3 = r0
            L9:
                java.lang.String r1 = "d1"
                boolean r1 = r1.equals(r3)
                if (r1 == 0) goto L16
                kotlin.reflect.jvm.internal.impl.load.kotlin.x$b r3 = r2.g()
                return r3
            L16:
                java.lang.String r1 = "d2"
                boolean r3 = r1.equals(r3)
                if (r3 == 0) goto L23
                kotlin.reflect.jvm.internal.impl.load.kotlin.x$b r3 = r2.h()
                return r3
            L23:
                return r0
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.x.a
        public void visitEnd() {
                r0 = this;
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class d implements kotlin.reflect.jvm.internal.impl.load.kotlin.x.a {
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.load.kotlin.header.a a;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.header.a$d$a, reason: collision with other inner class name */
        class C0050a extends kotlin.reflect.jvm.internal.impl.load.kotlin.header.a.b {
            final /* synthetic */ kotlin.reflect.jvm.internal.impl.load.kotlin.header.a.d b;

            C0050a(kotlin.reflect.jvm.internal.impl.load.kotlin.header.a.d r1) {
                    r0 = this;
                    r0.b = r1
                    r0.<init>()
                    return
            }

            private static /* synthetic */ void e(int r2) {
                    r2 = 3
                    java.lang.Object[] r2 = new java.lang.Object[r2]
                    java.lang.String r0 = "result"
                    r1 = 0
                    r2[r1] = r0
                    java.lang.String r0 = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinSerializedIrArgumentVisitor$1"
                    r1 = 1
                    r2[r1] = r0
                    java.lang.String r0 = "visitEnd"
                    r1 = 2
                    r2[r1] = r0
                    java.lang.String r0 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
                    java.lang.String r2 = java.lang.String.format(r0, r2)
                    java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                    r0.<init>(r2)
                    throw r0
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.header.a.b
            protected void f(@org.jetbrains.annotations.NotNull java.lang.String[] r2) {
                    r1 = this;
                    if (r2 != 0) goto L6
                    r0 = 0
                    e(r0)
                L6:
                    kotlin.reflect.jvm.internal.impl.load.kotlin.header.a$d r0 = r1.b
                    kotlin.reflect.jvm.internal.impl.load.kotlin.header.a r0 = r0.a
                    kotlin.reflect.jvm.internal.impl.load.kotlin.header.a.d(r0, r2)
                    return
            }
        }

        private d(kotlin.reflect.jvm.internal.impl.load.kotlin.header.a r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        /* synthetic */ d(kotlin.reflect.jvm.internal.impl.load.kotlin.header.a r1, kotlin.reflect.jvm.internal.impl.load.kotlin.header.a.C0048a r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        private static /* synthetic */ void f(int r6) {
                r0 = 3
                java.lang.Object[] r1 = new java.lang.Object[r0]
                r2 = 0
                r3 = 2
                r4 = 1
                if (r6 == r4) goto L1b
                if (r6 == r3) goto L16
                if (r6 == r0) goto L11
                java.lang.String r5 = "classLiteralValue"
                r1[r2] = r5
                goto L1f
            L11:
                java.lang.String r5 = "classId"
                r1[r2] = r5
                goto L1f
            L16:
                java.lang.String r5 = "enumEntryName"
                r1[r2] = r5
                goto L1f
            L1b:
                java.lang.String r5 = "enumClassId"
                r1[r2] = r5
            L1f:
                java.lang.String r2 = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinSerializedIrArgumentVisitor"
                r1[r4] = r2
                if (r6 == r4) goto L33
                if (r6 == r3) goto L33
                if (r6 == r0) goto L2e
                java.lang.String r6 = "visitClassLiteral"
                r1[r3] = r6
                goto L37
            L2e:
                java.lang.String r6 = "visitAnnotation"
                r1[r3] = r6
                goto L37
            L33:
                java.lang.String r6 = "visitEnum"
                r1[r3] = r6
            L37:
                java.lang.String r6 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
                java.lang.String r6 = java.lang.String.format(r6, r1)
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                r0.<init>(r6)
                throw r0
        }

        @org.jetbrains.annotations.NotNull
        private kotlin.reflect.jvm.internal.impl.load.kotlin.x.b g() {
                r1 = this;
                kotlin.reflect.jvm.internal.impl.load.kotlin.header.a$d$a r0 = new kotlin.reflect.jvm.internal.impl.load.kotlin.header.a$d$a
                r0.<init>(r1)
                return r0
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.x.a
        public void a(@org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.name.f r1, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.b r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r3) {
                r0 = this;
                if (r2 != 0) goto L6
                r1 = 1
                f(r1)
            L6:
                if (r3 != 0) goto Lc
                r1 = 2
                f(r1)
            Lc:
                return
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.x.a
        @org.jetbrains.annotations.Nullable
        public kotlin.reflect.jvm.internal.impl.load.kotlin.x.a b(@org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.name.f r1, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.b r2) {
                r0 = this;
                if (r2 != 0) goto L6
                r1 = 3
                f(r1)
            L6:
                r1 = 0
                return r1
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.x.a
        public void c(@org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.name.f r1, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.resolve.constants.f r2) {
                r0 = this;
                if (r2 != 0) goto L6
                r1 = 0
                f(r1)
            L6:
                return
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.x.a
        public void d(@org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.name.f r1, @org.jetbrains.annotations.Nullable java.lang.Object r2) {
                r0 = this;
                return
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.x.a
        @org.jetbrains.annotations.Nullable
        public kotlin.reflect.jvm.internal.impl.load.kotlin.x.b e(@org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.name.f r3) {
                r2 = this;
                r0 = 0
                if (r3 == 0) goto L8
                java.lang.String r3 = r3.b()
                goto L9
            L8:
                r3 = r0
            L9:
                java.lang.String r1 = "b"
                boolean r3 = r1.equals(r3)
                if (r3 == 0) goto L16
                kotlin.reflect.jvm.internal.impl.load.kotlin.x$b r3 = r2.g()
                return r3
            L16:
                return r0
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.x.a
        public void visitEnd() {
                r0 = this;
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class e implements kotlin.reflect.jvm.internal.impl.load.kotlin.x.a {
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.load.kotlin.header.a a;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.header.a$e$a, reason: collision with other inner class name */
        class C0051a extends kotlin.reflect.jvm.internal.impl.load.kotlin.header.a.b {
            final /* synthetic */ kotlin.reflect.jvm.internal.impl.load.kotlin.header.a.e b;

            C0051a(kotlin.reflect.jvm.internal.impl.load.kotlin.header.a.e r1) {
                    r0 = this;
                    r0.b = r1
                    r0.<init>()
                    return
            }

            private static /* synthetic */ void e(int r2) {
                    r2 = 3
                    java.lang.Object[] r2 = new java.lang.Object[r2]
                    java.lang.String r0 = "data"
                    r1 = 0
                    r2[r1] = r0
                    java.lang.String r0 = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$1"
                    r1 = 1
                    r2[r1] = r0
                    java.lang.String r0 = "visitEnd"
                    r1 = 2
                    r2[r1] = r0
                    java.lang.String r0 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
                    java.lang.String r2 = java.lang.String.format(r0, r2)
                    java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                    r0.<init>(r2)
                    throw r0
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.header.a.b
            protected void f(@org.jetbrains.annotations.NotNull java.lang.String[] r2) {
                    r1 = this;
                    if (r2 != 0) goto L6
                    r0 = 0
                    e(r0)
                L6:
                    kotlin.reflect.jvm.internal.impl.load.kotlin.header.a$e r0 = r1.b
                    kotlin.reflect.jvm.internal.impl.load.kotlin.header.a r0 = r0.a
                    kotlin.reflect.jvm.internal.impl.load.kotlin.header.a.j(r0, r2)
                    return
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class b extends kotlin.reflect.jvm.internal.impl.load.kotlin.header.a.b {
            final /* synthetic */ kotlin.reflect.jvm.internal.impl.load.kotlin.header.a.e b;

            b(kotlin.reflect.jvm.internal.impl.load.kotlin.header.a.e r1) {
                    r0 = this;
                    r0.b = r1
                    r0.<init>()
                    return
            }

            private static /* synthetic */ void e(int r2) {
                    r2 = 3
                    java.lang.Object[] r2 = new java.lang.Object[r2]
                    java.lang.String r0 = "data"
                    r1 = 0
                    r2[r1] = r0
                    java.lang.String r0 = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$2"
                    r1 = 1
                    r2[r1] = r0
                    java.lang.String r0 = "visitEnd"
                    r1 = 2
                    r2[r1] = r0
                    java.lang.String r0 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
                    java.lang.String r2 = java.lang.String.format(r0, r2)
                    java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                    r0.<init>(r2)
                    throw r0
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.header.a.b
            protected void f(@org.jetbrains.annotations.NotNull java.lang.String[] r2) {
                    r1 = this;
                    if (r2 != 0) goto L6
                    r0 = 0
                    e(r0)
                L6:
                    kotlin.reflect.jvm.internal.impl.load.kotlin.header.a$e r0 = r1.b
                    kotlin.reflect.jvm.internal.impl.load.kotlin.header.a r0 = r0.a
                    kotlin.reflect.jvm.internal.impl.load.kotlin.header.a.k(r0, r2)
                    return
            }
        }

        private e(kotlin.reflect.jvm.internal.impl.load.kotlin.header.a r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        /* synthetic */ e(kotlin.reflect.jvm.internal.impl.load.kotlin.header.a r1, kotlin.reflect.jvm.internal.impl.load.kotlin.header.a.C0048a r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        private static /* synthetic */ void f(int r6) {
                r0 = 3
                java.lang.Object[] r1 = new java.lang.Object[r0]
                r2 = 0
                r3 = 2
                r4 = 1
                if (r6 == r4) goto L1b
                if (r6 == r3) goto L16
                if (r6 == r0) goto L11
                java.lang.String r5 = "classLiteralValue"
                r1[r2] = r5
                goto L1f
            L11:
                java.lang.String r5 = "classId"
                r1[r2] = r5
                goto L1f
            L16:
                java.lang.String r5 = "enumEntryName"
                r1[r2] = r5
                goto L1f
            L1b:
                java.lang.String r5 = "enumClassId"
                r1[r2] = r5
            L1f:
                java.lang.String r2 = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor"
                r1[r4] = r2
                if (r6 == r4) goto L33
                if (r6 == r3) goto L33
                if (r6 == r0) goto L2e
                java.lang.String r6 = "visitClassLiteral"
                r1[r3] = r6
                goto L37
            L2e:
                java.lang.String r6 = "visitAnnotation"
                r1[r3] = r6
                goto L37
            L33:
                java.lang.String r6 = "visitEnum"
                r1[r3] = r6
            L37:
                java.lang.String r6 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
                java.lang.String r6 = java.lang.String.format(r6, r1)
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                r0.<init>(r6)
                throw r0
        }

        @org.jetbrains.annotations.NotNull
        private kotlin.reflect.jvm.internal.impl.load.kotlin.x.b g() {
                r1 = this;
                kotlin.reflect.jvm.internal.impl.load.kotlin.header.a$e$a r0 = new kotlin.reflect.jvm.internal.impl.load.kotlin.header.a$e$a
                r0.<init>(r1)
                return r0
        }

        @org.jetbrains.annotations.NotNull
        private kotlin.reflect.jvm.internal.impl.load.kotlin.x.b h() {
                r1 = this;
                kotlin.reflect.jvm.internal.impl.load.kotlin.header.a$e$b r0 = new kotlin.reflect.jvm.internal.impl.load.kotlin.header.a$e$b
                r0.<init>(r1)
                return r0
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.x.a
        public void a(@org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.name.f r1, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.b r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r3) {
                r0 = this;
                if (r2 != 0) goto L6
                r1 = 1
                f(r1)
            L6:
                if (r3 != 0) goto Lc
                r1 = 2
                f(r1)
            Lc:
                return
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.x.a
        @org.jetbrains.annotations.Nullable
        public kotlin.reflect.jvm.internal.impl.load.kotlin.x.a b(@org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.name.f r1, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.b r2) {
                r0 = this;
                if (r2 != 0) goto L6
                r1 = 3
                f(r1)
            L6:
                r1 = 0
                return r1
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.x.a
        public void c(@org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.name.f r1, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.resolve.constants.f r2) {
                r0 = this;
                if (r2 != 0) goto L6
                r1 = 0
                f(r1)
            L6:
                return
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.x.a
        public void d(@org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.name.f r2, @org.jetbrains.annotations.Nullable java.lang.Object r3) {
                r1 = this;
                if (r2 != 0) goto L3
                goto L30
            L3:
                java.lang.String r2 = r2.b()
                java.lang.String r0 = "version"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L1b
                boolean r2 = r3 instanceof int[]
                if (r2 == 0) goto L30
                kotlin.reflect.jvm.internal.impl.load.kotlin.header.a r2 = r1.a
                int[] r3 = (int[]) r3
                kotlin.reflect.jvm.internal.impl.load.kotlin.header.a.f(r2, r3)
                return
            L1b:
                java.lang.String r0 = "multifileClassName"
                boolean r2 = r0.equals(r2)
                if (r2 == 0) goto L30
                kotlin.reflect.jvm.internal.impl.load.kotlin.header.a r2 = r1.a
                boolean r0 = r3 instanceof java.lang.String
                if (r0 == 0) goto L2c
                java.lang.String r3 = (java.lang.String) r3
                goto L2d
            L2c:
                r3 = 0
            L2d:
                kotlin.reflect.jvm.internal.impl.load.kotlin.header.a.g(r2, r3)
            L30:
                return
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.x.a
        @org.jetbrains.annotations.Nullable
        public kotlin.reflect.jvm.internal.impl.load.kotlin.x.b e(@org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.name.f r3) {
                r2 = this;
                r0 = 0
                if (r3 == 0) goto L8
                java.lang.String r3 = r3.b()
                goto L9
            L8:
                r3 = r0
            L9:
                java.lang.String r1 = "data"
                boolean r1 = r1.equals(r3)
                if (r1 != 0) goto L28
                java.lang.String r1 = "filePartClassNames"
                boolean r1 = r1.equals(r3)
                if (r1 == 0) goto L1a
                goto L28
            L1a:
                java.lang.String r1 = "strings"
                boolean r3 = r1.equals(r3)
                if (r3 == 0) goto L27
                kotlin.reflect.jvm.internal.impl.load.kotlin.x$b r3 = r2.h()
                return r3
            L27:
                return r0
            L28:
                kotlin.reflect.jvm.internal.impl.load.kotlin.x$b r3 = r2.g()
                return r3
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.x.a
        public void visitEnd() {
                r0 = this;
                return
        }
    }

    static {
            java.lang.String r0 = "true"
            java.lang.String r1 = "kotlin.ignore.old.metadata"
            java.lang.String r1 = java.lang.System.getProperty(r1)     // Catch: java.security.AccessControlException -> Lf
            boolean r0 = r0.equals(r1)     // Catch: java.security.AccessControlException -> Lf
            kotlin.reflect.jvm.internal.impl.load.kotlin.header.a.j = r0     // Catch: java.security.AccessControlException -> Lf
            goto L12
        Lf:
            r0 = 0
            kotlin.reflect.jvm.internal.impl.load.kotlin.header.a.j = r0
        L12:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            kotlin.reflect.jvm.internal.impl.load.kotlin.header.a.k = r0
            kotlin.reflect.jvm.internal.impl.name.c r1 = new kotlin.reflect.jvm.internal.impl.name.c
            java.lang.String r2 = "kotlin.jvm.internal.KotlinClass"
            r1.<init>(r2)
            kotlin.reflect.jvm.internal.impl.name.b r1 = kotlin.reflect.jvm.internal.impl.name.b.k(r1)
            kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind r2 = kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind.CLASS
            r0.put(r1, r2)
            kotlin.reflect.jvm.internal.impl.name.c r1 = new kotlin.reflect.jvm.internal.impl.name.c
            java.lang.String r2 = "kotlin.jvm.internal.KotlinFileFacade"
            r1.<init>(r2)
            kotlin.reflect.jvm.internal.impl.name.b r1 = kotlin.reflect.jvm.internal.impl.name.b.k(r1)
            kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind r2 = kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind.FILE_FACADE
            r0.put(r1, r2)
            kotlin.reflect.jvm.internal.impl.name.c r1 = new kotlin.reflect.jvm.internal.impl.name.c
            java.lang.String r2 = "kotlin.jvm.internal.KotlinMultifileClass"
            r1.<init>(r2)
            kotlin.reflect.jvm.internal.impl.name.b r1 = kotlin.reflect.jvm.internal.impl.name.b.k(r1)
            kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind r2 = kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind.MULTIFILE_CLASS
            r0.put(r1, r2)
            kotlin.reflect.jvm.internal.impl.name.c r1 = new kotlin.reflect.jvm.internal.impl.name.c
            java.lang.String r2 = "kotlin.jvm.internal.KotlinMultifileClassPart"
            r1.<init>(r2)
            kotlin.reflect.jvm.internal.impl.name.b r1 = kotlin.reflect.jvm.internal.impl.name.b.k(r1)
            kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind r2 = kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind.MULTIFILE_CLASS_PART
            r0.put(r1, r2)
            kotlin.reflect.jvm.internal.impl.name.c r1 = new kotlin.reflect.jvm.internal.impl.name.c
            java.lang.String r2 = "kotlin.jvm.internal.KotlinSyntheticClass"
            r1.<init>(r2)
            kotlin.reflect.jvm.internal.impl.name.b r1 = kotlin.reflect.jvm.internal.impl.name.b.k(r1)
            kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind r2 = kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind.SYNTHETIC_CLASS
            r0.put(r1, r2)
            return
    }

    public a() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.a = r0
            r2.b = r0
            r1 = 0
            r2.c = r1
            r2.d = r0
            r2.e = r0
            r2.f = r0
            r2.g = r0
            r2.h = r0
            r2.i = r0
            return
    }

    private static /* synthetic */ void c(int r3) {
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r2 = 1
            if (r3 == r2) goto Lc
            java.lang.String r3 = "classId"
            r0[r1] = r3
            goto L10
        Lc:
            java.lang.String r3 = "source"
            r0[r1] = r3
        L10:
            java.lang.String r3 = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor"
            r0[r2] = r3
            r3 = 2
            java.lang.String r1 = "visitAnnotation"
            r0[r3] = r1
            java.lang.String r3 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            java.lang.String r3 = java.lang.String.format(r3, r0)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r3)
            throw r0
    }

    static /* synthetic */ java.lang.String[] d(kotlin.reflect.jvm.internal.impl.load.kotlin.header.a r0, java.lang.String[] r1) {
            r0.i = r1
            return r1
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind e(kotlin.reflect.jvm.internal.impl.load.kotlin.header.a r0, kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind r1) {
            r0.h = r1
            return r1
    }

    static /* synthetic */ int[] f(kotlin.reflect.jvm.internal.impl.load.kotlin.header.a r0, int[] r1) {
            r0.a = r1
            return r1
    }

    static /* synthetic */ java.lang.String g(kotlin.reflect.jvm.internal.impl.load.kotlin.header.a r0, java.lang.String r1) {
            r0.b = r1
            return r1
    }

    static /* synthetic */ int h(kotlin.reflect.jvm.internal.impl.load.kotlin.header.a r0, int r1) {
            r0.c = r1
            return r1
    }

    static /* synthetic */ java.lang.String i(kotlin.reflect.jvm.internal.impl.load.kotlin.header.a r0, java.lang.String r1) {
            r0.d = r1
            return r1
    }

    static /* synthetic */ java.lang.String[] j(kotlin.reflect.jvm.internal.impl.load.kotlin.header.a r0, java.lang.String[] r1) {
            r0.e = r1
            return r1
    }

    static /* synthetic */ java.lang.String[] k(kotlin.reflect.jvm.internal.impl.load.kotlin.header.a r0, java.lang.String[] r1) {
            r0.f = r1
            return r1
    }

    private boolean n() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind r0 = r2.h
            kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind r1 = kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind.CLASS
            if (r0 == r1) goto L11
            kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind r1 = kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind.FILE_FACADE
            if (r0 == r1) goto L11
            kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind r1 = kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind.MULTIFILE_CLASS_PART
            if (r0 != r1) goto Lf
            goto L11
        Lf:
            r0 = 0
            return r0
        L11:
            r0 = 1
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.x.c
    @org.jetbrains.annotations.Nullable
    public kotlin.reflect.jvm.internal.impl.load.kotlin.x.a b(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.b r3, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.e1 r4) {
            r2 = this;
            if (r3 != 0) goto L6
            r0 = 0
            c(r0)
        L6:
            if (r4 != 0) goto Lc
            r4 = 1
            c(r4)
        Lc:
            kotlin.reflect.jvm.internal.impl.name.c r4 = r3.a()
            kotlin.reflect.jvm.internal.impl.name.c r0 = kotlin.reflect.jvm.internal.impl.load.java.i0.a
            boolean r0 = r4.equals(r0)
            r1 = 0
            if (r0 == 0) goto L1f
            kotlin.reflect.jvm.internal.impl.load.kotlin.header.a$c r3 = new kotlin.reflect.jvm.internal.impl.load.kotlin.header.a$c
            r3.<init>(r2, r1)
            return r3
        L1f:
            kotlin.reflect.jvm.internal.impl.name.c r0 = kotlin.reflect.jvm.internal.impl.load.java.i0.t
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L2d
            kotlin.reflect.jvm.internal.impl.load.kotlin.header.a$d r3 = new kotlin.reflect.jvm.internal.impl.load.kotlin.header.a$d
            r3.<init>(r2, r1)
            return r3
        L2d:
            boolean r4 = kotlin.reflect.jvm.internal.impl.load.kotlin.header.a.j
            if (r4 == 0) goto L32
            return r1
        L32:
            kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind r4 = r2.h
            if (r4 == 0) goto L37
            return r1
        L37:
            java.util.Map<kotlin.reflect.jvm.internal.impl.name.b, kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind> r4 = kotlin.reflect.jvm.internal.impl.load.kotlin.header.a.k
            java.lang.Object r3 = r4.get(r3)
            kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind r3 = (kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind) r3
            if (r3 == 0) goto L49
            r2.h = r3
            kotlin.reflect.jvm.internal.impl.load.kotlin.header.a$e r3 = new kotlin.reflect.jvm.internal.impl.load.kotlin.header.a$e
            r3.<init>(r2, r1)
            return r3
        L49:
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader l(kotlin.reflect.jvm.internal.impl.metadata.deserialization.c r13) {
            r12 = this;
            kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind r0 = r12.h
            r1 = 0
            if (r0 == 0) goto L4f
            int[] r0 = r12.a
            if (r0 != 0) goto La
            goto L4f
        La:
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.c r4 = new kotlin.reflect.jvm.internal.impl.metadata.deserialization.c
            int[] r0 = r12.a
            int r2 = r12.c
            r2 = r2 & 8
            if (r2 == 0) goto L16
            r2 = 1
            goto L17
        L16:
            r2 = 0
        L17:
            r4.<init>(r0, r2)
            boolean r13 = r4.h(r13)
            if (r13 != 0) goto L27
            java.lang.String[] r13 = r12.e
            r12.g = r13
            r12.e = r1
            goto L32
        L27:
            boolean r13 = r12.n()
            if (r13 == 0) goto L32
            java.lang.String[] r13 = r12.e
            if (r13 != 0) goto L32
            return r1
        L32:
            java.lang.String[] r13 = r12.i
            if (r13 == 0) goto L3a
            byte[] r1 = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.a.e(r13)
        L3a:
            r11 = r1
            kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader r2 = new kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader
            kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind r3 = r12.h
            java.lang.String[] r5 = r12.e
            java.lang.String[] r6 = r12.g
            java.lang.String[] r7 = r12.f
            java.lang.String r8 = r12.b
            int r9 = r12.c
            java.lang.String r10 = r12.d
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r2
        L4f:
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader m() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.c r0 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.c.i
            kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader r0 = r1.l(r0)
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.x.c
    public void visitEnd() {
            r0 = this;
            return
    }
}

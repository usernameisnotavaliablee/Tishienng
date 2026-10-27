package kotlin.reflect.jvm.internal.impl.load.java.components;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public interface o {
    public static final kotlin.reflect.jvm.internal.impl.load.java.components.o a = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class a implements kotlin.reflect.jvm.internal.impl.load.java.components.o {
        a() {
                r0 = this;
                r0.<init>()
                return
        }

        private static /* synthetic */ void c(int r3) {
                r0 = 3
                java.lang.Object[] r0 = new java.lang.Object[r0]
                r1 = 0
                switch(r3) {
                    case 1: goto L25;
                    case 2: goto L20;
                    case 3: goto L1b;
                    case 4: goto L16;
                    case 5: goto L11;
                    case 6: goto Lc;
                    default: goto L7;
                }
            L7:
                java.lang.String r2 = "method"
                r0[r1] = r2
                goto L29
            Lc:
                java.lang.String r2 = "signatureErrors"
                r0[r1] = r2
                goto L29
            L11:
                java.lang.String r2 = "descriptor"
                r0[r1] = r2
                goto L29
            L16:
                java.lang.String r2 = "typeParameters"
                r0[r1] = r2
                goto L29
            L1b:
                java.lang.String r2 = "valueParameters"
                r0[r1] = r2
                goto L29
            L20:
                java.lang.String r2 = "returnType"
                r0[r1] = r2
                goto L29
            L25:
                java.lang.String r2 = "owner"
                r0[r1] = r2
            L29:
                r1 = 1
                java.lang.String r2 = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$1"
                r0[r1] = r2
                r1 = 5
                r2 = 2
                if (r3 == r1) goto L3a
                r1 = 6
                if (r3 == r1) goto L3a
                java.lang.String r3 = "resolvePropagatedSignature"
                r0[r2] = r3
                goto L3e
            L3a:
                java.lang.String r3 = "reportSignatureErrors"
                r0[r2] = r3
            L3e:
                java.lang.String r3 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
                java.lang.String r3 = java.lang.String.format(r3, r0)
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                r0.<init>(r3)
                throw r0
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.components.o
        public void a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r1, @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> r2) {
                r0 = this;
                if (r1 != 0) goto L6
                r1 = 5
                c(r1)
            L6:
                if (r2 != 0) goto Lc
                r1 = 6
                c(r1)
            Lc:
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                java.lang.String r2 = "Should not be called"
                r1.<init>(r2)
                throw r1
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.components.o
        @org.jetbrains.annotations.NotNull
        public kotlin.reflect.jvm.internal.impl.load.java.components.o.b b(@org.jetbrains.annotations.NotNull x3.r r8, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.d r9, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r10, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.types.t0 r11, @org.jetbrains.annotations.NotNull java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.q1> r12, @org.jetbrains.annotations.NotNull java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.j1> r13) {
                r7 = this;
                if (r8 != 0) goto L6
                r8 = 0
                c(r8)
            L6:
                if (r9 != 0) goto Lc
                r8 = 1
                c(r8)
            Lc:
                if (r10 != 0) goto L12
                r8 = 2
                c(r8)
            L12:
                if (r12 != 0) goto L18
                r8 = 3
                c(r8)
            L18:
                if (r13 != 0) goto L1e
                r8 = 4
                c(r8)
            L1e:
                kotlin.reflect.jvm.internal.impl.load.java.components.o$b r0 = new kotlin.reflect.jvm.internal.impl.load.java.components.o$b
                java.util.List r5 = java.util.Collections.EMPTY_LIST
                r6 = 0
                r1 = r10
                r2 = r11
                r3 = r12
                r4 = r13
                r0.<init>(r1, r2, r3, r4, r5, r6)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class b {
        private final kotlin.reflect.jvm.internal.impl.types.t0 a;
        private final kotlin.reflect.jvm.internal.impl.types.t0 b;
        private final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.q1> c;
        private final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.j1> d;
        private final java.util.List<java.lang.String> e;
        private final boolean f;

        public b(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r2, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.types.t0 r3, @org.jetbrains.annotations.NotNull java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.q1> r4, @org.jetbrains.annotations.NotNull java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.j1> r5, @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> r6, boolean r7) {
                r1 = this;
                if (r2 != 0) goto L6
                r0 = 0
                a(r0)
            L6:
                if (r4 != 0) goto Lc
                r0 = 1
                a(r0)
            Lc:
                if (r5 != 0) goto L12
                r0 = 2
                a(r0)
            L12:
                if (r6 != 0) goto L18
                r0 = 3
                a(r0)
            L18:
                r1.<init>()
                r1.a = r2
                r1.b = r3
                r1.c = r4
                r1.d = r5
                r1.e = r6
                r1.f = r7
                return
        }

        private static /* synthetic */ void a(int r10) {
                r0 = 7
                r1 = 6
                r2 = 5
                r3 = 4
                if (r10 == r3) goto Lf
                if (r10 == r2) goto Lf
                if (r10 == r1) goto Lf
                if (r10 == r0) goto Lf
                java.lang.String r4 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
                goto L11
            Lf:
                java.lang.String r4 = "@NotNull method %s.%s must not return null"
            L11:
                r5 = 2
                if (r10 == r3) goto L1c
                if (r10 == r2) goto L1c
                if (r10 == r1) goto L1c
                if (r10 == r0) goto L1c
                r6 = 3
                goto L1d
            L1c:
                r6 = 2
            L1d:
                java.lang.Object[] r6 = new java.lang.Object[r6]
                java.lang.String r7 = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$PropagatedSignature"
                r8 = 0
                switch(r10) {
                    case 1: goto L37;
                    case 2: goto L32;
                    case 3: goto L2d;
                    case 4: goto L2a;
                    case 5: goto L2a;
                    case 6: goto L2a;
                    case 7: goto L2a;
                    default: goto L25;
                }
            L25:
                java.lang.String r9 = "returnType"
                r6[r8] = r9
                goto L3b
            L2a:
                r6[r8] = r7
                goto L3b
            L2d:
                java.lang.String r9 = "signatureErrors"
                r6[r8] = r9
                goto L3b
            L32:
                java.lang.String r9 = "typeParameters"
                r6[r8] = r9
                goto L3b
            L37:
                java.lang.String r9 = "valueParameters"
                r6[r8] = r9
            L3b:
                r8 = 1
                if (r10 == r3) goto L56
                if (r10 == r2) goto L51
                if (r10 == r1) goto L4c
                if (r10 == r0) goto L47
                r6[r8] = r7
                goto L5a
            L47:
                java.lang.String r7 = "getErrors"
                r6[r8] = r7
                goto L5a
            L4c:
                java.lang.String r7 = "getTypeParameters"
                r6[r8] = r7
                goto L5a
            L51:
                java.lang.String r7 = "getValueParameters"
                r6[r8] = r7
                goto L5a
            L56:
                java.lang.String r7 = "getReturnType"
                r6[r8] = r7
            L5a:
                if (r10 == r3) goto L66
                if (r10 == r2) goto L66
                if (r10 == r1) goto L66
                if (r10 == r0) goto L66
                java.lang.String r7 = "<init>"
                r6[r5] = r7
            L66:
                java.lang.String r4 = java.lang.String.format(r4, r6)
                if (r10 == r3) goto L78
                if (r10 == r2) goto L78
                if (r10 == r1) goto L78
                if (r10 == r0) goto L78
                java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
                r10.<init>(r4)
                goto L7d
            L78:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                r10.<init>(r4)
            L7d:
                throw r10
        }

        @org.jetbrains.annotations.NotNull
        public java.util.List<java.lang.String> b() {
                r2 = this;
                java.util.List<java.lang.String> r0 = r2.e
                if (r0 != 0) goto L8
                r1 = 7
                a(r1)
            L8:
                return r0
        }

        @org.jetbrains.annotations.Nullable
        public kotlin.reflect.jvm.internal.impl.types.t0 c() {
                r1 = this;
                kotlin.reflect.jvm.internal.impl.types.t0 r0 = r1.b
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public kotlin.reflect.jvm.internal.impl.types.t0 d() {
                r2 = this;
                kotlin.reflect.jvm.internal.impl.types.t0 r0 = r2.a
                if (r0 != 0) goto L8
                r1 = 4
                a(r1)
            L8:
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.j1> e() {
                r2 = this;
                java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.j1> r0 = r2.d
                if (r0 != 0) goto L8
                r1 = 6
                a(r1)
            L8:
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.q1> f() {
                r2 = this;
                java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.q1> r0 = r2.c
                if (r0 != 0) goto L8
                r1 = 5
                a(r1)
            L8:
                return r0
        }

        public boolean g() {
                r1 = this;
                boolean r0 = r1.f
                return r0
        }
    }

    static {
            kotlin.reflect.jvm.internal.impl.load.java.components.o$a r0 = new kotlin.reflect.jvm.internal.impl.load.java.components.o$a
            r0.<init>()
            kotlin.reflect.jvm.internal.impl.load.java.components.o.a = r0
            return
    }

    void a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r1, @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> r2);

    @org.jetbrains.annotations.NotNull
    kotlin.reflect.jvm.internal.impl.load.java.components.o.b b(@org.jetbrains.annotations.NotNull x3.r r1, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.d r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r3, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.types.t0 r4, @org.jetbrains.annotations.NotNull java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.q1> r5, @org.jetbrains.annotations.NotNull java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.j1> r6);
}

package kotlin.reflect.jvm.internal.impl.load.java;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class x {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.descriptors.s a = null;

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.descriptors.s b = null;

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.descriptors.s c = null;

    @org.jetbrains.annotations.NotNull
    private static final java.util.Map<kotlin.reflect.jvm.internal.impl.descriptors.v1, kotlin.reflect.jvm.internal.impl.descriptors.s> d = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class a extends kotlin.reflect.jvm.internal.impl.descriptors.p {
        a(kotlin.reflect.jvm.internal.impl.descriptors.v1 r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        private static /* synthetic */ void g(int r6) {
                r0 = 3
                java.lang.Object[] r1 = new java.lang.Object[r0]
                r2 = 0
                r3 = 2
                r4 = 1
                if (r6 == r4) goto L1b
                if (r6 == r3) goto L16
                if (r6 == r0) goto L11
                java.lang.String r5 = "what"
                r1[r2] = r5
                goto L1f
            L11:
                java.lang.String r5 = "myPackage"
                r1[r2] = r5
                goto L1f
            L16:
                java.lang.String r5 = "fromPackage"
                r1[r2] = r5
                goto L1f
            L1b:
                java.lang.String r5 = "from"
                r1[r2] = r5
            L1f:
                java.lang.String r2 = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$1"
                r1[r4] = r2
                if (r6 == r3) goto L2c
                if (r6 == r0) goto L2c
                java.lang.String r6 = "isVisible"
                r1[r3] = r6
                goto L30
            L2c:
                java.lang.String r6 = "visibleFromPackage"
                r1[r3] = r6
            L30:
                java.lang.String r6 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
                java.lang.String r6 = java.lang.String.format(r6, r1)
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                r0.<init>(r6)
                throw r0
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.s
        public boolean e(@org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h r1, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.o r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.k r3, boolean r4) {
                r0 = this;
                if (r2 != 0) goto L6
                r1 = 0
                g(r1)
            L6:
                if (r3 != 0) goto Lc
                r1 = 1
                g(r1)
            Lc:
                boolean r1 = kotlin.reflect.jvm.internal.impl.load.java.x.b(r2, r3)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class b extends kotlin.reflect.jvm.internal.impl.descriptors.p {
        b(kotlin.reflect.jvm.internal.impl.descriptors.v1 r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        private static /* synthetic */ void g(int r3) {
                r0 = 3
                java.lang.Object[] r0 = new java.lang.Object[r0]
                r1 = 0
                r2 = 1
                if (r3 == r2) goto Lc
                java.lang.String r3 = "what"
                r0[r1] = r3
                goto L10
            Lc:
                java.lang.String r3 = "from"
                r0[r1] = r3
            L10:
                java.lang.String r3 = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$2"
                r0[r2] = r3
                r3 = 2
                java.lang.String r1 = "isVisible"
                r0[r3] = r1
                java.lang.String r3 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
                java.lang.String r3 = java.lang.String.format(r3, r0)
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                r0.<init>(r3)
                throw r0
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.s
        public boolean e(@org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h r1, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.o r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.k r3, boolean r4) {
                r0 = this;
                if (r2 != 0) goto L6
                r4 = 0
                g(r4)
            L6:
                if (r3 != 0) goto Lc
                r4 = 1
                g(r4)
            Lc:
                boolean r1 = kotlin.reflect.jvm.internal.impl.load.java.x.c(r1, r2, r3)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class c extends kotlin.reflect.jvm.internal.impl.descriptors.p {
        c(kotlin.reflect.jvm.internal.impl.descriptors.v1 r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        private static /* synthetic */ void g(int r3) {
                r0 = 3
                java.lang.Object[] r0 = new java.lang.Object[r0]
                r1 = 0
                r2 = 1
                if (r3 == r2) goto Lc
                java.lang.String r3 = "what"
                r0[r1] = r3
                goto L10
            Lc:
                java.lang.String r3 = "from"
                r0[r1] = r3
            L10:
                java.lang.String r3 = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$3"
                r0[r2] = r3
                r3 = 2
                java.lang.String r1 = "isVisible"
                r0[r3] = r1
                java.lang.String r3 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
                java.lang.String r3 = java.lang.String.format(r3, r0)
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                r0.<init>(r3)
                throw r0
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.s
        public boolean e(@org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h r1, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.o r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.k r3, boolean r4) {
                r0 = this;
                if (r2 != 0) goto L6
                r4 = 0
                g(r4)
            L6:
                if (r3 != 0) goto Lc
                r4 = 1
                g(r4)
            Lc:
                boolean r1 = kotlin.reflect.jvm.internal.impl.load.java.x.c(r1, r2, r3)
                return r1
        }
    }

    static {
            kotlin.reflect.jvm.internal.impl.load.java.x$a r0 = new kotlin.reflect.jvm.internal.impl.load.java.x$a
            r3.a$a r1 = r3.a.a.c
            r0.<init>(r1)
            kotlin.reflect.jvm.internal.impl.load.java.x.a = r0
            kotlin.reflect.jvm.internal.impl.load.java.x$b r1 = new kotlin.reflect.jvm.internal.impl.load.java.x$b
            r3.a$c r2 = r3.a.c.c
            r1.<init>(r2)
            kotlin.reflect.jvm.internal.impl.load.java.x.b = r1
            kotlin.reflect.jvm.internal.impl.load.java.x$c r2 = new kotlin.reflect.jvm.internal.impl.load.java.x$c
            r3.a$b r3 = r3.a.b.c
            r2.<init>(r3)
            kotlin.reflect.jvm.internal.impl.load.java.x.c = r2
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            kotlin.reflect.jvm.internal.impl.load.java.x.d = r3
            f(r0)
            f(r1)
            f(r2)
            return
    }

    private static /* synthetic */ void a(int r9) {
            r0 = 6
            r1 = 5
            if (r9 == r1) goto L9
            if (r9 == r0) goto L9
            java.lang.String r2 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto Lb
        L9:
            java.lang.String r2 = "@NotNull method %s.%s must not return null"
        Lb:
            r3 = 3
            r4 = 2
            if (r9 == r1) goto L13
            if (r9 == r0) goto L13
            r5 = 3
            goto L14
        L13:
            r5 = 2
        L14:
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r6 = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities"
            r7 = 0
            switch(r9) {
                case 1: goto L33;
                case 2: goto L2e;
                case 3: goto L29;
                case 4: goto L24;
                case 5: goto L21;
                case 6: goto L21;
                default: goto L1c;
            }
        L1c:
            java.lang.String r8 = "what"
            r5[r7] = r8
            goto L37
        L21:
            r5[r7] = r6
            goto L37
        L24:
            java.lang.String r8 = "visibility"
            r5[r7] = r8
            goto L37
        L29:
            java.lang.String r8 = "second"
            r5[r7] = r8
            goto L37
        L2e:
            java.lang.String r8 = "first"
            r5[r7] = r8
            goto L37
        L33:
            java.lang.String r8 = "from"
            r5[r7] = r8
        L37:
            java.lang.String r7 = "toDescriptorVisibility"
            r8 = 1
            if (r9 == r1) goto L41
            if (r9 == r0) goto L41
            r5[r8] = r6
            goto L43
        L41:
            r5[r8] = r7
        L43:
            if (r9 == r4) goto L56
            if (r9 == r3) goto L56
            r3 = 4
            if (r9 == r3) goto L53
            if (r9 == r1) goto L5a
            if (r9 == r0) goto L5a
            java.lang.String r3 = "isVisibleForProtectedAndPackage"
            r5[r4] = r3
            goto L5a
        L53:
            r5[r4] = r7
            goto L5a
        L56:
            java.lang.String r3 = "areInSamePackage"
            r5[r4] = r3
        L5a:
            java.lang.String r2 = java.lang.String.format(r2, r5)
            if (r9 == r1) goto L68
            if (r9 == r0) goto L68
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r2)
            goto L6d
        L68:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>(r2)
        L6d:
            throw r9
    }

    static /* synthetic */ boolean b(kotlin.reflect.jvm.internal.impl.descriptors.k r0, kotlin.reflect.jvm.internal.impl.descriptors.k r1) {
            boolean r0 = d(r0, r1)
            return r0
    }

    static /* synthetic */ boolean c(kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h r0, kotlin.reflect.jvm.internal.impl.descriptors.o r1, kotlin.reflect.jvm.internal.impl.descriptors.k r2) {
            boolean r0 = e(r0, r1, r2)
            return r0
    }

    private static boolean d(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.k r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.k r3) {
            if (r2 != 0) goto L6
            r0 = 2
            a(r0)
        L6:
            if (r3 != 0) goto Lc
            r0 = 3
            a(r0)
        Lc:
            java.lang.Class<kotlin.reflect.jvm.internal.impl.descriptors.l0> r0 = kotlin.reflect.jvm.internal.impl.descriptors.l0.class
            r1 = 0
            kotlin.reflect.jvm.internal.impl.descriptors.k r2 = kotlin.reflect.jvm.internal.impl.resolve.i.r(r2, r0, r1)
            kotlin.reflect.jvm.internal.impl.descriptors.l0 r2 = (kotlin.reflect.jvm.internal.impl.descriptors.l0) r2
            kotlin.reflect.jvm.internal.impl.descriptors.k r3 = kotlin.reflect.jvm.internal.impl.resolve.i.r(r3, r0, r1)
            kotlin.reflect.jvm.internal.impl.descriptors.l0 r3 = (kotlin.reflect.jvm.internal.impl.descriptors.l0) r3
            if (r3 == 0) goto L2f
            if (r2 == 0) goto L2f
            kotlin.reflect.jvm.internal.impl.name.c r2 = r2.d()
            kotlin.reflect.jvm.internal.impl.name.c r3 = r3.d()
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L2f
            r2 = 1
            return r2
        L2f:
            return r1
    }

    private static boolean e(@org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h r3, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.o r4, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.k r5) {
            r0 = 0
            if (r4 != 0) goto L6
            a(r0)
        L6:
            r1 = 1
            if (r5 != 0) goto Lc
            a(r1)
        Lc:
            kotlin.reflect.jvm.internal.impl.descriptors.o r2 = kotlin.reflect.jvm.internal.impl.resolve.i.M(r4)
            boolean r2 = d(r2, r5)
            if (r2 == 0) goto L17
            return r1
        L17:
            kotlin.reflect.jvm.internal.impl.descriptors.s r1 = kotlin.reflect.jvm.internal.impl.descriptors.r.c
            boolean r3 = r1.e(r3, r4, r5, r0)
            return r3
    }

    private static void f(kotlin.reflect.jvm.internal.impl.descriptors.s r2) {
            java.util.Map<kotlin.reflect.jvm.internal.impl.descriptors.v1, kotlin.reflect.jvm.internal.impl.descriptors.s> r0 = kotlin.reflect.jvm.internal.impl.load.java.x.d
            kotlin.reflect.jvm.internal.impl.descriptors.v1 r1 = r2.b()
            r0.put(r1, r2)
            return
    }

    @org.jetbrains.annotations.NotNull
    public static kotlin.reflect.jvm.internal.impl.descriptors.s g(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.v1 r1) {
            if (r1 != 0) goto L6
            r0 = 4
            a(r0)
        L6:
            java.util.Map<kotlin.reflect.jvm.internal.impl.descriptors.v1, kotlin.reflect.jvm.internal.impl.descriptors.s> r0 = kotlin.reflect.jvm.internal.impl.load.java.x.d
            java.lang.Object r0 = r0.get(r1)
            kotlin.reflect.jvm.internal.impl.descriptors.s r0 = (kotlin.reflect.jvm.internal.impl.descriptors.s) r0
            if (r0 != 0) goto L1b
            kotlin.reflect.jvm.internal.impl.descriptors.s r1 = kotlin.reflect.jvm.internal.impl.descriptors.r.j(r1)
            if (r1 != 0) goto L1a
            r0 = 5
            a(r0)
        L1a:
            return r1
        L1b:
            return r0
    }
}

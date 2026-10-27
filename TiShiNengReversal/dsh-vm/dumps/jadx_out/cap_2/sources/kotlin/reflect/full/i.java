package kotlin.reflect.full;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.JvmName(name = "KClassifiers")
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nKClassifiers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KClassifiers.kt\nkotlin/reflect/full/KClassifiers\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,97:1\n1573#2:98\n1604#2,4:99\n1563#2:103\n1634#2,3:104\n*S KotlinDebug\n*F\n+ 1 KClassifiers.kt\nkotlin/reflect/full/KClassifiers\n*L\n69#1:98\n69#1:99,4\n95#1:103\n95#1:104,3\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class i {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a = null;

        static {
                kotlin.reflect.KVariance[] r0 = kotlin.reflect.KVariance.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                kotlin.reflect.KVariance r1 = kotlin.reflect.KVariance.INVARIANT     // Catch: java.lang.NoSuchFieldError -> L10
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L10
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L10
            L10:
                kotlin.reflect.KVariance r1 = kotlin.reflect.KVariance.IN     // Catch: java.lang.NoSuchFieldError -> L19
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L19
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L19
            L19:
                kotlin.reflect.KVariance r1 = kotlin.reflect.KVariance.OUT     // Catch: java.lang.NoSuchFieldError -> L22
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L22
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L22
            L22:
                kotlin.reflect.full.i.a.a = r0
                return
        }
    }

    private static final kotlin.reflect.jvm.internal.impl.types.e1 a(kotlin.reflect.jvm.internal.impl.types.t1 r8, kotlin.reflect.jvm.internal.impl.types.w1 r9, java.util.List<kotlin.reflect.t> r10, boolean r11) {
            java.util.List r0 = r9.getParameters()
            java.lang.String r1 = "getParameters(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.ArrayList r3 = new java.util.ArrayList
            r1 = 10
            int r1 = kotlin.collections.f0.d0(r10, r1)
            r3.<init>(r1)
            java.util.Iterator r10 = r10.iterator()
            r1 = 0
        L1b:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto L95
            java.lang.Object r2 = r10.next()
            int r4 = r1 + 1
            if (r1 >= 0) goto L2c
            kotlin.collections.f0.b0()
        L2c:
            kotlin.reflect.t r2 = (kotlin.reflect.t) r2
            kotlin.reflect.r r5 = r2.getType()
            kotlin.reflect.jvm.internal.z2 r5 = (kotlin.reflect.jvm.internal.z2) r5
            if (r5 == 0) goto L3b
            kotlin.reflect.jvm.internal.impl.types.t0 r5 = r5.getType()
            goto L3c
        L3b:
            r5 = 0
        L3c:
            kotlin.reflect.KVariance r2 = r2.g()
            r6 = -1
            if (r2 != 0) goto L45
            r2 = -1
            goto L4d
        L45:
            int[] r7 = kotlin.reflect.full.i.a.a
            int r2 = r2.ordinal()
            r2 = r7[r2]
        L4d:
            if (r2 == r6) goto L7f
            r1 = 1
            if (r2 == r1) goto L74
            r1 = 2
            if (r2 == r1) goto L69
            r1 = 3
            if (r2 != r1) goto L63
            kotlin.reflect.jvm.internal.impl.types.e2 r1 = new kotlin.reflect.jvm.internal.impl.types.e2
            kotlin.reflect.jvm.internal.impl.types.Variance r2 = kotlin.reflect.jvm.internal.impl.types.Variance.OUT_VARIANCE
            kotlin.jvm.internal.g0.m(r5)
            r1.<init>(r2, r5)
            goto L90
        L63:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        L69:
            kotlin.reflect.jvm.internal.impl.types.e2 r1 = new kotlin.reflect.jvm.internal.impl.types.e2
            kotlin.reflect.jvm.internal.impl.types.Variance r2 = kotlin.reflect.jvm.internal.impl.types.Variance.IN_VARIANCE
            kotlin.jvm.internal.g0.m(r5)
            r1.<init>(r2, r5)
            goto L90
        L74:
            kotlin.reflect.jvm.internal.impl.types.e2 r1 = new kotlin.reflect.jvm.internal.impl.types.e2
            kotlin.reflect.jvm.internal.impl.types.Variance r2 = kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT
            kotlin.jvm.internal.g0.m(r5)
            r1.<init>(r2, r5)
            goto L90
        L7f:
            kotlin.reflect.jvm.internal.impl.types.l1 r2 = new kotlin.reflect.jvm.internal.impl.types.l1
            java.lang.Object r1 = r0.get(r1)
            java.lang.String r5 = "get(...)"
            kotlin.jvm.internal.g0.o(r1, r5)
            kotlin.reflect.jvm.internal.impl.descriptors.j1 r1 = (kotlin.reflect.jvm.internal.impl.descriptors.j1) r1
            r2.<init>(r1)
            r1 = r2
        L90:
            r3.add(r1)
            r1 = r4
            goto L1b
        L95:
            r6 = 16
            r7 = 0
            r5 = 0
            r1 = r8
            r2 = r9
            r4 = r11
            kotlin.reflect.jvm.internal.impl.types.e1 r8 = kotlin.reflect.jvm.internal.impl.types.w0.m(r1, r2, r3, r4, r5, r6, r7)
            return r8
    }

    @kotlin.SinceKotlin(version = "1.1")
    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.r b(@org.jetbrains.annotations.NotNull kotlin.reflect.g r4, @org.jetbrains.annotations.NotNull java.util.List<kotlin.reflect.t> r5, boolean r6, @org.jetbrains.annotations.NotNull java.util.List<? extends java.lang.annotation.Annotation> r7) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "arguments"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "annotations"
            kotlin.jvm.internal.g0.p(r7, r0)
            boolean r0 = r4 instanceof kotlin.reflect.jvm.internal.d1
            r1 = 0
            if (r0 == 0) goto L18
            r0 = r4
            kotlin.reflect.jvm.internal.d1 r0 = (kotlin.reflect.jvm.internal.d1) r0
            goto L19
        L18:
            r0 = r1
        L19:
            if (r0 == 0) goto L87
            kotlin.reflect.jvm.internal.impl.descriptors.f r0 = r0.d()
            if (r0 == 0) goto L87
            kotlin.reflect.jvm.internal.impl.types.w1 r4 = r0.o()
            java.lang.String r0 = "getTypeConstructor(...)"
            kotlin.jvm.internal.g0.o(r4, r0)
            java.util.List r0 = r4.getParameters()
            java.lang.String r2 = "getParameters(...)"
            kotlin.jvm.internal.g0.o(r0, r2)
            int r2 = r0.size()
            int r3 = r5.size()
            if (r2 != r3) goto L5b
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L4a
            kotlin.reflect.jvm.internal.impl.types.t1$a r7 = kotlin.reflect.jvm.internal.impl.types.t1.b
            kotlin.reflect.jvm.internal.impl.types.t1 r7 = r7.k()
            goto L50
        L4a:
            kotlin.reflect.jvm.internal.impl.types.t1$a r7 = kotlin.reflect.jvm.internal.impl.types.t1.b
            kotlin.reflect.jvm.internal.impl.types.t1 r7 = r7.k()
        L50:
            kotlin.reflect.jvm.internal.z2 r0 = new kotlin.reflect.jvm.internal.z2
            kotlin.reflect.jvm.internal.impl.types.e1 r4 = a(r7, r4, r5, r6)
            r5 = 2
            r0.<init>(r4, r1, r5, r1)
            return r0
        L5b:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Class declares "
            r6.append(r7)
            int r7 = r0.size()
            r6.append(r7)
            java.lang.String r7 = " type parameters, but "
            r6.append(r7)
            int r5 = r5.size()
            r6.append(r5)
            java.lang.String r5 = " were provided."
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            r4.<init>(r5)
            throw r4
        L87:
            kotlin.reflect.jvm.internal.KotlinReflectionInternalError r5 = new kotlin.reflect.jvm.internal.KotlinReflectionInternalError
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Cannot create type for an unsupported classifier: "
            r6.append(r7)
            r6.append(r4)
            java.lang.String r7 = " ("
            r6.append(r7)
            java.lang.Class r4 = r4.getClass()
            r6.append(r4)
            r4 = 41
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            r5.<init>(r4)
            throw r5
    }

    public static /* synthetic */ kotlin.reflect.r c(kotlin.reflect.g r0, java.util.List r1, boolean r2, java.util.List r3, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            if (r5 == 0) goto L8
            java.util.List r1 = kotlin.collections.f0.J()
        L8:
            r5 = r4 & 2
            if (r5 == 0) goto Ld
            r2 = 0
        Ld:
            r4 = r4 & 4
            if (r4 == 0) goto L15
            java.util.List r3 = kotlin.collections.f0.J()
        L15:
            kotlin.reflect.r r0 = b(r0, r1, r2, r3)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.r d(@org.jetbrains.annotations.NotNull kotlin.reflect.g r8) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r8, r0)
            boolean r0 = r8 instanceof kotlin.reflect.jvm.internal.d1
            if (r0 == 0) goto Ld
            r0 = r8
            kotlin.reflect.jvm.internal.d1 r0 = (kotlin.reflect.jvm.internal.d1) r0
            goto Le
        Ld:
            r0 = 0
        Le:
            if (r0 == 0) goto L16
            kotlin.reflect.jvm.internal.impl.descriptors.f r0 = r0.d()
            if (r0 != 0) goto L18
        L16:
            r0 = r8
            goto L68
        L18:
            kotlin.reflect.jvm.internal.impl.types.w1 r0 = r0.o()
            java.util.List r0 = r0.getParameters()
            java.lang.String r1 = "getParameters(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L36
            r6 = 7
            r7 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r2 = r8
            kotlin.reflect.r r8 = c(r2, r3, r4, r5, r6, r7)
            return r8
        L36:
            r2 = r8
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r8 = 10
            int r8 = kotlin.collections.f0.d0(r0, r8)
            r1.<init>(r8)
            java.util.Iterator r8 = r0.iterator()
        L48:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L5e
            java.lang.Object r0 = r8.next()
            kotlin.reflect.jvm.internal.impl.descriptors.j1 r0 = (kotlin.reflect.jvm.internal.impl.descriptors.j1) r0
            kotlin.reflect.t$a r0 = kotlin.reflect.t.c
            kotlin.reflect.t r0 = r0.c()
            r1.add(r0)
            goto L48
        L5e:
            r4 = 6
            r5 = 0
            r0 = r2
            r2 = 0
            r3 = 0
            kotlin.reflect.r r8 = c(r0, r1, r2, r3, r4, r5)
            return r8
        L68:
            r4 = 7
            r5 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            kotlin.reflect.r r8 = c(r0, r1, r2, r3, r4, r5)
            return r8
    }

    @kotlin.SinceKotlin(version = "1.1")
    public static /* synthetic */ void e(kotlin.reflect.g r0) {
            return
    }
}

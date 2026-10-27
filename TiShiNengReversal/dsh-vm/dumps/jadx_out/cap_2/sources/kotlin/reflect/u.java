package kotlin.reflect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.ExperimentalStdlibApi
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nTypesJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypesJVM.kt\nkotlin/reflect/ParameterizedTypeImpl\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,230:1\n37#2,2:231\n*S KotlinDebug\n*F\n+ 1 TypesJVM.kt\nkotlin/reflect/ParameterizedTypeImpl\n*L\n190#1:231,2\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class u implements java.lang.reflect.ParameterizedType, kotlin.reflect.v {

    @org.jetbrains.annotations.NotNull
    private final java.lang.Class<?> a;

    @org.jetbrains.annotations.Nullable
    private final java.lang.reflect.Type b;

    @org.jetbrains.annotations.NotNull
    private final java.lang.reflect.Type[] c;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final /* synthetic */ class a extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<java.lang.reflect.Type, java.lang.String> {
        public static final kotlin.reflect.u.a a = null;

        static {
                kotlin.reflect.u$a r0 = new kotlin.reflect.u$a
                r0.<init>()
                kotlin.reflect.u.a.a = r0
                return
        }

        a() {
                r6 = this;
                java.lang.String r4 = "typeToString(Ljava/lang/reflect/Type;)Ljava/lang/String;"
                r5 = 1
                r1 = 1
                java.lang.Class<kotlin.reflect.y> r2 = kotlin.reflect.y.class
                java.lang.String r3 = "typeToString"
                r0 = r6
                r0.<init>(r1, r2, r3, r4, r5)
                return
        }

        public final java.lang.String c(java.lang.reflect.Type r2) {
                r1 = this;
                java.lang.String r0 = "p0"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r2 = kotlin.reflect.y.b(r2)
                return r2
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ java.lang.String invoke(java.lang.reflect.Type r1) {
                r0 = this;
                java.lang.reflect.Type r1 = (java.lang.reflect.Type) r1
                java.lang.String r1 = r0.c(r1)
                return r1
        }
    }

    public u(@org.jetbrains.annotations.NotNull java.lang.Class<?> r2, @org.jetbrains.annotations.Nullable java.lang.reflect.Type r3, @org.jetbrains.annotations.NotNull java.util.List<? extends java.lang.reflect.Type> r4) {
            r1 = this;
            java.lang.String r0 = "rawType"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "typeArguments"
            kotlin.jvm.internal.g0.p(r4, r0)
            r1.<init>()
            r1.a = r2
            r1.b = r3
            java.util.Collection r4 = (java.util.Collection) r4
            r2 = 0
            java.lang.reflect.Type[] r2 = new java.lang.reflect.Type[r2]
            java.lang.Object[] r2 = r4.toArray(r2)
            java.lang.reflect.Type[] r2 = (java.lang.reflect.Type[]) r2
            r1.c = r2
            return
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof java.lang.reflect.ParameterizedType
            if (r0 == 0) goto L2e
            java.lang.Class<?> r0 = r2.a
            java.lang.reflect.ParameterizedType r3 = (java.lang.reflect.ParameterizedType) r3
            java.lang.reflect.Type r1 = r3.getRawType()
            boolean r0 = kotlin.jvm.internal.g0.g(r0, r1)
            if (r0 == 0) goto L2e
            java.lang.reflect.Type r0 = r2.b
            java.lang.reflect.Type r1 = r3.getOwnerType()
            boolean r0 = kotlin.jvm.internal.g0.g(r0, r1)
            if (r0 == 0) goto L2e
            java.lang.reflect.Type[] r0 = r2.getActualTypeArguments()
            java.lang.reflect.Type[] r3 = r3.getActualTypeArguments()
            boolean r3 = java.util.Arrays.equals(r0, r3)
            if (r3 == 0) goto L2e
            r3 = 1
            return r3
        L2e:
            r3 = 0
            return r3
    }

    @Override // java.lang.reflect.ParameterizedType
    @org.jetbrains.annotations.NotNull
    public java.lang.reflect.Type[] getActualTypeArguments() {
            r1 = this;
            java.lang.reflect.Type[] r0 = r1.c
            return r0
    }

    @Override // java.lang.reflect.ParameterizedType
    @org.jetbrains.annotations.Nullable
    public java.lang.reflect.Type getOwnerType() {
            r1 = this;
            java.lang.reflect.Type r0 = r1.b
            return r0
    }

    @Override // java.lang.reflect.ParameterizedType
    @org.jetbrains.annotations.NotNull
    public java.lang.reflect.Type getRawType() {
            r1 = this;
            java.lang.Class<?> r0 = r1.a
            return r0
    }

    @Override // java.lang.reflect.Type, kotlin.reflect.v
    @org.jetbrains.annotations.NotNull
    public java.lang.String getTypeName() {
            r10 = this;
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.reflect.Type r0 = r10.b
            if (r0 == 0) goto L1f
            java.lang.String r0 = kotlin.reflect.y.b(r0)
            r1.append(r0)
            java.lang.String r0 = "$"
            r1.append(r0)
            java.lang.Class<?> r0 = r10.a
            java.lang.String r0 = r0.getSimpleName()
            r1.append(r0)
            goto L28
        L1f:
            java.lang.Class<?> r0 = r10.a
            java.lang.String r0 = kotlin.reflect.y.b(r0)
            r1.append(r0)
        L28:
            java.lang.reflect.Type[] r0 = r10.c
            int r2 = r0.length
            if (r2 != 0) goto L2f
            r2 = 1
            goto L30
        L2f:
            r2 = 0
        L30:
            if (r2 != 0) goto L41
            kotlin.reflect.u$a r7 = kotlin.reflect.u.a.a
            r8 = 50
            r9 = 0
            r2 = 0
            java.lang.String r3 = "<"
            java.lang.String r4 = ">"
            r5 = 0
            r6 = 0
            kotlin.collections.n.mh(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
        L41:
            java.lang.String r0 = r1.toString()
            return r0
    }

    public int hashCode() {
            r2 = this;
            java.lang.Class<?> r0 = r2.a
            int r0 = r0.hashCode()
            java.lang.reflect.Type r1 = r2.b
            if (r1 == 0) goto Lf
            int r1 = r1.hashCode()
            goto L10
        Lf:
            r1 = 0
        L10:
            r0 = r0 ^ r1
            java.lang.reflect.Type[] r1 = r2.getActualTypeArguments()
            int r1 = java.util.Arrays.hashCode(r1)
            r0 = r0 ^ r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.getTypeName()
            return r0
    }
}

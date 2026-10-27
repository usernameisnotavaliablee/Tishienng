package kotlin.reflect.jvm.internal.calls;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nAnnotationConstructorCaller.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotationConstructorCaller.kt\nkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,181:1\n1563#2:182\n1634#2,3:183\n1563#2:186\n1634#2,2:187\n1636#2:190\n1563#2:191\n1634#2,3:192\n1563#2:195\n1634#2,3:196\n1#3:189\n11318#4:199\n11429#4,4:200\n*S KotlinDebug\n*F\n+ 1 AnnotationConstructorCaller.kt\nkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller\n*L\n28#1:182\n28#1:183,3\n35#1:186\n35#1:187,2\n35#1:190\n37#1:191\n37#1:192,3\n20#1:195\n20#1:196,3\n53#1:199\n53#1:200,4\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class AnnotationConstructorCaller implements kotlin.reflect.jvm.internal.calls.g {

    @org.jetbrains.annotations.NotNull
    private final java.lang.Class<?> a;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<java.lang.String> b;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller.CallMode c;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<java.lang.reflect.Method> d;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<java.lang.reflect.Type> e;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<java.lang.Class<?>> f;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<java.lang.Object> g;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum CallMode extends java.lang.Enum<kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller.CallMode> {
        private static final /* synthetic */ kotlin.enums.a $ENTRIES = null;
        private static final /* synthetic */ kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller.CallMode[] $VALUES = null;
        public static final kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller.CallMode CALL_BY_NAME = null;
        public static final kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller.CallMode POSITIONAL_CALL = null;

        private static final /* synthetic */ kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller.CallMode[] $values() {
                r0 = 2
                kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller$CallMode[] r0 = new kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller.CallMode[r0]
                kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller$CallMode r1 = kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller.CallMode.CALL_BY_NAME
                r2 = 0
                r0[r2] = r1
                kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller$CallMode r1 = kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller.CallMode.POSITIONAL_CALL
                r2 = 1
                r0[r2] = r1
                return r0
        }

        static {
                kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller$CallMode r0 = new kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller$CallMode
                java.lang.String r1 = "CALL_BY_NAME"
                r2 = 0
                r0.<init>(r1, r2)
                kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller.CallMode.CALL_BY_NAME = r0
                kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller$CallMode r0 = new kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller$CallMode
                java.lang.String r1 = "POSITIONAL_CALL"
                r2 = 1
                r0.<init>(r1, r2)
                kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller.CallMode.POSITIONAL_CALL = r0
                kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller$CallMode[] r0 = $values()
                kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller.CallMode.$VALUES = r0
                kotlin.enums.a r0 = kotlin.enums.c.c(r0)
                kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller.CallMode.$ENTRIES = r0
                return
        }

        CallMode(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller.CallMode valueOf(java.lang.String r1) {
                java.lang.Class<kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller$CallMode> r0 = kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller.CallMode.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller$CallMode r1 = (kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller.CallMode) r1
                return r1
        }

        public static kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller.CallMode[] values() {
                kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller$CallMode[] r0 = kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller.CallMode.$VALUES
                java.lang.Object r0 = r0.clone()
                kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller$CallMode[] r0 = (kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller.CallMode[]) r0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum Origin extends java.lang.Enum<kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller.Origin> {
        private static final /* synthetic */ kotlin.enums.a $ENTRIES = null;
        private static final /* synthetic */ kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller.Origin[] $VALUES = null;
        public static final kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller.Origin JAVA = null;
        public static final kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller.Origin KOTLIN = null;

        private static final /* synthetic */ kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller.Origin[] $values() {
                r0 = 2
                kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller$Origin[] r0 = new kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller.Origin[r0]
                kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller$Origin r1 = kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller.Origin.JAVA
                r2 = 0
                r0[r2] = r1
                kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller$Origin r1 = kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller.Origin.KOTLIN
                r2 = 1
                r0[r2] = r1
                return r0
        }

        static {
                kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller$Origin r0 = new kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller$Origin
                java.lang.String r1 = "JAVA"
                r2 = 0
                r0.<init>(r1, r2)
                kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller.Origin.JAVA = r0
                kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller$Origin r0 = new kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller$Origin
                java.lang.String r1 = "KOTLIN"
                r2 = 1
                r0.<init>(r1, r2)
                kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller.Origin.KOTLIN = r0
                kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller$Origin[] r0 = $values()
                kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller.Origin.$VALUES = r0
                kotlin.enums.a r0 = kotlin.enums.c.c(r0)
                kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller.Origin.$ENTRIES = r0
                return
        }

        Origin(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller.Origin valueOf(java.lang.String r1) {
                java.lang.Class<kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller$Origin> r0 = kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller.Origin.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller$Origin r1 = (kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller.Origin) r1
                return r1
        }

        public static kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller.Origin[] values() {
                kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller$Origin[] r0 = kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller.Origin.$VALUES
                java.lang.Object r0 = r0.clone()
                kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller$Origin[] r0 = (kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller.Origin[]) r0
                return r0
        }
    }

    public AnnotationConstructorCaller(@org.jetbrains.annotations.NotNull java.lang.Class<?> r2, @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> r3, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller.CallMode r4, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller.Origin r5, @org.jetbrains.annotations.NotNull java.util.List<java.lang.reflect.Method> r6) {
            r1 = this;
            java.lang.String r0 = "jClass"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "parameterNames"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "callMode"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "origin"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "methods"
            kotlin.jvm.internal.g0.p(r6, r0)
            r1.<init>()
            r1.a = r2
            r1.b = r3
            r1.c = r4
            r1.d = r6
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r4 = kotlin.collections.f0.d0(r6, r3)
            r2.<init>(r4)
            java.util.Iterator r4 = r6.iterator()
        L35:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L49
            java.lang.Object r6 = r4.next()
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6
            java.lang.reflect.Type r6 = r6.getGenericReturnType()
            r2.add(r6)
            goto L35
        L49:
            r1.e = r2
            java.util.List<java.lang.reflect.Method> r2 = r1.d
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r4 = new java.util.ArrayList
            int r6 = kotlin.collections.f0.d0(r2, r3)
            r4.<init>(r6)
            java.util.Iterator r2 = r2.iterator()
        L5c:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L7b
            java.lang.Object r6 = r2.next()
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6
            java.lang.Class r6 = r6.getReturnType()
            kotlin.jvm.internal.g0.m(r6)
            java.lang.Class r0 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.f.k(r6)
            if (r0 != 0) goto L76
            goto L77
        L76:
            r6 = r0
        L77:
            r4.add(r6)
            goto L5c
        L7b:
            r1.f = r4
            java.util.List<java.lang.reflect.Method> r2 = r1.d
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r4 = new java.util.ArrayList
            int r3 = kotlin.collections.f0.d0(r2, r3)
            r4.<init>(r3)
            java.util.Iterator r2 = r2.iterator()
        L8e:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto La2
            java.lang.Object r3 = r2.next()
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            java.lang.Object r3 = r3.getDefaultValue()
            r4.add(r3)
            goto L8e
        La2:
            r1.g = r4
            kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller$CallMode r2 = r1.c
            kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller$CallMode r3 = kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller.CallMode.POSITIONAL_CALL
            if (r2 != r3) goto Lc9
            kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller$Origin r2 = kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller.Origin.JAVA
            if (r5 != r2) goto Lc9
            java.util.List<java.lang.String> r2 = r1.b
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.lang.String r3 = "value"
            java.util.List r2 = kotlin.collections.f0.v4(r2, r3)
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto Lc1
            goto Lc9
        Lc1:
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r3 = "Positional call of a Java annotation constructor is allowed only if there are no parameters or one parameter named \"value\". This restriction exists because Java annotations (in contrast to Kotlin)do not impose any order on their arguments. Use KCallable#callBy instead."
            r2.<init>(r3)
            throw r2
        Lc9:
            return
    }

    public /* synthetic */ AnnotationConstructorCaller(java.lang.Class r7, java.util.List r8, kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller.CallMode r9, kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller.Origin r10, java.util.List r11, int r12, kotlin.jvm.internal.v r13) {
            r6 = this;
            r12 = r12 & 16
            if (r12 == 0) goto L32
            r11 = r8
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.ArrayList r12 = new java.util.ArrayList
            r13 = 10
            int r13 = kotlin.collections.f0.d0(r11, r13)
            r12.<init>(r13)
            java.util.Iterator r11 = r11.iterator()
        L16:
            boolean r13 = r11.hasNext()
            if (r13 == 0) goto L2b
            java.lang.Object r13 = r11.next()
            java.lang.String r13 = (java.lang.String) r13
            r0 = 0
            java.lang.reflect.Method r13 = r7.getDeclaredMethod(r13, r0)
            r12.add(r13)
            goto L16
        L2b:
            r5 = r12
        L2c:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            goto L34
        L32:
            r5 = r11
            goto L2c
        L34:
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    @Override // kotlin.reflect.jvm.internal.calls.g
    public boolean a() {
            r1 = this;
            boolean r0 = r1.f()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.calls.g
    @org.jetbrains.annotations.NotNull
    public java.util.List<java.lang.reflect.Type> b() {
            r1 = this;
            java.util.List<java.lang.reflect.Type> r0 = r1.e
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.calls.g
    public /* bridge */ /* synthetic */ java.lang.reflect.Member c() {
            r1 = this;
            java.lang.Void r0 = r1.g()
            java.lang.reflect.Member r0 = (java.lang.reflect.Member) r0
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.calls.g
    @org.jetbrains.annotations.Nullable
    public java.lang.Object call(@org.jetbrains.annotations.NotNull java.lang.Object[] r9) {
            r8 = this;
            java.lang.String r0 = "args"
            kotlin.jvm.internal.g0.p(r9, r0)
            r8.d(r9)
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r9.length
            r0.<init>(r1)
            int r1 = r9.length
            r2 = 0
            r3 = 0
        L11:
            if (r2 >= r1) goto L54
            r4 = r9[r2]
            int r5 = r3 + 1
            if (r4 != 0) goto L26
            kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller$CallMode r6 = r8.c
            kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller$CallMode r7 = kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller.CallMode.CALL_BY_NAME
            if (r6 != r7) goto L26
            java.util.List<java.lang.Object> r4 = r8.g
            java.lang.Object r4 = r4.get(r3)
            goto L32
        L26:
            java.util.List<java.lang.Class<?>> r6 = r8.f
            java.lang.Object r6 = r6.get(r3)
            java.lang.Class r6 = (java.lang.Class) r6
            java.lang.Object r4 = kotlin.reflect.jvm.internal.calls.e.b(r4, r6)
        L32:
            if (r4 == 0) goto L3b
            r0.add(r4)
            int r2 = r2 + 1
            r3 = r5
            goto L11
        L3b:
            java.util.List<java.lang.String> r9 = r8.b
            java.lang.Object r9 = r9.get(r3)
            java.lang.String r9 = (java.lang.String) r9
            java.util.List<java.lang.Class<?>> r0 = r8.f
            java.lang.Object r0 = r0.get(r3)
            java.lang.Class r0 = (java.lang.Class) r0
            kotlin.reflect.jvm.internal.calls.e.a(r3, r9, r0)
            kotlin.KotlinNothingValueException r9 = new kotlin.KotlinNothingValueException
            r9.<init>()
            throw r9
        L54:
            java.lang.Class<?> r9 = r8.a
            java.util.List<java.lang.String> r1 = r8.b
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.List r0 = kotlin.collections.f0.o6(r1, r0)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Map r0 = kotlin.collections.i1.B0(r0)
            java.util.List<java.lang.reflect.Method> r1 = r8.d
            java.lang.Object r9 = kotlin.reflect.jvm.internal.calls.e.g(r9, r0, r1)
            return r9
    }

    public void d(@org.jetbrains.annotations.NotNull java.lang.Object[] r1) {
            r0 = this;
            r0.e(r1)
            return
    }

    public void e(java.lang.Object[] r4) {
            r3 = this;
            java.lang.String r0 = "args"
            kotlin.jvm.internal.g0.p(r4, r0)
            int r0 = kotlin.reflect.jvm.internal.calls.i.a(r3)
            int r1 = r4.length
            if (r0 != r1) goto Ld
            return
        Ld:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Callable expects "
            r1.append(r2)
            int r2 = kotlin.reflect.jvm.internal.calls.i.a(r3)
            r1.append(r2)
            java.lang.String r2 = " arguments, but "
            r1.append(r2)
            int r4 = r4.length
            r1.append(r4)
            java.lang.String r4 = " were provided."
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    public boolean f() {
            r1 = this;
            r0 = 0
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public java.lang.Void g() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.calls.g
    @org.jetbrains.annotations.NotNull
    public java.lang.reflect.Type getReturnType() {
            r1 = this;
            java.lang.Class<?> r0 = r1.a
            return r0
    }
}

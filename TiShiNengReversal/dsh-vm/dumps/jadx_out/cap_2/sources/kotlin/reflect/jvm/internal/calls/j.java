package kotlin.reflect.jvm.internal.calls;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class j implements kotlin.reflect.jvm.internal.calls.g<java.lang.reflect.Method> {

    @org.jetbrains.annotations.NotNull
    private final java.lang.reflect.Method a;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<java.lang.reflect.Type> b;

    @org.jetbrains.annotations.NotNull
    private final java.lang.reflect.Type c;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a extends kotlin.reflect.jvm.internal.calls.j implements kotlin.reflect.jvm.internal.calls.f {

        @org.jetbrains.annotations.Nullable
        private final java.lang.Object d;

        public a(@org.jetbrains.annotations.NotNull java.lang.reflect.Method r3, @org.jetbrains.annotations.Nullable java.lang.Object r4) {
                r2 = this;
                java.lang.String r0 = "unboxMethod"
                kotlin.jvm.internal.g0.p(r3, r0)
                java.util.List r0 = kotlin.collections.f0.J()
                r1 = 0
                r2.<init>(r3, r0, r1)
                r2.d = r4
                return
        }

        @Override // kotlin.reflect.jvm.internal.calls.g
        @org.jetbrains.annotations.Nullable
        public java.lang.Object call(@org.jetbrains.annotations.NotNull java.lang.Object[] r2) {
                r1 = this;
                java.lang.String r0 = "args"
                kotlin.jvm.internal.g0.p(r2, r0)
                r1.e(r2)
                java.lang.Object r0 = r1.d
                java.lang.Object r2 = r1.d(r0, r2)
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nInternalUnderlyingValOfInlineClass.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InternalUnderlyingValOfInlineClass.kt\nkotlin/reflect/jvm/internal/calls/InternalUnderlyingValOfInlineClass$Unbound\n+ 2 CallerImpl.kt\nkotlin/reflect/jvm/internal/calls/CallerImpl$Companion\n*L\n1#1,45:1\n270#2:46\n*S KotlinDebug\n*F\n+ 1 InternalUnderlyingValOfInlineClass.kt\nkotlin/reflect/jvm/internal/calls/InternalUnderlyingValOfInlineClass$Unbound\n*L\n31#1:46\n*E\n"})
    public static final class b extends kotlin.reflect.jvm.internal.calls.j {
        public b(@org.jetbrains.annotations.NotNull java.lang.reflect.Method r3) {
                r2 = this;
                java.lang.String r0 = "unboxMethod"
                kotlin.jvm.internal.g0.p(r3, r0)
                java.lang.Class r0 = r3.getDeclaringClass()
                java.util.List r0 = kotlin.collections.f0.l(r0)
                r1 = 0
                r2.<init>(r3, r0, r1)
                return
        }

        @Override // kotlin.reflect.jvm.internal.calls.g
        @org.jetbrains.annotations.Nullable
        public java.lang.Object call(@org.jetbrains.annotations.NotNull java.lang.Object[] r5) {
                r4 = this;
                java.lang.String r0 = "args"
                kotlin.jvm.internal.g0.p(r5, r0)
                r4.e(r5)
                r0 = 0
                r1 = r5[r0]
                kotlin.reflect.jvm.internal.calls.h$d r2 = kotlin.reflect.jvm.internal.calls.h.e
                int r2 = r5.length
                r3 = 1
                if (r2 > r3) goto L14
                java.lang.Object[] r5 = new java.lang.Object[r0]
                goto L19
            L14:
                int r0 = r5.length
                java.lang.Object[] r5 = kotlin.collections.n.l1(r5, r3, r0)
            L19:
                java.lang.Object r5 = r4.d(r1, r5)
                return r5
        }
    }

    private j(java.lang.reflect.Method r1, java.util.List<? extends java.lang.reflect.Type> r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            java.lang.Class r1 = r1.getReturnType()
            java.lang.String r2 = "getReturnType(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            r0.c = r1
            return
    }

    public /* synthetic */ j(java.lang.reflect.Method r1, java.util.List r2, kotlin.jvm.internal.v r3) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // kotlin.reflect.jvm.internal.calls.g
    public boolean a() {
            r1 = this;
            boolean r0 = r1.g()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.calls.g
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.reflect.Type> b() {
            r1 = this;
            java.util.List<java.lang.reflect.Type> r0 = r1.b
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.calls.g
    public /* bridge */ /* synthetic */ java.lang.reflect.Method c() {
            r1 = this;
            java.lang.reflect.Method r0 = r1.h()
            return r0
    }

    @org.jetbrains.annotations.Nullable
    protected final java.lang.Object d(@org.jetbrains.annotations.Nullable java.lang.Object r3, @org.jetbrains.annotations.NotNull java.lang.Object[] r4) {
            r2 = this;
            java.lang.String r0 = "args"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.reflect.Method r0 = r2.a
            int r1 = r4.length
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r1)
            java.lang.Object r3 = r0.invoke(r3, r4)
            return r3
    }

    public void e(@org.jetbrains.annotations.NotNull java.lang.Object[] r1) {
            r0 = this;
            r0.f(r1)
            return
    }

    public void f(java.lang.Object[] r4) {
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

    public boolean g() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.calls.g
    @org.jetbrains.annotations.NotNull
    public final java.lang.reflect.Type getReturnType() {
            r1 = this;
            java.lang.reflect.Type r0 = r1.c
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.reflect.Method h() {
            r1 = this;
            r0 = 0
            return r0
    }
}

package kotlinx.coroutines.selects;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class f implements kotlinx.coroutines.selects.e {

    @org.jetbrains.annotations.NotNull
    private final java.lang.Object a;

    @org.jetbrains.annotations.NotNull
    private final kotlin.jvm.functions.Function3<java.lang.Object, kotlinx.coroutines.selects.m<?>, java.lang.Object, kotlin.n1> b;

    @org.jetbrains.annotations.Nullable
    private final kotlin.jvm.functions.Function3<kotlinx.coroutines.selects.m<?>, java.lang.Object, java.lang.Object, kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.n1>> c;

    @org.jetbrains.annotations.NotNull
    private final kotlin.jvm.functions.Function3<java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object> d;

    public f(@org.jetbrains.annotations.NotNull java.lang.Object r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function3<java.lang.Object, ? super kotlinx.coroutines.selects.m<?>, java.lang.Object, kotlin.n1> r2, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function3<? super kotlinx.coroutines.selects.m<?>, java.lang.Object, java.lang.Object, ? extends kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.n1>> r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            kotlin.jvm.functions.Function3 r1 = kotlinx.coroutines.selects.o.f()
            r0.d = r1
            return
    }

    public /* synthetic */ f(java.lang.Object r1, kotlin.jvm.functions.Function3 r2, kotlin.jvm.functions.Function3 r3, int r4, kotlin.jvm.internal.v r5) {
            r0 = this;
            r4 = r4 & 4
            if (r4 == 0) goto L5
            r3 = 0
        L5:
            r0.<init>(r1, r2, r3)
            return
    }

    @Override // kotlinx.coroutines.selects.k
    @org.jetbrains.annotations.Nullable
    public kotlin.jvm.functions.Function3<kotlinx.coroutines.selects.m<?>, java.lang.Object, java.lang.Object, kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.n1>> a() {
            r1 = this;
            kotlin.jvm.functions.Function3<kotlinx.coroutines.selects.m<?>, java.lang.Object, java.lang.Object, kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.n1>> r0 = r1.c
            return r0
    }

    @Override // kotlinx.coroutines.selects.k
    @org.jetbrains.annotations.NotNull
    public kotlin.jvm.functions.Function3<java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object> b() {
            r1 = this;
            kotlin.jvm.functions.Function3<java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object> r0 = r1.d
            return r0
    }

    @Override // kotlinx.coroutines.selects.k
    @org.jetbrains.annotations.NotNull
    public kotlin.jvm.functions.Function3<java.lang.Object, kotlinx.coroutines.selects.m<?>, java.lang.Object, kotlin.n1> c() {
            r1 = this;
            kotlin.jvm.functions.Function3<java.lang.Object, kotlinx.coroutines.selects.m<?>, java.lang.Object, kotlin.n1> r0 = r1.b
            return r0
    }

    @Override // kotlinx.coroutines.selects.k
    @org.jetbrains.annotations.NotNull
    public java.lang.Object d() {
            r1 = this;
            java.lang.Object r0 = r1.a
            return r0
    }
}

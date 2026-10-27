package kotlinx.coroutines;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nThreadContextElement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThreadContextElement.kt\nkotlinx/coroutines/ThreadContextElementKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,288:1\n266#1:289\n1#2:290\n*S KotlinDebug\n*F\n+ 1 ThreadContextElement.kt\nkotlinx/coroutines/ThreadContextElementKt\n*L\n287#1:289\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class f3 {
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.e3<T> a(@org.jetbrains.annotations.NotNull java.lang.ThreadLocal<T> r1, T r2) {
            kotlinx.coroutines.internal.z0 r0 = new kotlinx.coroutines.internal.z0
            r0.<init>(r2, r1)
            return r0
    }

    public static /* synthetic */ kotlinx.coroutines.e3 b(java.lang.ThreadLocal r0, java.lang.Object r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L8
            java.lang.Object r1 = r0.get()
        L8:
            kotlinx.coroutines.e3 r0 = a(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public static final java.lang.Object c(@org.jetbrains.annotations.NotNull java.lang.ThreadLocal<?> r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r3) {
            kotlin.coroutines.i r0 = r3.getContext()
            kotlinx.coroutines.internal.a1 r1 = new kotlinx.coroutines.internal.a1
            r1.<init>(r2)
            kotlin.coroutines.i$b r0 = r0.get(r1)
            if (r0 == 0) goto L12
            kotlin.n1 r2 = kotlin.n1.a
            return r2
        L12:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "ThreadLocal "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = " is missing from context "
            r0.append(r2)
            kotlin.coroutines.i r2 = r3.getContext()
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r2 = r2.toString()
            r3.<init>(r2)
            throw r3
    }

    private static final java.lang.Object d(java.lang.ThreadLocal<?> r0, kotlin.coroutines.e<? super kotlin.n1> r1) {
            r0 = 3
            kotlin.jvm.internal.d0.e(r0)
            r0 = 0
            throw r0
    }

    @org.jetbrains.annotations.Nullable
    public static final java.lang.Object e(@org.jetbrains.annotations.NotNull java.lang.ThreadLocal<?> r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super java.lang.Boolean> r2) {
            kotlin.coroutines.i r2 = r2.getContext()
            kotlinx.coroutines.internal.a1 r0 = new kotlinx.coroutines.internal.a1
            r0.<init>(r1)
            kotlin.coroutines.i$b r1 = r2.get(r0)
            if (r1 == 0) goto L11
            r1 = 1
            goto L12
        L11:
            r1 = 0
        L12:
            java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.a.a(r1)
            return r1
    }

    private static final java.lang.Object f(java.lang.ThreadLocal<?> r0, kotlin.coroutines.e<? super java.lang.Boolean> r1) {
            r0 = 3
            kotlin.jvm.internal.d0.e(r0)
            r0 = 0
            throw r0
    }
}

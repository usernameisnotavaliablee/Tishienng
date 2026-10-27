package kotlinx.coroutines;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlinx.coroutines.InternalCoroutinesApi
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public interface z0 {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nDelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/Delay$DefaultImpls\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,162:1\n314#2,11:163\n*S KotlinDebug\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/Delay$DefaultImpls\n*L\n30#1:163,11\n*E\n"})
    public static final class a {
        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
        @org.jetbrains.annotations.Nullable
        public static java.lang.Object a(@org.jetbrains.annotations.NotNull kotlinx.coroutines.z0 r3, long r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r6) {
                r0 = 0
                int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r2 > 0) goto L9
                kotlin.n1 r3 = kotlin.n1.a
                return r3
            L9:
                kotlinx.coroutines.q r0 = new kotlinx.coroutines.q
                kotlin.coroutines.e r1 = kotlin.coroutines.intrinsics.a.e(r6)
                r2 = 1
                r0.<init>(r1, r2)
                r0.Q()
                r3.i(r4, r0)
                java.lang.Object r3 = r0.x()
                java.lang.Object r4 = kotlin.coroutines.intrinsics.a.l()
                if (r3 != r4) goto L26
                kotlin.coroutines.jvm.internal.e.c(r6)
            L26:
                java.lang.Object r4 = kotlin.coroutines.intrinsics.a.l()
                if (r3 != r4) goto L2d
                return r3
            L2d:
                kotlin.n1 r3 = kotlin.n1.a
                return r3
        }

        @org.jetbrains.annotations.NotNull
        public static kotlinx.coroutines.j1 b(@org.jetbrains.annotations.NotNull kotlinx.coroutines.z0 r0, long r1, @org.jetbrains.annotations.NotNull java.lang.Runnable r3, @org.jetbrains.annotations.NotNull kotlin.coroutines.i r4) {
                kotlinx.coroutines.z0 r0 = kotlinx.coroutines.w0.a()
                kotlinx.coroutines.j1 r0 = r0.m(r1, r3, r4)
                return r0
        }
    }

    void i(long r1, @org.jetbrains.annotations.NotNull kotlinx.coroutines.p<? super kotlin.n1> r3);

    @org.jetbrains.annotations.NotNull
    kotlinx.coroutines.j1 m(long r1, @org.jetbrains.annotations.NotNull java.lang.Runnable r3, @org.jetbrains.annotations.NotNull kotlin.coroutines.i r4);

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
    @org.jetbrains.annotations.Nullable
    java.lang.Object r(long r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r3);
}

package kotlinx.coroutines;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nCompletableDeferred.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CompletableDeferred.kt\nkotlinx/coroutines/CompletableDeferredKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,94:1\n1#2:95\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class a0 {
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.y<T> a(T r2) {
            kotlinx.coroutines.z r0 = new kotlinx.coroutines.z
            r1 = 0
            r0.<init>(r1)
            r0.p(r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.y<T> b(@org.jetbrains.annotations.Nullable kotlinx.coroutines.e2 r1) {
            kotlinx.coroutines.z r0 = new kotlinx.coroutines.z
            r0.<init>(r1)
            return r0
    }

    public static /* synthetic */ kotlinx.coroutines.y c(kotlinx.coroutines.e2 r0, int r1, java.lang.Object r2) {
            r1 = r1 & 1
            if (r1 == 0) goto L5
            r0 = 0
        L5:
            kotlinx.coroutines.y r0 = b(r0)
            return r0
    }

    public static final <T> boolean d(@org.jetbrains.annotations.NotNull kotlinx.coroutines.y<T> r1, @org.jetbrains.annotations.NotNull java.lang.Object r2) {
            java.lang.Throwable r0 = kotlin.Result.m14exceptionOrNullimpl(r2)
            if (r0 != 0) goto Lb
            boolean r1 = r1.p(r2)
            return r1
        Lb:
            boolean r1 = r1.c(r0)
            return r1
    }
}

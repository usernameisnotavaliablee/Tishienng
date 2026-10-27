package androidx.activity.contextaware;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nContextAware.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContextAware.kt\nandroidx/activity/contextaware/ContextAwareKt\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,94:1\n314#2,11:95\n*S KotlinDebug\n*F\n+ 1 ContextAware.kt\nandroidx/activity/contextaware/ContextAwareKt\n*L\n81#1:95,11\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class ContextAwareKt {
    @org.jetbrains.annotations.Nullable
    public static final <R> java.lang.Object withContextAvailable(@org.jetbrains.annotations.NotNull androidx.activity.contextaware.ContextAware r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<android.content.Context, R> r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<R> r5) {
            android.content.Context r0 = r3.peekAvailableContext()
            if (r0 == 0) goto Lb
            java.lang.Object r3 = r4.invoke(r0)
            return r3
        Lb:
            kotlinx.coroutines.q r0 = new kotlinx.coroutines.q
            kotlin.coroutines.e r1 = kotlin.coroutines.intrinsics.a.e(r5)
            r2 = 1
            r0.<init>(r1, r2)
            r0.Q()
            androidx.activity.contextaware.ContextAwareKt$withContextAvailable$2$listener$1 r1 = new androidx.activity.contextaware.ContextAwareKt$withContextAvailable$2$listener$1
            r1.<init>(r0, r4)
            r3.addOnContextAvailableListener(r1)
            androidx.activity.contextaware.ContextAwareKt$withContextAvailable$2$1 r4 = new androidx.activity.contextaware.ContextAwareKt$withContextAvailable$2$1
            r4.<init>(r3, r1)
            r0.I(r4)
            java.lang.Object r3 = r0.x()
            java.lang.Object r4 = kotlin.coroutines.intrinsics.a.l()
            if (r3 != r4) goto L35
            kotlin.coroutines.jvm.internal.e.c(r5)
        L35:
            return r3
    }

    private static final <R> java.lang.Object withContextAvailable$$forInline(androidx.activity.contextaware.ContextAware r3, kotlin.jvm.functions.Function1<android.content.Context, R> r4, kotlin.coroutines.e<R> r5) {
            android.content.Context r0 = r3.peekAvailableContext()
            if (r0 == 0) goto Lb
            java.lang.Object r3 = r4.invoke(r0)
            return r3
        Lb:
            r0 = 0
            kotlin.jvm.internal.d0.e(r0)
            kotlinx.coroutines.q r0 = new kotlinx.coroutines.q
            kotlin.coroutines.e r1 = kotlin.coroutines.intrinsics.a.e(r5)
            r2 = 1
            r0.<init>(r1, r2)
            r0.Q()
            androidx.activity.contextaware.ContextAwareKt$withContextAvailable$2$listener$1 r1 = new androidx.activity.contextaware.ContextAwareKt$withContextAvailable$2$listener$1
            r1.<init>(r0, r4)
            r3.addOnContextAvailableListener(r1)
            androidx.activity.contextaware.ContextAwareKt$withContextAvailable$2$1 r4 = new androidx.activity.contextaware.ContextAwareKt$withContextAvailable$2$1
            r4.<init>(r3, r1)
            r0.I(r4)
            kotlin.n1 r3 = kotlin.n1.a
            java.lang.Object r3 = r0.x()
            java.lang.Object r4 = kotlin.coroutines.intrinsics.a.l()
            if (r3 != r4) goto L3b
            kotlin.coroutines.jvm.internal.e.c(r5)
        L3b:
            kotlin.jvm.internal.d0.e(r2)
            return r3
    }
}

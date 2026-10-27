package androidx.work;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class ListenableFutureKt {
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    @org.jetbrains.annotations.Nullable
    public static final <R> java.lang.Object await(@org.jetbrains.annotations.NotNull com.google.common.util.concurrent.ListenableFuture<R> r3, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super R> r4) {
            boolean r0 = r3.isDone()
            if (r0 == 0) goto L15
            java.lang.Object r3 = r3.get()     // Catch: java.util.concurrent.ExecutionException -> Lb
            return r3
        Lb:
            r3 = move-exception
            java.lang.Throwable r4 = r3.getCause()
            if (r4 != 0) goto L13
            goto L14
        L13:
            r3 = r4
        L14:
            throw r3
        L15:
            kotlinx.coroutines.q r0 = new kotlinx.coroutines.q
            kotlin.coroutines.e r1 = kotlin.coroutines.intrinsics.a.e(r4)
            r2 = 1
            r0.<init>(r1, r2)
            r0.Q()
            androidx.work.ListenableFutureKt$await$2$1 r1 = new androidx.work.ListenableFutureKt$await$2$1
            r1.<init>(r0, r3)
            androidx.work.DirectExecutor r2 = androidx.work.DirectExecutor.INSTANCE
            r3.addListener(r1, r2)
            java.lang.Object r3 = r0.x()
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
            if (r3 != r0) goto L39
            kotlin.coroutines.jvm.internal.e.c(r4)
        L39:
            return r3
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    private static final <R> java.lang.Object await$$forInline(com.google.common.util.concurrent.ListenableFuture<R> r4, kotlin.coroutines.e<? super R> r5) {
            boolean r0 = r4.isDone()
            if (r0 == 0) goto L15
            java.lang.Object r4 = r4.get()     // Catch: java.util.concurrent.ExecutionException -> Lb
            return r4
        Lb:
            r4 = move-exception
            java.lang.Throwable r5 = r4.getCause()
            if (r5 != 0) goto L13
            goto L14
        L13:
            r4 = r5
        L14:
            throw r4
        L15:
            r0 = 0
            kotlin.jvm.internal.d0.e(r0)
            kotlinx.coroutines.q r0 = new kotlinx.coroutines.q
            kotlin.coroutines.e r1 = kotlin.coroutines.intrinsics.a.e(r5)
            r2 = 1
            r0.<init>(r1, r2)
            r0.Q()
            androidx.work.ListenableFutureKt$await$2$1 r1 = new androidx.work.ListenableFutureKt$await$2$1
            r1.<init>(r0, r4)
            androidx.work.DirectExecutor r3 = androidx.work.DirectExecutor.INSTANCE
            r4.addListener(r1, r3)
            java.lang.Object r4 = r0.x()
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
            if (r4 != r0) goto L3d
            kotlin.coroutines.jvm.internal.e.c(r5)
        L3d:
            kotlin.jvm.internal.d0.e(r2)
            return r4
    }
}

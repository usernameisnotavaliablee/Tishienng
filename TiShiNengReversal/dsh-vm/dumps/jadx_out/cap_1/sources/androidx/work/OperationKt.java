package androidx.work;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class OperationKt {
    @org.jetbrains.annotations.Nullable
    public static final java.lang.Object await(@org.jetbrains.annotations.NotNull androidx.work.Operation r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super androidx.work.Operation.State.SUCCESS> r5) {
            boolean r0 = r5 instanceof androidx.work.OperationKt$await$1
            if (r0 == 0) goto L13
            r0 = r5
            androidx.work.OperationKt$await$1 r0 = (androidx.work.OperationKt$await$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.work.OperationKt$await$1 r0 = new androidx.work.OperationKt$await$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.L$0
            com.google.common.util.concurrent.ListenableFuture r4 = (com.google.common.util.concurrent.ListenableFuture) r4
            kotlin.g0.n(r5)
            goto L80
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.g0.n(r5)
            com.google.common.util.concurrent.ListenableFuture r4 = r4.getResult()
            java.lang.String r5 = "result"
            kotlin.jvm.internal.g0.o(r4, r5)
            boolean r5 = r4.isDone()
            if (r5 == 0) goto L56
            java.lang.Object r4 = r4.get()     // Catch: java.util.concurrent.ExecutionException -> L4c
            goto L81
        L4c:
            r4 = move-exception
            java.lang.Throwable r5 = r4.getCause()
            if (r5 != 0) goto L54
            goto L55
        L54:
            r4 = r5
        L55:
            throw r4
        L56:
            r0.L$0 = r4
            r0.label = r3
            kotlinx.coroutines.q r5 = new kotlinx.coroutines.q
            kotlin.coroutines.e r2 = kotlin.coroutines.intrinsics.a.e(r0)
            r5.<init>(r2, r3)
            r5.Q()
            androidx.work.ListenableFutureKt$await$2$1 r2 = new androidx.work.ListenableFutureKt$await$2$1
            r2.<init>(r5, r4)
            androidx.work.DirectExecutor r3 = androidx.work.DirectExecutor.INSTANCE
            r4.addListener(r2, r3)
            java.lang.Object r5 = r5.x()
            java.lang.Object r4 = kotlin.coroutines.intrinsics.a.l()
            if (r5 != r4) goto L7d
            kotlin.coroutines.jvm.internal.e.c(r0)
        L7d:
            if (r5 != r1) goto L80
            return r1
        L80:
            r4 = r5
        L81:
            java.lang.String r5 = "result.await()"
            kotlin.jvm.internal.g0.o(r4, r5)
            return r4
    }

    private static final java.lang.Object await$$forInline(androidx.work.Operation r4, kotlin.coroutines.e<? super androidx.work.Operation.State.SUCCESS> r5) {
            com.google.common.util.concurrent.ListenableFuture r4 = r4.getResult()
            java.lang.String r0 = "result"
            kotlin.jvm.internal.g0.o(r4, r0)
            boolean r0 = r4.isDone()
            if (r0 == 0) goto L1e
            java.lang.Object r4 = r4.get()     // Catch: java.util.concurrent.ExecutionException -> L14
            goto L49
        L14:
            r4 = move-exception
            java.lang.Throwable r5 = r4.getCause()
            if (r5 != 0) goto L1c
            goto L1d
        L1c:
            r4 = r5
        L1d:
            throw r4
        L1e:
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
            if (r4 != r0) goto L46
            kotlin.coroutines.jvm.internal.e.c(r5)
        L46:
            kotlin.jvm.internal.d0.e(r2)
        L49:
            java.lang.String r5 = "result.await()"
            kotlin.jvm.internal.g0.o(r4, r5)
            return r4
    }
}

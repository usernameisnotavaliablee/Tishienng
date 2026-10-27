package androidx.room;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.room.TriggerBasedInvalidationTracker$refreshInvalidationAsync$3", f = "InvalidationTracker.kt", i = {}, l = {389}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class TriggerBasedInvalidationTracker$refreshInvalidationAsync$3 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.r0, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.n1> $onRefreshCompleted;
    int label;
    final /* synthetic */ androidx.room.TriggerBasedInvalidationTracker this$0;

    TriggerBasedInvalidationTracker$refreshInvalidationAsync$3(androidx.room.TriggerBasedInvalidationTracker r1, kotlin.jvm.functions.Function0<kotlin.n1> r2, kotlin.coroutines.e<? super androidx.room.TriggerBasedInvalidationTracker$refreshInvalidationAsync$3> r3) {
            r0 = this;
            r0.this$0 = r1
            r0.$onRefreshCompleted = r2
            r1 = 2
            r0.<init>(r1, r3)
            return
    }

    public final kotlin.coroutines.e<kotlin.n1> create(java.lang.Object r3, kotlin.coroutines.e<?> r4) {
            r2 = this;
            androidx.room.TriggerBasedInvalidationTracker$refreshInvalidationAsync$3 r3 = new androidx.room.TriggerBasedInvalidationTracker$refreshInvalidationAsync$3
            androidx.room.TriggerBasedInvalidationTracker r0 = r2.this$0
            kotlin.jvm.functions.Function0<kotlin.n1> r1 = r2.$onRefreshCompleted
            r3.<init>(r0, r1, r4)
            return r3
    }

    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            kotlinx.coroutines.r0 r1 = (kotlinx.coroutines.r0) r1
            kotlin.coroutines.e r2 = (kotlin.coroutines.e) r2
            java.lang.Object r1 = r0.invoke(r1, r2)
            return r1
    }

    public final java.lang.Object invoke(kotlinx.coroutines.r0 r1, kotlin.coroutines.e<? super kotlin.n1> r2) {
            r0 = this;
            kotlin.coroutines.e r1 = r0.create(r1, r2)
            androidx.room.TriggerBasedInvalidationTracker$refreshInvalidationAsync$3 r1 = (androidx.room.TriggerBasedInvalidationTracker$refreshInvalidationAsync$3) r1
            kotlin.n1 r2 = kotlin.n1.a
            java.lang.Object r1 = r1.invokeSuspend(r2)
            return r1
    }

    public final java.lang.Object invokeSuspend(java.lang.Object r4) {
            r3 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
            int r1 = r3.label
            r2 = 1
            if (r1 == 0) goto L19
            if (r1 != r2) goto L11
            kotlin.g0.n(r4)     // Catch: java.lang.Throwable -> Lf
            goto L27
        Lf:
            r4 = move-exception
            goto L31
        L11:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r0)
            throw r4
        L19:
            kotlin.g0.n(r4)
            androidx.room.TriggerBasedInvalidationTracker r4 = r3.this$0     // Catch: java.lang.Throwable -> Lf
            r3.label = r2     // Catch: java.lang.Throwable -> Lf
            java.lang.Object r4 = androidx.room.TriggerBasedInvalidationTracker.access$notifyInvalidation(r4, r3)     // Catch: java.lang.Throwable -> Lf
            if (r4 != r0) goto L27
            return r0
        L27:
            java.util.Set r4 = (java.util.Set) r4     // Catch: java.lang.Throwable -> Lf
            kotlin.jvm.functions.Function0<kotlin.n1> r4 = r3.$onRefreshCompleted
            r4.invoke()
            kotlin.n1 r4 = kotlin.n1.a
            return r4
        L31:
            kotlin.jvm.functions.Function0<kotlin.n1> r0 = r3.$onRefreshCompleted
            r0.invoke()
            throw r4
    }
}

package androidx.room;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.room.MultiInstanceInvalidationClient$invalidationCallback$1$onInvalidation$1", f = "MultiInstanceInvalidationClient.android.kt", i = {0}, l = {87}, m = "invokeSuspend", n = {"invalidatedTablesSet"}, s = {"L$0"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class MultiInstanceInvalidationClient$invalidationCallback$1$onInvalidation$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.r0, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
    final /* synthetic */ java.lang.String[] $tables;
    java.lang.Object L$0;
    int label;
    final /* synthetic */ androidx.room.MultiInstanceInvalidationClient this$0;

    MultiInstanceInvalidationClient$invalidationCallback$1$onInvalidation$1(java.lang.String[] r1, androidx.room.MultiInstanceInvalidationClient r2, kotlin.coroutines.e<? super androidx.room.MultiInstanceInvalidationClient$invalidationCallback$1$onInvalidation$1> r3) {
            r0 = this;
            r0.$tables = r1
            r0.this$0 = r2
            r1 = 2
            r0.<init>(r1, r3)
            return
    }

    public final kotlin.coroutines.e<kotlin.n1> create(java.lang.Object r3, kotlin.coroutines.e<?> r4) {
            r2 = this;
            androidx.room.MultiInstanceInvalidationClient$invalidationCallback$1$onInvalidation$1 r3 = new androidx.room.MultiInstanceInvalidationClient$invalidationCallback$1$onInvalidation$1
            java.lang.String[] r0 = r2.$tables
            androidx.room.MultiInstanceInvalidationClient r1 = r2.this$0
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
            androidx.room.MultiInstanceInvalidationClient$invalidationCallback$1$onInvalidation$1 r1 = (androidx.room.MultiInstanceInvalidationClient$invalidationCallback$1$onInvalidation$1) r1
            kotlin.n1 r2 = kotlin.n1.a
            java.lang.Object r1 = r1.invokeSuspend(r2)
            return r1
    }

    public final java.lang.Object invokeSuspend(java.lang.Object r4) {
            r3 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
            int r1 = r3.label
            r2 = 1
            if (r1 == 0) goto L1b
            if (r1 != r2) goto L13
            java.lang.Object r0 = r3.L$0
            java.util.Set r0 = (java.util.Set) r0
            kotlin.g0.n(r4)
            goto L3b
        L13:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r0)
            throw r4
        L1b:
            kotlin.g0.n(r4)
            java.lang.String[] r4 = r3.$tables
            int r1 = r4.length
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r1)
            java.util.Set r4 = kotlin.collections.u1.u(r4)
            androidx.room.MultiInstanceInvalidationClient r1 = r3.this$0
            kotlinx.coroutines.flow.s r1 = androidx.room.MultiInstanceInvalidationClient.access$getInvalidatedTables$p(r1)
            r3.L$0 = r4
            r3.label = r2
            java.lang.Object r1 = r1.emit(r4, r3)
            if (r1 != r0) goto L3a
            return r0
        L3a:
            r0 = r4
        L3b:
            androidx.room.MultiInstanceInvalidationClient r4 = r3.this$0
            androidx.room.InvalidationTracker r4 = r4.getInvalidationTracker()
            r4.notifyObserversByTableNames$room_runtime_release(r0)
            kotlin.n1 r4 = kotlin.n1.a
            return r4
    }
}

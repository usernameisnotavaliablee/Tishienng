package androidx.room.support;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.room.support.QueryInterceptorDatabase$beginTransactionWithListenerNonExclusive$1", f = "QueryInterceptorDatabase.android.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class QueryInterceptorDatabase$beginTransactionWithListenerNonExclusive$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.r0, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
    int label;
    final /* synthetic */ androidx.room.support.QueryInterceptorDatabase this$0;

    QueryInterceptorDatabase$beginTransactionWithListenerNonExclusive$1(androidx.room.support.QueryInterceptorDatabase r1, kotlin.coroutines.e<? super androidx.room.support.QueryInterceptorDatabase$beginTransactionWithListenerNonExclusive$1> r2) {
            r0 = this;
            r0.this$0 = r1
            r1 = 2
            r0.<init>(r1, r2)
            return
    }

    public final kotlin.coroutines.e<kotlin.n1> create(java.lang.Object r2, kotlin.coroutines.e<?> r3) {
            r1 = this;
            androidx.room.support.QueryInterceptorDatabase$beginTransactionWithListenerNonExclusive$1 r2 = new androidx.room.support.QueryInterceptorDatabase$beginTransactionWithListenerNonExclusive$1
            androidx.room.support.QueryInterceptorDatabase r0 = r1.this$0
            r2.<init>(r0, r3)
            return r2
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
            androidx.room.support.QueryInterceptorDatabase$beginTransactionWithListenerNonExclusive$1 r1 = (androidx.room.support.QueryInterceptorDatabase$beginTransactionWithListenerNonExclusive$1) r1
            kotlin.n1 r2 = kotlin.n1.a
            java.lang.Object r1 = r1.invokeSuspend(r2)
            return r1
    }

    public final java.lang.Object invokeSuspend(java.lang.Object r3) {
            r2 = this;
            kotlin.coroutines.intrinsics.a.l()
            int r0 = r2.label
            if (r0 != 0) goto L1c
            kotlin.g0.n(r3)
            androidx.room.support.QueryInterceptorDatabase r3 = r2.this$0
            androidx.room.RoomDatabase$QueryCallback r3 = androidx.room.support.QueryInterceptorDatabase.access$getQueryCallback$p(r3)
            java.lang.String r0 = "BEGIN IMMEDIATE TRANSACTION"
            java.util.List r1 = kotlin.collections.f0.J()
            r3.onQuery(r0, r1)
            kotlin.n1 r3 = kotlin.n1.a
            return r3
        L1c:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r3.<init>(r0)
            throw r3
    }
}

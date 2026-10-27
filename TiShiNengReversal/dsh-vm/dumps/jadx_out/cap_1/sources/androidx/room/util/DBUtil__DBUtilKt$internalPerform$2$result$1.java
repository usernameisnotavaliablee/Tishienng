package androidx.room.util;

/* JADX INFO: Add missing generic type declarations: [R] */
/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.room.util.DBUtil__DBUtilKt$internalPerform$2$result$1", f = "DBUtil.kt", i = {}, l = {59}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class DBUtil__DBUtilKt$internalPerform$2$result$1<R> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.room.TransactionScope<R>, kotlin.coroutines.e<? super R>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function2<androidx.room.PooledConnection, kotlin.coroutines.e<? super R>, java.lang.Object> $block;
    private /* synthetic */ java.lang.Object L$0;
    int label;

    public DBUtil__DBUtilKt$internalPerform$2$result$1(kotlin.jvm.functions.Function2<? super androidx.room.PooledConnection, ? super kotlin.coroutines.e<? super R>, ? extends java.lang.Object> r1, kotlin.coroutines.e<? super androidx.room.util.DBUtil__DBUtilKt$internalPerform$2$result$1> r2) {
            r0 = this;
            r0.$block = r1
            r1 = 2
            r0.<init>(r1, r2)
            return
    }

    public final kotlin.coroutines.e<kotlin.n1> create(java.lang.Object r3, kotlin.coroutines.e<?> r4) {
            r2 = this;
            androidx.room.util.DBUtil__DBUtilKt$internalPerform$2$result$1 r0 = new androidx.room.util.DBUtil__DBUtilKt$internalPerform$2$result$1
            kotlin.jvm.functions.Function2<androidx.room.PooledConnection, kotlin.coroutines.e<? super R>, java.lang.Object> r1 = r2.$block
            r0.<init>(r1, r4)
            r0.L$0 = r3
            return r0
    }

    public final java.lang.Object invoke(androidx.room.TransactionScope<R> r1, kotlin.coroutines.e<? super R> r2) {
            r0 = this;
            kotlin.coroutines.e r1 = r0.create(r1, r2)
            androidx.room.util.DBUtil__DBUtilKt$internalPerform$2$result$1 r1 = (androidx.room.util.DBUtil__DBUtilKt$internalPerform$2$result$1) r1
            kotlin.n1 r2 = kotlin.n1.a
            java.lang.Object r1 = r1.invokeSuspend(r2)
            return r1
    }

    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            androidx.room.TransactionScope r1 = (androidx.room.TransactionScope) r1
            kotlin.coroutines.e r2 = (kotlin.coroutines.e) r2
            java.lang.Object r1 = r0.invoke(r1, r2)
            return r1
    }

    public final java.lang.Object invokeSuspend(java.lang.Object r4) {
            r3 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
            int r1 = r3.label
            r2 = 1
            if (r1 == 0) goto L17
            if (r1 != r2) goto Lf
            kotlin.g0.n(r4)
            return r4
        Lf:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r0)
            throw r4
        L17:
            kotlin.g0.n(r4)
            java.lang.Object r4 = r3.L$0
            androidx.room.TransactionScope r4 = (androidx.room.TransactionScope) r4
            kotlin.jvm.functions.Function2<androidx.room.PooledConnection, kotlin.coroutines.e<? super R>, java.lang.Object> r1 = r3.$block
            r3.label = r2
            java.lang.Object r4 = r1.invoke(r4, r3)
            if (r4 != r0) goto L29
            return r0
        L29:
            return r4
    }

    public final java.lang.Object invokeSuspend$$forInline(java.lang.Object r2) {
            r1 = this;
            java.lang.Object r2 = r1.L$0
            androidx.room.TransactionScope r2 = (androidx.room.TransactionScope) r2
            kotlin.jvm.functions.Function2<androidx.room.PooledConnection, kotlin.coroutines.e<? super R>, java.lang.Object> r0 = r1.$block
            java.lang.Object r2 = r0.invoke(r2, r1)
            return r2
    }
}

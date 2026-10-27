package androidx.room.util;

/* JADX INFO: Add missing generic type declarations: [R] */
/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$2", f = "DBUtil.android.kt", i = {}, l = {247}, m = "invokeSuspend", n = {}, s = {})
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nDBUtil.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DBUtil.android.kt\nandroidx/room/util/DBUtil__DBUtil_androidKt$performInTransactionSuspending$2\n+ 2 DBUtil.kt\nandroidx/room/util/DBUtil__DBUtilKt\n*L\n1#1,246:1\n48#2:247\n67#2:248\n*S KotlinDebug\n*F\n+ 1 DBUtil.android.kt\nandroidx/room/util/DBUtil__DBUtil_androidKt$performInTransactionSuspending$2\n*L\n91#1:247\n91#1:248\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class DBUtil__DBUtil_androidKt$performInTransactionSuspending$2<R> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.e<? super R>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function1<kotlin.coroutines.e<? super R>, java.lang.Object> $block;
    final /* synthetic */ androidx.room.RoomDatabase $db;
    int label;

    DBUtil__DBUtil_androidKt$performInTransactionSuspending$2(androidx.room.RoomDatabase r1, kotlin.jvm.functions.Function1<? super kotlin.coroutines.e<? super R>, ? extends java.lang.Object> r2, kotlin.coroutines.e<? super androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$2> r3) {
            r0 = this;
            r0.$db = r1
            r0.$block = r2
            r1 = 1
            r0.<init>(r1, r3)
            return
    }

    public final kotlin.coroutines.e<kotlin.n1> create(kotlin.coroutines.e<?> r4) {
            r3 = this;
            androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$2 r0 = new androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$2
            androidx.room.RoomDatabase r1 = r3.$db
            kotlin.jvm.functions.Function1<kotlin.coroutines.e<? super R>, java.lang.Object> r2 = r3.$block
            r0.<init>(r1, r2, r4)
            return r0
    }

    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1) {
            r0 = this;
            kotlin.coroutines.e r1 = (kotlin.coroutines.e) r1
            java.lang.Object r1 = r0.invoke(r1)
            return r1
    }

    public final java.lang.Object invoke(kotlin.coroutines.e<? super R> r2) {
            r1 = this;
            kotlin.coroutines.e r2 = r1.create(r2)
            androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$2 r2 = (androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$2) r2
            kotlin.n1 r0 = kotlin.n1.a
            java.lang.Object r2 = r2.invokeSuspend(r0)
            return r2
    }

    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            r9 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
            int r1 = r9.label
            r2 = 1
            if (r1 == 0) goto L17
            if (r1 != r2) goto Lf
            kotlin.g0.n(r10)
            return r10
        Lf:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L17:
            kotlin.g0.n(r10)
            androidx.room.RoomDatabase r6 = r9.$db
            kotlin.jvm.functions.Function1<kotlin.coroutines.e<? super R>, java.lang.Object> r8 = r9.$block
            androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$2$invokeSuspend$$inlined$internalPerform$1 r3 = new androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$2$invokeSuspend$$inlined$internalPerform$1
            r5 = 0
            r7 = 0
            r4 = 1
            r3.<init>(r4, r5, r6, r7, r8)
            r9.label = r2
            r10 = 0
            java.lang.Object r10 = r6.useConnection$room_runtime_release(r10, r3, r9)
            if (r10 != r0) goto L30
            return r0
        L30:
            return r10
    }
}

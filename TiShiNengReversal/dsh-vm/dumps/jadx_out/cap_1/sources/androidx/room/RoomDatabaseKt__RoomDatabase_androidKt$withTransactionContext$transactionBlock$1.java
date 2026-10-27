package androidx.room;

/* JADX INFO: Add missing generic type declarations: [R] */
/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.room.RoomDatabaseKt__RoomDatabase_androidKt$withTransactionContext$transactionBlock$1", f = "RoomDatabase.android.kt", i = {0}, l = {2015}, m = "invokeSuspend", n = {"transactionElement"}, s = {"L$0"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class RoomDatabaseKt__RoomDatabase_androidKt$withTransactionContext$transactionBlock$1<R> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.r0, kotlin.coroutines.e<? super R>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function1<kotlin.coroutines.e<? super R>, java.lang.Object> $block;
    private /* synthetic */ java.lang.Object L$0;
    int label;

    RoomDatabaseKt__RoomDatabase_androidKt$withTransactionContext$transactionBlock$1(kotlin.jvm.functions.Function1<? super kotlin.coroutines.e<? super R>, ? extends java.lang.Object> r1, kotlin.coroutines.e<? super androidx.room.RoomDatabaseKt__RoomDatabase_androidKt$withTransactionContext$transactionBlock$1> r2) {
            r0 = this;
            r0.$block = r1
            r1 = 2
            r0.<init>(r1, r2)
            return
    }

    public final kotlin.coroutines.e<kotlin.n1> create(java.lang.Object r3, kotlin.coroutines.e<?> r4) {
            r2 = this;
            androidx.room.RoomDatabaseKt__RoomDatabase_androidKt$withTransactionContext$transactionBlock$1 r0 = new androidx.room.RoomDatabaseKt__RoomDatabase_androidKt$withTransactionContext$transactionBlock$1
            kotlin.jvm.functions.Function1<kotlin.coroutines.e<? super R>, java.lang.Object> r1 = r2.$block
            r0.<init>(r1, r4)
            r0.L$0 = r3
            return r0
    }

    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            kotlinx.coroutines.r0 r1 = (kotlinx.coroutines.r0) r1
            kotlin.coroutines.e r2 = (kotlin.coroutines.e) r2
            java.lang.Object r1 = r0.invoke(r1, r2)
            return r1
    }

    public final java.lang.Object invoke(kotlinx.coroutines.r0 r1, kotlin.coroutines.e<? super R> r2) {
            r0 = this;
            kotlin.coroutines.e r1 = r0.create(r1, r2)
            androidx.room.RoomDatabaseKt__RoomDatabase_androidKt$withTransactionContext$transactionBlock$1 r1 = (androidx.room.RoomDatabaseKt__RoomDatabase_androidKt$withTransactionContext$transactionBlock$1) r1
            kotlin.n1 r2 = kotlin.n1.a
            java.lang.Object r1 = r1.invokeSuspend(r2)
            return r1
    }

    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            r4 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
            int r1 = r4.label
            r2 = 1
            if (r1 == 0) goto L1d
            if (r1 != r2) goto L15
            java.lang.Object r0 = r4.L$0
            androidx.room.TransactionElement r0 = (androidx.room.TransactionElement) r0
            kotlin.g0.n(r5)     // Catch: java.lang.Throwable -> L13
            goto L45
        L13:
            r5 = move-exception
            goto L4d
        L15:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L1d:
            kotlin.g0.n(r5)
            java.lang.Object r5 = r4.L$0
            kotlinx.coroutines.r0 r5 = (kotlinx.coroutines.r0) r5
            kotlin.coroutines.i r5 = r5.getCoroutineContext()
            androidx.room.TransactionElement$Key r1 = androidx.room.TransactionElement.Key
            kotlin.coroutines.i$b r5 = r5.get(r1)
            kotlin.jvm.internal.g0.m(r5)
            androidx.room.TransactionElement r5 = (androidx.room.TransactionElement) r5
            r5.acquire()
            kotlin.jvm.functions.Function1<kotlin.coroutines.e<? super R>, java.lang.Object> r1 = r4.$block     // Catch: java.lang.Throwable -> L49
            r4.L$0 = r5     // Catch: java.lang.Throwable -> L49
            r4.label = r2     // Catch: java.lang.Throwable -> L49
            java.lang.Object r1 = r1.invoke(r4)     // Catch: java.lang.Throwable -> L49
            if (r1 != r0) goto L43
            return r0
        L43:
            r0 = r5
            r5 = r1
        L45:
            r0.release()
            return r5
        L49:
            r0 = move-exception
            r3 = r0
            r0 = r5
            r5 = r3
        L4d:
            r0.release()
            throw r5
    }
}

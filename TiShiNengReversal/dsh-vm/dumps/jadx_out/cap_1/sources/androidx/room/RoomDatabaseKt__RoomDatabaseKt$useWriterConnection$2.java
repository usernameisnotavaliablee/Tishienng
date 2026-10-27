package androidx.room;

/* JADX INFO: Add missing generic type declarations: [R] */
/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.room.RoomDatabaseKt__RoomDatabaseKt$useWriterConnection$2", f = "RoomDatabase.kt", i = {}, l = {496}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class RoomDatabaseKt__RoomDatabaseKt$useWriterConnection$2<R> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.r0, kotlin.coroutines.e<? super R>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function2<androidx.room.Transactor, kotlin.coroutines.e<? super R>, java.lang.Object> $block;
    final /* synthetic */ androidx.room.RoomDatabase $this_useWriterConnection;
    int label;

    RoomDatabaseKt__RoomDatabaseKt$useWriterConnection$2(androidx.room.RoomDatabase r1, kotlin.jvm.functions.Function2<? super androidx.room.Transactor, ? super kotlin.coroutines.e<? super R>, ? extends java.lang.Object> r2, kotlin.coroutines.e<? super androidx.room.RoomDatabaseKt__RoomDatabaseKt$useWriterConnection$2> r3) {
            r0 = this;
            r0.$this_useWriterConnection = r1
            r0.$block = r2
            r1 = 2
            r0.<init>(r1, r3)
            return
    }

    public final kotlin.coroutines.e<kotlin.n1> create(java.lang.Object r3, kotlin.coroutines.e<?> r4) {
            r2 = this;
            androidx.room.RoomDatabaseKt__RoomDatabaseKt$useWriterConnection$2 r3 = new androidx.room.RoomDatabaseKt__RoomDatabaseKt$useWriterConnection$2
            androidx.room.RoomDatabase r0 = r2.$this_useWriterConnection
            kotlin.jvm.functions.Function2<androidx.room.Transactor, kotlin.coroutines.e<? super R>, java.lang.Object> r1 = r2.$block
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

    public final java.lang.Object invoke(kotlinx.coroutines.r0 r1, kotlin.coroutines.e<? super R> r2) {
            r0 = this;
            kotlin.coroutines.e r1 = r0.create(r1, r2)
            androidx.room.RoomDatabaseKt__RoomDatabaseKt$useWriterConnection$2 r1 = (androidx.room.RoomDatabaseKt__RoomDatabaseKt$useWriterConnection$2) r1
            kotlin.n1 r2 = kotlin.n1.a
            java.lang.Object r1 = r1.invokeSuspend(r2)
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
            androidx.room.RoomDatabase r4 = r3.$this_useWriterConnection
            kotlin.jvm.functions.Function2<androidx.room.Transactor, kotlin.coroutines.e<? super R>, java.lang.Object> r1 = r3.$block
            r3.label = r2
            r2 = 0
            java.lang.Object r4 = r4.useConnection$room_runtime_release(r2, r1, r3)
            if (r4 != r0) goto L28
            return r0
        L28:
            return r4
    }
}

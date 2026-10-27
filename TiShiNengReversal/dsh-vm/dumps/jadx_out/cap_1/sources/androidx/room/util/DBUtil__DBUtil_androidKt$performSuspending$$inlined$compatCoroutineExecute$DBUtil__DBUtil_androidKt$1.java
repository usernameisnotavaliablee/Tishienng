package androidx.room.util;

/* JADX INFO: Add missing generic type declarations: [R] */
/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performSuspending$$inlined$compatCoroutineExecute$DBUtil__DBUtil_androidKt$1", f = "DBUtil.android.kt", i = {}, l = {113}, m = "invokeSuspend", n = {}, s = {})
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nDBUtil.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DBUtil.android.kt\nandroidx/room/util/DBUtil__DBUtil_androidKt$compatCoroutineExecute$2\n+ 2 DBUtil.android.kt\nandroidx/room/util/DBUtil__DBUtil_androidKt\n+ 3 DBUtil.kt\nandroidx/room/util/DBUtil__DBUtilKt\n*L\n1#1,111:1\n53#2:112\n56#2:115\n48#3:113\n67#3:114\n*S KotlinDebug\n*F\n+ 1 DBUtil.android.kt\nandroidx/room/util/DBUtil__DBUtil_androidKt\n*L\n53#1:113\n53#1:114\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class DBUtil__DBUtil_androidKt$performSuspending$$inlined$compatCoroutineExecute$DBUtil__DBUtil_androidKt$1<R> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.r0, kotlin.coroutines.e<? super R>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function1 $block$inlined;
    final /* synthetic */ androidx.room.RoomDatabase $db$inlined;
    final /* synthetic */ boolean $inTransaction$inlined;
    final /* synthetic */ boolean $isReadOnly$inlined;
    int label;

    public DBUtil__DBUtil_androidKt$performSuspending$$inlined$compatCoroutineExecute$DBUtil__DBUtil_androidKt$1(kotlin.coroutines.e r1, androidx.room.RoomDatabase r2, boolean r3, boolean r4, kotlin.jvm.functions.Function1 r5) {
            r0 = this;
            r0.$db$inlined = r2
            r0.$isReadOnly$inlined = r3
            r0.$inTransaction$inlined = r4
            r0.$block$inlined = r5
            r2 = 2
            r0.<init>(r2, r1)
            return
    }

    public final kotlin.coroutines.e<kotlin.n1> create(java.lang.Object r7, kotlin.coroutines.e<?> r8) {
            r6 = this;
            androidx.room.util.DBUtil__DBUtil_androidKt$performSuspending$$inlined$compatCoroutineExecute$DBUtil__DBUtil_androidKt$1 r0 = new androidx.room.util.DBUtil__DBUtil_androidKt$performSuspending$$inlined$compatCoroutineExecute$DBUtil__DBUtil_androidKt$1
            androidx.room.RoomDatabase r2 = r6.$db$inlined
            boolean r3 = r6.$isReadOnly$inlined
            boolean r4 = r6.$inTransaction$inlined
            kotlin.jvm.functions.Function1 r5 = r6.$block$inlined
            r1 = r8
            r0.<init>(r1, r2, r3, r4, r5)
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
            androidx.room.util.DBUtil__DBUtil_androidKt$performSuspending$$inlined$compatCoroutineExecute$DBUtil__DBUtil_androidKt$1 r1 = (androidx.room.util.DBUtil__DBUtil_androidKt$performSuspending$$inlined$compatCoroutineExecute$DBUtil__DBUtil_androidKt$1) r1
            kotlin.n1 r2 = kotlin.n1.a
            java.lang.Object r1 = r1.invokeSuspend(r2)
            return r1
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
            androidx.room.RoomDatabase r6 = r9.$db$inlined
            boolean r5 = r9.$isReadOnly$inlined
            androidx.room.util.DBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1 r3 = new androidx.room.util.DBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1
            boolean r4 = r9.$inTransaction$inlined
            r7 = 0
            kotlin.jvm.functions.Function1 r8 = r9.$block$inlined
            r3.<init>(r4, r5, r6, r7, r8)
            r9.label = r2
            java.lang.Object r10 = r6.useConnection$room_runtime_release(r5, r3, r9)
            if (r10 != r0) goto L31
            return r0
        L31:
            return r10
    }
}

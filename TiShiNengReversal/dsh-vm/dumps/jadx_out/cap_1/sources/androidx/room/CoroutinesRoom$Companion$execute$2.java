package androidx.room;

/* JADX INFO: Add missing generic type declarations: [R] */
/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.room.CoroutinesRoom$Companion$execute$2", f = "CoroutinesRoom.android.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class CoroutinesRoom$Companion$execute$2<R> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.r0, kotlin.coroutines.e<? super R>, java.lang.Object> {
    final /* synthetic */ java.util.concurrent.Callable<R> $callable;
    int label;

    CoroutinesRoom$Companion$execute$2(java.util.concurrent.Callable<R> r1, kotlin.coroutines.e<? super androidx.room.CoroutinesRoom$Companion$execute$2> r2) {
            r0 = this;
            r0.$callable = r1
            r1 = 2
            r0.<init>(r1, r2)
            return
    }

    public final kotlin.coroutines.e<kotlin.n1> create(java.lang.Object r2, kotlin.coroutines.e<?> r3) {
            r1 = this;
            androidx.room.CoroutinesRoom$Companion$execute$2 r2 = new androidx.room.CoroutinesRoom$Companion$execute$2
            java.util.concurrent.Callable<R> r0 = r1.$callable
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

    public final java.lang.Object invoke(kotlinx.coroutines.r0 r1, kotlin.coroutines.e<? super R> r2) {
            r0 = this;
            kotlin.coroutines.e r1 = r0.create(r1, r2)
            androidx.room.CoroutinesRoom$Companion$execute$2 r1 = (androidx.room.CoroutinesRoom$Companion$execute$2) r1
            kotlin.n1 r2 = kotlin.n1.a
            java.lang.Object r1 = r1.invokeSuspend(r2)
            return r1
    }

    public final java.lang.Object invokeSuspend(java.lang.Object r2) {
            r1 = this;
            kotlin.coroutines.intrinsics.a.l()
            int r0 = r1.label
            if (r0 != 0) goto L11
            kotlin.g0.n(r2)
            java.util.concurrent.Callable<R> r2 = r1.$callable
            java.lang.Object r2 = r2.call()
            return r2
        L11:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r2.<init>(r0)
            throw r2
    }
}

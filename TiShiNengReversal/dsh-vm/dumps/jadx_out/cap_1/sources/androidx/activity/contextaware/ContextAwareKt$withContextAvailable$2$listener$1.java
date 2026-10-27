package androidx.activity.contextaware;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nContextAware.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContextAware.kt\nandroidx/activity/contextaware/ContextAwareKt$withContextAvailable$2$listener$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,94:1\n1#2:95\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class ContextAwareKt$withContextAvailable$2$listener$1 implements androidx.activity.contextaware.OnContextAvailableListener {
    final /* synthetic */ kotlinx.coroutines.p<R> $co;
    final /* synthetic */ kotlin.jvm.functions.Function1<android.content.Context, R> $onContextAvailable;

    public ContextAwareKt$withContextAvailable$2$listener$1(kotlinx.coroutines.p<R> r1, kotlin.jvm.functions.Function1<android.content.Context, R> r2) {
            r0 = this;
            r0.$co = r1
            r0.$onContextAvailable = r2
            r0.<init>()
            return
    }

    @Override // androidx.activity.contextaware.OnContextAvailableListener
    public void onContextAvailable(@org.jetbrains.annotations.NotNull android.content.Context r4) {
            r3 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.g0.p(r4, r0)
            kotlinx.coroutines.p<R> r0 = r3.$co
            kotlin.jvm.functions.Function1<android.content.Context, R> r1 = r3.$onContextAvailable
            kotlin.Result$a r2 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L14
            java.lang.Object r4 = r1.invoke(r4)     // Catch: java.lang.Throwable -> L14
            java.lang.Object r4 = kotlin.Result.constructor-impl(r4)     // Catch: java.lang.Throwable -> L14
            goto L1f
        L14:
            r4 = move-exception
            kotlin.Result$a r1 = kotlin.Result.Companion
            java.lang.Object r4 = kotlin.g0.a(r4)
            java.lang.Object r4 = kotlin.Result.constructor-impl(r4)
        L1f:
            r0.resumeWith(r4)
            return
    }
}

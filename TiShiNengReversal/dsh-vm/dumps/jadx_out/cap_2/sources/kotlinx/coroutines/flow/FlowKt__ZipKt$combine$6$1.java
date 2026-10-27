package kotlinx.coroutines.flow;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt$combine$6$1\n*L\n1#1,332:1\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class FlowKt__ZipKt$combine$6$1<T> extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<T[]> {
    final /* synthetic */ kotlinx.coroutines.flow.i<T>[] $flowArray;

    public FlowKt__ZipKt$combine$6$1(kotlinx.coroutines.flow.i<T>[] r1) {
            r0 = this;
            r0.$flowArray = r1
            r1 = 0
            r0.<init>(r1)
            return
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ java.lang.Object invoke() {
            r1 = this;
            java.lang.Object[] r0 = r1.invoke()
            return r0
    }

    @Override // kotlin.jvm.functions.Function0
    @org.jetbrains.annotations.Nullable
    public final T[] invoke() {
            r3 = this;
            kotlinx.coroutines.flow.i<T>[] r0 = r3.$flowArray
            int r0 = r0.length
            r1 = 0
            java.lang.String r2 = "T?"
            kotlin.jvm.internal.g0.y(r1, r2)
            java.lang.Object[] r0 = new java.lang.Object[r0]
            return r0
    }
}

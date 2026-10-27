package androidx.room.coroutines;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.JvmName(name = "FlowUtil")
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nFlowBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowBuilder.kt\nandroidx/room/coroutines/FlowUtil\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,40:1\n53#2:41\n55#2:45\n50#3:42\n55#3:44\n107#4:43\n*S KotlinDebug\n*F\n+ 1 FlowBuilder.kt\nandroidx/room/coroutines/FlowUtil\n*L\n37#1:41\n37#1:45\n37#1:42\n37#1:44\n37#1:43\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class FlowUtil {
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @org.jetbrains.annotations.NotNull
    public static final <R> kotlinx.coroutines.flow.i<R> createFlow(@org.jetbrains.annotations.NotNull androidx.room.RoomDatabase r2, boolean r3, @org.jetbrains.annotations.NotNull java.lang.String[] r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super androidx.sqlite.SQLiteConnection, ? extends R> r5) {
            java.lang.String r0 = "db"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "tableNames"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "block"
            kotlin.jvm.internal.g0.p(r5, r0)
            androidx.room.InvalidationTracker r0 = r2.getInvalidationTracker()
            int r1 = r4.length
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r1)
            java.lang.String[] r4 = (java.lang.String[]) r4
            r1 = 1
            kotlinx.coroutines.flow.i r4 = r0.createFlow(r4, r1)
            kotlinx.coroutines.flow.i r4 = kotlinx.coroutines.flow.k.W(r4)
            androidx.room.coroutines.FlowUtil$createFlow$$inlined$map$1 r0 = new androidx.room.coroutines.FlowUtil$createFlow$$inlined$map$1
            r0.<init>(r4, r2, r3, r5)
            return r0
    }
}

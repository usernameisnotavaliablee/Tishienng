package g4;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\naddToStdlib.kt\nKotlin\n*S Kotlin\n*F\n+ 1 addToStdlib.kt\norg/jetbrains/kotlin/utils/addToStdlib/AddToStdlibKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,416:1\n21#1,2:417\n76#1,11:419\n294#1,16:434\n332#1,13:450\n404#1,2:466\n406#1:471\n3829#2:430\n4344#2,2:431\n1#3:433\n1634#4,3:463\n1634#4,3:468\n*S KotlinDebug\n*F\n+ 1 addToStdlib.kt\norg/jetbrains/kotlin/utils/addToStdlib/AddToStdlibKt\n*L\n67#1:417,2\n73#1:419,11\n286#1:434,16\n348#1:450,13\n409#1:466,2\n409#1:471\n137#1:430\n137#1:431,2\n405#1:463,3\n409#1:468,3\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class a {

    @org.jetbrains.annotations.NotNull
    private static final java.util.concurrent.ConcurrentHashMap<kotlin.jvm.functions.Function0<?>, java.lang.Object> a = null;

    static {
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            g4.a.a = r0
            return
    }

    public a() {
            r1 = this;
            r1.<init>()
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.Void a(@org.jetbrains.annotations.NotNull java.lang.String r1) {
            java.lang.String r0 = "message"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public static /* synthetic */ java.lang.Void b(java.lang.String r0, int r1, java.lang.Object r2) {
            r1 = r1 & 1
            if (r1 == 0) goto L6
            java.lang.String r0 = "should not be called"
        L6:
            java.lang.Void r0 = a(r0)
            return r0
    }
}

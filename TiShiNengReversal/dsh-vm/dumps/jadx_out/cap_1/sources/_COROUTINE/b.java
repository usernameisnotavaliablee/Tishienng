package _COROUTINE;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nCoroutineDebugging.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineDebugging.kt\n_COROUTINE/CoroutineDebuggingKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,66:1\n1#2:67\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String f0a = "_COROUTINE";

    static {
            return
    }

    public b() {
            r1 = this;
            r1.<init>()
            return
    }

    public static final /* synthetic */ java.lang.StackTraceElement a(java.lang.Throwable r0, java.lang.String r1) {
            java.lang.StackTraceElement r0 = b(r0, r1)
            return r0
    }

    private static final java.lang.StackTraceElement b(java.lang.Throwable r3, java.lang.String r4) {
            java.lang.StackTraceElement[] r3 = r3.getStackTrace()
            r0 = 0
            r3 = r3[r0]
            java.lang.StackTraceElement r0 = new java.lang.StackTraceElement
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = _COROUTINE.b.f0a
            r1.append(r2)
            r2 = 46
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            java.lang.String r1 = r3.getFileName()
            int r3 = r3.getLineNumber()
            java.lang.String r2 = "_"
            r0.<init>(r4, r2, r1, r3)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String c() {
            java.lang.String r0 = _COROUTINE.b.f0a
            return r0
    }
}

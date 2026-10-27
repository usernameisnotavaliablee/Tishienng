package kotlinx.coroutines;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class f1 implements java.util.concurrent.Executor {

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.m0 a;

    public f1(@org.jetbrains.annotations.NotNull kotlinx.coroutines.m0 r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // java.util.concurrent.Executor
    public void execute(@org.jetbrains.annotations.NotNull java.lang.Runnable r3) {
            r2 = this;
            kotlinx.coroutines.m0 r0 = r2.a
            kotlin.coroutines.EmptyCoroutineContext r1 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            boolean r0 = r0.isDispatchNeeded(r1)
            if (r0 == 0) goto L10
            kotlinx.coroutines.m0 r0 = r2.a
            r0.dispatch(r1, r3)
            return
        L10:
            r3.run()
            return
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r1 = this;
            kotlinx.coroutines.m0 r0 = r1.a
            java.lang.String r0 = r0.toString()
            return r0
    }
}

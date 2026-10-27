package androidx.work;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public enum DirectExecutor extends java.lang.Enum<androidx.work.DirectExecutor> implements java.util.concurrent.Executor {
    private static final /* synthetic */ androidx.work.DirectExecutor[] $VALUES = null;
    public static final androidx.work.DirectExecutor INSTANCE = null;

    private static final /* synthetic */ androidx.work.DirectExecutor[] $values() {
            r0 = 1
            androidx.work.DirectExecutor[] r0 = new androidx.work.DirectExecutor[r0]
            androidx.work.DirectExecutor r1 = androidx.work.DirectExecutor.INSTANCE
            r2 = 0
            r0[r2] = r1
            return r0
    }

    static {
            androidx.work.DirectExecutor r0 = new androidx.work.DirectExecutor
            java.lang.String r1 = "INSTANCE"
            r2 = 0
            r0.<init>(r1, r2)
            androidx.work.DirectExecutor.INSTANCE = r0
            androidx.work.DirectExecutor[] r0 = $values()
            androidx.work.DirectExecutor.$VALUES = r0
            return
    }

    DirectExecutor(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static androidx.work.DirectExecutor valueOf(java.lang.String r1) {
            java.lang.Class<androidx.work.DirectExecutor> r0 = androidx.work.DirectExecutor.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            androidx.work.DirectExecutor r1 = (androidx.work.DirectExecutor) r1
            return r1
    }

    public static androidx.work.DirectExecutor[] values() {
            androidx.work.DirectExecutor[] r0 = androidx.work.DirectExecutor.$VALUES
            java.lang.Object r0 = r0.clone()
            androidx.work.DirectExecutor[] r0 = (androidx.work.DirectExecutor[]) r0
            return r0
    }

    @Override // java.util.concurrent.Executor
    public void execute(@org.jetbrains.annotations.NotNull java.lang.Runnable r2) {
            r1 = this;
            java.lang.String r0 = "command"
            kotlin.jvm.internal.g0.p(r2, r0)
            r2.run()
            return
    }

    @Override // java.lang.Enum
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = "DirectExecutor"
            return r0
    }
}

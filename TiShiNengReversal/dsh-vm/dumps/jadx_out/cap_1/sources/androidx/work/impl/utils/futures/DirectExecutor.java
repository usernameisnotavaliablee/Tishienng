package androidx.work.impl.utils.futures;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
enum DirectExecutor extends java.lang.Enum<androidx.work.impl.utils.futures.DirectExecutor> implements java.util.concurrent.Executor {
    private static final /* synthetic */ androidx.work.impl.utils.futures.DirectExecutor[] $VALUES = null;
    public static final androidx.work.impl.utils.futures.DirectExecutor INSTANCE = null;

    static {
            androidx.work.impl.utils.futures.DirectExecutor r0 = new androidx.work.impl.utils.futures.DirectExecutor
            java.lang.String r1 = "INSTANCE"
            r2 = 0
            r0.<init>(r1, r2)
            androidx.work.impl.utils.futures.DirectExecutor.INSTANCE = r0
            r1 = 1
            androidx.work.impl.utils.futures.DirectExecutor[] r1 = new androidx.work.impl.utils.futures.DirectExecutor[r1]
            r1[r2] = r0
            androidx.work.impl.utils.futures.DirectExecutor.$VALUES = r1
            return
    }

    DirectExecutor(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static androidx.work.impl.utils.futures.DirectExecutor valueOf(java.lang.String r1) {
            java.lang.Class<androidx.work.impl.utils.futures.DirectExecutor> r0 = androidx.work.impl.utils.futures.DirectExecutor.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            androidx.work.impl.utils.futures.DirectExecutor r1 = (androidx.work.impl.utils.futures.DirectExecutor) r1
            return r1
    }

    public static androidx.work.impl.utils.futures.DirectExecutor[] values() {
            androidx.work.impl.utils.futures.DirectExecutor[] r0 = androidx.work.impl.utils.futures.DirectExecutor.$VALUES
            java.lang.Object r0 = r0.clone()
            androidx.work.impl.utils.futures.DirectExecutor[] r0 = (androidx.work.impl.utils.futures.DirectExecutor[]) r0
            return r0
    }

    @Override // java.util.concurrent.Executor
    public void execute(java.lang.Runnable r1) {
            r0 = this;
            r1.run()
            return
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = "DirectExecutor"
            return r0
    }
}

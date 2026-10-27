package com.google.common.util.concurrent;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtCompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
enum DirectExecutor extends java.lang.Enum<com.google.common.util.concurrent.DirectExecutor> implements java.util.concurrent.Executor {
    private static final /* synthetic */ com.google.common.util.concurrent.DirectExecutor[] $VALUES = null;
    public static final com.google.common.util.concurrent.DirectExecutor INSTANCE = null;

    static {
            com.google.common.util.concurrent.DirectExecutor r0 = new com.google.common.util.concurrent.DirectExecutor
            java.lang.String r1 = "INSTANCE"
            r2 = 0
            r0.<init>(r1, r2)
            com.google.common.util.concurrent.DirectExecutor.INSTANCE = r0
            r1 = 1
            com.google.common.util.concurrent.DirectExecutor[] r1 = new com.google.common.util.concurrent.DirectExecutor[r1]
            r1[r2] = r0
            com.google.common.util.concurrent.DirectExecutor.$VALUES = r1
            return
    }

    DirectExecutor(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static com.google.common.util.concurrent.DirectExecutor valueOf(java.lang.String r1) {
            java.lang.Class<com.google.common.util.concurrent.DirectExecutor> r0 = com.google.common.util.concurrent.DirectExecutor.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.google.common.util.concurrent.DirectExecutor r1 = (com.google.common.util.concurrent.DirectExecutor) r1
            return r1
    }

    public static com.google.common.util.concurrent.DirectExecutor[] values() {
            com.google.common.util.concurrent.DirectExecutor[] r0 = com.google.common.util.concurrent.DirectExecutor.$VALUES
            java.lang.Object r0 = r0.clone()
            com.google.common.util.concurrent.DirectExecutor[] r0 = (com.google.common.util.concurrent.DirectExecutor[]) r0
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
            java.lang.String r0 = "MoreExecutors.directExecutor()"
            return r0
    }
}

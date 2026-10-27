package io.netty.util.concurrent;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class ImmediateExecutor implements java.util.concurrent.Executor {
    public static final io.netty.util.concurrent.ImmediateExecutor INSTANCE = null;

    static {
            io.netty.util.concurrent.ImmediateExecutor r0 = new io.netty.util.concurrent.ImmediateExecutor
            r0.<init>()
            io.netty.util.concurrent.ImmediateExecutor.INSTANCE = r0
            return
    }

    private ImmediateExecutor() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.util.concurrent.Executor
    public void execute(java.lang.Runnable r2) {
            r1 = this;
            if (r2 == 0) goto L6
            r2.run()
            return
        L6:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "command"
            r2.<init>(r0)
            throw r2
    }
}

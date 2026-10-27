package io.netty.util.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class ThreadExecutorMap {
    private static final io.netty.util.concurrent.FastThreadLocal<io.netty.util.concurrent.EventExecutor> mappings = null;




    static {
            io.netty.util.concurrent.FastThreadLocal r0 = new io.netty.util.concurrent.FastThreadLocal
            r0.<init>()
            io.netty.util.internal.ThreadExecutorMap.mappings = r0
            return
    }

    private ThreadExecutorMap() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ void access$000(io.netty.util.concurrent.EventExecutor r0) {
            setCurrentEventExecutor(r0)
            return
    }

    public static java.lang.Runnable apply(java.lang.Runnable r1, io.netty.util.concurrent.EventExecutor r2) {
            java.lang.String r0 = "command"
            io.netty.util.internal.ObjectUtil.checkNotNull(r1, r0)
            java.lang.String r0 = "eventExecutor"
            io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
            io.netty.util.internal.ThreadExecutorMap$2 r0 = new io.netty.util.internal.ThreadExecutorMap$2
            r0.<init>(r2, r1)
            return r0
    }

    public static java.util.concurrent.Executor apply(java.util.concurrent.Executor r1, io.netty.util.concurrent.EventExecutor r2) {
            java.lang.String r0 = "executor"
            io.netty.util.internal.ObjectUtil.checkNotNull(r1, r0)
            java.lang.String r0 = "eventExecutor"
            io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
            io.netty.util.internal.ThreadExecutorMap$1 r0 = new io.netty.util.internal.ThreadExecutorMap$1
            r0.<init>(r1, r2)
            return r0
    }

    public static java.util.concurrent.ThreadFactory apply(java.util.concurrent.ThreadFactory r1, io.netty.util.concurrent.EventExecutor r2) {
            java.lang.String r0 = "command"
            io.netty.util.internal.ObjectUtil.checkNotNull(r1, r0)
            java.lang.String r0 = "eventExecutor"
            io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
            io.netty.util.internal.ThreadExecutorMap$3 r0 = new io.netty.util.internal.ThreadExecutorMap$3
            r0.<init>(r1, r2)
            return r0
    }

    public static io.netty.util.concurrent.EventExecutor currentExecutor() {
            io.netty.util.concurrent.FastThreadLocal<io.netty.util.concurrent.EventExecutor> r0 = io.netty.util.internal.ThreadExecutorMap.mappings
            java.lang.Object r0 = r0.get()
            io.netty.util.concurrent.EventExecutor r0 = (io.netty.util.concurrent.EventExecutor) r0
            return r0
    }

    private static void setCurrentEventExecutor(io.netty.util.concurrent.EventExecutor r1) {
            io.netty.util.concurrent.FastThreadLocal<io.netty.util.concurrent.EventExecutor> r0 = io.netty.util.internal.ThreadExecutorMap.mappings
            r0.set(r1)
            return
    }
}

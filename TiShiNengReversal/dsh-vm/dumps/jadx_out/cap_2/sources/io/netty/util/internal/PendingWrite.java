package io.netty.util.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class PendingWrite {
    private static final io.netty.util.Recycler<io.netty.util.internal.PendingWrite> RECYCLER = null;
    private final io.netty.util.Recycler.Handle<io.netty.util.internal.PendingWrite> handle;
    private java.lang.Object msg;
    private io.netty.util.concurrent.Promise<java.lang.Void> promise;


    static {
            io.netty.util.internal.PendingWrite$1 r0 = new io.netty.util.internal.PendingWrite$1
            r0.<init>()
            io.netty.util.internal.PendingWrite.RECYCLER = r0
            return
    }

    private PendingWrite(io.netty.util.Recycler.Handle<io.netty.util.internal.PendingWrite> r1) {
            r0 = this;
            r0.<init>()
            r0.handle = r1
            return
    }

    /* synthetic */ PendingWrite(io.netty.util.Recycler.Handle r1, io.netty.util.internal.PendingWrite.AnonymousClass1 r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public static io.netty.util.internal.PendingWrite newInstance(java.lang.Object r1, io.netty.util.concurrent.Promise<java.lang.Void> r2) {
            io.netty.util.Recycler<io.netty.util.internal.PendingWrite> r0 = io.netty.util.internal.PendingWrite.RECYCLER
            java.lang.Object r0 = r0.get()
            io.netty.util.internal.PendingWrite r0 = (io.netty.util.internal.PendingWrite) r0
            r0.msg = r1
            r0.promise = r2
            return r0
    }

    public boolean failAndRecycle(java.lang.Throwable r2) {
            r1 = this;
            java.lang.Object r0 = r1.msg
            io.netty.util.ReferenceCountUtil.release(r0)
            io.netty.util.concurrent.Promise<java.lang.Void> r0 = r1.promise
            if (r0 == 0) goto Lc
            r0.setFailure(r2)
        Lc:
            boolean r2 = r1.recycle()
            return r2
    }

    public java.lang.Object msg() {
            r1 = this;
            java.lang.Object r0 = r1.msg
            return r0
    }

    public io.netty.util.concurrent.Promise<java.lang.Void> promise() {
            r1 = this;
            io.netty.util.concurrent.Promise<java.lang.Void> r0 = r1.promise
            return r0
    }

    public boolean recycle() {
            r1 = this;
            r0 = 0
            r1.msg = r0
            r1.promise = r0
            io.netty.util.Recycler$Handle<io.netty.util.internal.PendingWrite> r0 = r1.handle
            r0.recycle(r1)
            r0 = 1
            return r0
    }

    public io.netty.util.concurrent.Promise<java.lang.Void> recycleAndGet() {
            r1 = this;
            io.netty.util.concurrent.Promise<java.lang.Void> r0 = r1.promise
            r1.recycle()
            return r0
    }

    public boolean successAndRecycle() {
            r2 = this;
            io.netty.util.concurrent.Promise<java.lang.Void> r0 = r2.promise
            if (r0 == 0) goto L8
            r1 = 0
            r0.setSuccess(r1)
        L8:
            boolean r0 = r2.recycle()
            return r0
    }
}

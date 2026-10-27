package okhttp3.internal.concurrent;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Task.kt\nokhttp3/internal/concurrent/Task\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,71:1\n1#2:72\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public abstract class Task {
    private final boolean cancelable;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String name;
    private long nextExecuteNanoTime;

    @org.jetbrains.annotations.Nullable
    private okhttp3.internal.concurrent.TaskQueue queue;

    public Task(@org.jetbrains.annotations.NotNull java.lang.String r2, boolean r3) {
            r1 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.name = r2
            r1.cancelable = r3
            r2 = -1
            r1.nextExecuteNanoTime = r2
            return
    }

    public /* synthetic */ Task(java.lang.String r1, boolean r2, int r3, kotlin.jvm.internal.v r4) {
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 1
        L5:
            r0.<init>(r1, r2)
            return
    }

    public final boolean getCancelable() {
            r1 = this;
            boolean r0 = r1.cancelable
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    public final long getNextExecuteNanoTime$okhttp() {
            r2 = this;
            long r0 = r2.nextExecuteNanoTime
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final okhttp3.internal.concurrent.TaskQueue getQueue$okhttp() {
            r1 = this;
            okhttp3.internal.concurrent.TaskQueue r0 = r1.queue
            return r0
    }

    public final void initQueue$okhttp(@org.jetbrains.annotations.NotNull okhttp3.internal.concurrent.TaskQueue r2) {
            r1 = this;
            java.lang.String r0 = "queue"
            kotlin.jvm.internal.g0.p(r2, r0)
            okhttp3.internal.concurrent.TaskQueue r0 = r1.queue
            if (r0 != r2) goto La
            return
        La:
            if (r0 != 0) goto Lf
            r1.queue = r2
            return
        Lf:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "task is in multiple queues"
            r2.<init>(r0)
            throw r2
    }

    public abstract long runOnce();

    public final void setNextExecuteNanoTime$okhttp(long r1) {
            r0 = this;
            r0.nextExecuteNanoTime = r1
            return
    }

    public final void setQueue$okhttp(@org.jetbrains.annotations.Nullable okhttp3.internal.concurrent.TaskQueue r1) {
            r0 = this;
            r0.queue = r1
            return
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }
}

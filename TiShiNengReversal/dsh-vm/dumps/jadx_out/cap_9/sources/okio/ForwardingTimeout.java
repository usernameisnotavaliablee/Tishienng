package okio;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class ForwardingTimeout extends okio.Timeout {

    @org.jetbrains.annotations.NotNull
    private okio.Timeout delegate;

    public ForwardingTimeout(@org.jetbrains.annotations.NotNull okio.Timeout r2) {
            r1 = this;
            java.lang.String r0 = "delegate"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.delegate = r2
            return
    }

    @Override // okio.Timeout
    public void awaitSignal(@org.jetbrains.annotations.NotNull java.util.concurrent.locks.Condition r2) {
            r1 = this;
            java.lang.String r0 = "condition"
            kotlin.jvm.internal.g0.p(r2, r0)
            okio.Timeout r0 = r1.delegate
            r0.awaitSignal(r2)
            return
    }

    @Override // okio.Timeout
    public void cancel() {
            r1 = this;
            okio.Timeout r0 = r1.delegate
            r0.cancel()
            return
    }

    @Override // okio.Timeout
    @org.jetbrains.annotations.NotNull
    public okio.Timeout clearDeadline() {
            r1 = this;
            okio.Timeout r0 = r1.delegate
            okio.Timeout r0 = r0.clearDeadline()
            return r0
    }

    @Override // okio.Timeout
    @org.jetbrains.annotations.NotNull
    public okio.Timeout clearTimeout() {
            r1 = this;
            okio.Timeout r0 = r1.delegate
            okio.Timeout r0 = r0.clearTimeout()
            return r0
    }

    @Override // okio.Timeout
    public long deadlineNanoTime() {
            r2 = this;
            okio.Timeout r0 = r2.delegate
            long r0 = r0.deadlineNanoTime()
            return r0
    }

    @Override // okio.Timeout
    @org.jetbrains.annotations.NotNull
    public okio.Timeout deadlineNanoTime(long r2) {
            r1 = this;
            okio.Timeout r0 = r1.delegate
            okio.Timeout r2 = r0.deadlineNanoTime(r2)
            return r2
    }

    @kotlin.jvm.JvmName(name = "delegate")
    @org.jetbrains.annotations.NotNull
    public final okio.Timeout delegate() {
            r1 = this;
            okio.Timeout r0 = r1.delegate
            return r0
    }

    @Override // okio.Timeout
    public boolean hasDeadline() {
            r1 = this;
            okio.Timeout r0 = r1.delegate
            boolean r0 = r0.hasDeadline()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final okio.ForwardingTimeout setDelegate(@org.jetbrains.annotations.NotNull okio.Timeout r2) {
            r1 = this;
            java.lang.String r0 = "delegate"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.delegate = r2
            return r1
    }

    /* renamed from: setDelegate, reason: collision with other method in class */
    public final /* synthetic */ void m59setDelegate(okio.Timeout r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.delegate = r2
            return
    }

    @Override // okio.Timeout
    public void throwIfReached() throws java.io.IOException {
            r1 = this;
            okio.Timeout r0 = r1.delegate
            r0.throwIfReached()
            return
    }

    @Override // okio.Timeout
    @org.jetbrains.annotations.NotNull
    public okio.Timeout timeout(long r2, @org.jetbrains.annotations.NotNull java.util.concurrent.TimeUnit r4) {
            r1 = this;
            java.lang.String r0 = "unit"
            kotlin.jvm.internal.g0.p(r4, r0)
            okio.Timeout r0 = r1.delegate
            okio.Timeout r2 = r0.timeout(r2, r4)
            return r2
    }

    @Override // okio.Timeout
    public long timeoutNanos() {
            r2 = this;
            okio.Timeout r0 = r2.delegate
            long r0 = r0.timeoutNanos()
            return r0
    }

    @Override // okio.Timeout
    public void waitUntilNotified(@org.jetbrains.annotations.NotNull java.lang.Object r2) {
            r1 = this;
            java.lang.String r0 = "monitor"
            kotlin.jvm.internal.g0.p(r2, r0)
            okio.Timeout r0 = r1.delegate
            r0.waitUntilNotified(r2)
            return
    }
}

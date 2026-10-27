package okio.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class PipeSocket implements okio.Socket {

    @org.jetbrains.annotations.NotNull
    private final okio.Pipe sinkPipe;

    @org.jetbrains.annotations.NotNull
    private final okio.Pipe sourcePipe;

    public PipeSocket(@org.jetbrains.annotations.NotNull okio.Pipe r2, @org.jetbrains.annotations.NotNull okio.Pipe r3) {
            r1 = this;
            java.lang.String r0 = "sinkPipe"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "sourcePipe"
            kotlin.jvm.internal.g0.p(r3, r0)
            r1.<init>()
            r1.sinkPipe = r2
            r1.sourcePipe = r3
            return
    }

    @Override // okio.Socket
    public void cancel() {
            r1 = this;
            okio.Pipe r0 = r1.sourcePipe
            r0.cancel()
            okio.Pipe r0 = r1.sinkPipe
            r0.cancel()
            return
    }

    @Override // okio.Socket
    @org.jetbrains.annotations.NotNull
    public okio.Sink getSink() {
            r1 = this;
            okio.Pipe r0 = r1.sinkPipe
            okio.Sink r0 = r0.sink()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final okio.Pipe getSinkPipe() {
            r1 = this;
            okio.Pipe r0 = r1.sinkPipe
            return r0
    }

    @Override // okio.Socket
    @org.jetbrains.annotations.NotNull
    public okio.Source getSource() {
            r1 = this;
            okio.Pipe r0 = r1.sourcePipe
            okio.Source r0 = r0.source()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final okio.Pipe getSourcePipe() {
            r1 = this;
            okio.Pipe r0 = r1.sourcePipe
            return r0
    }
}

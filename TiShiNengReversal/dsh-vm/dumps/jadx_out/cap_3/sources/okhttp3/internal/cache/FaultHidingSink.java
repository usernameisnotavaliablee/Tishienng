package okhttp3.internal.cache;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class FaultHidingSink extends okio.ForwardingSink {
    private boolean hasErrors;

    @org.jetbrains.annotations.NotNull
    private final kotlin.jvm.functions.Function1<java.io.IOException, kotlin.n1> onException;

    public FaultHidingSink(@org.jetbrains.annotations.NotNull okio.Sink r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.io.IOException, kotlin.n1> r3) {
            r1 = this;
            java.lang.String r0 = "delegate"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "onException"
            kotlin.jvm.internal.g0.p(r3, r0)
            r1.<init>(r2)
            r1.onException = r3
            return
    }

    public void close() {
            r2 = this;
            super.close()     // Catch: java.io.IOException -> L4
            return
        L4:
            r0 = move-exception
            r1 = 1
            r2.hasErrors = r1
            kotlin.jvm.functions.Function1<java.io.IOException, kotlin.n1> r1 = r2.onException
            r1.invoke(r0)
            return
    }

    public void flush() {
            r2 = this;
            boolean r0 = r2.hasErrors
            if (r0 == 0) goto L5
            return
        L5:
            super.flush()     // Catch: java.io.IOException -> L9
            return
        L9:
            r0 = move-exception
            r1 = 1
            r2.hasErrors = r1
            kotlin.jvm.functions.Function1<java.io.IOException, kotlin.n1> r1 = r2.onException
            r1.invoke(r0)
            return
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.jvm.functions.Function1<java.io.IOException, kotlin.n1> getOnException() {
            r1 = this;
            kotlin.jvm.functions.Function1<java.io.IOException, kotlin.n1> r0 = r1.onException
            return r0
    }

    public void write(@org.jetbrains.annotations.NotNull okio.Buffer r2, long r3) {
            r1 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.g0.p(r2, r0)
            boolean r0 = r1.hasErrors
            if (r0 == 0) goto Ld
            r2.skip(r3)
            return
        Ld:
            super.write(r2, r3)     // Catch: java.io.IOException -> L11
            return
        L11:
            r2 = move-exception
            r3 = 1
            r1.hasErrors = r3
            kotlin.jvm.functions.Function1<java.io.IOException, kotlin.n1> r3 = r1.onException
            r3.invoke(r2)
            return
    }
}

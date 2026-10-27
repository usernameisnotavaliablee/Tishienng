package okhttp3.internal.http2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public interface FlowControlListener {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class None implements okhttp3.internal.http2.FlowControlListener {

        @org.jetbrains.annotations.NotNull
        public static final okhttp3.internal.http2.FlowControlListener.None INSTANCE = null;

        static {
                okhttp3.internal.http2.FlowControlListener$None r0 = new okhttp3.internal.http2.FlowControlListener$None
                r0.<init>()
                okhttp3.internal.http2.FlowControlListener.None.INSTANCE = r0
                return
        }

        private None() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // okhttp3.internal.http2.FlowControlListener
        public void receivingConnectionWindowChanged(@org.jetbrains.annotations.NotNull okhttp3.internal.http2.flowcontrol.WindowCounter r2) {
                r1 = this;
                java.lang.String r0 = "windowCounter"
                kotlin.jvm.internal.g0.p(r2, r0)
                return
        }

        @Override // okhttp3.internal.http2.FlowControlListener
        public void receivingStreamWindowChanged(int r1, @org.jetbrains.annotations.NotNull okhttp3.internal.http2.flowcontrol.WindowCounter r2, long r3) {
                r0 = this;
                java.lang.String r1 = "windowCounter"
                kotlin.jvm.internal.g0.p(r2, r1)
                return
        }
    }

    void receivingConnectionWindowChanged(@org.jetbrains.annotations.NotNull okhttp3.internal.http2.flowcontrol.WindowCounter r1);

    void receivingStreamWindowChanged(int r1, @org.jetbrains.annotations.NotNull okhttp3.internal.http2.flowcontrol.WindowCounter r2, long r3);
}

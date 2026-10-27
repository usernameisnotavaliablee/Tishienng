package okhttp3.internal.connection;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class AddressPolicy {

    @kotlin.jvm.JvmField
    public final long backoffDelayMillis;

    @kotlin.jvm.JvmField
    public final int backoffJitterMillis;

    @kotlin.jvm.JvmField
    public final int minimumConcurrentCalls;

    public AddressPolicy() {
            r7 = this;
            r5 = 7
            r6 = 0
            r1 = 0
            r2 = 0
            r4 = 0
            r0 = r7
            r0.<init>(r1, r2, r4, r5, r6)
            return
    }

    public AddressPolicy(int r1, long r2, int r4) {
            r0 = this;
            r0.<init>()
            r0.minimumConcurrentCalls = r1
            r0.backoffDelayMillis = r2
            r0.backoffJitterMillis = r4
            return
    }

    public /* synthetic */ AddressPolicy(int r1, long r2, int r4, int r5, kotlin.jvm.internal.v r6) {
            r0 = this;
            r6 = r5 & 1
            if (r6 == 0) goto L5
            r1 = 0
        L5:
            r6 = r5 & 2
            if (r6 == 0) goto Lc
            r2 = 60000(0xea60, double:2.9644E-319)
        Lc:
            r5 = r5 & 4
            if (r5 == 0) goto L12
            r4 = 100
        L12:
            r0.<init>(r1, r2, r4)
            return
    }
}

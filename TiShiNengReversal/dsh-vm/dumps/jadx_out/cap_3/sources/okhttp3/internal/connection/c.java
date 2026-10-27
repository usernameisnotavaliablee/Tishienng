package okhttp3.internal.connection;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final /* synthetic */ class c {
    public c() {
            r1 = this;
            r1.<init>()
            return
    }

    public static /* synthetic */ boolean a(okhttp3.internal.connection.RoutePlanner r0, okhttp3.internal.connection.RealConnection r1, int r2, java.lang.Object r3) {
            if (r3 != 0) goto Lc
            r2 = r2 & 1
            if (r2 == 0) goto L7
            r1 = 0
        L7:
            boolean r0 = r0.hasNext(r1)
            return r0
        Lc:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Super calls with default arguments not supported in this target, function: hasNext"
            r0.<init>(r1)
            throw r0
    }
}

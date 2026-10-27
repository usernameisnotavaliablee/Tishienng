package rx.internal.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class RxThreadFactory extends java.util.concurrent.atomic.AtomicLong implements java.util.concurrent.ThreadFactory {
    public static final java.util.concurrent.ThreadFactory NONE = null;
    private static final long serialVersionUID = -8841098858898482335L;
    final java.lang.String prefix;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class a implements java.util.concurrent.ThreadFactory {
        a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.util.concurrent.ThreadFactory
        public java.lang.Thread newThread(java.lang.Runnable r2) {
                r1 = this;
                java.lang.AssertionError r2 = new java.lang.AssertionError
                java.lang.String r0 = "No threads allowed."
                r2.<init>(r0)
                throw r2
        }
    }

    static {
            rx.internal.util.RxThreadFactory$a r0 = new rx.internal.util.RxThreadFactory$a
            r0.<init>()
            rx.internal.util.RxThreadFactory.NONE = r0
            return
    }

    public RxThreadFactory(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.prefix = r1
            return
    }

    @Override // java.util.concurrent.ThreadFactory
    public java.lang.Thread newThread(java.lang.Runnable r5) {
            r4 = this;
            java.lang.Thread r0 = new java.lang.Thread
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r4.prefix
            r1.append(r2)
            long r2 = r4.incrementAndGet()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r5, r1)
            r5 = 1
            r0.setDaemon(r5)
            return r0
    }
}

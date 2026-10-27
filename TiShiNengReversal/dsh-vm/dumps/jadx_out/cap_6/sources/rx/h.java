package rx;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class h {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static abstract class a implements rx.m {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        public long b() {
                r2 = this;
                long r0 = java.lang.System.currentTimeMillis()
                return r0
        }

        public abstract rx.m d(rx.functions.a r1);

        public abstract rx.m e(rx.functions.a r1, long r2, java.util.concurrent.TimeUnit r4);

        public rx.m f(rx.functions.a r9, long r10, long r12, java.util.concurrent.TimeUnit r14) {
                r8 = this;
                r7 = 0
                r0 = r8
                r1 = r9
                r2 = r10
                r4 = r12
                r6 = r14
                rx.m r9 = rx.internal.schedulers.i.a(r0, r1, r2, r4, r6, r7)
                return r9
        }
    }

    public h() {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract rx.h.a a();

    public long b() {
            r2 = this;
            long r0 = java.lang.System.currentTimeMillis()
            return r0
    }

    public <S extends rx.h & rx.m> S d(rx.functions.p<rx.e<rx.e<rx.b>>, rx.b> r2) {
            r1 = this;
            rx.internal.schedulers.k r0 = new rx.internal.schedulers.k
            r0.<init>(r2, r1)
            return r0
    }
}

package rx;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class a {
    public static final rx.a.d a = null;
    public static final rx.a.d b = null;
    public static final rx.a.d c = null;
    public static final rx.a.d d = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: rx.a$a, reason: collision with other inner class name */
    static final class C0099a implements rx.a.d {
        static final rx.a.C0099a a = null;

        static {
                rx.a$a r0 = new rx.a$a
                r0.<init>()
                rx.a.C0099a.a = r0
                return
        }

        private C0099a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // rx.a.d
        public boolean a() {
                r1 = this;
                r0 = 0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class b implements rx.a.d {
        static final rx.a.b a = null;

        static {
                rx.a$b r0 = new rx.a$b
                r0.<init>()
                rx.a.b.a = r0
                return
        }

        private b() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // rx.a.d
        public boolean a() {
                r1 = this;
                r0 = 1
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class c implements rx.a.d {
        static final rx.a.c a = null;

        static {
                rx.a$c r0 = new rx.a$c
                r0.<init>()
                rx.a.c.a = r0
                return
        }

        private c() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // rx.a.d
        public boolean a() throws rx.exceptions.MissingBackpressureException {
                r2 = this;
                rx.exceptions.MissingBackpressureException r0 = new rx.exceptions.MissingBackpressureException
                java.lang.String r1 = "Overflowed buffer"
                r0.<init>(r1)
                throw r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface d {
        boolean a() throws rx.exceptions.MissingBackpressureException;
    }

    static {
            rx.a$c r0 = rx.a.c.a
            rx.a.a = r0
            rx.a.b = r0
            rx.a$b r0 = rx.a.b.a
            rx.a.c = r0
            rx.a$a r0 = rx.a.C0099a.a
            rx.a.d = r0
            return
    }

    private a() {
            r2 = this;
            r2.<init>()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "No instances!"
            r0.<init>(r1)
            throw r0
    }
}

package kotlin.time;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.time.ExperimentalTime
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class x implements java.io.Externalizable {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.time.x.a c = null;
    private static final long serialVersionUID = 0;
    private long a;
    private int b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a {
        private a() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ a(kotlin.jvm.internal.v r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            kotlin.time.x$a r0 = new kotlin.time.x$a
            r1 = 0
            r0.<init>(r1)
            kotlin.time.x.c = r0
            return
    }

    public x() {
            r3 = this;
            r0 = 0
            r2 = 0
            r3.<init>(r0, r2)
            return
    }

    public x(long r1, int r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r3
            return
    }

    private final java.lang.Object readResolve() {
            r4 = this;
            kotlin.time.Instant$a r0 = kotlin.time.Instant.Companion
            long r1 = r4.a
            int r3 = r4.b
            kotlin.time.Instant r0 = r0.b(r1, r3)
            return r0
    }

    public final long a() {
            r2 = this;
            long r0 = r2.a
            return r0
    }

    public final int b() {
            r1 = this;
            int r0 = r1.b
            return r0
    }

    public final void c(long r1) {
            r0 = this;
            r0.a = r1
            return
    }

    public final void d(int r1) {
            r0 = this;
            r0.b = r1
            return
    }

    @Override // java.io.Externalizable
    public void readExternal(@org.jetbrains.annotations.NotNull java.io.ObjectInput r3) {
            r2 = this;
            java.lang.String r0 = "input"
            kotlin.jvm.internal.g0.p(r3, r0)
            long r0 = r3.readLong()
            r2.a = r0
            int r3 = r3.readInt()
            r2.b = r3
            return
    }

    @Override // java.io.Externalizable
    public void writeExternal(@org.jetbrains.annotations.NotNull java.io.ObjectOutput r3) {
            r2 = this;
            java.lang.String r0 = "output"
            kotlin.jvm.internal.g0.p(r3, r0)
            long r0 = r2.a
            r3.writeLong(r0)
            int r0 = r2.b
            r3.writeInt(r0)
            return
    }
}

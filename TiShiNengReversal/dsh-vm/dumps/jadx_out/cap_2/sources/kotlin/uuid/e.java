package kotlin.uuid;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.uuid.ExperimentalUuidApi
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class e implements java.io.Externalizable {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.uuid.e.a c = null;
    private static final long serialVersionUID = 0;
    private long a;
    private long b;

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
            kotlin.uuid.e$a r0 = new kotlin.uuid.e$a
            r1 = 0
            r0.<init>(r1)
            kotlin.uuid.e.c = r0
            return
    }

    public e() {
            r2 = this;
            r0 = 0
            r2.<init>(r0, r0)
            return
    }

    public e(long r1, long r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r3
            return
    }

    private final java.lang.Object readResolve() {
            r5 = this;
            kotlin.uuid.Uuid$a r0 = kotlin.uuid.Uuid.Companion
            long r1 = r5.a
            long r3 = r5.b
            kotlin.uuid.Uuid r0 = r0.b(r1, r3)
            return r0
    }

    public final long a() {
            r2 = this;
            long r0 = r2.b
            return r0
    }

    public final long b() {
            r2 = this;
            long r0 = r2.a
            return r0
    }

    public final void c(long r1) {
            r0 = this;
            r0.b = r1
            return
    }

    public final void d(long r1) {
            r0 = this;
            r0.a = r1
            return
    }

    @Override // java.io.Externalizable
    public void readExternal(@org.jetbrains.annotations.NotNull java.io.ObjectInput r3) {
            r2 = this;
            java.lang.String r0 = "input"
            kotlin.jvm.internal.g0.p(r3, r0)
            long r0 = r3.readLong()
            r2.a = r0
            long r0 = r3.readLong()
            r2.b = r0
            return
    }

    @Override // java.io.Externalizable
    public void writeExternal(@org.jetbrains.annotations.NotNull java.io.ObjectOutput r3) {
            r2 = this;
            java.lang.String r0 = "output"
            kotlin.jvm.internal.g0.p(r3, r0)
            long r0 = r2.a
            r3.writeLong(r0)
            long r0 = r2.b
            r3.writeLong(r0)
            return
    }
}

package kotlin.random;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nXorWowRandom.kt\nKotlin\n*S Kotlin\n*F\n+ 1 XorWowRandom.kt\nkotlin/random/XorWowRandom\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,68:1\n1#2:69\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class XorWowRandom extends kotlin.random.Random implements java.io.Serializable {

    @org.jetbrains.annotations.NotNull
    private static final kotlin.random.XorWowRandom.a Companion = null;
    private static final long serialVersionUID = 0;
    private int addend;
    private int v;
    private int w;
    private int x;
    private int y;
    private int z;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class a {
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
            kotlin.random.XorWowRandom$a r0 = new kotlin.random.XorWowRandom$a
            r1 = 0
            r0.<init>(r1)
            kotlin.random.XorWowRandom.Companion = r0
            return
    }

    public XorWowRandom(int r8, int r9) {
            r7 = this;
            int r5 = ~r8
            int r0 = r8 << 10
            int r1 = r9 >>> 4
            r6 = r0 ^ r1
            r3 = 0
            r4 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    public XorWowRandom(int r1, int r2, int r3, int r4, int r5, int r6) {
            r0 = this;
            r0.<init>()
            r0.x = r1
            r0.y = r2
            r0.z = r3
            r0.w = r4
            r0.v = r5
            r0.addend = r6
            r0.checkInvariants()
            r1 = 0
        L13:
            r2 = 64
            if (r1 >= r2) goto L1d
            r0.nextInt()
            int r1 = r1 + 1
            goto L13
        L1d:
            return
    }

    private final void checkInvariants() {
            r2 = this;
            int r0 = r2.x
            int r1 = r2.y
            r0 = r0 | r1
            int r1 = r2.z
            r0 = r0 | r1
            int r1 = r2.w
            r0 = r0 | r1
            int r1 = r2.v
            r0 = r0 | r1
            if (r0 == 0) goto L11
            return
        L11:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Initial state must have at least one non-zero element."
            r0.<init>(r1)
            throw r0
    }

    private final java.lang.Object readResolve() {
            r3 = this;
            r3.checkInvariants()     // Catch: java.lang.Throwable -> L4
            return r3
        L4:
            r0 = move-exception
            java.io.InvalidObjectException r1 = new java.io.InvalidObjectException
            java.lang.String r2 = r0.getMessage()
            r1.<init>(r2)
            java.lang.Throwable r0 = r1.initCause(r0)
            java.lang.String r1 = "initCause(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            throw r0
    }

    @Override // kotlin.random.Random
    public int nextBits(int r2) {
            r1 = this;
            int r0 = r1.nextInt()
            int r2 = kotlin.random.f.j(r0, r2)
            return r2
    }

    @Override // kotlin.random.Random
    public int nextInt() {
            r3 = this;
            int r0 = r3.x
            int r1 = r0 >>> 2
            r0 = r0 ^ r1
            int r1 = r3.y
            r3.x = r1
            int r1 = r3.z
            r3.y = r1
            int r1 = r3.w
            r3.z = r1
            int r1 = r3.v
            r3.w = r1
            int r2 = r0 << 1
            r0 = r0 ^ r2
            r0 = r0 ^ r1
            int r1 = r1 << 4
            r0 = r0 ^ r1
            r3.v = r0
            int r1 = r3.addend
            r2 = 362437(0x587c5, float:5.07882E-40)
            int r1 = r1 + r2
            r3.addend = r1
            int r0 = r0 + r1
            return r0
    }
}

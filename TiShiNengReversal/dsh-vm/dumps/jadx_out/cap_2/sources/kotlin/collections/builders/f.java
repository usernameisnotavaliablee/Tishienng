package kotlin.collections.builders;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class f implements java.io.Externalizable {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.collections.builders.f.a b = null;
    private static final long serialVersionUID = 0;

    @org.jetbrains.annotations.NotNull
    private java.util.Map<?, ?> a;

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
            kotlin.collections.builders.f$a r0 = new kotlin.collections.builders.f$a
            r1 = 0
            r0.<init>(r1)
            kotlin.collections.builders.f.b = r0
            return
    }

    public f() {
            r1 = this;
            java.util.Map r0 = kotlin.collections.i1.z()
            r1.<init>(r0)
            return
    }

    public f(@org.jetbrains.annotations.NotNull java.util.Map<?, ?> r2) {
            r1 = this;
            java.lang.String r0 = "map"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.a = r2
            return
    }

    private final java.lang.Object readResolve() {
            r1 = this;
            java.util.Map<?, ?> r0 = r1.a
            return r0
    }

    @Override // java.io.Externalizable
    public void readExternal(@org.jetbrains.annotations.NotNull java.io.ObjectInput r6) {
            r5 = this;
            java.lang.String r0 = "input"
            kotlin.jvm.internal.g0.p(r6, r0)
            byte r0 = r6.readByte()
            if (r0 != 0) goto L49
            int r0 = r6.readInt()
            if (r0 < 0) goto L2d
            java.util.Map r1 = kotlin.collections.i1.h(r0)
            r2 = 0
        L16:
            if (r2 >= r0) goto L26
            java.lang.Object r3 = r6.readObject()
            java.lang.Object r4 = r6.readObject()
            r1.put(r3, r4)
            int r2 = r2 + 1
            goto L16
        L26:
            java.util.Map r6 = kotlin.collections.i1.d(r1)
            r5.a = r6
            return
        L2d:
            java.io.InvalidObjectException r6 = new java.io.InvalidObjectException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Illegal size value: "
            r1.append(r2)
            r1.append(r0)
            r0 = 46
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r6.<init>(r0)
            throw r6
        L49:
            java.io.InvalidObjectException r6 = new java.io.InvalidObjectException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unsupported flags value: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r6.<init>(r0)
            throw r6
    }

    @Override // java.io.Externalizable
    public void writeExternal(@org.jetbrains.annotations.NotNull java.io.ObjectOutput r4) {
            r3 = this;
            java.lang.String r0 = "output"
            kotlin.jvm.internal.g0.p(r4, r0)
            r0 = 0
            r4.writeByte(r0)
            java.util.Map<?, ?> r0 = r3.a
            int r0 = r0.size()
            r4.writeInt(r0)
            java.util.Map<?, ?> r0 = r3.a
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L1c:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L37
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            r4.writeObject(r2)
            java.lang.Object r1 = r1.getValue()
            r4.writeObject(r1)
            goto L1c
        L37:
            return
    }
}

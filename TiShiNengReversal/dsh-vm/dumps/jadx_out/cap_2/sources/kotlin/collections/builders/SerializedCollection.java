package kotlin.collections.builders;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nListBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListBuilder.kt\nkotlin/collections/builders/SerializedCollection\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,722:1\n1#2:723\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class SerializedCollection implements java.io.Externalizable {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.collections.builders.SerializedCollection.a Companion = null;
    private static final long serialVersionUID = 0;
    public static final int tagList = 0;
    public static final int tagSet = 1;

    @org.jetbrains.annotations.NotNull
    private java.util.Collection<?> collection;
    private final int tag;

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
            kotlin.collections.builders.SerializedCollection$a r0 = new kotlin.collections.builders.SerializedCollection$a
            r1 = 0
            r0.<init>(r1)
            kotlin.collections.builders.SerializedCollection.Companion = r0
            return
    }

    public SerializedCollection() {
            r2 = this;
            java.util.List r0 = kotlin.collections.f0.J()
            java.util.Collection r0 = (java.util.Collection) r0
            r1 = 0
            r2.<init>(r0, r1)
            return
    }

    public SerializedCollection(@org.jetbrains.annotations.NotNull java.util.Collection<?> r2, int r3) {
            r1 = this;
            java.lang.String r0 = "collection"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.collection = r2
            r1.tag = r3
            return
    }

    private final java.lang.Object readResolve() {
            r1 = this;
            java.util.Collection<?> r0 = r1.collection
            return r0
    }

    @Override // java.io.Externalizable
    public void readExternal(@org.jetbrains.annotations.NotNull java.io.ObjectInput r6) {
            r5 = this;
            java.lang.String r0 = "input"
            kotlin.jvm.internal.g0.p(r6, r0)
            byte r0 = r6.readByte()
            r1 = r0 & 1
            r2 = r0 & (-2)
            r3 = 46
            if (r2 != 0) goto L7f
            int r0 = r6.readInt()
            if (r0 < 0) goto L65
            r2 = 0
            if (r1 == 0) goto L4c
            r4 = 1
            if (r1 != r4) goto L32
            java.util.Set r1 = kotlin.collections.u1.e(r0)
        L21:
            if (r2 >= r0) goto L2d
            java.lang.Object r3 = r6.readObject()
            r1.add(r3)
            int r2 = r2 + 1
            goto L21
        L2d:
            java.util.Set r6 = kotlin.collections.u1.a(r1)
            goto L62
        L32:
            java.io.InvalidObjectException r6 = new java.io.InvalidObjectException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Unsupported collection type tag: "
            r0.append(r2)
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        L4c:
            java.util.List r1 = kotlin.collections.f0.k(r0)
        L50:
            if (r2 >= r0) goto L5c
            java.lang.Object r3 = r6.readObject()
            r1.add(r3)
            int r2 = r2 + 1
            goto L50
        L5c:
            java.util.List r6 = kotlin.collections.f0.b(r1)
            java.util.Collection r6 = (java.util.Collection) r6
        L62:
            r5.collection = r6
            return
        L65:
            java.io.InvalidObjectException r6 = new java.io.InvalidObjectException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Illegal size value: "
            r1.append(r2)
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = r1.toString()
            r6.<init>(r0)
            throw r6
        L7f:
            java.io.InvalidObjectException r6 = new java.io.InvalidObjectException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unsupported flags value: "
            r1.append(r2)
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = r1.toString()
            r6.<init>(r0)
            throw r6
    }

    @Override // java.io.Externalizable
    public void writeExternal(@org.jetbrains.annotations.NotNull java.io.ObjectOutput r3) {
            r2 = this;
            java.lang.String r0 = "output"
            kotlin.jvm.internal.g0.p(r3, r0)
            int r0 = r2.tag
            r3.writeByte(r0)
            java.util.Collection<?> r0 = r2.collection
            int r0 = r0.size()
            r3.writeInt(r0)
            java.util.Collection<?> r0 = r2.collection
            java.util.Iterator r0 = r0.iterator()
        L19:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L27
            java.lang.Object r1 = r0.next()
            r3.writeObject(r1)
            goto L19
        L27:
            return
    }
}

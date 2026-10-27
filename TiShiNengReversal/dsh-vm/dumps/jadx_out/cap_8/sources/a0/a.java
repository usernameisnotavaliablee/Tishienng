package a0;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nByteHexExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ByteHexExt.kt\ncom/bxkj/base/v2/netty4android/client/ext/ByteHexExt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,54:1\n1#2:55\n1563#3:56\n1634#3,3:57\n*S KotlinDebug\n*F\n+ 1 ByteHexExt.kt\ncom/bxkj/base/v2/netty4android/client/ext/ByteHexExt\n*L\n28#1:56\n28#1:57,3\n*E\n"})
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class a {

    @org.jetbrains.annotations.NotNull
    public static final a0.a a = null;

    static {
            a0.a r0 = new a0.a
            r0.<init>()
            a0.a.a = r0
            return
    }

    private a() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ java.lang.String d(a0.a r0, io.netty.buffer.ByteBuf r1, java.lang.String r2, int r3, java.lang.Object r4) {
            r3 = r3 & 1
            if (r3 == 0) goto L6
            java.lang.String r2 = "解析数据："
        L6:
            java.lang.String r0 = r0.c(r1, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final byte[] a(@org.jetbrains.annotations.NotNull java.lang.String r4) {
            r3 = this;
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            int r0 = r4.length()
            r1 = 2
            int r0 = r0 % r1
            if (r0 != 0) goto L46
            java.util.List r4 = kotlin.text.u.T6(r4, r1)
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = kotlin.collections.f0.d0(r4, r1)
            r0.<init>(r1)
            java.util.Iterator r4 = r4.iterator()
        L22:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L41
            java.lang.Object r1 = r4.next()
            java.lang.String r1 = (java.lang.String) r1
            r2 = 16
            int r2 = kotlin.text.b.a(r2)
            int r1 = java.lang.Integer.parseInt(r1, r2)
            byte r1 = (byte) r1
            java.lang.Byte r1 = java.lang.Byte.valueOf(r1)
            r0.add(r1)
            goto L22
        L41:
            byte[] r4 = kotlin.collections.f0.T5(r0)
            return r4
        L46:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "Must have an even length"
            r4.<init>(r0)
            throw r4
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String b(@org.jetbrains.annotations.NotNull byte[] r8) {
            r7 = this;
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r8, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r8.length
            r2 = 0
            r3 = 0
        Ld:
            if (r3 >= r1) goto L31
            r4 = r8[r3]
            kotlin.jvm.internal.t0 r5 = kotlin.jvm.internal.t0.a
            java.lang.Byte r4 = java.lang.Byte.valueOf(r4)
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]
            r6[r2] = r4
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r6, r5)
            java.lang.String r5 = "%02X"
            java.lang.String r4 = java.lang.String.format(r5, r4)
            java.lang.String r5 = "format(...)"
            kotlin.jvm.internal.g0.o(r4, r5)
            r0.append(r4)
            int r3 = r3 + 1
            goto Ld
        L31:
            java.lang.String r8 = r0.toString()
            java.lang.String r0 = "toString(...)"
            kotlin.jvm.internal.g0.o(r8, r0)
            return r8
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String c(@org.jetbrains.annotations.NotNull io.netty.buffer.ByteBuf r2, @org.jetbrains.annotations.Nullable java.lang.String r3) {
            r1 = this;
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            int r0 = r2.readableBytes()
            byte[] r0 = new byte[r0]
            r2.readBytes(r0)
            java.lang.String r2 = r1.b(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            r0.append(r2)
            java.lang.String r3 = r0.toString()
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            com.orhanobut.logger.j.g(r3, r0)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public final byte[] e(int r2) {
            r1 = this;
            r0 = 4
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            java.nio.ByteBuffer r2 = r0.putInt(r2)
            byte[] r2 = r2.array()
            java.lang.String r0 = "array(...)"
            kotlin.jvm.internal.g0.o(r2, r0)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public final byte[] f(short r4) {
            r3 = this;
            r0 = 2
            byte[] r0 = new byte[r0]
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.wrap(r0)
            java.nio.ByteOrder r2 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r1 = r1.order(r2)
            java.nio.ShortBuffer r1 = r1.asShortBuffer()
            r1.put(r4)
            return r0
    }
}

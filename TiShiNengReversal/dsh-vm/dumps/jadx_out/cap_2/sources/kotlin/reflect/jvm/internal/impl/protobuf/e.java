package kotlin.reflect.jvm.internal.impl.protobuf;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class e {
    private final byte[] a;
    private final boolean b;
    private int c;
    private int d;
    private int e;
    private final java.io.InputStream f;
    private int g;
    private boolean h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;
    private kotlin.reflect.jvm.internal.impl.protobuf.e.a n;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private interface a {
        void a();
    }

    private e(java.io.InputStream r3) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.h = r0
            r1 = 2147483647(0x7fffffff, float:NaN)
            r2.j = r1
            r1 = 64
            r2.l = r1
            r1 = 67108864(0x4000000, float:1.5046328E-36)
            r2.m = r1
            r1 = 0
            r2.n = r1
            r1 = 4096(0x1000, float:5.74E-42)
            byte[] r1 = new byte[r1]
            r2.a = r1
            r2.c = r0
            r2.e = r0
            r2.i = r0
            r2.f = r3
            r2.b = r0
            return
    }

    private e(kotlin.reflect.jvm.internal.impl.protobuf.m r3) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.h = r0
            r0 = 2147483647(0x7fffffff, float:NaN)
            r2.j = r0
            r0 = 64
            r2.l = r0
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            r2.m = r0
            r0 = 0
            r2.n = r0
            byte[] r1 = r3.c
            r2.a = r1
            int r1 = r3.E()
            r2.e = r1
            int r3 = r3.size()
            int r1 = r1 + r3
            r2.c = r1
            int r3 = r2.e
            int r3 = -r3
            r2.i = r3
            r2.f = r0
            r3 = 1
            r2.b = r3
            return
    }

    public static int B(int r3, java.io.InputStream r4) throws java.io.IOException {
            r0 = r3 & 128(0x80, float:1.8E-43)
            if (r0 != 0) goto L5
            return r3
        L5:
            r3 = r3 & 127(0x7f, float:1.78E-43)
            r0 = 7
        L8:
            r1 = 32
            r2 = -1
            if (r0 >= r1) goto L24
            int r1 = r4.read()
            if (r1 == r2) goto L1f
            r2 = r1 & 127(0x7f, float:1.78E-43)
            int r2 = r2 << r0
            r3 = r3 | r2
            r1 = r1 & 128(0x80, float:1.8E-43)
            if (r1 != 0) goto L1c
            return r3
        L1c:
            int r0 = r0 + 7
            goto L8
        L1f:
            kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException r3 = kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException.truncatedMessage()
            throw r3
        L24:
            r1 = 64
            if (r0 >= r1) goto L3b
            int r1 = r4.read()
            if (r1 == r2) goto L36
            r1 = r1 & 128(0x80, float:1.8E-43)
            if (r1 != 0) goto L33
            return r3
        L33:
            int r0 = r0 + 7
            goto L24
        L36:
            kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException r3 = kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException.truncatedMessage()
            throw r3
        L3b:
            kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException r3 = kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException.malformedVarint()
            throw r3
    }

    private void N() {
            r3 = this;
            int r0 = r3.c
            int r1 = r3.d
            int r0 = r0 + r1
            r3.c = r0
            int r1 = r3.i
            int r1 = r1 + r0
            int r2 = r3.j
            if (r1 <= r2) goto L15
            int r1 = r1 - r2
            r3.d = r1
            int r0 = r0 - r1
            r3.c = r0
            return
        L15:
            r0 = 0
            r3.d = r0
            return
    }

    private void O(int r1) throws java.io.IOException {
            r0 = this;
            boolean r1 = r0.T(r1)
            if (r1 == 0) goto L7
            return
        L7:
            kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException r1 = kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException.truncatedMessage()
            throw r1
    }

    private void S(int r5) throws java.io.IOException {
            r4 = this;
            if (r5 < 0) goto L31
            int r0 = r4.i
            int r1 = r4.e
            int r2 = r0 + r1
            int r2 = r2 + r5
            int r3 = r4.j
            if (r2 > r3) goto L27
            int r0 = r4.c
            int r1 = r0 - r1
            r4.e = r0
            r0 = 1
            r4.O(r0)
        L17:
            int r2 = r5 - r1
            int r3 = r4.c
            if (r2 <= r3) goto L24
            int r1 = r1 + r3
            r4.e = r3
            r4.O(r0)
            goto L17
        L24:
            r4.e = r2
            return
        L27:
            int r3 = r3 - r0
            int r3 = r3 - r1
            r4.R(r3)
            kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException r5 = kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException.truncatedMessage()
            throw r5
        L31:
            kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException r5 = kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException.negativeSize()
            throw r5
    }

    private boolean T(int r6) throws java.io.IOException {
            r5 = this;
            int r0 = r5.e
            int r1 = r0 + r6
            int r2 = r5.c
            if (r1 <= r2) goto L8e
            int r1 = r5.i
            int r1 = r1 + r0
            int r1 = r1 + r6
            int r0 = r5.j
            r2 = 0
            if (r1 <= r0) goto L12
            return r2
        L12:
            kotlin.reflect.jvm.internal.impl.protobuf.e$a r0 = r5.n
            if (r0 == 0) goto L19
            r0.a()
        L19:
            java.io.InputStream r0 = r5.f
            if (r0 == 0) goto L8d
            int r0 = r5.e
            if (r0 <= 0) goto L37
            int r1 = r5.c
            if (r1 <= r0) goto L2b
            byte[] r3 = r5.a
            int r1 = r1 - r0
            java.lang.System.arraycopy(r3, r0, r3, r2, r1)
        L2b:
            int r1 = r5.i
            int r1 = r1 + r0
            r5.i = r1
            int r1 = r5.c
            int r1 = r1 - r0
            r5.c = r1
            r5.e = r2
        L37:
            java.io.InputStream r0 = r5.f
            byte[] r1 = r5.a
            int r3 = r5.c
            int r4 = r1.length
            int r4 = r4 - r3
            int r0 = r0.read(r1, r3, r4)
            if (r0 == 0) goto L6f
            r1 = -1
            if (r0 < r1) goto L6f
            byte[] r1 = r5.a
            int r1 = r1.length
            if (r0 > r1) goto L6f
            if (r0 <= 0) goto L8d
            int r1 = r5.c
            int r1 = r1 + r0
            r5.c = r1
            int r0 = r5.i
            int r0 = r0 + r6
            int r1 = r5.m
            int r0 = r0 - r1
            if (r0 > 0) goto L6a
            r5.N()
            int r0 = r5.c
            if (r0 < r6) goto L65
            r6 = 1
            return r6
        L65:
            boolean r6 = r5.T(r6)
            return r6
        L6a:
            kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException r6 = kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException.sizeLimitExceeded()
            throw r6
        L6f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 102(0x66, float:1.43E-43)
            r1.<init>(r2)
            java.lang.String r2 = "InputStream#read(byte[]) returned invalid result: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = "\nThe InputStream implementation is buggy."
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r6.<init>(r0)
            throw r6
        L8d:
            return r2
        L8e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 77
            r1.<init>(r2)
            java.lang.String r2 = "refillBuffer() called when "
            r1.append(r2)
            r1.append(r6)
            java.lang.String r6 = " bytes were already available in buffer"
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            r0.<init>(r6)
            throw r0
    }

    public static int b(int r1) {
            int r0 = r1 >>> 1
            r1 = r1 & 1
            int r1 = -r1
            r1 = r1 ^ r0
            return r1
    }

    public static long c(long r4) {
            r0 = 1
            long r0 = r4 >>> r0
            r2 = 1
            long r4 = r4 & r2
            long r4 = -r4
            long r4 = r4 ^ r0
            return r4
    }

    private void d(int r3) throws java.io.IOException {
            r2 = this;
            int r0 = r2.c
            int r1 = r2.e
            int r0 = r0 - r1
            if (r0 >= r3) goto La
            r2.O(r3)
        La:
            return
    }

    public static kotlin.reflect.jvm.internal.impl.protobuf.e g(java.io.InputStream r1) {
            kotlin.reflect.jvm.internal.impl.protobuf.e r0 = new kotlin.reflect.jvm.internal.impl.protobuf.e
            r0.<init>(r1)
            return r0
    }

    static kotlin.reflect.jvm.internal.impl.protobuf.e h(kotlin.reflect.jvm.internal.impl.protobuf.m r1) {
            kotlin.reflect.jvm.internal.impl.protobuf.e r0 = new kotlin.reflect.jvm.internal.impl.protobuf.e
            r0.<init>(r1)
            int r1 = r1.size()     // Catch: kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Ld
            r0.j(r1)     // Catch: kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Ld
            return r0
        Ld:
            r1 = move-exception
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
    }

    private byte[] x(int r13) throws java.io.IOException {
            r12 = this;
            if (r13 > 0) goto Lc
            if (r13 != 0) goto L7
            byte[] r13 = kotlin.reflect.jvm.internal.impl.protobuf.h.a
            return r13
        L7:
            kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException r13 = kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException.negativeSize()
            throw r13
        Lc:
            int r0 = r12.i
            int r1 = r12.e
            int r2 = r0 + r1
            int r2 = r2 + r13
            int r3 = r12.j
            if (r2 > r3) goto L91
            r2 = 4096(0x1000, float:5.74E-42)
            r3 = 0
            if (r13 >= r2) goto L36
            byte[] r0 = new byte[r13]
            int r2 = r12.c
            int r2 = r2 - r1
            byte[] r4 = r12.a
            java.lang.System.arraycopy(r4, r1, r0, r3, r2)
            int r1 = r12.c
            r12.e = r1
            int r13 = r13 - r2
            r12.d(r13)
            byte[] r1 = r12.a
            java.lang.System.arraycopy(r1, r3, r0, r2, r13)
            r12.e = r13
            return r0
        L36:
            int r4 = r12.c
            int r0 = r0 + r4
            r12.i = r0
            r12.e = r3
            r12.c = r3
            int r4 = r4 - r1
            int r0 = r13 - r4
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
        L47:
            if (r0 <= 0) goto L72
            int r6 = java.lang.Math.min(r0, r2)
            byte[] r7 = new byte[r6]
            r8 = 0
        L50:
            if (r8 >= r6) goto L6d
            java.io.InputStream r9 = r12.f
            r10 = -1
            if (r9 != 0) goto L59
            r9 = -1
            goto L5f
        L59:
            int r11 = r6 - r8
            int r9 = r9.read(r7, r8, r11)
        L5f:
            if (r9 == r10) goto L68
            int r10 = r12.i
            int r10 = r10 + r9
            r12.i = r10
            int r8 = r8 + r9
            goto L50
        L68:
            kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException r13 = kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException.truncatedMessage()
            throw r13
        L6d:
            int r0 = r0 - r6
            r5.add(r7)
            goto L47
        L72:
            byte[] r13 = new byte[r13]
            byte[] r0 = r12.a
            java.lang.System.arraycopy(r0, r1, r13, r3, r4)
            java.util.Iterator r0 = r5.iterator()
        L7d:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L90
            java.lang.Object r1 = r0.next()
            byte[] r1 = (byte[]) r1
            int r2 = r1.length
            java.lang.System.arraycopy(r1, r3, r13, r4, r2)
            int r1 = r1.length
            int r4 = r4 + r1
            goto L7d
        L90:
            return r13
        L91:
            int r3 = r3 - r0
            int r3 = r3 - r1
            r12.R(r3)
            kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException r13 = kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException.truncatedMessage()
            throw r13
    }

    public int A() throws java.io.IOException {
            r11 = this;
            int r0 = r11.e
            int r1 = r11.c
            if (r1 != r0) goto L8
            goto L7f
        L8:
            byte[] r2 = r11.a
            int r3 = r0 + 1
            r4 = r2[r0]
            if (r4 < 0) goto L13
            r11.e = r3
            return r4
        L13:
            int r1 = r1 - r3
            r5 = 9
            if (r1 >= r5) goto L19
            goto L7f
        L19:
            int r1 = r0 + 2
            r3 = r2[r3]
            int r3 = r3 << 7
            r3 = r3 ^ r4
            long r4 = (long) r3
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 >= 0) goto L2d
            r2 = -128(0xffffffffffffff80, double:NaN)
            long r2 = r2 ^ r4
            int r0 = (int) r2
            goto L8d
        L2d:
            int r4 = r0 + 3
            r1 = r2[r1]
            int r1 = r1 << 14
            r1 = r1 ^ r3
            long r8 = (long) r1
            int r3 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r3 < 0) goto L3f
            r0 = 16256(0x3f80, double:8.0315E-320)
            long r0 = r0 ^ r8
            int r0 = (int) r0
        L3d:
            r1 = r4
            goto L8d
        L3f:
            int r3 = r0 + 4
            r4 = r2[r4]
            int r4 = r4 << 21
            r1 = r1 ^ r4
            long r4 = (long) r1
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 >= 0) goto L52
            r0 = -2080896(0xffffffffffe03f80, double:NaN)
            long r0 = r0 ^ r4
            int r0 = (int) r0
        L50:
            r1 = r3
            goto L8d
        L52:
            int r4 = r0 + 5
            r3 = r2[r3]
            int r5 = r3 << 28
            r1 = r1 ^ r5
            long r5 = (long) r1
            r7 = 266354560(0xfe03f80, double:1.315966377E-315)
            long r5 = r5 ^ r7
            int r1 = (int) r5
            if (r3 >= 0) goto L89
            int r3 = r0 + 6
            r4 = r2[r4]
            if (r4 >= 0) goto L8b
            int r4 = r0 + 7
            r3 = r2[r3]
            if (r3 >= 0) goto L89
            int r3 = r0 + 8
            r4 = r2[r4]
            if (r4 >= 0) goto L8b
            int r4 = r0 + 9
            r3 = r2[r3]
            if (r3 >= 0) goto L89
            int r0 = r0 + 10
            r2 = r2[r4]
            if (r2 >= 0) goto L85
        L7f:
            long r0 = r11.D()
            int r1 = (int) r0
            return r1
        L85:
            r10 = r1
            r1 = r0
            r0 = r10
            goto L8d
        L89:
            r0 = r1
            goto L3d
        L8b:
            r0 = r1
            goto L50
        L8d:
            r11.e = r1
            return r0
    }

    public long C() throws java.io.IOException {
            r10 = this;
            int r0 = r10.e
            int r1 = r10.c
            if (r1 != r0) goto L8
            goto Lb6
        L8:
            byte[] r2 = r10.a
            int r3 = r0 + 1
            r4 = r2[r0]
            if (r4 < 0) goto L14
            r10.e = r3
            long r0 = (long) r4
            return r0
        L14:
            int r1 = r1 - r3
            r5 = 9
            if (r1 >= r5) goto L1b
            goto Lb6
        L1b:
            int r1 = r0 + 2
            r3 = r2[r3]
            int r3 = r3 << 7
            r3 = r3 ^ r4
            long r3 = (long) r3
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 >= 0) goto L2e
            r5 = -128(0xffffffffffffff80, double:NaN)
        L2b:
            long r3 = r3 ^ r5
            goto Lbb
        L2e:
            int r7 = r0 + 3
            r1 = r2[r1]
            int r1 = r1 << 14
            long r8 = (long) r1
            long r3 = r3 ^ r8
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 < 0) goto L40
            r0 = 16256(0x3f80, double:8.0315E-320)
        L3c:
            long r3 = r3 ^ r0
        L3d:
            r1 = r7
            goto Lbb
        L40:
            int r1 = r0 + 4
            r7 = r2[r7]
            int r7 = r7 << 21
            long r7 = (long) r7
            long r3 = r3 ^ r7
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 >= 0) goto L50
            r5 = -2080896(0xffffffffffe03f80, double:NaN)
            goto L2b
        L50:
            int r7 = r0 + 5
            r1 = r2[r1]
            long r8 = (long) r1
            r1 = 28
            long r8 = r8 << r1
            long r3 = r3 ^ r8
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 < 0) goto L61
            r0 = 266354560(0xfe03f80, double:1.315966377E-315)
            goto L3c
        L61:
            int r1 = r0 + 6
            r7 = r2[r7]
            long r7 = (long) r7
            r9 = 35
            long r7 = r7 << r9
            long r3 = r3 ^ r7
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 >= 0) goto L74
            r5 = -34093383808(0xfffffff80fe03f80, double:NaN)
            goto L2b
        L74:
            int r7 = r0 + 7
            r1 = r2[r1]
            long r8 = (long) r1
            r1 = 42
            long r8 = r8 << r1
            long r3 = r3 ^ r8
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 < 0) goto L87
            r0 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
            goto L3c
        L87:
            int r1 = r0 + 8
            r7 = r2[r7]
            long r7 = (long) r7
            r9 = 49
            long r7 = r7 << r9
            long r3 = r3 ^ r7
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 >= 0) goto L9a
            r5 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
            goto L2b
        L9a:
            int r7 = r0 + 9
            r1 = r2[r1]
            long r8 = (long) r1
            r1 = 56
            long r8 = r8 << r1
            long r3 = r3 ^ r8
            r8 = 71499008037633920(0xfe03f80fe03f80, double:6.838959413692434E-304)
            long r3 = r3 ^ r8
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 >= 0) goto L3d
            int r1 = r0 + 10
            r0 = r2[r7]
            long r7 = (long) r0
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 >= 0) goto Lbb
        Lb6:
            long r0 = r10.D()
            return r0
        Lbb:
            r10.e = r1
            return r3
    }

    long D() throws java.io.IOException {
            r6 = this;
            r0 = 0
            r2 = 0
        L3:
            r3 = 64
            if (r2 >= r3) goto L18
            byte r3 = r6.w()
            r4 = r3 & 127(0x7f, float:1.78E-43)
            long r4 = (long) r4
            long r4 = r4 << r2
            long r0 = r0 | r4
            r3 = r3 & 128(0x80, float:1.8E-43)
            if (r3 != 0) goto L15
            return r0
        L15:
            int r2 = r2 + 7
            goto L3
        L18:
            kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException r0 = kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException.malformedVarint()
            throw r0
    }

    public int E() throws java.io.IOException {
            r1 = this;
            int r0 = r1.y()
            return r0
    }

    public long F() throws java.io.IOException {
            r2 = this;
            long r0 = r2.z()
            return r0
    }

    public int G() throws java.io.IOException {
            r1 = this;
            int r0 = r1.A()
            int r0 = b(r0)
            return r0
    }

    public long H() throws java.io.IOException {
            r2 = this;
            long r0 = r2.C()
            long r0 = c(r0)
            return r0
    }

    public java.lang.String I() throws java.io.IOException {
            r5 = this;
            int r0 = r5.A()
            int r1 = r5.c
            int r2 = r5.e
            int r1 = r1 - r2
            java.lang.String r3 = "UTF-8"
            if (r0 > r1) goto L1c
            if (r0 <= 0) goto L1c
            java.lang.String r1 = new java.lang.String
            byte[] r4 = r5.a
            r1.<init>(r4, r2, r0, r3)
            int r2 = r5.e
            int r2 = r2 + r0
            r5.e = r2
            return r1
        L1c:
            if (r0 != 0) goto L21
            java.lang.String r0 = ""
            return r0
        L21:
            java.lang.String r1 = new java.lang.String
            byte[] r0 = r5.x(r0)
            r1.<init>(r0, r3)
            return r1
    }

    public java.lang.String J() throws java.io.IOException {
            r5 = this;
            int r0 = r5.A()
            int r1 = r5.e
            int r2 = r5.c
            int r2 = r2 - r1
            if (r0 > r2) goto L14
            if (r0 <= 0) goto L14
            byte[] r2 = r5.a
            int r3 = r1 + r0
            r5.e = r3
            goto L1e
        L14:
            if (r0 != 0) goto L19
            java.lang.String r0 = ""
            return r0
        L19:
            byte[] r2 = r5.x(r0)
            r1 = 0
        L1e:
            int r3 = r1 + r0
            boolean r3 = kotlin.reflect.jvm.internal.impl.protobuf.u.f(r2, r1, r3)
            if (r3 == 0) goto L2e
            java.lang.String r3 = new java.lang.String
            java.lang.String r4 = "UTF-8"
            r3.<init>(r2, r1, r0, r4)
            return r3
        L2e:
            kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException r0 = kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException.invalidUtf8()
            throw r0
    }

    public int K() throws java.io.IOException {
            r1 = this;
            boolean r0 = r1.f()
            if (r0 == 0) goto La
            r0 = 0
            r1.g = r0
            return r0
        La:
            int r0 = r1.A()
            r1.g = r0
            int r0 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.a(r0)
            if (r0 == 0) goto L19
            int r0 = r1.g
            return r0
        L19:
            kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException r0 = kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException.invalidTag()
            throw r0
    }

    public int L() throws java.io.IOException {
            r1 = this;
            int r0 = r1.A()
            return r0
    }

    public long M() throws java.io.IOException {
            r2 = this;
            long r0 = r2.C()
            return r0
    }

    public boolean P(int r5, kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream r6) throws java.io.IOException {
            r4 = this;
            int r0 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.b(r5)
            r1 = 1
            if (r0 == 0) goto L52
            if (r0 == r1) goto L47
            r2 = 2
            if (r0 == r2) goto L3c
            r2 = 3
            r3 = 4
            if (r0 == r2) goto L27
            if (r0 == r3) goto L25
            r2 = 5
            if (r0 != r2) goto L20
            int r0 = r4.y()
            r6.s0(r5)
            r6.Y(r0)
            return r1
        L20:
            kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException r5 = kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException.invalidWireType()
            throw r5
        L25:
            r5 = 0
            return r5
        L27:
            r6.s0(r5)
            r4.Q(r6)
            int r5 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.a(r5)
            int r5 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.c(r5, r3)
            r4.a(r5)
            r6.s0(r5)
            return r1
        L3c:
            kotlin.reflect.jvm.internal.impl.protobuf.d r0 = r4.l()
            r6.s0(r5)
            r6.T(r0)
            return r1
        L47:
            long r2 = r4.z()
            r6.s0(r5)
            r6.Z(r2)
            return r1
        L52:
            long r2 = r4.t()
            r6.s0(r5)
            r6.D0(r2)
            return r1
    }

    public void Q(kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream r2) throws java.io.IOException {
            r1 = this;
        L0:
            int r0 = r1.K()
            if (r0 == 0) goto Lc
            boolean r0 = r1.P(r0, r2)
            if (r0 != 0) goto L0
        Lc:
            return
    }

    public void R(int r3) throws java.io.IOException {
            r2 = this;
            int r0 = r2.c
            int r1 = r2.e
            int r0 = r0 - r1
            if (r3 > r0) goto Ld
            if (r3 < 0) goto Ld
            int r1 = r1 + r3
            r2.e = r1
            return
        Ld:
            r2.S(r3)
            return
    }

    public void a(int r2) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
            r1 = this;
            int r0 = r1.g
            if (r0 != r2) goto L5
            return
        L5:
            kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException r2 = kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException.invalidEndTag()
            throw r2
    }

    public int e() {
            r3 = this;
            int r0 = r3.j
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r0 != r1) goto L9
            r0 = -1
            return r0
        L9:
            int r1 = r3.i
            int r2 = r3.e
            int r1 = r1 + r2
            int r0 = r0 - r1
            return r0
    }

    public boolean f() throws java.io.IOException {
            r2 = this;
            int r0 = r2.e
            int r1 = r2.c
            if (r0 != r1) goto Le
            r0 = 1
            boolean r1 = r2.T(r0)
            if (r1 != 0) goto Le
            return r0
        Le:
            r0 = 0
            return r0
    }

    public void i(int r1) {
            r0 = this;
            r0.j = r1
            r0.N()
            return
    }

    public int j(int r3) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
            r2 = this;
            if (r3 < 0) goto L17
            int r0 = r2.i
            int r1 = r2.e
            int r0 = r0 + r1
            int r3 = r3 + r0
            int r0 = r2.j
            if (r3 > r0) goto L12
            r2.j = r3
            r2.N()
            return r0
        L12:
            kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException r3 = kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException.truncatedMessage()
            throw r3
        L17:
            kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException r3 = kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException.negativeSize()
            throw r3
    }

    public boolean k() throws java.io.IOException {
            r5 = this;
            long r0 = r5.C()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    public kotlin.reflect.jvm.internal.impl.protobuf.d l() throws java.io.IOException {
            r4 = this;
            int r0 = r4.A()
            int r1 = r4.c
            int r2 = r4.e
            int r1 = r1 - r2
            if (r0 > r1) goto L2b
            if (r0 <= 0) goto L2b
            boolean r1 = r4.b
            if (r1 == 0) goto L1f
            boolean r1 = r4.h
            if (r1 == 0) goto L1f
            kotlin.reflect.jvm.internal.impl.protobuf.c r1 = new kotlin.reflect.jvm.internal.impl.protobuf.c
            byte[] r2 = r4.a
            int r3 = r4.e
            r1.<init>(r2, r3, r0)
            goto L25
        L1f:
            byte[] r1 = r4.a
            kotlin.reflect.jvm.internal.impl.protobuf.d r1 = kotlin.reflect.jvm.internal.impl.protobuf.d.g(r1, r2, r0)
        L25:
            int r2 = r4.e
            int r2 = r2 + r0
            r4.e = r2
            return r1
        L2b:
            if (r0 != 0) goto L30
            kotlin.reflect.jvm.internal.impl.protobuf.d r0 = kotlin.reflect.jvm.internal.impl.protobuf.d.a
            return r0
        L30:
            kotlin.reflect.jvm.internal.impl.protobuf.m r1 = new kotlin.reflect.jvm.internal.impl.protobuf.m
            byte[] r0 = r4.x(r0)
            r1.<init>(r0)
            return r1
    }

    public double m() throws java.io.IOException {
            r2 = this;
            long r0 = r2.z()
            double r0 = java.lang.Double.longBitsToDouble(r0)
            return r0
    }

    public int n() throws java.io.IOException {
            r1 = this;
            int r0 = r1.A()
            return r0
    }

    public int o() throws java.io.IOException {
            r1 = this;
            int r0 = r1.y()
            return r0
    }

    public long p() throws java.io.IOException {
            r2 = this;
            long r0 = r2.z()
            return r0
    }

    public float q() throws java.io.IOException {
            r1 = this;
            int r0 = r1.y()
            float r0 = java.lang.Float.intBitsToFloat(r0)
            return r0
    }

    public void r(int r3, kotlin.reflect.jvm.internal.impl.protobuf.n.a r4, kotlin.reflect.jvm.internal.impl.protobuf.f r5) throws java.io.IOException {
            r2 = this;
            int r0 = r2.k
            int r1 = r2.l
            if (r0 >= r1) goto L1c
            int r0 = r0 + 1
            r2.k = r0
            r4.d(r2, r5)
            r4 = 4
            int r3 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.c(r3, r4)
            r2.a(r3)
            int r3 = r2.k
            int r3 = r3 + (-1)
            r2.k = r3
            return
        L1c:
            kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException r3 = kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException.recursionLimitExceeded()
            throw r3
    }

    public int s() throws java.io.IOException {
            r1 = this;
            int r0 = r1.A()
            return r0
    }

    public long t() throws java.io.IOException {
            r2 = this;
            long r0 = r2.C()
            return r0
    }

    public <T extends kotlin.reflect.jvm.internal.impl.protobuf.n> T u(kotlin.reflect.jvm.internal.impl.protobuf.p<T> r4, kotlin.reflect.jvm.internal.impl.protobuf.f r5) throws java.io.IOException {
            r3 = this;
            int r0 = r3.A()
            int r1 = r3.k
            int r2 = r3.l
            if (r1 >= r2) goto L28
            int r0 = r3.j(r0)
            int r1 = r3.k
            int r1 = r1 + 1
            r3.k = r1
            java.lang.Object r4 = r4.d(r3, r5)
            kotlin.reflect.jvm.internal.impl.protobuf.n r4 = (kotlin.reflect.jvm.internal.impl.protobuf.n) r4
            r5 = 0
            r3.a(r5)
            int r5 = r3.k
            int r5 = r5 + (-1)
            r3.k = r5
            r3.i(r0)
            return r4
        L28:
            kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException r4 = kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException.recursionLimitExceeded()
            throw r4
    }

    public void v(kotlin.reflect.jvm.internal.impl.protobuf.n.a r4, kotlin.reflect.jvm.internal.impl.protobuf.f r5) throws java.io.IOException {
            r3 = this;
            int r0 = r3.A()
            int r1 = r3.k
            int r2 = r3.l
            if (r1 >= r2) goto L25
            int r0 = r3.j(r0)
            int r1 = r3.k
            int r1 = r1 + 1
            r3.k = r1
            r4.d(r3, r5)
            r4 = 0
            r3.a(r4)
            int r4 = r3.k
            int r4 = r4 + (-1)
            r3.k = r4
            r3.i(r0)
            return
        L25:
            kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException r4 = kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException.recursionLimitExceeded()
            throw r4
    }

    public byte w() throws java.io.IOException {
            r3 = this;
            int r0 = r3.e
            int r1 = r3.c
            if (r0 != r1) goto La
            r0 = 1
            r3.O(r0)
        La:
            byte[] r0 = r3.a
            int r1 = r3.e
            int r2 = r1 + 1
            r3.e = r2
            r0 = r0[r1]
            return r0
    }

    public int y() throws java.io.IOException {
            r4 = this;
            int r0 = r4.e
            int r1 = r4.c
            int r1 = r1 - r0
            r2 = 4
            if (r1 >= r2) goto Ld
            r4.O(r2)
            int r0 = r4.e
        Ld:
            byte[] r1 = r4.a
            int r2 = r0 + 4
            r4.e = r2
            r2 = r1[r0]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r3 = r0 + 1
            r3 = r1[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 << 8
            r2 = r2 | r3
            int r3 = r0 + 2
            r3 = r1[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 << 16
            r2 = r2 | r3
            int r0 = r0 + 3
            r0 = r1[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 24
            r0 = r0 | r2
            return r0
    }

    public long z() throws java.io.IOException {
            r9 = this;
            int r0 = r9.e
            int r1 = r9.c
            int r1 = r1 - r0
            r2 = 8
            if (r1 >= r2) goto Le
            r9.O(r2)
            int r0 = r9.e
        Le:
            byte[] r1 = r9.a
            int r3 = r0 + 8
            r9.e = r3
            r3 = r1[r0]
            long r3 = (long) r3
            r5 = 255(0xff, double:1.26E-321)
            long r3 = r3 & r5
            int r7 = r0 + 1
            r7 = r1[r7]
            long r7 = (long) r7
            long r7 = r7 & r5
            long r7 = r7 << r2
            long r3 = r3 | r7
            int r2 = r0 + 2
            r2 = r1[r2]
            long r7 = (long) r2
            long r7 = r7 & r5
            r2 = 16
            long r7 = r7 << r2
            long r3 = r3 | r7
            int r2 = r0 + 3
            r2 = r1[r2]
            long r7 = (long) r2
            long r7 = r7 & r5
            r2 = 24
            long r7 = r7 << r2
            long r3 = r3 | r7
            int r2 = r0 + 4
            r2 = r1[r2]
            long r7 = (long) r2
            long r7 = r7 & r5
            r2 = 32
            long r7 = r7 << r2
            long r3 = r3 | r7
            int r2 = r0 + 5
            r2 = r1[r2]
            long r7 = (long) r2
            long r7 = r7 & r5
            r2 = 40
            long r7 = r7 << r2
            long r3 = r3 | r7
            int r2 = r0 + 6
            r2 = r1[r2]
            long r7 = (long) r2
            long r7 = r7 & r5
            r2 = 48
            long r7 = r7 << r2
            long r3 = r3 | r7
            int r0 = r0 + 7
            r0 = r1[r0]
            long r0 = (long) r0
            long r0 = r0 & r5
            r2 = 56
            long r0 = r0 << r2
            long r0 = r0 | r3
            return r0
    }
}

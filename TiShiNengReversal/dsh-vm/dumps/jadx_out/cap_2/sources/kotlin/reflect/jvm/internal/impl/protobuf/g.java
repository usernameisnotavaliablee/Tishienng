package kotlin.reflect.jvm.internal.impl.protobuf;

import kotlin.reflect.jvm.internal.impl.protobuf.g.b;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class g<FieldDescriptorType extends kotlin.reflect.jvm.internal.impl.protobuf.g.b<FieldDescriptorType>> {
    private static final kotlin.reflect.jvm.internal.impl.protobuf.g d = null;
    private final kotlin.reflect.jvm.internal.impl.protobuf.s<FieldDescriptorType, java.lang.Object> a;
    private boolean b;
    private boolean c;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a = null;
        static final /* synthetic */ int[] b = null;

        static {
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType[] r0 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                kotlin.reflect.jvm.internal.impl.protobuf.g.a.b = r0
                r1 = 1
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r2 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.DOUBLE     // Catch: java.lang.NoSuchFieldError -> L12
                int r2 = r2.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r0[r2] = r1     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                r0 = 2
                int[] r2 = kotlin.reflect.jvm.internal.impl.protobuf.g.a.b     // Catch: java.lang.NoSuchFieldError -> L1d
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r3 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.FLOAT     // Catch: java.lang.NoSuchFieldError -> L1d
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2[r3] = r0     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                r2 = 3
                int[] r3 = kotlin.reflect.jvm.internal.impl.protobuf.g.a.b     // Catch: java.lang.NoSuchFieldError -> L28
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r4 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.INT64     // Catch: java.lang.NoSuchFieldError -> L28
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r3[r4] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                r3 = 4
                int[] r4 = kotlin.reflect.jvm.internal.impl.protobuf.g.a.b     // Catch: java.lang.NoSuchFieldError -> L33
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r5 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.UINT64     // Catch: java.lang.NoSuchFieldError -> L33
                int r5 = r5.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r4[r5] = r3     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                r4 = 5
                int[] r5 = kotlin.reflect.jvm.internal.impl.protobuf.g.a.b     // Catch: java.lang.NoSuchFieldError -> L3e
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r6 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.INT32     // Catch: java.lang.NoSuchFieldError -> L3e
                int r6 = r6.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r5[r6] = r4     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                r5 = 6
                int[] r6 = kotlin.reflect.jvm.internal.impl.protobuf.g.a.b     // Catch: java.lang.NoSuchFieldError -> L49
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r7 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.FIXED64     // Catch: java.lang.NoSuchFieldError -> L49
                int r7 = r7.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r6[r7] = r5     // Catch: java.lang.NoSuchFieldError -> L49
            L49:
                r6 = 7
                int[] r7 = kotlin.reflect.jvm.internal.impl.protobuf.g.a.b     // Catch: java.lang.NoSuchFieldError -> L54
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r8 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.FIXED32     // Catch: java.lang.NoSuchFieldError -> L54
                int r8 = r8.ordinal()     // Catch: java.lang.NoSuchFieldError -> L54
                r7[r8] = r6     // Catch: java.lang.NoSuchFieldError -> L54
            L54:
                r7 = 8
                int[] r8 = kotlin.reflect.jvm.internal.impl.protobuf.g.a.b     // Catch: java.lang.NoSuchFieldError -> L60
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r9 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.BOOL     // Catch: java.lang.NoSuchFieldError -> L60
                int r9 = r9.ordinal()     // Catch: java.lang.NoSuchFieldError -> L60
                r8[r9] = r7     // Catch: java.lang.NoSuchFieldError -> L60
            L60:
                r8 = 9
                int[] r9 = kotlin.reflect.jvm.internal.impl.protobuf.g.a.b     // Catch: java.lang.NoSuchFieldError -> L6c
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r10 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.STRING     // Catch: java.lang.NoSuchFieldError -> L6c
                int r10 = r10.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6c
                r9[r10] = r8     // Catch: java.lang.NoSuchFieldError -> L6c
            L6c:
                int[] r9 = kotlin.reflect.jvm.internal.impl.protobuf.g.a.b     // Catch: java.lang.NoSuchFieldError -> L78
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r10 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.BYTES     // Catch: java.lang.NoSuchFieldError -> L78
                int r10 = r10.ordinal()     // Catch: java.lang.NoSuchFieldError -> L78
                r11 = 10
                r9[r10] = r11     // Catch: java.lang.NoSuchFieldError -> L78
            L78:
                int[] r9 = kotlin.reflect.jvm.internal.impl.protobuf.g.a.b     // Catch: java.lang.NoSuchFieldError -> L84
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r10 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.UINT32     // Catch: java.lang.NoSuchFieldError -> L84
                int r10 = r10.ordinal()     // Catch: java.lang.NoSuchFieldError -> L84
                r11 = 11
                r9[r10] = r11     // Catch: java.lang.NoSuchFieldError -> L84
            L84:
                int[] r9 = kotlin.reflect.jvm.internal.impl.protobuf.g.a.b     // Catch: java.lang.NoSuchFieldError -> L90
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r10 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.SFIXED32     // Catch: java.lang.NoSuchFieldError -> L90
                int r10 = r10.ordinal()     // Catch: java.lang.NoSuchFieldError -> L90
                r11 = 12
                r9[r10] = r11     // Catch: java.lang.NoSuchFieldError -> L90
            L90:
                int[] r9 = kotlin.reflect.jvm.internal.impl.protobuf.g.a.b     // Catch: java.lang.NoSuchFieldError -> L9c
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r10 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.SFIXED64     // Catch: java.lang.NoSuchFieldError -> L9c
                int r10 = r10.ordinal()     // Catch: java.lang.NoSuchFieldError -> L9c
                r11 = 13
                r9[r10] = r11     // Catch: java.lang.NoSuchFieldError -> L9c
            L9c:
                int[] r9 = kotlin.reflect.jvm.internal.impl.protobuf.g.a.b     // Catch: java.lang.NoSuchFieldError -> La8
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r10 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.SINT32     // Catch: java.lang.NoSuchFieldError -> La8
                int r10 = r10.ordinal()     // Catch: java.lang.NoSuchFieldError -> La8
                r11 = 14
                r9[r10] = r11     // Catch: java.lang.NoSuchFieldError -> La8
            La8:
                int[] r9 = kotlin.reflect.jvm.internal.impl.protobuf.g.a.b     // Catch: java.lang.NoSuchFieldError -> Lb4
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r10 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.SINT64     // Catch: java.lang.NoSuchFieldError -> Lb4
                int r10 = r10.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lb4
                r11 = 15
                r9[r10] = r11     // Catch: java.lang.NoSuchFieldError -> Lb4
            Lb4:
                int[] r9 = kotlin.reflect.jvm.internal.impl.protobuf.g.a.b     // Catch: java.lang.NoSuchFieldError -> Lc0
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r10 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.GROUP     // Catch: java.lang.NoSuchFieldError -> Lc0
                int r10 = r10.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lc0
                r11 = 16
                r9[r10] = r11     // Catch: java.lang.NoSuchFieldError -> Lc0
            Lc0:
                int[] r9 = kotlin.reflect.jvm.internal.impl.protobuf.g.a.b     // Catch: java.lang.NoSuchFieldError -> Lcc
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r10 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.MESSAGE     // Catch: java.lang.NoSuchFieldError -> Lcc
                int r10 = r10.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lcc
                r11 = 17
                r9[r10] = r11     // Catch: java.lang.NoSuchFieldError -> Lcc
            Lcc:
                int[] r9 = kotlin.reflect.jvm.internal.impl.protobuf.g.a.b     // Catch: java.lang.NoSuchFieldError -> Ld8
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r10 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.ENUM     // Catch: java.lang.NoSuchFieldError -> Ld8
                int r10 = r10.ordinal()     // Catch: java.lang.NoSuchFieldError -> Ld8
                r11 = 18
                r9[r10] = r11     // Catch: java.lang.NoSuchFieldError -> Ld8
            Ld8:
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$JavaType[] r9 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.values()
                int r9 = r9.length
                int[] r9 = new int[r9]
                kotlin.reflect.jvm.internal.impl.protobuf.g.a.a = r9
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$JavaType r10 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.INT     // Catch: java.lang.NoSuchFieldError -> Le9
                int r10 = r10.ordinal()     // Catch: java.lang.NoSuchFieldError -> Le9
                r9[r10] = r1     // Catch: java.lang.NoSuchFieldError -> Le9
            Le9:
                int[] r1 = kotlin.reflect.jvm.internal.impl.protobuf.g.a.a     // Catch: java.lang.NoSuchFieldError -> Lf3
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$JavaType r9 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.LONG     // Catch: java.lang.NoSuchFieldError -> Lf3
                int r9 = r9.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lf3
                r1[r9] = r0     // Catch: java.lang.NoSuchFieldError -> Lf3
            Lf3:
                int[] r0 = kotlin.reflect.jvm.internal.impl.protobuf.g.a.a     // Catch: java.lang.NoSuchFieldError -> Lfd
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$JavaType r1 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.FLOAT     // Catch: java.lang.NoSuchFieldError -> Lfd
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lfd
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lfd
            Lfd:
                int[] r0 = kotlin.reflect.jvm.internal.impl.protobuf.g.a.a     // Catch: java.lang.NoSuchFieldError -> L107
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$JavaType r1 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.DOUBLE     // Catch: java.lang.NoSuchFieldError -> L107
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L107
                r0[r1] = r3     // Catch: java.lang.NoSuchFieldError -> L107
            L107:
                int[] r0 = kotlin.reflect.jvm.internal.impl.protobuf.g.a.a     // Catch: java.lang.NoSuchFieldError -> L111
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$JavaType r1 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.BOOLEAN     // Catch: java.lang.NoSuchFieldError -> L111
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L111
                r0[r1] = r4     // Catch: java.lang.NoSuchFieldError -> L111
            L111:
                int[] r0 = kotlin.reflect.jvm.internal.impl.protobuf.g.a.a     // Catch: java.lang.NoSuchFieldError -> L11b
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$JavaType r1 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.STRING     // Catch: java.lang.NoSuchFieldError -> L11b
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L11b
                r0[r1] = r5     // Catch: java.lang.NoSuchFieldError -> L11b
            L11b:
                int[] r0 = kotlin.reflect.jvm.internal.impl.protobuf.g.a.a     // Catch: java.lang.NoSuchFieldError -> L125
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$JavaType r1 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.BYTE_STRING     // Catch: java.lang.NoSuchFieldError -> L125
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L125
                r0[r1] = r6     // Catch: java.lang.NoSuchFieldError -> L125
            L125:
                int[] r0 = kotlin.reflect.jvm.internal.impl.protobuf.g.a.a     // Catch: java.lang.NoSuchFieldError -> L12f
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$JavaType r1 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.ENUM     // Catch: java.lang.NoSuchFieldError -> L12f
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12f
                r0[r1] = r7     // Catch: java.lang.NoSuchFieldError -> L12f
            L12f:
                int[] r0 = kotlin.reflect.jvm.internal.impl.protobuf.g.a.a     // Catch: java.lang.NoSuchFieldError -> L139
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$JavaType r1 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.MESSAGE     // Catch: java.lang.NoSuchFieldError -> L139
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L139
                r0[r1] = r8     // Catch: java.lang.NoSuchFieldError -> L139
            L139:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface b<T extends kotlin.reflect.jvm.internal.impl.protobuf.g.b<T>> extends java.lang.Comparable<T> {
        kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType A();

        kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType B();

        kotlin.reflect.jvm.internal.impl.protobuf.n.a G(kotlin.reflect.jvm.internal.impl.protobuf.n.a r1, kotlin.reflect.jvm.internal.impl.protobuf.n r2);

        boolean H();

        boolean P();

        int getNumber();
    }

    static {
            kotlin.reflect.jvm.internal.impl.protobuf.g r0 = new kotlin.reflect.jvm.internal.impl.protobuf.g
            r1 = 1
            r0.<init>(r1)
            kotlin.reflect.jvm.internal.impl.protobuf.g.d = r0
            return
    }

    private g() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.c = r0
            r0 = 16
            kotlin.reflect.jvm.internal.impl.protobuf.s r0 = kotlin.reflect.jvm.internal.impl.protobuf.s.n(r0)
            r1.a = r0
            return
    }

    private g(boolean r1) {
            r0 = this;
            r0.<init>()
            r1 = 0
            r0.c = r1
            kotlin.reflect.jvm.internal.impl.protobuf.s r1 = kotlin.reflect.jvm.internal.impl.protobuf.s.n(r1)
            r0.a = r1
            r0.q()
            return
    }

    private java.lang.Object c(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof byte[]
            if (r0 == 0) goto Lf
            byte[] r4 = (byte[]) r4
            int r0 = r4.length
            byte[] r0 = new byte[r0]
            int r1 = r4.length
            r2 = 0
            java.lang.System.arraycopy(r4, r2, r0, r2, r1)
            return r0
        Lf:
            return r4
    }

    private static int d(kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType r1, int r2, java.lang.Object r3) {
            int r2 = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.E(r2)
            kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r0 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.GROUP
            if (r1 != r0) goto La
            int r2 = r2 * 2
        La:
            int r1 = e(r1, r3)
            int r2 = r2 + r1
            return r2
    }

    private static int e(kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType r1, java.lang.Object r2) {
            int[] r0 = kotlin.reflect.jvm.internal.impl.protobuf.g.a.b
            int r1 = r1.ordinal()
            r1 = r0[r1]
            switch(r1) {
                case 1: goto Le3;
                case 2: goto Ld8;
                case 3: goto Lcd;
                case 4: goto Lc2;
                case 5: goto Lb7;
                case 6: goto Lac;
                case 7: goto La1;
                case 8: goto L96;
                case 9: goto L8f;
                case 10: goto L7d;
                case 11: goto L72;
                case 12: goto L67;
                case 13: goto L5c;
                case 14: goto L51;
                case 15: goto L46;
                case 16: goto L3f;
                case 17: goto L2d;
                case 18: goto L13;
                default: goto Lb;
            }
        Lb:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "There is no way to get here, but the compiler thinks otherwise."
            r1.<init>(r2)
            throw r1
        L13:
            boolean r1 = r2 instanceof kotlin.reflect.jvm.internal.impl.protobuf.h.a
            if (r1 == 0) goto L22
            kotlin.reflect.jvm.internal.impl.protobuf.h$a r2 = (kotlin.reflect.jvm.internal.impl.protobuf.h.a) r2
            int r1 = r2.getNumber()
            int r1 = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.j(r1)
            return r1
        L22:
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r1 = r2.intValue()
            int r1 = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.j(r1)
            return r1
        L2d:
            boolean r1 = r2 instanceof kotlin.reflect.jvm.internal.impl.protobuf.i
            if (r1 == 0) goto L38
            kotlin.reflect.jvm.internal.impl.protobuf.i r2 = (kotlin.reflect.jvm.internal.impl.protobuf.i) r2
            int r1 = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.s(r2)
            return r1
        L38:
            kotlin.reflect.jvm.internal.impl.protobuf.n r2 = (kotlin.reflect.jvm.internal.impl.protobuf.n) r2
            int r1 = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.u(r2)
            return r1
        L3f:
            kotlin.reflect.jvm.internal.impl.protobuf.n r2 = (kotlin.reflect.jvm.internal.impl.protobuf.n) r2
            int r1 = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.o(r2)
            return r1
        L46:
            java.lang.Long r2 = (java.lang.Long) r2
            long r1 = r2.longValue()
            int r1 = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.C(r1)
            return r1
        L51:
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r1 = r2.intValue()
            int r1 = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.A(r1)
            return r1
        L5c:
            java.lang.Long r2 = (java.lang.Long) r2
            long r1 = r2.longValue()
            int r1 = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.z(r1)
            return r1
        L67:
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r1 = r2.intValue()
            int r1 = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.y(r1)
            return r1
        L72:
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r1 = r2.intValue()
            int r1 = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.F(r1)
            return r1
        L7d:
            boolean r1 = r2 instanceof kotlin.reflect.jvm.internal.impl.protobuf.d
            if (r1 == 0) goto L88
            kotlin.reflect.jvm.internal.impl.protobuf.d r2 = (kotlin.reflect.jvm.internal.impl.protobuf.d) r2
            int r1 = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.f(r2)
            return r1
        L88:
            byte[] r2 = (byte[]) r2
            int r1 = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.d(r2)
            return r1
        L8f:
            java.lang.String r2 = (java.lang.String) r2
            int r1 = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.D(r2)
            return r1
        L96:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r1 = r2.booleanValue()
            int r1 = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.c(r1)
            return r1
        La1:
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r1 = r2.intValue()
            int r1 = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.k(r1)
            return r1
        Lac:
            java.lang.Long r2 = (java.lang.Long) r2
            long r1 = r2.longValue()
            int r1 = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.l(r1)
            return r1
        Lb7:
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r1 = r2.intValue()
            int r1 = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.q(r1)
            return r1
        Lc2:
            java.lang.Long r2 = (java.lang.Long) r2
            long r1 = r2.longValue()
            int r1 = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.G(r1)
            return r1
        Lcd:
            java.lang.Long r2 = (java.lang.Long) r2
            long r1 = r2.longValue()
            int r1 = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.r(r1)
            return r1
        Ld8:
            java.lang.Float r2 = (java.lang.Float) r2
            float r1 = r2.floatValue()
            int r1 = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.n(r1)
            return r1
        Le3:
            java.lang.Double r2 = (java.lang.Double) r2
            double r1 = r2.doubleValue()
            int r1 = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.h(r1)
            return r1
    }

    public static int f(kotlin.reflect.jvm.internal.impl.protobuf.g.b<?> r3, java.lang.Object r4) {
            kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r0 = r3.A()
            int r1 = r3.getNumber()
            boolean r2 = r3.H()
            if (r2 == 0) goto L4d
            boolean r3 = r3.P()
            r2 = 0
            if (r3 == 0) goto L36
            java.util.List r4 = (java.util.List) r4
            java.util.Iterator r3 = r4.iterator()
        L1b:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L2b
            java.lang.Object r4 = r3.next()
            int r4 = e(r0, r4)
            int r2 = r2 + r4
            goto L1b
        L2b:
            int r3 = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.E(r1)
            int r3 = r3 + r2
            int r4 = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.w(r2)
            int r3 = r3 + r4
            return r3
        L36:
            java.util.List r4 = (java.util.List) r4
            java.util.Iterator r3 = r4.iterator()
        L3c:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L4c
            java.lang.Object r4 = r3.next()
            int r4 = d(r0, r1, r4)
            int r2 = r2 + r4
            goto L3c
        L4c:
            return r2
        L4d:
            int r3 = d(r0, r1, r4)
            return r3
    }

    public static <T extends kotlin.reflect.jvm.internal.impl.protobuf.g.b<T>> kotlin.reflect.jvm.internal.impl.protobuf.g<T> g() {
            kotlin.reflect.jvm.internal.impl.protobuf.g r0 = kotlin.reflect.jvm.internal.impl.protobuf.g.d
            return r0
    }

    static int l(kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType r0, boolean r1) {
            if (r1 == 0) goto L4
            r0 = 2
            return r0
        L4:
            int r0 = r0.getWireType()
            return r0
    }

    private boolean o(java.util.Map.Entry<FieldDescriptorType, java.lang.Object> r5) {
            r4 = this;
            java.lang.Object r0 = r5.getKey()
            kotlin.reflect.jvm.internal.impl.protobuf.g$b r0 = (kotlin.reflect.jvm.internal.impl.protobuf.g.b) r0
            kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$JavaType r1 = r0.B()
            kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$JavaType r2 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.MESSAGE
            r3 = 1
            if (r1 != r2) goto L51
            boolean r0 = r0.H()
            r1 = 0
            if (r0 == 0) goto L33
            java.lang.Object r5 = r5.getValue()
            java.util.List r5 = (java.util.List) r5
            java.util.Iterator r5 = r5.iterator()
        L20:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L51
            java.lang.Object r0 = r5.next()
            kotlin.reflect.jvm.internal.impl.protobuf.n r0 = (kotlin.reflect.jvm.internal.impl.protobuf.n) r0
            boolean r0 = r0.isInitialized()
            if (r0 != 0) goto L20
            return r1
        L33:
            java.lang.Object r5 = r5.getValue()
            boolean r0 = r5 instanceof kotlin.reflect.jvm.internal.impl.protobuf.n
            if (r0 == 0) goto L44
            kotlin.reflect.jvm.internal.impl.protobuf.n r5 = (kotlin.reflect.jvm.internal.impl.protobuf.n) r5
            boolean r5 = r5.isInitialized()
            if (r5 != 0) goto L51
            return r1
        L44:
            boolean r5 = r5 instanceof kotlin.reflect.jvm.internal.impl.protobuf.i
            if (r5 == 0) goto L49
            return r3
        L49:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Wrong object type used with protocol message reflection."
            r5.<init>(r0)
            throw r5
        L51:
            return r3
    }

    private void s(java.util.Map.Entry<FieldDescriptorType, java.lang.Object> r5) {
            r4 = this;
            java.lang.Object r0 = r5.getKey()
            kotlin.reflect.jvm.internal.impl.protobuf.g$b r0 = (kotlin.reflect.jvm.internal.impl.protobuf.g.b) r0
            java.lang.Object r5 = r5.getValue()
            boolean r1 = r5 instanceof kotlin.reflect.jvm.internal.impl.protobuf.i
            if (r1 == 0) goto L14
            kotlin.reflect.jvm.internal.impl.protobuf.i r5 = (kotlin.reflect.jvm.internal.impl.protobuf.i) r5
            kotlin.reflect.jvm.internal.impl.protobuf.n r5 = r5.e()
        L14:
            boolean r1 = r0.H()
            if (r1 == 0) goto L46
            java.lang.Object r1 = r4.h(r0)
            if (r1 != 0) goto L25
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L25:
            java.util.List r5 = (java.util.List) r5
            java.util.Iterator r5 = r5.iterator()
        L2b:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L40
            java.lang.Object r2 = r5.next()
            r3 = r1
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r2 = r4.c(r2)
            r3.add(r2)
            goto L2b
        L40:
            kotlin.reflect.jvm.internal.impl.protobuf.s<FieldDescriptorType extends kotlin.reflect.jvm.internal.impl.protobuf.g$b<FieldDescriptorType>, java.lang.Object> r5 = r4.a
            r5.o(r0, r1)
            return
        L46:
            kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$JavaType r1 = r0.B()
            kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$JavaType r2 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.MESSAGE
            if (r1 != r2) goto L74
            java.lang.Object r1 = r4.h(r0)
            if (r1 != 0) goto L5e
            kotlin.reflect.jvm.internal.impl.protobuf.s<FieldDescriptorType extends kotlin.reflect.jvm.internal.impl.protobuf.g$b<FieldDescriptorType>, java.lang.Object> r1 = r4.a
            java.lang.Object r5 = r4.c(r5)
            r1.o(r0, r5)
            return
        L5e:
            kotlin.reflect.jvm.internal.impl.protobuf.n r1 = (kotlin.reflect.jvm.internal.impl.protobuf.n) r1
            kotlin.reflect.jvm.internal.impl.protobuf.n$a r1 = r1.toBuilder()
            kotlin.reflect.jvm.internal.impl.protobuf.n r5 = (kotlin.reflect.jvm.internal.impl.protobuf.n) r5
            kotlin.reflect.jvm.internal.impl.protobuf.n$a r5 = r0.G(r1, r5)
            kotlin.reflect.jvm.internal.impl.protobuf.n r5 = r5.build()
            kotlin.reflect.jvm.internal.impl.protobuf.s<FieldDescriptorType extends kotlin.reflect.jvm.internal.impl.protobuf.g$b<FieldDescriptorType>, java.lang.Object> r1 = r4.a
            r1.o(r0, r5)
            return
        L74:
            kotlin.reflect.jvm.internal.impl.protobuf.s<FieldDescriptorType extends kotlin.reflect.jvm.internal.impl.protobuf.g$b<FieldDescriptorType>, java.lang.Object> r1 = r4.a
            java.lang.Object r5 = r4.c(r5)
            r1.o(r0, r5)
            return
    }

    public static <T extends kotlin.reflect.jvm.internal.impl.protobuf.g.b<T>> kotlin.reflect.jvm.internal.impl.protobuf.g<T> t() {
            kotlin.reflect.jvm.internal.impl.protobuf.g r0 = new kotlin.reflect.jvm.internal.impl.protobuf.g
            r0.<init>()
            return r0
    }

    public static java.lang.Object u(kotlin.reflect.jvm.internal.impl.protobuf.e r1, kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType r2, boolean r3) throws java.io.IOException {
            int[] r0 = kotlin.reflect.jvm.internal.impl.protobuf.g.a.b
            int r2 = r2.ordinal()
            r2 = r0[r2]
            switch(r2) {
                case 1: goto La8;
                case 2: goto L9f;
                case 3: goto L96;
                case 4: goto L8d;
                case 5: goto L84;
                case 6: goto L7b;
                case 7: goto L72;
                case 8: goto L69;
                case 9: goto L5d;
                case 10: goto L58;
                case 11: goto L4f;
                case 12: goto L46;
                case 13: goto L3d;
                case 14: goto L34;
                case 15: goto L2b;
                case 16: goto L23;
                case 17: goto L1b;
                case 18: goto L13;
                default: goto Lb;
            }
        Lb:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "There is no way to get here, but the compiler thinks otherwise."
            r1.<init>(r2)
            throw r1
        L13:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "readPrimitiveField() cannot handle enums."
            r1.<init>(r2)
            throw r1
        L1b:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "readPrimitiveField() cannot handle embedded messages."
            r1.<init>(r2)
            throw r1
        L23:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "readPrimitiveField() cannot handle nested groups."
            r1.<init>(r2)
            throw r1
        L2b:
            long r1 = r1.H()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            return r1
        L34:
            int r1 = r1.G()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            return r1
        L3d:
            long r1 = r1.F()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            return r1
        L46:
            int r1 = r1.E()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            return r1
        L4f:
            int r1 = r1.L()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            return r1
        L58:
            kotlin.reflect.jvm.internal.impl.protobuf.d r1 = r1.l()
            return r1
        L5d:
            if (r3 == 0) goto L64
            java.lang.String r1 = r1.J()
            return r1
        L64:
            java.lang.String r1 = r1.I()
            return r1
        L69:
            boolean r1 = r1.k()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            return r1
        L72:
            int r1 = r1.o()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            return r1
        L7b:
            long r1 = r1.p()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            return r1
        L84:
            int r1 = r1.s()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            return r1
        L8d:
            long r1 = r1.M()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            return r1
        L96:
            long r1 = r1.t()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            return r1
        L9f:
            float r1 = r1.q()
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            return r1
        La8:
            double r1 = r1.m()
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            return r1
    }

    private static void w(kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType r2, java.lang.Object r3) {
            r3.getClass()
            int[] r0 = kotlin.reflect.jvm.internal.impl.protobuf.g.a.a
            kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$JavaType r2 = r2.getJavaType()
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            r1 = 0
            switch(r2) {
                case 1: goto L42;
                case 2: goto L3f;
                case 3: goto L3c;
                case 4: goto L39;
                case 5: goto L36;
                case 6: goto L33;
                case 7: goto L2a;
                case 8: goto L21;
                case 9: goto L15;
                default: goto L14;
            }
        L14:
            goto L44
        L15:
            boolean r2 = r3 instanceof kotlin.reflect.jvm.internal.impl.protobuf.n
            if (r2 != 0) goto L1f
            boolean r2 = r3 instanceof kotlin.reflect.jvm.internal.impl.protobuf.i
            if (r2 == 0) goto L1e
            goto L1f
        L1e:
            r0 = 0
        L1f:
            r1 = r0
            goto L44
        L21:
            boolean r2 = r3 instanceof java.lang.Integer
            if (r2 != 0) goto L1f
            boolean r2 = r3 instanceof kotlin.reflect.jvm.internal.impl.protobuf.h.a
            if (r2 == 0) goto L1e
            goto L1f
        L2a:
            boolean r2 = r3 instanceof kotlin.reflect.jvm.internal.impl.protobuf.d
            if (r2 != 0) goto L1f
            boolean r2 = r3 instanceof byte[]
            if (r2 == 0) goto L1e
            goto L1f
        L33:
            boolean r1 = r3 instanceof java.lang.String
            goto L44
        L36:
            boolean r1 = r3 instanceof java.lang.Boolean
            goto L44
        L39:
            boolean r1 = r3 instanceof java.lang.Double
            goto L44
        L3c:
            boolean r1 = r3 instanceof java.lang.Float
            goto L44
        L3f:
            boolean r1 = r3 instanceof java.lang.Long
            goto L44
        L42:
            boolean r1 = r3 instanceof java.lang.Integer
        L44:
            if (r1 == 0) goto L47
            return
        L47:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Wrong object type used with protocol message reflection."
            r2.<init>(r3)
            throw r2
    }

    private static void x(kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream r1, kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType r2, int r3, java.lang.Object r4) throws java.io.IOException {
            kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r0 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.GROUP
            if (r2 != r0) goto La
            kotlin.reflect.jvm.internal.impl.protobuf.n r4 = (kotlin.reflect.jvm.internal.impl.protobuf.n) r4
            r1.c0(r3, r4)
            return
        La:
            r0 = 0
            int r0 = l(r2, r0)
            r1.A0(r3, r0)
            y(r1, r2, r4)
            return
    }

    private static void y(kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream r1, kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType r2, java.lang.Object r3) throws java.io.IOException {
            int[] r0 = kotlin.reflect.jvm.internal.impl.protobuf.g.a.b
            int r2 = r2.ordinal()
            r2 = r0[r2]
            switch(r2) {
                case 1: goto Lbe;
                case 2: goto Lb4;
                case 3: goto Laa;
                case 4: goto La0;
                case 5: goto L96;
                case 6: goto L8c;
                case 7: goto L82;
                case 8: goto L78;
                case 9: goto L72;
                case 10: goto L62;
                case 11: goto L58;
                case 12: goto L4e;
                case 13: goto L44;
                case 14: goto L3a;
                case 15: goto L30;
                case 16: goto L2a;
                case 17: goto L24;
                case 18: goto Lc;
                default: goto Lb;
            }
        Lb:
            return
        Lc:
            boolean r2 = r3 instanceof kotlin.reflect.jvm.internal.impl.protobuf.h.a
            if (r2 == 0) goto L1a
            kotlin.reflect.jvm.internal.impl.protobuf.h$a r3 = (kotlin.reflect.jvm.internal.impl.protobuf.h.a) r3
            int r2 = r3.getNumber()
            r1.X(r2)
            return
        L1a:
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r2 = r3.intValue()
            r1.X(r2)
            return
        L24:
            kotlin.reflect.jvm.internal.impl.protobuf.n r3 = (kotlin.reflect.jvm.internal.impl.protobuf.n) r3
            r1.i0(r3)
            return
        L2a:
            kotlin.reflect.jvm.internal.impl.protobuf.n r3 = (kotlin.reflect.jvm.internal.impl.protobuf.n) r3
            r1.d0(r3)
            return
        L30:
            java.lang.Long r3 = (java.lang.Long) r3
            long r2 = r3.longValue()
            r1.y0(r2)
            return
        L3a:
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r2 = r3.intValue()
            r1.w0(r2)
            return
        L44:
            java.lang.Long r3 = (java.lang.Long) r3
            long r2 = r3.longValue()
            r1.v0(r2)
            return
        L4e:
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r2 = r3.intValue()
            r1.u0(r2)
            return
        L58:
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r2 = r3.intValue()
            r1.C0(r2)
            return
        L62:
            boolean r2 = r3 instanceof kotlin.reflect.jvm.internal.impl.protobuf.d
            if (r2 == 0) goto L6c
            kotlin.reflect.jvm.internal.impl.protobuf.d r3 = (kotlin.reflect.jvm.internal.impl.protobuf.d) r3
            r1.T(r3)
            return
        L6c:
            byte[] r3 = (byte[]) r3
            r1.R(r3)
            return
        L72:
            java.lang.String r3 = (java.lang.String) r3
            r1.z0(r3)
            return
        L78:
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r2 = r3.booleanValue()
            r1.Q(r2)
            return
        L82:
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r2 = r3.intValue()
            r1.Y(r2)
            return
        L8c:
            java.lang.Long r3 = (java.lang.Long) r3
            long r2 = r3.longValue()
            r1.Z(r2)
            return
        L96:
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r2 = r3.intValue()
            r1.f0(r2)
            return
        La0:
            java.lang.Long r3 = (java.lang.Long) r3
            long r2 = r3.longValue()
            r1.D0(r2)
            return
        Laa:
            java.lang.Long r3 = (java.lang.Long) r3
            long r2 = r3.longValue()
            r1.g0(r2)
            return
        Lb4:
            java.lang.Float r3 = (java.lang.Float) r3
            float r2 = r3.floatValue()
            r1.b0(r2)
            return
        Lbe:
            java.lang.Double r3 = (java.lang.Double) r3
            double r2 = r3.doubleValue()
            r1.V(r2)
            return
    }

    public static void z(kotlin.reflect.jvm.internal.impl.protobuf.g.b<?> r3, java.lang.Object r4, kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream r5) throws java.io.IOException {
            kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r0 = r3.A()
            int r1 = r3.getNumber()
            boolean r2 = r3.H()
            if (r2 == 0) goto L57
            java.util.List r4 = (java.util.List) r4
            boolean r3 = r3.P()
            if (r3 == 0) goto L44
            r3 = 2
            r5.A0(r1, r3)
            java.util.Iterator r3 = r4.iterator()
            r1 = 0
        L1f:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L2f
            java.lang.Object r2 = r3.next()
            int r2 = e(r0, r2)
            int r1 = r1 + r2
            goto L1f
        L2f:
            r5.s0(r1)
            java.util.Iterator r3 = r4.iterator()
        L36:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L56
            java.lang.Object r4 = r3.next()
            y(r5, r0, r4)
            goto L36
        L44:
            java.util.Iterator r3 = r4.iterator()
        L48:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L56
            java.lang.Object r4 = r3.next()
            x(r5, r0, r1, r4)
            goto L48
        L56:
            return
        L57:
            boolean r3 = r4 instanceof kotlin.reflect.jvm.internal.impl.protobuf.i
            if (r3 == 0) goto L65
            kotlin.reflect.jvm.internal.impl.protobuf.i r4 = (kotlin.reflect.jvm.internal.impl.protobuf.i) r4
            kotlin.reflect.jvm.internal.impl.protobuf.n r3 = r4.e()
            x(r5, r0, r1, r3)
            return
        L65:
            x(r5, r0, r1, r4)
            return
    }

    public void a(FieldDescriptorType r3, java.lang.Object r4) {
            r2 = this;
            boolean r0 = r3.H()
            if (r0 == 0) goto L24
            kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r0 = r3.A()
            w(r0, r4)
            java.lang.Object r0 = r2.h(r3)
            if (r0 != 0) goto L1e
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            kotlin.reflect.jvm.internal.impl.protobuf.s<FieldDescriptorType extends kotlin.reflect.jvm.internal.impl.protobuf.g$b<FieldDescriptorType>, java.lang.Object> r1 = r2.a
            r1.o(r3, r0)
            goto L20
        L1e:
            java.util.List r0 = (java.util.List) r0
        L20:
            r0.add(r4)
            return
        L24:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "addRepeatedField() can only be called on repeated fields."
            r3.<init>(r4)
            throw r3
    }

    public kotlin.reflect.jvm.internal.impl.protobuf.g<FieldDescriptorType> b() {
            r4 = this;
            kotlin.reflect.jvm.internal.impl.protobuf.g r0 = t()
            r1 = 0
        L5:
            kotlin.reflect.jvm.internal.impl.protobuf.s<FieldDescriptorType extends kotlin.reflect.jvm.internal.impl.protobuf.g$b<FieldDescriptorType>, java.lang.Object> r2 = r4.a
            int r2 = r2.i()
            if (r1 >= r2) goto L23
            kotlin.reflect.jvm.internal.impl.protobuf.s<FieldDescriptorType extends kotlin.reflect.jvm.internal.impl.protobuf.g$b<FieldDescriptorType>, java.lang.Object> r2 = r4.a
            java.util.Map$Entry r2 = r2.h(r1)
            java.lang.Object r3 = r2.getKey()
            kotlin.reflect.jvm.internal.impl.protobuf.g$b r3 = (kotlin.reflect.jvm.internal.impl.protobuf.g.b) r3
            java.lang.Object r2 = r2.getValue()
            r0.v(r3, r2)
            int r1 = r1 + 1
            goto L5
        L23:
            kotlin.reflect.jvm.internal.impl.protobuf.s<FieldDescriptorType extends kotlin.reflect.jvm.internal.impl.protobuf.g$b<FieldDescriptorType>, java.lang.Object> r1 = r4.a
            java.lang.Iterable r1 = r1.j()
            java.util.Iterator r1 = r1.iterator()
        L2d:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L47
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            kotlin.reflect.jvm.internal.impl.protobuf.g$b r3 = (kotlin.reflect.jvm.internal.impl.protobuf.g.b) r3
            java.lang.Object r2 = r2.getValue()
            r0.v(r3, r2)
            goto L2d
        L47:
            boolean r1 = r4.c
            r0.c = r1
            return r0
    }

    public /* bridge */ /* synthetic */ java.lang.Object clone() throws java.lang.CloneNotSupportedException {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.protobuf.g r0 = r1.b()
            return r0
    }

    public java.lang.Object h(FieldDescriptorType r2) {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.protobuf.s<FieldDescriptorType extends kotlin.reflect.jvm.internal.impl.protobuf.g$b<FieldDescriptorType>, java.lang.Object> r0 = r1.a
            java.lang.Object r2 = r0.get(r2)
            boolean r0 = r2 instanceof kotlin.reflect.jvm.internal.impl.protobuf.i
            if (r0 == 0) goto L10
            kotlin.reflect.jvm.internal.impl.protobuf.i r2 = (kotlin.reflect.jvm.internal.impl.protobuf.i) r2
            kotlin.reflect.jvm.internal.impl.protobuf.n r2 = r2.e()
        L10:
            return r2
    }

    public java.lang.Object i(FieldDescriptorType r2, int r3) {
            r1 = this;
            boolean r0 = r2.H()
            if (r0 == 0) goto L19
            java.lang.Object r2 = r1.h(r2)
            if (r2 == 0) goto L13
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r2 = r2.get(r3)
            return r2
        L13:
            java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
            r2.<init>()
            throw r2
        L19:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "getRepeatedField() can only be called on repeated fields."
            r2.<init>(r3)
            throw r2
    }

    public int j(FieldDescriptorType r2) {
            r1 = this;
            boolean r0 = r2.H()
            if (r0 == 0) goto L15
            java.lang.Object r2 = r1.h(r2)
            if (r2 != 0) goto Le
            r2 = 0
            return r2
        Le:
            java.util.List r2 = (java.util.List) r2
            int r2 = r2.size()
            return r2
        L15:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "getRepeatedField() can only be called on repeated fields."
            r2.<init>(r0)
            throw r2
    }

    public int k() {
            r4 = this;
            r0 = 0
            r1 = 0
        L2:
            kotlin.reflect.jvm.internal.impl.protobuf.s<FieldDescriptorType extends kotlin.reflect.jvm.internal.impl.protobuf.g$b<FieldDescriptorType>, java.lang.Object> r2 = r4.a
            int r2 = r2.i()
            if (r0 >= r2) goto L22
            kotlin.reflect.jvm.internal.impl.protobuf.s<FieldDescriptorType extends kotlin.reflect.jvm.internal.impl.protobuf.g$b<FieldDescriptorType>, java.lang.Object> r2 = r4.a
            java.util.Map$Entry r2 = r2.h(r0)
            java.lang.Object r3 = r2.getKey()
            kotlin.reflect.jvm.internal.impl.protobuf.g$b r3 = (kotlin.reflect.jvm.internal.impl.protobuf.g.b) r3
            java.lang.Object r2 = r2.getValue()
            int r2 = f(r3, r2)
            int r1 = r1 + r2
            int r0 = r0 + 1
            goto L2
        L22:
            kotlin.reflect.jvm.internal.impl.protobuf.s<FieldDescriptorType extends kotlin.reflect.jvm.internal.impl.protobuf.g$b<FieldDescriptorType>, java.lang.Object> r0 = r4.a
            java.lang.Iterable r0 = r0.j()
            java.util.Iterator r0 = r0.iterator()
        L2c:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L48
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            kotlin.reflect.jvm.internal.impl.protobuf.g$b r3 = (kotlin.reflect.jvm.internal.impl.protobuf.g.b) r3
            java.lang.Object r2 = r2.getValue()
            int r2 = f(r3, r2)
            int r1 = r1 + r2
            goto L2c
        L48:
            return r1
    }

    public boolean m(FieldDescriptorType r2) {
            r1 = this;
            boolean r0 = r2.H()
            if (r0 != 0) goto L12
            kotlin.reflect.jvm.internal.impl.protobuf.s<FieldDescriptorType extends kotlin.reflect.jvm.internal.impl.protobuf.g$b<FieldDescriptorType>, java.lang.Object> r0 = r1.a
            java.lang.Object r2 = r0.get(r2)
            if (r2 == 0) goto L10
            r2 = 1
            return r2
        L10:
            r2 = 0
            return r2
        L12:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "hasField() can only be called on non-repeated fields."
            r2.<init>(r0)
            throw r2
    }

    public boolean n() {
            r3 = this;
            r0 = 0
            r1 = 0
        L2:
            kotlin.reflect.jvm.internal.impl.protobuf.s<FieldDescriptorType extends kotlin.reflect.jvm.internal.impl.protobuf.g$b<FieldDescriptorType>, java.lang.Object> r2 = r3.a
            int r2 = r2.i()
            if (r1 >= r2) goto L1a
            kotlin.reflect.jvm.internal.impl.protobuf.s<FieldDescriptorType extends kotlin.reflect.jvm.internal.impl.protobuf.g$b<FieldDescriptorType>, java.lang.Object> r2 = r3.a
            java.util.Map$Entry r2 = r2.h(r1)
            boolean r2 = r3.o(r2)
            if (r2 != 0) goto L17
            return r0
        L17:
            int r1 = r1 + 1
            goto L2
        L1a:
            kotlin.reflect.jvm.internal.impl.protobuf.s<FieldDescriptorType extends kotlin.reflect.jvm.internal.impl.protobuf.g$b<FieldDescriptorType>, java.lang.Object> r1 = r3.a
            java.lang.Iterable r1 = r1.j()
            java.util.Iterator r1 = r1.iterator()
        L24:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L37
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            boolean r2 = r3.o(r2)
            if (r2 != 0) goto L24
            return r0
        L37:
            r0 = 1
            return r0
    }

    public java.util.Iterator<java.util.Map.Entry<FieldDescriptorType, java.lang.Object>> p() {
            r2 = this;
            boolean r0 = r2.c
            if (r0 == 0) goto L14
            kotlin.reflect.jvm.internal.impl.protobuf.i$c r0 = new kotlin.reflect.jvm.internal.impl.protobuf.i$c
            kotlin.reflect.jvm.internal.impl.protobuf.s<FieldDescriptorType extends kotlin.reflect.jvm.internal.impl.protobuf.g$b<FieldDescriptorType>, java.lang.Object> r1 = r2.a
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
            r0.<init>(r1)
            return r0
        L14:
            kotlin.reflect.jvm.internal.impl.protobuf.s<FieldDescriptorType extends kotlin.reflect.jvm.internal.impl.protobuf.g$b<FieldDescriptorType>, java.lang.Object> r0 = r2.a
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
            return r0
    }

    public void q() {
            r1 = this;
            boolean r0 = r1.b
            if (r0 == 0) goto L5
            return
        L5:
            kotlin.reflect.jvm.internal.impl.protobuf.s<FieldDescriptorType extends kotlin.reflect.jvm.internal.impl.protobuf.g$b<FieldDescriptorType>, java.lang.Object> r0 = r1.a
            r0.m()
            r0 = 1
            r1.b = r0
            return
    }

    public void r(kotlin.reflect.jvm.internal.impl.protobuf.g<FieldDescriptorType> r3) {
            r2 = this;
            r0 = 0
        L1:
            kotlin.reflect.jvm.internal.impl.protobuf.s<FieldDescriptorType extends kotlin.reflect.jvm.internal.impl.protobuf.g$b<FieldDescriptorType>, java.lang.Object> r1 = r3.a
            int r1 = r1.i()
            if (r0 >= r1) goto L15
            kotlin.reflect.jvm.internal.impl.protobuf.s<FieldDescriptorType extends kotlin.reflect.jvm.internal.impl.protobuf.g$b<FieldDescriptorType>, java.lang.Object> r1 = r3.a
            java.util.Map$Entry r1 = r1.h(r0)
            r2.s(r1)
            int r0 = r0 + 1
            goto L1
        L15:
            kotlin.reflect.jvm.internal.impl.protobuf.s<FieldDescriptorType extends kotlin.reflect.jvm.internal.impl.protobuf.g$b<FieldDescriptorType>, java.lang.Object> r3 = r3.a
            java.lang.Iterable r3 = r3.j()
            java.util.Iterator r3 = r3.iterator()
        L1f:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L2f
            java.lang.Object r0 = r3.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            r2.s(r0)
            goto L1f
        L2f:
            return
    }

    public void v(FieldDescriptorType r4, java.lang.Object r5) {
            r3 = this;
            boolean r0 = r4.H()
            if (r0 == 0) goto L34
            boolean r0 = r5 instanceof java.util.List
            if (r0 == 0) goto L2c
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r5 = (java.util.List) r5
            r0.addAll(r5)
            java.util.Iterator r5 = r0.iterator()
        L18:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L2a
            java.lang.Object r1 = r5.next()
            kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r2 = r4.A()
            w(r2, r1)
            goto L18
        L2a:
            r5 = r0
            goto L3b
        L2c:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Wrong object type used with protocol message reflection."
            r4.<init>(r5)
            throw r4
        L34:
            kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r0 = r4.A()
            w(r0, r5)
        L3b:
            boolean r0 = r5 instanceof kotlin.reflect.jvm.internal.impl.protobuf.i
            if (r0 == 0) goto L42
            r0 = 1
            r3.c = r0
        L42:
            kotlin.reflect.jvm.internal.impl.protobuf.s<FieldDescriptorType extends kotlin.reflect.jvm.internal.impl.protobuf.g$b<FieldDescriptorType>, java.lang.Object> r0 = r3.a
            r0.o(r4, r5)
            return
    }
}

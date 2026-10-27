package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class a {
    private static final boolean a = false;
    static final /* synthetic */ boolean b = false;

    static {
            java.lang.String r0 = "kotlin.jvm.serialization.use8to7"
            java.lang.String r0 = java.lang.System.getProperty(r0)     // Catch: java.lang.SecurityException -> L7
            goto L8
        L7:
            r0 = 0
        L8:
            java.lang.String r1 = "true"
            boolean r0 = r1.equals(r0)
            kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.a.a = r0
            return
    }

    private a() {
            r0 = this;
            r0.<init>()
            return
    }

    private static /* synthetic */ void a(int r19) {
            r0 = r19
            r1 = 14
            r2 = 12
            r3 = 10
            r4 = 8
            r5 = 6
            r6 = 3
            r7 = 1
            if (r0 == r7) goto L1e
            if (r0 == r6) goto L1e
            if (r0 == r5) goto L1e
            if (r0 == r4) goto L1e
            if (r0 == r3) goto L1e
            if (r0 == r2) goto L1e
            if (r0 == r1) goto L1e
            java.lang.String r8 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto L20
        L1e:
            java.lang.String r8 = "@NotNull method %s.%s must not return null"
        L20:
            r9 = 2
            if (r0 == r7) goto L31
            if (r0 == r6) goto L31
            if (r0 == r5) goto L31
            if (r0 == r4) goto L31
            if (r0 == r3) goto L31
            if (r0 == r2) goto L31
            if (r0 == r1) goto L31
            r10 = 3
            goto L32
        L31:
            r10 = 2
        L32:
            java.lang.Object[] r10 = new java.lang.Object[r10]
            java.lang.String r11 = "kotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/BitEncoding"
            r12 = 0
            if (r0 == r7) goto L4a
            if (r0 == r6) goto L4a
            if (r0 == r5) goto L4a
            if (r0 == r4) goto L4a
            if (r0 == r3) goto L4a
            if (r0 == r2) goto L4a
            if (r0 == r1) goto L4a
            java.lang.String r13 = "data"
            r10[r12] = r13
            goto L4c
        L4a:
            r10[r12] = r11
        L4c:
            java.lang.String r12 = "encodeBytes"
            java.lang.String r13 = "encode8to7"
            java.lang.String r14 = "splitBytesToStringArray"
            java.lang.String r15 = "decodeBytes"
            java.lang.String r16 = "dropMarker"
            java.lang.String r17 = "combineStringArrayIntoBytes"
            java.lang.String r18 = "decode7to8"
            if (r0 == r7) goto L7d
            if (r0 == r6) goto L7a
            if (r0 == r5) goto L77
            if (r0 == r4) goto L74
            if (r0 == r3) goto L71
            if (r0 == r2) goto L6e
            if (r0 == r1) goto L6b
            r10[r7] = r11
            goto L7f
        L6b:
            r10[r7] = r18
            goto L7f
        L6e:
            r10[r7] = r17
            goto L7f
        L71:
            r10[r7] = r16
            goto L7f
        L74:
            r10[r7] = r15
            goto L7f
        L77:
            r10[r7] = r14
            goto L7f
        L7a:
            r10[r7] = r13
            goto L7f
        L7d:
            r10[r7] = r12
        L7f:
            switch(r0) {
                case 1: goto L9b;
                case 2: goto L99;
                case 3: goto L9b;
                case 4: goto L94;
                case 5: goto L91;
                case 6: goto L9b;
                case 7: goto L8e;
                case 8: goto L9b;
                case 9: goto L8b;
                case 10: goto L9b;
                case 11: goto L88;
                case 12: goto L9b;
                case 13: goto L85;
                case 14: goto L9b;
                default: goto L82;
            }
        L82:
            r10[r9] = r12
            goto L9b
        L85:
            r10[r9] = r18
            goto L9b
        L88:
            r10[r9] = r17
            goto L9b
        L8b:
            r10[r9] = r16
            goto L9b
        L8e:
            r10[r9] = r15
            goto L9b
        L91:
            r10[r9] = r14
            goto L9b
        L94:
            java.lang.String r11 = "addModuloByte"
            r10[r9] = r11
            goto L9b
        L99:
            r10[r9] = r13
        L9b:
            java.lang.String r8 = java.lang.String.format(r8, r10)
            if (r0 == r7) goto Lb3
            if (r0 == r6) goto Lb3
            if (r0 == r5) goto Lb3
            if (r0 == r4) goto Lb3
            if (r0 == r3) goto Lb3
            if (r0 == r2) goto Lb3
            if (r0 == r1) goto Lb3
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r8)
            goto Lb8
        Lb3:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r8)
        Lb8:
            throw r0
    }

    private static void b(@org.jetbrains.annotations.NotNull byte[] r3, int r4) {
            if (r3 != 0) goto L6
            r0 = 4
            a(r0)
        L6:
            int r0 = r3.length
            r1 = 0
        L8:
            if (r1 >= r0) goto L15
            r2 = r3[r1]
            int r2 = r2 + r4
            r2 = r2 & 127(0x7f, float:1.78E-43)
            byte r2 = (byte) r2
            r3[r1] = r2
            int r1 = r1 + 1
            goto L8
        L15:
            return
    }

    @org.jetbrains.annotations.NotNull
    private static byte[] c(@org.jetbrains.annotations.NotNull java.lang.String[] r10) {
            if (r10 != 0) goto L7
            r0 = 11
            a(r0)
        L7:
            int r0 = r10.length
            r1 = 0
            r2 = 0
            r3 = 0
        Lb:
            if (r2 >= r0) goto L17
            r4 = r10[r2]
            int r4 = r4.length()
            int r3 = r3 + r4
            int r2 = r2 + 1
            goto Lb
        L17:
            byte[] r0 = new byte[r3]
            int r2 = r10.length
            r3 = 0
            r4 = 0
        L1c:
            if (r3 >= r2) goto L37
            r5 = r10[r3]
            int r6 = r5.length()
            r7 = 0
        L25:
            if (r7 >= r6) goto L34
            int r8 = r4 + 1
            char r9 = r5.charAt(r7)
            byte r9 = (byte) r9
            r0[r4] = r9
            int r7 = r7 + 1
            r4 = r8
            goto L25
        L34:
            int r3 = r3 + 1
            goto L1c
        L37:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    private static byte[] d(@org.jetbrains.annotations.NotNull byte[] r12) {
            if (r12 != 0) goto L7
            r0 = 13
            a(r0)
        L7:
            int r0 = r12.length
            int r0 = r0 * 7
            int r0 = r0 / 8
            byte[] r1 = new byte[r0]
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
        L12:
            if (r3 >= r0) goto L37
            r6 = r12[r4]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r6 = r6 >>> r5
            int r7 = r4 + 1
            r8 = r12[r7]
            int r9 = r5 + 1
            r10 = 1
            int r11 = r10 << r9
            int r11 = r11 - r10
            r8 = r8 & r11
            int r10 = 7 - r5
            int r8 = r8 << r10
            int r6 = r6 + r8
            byte r6 = (byte) r6
            r1[r3] = r6
            r6 = 6
            if (r5 != r6) goto L32
            int r4 = r4 + 2
            r5 = 0
            goto L34
        L32:
            r4 = r7
            r5 = r9
        L34:
            int r3 = r3 + 1
            goto L12
        L37:
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static byte[] e(@org.jetbrains.annotations.NotNull java.lang.String[] r2) {
            if (r2 != 0) goto L6
            r0 = 7
            a(r0)
        L6:
            int r0 = r2.length
            if (r0 <= 0) goto L33
            r0 = 0
            r1 = r2[r0]
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L33
            r1 = r2[r0]
            char r0 = r1.charAt(r0)
            if (r0 != 0) goto L2a
            java.lang.String[] r2 = f(r2)
            byte[] r2 = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.i.a(r2)
            if (r2 != 0) goto L29
            r0 = 8
            a(r0)
        L29:
            return r2
        L2a:
            r1 = 65535(0xffff, float:9.1834E-41)
            if (r0 != r1) goto L33
            java.lang.String[] r2 = f(r2)
        L33:
            byte[] r2 = c(r2)
            r0 = 127(0x7f, float:1.78E-43)
            b(r2, r0)
            byte[] r2 = d(r2)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    private static java.lang.String[] f(@org.jetbrains.annotations.NotNull java.lang.String[] r3) {
            if (r3 != 0) goto L7
            r0 = 9
            a(r0)
        L7:
            java.lang.Object r3 = r3.clone()
            java.lang.String[] r3 = (java.lang.String[]) r3
            r0 = 0
            r1 = r3[r0]
            r2 = 1
            java.lang.String r1 = r1.substring(r2)
            r3[r0] = r1
            return r3
    }
}

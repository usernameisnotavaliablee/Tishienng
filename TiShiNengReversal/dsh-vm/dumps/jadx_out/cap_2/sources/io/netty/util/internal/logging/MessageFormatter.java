package io.netty.util.internal.logging;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class MessageFormatter {
    private static final java.lang.String DELIM_STR = "{}";
    private static final char ESCAPE_CHAR = '\\';

    private MessageFormatter() {
            r0 = this;
            r0.<init>()
            return
    }

    static io.netty.util.internal.logging.FormattingTuple arrayFormat(java.lang.String r13, java.lang.Object[] r14) {
            r0 = 0
            if (r14 == 0) goto L8e
            int r1 = r14.length
            if (r1 != 0) goto L8
            goto L8e
        L8:
            int r1 = r14.length
            r2 = 1
            int r1 = r1 - r2
            r3 = r14[r1]
            boolean r4 = r3 instanceof java.lang.Throwable
            if (r4 == 0) goto L14
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            goto L15
        L14:
            r3 = r0
        L15:
            if (r13 != 0) goto L1d
            io.netty.util.internal.logging.FormattingTuple r13 = new io.netty.util.internal.logging.FormattingTuple
            r13.<init>(r0, r3)
            return r13
        L1d:
            java.lang.String r4 = "{}"
            int r5 = r13.indexOf(r4)
            r6 = -1
            if (r5 != r6) goto L2c
            io.netty.util.internal.logging.FormattingTuple r14 = new io.netty.util.internal.logging.FormattingTuple
            r14.<init>(r13, r3)
            return r14
        L2c:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            int r8 = r13.length()
            int r8 = r8 + 50
            r7.<init>(r8)
            r8 = 0
            r9 = 0
            r10 = 0
        L3a:
            r11 = 92
            if (r5 == 0) goto L49
            int r12 = r5 + (-1)
            char r12 = r13.charAt(r12)
            if (r12 == r11) goto L47
            goto L49
        L47:
            r12 = 0
            goto L4a
        L49:
            r12 = 1
        L4a:
            if (r12 == 0) goto L50
            r7.append(r13, r9, r5)
            goto L63
        L50:
            int r12 = r5 + (-1)
            r7.append(r13, r9, r12)
            r9 = 2
            if (r5 < r9) goto L62
            int r9 = r5 + (-2)
            char r9 = r13.charAt(r9)
            if (r9 != r11) goto L62
            r12 = 1
            goto L63
        L62:
            r12 = 0
        L63:
            int r9 = r5 + 2
            if (r12 == 0) goto L71
            r5 = r14[r10]
            deeplyAppendParameter(r7, r5, r0)
            int r10 = r10 + 1
            if (r10 <= r1) goto L74
            goto L7a
        L71:
            r7.append(r4)
        L74:
            int r5 = r13.indexOf(r4, r9)
            if (r5 != r6) goto L3a
        L7a:
            int r14 = r13.length()
            r7.append(r13, r9, r14)
            io.netty.util.internal.logging.FormattingTuple r13 = new io.netty.util.internal.logging.FormattingTuple
            java.lang.String r14 = r7.toString()
            if (r10 > r1) goto L8a
            r0 = r3
        L8a:
            r13.<init>(r14, r0)
            return r13
        L8e:
            io.netty.util.internal.logging.FormattingTuple r14 = new io.netty.util.internal.logging.FormattingTuple
            r14.<init>(r13, r0)
            return r14
    }

    private static void booleanArrayAppend(java.lang.StringBuilder r2, boolean[] r3) {
            int r0 = r3.length
            if (r0 != 0) goto L4
            goto L1b
        L4:
            r0 = 0
            boolean r0 = r3[r0]
            r2.append(r0)
            r0 = 1
        Lb:
            int r1 = r3.length
            if (r0 >= r1) goto L1b
            java.lang.String r1 = ", "
            r2.append(r1)
            boolean r1 = r3[r0]
            r2.append(r1)
            int r0 = r0 + 1
            goto Lb
        L1b:
            return
    }

    private static void byteArrayAppend(java.lang.StringBuilder r2, byte[] r3) {
            int r0 = r3.length
            if (r0 != 0) goto L4
            goto L1b
        L4:
            r0 = 0
            r0 = r3[r0]
            r2.append(r0)
            r0 = 1
        Lb:
            int r1 = r3.length
            if (r0 >= r1) goto L1b
            java.lang.String r1 = ", "
            r2.append(r1)
            r1 = r3[r0]
            r2.append(r1)
            int r0 = r0 + 1
            goto Lb
        L1b:
            return
    }

    private static void charArrayAppend(java.lang.StringBuilder r2, char[] r3) {
            int r0 = r3.length
            if (r0 != 0) goto L4
            goto L1b
        L4:
            r0 = 0
            char r0 = r3[r0]
            r2.append(r0)
            r0 = 1
        Lb:
            int r1 = r3.length
            if (r0 >= r1) goto L1b
            java.lang.String r1 = ", "
            r2.append(r1)
            char r1 = r3[r0]
            r2.append(r1)
            int r0 = r0 + 1
            goto Lb
        L1b:
            return
    }

    private static void deeplyAppendParameter(java.lang.StringBuilder r2, java.lang.Object r3, java.util.Set<java.lang.Object[]> r4) {
            if (r3 != 0) goto L8
            java.lang.String r3 = "null"
            r2.append(r3)
            return
        L8:
            java.lang.Class r0 = r3.getClass()
            boolean r1 = r0.isArray()
            if (r1 != 0) goto L63
            java.lang.Class<java.lang.Number> r4 = java.lang.Number.class
            boolean r4 = r4.isAssignableFrom(r0)
            if (r4 == 0) goto L5f
            java.lang.Class<java.lang.Long> r4 = java.lang.Long.class
            if (r0 != r4) goto L28
            java.lang.Long r3 = (java.lang.Long) r3
            long r3 = r3.longValue()
            r2.append(r3)
            return
        L28:
            java.lang.Class<java.lang.Integer> r4 = java.lang.Integer.class
            if (r0 == r4) goto L55
            java.lang.Class<java.lang.Short> r4 = java.lang.Short.class
            if (r0 == r4) goto L55
            java.lang.Class<java.lang.Byte> r4 = java.lang.Byte.class
            if (r0 != r4) goto L35
            goto L55
        L35:
            java.lang.Class<java.lang.Double> r4 = java.lang.Double.class
            if (r0 != r4) goto L43
            java.lang.Double r3 = (java.lang.Double) r3
            double r3 = r3.doubleValue()
            r2.append(r3)
            return
        L43:
            java.lang.Class<java.lang.Float> r4 = java.lang.Float.class
            if (r0 != r4) goto L51
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
            r2.append(r3)
            return
        L51:
            safeObjectAppend(r2, r3)
            return
        L55:
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            r2.append(r3)
            return
        L5f:
            safeObjectAppend(r2, r3)
            return
        L63:
            r1 = 91
            r2.append(r1)
            java.lang.Class<boolean[]> r1 = boolean[].class
            if (r0 != r1) goto L72
            boolean[] r3 = (boolean[]) r3
            booleanArrayAppend(r2, r3)
            goto Lbd
        L72:
            java.lang.Class<byte[]> r1 = byte[].class
            if (r0 != r1) goto L7c
            byte[] r3 = (byte[]) r3
            byteArrayAppend(r2, r3)
            goto Lbd
        L7c:
            java.lang.Class<char[]> r1 = char[].class
            if (r0 != r1) goto L86
            char[] r3 = (char[]) r3
            charArrayAppend(r2, r3)
            goto Lbd
        L86:
            java.lang.Class<short[]> r1 = short[].class
            if (r0 != r1) goto L90
            short[] r3 = (short[]) r3
            shortArrayAppend(r2, r3)
            goto Lbd
        L90:
            java.lang.Class<int[]> r1 = int[].class
            if (r0 != r1) goto L9a
            int[] r3 = (int[]) r3
            intArrayAppend(r2, r3)
            goto Lbd
        L9a:
            java.lang.Class<long[]> r1 = long[].class
            if (r0 != r1) goto La4
            long[] r3 = (long[]) r3
            longArrayAppend(r2, r3)
            goto Lbd
        La4:
            java.lang.Class<float[]> r1 = float[].class
            if (r0 != r1) goto Lae
            float[] r3 = (float[]) r3
            floatArrayAppend(r2, r3)
            goto Lbd
        Lae:
            java.lang.Class<double[]> r1 = double[].class
            if (r0 != r1) goto Lb8
            double[] r3 = (double[]) r3
            doubleArrayAppend(r2, r3)
            goto Lbd
        Lb8:
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            objectArrayAppend(r2, r3, r4)
        Lbd:
            r3 = 93
            r2.append(r3)
            return
    }

    private static void doubleArrayAppend(java.lang.StringBuilder r3, double[] r4) {
            int r0 = r4.length
            if (r0 != 0) goto L4
            goto L1b
        L4:
            r0 = 0
            r0 = r4[r0]
            r3.append(r0)
            r0 = 1
        Lb:
            int r1 = r4.length
            if (r0 >= r1) goto L1b
            java.lang.String r1 = ", "
            r3.append(r1)
            r1 = r4[r0]
            r3.append(r1)
            int r0 = r0 + 1
            goto Lb
        L1b:
            return
    }

    private static void floatArrayAppend(java.lang.StringBuilder r2, float[] r3) {
            int r0 = r3.length
            if (r0 != 0) goto L4
            goto L1b
        L4:
            r0 = 0
            r0 = r3[r0]
            r2.append(r0)
            r0 = 1
        Lb:
            int r1 = r3.length
            if (r0 >= r1) goto L1b
            java.lang.String r1 = ", "
            r2.append(r1)
            r1 = r3[r0]
            r2.append(r1)
            int r0 = r0 + 1
            goto Lb
        L1b:
            return
    }

    static io.netty.util.internal.logging.FormattingTuple format(java.lang.String r2, java.lang.Object r3) {
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r3
            io.netty.util.internal.logging.FormattingTuple r2 = arrayFormat(r2, r0)
            return r2
    }

    static io.netty.util.internal.logging.FormattingTuple format(java.lang.String r2, java.lang.Object r3, java.lang.Object r4) {
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r3
            r3 = 1
            r0[r3] = r4
            io.netty.util.internal.logging.FormattingTuple r2 = arrayFormat(r2, r0)
            return r2
    }

    private static void intArrayAppend(java.lang.StringBuilder r2, int[] r3) {
            int r0 = r3.length
            if (r0 != 0) goto L4
            goto L1b
        L4:
            r0 = 0
            r0 = r3[r0]
            r2.append(r0)
            r0 = 1
        Lb:
            int r1 = r3.length
            if (r0 >= r1) goto L1b
            java.lang.String r1 = ", "
            r2.append(r1)
            r1 = r3[r0]
            r2.append(r1)
            int r0 = r0 + 1
            goto Lb
        L1b:
            return
    }

    private static void longArrayAppend(java.lang.StringBuilder r3, long[] r4) {
            int r0 = r4.length
            if (r0 != 0) goto L4
            goto L1b
        L4:
            r0 = 0
            r0 = r4[r0]
            r3.append(r0)
            r0 = 1
        Lb:
            int r1 = r4.length
            if (r0 >= r1) goto L1b
            java.lang.String r1 = ", "
            r3.append(r1)
            r1 = r4[r0]
            r3.append(r1)
            int r0 = r0 + 1
            goto Lb
        L1b:
            return
    }

    private static void objectArrayAppend(java.lang.StringBuilder r2, java.lang.Object[] r3, java.util.Set<java.lang.Object[]> r4) {
            int r0 = r3.length
            if (r0 != 0) goto L4
            return
        L4:
            if (r4 != 0) goto Lc
            java.util.HashSet r4 = new java.util.HashSet
            int r0 = r3.length
            r4.<init>(r0)
        Lc:
            boolean r0 = r4.add(r3)
            if (r0 == 0) goto L2d
            r0 = 0
            r0 = r3[r0]
            deeplyAppendParameter(r2, r0, r4)
            r0 = 1
        L19:
            int r1 = r3.length
            if (r0 >= r1) goto L29
            java.lang.String r1 = ", "
            r2.append(r1)
            r1 = r3[r0]
            deeplyAppendParameter(r2, r1, r4)
            int r0 = r0 + 1
            goto L19
        L29:
            r4.remove(r3)
            return
        L2d:
            java.lang.String r3 = "..."
            r2.append(r3)
            return
    }

    private static void safeObjectAppend(java.lang.StringBuilder r1, java.lang.Object r2) {
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L8
            r1.append(r0)     // Catch: java.lang.Throwable -> L8
            return
        L8:
            java.io.PrintStream r0 = java.lang.System.err
            r2.getClass()
            r0.getClass()
            java.lang.String r2 = "[FAILED toString()]"
            r1.append(r2)
            return
    }

    private static void shortArrayAppend(java.lang.StringBuilder r2, short[] r3) {
            int r0 = r3.length
            if (r0 != 0) goto L4
            goto L1b
        L4:
            r0 = 0
            short r0 = r3[r0]
            r2.append(r0)
            r0 = 1
        Lb:
            int r1 = r3.length
            if (r0 >= r1) goto L1b
            java.lang.String r1 = ", "
            r2.append(r1)
            short r1 = r3[r0]
            r2.append(r1)
            int r0 = r0 + 1
            goto Lb
        L1b:
            return
    }
}

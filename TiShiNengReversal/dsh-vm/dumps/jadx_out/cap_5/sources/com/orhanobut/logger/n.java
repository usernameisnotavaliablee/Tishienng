package com.orhanobut.logger;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
final class n {
    private n() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    static <T> T a(@androidx.annotation.Nullable T r0) {
            r0.getClass()
            return r0
    }

    static boolean b(java.lang.CharSequence r6, java.lang.CharSequence r7) {
            r0 = 1
            if (r6 != r7) goto L4
            return r0
        L4:
            r1 = 0
            if (r6 == 0) goto L32
            if (r7 == 0) goto L32
            int r2 = r6.length()
            int r3 = r7.length()
            if (r2 != r3) goto L32
            boolean r3 = r6 instanceof java.lang.String
            if (r3 == 0) goto L20
            boolean r3 = r7 instanceof java.lang.String
            if (r3 == 0) goto L20
            boolean r6 = r6.equals(r7)
            return r6
        L20:
            r3 = 0
        L21:
            if (r3 >= r2) goto L31
            char r4 = r6.charAt(r3)
            char r5 = r7.charAt(r3)
            if (r4 == r5) goto L2e
            return r1
        L2e:
            int r3 = r3 + 1
            goto L21
        L31:
            return r0
        L32:
            return r1
    }

    static java.lang.String c(java.lang.Throwable r2) {
            java.lang.String r0 = ""
            if (r2 != 0) goto L5
            return r0
        L5:
            if (r2 == 0) goto L11
            boolean r1 = r2 instanceof java.net.UnknownHostException
            if (r1 == 0) goto Lc
            return r0
        Lc:
            java.lang.Throwable r2 = r2.getCause()
            goto L5
        L11:
            java.io.StringWriter r2 = new java.io.StringWriter
            r2.<init>()
            java.io.PrintWriter r0 = new java.io.PrintWriter
            r0.<init>(r2)
            r0.flush()
            java.lang.String r2 = r2.toString()
            return r2
    }

    static boolean d(java.lang.CharSequence r0) {
            if (r0 == 0) goto Lb
            int r0 = r0.length()
            if (r0 != 0) goto L9
            goto Lb
        L9:
            r0 = 0
            return r0
        Lb:
            r0 = 1
            return r0
    }

    static java.lang.String e(int r0) {
            switch(r0) {
                case 2: goto L15;
                case 3: goto L12;
                case 4: goto Lf;
                case 5: goto Lc;
                case 6: goto L9;
                case 7: goto L6;
                default: goto L3;
            }
        L3:
            java.lang.String r0 = "UNKNOWN"
            return r0
        L6:
            java.lang.String r0 = "ASSERT"
            return r0
        L9:
            java.lang.String r0 = "ERROR"
            return r0
        Lc:
            java.lang.String r0 = "WARN"
            return r0
        Lf:
            java.lang.String r0 = "INFO"
            return r0
        L12:
            java.lang.String r0 = "DEBUG"
            return r0
        L15:
            java.lang.String r0 = "VERBOSE"
            return r0
    }

    public static java.lang.String f(java.lang.Object r1) {
            if (r1 != 0) goto L5
            java.lang.String r1 = "null"
            return r1
        L5:
            java.lang.Class r0 = r1.getClass()
            boolean r0 = r0.isArray()
            if (r0 != 0) goto L14
            java.lang.String r1 = r1.toString()
            return r1
        L14:
            boolean r0 = r1 instanceof boolean[]
            if (r0 == 0) goto L1f
            boolean[] r1 = (boolean[]) r1
            java.lang.String r1 = java.util.Arrays.toString(r1)
            return r1
        L1f:
            boolean r0 = r1 instanceof byte[]
            if (r0 == 0) goto L2a
            byte[] r1 = (byte[]) r1
            java.lang.String r1 = java.util.Arrays.toString(r1)
            return r1
        L2a:
            boolean r0 = r1 instanceof char[]
            if (r0 == 0) goto L35
            char[] r1 = (char[]) r1
            java.lang.String r1 = java.util.Arrays.toString(r1)
            return r1
        L35:
            boolean r0 = r1 instanceof short[]
            if (r0 == 0) goto L40
            short[] r1 = (short[]) r1
            java.lang.String r1 = java.util.Arrays.toString(r1)
            return r1
        L40:
            boolean r0 = r1 instanceof int[]
            if (r0 == 0) goto L4b
            int[] r1 = (int[]) r1
            java.lang.String r1 = java.util.Arrays.toString(r1)
            return r1
        L4b:
            boolean r0 = r1 instanceof long[]
            if (r0 == 0) goto L56
            long[] r1 = (long[]) r1
            java.lang.String r1 = java.util.Arrays.toString(r1)
            return r1
        L56:
            boolean r0 = r1 instanceof float[]
            if (r0 == 0) goto L61
            float[] r1 = (float[]) r1
            java.lang.String r1 = java.util.Arrays.toString(r1)
            return r1
        L61:
            boolean r0 = r1 instanceof double[]
            if (r0 == 0) goto L6c
            double[] r1 = (double[]) r1
            java.lang.String r1 = java.util.Arrays.toString(r1)
            return r1
        L6c:
            boolean r0 = r1 instanceof java.lang.Object[]
            if (r0 == 0) goto L77
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            java.lang.String r1 = java.util.Arrays.deepToString(r1)
            return r1
        L77:
            java.lang.String r1 = "Couldn't find a correct type for the object"
            return r1
    }
}

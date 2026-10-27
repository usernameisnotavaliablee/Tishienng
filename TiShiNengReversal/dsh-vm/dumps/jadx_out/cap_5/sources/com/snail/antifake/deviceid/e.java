package com.snail.antifake.deviceid;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class e {
    public static final java.lang.String a = "su";
    public static final java.lang.String b = "sh";
    public static final java.lang.String c = "exit\n";
    public static final java.lang.String d = "\n";

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class a {
        public int a;
        public java.lang.String b;
        public java.lang.String c;

        public a(int r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                return
        }

        public a(int r1, java.lang.String r2, java.lang.String r3) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r2
                r0.c = r3
                return
        }
    }

    private e() {
            r1 = this;
            r1.<init>()
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
    }

    public static boolean a() {
            java.lang.String r0 = "echo root"
            r1 = 1
            r2 = 0
            com.snail.antifake.deviceid.e$a r0 = c(r0, r1, r2)
            int r0 = r0.a
            if (r0 != 0) goto Ld
            return r1
        Ld:
            return r2
    }

    public static com.snail.antifake.deviceid.e.a b(java.lang.String r1, boolean r2) {
            java.lang.String[] r1 = new java.lang.String[]{r1}
            r0 = 1
            com.snail.antifake.deviceid.e$a r1 = g(r1, r2, r0)
            return r1
    }

    public static com.snail.antifake.deviceid.e.a c(java.lang.String r0, boolean r1, boolean r2) {
            java.lang.String[] r0 = new java.lang.String[]{r0}
            com.snail.antifake.deviceid.e$a r0 = g(r0, r1, r2)
            return r0
    }

    public static com.snail.antifake.deviceid.e.a d(java.util.List<java.lang.String> r1, boolean r2) {
            if (r1 != 0) goto L4
            r1 = 0
            goto Ld
        L4:
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.Object[] r1 = r1.toArray(r0)
            java.lang.String[] r1 = (java.lang.String[]) r1
        Ld:
            r0 = 1
            com.snail.antifake.deviceid.e$a r1 = g(r1, r2, r0)
            return r1
    }

    public static com.snail.antifake.deviceid.e.a e(java.util.List<java.lang.String> r1, boolean r2, boolean r3) {
            if (r1 != 0) goto L4
            r1 = 0
            goto Ld
        L4:
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.Object[] r1 = r1.toArray(r0)
            java.lang.String[] r1 = (java.lang.String[]) r1
        Ld:
            com.snail.antifake.deviceid.e$a r1 = g(r1, r2, r3)
            return r1
    }

    public static com.snail.antifake.deviceid.e.a f(java.lang.String[] r1, boolean r2) {
            r0 = 1
            com.snail.antifake.deviceid.e$a r1 = g(r1, r2, r0)
            return r1
    }

    public static com.snail.antifake.deviceid.e.a g(java.lang.String[] r7, boolean r8, boolean r9) {
            r0 = 0
            r1 = -1
            if (r7 == 0) goto L147
            int r2 = r7.length
            if (r2 != 0) goto L9
            goto L147
        L9:
            java.lang.Runtime r2 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Throwable -> L12 java.lang.Exception -> L18 java.io.IOException -> L21
            if (r8 == 0) goto L2a
            java.lang.String r8 = "su"
            goto L2c
        L12:
            r7 = move-exception
            r8 = r0
            r3 = r8
        L15:
            r4 = r3
            goto Lf0
        L18:
            r7 = r0
            r8 = r7
            r9 = r8
        L1c:
            r2 = r9
            r3 = r2
        L1e:
            r4 = r3
            goto L108
        L21:
            r7 = r0
            r8 = r7
            r9 = r8
        L25:
            r2 = r9
            r3 = r2
        L27:
            r4 = r3
            goto L11d
        L2a:
            java.lang.String r8 = "sh"
        L2c:
            java.lang.Process r8 = r2.exec(r8)     // Catch: java.lang.Throwable -> L12 java.lang.Exception -> L18 java.io.IOException -> L21
            java.io.DataOutputStream r2 = new java.io.DataOutputStream     // Catch: java.lang.Throwable -> Le2 java.lang.Exception -> Le6 java.io.IOException -> Leb
            java.io.OutputStream r3 = r8.getOutputStream()     // Catch: java.lang.Throwable -> Le2 java.lang.Exception -> Le6 java.io.IOException -> Leb
            r2.<init>(r3)     // Catch: java.lang.Throwable -> Le2 java.lang.Exception -> Le6 java.io.IOException -> Leb
            int r3 = r7.length     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L5a java.io.IOException -> L5f
            r4 = 0
        L3b:
            if (r4 >= r3) goto L64
            r5 = r7[r4]     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L5a java.io.IOException -> L5f
            if (r5 != 0) goto L42
            goto L51
        L42:
            byte[] r5 = r5.getBytes()     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L5a java.io.IOException -> L5f
            r2.write(r5)     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L5a java.io.IOException -> L5f
            java.lang.String r5 = "\n"
            r2.writeBytes(r5)     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L5a java.io.IOException -> L5f
            r2.flush()     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L5a java.io.IOException -> L5f
        L51:
            int r4 = r4 + 1
            goto L3b
        L54:
            r7 = move-exception
            r3 = r0
            r4 = r3
        L57:
            r0 = r2
            goto Lf0
        L5a:
            r7 = r0
            r9 = r7
        L5d:
            r3 = r9
            goto L1e
        L5f:
            r7 = r0
            r9 = r7
        L62:
            r3 = r9
            goto L27
        L64:
            java.lang.String r7 = "exit\n"
            r2.writeBytes(r7)     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L5a java.io.IOException -> L5f
            r2.flush()     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L5a java.io.IOException -> L5f
            int r1 = r8.waitFor()     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L5a java.io.IOException -> L5f
            if (r9 == 0) goto Lcd
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L5a java.io.IOException -> L5f
            r7.<init>()     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L5a java.io.IOException -> L5f
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> Lc7 java.io.IOException -> Lca
            r9.<init>()     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> Lc7 java.io.IOException -> Lca
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> Lbf java.io.IOException -> Lc3
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> Lbf java.io.IOException -> Lc3
            java.io.InputStream r5 = r8.getInputStream()     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> Lbf java.io.IOException -> Lc3
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> Lbf java.io.IOException -> Lc3
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> Lbf java.io.IOException -> Lc3
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> Lb4 java.lang.Exception -> Lb7 java.io.IOException -> Lbb
            java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> Lb4 java.lang.Exception -> Lb7 java.io.IOException -> Lbb
            java.io.InputStream r6 = r8.getErrorStream()     // Catch: java.lang.Throwable -> Lb4 java.lang.Exception -> Lb7 java.io.IOException -> Lbb
            r5.<init>(r6)     // Catch: java.lang.Throwable -> Lb4 java.lang.Exception -> Lb7 java.io.IOException -> Lbb
            r4.<init>(r5)     // Catch: java.lang.Throwable -> Lb4 java.lang.Exception -> Lb7 java.io.IOException -> Lbb
        L98:
            java.lang.String r5 = r3.readLine()     // Catch: java.lang.Throwable -> La2 java.lang.Exception -> La4 java.io.IOException -> La7
            if (r5 == 0) goto Laa
            r7.append(r5)     // Catch: java.lang.Throwable -> La2 java.lang.Exception -> La4 java.io.IOException -> La7
            goto L98
        La2:
            r7 = move-exception
            goto L57
        La4:
            goto L108
        La7:
            goto L11d
        Laa:
            java.lang.String r5 = r4.readLine()     // Catch: java.lang.Throwable -> La2 java.lang.Exception -> La4 java.io.IOException -> La7
            if (r5 == 0) goto Ld1
            r9.append(r5)     // Catch: java.lang.Throwable -> La2 java.lang.Exception -> La4 java.io.IOException -> La7
            goto Laa
        Lb4:
            r7 = move-exception
            r4 = r0
            goto L57
        Lb7:
            r4 = r0
            goto L108
        Lbb:
            r4 = r0
            goto L11d
        Lbf:
            r3 = r0
            goto L1e
        Lc3:
            r3 = r0
            goto L27
        Lc7:
            r9 = r0
            goto L5d
        Lca:
            r9 = r0
            goto L62
        Lcd:
            r7 = r0
            r9 = r7
            r3 = r9
            r4 = r3
        Ld1:
            r2.close()     // Catch: java.io.IOException -> Lde
            if (r3 == 0) goto Ld9
            r3.close()     // Catch: java.io.IOException -> Lde
        Ld9:
            if (r4 == 0) goto Lde
            r4.close()     // Catch: java.io.IOException -> Lde
        Lde:
            r8.destroy()
            goto L132
        Le2:
            r7 = move-exception
            r3 = r0
            goto L15
        Le6:
            r7 = r0
            r9 = r7
            goto L1c
        Leb:
            r7 = r0
            r9 = r7
            goto L25
        Lf0:
            if (r0 == 0) goto Lf8
            r0.close()     // Catch: java.io.IOException -> Lf6
            goto Lf8
        Lf6:
            goto L102
        Lf8:
            if (r3 == 0) goto Lfd
            r3.close()     // Catch: java.io.IOException -> Lf6
        Lfd:
            if (r4 == 0) goto L102
            r4.close()     // Catch: java.io.IOException -> Lf6
        L102:
            if (r8 == 0) goto L107
            r8.destroy()
        L107:
            throw r7
        L108:
            if (r2 == 0) goto L110
            r2.close()     // Catch: java.io.IOException -> L10e
            goto L110
        L10e:
            goto L11a
        L110:
            if (r3 == 0) goto L115
            r3.close()     // Catch: java.io.IOException -> L10e
        L115:
            if (r4 == 0) goto L11a
            r4.close()     // Catch: java.io.IOException -> L10e
        L11a:
            if (r8 == 0) goto L132
            goto Lde
        L11d:
            if (r2 == 0) goto L125
            r2.close()     // Catch: java.io.IOException -> L123
            goto L125
        L123:
            goto L12f
        L125:
            if (r3 == 0) goto L12a
            r3.close()     // Catch: java.io.IOException -> L123
        L12a:
            if (r4 == 0) goto L12f
            r4.close()     // Catch: java.io.IOException -> L123
        L12f:
            if (r8 == 0) goto L132
            goto Lde
        L132:
            com.snail.antifake.deviceid.e$a r8 = new com.snail.antifake.deviceid.e$a
            if (r7 != 0) goto L138
            r7 = r0
            goto L13c
        L138:
            java.lang.String r7 = r7.toString()
        L13c:
            if (r9 != 0) goto L13f
            goto L143
        L13f:
            java.lang.String r0 = r9.toString()
        L143:
            r8.<init>(r1, r7, r0)
            return r8
        L147:
            com.snail.antifake.deviceid.e$a r7 = new com.snail.antifake.deviceid.e$a
            r7.<init>(r1, r0, r0)
            return r7
    }
}

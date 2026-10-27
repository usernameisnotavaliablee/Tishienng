package com.bytedance.msdk.tl;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class oq {
    private static java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.String>> j;

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.bytedance.msdk.tl.oq.j = r0
            return
    }

    public oq() {
            r1 = this;
            r1.<init>()
            return
    }

    private static java.lang.String j(android.content.pm.Signature r7, java.lang.String r8) {
            byte[] r7 = r7.toByteArray()
            java.lang.String r0 = "error!"
            java.security.MessageDigest r8 = java.security.MessageDigest.getInstance(r8)     // Catch: java.lang.Exception -> L39
            if (r8 == 0) goto L49
            byte[] r7 = r8.digest(r7)     // Catch: java.lang.Exception -> L39
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L39
            r8.<init>()     // Catch: java.lang.Exception -> L39
            int r1 = r7.length     // Catch: java.lang.Exception -> L39
            r2 = 0
            r3 = 0
        L18:
            r4 = 1
            if (r3 >= r1) goto L3b
            r5 = r7[r3]     // Catch: java.lang.Exception -> L39
            r5 = r5 & 255(0xff, float:3.57E-43)
            r5 = r5 | 256(0x100, float:3.59E-43)
            java.lang.String r5 = java.lang.Integer.toHexString(r5)     // Catch: java.lang.Exception -> L39
            r6 = 3
            java.lang.String r4 = r5.substring(r4, r6)     // Catch: java.lang.Exception -> L39
            java.lang.String r4 = r4.toUpperCase()     // Catch: java.lang.Exception -> L39
            r8.append(r4)     // Catch: java.lang.Exception -> L39
            java.lang.String r4 = ":"
            r8.append(r4)     // Catch: java.lang.Exception -> L39
            int r3 = r3 + 1
            goto L18
        L39:
            r7 = move-exception
            goto L4a
        L3b:
            int r7 = r8.length()     // Catch: java.lang.Exception -> L39
            int r7 = r7 - r4
            java.lang.String r7 = r8.substring(r2, r7)     // Catch: java.lang.Exception -> L39
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Exception -> L39
            return r7
        L49:
            return r0
        L4a:
            java.lang.String r7 = r7.toString()
            com.bytedance.msdk.j.up.cw.cw(r7)
            return r0
    }

    public static java.util.ArrayList<java.lang.String> j(android.content.Context r9, java.lang.String r10) {
            java.lang.String r0 = "SHA256"
            java.lang.String r1 = "SHA1"
            java.lang.String r2 = "MD5"
            r3 = 0
            if (r9 == 0) goto L69
            if (r10 != 0) goto Lc
            goto L69
        Lc:
            java.lang.String r4 = r9.getPackageName()
            if (r4 != 0) goto L13
            return r3
        L13:
            java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.String>> r3 = com.bytedance.msdk.tl.oq.j
            java.lang.Object r3 = r3.get(r10)
            if (r3 == 0) goto L24
            java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.String>> r9 = com.bytedance.msdk.tl.oq.j
            java.lang.Object r9 = r9.get(r10)
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            return r9
        L24:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            android.content.pm.Signature[] r9 = xt(r9, r4)     // Catch: java.lang.Exception -> L40
            int r4 = r9.length     // Catch: java.lang.Exception -> L40
            r5 = 0
        L2f:
            if (r5 >= r4) goto L64
            r6 = r9[r5]     // Catch: java.lang.Exception -> L40
            java.lang.String r7 = "error!"
            boolean r8 = r2.equals(r10)     // Catch: java.lang.Exception -> L40
            if (r8 == 0) goto L42
            java.lang.String r7 = j(r6, r2)     // Catch: java.lang.Exception -> L40
            goto L57
        L40:
            r9 = move-exception
            goto L5d
        L42:
            boolean r8 = r1.equals(r10)     // Catch: java.lang.Exception -> L40
            if (r8 == 0) goto L4d
            java.lang.String r7 = j(r6, r1)     // Catch: java.lang.Exception -> L40
            goto L57
        L4d:
            boolean r8 = r0.equals(r10)     // Catch: java.lang.Exception -> L40
            if (r8 == 0) goto L57
            java.lang.String r7 = j(r6, r0)     // Catch: java.lang.Exception -> L40
        L57:
            r3.add(r7)     // Catch: java.lang.Exception -> L40
            int r5 = r5 + 1
            goto L2f
        L5d:
            java.lang.String r9 = r9.toString()
            com.bytedance.msdk.j.up.cw.cw(r9)
        L64:
            java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.String>> r9 = com.bytedance.msdk.tl.oq.j
            r9.put(r10, r3)
        L69:
            return r3
    }

    private static android.content.pm.Signature[] xt(android.content.Context r1, java.lang.String r2) {
            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch: java.lang.Exception -> Ld
            r0 = 64
            android.content.pm.PackageInfo r1 = r1.getPackageInfo(r2, r0)     // Catch: java.lang.Exception -> Ld
            android.content.pm.Signature[] r1 = r1.signatures     // Catch: java.lang.Exception -> Ld
            return r1
        Ld:
            r1 = move-exception
            java.lang.String r1 = r1.toString()
            com.bytedance.msdk.j.up.cw.cw(r1)
            r1 = 0
            return r1
    }
}

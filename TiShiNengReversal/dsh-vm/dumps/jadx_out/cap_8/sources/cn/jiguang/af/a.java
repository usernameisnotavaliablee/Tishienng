package cn.jiguang.af;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class a {
    public a() {
            r1 = this;
            r1.<init>()
            return
    }

    public static android.util.Pair<cn.jiguang.af.c, java.nio.ByteBuffer> a(android.content.Context r8, byte[] r9, java.lang.String r10) {
            int r0 = r9.length
            r1 = 0
            java.lang.String r2 = "JCommands"
            r3 = 20
            if (r0 >= r3) goto L13
            java.lang.String r9 = "Error: received body-length short than common head-length, return null"
            cn.jiguang.w.f.j(r2, r9)
            r10 = 1300(0x514, float:1.822E-42)
        Lf:
            cn.jiguang.ab.c.a.a(r8, r10, r9)
            return r1
        L13:
            byte[] r0 = new byte[r3]
            r4 = 0
            java.lang.System.arraycopy(r9, r4, r0, r4, r3)
            cn.jiguang.af.c r5 = new cn.jiguang.af.c
            r5.<init>(r4, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r6 = "parsed head - "
            r0.append(r6)
            java.lang.String r6 = r5.toString()
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            cn.jiguang.w.f.c(r2, r0)
            int r0 = r5.a
            int r0 = r0 - r3
            if (r0 >= 0) goto L43
            java.lang.String r9 = "Error: totalBytes length error with no encrypted, return null"
            cn.jiguang.w.f.j(r2, r9)
            r10 = 1301(0x515, float:1.823E-42)
            goto Lf
        L43:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "body size:"
            r6.append(r7)
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            cn.jiguang.w.f.a(r2, r6)
            boolean r6 = android.text.TextUtils.isEmpty(r10)
            if (r6 == 0) goto L61
            java.lang.String r10 = cn.jiguang.af.b.a(r8)
        L61:
            byte[] r6 = new byte[r0]
            java.lang.System.arraycopy(r9, r3, r6, r4, r0)
            boolean r7 = android.text.TextUtils.isEmpty(r10)
            if (r7 != 0) goto Lbb
            byte r9 = r5.f433d     // Catch: java.lang.Exception -> L7b
            r0 = 2
            if (r9 != r0) goto L7d
            cn.jiguang.av.s r9 = new cn.jiguang.av.s     // Catch: java.lang.Exception -> L7b
            r9.<init>()     // Catch: java.lang.Exception -> L7b
            byte[] r9 = r9.b(r6, r10)     // Catch: java.lang.Exception -> L7b
            goto L87
        L7b:
            r9 = move-exception
            goto L8c
        L7d:
            r9 = 16
            java.lang.String r9 = r10.substring(r4, r9)     // Catch: java.lang.Exception -> L7b
            byte[] r9 = cn.jiguang.av.t.a(r6, r10, r9, r4)     // Catch: java.lang.Exception -> L7b
        L87:
            java.nio.ByteBuffer r8 = java.nio.ByteBuffer.wrap(r9)     // Catch: java.lang.Exception -> L7b
            goto Lc2
        L8c:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r0 = "decryptBytes error:"
            r10.append(r0)
            java.lang.String r3 = r9.getMessage()
            r10.append(r3)
            java.lang.String r10 = r10.toString()
            cn.jiguang.w.f.c(r2, r10)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r0)
            java.lang.String r9 = r9.getMessage()
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            r10 = 1302(0x516, float:1.824E-42)
            goto Lf
        Lbb:
            java.lang.System.arraycopy(r9, r3, r6, r4, r0)
            java.nio.ByteBuffer r8 = java.nio.ByteBuffer.wrap(r6)
        Lc2:
            android.util.Pair r9 = new android.util.Pair
            r9.<init>(r5, r8)
            return r9
    }

    public static boolean a(cn.jiguang.ag.a r6, android.content.Context r7, byte[] r8) {
            java.lang.String r0 = "JCommands"
            java.lang.String r1 = ""
            android.util.Pair r1 = a(r7, r8, r1)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r2 = ":"
            if (r1 == 0) goto L5f
            cn.jiguang.al.c r3 = cn.jiguang.al.c.a()     // Catch: java.lang.Throwable -> L5d
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5d
            r4.<init>()     // Catch: java.lang.Throwable -> L5d
            java.lang.String r5 = r6.f461h     // Catch: java.lang.Throwable -> L5d
            r4.append(r5)     // Catch: java.lang.Throwable -> L5d
            r4.append(r2)     // Catch: java.lang.Throwable -> L5d
            int r6 = r6.f462i     // Catch: java.lang.Throwable -> L5d
            r4.append(r6)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r6 = r4.toString()     // Catch: java.lang.Throwable -> L5d
            java.lang.String r2 = "conn"
            int r8 = r8.length     // Catch: java.lang.Throwable -> L5d
            long r4 = (long) r8     // Catch: java.lang.Throwable -> L5d
            r3.a(r6, r2, r4)     // Catch: java.lang.Throwable -> L5d
            cn.jiguang.d.a.f(r7)     // Catch: java.lang.Throwable -> L5d
            java.lang.Object r6 = r1.first     // Catch: java.lang.Throwable -> L5d
            cn.jiguang.af.c r6 = (cn.jiguang.af.c) r6     // Catch: java.lang.Throwable -> L5d
            long r2 = r6.f436g     // Catch: java.lang.Throwable -> L5d
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5d
            r6.<init>()     // Catch: java.lang.Throwable -> L5d
            java.lang.String r8 = "first:"
            r6.append(r8)     // Catch: java.lang.Throwable -> L5d
            java.lang.Object r8 = r1.first     // Catch: java.lang.Throwable -> L5d
            r6.append(r8)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L5d
            cn.jiguang.w.f.c(r0, r6)     // Catch: java.lang.Throwable -> L5d
            cn.jiguang.ad.b r6 = cn.jiguang.ad.b.a()     // Catch: java.lang.Throwable -> L5d
            java.lang.Object r8 = r1.first     // Catch: java.lang.Throwable -> L5d
            cn.jiguang.af.c r8 = (cn.jiguang.af.c) r8     // Catch: java.lang.Throwable -> L5d
            java.lang.Object r1 = r1.second     // Catch: java.lang.Throwable -> L5d
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1     // Catch: java.lang.Throwable -> L5d
            r6.a(r7, r8, r1)     // Catch: java.lang.Throwable -> L5d
            r6 = 1
            return r6
        L5d:
            r6 = move-exception
            goto L88
        L5f:
            java.lang.String r1 = " recv failed parse Inner Response"
            r3 = 1201(0x4b1, float:1.683E-42)
            cn.jiguang.ab.c.a.a(r7, r3, r1)     // Catch: java.lang.Throwable -> L5d
            cn.jiguang.al.c r7 = cn.jiguang.al.c.a()     // Catch: java.lang.Throwable -> L5d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5d
            r1.<init>()     // Catch: java.lang.Throwable -> L5d
            java.lang.String r3 = r6.f461h     // Catch: java.lang.Throwable -> L5d
            r1.append(r3)     // Catch: java.lang.Throwable -> L5d
            r1.append(r2)     // Catch: java.lang.Throwable -> L5d
            int r6 = r6.f462i     // Catch: java.lang.Throwable -> L5d
            r1.append(r6)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r6 = r1.toString()     // Catch: java.lang.Throwable -> L5d
            java.lang.String r1 = "unknown_conn"
            int r8 = r8.length     // Catch: java.lang.Throwable -> L5d
            long r2 = (long) r8     // Catch: java.lang.Throwable -> L5d
            r7.a(r6, r1, r2)     // Catch: java.lang.Throwable -> L5d
            goto La0
        L88:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "dispatchMessage error:"
            r7.append(r8)
            java.lang.String r6 = r6.getMessage()
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            cn.jiguang.w.f.j(r0, r6)
        La0:
            r6 = 0
            return r6
    }
}

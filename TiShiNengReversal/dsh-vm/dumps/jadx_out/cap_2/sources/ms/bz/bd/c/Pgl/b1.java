package ms.bz.bd.c.Pgl;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class b1 {
    private final android.content.Context a;
    private java.lang.String b;
    private ms.bz.bd.c.Pgl.c1 c;
    android.content.ServiceConnection d;

    final class pgla implements android.content.ServiceConnection {
        final /* synthetic */ ms.bz.bd.c.Pgl.b1 a;

        pgla(ms.bz.bd.c.Pgl.b1 r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(android.content.ComponentName r2, android.os.IBinder r3) {
                r1 = this;
                ms.bz.bd.c.Pgl.b1 r2 = r1.a
                ms.bz.bd.c.Pgl.c1 r0 = new ms.bz.bd.c.Pgl.c1
                r0.<init>(r3)
                ms.bz.bd.c.Pgl.b1.b(r2, r0)
                return
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(android.content.ComponentName r2) {
                r1 = this;
                ms.bz.bd.c.Pgl.b1 r2 = r1.a
                r0 = 0
                ms.bz.bd.c.Pgl.b1.b(r2, r0)
                return
        }
    }

    public b1(android.content.Context r8) {
            r7 = this;
            r7.<init>()
            r0 = 4
            byte[] r6 = new byte[r0]
            r6 = {x001e: FILL_ARRAY_DATA , data: [93, 3, 56, 53} // fill-array
            r3 = 0
            java.lang.String r5 = "c4be4c"
            r1 = 16777217(0x1000001, float:2.350989E-38)
            r2 = 0
            com.volcengine.mobsecBiz.matrix.pgla.a(r1, r2, r3, r5, r6)
            ms.bz.bd.c.Pgl.b1$pgla r0 = new ms.bz.bd.c.Pgl.b1$pgla
            r0.<init>(r7)
            r7.d = r0
            r7.a = r8
            return
    }

    private java.lang.String a(ms.bz.bd.c.Pgl.c1 r15, java.lang.String r16) {
            r14 = this;
            android.content.Context r0 = r14.a
            java.lang.String r0 = r0.getPackageName()
            java.lang.String r1 = r14.b
            r2 = 3
            r3 = 1
            r4 = 0
            r5 = 0
            if (r1 != 0) goto L6d
            android.content.Context r1 = r14.a     // Catch: java.lang.Exception -> L1d
            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch: java.lang.Exception -> L1d
            r6 = 64
            android.content.pm.PackageInfo r1 = r1.getPackageInfo(r0, r6)     // Catch: java.lang.Exception -> L1d
            android.content.pm.Signature[] r1 = r1.signatures     // Catch: java.lang.Exception -> L1d
            goto L1f
        L1d:
            r1 = r5
        L1f:
            if (r1 == 0) goto L6a
            int r6 = r1.length
            if (r6 <= 0) goto L6a
            r1 = r1[r4]
            byte[] r1 = r1.toByteArray()
            java.lang.String r10 = "23c2aa"
            r6 = 4
            byte[] r11 = new byte[r6]     // Catch: java.lang.Exception -> L6a
            r11 = {x00cc: FILL_ARRAY_DATA , data: [16, 25, 49, 23} // fill-array     // Catch: java.lang.Exception -> L6a
            r6 = 16777217(0x1000001, float:2.350989E-38)
            r7 = 0
            r8 = 0
            java.lang.Object r6 = com.volcengine.mobsecBiz.matrix.pgla.a(r6, r7, r8, r10, r11)     // Catch: java.lang.Exception -> L6a
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Exception -> L6a
            java.security.MessageDigest r6 = java.security.MessageDigest.getInstance(r6)     // Catch: java.lang.Exception -> L6a
            if (r6 == 0) goto L6a
            byte[] r1 = r6.digest(r1)     // Catch: java.lang.Exception -> L6a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L6a
            r6.<init>()     // Catch: java.lang.Exception -> L6a
            int r7 = r1.length     // Catch: java.lang.Exception -> L6a
            r8 = 0
        L4f:
            if (r8 >= r7) goto L65
            r9 = r1[r8]     // Catch: java.lang.Exception -> L6a
            r9 = r9 & 255(0xff, float:3.57E-43)
            r9 = r9 | 256(0x100, float:3.59E-43)
            java.lang.String r9 = java.lang.Integer.toHexString(r9)     // Catch: java.lang.Exception -> L6a
            java.lang.String r9 = r9.substring(r3, r2)     // Catch: java.lang.Exception -> L6a
            r6.append(r9)     // Catch: java.lang.Exception -> L6a
            int r8 = r8 + 1
            goto L4f
        L65:
            java.lang.String r1 = r6.toString()     // Catch: java.lang.Exception -> L6a
            goto L6b
        L6a:
            r1 = r5
        L6b:
            r14.b = r1
        L6d:
            java.lang.String r1 = r14.b
            r15.getClass()
            android.os.Parcel r6 = android.os.Parcel.obtain()
            android.os.Parcel r7 = android.os.Parcel.obtain()
            java.lang.String r12 = "db40f4"
            r8 = 25
            byte[] r13 = new byte[r8]     // Catch: java.lang.Throwable -> Laa java.lang.Exception -> Lad
            r13 = {x00d2: FILL_ARRAY_DATA , data: [118, 111, 74, 10, 81, 38, 126, 87, 100, 112, 59, 111, 87, 65, 87, 42, 99, 13, 76, 79, 101, 101, 73, 109, 125} // fill-array     // Catch: java.lang.Throwable -> Laa java.lang.Exception -> Lad
            r8 = 16777217(0x1000001, float:2.350989E-38)
            r9 = 0
            r10 = 0
            java.lang.Object r8 = com.volcengine.mobsecBiz.matrix.pgla.a(r8, r9, r10, r12, r13)     // Catch: java.lang.Throwable -> Laa java.lang.Exception -> Lad
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Throwable -> Laa java.lang.Exception -> Lad
            r6.writeInterfaceToken(r8)     // Catch: java.lang.Throwable -> Laa java.lang.Exception -> Lad
            r6.writeString(r0)     // Catch: java.lang.Throwable -> Laa java.lang.Exception -> Lad
            r6.writeString(r1)     // Catch: java.lang.Throwable -> Laa java.lang.Exception -> Lad
            r0 = r16
            r6.writeString(r0)     // Catch: java.lang.Throwable -> Laa java.lang.Exception -> Lad
            android.os.IBinder r15 = r15.a     // Catch: java.lang.Throwable -> Laa java.lang.Exception -> Lad
            r15.transact(r3, r6, r7, r4)     // Catch: java.lang.Throwable -> Laa java.lang.Exception -> Lad
            r7.readException()     // Catch: java.lang.Throwable -> Laa java.lang.Exception -> Lad
            java.lang.String r5 = r7.readString()     // Catch: java.lang.Throwable -> Laa java.lang.Exception -> Lad
            goto Lbd
        Laa:
            r0 = move-exception
            r15 = r0
            goto Lc4
        Lad:
            java.lang.String r12 = "dc4b3e"
            byte[] r13 = new byte[r2]     // Catch: java.lang.Throwable -> Laa
            r13 = {x00e4: FILL_ARRAY_DATA , data: [122, 113, 78} // fill-array     // Catch: java.lang.Throwable -> Laa
            r8 = 16777217(0x1000001, float:2.350989E-38)
            r9 = 0
            r10 = 0
            com.volcengine.mobsecBiz.matrix.pgla.a(r8, r9, r10, r12, r13)     // Catch: java.lang.Throwable -> Laa
        Lbd:
            r6.recycle()
            r7.recycle()
            return r5
        Lc4:
            r6.recycle()
            r7.recycle()
            throw r15
    }

    static /* synthetic */ void b(ms.bz.bd.c.Pgl.b1 r0, ms.bz.bd.c.Pgl.c1 r1) {
            r0.c = r1
            return
    }

    public final void c(ms.bz.bd.c.Pgl.pblk.pblb r11) {
            r10 = this;
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            if (r0 == r1) goto Lb3
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            android.content.ComponentName r1 = new android.content.ComponentName
            r2 = 17
            byte[] r8 = new byte[r2]
            r8 = {x00ce: FILL_ARRAY_DATA , data: [39, 57, 71, 2, 6, 42, 47, 1, 105, 120, 106, 57, 90, 73, 0, 38, 50} // fill-array
            r5 = 0
            java.lang.String r7 = "549818"
            r3 = 16777217(0x1000001, float:2.350989E-38)
            r4 = 0
            java.lang.Object r2 = com.volcengine.mobsecBiz.matrix.pgla.a(r3, r4, r5, r7, r8)
            java.lang.String r2 = (java.lang.String) r2
            r3 = 33
            byte[] r9 = new byte[r3]
            r9 = {x00dc: FILL_ARRAY_DATA , data: [34, 111, 24, 8, 4, 38, 42, 87, 54, 114, 111, 111, 5, 67, 2, 42, 55, 13, 30, 102, 36, 110, 1, 79, 10, 58, 0, 70, 37, 116, 40, 99, 16} // fill-array
            r6 = 0
            java.lang.String r8 = "0bf234"
            r4 = 16777217(0x1000001, float:2.350989E-38)
            r5 = 0
            java.lang.Object r3 = com.volcengine.mobsecBiz.matrix.pgla.a(r4, r5, r6, r8, r9)
            java.lang.String r3 = (java.lang.String) r3
            r1.<init>(r2, r3)
            r0.setComponent(r1)
            r1 = 40
            byte[] r7 = new byte[r1]
            r7 = {x00f2: FILL_ARRAY_DATA , data: [35, 100, 82, 68, 81, 43, 126, 71, 107, 100, 108, 111, 67, 84, 74, 36, 32, 10, 107, 121, 39, 105, 79, 73, 16, 10, 0, 97, 74, 86, 11, 67, 121, 126, 123, 23, 6, 109, 71, 76} // fill-array
            r4 = 0
            java.lang.String r6 = "3e59a2"
            r2 = 16777217(0x1000001, float:2.350989E-38)
            r3 = 0
            java.lang.Object r1 = com.volcengine.mobsecBiz.matrix.pgla.a(r2, r3, r4, r6, r7)
            java.lang.String r1 = (java.lang.String) r1
            r0.setAction(r1)
            android.content.Context r1 = r10.a     // Catch: java.lang.Throwable -> L8b
            android.content.ServiceConnection r2 = r10.d     // Catch: java.lang.Throwable -> L8b
            r3 = 1
            boolean r0 = r1.bindService(r0, r2, r3)     // Catch: java.lang.Throwable -> L8b
            if (r0 == 0) goto La6
            r0 = 3000(0xbb8, double:1.482E-320)
            android.os.SystemClock.sleep(r0)     // Catch: java.lang.Exception -> L69 java.lang.Throwable -> L8c
        L69:
            ms.bz.bd.c.Pgl.c1 r0 = r10.c     // Catch: java.lang.Throwable -> L8c
            if (r0 == 0) goto L9f
            java.lang.String r8 = "c527fe"
            r1 = 4
            byte[] r9 = new byte[r1]     // Catch: java.lang.Throwable -> L8c
            r9 = {x010a: FILL_ARRAY_DATA , data: [93, 2, 104, 103} // fill-array     // Catch: java.lang.Throwable -> L8c
            r4 = 16777217(0x1000001, float:2.350989E-38)
            r5 = 0
            r6 = 0
            java.lang.Object r1 = com.volcengine.mobsecBiz.matrix.pgla.a(r4, r5, r6, r8, r9)     // Catch: java.lang.Throwable -> L8c
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L8c
            java.lang.String r0 = r10.a(r0, r1)     // Catch: java.lang.Throwable -> L8c
            if (r11 == 0) goto L9f
            r11.j(r0)     // Catch: java.lang.Throwable -> L8c
            goto L9f
        L8b:
            r3 = 0
        L8c:
            java.lang.String r8 = "3a140b"
            r11 = 2
            byte[] r9 = new byte[r11]     // Catch: java.lang.Throwable -> La7
            r9 = {x0110: FILL_ARRAY_DATA , data: [45, 115} // fill-array     // Catch: java.lang.Throwable -> La7
            r4 = 16777217(0x1000001, float:2.350989E-38)
            r5 = 0
            r6 = 0
            com.volcengine.mobsecBiz.matrix.pgla.a(r4, r5, r6, r8, r9)     // Catch: java.lang.Throwable -> La7
            if (r3 == 0) goto La6
        L9f:
            android.content.Context r11 = r10.a
            android.content.ServiceConnection r0 = r10.d
            r11.unbindService(r0)
        La6:
            return
        La7:
            r0 = move-exception
            r11 = r0
            if (r3 == 0) goto Lb2
            android.content.Context r0 = r10.a
            android.content.ServiceConnection r1 = r10.d
            r0.unbindService(r1)
        Lb2:
            throw r11
        Lb3:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            r0 = 24
            byte[] r6 = new byte[r0]
            r6 = {x0116: FILL_ARRAY_DATA , data: [2, 55, 73, 78, 82, 55, 115, 7, 112, 106, 97, 57, 73, 0, 112, 34, 58, 27, 81, 108, 51, 51, 70, 68} // fill-array
            r3 = 0
            java.lang.String r5 = "0444b4"
            r1 = 16777217(0x1000001, float:2.350989E-38)
            r2 = 0
            java.lang.Object r0 = com.volcengine.mobsecBiz.matrix.pgla.a(r1, r2, r3, r5, r6)
            java.lang.String r0 = (java.lang.String) r0
            r11.<init>(r0)
            throw r11
    }
}

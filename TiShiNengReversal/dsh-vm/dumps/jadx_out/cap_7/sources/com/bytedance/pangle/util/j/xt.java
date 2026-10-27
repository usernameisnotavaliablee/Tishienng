package com.bytedance.pangle.util.j;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class xt {
    private static java.lang.String j = "";

    static {
            return
    }

    public xt() {
            r1 = this;
            r1.<init>()
            return
    }

    private static long j(java.nio.ByteBuffer r4, long r5) throws java.lang.Exception {
            long r0 = com.bytedance.pangle.util.j.cw.j(r4)
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 > 0) goto L1a
            long r2 = com.bytedance.pangle.util.j.cw.xt(r4)
            long r2 = r2 + r0
            int r4 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r4 != 0) goto L12
            return r0
        L12:
            java.lang.Exception r4 = new java.lang.Exception
            java.lang.String r5 = "ZIP Central Directory is not immediately followed by End of Central Directory"
            r4.<init>(r5)
            throw r4
        L1a:
            java.lang.Exception r4 = new java.lang.Exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "ZIP Central Directory offset out of range: "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = ". ZIP End of Central Directory offset: "
            r2.append(r0)
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            r4.<init>(r5)
            throw r4
    }

    private static android.util.Pair<java.nio.ByteBuffer, java.lang.Long> j(java.io.RandomAccessFile r1) throws java.lang.Exception {
            android.util.Pair r1 = com.bytedance.pangle.util.j.cw.j(r1)
            if (r1 == 0) goto L7
            return r1
        L7:
            java.lang.Exception r1 = new java.lang.Exception
            java.lang.String r0 = "Not an APK file: ZIP End of Central Directory record not found"
            r1.<init>(r0)
            throw r1
    }

    static android.util.Pair<java.nio.ByteBuffer, java.lang.Long> j(java.io.RandomAccessFile r8, long r9) throws java.lang.Exception {
            r0 = 32
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r2 < 0) goto Ld7
            r0 = 24
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN
            r0.order(r1)
            int r2 = r0.capacity()
            long r2 = (long) r2
            long r2 = r9 - r2
            r8.seek(r2)
            byte[] r2 = r0.array()
            int r3 = r0.arrayOffset()
            int r4 = r0.capacity()
            r8.readFully(r2, r3, r4)
            r2 = 8
            long r2 = r0.getLong(r2)
            r4 = 2334950737559900225(0x20676953204b5041, double:1.3968830566012645E-152)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto Lcf
            r2 = 16
            long r2 = r0.getLong(r2)
            r4 = 3617552046287187010(0x3234206b636f6c42, double:7.465385175170059E-67)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto Lcf
            r2 = 0
            long r3 = r0.getLong(r2)
            int r0 = r0.capacity()
            long r5 = (long) r0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 < 0) goto Lbf
            r5 = 2147483639(0x7ffffff7, double:1.060997891E-314)
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 > 0) goto Lbf
            r5 = 8
            long r5 = r5 + r3
            int r0 = (int) r5
            long r5 = (long) r0
            long r9 = r9 - r5
            r5 = 0
            int r7 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r7 < 0) goto Laf
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            r0.order(r1)
            r8.seek(r9)
            byte[] r1 = r0.array()
            int r5 = r0.arrayOffset()
            int r6 = r0.capacity()
            r8.readFully(r1, r5, r6)
            long r1 = r0.getLong(r2)
            int r8 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r8 != 0) goto L93
            java.lang.Long r8 = java.lang.Long.valueOf(r9)
            android.util.Pair r8 = android.util.Pair.create(r0, r8)
            return r8
        L93:
            java.lang.Exception r8 = new java.lang.Exception
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "APK Signing Block sizes in header and footer do not match: "
            r9.<init>(r10)
            r9.append(r1)
            java.lang.String r10 = " vs "
            r9.append(r10)
            r9.append(r3)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        Laf:
            java.lang.Exception r8 = new java.lang.Exception
            java.lang.String r0 = "APK Signing Block offset out of range: "
            java.lang.String r9 = java.lang.String.valueOf(r9)
            java.lang.String r9 = r0.concat(r9)
            r8.<init>(r9)
            throw r8
        Lbf:
            java.lang.Exception r8 = new java.lang.Exception
            java.lang.String r9 = "APK Signing Block size out of range: "
            java.lang.String r10 = java.lang.String.valueOf(r3)
            java.lang.String r9 = r9.concat(r10)
            r8.<init>(r9)
            throw r8
        Lcf:
            java.lang.Exception r8 = new java.lang.Exception
            java.lang.String r9 = "No APK Signing Block before ZIP Central Directory"
            r8.<init>(r9)
            throw r8
        Ld7:
            java.lang.Exception r8 = new java.lang.Exception
            java.lang.String r0 = "APK too small for APK Signing Block. ZIP Central Directory offset: "
            java.lang.String r9 = java.lang.String.valueOf(r9)
            java.lang.String r9 = r0.concat(r9)
            r8.<init>(r9)
            throw r8
    }

    private static java.nio.ByteBuffer j(java.nio.ByteBuffer r3, int r4, int r5) {
            if (r4 < 0) goto L78
            if (r5 < r4) goto L5c
            int r0 = r3.capacity()
            int r1 = r3.capacity()
            if (r5 > r1) goto L40
            int r0 = r3.limit()
            int r1 = r3.position()
            r2 = 0
            r3.position(r2)     // Catch: java.lang.Throwable -> L35
            r3.limit(r5)     // Catch: java.lang.Throwable -> L35
            r3.position(r4)     // Catch: java.lang.Throwable -> L35
            java.nio.ByteBuffer r4 = r3.slice()     // Catch: java.lang.Throwable -> L35
            java.nio.ByteOrder r5 = r3.order()     // Catch: java.lang.Throwable -> L35
            r4.order(r5)     // Catch: java.lang.Throwable -> L35
            r3.position(r2)
            r3.limit(r0)
            r3.position(r1)
            return r4
        L35:
            r4 = move-exception
            r3.position(r2)
            r3.limit(r0)
            r3.position(r1)
            throw r4
        L40:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r1 = "end > capacity: "
            r4.<init>(r1)
            r4.append(r5)
            java.lang.String r5 = " > "
            r4.append(r5)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L5c:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "end < start: "
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r5 = " < "
            r0.append(r5)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r3.<init>(r4)
            throw r3
        L78:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "start: "
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r4 = r5.concat(r4)
            r3.<init>(r4)
            throw r3
    }

    private static boolean j(java.nio.ByteBuffer r11) throws java.lang.Exception {
            xt(r11)
            int r0 = r11.capacity()
            int r0 = r0 + (-24)
            r1 = 8
            java.nio.ByteBuffer r11 = j(r11, r1, r0)
            r0 = 0
            r2 = 0
        L11:
            boolean r3 = r11.hasRemaining()
            if (r3 == 0) goto La8
            r3 = 1
            int r2 = r2 + r3
            int r4 = r11.remaining()
            if (r4 < r1) goto L98
            long r4 = r11.getLong()
            r6 = 4
            java.lang.String r8 = " size out of range: "
            java.lang.String r9 = "APK Signing Block entry #"
            int r10 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r10 < 0) goto L80
            r6 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r10 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r10 > 0) goto L80
            int r5 = (int) r4
            int r4 = r11.position()
            int r4 = r4 + r5
            int r6 = r11.remaining()
            if (r5 > r6) goto L5c
            int r5 = r11.getInt()
            r6 = -262969152(0xfffffffff05368c0, float:-2.6171189E29)
            if (r5 != r6) goto L4e
            java.lang.String r11 = "V3"
            com.bytedance.pangle.util.j.xt.j = r11
            return r3
        L4e:
            r6 = 1896449818(0x7109871a, float:6.810044E29)
            if (r5 != r6) goto L58
            java.lang.String r11 = "V2"
            com.bytedance.pangle.util.j.xt.j = r11
            return r3
        L58:
            r11.position(r4)
            goto L11
        L5c:
            java.lang.Exception r0 = new java.lang.Exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r9)
            r1.append(r2)
            r1.append(r8)
            r1.append(r5)
            java.lang.String r2 = ", available: "
            r1.append(r2)
            int r11 = r11.remaining()
            r1.append(r11)
            java.lang.String r11 = r1.toString()
            r0.<init>(r11)
            throw r0
        L80:
            java.lang.Exception r11 = new java.lang.Exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r9)
            r0.append(r2)
            r0.append(r8)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            r11.<init>(r0)
            throw r11
        L98:
            java.lang.Exception r11 = new java.lang.Exception
            java.lang.String r0 = "Insufficient data to read size of APK Signing Block entry #"
            java.lang.String r1 = java.lang.String.valueOf(r2)
            java.lang.String r0 = r0.concat(r1)
            r11.<init>(r0)
            throw r11
        La8:
            return r0
    }

    public static java.lang.String[] j(java.io.File r3) {
            java.lang.String r0 = ""
            java.nio.ByteBuffer r3 = xt(r3)     // Catch: java.lang.Exception -> L1b
            boolean r1 = j(r3)     // Catch: java.lang.Exception -> L1b
            if (r1 == 0) goto L18
            byte[] r3 = r3.array()     // Catch: java.lang.Exception -> L1b
            java.lang.String r3 = com.bytedance.pangle.util.m.j(r3)     // Catch: java.lang.Exception -> L1b
            r2 = r0
            r0 = r3
            r3 = r2
            goto L1c
        L18:
            java.lang.String r3 = "without v2 & v3 signature."
            goto L1c
        L1b:
            r3 = r0
        L1c:
            java.lang.String r1 = com.bytedance.pangle.util.j.xt.j
            java.lang.String[] r3 = new java.lang.String[]{r0, r1, r3}
            return r3
    }

    private static java.nio.ByteBuffer xt(java.io.File r4) throws java.lang.Exception {
            r0 = 0
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> L39
            java.lang.String r2 = "r"
            r1.<init>(r4, r2)     // Catch: java.lang.Throwable -> L39
            android.util.Pair r4 = j(r1)     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r0 = r4.first     // Catch: java.lang.Throwable -> L2e
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r4 = r4.second     // Catch: java.lang.Throwable -> L2e
            java.lang.Long r4 = (java.lang.Long) r4     // Catch: java.lang.Throwable -> L2e
            long r2 = r4.longValue()     // Catch: java.lang.Throwable -> L2e
            boolean r4 = com.bytedance.pangle.util.j.cw.j(r1, r2)     // Catch: java.lang.Throwable -> L2e
            if (r4 != 0) goto L31
            long r2 = j(r0, r2)     // Catch: java.lang.Throwable -> L2e
            android.util.Pair r4 = j(r1, r2)     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r4 = r4.first     // Catch: java.lang.Throwable -> L2e
            java.nio.ByteBuffer r4 = (java.nio.ByteBuffer) r4     // Catch: java.lang.Throwable -> L2e
            r1.close()
            return r4
        L2e:
            r4 = move-exception
            r0 = r1
            goto L3a
        L31:
            java.lang.Exception r4 = new java.lang.Exception     // Catch: java.lang.Throwable -> L2e
            java.lang.String r0 = "ZIP64 APK not supported"
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L2e
            throw r4     // Catch: java.lang.Throwable -> L2e
        L39:
            r4 = move-exception
        L3a:
            if (r0 == 0) goto L3f
            r0.close()
        L3f:
            throw r4
    }

    private static void xt(java.nio.ByteBuffer r1) {
            java.nio.ByteOrder r1 = r1.order()
            java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN
            if (r1 != r0) goto L9
            return
        L9:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "ByteBuffer byte order must be little endian"
            r1.<init>(r0)
            throw r1
    }
}

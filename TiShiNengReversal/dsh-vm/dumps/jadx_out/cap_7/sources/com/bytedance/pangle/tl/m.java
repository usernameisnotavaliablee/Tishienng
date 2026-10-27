package com.bytedance.pangle.tl;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
final class m {
    static final java.util.HashMap<java.lang.String, android.util.SparseArray<com.bytedance.pangle.tl.jy>> j = null;


    private static class j implements com.bytedance.pangle.tl.oq {
        private final java.security.MessageDigest[] j;

        j(java.security.MessageDigest[] r1) {
                r0 = this;
                r0.<init>()
                r0.j = r1
                return
        }

        @Override // com.bytedance.pangle.tl.oq
        public void j(java.nio.ByteBuffer r6) {
                r5 = this;
                java.nio.ByteBuffer r6 = r6.slice()
                java.security.MessageDigest[] r0 = r5.j
                int r1 = r0.length
                r2 = 0
                r3 = 0
            L9:
                if (r3 >= r1) goto L16
                r4 = r0[r3]
                r6.position(r2)
                r4.update(r6)
                int r3 = r3 + 1
                goto L9
            L16:
                return
        }
    }

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.bytedance.pangle.tl.m.j = r0
            return
    }

    public m() {
            r1 = this;
            r1.<init>()
            return
    }

    static java.lang.String cw(int r4) {
            r0 = 513(0x201, float:7.19E-43)
            if (r4 == r0) goto L3a
            r0 = 514(0x202, float:7.2E-43)
            if (r4 == r0) goto L3a
            r0 = 769(0x301, float:1.078E-42)
            if (r4 == r0) goto L37
            r0 = 1057(0x421, float:1.481E-42)
            if (r4 == r0) goto L34
            r0 = 1059(0x423, float:1.484E-42)
            if (r4 == r0) goto L3a
            r0 = 1061(0x425, float:1.487E-42)
            if (r4 == r0) goto L37
            switch(r4) {
                case 257: goto L34;
                case 258: goto L34;
                case 259: goto L34;
                case 260: goto L34;
                default: goto L1b;
            }
        L1b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unknown signature algorithm: 0x"
            r1.<init>(r2)
            long r2 = (long) r4
            java.lang.String r4 = java.lang.Long.toHexString(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L34:
            java.lang.String r4 = "RSA"
            return r4
        L37:
            java.lang.String r4 = "DSA"
            return r4
        L3a:
            java.lang.String r4 = "EC"
            return r4
    }

    private static void cw(java.nio.ByteBuffer r1) {
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

    static int j(int r4) {
            r0 = 513(0x201, float:7.19E-43)
            if (r4 == r0) goto L38
            r0 = 514(0x202, float:7.2E-43)
            if (r4 == r0) goto L36
            r0 = 769(0x301, float:1.078E-42)
            if (r4 == r0) goto L38
            r0 = 1057(0x421, float:1.481E-42)
            if (r4 == r0) goto L34
            r0 = 1059(0x423, float:1.484E-42)
            if (r4 == r0) goto L34
            r0 = 1061(0x425, float:1.487E-42)
            if (r4 == r0) goto L34
            switch(r4) {
                case 257: goto L38;
                case 258: goto L36;
                case 259: goto L38;
                case 260: goto L36;
                default: goto L1b;
            }
        L1b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unknown signature algorithm: 0x"
            r1.<init>(r2)
            long r2 = (long) r4
            java.lang.String r4 = java.lang.Long.toHexString(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L34:
            r4 = 3
            return r4
        L36:
            r4 = 2
            return r4
        L38:
            r4 = 1
            return r4
    }

    static int j(int r0, int r1) {
            int r0 = j(r0)
            int r1 = j(r1)
            int r0 = xt(r0, r1)
            return r0
    }

    private static long j(long r2) {
            r0 = 1048575(0xfffff, double:5.18065E-318)
            long r2 = r2 + r0
            r0 = 1048576(0x100000, double:5.180654E-318)
            long r2 = r2 / r0
            return r2
    }

    static long j(java.nio.ByteBuffer r4, long r5) throws com.bytedance.pangle.tl.ws {
            long r0 = com.bytedance.pangle.tl.mi.j(r4)
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 > 0) goto L1a
            long r2 = com.bytedance.pangle.tl.mi.xt(r4)
            long r2 = r2 + r0
            int r4 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r4 != 0) goto L12
            return r0
        L12:
            com.bytedance.pangle.tl.ws r4 = new com.bytedance.pangle.tl.ws
            java.lang.String r5 = "ZIP Central Directory is not immediately followed by End of Central Directory"
            r4.<init>(r5)
            throw r4
        L1a:
            com.bytedance.pangle.tl.ws r4 = new com.bytedance.pangle.tl.ws
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

    static android.util.Pair<java.nio.ByteBuffer, java.lang.Long> j(java.io.RandomAccessFile r1) throws java.io.IOException, com.bytedance.pangle.tl.ws {
            android.util.Pair r1 = com.bytedance.pangle.tl.mi.j(r1)
            if (r1 == 0) goto L7
            return r1
        L7:
            com.bytedance.pangle.tl.ws r1 = new com.bytedance.pangle.tl.ws
            java.lang.String r0 = "Not an APK file: ZIP End of Central Directory record not found"
            r1.<init>(r0)
            throw r1
    }

    static android.util.Pair<java.nio.ByteBuffer, java.lang.Long> j(java.io.RandomAccessFile r8, long r9) throws java.io.IOException, com.bytedance.pangle.tl.ws {
            r0 = 32
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r2 < 0) goto Ld3
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
            if (r6 != 0) goto Ld1
            r2 = 16
            long r2 = r0.getLong(r2)
            r4 = 3617552046287187010(0x3234206b636f6c42, double:7.465385175170059E-67)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L4a
            goto Ld1
        L4a:
            r2 = 0
            long r3 = r0.getLong(r2)
            int r0 = r0.capacity()
            long r5 = (long) r0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 < 0) goto Lc1
            r5 = 2147483639(0x7ffffff7, double:1.060997891E-314)
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 > 0) goto Lc1
            r5 = 8
            long r5 = r5 + r3
            int r0 = (int) r5
            long r5 = (long) r0
            long r9 = r9 - r5
            r5 = 0
            int r7 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r7 < 0) goto Lb1
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            r0.order(r1)
            r8.seek(r9)
            byte[] r1 = r0.array()
            int r5 = r0.arrayOffset()
            int r6 = r0.capacity()
            r8.readFully(r1, r5, r6)
            long r1 = r0.getLong(r2)
            int r8 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r8 != 0) goto L95
            java.lang.Long r8 = java.lang.Long.valueOf(r9)
            android.util.Pair r8 = android.util.Pair.create(r0, r8)
            return r8
        L95:
            com.bytedance.pangle.tl.ws r8 = new com.bytedance.pangle.tl.ws
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
        Lb1:
            com.bytedance.pangle.tl.ws r8 = new com.bytedance.pangle.tl.ws
            java.lang.String r0 = "APK Signing Block offset out of range: "
            java.lang.String r9 = java.lang.String.valueOf(r9)
            java.lang.String r9 = r0.concat(r9)
            r8.<init>(r9)
            throw r8
        Lc1:
            com.bytedance.pangle.tl.ws r8 = new com.bytedance.pangle.tl.ws
            java.lang.String r9 = "APK Signing Block size out of range: "
            java.lang.String r10 = java.lang.String.valueOf(r3)
            java.lang.String r9 = r9.concat(r10)
            r8.<init>(r9)
            throw r8
        Ld1:
            r8 = 0
            return r8
        Ld3:
            com.bytedance.pangle.tl.ws r8 = new com.bytedance.pangle.tl.ws
            java.lang.String r0 = "APK too small for APK Signing Block. ZIP Central Directory offset: "
            java.lang.String r9 = java.lang.String.valueOf(r9)
            java.lang.String r9 = r0.concat(r9)
            r8.<init>(r9)
            throw r8
    }

    static java.nio.ByteBuffer j(java.nio.ByteBuffer r4) throws java.io.IOException {
            int r0 = r4.remaining()
            r1 = 4
            if (r0 < r1) goto L40
            int r0 = r4.getInt()
            if (r0 < 0) goto L38
            int r1 = r4.remaining()
            if (r0 > r1) goto L18
            java.nio.ByteBuffer r4 = j(r4, r0)
            return r4
        L18:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Length-prefixed field longer than remaining buffer. Field length: "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = ", remaining: "
            r2.append(r0)
            int r4 = r4.remaining()
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            r1.<init>(r4)
            throw r1
        L38:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Negative length"
            r4.<init>(r0)
            throw r4
        L40:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Remaining buffer too short to contain length of length-prefixed field. Remaining: "
            r1.<init>(r2)
            int r4 = r4.remaining()
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    static java.nio.ByteBuffer j(java.nio.ByteBuffer r3, int r4) throws java.nio.BufferUnderflowException {
            if (r4 < 0) goto L2f
            int r0 = r3.limit()
            int r1 = r3.position()
            int r4 = r4 + r1
            if (r4 < r1) goto L29
            if (r4 > r0) goto L29
            r3.limit(r4)
            java.nio.ByteBuffer r1 = r3.slice()     // Catch: java.lang.Throwable -> L24
            java.nio.ByteOrder r2 = r3.order()     // Catch: java.lang.Throwable -> L24
            r1.order(r2)     // Catch: java.lang.Throwable -> L24
            r3.position(r4)     // Catch: java.lang.Throwable -> L24
            r3.limit(r0)
            return r1
        L24:
            r4 = move-exception
            r3.limit(r0)
            throw r4
        L29:
            java.nio.BufferUnderflowException r3 = new java.nio.BufferUnderflowException
            r3.<init>()
            throw r3
        L2f:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "size: "
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r4 = r0.concat(r4)
            r3.<init>(r4)
            throw r3
    }

    static java.nio.ByteBuffer j(java.nio.ByteBuffer r3, int r4, int r5) {
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

    static void j(int r2, byte[] r3, int r4) {
            r0 = r2 & 255(0xff, float:3.57E-43)
            byte r0 = (byte) r0
            r3[r4] = r0
            int r0 = r4 + 1
            int r1 = r2 >>> 8
            r1 = r1 & 255(0xff, float:3.57E-43)
            byte r1 = (byte) r1
            r3[r0] = r1
            int r0 = r4 + 2
            int r1 = r2 >>> 16
            r1 = r1 & 255(0xff, float:3.57E-43)
            byte r1 = (byte) r1
            r3[r0] = r1
            int r4 = r4 + 3
            int r2 = r2 >>> 24
            r2 = r2 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r2
            r3[r4] = r2
            return
    }

    static void j(java.lang.String r17, java.io.RandomAccessFile r18, int... r19) throws com.bytedance.pangle.tl.ws, java.io.IOException {
            r0 = r17
            r1 = r18
            r2 = r19
            java.util.HashMap<java.lang.String, android.util.SparseArray<com.bytedance.pangle.tl.jy>> r3 = com.bytedance.pangle.tl.m.j
            android.util.SparseArray r4 = new android.util.SparseArray
            r4.<init>()
            r3.put(r0, r4)
            android.util.Pair r3 = j(r1)
            java.lang.Object r4 = r3.first
            r13 = r4
            java.nio.ByteBuffer r13 = (java.nio.ByteBuffer) r13
            java.lang.Object r3 = r3.second
            java.lang.Long r3 = (java.lang.Long) r3
            long r11 = r3.longValue()
            boolean r3 = com.bytedance.pangle.tl.mi.j(r1, r11)
            if (r3 != 0) goto Lbf
            long r9 = j(r13, r11)
            android.util.Pair r1 = j(r1, r9)
            if (r1 != 0) goto L33
            goto Lbe
        L33:
            java.lang.Object r3 = r1.first
            java.nio.ByteBuffer r3 = (java.nio.ByteBuffer) r3
            java.lang.Object r1 = r1.second
            java.lang.Long r1 = (java.lang.Long) r1
            long r7 = r1.longValue()
            cw(r3)
            int r1 = r3.capacity()
            int r1 = r1 + (-24)
            r4 = 8
            java.nio.ByteBuffer r1 = j(r3, r4, r1)
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            int r5 = r2.length
            r6 = 0
        L55:
            if (r6 >= r5) goto L63
            r14 = r2[r6]
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r3.add(r14)
            int r6 = r6 + 1
            goto L55
        L63:
            boolean r2 = r1.hasRemaining()
            if (r2 == 0) goto Lbe
            int r2 = r1.remaining()
            if (r2 >= r4) goto L70
            goto Lbe
        L70:
            long r5 = r1.getLong()
            r14 = 4
            int r2 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r2 < 0) goto Lbe
            r14 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r2 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r2 <= 0) goto L82
            goto Lbe
        L82:
            int r2 = (int) r5
            int r5 = r1.position()
            int r14 = r5 + r2
            int r5 = r1.remaining()
            if (r2 <= r5) goto L90
            goto Lbe
        L90:
            int r15 = r1.getInt()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r15)
            boolean r5 = r3.contains(r5)
            if (r5 == 0) goto Lba
            java.util.HashMap<java.lang.String, android.util.SparseArray<com.bytedance.pangle.tl.jy>> r5 = com.bytedance.pangle.tl.m.j
            java.lang.Object r5 = r5.get(r0)
            android.util.SparseArray r5 = (android.util.SparseArray) r5
            r6 = r5
            com.bytedance.pangle.tl.jy r5 = new com.bytedance.pangle.tl.jy
            int r2 = r2 + (-4)
            java.nio.ByteBuffer r2 = j(r1, r2)
            r16 = r6
            r6 = r2
            r2 = r16
            r5.<init>(r6, r7, r9, r11, r13)
            r2.put(r15, r5)
        Lba:
            r1.position(r14)
            goto L63
        Lbe:
            return
        Lbf:
            com.bytedance.pangle.tl.ws r0 = new com.bytedance.pangle.tl.ws
            java.lang.String r1 = "ZIP64 APK not supported"
            r0.<init>(r1)
            throw r0
    }

    private static void j(java.util.Map<java.lang.Integer, byte[]> r12, java.io.FileDescriptor r13, com.bytedance.pangle.tl.jy r14) throws java.lang.SecurityException {
            com.bytedance.pangle.tl.vl r0 = new com.bytedance.pangle.tl.vl
            r2 = 0
            long r4 = r14.xt
            r1 = r13
            r0.<init>(r1, r2, r4)
            com.bytedance.pangle.tl.vl r6 = new com.bytedance.pangle.tl.vl
            long r8 = r14.cw
            long r2 = r14.r
            long r10 = r2 - r8
            r7 = r1
            r6.<init>(r7, r8, r10)
            java.nio.ByteBuffer r13 = r14.up
            java.nio.ByteBuffer r13 = r13.duplicate()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN
            r13.order(r1)
            long r1 = r14.xt
            com.bytedance.pangle.tl.mi.j(r13, r1)
            com.bytedance.pangle.tl.tl r14 = new com.bytedance.pangle.tl.tl
            r14.<init>(r13)
            int r13 = r12.size()
            int[] r1 = new int[r13]
            java.util.Set r2 = r12.keySet()
            java.util.Iterator r2 = r2.iterator()
            r3 = 0
            r4 = 0
        L3b:
            boolean r5 = r2.hasNext()
            r7 = 1
            if (r5 == 0) goto L50
            java.lang.Object r5 = r2.next()
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r1[r4] = r5
            int r4 = r4 + r7
            goto L3b
        L50:
            r2 = 3
            com.bytedance.pangle.tl.qv[] r2 = new com.bytedance.pangle.tl.qv[r2]     // Catch: java.security.DigestException -> L93
            r2[r3] = r0     // Catch: java.security.DigestException -> L93
            r2[r7] = r6     // Catch: java.security.DigestException -> L93
            r0 = 2
            r2[r0] = r14     // Catch: java.security.DigestException -> L93
            byte[][] r14 = j(r1, r2)     // Catch: java.security.DigestException -> L93
        L5e:
            if (r3 >= r13) goto L92
            r0 = r1[r3]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            java.lang.Object r2 = r12.get(r2)
            byte[] r2 = (byte[]) r2
            r4 = r14[r3]
            boolean r2 = java.security.MessageDigest.isEqual(r2, r4)
            if (r2 == 0) goto L77
            int r3 = r3 + 1
            goto L5e
        L77:
            java.lang.SecurityException r12 = new java.lang.SecurityException
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = xt(r0)
            r13.append(r14)
            java.lang.String r14 = " digest of contents did not verify"
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            r12.<init>(r13)
            throw r12
        L92:
            return
        L93:
            r0 = move-exception
            r12 = r0
            java.lang.SecurityException r13 = new java.lang.SecurityException
            java.lang.String r14 = "Failed to compute digest(s) of contents"
            r13.<init>(r14, r12)
            throw r13
    }

    @androidx.annotation.RequiresApi(api = 21)
    static void j(java.util.Map<java.lang.Integer, byte[]> r6, java.io.RandomAccessFile r7, com.bytedance.pangle.tl.jy r8) throws java.lang.SecurityException {
            r0 = 3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1 = 2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            boolean r4 = r6.isEmpty()
            if (r4 != 0) goto L69
            android.util.ArrayMap r4 = new android.util.ArrayMap
            r4.<init>()
            boolean r5 = r6.containsKey(r3)
            if (r5 == 0) goto L27
            java.lang.Object r5 = r6.get(r3)
            r4.put(r3, r5)
        L27:
            boolean r3 = r6.containsKey(r1)
            if (r3 == 0) goto L34
            java.lang.Object r3 = r6.get(r1)
            r4.put(r1, r3)
        L34:
            boolean r1 = r4.isEmpty()
            r3 = 0
            if (r1 != 0) goto L4d
            java.io.FileDescriptor r1 = r7.getFD()     // Catch: java.io.IOException -> L44
            j(r4, r1, r8)     // Catch: java.io.IOException -> L44
            r2 = 0
            goto L4d
        L44:
            r6 = move-exception
            java.lang.SecurityException r7 = new java.lang.SecurityException
            java.lang.String r8 = "Cannot get FD"
            r7.<init>(r8, r6)
            throw r7
        L4d:
            boolean r1 = r6.containsKey(r0)
            if (r1 == 0) goto L5d
            java.lang.Object r6 = r6.get(r0)
            byte[] r6 = (byte[]) r6
            j(r6, r7, r8)
            goto L5e
        L5d:
            r3 = r2
        L5e:
            if (r3 != 0) goto L61
            return
        L61:
            java.lang.SecurityException r6 = new java.lang.SecurityException
            java.lang.String r7 = "No known digest exists for integrity check"
            r6.<init>(r7)
            throw r6
        L69:
            java.lang.SecurityException r6 = new java.lang.SecurityException
            java.lang.String r7 = "No digests provided"
            r6.<init>(r7)
            throw r6
    }

    private static void j(byte[] r2, java.io.RandomAccessFile r3, com.bytedance.pangle.tl.jy r4) throws java.lang.SecurityException {
            long r0 = r3.length()     // Catch: java.lang.Throwable -> L22
            byte[] r2 = j(r2, r0, r4)     // Catch: java.lang.Throwable -> L22
            com.bytedance.pangle.tl.m$1 r0 = new com.bytedance.pangle.tl.m$1     // Catch: java.lang.Throwable -> L22
            r0.<init>()     // Catch: java.lang.Throwable -> L22
            com.bytedance.pangle.tl.ae$j r3 = com.bytedance.pangle.tl.ae.j(r3, r4, r0)     // Catch: java.lang.Throwable -> L22
            byte[] r3 = r3.xt     // Catch: java.lang.Throwable -> L22
            boolean r2 = java.util.Arrays.equals(r2, r3)     // Catch: java.lang.Throwable -> L22
            if (r2 == 0) goto L1a
            return
        L1a:
            java.lang.SecurityException r2 = new java.lang.SecurityException     // Catch: java.lang.Throwable -> L22
            java.lang.String r3 = "APK verity digest of contents did not verify"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L22
            throw r2     // Catch: java.lang.Throwable -> L22
        L22:
            r2 = move-exception
            java.lang.SecurityException r3 = new java.lang.SecurityException
            java.lang.String r4 = "Error during verification"
            r3.<init>(r4, r2)
            throw r3
    }

    static byte[] j(byte[] r8, long r9, com.bytedance.pangle.tl.jy r11) throws java.lang.SecurityException {
            int r0 = r8.length
            r1 = 40
            if (r0 != r1) goto L30
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r8)
            java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r0 = r0.order(r1)
            r1 = 32
            r0.position(r1)
            long r2 = r0.getLong()
            long r4 = r11.cw
            long r6 = r11.xt
            long r4 = r4 - r6
            long r9 = r9 - r4
            int r11 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r11 != 0) goto L28
            r9 = 0
            byte[] r8 = java.util.Arrays.copyOfRange(r8, r9, r1)
            return r8
        L28:
            java.lang.SecurityException r8 = new java.lang.SecurityException
            java.lang.String r9 = "APK content size did not verify"
            r8.<init>(r9)
            throw r8
        L30:
            java.lang.SecurityException r9 = new java.lang.SecurityException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "Verity digest size is wrong: "
            r10.<init>(r11)
            int r8 = r8.length
            r10.append(r8)
            java.lang.String r8 = r10.toString()
            r9.<init>(r8)
            throw r9
    }

    private static byte[][] j(int[] r28, com.bytedance.pangle.tl.qv[] r29) throws java.security.DigestException {
            r0 = r28
            r1 = r29
            int r2 = r1.length
            r5 = 0
            r6 = 0
            r7 = 0
        L9:
            if (r6 >= r2) goto L19
            r9 = r1[r6]
            long r9 = r9.j()
            long r9 = j(r9)
            long r7 = r7 + r9
            int r6 = r6 + 1
            goto L9
        L19:
            r9 = 2097151(0x1fffff, double:1.0361303E-317)
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 >= 0) goto L175
            int r2 = (int) r7
            int r6 = r0.length
            byte[][] r6 = new byte[r6][]
            r7 = 0
        L25:
            int r8 = r0.length
            r9 = 5
            r10 = 1
            if (r7 >= r8) goto L41
            r8 = r0[r7]
            int r8 = up(r8)
            int r8 = r8 * r2
            int r8 = r8 + r9
            byte[] r8 = new byte[r8]
            r9 = 90
            r8[r5] = r9
            j(r2, r8, r10)
            r6[r7] = r8
            int r7 = r7 + 1
            goto L25
        L41:
            byte[] r2 = new byte[r9]
            r7 = -91
            r2[r5] = r7
            int r7 = r0.length
            java.security.MessageDigest[] r8 = new java.security.MessageDigest[r7]
            r11 = 0
        L4b:
            int r12 = r0.length
            java.lang.String r13 = " digest not supported"
            if (r11 >= r12) goto L75
            r12 = r0[r11]
            java.lang.String r12 = xt(r12)
            java.security.MessageDigest r14 = java.security.MessageDigest.getInstance(r12)     // Catch: java.security.NoSuchAlgorithmException -> L5f
            r8[r11] = r14     // Catch: java.security.NoSuchAlgorithmException -> L5f
            int r11 = r11 + 1
            goto L4b
        L5f:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r12)
            r2.append(r13)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2, r0)
            throw r1
        L75:
            com.bytedance.pangle.tl.m$j r11 = new com.bytedance.pangle.tl.m$j
            r11.<init>(r8)
            int r12 = r1.length
            r14 = 0
            r15 = 0
            r16 = 0
        L7f:
            if (r14 >= r12) goto L140
            r17 = 0
            r3 = r1[r14]
            long r19 = r3.j()
            r21 = r19
            r19 = r6
            r5 = r21
            r4 = r16
            r21 = r17
        L93:
            int r20 = (r5 > r17 ? 1 : (r5 == r17 ? 0 : -1))
            if (r20 <= 0) goto L12d
            r20 = 5
            r9 = 1048576(0x100000, double:5.180654E-318)
            long r9 = java.lang.Math.min(r5, r9)
            int r10 = (int) r9
            r9 = 1
            j(r10, r2, r9)
            r9 = 0
        La6:
            if (r9 >= r7) goto Lb2
            r1 = r8[r9]
            r1.update(r2)
            int r9 = r9 + 1
            r1 = r29
            goto La6
        Lb2:
            r23 = r2
            r1 = r21
            r3.j(r11, r1, r10)     // Catch: java.io.IOException -> L110
            r21 = r1
            r9 = 0
        Lbc:
            int r1 = r0.length
            if (r9 >= r1) goto Lfe
            r1 = r0[r9]
            r2 = r19[r9]
            int r1 = up(r1)
            r24 = r3
            r3 = r8[r9]
            int r25 = r4 * r1
            r26 = r5
            int r5 = r25 + 5
            int r2 = r3.digest(r2, r5, r1)
            if (r2 != r1) goto Lde
            int r9 = r9 + 1
            r3 = r24
            r5 = r26
            goto Lbc
        Lde:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "Unexpected output size of "
            r1.<init>(r4)
            java.lang.String r3 = r3.getAlgorithm()
            r1.append(r3)
            java.lang.String r3 = " digest: "
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        Lfe:
            r24 = r3
            r26 = r5
            long r1 = (long) r10
            long r21 = r21 + r1
            long r5 = r26 - r1
            int r4 = r4 + 1
            r1 = r29
            r2 = r23
            r9 = 5
            r10 = 1
            goto L93
        L110:
            r0 = move-exception
            java.security.DigestException r1 = new java.security.DigestException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Failed to digest chunk #"
            r2.<init>(r3)
            r2.append(r4)
            java.lang.String r3 = " of section #"
            r2.append(r3)
            r2.append(r15)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2, r0)
            throw r1
        L12d:
            r23 = r2
            r20 = 5
            int r15 = r15 + 1
            int r14 = r14 + 1
            r1 = r29
            r16 = r4
            r6 = r19
            r5 = 0
            r9 = 5
            r10 = 1
            goto L7f
        L140:
            r19 = r6
            int r1 = r0.length
            byte[][] r1 = new byte[r1][]
            r5 = 0
        L146:
            int r2 = r0.length
            if (r5 >= r2) goto L174
            r2 = r0[r5]
            r3 = r19[r5]
            java.lang.String r2 = xt(r2)
            java.security.MessageDigest r2 = java.security.MessageDigest.getInstance(r2)     // Catch: java.security.NoSuchAlgorithmException -> L15e
            byte[] r2 = r2.digest(r3)
            r1[r5] = r2
            int r5 = r5 + 1
            goto L146
        L15e:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            r3.append(r13)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2, r0)
            throw r1
        L174:
            return r1
        L175:
            java.security.DigestException r0 = new java.security.DigestException
            java.lang.String r1 = "Too many chunks: "
            java.lang.String r2 = java.lang.String.valueOf(r7)
            java.lang.String r1 = r1.concat(r2)
            r0.<init>(r1)
            throw r0
    }

    static android.util.Pair<java.lang.String, ? extends java.security.spec.AlgorithmParameterSpec> r(int r6) {
            r0 = 513(0x201, float:7.19E-43)
            r1 = 0
            if (r6 == r0) goto L7b
            r0 = 514(0x202, float:7.2E-43)
            if (r6 == r0) goto L74
            r0 = 769(0x301, float:1.078E-42)
            if (r6 == r0) goto L6d
            r0 = 1057(0x421, float:1.481E-42)
            if (r6 == r0) goto L66
            r0 = 1059(0x423, float:1.484E-42)
            if (r6 == r0) goto L7b
            r0 = 1061(0x425, float:1.487E-42)
            if (r6 == r0) goto L6d
            switch(r6) {
                case 257: goto L51;
                case 258: goto L3c;
                case 259: goto L66;
                case 260: goto L35;
                default: goto L1c;
            }
        L1c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unknown signature algorithm: 0x"
            r1.<init>(r2)
            long r2 = (long) r6
            java.lang.String r6 = java.lang.Long.toHexString(r2)
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            r0.<init>(r6)
            throw r0
        L35:
            java.lang.String r6 = "SHA512withRSA"
            android.util.Pair r6 = android.util.Pair.create(r6, r1)
            return r6
        L3c:
            java.security.spec.PSSParameterSpec r0 = new java.security.spec.PSSParameterSpec
            java.security.spec.MGF1ParameterSpec r3 = java.security.spec.MGF1ParameterSpec.SHA512
            r4 = 64
            r5 = 1
            java.lang.String r1 = "SHA-512"
            java.lang.String r2 = "MGF1"
            r0.<init>(r1, r2, r3, r4, r5)
            java.lang.String r6 = "SHA512withRSA/PSS"
            android.util.Pair r6 = android.util.Pair.create(r6, r0)
            return r6
        L51:
            java.security.spec.PSSParameterSpec r0 = new java.security.spec.PSSParameterSpec
            java.security.spec.MGF1ParameterSpec r3 = java.security.spec.MGF1ParameterSpec.SHA256
            r4 = 32
            r5 = 1
            java.lang.String r1 = "SHA-256"
            java.lang.String r2 = "MGF1"
            r0.<init>(r1, r2, r3, r4, r5)
            java.lang.String r6 = "SHA256withRSA/PSS"
            android.util.Pair r6 = android.util.Pair.create(r6, r0)
            return r6
        L66:
            java.lang.String r6 = "SHA256withRSA"
            android.util.Pair r6 = android.util.Pair.create(r6, r1)
            return r6
        L6d:
            java.lang.String r6 = "SHA256withDSA"
            android.util.Pair r6 = android.util.Pair.create(r6, r1)
            return r6
        L74:
            java.lang.String r6 = "SHA512withECDSA"
            android.util.Pair r6 = android.util.Pair.create(r6, r1)
            return r6
        L7b:
            java.lang.String r6 = "SHA256withECDSA"
            android.util.Pair r6 = android.util.Pair.create(r6, r1)
            return r6
    }

    private static int up(int r2) {
            r0 = 1
            if (r2 == r0) goto L1d
            r0 = 2
            if (r2 == r0) goto L1a
            r0 = 3
            if (r2 != r0) goto La
            goto L1d
        La:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unknown content digest algorthm: "
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r2 = r1.concat(r2)
            r0.<init>(r2)
            throw r0
        L1a:
            r2 = 64
            return r2
        L1d:
            r2 = 32
            return r2
    }

    private static int xt(int r6, int r7) {
            r0 = -1
            r1 = 0
            java.lang.String r2 = "Unknown digestAlgorithm2: "
            r3 = 3
            r4 = 2
            r5 = 1
            if (r6 == r5) goto L4b
            if (r6 == r4) goto L34
            if (r6 != r3) goto L24
            if (r7 == r5) goto L23
            if (r7 == r4) goto L22
            if (r7 != r3) goto L14
            return r1
        L14:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = java.lang.String.valueOf(r7)
            java.lang.String r7 = r2.concat(r7)
            r6.<init>(r7)
            throw r6
        L22:
            return r0
        L23:
            return r5
        L24:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Unknown digestAlgorithm1: "
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r6 = r0.concat(r6)
            r7.<init>(r6)
            throw r7
        L34:
            if (r7 == r5) goto L4a
            if (r7 == r4) goto L49
            if (r7 != r3) goto L3b
            goto L4a
        L3b:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = java.lang.String.valueOf(r7)
            java.lang.String r7 = r2.concat(r7)
            r6.<init>(r7)
            throw r6
        L49:
            return r1
        L4a:
            return r5
        L4b:
            if (r7 == r5) goto L61
            if (r7 == r4) goto L60
            if (r7 != r3) goto L52
            goto L60
        L52:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = java.lang.String.valueOf(r7)
            java.lang.String r7 = r2.concat(r7)
            r6.<init>(r7)
            throw r6
        L60:
            return r0
        L61:
            return r1
    }

    static java.lang.String xt(int r2) {
            r0 = 1
            if (r2 == r0) goto L1d
            r0 = 2
            if (r2 == r0) goto L1a
            r0 = 3
            if (r2 != r0) goto La
            goto L1d
        La:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unknown content digest algorthm: "
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r2 = r1.concat(r2)
            r0.<init>(r2)
            throw r0
        L1a:
            java.lang.String r2 = "SHA-512"
            return r2
        L1d:
            java.lang.String r2 = "SHA-256"
            return r2
    }

    static byte[] xt(java.nio.ByteBuffer r4) throws java.io.IOException {
            int r0 = r4.getInt()
            if (r0 < 0) goto L32
            int r1 = r4.remaining()
            if (r0 > r1) goto L12
            byte[] r0 = new byte[r0]
            r4.get(r0)
            return r0
        L12:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Underflow while reading length-prefixed value. Length: "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = ", available: "
            r2.append(r0)
            int r4 = r4.remaining()
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            r1.<init>(r4)
            throw r1
        L32:
            java.io.IOException r4 = new java.io.IOException
            java.lang.String r0 = "Negative length"
            r4.<init>(r0)
            throw r4
    }
}

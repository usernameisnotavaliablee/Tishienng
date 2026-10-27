package com.bytedance.pangle.tl;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
abstract class ae {
    private static final byte[] j = null;

    /* renamed from: com.bytedance.pangle.tl.ae$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    static class j {
        public final java.nio.ByteBuffer j;
        public final byte[] xt;

        j(java.nio.ByteBuffer r1, byte[] r2) {
                r0 = this;
                r0.<init>()
                r0.j = r1
                r0.xt = r2
                return
        }
    }

    private static class xt implements com.bytedance.pangle.tl.oq {
        private final java.security.MessageDigest cw;
        private int j;
        private final byte[] r;
        private final byte[] up;
        private final java.nio.ByteBuffer xt;

        private xt(byte[] r2, java.nio.ByteBuffer r3) throws java.security.NoSuchAlgorithmException {
                r1 = this;
                r1.<init>()
                r0 = 32
                byte[] r0 = new byte[r0]
                r1.r = r0
                r1.up = r2
                java.nio.ByteBuffer r3 = r3.slice()
                r1.xt = r3
                java.lang.String r3 = "SHA-256"
                java.security.MessageDigest r3 = java.security.MessageDigest.getInstance(r3)
                r1.cw = r3
                r3.update(r2)
                r2 = 0
                r1.j = r2
                return
        }

        /* synthetic */ xt(byte[] r1, java.nio.ByteBuffer r2, com.bytedance.pangle.tl.ae.AnonymousClass1 r3) throws java.security.NoSuchAlgorithmException {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        static /* synthetic */ void j(com.bytedance.pangle.tl.ae.xt r0) {
                r0.xt()
                return
        }

        private void xt() {
                r2 = this;
                java.nio.ByteBuffer r0 = r2.xt
                int r0 = r0.position()
                int r0 = r0 % 4096
                if (r0 != 0) goto Lb
                return
            Lb:
                java.nio.ByteBuffer r1 = r2.xt
                int r0 = 4096 - r0
                java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
                r1.put(r0)
                return
        }

        public void j() throws java.security.DigestException {
                r3 = this;
                int r0 = r3.j
                if (r0 != 0) goto L5
                return
            L5:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "Buffer is not empty: "
                r1.<init>(r2)
                int r2 = r3.j
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
        }

        @Override // com.bytedance.pangle.tl.oq
        public void j(java.nio.ByteBuffer r6) throws java.security.DigestException {
                r5 = this;
                r6.position()
                int r0 = r6.remaining()
            L7:
                if (r0 <= 0) goto L42
                int r1 = r5.j
                r2 = 4096(0x1000, float:5.74E-42)
                int r1 = 4096 - r1
                int r1 = java.lang.Math.min(r0, r1)
                int r3 = r6.position()
                int r3 = r3 + r1
                r6.limit(r3)
                java.security.MessageDigest r3 = r5.cw
                r3.update(r6)
                int r0 = r0 - r1
                int r3 = r5.j
                int r3 = r3 + r1
                r5.j = r3
                if (r3 != r2) goto L7
                java.security.MessageDigest r1 = r5.cw
                byte[] r2 = r5.r
                int r3 = r2.length
                r4 = 0
                r1.digest(r2, r4, r3)
                java.nio.ByteBuffer r1 = r5.xt
                byte[] r2 = r5.r
                r1.put(r2)
                java.security.MessageDigest r1 = r5.cw
                byte[] r2 = r5.up
                r1.update(r2)
                r5.j = r4
                goto L7
            L42:
                return
        }
    }

    static {
            r0 = 8
            byte[] r0 = new byte[r0]
            com.bytedance.pangle.tl.ae.j = r0
            return
    }

    public ae() {
            r1 = this;
            r1.<init>()
            return
    }

    public static int j(long r4) {
            int r0 = (int) r4
            long r1 = (long) r0
            int r3 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r3 != 0) goto L7
            return r0
        L7:
            java.lang.ArithmeticException r4 = new java.lang.ArithmeticException
            java.lang.String r5 = "integer overflow"
            r4.<init>(r5)
            throw r4
    }

    private static long j(long r2, long r4) {
            long r2 = r2 + r4
            r0 = 1
            long r2 = r2 - r0
            long r2 = r2 / r4
            return r2
    }

    static com.bytedance.pangle.tl.ae.j j(java.io.RandomAccessFile r10, com.bytedance.pangle.tl.jy r11, com.bytedance.pangle.tl.g r12) throws java.io.IOException, java.lang.SecurityException, java.security.NoSuchAlgorithmException, java.security.DigestException {
            long r0 = r11.cw
            long r2 = r11.xt
            long r0 = r0 - r2
            long r2 = r10.length()
            long r2 = r2 - r0
            int[] r0 = xt(r2)
            int r1 = r0.length
            int r1 = r1 + (-1)
            r0 = r0[r1]
            int r1 = r0 + 4096
            java.nio.ByteBuffer r12 = r12.j(r1)
            java.nio.ByteOrder r2 = java.nio.ByteOrder.LITTLE_ENDIAN
            r12.order(r2)
            r3 = 0
            java.nio.ByteBuffer r6 = j(r12, r3, r0)
            int r3 = r0 + 64
            java.nio.ByteBuffer r8 = j(r12, r0, r3)
            java.nio.ByteBuffer r9 = j(r12, r3, r1)
            r0 = 32
            byte[] r0 = new byte[r0]
            java.nio.ByteBuffer r7 = java.nio.ByteBuffer.wrap(r0)
            r7.order(r2)
            r4 = r10
            r5 = r11
            j(r4, r5, r6, r7, r8, r9)
            int r10 = r9.limit()
            int r3 = r3 + r10
            r12.position(r3)
            int r10 = r9.limit()
            int r10 = r10 + 68
            r12.putInt(r10)
            r12.flip()
            com.bytedance.pangle.tl.ae$j r10 = new com.bytedance.pangle.tl.ae$j
            r10.<init>(r12, r0)
            return r10
    }

    private static java.nio.ByteBuffer j(java.nio.ByteBuffer r1, int r2, int r3) {
            java.nio.ByteBuffer r1 = r1.duplicate()
            r0 = 0
            r1.position(r0)
            r1.limit(r3)
            r1.position(r2)
            java.nio.ByteBuffer r1 = r1.slice()
            return r1
    }

    private static java.nio.ByteBuffer j(java.nio.ByteBuffer r2, long r3, int r5, byte[] r6) {
            int r5 = r6.length
            r0 = 8
            if (r5 != r0) goto L41
            java.lang.String r5 = "TrueBrew"
            byte[] r5 = r5.getBytes()
            r2.put(r5)
            r5 = 1
            r2.put(r5)
            r0 = 0
            r2.put(r0)
            r1 = 12
            r2.put(r1)
            r1 = 7
            r2.put(r1)
            r2.putShort(r5)
            r2.putShort(r5)
            r2.putInt(r0)
            r2.putInt(r0)
            r2.putLong(r3)
            r3 = 2
            r2.put(r3)
            r2.put(r0)
            r2.put(r6)
            r3 = 22
            j(r2, r3)
            r2.flip()
            return r2
        L41:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "salt is not 8 bytes long"
            r2.<init>(r3)
            throw r2
    }

    private static java.nio.ByteBuffer j(java.nio.ByteBuffer r1, long r2, long r4, long r6) {
            r0 = 24
            r1.putInt(r0)
            r0 = 1
            r1.putShort(r0)
            r0 = 2
            j(r1, r0)
            r1.putLong(r2)
            r1.putLong(r4)
            r4 = 20
            r1.putInt(r4)
            r1.putShort(r0)
            j(r1, r0)
            r4 = 16
            long r6 = r6 + r4
            r1.putLong(r6)
            int r2 = j(r2)
            r1.putInt(r2)
            r2 = 4
            j(r1, r2)
            r1.flip()
            return r1
    }

    private static void j(com.bytedance.pangle.tl.jy r9) {
            long r0 = r9.xt
            r2 = 4096(0x1000, double:2.0237E-320)
            long r4 = r0 % r2
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L2e
            long r4 = r9.cw
            long r4 = r4 - r0
            long r4 = r4 % r2
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L15
            return
        L15:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Size of APK Signing Block is not a multiple of 4096: "
            r1.<init>(r2)
            long r2 = r9.cw
            long r4 = r9.xt
            long r2 = r2 - r4
            r1.append(r2)
            java.lang.String r9 = r1.toString()
            r0.<init>(r9)
            throw r0
        L2e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "APK Signing Block does not start at the page  boundary: "
            r1.<init>(r2)
            long r2 = r9.xt
            r1.append(r2)
            java.lang.String r9 = r1.toString()
            r0.<init>(r9)
            throw r0
    }

    private static void j(com.bytedance.pangle.tl.oq r8, com.bytedance.pangle.tl.qv r9, int r10) throws java.io.IOException, java.security.DigestException {
            long r0 = r9.j()
            r2 = 0
            r4 = r2
        L7:
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 <= 0) goto L18
            long r6 = (long) r10
            long r6 = java.lang.Math.min(r0, r6)
            int r7 = (int) r6
            r9.j(r8, r4, r7)
            long r6 = (long) r7
            long r4 = r4 + r6
            long r0 = r0 - r6
            goto L7
        L18:
            return
    }

    private static void j(java.io.RandomAccessFile r9, com.bytedance.pangle.tl.jy r10, java.nio.ByteBuffer r11, java.nio.ByteBuffer r12, java.nio.ByteBuffer r13, java.nio.ByteBuffer r14) throws java.io.IOException, java.security.NoSuchAlgorithmException, java.security.DigestException {
            j(r10)
            long r5 = r10.cw
            long r7 = r10.xt
            long r5 = r5 - r7
            long r7 = r9.length()
            long r7 = r7 - r5
            int[] r7 = xt(r7)
            if (r11 == 0) goto L21
            byte[] r8 = com.bytedance.pangle.tl.ae.j
            byte[] r1 = j(r9, r10, r8, r7, r11)
            if (r12 == 0) goto L21
            r12.put(r1)
            r12.flip()
        L21:
            if (r13 == 0) goto L34
            java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN
            r13.order(r1)
            long r1 = r9.length()
            int r7 = r7.length
            int r7 = r7 + (-1)
            byte[] r8 = com.bytedance.pangle.tl.ae.j
            j(r13, r1, r7, r8)
        L34:
            if (r14 == 0) goto L45
            java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN
            r14.order(r1)
            long r1 = r10.xt
            long r7 = r10.r
            r0 = r14
            r3 = r5
            r5 = r7
            j(r0, r1, r3, r5)
        L45:
            return
    }

    private static void j(java.io.RandomAccessFile r11, com.bytedance.pangle.tl.jy r12, byte[] r13, java.nio.ByteBuffer r14) throws java.io.IOException, java.security.NoSuchAlgorithmException, java.security.DigestException {
            com.bytedance.pangle.tl.ae$xt r0 = new com.bytedance.pangle.tl.ae$xt
            r1 = 0
            r0.<init>(r13, r14, r1)
            com.bytedance.pangle.tl.vl r2 = new com.bytedance.pangle.tl.vl
            java.io.FileDescriptor r3 = r11.getFD()
            r4 = 0
            long r6 = r12.xt
            r2.<init>(r3, r4, r6)
            r13 = 1048576(0x100000, float:1.469368E-39)
            j(r0, r2, r13)
            long r1 = r12.r
            r3 = 16
            long r3 = r3 + r1
            com.bytedance.pangle.tl.vl r5 = new com.bytedance.pangle.tl.vl
            java.io.FileDescriptor r6 = r11.getFD()
            long r7 = r12.cw
            long r9 = r3 - r7
            r5.<init>(r6, r7, r9)
            j(r0, r5, r13)
            r14 = 4
            java.nio.ByteBuffer r14 = java.nio.ByteBuffer.allocate(r14)
            java.nio.ByteOrder r3 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r14 = r14.order(r3)
            long r3 = r12.xt
            int r12 = j(r3)
            r14.putInt(r12)
            r14.flip()
            r0.j(r14)
            r3 = 20
            long r7 = r1 + r3
            com.bytedance.pangle.tl.vl r5 = new com.bytedance.pangle.tl.vl
            java.io.FileDescriptor r6 = r11.getFD()
            long r1 = r11.length()
            long r9 = r1 - r7
            r5.<init>(r6, r7, r9)
            j(r0, r5, r13)
            long r11 = r11.length()
            r13 = 4096(0x1000, double:2.0237E-320)
            long r11 = r11 % r13
            int r12 = (int) r11
            if (r12 == 0) goto L70
            int r11 = 4096 - r12
            java.nio.ByteBuffer r11 = java.nio.ByteBuffer.allocate(r11)
            r0.j(r11)
        L70:
            r0.j()
            com.bytedance.pangle.tl.ae.xt.j(r0)
            return
    }

    private static void j(java.nio.ByteBuffer r1, int r2) {
            int r0 = r1.position()
            int r0 = r0 + r2
            r1.position(r0)
            return
    }

    private static byte[] j(java.io.RandomAccessFile r4, com.bytedance.pangle.tl.jy r5, byte[] r6, int[] r7, java.nio.ByteBuffer r8) throws java.io.IOException, java.security.NoSuchAlgorithmException, java.security.DigestException {
            int r0 = r7.length
            int r0 = r0 + (-2)
            r0 = r7[r0]
            int r1 = r7.length
            int r1 = r1 + (-1)
            r1 = r7[r1]
            java.nio.ByteBuffer r0 = j(r8, r0, r1)
            j(r4, r5, r6, r0)
            int r4 = r7.length
            int r4 = r4 + (-3)
        L14:
            r5 = 4096(0x1000, float:5.74E-42)
            r0 = 0
            if (r4 < 0) goto L43
            int r1 = r4 + 1
            r2 = r7[r1]
            int r3 = r4 + 2
            r3 = r7[r3]
            java.nio.ByteBuffer r2 = j(r8, r2, r3)
            r3 = r7[r4]
            r1 = r7[r1]
            java.nio.ByteBuffer r1 = j(r8, r3, r1)
            com.bytedance.pangle.tl.tl r3 = new com.bytedance.pangle.tl.tl
            r3.<init>(r2)
            com.bytedance.pangle.tl.ae$xt r2 = new com.bytedance.pangle.tl.ae$xt
            r2.<init>(r6, r1, r0)
            j(r2, r3, r5)
            r2.j()
            com.bytedance.pangle.tl.ae.xt.j(r2)
            int r4 = r4 + (-1)
            goto L14
        L43:
            r4 = 32
            byte[] r4 = new byte[r4]
            com.bytedance.pangle.tl.ae$xt r7 = new com.bytedance.pangle.tl.ae$xt
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.wrap(r4)
            r7.<init>(r6, r1, r0)
            r6 = 0
            java.nio.ByteBuffer r5 = j(r8, r6, r5)
            r7.j(r5)
            r7.j()
            return r4
    }

    private static int[] xt(long r5) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            r1 = 4096(0x1000, double:2.0237E-320)
            long r5 = j(r5, r1)
            r3 = 32
            long r5 = r5 * r3
            long r3 = j(r5, r1)
            long r3 = r3 * r1
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r0.add(r3)
            int r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r3 <= 0) goto L21
            goto L5
        L21:
            int r5 = r0.size()
            int r5 = r5 + 1
            int[] r5 = new int[r5]
            r6 = 0
            r5[r6] = r6
        L2c:
            int r1 = r0.size()
            if (r6 >= r1) goto L50
            int r1 = r6 + 1
            r2 = r5[r6]
            int r3 = r0.size()
            int r3 = r3 - r6
            int r3 = r3 + (-1)
            java.lang.Object r6 = r0.get(r3)
            java.lang.Long r6 = (java.lang.Long) r6
            long r3 = r6.longValue()
            int r6 = j(r3)
            int r2 = r2 + r6
            r5[r1] = r2
            r6 = r1
            goto L2c
        L50:
            return r5
    }
}

package ms.bz.bd.c.Pgl;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class pblc {

    public static class pblb extends java.lang.Exception {
        public pblb(java.lang.String r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }
    }

    static final class pgla<A, B> {
        private final A a;
        private final B b;

        private pgla(java.nio.ByteBuffer r1, java.lang.Long r2) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r2
                return
        }

        public static ms.bz.bd.c.Pgl.pblc.pgla b(java.nio.ByteBuffer r1, java.lang.Long r2) {
                ms.bz.bd.c.Pgl.pblc$pgla r0 = new ms.bz.bd.c.Pgl.pblc$pgla
                r0.<init>(r1, r2)
                return r0
        }

        public final A a() {
                r1 = this;
                A r0 = r1.a
                return r0
        }

        public final boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                r1 = 0
                if (r5 != 0) goto L8
                return r1
            L8:
                java.lang.Class r2 = r5.getClass()
                java.lang.Class<ms.bz.bd.c.Pgl.pblc$pgla> r3 = ms.bz.bd.c.Pgl.pblc.pgla.class
                if (r3 == r2) goto L11
                return r1
            L11:
                ms.bz.bd.c.Pgl.pblc$pgla r5 = (ms.bz.bd.c.Pgl.pblc.pgla) r5
                A r2 = r4.a
                if (r2 != 0) goto L1c
                A r2 = r5.a
                if (r2 == 0) goto L25
                return r1
            L1c:
                A r3 = r5.a
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L25
                return r1
            L25:
                B r2 = r4.b
                B r5 = r5.b
                if (r2 != 0) goto L2f
                if (r5 != 0) goto L2e
                return r0
            L2e:
                return r1
            L2f:
                boolean r5 = r2.equals(r5)
                return r5
        }

        public final int hashCode() {
                r3 = this;
                A r0 = r3.a
                r1 = 0
                if (r0 != 0) goto L7
                r0 = 0
                goto Lb
            L7:
                int r0 = r0.hashCode()
            Lb:
                int r0 = r0 + 31
                int r0 = r0 * 31
                B r2 = r3.b
                if (r2 != 0) goto L14
                goto L18
            L14:
                int r1 = r2.hashCode()
            L18:
                int r0 = r0 + r1
                return r0
        }
    }

    public pblc() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.util.HashMap a(java.lang.String r9) {
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.io.RandomAccessFile r2 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> L98
            java.lang.String r7 = "d3c673"
            r3 = 1
            byte[] r8 = new byte[r3]     // Catch: java.lang.Throwable -> L98
            r3 = 0
            r4 = 103(0x67, float:1.44E-43)
            r8[r3] = r4     // Catch: java.lang.Throwable -> L98
            r3 = 16777217(0x1000001, float:2.350989E-38)
            r4 = 0
            r5 = 0
            java.lang.Object r3 = com.volcengine.mobsecBiz.matrix.pgla.a(r3, r4, r5, r7, r8)     // Catch: java.lang.Throwable -> L98
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L98
            r2.<init>(r9, r3)     // Catch: java.lang.Throwable -> L98
            java.nio.channels.FileChannel r9 = r2.getChannel()     // Catch: java.lang.Throwable -> L90
            ms.bz.bd.c.Pgl.pblc$pgla r9 = c(r9)     // Catch: java.lang.Throwable -> L90
            java.lang.Object r9 = r9.a()     // Catch: java.lang.Throwable -> L90
            java.nio.ByteBuffer r9 = (java.nio.ByteBuffer) r9     // Catch: java.lang.Throwable -> L90
            java.util.LinkedHashMap r9 = b(r9)     // Catch: java.lang.Throwable -> L90
            java.util.Set r9 = r9.entrySet()     // Catch: java.lang.Throwable -> L90
            java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Throwable -> L90
        L42:
            boolean r1 = r9.hasNext()     // Catch: java.lang.Throwable -> L90
            if (r1 == 0) goto L92
            java.lang.Object r1 = r9.next()     // Catch: java.lang.Throwable -> L90
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> L90
            if (r1 == 0) goto L42
            java.lang.Object r3 = r1.getKey()     // Catch: java.lang.Throwable -> L90
            if (r3 == 0) goto L42
            java.lang.Object r3 = r1.getKey()     // Catch: java.lang.Throwable -> L90
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.Throwable -> L90
            int r3 = r3.intValue()     // Catch: java.lang.Throwable -> L90
            r4 = 1896449818(0x7109871a, float:6.810044E29)
            if (r3 == r4) goto L42
            java.lang.String r3 = new java.lang.String     // Catch: java.lang.Throwable -> L42
            java.lang.Object r4 = r1.getValue()     // Catch: java.lang.Throwable -> L42
            java.nio.ByteBuffer r4 = (java.nio.ByteBuffer) r4     // Catch: java.lang.Throwable -> L42
            byte[] r5 = r4.array()     // Catch: java.lang.Throwable -> L42
            int r6 = r4.arrayOffset()     // Catch: java.lang.Throwable -> L42
            int r7 = r4.position()     // Catch: java.lang.Throwable -> L42
            int r7 = r7 + r6
            int r4 = r4.limit()     // Catch: java.lang.Throwable -> L42
            int r4 = r4 + r6
            byte[] r4 = java.util.Arrays.copyOfRange(r5, r7, r4)     // Catch: java.lang.Throwable -> L42
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L42
            java.lang.Object r1 = r1.getKey()     // Catch: java.lang.Throwable -> L42
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L42
            r0.put(r1, r3)     // Catch: java.lang.Throwable -> L42
            goto L42
        L90:
            goto L96
        L92:
            r2.close()     // Catch: java.lang.Throwable -> L9e
            goto L9e
        L96:
            r1 = r2
            goto L99
        L98:
        L99:
            if (r1 == 0) goto L9e
            r1.close()     // Catch: java.lang.Throwable -> L9e
        L9e:
            return r0
    }

    public static java.util.LinkedHashMap b(java.nio.ByteBuffer r12) throws ms.bz.bd.c.Pgl.pblc.pblb {
            java.nio.ByteOrder r0 = r12.order()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN
            r2 = 1
            r3 = 0
            if (r0 != r1) goto L154
            int r0 = r12.capacity()
            int r0 = r0 + (-24)
            r1 = 113(0x71, float:1.58E-43)
            r4 = 8
            if (r0 < r4) goto L13c
            r12.capacity()
            int r5 = r12.capacity()
            if (r0 > r5) goto L122
            int r5 = r12.limit()
            int r6 = r12.position()
            r12.position(r3)     // Catch: java.lang.Throwable -> L117
            r12.limit(r0)     // Catch: java.lang.Throwable -> L117
            r12.position(r4)     // Catch: java.lang.Throwable -> L117
            java.nio.ByteBuffer r7 = r12.slice()     // Catch: java.lang.Throwable -> L117
            java.nio.ByteOrder r0 = r12.order()     // Catch: java.lang.Throwable -> L117
            r7.order(r0)     // Catch: java.lang.Throwable -> L117
            r12.position(r3)
            r12.limit(r5)
            r12.position(r6)
            java.util.LinkedHashMap r12 = new java.util.LinkedHashMap
            r12.<init>()
        L49:
            boolean r0 = r7.hasRemaining()
            if (r0 == 0) goto L116
            int r0 = r7.remaining()
            r5 = 36
            if (r0 < r4) goto Lfe
            long r8 = r7.getLong()
            r10 = 4
            int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r0 < 0) goto Le6
            r10 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r0 > 0) goto Le6
            int r0 = (int) r8
            int r5 = r7.position()
            int r5 = r5 + r0
            int r6 = r7.remaining()
            if (r0 > r6) goto Lce
            int r6 = r7.getInt()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            int r0 = r0 + (-4)
            if (r0 < 0) goto Lb4
            int r8 = r7.limit()
            int r9 = r7.position()
            int r0 = r0 + r9
            if (r0 < r9) goto Lae
            if (r0 > r8) goto Lae
            r7.limit(r0)
            java.nio.ByteBuffer r9 = r7.slice()     // Catch: java.lang.Throwable -> La8
            java.nio.ByteOrder r10 = r7.order()     // Catch: java.lang.Throwable -> La8
            r9.order(r10)     // Catch: java.lang.Throwable -> La8
            r7.position(r0)     // Catch: java.lang.Throwable -> La8
            r7.limit(r8)
            r12.put(r6, r9)
            r7.position(r5)
            goto L49
        La8:
            r0 = move-exception
            r12 = r0
            r7.limit(r8)
            throw r12
        Lae:
            java.nio.BufferUnderflowException r12 = new java.nio.BufferUnderflowException
            r12.<init>()
            throw r12
        Lb4:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            byte[] r9 = new byte[r2]
            r0 = 118(0x76, float:1.65E-43)
            r9[r3] = r0
            r6 = 0
            java.lang.String r8 = "5d8fdd"
            r4 = 16777217(0x1000001, float:2.350989E-38)
            r5 = 0
            java.lang.Object r0 = com.volcengine.mobsecBiz.matrix.pgla.a(r4, r5, r6, r8, r9)
            java.lang.String r0 = (java.lang.String) r0
            r12.<init>(r0)
            throw r12
        Lce:
            ms.bz.bd.c.Pgl.pblc$pblb r12 = new ms.bz.bd.c.Pgl.pblc$pblb
            byte[] r9 = new byte[r2]
            r9[r3] = r1
            r6 = 0
            java.lang.String r8 = "8b381f"
            r4 = 16777217(0x1000001, float:2.350989E-38)
            r5 = 0
            java.lang.Object r0 = com.volcengine.mobsecBiz.matrix.pgla.a(r4, r5, r6, r8, r9)
            java.lang.String r0 = (java.lang.String) r0
            r12.<init>(r0)
            throw r12
        Le6:
            ms.bz.bd.c.Pgl.pblc$pblb r12 = new ms.bz.bd.c.Pgl.pblc$pblb
            byte[] r11 = new byte[r2]
            r11[r3] = r5
            r8 = 0
            java.lang.String r10 = "bb5779"
            r6 = 16777217(0x1000001, float:2.350989E-38)
            r7 = 0
            java.lang.Object r0 = com.volcengine.mobsecBiz.matrix.pgla.a(r6, r7, r8, r10, r11)
            java.lang.String r0 = (java.lang.String) r0
            r12.<init>(r0)
            throw r12
        Lfe:
            ms.bz.bd.c.Pgl.pblc$pblb r12 = new ms.bz.bd.c.Pgl.pblc$pblb
            byte[] r11 = new byte[r2]
            r11[r3] = r5
            r8 = 0
            java.lang.String r10 = "c86e94"
            r6 = 16777217(0x1000001, float:2.350989E-38)
            r7 = 0
            java.lang.Object r0 = com.volcengine.mobsecBiz.matrix.pgla.a(r6, r7, r8, r10, r11)
            java.lang.String r0 = (java.lang.String) r0
            r12.<init>(r0)
            throw r12
        L116:
            return r12
        L117:
            r0 = move-exception
            r12.position(r3)
            r12.limit(r5)
            r12.position(r6)
            throw r0
        L122:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            byte[] r9 = new byte[r2]
            r0 = 39
            r9[r3] = r0
            r6 = 0
            java.lang.String r8 = "c6d97c"
            r4 = 16777217(0x1000001, float:2.350989E-38)
            r5 = 0
            java.lang.Object r0 = com.volcengine.mobsecBiz.matrix.pgla.a(r4, r5, r6, r8, r9)
            java.lang.String r0 = (java.lang.String) r0
            r12.<init>(r0)
            throw r12
        L13c:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            byte[] r9 = new byte[r2]
            r9[r3] = r1
            r6 = 0
            java.lang.String r8 = "41f187"
            r4 = 16777217(0x1000001, float:2.350989E-38)
            r5 = 0
            java.lang.Object r0 = com.volcengine.mobsecBiz.matrix.pgla.a(r4, r5, r6, r8, r9)
            java.lang.String r0 = (java.lang.String) r0
            r12.<init>(r0)
            throw r12
        L154:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            byte[] r9 = new byte[r2]
            r0 = 33
            r9[r3] = r0
            r6 = 0
            java.lang.String r8 = "a9f96c"
            r4 = 16777217(0x1000001, float:2.350989E-38)
            r5 = 0
            java.lang.Object r0 = com.volcengine.mobsecBiz.matrix.pgla.a(r4, r5, r6, r8, r9)
            java.lang.String r0 = (java.lang.String) r0
            r12.<init>(r0)
            throw r12
    }

    public static ms.bz.bd.c.Pgl.pblc.pgla<java.nio.ByteBuffer, java.lang.Long> c(java.nio.channels.FileChannel r14) throws java.io.IOException, ms.bz.bd.c.Pgl.pblc.pblb {
            long r0 = r14.size()
            r2 = 2
            r3 = 22
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 < 0) goto L115
            long r0 = r0 - r3
            r3 = 65535(0xffff, double:3.23786E-319)
            long r3 = java.lang.Math.min(r0, r3)
            r5 = 0
            r6 = 0
        L15:
            long r7 = (long) r6
            int r9 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r9 > 0) goto Lfc
            long r7 = r0 - r7
            r9 = 4
            java.nio.ByteBuffer r10 = java.nio.ByteBuffer.allocate(r9)
            r14.position(r7)
            r14.read(r10)
            java.nio.ByteOrder r11 = java.nio.ByteOrder.LITTLE_ENDIAN
            r10.order(r11)
            int r10 = r10.getInt(r5)
            r12 = 101010256(0x6054b50, float:2.506985E-35)
            if (r10 != r12) goto Lf8
            java.nio.ByteBuffer r10 = java.nio.ByteBuffer.allocate(r2)
            r12 = 20
            long r7 = r7 + r12
            r14.position(r7)
            r14.read(r10)
            r10.order(r11)
            short r7 = r10.getShort(r5)
            if (r7 != r6) goto Lf8
            long r0 = (long) r7
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r9)
            r2.order(r11)
            long r3 = r14.size()
            long r3 = r3 - r0
            r0 = 6
            long r3 = r3 - r0
            r14.position(r3)
            r14.read(r2)
            int r0 = r2.getInt(r5)
            long r0 = (long) r0
            r2 = 32
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto Ldd
            r2 = 24
            long r2 = r0 - r2
            r14.position(r2)
            r2 = 24
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r2)
            r14.read(r2)
            r2.order(r11)
            r3 = 8
            long r3 = r2.getLong(r3)
            r6 = 2334950737559900225(0x20676953204b5041, double:1.3968830566012645E-152)
            int r8 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r8 != 0) goto Ldb
            r3 = 16
            long r3 = r2.getLong(r3)
            r6 = 3617552046287187010(0x3234206b636f6c42, double:7.465385175170059E-67)
            int r8 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r8 != 0) goto Ldb
            long r3 = r2.getLong(r5)
            int r2 = r2.capacity()
            long r6 = (long) r2
            int r2 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r2 < 0) goto Ldb
            r6 = 2147483639(0x7ffffff7, double:1.060997891E-314)
            int r2 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r2 > 0) goto Ldb
            r6 = 8
            long r6 = r6 + r3
            int r2 = (int) r6
            long r6 = (long) r2
            long r0 = r0 - r6
            r6 = 0
            int r8 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r8 < 0) goto Ldb
            r14.position(r0)
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r2)
            r14.read(r2)
            r2.order(r11)
            long r5 = r2.getLong(r5)
            int r14 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r14 != 0) goto Ldb
            java.lang.Long r14 = java.lang.Long.valueOf(r0)
            ms.bz.bd.c.Pgl.pblc$pgla r14 = ms.bz.bd.c.Pgl.pblc.pgla.b(r2, r14)
            return r14
        Ldb:
            r14 = 0
            return r14
        Ldd:
            ms.bz.bd.c.Pgl.pblc$pblb r14 = new ms.bz.bd.c.Pgl.pblc$pblb
            r0 = 1
            byte[] r11 = new byte[r0]
            r0 = 42
            r11[r5] = r0
            r8 = 0
            java.lang.String r10 = "b9677d"
            r6 = 16777217(0x1000001, float:2.350989E-38)
            r7 = 0
            java.lang.Object r0 = com.volcengine.mobsecBiz.matrix.pgla.a(r6, r7, r8, r10, r11)
            java.lang.String r0 = (java.lang.String) r0
            r14.<init>(r0)
            throw r14
        Lf8:
            int r6 = r6 + 1
            goto L15
        Lfc:
            java.io.IOException r14 = new java.io.IOException
            byte[] r8 = new byte[r2]
            r8 = {x012e: FILL_ARRAY_DATA , data: [112, 101} // fill-array
            r5 = 0
            java.lang.String r7 = "071727"
            r3 = 16777217(0x1000001, float:2.350989E-38)
            r4 = 0
            java.lang.Object r0 = com.volcengine.mobsecBiz.matrix.pgla.a(r3, r4, r5, r7, r8)
            java.lang.String r0 = (java.lang.String) r0
            r14.<init>(r0)
            throw r14
        L115:
            java.io.IOException r14 = new java.io.IOException
            byte[] r8 = new byte[r2]
            r8 = {x0134: FILL_ARRAY_DATA , data: [121, 106} // fill-array
            r5 = 0
            java.lang.String r7 = "99b892"
            r3 = 16777217(0x1000001, float:2.350989E-38)
            r4 = 0
            java.lang.Object r0 = com.volcengine.mobsecBiz.matrix.pgla.a(r3, r4, r5, r7, r8)
            java.lang.String r0 = (java.lang.String) r0
            r14.<init>(r0)
            throw r14
    }
}

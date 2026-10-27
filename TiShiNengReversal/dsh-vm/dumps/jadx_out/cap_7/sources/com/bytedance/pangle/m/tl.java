package com.bytedance.pangle.m;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class tl implements java.io.Closeable {
    private com.bytedance.pangle.m.tl.xt[] cw;
    private final java.io.FileInputStream j;
    private com.bytedance.pangle.m.tl.cw[] r;
    private final java.util.Map<java.lang.String, com.bytedance.pangle.m.tl.cw> up;
    private com.bytedance.pangle.m.tl.j xt;

    /* renamed from: com.bytedance.pangle.m.tl$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    private static class cw {
        public final int ae;
        public final long cw;
        public final long g;
        public final int j;
        public final long m;
        public final long oq;
        public java.lang.String qv;
        public final long r;
        public final int tl;
        public final long up;
        public final int xt;

        private cw(java.nio.ByteBuffer r3, int r4) throws java.io.IOException {
                r2 = this;
                r2.<init>()
                r0 = 1
                if (r4 == r0) goto L56
                r0 = 2
                if (r4 != r0) goto L46
                int r4 = r3.getInt()
                r2.j = r4
                int r4 = r3.getInt()
                r2.xt = r4
                long r0 = r3.getLong()
                r2.cw = r0
                long r0 = r3.getLong()
                r2.r = r0
                long r0 = r3.getLong()
                r2.up = r0
                long r0 = r3.getLong()
                r2.m = r0
                int r4 = r3.getInt()
                r2.ae = r4
                int r4 = r3.getInt()
                r2.tl = r4
                long r0 = r3.getLong()
                r2.g = r0
                long r3 = r3.getLong()
                r2.oq = r3
                goto L98
            L46:
                java.io.IOException r3 = new java.io.IOException
                java.lang.String r0 = "Unexpected elf class: "
                java.lang.String r4 = java.lang.String.valueOf(r4)
                java.lang.String r4 = r0.concat(r4)
                r3.<init>(r4)
                throw r3
            L56:
                int r4 = r3.getInt()
                r2.j = r4
                int r4 = r3.getInt()
                r2.xt = r4
                int r4 = r3.getInt()
                long r0 = (long) r4
                r2.cw = r0
                int r4 = r3.getInt()
                long r0 = (long) r4
                r2.r = r0
                int r4 = r3.getInt()
                long r0 = (long) r4
                r2.up = r0
                int r4 = r3.getInt()
                long r0 = (long) r4
                r2.m = r0
                int r4 = r3.getInt()
                r2.ae = r4
                int r4 = r3.getInt()
                r2.tl = r4
                int r4 = r3.getInt()
                long r0 = (long) r4
                r2.g = r0
                int r3 = r3.getInt()
                long r3 = (long) r3
                r2.oq = r3
            L98:
                r3 = 0
                r2.qv = r3
                return
        }

        /* synthetic */ cw(java.nio.ByteBuffer r1, int r2, com.bytedance.pangle.m.tl.AnonymousClass1 r3) throws java.io.IOException {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }
    }

    private static class j {
        public final long ae;
        public final short cw;
        public final short g;
        public final byte[] j;
        public final short jy;
        public final long m;
        public final short oq;
        public final short qv;
        public final int r;
        public final int tl;
        public final long up;
        public final short vl;
        public final short ws;
        public final short xt;

        private j(java.nio.channels.FileChannel r10) throws java.io.IOException {
                r9 = this;
                r9.<init>()
                r0 = 16
                byte[] r0 = new byte[r0]
                r9.j = r0
                r1 = 0
                r10.position(r1)
                java.nio.ByteBuffer r1 = java.nio.ByteBuffer.wrap(r0)
                r10.read(r1)
                r1 = 0
                r2 = r0[r1]
                r3 = 127(0x7f, float:1.78E-43)
                r4 = 3
                r5 = 4
                r6 = 2
                r7 = 1
                if (r2 != r3) goto L10d
                r2 = r0[r7]
                r3 = 69
                if (r2 != r3) goto L10d
                r2 = r0[r6]
                r3 = 76
                if (r2 != r3) goto L10d
                r2 = r0[r4]
                r3 = 70
                if (r2 != r3) goto L10d
                r1 = r0[r5]
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r3 = "bad elf class: "
                r2.<init>(r3)
                r3 = r0[r5]
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                com.bytedance.pangle.m.tl.j(r1, r7, r6, r2)
                r1 = 5
                r2 = r0[r1]
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                java.lang.String r4 = "bad elf data encoding: "
                r3.<init>(r4)
                r4 = r0[r1]
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                com.bytedance.pangle.m.tl.j(r2, r7, r6, r3)
                r2 = r0[r5]
                if (r2 != r7) goto L64
                r2 = 36
                goto L66
            L64:
                r2 = 48
            L66:
                java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r2)
                r1 = r0[r1]
                if (r1 != r7) goto L71
                java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN
                goto L73
            L71:
                java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            L73:
                r2.order(r1)
                java.lang.String r1 = "failed to read rest part of ehdr."
                com.bytedance.pangle.m.tl.j(r10, r2, r1)
                short r10 = r2.getShort()
                r9.xt = r10
                short r10 = r2.getShort()
                r9.cw = r10
                int r10 = r2.getInt()
                r9.r = r10
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r3 = "bad elf version: "
                r1.<init>(r3)
                r1.append(r10)
                java.lang.String r1 = r1.toString()
                com.bytedance.pangle.m.tl.j(r10, r7, r7, r1)
                r10 = r0[r5]
                if (r10 == r7) goto Lcd
                if (r10 != r6) goto Lb7
                long r0 = r2.getLong()
                r9.up = r0
                long r0 = r2.getLong()
                r9.m = r0
                long r0 = r2.getLong()
                r9.ae = r0
                goto Le2
            Lb7:
                java.io.IOException r10 = new java.io.IOException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "Unexpected elf class: "
                r1.<init>(r2)
                r0 = r0[r5]
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                r10.<init>(r0)
                throw r10
            Lcd:
                int r10 = r2.getInt()
                long r0 = (long) r10
                r9.up = r0
                int r10 = r2.getInt()
                long r0 = (long) r10
                r9.m = r0
                int r10 = r2.getInt()
                long r0 = (long) r10
                r9.ae = r0
            Le2:
                int r10 = r2.getInt()
                r9.tl = r10
                short r10 = r2.getShort()
                r9.g = r10
                short r10 = r2.getShort()
                r9.oq = r10
                short r10 = r2.getShort()
                r9.qv = r10
                short r10 = r2.getShort()
                r9.vl = r10
                short r10 = r2.getShort()
                r9.jy = r10
                short r10 = r2.getShort()
                r9.ws = r10
                return
            L10d:
                java.io.IOException r10 = new java.io.IOException
                r2 = r0[r1]
                java.lang.Byte r2 = java.lang.Byte.valueOf(r2)
                r3 = r0[r7]
                java.lang.Byte r3 = java.lang.Byte.valueOf(r3)
                r8 = r0[r6]
                java.lang.Byte r8 = java.lang.Byte.valueOf(r8)
                r0 = r0[r4]
                java.lang.Byte r0 = java.lang.Byte.valueOf(r0)
                java.lang.Object[] r5 = new java.lang.Object[r5]
                r5[r1] = r2
                r5[r7] = r3
                r5[r6] = r8
                r5[r4] = r0
                java.lang.String r0 = "bad elf magic: %x %x %x %x."
                java.lang.String r0 = java.lang.String.format(r0, r5)
                r10.<init>(r0)
                throw r10
        }

        /* synthetic */ j(java.nio.channels.FileChannel r1, com.bytedance.pangle.m.tl.AnonymousClass1 r2) throws java.io.IOException {
                r0 = this;
                r0.<init>(r1)
                return
        }
    }

    private static class xt {
        public final long ae;
        public final long cw;
        public final int j;
        public final long m;
        public final long r;
        public final long tl;
        public final long up;
        public final int xt;

        private xt(java.nio.ByteBuffer r3, int r4) throws java.io.IOException {
                r2 = this;
                r2.<init>()
                r0 = 1
                if (r4 == r0) goto L4a
                r0 = 2
                if (r4 != r0) goto L3a
                int r4 = r3.getInt()
                r2.j = r4
                int r4 = r3.getInt()
                r2.xt = r4
                long r0 = r3.getLong()
                r2.cw = r0
                long r0 = r3.getLong()
                r2.r = r0
                long r0 = r3.getLong()
                r2.up = r0
                long r0 = r3.getLong()
                r2.m = r0
                long r0 = r3.getLong()
                r2.ae = r0
                long r3 = r3.getLong()
                r2.tl = r3
                return
            L3a:
                java.io.IOException r3 = new java.io.IOException
                java.lang.String r0 = "Unexpected elf class: "
                java.lang.String r4 = java.lang.String.valueOf(r4)
                java.lang.String r4 = r0.concat(r4)
                r3.<init>(r4)
                throw r3
            L4a:
                int r4 = r3.getInt()
                r2.j = r4
                int r4 = r3.getInt()
                long r0 = (long) r4
                r2.cw = r0
                int r4 = r3.getInt()
                long r0 = (long) r4
                r2.r = r0
                int r4 = r3.getInt()
                long r0 = (long) r4
                r2.up = r0
                int r4 = r3.getInt()
                long r0 = (long) r4
                r2.m = r0
                int r4 = r3.getInt()
                long r0 = (long) r4
                r2.ae = r0
                int r4 = r3.getInt()
                r2.xt = r4
                int r3 = r3.getInt()
                long r3 = (long) r3
                r2.tl = r3
                return
        }

        /* synthetic */ xt(java.nio.ByteBuffer r1, int r2, com.bytedance.pangle.m.tl.AnonymousClass1 r3) throws java.io.IOException {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }
    }

    private tl(java.io.File r9) throws java.io.IOException {
            r8 = this;
            r8.<init>()
            r0 = 0
            r8.xt = r0
            r8.cw = r0
            r8.r = r0
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r8.up = r1
            java.io.FileInputStream r1 = new java.io.FileInputStream
            r1.<init>(r9)
            r8.j = r1
            java.nio.channels.FileChannel r9 = r1.getChannel()
            com.bytedance.pangle.m.tl$j r1 = new com.bytedance.pangle.m.tl$j
            r1.<init>(r9, r0)
            r8.xt = r1
            r1 = 128(0x80, float:1.8E-43)
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r1)
            com.bytedance.pangle.m.tl$j r2 = r8.xt
            short r2 = r2.oq
            r1.limit(r2)
            com.bytedance.pangle.m.tl$j r2 = r8.xt
            byte[] r2 = r2.j
            r3 = 5
            r2 = r2[r3]
            r3 = 1
            if (r2 != r3) goto L3d
            java.nio.ByteOrder r2 = java.nio.ByteOrder.LITTLE_ENDIAN
            goto L3f
        L3d:
            java.nio.ByteOrder r2 = java.nio.ByteOrder.BIG_ENDIAN
        L3f:
            r1.order(r2)
            com.bytedance.pangle.m.tl$j r2 = r8.xt
            long r2 = r2.m
            r9.position(r2)
            com.bytedance.pangle.m.tl$j r2 = r8.xt
            short r2 = r2.qv
            com.bytedance.pangle.m.tl$xt[] r2 = new com.bytedance.pangle.m.tl.xt[r2]
            r8.cw = r2
            r2 = 0
            r3 = 0
        L53:
            com.bytedance.pangle.m.tl$xt[] r4 = r8.cw
            int r4 = r4.length
            r5 = 4
            if (r3 >= r4) goto L70
            java.lang.String r4 = "failed to read phdr."
            xt(r9, r1, r4)
            com.bytedance.pangle.m.tl$xt[] r4 = r8.cw
            com.bytedance.pangle.m.tl$xt r6 = new com.bytedance.pangle.m.tl$xt
            com.bytedance.pangle.m.tl$j r7 = r8.xt
            byte[] r7 = r7.j
            r5 = r7[r5]
            r6.<init>(r1, r5, r0)
            r4[r3] = r6
            int r3 = r3 + 1
            goto L53
        L70:
            com.bytedance.pangle.m.tl$j r3 = r8.xt
            long r3 = r3.ae
            r9.position(r3)
            com.bytedance.pangle.m.tl$j r3 = r8.xt
            short r3 = r3.vl
            r1.limit(r3)
            com.bytedance.pangle.m.tl$j r3 = r8.xt
            short r3 = r3.jy
            com.bytedance.pangle.m.tl$cw[] r3 = new com.bytedance.pangle.m.tl.cw[r3]
            r8.r = r3
            r3 = 0
        L87:
            com.bytedance.pangle.m.tl$cw[] r4 = r8.r
            int r6 = r4.length
            if (r3 >= r6) goto La3
            java.lang.String r4 = "failed to read shdr."
            xt(r9, r1, r4)
            com.bytedance.pangle.m.tl$cw[] r4 = r8.r
            com.bytedance.pangle.m.tl$cw r6 = new com.bytedance.pangle.m.tl$cw
            com.bytedance.pangle.m.tl$j r7 = r8.xt
            byte[] r7 = r7.j
            r7 = r7[r5]
            r6.<init>(r1, r7, r0)
            r4[r3] = r6
            int r3 = r3 + 1
            goto L87
        La3:
            com.bytedance.pangle.m.tl$j r9 = r8.xt
            short r9 = r9.ws
            if (r9 <= 0) goto Lc9
            r9 = r4[r9]
            java.nio.ByteBuffer r9 = r8.j(r9)
            com.bytedance.pangle.m.tl$cw[] r0 = r8.r
            int r1 = r0.length
        Lb2:
            if (r2 >= r1) goto Lc9
            r3 = r0[r2]
            int r4 = r3.j
            r9.position(r4)
            java.lang.String r4 = j(r9)
            r3.qv = r4
            java.util.Map<java.lang.String, com.bytedance.pangle.m.tl$cw> r5 = r8.up
            r5.put(r4, r3)
            int r2 = r2 + 1
            goto Lb2
        Lc9:
            return
    }

    private static java.lang.String j(java.nio.ByteBuffer r4) {
            byte[] r0 = r4.array()
            int r1 = r4.position()
        L8:
            boolean r2 = r4.hasRemaining()
            if (r2 == 0) goto L20
            int r2 = r4.position()
            r2 = r0[r2]
            if (r2 == 0) goto L20
            int r2 = r4.position()
            int r2 = r2 + 1
            r4.position(r2)
            goto L8
        L20:
            int r2 = r4.position()
            int r2 = r2 + 1
            r4.position(r2)
            java.lang.String r2 = new java.lang.String
            int r4 = r4.position()
            int r4 = r4 - r1
            int r4 = r4 + (-1)
            java.lang.String r3 = "ASCII"
            java.nio.charset.Charset r3 = java.nio.charset.Charset.forName(r3)
            r2.<init>(r0, r1, r4, r3)
            return r2
    }

    private java.nio.ByteBuffer j(com.bytedance.pangle.m.tl.cw r5) throws java.io.IOException {
            r4 = this;
            long r0 = r5.m
            int r1 = (int) r0
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r1)
            java.io.FileInputStream r1 = r4.j
            java.nio.channels.FileChannel r1 = r1.getChannel()
            long r2 = r5.up
            r1.position(r2)
            java.io.FileInputStream r1 = r4.j
            java.nio.channels.FileChannel r1 = r1.getChannel()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "failed to read section: "
            r2.<init>(r3)
            java.lang.String r5 = r5.qv
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            xt(r1, r0, r5)
            return r0
    }

    static /* synthetic */ void j(int r0, int r1, int r2, java.lang.String r3) throws java.io.IOException {
            xt(r0, r1, r2, r3)
            return
    }

    static /* synthetic */ void j(java.nio.channels.FileChannel r0, java.nio.ByteBuffer r1, java.lang.String r2) throws java.io.IOException {
            xt(r0, r1, r2)
            return
    }

    public static boolean j(java.io.File r2) {
            r0 = 0
            com.bytedance.pangle.m.tl r1 = new com.bytedance.pangle.m.tl     // Catch: java.lang.Throwable -> Lb java.io.IOException -> L10
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Lb java.io.IOException -> L10
            com.bytedance.pangle.util.ae.j(r1)
            r2 = 1
            return r2
        Lb:
            r2 = move-exception
            com.bytedance.pangle.util.ae.j(r0)
            throw r2
        L10:
            com.bytedance.pangle.util.ae.j(r0)
            r2 = 0
            return r2
    }

    private static void xt(int r0, int r1, int r2, java.lang.String r3) throws java.io.IOException {
            if (r0 < r1) goto L5
            if (r0 > r2) goto L5
            return
        L5:
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r3)
            throw r0
    }

    private static void xt(java.nio.channels.FileChannel r2, java.nio.ByteBuffer r3, java.lang.String r4) throws java.io.IOException {
            r3.rewind()
            int r2 = r2.read(r3)
            int r0 = r3.limit()
            if (r2 != r0) goto L11
            r3.flip()
            return
        L11:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            java.lang.String r4 = " Rest bytes insufficient, expect to read "
            r1.append(r4)
            int r3 = r3.limit()
            r1.append(r3)
            java.lang.String r3 = " bytes but only "
            r1.append(r3)
            r1.append(r2)
            java.lang.String r2 = " bytes were read."
            r1.append(r2)
            java.lang.String r2 = r1.toString()
            r0.<init>(r2)
            throw r0
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r1 = this;
            java.io.FileInputStream r0 = r1.j
            r0.close()
            java.util.Map<java.lang.String, com.bytedance.pangle.m.tl$cw> r0 = r1.up
            r0.clear()
            r0 = 0
            r1.cw = r0
            r1.r = r0
            return
    }
}

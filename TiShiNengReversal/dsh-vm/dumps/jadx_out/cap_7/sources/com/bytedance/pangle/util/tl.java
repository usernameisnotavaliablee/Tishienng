package com.bytedance.pangle.util;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class tl {
    public tl() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.lang.String j(java.io.File r7) throws java.io.IOException {
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r7)
            java.nio.channels.FileChannel r1 = r0.getChannel()
            java.nio.channels.FileChannel$MapMode r2 = java.nio.channels.FileChannel.MapMode.READ_ONLY
            r3 = 0
            long r5 = r1.size()
            java.nio.MappedByteBuffer r7 = r1.map(r2, r3, r5)
            java.nio.charset.Charset r2 = java.nio.charset.Charset.defaultCharset()
            java.nio.charset.CharsetDecoder r2 = r2.newDecoder()
            java.nio.ByteBuffer r7 = r7.asReadOnlyBuffer()
            java.nio.CharBuffer r7 = r2.decode(r7)
            java.lang.String r7 = r7.toString()
            r1.close()
            r0.close()
            return r7
    }

    public static void j(java.io.InputStream r1, java.io.OutputStream r2) throws java.io.IOException {
            r0 = 4096(0x1000, float:5.74E-42)
            j(r1, r2, r0)
            return
    }

    private static void j(java.io.InputStream r0, java.io.OutputStream r1, int r2) throws java.io.IOException {
            if (r0 == 0) goto L16
            if (r1 != 0) goto L5
            goto L16
        L5:
            java.nio.channels.ReadableByteChannel r0 = java.nio.channels.Channels.newChannel(r0)
            java.nio.channels.WritableByteChannel r1 = java.nio.channels.Channels.newChannel(r1)
            j(r0, r1, r2)
            r0.close()
            r1.close()
        L16:
            return
    }

    public static void j(java.lang.String r7, java.lang.String r8) throws java.io.IOException {
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 != 0) goto L6e
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 == 0) goto Ld
            goto L6e
        Ld:
            java.io.File r0 = new java.io.File
            r0.<init>(r7)
            java.io.File r1 = new java.io.File
            r1.<init>(r8)
            boolean r2 = r0.exists()
            if (r2 == 0) goto L6e
            boolean r2 = r0.isFile()
            if (r2 == 0) goto L6e
            boolean r0 = r0.canRead()
            if (r0 != 0) goto L2a
            goto L6e
        L2a:
            java.io.File r0 = r1.getParentFile()
            if (r0 == 0) goto L41
            java.io.File r0 = r1.getParentFile()
            boolean r0 = r0.exists()
            if (r0 != 0) goto L41
            java.io.File r0 = r1.getParentFile()
            r0.mkdirs()
        L41:
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r7)
            java.io.FileOutputStream r7 = new java.io.FileOutputStream
            r7.<init>(r8)
            java.nio.channels.FileChannel r1 = r0.getChannel()
            java.nio.channels.FileChannel r8 = r7.getChannel()
            java.nio.channels.FileChannel$MapMode r2 = java.nio.channels.FileChannel.MapMode.READ_ONLY
            r3 = 0
            long r5 = r1.size()
            java.nio.MappedByteBuffer r2 = r1.map(r2, r3, r5)
            r8.write(r2)
            r1.close()
            r8.close()
            r0.close()
            r7.close()
        L6e:
            return
    }

    private static void j(java.nio.channels.ReadableByteChannel r2, java.nio.channels.WritableByteChannel r3, int r4) throws java.io.IOException {
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.allocateDirect(r4)
        L4:
            int r0 = r2.read(r4)
            r1 = -1
            if (r0 == r1) goto L1c
            r4.flip()
        Le:
            boolean r0 = r4.hasRemaining()
            if (r0 == 0) goto L18
            r3.write(r4)
            goto Le
        L18:
            r4.clear()
            goto L4
        L1c:
            return
    }

    public static boolean j(java.lang.String r1, java.io.File r2, java.lang.StringBuilder r3) {
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch: java.io.IOException -> L1c
            r0.<init>(r2)     // Catch: java.io.IOException -> L1c
            java.nio.channels.FileChannel r2 = r0.getChannel()     // Catch: java.io.IOException -> L1c
            byte[] r1 = r1.getBytes()     // Catch: java.io.IOException -> L1c
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.wrap(r1)     // Catch: java.io.IOException -> L1c
            r2.write(r1)     // Catch: java.io.IOException -> L1c
            r2.close()     // Catch: java.io.IOException -> L1c
            r0.close()     // Catch: java.io.IOException -> L1c
            r1 = 1
            return r1
        L1c:
            r1 = move-exception
            java.lang.String r1 = r1.getMessage()
            r3.append(r1)
            r1 = 0
            return r1
    }
}

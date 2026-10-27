package androidx.multidex;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class ZipUtil {
    private static final int BUFFER_SIZE = 16384;
    private static final int ENDHDR = 22;
    private static final int ENDSIG = 101010256;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class CentralDirectory {
        long offset;
        long size;

        CentralDirectory() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    ZipUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    static long computeCrcOfCentralDir(java.io.RandomAccessFile r9, androidx.multidex.ZipUtil.CentralDirectory r10) throws java.io.IOException {
            java.util.zip.CRC32 r0 = new java.util.zip.CRC32
            r0.<init>()
            long r1 = r10.size
            long r3 = r10.offset
            r9.seek(r3)
            r3 = 16384(0x4000, double:8.095E-320)
            long r5 = java.lang.Math.min(r3, r1)
            int r10 = (int) r5
            r5 = 16384(0x4000, float:2.2959E-41)
            byte[] r5 = new byte[r5]
            r6 = 0
            int r10 = r9.read(r5, r6, r10)
        L1c:
            r7 = -1
            if (r10 == r7) goto L35
            r0.update(r5, r6, r10)
            long r7 = (long) r10
            long r1 = r1 - r7
            r7 = 0
            int r10 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r10 != 0) goto L2b
            goto L35
        L2b:
            long r7 = java.lang.Math.min(r3, r1)
            int r10 = (int) r7
            int r10 = r9.read(r5, r6, r10)
            goto L1c
        L35:
            long r9 = r0.getValue()
            return r9
    }

    static androidx.multidex.ZipUtil.CentralDirectory findCentralDirectory(java.io.RandomAccessFile r8) throws java.io.IOException, java.util.zip.ZipException {
            long r0 = r8.length()
            r2 = 22
            long r2 = r0 - r2
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 < 0) goto L68
            r6 = 65558(0x10016, double:3.239E-319)
            long r0 = r0 - r6
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 >= 0) goto L17
            goto L18
        L17:
            r4 = r0
        L18:
            r0 = 101010256(0x6054b50, float:2.506985E-35)
            int r0 = java.lang.Integer.reverseBytes(r0)
        L1f:
            r8.seek(r2)
            int r1 = r8.readInt()
            if (r1 != r0) goto L58
            r0 = 2
            r8.skipBytes(r0)
            r8.skipBytes(r0)
            r8.skipBytes(r0)
            r8.skipBytes(r0)
            androidx.multidex.ZipUtil$CentralDirectory r0 = new androidx.multidex.ZipUtil$CentralDirectory
            r0.<init>()
            int r1 = r8.readInt()
            int r1 = java.lang.Integer.reverseBytes(r1)
            long r1 = (long) r1
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r3
            r0.size = r1
            int r8 = r8.readInt()
            int r8 = java.lang.Integer.reverseBytes(r8)
            long r1 = (long) r8
            long r1 = r1 & r3
            r0.offset = r1
            return r0
        L58:
            r6 = 1
            long r2 = r2 - r6
            int r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r1 < 0) goto L60
            goto L1f
        L60:
            java.util.zip.ZipException r8 = new java.util.zip.ZipException
            java.lang.String r0 = "End Of Central Directory signature not found"
            r8.<init>(r0)
            throw r8
        L68:
            java.util.zip.ZipException r0 = new java.util.zip.ZipException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "File too short to be a zip file: "
            r1.append(r2)
            long r2 = r8.length()
            r1.append(r2)
            java.lang.String r8 = r1.toString()
            r0.<init>(r8)
            throw r0
    }

    static long getZipCrc(java.io.File r3) throws java.io.IOException {
            java.io.RandomAccessFile r0 = new java.io.RandomAccessFile
            java.lang.String r1 = "r"
            r0.<init>(r3, r1)
            androidx.multidex.ZipUtil$CentralDirectory r3 = findCentralDirectory(r0)     // Catch: java.lang.Throwable -> L13
            long r1 = computeCrcOfCentralDir(r0, r3)     // Catch: java.lang.Throwable -> L13
            r0.close()
            return r1
        L13:
            r3 = move-exception
            r0.close()
            throw r3
    }
}

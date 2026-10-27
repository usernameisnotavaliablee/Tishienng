package xyz.adscope.amps.tool.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class AMPSFileUtils {
    public AMPSFileUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean deleteDirectory(java.io.File r5) {
            r0 = 0
            if (r5 == 0) goto L2b
            boolean r1 = r5.exists()
            if (r1 != 0) goto La
            goto L2b
        La:
            boolean r1 = r5.isDirectory()
            if (r1 == 0) goto L26
            java.io.File[] r1 = r5.listFiles()
            if (r1 == 0) goto L26
            int r2 = r1.length
            r3 = 0
        L18:
            if (r3 >= r2) goto L26
            r4 = r1[r3]
            boolean r4 = deleteDirectory(r4)
            if (r4 != 0) goto L23
            return r0
        L23:
            int r3 = r3 + 1
            goto L18
        L26:
            boolean r5 = r5.delete()
            return r5
        L2b:
            return r0
    }

    public static byte[] fileToByteArray(java.io.File r6) {
            r0 = 0
            if (r6 == 0) goto L62
            boolean r1 = r6.exists()
            if (r1 == 0) goto L62
            boolean r1 = r6.isFile()
            if (r1 != 0) goto L11
            goto L62
        L11:
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L42 java.io.IOException -> L47
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L42 java.io.IOException -> L47
            java.io.ByteArrayOutputStream r6 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L3a java.io.IOException -> L3f
            r6.<init>()     // Catch: java.lang.Throwable -> L3a java.io.IOException -> L3f
            r2 = 1024(0x400, float:1.435E-42)
            byte[] r2 = new byte[r2]     // Catch: java.lang.Throwable -> L2b java.io.IOException -> L2d
        L1f:
            int r3 = r1.read(r2)     // Catch: java.lang.Throwable -> L2b java.io.IOException -> L2d
            r4 = -1
            if (r3 == r4) goto L2f
            r4 = 0
            r6.write(r2, r4, r3)     // Catch: java.lang.Throwable -> L2b java.io.IOException -> L2d
            goto L1f
        L2b:
            r0 = move-exception
            goto L4b
        L2d:
            goto L58
        L2f:
            byte[] r0 = r6.toByteArray()     // Catch: java.lang.Throwable -> L2b java.io.IOException -> L2d
            r1.close()     // Catch: java.io.IOException -> L36
        L36:
            r6.close()     // Catch: java.io.IOException -> L62
            goto L62
        L3a:
            r6 = move-exception
            r5 = r0
            r0 = r6
            r6 = r5
            goto L4b
        L3f:
            r6 = r0
            goto L58
        L42:
            r6 = move-exception
            r1 = r0
            r0 = r6
            r6 = r1
            goto L4b
        L47:
            r6 = r0
            r1 = r6
            goto L58
        L4b:
            if (r1 == 0) goto L52
            r1.close()     // Catch: java.io.IOException -> L51
            goto L52
        L51:
        L52:
            if (r6 == 0) goto L57
            r6.close()     // Catch: java.io.IOException -> L57
        L57:
            throw r0
        L58:
            if (r1 == 0) goto L5f
            r1.close()     // Catch: java.io.IOException -> L5e
            goto L5f
        L5e:
        L5f:
            if (r6 == 0) goto L62
            goto L36
        L62:
            return r0
    }

    public static java.io.File renameFile(java.io.File r2, java.lang.String r3) {
            boolean r0 = r2.exists()
            if (r0 == 0) goto L1a
            boolean r0 = r2.isFile()
            if (r0 != 0) goto Ld
            goto L1a
        Ld:
            java.lang.String r0 = r2.getParent()
            java.io.File r1 = new java.io.File
            r1.<init>(r0, r3)
            r2.renameTo(r1)
            return r1
        L1a:
            r2 = 0
            return r2
    }
}

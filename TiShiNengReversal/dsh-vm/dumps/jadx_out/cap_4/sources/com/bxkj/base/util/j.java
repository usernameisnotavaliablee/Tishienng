package com.bxkj.base.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class j {
    public j() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String a(java.lang.String r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L9
            java.lang.String r2 = ""
            return r2
        L9:
            java.io.File r0 = new java.io.File
            r0.<init>(r2)
            boolean r1 = r0.exists()
            if (r1 != 0) goto L17
            r0.mkdirs()
        L17:
            return r2
    }

    public static java.lang.String b(java.lang.String r0) {
            byte[] r0 = d(r0)
            java.lang.String r0 = cn.bluemobi.dylan.base.utils.b.b(r0)
            return r0
    }

    public static java.lang.String c(android.content.Context r8, android.net.Uri r9) {
            r0 = 0
            if (r9 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = r9.getScheme()
            if (r1 != 0) goto Lf
            java.lang.String r8 = r9.getPath()
            return r8
        Lf:
            java.lang.String r2 = "file"
            boolean r2 = r2.equalsIgnoreCase(r1)
            if (r2 == 0) goto L1c
            java.lang.String r8 = r9.getPath()
            return r8
        L1c:
            java.lang.String r2 = "content"
            boolean r1 = r2.equalsIgnoreCase(r1)
            if (r1 == 0) goto L4c
            android.content.ContentResolver r2 = r8.getContentResolver()
            java.lang.String r8 = "_data"
            java.lang.String[] r4 = new java.lang.String[]{r8}
            r6 = 0
            r7 = 0
            r5 = 0
            r3 = r9
            android.database.Cursor r9 = r2.query(r3, r4, r5, r6, r7)
            if (r9 == 0) goto L4c
            boolean r1 = r9.moveToFirst()
            if (r1 == 0) goto L49
            int r8 = r9.getColumnIndex(r8)
            r1 = -1
            if (r8 <= r1) goto L49
            java.lang.String r0 = r9.getString(r8)
        L49:
            r9.close()
        L4c:
            return r0
    }

    public static byte[] d(java.lang.String r9) {
            r1 = 0
            java.io.RandomAccessFile r0 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> L45 java.io.IOException -> L48
            java.lang.String r2 = "r"
            r0.<init>(r9, r2)     // Catch: java.lang.Throwable -> L45 java.io.IOException -> L48
            java.nio.channels.FileChannel r3 = r0.getChannel()     // Catch: java.lang.Throwable -> L45 java.io.IOException -> L48
            java.nio.channels.FileChannel$MapMode r4 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L4e
            long r7 = r3.size()     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L4e
            r5 = 0
            java.nio.MappedByteBuffer r9 = r3.map(r4, r5, r7)     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L4e
            java.nio.MappedByteBuffer r9 = r9.load()     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L4e
            boolean r0 = r9.isLoaded()     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L4e
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L4e
            com.orhanobut.logger.j.c(r0)     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L4e
            long r4 = r3.size()     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L4e
            int r0 = (int) r4     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L4e
            byte[] r0 = new byte[r0]     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L4e
            int r2 = r9.remaining()     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L4e
            if (r2 <= 0) goto L41
            int r2 = r9.remaining()     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L4e
            r4 = 0
            r9.get(r0, r4, r2)     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L4e
            goto L41
        L3d:
            r0 = move-exception
            r9 = r0
            r1 = r3
            goto L4a
        L41:
            r3.close()     // Catch: java.io.IOException -> L44
        L44:
            return r0
        L45:
            r0 = move-exception
            r9 = r0
            goto L4a
        L48:
            r3 = r1
            goto L4e
        L4a:
            r1.close()     // Catch: java.io.IOException -> L4d
        L4d:
            throw r9
        L4e:
            r3.close()     // Catch: java.io.IOException -> L51
        L51:
            return r1
    }
}

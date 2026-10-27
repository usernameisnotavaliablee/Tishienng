package net.sqlcipher.database;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class SQLiteContentHelper {
    public SQLiteContentHelper() {
            r0 = this;
            r0.<init>()
            return
    }

    public static android.content.res.AssetFileDescriptor getBlobColumnAsAssetFile(net.sqlcipher.database.SQLiteDatabase r6, java.lang.String r7, java.lang.String[] r8) throws java.io.FileNotFoundException {
            android.os.MemoryFile r6 = simpleQueryForBlobMemoryFile(r6, r7, r8)     // Catch: java.io.IOException -> L38
            if (r6 == 0) goto L30
            java.lang.Class r7 = r6.getClass()     // Catch: java.io.IOException -> L38
            r8 = 0
            java.lang.String r0 = "getParcelFileDescriptor"
            java.lang.reflect.Method r7 = r7.getDeclaredMethod(r0, r8)     // Catch: java.lang.Exception -> L1d
            r0 = 1
            r7.setAccessible(r0)     // Catch: java.lang.Exception -> L1d
            java.lang.Object r7 = r7.invoke(r6, r8)     // Catch: java.lang.Exception -> L1d
            android.os.ParcelFileDescriptor r7 = (android.os.ParcelFileDescriptor) r7     // Catch: java.lang.Exception -> L1d
            r1 = r7
            goto L23
        L1d:
            r0 = move-exception
            r7 = r0
            r7.toString()     // Catch: java.io.IOException -> L38
            r1 = r8
        L23:
            android.content.res.AssetFileDescriptor r0 = new android.content.res.AssetFileDescriptor     // Catch: java.io.IOException -> L38
            int r6 = r6.length()     // Catch: java.io.IOException -> L38
            long r4 = (long) r6     // Catch: java.io.IOException -> L38
            r2 = 0
            r0.<init>(r1, r2, r4)     // Catch: java.io.IOException -> L38
            return r0
        L30:
            java.io.FileNotFoundException r6 = new java.io.FileNotFoundException     // Catch: java.io.IOException -> L38
            java.lang.String r7 = "No results."
            r6.<init>(r7)     // Catch: java.io.IOException -> L38
            throw r6     // Catch: java.io.IOException -> L38
        L38:
            r0 = move-exception
            r6 = r0
            java.io.FileNotFoundException r7 = new java.io.FileNotFoundException
            java.lang.String r6 = r6.toString()
            r7.<init>(r6)
            throw r7
    }

    private static android.os.MemoryFile simpleQueryForBlobMemoryFile(net.sqlcipher.database.SQLiteDatabase r3, java.lang.String r4, java.lang.String[] r5) throws java.io.IOException {
            net.sqlcipher.Cursor r3 = r3.rawQuery(r4, r5)
            r4 = 0
            if (r3 != 0) goto L8
            return r4
        L8:
            boolean r5 = r3.moveToFirst()     // Catch: java.lang.Throwable -> L2b
            if (r5 != 0) goto L12
            r3.close()
            return r4
        L12:
            r5 = 0
            byte[] r0 = r3.getBlob(r5)     // Catch: java.lang.Throwable -> L2b
            if (r0 != 0) goto L1d
            r3.close()
            return r4
        L1d:
            android.os.MemoryFile r1 = new android.os.MemoryFile     // Catch: java.lang.Throwable -> L2b
            int r2 = r0.length     // Catch: java.lang.Throwable -> L2b
            r1.<init>(r4, r2)     // Catch: java.lang.Throwable -> L2b
            int r4 = r0.length     // Catch: java.lang.Throwable -> L2b
            r1.writeBytes(r0, r5, r5, r4)     // Catch: java.lang.Throwable -> L2b
            r3.close()
            return r1
        L2b:
            r4 = move-exception
            r3.close()
            throw r4
    }
}

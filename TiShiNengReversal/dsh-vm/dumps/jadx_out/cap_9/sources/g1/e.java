package g1;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class e {
    private static final java.lang.String a = "video-cache";

    public e() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean a(java.lang.String r8) {
            java.io.File r0 = new java.io.File
            r0.<init>(r8)
            boolean r1 = r0.exists()
            if (r1 == 0) goto L44
            boolean r1 = r0.isFile()
            r2 = 0
            if (r1 == 0) goto L19
            boolean r8 = r0.delete()
            if (r8 != 0) goto L44
            return r2
        L19:
            java.lang.String[] r1 = r0.list()
            int r3 = r1.length
            r4 = 0
        L1f:
            if (r4 >= r3) goto L3d
            r5 = r1[r4]
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r8)
            java.lang.String r7 = java.io.File.separator
            r6.append(r7)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            a(r5)
            int r4 = r4 + 1
            goto L1f
        L3d:
            boolean r8 = r0.delete()
            if (r8 != 0) goto L44
            return r2
        L44:
            r8 = 1
            return r8
    }

    public static boolean b(java.io.File r5) {
            java.io.File[] r5 = r5.listFiles()
            if (r5 == 0) goto L23
            int r0 = r5.length
            r1 = 0
            r2 = 0
        L9:
            if (r2 >= r0) goto L23
            r3 = r5[r2]
            boolean r4 = r3.isDirectory()
            if (r4 != 0) goto L20
            boolean r4 = r3.exists()
            if (r4 == 0) goto L20
            boolean r3 = r3.delete()
            if (r3 != 0) goto L20
            return r1
        L20:
            int r2 = r2 + 1
            goto L9
        L23:
            r5 = 1
            return r5
    }

    private static java.io.File c(android.content.Context r1, boolean r2) {
            java.lang.String r0 = android.os.Environment.getExternalStorageState()     // Catch: java.lang.NullPointerException -> L5
            goto L7
        L5:
            java.lang.String r0 = ""
        L7:
            if (r2 == 0) goto L16
            java.lang.String r2 = "mounted"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L16
            java.io.File r2 = d(r1)
            goto L17
        L16:
            r2 = 0
        L17:
            if (r2 != 0) goto L1d
            java.io.File r2 = r1.getCacheDir()
        L1d:
            if (r2 != 0) goto L44
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.io.File r0 = r1.getFilesDir()
            java.lang.String r0 = r0.getPath()
            r2.append(r0)
            java.lang.String r1 = r1.getPackageName()
            r2.append(r1)
            java.lang.String r1 = "/cache/"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.io.File r2 = new java.io.File
            r2.<init>(r1)
        L44:
            return r2
    }

    private static java.io.File d(android.content.Context r4) {
            java.io.File r0 = new java.io.File
            java.io.File r1 = new java.io.File
            java.io.File r2 = android.os.Environment.getExternalStorageDirectory()
            java.lang.String r3 = "Android"
            r1.<init>(r2, r3)
            java.lang.String r2 = "data"
            r0.<init>(r1, r2)
            java.io.File r1 = new java.io.File
            java.io.File r2 = new java.io.File
            java.lang.String r4 = r4.getPackageName()
            r2.<init>(r0, r4)
            java.lang.String r4 = "cache"
            r1.<init>(r2, r4)
            boolean r4 = r1.exists()
            if (r4 != 0) goto L30
            boolean r4 = r1.mkdirs()
            if (r4 != 0) goto L30
            r4 = 0
            return r4
        L30:
            return r1
    }

    public static java.io.File e(android.content.Context r2) {
            r0 = 1
            java.io.File r2 = c(r2, r0)
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "video-cache"
            r0.<init>(r2, r1)
            return r0
    }
}

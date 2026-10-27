package com.bytedance.pangle.m;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class ae {

    private static class j extends java.io.File {
        public j(java.io.File r1, java.lang.String r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }
    }

    public ae() {
            r1 = this;
            r1.<init>()
            return
    }

    private static int j(java.lang.String r2) {
            android.content.SharedPreferences r0 = j()
            r1 = 0
            int r2 = r0.getInt(r2, r1)
            return r2
    }

    private static android.content.SharedPreferences j() {
            android.app.Application r0 = com.bytedance.pangle.Zeus.getAppApplication()
            java.lang.String r1 = "plugin-multidex.version"
            r2 = 0
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r2)
            return r0
    }

    public static java.lang.String j(java.lang.String r7, int r8) {
            int r0 = xt(r7, r8)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 1
            r3 = 1
        Lb:
            if (r3 > r0) goto L52
            java.lang.String r4 = ".dex"
            java.lang.String r5 = "classes"
            if (r3 != r2) goto L23
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r5)
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            goto L35
        L23:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r5)
            r6.append(r3)
            r6.append(r4)
            java.lang.String r4 = r6.toString()
        L35:
            java.lang.String r5 = com.bytedance.pangle.up.cw.g(r7, r8)
            java.io.File r6 = new java.io.File
            r6.<init>(r5)
            com.bytedance.pangle.m.ae$j r5 = new com.bytedance.pangle.m.ae$j
            r5.<init>(r6, r4)
            java.lang.String r4 = r5.getAbsolutePath()
            r1.append(r4)
            java.lang.String r4 = ":"
            r1.append(r4)
            int r3 = r3 + 1
            goto Lb
        L52:
            int r7 = r1.length()
            if (r7 == 0) goto L64
            int r7 = r1.length()
            int r7 = r7 - r2
            int r8 = r1.length()
            r1.delete(r7, r8)
        L64:
            java.lang.String r7 = r1.toString()
            return r7
    }

    private static void j(java.io.Closeable r2) {
            r2.close()     // Catch: java.io.IOException -> L4
            return
        L4:
            r2 = move-exception
            java.lang.String r0 = "Zeus/install_pangle"
            java.lang.String r1 = "Plugin-MultiDex Failed to close resource"
            com.bytedance.pangle.log.ZeusLogger.w(r0, r1, r2)
            return
    }

    private static void j(java.io.File r6) {
            boolean r0 = r6.exists()
            if (r0 != 0) goto L7
            goto L58
        L7:
            java.io.File[] r6 = r6.listFiles()
            if (r6 == 0) goto L58
            int r0 = r6.length
            if (r0 != 0) goto L11
            goto L58
        L11:
            int r0 = r6.length
            r1 = 0
        L13:
            if (r1 >= r0) goto L58
            r2 = r6[r1]
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Plugin-MultiDex Trying to delete old file "
            r3.<init>(r4)
            java.lang.String r4 = r2.getPath()
            r3.append(r4)
            java.lang.String r4 = " of size "
            r3.append(r4)
            long r4 = r2.length()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "Zeus/install_pangle"
            com.bytedance.pangle.log.ZeusLogger.i(r4, r3)
            boolean r3 = r2.delete()
            if (r3 != 0) goto L55
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "Plugin-MultiDex Failed to delete old file "
            r3.<init>(r5)
            java.lang.String r2 = r2.getPath()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            com.bytedance.pangle.log.ZeusLogger.w(r4, r2)
        L55:
            int r1 = r1 + 1
            goto L13
        L58:
            return
    }

    public static void j(java.io.File r16, java.lang.String r17, int r18) throws java.io.IOException {
            r1 = r17
            java.lang.String r2 = ".dex"
            java.lang.String r3 = "classes"
            java.lang.String r4 = "Zeus/install_pangle"
            boolean r0 = r16.exists()
            if (r0 == 0) goto L132
            if (r1 == 0) goto L132
            r5 = 0
            java.util.zip.ZipFile r6 = new java.util.zip.ZipFile     // Catch: java.lang.Throwable -> L12d
            r7 = r16
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L12d
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L75
            r5.<init>()     // Catch: java.lang.Throwable -> L75
            java.lang.String r0 = com.bytedance.pangle.up.cw.g(r17, r18)     // Catch: java.lang.Throwable -> L75
            java.io.File r8 = new java.io.File     // Catch: java.lang.Throwable -> L75
            r8.<init>(r0)     // Catch: java.lang.Throwable -> L75
            j(r8)     // Catch: java.lang.Throwable -> L75
            r9 = 1
            r10 = 1
        L2b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L75
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L75
            java.lang.String r11 = ""
            if (r10 != r9) goto L36
            r12 = r11
            goto L3a
        L36:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r10)     // Catch: java.lang.Throwable -> L75
        L3a:
            r0.append(r12)     // Catch: java.lang.Throwable -> L75
            r0.append(r2)     // Catch: java.lang.Throwable -> L75
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L75
            java.util.zip.ZipEntry r12 = r6.getEntry(r0)     // Catch: java.lang.Throwable -> L75
            if (r12 == 0) goto L120
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L75
            r0.<init>()     // Catch: java.lang.Throwable -> L75
            r0.append(r3)     // Catch: java.lang.Throwable -> L75
            if (r10 != r9) goto L55
            goto L59
        L55:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)     // Catch: java.lang.Throwable -> L75
        L59:
            r0.append(r11)     // Catch: java.lang.Throwable -> L75
            r0.append(r2)     // Catch: java.lang.Throwable -> L75
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L75
            com.bytedance.pangle.m.ae$j r11 = new com.bytedance.pangle.m.ae$j     // Catch: java.lang.Throwable -> L75
            r11.<init>(r8, r0)     // Catch: java.lang.Throwable -> L75
            r0 = 0
            r13 = 0
            r14 = 0
        L6b:
            r0 = 3
            if (r13 >= r0) goto Led
            if (r14 != 0) goto Led
            j(r6, r12, r11, r3)     // Catch: java.lang.Throwable -> L75 java.io.IOException -> L79
            r14 = 1
            goto L8f
        L75:
            r0 = move-exception
            r5 = r6
            goto L12e
        L79:
            r0 = move-exception
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L75
            java.lang.String r9 = "Plugin-MultiDex Failed to extract entry from "
            r15.<init>(r9)     // Catch: java.lang.Throwable -> L75
            java.lang.String r9 = r11.getAbsolutePath()     // Catch: java.lang.Throwable -> L75
            r15.append(r9)     // Catch: java.lang.Throwable -> L75
            java.lang.String r9 = r15.toString()     // Catch: java.lang.Throwable -> L75
            com.bytedance.pangle.log.ZeusLogger.w(r4, r9, r0)     // Catch: java.lang.Throwable -> L75
        L8f:
            int r13 = r13 + 1
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L75
            java.lang.String r9 = "Plugin-MultiDex Extraction "
            r0.<init>(r9)     // Catch: java.lang.Throwable -> L75
            if (r14 == 0) goto L9d
            java.lang.String r9 = "succeeded"
            goto L9f
        L9d:
            java.lang.String r9 = "failed"
        L9f:
            r0.append(r9)     // Catch: java.lang.Throwable -> L75
            java.lang.String r9 = " '"
            r0.append(r9)     // Catch: java.lang.Throwable -> L75
            java.lang.String r9 = r11.getAbsolutePath()     // Catch: java.lang.Throwable -> L75
            r0.append(r9)     // Catch: java.lang.Throwable -> L75
            java.lang.String r9 = "': length "
            r0.append(r9)     // Catch: java.lang.Throwable -> L75
            r9 = r2
            r15 = r3
            long r2 = r11.length()     // Catch: java.lang.Throwable -> L75
            r0.append(r2)     // Catch: java.lang.Throwable -> L75
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L75
            com.bytedance.pangle.log.ZeusLogger.i(r4, r0)     // Catch: java.lang.Throwable -> L75
            if (r14 != 0) goto Le8
            r11.delete()     // Catch: java.lang.Throwable -> L75
            boolean r0 = r11.exists()     // Catch: java.lang.Throwable -> L75
            if (r0 == 0) goto Le8
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L75
            java.lang.String r2 = "Plugin-MultiDex Failed to delete corrupted secondary dex '"
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L75
            java.lang.String r2 = r11.getPath()     // Catch: java.lang.Throwable -> L75
            r0.append(r2)     // Catch: java.lang.Throwable -> L75
            java.lang.String r2 = "'"
            r0.append(r2)     // Catch: java.lang.Throwable -> L75
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L75
            com.bytedance.pangle.log.ZeusLogger.w(r4, r0)     // Catch: java.lang.Throwable -> L75
        Le8:
            r2 = r9
            r3 = r15
            r9 = 1
            goto L6b
        Led:
            r9 = r2
            r15 = r3
            if (r14 == 0) goto Lfb
            r5.add(r11)     // Catch: java.lang.Throwable -> L75
            int r10 = r10 + 1
            r2 = r9
            r3 = r15
            r9 = 1
            goto L2b
        Lfb:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L75
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L75
            java.lang.String r2 = "Could not create zip file "
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L75
            java.lang.String r2 = r11.getAbsolutePath()     // Catch: java.lang.Throwable -> L75
            r1.append(r2)     // Catch: java.lang.Throwable -> L75
            java.lang.String r2 = " for secondary dex ("
            r1.append(r2)     // Catch: java.lang.Throwable -> L75
            r1.append(r10)     // Catch: java.lang.Throwable -> L75
            java.lang.String r2 = ")"
            r1.append(r2)     // Catch: java.lang.Throwable -> L75
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L75
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L75
            throw r0     // Catch: java.lang.Throwable -> L75
        L120:
            java.lang.String r0 = r7.getName()     // Catch: java.lang.Throwable -> L75
            r2 = r18
            j(r1, r2, r0, r5)     // Catch: java.lang.Throwable -> L75
            com.bytedance.pangle.util.ae.j(r6)
            return
        L12d:
            r0 = move-exception
        L12e:
            com.bytedance.pangle.util.ae.j(r5)
            throw r0
        L132:
            r7 = r16
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Could not check apk info "
            r1.<init>(r2)
            java.lang.String r2 = r7.getAbsolutePath()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @android.annotation.SuppressLint({"ApplySharedPref"})
    private static void j(java.lang.String r0, int r1, java.lang.String r2, java.util.List<com.bytedance.pangle.m.ae.j> r3) {
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = "-"
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            android.content.SharedPreferences r1 = j()
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = ".dex.number"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            int r2 = r3.size()
            r1.putInt(r0, r2)
            r1.commit()
            return
    }

    private static void j(java.util.zip.ZipFile r3, java.util.zip.ZipEntry r4, com.bytedance.pangle.m.ae.j r5, java.lang.String r6) throws java.io.IOException {
            java.io.InputStream r3 = r3.getInputStream(r4)
            java.lang.String r4 = "tmp-"
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r4 = r4.concat(r6)
            java.lang.String r6 = ".dex"
            java.io.File r0 = r5.getParentFile()
            java.io.File r4 = java.io.File.createTempFile(r4, r6, r0)
            java.io.BufferedOutputStream r6 = new java.io.BufferedOutputStream     // Catch: java.lang.Throwable -> L76
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L76
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L76
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L76
            r0 = 1048576(0x100000, float:1.469368E-39)
            byte[] r0 = new byte[r0]     // Catch: java.lang.Throwable -> L32
        L26:
            int r1 = r3.read(r0)     // Catch: java.lang.Throwable -> L32
            r2 = -1
            if (r1 == r2) goto L34
            r2 = 0
            r6.write(r0, r2, r1)     // Catch: java.lang.Throwable -> L32
            goto L26
        L32:
            r5 = move-exception
            goto La1
        L34:
            r6.flush()     // Catch: java.lang.Throwable -> L76
            r6.close()     // Catch: java.lang.Throwable -> L76
            boolean r6 = r4.setReadOnly()     // Catch: java.lang.Throwable -> L76
            if (r6 == 0) goto L78
            boolean r6 = r4.renameTo(r5)     // Catch: java.lang.Throwable -> L76
            if (r6 == 0) goto L4d
            j(r3)
            r4.delete()
            return
        L4d:
            java.io.IOException r6 = new java.io.IOException     // Catch: java.lang.Throwable -> L76
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L76
            java.lang.String r1 = "Failed to rename \""
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L76
            java.lang.String r1 = r4.getAbsolutePath()     // Catch: java.lang.Throwable -> L76
            r0.append(r1)     // Catch: java.lang.Throwable -> L76
            java.lang.String r1 = "\" to \""
            r0.append(r1)     // Catch: java.lang.Throwable -> L76
            java.lang.String r5 = r5.getAbsolutePath()     // Catch: java.lang.Throwable -> L76
            r0.append(r5)     // Catch: java.lang.Throwable -> L76
            java.lang.String r5 = "\""
            r0.append(r5)     // Catch: java.lang.Throwable -> L76
            java.lang.String r5 = r0.toString()     // Catch: java.lang.Throwable -> L76
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L76
            throw r6     // Catch: java.lang.Throwable -> L76
        L76:
            r5 = move-exception
            goto La8
        L78:
            java.io.IOException r6 = new java.io.IOException     // Catch: java.lang.Throwable -> L76
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L76
            java.lang.String r1 = "Failed to mark readonly \""
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L76
            java.lang.String r1 = r4.getAbsolutePath()     // Catch: java.lang.Throwable -> L76
            r0.append(r1)     // Catch: java.lang.Throwable -> L76
            java.lang.String r1 = "\" (tmp of \""
            r0.append(r1)     // Catch: java.lang.Throwable -> L76
            java.lang.String r5 = r5.getAbsolutePath()     // Catch: java.lang.Throwable -> L76
            r0.append(r5)     // Catch: java.lang.Throwable -> L76
            java.lang.String r5 = "\")"
            r0.append(r5)     // Catch: java.lang.Throwable -> L76
            java.lang.String r5 = r0.toString()     // Catch: java.lang.Throwable -> L76
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L76
            throw r6     // Catch: java.lang.Throwable -> L76
        La1:
            r6.flush()     // Catch: java.lang.Throwable -> L76
            r6.close()     // Catch: java.lang.Throwable -> L76
            throw r5     // Catch: java.lang.Throwable -> L76
        La8:
            j(r3)
            r4.delete()
            throw r5
    }

    private static int xt(java.lang.String r1, int r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = "-"
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = r0.toString()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = ".dex.number"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            int r1 = j(r1)
            return r1
    }
}

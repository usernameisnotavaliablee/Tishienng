package com.kuaishou.weapon.p0;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class r {
    public static java.util.List<java.lang.Integer> b;
    private static com.kuaishou.weapon.p0.r c;
    private static android.app.Application d;
    private static java.util.Random f;
    private static java.util.Map<java.lang.String, com.kuaishou.weapon.p0.s> g;
    private static java.util.Map<java.lang.String, com.kuaishou.weapon.p0.s> h;
    public boolean a;
    private java.lang.String e;

    static {
            java.util.Random r0 = new java.util.Random
            r0.<init>()
            com.kuaishou.weapon.p0.r.f = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            com.kuaishou.weapon.p0.r.g = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            com.kuaishou.weapon.p0.r.h = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.kuaishou.weapon.p0.r.b = r0
            return
    }

    private r() {
            r0 = this;
            r0.<init>()
            return
    }

    private android.util.Pair<java.lang.Boolean, java.lang.String> a(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            java.lang.String r1 = ""
            if (r0 != 0) goto L4a
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto Lf
            goto L4a
        Lf:
            java.io.File r0 = new java.io.File
            r0.<init>(r4)
            boolean r4 = com.kuaishou.weapon.p0.dn.a(r0)
            if (r4 != 0) goto L22
            android.util.Pair r3 = new android.util.Pair
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            r3.<init>(r4, r1)
            return r3
        L22:
            java.lang.String r4 = com.kuaishou.weapon.p0.f.a(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto L34
            android.util.Pair r3 = new android.util.Pair
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            r3.<init>(r4, r1)
            return r3
        L34:
            boolean r3 = r4.equalsIgnoreCase(r3)
            if (r3 != 0) goto L42
            android.util.Pair r3 = new android.util.Pair
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r3.<init>(r0, r4)
            return r3
        L42:
            android.util.Pair r3 = new android.util.Pair
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            r3.<init>(r4, r1)
            return r3
        L4a:
            android.util.Pair r3 = new android.util.Pair
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            r3.<init>(r4, r1)
            return r3
    }

    public static com.kuaishou.weapon.p0.r a() {
            com.kuaishou.weapon.p0.r r0 = com.kuaishou.weapon.p0.r.c
            return r0
    }

    public static com.kuaishou.weapon.p0.r a(android.content.Context r0, boolean r1) {
            com.kuaishou.weapon.p0.r r1 = com.kuaishou.weapon.p0.r.c     // Catch: java.lang.Throwable -> L17
            if (r1 != 0) goto L17
            android.content.Context r0 = r0.getApplicationContext()     // Catch: java.lang.Throwable -> L17
            android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)     // Catch: java.lang.Throwable -> L17
            android.app.Application r0 = (android.app.Application) r0     // Catch: java.lang.Throwable -> L17
            com.kuaishou.weapon.p0.r.d = r0     // Catch: java.lang.Throwable -> L17
            com.kuaishou.weapon.p0.r r0 = new com.kuaishou.weapon.p0.r     // Catch: java.lang.Throwable -> L17
            r0.<init>()     // Catch: java.lang.Throwable -> L17
            com.kuaishou.weapon.p0.r.c = r0     // Catch: java.lang.Throwable -> L17
        L17:
            com.kuaishou.weapon.p0.r r0 = com.kuaishou.weapon.p0.r.c
            return r0
    }

    private void a(com.kuaishou.weapon.p0.s r17, java.lang.String r18, java.lang.String r19, java.util.HashSet<java.lang.String> r20, byte[] r21, java.lang.StringBuilder r22, boolean r23) {
            r16 = this;
            r0 = r17
            r1 = r21
            r2 = r22
            java.lang.String r3 = ".dex"
            java.lang.String r4 = ".so"
            java.lang.String r5 = "armeabi-v7a"
            java.util.zip.ZipInputStream r6 = new java.util.zip.ZipInputStream
            java.io.FileInputStream r7 = new java.io.FileInputStream
            java.lang.String r8 = r0.e
            r7.<init>(r8)
            r6.<init>(r7)
            r8 = 0
        L19:
            java.util.zip.ZipEntry r9 = r6.getNextEntry()     // Catch: java.lang.Throwable -> L53
            if (r9 == 0) goto L16e
            java.lang.String r10 = r9.getName()     // Catch: java.lang.Throwable -> L53
            java.lang.String r11 = "../"
            boolean r11 = r10.contains(r11)     // Catch: java.lang.Throwable -> L53
            if (r11 != 0) goto L71
            java.lang.String r11 = "lib/"
            boolean r11 = r10.startsWith(r11)     // Catch: java.lang.Throwable -> L53
            r12 = 0
            if (r11 == 0) goto Le8
            boolean r11 = r9.isDirectory()     // Catch: java.lang.Throwable -> L53
            if (r11 != 0) goto Le8
            java.lang.String r11 = android.os.Build.CPU_ABI     // Catch: java.lang.Throwable -> L53
            java.lang.String r13 = android.os.Build.CPU_ABI2     // Catch: java.lang.Throwable -> L3f
            goto L40
        L3f:
            r13 = 0
        L40:
            boolean r14 = r10.contains(r11)     // Catch: java.lang.Throwable -> L53
            if (r14 != 0) goto L78
            boolean r14 = android.text.TextUtils.isEmpty(r13)     // Catch: java.lang.Throwable -> L53
            if (r14 != 0) goto L56
            boolean r14 = r10.contains(r13)     // Catch: java.lang.Throwable -> L53
            if (r14 != 0) goto L78
            goto L56
        L53:
            r0 = move-exception
            goto L177
        L56:
            java.lang.String r14 = "armeabi"
            boolean r14 = r10.contains(r14)     // Catch: java.lang.Throwable -> L53
            if (r14 == 0) goto L71
            boolean r11 = r5.equalsIgnoreCase(r11)     // Catch: java.lang.Throwable -> L53
            if (r11 != 0) goto L78
            boolean r11 = android.text.TextUtils.isEmpty(r13)     // Catch: java.lang.Throwable -> L53
            if (r11 != 0) goto L71
            boolean r11 = r5.equalsIgnoreCase(r13)     // Catch: java.lang.Throwable -> L53
            if (r11 == 0) goto L71
            goto L78
        L71:
            r13 = r18
            r7 = r19
            r12 = r20
            goto L19
        L78:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L53
            r11.<init>()     // Catch: java.lang.Throwable -> L53
            r13 = r18
            r11.append(r13)     // Catch: java.lang.Throwable -> L53
            r14 = 3
            java.lang.String r14 = r10.substring(r14)     // Catch: java.lang.Throwable -> L53
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L53
            r15.<init>()     // Catch: java.lang.Throwable -> L53
            r7 = r19
            r15.append(r7)     // Catch: java.lang.Throwable -> L53
            r15.append(r4)     // Catch: java.lang.Throwable -> L53
            java.lang.String r15 = r15.toString()     // Catch: java.lang.Throwable -> L53
            java.lang.String r14 = r14.replace(r4, r15)     // Catch: java.lang.Throwable -> L53
            r11.append(r14)     // Catch: java.lang.Throwable -> L53
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Throwable -> L53
            r14 = 47
            int r15 = r11.lastIndexOf(r14)     // Catch: java.lang.Throwable -> L53
            java.lang.String r15 = r11.substring(r12, r15)     // Catch: java.lang.Throwable -> L53
            int r14 = r15.lastIndexOf(r14)     // Catch: java.lang.Throwable -> L53
            int r14 = r14 + 1
            java.lang.String r14 = r15.substring(r14)     // Catch: java.lang.Throwable -> L53
            r12 = r20
            r12.add(r14)     // Catch: java.lang.Throwable -> L53
            e(r15)     // Catch: java.lang.Throwable -> L53
            java.io.File r14 = new java.io.File     // Catch: java.lang.Throwable -> L53
            r14.<init>(r11)     // Catch: java.lang.Throwable -> L53
            r14.delete()     // Catch: java.lang.Throwable -> L53
            r14.createNewFile()     // Catch: java.lang.Throwable -> L53
            java.io.FileOutputStream r14 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L53
            r14.<init>(r11)     // Catch: java.lang.Throwable -> L53
        Lcf:
            int r8 = r6.read(r1)     // Catch: java.lang.Throwable -> Lda
            if (r8 <= 0) goto Lde
            r15 = 0
            r14.write(r1, r15, r8)     // Catch: java.lang.Throwable -> Lda
            goto Lcf
        Lda:
            r0 = move-exception
            r8 = r14
            goto L177
        Lde:
            r14.close()     // Catch: java.lang.Throwable -> Lda
            java.lang.Boolean r8 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> Lda
            com.kuaishou.weapon.p0.dn.a(r11, r8)     // Catch: java.lang.Throwable -> Lda
            r8 = r14
            goto Lee
        Le8:
            r13 = r18
            r7 = r19
            r12 = r20
        Lee:
            boolean r10 = r10.endsWith(r3)     // Catch: java.lang.Throwable -> L15c
            if (r10 == 0) goto L169
            boolean r9 = r9.isDirectory()     // Catch: java.lang.Throwable -> L15c
            if (r9 != 0) goto L169
            if (r23 == 0) goto L169
            java.lang.String r9 = r0.m     // Catch: java.lang.Throwable -> L15c
            e(r9)     // Catch: java.lang.Throwable -> L15c
            java.io.File r10 = new java.io.File     // Catch: java.lang.Throwable -> L15c
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L15c
            r11.<init>()     // Catch: java.lang.Throwable -> L15c
            int r14 = r0.a     // Catch: java.lang.Throwable -> L15c
            r11.append(r14)     // Catch: java.lang.Throwable -> L15c
            java.lang.String r14 = "-"
            r11.append(r14)     // Catch: java.lang.Throwable -> L15c
            java.lang.String r14 = r0.d     // Catch: java.lang.Throwable -> L15c
            r11.append(r14)     // Catch: java.lang.Throwable -> L15c
            r11.append(r3)     // Catch: java.lang.Throwable -> L15c
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Throwable -> L15c
            r10.<init>(r9, r11)     // Catch: java.lang.Throwable -> L15c
            r10.delete()     // Catch: java.lang.Throwable -> L15a
            r10.createNewFile()     // Catch: java.lang.Throwable -> L15a
            java.io.FileOutputStream r9 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L15a
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L15a
        L12c:
            int r8 = r6.read(r1)     // Catch: java.lang.Throwable -> L137
            if (r8 <= 0) goto L139
            r15 = 0
            r9.write(r1, r15, r8)     // Catch: java.lang.Throwable -> L137
            goto L12c
        L137:
            goto L158
        L139:
            r15 = 0
            r9.close()     // Catch: java.lang.Throwable -> L137
            int r8 = r2.length()     // Catch: java.lang.Throwable -> L137
            if (r8 <= 0) goto L146
            r2.setLength(r15)     // Catch: java.lang.Throwable -> L137
        L146:
            java.lang.String r8 = r10.getAbsolutePath()     // Catch: java.lang.Throwable -> L137
            r2.append(r8)     // Catch: java.lang.Throwable -> L137
            java.lang.String r8 = r2.toString()     // Catch: java.lang.Throwable -> L137
            java.lang.Boolean r11 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L137
            com.kuaishou.weapon.p0.dn.a(r8, r11)     // Catch: java.lang.Throwable -> L137
            r8 = r9
            goto L169
        L158:
            r8 = r9
            goto L15e
        L15a:
            goto L15e
        L15c:
            r10 = 0
        L15e:
            if (r10 == 0) goto L169
            boolean r9 = r10.exists()     // Catch: java.lang.Throwable -> L53
            if (r9 == 0) goto L169
            r10.delete()     // Catch: java.lang.Throwable -> L53
        L169:
            r6.closeEntry()     // Catch: java.lang.Throwable -> L53
            goto L19
        L16e:
            r6.close()
            if (r8 == 0) goto L176
            r8.close()
        L176:
            return
        L177:
            r6.close()
            if (r8 == 0) goto L17f
            r8.close()
        L17f:
            throw r0
    }

    private void a(com.kuaishou.weapon.p0.s r24, java.lang.String r25, java.lang.String r26, boolean r27) {
            r23 = this;
            r2 = r24
            r3 = r25
            java.lang.String r0 = ".dex"
            java.lang.String r1 = ".so"
            java.lang.String r9 = "armeabi"
            java.lang.String r10 = "armeabi-v7a"
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>()
            if (r27 != 0) goto L31
            java.lang.String r7 = r2.n
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 != 0) goto L31
            java.io.File r7 = new java.io.File
            java.lang.String r8 = r2.n
            r7.<init>(r8)
            boolean r8 = r7.exists()
            if (r8 == 0) goto L31
            boolean r7 = r7.isFile()
            if (r7 != 0) goto L2f
            goto L31
        L2f:
            r8 = 0
            goto L32
        L31:
            r8 = 1
        L32:
            java.lang.String r7 = r2.d
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            java.lang.String r11 = ""
            if (r7 != 0) goto L45
            java.lang.String r7 = r2.d
            java.lang.String r12 = "."
            java.lang.String r7 = r7.replace(r12, r11)
            goto L46
        L45:
            r7 = r11
        L46:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            if (r8 != 0) goto L52
            java.lang.String r13 = r2.n
            r12.append(r13)
        L52:
            r13 = 4096(0x1000, float:5.74E-42)
            byte[] r13 = new byte[r13]
            java.util.zip.ZipFile r15 = new java.util.zip.ZipFile     // Catch: java.lang.Throwable -> L278 java.io.IOException -> L27b
            r16 = 1
            java.lang.String r4 = r2.e     // Catch: java.lang.Throwable -> L278 java.io.IOException -> L27b
            r15.<init>(r4)     // Catch: java.lang.Throwable -> L278 java.io.IOException -> L27b
            java.util.Enumeration r4 = r15.entries()     // Catch: java.lang.Throwable -> L245 java.io.IOException -> L24d java.io.EOFException -> L25a java.lang.Throwable -> L267
            r17 = 0
            r18 = 0
        L67:
            boolean r19 = r4.hasMoreElements()     // Catch: java.lang.Throwable -> La7 java.io.IOException -> Lcd java.io.EOFException -> Ld1 java.lang.Throwable -> Ld5
            if (r19 == 0) goto L233
            java.lang.Object r19 = r4.nextElement()     // Catch: java.lang.Throwable -> La7 java.io.IOException -> Lcd java.io.EOFException -> Ld1 java.lang.Throwable -> Ld5
            r14 = r19
            java.util.zip.ZipEntry r14 = (java.util.zip.ZipEntry) r14     // Catch: java.lang.Throwable -> La7 java.io.IOException -> Lcd java.io.EOFException -> Ld1 java.lang.Throwable -> Ld5
            java.lang.String r6 = r14.getName()     // Catch: java.lang.Throwable -> La7 java.io.IOException -> Lcd java.io.EOFException -> Ld1 java.lang.Throwable -> Ld5
            r20 = r4
            java.lang.String r4 = "lib/"
            boolean r4 = r6.startsWith(r4)     // Catch: java.lang.Throwable -> La7 java.io.IOException -> Lcd java.io.EOFException -> Ld1 java.lang.Throwable -> Ld5
            if (r4 == 0) goto L1a2
            boolean r4 = r14.isDirectory()     // Catch: java.lang.Throwable -> La7 java.io.IOException -> Lcd java.io.EOFException -> Ld1 java.lang.Throwable -> Ld5
            if (r4 != 0) goto L1a2
            java.lang.String r4 = android.os.Build.CPU_ABI     // Catch: java.lang.Throwable -> La7 java.io.IOException -> Lcd java.io.EOFException -> Ld1 java.lang.Throwable -> Ld5
            java.lang.String r21 = android.os.Build.CPU_ABI2     // Catch: java.lang.Throwable -> L8e
            goto L90
        L8e:
            r21 = 0
        L90:
            boolean r22 = r6.contains(r4)     // Catch: java.lang.Throwable -> La7 java.io.IOException -> Lcd java.io.EOFException -> Ld1 java.lang.Throwable -> Ld5 java.lang.Throwable -> Ld5
            if (r22 != 0) goto Ld9
            boolean r22 = android.text.TextUtils.isEmpty(r21)     // Catch: java.lang.Throwable -> La7 java.io.IOException -> Lcd java.io.EOFException -> Ld1 java.lang.Throwable -> Ld5 java.lang.Throwable -> Ld5
            if (r22 != 0) goto Lab
            r22 = r8
            r8 = r21
            boolean r21 = r6.contains(r8)     // Catch: java.lang.Throwable -> La7 java.io.IOException -> L190 java.io.EOFException -> L196 java.lang.Throwable -> L19c
            if (r21 != 0) goto Ldb
            goto Laf
        La7:
            r0 = move-exception
        La8:
            r14 = r15
            goto L46c
        Lab:
            r22 = r8
            r8 = r21
        Laf:
            boolean r21 = r6.contains(r9)     // Catch: java.lang.Throwable -> La7 java.io.IOException -> L190 java.io.EOFException -> L196 java.lang.Throwable -> L19c
            if (r21 == 0) goto Lc8
            boolean r4 = r10.equalsIgnoreCase(r4)     // Catch: java.lang.Throwable -> La7 java.io.IOException -> L190 java.io.EOFException -> L196 java.lang.Throwable -> L19c
            if (r4 != 0) goto Ldb
            boolean r4 = android.text.TextUtils.isEmpty(r8)     // Catch: java.lang.Throwable -> La7 java.io.IOException -> L190 java.io.EOFException -> L196 java.lang.Throwable -> L19c
            if (r4 != 0) goto Lc8
            boolean r4 = r10.equalsIgnoreCase(r8)     // Catch: java.lang.Throwable -> La7 java.io.IOException -> L190 java.io.EOFException -> L196 java.lang.Throwable -> L19c
            if (r4 == 0) goto Lc8
            goto Ldb
        Lc8:
            r4 = r20
        Lca:
            r8 = r22
            goto L67
        Lcd:
            r22 = r8
            goto L190
        Ld1:
            r22 = r8
            goto L196
        Ld5:
            r22 = r8
            goto L19c
        Ld9:
            r22 = r8
        Ldb:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La7 java.io.IOException -> L190 java.io.EOFException -> L196 java.lang.Throwable -> L19c
            r4.<init>()     // Catch: java.lang.Throwable -> La7 java.io.IOException -> L190 java.io.EOFException -> L196 java.lang.Throwable -> L19c
            r4.append(r3)     // Catch: java.lang.Throwable -> La7 java.io.IOException -> L190 java.io.EOFException -> L196 java.lang.Throwable -> L19c
            r8 = 3
            java.lang.String r8 = r6.substring(r8)     // Catch: java.lang.Throwable -> La7 java.io.IOException -> L190 java.io.EOFException -> L196 java.lang.Throwable -> L19c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La7 java.io.IOException -> L190 java.io.EOFException -> L196 java.lang.Throwable -> L19c
            r3.<init>()     // Catch: java.lang.Throwable -> La7 java.io.IOException -> L190 java.io.EOFException -> L196 java.lang.Throwable -> L19c
            r3.append(r7)     // Catch: java.lang.Throwable -> La7 java.io.IOException -> L190 java.io.EOFException -> L196 java.lang.Throwable -> L19c
            r3.append(r1)     // Catch: java.lang.Throwable -> La7 java.io.IOException -> L190 java.io.EOFException -> L196 java.lang.Throwable -> L19c
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> La7 java.io.IOException -> L190 java.io.EOFException -> L196 java.lang.Throwable -> L19c
            java.lang.String r3 = r8.replace(r1, r3)     // Catch: java.lang.Throwable -> La7 java.io.IOException -> L190 java.io.EOFException -> L196 java.lang.Throwable -> L19c
            r4.append(r3)     // Catch: java.lang.Throwable -> La7 java.io.IOException -> L190 java.io.EOFException -> L196 java.lang.Throwable -> L19c
            java.lang.String r3 = r4.toString()     // Catch: java.lang.Throwable -> La7 java.io.IOException -> L190 java.io.EOFException -> L196 java.lang.Throwable -> L19c
            r4 = 47
            int r8 = r3.lastIndexOf(r4)     // Catch: java.lang.Throwable -> La7 java.io.IOException -> L190 java.io.EOFException -> L196 java.lang.Throwable -> L19c
            r4 = 0
            java.lang.String r8 = r3.substring(r4, r8)     // Catch: java.lang.Throwable -> La7 java.io.IOException -> L190 java.io.EOFException -> L196 java.lang.Throwable -> L19c
            r4 = 47
            int r4 = r8.lastIndexOf(r4)     // Catch: java.lang.Throwable -> La7 java.io.IOException -> L190 java.io.EOFException -> L196 java.lang.Throwable -> L19c
            int r4 = r4 + 1
            java.lang.String r4 = r8.substring(r4)     // Catch: java.lang.Throwable -> La7 java.io.IOException -> L190 java.io.EOFException -> L196 java.lang.Throwable -> L19c
            r5.add(r4)     // Catch: java.lang.Throwable -> La7 java.io.IOException -> L190 java.io.EOFException -> L196 java.lang.Throwable -> L19c
            e(r8)     // Catch: java.lang.Throwable -> La7 java.io.IOException -> L190 java.io.EOFException -> L196 java.lang.Throwable -> L19c
            java.io.File r4 = new java.io.File     // Catch: java.lang.Throwable -> La7 java.io.IOException -> L190 java.io.EOFException -> L196 java.lang.Throwable -> L19c
            r4.<init>(r3)     // Catch: java.lang.Throwable -> La7 java.io.IOException -> L190 java.io.EOFException -> L196 java.lang.Throwable -> L19c
            r4.delete()     // Catch: java.lang.Throwable -> La7 java.io.IOException -> L190 java.io.EOFException -> L196 java.lang.Throwable -> L19c
            java.io.InputStream r4 = r15.getInputStream(r14)     // Catch: java.lang.Throwable -> La7 java.io.IOException -> L190 java.io.EOFException -> L196 java.lang.Throwable -> L19c
            java.io.FileOutputStream r8 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L182 java.io.IOException -> L187 java.io.EOFException -> L18a java.lang.Throwable -> L18d
            r8.<init>(r3)     // Catch: java.lang.Throwable -> L182 java.io.IOException -> L187 java.io.EOFException -> L18a java.lang.Throwable -> L18d
            r21 = r1
        L132:
            int r1 = r4.read(r13)     // Catch: java.lang.Throwable -> L151 java.io.IOException -> L155 java.io.EOFException -> L164 java.lang.Throwable -> L173
            if (r1 <= 0) goto L146
            r17 = r4
            r4 = 0
            r8.write(r13, r4, r1)     // Catch: java.lang.Throwable -> L141 java.io.IOException -> L157 java.io.EOFException -> L166 java.lang.Throwable -> L175
            r4 = r17
            goto L132
        L141:
            r0 = move-exception
        L142:
            r18 = r8
            goto La8
        L146:
            r17 = r4
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L141 java.io.IOException -> L157 java.io.EOFException -> L166 java.lang.Throwable -> L175
            com.kuaishou.weapon.p0.dn.a(r3, r1)     // Catch: java.lang.Throwable -> L141 java.io.IOException -> L157 java.io.EOFException -> L166 java.lang.Throwable -> L175
            r18 = r8
            goto L1a6
        L151:
            r0 = move-exception
            r17 = r4
            goto L142
        L155:
            r17 = r4
        L157:
            r1 = r23
            r3 = r25
            r4 = r7
            r18 = r8
        L15e:
            r7 = r12
            r6 = r13
            r8 = r22
            goto L2b0
        L164:
            r17 = r4
        L166:
            r1 = r23
            r3 = r25
            r4 = r7
            r18 = r8
        L16d:
            r7 = r12
            r6 = r13
            r8 = r22
            goto L2cf
        L173:
            r17 = r4
        L175:
            r1 = r23
            r3 = r25
            r4 = r7
            r18 = r8
        L17c:
            r7 = r12
            r6 = r13
            r8 = r22
            goto L2e7
        L182:
            r0 = move-exception
            r17 = r4
            goto La8
        L187:
            r17 = r4
            goto L190
        L18a:
            r17 = r4
            goto L196
        L18d:
            r17 = r4
            goto L19c
        L190:
            r1 = r23
            r3 = r25
            r4 = r7
            goto L15e
        L196:
            r1 = r23
            r3 = r25
            r4 = r7
            goto L16d
        L19c:
            r1 = r23
            r3 = r25
            r4 = r7
            goto L17c
        L1a2:
            r21 = r1
            r22 = r8
        L1a6:
            boolean r1 = r6.endsWith(r0)     // Catch: java.lang.Throwable -> L21a
            if (r1 == 0) goto L21d
            boolean r1 = r14.isDirectory()     // Catch: java.lang.Throwable -> L21a
            if (r1 != 0) goto L21d
            if (r22 == 0) goto L21d
            java.lang.String r1 = r2.m     // Catch: java.lang.Throwable -> L21a
            e(r1)     // Catch: java.lang.Throwable -> L21a
            java.io.File r3 = new java.io.File     // Catch: java.lang.Throwable -> L21a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L21a
            r4.<init>()     // Catch: java.lang.Throwable -> L21a
            int r6 = r2.a     // Catch: java.lang.Throwable -> L21a
            r4.append(r6)     // Catch: java.lang.Throwable -> L21a
            java.lang.String r6 = "-"
            r4.append(r6)     // Catch: java.lang.Throwable -> L21a
            java.lang.String r6 = r2.d     // Catch: java.lang.Throwable -> L21a
            r4.append(r6)     // Catch: java.lang.Throwable -> L21a
            r4.append(r0)     // Catch: java.lang.Throwable -> L21a
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L21a
            r3.<init>(r1, r4)     // Catch: java.lang.Throwable -> L21a
            java.io.InputStream r1 = r15.getInputStream(r14)     // Catch: java.lang.Throwable -> L217
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L212
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L212
        L1e2:
            int r6 = r1.read(r13)     // Catch: java.lang.Throwable -> L20b
            if (r6 <= 0) goto L1ef
            r8 = 0
            r4.write(r13, r8, r6)     // Catch: java.lang.Throwable -> L1ed
            goto L1e2
        L1ed:
            goto L20d
        L1ef:
            r8 = 0
            r4.close()     // Catch: java.lang.Throwable -> L1ed
            r1.close()     // Catch: java.lang.Throwable -> L1ed
            java.lang.String r6 = r3.getAbsolutePath()     // Catch: java.lang.Throwable -> L1ed
            r12.append(r6)     // Catch: java.lang.Throwable -> L1ed
            java.lang.String r6 = r12.toString()     // Catch: java.lang.Throwable -> L1ed
            java.lang.Boolean r14 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L1ed
            com.kuaishou.weapon.p0.dn.a(r6, r14)     // Catch: java.lang.Throwable -> L1ed
            r17 = r1
            r18 = r4
            goto L21e
        L20b:
            r8 = 0
            goto L1ed
        L20d:
            r17 = r1
            r18 = r4
            goto L227
        L212:
            r8 = 0
            r17 = r1
            goto L227
        L217:
            r8 = 0
            goto L227
        L21a:
            r8 = 0
            goto L226
        L21d:
            r8 = 0
        L21e:
            r3 = r25
            r4 = r20
            r1 = r21
            goto Lca
        L226:
            r3 = 0
        L227:
            if (r3 == 0) goto L21e
            boolean r1 = r3.exists()     // Catch: java.lang.Throwable -> La7 java.io.IOException -> L190 java.io.EOFException -> L196 java.lang.Throwable -> L19c java.lang.Throwable -> L19c
            if (r1 == 0) goto L21e
            r3.delete()     // Catch: java.lang.Throwable -> La7 java.io.IOException -> L190 java.io.EOFException -> L196 java.lang.Throwable -> L19c java.lang.Throwable -> L19c
            goto L21e
        L233:
            r15.close()
            if (r17 == 0) goto L23b
            r17.close()
        L23b:
            if (r18 == 0) goto L240
            r18.close()
        L240:
            r3 = r25
            r7 = r12
            goto L2f9
        L245:
            r0 = move-exception
            r14 = r15
        L247:
            r17 = 0
            r18 = 0
            goto L46c
        L24d:
            r1 = r23
            r3 = r25
            r4 = r7
            r7 = r12
            r6 = r13
        L254:
            r17 = 0
            r18 = 0
            goto L2b0
        L25a:
            r1 = r23
            r3 = r25
            r4 = r7
            r7 = r12
            r6 = r13
        L261:
            r17 = 0
            r18 = 0
            goto L2cf
        L267:
            r22 = r8
            r1 = r23
            r3 = r25
            r4 = r7
            r7 = r12
            r6 = r13
            r8 = r22
        L272:
            r17 = 0
            r18 = 0
            goto L2e7
        L278:
            r0 = move-exception
            r14 = 0
            goto L247
        L27b:
            r0 = move-exception
            r22 = r8
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L278 java.io.EOFException -> L299 java.lang.Throwable -> L29f java.io.IOException -> L2a5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L278 java.io.EOFException -> L299 java.lang.Throwable -> L29f java.io.IOException -> L2a5
            r1.<init>()     // Catch: java.lang.Throwable -> L278 java.io.EOFException -> L299 java.lang.Throwable -> L29f java.io.IOException -> L2a5
            r1.append(r0)     // Catch: java.lang.Throwable -> L278 java.io.EOFException -> L299 java.lang.Throwable -> L29f java.io.IOException -> L2a5
            java.lang.String r0 = "--backupFile not exists"
            r1.append(r0)     // Catch: java.lang.Throwable -> L278 java.io.EOFException -> L299 java.lang.Throwable -> L29f java.io.IOException -> L2a5
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L278 java.io.EOFException -> L299 java.lang.Throwable -> L29f java.io.IOException -> L2a5
            java.io.FileNotFoundException r1 = new java.io.FileNotFoundException     // Catch: java.lang.Throwable -> L278 java.io.EOFException -> L299 java.lang.Throwable -> L29f java.io.IOException -> L2a5
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L278 java.io.EOFException -> L299 java.lang.Throwable -> L29f java.io.IOException -> L2a5
            throw r1     // Catch: java.lang.Throwable -> L278 java.io.EOFException -> L299 java.lang.Throwable -> L29f java.io.IOException -> L2a5
        L299:
            r4 = r7
            r7 = r12
            r6 = r13
            r8 = r22
            goto L2c7
        L29f:
            r4 = r7
            r7 = r12
            r6 = r13
            r8 = r22
            goto L2df
        L2a5:
            r1 = r23
            r3 = r25
            r4 = r7
            r7 = r12
            r6 = r13
            r8 = r22
            r15 = 0
            goto L254
        L2b0:
            r1.a(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> La7
            if (r15 == 0) goto L2b8
            r15.close()
        L2b8:
            if (r17 == 0) goto L2bd
            r17.close()
        L2bd:
            if (r18 == 0) goto L2c2
        L2bf:
            r18.close()
        L2c2:
            r2 = r24
            r3 = r25
            goto L2f9
        L2c7:
            r1 = r23
            r2 = r24
            r3 = r25
            r15 = 0
            goto L261
        L2cf:
            r1.a(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> La7
            if (r15 == 0) goto L2d7
            r15.close()
        L2d7:
            if (r17 == 0) goto L2dc
            r17.close()
        L2dc:
            if (r18 == 0) goto L2c2
            goto L2bf
        L2df:
            r1 = r23
            r2 = r24
            r3 = r25
            r15 = 0
            goto L272
        L2e7:
            r1.a(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> La7
            if (r15 == 0) goto L2ef
            r15.close()
        L2ef:
            if (r17 == 0) goto L2f4
            r17.close()
        L2f4:
            if (r18 == 0) goto L2f9
            r18.close()
        L2f9:
            java.lang.String r0 = android.os.Build.CPU_ABI
            boolean r1 = r5.contains(r0)
            java.lang.String r4 = "java.library.path"
            java.lang.String r6 = ":"
            java.lang.String r8 = "/"
            if (r1 == 0) goto L36c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            r1.append(r8)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = android.os.Build.CPU_ABI2     // Catch: java.lang.Throwable -> L334
            boolean r11 = r5.contains(r1)     // Catch: java.lang.Throwable -> L334
            if (r11 == 0) goto L335
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L334
            r11.<init>()     // Catch: java.lang.Throwable -> L334
            r11.append(r3)     // Catch: java.lang.Throwable -> L334
            r11.append(r8)     // Catch: java.lang.Throwable -> L334
            r11.append(r1)     // Catch: java.lang.Throwable -> L334
            java.lang.String r14 = r11.toString()     // Catch: java.lang.Throwable -> L334
            goto L336
        L334:
        L335:
            r14 = 0
        L336:
            if (r14 == 0) goto L355
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r6)
            r1.append(r14)
            r1.append(r6)
            java.lang.String r0 = java.lang.System.getProperty(r4)
            r1.append(r0)
            java.lang.String r11 = r1.toString()
            goto L392
        L355:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = java.lang.System.getProperty(r4)
            r1.append(r0)
            java.lang.String r11 = r1.toString()
            goto L392
        L36c:
            java.lang.String r0 = android.os.Build.CPU_ABI2     // Catch: java.lang.Throwable -> L391
            boolean r1 = r5.contains(r0)     // Catch: java.lang.Throwable -> L391
            if (r1 == 0) goto L392
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L391
            r1.<init>()     // Catch: java.lang.Throwable -> L391
            r1.append(r3)     // Catch: java.lang.Throwable -> L391
            r1.append(r8)     // Catch: java.lang.Throwable -> L391
            r1.append(r0)     // Catch: java.lang.Throwable -> L391
            r1.append(r6)     // Catch: java.lang.Throwable -> L391
            java.lang.String r0 = java.lang.System.getProperty(r4)     // Catch: java.lang.Throwable -> L391
            r1.append(r0)     // Catch: java.lang.Throwable -> L391
            java.lang.String r11 = r1.toString()     // Catch: java.lang.Throwable -> L391
            goto L392
        L391:
        L392:
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            if (r0 == 0) goto L3cc
            java.lang.String r0 = android.os.Build.CPU_ABI
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L3a6
            boolean r0 = r5.contains(r9)
            if (r0 != 0) goto L3b4
        L3a6:
            java.lang.String r0 = android.os.Build.CPU_ABI2
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L3cc
            boolean r0 = r5.contains(r9)
            if (r0 == 0) goto L3cc
        L3b4:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            java.lang.String r1 = "/armeabi:"
            r0.append(r1)
            java.lang.String r1 = java.lang.System.getProperty(r4)
            r0.append(r1)
            java.lang.String r11 = r0.toString()
        L3cc:
            r2.h = r11
            java.lang.String r0 = r7.toString()
            r2.n = r0
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L46b
            java.lang.String r1 = "apkDex"
            r4 = r26
            r0.<init>(r4, r1)     // Catch: java.lang.Throwable -> L46b
            java.lang.String r0 = r0.getAbsolutePath()     // Catch: java.lang.Throwable -> L46b
            com.kuaishou.weapon.p0.dn.c(r0)     // Catch: java.lang.Throwable -> L46b
            e(r0)     // Catch: java.lang.Throwable -> L46b
            android.app.Application r0 = com.kuaishou.weapon.p0.r.d     // Catch: java.lang.Throwable -> L46b
            java.lang.String r0 = com.kuaishou.weapon.p0.dm.a(r0)     // Catch: java.lang.Throwable -> L46b
            java.lang.String r1 = r2.n     // Catch: java.lang.Throwable -> L46b
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L46b
            if (r1 == 0) goto L46b
            java.lang.String r1 = r2.c     // Catch: java.lang.Throwable -> L46b
            java.lang.String r4 = "v7"
            boolean r1 = r1.endsWith(r4)     // Catch: java.lang.Throwable -> L46b
            if (r1 != 0) goto L409
            java.lang.String r1 = r2.c     // Catch: java.lang.Throwable -> L46b
            java.lang.String r4 = "v8"
            boolean r1 = r1.endsWith(r4)     // Catch: java.lang.Throwable -> L46b
            if (r1 == 0) goto L46b
        L409:
            java.lang.Class r1 = r23.getClass()     // Catch: java.lang.Throwable -> L449
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch: java.lang.Throwable -> L449
            java.io.File r4 = new java.io.File     // Catch: java.lang.Throwable -> L449
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L449
            r5.<init>()     // Catch: java.lang.Throwable -> L449
            r5.append(r3)     // Catch: java.lang.Throwable -> L449
            r5.append(r8)     // Catch: java.lang.Throwable -> L449
            r5.append(r0)     // Catch: java.lang.Throwable -> L449
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L449
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L449
            com.kuaishou.weapon.p0.Cdo.a(r1, r4)     // Catch: java.lang.Throwable -> L449
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L449
            r1.<init>()     // Catch: java.lang.Throwable -> L449
            r1.append(r3)     // Catch: java.lang.Throwable -> L449
            r1.append(r8)     // Catch: java.lang.Throwable -> L449
            r1.append(r0)     // Catch: java.lang.Throwable -> L449
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L449
            com.kuaishou.weapon.p0.jni.Engine.soPath = r0     // Catch: java.lang.Throwable -> L449
            java.lang.String r0 = r2.d     // Catch: java.lang.Throwable -> L449
            com.kuaishou.weapon.p0.jni.Engine.soVersion = r0     // Catch: java.lang.Throwable -> L449
            android.app.Application r0 = com.kuaishou.weapon.p0.r.d     // Catch: java.lang.Throwable -> L449
            com.kuaishou.weapon.p0.jni.Engine.getInstance(r0)     // Catch: java.lang.Throwable -> L449
            goto L46b
        L449:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L46b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L46b
            java.lang.String r3 = "can't load WeaponEngineImpl by both dexFile:"
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L46b
            java.lang.String r3 = r7.toString()     // Catch: java.lang.Throwable -> L46b
            r1.append(r3)     // Catch: java.lang.Throwable -> L46b
            java.lang.String r3 = " and ZipFile:"
            r1.append(r3)     // Catch: java.lang.Throwable -> L46b
            java.lang.String r2 = r2.e     // Catch: java.lang.Throwable -> L46b
            r1.append(r2)     // Catch: java.lang.Throwable -> L46b
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L46b
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L46b
            throw r0     // Catch: java.lang.Throwable -> L46b
        L46b:
            return
        L46c:
            if (r14 == 0) goto L471
            r14.close()
        L471:
            if (r17 == 0) goto L476
            r17.close()
        L476:
            if (r18 == 0) goto L47b
            r18.close()
        L47b:
            throw r0
    }

    private synchronized boolean a(com.kuaishou.weapon.p0.s r7) {
            r6 = this;
            monitor-enter(r6)
            r0 = 0
            if (r7 == 0) goto L214
            java.lang.String r1 = r7.e     // Catch: java.lang.Throwable -> L2d
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L2d
            if (r1 == 0) goto Le
            goto L214
        Le:
            java.util.Map<java.lang.String, com.kuaishou.weapon.p0.s> r1 = com.kuaishou.weapon.p0.r.g     // Catch: java.lang.Throwable -> L2d
            java.lang.String r2 = r7.e     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L2d
            com.kuaishou.weapon.p0.s r1 = (com.kuaishou.weapon.p0.s) r1     // Catch: java.lang.Throwable -> L2d
            r2 = 1
            if (r1 == 0) goto L30
            java.lang.String r3 = r1.d     // Catch: java.lang.Throwable -> L2d
            java.lang.String r4 = r7.d     // Catch: java.lang.Throwable -> L2d
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Throwable -> L2d
            if (r3 == 0) goto L27
            monitor-exit(r6)
            return r2
        L27:
            java.lang.String r1 = r1.e     // Catch: java.lang.Throwable -> L2d
            r6.a(r1)     // Catch: java.lang.Throwable -> L2d
            goto L30
        L2d:
            r7 = move-exception
            goto L212
        L30:
            android.app.Application r1 = com.kuaishou.weapon.p0.r.d     // Catch: java.lang.Throwable -> L20b
            r7.f = r1     // Catch: java.lang.Throwable -> L20b
            int r1 = r7.p     // Catch: java.lang.Throwable -> L20b
            if (r1 != r2) goto Lf1
            java.lang.String r1 = r7.c     // Catch: java.lang.Throwable -> Lea
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> Lea
            if (r1 != 0) goto Le2
            java.lang.String r1 = r7.e     // Catch: java.lang.Throwable -> Lea
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> Lea
            if (r1 != 0) goto Le2
            android.app.Application r1 = com.kuaishou.weapon.p0.r.d     // Catch: java.lang.Throwable -> Lea
            java.io.File r1 = r1.getFilesDir()     // Catch: java.lang.Throwable -> Lea
            java.lang.String r1 = r1.getCanonicalPath()     // Catch: java.lang.Throwable -> Lea
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lea
            r3.<init>()     // Catch: java.lang.Throwable -> Lea
            r3.append(r1)     // Catch: java.lang.Throwable -> Lea
            java.lang.String r1 = "/."
            r3.append(r1)     // Catch: java.lang.Throwable -> Lea
            int r1 = r7.a     // Catch: java.lang.Throwable -> Lea
            r3.append(r1)     // Catch: java.lang.Throwable -> Lea
            java.lang.String r1 = r3.toString()     // Catch: java.lang.Throwable -> Lea
            r7.m = r1     // Catch: java.lang.Throwable -> Lea
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lea
            r1.<init>()     // Catch: java.lang.Throwable -> Lea
            java.lang.String r3 = r7.m     // Catch: java.lang.Throwable -> Lea
            r1.append(r3)     // Catch: java.lang.Throwable -> Lea
            java.lang.String r3 = "/dex"
            r1.append(r3)     // Catch: java.lang.Throwable -> Lea
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Lea
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lea
            r3.<init>()     // Catch: java.lang.Throwable -> Lea
            java.lang.String r4 = r7.m     // Catch: java.lang.Throwable -> Lea
            r3.append(r4)     // Catch: java.lang.Throwable -> Lea
            java.lang.String r4 = "/lib/"
            r3.append(r4)     // Catch: java.lang.Throwable -> Lea
            java.lang.String r4 = r6.e     // Catch: java.lang.Throwable -> Lea
            r3.append(r4)     // Catch: java.lang.Throwable -> Lea
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> Lea
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lea
            r4.<init>()     // Catch: java.lang.Throwable -> Lea
            java.lang.String r5 = r7.m     // Catch: java.lang.Throwable -> Lea
            r4.append(r5)     // Catch: java.lang.Throwable -> Lea
            java.lang.String r5 = "/lib"
            r4.append(r5)     // Catch: java.lang.Throwable -> Lea
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> Lea
            com.kuaishou.weapon.p0.dn.c(r4)     // Catch: java.lang.Throwable -> Lea
            java.util.Random r4 = com.kuaishou.weapon.p0.r.f     // Catch: java.lang.Throwable -> Lea
            int r4 = r4.nextInt()     // Catch: java.lang.Throwable -> Lea
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lea
            r5.<init>()     // Catch: java.lang.Throwable -> Lea
            r5.append(r3)     // Catch: java.lang.Throwable -> Lea
            java.lang.String r3 = "/"
            r5.append(r3)     // Catch: java.lang.Throwable -> Lea
            r5.append(r4)     // Catch: java.lang.Throwable -> Lea
            java.lang.String r3 = r5.toString()     // Catch: java.lang.Throwable -> Lea
            e(r1)     // Catch: java.lang.Throwable -> Lea
            java.lang.Boolean r4 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> Lea
            com.kuaishou.weapon.p0.dn.a(r1, r4)     // Catch: java.lang.Throwable -> Lea
            e(r3)     // Catch: java.lang.Throwable -> Lea
            r6.a(r7, r3, r1, r0)     // Catch: java.lang.Throwable -> Lea
            java.util.Map<java.lang.String, com.kuaishou.weapon.p0.s> r1 = com.kuaishou.weapon.p0.r.h     // Catch: java.lang.Throwable -> Lea
            java.lang.String r3 = r7.c     // Catch: java.lang.Throwable -> Lea
            r1.put(r3, r7)     // Catch: java.lang.Throwable -> Lea
            java.util.Map<java.lang.String, com.kuaishou.weapon.p0.s> r1 = com.kuaishou.weapon.p0.r.g     // Catch: java.lang.Throwable -> Lea
            java.lang.String r3 = r7.e     // Catch: java.lang.Throwable -> Lea
            r1.put(r3, r7)     // Catch: java.lang.Throwable -> Lea
            goto Lf1
        Le2:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> Lea
            java.lang.String r3 = "apkPackageName or apkPkgPath is null"
            r1.<init>(r3)     // Catch: java.lang.Throwable -> Lea
            throw r1     // Catch: java.lang.Throwable -> Lea
        Lea:
            java.lang.String r1 = r7.e     // Catch: java.lang.Throwable -> L20b
            r6.a(r1)     // Catch: java.lang.Throwable -> L20b
            r1 = 1
            goto Lf2
        Lf1:
            r1 = 0
        Lf2:
            int r3 = r7.p     // Catch: java.lang.Throwable -> L20b
            if (r3 != r2) goto Lf8
            if (r1 == 0) goto L201
        Lf8:
            android.content.pm.PackageInfo r1 = r7.r     // Catch: java.lang.Throwable -> L20b
            if (r1 == 0) goto L10d
            java.lang.String r3 = r1.packageName     // Catch: java.lang.Throwable -> L20b
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L20b
            if (r3 != 0) goto L10d
            java.lang.String r3 = r1.versionName     // Catch: java.lang.Throwable -> L20b
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L20b
            if (r3 != 0) goto L10d
            goto L119
        L10d:
            android.app.Application r1 = com.kuaishou.weapon.p0.r.d     // Catch: java.lang.Throwable -> L20b
            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch: java.lang.Throwable -> L20b
            java.lang.String r3 = r7.e     // Catch: java.lang.Throwable -> L20b
            android.content.pm.PackageInfo r1 = r1.getPackageArchiveInfo(r3, r2)     // Catch: java.lang.Throwable -> L20b
        L119:
            java.lang.String r3 = r1.packageName     // Catch: java.lang.Throwable -> L20b
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L20b
            if (r3 != 0) goto L203
            java.lang.String r3 = r1.packageName     // Catch: java.lang.Throwable -> L20b
            java.lang.String r4 = "com.kuaishou.weapon"
            boolean r3 = r3.startsWith(r4)     // Catch: java.lang.Throwable -> L20b
            if (r3 == 0) goto L203
            int r3 = r7.p     // Catch: java.lang.Throwable -> L20b
            if (r3 == r2) goto L147
            int r3 = r7.b     // Catch: java.lang.Throwable -> L20b
            if (r3 == r2) goto L147
            java.lang.String r3 = r7.j     // Catch: java.lang.Throwable -> L20b
            java.lang.String r4 = r7.e     // Catch: java.lang.Throwable -> L20b
            android.util.Pair r3 = r6.a(r3, r4)     // Catch: java.lang.Throwable -> L20b
            java.lang.Object r3 = r3.first     // Catch: java.lang.Throwable -> L20b
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> L20b
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> L20b
            if (r3 != 0) goto L147
            monitor-exit(r6)
            return r0
        L147:
            java.lang.String r3 = r1.packageName     // Catch: java.lang.Throwable -> L20b
            r7.c = r3     // Catch: java.lang.Throwable -> L20b
            android.content.pm.ApplicationInfo r3 = r1.applicationInfo     // Catch: java.lang.Throwable -> L20b
            java.lang.String r4 = r3.className     // Catch: java.lang.Throwable -> L20b
            r7.o = r4     // Catch: java.lang.Throwable -> L20b
            java.lang.String r4 = r1.versionName     // Catch: java.lang.Throwable -> L20b
            r7.d = r4     // Catch: java.lang.Throwable -> L20b
            android.content.pm.ActivityInfo[] r1 = r1.activities     // Catch: java.lang.Throwable -> L20b
            r7.l = r1     // Catch: java.lang.Throwable -> L20b
            int r1 = r3.theme     // Catch: java.lang.Throwable -> L20b
            r7.q = r1     // Catch: java.lang.Throwable -> L20b
            android.app.Application r1 = com.kuaishou.weapon.p0.r.d     // Catch: java.lang.Throwable -> L20b
            java.io.File r1 = r1.getFilesDir()     // Catch: java.lang.Throwable -> L20b
            java.lang.String r1 = r1.getCanonicalPath()     // Catch: java.lang.Throwable -> L20b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L20b
            r3.<init>()     // Catch: java.lang.Throwable -> L20b
            r3.append(r1)     // Catch: java.lang.Throwable -> L20b
            java.lang.String r1 = "/."
            r3.append(r1)     // Catch: java.lang.Throwable -> L20b
            int r1 = r7.a     // Catch: java.lang.Throwable -> L20b
            r3.append(r1)     // Catch: java.lang.Throwable -> L20b
            java.lang.String r1 = r3.toString()     // Catch: java.lang.Throwable -> L20b
            r7.m = r1     // Catch: java.lang.Throwable -> L20b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L20b
            r1.<init>()     // Catch: java.lang.Throwable -> L20b
            java.lang.String r3 = r7.m     // Catch: java.lang.Throwable -> L20b
            r1.append(r3)     // Catch: java.lang.Throwable -> L20b
            java.lang.String r3 = "/dex"
            r1.append(r3)     // Catch: java.lang.Throwable -> L20b
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L20b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L20b
            r3.<init>()     // Catch: java.lang.Throwable -> L20b
            java.lang.String r4 = r7.m     // Catch: java.lang.Throwable -> L20b
            r3.append(r4)     // Catch: java.lang.Throwable -> L20b
            java.lang.String r4 = "/lib/"
            r3.append(r4)     // Catch: java.lang.Throwable -> L20b
            java.lang.String r4 = r6.e     // Catch: java.lang.Throwable -> L20b
            r3.append(r4)     // Catch: java.lang.Throwable -> L20b
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L20b
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L20b
            r4.<init>()     // Catch: java.lang.Throwable -> L20b
            java.lang.String r5 = r7.m     // Catch: java.lang.Throwable -> L20b
            r4.append(r5)     // Catch: java.lang.Throwable -> L20b
            java.lang.String r5 = "/lib"
            r4.append(r5)     // Catch: java.lang.Throwable -> L20b
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L20b
            com.kuaishou.weapon.p0.dn.c(r4)     // Catch: java.lang.Throwable -> L20b
            java.util.Random r4 = com.kuaishou.weapon.p0.r.f     // Catch: java.lang.Throwable -> L20b
            int r4 = r4.nextInt()     // Catch: java.lang.Throwable -> L20b
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L20b
            r5.<init>()     // Catch: java.lang.Throwable -> L20b
            r5.append(r3)     // Catch: java.lang.Throwable -> L20b
            java.lang.String r3 = "/"
            r5.append(r3)     // Catch: java.lang.Throwable -> L20b
            r5.append(r4)     // Catch: java.lang.Throwable -> L20b
            java.lang.String r3 = r5.toString()     // Catch: java.lang.Throwable -> L20b
            e(r1)     // Catch: java.lang.Throwable -> L20b
            java.lang.Boolean r4 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L20b
            com.kuaishou.weapon.p0.dn.a(r1, r4)     // Catch: java.lang.Throwable -> L20b
            e(r3)     // Catch: java.lang.Throwable -> L20b
            r6.a(r7, r3, r1, r2)     // Catch: java.lang.Throwable -> L20b
            java.util.Map<java.lang.String, com.kuaishou.weapon.p0.s> r1 = com.kuaishou.weapon.p0.r.h     // Catch: java.lang.Throwable -> L20b
            java.lang.String r3 = r7.c     // Catch: java.lang.Throwable -> L20b
            r1.put(r3, r7)     // Catch: java.lang.Throwable -> L20b
            java.util.Map<java.lang.String, com.kuaishou.weapon.p0.s> r1 = com.kuaishou.weapon.p0.r.g     // Catch: java.lang.Throwable -> L20b
            java.lang.String r3 = r7.e     // Catch: java.lang.Throwable -> L20b
            r1.put(r3, r7)     // Catch: java.lang.Throwable -> L20b
            java.util.List<java.lang.Integer> r1 = com.kuaishou.weapon.p0.r.b     // Catch: java.lang.Throwable -> L20b
            int r3 = r7.a     // Catch: java.lang.Throwable -> L20b
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L20b
            r1.add(r3)     // Catch: java.lang.Throwable -> L20b
        L201:
            monitor-exit(r6)
            return r2
        L203:
            java.lang.Exception r1 = new java.lang.Exception     // Catch: java.lang.Throwable -> L20b
            java.lang.String r2 = "weapon package name check failed"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L20b
            throw r1     // Catch: java.lang.Throwable -> L20b
        L20b:
            java.lang.String r7 = r7.e     // Catch: java.lang.Throwable -> L210
            r6.a(r7)     // Catch: java.lang.Throwable -> L210
        L210:
            monitor-exit(r6)
            return r0
        L212:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L2d
            throw r7
        L214:
            monitor-exit(r6)
            return r0
    }

    public static boolean e(java.lang.String r1) {
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L1f
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L1f
            boolean r1 = r0.exists()     // Catch: java.lang.Throwable -> L1f
            if (r1 == 0) goto L14
            boolean r1 = r0.isDirectory()     // Catch: java.lang.Throwable -> L1f
            if (r1 != 0) goto L14
            r0.delete()     // Catch: java.lang.Throwable -> L1f
        L14:
            boolean r1 = r0.exists()     // Catch: java.lang.Throwable -> L1f
            if (r1 != 0) goto L1d
            r0.mkdirs()     // Catch: java.lang.Throwable -> L1f
        L1d:
            r1 = 1
            return r1
        L1f:
            r1 = 0
            return r1
    }

    public boolean a(com.kuaishou.weapon.p0.s r1, boolean r2) {
            r0 = this;
            r0.a = r2
            java.lang.String r2 = r1.d
            r0.e = r2
            boolean r1 = r0.a(r1)
            return r1
    }

    public boolean a(java.lang.String r3) {
            r2 = this;
            java.util.Map<java.lang.String, com.kuaishou.weapon.p0.s> r0 = com.kuaishou.weapon.p0.r.g
            java.lang.Object r0 = r0.get(r3)
            com.kuaishou.weapon.p0.s r0 = (com.kuaishou.weapon.p0.s) r0
            if (r0 == 0) goto L2e
            java.util.Map<java.lang.String, com.kuaishou.weapon.p0.s> r1 = com.kuaishou.weapon.p0.r.g
            r1.remove(r3)
            java.util.Map<java.lang.String, com.kuaishou.weapon.p0.s> r3 = com.kuaishou.weapon.p0.r.h
            java.lang.String r1 = r0.c
            r3.remove(r1)
            java.lang.String r3 = r0.m
            com.kuaishou.weapon.p0.dn.c(r3)
            android.app.Application r3 = com.kuaishou.weapon.p0.r.d
            if (r3 == 0) goto L2c
            java.lang.String r0 = r0.c
            java.io.File r3 = r3.getFileStreamPath(r0)
            java.lang.String r3 = r3.getAbsolutePath()
            com.kuaishou.weapon.p0.dn.c(r3)
        L2c:
            r3 = 1
            return r3
        L2e:
            r3 = 0
            return r3
    }

    public java.util.Map<java.lang.String, com.kuaishou.weapon.p0.s> b() {
            r1 = this;
            java.util.Map<java.lang.String, com.kuaishou.weapon.p0.s> r0 = com.kuaishou.weapon.p0.r.h
            return r0
    }

    public boolean b(java.lang.String r4) {
            r3 = this;
            java.util.Map<java.lang.String, com.kuaishou.weapon.p0.s> r0 = com.kuaishou.weapon.p0.r.h
            java.lang.Object r0 = r0.get(r4)
            com.kuaishou.weapon.p0.s r0 = (com.kuaishou.weapon.p0.s) r0
            if (r0 == 0) goto L2e
            java.util.Map<java.lang.String, com.kuaishou.weapon.p0.s> r1 = com.kuaishou.weapon.p0.r.g
            java.lang.String r2 = r0.e
            r1.remove(r2)
            java.util.Map<java.lang.String, com.kuaishou.weapon.p0.s> r1 = com.kuaishou.weapon.p0.r.h
            r1.remove(r4)
            java.lang.String r4 = r0.m
            com.kuaishou.weapon.p0.dn.c(r4)
            android.app.Application r4 = com.kuaishou.weapon.p0.r.d
            if (r4 == 0) goto L2c
            java.lang.String r0 = r0.c
            java.io.File r4 = r4.getFileStreamPath(r0)
            java.lang.String r4 = r4.getAbsolutePath()
            com.kuaishou.weapon.p0.dn.c(r4)
        L2c:
            r4 = 1
            return r4
        L2e:
            r4 = 0
            return r4
    }

    public com.kuaishou.weapon.p0.s c(java.lang.String r2) {
            r1 = this;
            java.util.Map<java.lang.String, com.kuaishou.weapon.p0.s> r0 = com.kuaishou.weapon.p0.r.g     // Catch: java.lang.Throwable -> L9
            java.lang.Object r2 = r0.get(r2)     // Catch: java.lang.Throwable -> L9
            com.kuaishou.weapon.p0.s r2 = (com.kuaishou.weapon.p0.s) r2     // Catch: java.lang.Throwable -> L9
            return r2
        L9:
            r2 = 0
            return r2
    }

    public com.kuaishou.weapon.p0.s d(java.lang.String r2) {
            r1 = this;
            java.util.Map<java.lang.String, com.kuaishou.weapon.p0.s> r0 = com.kuaishou.weapon.p0.r.h     // Catch: java.lang.Throwable -> L9
            java.lang.Object r2 = r0.get(r2)     // Catch: java.lang.Throwable -> L9
            com.kuaishou.weapon.p0.s r2 = (com.kuaishou.weapon.p0.s) r2     // Catch: java.lang.Throwable -> L9
            return r2
        L9:
            r2 = 0
            return r2
    }
}

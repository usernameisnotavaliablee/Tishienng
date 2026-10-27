package com.tianyu.util;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_0_sz45352584.dex */
public final class a {
    public static java.lang.String a(java.lang.String r3) {
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L9
            java.lang.String r0 = ""
        L8:
            return r0
        L9:
            char[] r1 = r3.toCharArray()
            r0 = 0
        Le:
            int r2 = r1.length
            if (r0 >= r2) goto L1b
            char r2 = r1[r0]
            r2 = r2 ^ 16
            char r2 = (char) r2
            r1[r0] = r2
            int r0 = r0 + 1
            goto Le
        L1b:
            java.lang.String r0 = java.lang.String.valueOf(r1)
            goto L8
    }

    private static void a(java.io.Closeable r1) {
            if (r1 == 0) goto L5
            r1.close()     // Catch: java.io.IOException -> L6
        L5:
            return
        L6:
            r0 = move-exception
            goto L5
    }

    public static boolean a() {
            r8 = 3
            r3 = 0
            r1 = 0
            r0 = 1
            java.lang.String[] r4 = android.os.Build.SUPPORTED_32_BIT_ABIS     // Catch: java.lang.NoSuchFieldError -> Lbd
            int r5 = r4.length     // Catch: java.lang.NoSuchFieldError -> Lbd
            r2 = r1
        L8:
            if (r2 >= r5) goto L18
            r6 = r4[r2]     // Catch: java.lang.NoSuchFieldError -> Lbd
            java.lang.String r7 = "x86"
            boolean r6 = r6.contains(r7)     // Catch: java.lang.NoSuchFieldError -> Lbd
            if (r6 == 0) goto L15
        L14:
            return r0
        L15:
            int r2 = r2 + 1
            goto L8
        L18:
            java.lang.String r2 = android.os.Build.CPU_ABI     // Catch: java.lang.NoSuchFieldError -> Lbd
            java.lang.String r4 = "x86"
            boolean r2 = r2.contains(r4)     // Catch: java.lang.NoSuchFieldError -> Lbd
            if (r2 != 0) goto L14
            java.lang.String r2 = android.os.Build.CPU_ABI2     // Catch: java.lang.NoSuchFieldError -> Lbd
            java.lang.String r4 = "x86"
            boolean r2 = r2.contains(r4)     // Catch: java.lang.NoSuchFieldError -> Lbd
            if (r2 != 0) goto L14
            java.io.RandomAccessFile r2 = new java.io.RandomAccessFile     // Catch: java.io.FileNotFoundException -> La0 java.io.IOException -> Laa java.lang.Throwable -> Lb4
            java.lang.String r4 = "/system/build.prop"
            java.lang.String r5 = "r"
            r2.<init>(r4, r5)     // Catch: java.io.FileNotFoundException -> La0 java.io.IOException -> Laa java.lang.Throwable -> Lb4
            java.lang.String r4 = r2.readLine()     // Catch: java.lang.Throwable -> L156 java.io.IOException -> L15a java.io.FileNotFoundException -> L15d
        L39:
            if (r4 == 0) goto L56
            java.lang.String r5 = "ro.product.cpu.abi"
            boolean r5 = r4.contains(r5)     // Catch: java.lang.Throwable -> L156 java.io.IOException -> L15a java.io.FileNotFoundException -> L15d
            if (r5 == 0) goto L51
            java.lang.String r5 = "x86"
            boolean r4 = r4.contains(r5)     // Catch: java.lang.Throwable -> L156 java.io.IOException -> L15a java.io.FileNotFoundException -> L15d
            if (r4 == 0) goto L51
            r2.close()     // Catch: java.lang.Exception -> L4f java.lang.NoSuchFieldError -> Lbd
            goto L14
        L4f:
            r1 = move-exception
            goto L14
        L51:
            java.lang.String r4 = r2.readLine()     // Catch: java.lang.Throwable -> L156 java.io.IOException -> L15a java.io.FileNotFoundException -> L15d
            goto L39
        L56:
            r2.close()     // Catch: java.lang.NoSuchFieldError -> Lbd java.lang.Exception -> L13f
        L59:
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Exception -> L12e java.lang.Throwable -> L137
            java.lang.String r4 = "/system/bin/ls"
            r2.<init>(r4)     // Catch: java.lang.Exception -> L12e java.lang.Throwable -> L137
            r3 = 20
            byte[] r3 = new byte[r3]     // Catch: java.lang.Throwable -> L14b java.lang.Exception -> L14d
            int r4 = r2.read(r3)     // Catch: java.lang.Throwable -> L14b java.lang.Exception -> L14d
            r5 = 20
            if (r4 != r5) goto L126
            r4 = 0
            r4 = r3[r4]     // Catch: java.lang.Throwable -> L14b java.lang.Exception -> L14d
            r5 = 127(0x7f, float:1.78E-43)
            if (r4 != r5) goto L126
            r4 = 1
            r4 = r3[r4]     // Catch: java.lang.Throwable -> L14b java.lang.Exception -> L14d
            r5 = 69
            if (r4 != r5) goto L126
            r4 = 2
            r4 = r3[r4]     // Catch: java.lang.Throwable -> L14b java.lang.Exception -> L14d
            r5 = 76
            if (r4 != r5) goto L126
            r4 = 3
            r4 = r3[r4]     // Catch: java.lang.Throwable -> L14b java.lang.Exception -> L14d
            r5 = 70
            if (r4 != r5) goto L126
            r4 = 18
            r4 = r3[r4]     // Catch: java.lang.Throwable -> L14b java.lang.Exception -> L14d
            if (r4 == r8) goto L96
            r4 = 18
            r3 = r3[r4]     // Catch: java.lang.Throwable -> L14b java.lang.Exception -> L14d
            r4 = 62
            if (r3 != r4) goto L126
        L96:
            if (r2 == 0) goto L14
            r2.close()     // Catch: java.io.IOException -> L9d
            goto L14
        L9d:
            r1 = move-exception
            goto L14
        La0:
            r2 = move-exception
            r2 = r3
        La2:
            if (r2 == 0) goto L59
            r2.close()     // Catch: java.lang.Exception -> La8 java.lang.NoSuchFieldError -> Lbd
            goto L59
        La8:
            r2 = move-exception
            goto L59
        Laa:
            r2 = move-exception
            r2 = r3
        Lac:
            if (r2 == 0) goto L59
            r2.close()     // Catch: java.lang.Exception -> Lb2 java.lang.NoSuchFieldError -> Lbd
            goto L59
        Lb2:
            r2 = move-exception
            goto L59
        Lb4:
            r2 = move-exception
            r4 = r2
            r5 = r3
        Lb7:
            if (r5 == 0) goto Lbc
            r5.close()     // Catch: java.lang.NoSuchFieldError -> Lbd java.lang.Exception -> L142
        Lbc:
            throw r4     // Catch: java.lang.NoSuchFieldError -> Lbd
        Lbd:
            r2 = move-exception
            java.lang.String r2 = android.os.Build.CPU_ABI
            java.lang.String r4 = "x86"
            boolean r2 = r2.contains(r4)
            if (r2 != 0) goto L14
            java.lang.String r2 = android.os.Build.CPU_ABI2
            java.lang.String r4 = "x86"
            boolean r2 = r2.contains(r4)
            if (r2 != 0) goto L14
            java.io.RandomAccessFile r2 = new java.io.RandomAccessFile     // Catch: java.io.FileNotFoundException -> L106 java.io.IOException -> L112 java.lang.Throwable -> L11e
            java.lang.String r4 = "/system/build.prop"
            java.lang.String r5 = "r"
            r2.<init>(r4, r5)     // Catch: java.io.FileNotFoundException -> L106 java.io.IOException -> L112 java.lang.Throwable -> L11e
            java.lang.String r4 = r2.readLine()     // Catch: java.lang.Throwable -> L150 java.io.IOException -> L152 java.io.FileNotFoundException -> L154
        Ldf:
            if (r4 == 0) goto Lfe
            java.lang.String r5 = "ro.product.cpu.abi"
            boolean r5 = r4.contains(r5)     // Catch: java.lang.Throwable -> L150 java.io.IOException -> L152 java.io.FileNotFoundException -> L154
            if (r5 == 0) goto Lf9
            java.lang.String r5 = "x86"
            boolean r4 = r4.contains(r5)     // Catch: java.lang.Throwable -> L150 java.io.IOException -> L152 java.io.FileNotFoundException -> L154
            if (r4 == 0) goto Lf9
            r2.close()     // Catch: java.lang.Exception -> Lf6
            goto L14
        Lf6:
            r1 = move-exception
            goto L14
        Lf9:
            java.lang.String r4 = r2.readLine()     // Catch: java.lang.Throwable -> L150 java.io.IOException -> L152 java.io.FileNotFoundException -> L154
            goto Ldf
        Lfe:
            r2.close()     // Catch: java.lang.Exception -> L103
            goto L59
        L103:
            r2 = move-exception
            goto L59
        L106:
            r2 = move-exception
            r2 = r3
        L108:
            if (r2 == 0) goto L59
            r2.close()     // Catch: java.lang.Exception -> L10f
            goto L59
        L10f:
            r2 = move-exception
            goto L59
        L112:
            r2 = move-exception
            r2 = r3
        L114:
            if (r2 == 0) goto L59
            r2.close()     // Catch: java.lang.Exception -> L11b
            goto L59
        L11b:
            r2 = move-exception
            goto L59
        L11e:
            r0 = move-exception
            r2 = r3
        L120:
            if (r2 == 0) goto L125
            r2.close()     // Catch: java.lang.Exception -> L145
        L125:
            throw r0
        L126:
            if (r2 == 0) goto L12b
            r2.close()     // Catch: java.io.IOException -> L147
        L12b:
            r0 = r1
            goto L14
        L12e:
            r0 = move-exception
        L12f:
            if (r3 == 0) goto L12b
            r3.close()     // Catch: java.io.IOException -> L135
            goto L12b
        L135:
            r0 = move-exception
            goto L12b
        L137:
            r0 = move-exception
            r2 = r3
        L139:
            if (r2 == 0) goto L13e
            r2.close()     // Catch: java.io.IOException -> L149
        L13e:
            throw r0
        L13f:
            r2 = move-exception
            goto L59
        L142:
            r2 = move-exception
            goto Lbc
        L145:
            r1 = move-exception
            goto L125
        L147:
            r0 = move-exception
            goto L12b
        L149:
            r1 = move-exception
            goto L13e
        L14b:
            r0 = move-exception
            goto L139
        L14d:
            r0 = move-exception
            r3 = r2
            goto L12f
        L150:
            r0 = move-exception
            goto L120
        L152:
            r4 = move-exception
            goto L114
        L154:
            r4 = move-exception
            goto L108
        L156:
            r4 = move-exception
            r5 = r2
            goto Lb7
        L15a:
            r4 = move-exception
            goto Lac
        L15d:
            r4 = move-exception
            goto La2
    }

    public static boolean a(android.content.Context r5) {
            r1 = 1
            java.lang.String r0 = "q~tb\u007fyt>q``>QsdyfydiDxbuqt"
            java.lang.String r0 = a(r0)     // Catch: java.lang.Throwable -> L47
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L47
            java.lang.String r2 = "sebbu~dQsdyfydiDxbuqt"
            java.lang.String r2 = a(r2)     // Catch: java.lang.Throwable -> L47
            r3 = 0
            java.lang.Class[] r3 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L47
            java.lang.reflect.Method r2 = r0.getDeclaredMethod(r2, r3)     // Catch: java.lang.Throwable -> L47
            r3 = 1
            r2.setAccessible(r3)     // Catch: java.lang.Throwable -> L47
            r3 = 0
            r4 = 0
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L47
            java.lang.Object r2 = r2.invoke(r3, r4)     // Catch: java.lang.Throwable -> L47
            java.lang.String r3 = "wud@b\u007fsucc^q}u"
            java.lang.String r3 = a(r3)     // Catch: java.lang.Throwable -> L47
            r4 = 0
            java.lang.Class[] r4 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L47
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r3, r4)     // Catch: java.lang.Throwable -> L47
            r3 = 1
            r0.setAccessible(r3)     // Catch: java.lang.Throwable -> L47
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L47
            java.lang.Object r0 = r0.invoke(r2, r3)     // Catch: java.lang.Throwable -> L47
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L47
            java.lang.String r2 = r5.getPackageName()     // Catch: java.lang.Throwable -> L47
            boolean r0 = r2.equalsIgnoreCase(r0)     // Catch: java.lang.Throwable -> L47
        L46:
            return r0
        L47:
            r0 = move-exception
            r0 = r1
            goto L46
    }

    public static boolean a(android.content.Context r9, java.lang.String r10, java.lang.String r11, java.lang.String r12) {
            r0 = 1
            r1 = 0
            r2 = 0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.StringBuilder r3 = r3.append(r11)
            java.lang.String r4 = "/"
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r12)
            java.lang.String r5 = r3.toString()
            java.io.File r3 = new java.io.File
            r3.<init>(r11)
            boolean r4 = r3.exists()
            if (r4 != 0) goto L28
            r3.mkdir()
        L28:
            java.io.File r3 = new java.io.File     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> Lad
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> Lad
            boolean r4 = r3.exists()     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> Lad
            if (r4 == 0) goto L6a
            android.content.res.Resources r4 = r9.getResources()     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> Lad
            android.content.res.AssetManager r4 = r4.getAssets()     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> Lad
            java.io.InputStream r4 = r4.open(r10)     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> Lad
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> Lad
            r6.<init>(r3)     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> Lad
            java.io.BufferedInputStream r7 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> Lad
            r7.<init>(r4)     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> Lad
            java.io.BufferedInputStream r8 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> Lad
            r8.<init>(r6)     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> Lad
            boolean r3 = a(r7, r8)     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> Lad
            if (r3 == 0) goto Lb4
            r3 = r0
        L55:
            r4.close()     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> Lad
            r6.close()     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> Lad
            r7.close()     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> Lad
            r8.close()     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> Lad
            if (r3 == 0) goto L6a
            a(r2)
            a(r2)
        L69:
            return r0
        L6a:
            android.content.res.Resources r3 = r9.getResources()     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> Lad
            android.content.res.AssetManager r3 = r3.getAssets()     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> Lad
            java.io.InputStream r4 = r3.open(r10)     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> Lad
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> La8 java.lang.Exception -> Lb1
            r3.<init>(r5)     // Catch: java.lang.Throwable -> La8 java.lang.Exception -> Lb1
            r2 = 7168(0x1c00, float:1.0045E-41)
            byte[] r2 = new byte[r2]     // Catch: java.lang.Exception -> L8a java.lang.Throwable -> Lab
        L7f:
            int r5 = r4.read(r2)     // Catch: java.lang.Exception -> L8a java.lang.Throwable -> Lab
            if (r5 <= 0) goto L94
            r6 = 0
            r3.write(r2, r6, r5)     // Catch: java.lang.Exception -> L8a java.lang.Throwable -> Lab
            goto L7f
        L8a:
            r0 = move-exception
            r0 = r3
        L8c:
            a(r0)
            a(r4)
            r0 = r1
            goto L69
        L94:
            r3.flush()     // Catch: java.lang.Exception -> L8a java.lang.Throwable -> Lab
            a(r3)
            a(r4)
            goto L69
        L9e:
            r0 = move-exception
            r3 = r2
            r4 = r2
        La1:
            a(r3)
            a(r4)
            throw r0
        La8:
            r0 = move-exception
            r3 = r2
            goto La1
        Lab:
            r0 = move-exception
            goto La1
        Lad:
            r0 = move-exception
            r0 = r2
            r4 = r2
            goto L8c
        Lb1:
            r0 = move-exception
            r0 = r2
            goto L8c
        Lb4:
            r3 = r1
            goto L55
    }

    private static boolean a(java.io.BufferedInputStream r7, java.io.BufferedInputStream r8) {
            r0 = 0
            int r2 = r7.available()     // Catch: java.io.IOException -> L24 java.io.FileNotFoundException -> L26
            int r1 = r8.available()     // Catch: java.io.IOException -> L24 java.io.FileNotFoundException -> L26
            if (r2 != r1) goto L1e
            byte[] r3 = new byte[r2]     // Catch: java.io.IOException -> L24 java.io.FileNotFoundException -> L26
            byte[] r4 = new byte[r1]     // Catch: java.io.IOException -> L24 java.io.FileNotFoundException -> L26
            r7.read(r3)     // Catch: java.io.IOException -> L24 java.io.FileNotFoundException -> L26
            r8.read(r4)     // Catch: java.io.IOException -> L24 java.io.FileNotFoundException -> L26
            r1 = r0
        L16:
            if (r1 >= r2) goto L22
            r5 = r3[r1]     // Catch: java.io.IOException -> L24 java.io.FileNotFoundException -> L26
            r6 = r4[r1]     // Catch: java.io.IOException -> L24 java.io.FileNotFoundException -> L26
            if (r5 == r6) goto L1f
        L1e:
            return r0
        L1f:
            int r1 = r1 + 1
            goto L16
        L22:
            r0 = 1
            goto L1e
        L24:
            r1 = move-exception
            goto L1e
        L26:
            r1 = move-exception
            goto L1e
    }

    public static void b() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 == r1) goto L7
        L6:
            return
        L7:
            java.lang.String r0 = "q~tb\u007fyt>s\u007f~du~d>`}>@qs{qwu@qbcub4@qs{qwu"
            java.lang.String r0 = a(r0)     // Catch: java.lang.Throwable -> L59
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L59
            r1 = 1
            java.lang.Class[] r1 = new java.lang.Class[r1]     // Catch: java.lang.Throwable -> L59
            r2 = 0
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r1[r2] = r3     // Catch: java.lang.Throwable -> L59
            java.lang.reflect.Constructor r0 = r0.getDeclaredConstructor(r1)     // Catch: java.lang.Throwable -> L59
            r1 = 1
            r0.setAccessible(r1)     // Catch: java.lang.Throwable -> L59
        L21:
            java.lang.String r0 = "q~tb\u007fyt>q``>QsdyfydiDxbuqt"
            java.lang.String r0 = a(r0)     // Catch: java.lang.Throwable -> L57
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L57
            java.lang.String r1 = "sebbu~dQsdyfydiDxbuqt"
            java.lang.String r1 = a(r1)     // Catch: java.lang.Throwable -> L57
            r2 = 0
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L57
            java.lang.reflect.Method r1 = r0.getDeclaredMethod(r1, r2)     // Catch: java.lang.Throwable -> L57
            r2 = 1
            r1.setAccessible(r2)     // Catch: java.lang.Throwable -> L57
            r2 = 0
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L57
            java.lang.Object r1 = r1.invoke(r2, r3)     // Catch: java.lang.Throwable -> L57
            java.lang.String r2 = "}Xyttu~Q`yGqb~y~wCx\u007fg~"
            java.lang.String r2 = a(r2)     // Catch: java.lang.Throwable -> L57
            java.lang.reflect.Field r0 = r0.getDeclaredField(r2)     // Catch: java.lang.Throwable -> L57
            r2 = 1
            r0.setAccessible(r2)     // Catch: java.lang.Throwable -> L57
            r2 = 1
            r0.setBoolean(r1, r2)     // Catch: java.lang.Throwable -> L57
            goto L6
        L57:
            r0 = move-exception
            goto L6
        L59:
            r0 = move-exception
            goto L21
    }
}

package com.bytedance.pangle.up;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class xt {
    private static java.lang.String j;
    private static java.util.Map<java.lang.String, java.lang.Integer> xt;

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.bytedance.pangle.up.xt.xt = r0
            r1 = 64
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "arm64-v8a"
            r0.put(r2, r1)
            java.util.Map<java.lang.String, java.lang.Integer> r0 = com.bytedance.pangle.up.xt.xt
            r2 = 32
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r3 = "armeabi-v7a"
            r0.put(r3, r2)
            java.util.Map<java.lang.String, java.lang.Integer> r0 = com.bytedance.pangle.up.xt.xt
            java.lang.String r3 = "armeabi"
            r0.put(r3, r2)
            java.util.Map<java.lang.String, java.lang.Integer> r0 = com.bytedance.pangle.up.xt.xt
            java.lang.String r3 = "x86_64"
            r0.put(r3, r1)
            java.util.Map<java.lang.String, java.lang.Integer> r0 = com.bytedance.pangle.up.xt.xt
            java.lang.String r3 = "x86"
            r0.put(r3, r2)
            java.util.Map<java.lang.String, java.lang.Integer> r0 = com.bytedance.pangle.up.xt.xt
            java.lang.String r3 = "mips64"
            r0.put(r3, r1)
            java.util.Map<java.lang.String, java.lang.Integer> r0 = com.bytedance.pangle.up.xt.xt
            java.lang.String r1 = "mips"
            r0.put(r1, r2)
            java.lang.String r0 = cw()
            com.bytedance.pangle.up.xt.j = r0
            return
    }

    public xt() {
            r1 = this;
            r1.<init>()
            return
    }

    private static java.lang.String cw() {
            org.json.JSONObject r0 = r()
            java.lang.String r1 = j(r0)
            if (r1 != 0) goto Lf
            java.lang.String r0 = xt(r0)
            return r0
        Lf:
            return r1
    }

    public static com.bytedance.pangle.util.up<java.lang.Boolean, java.util.Map<java.lang.String, java.util.List<java.util.zip.ZipEntry>>> j(java.io.File r8) {
            java.lang.String r0 = "NativeLibHelper isPluginApkMatchHostAbi, close sourceApkZipFile error!"
            java.lang.String r1 = "Zeus/so_pangle"
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r3 = 0
            java.util.zip.ZipFile r4 = new java.util.zip.ZipFile     // Catch: java.lang.Throwable -> L7a java.io.IOException -> L7c
            r4.<init>(r8)     // Catch: java.lang.Throwable -> L7a java.io.IOException -> L7c
            java.util.Map r3 = j(r4)     // Catch: java.lang.Throwable -> L2b java.io.IOException -> L2e
            r2.putAll(r3)     // Catch: java.lang.Throwable -> L2b java.io.IOException -> L2e
            boolean r3 = r2.isEmpty()     // Catch: java.lang.Throwable -> L2b java.io.IOException -> L2e
            if (r3 == 0) goto L31
            java.lang.String r3 = "NativeLibHelper isPluginApkMatchHostAbi [true] soEntries empty, "
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch: java.lang.Throwable -> L2b java.io.IOException -> L2e
            java.lang.String r8 = r3.concat(r8)     // Catch: java.lang.Throwable -> L2b java.io.IOException -> L2e
            com.bytedance.pangle.log.ZeusLogger.i(r1, r8)     // Catch: java.lang.Throwable -> L2b java.io.IOException -> L2e
            r8 = 1
            goto L69
        L2b:
            r8 = move-exception
            r3 = r4
            goto L93
        L2e:
            r8 = move-exception
            r3 = r4
            goto L7d
        L31:
            java.lang.String r3 = com.bytedance.pangle.up.xt.j     // Catch: java.lang.Throwable -> L2b java.io.IOException -> L2e
            boolean r3 = j(r2, r3)     // Catch: java.lang.Throwable -> L2b java.io.IOException -> L2e
            java.lang.String r5 = "], "
            java.lang.String r6 = "NativeLibHelper isPluginApkMatchHostAbi ["
            if (r3 == 0) goto L53
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2b java.io.IOException -> L2e
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L2b java.io.IOException -> L2e
            r7.append(r3)     // Catch: java.lang.Throwable -> L2b java.io.IOException -> L2e
            r7.append(r5)     // Catch: java.lang.Throwable -> L2b java.io.IOException -> L2e
            r7.append(r8)     // Catch: java.lang.Throwable -> L2b java.io.IOException -> L2e
            java.lang.String r8 = r7.toString()     // Catch: java.lang.Throwable -> L2b java.io.IOException -> L2e
            com.bytedance.pangle.log.ZeusLogger.i(r1, r8)     // Catch: java.lang.Throwable -> L2b java.io.IOException -> L2e
            goto L68
        L53:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2b java.io.IOException -> L2e
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L2b java.io.IOException -> L2e
            r7.append(r3)     // Catch: java.lang.Throwable -> L2b java.io.IOException -> L2e
            r7.append(r5)     // Catch: java.lang.Throwable -> L2b java.io.IOException -> L2e
            r7.append(r8)     // Catch: java.lang.Throwable -> L2b java.io.IOException -> L2e
            java.lang.String r8 = r7.toString()     // Catch: java.lang.Throwable -> L2b java.io.IOException -> L2e
            com.bytedance.pangle.log.ZeusLogger.w(r1, r8)     // Catch: java.lang.Throwable -> L2b java.io.IOException -> L2e
        L68:
            r8 = r3
        L69:
            com.bytedance.pangle.util.up r3 = new com.bytedance.pangle.util.up     // Catch: java.lang.Throwable -> L2b java.io.IOException -> L2e
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)     // Catch: java.lang.Throwable -> L2b java.io.IOException -> L2e
            r3.<init>(r8, r2)     // Catch: java.lang.Throwable -> L2b java.io.IOException -> L2e
            r4.close()     // Catch: java.io.IOException -> L76
            return r3
        L76:
            com.bytedance.pangle.log.ZeusLogger.w(r1, r0)
            return r3
        L7a:
            r8 = move-exception
            goto L93
        L7c:
            r8 = move-exception
        L7d:
            java.lang.String r4 = "NativeLibHelper isPluginApkMatchHostAbi, get sourceApk ZipFile failed!"
            com.bytedance.pangle.log.ZeusLogger.errReport(r1, r4, r8)     // Catch: java.lang.Throwable -> L7a
            com.bytedance.pangle.util.up r8 = new com.bytedance.pangle.util.up     // Catch: java.lang.Throwable -> L7a
            java.lang.Boolean r4 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L7a
            r8.<init>(r4, r2)     // Catch: java.lang.Throwable -> L7a
            if (r3 == 0) goto L92
            r3.close()     // Catch: java.io.IOException -> L8f
            goto L92
        L8f:
            com.bytedance.pangle.log.ZeusLogger.w(r1, r0)
        L92:
            return r8
        L93:
            if (r3 == 0) goto L9c
            r3.close()     // Catch: java.io.IOException -> L99
            goto L9c
        L99:
            com.bytedance.pangle.log.ZeusLogger.w(r1, r0)
        L9c:
            throw r8
    }

    public static java.lang.String j() {
            java.lang.String r0 = com.bytedance.pangle.up.xt.j
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.String r0 = cw()
            com.bytedance.pangle.up.xt.j = r0
            return r0
    }

    private static java.lang.String j(org.json.JSONObject r5) {
            java.lang.String r0 = "primaryCpuAbi"
            java.lang.String r1 = "Zeus/so_pangle"
            boolean r2 = com.bytedance.pangle.util.g.j()
            if (r2 == 0) goto L9c
            android.app.Application r2 = com.bytedance.pangle.Zeus.getAppApplication()     // Catch: java.lang.Exception -> L5c
            android.content.pm.ApplicationInfo r2 = r2.getApplicationInfo()     // Catch: java.lang.Exception -> L5c
            java.lang.Object r2 = com.bytedance.pangle.util.FieldUtils.readField(r2, r0)     // Catch: java.lang.Exception -> L5c
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Exception -> L5c
            java.lang.String r3 = "NativeLibHelper inferHostAbiAuto, primaryCpuAbi="
            java.lang.String r4 = java.lang.String.valueOf(r2)     // Catch: java.lang.Exception -> L5c
            java.lang.String r3 = r3.concat(r4)     // Catch: java.lang.Exception -> L5c
            com.bytedance.pangle.log.ZeusLogger.w(r1, r3)     // Catch: java.lang.Exception -> L5c
            j(r5, r0, r2)     // Catch: java.lang.Exception -> L5c
            if (r2 == 0) goto L9c
            boolean r0 = com.bytedance.pangle.util.g.oq()     // Catch: java.lang.Exception -> L5c
            r3 = 0
            if (r0 == 0) goto L5e
            boolean r0 = com.bytedance.pangle.up.a.a()     // Catch: java.lang.Exception -> L4e
            if (r0 == 0) goto L3c
            r0 = 64
            r3 = 64
            goto L40
        L3c:
            r0 = 32
            r3 = 32
        L40:
            java.lang.String r0 = "NativeLibHelper inferHostAbiAuto, processMode="
            java.lang.String r4 = java.lang.String.valueOf(r3)     // Catch: java.lang.Exception -> L4e
            java.lang.String r0 = r0.concat(r4)     // Catch: java.lang.Exception -> L4e
            com.bytedance.pangle.log.ZeusLogger.w(r1, r0)     // Catch: java.lang.Exception -> L4e
            goto L63
        L4e:
            java.lang.String r0 = "NativeLibHelper inferHostAbiAuto, processMode exception default="
            java.lang.String r4 = java.lang.String.valueOf(r3)     // Catch: java.lang.Exception -> L5c
            java.lang.String r0 = r0.concat(r4)     // Catch: java.lang.Exception -> L5c
            com.bytedance.pangle.log.ZeusLogger.w(r1, r0)     // Catch: java.lang.Exception -> L5c
            goto L63
        L5c:
            r0 = move-exception
            goto L90
        L5e:
            java.lang.String r0 = "NativeLibHelper inferHostAbiAuto, processMode default=0"
            com.bytedance.pangle.log.ZeusLogger.w(r1, r0)     // Catch: java.lang.Exception -> L5c
        L63:
            java.lang.String r0 = "processMode"
            java.lang.String r4 = java.lang.String.valueOf(r3)     // Catch: java.lang.Exception -> L5c
            j(r5, r0, r4)     // Catch: java.lang.Exception -> L5c
            if (r3 == 0) goto L86
            java.util.Map<java.lang.String, java.lang.Integer> r0 = com.bytedance.pangle.up.xt.xt     // Catch: java.lang.Exception -> L5c
            java.lang.Object r0 = r0.get(r2)     // Catch: java.lang.Exception -> L5c
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Exception -> L5c
            int r0 = r0.intValue()     // Catch: java.lang.Exception -> L5c
            if (r0 != r3) goto L9c
            java.lang.String r0 = "NativeLibHelper inferHostAbiAuto2, sHostAbi="
            java.lang.String r0 = r0.concat(r2)     // Catch: java.lang.Exception -> L5c
            com.bytedance.pangle.log.ZeusLogger.w(r1, r0)     // Catch: java.lang.Exception -> L5c
            goto L8f
        L86:
            java.lang.String r0 = "NativeLibHelper inferHostAbiAuto1, sHostAbi="
            java.lang.String r0 = r0.concat(r2)     // Catch: java.lang.Exception -> L5c
            com.bytedance.pangle.log.ZeusLogger.w(r1, r0)     // Catch: java.lang.Exception -> L5c
        L8f:
            return r2
        L90:
            java.lang.String r2 = "NativeLibHelper inferHostAbiAuto failed!"
            com.bytedance.pangle.log.ZeusLogger.errReport(r1, r2, r0)
            java.lang.String r0 = "autoError"
            java.lang.String r1 = "1"
            j(r5, r0, r1)
        L9c:
            r5 = 0
            return r5
    }

    private static java.util.List<java.util.zip.ZipEntry> j(java.util.Map<java.lang.String, java.util.List<java.util.zip.ZipEntry>> r12) {
            if (r12 == 0) goto L94
            boolean r0 = r12.isEmpty()
            if (r0 == 0) goto La
            goto L94
        La:
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.lang.String r2 = com.bytedance.pangle.up.xt.j
            r2.getClass()
            int r3 = r2.hashCode()
            java.lang.String r4 = "arm64-v8a"
            java.lang.String r5 = "mips"
            java.lang.String r6 = "x86"
            java.lang.String r7 = "x86_64"
            java.lang.String r8 = "mips64"
            java.lang.String r9 = "armeabi"
            java.lang.String r10 = "armeabi-v7a"
            r11 = -1
            switch(r3) {
                case -1073971299: goto L66;
                case -806050265: goto L5d;
                case -738963905: goto L54;
                case 117110: goto L4b;
                case 3351711: goto L42;
                case 145444210: goto L39;
                case 1431565292: goto L30;
                default: goto L2f;
            }
        L2f:
            goto L6e
        L30:
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L37
            goto L6e
        L37:
            r11 = 6
            goto L6e
        L39:
            boolean r2 = r2.equals(r10)
            if (r2 != 0) goto L40
            goto L6e
        L40:
            r11 = 5
            goto L6e
        L42:
            boolean r2 = r2.equals(r5)
            if (r2 != 0) goto L49
            goto L6e
        L49:
            r11 = 4
            goto L6e
        L4b:
            boolean r2 = r2.equals(r6)
            if (r2 != 0) goto L52
            goto L6e
        L52:
            r11 = 3
            goto L6e
        L54:
            boolean r2 = r2.equals(r9)
            if (r2 != 0) goto L5b
            goto L6e
        L5b:
            r11 = 2
            goto L6e
        L5d:
            boolean r2 = r2.equals(r7)
            if (r2 != 0) goto L64
            goto L6e
        L64:
            r11 = 1
            goto L6e
        L66:
            boolean r2 = r2.equals(r8)
            if (r2 != 0) goto L6d
            goto L6e
        L6d:
            r11 = 0
        L6e:
            switch(r11) {
                case 0: goto L90;
                case 1: goto L8c;
                case 2: goto L85;
                case 3: goto L81;
                case 4: goto L7d;
                case 5: goto L76;
                case 6: goto L72;
                default: goto L71;
            }
        L71:
            return r0
        L72:
            j(r12, r4, r0, r1)
            return r0
        L76:
            j(r12, r10, r0, r1)
            j(r12, r9, r0, r1)
            return r0
        L7d:
            j(r12, r5, r0, r1)
            return r0
        L81:
            j(r12, r6, r0, r1)
            return r0
        L85:
            j(r12, r9, r0, r1)
            j(r12, r10, r0, r1)
            return r0
        L8c:
            j(r12, r7, r0, r1)
            return r0
        L90:
            j(r12, r8, r0, r1)
            return r0
        L94:
            r12 = 0
            return r12
    }

    private static java.util.Map<java.lang.String, java.util.List<java.util.zip.ZipEntry>> j(java.util.zip.ZipFile r7) {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Enumeration r1 = r7.entries()
            java.lang.String r2 = "^lib/[^/]+/lib[^/]+.so$"
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)
        Lf:
            boolean r3 = r1.hasMoreElements()
            if (r3 == 0) goto L7b
            java.lang.Object r3 = r1.nextElement()
            java.util.zip.ZipEntry r3 = (java.util.zip.ZipEntry) r3
            boolean r4 = r3.isDirectory()
            if (r4 != 0) goto Lf
            java.lang.String r4 = r3.getName()
            java.lang.String r5 = "../"
            boolean r4 = r4.contains(r5)
            if (r4 != 0) goto Lf
            java.lang.String r4 = r3.getName()
            java.lang.String r5 = "lib/"
            boolean r4 = r4.startsWith(r5)
            if (r4 == 0) goto Lf
            java.lang.String r4 = r3.getName()
            java.util.regex.Matcher r4 = r2.matcher(r4)
            boolean r4 = r4.matches()
            if (r4 == 0) goto Lf
            java.lang.String r4 = r3.getName()
            java.lang.String r5 = java.io.File.separator
            java.lang.String[] r4 = r4.split(r5)
            if (r4 == 0) goto Lf
            int r5 = r4.length
            r6 = 2
            if (r5 < r6) goto Lf
            int r5 = r4.length
            int r5 = r5 - r6
            r4 = r4[r5]
            java.util.Map<java.lang.String, java.lang.Integer> r5 = com.bytedance.pangle.up.xt.xt
            boolean r5 = r5.containsKey(r4)
            if (r5 == 0) goto Lf
            java.lang.Object r5 = r0.get(r4)
            if (r5 != 0) goto L71
            java.util.LinkedList r5 = new java.util.LinkedList
            r5.<init>()
            r0.put(r4, r5)
        L71:
            java.lang.Object r4 = r0.get(r4)
            java.util.List r4 = (java.util.List) r4
            r4.add(r3)
            goto Lf
        L7b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "NativeLibHelper getAllSoZipEntries, zipFile="
            r1.<init>(r2)
            java.lang.String r7 = r7.getName()
            r1.append(r7)
            java.lang.String r7 = ", soEntries="
            r1.append(r7)
            java.lang.String r7 = r0.toString()
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            java.lang.String r1 = "Zeus/so_pangle"
            com.bytedance.pangle.log.ZeusLogger.i(r1, r7)
            return r0
    }

    public static void j(java.io.File r4, java.io.File r5, java.lang.String r6, java.util.Map<java.lang.String, java.util.List<java.util.zip.ZipEntry>> r7) throws java.io.IOException {
            r0 = 0
            j(r6, r5)     // Catch: java.lang.Throwable -> L77
            java.util.zip.ZipFile r1 = new java.util.zip.ZipFile     // Catch: java.lang.Throwable -> L77
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L77
            if (r7 != 0) goto L13
            java.util.Map r7 = j(r1)     // Catch: java.lang.Throwable -> L10
            goto L13
        L10:
            r4 = move-exception
            r0 = r1
            goto L78
        L13:
            java.lang.String r4 = com.bytedance.pangle.up.xt.j     // Catch: java.lang.Throwable -> L10
            boolean r4 = j(r7, r4)     // Catch: java.lang.Throwable -> L10
            java.lang.String r0 = "Zeus/so_pangle"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L10
            java.lang.String r3 = "NativeLibHelper copyNativeLib pre-verify-matchHostAbi["
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L10
            r2.append(r4)     // Catch: java.lang.Throwable -> L10
            java.lang.String r3 = "], pkg="
            r2.append(r3)     // Catch: java.lang.Throwable -> L10
            r2.append(r6)     // Catch: java.lang.Throwable -> L10
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L10
            com.bytedance.pangle.log.ZeusLogger.i(r0, r2)     // Catch: java.lang.Throwable -> L10
            if (r4 == 0) goto L73
            java.util.List r4 = j(r7)     // Catch: java.lang.Throwable -> L10
            if (r4 == 0) goto L60
            boolean r7 = r4.isEmpty()     // Catch: java.lang.Throwable -> L10
            if (r7 == 0) goto L43
            goto L60
        L43:
            boolean r6 = r5.exists()     // Catch: java.lang.Throwable -> L10
            if (r6 != 0) goto L4c
            r5.mkdirs()     // Catch: java.lang.Throwable -> L10
        L4c:
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L10
        L50:
            boolean r6 = r4.hasNext()     // Catch: java.lang.Throwable -> L10
            if (r6 == 0) goto L73
            java.lang.Object r6 = r4.next()     // Catch: java.lang.Throwable -> L10
            java.util.zip.ZipEntry r6 = (java.util.zip.ZipEntry) r6     // Catch: java.lang.Throwable -> L10
            j(r1, r6, r5)     // Catch: java.lang.Throwable -> L10
            goto L50
        L60:
            java.lang.String r4 = "Zeus/install_pangle"
            java.lang.String r5 = "NativeLibHelper copyNativeLib, supportedSoEntries empty, pkg="
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch: java.lang.Throwable -> L10
            java.lang.String r5 = r5.concat(r6)     // Catch: java.lang.Throwable -> L10
            com.bytedance.pangle.log.ZeusLogger.i(r4, r5)     // Catch: java.lang.Throwable -> L10
            r1.close()
            return
        L73:
            r1.close()
            return
        L77:
            r4 = move-exception
        L78:
            if (r0 == 0) goto L7d
            r0.close()
        L7d:
            throw r4
    }

    private static void j(java.lang.String r8, java.io.File r9) throws java.io.IOException {
            com.bytedance.pangle.plugin.Plugin r8 = com.bytedance.pangle.Zeus.getPlugin(r8)
            java.util.List<java.lang.String> r0 = r8.mSharedHostSos
            int r0 = r0.size()
            if (r0 != 0) goto Le
            goto L82
        Le:
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List<java.lang.String> r1 = r8.mSharedHostSos
            r0.<init>(r1)
            android.app.Application r1 = com.bytedance.pangle.Zeus.getAppApplication()
            android.content.pm.ApplicationInfo r1 = r1.getApplicationInfo()
            java.lang.String r1 = r1.nativeLibraryDir
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L26
            goto L82
        L26:
            java.lang.String r2 = java.io.File.pathSeparator
            java.lang.String[] r1 = r1.split(r2)
            java.util.List<java.lang.String> r8 = r8.mSharedHostSos
            java.util.Iterator r8 = r8.iterator()
        L32:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L82
            java.lang.Object r2 = r8.next()
            java.lang.String r2 = (java.lang.String) r2
            int r3 = r1.length
            r4 = 0
        L40:
            if (r4 >= r3) goto L32
            r5 = r1[r4]
            java.io.File r6 = new java.io.File
            r6.<init>(r5, r2)
            boolean r5 = r0.contains(r2)
            if (r5 == 0) goto L7f
            boolean r5 = r6.exists()
            if (r5 == 0) goto L7f
            java.lang.String r5 = r6.getAbsolutePath()
            java.io.File r7 = new java.io.File
            r7.<init>(r9, r2)
            java.lang.String r7 = r7.getAbsolutePath()
            com.bytedance.pangle.util.tl.j(r5, r7)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r7 = "NativeLibHelper copySoFromHost, hostSoPath="
            r5.<init>(r7)
            java.lang.String r6 = r6.getAbsolutePath()
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "Zeus/install_pangle"
            com.bytedance.pangle.log.ZeusLogger.i(r6, r5)
            r0.remove(r2)
        L7f:
            int r4 = r4 + 1
            goto L40
        L82:
            return
    }

    private static void j(java.util.Map<java.lang.String, java.util.List<java.util.zip.ZipEntry>> r3, java.lang.String r4, java.util.List<java.util.zip.ZipEntry> r5, java.util.Set<java.lang.String> r6) {
            java.lang.Object r3 = r3.get(r4)
            java.util.List r3 = (java.util.List) r3
            if (r3 == 0) goto L40
            int r4 = r3.size()
            if (r4 != 0) goto Lf
            goto L40
        Lf:
            java.util.Iterator r3 = r3.iterator()
        L13:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L40
            java.lang.Object r4 = r3.next()
            java.util.zip.ZipEntry r4 = (java.util.zip.ZipEntry) r4
            java.lang.String r0 = r4.getName()
            java.lang.String r1 = r4.getName()
            java.lang.String r2 = java.io.File.separator
            int r1 = r1.lastIndexOf(r2)
            int r1 = r1 + 1
            java.lang.String r0 = r0.substring(r1)
            boolean r1 = r6.contains(r0)
            if (r1 != 0) goto L13
            r5.add(r4)
            r6.add(r0)
            goto L13
        L40:
            return
    }

    private static void j(java.util.zip.ZipFile r6, java.util.zip.ZipEntry r7, java.io.File r8) throws java.io.IOException {
            java.lang.String r0 = r7.getName()
            java.lang.String r1 = ".."
            boolean r1 = r0.contains(r1)
            if (r1 == 0) goto Ld
            goto L5a
        Ld:
            java.lang.String r1 = java.io.File.separator
            int r1 = r0.lastIndexOf(r1)
            r2 = 1
            int r1 = r1 + r2
            java.lang.String r0 = r0.substring(r1)
            java.io.File r1 = new java.io.File
            r1.<init>(r8, r0)
            r8 = 0
            r0 = 0
        L20:
            boolean r3 = r1.exists()
            if (r3 == 0) goto L29
            r1.delete()
        L29:
            java.lang.String r3 = "Zeus/install_pangle"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L52
            java.lang.String r5 = "NativeLibHelper copySoZipEntry, soZipEntry="
            r4.<init>(r5)     // Catch: java.io.IOException -> L52
            r4.append(r7)     // Catch: java.io.IOException -> L52
            java.lang.String r5 = ", targetSoFile="
            r4.append(r5)     // Catch: java.io.IOException -> L52
            r4.append(r1)     // Catch: java.io.IOException -> L52
            java.lang.String r4 = r4.toString()     // Catch: java.io.IOException -> L52
            com.bytedance.pangle.log.ZeusLogger.i(r3, r4)     // Catch: java.io.IOException -> L52
            java.io.InputStream r3 = r6.getInputStream(r7)     // Catch: java.io.IOException -> L52
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch: java.io.IOException -> L52
            r4.<init>(r1)     // Catch: java.io.IOException -> L52
            com.bytedance.pangle.util.ae.j(r3, r4)     // Catch: java.io.IOException -> L52
            r0 = 1
            goto L58
        L52:
            r3 = move-exception
            r4 = 3
            if (r8 >= r4) goto L5b
            int r8 = r8 + 1
        L58:
            if (r0 == 0) goto L20
        L5a:
            return
        L5b:
            throw r3
    }

    private static void j(org.json.JSONObject r0, java.lang.String r1, java.lang.String r2) {
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L4
            return
        L4:
            r0 = move-exception
            com.bytedance.sdk.openadsdk.api.m.j(r0)
            return
    }

    private static boolean j(java.util.Map<java.lang.String, java.util.List<java.util.zip.ZipEntry>> r3, java.lang.String r4) {
            java.lang.String r0 = "armeabi"
            boolean r1 = android.text.TextUtils.equals(r4, r0)
            java.lang.String r2 = "armeabi-v7a"
            if (r1 != 0) goto L16
            boolean r1 = android.text.TextUtils.equals(r4, r2)
            if (r1 == 0) goto L11
            goto L16
        L11:
            boolean r3 = r3.containsKey(r4)
            return r3
        L16:
            boolean r4 = r3.containsKey(r0)
            if (r4 != 0) goto L25
            boolean r3 = r3.containsKey(r2)
            if (r3 == 0) goto L23
            goto L25
        L23:
            r3 = 0
            return r3
        L25:
            r3 = 1
            return r3
    }

    private static org.json.JSONObject r() {
            java.lang.String r0 = "0"
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.lang.String r2 = "primaryCpuAbi"
            r1.put(r2, r0)     // Catch: org.json.JSONException -> L30
            java.lang.String r2 = "processMode"
            r1.put(r2, r0)     // Catch: org.json.JSONException -> L30
            java.lang.String r2 = "supportedABI0"
            r1.put(r2, r0)     // Catch: org.json.JSONException -> L30
            java.lang.String r2 = "matchCpuAbi"
            r1.put(r2, r0)     // Catch: org.json.JSONException -> L30
            java.lang.String r2 = "defaultABI0"
            r1.put(r2, r0)     // Catch: org.json.JSONException -> L30
            java.lang.String r2 = "defaultABI"
            r1.put(r2, r0)     // Catch: org.json.JSONException -> L30
            java.lang.String r2 = "autoError"
            r1.put(r2, r0)     // Catch: org.json.JSONException -> L30
            java.lang.String r2 = "manualError"
            r1.put(r2, r0)     // Catch: org.json.JSONException -> L30
            return r1
        L30:
            r0 = move-exception
            com.bytedance.sdk.openadsdk.api.m.j(r0)
            return r1
    }

    public static int xt() {
            java.lang.String r0 = j()
            java.util.Map<java.lang.String, java.lang.Integer> r1 = com.bytedance.pangle.up.xt.xt
            java.lang.Object r0 = r1.get(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            return r0
    }

    private static java.lang.String xt(org.json.JSONObject r8) {
            java.lang.String r0 = "Zeus/so_pangle"
            r1 = 0
            android.app.Application r2 = com.bytedance.pangle.Zeus.getAppApplication()     // Catch: java.lang.Throwable -> L36
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch: java.lang.Throwable -> L36
            android.app.Application r3 = com.bytedance.pangle.Zeus.getAppApplication()     // Catch: java.lang.Throwable -> L36
            java.lang.String r3 = r3.getPackageName()     // Catch: java.lang.Throwable -> L36
            android.content.pm.PackageInfo r2 = r2.getPackageInfo(r3, r1)     // Catch: java.lang.Throwable -> L36
            android.content.pm.ApplicationInfo r2 = r2.applicationInfo     // Catch: java.lang.Throwable -> L36
            java.lang.String r2 = r2.sourceDir     // Catch: java.lang.Throwable -> L36
            java.util.zip.ZipFile r3 = new java.util.zip.ZipFile     // Catch: java.lang.Throwable -> L36
            java.io.File r4 = new java.io.File     // Catch: java.lang.Throwable -> L36
            r4.<init>(r2)     // Catch: java.lang.Throwable -> L36
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L36
            java.util.Map r2 = j(r3)     // Catch: java.lang.Throwable -> L36
            java.util.HashSet r4 = new java.util.HashSet     // Catch: java.lang.Throwable -> L36
            java.util.Set r2 = r2.keySet()     // Catch: java.lang.Throwable -> L36
            r4.<init>(r2)     // Catch: java.lang.Throwable -> L36
            r3.close()     // Catch: java.lang.Throwable -> L36 java.io.IOException -> L38
            goto L3d
        L36:
            r2 = move-exception
            goto L93
        L38:
            java.lang.String r2 = "NativeLibHelper inferHostAbiManual, close sourceApkZipFile error!"
            com.bytedance.pangle.log.ZeusLogger.w(r0, r2)     // Catch: java.lang.Throwable -> L36
        L3d:
            boolean r2 = com.bytedance.pangle.util.g.j()     // Catch: java.lang.Throwable -> L36
            if (r2 == 0) goto L46
            java.lang.String[] r2 = android.os.Build.SUPPORTED_ABIS     // Catch: java.lang.Throwable -> L36
            goto L4e
        L46:
            java.lang.String r2 = android.os.Build.CPU_ABI     // Catch: java.lang.Throwable -> L36
            java.lang.String r3 = android.os.Build.CPU_ABI2     // Catch: java.lang.Throwable -> L36
            java.lang.String[] r2 = new java.lang.String[]{r2, r3}     // Catch: java.lang.Throwable -> L36
        L4e:
            boolean r3 = r4.isEmpty()     // Catch: java.lang.Throwable -> L36
            if (r3 == 0) goto L71
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L36
            java.lang.String r4 = "NativeLibHelper inferHostAbiManual, host source apk .so is empty, use supportedABIs[0]="
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L36
            r4 = r2[r1]     // Catch: java.lang.Throwable -> L36
            r3.append(r4)     // Catch: java.lang.Throwable -> L36
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L36
            com.bytedance.pangle.log.ZeusLogger.w(r0, r3)     // Catch: java.lang.Throwable -> L36
            java.lang.String r3 = "supportedABI0"
            r4 = r2[r1]     // Catch: java.lang.Throwable -> L36
            j(r8, r3, r4)     // Catch: java.lang.Throwable -> L36
            r8 = r2[r1]     // Catch: java.lang.Throwable -> L36
            return r8
        L71:
            int r3 = r2.length     // Catch: java.lang.Throwable -> L36
            r5 = 0
        L73:
            if (r5 >= r3) goto L9f
            r6 = r2[r5]     // Catch: java.lang.Throwable -> L36
            boolean r7 = r4.contains(r6)     // Catch: java.lang.Throwable -> L36
            if (r7 == 0) goto L90
            java.lang.String r2 = "NativeLibHelper inferHostAbiManual, match cpuAbi="
            java.lang.String r3 = java.lang.String.valueOf(r6)     // Catch: java.lang.Throwable -> L36
            java.lang.String r2 = r2.concat(r3)     // Catch: java.lang.Throwable -> L36
            com.bytedance.pangle.log.ZeusLogger.w(r0, r2)     // Catch: java.lang.Throwable -> L36
            java.lang.String r2 = "matchCpuAbi"
            j(r8, r2, r6)     // Catch: java.lang.Throwable -> L36
            return r6
        L90:
            int r5 = r5 + 1
            goto L73
        L93:
            java.lang.String r3 = "NativeLibHelper inferHostAbiManual failed!"
            com.bytedance.pangle.log.ZeusLogger.errReport(r0, r3, r2)
            java.lang.String r0 = "manualError"
            java.lang.String r2 = "1"
            j(r8, r0, r2)
        L9f:
            boolean r0 = com.bytedance.pangle.util.g.j()
            if (r0 == 0) goto Lb1
            java.lang.String[] r0 = android.os.Build.SUPPORTED_ABIS
            r2 = r0[r1]
            java.lang.String r3 = "defaultABI0"
            j(r8, r3, r2)
            r8 = r0[r1]
            return r8
        Lb1:
            java.lang.String r0 = android.os.Build.CPU_ABI
            java.lang.String r1 = "defaultABI"
            j(r8, r1, r0)
            return r0
    }

    public static boolean xt(java.io.File r7) {
            java.lang.String r0 = "NativeLibHelper hasNativeLib, close sourceApkZipFile error!"
            java.lang.String r1 = "Zeus/so_pangle"
            r2 = 0
            r3 = 0
            java.util.zip.ZipFile r4 = new java.util.zip.ZipFile     // Catch: java.lang.Throwable -> L4c java.io.IOException -> L4e
            r4.<init>(r7)     // Catch: java.lang.Throwable -> L4c java.io.IOException -> L4e
            java.util.Enumeration r7 = r4.entries()     // Catch: java.lang.Throwable -> L3e java.io.IOException -> L41
            java.lang.String r3 = "^lib/[^/]+/lib[^/]+.so$"
            java.util.regex.Pattern r3 = java.util.regex.Pattern.compile(r3)     // Catch: java.lang.Throwable -> L3e java.io.IOException -> L41
        L15:
            boolean r5 = r7.hasMoreElements()     // Catch: java.lang.Throwable -> L3e java.io.IOException -> L41
            if (r5 == 0) goto L44
            java.lang.Object r5 = r7.nextElement()     // Catch: java.lang.Throwable -> L3e java.io.IOException -> L41
            java.util.zip.ZipEntry r5 = (java.util.zip.ZipEntry) r5     // Catch: java.lang.Throwable -> L3e java.io.IOException -> L41
            boolean r6 = r5.isDirectory()     // Catch: java.lang.Throwable -> L3e java.io.IOException -> L41
            if (r6 != 0) goto L15
            java.lang.String r5 = r5.getName()     // Catch: java.lang.Throwable -> L3e java.io.IOException -> L41
            java.util.regex.Matcher r5 = r3.matcher(r5)     // Catch: java.lang.Throwable -> L3e java.io.IOException -> L41
            boolean r5 = r5.matches()     // Catch: java.lang.Throwable -> L3e java.io.IOException -> L41
            if (r5 == 0) goto L15
            r4.close()     // Catch: java.io.IOException -> L39
            goto L3c
        L39:
            com.bytedance.pangle.log.ZeusLogger.w(r1, r0)
        L3c:
            r7 = 1
            return r7
        L3e:
            r7 = move-exception
            r3 = r4
            goto L5e
        L41:
            r7 = move-exception
            r3 = r4
            goto L4f
        L44:
            r4.close()     // Catch: java.io.IOException -> L48
            goto L4b
        L48:
            com.bytedance.pangle.log.ZeusLogger.w(r1, r0)
        L4b:
            return r2
        L4c:
            r7 = move-exception
            goto L5e
        L4e:
            r7 = move-exception
        L4f:
            java.lang.String r4 = "NativeLibHelper hasNativeLib, get sourceApk ZipFile failed!"
            com.bytedance.pangle.log.ZeusLogger.errReport(r1, r4, r7)     // Catch: java.lang.Throwable -> L4c
            if (r3 == 0) goto L5d
            r3.close()     // Catch: java.io.IOException -> L5a
            goto L5d
        L5a:
            com.bytedance.pangle.log.ZeusLogger.w(r1, r0)
        L5d:
            return r2
        L5e:
            if (r3 == 0) goto L67
            r3.close()     // Catch: java.io.IOException -> L64
            goto L67
        L64:
            com.bytedance.pangle.log.ZeusLogger.w(r1, r0)
        L67:
            throw r7
    }
}

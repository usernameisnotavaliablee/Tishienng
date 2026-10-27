package com.kuaishou.weapon.p0;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class di {
    public di() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String a() {
            int r0 = android.os.Process.myPid()     // Catch: java.lang.Exception -> L19
            java.lang.String r1 = " lsof -p %1$s "
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Exception -> L19
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L19
            r3 = 0
            r2[r3] = r0     // Catch: java.lang.Exception -> L19
            java.lang.String r0 = java.lang.String.format(r1, r2)     // Catch: java.lang.Exception -> L19
            java.lang.String r0 = b(r0)     // Catch: java.lang.Exception -> L19
            return r0
        L19:
            r0 = 0
            return r0
    }

    public static java.lang.String a(java.lang.String r4) {
            java.lang.String r0 = ""
            r1 = 0
            java.lang.Runtime r2 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L3c
            java.lang.Process r4 = r2.exec(r4)     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L3c
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L3c
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L3c
            java.io.InputStream r4 = r4.getInputStream()     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L3c
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L3c
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L3c
            java.lang.String r4 = r2.readLine()     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L32
            if (r4 == 0) goto L34
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L32
            r1.<init>()     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L32
            r1.append(r0)     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L32
            r1.append(r4)     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L32
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L32
            goto L34
        L2f:
            r4 = move-exception
            r1 = r2
            goto L3e
        L32:
            goto L38
        L34:
            r2.close()     // Catch: java.lang.Exception -> L37
        L37:
            return r0
        L38:
            r1 = r2
            goto L44
        L3a:
            r4 = move-exception
            goto L3e
        L3c:
            goto L44
        L3e:
            if (r1 == 0) goto L43
            r1.close()     // Catch: java.lang.Exception -> L43
        L43:
            throw r4
        L44:
            if (r1 == 0) goto L49
            r1.close()     // Catch: java.lang.Exception -> L49
        L49:
            return r0
    }

    public static java.lang.String b() {
            java.lang.String r0 = " pidof adbd "
            java.lang.String r0 = a(r0)     // Catch: java.lang.Exception -> L1a
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> L1a
            if (r1 != 0) goto L1a
            int r1 = r0.length()     // Catch: java.lang.Exception -> L1a
            r2 = 10
            if (r1 <= r2) goto L19
            r1 = 0
            java.lang.String r0 = r0.substring(r1, r2)     // Catch: java.lang.Exception -> L1a
        L19:
            return r0
        L1a:
            r0 = 0
            return r0
    }

    private static java.lang.String b(java.lang.String r3) {
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Exception -> L49
            java.lang.Process r3 = r0.exec(r3)     // Catch: java.lang.Exception -> L49
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch: java.lang.Exception -> L49
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch: java.lang.Exception -> L49
            java.io.InputStream r3 = r3.getInputStream()     // Catch: java.lang.Exception -> L49
            r1.<init>(r3)     // Catch: java.lang.Exception -> L49
            r0.<init>(r1)     // Catch: java.lang.Exception -> L49
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Exception -> L49
            r3.<init>()     // Catch: java.lang.Exception -> L49
        L1b:
            java.lang.String r1 = r0.readLine()     // Catch: java.lang.Exception -> L49
            if (r1 == 0) goto L3b
            java.lang.String r2 = "TCP"
            boolean r2 = r1.contains(r2)     // Catch: java.lang.Exception -> L49
            if (r2 == 0) goto L34
            java.lang.String r2 = ":443"
            boolean r2 = r1.contains(r2)     // Catch: java.lang.Exception -> L49
            if (r2 != 0) goto L34
            r3.add(r1)     // Catch: java.lang.Exception -> L49
        L34:
            int r1 = r3.size()     // Catch: java.lang.Exception -> L49
            r2 = 5
            if (r1 <= r2) goto L1b
        L3b:
            r0.close()     // Catch: java.lang.Exception -> L49
            int r0 = r3.size()     // Catch: java.lang.Exception -> L49
            if (r0 <= 0) goto L49
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> L49
            return r3
        L49:
            r3 = 0
            return r3
    }

    public static java.util.Set c() {
            r0 = 0
            java.util.HashSet r1 = new java.util.HashSet     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L56
            r1.<init>()     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L56
            java.lang.String r2 = " netstat -nap "
            java.lang.Runtime r3 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L56
            java.lang.Process r2 = r3.exec(r2)     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L56
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L56
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L56
            java.io.InputStream r2 = r2.getInputStream()     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L56
            r4.<init>(r2)     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L56
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L56
        L1e:
            java.lang.String r2 = r3.readLine()     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L42
            if (r2 == 0) goto L44
            java.lang.String r4 = "tcp"
            boolean r4 = r2.contains(r4)     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L42
            if (r4 == 0) goto L1e
            java.lang.String r4 = "ESTABLISHED"
            boolean r4 = r2.contains(r4)     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L42
            if (r4 == 0) goto L1e
            java.lang.String r4 = ":5555 "
            boolean r4 = r2.contains(r4)     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L42
            if (r4 == 0) goto L1e
            r1.add(r2)     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L42
            goto L1e
        L40:
            r0 = move-exception
            goto L58
        L42:
            goto L5f
        L44:
            int r2 = r1.size()     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L42
            if (r2 <= 0) goto L4e
            r3.close()     // Catch: java.lang.Exception -> L4d
        L4d:
            return r1
        L4e:
            r3.close()     // Catch: java.lang.Exception -> L62
            goto L62
        L52:
            r1 = move-exception
            r3 = r0
            r0 = r1
            goto L58
        L56:
            goto L5e
        L58:
            if (r3 == 0) goto L5d
            r3.close()     // Catch: java.lang.Exception -> L5d
        L5d:
            throw r0
        L5e:
            r3 = r0
        L5f:
            if (r3 == 0) goto L62
            goto L4e
        L62:
            return r0
    }

    public static int d() {
            r0 = 0
            r1 = 0
            java.lang.String r2 = " netstat -apn | grep scrcpy "
            java.lang.Runtime r3 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3a
            java.lang.Process r2 = r3.exec(r2)     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3a
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3a
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3a
            java.io.InputStream r2 = r2.getInputStream()     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3a
            r4.<init>(r2)     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3a
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3a
        L1a:
            java.lang.String r1 = r3.readLine()     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L30
            if (r1 == 0) goto L32
            java.lang.String r2 = "scrcpy"
            boolean r1 = r1.contains(r2)     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L30
            if (r1 == 0) goto L1a
            r3.close()     // Catch: java.lang.Exception -> L2b
        L2b:
            r0 = 1
            return r0
        L2d:
            r0 = move-exception
            r1 = r3
            goto L3c
        L30:
            goto L36
        L32:
            r3.close()     // Catch: java.lang.Exception -> L35
        L35:
            return r0
        L36:
            r1 = r3
            goto L42
        L38:
            r0 = move-exception
            goto L3c
        L3a:
            goto L42
        L3c:
            if (r1 == 0) goto L41
            r1.close()     // Catch: java.lang.Exception -> L41
        L41:
            throw r0
        L42:
            if (r1 == 0) goto L47
            r1.close()     // Catch: java.lang.Exception -> L47
        L47:
            return r0
    }

    public static org.json.JSONObject e() {
            java.lang.String r0 = "/"
            r1 = 0
            java.lang.String r2 = " netstat -an "
            java.lang.Runtime r3 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Throwable -> L9f java.lang.Exception -> La1
            java.lang.Process r2 = r3.exec(r2)     // Catch: java.lang.Throwable -> L9f java.lang.Exception -> La1
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L9f java.lang.Exception -> La1
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L9f java.lang.Exception -> La1
            java.io.InputStream r2 = r2.getInputStream()     // Catch: java.lang.Throwable -> L9f java.lang.Exception -> La1
            r4.<init>(r2)     // Catch: java.lang.Throwable -> L9f java.lang.Exception -> La1
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L9f java.lang.Exception -> La1
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L39
            r2.<init>()     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L39
        L20:
            java.lang.String r4 = r3.readLine()     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L39
            if (r4 == 0) goto L91
            boolean r5 = r4.contains(r0)     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L39
            java.lang.String r6 = "@"
            if (r5 != 0) goto L3c
            boolean r5 = r4.contains(r6)     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L39
            if (r5 == 0) goto L20
            goto L3c
        L35:
            r0 = move-exception
            r1 = r3
            goto La3
        L39:
            goto Laa
        L3c:
            boolean r5 = r4.contains(r0)     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L39
            if (r5 == 0) goto L4b
            int r5 = r4.indexOf(r0)     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L39
            java.lang.String r4 = r4.substring(r5)     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L39
            goto L59
        L4b:
            boolean r5 = r4.contains(r6)     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L39
            if (r5 == 0) goto L59
            int r5 = r4.indexOf(r6)     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L39
            java.lang.String r4 = r4.substring(r5)     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L39
        L59:
            java.lang.String r5 = "/ddy"
            boolean r5 = r4.contains(r5)     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L39
            if (r5 == 0) goto L67
            java.lang.String r5 = "0"
            r2.put(r5, r4)     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L39
            goto L20
        L67:
            java.lang.String r5 = "scrcpy"
            boolean r5 = r4.contains(r5)     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L39
            if (r5 == 0) goto L75
            java.lang.String r5 = "1"
            r2.put(r5, r4)     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L39
            goto L20
        L75:
            java.lang.String r5 = "supersu"
            boolean r5 = r4.contains(r5)     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L39
            if (r5 == 0) goto L83
            java.lang.String r5 = "2"
            r2.put(r5, r4)     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L39
            goto L20
        L83:
            java.lang.String r5 = "/adbd"
            boolean r5 = r4.contains(r5)     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L39
            if (r5 == 0) goto L20
            java.lang.String r5 = "3"
            r2.put(r5, r4)     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L39
            goto L20
        L91:
            int r0 = r2.length()     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L39
            if (r0 <= 0) goto L9b
            r3.close()     // Catch: java.lang.Exception -> L9a
        L9a:
            return r2
        L9b:
            r3.close()     // Catch: java.lang.Exception -> L9e
        L9e:
            return r1
        L9f:
            r0 = move-exception
            goto La3
        La1:
            goto La9
        La3:
            if (r1 == 0) goto La8
            r1.close()     // Catch: java.lang.Exception -> La8
        La8:
            throw r0
        La9:
            r3 = r1
        Laa:
            if (r3 == 0) goto Laf
            r3.close()     // Catch: java.lang.Exception -> Laf
        Laf:
            return r1
    }
}

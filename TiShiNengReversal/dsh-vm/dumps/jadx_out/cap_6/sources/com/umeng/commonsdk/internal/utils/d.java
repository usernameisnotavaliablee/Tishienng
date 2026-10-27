package com.umeng.commonsdk.internal.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class d {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class a {
        public java.lang.String a;
        public java.lang.String b;
        public int c;
        public java.lang.String d;
        public java.lang.String e;
        public java.lang.String f;
        public java.lang.String g;
        public java.lang.String h;
        public java.lang.String i;
        public java.lang.String j;
        public java.lang.String k;
        public java.lang.String l;

        public a() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public d() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.umeng.commonsdk.internal.utils.d.a a() {
            r0 = 0
            r1 = 0
            com.umeng.commonsdk.internal.utils.d$a r2 = new com.umeng.commonsdk.internal.utils.d$a     // Catch: java.lang.Throwable -> L128 java.lang.Exception -> L12f
            r2.<init>()     // Catch: java.lang.Throwable -> L128 java.lang.Exception -> L12f
            java.io.FileReader r3 = new java.io.FileReader     // Catch: java.lang.Throwable -> L128 java.lang.Exception -> L12c
            java.lang.String r4 = "/proc/cpuinfo"
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L128 java.lang.Exception -> L12c
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L121 java.lang.Exception -> L125
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L121 java.lang.Exception -> L125
            java.lang.String r0 = r4.readLine()     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L11e
            r5 = 1
            r6 = 0
            r7 = 1
            r8 = 0
        L1b:
            boolean r9 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3f
            if (r9 != 0) goto L117
            int r6 = r6 + r5
            r9 = 30
            if (r6 < r9) goto L28
            goto L117
        L28:
            java.lang.String r9 = ":\\s+"
            r10 = 2
            java.lang.String[] r0 = r0.split(r9, r10)     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3f
            if (r7 == 0) goto L44
            if (r0 == 0) goto L44
            int r9 = r0.length     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3f
            if (r9 <= r5) goto L44
            r7 = r0[r5]     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3f
            r2.a = r7     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3f
            r7 = 0
            goto L44
        L3c:
            r0 = move-exception
            goto L133
        L3f:
            r0 = r3
            r1 = r8
            goto L140
        L44:
            if (r0 == 0) goto L55
            int r9 = r0.length     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3f
            if (r9 <= r5) goto L55
            r9 = r0[r1]     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3f
            java.lang.String r10 = "processor"
            boolean r9 = r9.contains(r10)     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3f
            if (r9 == 0) goto L55
            int r8 = r8 + 1
        L55:
            if (r0 == 0) goto L68
            int r9 = r0.length     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3f
            if (r9 <= r5) goto L68
            r9 = r0[r1]     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3f
            java.lang.String r10 = "Features"
            boolean r9 = r9.contains(r10)     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3f
            if (r9 == 0) goto L68
            r9 = r0[r5]     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3f
            r2.d = r9     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3f
        L68:
            java.lang.String r9 = "implementer"
            if (r0 == 0) goto L7b
            int r10 = r0.length     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3f
            if (r10 <= r5) goto L7b
            r10 = r0[r1]     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3f
            boolean r10 = r10.contains(r9)     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3f
            if (r10 == 0) goto L7b
            r10 = r0[r5]     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3f
            r2.e = r10     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3f
        L7b:
            if (r0 == 0) goto L8e
            int r10 = r0.length     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3f
            if (r10 <= r5) goto L8e
            r10 = r0[r1]     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3f
            java.lang.String r11 = "architecture"
            boolean r10 = r10.contains(r11)     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3f
            if (r10 == 0) goto L8e
            r10 = r0[r5]     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3f
            r2.f = r10     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3f
        L8e:
            if (r0 == 0) goto La1
            int r10 = r0.length     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3f
            if (r10 <= r5) goto La1
            r10 = r0[r1]     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3f
            java.lang.String r11 = "variant"
            boolean r10 = r10.contains(r11)     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3f
            if (r10 == 0) goto La1
            r10 = r0[r5]     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3f
            r2.g = r10     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3f
        La1:
            if (r0 == 0) goto Lb4
            int r10 = r0.length     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3f
            if (r10 <= r5) goto Lb4
            r10 = r0[r1]     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3f
            java.lang.String r11 = "part"
            boolean r10 = r10.contains(r11)     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3f
            if (r10 == 0) goto Lb4
            r10 = r0[r5]     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3f
            r2.h = r10     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3f
        Lb4:
            if (r0 == 0) goto Lc7
            int r10 = r0.length     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3f
            if (r10 <= r5) goto Lc7
            r10 = r0[r1]     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3f
            java.lang.String r11 = "revision"
            boolean r10 = r10.contains(r11)     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3f
            if (r10 == 0) goto Lc7
            r10 = r0[r5]     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3f
            r2.i = r10     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3f
        Lc7:
            if (r0 == 0) goto Lda
            int r10 = r0.length     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3f
            if (r10 <= r5) goto Lda
            r10 = r0[r1]     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3f
            java.lang.String r11 = "Hardware"
            boolean r10 = r10.contains(r11)     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3f
            if (r10 == 0) goto Lda
            r10 = r0[r5]     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3f
            r2.j = r10     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3f
        Lda:
            if (r0 == 0) goto Led
            int r10 = r0.length     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3f
            if (r10 <= r5) goto Led
            r10 = r0[r1]     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3f
            java.lang.String r11 = "Revision"
            boolean r10 = r10.contains(r11)     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3f
            if (r10 == 0) goto Led
            r10 = r0[r5]     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3f
            r2.k = r10     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3f
        Led:
            if (r0 == 0) goto L100
            int r10 = r0.length     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3f
            if (r10 <= r5) goto L100
            r10 = r0[r1]     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3f
            java.lang.String r11 = "Serial"
            boolean r10 = r10.contains(r11)     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3f
            if (r10 == 0) goto L100
            r10 = r0[r5]     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3f
            r2.l = r10     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3f
        L100:
            if (r0 == 0) goto L111
            int r10 = r0.length     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3f
            if (r10 <= r5) goto L111
            r10 = r0[r1]     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3f
            boolean r9 = r10.contains(r9)     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3f
            if (r9 == 0) goto L111
            r0 = r0[r5]     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3f
            r2.e = r0     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3f
        L111:
            java.lang.String r0 = r4.readLine()     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3f
            goto L1b
        L117:
            r3.close()     // Catch: java.io.IOException -> L11a
        L11a:
            r4.close()     // Catch: java.io.IOException -> L14d
            goto L14d
        L11e:
        L11f:
            r0 = r3
            goto L140
        L121:
            r1 = move-exception
            r4 = r0
        L123:
            r0 = r1
            goto L133
        L125:
            r4 = r0
            goto L11f
        L128:
            r1 = move-exception
            r3 = r0
            r4 = r3
            goto L123
        L12c:
            r4 = r0
            goto L140
        L12f:
            r2 = r0
            r4 = r2
            goto L140
        L133:
            if (r3 == 0) goto L13a
            r3.close()     // Catch: java.io.IOException -> L139
            goto L13a
        L139:
        L13a:
            if (r4 == 0) goto L13f
            r4.close()     // Catch: java.io.IOException -> L13f
        L13f:
            throw r0
        L140:
            if (r0 == 0) goto L147
            r0.close()     // Catch: java.io.IOException -> L146
            goto L147
        L146:
        L147:
            if (r4 == 0) goto L14c
            r4.close()     // Catch: java.io.IOException -> L14c
        L14c:
            r8 = r1
        L14d:
            r2.c = r8
            return r2
    }

    public static java.lang.String b() {
            java.lang.String r0 = ""
            java.lang.String r1 = "/system/bin/cat"
            java.lang.String r2 = "/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq"
            java.lang.String[] r1 = new java.lang.String[]{r1, r2}     // Catch: java.lang.Exception -> L3a
            java.lang.ProcessBuilder r2 = new java.lang.ProcessBuilder     // Catch: java.lang.Exception -> L3a
            r2.<init>(r1)     // Catch: java.lang.Exception -> L3a
            java.lang.Process r1 = r2.start()     // Catch: java.lang.Exception -> L3a
            java.io.InputStream r1 = r1.getInputStream()     // Catch: java.lang.Exception -> L3a
            r2 = 24
            byte[] r2 = new byte[r2]     // Catch: java.lang.Exception -> L3a
        L1b:
            int r3 = r1.read(r2)     // Catch: java.lang.Exception -> L3a
            r4 = -1
            if (r3 == r4) goto L37
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L3a
            r3.<init>()     // Catch: java.lang.Exception -> L3a
            r3.append(r0)     // Catch: java.lang.Exception -> L3a
            java.lang.String r4 = new java.lang.String     // Catch: java.lang.Exception -> L3a
            r4.<init>(r2)     // Catch: java.lang.Exception -> L3a
            r3.append(r4)     // Catch: java.lang.Exception -> L3a
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Exception -> L3a
            goto L1b
        L37:
            r1.close()     // Catch: java.lang.Exception -> L3a
        L3a:
            java.lang.String r0 = r0.trim()
            return r0
    }

    public static java.lang.String c() {
            java.lang.String r0 = ""
            java.lang.String r1 = "/system/bin/cat"
            java.lang.String r2 = "/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_min_freq"
            java.lang.String[] r1 = new java.lang.String[]{r1, r2}     // Catch: java.lang.Exception -> L3a
            java.lang.ProcessBuilder r2 = new java.lang.ProcessBuilder     // Catch: java.lang.Exception -> L3a
            r2.<init>(r1)     // Catch: java.lang.Exception -> L3a
            java.lang.Process r1 = r2.start()     // Catch: java.lang.Exception -> L3a
            java.io.InputStream r1 = r1.getInputStream()     // Catch: java.lang.Exception -> L3a
            r2 = 24
            byte[] r2 = new byte[r2]     // Catch: java.lang.Exception -> L3a
        L1b:
            int r3 = r1.read(r2)     // Catch: java.lang.Exception -> L3a
            r4 = -1
            if (r3 == r4) goto L37
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L3a
            r3.<init>()     // Catch: java.lang.Exception -> L3a
            r3.append(r0)     // Catch: java.lang.Exception -> L3a
            java.lang.String r4 = new java.lang.String     // Catch: java.lang.Exception -> L3a
            r4.<init>(r2)     // Catch: java.lang.Exception -> L3a
            r3.append(r4)     // Catch: java.lang.Exception -> L3a
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Exception -> L3a
            goto L1b
        L37:
            r1.close()     // Catch: java.lang.Exception -> L3a
        L3a:
            java.lang.String r0 = r0.trim()
            return r0
    }

    public static java.lang.String d() {
            r0 = 0
            java.io.FileReader r1 = new java.io.FileReader     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L22
            java.lang.String r2 = "/sys/devices/system/cpu/cpu0/cpufreq/scaling_cur_freq"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L22
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L22
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L22
            java.lang.String r0 = r2.readLine()     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1b
            java.lang.String r0 = r0.trim()     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1b
            r2.close()     // Catch: java.lang.Throwable -> L31
            goto L31
        L19:
            r0 = move-exception
            goto L24
        L1b:
            r0 = r2
            goto L2a
        L1e:
            r1 = move-exception
            r2 = r0
            r0 = r1
            goto L24
        L22:
            goto L2a
        L24:
            if (r2 == 0) goto L29
            r2.close()     // Catch: java.lang.Throwable -> L29
        L29:
            throw r0
        L2a:
            if (r0 == 0) goto L2f
            r0.close()     // Catch: java.lang.Throwable -> L2f
        L2f:
            java.lang.String r0 = ""
        L31:
            return r0
    }
}

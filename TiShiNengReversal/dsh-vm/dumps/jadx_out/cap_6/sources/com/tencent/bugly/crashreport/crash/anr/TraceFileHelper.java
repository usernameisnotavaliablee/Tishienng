package com.tencent.bugly.crashreport.crash.anr;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class TraceFileHelper {



    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class a {
        public long a;
        public java.lang.String b;
        public long c;
        public java.util.Map<java.lang.String, java.lang.String[]> d;

        public a() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface b {
        boolean a(long r1);

        boolean a(long r1, long r3, java.lang.String r5);

        boolean a(java.lang.String r1, int r2, java.lang.String r3, java.lang.String r4);
    }

    public TraceFileHelper() {
            r0 = this;
            r0.<init>()
            return
    }

    private static java.lang.String a(java.io.BufferedReader r4) throws java.io.IOException {
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            r1 = 0
        L6:
            r2 = 3
            if (r1 >= r2) goto L28
            java.lang.String r2 = r4.readLine()
            if (r2 != 0) goto L11
            r4 = 0
            return r4
        L11:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            java.lang.String r2 = "\n"
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r0.append(r2)
            int r1 = r1 + 1
            goto L6
        L28:
            java.lang.String r4 = r0.toString()
            return r4
    }

    private static java.lang.Object[] a(java.io.BufferedReader r6, java.util.regex.Pattern... r7) throws java.io.IOException {
        L0:
            java.lang.String r0 = r6.readLine()
            if (r0 == 0) goto L23
            int r1 = r7.length
            r2 = 0
            r3 = 0
        L9:
            if (r3 >= r1) goto L0
            r4 = r7[r3]
            java.util.regex.Matcher r5 = r4.matcher(r0)
            boolean r5 = r5.matches()
            if (r5 == 0) goto L20
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r6[r2] = r4
            r7 = 1
            r6[r7] = r0
            return r6
        L20:
            int r3 = r3 + 1
            goto L9
        L23:
            r6 = 0
            return r6
    }

    private static java.lang.String b(java.io.BufferedReader r3) throws java.io.IOException {
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
        L5:
            java.lang.String r1 = r3.readLine()
            if (r1 == 0) goto L2a
            java.lang.String r2 = r1.trim()
            int r2 = r2.length()
            if (r2 <= 0) goto L2a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = "\n"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.append(r1)
            goto L5
        L2a:
            java.lang.String r3 = r0.toString()
            return r3
    }

    public static com.tencent.bugly.crashreport.crash.anr.TraceFileHelper.a readFirstDumpInfo(java.lang.String r7, boolean r8) {
            r0 = 0
            r1 = 1
            r2 = 0
            if (r7 != 0) goto Lf
            java.lang.Object[] r8 = new java.lang.Object[r1]
            r8[r0] = r7
            java.lang.String r7 = "path:%s"
            com.tencent.bugly.proguard.al.e(r7, r8)
            return r2
        Lf:
            com.tencent.bugly.crashreport.crash.anr.TraceFileHelper$a r3 = new com.tencent.bugly.crashreport.crash.anr.TraceFileHelper$a
            r3.<init>()
            com.tencent.bugly.crashreport.crash.anr.TraceFileHelper$2 r4 = new com.tencent.bugly.crashreport.crash.anr.TraceFileHelper$2
            r4.<init>(r3, r8)
            readTraceFile(r7, r4)
            long r7 = r3.a
            r4 = 0
            int r6 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r6 <= 0) goto L2f
            long r7 = r3.c
            int r6 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r6 <= 0) goto L2f
            java.lang.String r7 = r3.b
            if (r7 == 0) goto L2f
            return r3
        L2f:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            long r4 = r3.a
            r7.append(r4)
            java.lang.String r8 = " "
            r7.append(r8)
            long r4 = r3.c
            r7.append(r4)
            r7.append(r8)
            java.lang.String r8 = r3.b
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.lang.Object[] r8 = new java.lang.Object[r1]
            r8[r0] = r7
            java.lang.String r7 = "first dump error %s"
            com.tencent.bugly.proguard.al.e(r7, r8)
            return r2
    }

    public static com.tencent.bugly.crashreport.crash.anr.TraceFileHelper.a readTargetDumpInfo(java.lang.String r4, java.lang.String r5, boolean r6) {
            r0 = 0
            if (r4 == 0) goto L26
            if (r5 != 0) goto L6
            goto L26
        L6:
            com.tencent.bugly.crashreport.crash.anr.TraceFileHelper$a r1 = new com.tencent.bugly.crashreport.crash.anr.TraceFileHelper$a
            r1.<init>()
            com.tencent.bugly.crashreport.crash.anr.TraceFileHelper$1 r2 = new com.tencent.bugly.crashreport.crash.anr.TraceFileHelper$1
            r2.<init>(r1, r4, r6)
            readTraceFile(r5, r2)
            long r4 = r1.a
            r2 = 0
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 <= 0) goto L26
            long r4 = r1.c
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 <= 0) goto L26
            java.lang.String r4 = r1.b
            if (r4 == 0) goto L26
            return r1
        L26:
            return r0
    }

    public static void readTraceFile(java.lang.String r16, com.tencent.bugly.crashreport.crash.anr.TraceFileHelper.b r17) {
            r0 = r16
            java.lang.String r6 = "\\s"
            if (r0 == 0) goto L17f
            if (r17 != 0) goto La
            goto L17f
        La:
            java.io.File r1 = new java.io.File
            r1.<init>(r0)
            boolean r0 = r1.exists()
            if (r0 != 0) goto L17
            goto L17f
        L17:
            r1.lastModified()
            r1.length()
            r7 = 2
            r8 = 0
            r9 = 1
            r2 = 0
            java.io.BufferedReader r10 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L144 java.lang.Exception -> L147
            java.io.FileReader r0 = new java.io.FileReader     // Catch: java.lang.Throwable -> L144 java.lang.Exception -> L147
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L144 java.lang.Exception -> L147
            r10.<init>(r0)     // Catch: java.lang.Throwable -> L144 java.lang.Exception -> L147
            java.lang.String r0 = "-{5}\\spid\\s\\d+\\sat\\s\\d+-\\d+-\\d+\\s\\d{2}:\\d{2}:\\d{2}\\s-{5}"
            java.util.regex.Pattern r11 = java.util.regex.Pattern.compile(r0)     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L75
            java.lang.String r0 = "-{5}\\send\\s\\d+\\s-{5}"
            java.util.regex.Pattern r12 = java.util.regex.Pattern.compile(r0)     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L75
            java.lang.String r0 = "Cmd\\sline:\\s(\\S+)"
            java.util.regex.Pattern r13 = java.util.regex.Pattern.compile(r0)     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L75
            java.lang.String r0 = "\".+\"\\s(daemon\\s){0,1}prio=\\d+\\stid=\\d+\\s.*"
            java.util.regex.Pattern r14 = java.util.regex.Pattern.compile(r0)     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L75
            java.text.SimpleDateFormat r15 = new java.text.SimpleDateFormat     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L75
            java.lang.String r0 = "yyyy-MM-dd HH:mm:ss"
            java.util.Locale r1 = java.util.Locale.US     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L75
            r15.<init>(r0, r1)     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L75
        L4c:
            java.util.regex.Pattern[] r0 = new java.util.regex.Pattern[r9]     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L75
            r0[r8] = r11     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L75
            java.lang.Object[] r0 = a(r10, r0)     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L75
            if (r0 == 0) goto L67
            java.util.regex.Pattern[] r1 = new java.util.regex.Pattern[r9]     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L75
            r1[r8] = r13     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L75
            java.lang.Object[] r1 = a(r10, r1)     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L75
            if (r1 != 0) goto L79
            java.lang.String r0 = "Failed to find process name."
            java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L75
            com.tencent.bugly.proguard.al.d(r0, r1)     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L75
        L67:
            r10.close()     // Catch: java.io.IOException -> L6b
            return
        L6b:
            r0 = move-exception
            com.tencent.bugly.proguard.al.a(r0)
            return
        L70:
            r0 = move-exception
            r1 = r0
            r2 = r10
            goto L174
        L75:
            r0 = move-exception
            r2 = r10
            goto L148
        L79:
            r0 = r0[r9]     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L75
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L75
            java.lang.String[] r0 = r0.split(r6)     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L75
            r2 = r0[r7]     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L75
            long r2 = java.lang.Long.parseLong(r2)     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L75
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L75
            r4.<init>()     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L75
            r5 = 4
            r5 = r0[r5]     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L75
            r4.append(r5)     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L75
            java.lang.String r5 = " "
            r4.append(r5)     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L75
            r5 = 5
            r0 = r0[r5]     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L75
            r4.append(r0)     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L75
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L75
            java.util.Date r0 = r15.parse(r0)     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L75
            long r4 = r0.getTime()     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L75
            r0 = r1[r9]     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L75
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L75
            java.util.regex.Matcher r0 = r13.matcher(r0)     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L75
            r0.find()     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L75
            r0.group(r9)     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L75
            java.lang.String r0 = r0.group(r9)     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L75
            r1 = r2
            r3 = r4
            r5 = r0
            r0 = r17
            boolean r1 = r0.a(r1, r3, r5)     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L75
            if (r1 != 0) goto Lcb
            goto L67
        Lcb:
            java.util.regex.Pattern[] r1 = new java.util.regex.Pattern[r7]     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L75
            r1[r8] = r14     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L75
            r1[r9] = r12     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L75
            java.lang.Object[] r1 = a(r10, r1)     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L75
            if (r1 == 0) goto L4c
            r2 = r1[r8]     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L75
            if (r2 != r14) goto L12c
            r1 = r1[r9]     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L75
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L75
            java.lang.String r2 = "\".+\""
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L75
            java.util.regex.Matcher r2 = r2.matcher(r1)     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L75
            r2.find()     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L75
            java.lang.String r2 = r2.group()     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L75
            int r3 = r2.length()     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L75
            int r3 = r3 - r9
            java.lang.String r2 = r2.substring(r9, r3)     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L75
            java.lang.String r3 = "NATIVE"
            r1.contains(r3)     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L75
            java.lang.String r3 = "tid=\\d+"
            java.util.regex.Pattern r3 = java.util.regex.Pattern.compile(r3)     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L75
            java.util.regex.Matcher r1 = r3.matcher(r1)     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L75
            r1.find()     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L75
            java.lang.String r1 = r1.group()     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L75
            java.lang.String r3 = "="
            int r3 = r1.indexOf(r3)     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L75
            int r3 = r3 + r9
            java.lang.String r1 = r1.substring(r3)     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L75
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L75
            java.lang.String r3 = a(r10)     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L75
            java.lang.String r4 = b(r10)     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L75
            r0.a(r2, r1, r3, r4)     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L75
            goto Lcb
        L12c:
            r1 = r1[r9]     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L75
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L75
            java.lang.String[] r1 = r1.split(r6)     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L75
            r1 = r1[r7]     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L75
            long r1 = java.lang.Long.parseLong(r1)     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L75
            boolean r1 = r0.a(r1)     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L75
            if (r1 != 0) goto L4c
            goto L67
        L144:
            r0 = move-exception
            r1 = r0
            goto L174
        L147:
            r0 = move-exception
        L148:
            com.tencent.bugly.proguard.al.a(r0)     // Catch: java.lang.Throwable -> L144
            java.lang.String r1 = "trace open fail:%s : %s"
            java.lang.Class r3 = r0.getClass()     // Catch: java.lang.Throwable -> L144
            java.lang.String r3 = r3.getName()     // Catch: java.lang.Throwable -> L144
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L144
            r4.<init>()     // Catch: java.lang.Throwable -> L144
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L144
            r4.append(r0)     // Catch: java.lang.Throwable -> L144
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L144
            java.lang.Object[] r4 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> L144
            r4[r8] = r3     // Catch: java.lang.Throwable -> L144
            r4[r9] = r0     // Catch: java.lang.Throwable -> L144
            com.tencent.bugly.proguard.al.d(r1, r4)     // Catch: java.lang.Throwable -> L144
            if (r2 == 0) goto L17f
            r2.close()     // Catch: java.io.IOException -> L6b
            goto L17f
        L174:
            if (r2 == 0) goto L17e
            r2.close()     // Catch: java.io.IOException -> L17a
            goto L17e
        L17a:
            r0 = move-exception
            com.tencent.bugly.proguard.al.a(r0)
        L17e:
            throw r1
        L17f:
            return
    }
}

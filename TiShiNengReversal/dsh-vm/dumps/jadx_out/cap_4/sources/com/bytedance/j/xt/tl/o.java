package com.bytedance.j.xt.tl;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class o {

    private static class a {
        private final java.io.PrintWriter a;

        a(java.io.PrintWriter r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                return
        }

        java.lang.Object a() {
                r1 = this;
                java.io.PrintWriter r0 = r1.a
                return r0
        }

        void b(java.lang.Object r2) {
                r1 = this;
                java.io.PrintWriter r0 = r1.a
                r0.println(r2)
                return
        }
    }

    public o() {
            r1 = this;
            r1.<init>()
            return
    }

    private static boolean a(java.lang.Throwable r3) {
            r0 = 0
            r1 = 0
        L2:
            if (r3 == 0) goto L16
            boolean r2 = r3 instanceof java.lang.StackOverflowError
            if (r2 == 0) goto La
            r3 = 1
            return r3
        La:
            r2 = 20
            if (r1 <= r2) goto Lf
            return r0
        Lf:
            java.lang.Throwable r3 = r3.getCause()
            int r1 = r1 + 1
            goto L2
        L16:
            return r0
    }

    @androidx.annotation.NonNull
    public static java.lang.String b(@androidx.annotation.NonNull java.lang.Throwable r3) {
            java.io.StringWriter r0 = new java.io.StringWriter
            r0.<init>()
            java.io.PrintWriter r1 = new java.io.PrintWriter
            r1.<init>(r0)
            boolean r2 = a(r3)     // Catch: java.lang.Throwable -> L14 java.lang.Exception -> L25
            if (r2 == 0) goto L16
            g(r3, r1)     // Catch: java.lang.Throwable -> L14 java.lang.Exception -> L25
            goto L19
        L14:
            r3 = move-exception
            goto L21
        L16:
            r3.getClass()     // Catch: java.lang.Throwable -> L14 java.lang.Exception -> L25
        L19:
            java.lang.String r3 = r0.toString()     // Catch: java.lang.Throwable -> L14 java.lang.Exception -> L25
            r1.close()
            return r3
        L21:
            r1.close()
            throw r3
        L25:
            r1.close()
            java.lang.String r3 = ""
            return r3
    }

    public static java.lang.String c(java.lang.StackTraceElement[] r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r4.length
            r2 = 0
        L7:
            if (r2 >= r1) goto L11
            r3 = r4[r2]
            d(r3, r0)
            int r2 = r2 + 1
            goto L7
        L11:
            java.lang.String r4 = r0.toString()
            return r4
    }

    public static java.lang.StringBuilder d(java.lang.StackTraceElement r2, java.lang.StringBuilder r3) {
            java.lang.String r0 = r2.getClassName()
            java.lang.String r1 = "  at "
            r3.append(r1)
            r3.append(r0)
            java.lang.String r0 = "."
            r3.append(r0)
            java.lang.String r0 = r2.getMethodName()
            r3.append(r0)
            java.lang.String r0 = "("
            r3.append(r0)
            java.lang.String r0 = r2.getFileName()
            r3.append(r0)
            java.lang.String r0 = ":"
            r3.append(r0)
            int r2 = r2.getLineNumber()
            r3.append(r2)
            java.lang.String r2 = ")\n"
            r3.append(r2)
            return r3
    }

    @androidx.annotation.Nullable
    public static org.json.JSONObject e(java.lang.String r14) {
            java.lang.String r0 = ")"
            java.lang.String r1 = "("
            r2 = 0
            java.util.Map r3 = java.lang.Thread.getAllStackTraces()     // Catch: java.lang.Throwable -> Ld6
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Ld6
            r4.<init>()     // Catch: java.lang.Throwable -> Ld6
            if (r3 != 0) goto L11
            return r2
        L11:
            java.lang.String r5 = "thread_all_count"
            int r6 = r3.size()     // Catch: java.lang.Throwable -> Ld6
            r4.put(r5, r6)     // Catch: java.lang.Throwable -> Ld6
            org.json.JSONArray r5 = new org.json.JSONArray     // Catch: java.lang.Throwable -> Ld6
            r5.<init>()     // Catch: java.lang.Throwable -> Ld6
            java.util.Set r3 = r3.entrySet()     // Catch: java.lang.Throwable -> Ld6
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> Ld6
        L27:
            boolean r6 = r3.hasNext()     // Catch: java.lang.Throwable -> Ld6
            if (r6 == 0) goto Ld0
            java.lang.Object r6 = r3.next()     // Catch: java.lang.Throwable -> Ld6
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6     // Catch: java.lang.Throwable -> Ld6
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Ld6
            r7.<init>()     // Catch: java.lang.Throwable -> Ld6
            java.lang.Object r8 = r6.getKey()     // Catch: java.lang.Throwable -> Ld6
            java.lang.Thread r8 = (java.lang.Thread) r8     // Catch: java.lang.Throwable -> Ld6
            java.lang.String r9 = r8.getName()     // Catch: java.lang.Throwable -> Ld6
            boolean r10 = h(r9)     // Catch: java.lang.Throwable -> Ld6
            if (r10 != 0) goto L27
            if (r14 == 0) goto L5c
            boolean r10 = r14.equals(r9)     // Catch: java.lang.Throwable -> Ld6
            if (r10 != 0) goto L27
            boolean r10 = r9.startsWith(r14)     // Catch: java.lang.Throwable -> Ld6
            if (r10 != 0) goto L27
            boolean r9 = r9.endsWith(r14)     // Catch: java.lang.Throwable -> Ld6
            if (r9 != 0) goto L27
        L5c:
            java.lang.String r9 = "thread_name"
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld6
            r10.<init>()     // Catch: java.lang.Throwable -> Ld6
            java.lang.String r11 = r8.getName()     // Catch: java.lang.Throwable -> Ld6
            r10.append(r11)     // Catch: java.lang.Throwable -> Ld6
            r10.append(r1)     // Catch: java.lang.Throwable -> Ld6
            long r11 = r8.getId()     // Catch: java.lang.Throwable -> Ld6
            r10.append(r11)     // Catch: java.lang.Throwable -> Ld6
            r10.append(r0)     // Catch: java.lang.Throwable -> Ld6
            java.lang.String r8 = r10.toString()     // Catch: java.lang.Throwable -> Ld6
            r7.put(r9, r8)     // Catch: java.lang.Throwable -> Ld6
            java.lang.Object r6 = r6.getValue()     // Catch: java.lang.Throwable -> Ld6
            java.lang.StackTraceElement[] r6 = (java.lang.StackTraceElement[]) r6     // Catch: java.lang.Throwable -> Ld6
            if (r6 == 0) goto Lcb
            org.json.JSONArray r8 = new org.json.JSONArray     // Catch: java.lang.Throwable -> Ld6
            r8.<init>()     // Catch: java.lang.Throwable -> Ld6
            int r9 = r6.length     // Catch: java.lang.Throwable -> Ld6
            r10 = 0
        L8d:
            if (r10 >= r9) goto Lc0
            r11 = r6[r10]     // Catch: java.lang.Throwable -> Ld6
            java.lang.String r12 = r11.getClassName()     // Catch: java.lang.Throwable -> Ld6
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld6
            r13.<init>()     // Catch: java.lang.Throwable -> Ld6
            r13.append(r12)     // Catch: java.lang.Throwable -> Ld6
            java.lang.String r12 = "."
            r13.append(r12)     // Catch: java.lang.Throwable -> Ld6
            java.lang.String r12 = r11.getMethodName()     // Catch: java.lang.Throwable -> Ld6
            r13.append(r12)     // Catch: java.lang.Throwable -> Ld6
            r13.append(r1)     // Catch: java.lang.Throwable -> Ld6
            int r11 = r11.getLineNumber()     // Catch: java.lang.Throwable -> Ld6
            r13.append(r11)     // Catch: java.lang.Throwable -> Ld6
            r13.append(r0)     // Catch: java.lang.Throwable -> Ld6
            java.lang.String r11 = r13.toString()     // Catch: java.lang.Throwable -> Ld6
            r8.put(r11)     // Catch: java.lang.Throwable -> Ld6
            int r10 = r10 + 1
            goto L8d
        Lc0:
            java.lang.String r6 = "thread_stack"
            r7.put(r6, r8)     // Catch: java.lang.Throwable -> Ld6
            int r6 = r8.length()     // Catch: java.lang.Throwable -> Ld6
            if (r6 <= 0) goto L27
        Lcb:
            r5.put(r7)     // Catch: java.lang.Throwable -> Ld6
            goto L27
        Ld0:
            java.lang.String r14 = "thread_stacks"
            r4.put(r14, r5)     // Catch: java.lang.Throwable -> Ld6
            return r4
        Ld6:
            return r2
    }

    private static void f(java.lang.Throwable r7, com.bytedance.j.xt.tl.o.a r8, java.lang.StackTraceElement[] r9, java.lang.String r10, java.lang.String r11, java.util.Set<java.lang.Throwable> r12) {
            boolean r0 = r12.contains(r7)
            if (r0 == 0) goto L1d
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "\t[CIRCULAR REFERENCE:"
            r9.<init>(r10)
            r9.append(r7)
            java.lang.String r7 = "]"
            r9.append(r7)
            java.lang.String r7 = r9.toString()
            r8.b(r7)
            return
        L1d:
            r12.add(r7)
            java.lang.StackTraceElement[] r2 = r7.getStackTrace()
            int r0 = r2.length
            r1 = 256(0x100, float:3.59E-43)
            int r0 = java.lang.Math.min(r0, r1)
            int r3 = r9.length
            int r1 = java.lang.Math.min(r3, r1)
            int r3 = r0 + (-1)
            int r1 = r1 + (-1)
            r4 = r3
        L35:
            if (r4 < 0) goto L48
            if (r1 < 0) goto L48
            r5 = r2[r4]
            r6 = r9[r1]
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L48
            int r4 = r4 + (-1)
            int r1 = r1 + (-1)
            goto L35
        L48:
            int r3 = r3 - r4
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r11)
            r9.append(r10)
            r9.append(r7)
            java.lang.String r9 = r9.toString()
            r8.b(r9)
            r9 = 0
            r10 = 0
        L60:
            if (r10 > r4) goto L7e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r11)
            java.lang.String r5 = "\tat "
            r1.append(r5)
            r5 = r2[r10]
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            r8.b(r1)
            int r10 = r10 + 1
            goto L60
        L7e:
            int r10 = r2.length
            if (r0 >= r10) goto L99
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r1 = "\t... skip "
            r10.<init>(r1)
            int r1 = r2.length
            int r1 = r1 - r0
            r10.append(r1)
            java.lang.String r0 = " lines"
            r10.append(r0)
            java.lang.String r10 = r10.toString()
            r8.b(r10)
        L99:
            if (r3 == 0) goto Lb7
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r11)
            java.lang.String r0 = "\t... "
            r10.append(r0)
            r10.append(r3)
            java.lang.String r0 = " more"
            r10.append(r0)
            java.lang.String r10 = r10.toString()
            r8.b(r10)
        Lb7:
            java.lang.Throwable[] r10 = r7.getSuppressed()
            int r6 = r10.length
        Lbc:
            if (r9 >= r6) goto Ldb
            r0 = r10[r9]
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r11)
            java.lang.String r3 = "\t"
            r1.append(r3)
            java.lang.String r4 = r1.toString()
            java.lang.String r3 = "Suppressed: "
            r1 = r8
            r5 = r12
            f(r0, r1, r2, r3, r4, r5)
            int r9 = r9 + 1
            goto Lbc
        Ldb:
            r1 = r8
            r5 = r12
            java.lang.Throwable r0 = r7.getCause()
            if (r0 == 0) goto Le9
            java.lang.String r3 = "Caused by: "
            r4 = r11
            f(r0, r1, r2, r3, r4, r5)
        Le9:
            return
    }

    private static void g(java.lang.Throwable r10, java.io.PrintWriter r11) {
            if (r10 == 0) goto L86
            if (r11 != 0) goto L6
            goto L86
        L6:
            com.bytedance.j.xt.tl.o$a r1 = new com.bytedance.j.xt.tl.o$a
            r1.<init>(r11)
            java.util.IdentityHashMap r11 = new java.util.IdentityHashMap
            r11.<init>()
            java.util.Set r5 = java.util.Collections.newSetFromMap(r11)
            r5.add(r10)
            java.lang.Object r11 = r1.a()
            monitor-enter(r11)
            r1.b(r10)     // Catch: java.lang.Throwable -> L48
            java.lang.StackTraceElement[] r2 = r10.getStackTrace()     // Catch: java.lang.Throwable -> L48
            int r0 = r2.length     // Catch: java.lang.Throwable -> L48
            r3 = 0
            r4 = 0
            r6 = 0
        L27:
            if (r4 >= r0) goto L61
            r7 = r2[r4]     // Catch: java.lang.Throwable -> L48
            r8 = 256(0x100, float:3.59E-43)
            if (r6 <= r8) goto L4b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L48
            java.lang.String r4 = "\t... skip "
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L48
            int r4 = r2.length     // Catch: java.lang.Throwable -> L48
            int r4 = r4 - r6
            r0.append(r4)     // Catch: java.lang.Throwable -> L48
            java.lang.String r4 = " lines"
            r0.append(r4)     // Catch: java.lang.Throwable -> L48
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L48
            r1.b(r0)     // Catch: java.lang.Throwable -> L48
            goto L61
        L48:
            r0 = move-exception
            r10 = r0
            goto L84
        L4b:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L48
            java.lang.String r9 = "\tat "
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L48
            r8.append(r7)     // Catch: java.lang.Throwable -> L48
            java.lang.String r7 = r8.toString()     // Catch: java.lang.Throwable -> L48
            r1.b(r7)     // Catch: java.lang.Throwable -> L48
            int r6 = r6 + 1
            int r4 = r4 + 1
            goto L27
        L61:
            java.lang.Throwable[] r6 = r10.getSuppressed()     // Catch: java.lang.Throwable -> L48
            int r7 = r6.length     // Catch: java.lang.Throwable -> L48
            r8 = 0
        L67:
            if (r8 >= r7) goto L75
            r0 = r6[r8]     // Catch: java.lang.Throwable -> L48
            java.lang.String r3 = "Suppressed: "
            java.lang.String r4 = "\t"
            f(r0, r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L48
            int r8 = r8 + 1
            goto L67
        L75:
            java.lang.Throwable r0 = r10.getCause()     // Catch: java.lang.Throwable -> L48
            if (r0 == 0) goto L82
            java.lang.String r3 = "Caused by: "
            java.lang.String r4 = ""
            f(r0, r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L48
        L82:
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L48
            return
        L84:
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L48
            throw r10
        L86:
            return
    }

    private static boolean h(java.lang.String r4) {
            java.util.Set r0 = com.bytedance.j.xt.tl.m.a()
            boolean r1 = r0.contains(r4)
            r2 = 1
            if (r1 == 0) goto Lc
            return r2
        Lc:
            java.util.Iterator r0 = r0.iterator()
        L10:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L29
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            boolean r3 = android.text.TextUtils.isEmpty(r4)
            if (r3 != 0) goto L10
            boolean r1 = r4.startsWith(r1)
            if (r1 == 0) goto L10
            return r2
        L29:
            r4 = 0
            return r4
    }

    public static boolean i(java.lang.Throwable r3) {
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            r1 = 0
        L5:
            if (r3 == 0) goto L19
            boolean r2 = r3 instanceof java.lang.OutOfMemoryError
            if (r2 == 0) goto Ld
            r3 = 1
            return r3
        Ld:
            r2 = 20
            if (r1 <= r2) goto L12
            return r0
        L12:
            int r1 = r1 + 1
            java.lang.Throwable r3 = r3.getCause()     // Catch: java.lang.Throwable -> L19
            goto L5
        L19:
            return r0
    }
}

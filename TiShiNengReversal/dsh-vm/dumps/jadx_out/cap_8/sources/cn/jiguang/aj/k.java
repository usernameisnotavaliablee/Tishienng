package cn.jiguang.aj;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
final class k {
    public k() {
            r0 = this;
            r0.<init>()
            return
    }

    java.util.List<cn.jiguang.ak.f> a(java.lang.StackTraceElement[] r8) {
            r7 = this;
            if (r8 == 0) goto L5d
            int r0 = r8.length
            if (r0 <= 0) goto L5d
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r8.length
            r2 = 0
        Lc:
            if (r2 >= r1) goto L59
            r3 = r8[r2]
            if (r3 == 0) goto L56
            java.lang.String r4 = r3.getClassName()
            cn.jiguang.ak.f r5 = new cn.jiguang.ak.f
            r5.<init>()
            boolean r6 = r7.a(r4)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r5.a(r6)
            r5.c(r4)
            java.lang.String r4 = r3.getMethodName()
            r5.b(r4)
            java.lang.String r4 = r3.getFileName()
            r5.a(r4)
            int r4 = r3.getLineNumber()
            if (r4 < 0) goto L48
            int r4 = r3.getLineNumber()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5.a(r4)
        L48:
            boolean r3 = r3.isNativeMethod()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r5.b(r3)
            r0.add(r5)
        L56:
            int r2 = r2 + 1
            goto Lc
        L59:
            java.util.Collections.reverse(r0)
            return r0
        L5d:
            r8 = 0
            return r8
    }

    boolean a(java.lang.String r3) {
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L1e
            boolean r1 = r3.isEmpty()
            if (r1 == 0) goto La
            goto L1e
        La:
            java.lang.String r1 = "cn.jiguang"
            boolean r1 = r3.contains(r1)
            if (r1 != 0) goto L1c
            java.lang.String r1 = "cn.jpush"
            boolean r3 = r3.contains(r1)
            if (r3 == 0) goto L1b
            goto L1c
        L1b:
            return r0
        L1c:
            r3 = 1
            return r3
        L1e:
            return r0
    }
}

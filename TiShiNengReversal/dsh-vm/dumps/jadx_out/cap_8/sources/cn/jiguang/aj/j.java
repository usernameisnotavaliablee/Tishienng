package cn.jiguang.aj;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
final class j {
    private final cn.jiguang.aj.k a;

    public j(cn.jiguang.aj.k r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    private cn.jiguang.ak.d a(java.lang.Throwable r7, cn.jiguang.ak.c r8, java.lang.Thread r9, boolean r10) {
            r6 = this;
            java.lang.Class r0 = r7.getClass()
            java.lang.Package r0 = r0.getPackage()
            java.lang.Class r1 = r7.getClass()
            java.lang.String r1 = r1.getName()
            cn.jiguang.ak.d r2 = new cn.jiguang.ak.d
            r2.<init>()
            java.lang.String r3 = r7.getMessage()
            if (r0 == 0) goto L36
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = r0.getName()
            r4.append(r5)
            java.lang.String r5 = "."
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = ""
            java.lang.String r1 = r1.replace(r4, r5)
        L36:
            r4 = 0
            if (r0 == 0) goto L3e
            java.lang.String r0 = r0.getName()
            goto L3f
        L3e:
            r0 = r4
        L3f:
            cn.jiguang.aj.k r5 = r6.a
            java.lang.StackTraceElement[] r7 = r7.getStackTrace()
            java.util.List r7 = r5.a(r7)
            if (r7 == 0) goto L6d
            boolean r5 = r7.isEmpty()
            if (r5 != 0) goto L6d
            boolean r5 = r6.a(r9)
            if (r5 != 0) goto L5e
            boolean r5 = r6.a(r7)
            if (r5 != 0) goto L5e
            return r4
        L5e:
            cn.jiguang.ak.g r4 = new cn.jiguang.ak.g
            r4.<init>(r7)
            if (r10 == 0) goto L6a
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            r4.a(r7)
        L6a:
            r2.a(r4)
        L6d:
            if (r9 == 0) goto L7a
            long r9 = r9.getId()
            java.lang.Long r7 = java.lang.Long.valueOf(r9)
            r2.a(r7)
        L7a:
            r2.a(r1)
            r2.a(r8)
            r2.c(r0)
            r2.b(r3)
            return r2
    }

    private java.util.List<cn.jiguang.ak.d> a(java.util.Deque<cn.jiguang.ak.d> r2) {
            r1 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r2)
            return r0
    }

    java.util.List<cn.jiguang.ak.d> a(java.lang.Throwable r1) {
            r0 = this;
            java.util.Deque r1 = r0.b(r1)
            java.util.List r1 = r0.a(r1)
            return r1
    }

    boolean a(java.lang.Thread r2) {
            r1 = this;
            java.lang.String r0 = r2.getName()
            if (r0 == 0) goto L11
            java.lang.String r2 = r2.getName()
            java.lang.String r0 = "jg"
            boolean r2 = r2.contains(r0)
            return r2
        L11:
            r2 = 0
            return r2
    }

    boolean a(java.util.List<cn.jiguang.ak.f> r4) {
            r3 = this;
            java.util.Iterator r4 = r4.iterator()
            r0 = 0
            r1 = 0
        L6:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L24
            java.lang.Object r2 = r4.next()
            cn.jiguang.ak.f r2 = (cn.jiguang.ak.f) r2
            if (r1 != 0) goto L21
            java.lang.Boolean r1 = r2.h()
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L1f
            goto L21
        L1f:
            r1 = 0
            goto L22
        L21:
            r1 = 1
        L22:
            if (r1 == 0) goto L6
        L24:
            return r1
    }

    java.util.Deque<cn.jiguang.ak.d> b(java.lang.Throwable r7) {
            r6 = this;
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
        La:
            if (r7 == 0) goto L41
            boolean r2 = r1.add(r7)
            if (r2 == 0) goto L41
            boolean r2 = r7 instanceof cn.jiguang.aj.c
            if (r2 == 0) goto L2d
            cn.jiguang.aj.c r7 = (cn.jiguang.aj.c) r7
            cn.jiguang.ak.c r2 = r7.a()
            java.lang.Throwable r3 = r7.b()
            java.lang.Thread r4 = r7.c()
            boolean r7 = r7.d()
            r5 = r2
            r2 = r7
            r7 = r3
            r3 = r5
            goto L33
        L2d:
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            r2 = 0
            r3 = 0
        L33:
            cn.jiguang.ak.d r2 = r6.a(r7, r3, r4, r2)
            if (r2 == 0) goto L3c
            r0.addFirst(r2)
        L3c:
            java.lang.Throwable r7 = r7.getCause()
            goto La
        L41:
            return r0
    }
}

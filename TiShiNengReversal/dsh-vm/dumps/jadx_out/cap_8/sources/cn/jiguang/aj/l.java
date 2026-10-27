package cn.jiguang.aj;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
final class l {
    private final cn.jiguang.aj.k a;

    public l(cn.jiguang.aj.k r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    private cn.jiguang.ak.h a(boolean r4, java.lang.StackTraceElement[] r5, java.lang.Thread r6) {
            r3 = this;
            cn.jiguang.ak.h r0 = new cn.jiguang.ak.h
            r0.<init>()
            java.lang.String r1 = r6.getName()
            r0.a(r1)
            int r1 = r6.getPriority()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.a(r1)
            long r1 = r6.getId()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r0.a(r1)
            boolean r1 = r6.isDaemon()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0.c(r1)
            java.lang.Thread$State r1 = r6.getState()
            java.lang.String r1 = r1.name()
            r0.b(r1)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r0.a(r4)
            boolean r4 = cn.jiguang.ar.a.a(r6)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r0.b(r4)
            cn.jiguang.aj.k r4 = r3.a
            java.util.List r4 = r4.a(r5)
            cn.jiguang.ak.g r5 = new cn.jiguang.ak.g
            r5.<init>(r4)
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            r5.a(r4)
            r0.a(r5)
            return r0
    }

    java.util.List<cn.jiguang.ak.h> a(java.util.List<java.lang.Long> r2) {
            r1 = this;
            java.util.Map r0 = java.lang.Thread.getAllStackTraces()
            java.util.List r2 = r1.a(r0, r2)
            return r2
    }

    java.util.List<cn.jiguang.ak.h> a(java.util.Map<java.lang.Thread, java.lang.StackTraceElement[]> r6, java.util.List<java.lang.Long> r7) {
            r5 = this;
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r1 = r6.isEmpty()
            if (r1 != 0) goto L61
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            boolean r2 = r6.containsKey(r0)
            if (r2 != 0) goto L1c
            java.lang.StackTraceElement[] r2 = r0.getStackTrace()
            r6.put(r0, r2)
        L1c:
            java.util.Set r6 = r6.entrySet()
            java.util.Iterator r6 = r6.iterator()
        L24:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L60
            java.lang.Object r2 = r6.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.Thread r3 = (java.lang.Thread) r3
            if (r3 == r0) goto L4b
            if (r7 == 0) goto L49
            long r3 = r3.getId()
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            boolean r3 = r7.contains(r3)
            if (r3 == 0) goto L49
            goto L4b
        L49:
            r3 = 0
            goto L4c
        L4b:
            r3 = 1
        L4c:
            java.lang.Object r4 = r2.getValue()
            java.lang.StackTraceElement[] r4 = (java.lang.StackTraceElement[]) r4
            java.lang.Object r2 = r2.getKey()
            java.lang.Thread r2 = (java.lang.Thread) r2
            cn.jiguang.ak.h r2 = r5.a(r3, r4, r2)
            r1.add(r2)
            goto L24
        L60:
            return r1
        L61:
            r6 = 0
            return r6
    }
}
